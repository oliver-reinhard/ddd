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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'event'", "'alias'", "'{'", "'context'", "'triggered'", "'by'", "'notifications'", "'preconditions'", "'postconditions'", "'}'", "':'", "'case'", "'when'", "'otherwise'", "'to'", "'human'", "'actor'", "'as'", "'service'", "'import'", "'test'", "','", "':='", "'in'", "'('", "')'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'entity'", "'detail'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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
    public static final int RULE_ID=4;
    public static final int RULE_RICH_TEXT_START=6;
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
    public static final int RULE_RICH_TEXT_END=8;
    public static final int RULE_RICH_TEXT_MIDDLE=7;
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
        	return "DemModel";
       	}

       	@Override
       	protected DemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDemModel"
    // InternalDem.g:65:1: entryRuleDemModel returns [EObject current=null] : iv_ruleDemModel= ruleDemModel EOF ;
    public final EObject entryRuleDemModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDemModel = null;


        try {
            // InternalDem.g:65:49: (iv_ruleDemModel= ruleDemModel EOF )
            // InternalDem.g:66:2: iv_ruleDemModel= ruleDemModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDemModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDemModel=ruleDemModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDemModel; 
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
    // $ANTLR end "entryRuleDemModel"


    // $ANTLR start "ruleDemModel"
    // InternalDem.g:72:1: ruleDemModel returns [EObject current=null] : (this_DDomainEvent_0= ruleDDomainEvent | this_DemActorModel_1= ruleDemActorModel ) ;
    public final EObject ruleDemModel() throws RecognitionException {
        EObject current = null;

        EObject this_DDomainEvent_0 = null;

        EObject this_DemActorModel_1 = null;



        	enterRule();

        try {
            // InternalDem.g:78:2: ( (this_DDomainEvent_0= ruleDDomainEvent | this_DemActorModel_1= ruleDemActorModel ) )
            // InternalDem.g:79:2: (this_DDomainEvent_0= ruleDDomainEvent | this_DemActorModel_1= ruleDemActorModel )
            {
            // InternalDem.g:79:2: (this_DDomainEvent_0= ruleDDomainEvent | this_DemActorModel_1= ruleDemActorModel )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalDem.g:80:3: this_DDomainEvent_0= ruleDDomainEvent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDemModelAccess().getDDomainEventParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDomainEvent_0=ruleDDomainEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDomainEvent_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:89:3: this_DemActorModel_1= ruleDemActorModel
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDemModelAccess().getDemActorModelParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DemActorModel_1=ruleDemActorModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DemActorModel_1;
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
    // $ANTLR end "ruleDemModel"


    // $ANTLR start "entryRuleDDomainEvent"
    // InternalDem.g:101:1: entryRuleDDomainEvent returns [EObject current=null] : iv_ruleDDomainEvent= ruleDDomainEvent EOF ;
    public final EObject entryRuleDDomainEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomainEvent = null;


        try {
            // InternalDem.g:101:53: (iv_ruleDDomainEvent= ruleDDomainEvent EOF )
            // InternalDem.g:102:2: iv_ruleDDomainEvent= ruleDDomainEvent EOF
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
    // InternalDem.g:108:1: ruleDDomainEvent returns [EObject current=null] : ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_domain_2_0= ruleDQualifiedName ) ) otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' otherlv_9= 'context' ( (lv_context_10_0= ruleDContext ) )+ (otherlv_11= 'triggered' otherlv_12= 'by' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'notifications' ( (lv_notifications_15_0= ruleDNotification ) )+ )? (otherlv_16= 'preconditions' ( (lv_preconditionsCNF_17_0= ruleDNamedPredicate ) )+ )? (otherlv_18= 'postconditions' ( ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+ ) )? otherlv_21= '}' ) ;
    public final EObject ruleDDomainEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_aliases_6_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_domain_2_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_context_10_0 = null;

        EObject lv_notifications_15_0 = null;

        EObject lv_preconditionsCNF_17_0 = null;

        EObject lv_postconditionsDNF_19_0 = null;

        EObject lv_postconditionsDNF_20_0 = null;



        	enterRule();

        try {
            // InternalDem.g:114:2: ( ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_domain_2_0= ruleDQualifiedName ) ) otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' otherlv_9= 'context' ( (lv_context_10_0= ruleDContext ) )+ (otherlv_11= 'triggered' otherlv_12= 'by' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'notifications' ( (lv_notifications_15_0= ruleDNotification ) )+ )? (otherlv_16= 'preconditions' ( (lv_preconditionsCNF_17_0= ruleDNamedPredicate ) )+ )? (otherlv_18= 'postconditions' ( ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+ ) )? otherlv_21= '}' ) )
            // InternalDem.g:115:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_domain_2_0= ruleDQualifiedName ) ) otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' otherlv_9= 'context' ( (lv_context_10_0= ruleDContext ) )+ (otherlv_11= 'triggered' otherlv_12= 'by' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'notifications' ( (lv_notifications_15_0= ruleDNotification ) )+ )? (otherlv_16= 'preconditions' ( (lv_preconditionsCNF_17_0= ruleDNamedPredicate ) )+ )? (otherlv_18= 'postconditions' ( ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+ ) )? otherlv_21= '}' )
            {
            // InternalDem.g:115:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_domain_2_0= ruleDQualifiedName ) ) otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' otherlv_9= 'context' ( (lv_context_10_0= ruleDContext ) )+ (otherlv_11= 'triggered' otherlv_12= 'by' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'notifications' ( (lv_notifications_15_0= ruleDNotification ) )+ )? (otherlv_16= 'preconditions' ( (lv_preconditionsCNF_17_0= ruleDNamedPredicate ) )+ )? (otherlv_18= 'postconditions' ( ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+ ) )? otherlv_21= '}' )
            // InternalDem.g:116:3: ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_domain_2_0= ruleDQualifiedName ) ) otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' otherlv_9= 'context' ( (lv_context_10_0= ruleDContext ) )+ (otherlv_11= 'triggered' otherlv_12= 'by' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'notifications' ( (lv_notifications_15_0= ruleDNotification ) )+ )? (otherlv_16= 'preconditions' ( (lv_preconditionsCNF_17_0= ruleDNamedPredicate ) )+ )? (otherlv_18= 'postconditions' ( ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+ ) )? otherlv_21= '}'
            {
            // InternalDem.g:116:3: ( (lv_imports_0_0= ruleDImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDem.g:117:4: (lv_imports_0_0= ruleDImport )
            	    {
            	    // InternalDem.g:117:4: (lv_imports_0_0= ruleDImport )
            	    // InternalDem.g:118:5: lv_imports_0_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainEventAccess().getImportsDImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
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
            	    break loop2;
                }
            } while (true);

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDDomainEventAccess().getDomainKeyword_1());
              		
            }
            // InternalDem.g:139:3: ( (lv_domain_2_0= ruleDQualifiedName ) )
            // InternalDem.g:140:4: (lv_domain_2_0= ruleDQualifiedName )
            {
            // InternalDem.g:140:4: (lv_domain_2_0= ruleDQualifiedName )
            // InternalDem.g:141:5: lv_domain_2_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDDomainEventAccess().getDomainDQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_domain_2_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
              					}
              					set(
              						current,
              						"domain",
              						lv_domain_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DQualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDDomainEventAccess().getEventKeyword_3());
              		
            }
            // InternalDem.g:162:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDem.g:163:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDem.g:163:4: (lv_name_4_0= RULE_ID )
            // InternalDem.g:164:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getDDomainEventAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDDomainEventRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:180:3: (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDem.g:181:4: otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDDomainEventAccess().getAliasKeyword_5_0());
            	      			
            	    }
            	    // InternalDem.g:185:4: ( (lv_aliases_6_0= RULE_ID ) )
            	    // InternalDem.g:186:5: (lv_aliases_6_0= RULE_ID )
            	    {
            	    // InternalDem.g:186:5: (lv_aliases_6_0= RULE_ID )
            	    // InternalDem.g:187:6: lv_aliases_6_0= RULE_ID
            	    {
            	    lv_aliases_6_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_6_0, grammarAccess.getDDomainEventAccess().getAliasesIDTerminalRuleCall_5_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDDomainEventRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_6_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDem.g:204:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_PLAIN_TEXT_ONLY && LA4_0<=RULE_RICH_TEXT_START)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDem.g:205:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDem.g:205:4: (lv_description_7_0= ruleDRichText )
                    // InternalDem.g:206:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainEventAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
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

            otherlv_8=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDDomainEventAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            otherlv_9=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDDomainEventAccess().getContextKeyword_8());
              		
            }
            // InternalDem.g:231:3: ( (lv_context_10_0= ruleDContext ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDem.g:232:4: (lv_context_10_0= ruleDContext )
            	    {
            	    // InternalDem.g:232:4: (lv_context_10_0= ruleDContext )
            	    // InternalDem.g:233:5: lv_context_10_0= ruleDContext
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainEventAccess().getContextDContextParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_context_10_0=ruleDContext();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
            	      					}
            	      					add(
            	      						current,
            	      						"context",
            	      						lv_context_10_0,
            	      						"com.mimacom.ddd.dm.dem.Dem.DContext");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalDem.g:250:3: (otherlv_11= 'triggered' otherlv_12= 'by' ( (otherlv_13= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDem.g:251:4: otherlv_11= 'triggered' otherlv_12= 'by' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDDomainEventAccess().getTriggeredKeyword_10_0());
                      			
                    }
                    otherlv_12=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDDomainEventAccess().getByKeyword_10_1());
                      			
                    }
                    // InternalDem.g:259:4: ( (otherlv_13= RULE_ID ) )
                    // InternalDem.g:260:5: (otherlv_13= RULE_ID )
                    {
                    // InternalDem.g:260:5: (otherlv_13= RULE_ID )
                    // InternalDem.g:261:6: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDDomainEventRule());
                      						}
                      					
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getDDomainEventAccess().getTriggerDActorCrossReference_10_2_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDem.g:273:3: (otherlv_14= 'notifications' ( (lv_notifications_15_0= ruleDNotification ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDem.g:274:4: otherlv_14= 'notifications' ( (lv_notifications_15_0= ruleDNotification ) )+
                    {
                    otherlv_14=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDDomainEventAccess().getNotificationsKeyword_11_0());
                      			
                    }
                    // InternalDem.g:278:4: ( (lv_notifications_15_0= ruleDNotification ) )+
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
                    	    // InternalDem.g:279:5: (lv_notifications_15_0= ruleDNotification )
                    	    {
                    	    // InternalDem.g:279:5: (lv_notifications_15_0= ruleDNotification )
                    	    // InternalDem.g:280:6: lv_notifications_15_0= ruleDNotification
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getNotificationsDNotificationParserRuleCall_11_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_notifications_15_0=ruleDNotification();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"notifications",
                    	      							lv_notifications_15_0,
                    	      							"com.mimacom.ddd.dm.dem.Dem.DNotification");
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


                    }
                    break;

            }

            // InternalDem.g:298:3: (otherlv_16= 'preconditions' ( (lv_preconditionsCNF_17_0= ruleDNamedPredicate ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDem.g:299:4: otherlv_16= 'preconditions' ( (lv_preconditionsCNF_17_0= ruleDNamedPredicate ) )+
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getDDomainEventAccess().getPreconditionsKeyword_12_0());
                      			
                    }
                    // InternalDem.g:303:4: ( (lv_preconditionsCNF_17_0= ruleDNamedPredicate ) )+
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
                    	    // InternalDem.g:304:5: (lv_preconditionsCNF_17_0= ruleDNamedPredicate )
                    	    {
                    	    // InternalDem.g:304:5: (lv_preconditionsCNF_17_0= ruleDNamedPredicate )
                    	    // InternalDem.g:305:6: lv_preconditionsCNF_17_0= ruleDNamedPredicate
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getPreconditionsCNFDNamedPredicateParserRuleCall_12_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_preconditionsCNF_17_0=ruleDNamedPredicate();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"preconditionsCNF",
                    	      							lv_preconditionsCNF_17_0,
                    	      							"com.mimacom.ddd.dm.dem.Dem.DNamedPredicate");
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

            // InternalDem.g:323:3: (otherlv_18= 'postconditions' ( ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+ ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDem.g:324:4: otherlv_18= 'postconditions' ( ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+ )
                    {
                    otherlv_18=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getDDomainEventAccess().getPostconditionsKeyword_13_0());
                      			
                    }
                    // InternalDem.g:328:4: ( ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+ )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==29) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_ID) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalDem.g:329:5: ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+
                            {
                            // InternalDem.g:329:5: ( (lv_postconditionsDNF_19_0= ruleDCaseConjunction ) )+
                            int cnt11=0;
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==29) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalDem.g:330:6: (lv_postconditionsDNF_19_0= ruleDCaseConjunction )
                            	    {
                            	    // InternalDem.g:330:6: (lv_postconditionsDNF_19_0= ruleDCaseConjunction )
                            	    // InternalDem.g:331:7: lv_postconditionsDNF_19_0= ruleDCaseConjunction
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getDDomainEventAccess().getPostconditionsDNFDCaseConjunctionParserRuleCall_13_1_0_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_15);
                            	    lv_postconditionsDNF_19_0=ruleDCaseConjunction();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"postconditionsDNF",
                            	      								lv_postconditionsDNF_19_0,
                            	      								"com.mimacom.ddd.dm.dem.Dem.DCaseConjunction");
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
                        case 2 :
                            // InternalDem.g:349:5: ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+
                            {
                            // InternalDem.g:349:5: ( (lv_postconditionsDNF_20_0= ruleDNamedPredicate ) )+
                            int cnt12=0;
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==RULE_ID) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalDem.g:350:6: (lv_postconditionsDNF_20_0= ruleDNamedPredicate )
                            	    {
                            	    // InternalDem.g:350:6: (lv_postconditionsDNF_20_0= ruleDNamedPredicate )
                            	    // InternalDem.g:351:7: lv_postconditionsDNF_20_0= ruleDNamedPredicate
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getDDomainEventAccess().getPostconditionsDNFDNamedPredicateParserRuleCall_13_1_1_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_16);
                            	    lv_postconditionsDNF_20_0=ruleDNamedPredicate();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"postconditionsDNF",
                            	      								lv_postconditionsDNF_20_0,
                            	      								"com.mimacom.ddd.dm.dem.Dem.DNamedPredicate");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt12 >= 1 ) break loop12;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(12, input);
                                        throw eee;
                                }
                                cnt12++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getDDomainEventAccess().getRightCurlyBracketKeyword_14());
              		
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
    // InternalDem.g:378:1: entryRuleDNamedPredicate returns [EObject current=null] : iv_ruleDNamedPredicate= ruleDNamedPredicate EOF ;
    public final EObject entryRuleDNamedPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNamedPredicate = null;


        try {
            // InternalDem.g:378:56: (iv_ruleDNamedPredicate= ruleDNamedPredicate EOF )
            // InternalDem.g:379:2: iv_ruleDNamedPredicate= ruleDNamedPredicate EOF
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
    // InternalDem.g:385:1: ruleDNamedPredicate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
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
            // InternalDem.g:391:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDem.g:392:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDem.g:392:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDem.g:393:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDem.g:393:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:394:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:394:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:395:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            // InternalDem.g:411:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDem.g:412:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDNamedPredicateAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:416:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:417:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:417:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:418:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDNamedPredicateAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:439:3: ( (lv_predicate_4_0= ruleDExpression ) )
            // InternalDem.g:440:4: (lv_predicate_4_0= ruleDExpression )
            {
            // InternalDem.g:440:4: (lv_predicate_4_0= ruleDExpression )
            // InternalDem.g:441:5: lv_predicate_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNamedPredicateAccess().getPredicateDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalDem.g:458:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_PLAIN_TEXT_ONLY && LA16_0<=RULE_RICH_TEXT_START)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDem.g:459:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDem.g:459:4: (lv_description_5_0= ruleDRichText )
                    // InternalDem.g:460:5: lv_description_5_0= ruleDRichText
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
    // InternalDem.g:481:1: entryRuleDCaseConjunction returns [EObject current=null] : iv_ruleDCaseConjunction= ruleDCaseConjunction EOF ;
    public final EObject entryRuleDCaseConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCaseConjunction = null;


        try {
            // InternalDem.g:481:57: (iv_ruleDCaseConjunction= ruleDCaseConjunction EOF )
            // InternalDem.g:482:2: iv_ruleDCaseConjunction= ruleDCaseConjunction EOF
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
    // InternalDem.g:488:1: ruleDCaseConjunction returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+ ) ;
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
            // InternalDem.g:494:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+ ) )
            // InternalDem.g:495:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+ )
            {
            // InternalDem.g:495:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+ )
            // InternalDem.g:496:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDCaseConjunctionAccess().getCaseKeyword_0());
              		
            }
            // InternalDem.g:500:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:501:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:501:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:502:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
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

            // InternalDem.g:518:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDem.g:519:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDCaseConjunctionAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDem.g:523:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDem.g:524:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDem.g:524:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDem.g:525:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
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
            	    break loop17;
                }
            } while (true);

            // InternalDem.g:542:3: ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDem.g:543:4: (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) )
                    {
                    // InternalDem.g:543:4: (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) )
                    // InternalDem.g:544:5: otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDCaseConjunctionAccess().getWhenKeyword_3_0_0());
                      				
                    }
                    // InternalDem.g:548:5: ( (lv_selector_5_0= ruleDExpression ) )
                    // InternalDem.g:549:6: (lv_selector_5_0= ruleDExpression )
                    {
                    // InternalDem.g:549:6: (lv_selector_5_0= ruleDExpression )
                    // InternalDem.g:550:7: lv_selector_5_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDCaseConjunctionAccess().getSelectorDExpressionParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
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
                    // InternalDem.g:569:4: ( (lv_otherwise_6_0= 'otherwise' ) )
                    {
                    // InternalDem.g:569:4: ( (lv_otherwise_6_0= 'otherwise' ) )
                    // InternalDem.g:570:5: (lv_otherwise_6_0= 'otherwise' )
                    {
                    // InternalDem.g:570:5: (lv_otherwise_6_0= 'otherwise' )
                    // InternalDem.g:571:6: lv_otherwise_6_0= 'otherwise'
                    {
                    lv_otherwise_6_0=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
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
            // InternalDem.g:588:3: ( (lv_predicates_8_0= ruleDNamedPredicate ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDem.g:589:4: (lv_predicates_8_0= ruleDNamedPredicate )
            	    {
            	    // InternalDem.g:589:4: (lv_predicates_8_0= ruleDNamedPredicate )
            	    // InternalDem.g:590:5: lv_predicates_8_0= ruleDNamedPredicate
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDCaseConjunctionAccess().getPredicatesDNamedPredicateParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
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
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalDem.g:611:1: entryRuleDNotification returns [EObject current=null] : iv_ruleDNotification= ruleDNotification EOF ;
    public final EObject entryRuleDNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNotification = null;


        try {
            // InternalDem.g:611:54: (iv_ruleDNotification= ruleDNotification EOF )
            // InternalDem.g:612:2: iv_ruleDNotification= ruleDNotification EOF
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
    // InternalDem.g:618:1: ruleDNotification returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ) ;
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
            // InternalDem.g:624:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ) )
            // InternalDem.g:625:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            {
            // InternalDem.g:625:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            // InternalDem.g:626:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )?
            {
            // InternalDem.g:626:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:627:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:627:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:628:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            // InternalDem.g:644:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDem.g:645:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDNotificationAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:649:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:650:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:650:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:651:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDNotificationAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:672:3: ( (lv_message_4_0= ruleDMessage ) )
            // InternalDem.g:673:4: (lv_message_4_0= ruleDMessage )
            {
            // InternalDem.g:673:4: (lv_message_4_0= ruleDMessage )
            // InternalDem.g:674:5: lv_message_4_0= ruleDMessage
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNotificationAccess().getMessageDMessageParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_23);
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
            // InternalDem.g:695:3: ( (otherlv_6= RULE_ID ) )
            // InternalDem.g:696:4: (otherlv_6= RULE_ID )
            {
            // InternalDem.g:696:4: (otherlv_6= RULE_ID )
            // InternalDem.g:697:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getDNotificationAccess().getNotifiedDActorCrossReference_5_0());
              				
            }

            }


            }

            // InternalDem.g:708:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_PLAIN_TEXT_ONLY && LA21_0<=RULE_RICH_TEXT_START)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDem.g:709:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDem.g:709:4: (lv_description_7_0= ruleDRichText )
                    // InternalDem.g:710:5: lv_description_7_0= ruleDRichText
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
    // InternalDem.g:731:1: entryRuleDMessage returns [EObject current=null] : iv_ruleDMessage= ruleDMessage EOF ;
    public final EObject entryRuleDMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMessage = null;


        try {
            // InternalDem.g:731:49: (iv_ruleDMessage= ruleDMessage EOF )
            // InternalDem.g:732:2: iv_ruleDMessage= ruleDMessage EOF
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
    // InternalDem.g:738:1: ruleDMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleDMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalDem.g:744:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )? ) )
            // InternalDem.g:745:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )? )
            {
            // InternalDem.g:745:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )? )
            // InternalDem.g:746:3: ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )?
            {
            // InternalDem.g:746:3: ( (otherlv_0= RULE_ID ) )
            // InternalDem.g:747:4: (otherlv_0= RULE_ID )
            {
            // InternalDem.g:747:4: (otherlv_0= RULE_ID )
            // InternalDem.g:748:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDMessageRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDMessageAccess().getTypeDTypeCrossReference_0_0());
              				
            }

            }


            }

            // InternalDem.g:759:3: ( (lv_multiplicity_1_0= ruleDMultiplicity ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42||LA22_0==48||LA22_0==75||LA22_0==112) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDem.g:760:4: (lv_multiplicity_1_0= ruleDMultiplicity )
                    {
                    // InternalDem.g:760:4: (lv_multiplicity_1_0= ruleDMultiplicity )
                    // InternalDem.g:761:5: lv_multiplicity_1_0= ruleDMultiplicity
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
    // InternalDem.g:782:1: entryRuleDContext returns [EObject current=null] : iv_ruleDContext= ruleDContext EOF ;
    public final EObject entryRuleDContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContext = null;


        try {
            // InternalDem.g:782:49: (iv_ruleDContext= ruleDContext EOF )
            // InternalDem.g:783:2: iv_ruleDContext= ruleDContext EOF
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
    // InternalDem.g:789:1: ruleDContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? ) ;
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
            // InternalDem.g:795:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDem.g:796:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDem.g:796:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDem.g:797:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )?
            {
            // InternalDem.g:797:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:798:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:798:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:799:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            // InternalDem.g:815:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDem.g:816:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDContextAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:820:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:821:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:821:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:822:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDContextAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:843:3: ( (otherlv_4= RULE_ID ) )
            // InternalDem.g:844:4: (otherlv_4= RULE_ID )
            {
            // InternalDem.g:844:4: (otherlv_4= RULE_ID )
            // InternalDem.g:845:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getDContextAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDem.g:856:3: ( (lv_multiplicity_5_0= ruleDMultiplicity ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42||LA24_0==48||LA24_0==75||LA24_0==112) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDem.g:857:4: (lv_multiplicity_5_0= ruleDMultiplicity )
                    {
                    // InternalDem.g:857:4: (lv_multiplicity_5_0= ruleDMultiplicity )
                    // InternalDem.g:858:5: lv_multiplicity_5_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDContextAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
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

            // InternalDem.g:875:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_PLAIN_TEXT_ONLY && LA25_0<=RULE_RICH_TEXT_START)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDem.g:876:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDem.g:876:4: (lv_description_6_0= ruleDRichText )
                    // InternalDem.g:877:5: lv_description_6_0= ruleDRichText
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


    // $ANTLR start "entryRuleDemActorModel"
    // InternalDem.g:898:1: entryRuleDemActorModel returns [EObject current=null] : iv_ruleDemActorModel= ruleDemActorModel EOF ;
    public final EObject entryRuleDemActorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDemActorModel = null;


        try {
            // InternalDem.g:898:54: (iv_ruleDemActorModel= ruleDemActorModel EOF )
            // InternalDem.g:899:2: iv_ruleDemActorModel= ruleDemActorModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDemActorModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDemActorModel=ruleDemActorModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDemActorModel; 
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
    // $ANTLR end "entryRuleDemActorModel"


    // $ANTLR start "ruleDemActorModel"
    // InternalDem.g:905:1: ruleDemActorModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_actors_3_0= ruleDActor ) )* ) ;
    public final EObject ruleDemActorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actors_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:911:2: ( ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_actors_3_0= ruleDActor ) )* ) )
            // InternalDem.g:912:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_actors_3_0= ruleDActor ) )* )
            {
            // InternalDem.g:912:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_actors_3_0= ruleDActor ) )* )
            // InternalDem.g:913:3: ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_actors_3_0= ruleDActor ) )*
            {
            // InternalDem.g:913:3: ( (lv_imports_0_0= ruleDImport ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDem.g:914:4: (lv_imports_0_0= ruleDImport )
            	    {
            	    // InternalDem.g:914:4: (lv_imports_0_0= ruleDImport )
            	    // InternalDem.g:915:5: lv_imports_0_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDemActorModelAccess().getImportsDImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDemActorModelRule());
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
            	    break loop26;
                }
            } while (true);

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDemActorModelAccess().getDomainKeyword_1());
              		
            }
            // InternalDem.g:936:3: ( (lv_name_2_0= ruleDQualifiedName ) )
            // InternalDem.g:937:4: (lv_name_2_0= ruleDQualifiedName )
            {
            // InternalDem.g:937:4: (lv_name_2_0= ruleDQualifiedName )
            // InternalDem.g:938:5: lv_name_2_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDemActorModelAccess().getNameDQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_name_2_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDemActorModelRule());
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

            // InternalDem.g:955:3: ( (lv_actors_3_0= ruleDActor ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33||LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDem.g:956:4: (lv_actors_3_0= ruleDActor )
            	    {
            	    // InternalDem.g:956:4: (lv_actors_3_0= ruleDActor )
            	    // InternalDem.g:957:5: lv_actors_3_0= ruleDActor
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDemActorModelAccess().getActorsDActorParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_actors_3_0=ruleDActor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDemActorModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"actors",
            	      						lv_actors_3_0,
            	      						"com.mimacom.ddd.dm.dem.Dem.DActor");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleDemActorModel"


    // $ANTLR start "entryRuleDActor"
    // InternalDem.g:978:1: entryRuleDActor returns [EObject current=null] : iv_ruleDActor= ruleDActor EOF ;
    public final EObject entryRuleDActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDActor = null;


        try {
            // InternalDem.g:978:47: (iv_ruleDActor= ruleDActor EOF )
            // InternalDem.g:979:2: iv_ruleDActor= ruleDActor EOF
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
    // InternalDem.g:985:1: ruleDActor returns [EObject current=null] : (this_DHumanActorRole_0= ruleDHumanActorRole | this_DService_1= ruleDService ) ;
    public final EObject ruleDActor() throws RecognitionException {
        EObject current = null;

        EObject this_DHumanActorRole_0 = null;

        EObject this_DService_1 = null;



        	enterRule();

        try {
            // InternalDem.g:991:2: ( (this_DHumanActorRole_0= ruleDHumanActorRole | this_DService_1= ruleDService ) )
            // InternalDem.g:992:2: (this_DHumanActorRole_0= ruleDHumanActorRole | this_DService_1= ruleDService )
            {
            // InternalDem.g:992:2: (this_DHumanActorRole_0= ruleDHumanActorRole | this_DService_1= ruleDService )
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
                    // InternalDem.g:993:3: this_DHumanActorRole_0= ruleDHumanActorRole
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
                    // InternalDem.g:1002:3: this_DService_1= ruleDService
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
    // InternalDem.g:1014:1: entryRuleDHumanActorRole returns [EObject current=null] : iv_ruleDHumanActorRole= ruleDHumanActorRole EOF ;
    public final EObject entryRuleDHumanActorRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDHumanActorRole = null;


        try {
            // InternalDem.g:1014:56: (iv_ruleDHumanActorRole= ruleDHumanActorRole EOF )
            // InternalDem.g:1015:2: iv_ruleDHumanActorRole= ruleDHumanActorRole EOF
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
    // InternalDem.g:1021:1: ruleDHumanActorRole returns [EObject current=null] : (otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )? ) ;
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
            // InternalDem.g:1027:2: ( (otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDem.g:1028:2: (otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDem.g:1028:2: (otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDem.g:1029:3: otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )?
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
            // InternalDem.g:1041:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDem.g:1042:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDem.g:1042:4: (lv_name_3_0= RULE_ID )
            // InternalDem.g:1043:5: lv_name_3_0= RULE_ID
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

            // InternalDem.g:1059:3: (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==19) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDem.g:1060:4: otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDHumanActorRoleAccess().getAliasKeyword_4_0());
            	      			
            	    }
            	    // InternalDem.g:1064:4: ( (lv_aliases_5_0= RULE_ID ) )
            	    // InternalDem.g:1065:5: (lv_aliases_5_0= RULE_ID )
            	    {
            	    // InternalDem.g:1065:5: (lv_aliases_5_0= RULE_ID )
            	    // InternalDem.g:1066:6: lv_aliases_5_0= RULE_ID
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

            // InternalDem.g:1083:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_PLAIN_TEXT_ONLY && LA30_0<=RULE_RICH_TEXT_START)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDem.g:1084:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDem.g:1084:4: (lv_description_6_0= ruleDRichText )
                    // InternalDem.g:1085:5: lv_description_6_0= ruleDRichText
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
    // InternalDem.g:1106:1: entryRuleDService returns [EObject current=null] : iv_ruleDService= ruleDService EOF ;
    public final EObject entryRuleDService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDService = null;


        try {
            // InternalDem.g:1106:49: (iv_ruleDService= ruleDService EOF )
            // InternalDem.g:1107:2: iv_ruleDService= ruleDService EOF
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
    // InternalDem.g:1113:1: ruleDService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ) ;
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
            // InternalDem.g:1119:2: ( (otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDem.g:1120:2: (otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDem.g:1120:2: (otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDem.g:1121:3: otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDServiceAccess().getServiceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDServiceAccess().getActorKeyword_1());
              		
            }
            // InternalDem.g:1129:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDem.g:1130:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDem.g:1130:4: (lv_name_2_0= RULE_ID )
            // InternalDem.g:1131:5: lv_name_2_0= RULE_ID
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

            // InternalDem.g:1147:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDem.g:1148:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDServiceAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDem.g:1152:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDem.g:1153:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDem.g:1153:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDem.g:1154:6: lv_aliases_4_0= RULE_ID
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

            // InternalDem.g:1171:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_PLAIN_TEXT_ONLY && LA32_0<=RULE_RICH_TEXT_START)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDem.g:1172:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDem.g:1172:4: (lv_description_5_0= ruleDRichText )
                    // InternalDem.g:1173:5: lv_description_5_0= ruleDRichText
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
    // InternalDem.g:1194:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDem.g:1194:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDem.g:1195:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDem.g:1201:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1207:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDem.g:1208:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDem.g:1208:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDem.g:1209:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDem.g:1213:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDem.g:1214:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDem.g:1214:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDem.g:1215:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalDem.g:1236:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalDem.g:1236:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalDem.g:1237:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalDem.g:1243:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalDem.g:1249:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalDem.g:1250:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalDem.g:1250:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalDem.g:1251:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalDem.g:1255:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:1256:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:1256:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:1257:5: lv_name_1_0= RULE_ID
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

            // InternalDem.g:1273:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDem.g:1274:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalDem.g:1278:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalDem.g:1279:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalDem.g:1279:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalDem.g:1280:6: lv_context_3_0= ruleDmxTestContext
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

                    // InternalDem.g:1297:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==39) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalDem.g:1298:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDem.g:1302:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalDem.g:1303:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalDem.g:1303:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalDem.g:1304:7: lv_context_5_0= ruleDmxTestContext
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

            otherlv_6=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDem.g:1327:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalDem.g:1328:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalDem.g:1328:4: (lv_expr_7_0= ruleDExpression )
            // InternalDem.g:1329:5: lv_expr_7_0= ruleDExpression
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
    // InternalDem.g:1354:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalDem.g:1354:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalDem.g:1355:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalDem.g:1361:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
    public final EObject ruleDmxTestContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1367:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalDem.g:1368:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalDem.g:1368:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalDem.g:1369:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalDem.g:1369:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:1370:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:1370:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:1371:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
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
            // InternalDem.g:1391:3: ( (otherlv_2= RULE_ID ) )
            // InternalDem.g:1392:4: (otherlv_2= RULE_ID )
            {
            // InternalDem.g:1392:4: (otherlv_2= RULE_ID )
            // InternalDem.g:1393:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDem.g:1404:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42||LA35_0==48||LA35_0==75||LA35_0==112) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDem.g:1405:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDem.g:1405:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDem.g:1406:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_34);
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

            // InternalDem.g:1423:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDem.g:1424:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalDem.g:1428:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=RULE_NATURAL && LA36_0<=RULE_STRING)||(LA36_0>=55 && LA36_0<=56)||(LA36_0>=67 && LA36_0<=72)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==20) ) {
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
                            // InternalDem.g:1429:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalDem.g:1429:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalDem.g:1430:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalDem.g:1430:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalDem.g:1431:7: lv_value_5_0= ruleDmxLiteralExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDmxTestContextAccess().getValueDmxLiteralExpressionParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_value_5_0=ruleDmxLiteralExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDmxTestContextRule());
                              							}
                              							set(
                              								current,
                              								"value",
                              								lv_value_5_0,
                              								"com.mimacom.ddd.dm.dmx.Dmx.DmxLiteralExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDem.g:1449:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalDem.g:1449:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalDem.g:1450:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalDem.g:1450:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalDem.g:1451:7: lv_value_6_0= ruleDmxLiteralListExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDmxTestContextAccess().getValueDmxLiteralListExpressionParserRuleCall_4_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_value_6_0=ruleDmxLiteralListExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDmxTestContextRule());
                              							}
                              							set(
                              								current,
                              								"value",
                              								lv_value_6_0,
                              								"com.mimacom.ddd.dm.dmx.Dmx.DmxLiteralListExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

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
    // InternalDem.g:1474:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalDem.g:1474:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalDem.g:1475:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalDem.g:1481:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalDem.g:1487:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalDem.g:1488:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalDem.g:1488:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalDem.g:1489:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalDem.g:1489:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:1490:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:1490:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:1491:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,41,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,42,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDem.g:1515:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalDem.g:1516:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalDem.g:1516:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalDem.g:1517:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalDem.g:1534:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==39) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDem.g:1535:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDem.g:1539:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalDem.g:1540:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalDem.g:1540:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalDem.g:1541:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_6=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:1567:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalDem.g:1567:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalDem.g:1568:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalDem.g:1574:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1580:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDem.g:1581:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDem.g:1581:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDem.g:1582:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDem.g:1586:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:1587:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:1587:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:1588:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,45,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalDem.g:1608:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalDem.g:1609:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalDem.g:1609:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalDem.g:1610:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalDem.g:1627:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_PLAIN_TEXT_ONLY && LA39_0<=RULE_RICH_TEXT_START)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDem.g:1628:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDem.g:1628:4: (lv_description_4_0= ruleDRichText )
                    // InternalDem.g:1629:5: lv_description_4_0= ruleDRichText
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
    // InternalDem.g:1650:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalDem.g:1650:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalDem.g:1651:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalDem.g:1657:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalDem.g:1663:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalDem.g:1664:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalDem.g:1664:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalDem.g:1665:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalDem.g:1669:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:1670:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:1670:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:1671:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,42,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDem.g:1691:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDem.g:1692:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalDem.g:1692:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalDem.g:1693:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalDem.g:1693:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalDem.g:1694:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalDem.g:1711:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==39) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalDem.g:1712:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:1716:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalDem.g:1717:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalDem.g:1717:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalDem.g:1718:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,28,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalDem.g:1745:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDem.g:1746:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDem.g:1746:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalDem.g:1747:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalDem.g:1764:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDem.g:1765:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalDem.g:1769:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalDem.g:1770:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalDem.g:1770:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalDem.g:1771:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalDem.g:1793:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalDem.g:1793:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalDem.g:1794:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalDem.g:1800:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1806:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalDem.g:1807:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalDem.g:1807:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalDem.g:1808:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalDem.g:1808:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=78 && LA43_0<=88)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
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
                    // InternalDem.g:1809:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalDem.g:1809:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalDem.g:1810:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalDem.g:1810:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalDem.g:1811:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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
                    // InternalDem.g:1829:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDem.g:1829:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDem.g:1830:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDem.g:1830:5: (otherlv_1= RULE_ID )
                    // InternalDem.g:1831:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDem.g:1843:3: ( (lv_collection_2_0= '*' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDem.g:1844:4: (lv_collection_2_0= '*' )
                    {
                    // InternalDem.g:1844:4: (lv_collection_2_0= '*' )
                    // InternalDem.g:1845:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:1861:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalDem.g:1861:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalDem.g:1862:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalDem.g:1868:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1874:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalDem.g:1875:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalDem.g:1875:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalDem.g:1876:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalDem.g:1876:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:1877:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:1877:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:1878:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,28,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDem.g:1898:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDem.g:1899:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDem.g:1899:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalDem.g:1900:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalDem.g:1921:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDem.g:1921:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDem.g:1922:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDem.g:1928:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalDem.g:1934:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalDem.g:1935:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalDem.g:1935:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==EOF||(LA45_1>=RULE_ID && LA45_1<=RULE_RICH_TEXT_END)||(LA45_1>=26 && LA45_1<=29)||LA45_1==35||LA45_1==39||(LA45_1>=41 && LA45_1<=43)||(LA45_1>=48 && LA45_1<=54)||LA45_1==57||(LA45_1>=63 && LA45_1<=66)||(LA45_1>=75 && LA45_1<=76)||(LA45_1>=89 && LA45_1<=108)) ) {
                    alt45=2;
                }
                else if ( (LA45_1==40) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
            case RULE_STRING:
            case 20:
            case 42:
            case 55:
            case 56:
            case 58:
            case 62:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 75:
            case 76:
            case 109:
            case 110:
            case 111:
                {
                alt45=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_RICH_TEXT_START:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalDem.g:1936:3: this_DmxAssignment_0= ruleDmxAssignment
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
                    // InternalDem.g:1945:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
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
                    // InternalDem.g:1954:3: this_DRichText_2= ruleDRichText
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
    // InternalDem.g:1966:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDem.g:1966:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDem.g:1967:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDem.g:1973:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalDem.g:1979:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalDem.g:1980:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalDem.g:1980:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_RICH_TEXT_START) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalDem.g:1981:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalDem.g:1981:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalDem.g:1982:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalDem.g:1982:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalDem.g:1983:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalDem.g:2001:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalDem.g:2001:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalDem.g:2002:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalDem.g:2002:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalDem.g:2003:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalDem.g:2003:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalDem.g:2004:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
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

                    // InternalDem.g:2021:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDem.g:2022:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDem.g:2022:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDem.g:2023:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

                    // InternalDem.g:2040:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalDem.g:2041:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDem.g:2041:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalDem.g:2042:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalDem.g:2042:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalDem.g:2043:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
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

                    	    // InternalDem.g:2060:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDem.g:2061:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDem.g:2061:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDem.g:2062:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
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
                    	    break loop46;
                        }
                    } while (true);

                    // InternalDem.g:2080:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalDem.g:2081:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalDem.g:2081:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalDem.g:2082:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalDem.g:2104:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalDem.g:2104:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalDem.g:2105:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalDem.g:2111:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2117:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDem.g:2118:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDem.g:2118:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDem.g:2119:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDem.g:2119:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDem.g:2120:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDem.g:2139:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalDem.g:2139:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalDem.g:2140:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalDem.g:2146:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2152:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalDem.g:2153:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalDem.g:2153:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalDem.g:2154:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalDem.g:2154:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalDem.g:2155:4: lv_value_0_0= RULE_RICH_TEXT_START
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_START,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDmxTextStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDmxTextStartRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.RICH_TEXT_START");
              			
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
    // InternalDem.g:2174:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalDem.g:2174:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalDem.g:2175:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalDem.g:2181:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2187:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalDem.g:2188:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalDem.g:2188:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalDem.g:2189:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalDem.g:2189:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalDem.g:2190:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_MIDDLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDmxTextMiddleAccess().getValueRICH_TEXT_MIDDLETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDmxTextMiddleRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.RICH_TEXT_MIDDLE");
              			
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
    // InternalDem.g:2209:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalDem.g:2209:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalDem.g:2210:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalDem.g:2216:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2222:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalDem.g:2223:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalDem.g:2223:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalDem.g:2224:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalDem.g:2224:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalDem.g:2225:4: lv_value_0_0= RULE_RICH_TEXT_END
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDmxTextEndAccess().getValueRICH_TEXT_ENDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDmxTextEndRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.RICH_TEXT_END");
              			
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
    // InternalDem.g:2244:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalDem.g:2244:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalDem.g:2245:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalDem.g:2251:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDem.g:2257:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalDem.g:2258:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalDem.g:2258:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalDem.g:2259:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2267:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop49:
            do {
                int alt49=3;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==49) ) {
                    int LA49_2 = input.LA(2);

                    if ( (synpred1_InternalDem()) ) {
                        alt49=1;
                    }
                    else if ( (synpred2_InternalDem()) ) {
                        alt49=2;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalDem.g:2268:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalDem.g:2268:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalDem.g:2269:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalDem.g:2269:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalDem.g:2270:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalDem.g:2282:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalDem.g:2283:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalDem.g:2283:7: ()
            	    // InternalDem.g:2284:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDem.g:2294:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDem.g:2295:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDem.g:2295:8: (otherlv_3= RULE_ID )
            	    // InternalDem.g:2296:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_49);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2316:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalDem.g:2317:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalDem.g:2317:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalDem.g:2318:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    // InternalDem.g:2337:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalDem.g:2337:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalDem.g:2338:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalDem.g:2338:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDem.g:2339:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDem.g:2345:6: ( () otherlv_7= '.' )
            	    // InternalDem.g:2346:7: () otherlv_7= '.'
            	    {
            	    // InternalDem.g:2346:7: ()
            	    // InternalDem.g:2347:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2359:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDem.g:2360:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDem.g:2360:6: (otherlv_8= RULE_ID )
            	    // InternalDem.g:2361:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2372:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt48=3;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==42) && (synpred3_InternalDem())) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==50) ) {
            	        alt48=2;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalDem.g:2373:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalDem.g:2373:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalDem.g:2374:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalDem.g:2374:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDem.g:2375:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDem.g:2379:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDem.g:2380:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,42,FOLLOW_51); if (state.failed) return current;
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

            	            // InternalDem.g:2392:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalDem.g:2393:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalDem.g:2393:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalDem.g:2394:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_52);
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

            	            otherlv_11=(Token)match(input,43,FOLLOW_47); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDem.g:2417:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalDem.g:2417:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalDem.g:2418:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalDem.g:2418:7: (lv_before_12_0= '@before' )
            	            // InternalDem.g:2419:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,50,FOLLOW_47); if (state.failed) return current;
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
            	    break loop49;
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
    // InternalDem.g:2438:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalDem.g:2438:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalDem.g:2439:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalDem.g:2445:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2451:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalDem.g:2452:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalDem.g:2452:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalDem.g:2453:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalDem.g:2453:3: ()
            // InternalDem.g:2454:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:2460:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||(LA51_0>=RULE_NATURAL && LA51_0<=RULE_STRING)||LA51_0==20||LA51_0==42||(LA51_0>=55 && LA51_0<=56)||LA51_0==58||LA51_0==62||(LA51_0>=67 && LA51_0<=72)||(LA51_0>=75 && LA51_0<=76)||(LA51_0>=109 && LA51_0<=111)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDem.g:2461:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalDem.g:2461:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalDem.g:2462:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalDem.g:2462:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalDem.g:2463:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
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

                    // InternalDem.g:2480:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==39) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalDem.g:2481:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:2485:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalDem.g:2486:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalDem.g:2486:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalDem.g:2487:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_53);
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
                    	    break loop50;
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
    // InternalDem.g:2510:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalDem.g:2510:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalDem.g:2511:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
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
    // InternalDem.g:2517:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2523:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalDem.g:2524:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalDem.g:2524:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalDem.g:2525:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalDem.g:2525:3: ()
            // InternalDem.g:2526:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:2532:3: ( (otherlv_1= RULE_ID ) )
            // InternalDem.g:2533:4: (otherlv_1= RULE_ID )
            {
            // InternalDem.g:2533:4: (otherlv_1= RULE_ID )
            // InternalDem.g:2534:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxAssignmentRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxAssignmentAccess().getAssignToMemberDNavigableMemberCrossReference_1_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAssignmentAccess().getDmxOpSingleAssignParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_49);
            ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2552:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalDem.g:2553:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalDem.g:2553:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalDem.g:2554:5: lv_value_3_0= ruleDmxOrExpression
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
    // InternalDem.g:2575:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalDem.g:2575:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalDem.g:2576:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalDem.g:2582:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:2588:2: (kw= ':=' )
            // InternalDem.g:2589:2: kw= ':='
            {
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:2597:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalDem.g:2597:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalDem.g:2598:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalDem.g:2604:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDem.g:2610:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalDem.g:2611:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalDem.g:2611:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==EOF||(LA52_1>=RULE_ID && LA52_1<=RULE_RICH_TEXT_END)||(LA52_1>=26 && LA52_1<=29)||LA52_1==35||LA52_1==39||(LA52_1>=41 && LA52_1<=43)||(LA52_1>=48 && LA52_1<=50)||(LA52_1>=52 && LA52_1<=54)||LA52_1==57||(LA52_1>=63 && LA52_1<=66)||(LA52_1>=75 && LA52_1<=76)||(LA52_1>=89 && LA52_1<=108)) ) {
                    alt52=2;
                }
                else if ( (LA52_1==51) ) {
                    alt52=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA52_0>=RULE_NATURAL && LA52_0<=RULE_STRING)||LA52_0==20||LA52_0==42||(LA52_0>=55 && LA52_0<=56)||LA52_0==58||LA52_0==62||(LA52_0>=67 && LA52_0<=72)||(LA52_0>=75 && LA52_0<=76)||(LA52_0>=109 && LA52_0<=111)) ) {
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
                    // InternalDem.g:2612:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalDem.g:2612:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalDem.g:2613:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalDem.g:2613:4: ()
                    // InternalDem.g:2614:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDem.g:2620:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalDem.g:2621:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalDem.g:2621:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalDem.g:2622:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
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

                    otherlv_2=(Token)match(input,51,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalDem.g:2643:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalDem.g:2644:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalDem.g:2644:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalDem.g:2645:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalDem.g:2664:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalDem.g:2676:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalDem.g:2676:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalDem.g:2677:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalDem.g:2683:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2689:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDem.g:2690:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDem.g:2690:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:2691:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:2691:3: (lv_name_0_0= RULE_ID )
            // InternalDem.g:2692:4: lv_name_0_0= RULE_ID
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
    // InternalDem.g:2711:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalDem.g:2711:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalDem.g:2712:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalDem.g:2718:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2724:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalDem.g:2725:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalDem.g:2725:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalDem.g:2726:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2734:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case 89:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (synpred4_InternalDem()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 90:
                    {
                    int LA53_3 = input.LA(2);

                    if ( (synpred4_InternalDem()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA53_4 = input.LA(2);

                    if ( (synpred4_InternalDem()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA53_5 = input.LA(2);

                    if ( (synpred4_InternalDem()) ) {
                        alt53=1;
                    }


                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // InternalDem.g:2735:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalDem.g:2735:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalDem.g:2736:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalDem.g:2746:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalDem.g:2747:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalDem.g:2747:6: ()
            	    // InternalDem.g:2748:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:2754:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalDem.g:2755:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalDem.g:2755:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalDem.g:2756:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_49);
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

            	    // InternalDem.g:2775:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalDem.g:2776:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalDem.g:2776:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalDem.g:2777:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
    // $ANTLR end "ruleDmxOrExpression"


    // $ANTLR start "entryRuleDmxAndExpression"
    // InternalDem.g:2799:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalDem.g:2799:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalDem.g:2800:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalDem.g:2806:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2812:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalDem.g:2813:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalDem.g:2813:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalDem.g:2814:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2822:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==93) ) {
                    int LA54_2 = input.LA(2);

                    if ( (synpred5_InternalDem()) ) {
                        alt54=1;
                    }


                }
                else if ( (LA54_0==94) ) {
                    int LA54_3 = input.LA(2);

                    if ( (synpred5_InternalDem()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalDem.g:2823:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalDem.g:2823:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalDem.g:2824:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalDem.g:2834:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalDem.g:2835:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalDem.g:2835:6: ()
            	    // InternalDem.g:2836:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:2842:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalDem.g:2843:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalDem.g:2843:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalDem.g:2844:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_49);
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

            	    // InternalDem.g:2863:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalDem.g:2864:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalDem.g:2864:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalDem.g:2865:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalDem.g:2887:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalDem.g:2887:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalDem.g:2888:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalDem.g:2894:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2900:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalDem.g:2901:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalDem.g:2901:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalDem.g:2902:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2910:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    int LA55_2 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 95:
                    {
                    int LA55_3 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 96:
                    {
                    int LA55_4 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt55=1;
                    }


                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // InternalDem.g:2911:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalDem.g:2911:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalDem.g:2912:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalDem.g:2922:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalDem.g:2923:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalDem.g:2923:6: ()
            	    // InternalDem.g:2924:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:2930:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalDem.g:2931:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalDem.g:2931:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalDem.g:2932:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_49);
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

            	    // InternalDem.g:2951:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalDem.g:2952:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalDem.g:2952:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalDem.g:2953:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
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
            	    break loop55;
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
    // InternalDem.g:2975:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalDem.g:2975:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalDem.g:2976:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalDem.g:2982:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2988:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalDem.g:2989:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalDem.g:2989:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalDem.g:2990:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2998:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop56:
            do {
                int alt56=3;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalDem.g:2999:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDem.g:2999:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDem.g:3000:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDem.g:3000:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalDem.g:3001:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalDem.g:3007:6: ( () ruleDmxOpInstanceOf )
            	    // InternalDem.g:3008:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalDem.g:3008:7: ()
            	    // InternalDem.g:3009:8: 
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

            	    // InternalDem.g:3024:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDem.g:3025:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDem.g:3025:6: (otherlv_3= RULE_ID )
            	    // InternalDem.g:3026:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDem.g:3039:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalDem.g:3039:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalDem.g:3040:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalDem.g:3040:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDem.g:3041:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDem.g:3051:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDem.g:3052:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDem.g:3052:7: ()
            	    // InternalDem.g:3053:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDem.g:3059:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDem.g:3060:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDem.g:3060:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDem.g:3061:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_49);
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

            	    // InternalDem.g:3080:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalDem.g:3081:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalDem.g:3081:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalDem.g:3082:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_58);
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalDem.g:3105:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalDem.g:3105:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalDem.g:3106:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalDem.g:3112:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:3118:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDem.g:3119:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDem.g:3119:2: (kw= 'ISA' | kw= 'isa' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==52) ) {
                alt57=1;
            }
            else if ( (LA57_0==53) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalDem.g:3120:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:3126:3: kw= 'isa'
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
    // InternalDem.g:3135:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalDem.g:3135:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalDem.g:3136:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalDem.g:3142:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3148:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalDem.g:3149:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalDem.g:3149:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalDem.g:3150:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3158:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                switch ( input.LA(1) ) {
                case 103:
                    {
                    int LA58_2 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA58_3 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case 66:
                    {
                    int LA58_4 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case 104:
                    {
                    int LA58_5 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case 105:
                    {
                    int LA58_6 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // InternalDem.g:3159:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalDem.g:3159:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDem.g:3160:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDem.g:3170:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDem.g:3171:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDem.g:3171:6: ()
            	    // InternalDem.g:3172:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:3178:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDem.g:3179:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDem.g:3179:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDem.g:3180:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_49);
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

            	    // InternalDem.g:3199:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalDem.g:3200:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalDem.g:3200:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalDem.g:3201:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalDem.g:3223:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalDem.g:3223:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalDem.g:3224:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalDem.g:3230:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3236:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalDem.g:3237:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalDem.g:3237:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalDem.g:3238:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3246:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==75) ) {
                    int LA59_2 = input.LA(2);

                    if ( (synpred10_InternalDem()) ) {
                        alt59=1;
                    }


                }
                else if ( (LA59_0==76) ) {
                    int LA59_3 = input.LA(2);

                    if ( (synpred10_InternalDem()) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // InternalDem.g:3247:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalDem.g:3247:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDem.g:3248:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDem.g:3258:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDem.g:3259:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDem.g:3259:6: ()
            	    // InternalDem.g:3260:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:3266:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDem.g:3267:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDem.g:3267:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDem.g:3268:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_49);
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

            	    // InternalDem.g:3287:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalDem.g:3288:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalDem.g:3288:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalDem.g:3289:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	    break loop59;
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
    // InternalDem.g:3311:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalDem.g:3311:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalDem.g:3312:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalDem.g:3318:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3324:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalDem.g:3325:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalDem.g:3325:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalDem.g:3326:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3334:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop60:
            do {
                int alt60=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA60_2 = input.LA(2);

                    if ( (synpred11_InternalDem()) ) {
                        alt60=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA60_3 = input.LA(2);

                    if ( (synpred11_InternalDem()) ) {
                        alt60=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA60_4 = input.LA(2);

                    if ( (synpred11_InternalDem()) ) {
                        alt60=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA60_5 = input.LA(2);

                    if ( (synpred11_InternalDem()) ) {
                        alt60=1;
                    }


                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // InternalDem.g:3335:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalDem.g:3335:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDem.g:3336:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDem.g:3346:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDem.g:3347:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDem.g:3347:6: ()
            	    // InternalDem.g:3348:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:3354:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDem.g:3355:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDem.g:3355:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDem.g:3356:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_49);
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

            	    // InternalDem.g:3375:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalDem.g:3376:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalDem.g:3376:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalDem.g:3377:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
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
            	    break loop60;
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
    // InternalDem.g:3399:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalDem.g:3399:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalDem.g:3400:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalDem.g:3406:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDem.g:3412:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalDem.g:3413:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalDem.g:3413:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=75 && LA61_0<=76)||(LA61_0>=109 && LA61_0<=111)) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID||(LA61_0>=RULE_NATURAL && LA61_0<=RULE_STRING)||LA61_0==20||LA61_0==42||(LA61_0>=55 && LA61_0<=56)||LA61_0==58||LA61_0==62||(LA61_0>=67 && LA61_0<=72)) ) {
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
                    // InternalDem.g:3414:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalDem.g:3414:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalDem.g:3415:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalDem.g:3415:4: ()
                    // InternalDem.g:3416:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDem.g:3422:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDem.g:3423:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDem.g:3423:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDem.g:3424:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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

                    // InternalDem.g:3441:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalDem.g:3442:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalDem.g:3442:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalDem.g:3443:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalDem.g:3462:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalDem.g:3474:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalDem.g:3474:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalDem.g:3475:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalDem.g:3481:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3487:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDem.g:3488:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDem.g:3488:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDem.g:3489:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3497:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred12_InternalDem()) ) {
                    alt62=1;
                }
            }
            else if ( (LA62_0==35) ) {
                int LA62_2 = input.LA(2);

                if ( (synpred12_InternalDem()) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // InternalDem.g:3498:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDem.g:3498:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalDem.g:3499:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalDem.g:3505:5: ( () ruleDmxOpCast )
                    // InternalDem.g:3506:6: () ruleDmxOpCast
                    {
                    // InternalDem.g:3506:6: ()
                    // InternalDem.g:3507:7: 
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

                    // InternalDem.g:3522:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDem.g:3523:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDem.g:3523:5: (otherlv_3= RULE_ID )
                    // InternalDem.g:3524:6: otherlv_3= RULE_ID
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
    // InternalDem.g:3540:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalDem.g:3540:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalDem.g:3541:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalDem.g:3547:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:3553:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDem.g:3554:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDem.g:3554:2: (kw= 'AS' | kw= 'as' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==54) ) {
                alt63=1;
            }
            else if ( (LA63_0==35) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalDem.g:3555:3: kw= 'AS'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:3561:3: kw= 'as'
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
    // InternalDem.g:3570:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalDem.g:3570:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalDem.g:3571:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalDem.g:3577:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
    public final EObject ruleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxLiteralExpression_0 = null;

        EObject this_DmxParenthesizedExpression_1 = null;

        EObject this_DmxListExpression_2 = null;

        EObject this_DmxFunctionCall_3 = null;

        EObject this_DmxStaticReference_4 = null;

        EObject this_DmxContextReference_5 = null;

        EObject this_DmxIfExpression_6 = null;



        	enterRule();

        try {
            // InternalDem.g:3583:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalDem.g:3584:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalDem.g:3584:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt64=7;
            switch ( input.LA(1) ) {
            case RULE_NATURAL:
            case RULE_STRING:
            case 55:
            case 56:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt64=1;
                }
                break;
            case 42:
                {
                alt64=2;
                }
                break;
            case 20:
                {
                alt64=3;
                }
                break;
            case RULE_ID:
                {
                int LA64_4 = input.LA(2);

                if ( (LA64_4==EOF||(LA64_4>=RULE_ID && LA64_4<=RULE_RICH_TEXT_END)||(LA64_4>=26 && LA64_4<=29)||LA64_4==35||LA64_4==39||LA64_4==41||LA64_4==43||(LA64_4>=48 && LA64_4<=50)||(LA64_4>=52 && LA64_4<=54)||LA64_4==57||(LA64_4>=63 && LA64_4<=66)||(LA64_4>=75 && LA64_4<=76)||(LA64_4>=89 && LA64_4<=108)) ) {
                    alt64=6;
                }
                else if ( (LA64_4==42) ) {
                    alt64=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 4, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                alt64=5;
                }
                break;
            case 62:
                {
                alt64=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalDem.g:3585:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalDem.g:3594:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalDem.g:3603:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalDem.g:3612:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalDem.g:3621:3: this_DmxStaticReference_4= ruleDmxStaticReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxStaticReferenceParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxStaticReference_4=ruleDmxStaticReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxStaticReference_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDem.g:3630:3: this_DmxContextReference_5= ruleDmxContextReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxContextReferenceParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxContextReference_5=ruleDmxContextReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxContextReference_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalDem.g:3639:3: this_DmxIfExpression_6= ruleDmxIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxIfExpressionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxIfExpression_6=ruleDmxIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxIfExpression_6;
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
    // InternalDem.g:3651:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalDem.g:3651:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalDem.g:3652:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalDem.g:3658:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
    public final EObject ruleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxBooleanLiteral_0 = null;

        EObject this_DmxStringLiteral_1 = null;

        EObject this_DmxNaturalLiteral_2 = null;

        EObject this_DmxDecimalLiteral_3 = null;

        EObject this_DmxUndefinedLiteral_4 = null;

        EObject this_DmxEntity_5 = null;

        EObject this_DmxDetail_6 = null;



        	enterRule();

        try {
            // InternalDem.g:3664:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalDem.g:3665:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalDem.g:3665:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt65=7;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalDem.g:3666:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalDem.g:3675:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalDem.g:3684:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalDem.g:3693:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalDem.g:3702:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                case 6 :
                    // InternalDem.g:3711:3: this_DmxEntity_5= ruleDmxEntity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxLiteralExpressionAccess().getDmxEntityParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxEntity_5=ruleDmxEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxEntity_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalDem.g:3720:3: this_DmxDetail_6= ruleDmxDetail
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxLiteralExpressionAccess().getDmxDetailParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxDetail_6=ruleDmxDetail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxDetail_6;
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
    // InternalDem.g:3732:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalDem.g:3732:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalDem.g:3733:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalDem.g:3739:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDem.g:3745:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDem.g:3746:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDem.g:3746:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDem.g:3747:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_52);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3767:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalDem.g:3767:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalDem.g:3768:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalDem.g:3774:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3780:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDem.g:3781:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDem.g:3781:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalDem.g:3782:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDem.g:3782:3: ()
            // InternalDem.g:3783:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDem.g:3793:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_RICH_TEXT_START)||(LA67_0>=RULE_NATURAL && LA67_0<=RULE_STRING)||LA67_0==20||LA67_0==42||(LA67_0>=55 && LA67_0<=56)||LA67_0==58||LA67_0==62||(LA67_0>=67 && LA67_0<=72)||(LA67_0>=75 && LA67_0<=76)||(LA67_0>=109 && LA67_0<=111)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDem.g:3794:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalDem.g:3794:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDem.g:3795:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDem.g:3795:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDem.g:3796:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
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

                    // InternalDem.g:3813:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==39) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalDem.g:3814:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:3818:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDem.g:3819:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDem.g:3819:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDem.g:3820:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_64);
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
                    	    break loop66;
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


    // $ANTLR start "entryRuleDmxLiteralListExpression"
    // InternalDem.g:3847:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalDem.g:3847:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalDem.g:3848:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxLiteralListExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxLiteralListExpression=ruleDmxLiteralListExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxLiteralListExpression; 
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
    // $ANTLR end "entryRuleDmxLiteralListExpression"


    // $ANTLR start "ruleDmxLiteralListExpression"
    // InternalDem.g:3854:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3860:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDem.g:3861:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDem.g:3861:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalDem.g:3862:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDem.g:3862:3: ()
            // InternalDem.g:3863:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDem.g:3873:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_NATURAL && LA69_0<=RULE_STRING)||(LA69_0>=55 && LA69_0<=56)||(LA69_0>=67 && LA69_0<=72)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDem.g:3874:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalDem.g:3874:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalDem.g:3875:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalDem.g:3875:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalDem.g:3876:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_elements_2_0=ruleDmxLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxLiteralListExpressionRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxLiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDem.g:3893:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==39) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalDem.g:3894:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_66); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:3898:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalDem.g:3899:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalDem.g:3899:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalDem.g:3900:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    lv_elements_4_0=ruleDmxLiteralExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDmxLiteralListExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DmxLiteralExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDmxLiteralListExpressionAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleDmxLiteralListExpression"


    // $ANTLR start "entryRuleDmxFunctionCall"
    // InternalDem.g:3927:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalDem.g:3927:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalDem.g:3928:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalDem.g:3934:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3940:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalDem.g:3941:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalDem.g:3941:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalDem.g:3942:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalDem.g:3942:3: ()
            // InternalDem.g:3943:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3949:3: ( (otherlv_1= RULE_ID ) )
            // InternalDem.g:3950:4: (otherlv_1= RULE_ID )
            {
            // InternalDem.g:3950:4: (otherlv_1= RULE_ID )
            // InternalDem.g:3951:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDem.g:3966:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalDem.g:3967:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalDem.g:3967:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalDem.g:3968:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_52);
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

            otherlv_4=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3993:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalDem.g:3993:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalDem.g:3994:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalDem.g:4000:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:4006:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalDem.g:4007:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalDem.g:4007:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalDem.g:4008:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalDem.g:4008:3: ()
            // InternalDem.g:4009:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4015:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_RICH_TEXT_START)||(LA71_0>=RULE_NATURAL && LA71_0<=RULE_STRING)||LA71_0==20||LA71_0==42||(LA71_0>=55 && LA71_0<=56)||LA71_0==58||LA71_0==62||(LA71_0>=67 && LA71_0<=72)||(LA71_0>=75 && LA71_0<=76)||(LA71_0>=109 && LA71_0<=111)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDem.g:4016:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalDem.g:4016:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalDem.g:4017:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalDem.g:4017:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalDem.g:4018:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
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

                    // InternalDem.g:4035:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==39) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalDem.g:4036:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:4040:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalDem.g:4041:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalDem.g:4041:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalDem.g:4042:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_53);
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
                    	    break loop70;
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


    // $ANTLR start "entryRuleDmxEntity"
    // InternalDem.g:4065:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalDem.g:4065:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalDem.g:4066:2: iv_ruleDmxEntity= ruleDmxEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxEntity=ruleDmxEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxEntity; 
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
    // $ANTLR end "entryRuleDmxEntity"


    // $ANTLR start "ruleDmxEntity"
    // InternalDem.g:4072:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDem.g:4078:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDem.g:4079:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDem.g:4079:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDem.g:4080:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxEntityAccess().getEntityKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDmxEntityRule());
              			}
              			newCompositeNode(grammarAccess.getDmxEntityAccess().getDmxComplexObjectParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_DmxComplexObject_1=ruleDmxComplexObject(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxComplexObject_1;
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
    // $ANTLR end "ruleDmxEntity"


    // $ANTLR start "entryRuleDmxDetail"
    // InternalDem.g:4099:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalDem.g:4099:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalDem.g:4100:2: iv_ruleDmxDetail= ruleDmxDetail EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxDetailRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxDetail=ruleDmxDetail();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxDetail; 
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
    // $ANTLR end "entryRuleDmxDetail"


    // $ANTLR start "ruleDmxDetail"
    // InternalDem.g:4106:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDem.g:4112:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDem.g:4113:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDem.g:4113:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDem.g:4114:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxDetailAccess().getDetailKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDmxDetailRule());
              			}
              			newCompositeNode(grammarAccess.getDmxDetailAccess().getDmxComplexObjectParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_DmxComplexObject_1=ruleDmxComplexObject(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxComplexObject_1;
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
    // $ANTLR end "ruleDmxDetail"


    // $ANTLR start "ruleDmxComplexObject"
    // InternalDem.g:4134:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalDem.g:4140:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalDem.g:4141:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalDem.g:4141:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalDem.g:4142:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalDem.g:4142:3: ( (otherlv_0= RULE_ID ) )
            // InternalDem.g:4143:4: (otherlv_0= RULE_ID )
            {
            // InternalDem.g:4143:4: (otherlv_0= RULE_ID )
            // InternalDem.g:4144:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxComplexObjectRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxComplexObjectAccess().getTypeDComplexTypeCrossReference_0_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getDomFieldListStartSymbolParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_16);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:4162:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_ID) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalDem.g:4163:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalDem.g:4163:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalDem.g:4164:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_fields_2_0=ruleDmxField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxComplexObjectRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fields",
            	      						lv_fields_2_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DmxField");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxComplexObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleDmxComplexObject"


    // $ANTLR start "entryRuleDmxField"
    // InternalDem.g:4189:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalDem.g:4189:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalDem.g:4190:2: iv_ruleDmxField= ruleDmxField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxField=ruleDmxField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxField; 
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
    // $ANTLR end "entryRuleDmxField"


    // $ANTLR start "ruleDmxField"
    // InternalDem.g:4196:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDem.g:4202:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalDem.g:4203:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalDem.g:4203:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalDem.g:4204:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalDem.g:4204:3: ( (otherlv_0= RULE_ID ) )
            // InternalDem.g:4205:4: (otherlv_0= RULE_ID )
            {
            // InternalDem.g:4205:4: (otherlv_0= RULE_ID )
            // InternalDem.g:4206:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,57,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalDem.g:4221:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalDem.g:4222:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalDem.g:4222:4: (lv_value_2_0= ruleDExpression )
            // InternalDem.g:4223:5: lv_value_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFieldAccess().getValueDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxFieldRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
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
    // $ANTLR end "ruleDmxField"


    // $ANTLR start "entryRuleDmxStaticReference"
    // InternalDem.g:4244:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalDem.g:4244:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalDem.g:4245:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalDem.g:4251:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalDem.g:4257:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalDem.g:4258:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalDem.g:4258:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalDem.g:4259:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalDem.g:4259:3: ()
            // InternalDem.g:4260:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalDem.g:4270:3: ( ( ruleDQualifiedName ) )
            // InternalDem.g:4271:4: ( ruleDQualifiedName )
            {
            // InternalDem.g:4271:4: ( ruleDQualifiedName )
            // InternalDem.g:4272:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_69);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDem.g:4286:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==59) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalDem.g:4287:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalDem.g:4291:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDem.g:4292:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDem.g:4292:5: (otherlv_4= RULE_ID )
                    // InternalDem.g:4293:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDem.g:4305:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==51) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalDem.g:4306:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalDem.g:4310:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_ID) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==48) ) {
                        alt74=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalDem.g:4311:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalDem.g:4311:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalDem.g:4312:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalDem.g:4312:6: (lv_displayName_6_0= RULE_ID )
                            // InternalDem.g:4313:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
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
                            // InternalDem.g:4330:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalDem.g:4330:5: ( (lv_plural_7_0= '*' ) )
                            // InternalDem.g:4331:6: (lv_plural_7_0= '*' )
                            {
                            // InternalDem.g:4331:6: (lv_plural_7_0= '*' )
                            // InternalDem.g:4332:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,48,FOLLOW_72); if (state.failed) return current;
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

            // InternalDem.g:4346:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalDem.g:4347:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4357:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalDem.g:4357:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalDem.g:4358:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalDem.g:4364:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalDem.g:4370:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalDem.g:4371:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalDem.g:4371:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalDem.g:4372:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalDem.g:4372:3: ()
            // InternalDem.g:4373:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4379:3: ( (otherlv_1= RULE_ID ) )
            // InternalDem.g:4380:4: (otherlv_1= RULE_ID )
            {
            // InternalDem.g:4380:4: (otherlv_1= RULE_ID )
            // InternalDem.g:4381:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDem.g:4392:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt76=3;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==50) ) {
                alt76=1;
            }
            else if ( (LA76_0==49) ) {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==61) ) {
                    alt76=2;
                }
            }
            switch (alt76) {
                case 1 :
                    // InternalDem.g:4393:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalDem.g:4393:4: ( (lv_before_2_0= '@before' ) )
                    // InternalDem.g:4394:5: (lv_before_2_0= '@before' )
                    {
                    // InternalDem.g:4394:5: (lv_before_2_0= '@before' )
                    // InternalDem.g:4395:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDem.g:4408:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalDem.g:4408:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalDem.g:4409:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalDem.g:4413:5: ( (lv_all_4_0= 'all' ) )
                    // InternalDem.g:4414:6: (lv_all_4_0= 'all' )
                    {
                    // InternalDem.g:4414:6: (lv_all_4_0= 'all' )
                    // InternalDem.g:4415:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4433:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalDem.g:4433:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalDem.g:4434:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalDem.g:4440:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDem.g:4446:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDem.g:4447:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDem.g:4447:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDem.g:4448:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDem.g:4448:3: ()
            // InternalDem.g:4449:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDem.g:4459:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDem.g:4460:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDem.g:4460:4: (lv_if_2_0= ruleDExpression )
            // InternalDem.g:4461:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_75);
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

            otherlv_3=(Token)match(input,63,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDem.g:4482:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDem.g:4483:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDem.g:4483:4: (lv_then_4_0= ruleDExpression )
            // InternalDem.g:4484:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_76);
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

            // InternalDem.g:4501:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==64) && (synpred14_InternalDem())) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDem.g:4502:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDem.g:4502:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDem.g:4503:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDem.g:4509:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDem.g:4510:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDem.g:4510:5: (lv_else_6_0= ruleDExpression )
                    // InternalDem.g:4511:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_77);
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

            otherlv_7=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4537:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDem.g:4537:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDem.g:4538:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDem.g:4544:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalDem.g:4550:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalDem.g:4551:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalDem.g:4551:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==48||LA78_0==75||LA78_0==112) ) {
                alt78=1;
            }
            else if ( (LA78_0==42) ) {
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
                    // InternalDem.g:4552:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalDem.g:4552:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalDem.g:4553:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalDem.g:4553:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalDem.g:4554:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalDem.g:4572:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalDem.g:4572:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalDem.g:4573:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_78); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalDem.g:4577:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalDem.g:4578:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalDem.g:4578:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalDem.g:4579:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_79); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,66,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalDem.g:4599:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalDem.g:4600:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalDem.g:4600:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalDem.g:4601:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
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

                    otherlv_5=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4627:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDem.g:4627:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDem.g:4628:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDem.g:4634:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:4640:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDem.g:4641:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDem.g:4641:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_NATURAL) ) {
                alt79=1;
            }
            else if ( (LA79_0==48) ) {
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
                    // InternalDem.g:4642:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDem.g:4650:3: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4659:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalDem.g:4659:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalDem.g:4660:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalDem.g:4666:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDem.g:4672:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDem.g:4673:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDem.g:4673:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDem.g:4674:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDem.g:4674:3: ()
            // InternalDem.g:4675:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4681:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt80=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt80=1;
                }
                break;
            case 68:
                {
                alt80=2;
                }
                break;
            case 69:
                {
                alt80=3;
                }
                break;
            case 70:
                {
                alt80=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalDem.g:4682:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDem.g:4682:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDem.g:4683:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDem.g:4683:5: (lv_value_1_0= 'TRUE' )
                    // InternalDem.g:4684:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDem.g:4697:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDem.g:4697:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDem.g:4698:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDem.g:4698:5: (lv_value_2_0= 'true' )
                    // InternalDem.g:4699:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDem.g:4712:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDem.g:4717:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4726:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalDem.g:4726:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalDem.g:4727:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalDem.g:4733:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDem.g:4739:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDem.g:4740:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDem.g:4740:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDem.g:4741:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDem.g:4741:3: ()
            // InternalDem.g:4742:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4748:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDem.g:4749:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDem.g:4749:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDem.g:4750:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDem.g:4770:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalDem.g:4770:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalDem.g:4771:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalDem.g:4777:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDem.g:4783:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDem.g:4784:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDem.g:4784:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDem.g:4785:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDem.g:4785:3: ()
            // InternalDem.g:4786:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4792:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDem.g:4793:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDem.g:4793:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDem.g:4794:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDem.g:4815:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalDem.g:4815:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalDem.g:4816:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalDem.g:4822:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDem.g:4828:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDem.g:4829:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDem.g:4829:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDem.g:4830:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDem.g:4830:3: ()
            // InternalDem.g:4831:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4837:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDem.g:4838:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDem.g:4838:4: (lv_value_1_0= RULE_STRING )
            // InternalDem.g:4839:5: lv_value_1_0= RULE_STRING
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
    // InternalDem.g:4859:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalDem.g:4859:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalDem.g:4860:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalDem.g:4866:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDem.g:4872:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDem.g:4873:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDem.g:4873:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDem.g:4874:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDem.g:4874:3: ()
            // InternalDem.g:4875:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4881:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==71) ) {
                alt81=1;
            }
            else if ( (LA81_0==72) ) {
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
                    // InternalDem.g:4882:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:4887:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4896:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDem.g:4896:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDem.g:4897:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDem.g:4903:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDem.g:4909:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDem.g:4910:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDem.g:4910:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDem.g:4911:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,49,FOLLOW_78); if (state.failed) return current;
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
            // InternalDem.g:4930:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=73 && LA84_0<=74)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDem.g:4931:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDem.g:4931:4: (kw= 'E' | kw= 'e' )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==73) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==74) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalDem.g:4932:5: kw= 'E'
                            {
                            kw=(Token)match(input,73,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDem.g:4938:5: kw= 'e'
                            {
                            kw=(Token)match(input,74,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDem.g:4944:4: (kw= '+' | kw= '-' )?
                    int alt83=3;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==75) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==76) ) {
                        alt83=2;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalDem.g:4945:5: kw= '+'
                            {
                            kw=(Token)match(input,75,FOLLOW_78); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDem.g:4951:5: kw= '-'
                            {
                            kw=(Token)match(input,76,FOLLOW_78); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDomFieldListStartSymbol"
    // InternalDem.g:4969:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalDem.g:4969:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalDem.g:4970:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomFieldListStartSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomFieldListStartSymbol=ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomFieldListStartSymbol.getText(); 
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
    // $ANTLR end "entryRuleDomFieldListStartSymbol"


    // $ANTLR start "ruleDomFieldListStartSymbol"
    // InternalDem.g:4976:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:4982:2: (kw= '{' )
            // InternalDem.g:4983:2: kw= '{'
            {
            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDomFieldListStartSymbolAccess().getLeftCurlyBracketKeyword());
              	
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
    // $ANTLR end "ruleDomFieldListStartSymbol"


    // $ANTLR start "entryRuleDQualifiedNameWithWildcard"
    // InternalDem.g:4991:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDem.g:4991:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDem.g:4992:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDem.g:4998:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDem.g:5004:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDem.g:5005:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDem.g:5005:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDem.g:5006:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_84);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:5016:3: (kw= '.*' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==77) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalDem.g:5017:4: kw= '.*'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:5027:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDem.g:5027:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDem.g:5028:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDem.g:5034:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDem.g:5040:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDem.g:5041:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDem.g:5041:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDem.g:5042:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDem.g:5049:3: (kw= '.' this_ID_2= RULE_ID )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==49) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalDem.g:5050:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // InternalDem.g:5067:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalDem.g:5073:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalDem.g:5074:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalDem.g:5074:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt87=11;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt87=1;
                }
                break;
            case 79:
                {
                alt87=2;
                }
                break;
            case 80:
                {
                alt87=3;
                }
                break;
            case 81:
                {
                alt87=4;
                }
                break;
            case 82:
                {
                alt87=5;
                }
                break;
            case 83:
                {
                alt87=6;
                }
                break;
            case 84:
                {
                alt87=7;
                }
                break;
            case 85:
                {
                alt87=8;
                }
                break;
            case 86:
                {
                alt87=9;
                }
                break;
            case 87:
                {
                alt87=10;
                }
                break;
            case 88:
                {
                alt87=11;
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
                    // InternalDem.g:5075:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalDem.g:5075:3: (enumLiteral_0= 'VOID' )
                    // InternalDem.g:5076:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5083:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDem.g:5083:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDem.g:5084:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5091:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalDem.g:5091:3: (enumLiteral_2= 'NUMBER' )
                    // InternalDem.g:5092:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:5099:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalDem.g:5099:3: (enumLiteral_3= 'TEXT' )
                    // InternalDem.g:5100:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDem.g:5107:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalDem.g:5107:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalDem.g:5108:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDem.g:5115:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalDem.g:5115:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalDem.g:5116:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDem.g:5123:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalDem.g:5123:3: (enumLiteral_6= 'STATE' )
                    // InternalDem.g:5124:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDem.g:5131:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalDem.g:5131:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalDem.g:5132:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDem.g:5139:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalDem.g:5139:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalDem.g:5140:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDem.g:5147:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalDem.g:5147:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalDem.g:5148:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDem.g:5155:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalDem.g:5155:3: (enumLiteral_10= 'SERVICE' )
                    // InternalDem.g:5156:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:5166:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDem.g:5172:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDem.g:5173:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDem.g:5173:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt88=4;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt88=1;
                }
                break;
            case 90:
                {
                alt88=2;
                }
                break;
            case 91:
                {
                alt88=3;
                }
                break;
            case 92:
                {
                alt88=4;
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
                    // InternalDem.g:5174:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDem.g:5174:3: (enumLiteral_0= 'OR' )
                    // InternalDem.g:5175:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5182:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDem.g:5182:3: (enumLiteral_1= 'or' )
                    // InternalDem.g:5183:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5190:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDem.g:5190:3: (enumLiteral_2= 'XOR' )
                    // InternalDem.g:5191:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:5198:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDem.g:5198:3: (enumLiteral_3= 'xor' )
                    // InternalDem.g:5199:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:5209:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDem.g:5215:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDem.g:5216:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDem.g:5216:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==93) ) {
                alt89=1;
            }
            else if ( (LA89_0==94) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalDem.g:5217:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDem.g:5217:3: (enumLiteral_0= 'AND' )
                    // InternalDem.g:5218:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5225:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDem.g:5225:3: (enumLiteral_1= 'and' )
                    // InternalDem.g:5226:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:5236:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDem.g:5242:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDem.g:5243:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDem.g:5243:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt90=1;
                }
                break;
            case 95:
                {
                alt90=2;
                }
                break;
            case 96:
                {
                alt90=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalDem.g:5244:3: (enumLiteral_0= '=' )
                    {
                    // InternalDem.g:5244:3: (enumLiteral_0= '=' )
                    // InternalDem.g:5245:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5252:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDem.g:5252:3: (enumLiteral_1= '!=' )
                    // InternalDem.g:5253:4: enumLiteral_1= '!='
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
                    // InternalDem.g:5260:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDem.g:5260:3: (enumLiteral_2= '<>' )
                    // InternalDem.g:5261:4: enumLiteral_2= '<>'
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
    // InternalDem.g:5271:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDem.g:5277:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDem.g:5278:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDem.g:5278:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt91=6;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt91=1;
                }
                break;
            case 98:
                {
                alt91=2;
                }
                break;
            case 99:
                {
                alt91=3;
                }
                break;
            case 100:
                {
                alt91=4;
                }
                break;
            case 101:
                {
                alt91=5;
                }
                break;
            case 102:
                {
                alt91=6;
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
                    // InternalDem.g:5279:3: (enumLiteral_0= '<' )
                    {
                    // InternalDem.g:5279:3: (enumLiteral_0= '<' )
                    // InternalDem.g:5280:4: enumLiteral_0= '<'
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
                    // InternalDem.g:5287:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDem.g:5287:3: (enumLiteral_1= '<=' )
                    // InternalDem.g:5288:4: enumLiteral_1= '<='
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
                    // InternalDem.g:5295:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDem.g:5295:3: (enumLiteral_2= '\\u2264' )
                    // InternalDem.g:5296:4: enumLiteral_2= '\\u2264'
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
                    // InternalDem.g:5303:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDem.g:5303:3: (enumLiteral_3= '>=' )
                    // InternalDem.g:5304:4: enumLiteral_3= '>='
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
                    // InternalDem.g:5311:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDem.g:5311:3: (enumLiteral_4= '\\u2265' )
                    // InternalDem.g:5312:4: enumLiteral_4= '\\u2265'
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
                    // InternalDem.g:5319:3: (enumLiteral_5= '>' )
                    {
                    // InternalDem.g:5319:3: (enumLiteral_5= '>' )
                    // InternalDem.g:5320:4: enumLiteral_5= '>'
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
    // InternalDem.g:5330:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDem.g:5336:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalDem.g:5337:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalDem.g:5337:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt92=5;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt92=1;
                }
                break;
            case 41:
                {
                alt92=2;
                }
                break;
            case 66:
                {
                alt92=3;
                }
                break;
            case 104:
                {
                alt92=4;
                }
                break;
            case 105:
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
                    // InternalDem.g:5338:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDem.g:5338:3: (enumLiteral_0= 'IN' )
                    // InternalDem.g:5339:4: enumLiteral_0= 'IN'
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
                    // InternalDem.g:5346:3: (enumLiteral_1= 'in' )
                    {
                    // InternalDem.g:5346:3: (enumLiteral_1= 'in' )
                    // InternalDem.g:5347:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5354:3: (enumLiteral_2= '..' )
                    {
                    // InternalDem.g:5354:3: (enumLiteral_2= '..' )
                    // InternalDem.g:5355:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:5362:3: (enumLiteral_3= '->' )
                    {
                    // InternalDem.g:5362:3: (enumLiteral_3= '->' )
                    // InternalDem.g:5363:4: enumLiteral_3= '->'
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
                    // InternalDem.g:5370:3: (enumLiteral_4= '=>' )
                    {
                    // InternalDem.g:5370:3: (enumLiteral_4= '=>' )
                    // InternalDem.g:5371:4: enumLiteral_4= '=>'
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
    // InternalDem.g:5381:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDem.g:5387:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDem.g:5388:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDem.g:5388:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==75) ) {
                alt93=1;
            }
            else if ( (LA93_0==76) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalDem.g:5389:3: (enumLiteral_0= '+' )
                    {
                    // InternalDem.g:5389:3: (enumLiteral_0= '+' )
                    // InternalDem.g:5390:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5397:3: (enumLiteral_1= '-' )
                    {
                    // InternalDem.g:5397:3: (enumLiteral_1= '-' )
                    // InternalDem.g:5398:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:5408:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDem.g:5414:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDem.g:5415:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDem.g:5415:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt94=1;
                }
                break;
            case 106:
                {
                alt94=2;
                }
                break;
            case 107:
                {
                alt94=3;
                }
                break;
            case 108:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalDem.g:5416:3: (enumLiteral_0= '*' )
                    {
                    // InternalDem.g:5416:3: (enumLiteral_0= '*' )
                    // InternalDem.g:5417:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5424:3: (enumLiteral_1= '/' )
                    {
                    // InternalDem.g:5424:3: (enumLiteral_1= '/' )
                    // InternalDem.g:5425:4: enumLiteral_1= '/'
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
                    // InternalDem.g:5432:3: (enumLiteral_2= '**' )
                    {
                    // InternalDem.g:5432:3: (enumLiteral_2= '**' )
                    // InternalDem.g:5433:4: enumLiteral_2= '**'
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
                    // InternalDem.g:5440:3: (enumLiteral_3= '%' )
                    {
                    // InternalDem.g:5440:3: (enumLiteral_3= '%' )
                    // InternalDem.g:5441:4: enumLiteral_3= '%'
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
    // InternalDem.g:5451:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDem.g:5457:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDem.g:5458:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDem.g:5458:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt95=5;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt95=1;
                }
                break;
            case 76:
                {
                alt95=2;
                }
                break;
            case 109:
                {
                alt95=3;
                }
                break;
            case 110:
                {
                alt95=4;
                }
                break;
            case 111:
                {
                alt95=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalDem.g:5459:3: (enumLiteral_0= '+' )
                    {
                    // InternalDem.g:5459:3: (enumLiteral_0= '+' )
                    // InternalDem.g:5460:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5467:3: (enumLiteral_1= '-' )
                    {
                    // InternalDem.g:5467:3: (enumLiteral_1= '-' )
                    // InternalDem.g:5468:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5475:3: (enumLiteral_2= '!' )
                    {
                    // InternalDem.g:5475:3: (enumLiteral_2= '!' )
                    // InternalDem.g:5476:4: enumLiteral_2= '!'
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
                    // InternalDem.g:5483:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDem.g:5483:3: (enumLiteral_3= 'NOT' )
                    // InternalDem.g:5484:4: enumLiteral_3= 'NOT'
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
                    // InternalDem.g:5491:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDem.g:5491:3: (enumLiteral_4= 'not' )
                    // InternalDem.g:5492:4: enumLiteral_4= 'not'
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
    // InternalDem.g:5502:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDem.g:5508:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalDem.g:5509:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalDem.g:5509:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt96=1;
                }
                break;
            case 75:
                {
                alt96=2;
                }
                break;
            case 48:
                {
                alt96=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalDem.g:5510:3: (enumLiteral_0= '?' )
                    {
                    // InternalDem.g:5510:3: (enumLiteral_0= '?' )
                    // InternalDem.g:5511:4: enumLiteral_0= '?'
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
                    // InternalDem.g:5518:3: (enumLiteral_1= '+' )
                    {
                    // InternalDem.g:5518:3: (enumLiteral_1= '+' )
                    // InternalDem.g:5519:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5526:3: (enumLiteral_2= '*' )
                    {
                    // InternalDem.g:5526:3: (enumLiteral_2= '*' )
                    // InternalDem.g:5527:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
        // InternalDem.g:2270:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalDem.g:2270:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalDem.g:2270:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalDem.g:2271:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalDem.g:2271:7: ()
        // InternalDem.g:2272:7: 
        {
        }

        match(input,49,FOLLOW_4); if (state.failed) return ;
        // InternalDem.g:2274:7: ( ( RULE_ID ) )
        // InternalDem.g:2275:8: ( RULE_ID )
        {
        // InternalDem.g:2275:8: ( RULE_ID )
        // InternalDem.g:2276:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_48); if (state.failed) return ;

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
        // InternalDem.g:2339:6: ( ( () '.' ) )
        // InternalDem.g:2339:7: ( () '.' )
        {
        // InternalDem.g:2339:7: ( () '.' )
        // InternalDem.g:2340:7: () '.'
        {
        // InternalDem.g:2340:7: ()
        // InternalDem.g:2341:7: 
        {
        }

        match(input,49,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDem

    // $ANTLR start synpred3_InternalDem
    public final void synpred3_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2375:8: ( ( '(' ) )
        // InternalDem.g:2375:9: ( '(' )
        {
        // InternalDem.g:2375:9: ( '(' )
        // InternalDem.g:2376:9: '('
        {
        match(input,42,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDem

    // $ANTLR start synpred4_InternalDem
    public final void synpred4_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2736:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalDem.g:2736:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalDem.g:2736:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalDem.g:2737:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalDem.g:2737:6: ()
        // InternalDem.g:2738:6: 
        {
        }

        // InternalDem.g:2739:6: ( ( ruleDmxOpOr ) )
        // InternalDem.g:2740:7: ( ruleDmxOpOr )
        {
        // InternalDem.g:2740:7: ( ruleDmxOpOr )
        // InternalDem.g:2741:8: ruleDmxOpOr
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
        // InternalDem.g:2824:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalDem.g:2824:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalDem.g:2824:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalDem.g:2825:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalDem.g:2825:6: ()
        // InternalDem.g:2826:6: 
        {
        }

        // InternalDem.g:2827:6: ( ( ruleDmxOpAnd ) )
        // InternalDem.g:2828:7: ( ruleDmxOpAnd )
        {
        // InternalDem.g:2828:7: ( ruleDmxOpAnd )
        // InternalDem.g:2829:8: ruleDmxOpAnd
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
        // InternalDem.g:2912:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalDem.g:2912:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalDem.g:2912:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalDem.g:2913:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalDem.g:2913:6: ()
        // InternalDem.g:2914:6: 
        {
        }

        // InternalDem.g:2915:6: ( ( ruleDmxOpEquality ) )
        // InternalDem.g:2916:7: ( ruleDmxOpEquality )
        {
        // InternalDem.g:2916:7: ( ruleDmxOpEquality )
        // InternalDem.g:2917:8: ruleDmxOpEquality
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
        // InternalDem.g:3001:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalDem.g:3001:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalDem.g:3001:7: ( () ruleDmxOpInstanceOf )
        // InternalDem.g:3002:7: () ruleDmxOpInstanceOf
        {
        // InternalDem.g:3002:7: ()
        // InternalDem.g:3003:7: 
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
        // InternalDem.g:3041:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDem.g:3041:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDem.g:3041:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDem.g:3042:7: () ( ( ruleOpCompare ) )
        {
        // InternalDem.g:3042:7: ()
        // InternalDem.g:3043:7: 
        {
        }

        // InternalDem.g:3044:7: ( ( ruleOpCompare ) )
        // InternalDem.g:3045:8: ( ruleOpCompare )
        {
        // InternalDem.g:3045:8: ( ruleOpCompare )
        // InternalDem.g:3046:9: ruleOpCompare
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
        // InternalDem.g:3160:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDem.g:3160:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDem.g:3160:6: ( () ( ( ruleOpOther ) ) )
        // InternalDem.g:3161:6: () ( ( ruleOpOther ) )
        {
        // InternalDem.g:3161:6: ()
        // InternalDem.g:3162:6: 
        {
        }

        // InternalDem.g:3163:6: ( ( ruleOpOther ) )
        // InternalDem.g:3164:7: ( ruleOpOther )
        {
        // InternalDem.g:3164:7: ( ruleOpOther )
        // InternalDem.g:3165:8: ruleOpOther
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
        // InternalDem.g:3248:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDem.g:3248:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDem.g:3248:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDem.g:3249:6: () ( ( ruleOpAdd ) )
        {
        // InternalDem.g:3249:6: ()
        // InternalDem.g:3250:6: 
        {
        }

        // InternalDem.g:3251:6: ( ( ruleOpAdd ) )
        // InternalDem.g:3252:7: ( ruleOpAdd )
        {
        // InternalDem.g:3252:7: ( ruleOpAdd )
        // InternalDem.g:3253:8: ruleOpAdd
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
        // InternalDem.g:3336:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDem.g:3336:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDem.g:3336:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDem.g:3337:6: () ( ( ruleOpMulti ) )
        {
        // InternalDem.g:3337:6: ()
        // InternalDem.g:3338:6: 
        {
        }

        // InternalDem.g:3339:6: ( ( ruleOpMulti ) )
        // InternalDem.g:3340:7: ( ruleOpMulti )
        {
        // InternalDem.g:3340:7: ( ruleOpMulti )
        // InternalDem.g:3341:8: ruleOpMulti
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
        // InternalDem.g:3499:5: ( ( () ruleDmxOpCast ) )
        // InternalDem.g:3499:6: ( () ruleDmxOpCast )
        {
        // InternalDem.g:3499:6: ( () ruleDmxOpCast )
        // InternalDem.g:3500:6: () ruleDmxOpCast
        {
        // InternalDem.g:3500:6: ()
        // InternalDem.g:3501:6: 
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
        // InternalDem.g:4347:4: ( ']' )
        // InternalDem.g:4347:5: ']'
        {
        match(input,60,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalDem

    // $ANTLR start synpred14_InternalDem
    public final void synpred14_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:4503:5: ( 'else' )
        // InternalDem.g:4503:6: 'else'
        {
        match(input,64,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalDem

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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\4\uffff\1\11\6\uffff\1\11";
    static final String dfa_3s = "\1\21\2\4\1\21\1\22\1\4\1\21\1\4\2\uffff\1\21\1\22";
    static final String dfa_4s = "\1\45\2\4\1\115\1\61\1\4\1\45\1\4\2\uffff\1\115\1\61";
    static final String dfa_5s = "\10\uffff\1\1\1\2\2\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\23\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\2\23\uffff\1\1\13\uffff\1\5\33\uffff\1\6",
            "\1\10\16\uffff\1\11\2\uffff\1\11\14\uffff\1\7",
            "\1\12",
            "\1\2\23\uffff\1\1",
            "\1\13",
            "",
            "",
            "\1\2\23\uffff\1\1\13\uffff\1\5\33\uffff\1\6",
            "\1\10\16\uffff\1\11\2\uffff\1\11\14\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "79:2: (this_DDomainEvent_0= ruleDDomainEvent | this_DemActorModel_1= ruleDemActorModel )";
        }
    }
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\154\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\2\1\3\1\6\1\0\1\4\1\5\1\7\1\1\2\uffff}>";
    static final String[] dfa_13s = {
            "\5\1\21\uffff\4\1\5\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\1\1\2\uffff\1\1\5\uffff\4\1\10\uffff\2\1\14\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 2998:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_9 = input.LA(1);

                         
                        int index56_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDem()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDem()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\3\uffff\1\7\6\uffff";
    static final String dfa_16s = "\1\11\2\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String dfa_17s = "\1\110\2\uffff\1\154\4\uffff\1\11\1\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\3\1\uffff\1\4";
    static final String dfa_19s = "\12\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\1\2\54\uffff\1\5\1\6\12\uffff\4\1\2\4",
            "",
            "",
            "\5\7\13\uffff\1\7\5\uffff\4\7\5\uffff\1\7\3\uffff\1\7\1\uffff\1\7\1\uffff\1\7\4\uffff\1\7\1\10\2\uffff\3\7\2\uffff\1\7\5\uffff\4\7\10\uffff\2\7\14\uffff\24\7",
            "",
            "",
            "",
            "",
            "\1\7\4\uffff\1\11",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3665:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000F400010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4580040000100670L,0x0000E000000019F8L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001040000000002L,0x0001000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001040000000062L,0x0001000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080062L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001050000000002L,0x0001000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0180000000100600L,0x00000000000001F8L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FFC000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000010L,0x0000000001FFC000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4580040000100610L,0x0000E000000019F8L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0006040000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x45800C0000100610L,0x0000E000000019F8L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x000000001E000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0030000000000002L,0x0000007E00000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000020000000002L,0x0000038000000004L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000000000002L,0x00001C0000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0040000800000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4580040008100670L,0x0000E000000019F8L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0180000008000600L,0x00000000000001F8L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0180000000000600L,0x00000000000001F8L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x45800C0000100670L,0x0000E000000019F8L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1808000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x1008000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0001000000000200L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000200L,0x0000000000001800L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});

}