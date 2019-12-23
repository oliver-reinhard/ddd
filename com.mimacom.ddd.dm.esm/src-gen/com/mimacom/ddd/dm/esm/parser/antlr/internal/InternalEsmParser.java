package com.mimacom.ddd.dm.esm.parser.antlr.internal;

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
import com.mimacom.ddd.dm.esm.services.EsmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEsmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'alias'", "'state'", "'model'", "'for'", "'{'", "'direction'", "'}'", "'derived'", "'when'", "'composite'", "'concurrent'", "'substate'", "'transition'", "'from'", "'to'", "'as'", "'import'", "'test'", "'context'", "','", "':'", "':='", "'in'", "'('", "')'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'entity'", "'detail'", "'='", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'initial'", "'final'", "'down'", "'left'", "'up'", "'right'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int RULE_PLAIN_TEXT=12;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
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


        public InternalEsmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEsm.g"; }



     	private EsmGrammarAccess grammarAccess;

        public InternalEsmParser(TokenStream input, EsmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EsmDomain";
       	}

       	@Override
       	protected EsmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEsmDomain"
    // InternalEsm.g:65:1: entryRuleEsmDomain returns [EObject current=null] : iv_ruleEsmDomain= ruleEsmDomain EOF ;
    public final EObject entryRuleEsmDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmDomain = null;


        try {
            // InternalEsm.g:65:50: (iv_ruleEsmDomain= ruleEsmDomain EOF )
            // InternalEsm.g:66:2: iv_ruleEsmDomain= ruleEsmDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmDomain=ruleEsmDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmDomain; 
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
    // $ANTLR end "entryRuleEsmDomain"


    // $ANTLR start "ruleEsmDomain"
    // InternalEsm.g:72:1: ruleEsmDomain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( (lv_stateModel_6_0= ruleEsmEntityStateModel ) ) ) ;
    public final EObject ruleEsmDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_5_0 = null;

        EObject lv_stateModel_6_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:78:2: ( ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( (lv_stateModel_6_0= ruleEsmEntityStateModel ) ) ) )
            // InternalEsm.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( (lv_stateModel_6_0= ruleEsmEntityStateModel ) ) )
            {
            // InternalEsm.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( (lv_stateModel_6_0= ruleEsmEntityStateModel ) ) )
            // InternalEsm.g:80:3: ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( (lv_stateModel_6_0= ruleEsmEntityStateModel ) )
            {
            // InternalEsm.g:80:3: ( (lv_imports_0_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEsm.g:81:4: (lv_imports_0_0= ruleDImport )
            	    {
            	    // InternalEsm.g:81:4: (lv_imports_0_0= ruleDImport )
            	    // InternalEsm.g:82:5: lv_imports_0_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEsmDomainAccess().getImportsDImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEsmDomainRule());
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

              			newLeafNode(otherlv_1, grammarAccess.getEsmDomainAccess().getDomainKeyword_1());
              		
            }
            // InternalEsm.g:103:3: ( (lv_name_2_0= ruleDQualifiedName ) )
            // InternalEsm.g:104:4: (lv_name_2_0= ruleDQualifiedName )
            {
            // InternalEsm.g:104:4: (lv_name_2_0= ruleDQualifiedName )
            // InternalEsm.g:105:5: lv_name_2_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEsmDomainAccess().getNameDQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEsmDomainRule());
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

            // InternalEsm.g:122:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEsm.g:123:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getEsmDomainAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalEsm.g:127:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalEsm.g:128:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalEsm.g:128:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalEsm.g:129:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getEsmDomainAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getEsmDomainRule());
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

            // InternalEsm.g:146:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_PLAIN_TEXT_ONLY && LA3_0<=RULE_RICH_TEXT_START)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEsm.g:147:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalEsm.g:147:4: (lv_description_5_0= ruleDRichText )
                    // InternalEsm.g:148:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmDomainAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmDomainRule());
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

            // InternalEsm.g:165:3: ( (lv_stateModel_6_0= ruleEsmEntityStateModel ) )
            // InternalEsm.g:166:4: (lv_stateModel_6_0= ruleEsmEntityStateModel )
            {
            // InternalEsm.g:166:4: (lv_stateModel_6_0= ruleEsmEntityStateModel )
            // InternalEsm.g:167:5: lv_stateModel_6_0= ruleEsmEntityStateModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEsmDomainAccess().getStateModelEsmEntityStateModelParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_stateModel_6_0=ruleEsmEntityStateModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEsmDomainRule());
              					}
              					set(
              						current,
              						"stateModel",
              						lv_stateModel_6_0,
              						"com.mimacom.ddd.dm.esm.Esm.EsmEntityStateModel");
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
    // $ANTLR end "ruleEsmDomain"


    // $ANTLR start "entryRuleEsmEntityStateModel"
    // InternalEsm.g:188:1: entryRuleEsmEntityStateModel returns [EObject current=null] : iv_ruleEsmEntityStateModel= ruleEsmEntityStateModel EOF ;
    public final EObject entryRuleEsmEntityStateModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmEntityStateModel = null;


        try {
            // InternalEsm.g:188:60: (iv_ruleEsmEntityStateModel= ruleEsmEntityStateModel EOF )
            // InternalEsm.g:189:2: iv_ruleEsmEntityStateModel= ruleEsmEntityStateModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmEntityStateModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmEntityStateModel=ruleEsmEntityStateModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmEntityStateModel; 
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
    // $ANTLR end "entryRuleEsmEntityStateModel"


    // $ANTLR start "ruleEsmEntityStateModel"
    // InternalEsm.g:195:1: ruleEsmEntityStateModel returns [EObject current=null] : (otherlv_0= 'state' otherlv_1= 'model' ( (lv_name_2_0= ruleDQualifiedName ) ) otherlv_3= 'for' ( ( ruleDQualifiedName ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' (otherlv_7= 'direction' ( (lv_direction_8_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_9_0= ruleEsmState ) )+ ( (lv_transitions_10_0= ruleEsmTransition ) )+ otherlv_11= '}' ) ;
    public final EObject ruleEsmEntityStateModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_5_0 = null;

        Enumerator lv_direction_8_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_transitions_10_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:201:2: ( (otherlv_0= 'state' otherlv_1= 'model' ( (lv_name_2_0= ruleDQualifiedName ) ) otherlv_3= 'for' ( ( ruleDQualifiedName ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' (otherlv_7= 'direction' ( (lv_direction_8_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_9_0= ruleEsmState ) )+ ( (lv_transitions_10_0= ruleEsmTransition ) )+ otherlv_11= '}' ) )
            // InternalEsm.g:202:2: (otherlv_0= 'state' otherlv_1= 'model' ( (lv_name_2_0= ruleDQualifiedName ) ) otherlv_3= 'for' ( ( ruleDQualifiedName ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' (otherlv_7= 'direction' ( (lv_direction_8_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_9_0= ruleEsmState ) )+ ( (lv_transitions_10_0= ruleEsmTransition ) )+ otherlv_11= '}' )
            {
            // InternalEsm.g:202:2: (otherlv_0= 'state' otherlv_1= 'model' ( (lv_name_2_0= ruleDQualifiedName ) ) otherlv_3= 'for' ( ( ruleDQualifiedName ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' (otherlv_7= 'direction' ( (lv_direction_8_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_9_0= ruleEsmState ) )+ ( (lv_transitions_10_0= ruleEsmTransition ) )+ otherlv_11= '}' )
            // InternalEsm.g:203:3: otherlv_0= 'state' otherlv_1= 'model' ( (lv_name_2_0= ruleDQualifiedName ) ) otherlv_3= 'for' ( ( ruleDQualifiedName ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' (otherlv_7= 'direction' ( (lv_direction_8_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_9_0= ruleEsmState ) )+ ( (lv_transitions_10_0= ruleEsmTransition ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEsmEntityStateModelAccess().getStateKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEsmEntityStateModelAccess().getModelKeyword_1());
              		
            }
            // InternalEsm.g:211:3: ( (lv_name_2_0= ruleDQualifiedName ) )
            // InternalEsm.g:212:4: (lv_name_2_0= ruleDQualifiedName )
            {
            // InternalEsm.g:212:4: (lv_name_2_0= ruleDQualifiedName )
            // InternalEsm.g:213:5: lv_name_2_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEsmEntityStateModelAccess().getNameDQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEsmEntityStateModelRule());
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

            otherlv_3=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEsmEntityStateModelAccess().getForKeyword_3());
              		
            }
            // InternalEsm.g:234:3: ( ( ruleDQualifiedName ) )
            // InternalEsm.g:235:4: ( ruleDQualifiedName )
            {
            // InternalEsm.g:235:4: ( ruleDQualifiedName )
            // InternalEsm.g:236:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEsmEntityStateModelRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEsmEntityStateModelAccess().getForTypeDEntityTypeCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsm.g:250:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_PLAIN_TEXT_ONLY && LA4_0<=RULE_RICH_TEXT_START)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEsm.g:251:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalEsm.g:251:4: (lv_description_5_0= ruleDRichText )
                    // InternalEsm.g:252:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmEntityStateModelAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmEntityStateModelRule());
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

            otherlv_6=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEsmEntityStateModelAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalEsm.g:273:3: (otherlv_7= 'direction' ( (lv_direction_8_0= ruleEsmLayoutDirection ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEsm.g:274:4: otherlv_7= 'direction' ( (lv_direction_8_0= ruleEsmLayoutDirection ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getEsmEntityStateModelAccess().getDirectionKeyword_7_0());
                      			
                    }
                    // InternalEsm.g:278:4: ( (lv_direction_8_0= ruleEsmLayoutDirection ) )
                    // InternalEsm.g:279:5: (lv_direction_8_0= ruleEsmLayoutDirection )
                    {
                    // InternalEsm.g:279:5: (lv_direction_8_0= ruleEsmLayoutDirection )
                    // InternalEsm.g:280:6: lv_direction_8_0= ruleEsmLayoutDirection
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEsmEntityStateModelAccess().getDirectionEsmLayoutDirectionEnumRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_direction_8_0=ruleEsmLayoutDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEsmEntityStateModelRule());
                      						}
                      						set(
                      							current,
                      							"direction",
                      							lv_direction_8_0,
                      							"com.mimacom.ddd.dm.esm.Esm.EsmLayoutDirection");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEsm.g:298:3: ( (lv_states_9_0= ruleEsmState ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==25||(LA6_0>=27 && LA6_0<=28)||(LA6_0>=74 && LA6_0<=75)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEsm.g:299:4: (lv_states_9_0= ruleEsmState )
            	    {
            	    // InternalEsm.g:299:4: (lv_states_9_0= ruleEsmState )
            	    // InternalEsm.g:300:5: lv_states_9_0= ruleEsmState
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEsmEntityStateModelAccess().getStatesEsmStateParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_states_9_0=ruleEsmState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEsmEntityStateModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"states",
            	      						lv_states_9_0,
            	      						"com.mimacom.ddd.dm.esm.Esm.EsmState");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalEsm.g:317:3: ( (lv_transitions_10_0= ruleEsmTransition ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEsm.g:318:4: (lv_transitions_10_0= ruleEsmTransition )
            	    {
            	    // InternalEsm.g:318:4: (lv_transitions_10_0= ruleEsmTransition )
            	    // InternalEsm.g:319:5: lv_transitions_10_0= ruleEsmTransition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEsmEntityStateModelAccess().getTransitionsEsmTransitionParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_transitions_10_0=ruleEsmTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEsmEntityStateModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"transitions",
            	      						lv_transitions_10_0,
            	      						"com.mimacom.ddd.dm.esm.Esm.EsmTransition");
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

            otherlv_11=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getEsmEntityStateModelAccess().getRightCurlyBracketKeyword_10());
              		
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
    // $ANTLR end "ruleEsmEntityStateModel"


    // $ANTLR start "entryRuleDExpression"
    // InternalEsm.g:344:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalEsm.g:344:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalEsm.g:345:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalEsm.g:351:1: ruleDExpression returns [EObject current=null] : (this_DmxOrExpression_0= ruleDmxOrExpression | this_DRichText_1= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxOrExpression_0 = null;

        EObject this_DRichText_1 = null;



        	enterRule();

        try {
            // InternalEsm.g:357:2: ( (this_DmxOrExpression_0= ruleDmxOrExpression | this_DRichText_1= ruleDRichText ) )
            // InternalEsm.g:358:2: (this_DmxOrExpression_0= ruleDmxOrExpression | this_DRichText_1= ruleDRichText )
            {
            // InternalEsm.g:358:2: (this_DmxOrExpression_0= ruleDmxOrExpression | this_DRichText_1= ruleDRichText )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=RULE_NATURAL && LA8_0<=RULE_STRING)||LA8_0==41||(LA8_0>=54 && LA8_0<=55)||LA8_0==58||(LA8_0>=63 && LA8_0<=68)||(LA8_0>=71 && LA8_0<=72)||(LA8_0>=111 && LA8_0<=113)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_PLAIN_TEXT_ONLY && LA8_0<=RULE_RICH_TEXT_START)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEsm.g:359:3: this_DmxOrExpression_0= ruleDmxOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDmxOrExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxOrExpression_0=ruleDmxOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxOrExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:368:3: this_DRichText_1= ruleDRichText
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


    // $ANTLR start "entryRuleEsmState"
    // InternalEsm.g:380:1: entryRuleEsmState returns [EObject current=null] : iv_ruleEsmState= ruleEsmState EOF ;
    public final EObject entryRuleEsmState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmState = null;


        try {
            // InternalEsm.g:380:49: (iv_ruleEsmState= ruleEsmState EOF )
            // InternalEsm.g:381:2: iv_ruleEsmState= ruleEsmState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmState=ruleEsmState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmState; 
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
    // $ANTLR end "entryRuleEsmState"


    // $ANTLR start "ruleEsmState"
    // InternalEsm.g:387:1: ruleEsmState returns [EObject current=null] : (this_EsmNormalState_0= ruleEsmNormalState | this_EsmDerivedState_1= ruleEsmDerivedState | this_EsmCompositeState_2= ruleEsmCompositeState | this_EsmConcurrentState_3= ruleEsmConcurrentState ) ;
    public final EObject ruleEsmState() throws RecognitionException {
        EObject current = null;

        EObject this_EsmNormalState_0 = null;

        EObject this_EsmDerivedState_1 = null;

        EObject this_EsmCompositeState_2 = null;

        EObject this_EsmConcurrentState_3 = null;



        	enterRule();

        try {
            // InternalEsm.g:393:2: ( (this_EsmNormalState_0= ruleEsmNormalState | this_EsmDerivedState_1= ruleEsmDerivedState | this_EsmCompositeState_2= ruleEsmCompositeState | this_EsmConcurrentState_3= ruleEsmConcurrentState ) )
            // InternalEsm.g:394:2: (this_EsmNormalState_0= ruleEsmNormalState | this_EsmDerivedState_1= ruleEsmDerivedState | this_EsmCompositeState_2= ruleEsmCompositeState | this_EsmConcurrentState_3= ruleEsmConcurrentState )
            {
            // InternalEsm.g:394:2: (this_EsmNormalState_0= ruleEsmNormalState | this_EsmDerivedState_1= ruleEsmDerivedState | this_EsmCompositeState_2= ruleEsmCompositeState | this_EsmConcurrentState_3= ruleEsmConcurrentState )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 19:
            case 74:
            case 75:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEsm.g:395:3: this_EsmNormalState_0= ruleEsmNormalState
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEsmStateAccess().getEsmNormalStateParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EsmNormalState_0=ruleEsmNormalState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EsmNormalState_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:404:3: this_EsmDerivedState_1= ruleEsmDerivedState
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEsmStateAccess().getEsmDerivedStateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EsmDerivedState_1=ruleEsmDerivedState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EsmDerivedState_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEsm.g:413:3: this_EsmCompositeState_2= ruleEsmCompositeState
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEsmStateAccess().getEsmCompositeStateParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EsmCompositeState_2=ruleEsmCompositeState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EsmCompositeState_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEsm.g:422:3: this_EsmConcurrentState_3= ruleEsmConcurrentState
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEsmStateAccess().getEsmConcurrentStateParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EsmConcurrentState_3=ruleEsmConcurrentState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EsmConcurrentState_3;
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
    // $ANTLR end "ruleEsmState"


    // $ANTLR start "entryRuleEsmNormalState"
    // InternalEsm.g:434:1: entryRuleEsmNormalState returns [EObject current=null] : iv_ruleEsmNormalState= ruleEsmNormalState EOF ;
    public final EObject entryRuleEsmNormalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmNormalState = null;


        try {
            // InternalEsm.g:434:55: (iv_ruleEsmNormalState= ruleEsmNormalState EOF )
            // InternalEsm.g:435:2: iv_ruleEsmNormalState= ruleEsmNormalState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmNormalStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmNormalState=ruleEsmNormalState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmNormalState; 
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
    // $ANTLR end "entryRuleEsmNormalState"


    // $ANTLR start "ruleEsmNormalState"
    // InternalEsm.g:441:1: ruleEsmNormalState returns [EObject current=null] : ( ( ( ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )? ) | otherlv_2= 'state' ) ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleEsmNormalState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:447:2: ( ( ( ( ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )? ) | otherlv_2= 'state' ) ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalEsm.g:448:2: ( ( ( ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )? ) | otherlv_2= 'state' ) ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalEsm.g:448:2: ( ( ( ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )? ) | otherlv_2= 'state' ) ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalEsm.g:449:3: ( ( ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )? ) | otherlv_2= 'state' ) ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalEsm.g:449:3: ( ( ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )? ) | otherlv_2= 'state' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=74 && LA11_0<=75)) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
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
                    // InternalEsm.g:450:4: ( ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )? )
                    {
                    // InternalEsm.g:450:4: ( ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )? )
                    // InternalEsm.g:451:5: ( (lv_kind_0_0= ruleEsmStateKind ) ) (otherlv_1= 'state' )?
                    {
                    // InternalEsm.g:451:5: ( (lv_kind_0_0= ruleEsmStateKind ) )
                    // InternalEsm.g:452:6: (lv_kind_0_0= ruleEsmStateKind )
                    {
                    // InternalEsm.g:452:6: (lv_kind_0_0= ruleEsmStateKind )
                    // InternalEsm.g:453:7: lv_kind_0_0= ruleEsmStateKind
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getEsmNormalStateAccess().getKindEsmStateKindEnumRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_14);
                    lv_kind_0_0=ruleEsmStateKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getEsmNormalStateRule());
                      							}
                      							set(
                      								current,
                      								"kind",
                      								lv_kind_0_0,
                      								"com.mimacom.ddd.dm.esm.Esm.EsmStateKind");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalEsm.g:470:5: (otherlv_1= 'state' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==19) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalEsm.g:471:6: otherlv_1= 'state'
                            {
                            otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getEsmNormalStateAccess().getStateKeyword_0_0_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:478:4: otherlv_2= 'state'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEsmNormalStateAccess().getStateKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEsm.g:483:3: ( (otherlv_3= RULE_ID ) )
            // InternalEsm.g:484:4: (otherlv_3= RULE_ID )
            {
            // InternalEsm.g:484:4: (otherlv_3= RULE_ID )
            // InternalEsm.g:485:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEsmNormalStateRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getEsmNormalStateAccess().getStateDStateCrossReference_1_0());
              				
            }

            }


            }

            // InternalEsm.g:496:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_PLAIN_TEXT_ONLY && LA12_0<=RULE_RICH_TEXT_START)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEsm.g:497:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalEsm.g:497:4: (lv_description_4_0= ruleDRichText )
                    // InternalEsm.g:498:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmNormalStateAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmNormalStateRule());
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
    // $ANTLR end "ruleEsmNormalState"


    // $ANTLR start "entryRuleEsmDerivedState"
    // InternalEsm.g:519:1: entryRuleEsmDerivedState returns [EObject current=null] : iv_ruleEsmDerivedState= ruleEsmDerivedState EOF ;
    public final EObject entryRuleEsmDerivedState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmDerivedState = null;


        try {
            // InternalEsm.g:519:56: (iv_ruleEsmDerivedState= ruleEsmDerivedState EOF )
            // InternalEsm.g:520:2: iv_ruleEsmDerivedState= ruleEsmDerivedState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmDerivedStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmDerivedState=ruleEsmDerivedState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmDerivedState; 
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
    // $ANTLR end "entryRuleEsmDerivedState"


    // $ANTLR start "ruleEsmDerivedState"
    // InternalEsm.g:526:1: ruleEsmDerivedState returns [EObject current=null] : (otherlv_0= 'derived' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= 'when' ( (lv_expression_6_0= ruleDExpression ) ) ) ;
    public final EObject ruleEsmDerivedState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:532:2: ( (otherlv_0= 'derived' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= 'when' ( (lv_expression_6_0= ruleDExpression ) ) ) )
            // InternalEsm.g:533:2: (otherlv_0= 'derived' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= 'when' ( (lv_expression_6_0= ruleDExpression ) ) )
            {
            // InternalEsm.g:533:2: (otherlv_0= 'derived' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= 'when' ( (lv_expression_6_0= ruleDExpression ) ) )
            // InternalEsm.g:534:3: otherlv_0= 'derived' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= 'when' ( (lv_expression_6_0= ruleDExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEsmDerivedStateAccess().getDerivedKeyword_0());
              		
            }
            // InternalEsm.g:538:3: ( (lv_kind_1_0= ruleEsmStateKind ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=74 && LA13_0<=75)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEsm.g:539:4: (lv_kind_1_0= ruleEsmStateKind )
                    {
                    // InternalEsm.g:539:4: (lv_kind_1_0= ruleEsmStateKind )
                    // InternalEsm.g:540:5: lv_kind_1_0= ruleEsmStateKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmDerivedStateAccess().getKindEsmStateKindEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_kind_1_0=ruleEsmStateKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmDerivedStateRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_1_0,
                      						"com.mimacom.ddd.dm.esm.Esm.EsmStateKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEsm.g:557:3: (otherlv_2= 'state' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEsm.g:558:4: otherlv_2= 'state'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEsmDerivedStateAccess().getStateKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalEsm.g:563:3: ( (otherlv_3= RULE_ID ) )
            // InternalEsm.g:564:4: (otherlv_3= RULE_ID )
            {
            // InternalEsm.g:564:4: (otherlv_3= RULE_ID )
            // InternalEsm.g:565:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEsmDerivedStateRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getEsmDerivedStateAccess().getStateDStateCrossReference_3_0());
              				
            }

            }


            }

            // InternalEsm.g:576:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_PLAIN_TEXT_ONLY && LA15_0<=RULE_RICH_TEXT_START)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEsm.g:577:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalEsm.g:577:4: (lv_description_4_0= ruleDRichText )
                    // InternalEsm.g:578:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmDerivedStateAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmDerivedStateRule());
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

            otherlv_5=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEsmDerivedStateAccess().getWhenKeyword_5());
              		
            }
            // InternalEsm.g:599:3: ( (lv_expression_6_0= ruleDExpression ) )
            // InternalEsm.g:600:4: (lv_expression_6_0= ruleDExpression )
            {
            // InternalEsm.g:600:4: (lv_expression_6_0= ruleDExpression )
            // InternalEsm.g:601:5: lv_expression_6_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEsmDerivedStateAccess().getExpressionDExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_6_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEsmDerivedStateRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_6_0,
              						"com.mimacom.ddd.dm.esm.Esm.DExpression");
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
    // $ANTLR end "ruleEsmDerivedState"


    // $ANTLR start "entryRuleEsmCompositeState"
    // InternalEsm.g:622:1: entryRuleEsmCompositeState returns [EObject current=null] : iv_ruleEsmCompositeState= ruleEsmCompositeState EOF ;
    public final EObject entryRuleEsmCompositeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmCompositeState = null;


        try {
            // InternalEsm.g:622:58: (iv_ruleEsmCompositeState= ruleEsmCompositeState EOF )
            // InternalEsm.g:623:2: iv_ruleEsmCompositeState= ruleEsmCompositeState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmCompositeStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmCompositeState=ruleEsmCompositeState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmCompositeState; 
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
    // $ANTLR end "entryRuleEsmCompositeState"


    // $ANTLR start "ruleEsmCompositeState"
    // InternalEsm.g:629:1: ruleEsmCompositeState returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' (otherlv_6= 'direction' ( (lv_direction_7_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_8_0= ruleEsmState ) )+ ( (lv_transitions_9_0= ruleEsmTransition ) )+ otherlv_10= '}' ) ;
    public final EObject ruleEsmCompositeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_description_4_0 = null;

        Enumerator lv_direction_7_0 = null;

        EObject lv_states_8_0 = null;

        EObject lv_transitions_9_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:635:2: ( (otherlv_0= 'composite' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' (otherlv_6= 'direction' ( (lv_direction_7_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_8_0= ruleEsmState ) )+ ( (lv_transitions_9_0= ruleEsmTransition ) )+ otherlv_10= '}' ) )
            // InternalEsm.g:636:2: (otherlv_0= 'composite' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' (otherlv_6= 'direction' ( (lv_direction_7_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_8_0= ruleEsmState ) )+ ( (lv_transitions_9_0= ruleEsmTransition ) )+ otherlv_10= '}' )
            {
            // InternalEsm.g:636:2: (otherlv_0= 'composite' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' (otherlv_6= 'direction' ( (lv_direction_7_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_8_0= ruleEsmState ) )+ ( (lv_transitions_9_0= ruleEsmTransition ) )+ otherlv_10= '}' )
            // InternalEsm.g:637:3: otherlv_0= 'composite' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' (otherlv_6= 'direction' ( (lv_direction_7_0= ruleEsmLayoutDirection ) ) )? ( (lv_states_8_0= ruleEsmState ) )+ ( (lv_transitions_9_0= ruleEsmTransition ) )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEsmCompositeStateAccess().getCompositeKeyword_0());
              		
            }
            // InternalEsm.g:641:3: ( (lv_kind_1_0= ruleEsmStateKind ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=74 && LA16_0<=75)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEsm.g:642:4: (lv_kind_1_0= ruleEsmStateKind )
                    {
                    // InternalEsm.g:642:4: (lv_kind_1_0= ruleEsmStateKind )
                    // InternalEsm.g:643:5: lv_kind_1_0= ruleEsmStateKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmCompositeStateAccess().getKindEsmStateKindEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_kind_1_0=ruleEsmStateKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmCompositeStateRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_1_0,
                      						"com.mimacom.ddd.dm.esm.Esm.EsmStateKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEsm.g:660:3: (otherlv_2= 'state' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEsm.g:661:4: otherlv_2= 'state'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEsmCompositeStateAccess().getStateKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalEsm.g:666:3: ( (otherlv_3= RULE_ID ) )
            // InternalEsm.g:667:4: (otherlv_3= RULE_ID )
            {
            // InternalEsm.g:667:4: (otherlv_3= RULE_ID )
            // InternalEsm.g:668:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEsmCompositeStateRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getEsmCompositeStateAccess().getStateDStateCrossReference_3_0());
              				
            }

            }


            }

            // InternalEsm.g:679:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_PLAIN_TEXT_ONLY && LA18_0<=RULE_RICH_TEXT_START)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEsm.g:680:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalEsm.g:680:4: (lv_description_4_0= ruleDRichText )
                    // InternalEsm.g:681:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmCompositeStateAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmCompositeStateRule());
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

            otherlv_5=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEsmCompositeStateAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalEsm.g:702:3: (otherlv_6= 'direction' ( (lv_direction_7_0= ruleEsmLayoutDirection ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEsm.g:703:4: otherlv_6= 'direction' ( (lv_direction_7_0= ruleEsmLayoutDirection ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEsmCompositeStateAccess().getDirectionKeyword_6_0());
                      			
                    }
                    // InternalEsm.g:707:4: ( (lv_direction_7_0= ruleEsmLayoutDirection ) )
                    // InternalEsm.g:708:5: (lv_direction_7_0= ruleEsmLayoutDirection )
                    {
                    // InternalEsm.g:708:5: (lv_direction_7_0= ruleEsmLayoutDirection )
                    // InternalEsm.g:709:6: lv_direction_7_0= ruleEsmLayoutDirection
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEsmCompositeStateAccess().getDirectionEsmLayoutDirectionEnumRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_direction_7_0=ruleEsmLayoutDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEsmCompositeStateRule());
                      						}
                      						set(
                      							current,
                      							"direction",
                      							lv_direction_7_0,
                      							"com.mimacom.ddd.dm.esm.Esm.EsmLayoutDirection");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEsm.g:727:3: ( (lv_states_8_0= ruleEsmState ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19||LA20_0==25||(LA20_0>=27 && LA20_0<=28)||(LA20_0>=74 && LA20_0<=75)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEsm.g:728:4: (lv_states_8_0= ruleEsmState )
            	    {
            	    // InternalEsm.g:728:4: (lv_states_8_0= ruleEsmState )
            	    // InternalEsm.g:729:5: lv_states_8_0= ruleEsmState
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEsmCompositeStateAccess().getStatesEsmStateParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_states_8_0=ruleEsmState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEsmCompositeStateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"states",
            	      						lv_states_8_0,
            	      						"com.mimacom.ddd.dm.esm.Esm.EsmState");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // InternalEsm.g:746:3: ( (lv_transitions_9_0= ruleEsmTransition ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEsm.g:747:4: (lv_transitions_9_0= ruleEsmTransition )
            	    {
            	    // InternalEsm.g:747:4: (lv_transitions_9_0= ruleEsmTransition )
            	    // InternalEsm.g:748:5: lv_transitions_9_0= ruleEsmTransition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEsmCompositeStateAccess().getTransitionsEsmTransitionParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_transitions_9_0=ruleEsmTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEsmCompositeStateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"transitions",
            	      						lv_transitions_9_0,
            	      						"com.mimacom.ddd.dm.esm.Esm.EsmTransition");
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

            otherlv_10=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getEsmCompositeStateAccess().getRightCurlyBracketKeyword_9());
              		
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
    // $ANTLR end "ruleEsmCompositeState"


    // $ANTLR start "entryRuleEsmConcurrentState"
    // InternalEsm.g:773:1: entryRuleEsmConcurrentState returns [EObject current=null] : iv_ruleEsmConcurrentState= ruleEsmConcurrentState EOF ;
    public final EObject entryRuleEsmConcurrentState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmConcurrentState = null;


        try {
            // InternalEsm.g:773:59: (iv_ruleEsmConcurrentState= ruleEsmConcurrentState EOF )
            // InternalEsm.g:774:2: iv_ruleEsmConcurrentState= ruleEsmConcurrentState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmConcurrentStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmConcurrentState=ruleEsmConcurrentState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmConcurrentState; 
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
    // $ANTLR end "entryRuleEsmConcurrentState"


    // $ANTLR start "ruleEsmConcurrentState"
    // InternalEsm.g:780:1: ruleEsmConcurrentState returns [EObject current=null] : (otherlv_0= 'concurrent' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_subStates_6_0= ruleEsmSubStateModel ) )+ otherlv_7= '}' ) ;
    public final EObject ruleEsmConcurrentState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_subStates_6_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:786:2: ( (otherlv_0= 'concurrent' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_subStates_6_0= ruleEsmSubStateModel ) )+ otherlv_7= '}' ) )
            // InternalEsm.g:787:2: (otherlv_0= 'concurrent' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_subStates_6_0= ruleEsmSubStateModel ) )+ otherlv_7= '}' )
            {
            // InternalEsm.g:787:2: (otherlv_0= 'concurrent' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_subStates_6_0= ruleEsmSubStateModel ) )+ otherlv_7= '}' )
            // InternalEsm.g:788:3: otherlv_0= 'concurrent' ( (lv_kind_1_0= ruleEsmStateKind ) )? (otherlv_2= 'state' )? ( (otherlv_3= RULE_ID ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_subStates_6_0= ruleEsmSubStateModel ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEsmConcurrentStateAccess().getConcurrentKeyword_0());
              		
            }
            // InternalEsm.g:792:3: ( (lv_kind_1_0= ruleEsmStateKind ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=74 && LA22_0<=75)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEsm.g:793:4: (lv_kind_1_0= ruleEsmStateKind )
                    {
                    // InternalEsm.g:793:4: (lv_kind_1_0= ruleEsmStateKind )
                    // InternalEsm.g:794:5: lv_kind_1_0= ruleEsmStateKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmConcurrentStateAccess().getKindEsmStateKindEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_kind_1_0=ruleEsmStateKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmConcurrentStateRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_1_0,
                      						"com.mimacom.ddd.dm.esm.Esm.EsmStateKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEsm.g:811:3: (otherlv_2= 'state' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEsm.g:812:4: otherlv_2= 'state'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEsmConcurrentStateAccess().getStateKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalEsm.g:817:3: ( (otherlv_3= RULE_ID ) )
            // InternalEsm.g:818:4: (otherlv_3= RULE_ID )
            {
            // InternalEsm.g:818:4: (otherlv_3= RULE_ID )
            // InternalEsm.g:819:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEsmConcurrentStateRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getEsmConcurrentStateAccess().getStateDStateCrossReference_3_0());
              				
            }

            }


            }

            // InternalEsm.g:830:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_PLAIN_TEXT_ONLY && LA24_0<=RULE_RICH_TEXT_START)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEsm.g:831:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalEsm.g:831:4: (lv_description_4_0= ruleDRichText )
                    // InternalEsm.g:832:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmConcurrentStateAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmConcurrentStateRule());
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

            otherlv_5=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEsmConcurrentStateAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalEsm.g:853:3: ( (lv_subStates_6_0= ruleEsmSubStateModel ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEsm.g:854:4: (lv_subStates_6_0= ruleEsmSubStateModel )
            	    {
            	    // InternalEsm.g:854:4: (lv_subStates_6_0= ruleEsmSubStateModel )
            	    // InternalEsm.g:855:5: lv_subStates_6_0= ruleEsmSubStateModel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEsmConcurrentStateAccess().getSubStatesEsmSubStateModelParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_subStates_6_0=ruleEsmSubStateModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEsmConcurrentStateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"subStates",
            	      						lv_subStates_6_0,
            	      						"com.mimacom.ddd.dm.esm.Esm.EsmSubStateModel");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEsmConcurrentStateAccess().getRightCurlyBracketKeyword_7());
              		
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
    // $ANTLR end "ruleEsmConcurrentState"


    // $ANTLR start "entryRuleEsmSubStateModel"
    // InternalEsm.g:880:1: entryRuleEsmSubStateModel returns [EObject current=null] : iv_ruleEsmSubStateModel= ruleEsmSubStateModel EOF ;
    public final EObject entryRuleEsmSubStateModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmSubStateModel = null;


        try {
            // InternalEsm.g:880:57: (iv_ruleEsmSubStateModel= ruleEsmSubStateModel EOF )
            // InternalEsm.g:881:2: iv_ruleEsmSubStateModel= ruleEsmSubStateModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmSubStateModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmSubStateModel=ruleEsmSubStateModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmSubStateModel; 
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
    // $ANTLR end "entryRuleEsmSubStateModel"


    // $ANTLR start "ruleEsmSubStateModel"
    // InternalEsm.g:887:1: ruleEsmSubStateModel returns [EObject current=null] : (otherlv_0= 'substate' otherlv_1= '{' ( (lv_states_2_0= ruleEsmState ) )+ ( (lv_transitions_3_0= ruleEsmTransition ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEsmSubStateModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_states_2_0 = null;

        EObject lv_transitions_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:893:2: ( (otherlv_0= 'substate' otherlv_1= '{' ( (lv_states_2_0= ruleEsmState ) )+ ( (lv_transitions_3_0= ruleEsmTransition ) )+ otherlv_4= '}' ) )
            // InternalEsm.g:894:2: (otherlv_0= 'substate' otherlv_1= '{' ( (lv_states_2_0= ruleEsmState ) )+ ( (lv_transitions_3_0= ruleEsmTransition ) )+ otherlv_4= '}' )
            {
            // InternalEsm.g:894:2: (otherlv_0= 'substate' otherlv_1= '{' ( (lv_states_2_0= ruleEsmState ) )+ ( (lv_transitions_3_0= ruleEsmTransition ) )+ otherlv_4= '}' )
            // InternalEsm.g:895:3: otherlv_0= 'substate' otherlv_1= '{' ( (lv_states_2_0= ruleEsmState ) )+ ( (lv_transitions_3_0= ruleEsmTransition ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEsmSubStateModelAccess().getSubstateKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEsmSubStateModelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalEsm.g:903:3: ( (lv_states_2_0= ruleEsmState ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19||LA26_0==25||(LA26_0>=27 && LA26_0<=28)||(LA26_0>=74 && LA26_0<=75)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEsm.g:904:4: (lv_states_2_0= ruleEsmState )
            	    {
            	    // InternalEsm.g:904:4: (lv_states_2_0= ruleEsmState )
            	    // InternalEsm.g:905:5: lv_states_2_0= ruleEsmState
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEsmSubStateModelAccess().getStatesEsmStateParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_states_2_0=ruleEsmState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEsmSubStateModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"states",
            	      						lv_states_2_0,
            	      						"com.mimacom.ddd.dm.esm.Esm.EsmState");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalEsm.g:922:3: ( (lv_transitions_3_0= ruleEsmTransition ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEsm.g:923:4: (lv_transitions_3_0= ruleEsmTransition )
            	    {
            	    // InternalEsm.g:923:4: (lv_transitions_3_0= ruleEsmTransition )
            	    // InternalEsm.g:924:5: lv_transitions_3_0= ruleEsmTransition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEsmSubStateModelAccess().getTransitionsEsmTransitionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_transitions_3_0=ruleEsmTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEsmSubStateModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"transitions",
            	      						lv_transitions_3_0,
            	      						"com.mimacom.ddd.dm.esm.Esm.EsmTransition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEsmSubStateModelAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleEsmSubStateModel"


    // $ANTLR start "entryRuleEsmTransition"
    // InternalEsm.g:949:1: entryRuleEsmTransition returns [EObject current=null] : iv_ruleEsmTransition= ruleEsmTransition EOF ;
    public final EObject entryRuleEsmTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsmTransition = null;


        try {
            // InternalEsm.g:949:54: (iv_ruleEsmTransition= ruleEsmTransition EOF )
            // InternalEsm.g:950:2: iv_ruleEsmTransition= ruleEsmTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsmTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEsmTransition=ruleEsmTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsmTransition; 
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
    // $ANTLR end "entryRuleEsmTransition"


    // $ANTLR start "ruleEsmTransition"
    // InternalEsm.g:956:1: ruleEsmTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_direction_1_0= ruleEsmLayoutDirection ) )? otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'when' ( (lv_guard_9_0= ruleDExpression ) ) )? ) ;
    public final EObject ruleEsmTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_direction_1_0 = null;

        EObject lv_guard_9_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:962:2: ( (otherlv_0= 'transition' ( (lv_direction_1_0= ruleEsmLayoutDirection ) )? otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'when' ( (lv_guard_9_0= ruleDExpression ) ) )? ) )
            // InternalEsm.g:963:2: (otherlv_0= 'transition' ( (lv_direction_1_0= ruleEsmLayoutDirection ) )? otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'when' ( (lv_guard_9_0= ruleDExpression ) ) )? )
            {
            // InternalEsm.g:963:2: (otherlv_0= 'transition' ( (lv_direction_1_0= ruleEsmLayoutDirection ) )? otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'when' ( (lv_guard_9_0= ruleDExpression ) ) )? )
            // InternalEsm.g:964:3: otherlv_0= 'transition' ( (lv_direction_1_0= ruleEsmLayoutDirection ) )? otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'when' ( (lv_guard_9_0= ruleDExpression ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEsmTransitionAccess().getTransitionKeyword_0());
              		
            }
            // InternalEsm.g:968:3: ( (lv_direction_1_0= ruleEsmLayoutDirection ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=76 && LA28_0<=79)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEsm.g:969:4: (lv_direction_1_0= ruleEsmLayoutDirection )
                    {
                    // InternalEsm.g:969:4: (lv_direction_1_0= ruleEsmLayoutDirection )
                    // InternalEsm.g:970:5: lv_direction_1_0= ruleEsmLayoutDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEsmTransitionAccess().getDirectionEsmLayoutDirectionEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_direction_1_0=ruleEsmLayoutDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEsmTransitionRule());
                      					}
                      					set(
                      						current,
                      						"direction",
                      						lv_direction_1_0,
                      						"com.mimacom.ddd.dm.esm.Esm.EsmLayoutDirection");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEsmTransitionAccess().getFromKeyword_2());
              		
            }
            // InternalEsm.g:991:3: ( (otherlv_3= RULE_ID ) )
            // InternalEsm.g:992:4: (otherlv_3= RULE_ID )
            {
            // InternalEsm.g:992:4: (otherlv_3= RULE_ID )
            // InternalEsm.g:993:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEsmTransitionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getEsmTransitionAccess().getFromDStateCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEsmTransitionAccess().getToKeyword_4());
              		
            }
            // InternalEsm.g:1008:3: ( (otherlv_5= RULE_ID ) )
            // InternalEsm.g:1009:4: (otherlv_5= RULE_ID )
            {
            // InternalEsm.g:1009:4: (otherlv_5= RULE_ID )
            // InternalEsm.g:1010:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEsmTransitionRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getEsmTransitionAccess().getToDStateCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEsmTransitionAccess().getAsKeyword_6());
              		
            }
            // InternalEsm.g:1025:3: ( (otherlv_7= RULE_ID ) )
            // InternalEsm.g:1026:4: (otherlv_7= RULE_ID )
            {
            // InternalEsm.g:1026:4: (otherlv_7= RULE_ID )
            // InternalEsm.g:1027:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEsmTransitionRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getEsmTransitionAccess().getEventDStateEventCrossReference_7_0());
              				
            }

            }


            }

            // InternalEsm.g:1038:3: (otherlv_8= 'when' ( (lv_guard_9_0= ruleDExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEsm.g:1039:4: otherlv_8= 'when' ( (lv_guard_9_0= ruleDExpression ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getEsmTransitionAccess().getWhenKeyword_8_0());
                      			
                    }
                    // InternalEsm.g:1043:4: ( (lv_guard_9_0= ruleDExpression ) )
                    // InternalEsm.g:1044:5: (lv_guard_9_0= ruleDExpression )
                    {
                    // InternalEsm.g:1044:5: (lv_guard_9_0= ruleDExpression )
                    // InternalEsm.g:1045:6: lv_guard_9_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEsmTransitionAccess().getGuardDExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_guard_9_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEsmTransitionRule());
                      						}
                      						set(
                      							current,
                      							"guard",
                      							lv_guard_9_0,
                      							"com.mimacom.ddd.dm.esm.Esm.DExpression");
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
    // $ANTLR end "ruleEsmTransition"


    // $ANTLR start "entryRuleDmxPrimaryExpression"
    // InternalEsm.g:1067:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalEsm.g:1067:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalEsm.g:1068:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalEsm.g:1074:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxFunctionCall_2= ruleDmxFunctionCall | this_DmxContextReference_3= ruleDmxContextReference | this_DmxIfExpression_4= ruleDmxIfExpression ) ;
    public final EObject ruleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxLiteralExpression_0 = null;

        EObject this_DmxParenthesizedExpression_1 = null;

        EObject this_DmxFunctionCall_2 = null;

        EObject this_DmxContextReference_3 = null;

        EObject this_DmxIfExpression_4 = null;



        	enterRule();

        try {
            // InternalEsm.g:1080:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxFunctionCall_2= ruleDmxFunctionCall | this_DmxContextReference_3= ruleDmxContextReference | this_DmxIfExpression_4= ruleDmxIfExpression ) )
            // InternalEsm.g:1081:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxFunctionCall_2= ruleDmxFunctionCall | this_DmxContextReference_3= ruleDmxContextReference | this_DmxIfExpression_4= ruleDmxIfExpression )
            {
            // InternalEsm.g:1081:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxFunctionCall_2= ruleDmxFunctionCall | this_DmxContextReference_3= ruleDmxContextReference | this_DmxIfExpression_4= ruleDmxIfExpression )
            int alt30=5;
            switch ( input.LA(1) ) {
            case RULE_NATURAL:
            case RULE_STRING:
            case 54:
            case 55:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt30=1;
                }
                break;
            case 41:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==41) ) {
                    alt30=3;
                }
                else if ( (LA30_3==EOF||LA30_3==RULE_ID||(LA30_3>=RULE_RICH_TEXT_MIDDLE && LA30_3<=RULE_RICH_TEXT_END)||LA30_3==19||(LA30_3>=24 && LA30_3<=25)||(LA30_3>=27 && LA30_3<=28)||LA30_3==30||LA30_3==33||LA30_3==37||LA30_3==40||LA30_3==42||(LA30_3>=47 && LA30_3<=49)||(LA30_3>=51 && LA30_3<=53)||LA30_3==56||(LA30_3>=59 && LA30_3<=62)||(LA30_3>=71 && LA30_3<=72)||(LA30_3>=74 && LA30_3<=75)||(LA30_3>=91 && LA30_3<=110)) ) {
                    alt30=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                alt30=5;
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
                    // InternalEsm.g:1082:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalEsm.g:1091:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalEsm.g:1100:3: this_DmxFunctionCall_2= ruleDmxFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxFunctionCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxFunctionCall_2=ruleDmxFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxFunctionCall_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEsm.g:1109:3: this_DmxContextReference_3= ruleDmxContextReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxContextReferenceParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxContextReference_3=ruleDmxContextReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxContextReference_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEsm.g:1118:3: this_DmxIfExpression_4= ruleDmxIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxIfExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxIfExpression_4=ruleDmxIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxIfExpression_4;
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


    // $ANTLR start "entryRuleDImport"
    // InternalEsm.g:1130:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalEsm.g:1130:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalEsm.g:1131:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalEsm.g:1137:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:1143:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalEsm.g:1144:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalEsm.g:1144:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalEsm.g:1145:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalEsm.g:1149:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalEsm.g:1150:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalEsm.g:1150:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalEsm.g:1151:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalEsm.g:1172:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalEsm.g:1172:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalEsm.g:1173:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalEsm.g:1179:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalEsm.g:1185:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalEsm.g:1186:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalEsm.g:1186:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalEsm.g:1187:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalEsm.g:1191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsm.g:1192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsm.g:1192:4: (lv_name_1_0= RULE_ID )
            // InternalEsm.g:1193:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
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

            // InternalEsm.g:1209:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEsm.g:1210:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalEsm.g:1214:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalEsm.g:1215:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalEsm.g:1215:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalEsm.g:1216:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
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

                    // InternalEsm.g:1233:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==37) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalEsm.g:1234:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalEsm.g:1238:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalEsm.g:1239:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalEsm.g:1239:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalEsm.g:1240:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalEsm.g:1263:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalEsm.g:1264:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalEsm.g:1264:4: (lv_expr_7_0= ruleDExpression )
            // InternalEsm.g:1265:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_29);
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
              						"com.mimacom.ddd.dm.esm.Esm.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:1290:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalEsm.g:1290:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalEsm.g:1291:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalEsm.g:1297:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalEsm.g:1303:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalEsm.g:1304:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalEsm.g:1304:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalEsm.g:1305:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalEsm.g:1305:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsm.g:1306:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEsm.g:1306:4: (lv_name_0_0= RULE_ID )
            // InternalEsm.g:1307:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalEsm.g:1327:3: ( (otherlv_2= RULE_ID ) )
            // InternalEsm.g:1328:4: (otherlv_2= RULE_ID )
            {
            // InternalEsm.g:1328:4: (otherlv_2= RULE_ID )
            // InternalEsm.g:1329:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalEsm.g:1340:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41||LA33_0==47||LA33_0==71||LA33_0==114) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEsm.g:1341:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalEsm.g:1341:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalEsm.g:1342:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalEsm.g:1359:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEsm.g:1360:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalEsm.g:1364:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_NATURAL && LA34_0<=RULE_STRING)||(LA34_0>=54 && LA34_0<=55)||(LA34_0>=63 && LA34_0<=68)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==22) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalEsm.g:1365:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalEsm.g:1365:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalEsm.g:1366:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalEsm.g:1366:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalEsm.g:1367:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalEsm.g:1385:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalEsm.g:1385:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalEsm.g:1386:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalEsm.g:1386:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalEsm.g:1387:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalEsm.g:1410:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalEsm.g:1410:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalEsm.g:1411:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalEsm.g:1417:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalEsm.g:1423:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalEsm.g:1424:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalEsm.g:1424:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalEsm.g:1425:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalEsm.g:1425:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsm.g:1426:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEsm.g:1426:4: (lv_name_0_0= RULE_ID )
            // InternalEsm.g:1427:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalEsm.g:1451:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalEsm.g:1452:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalEsm.g:1452:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalEsm.g:1453:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            // InternalEsm.g:1470:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==37) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEsm.g:1471:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,37,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalEsm.g:1475:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalEsm.g:1476:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalEsm.g:1476:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalEsm.g:1477:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
    // InternalEsm.g:1503:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalEsm.g:1503:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalEsm.g:1504:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalEsm.g:1510:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:1516:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalEsm.g:1517:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalEsm.g:1517:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalEsm.g:1518:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalEsm.g:1522:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsm.g:1523:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsm.g:1523:4: (lv_name_1_0= RULE_ID )
            // InternalEsm.g:1524:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,44,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalEsm.g:1544:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalEsm.g:1545:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalEsm.g:1545:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalEsm.g:1546:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalEsm.g:1563:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_PLAIN_TEXT_ONLY && LA37_0<=RULE_RICH_TEXT_START)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEsm.g:1564:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalEsm.g:1564:4: (lv_description_4_0= ruleDRichText )
                    // InternalEsm.g:1565:5: lv_description_4_0= ruleDRichText
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
    // InternalEsm.g:1586:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalEsm.g:1586:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalEsm.g:1587:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalEsm.g:1593:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalEsm.g:1599:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalEsm.g:1600:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalEsm.g:1600:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalEsm.g:1601:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalEsm.g:1605:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsm.g:1606:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsm.g:1606:4: (lv_name_1_0= RULE_ID )
            // InternalEsm.g:1607:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,41,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalEsm.g:1627:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalEsm.g:1628:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalEsm.g:1628:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalEsm.g:1629:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalEsm.g:1629:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalEsm.g:1630:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalEsm.g:1647:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==37) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalEsm.g:1648:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalEsm.g:1652:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalEsm.g:1653:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalEsm.g:1653:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalEsm.g:1654:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
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

            otherlv_6=(Token)match(input,42,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,38,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalEsm.g:1681:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalEsm.g:1682:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalEsm.g:1682:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalEsm.g:1683:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            // InternalEsm.g:1700:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEsm.g:1701:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalEsm.g:1705:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalEsm.g:1706:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalEsm.g:1706:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalEsm.g:1707:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalEsm.g:1729:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalEsm.g:1729:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalEsm.g:1730:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalEsm.g:1736:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:1742:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalEsm.g:1743:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalEsm.g:1743:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalEsm.g:1744:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalEsm.g:1744:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=80 && LA41_0<=90)) ) {
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
                    // InternalEsm.g:1745:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalEsm.g:1745:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalEsm.g:1746:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalEsm.g:1746:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalEsm.g:1747:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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
                    // InternalEsm.g:1765:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEsm.g:1765:4: ( (otherlv_1= RULE_ID ) )
                    // InternalEsm.g:1766:5: (otherlv_1= RULE_ID )
                    {
                    // InternalEsm.g:1766:5: (otherlv_1= RULE_ID )
                    // InternalEsm.g:1767:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEsm.g:1779:3: ( (lv_collection_2_0= '*' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEsm.g:1780:4: (lv_collection_2_0= '*' )
                    {
                    // InternalEsm.g:1780:4: (lv_collection_2_0= '*' )
                    // InternalEsm.g:1781:5: lv_collection_2_0= '*'
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
    // InternalEsm.g:1797:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalEsm.g:1797:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalEsm.g:1798:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalEsm.g:1804:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:1810:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalEsm.g:1811:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalEsm.g:1811:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalEsm.g:1812:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalEsm.g:1812:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsm.g:1813:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEsm.g:1813:4: (lv_name_0_0= RULE_ID )
            // InternalEsm.g:1814:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,38,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalEsm.g:1834:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalEsm.g:1835:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalEsm.g:1835:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalEsm.g:1836:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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


    // $ANTLR start "entryRuleDRichText"
    // InternalEsm.g:1857:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalEsm.g:1857:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalEsm.g:1858:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalEsm.g:1864:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalEsm.g:1870:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalEsm.g:1871:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalEsm.g:1871:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_RICH_TEXT_START) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalEsm.g:1872:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalEsm.g:1872:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalEsm.g:1873:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalEsm.g:1873:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalEsm.g:1874:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalEsm.g:1892:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalEsm.g:1892:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalEsm.g:1893:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalEsm.g:1893:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalEsm.g:1894:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalEsm.g:1894:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalEsm.g:1895:6: lv_segments_1_0= ruleDmxTextStart
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

                    // InternalEsm.g:1912:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalEsm.g:1913:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalEsm.g:1913:5: (lv_segments_2_0= ruleDExpression )
                    // InternalEsm.g:1914:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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
                      							"com.mimacom.ddd.dm.esm.Esm.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEsm.g:1931:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalEsm.g:1932:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalEsm.g:1932:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalEsm.g:1933:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalEsm.g:1933:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalEsm.g:1934:7: lv_segments_3_0= ruleDmxTextMiddle
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

                    	    // InternalEsm.g:1951:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalEsm.g:1952:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalEsm.g:1952:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalEsm.g:1953:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	      								"com.mimacom.ddd.dm.esm.Esm.DExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // InternalEsm.g:1971:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalEsm.g:1972:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalEsm.g:1972:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalEsm.g:1973:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalEsm.g:1995:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalEsm.g:1995:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalEsm.g:1996:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalEsm.g:2002:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:2008:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalEsm.g:2009:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalEsm.g:2009:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalEsm.g:2010:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalEsm.g:2010:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalEsm.g:2011:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalEsm.g:2030:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalEsm.g:2030:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalEsm.g:2031:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalEsm.g:2037:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:2043:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalEsm.g:2044:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalEsm.g:2044:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalEsm.g:2045:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalEsm.g:2045:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalEsm.g:2046:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalEsm.g:2065:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalEsm.g:2065:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalEsm.g:2066:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalEsm.g:2072:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:2078:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalEsm.g:2079:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalEsm.g:2079:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalEsm.g:2080:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalEsm.g:2080:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalEsm.g:2081:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalEsm.g:2100:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalEsm.g:2100:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalEsm.g:2101:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalEsm.g:2107:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:2113:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalEsm.g:2114:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalEsm.g:2114:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalEsm.g:2115:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalEsm.g:2115:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalEsm.g:2116:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalEsm.g:2135:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalEsm.g:2135:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalEsm.g:2136:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalEsm.g:2142:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalEsm.g:2148:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalEsm.g:2149:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalEsm.g:2149:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalEsm.g:2150:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2158:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) ) {
                    int LA46_2 = input.LA(2);

                    if ( (synpred1_InternalEsm()) ) {
                        alt46=1;
                    }
                    else if ( (synpred2_InternalEsm()) ) {
                        alt46=2;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalEsm.g:2159:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalEsm.g:2159:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalEsm.g:2160:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalEsm.g:2160:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalEsm.g:2161:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalEsm.g:2173:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalEsm.g:2174:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalEsm.g:2174:7: ()
            	    // InternalEsm.g:2175:8: 
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
            	    // InternalEsm.g:2185:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalEsm.g:2186:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalEsm.g:2186:8: (otherlv_3= RULE_ID )
            	    // InternalEsm.g:2187:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_47);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalEsm.g:2207:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalEsm.g:2208:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalEsm.g:2208:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalEsm.g:2209:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_45);
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
            	    // InternalEsm.g:2228:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalEsm.g:2228:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalEsm.g:2229:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalEsm.g:2229:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalEsm.g:2230:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalEsm.g:2236:6: ( () otherlv_7= '.' )
            	    // InternalEsm.g:2237:7: () otherlv_7= '.'
            	    {
            	    // InternalEsm.g:2237:7: ()
            	    // InternalEsm.g:2238:8: 
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

            	    // InternalEsm.g:2250:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalEsm.g:2251:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalEsm.g:2251:6: (otherlv_8= RULE_ID )
            	    // InternalEsm.g:2252:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalEsm.g:2263:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt45=3;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==41) && (synpred3_InternalEsm())) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==49) ) {
            	        alt45=2;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalEsm.g:2264:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalEsm.g:2264:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalEsm.g:2265:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalEsm.g:2265:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalEsm.g:2266:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalEsm.g:2270:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalEsm.g:2271:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,41,FOLLOW_49); if (state.failed) return current;
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

            	            // InternalEsm.g:2283:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalEsm.g:2284:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalEsm.g:2284:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalEsm.g:2285:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_50);
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

            	            otherlv_11=(Token)match(input,42,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalEsm.g:2308:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalEsm.g:2308:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalEsm.g:2309:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalEsm.g:2309:7: (lv_before_12_0= '@before' )
            	            // InternalEsm.g:2310:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,49,FOLLOW_45); if (state.failed) return current;
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
    // $ANTLR end "ruleDmxNavigableMemberReference"


    // $ANTLR start "entryRuleDmxCallArguments"
    // InternalEsm.g:2329:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalEsm.g:2329:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalEsm.g:2330:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalEsm.g:2336:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2342:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalEsm.g:2343:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalEsm.g:2343:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalEsm.g:2344:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalEsm.g:2344:3: ()
            // InternalEsm.g:2345:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:2351:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||(LA48_0>=RULE_NATURAL && LA48_0<=RULE_STRING)||LA48_0==41||(LA48_0>=54 && LA48_0<=55)||LA48_0==58||(LA48_0>=63 && LA48_0<=68)||(LA48_0>=71 && LA48_0<=72)||(LA48_0>=111 && LA48_0<=113)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEsm.g:2352:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalEsm.g:2352:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalEsm.g:2353:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalEsm.g:2353:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalEsm.g:2354:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
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

                    // InternalEsm.g:2371:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==37) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalEsm.g:2372:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalEsm.g:2376:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalEsm.g:2377:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalEsm.g:2377:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalEsm.g:2378:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_51);
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
                    	    break loop47;
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


    // $ANTLR start "entryRuleDmxOpSingleAssign"
    // InternalEsm.g:2401:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalEsm.g:2401:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalEsm.g:2402:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalEsm.g:2408:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:2414:2: (kw= ':=' )
            // InternalEsm.g:2415:2: kw= ':='
            {
            kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:2423:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalEsm.g:2423:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalEsm.g:2424:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalEsm.g:2430:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalEsm.g:2436:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalEsm.g:2437:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalEsm.g:2437:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==EOF||LA49_1==33||LA49_1==37||(LA49_1>=40 && LA49_1<=42)||(LA49_1>=47 && LA49_1<=49)||(LA49_1>=51 && LA49_1<=53)||LA49_1==56||LA49_1==62||(LA49_1>=71 && LA49_1<=72)||(LA49_1>=91 && LA49_1<=110)) ) {
                    alt49=2;
                }
                else if ( (LA49_1==50) ) {
                    alt49=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA49_0>=RULE_NATURAL && LA49_0<=RULE_STRING)||LA49_0==41||(LA49_0>=54 && LA49_0<=55)||LA49_0==58||(LA49_0>=63 && LA49_0<=68)||(LA49_0>=71 && LA49_0<=72)||(LA49_0>=111 && LA49_0<=113)) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalEsm.g:2438:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalEsm.g:2438:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalEsm.g:2439:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalEsm.g:2439:4: ()
                    // InternalEsm.g:2440:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEsm.g:2446:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalEsm.g:2447:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalEsm.g:2447:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalEsm.g:2448:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
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

                    otherlv_2=(Token)match(input,50,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalEsm.g:2469:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalEsm.g:2470:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalEsm.g:2470:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalEsm.g:2471:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalEsm.g:2490:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalEsm.g:2502:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalEsm.g:2502:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalEsm.g:2503:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalEsm.g:2509:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:2515:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEsm.g:2516:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEsm.g:2516:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsm.g:2517:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEsm.g:2517:3: (lv_name_0_0= RULE_ID )
            // InternalEsm.g:2518:4: lv_name_0_0= RULE_ID
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
    // InternalEsm.g:2537:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalEsm.g:2537:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalEsm.g:2538:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalEsm.g:2544:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2550:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalEsm.g:2551:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalEsm.g:2551:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalEsm.g:2552:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2560:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case 91:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (synpred4_InternalEsm()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA50_3 = input.LA(2);

                    if ( (synpred4_InternalEsm()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 93:
                    {
                    int LA50_4 = input.LA(2);

                    if ( (synpred4_InternalEsm()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 94:
                    {
                    int LA50_5 = input.LA(2);

                    if ( (synpred4_InternalEsm()) ) {
                        alt50=1;
                    }


                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // InternalEsm.g:2561:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalEsm.g:2561:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalEsm.g:2562:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalEsm.g:2572:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalEsm.g:2573:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalEsm.g:2573:6: ()
            	    // InternalEsm.g:2574:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:2580:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalEsm.g:2581:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalEsm.g:2581:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalEsm.g:2582:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_47);
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

            	    // InternalEsm.g:2601:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalEsm.g:2602:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalEsm.g:2602:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalEsm.g:2603:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
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
            	    break loop50;
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
    // InternalEsm.g:2625:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalEsm.g:2625:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalEsm.g:2626:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalEsm.g:2632:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2638:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalEsm.g:2639:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalEsm.g:2639:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalEsm.g:2640:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2648:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==95) ) {
                    int LA51_2 = input.LA(2);

                    if ( (synpred5_InternalEsm()) ) {
                        alt51=1;
                    }


                }
                else if ( (LA51_0==96) ) {
                    int LA51_3 = input.LA(2);

                    if ( (synpred5_InternalEsm()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalEsm.g:2649:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalEsm.g:2649:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalEsm.g:2650:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalEsm.g:2660:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalEsm.g:2661:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalEsm.g:2661:6: ()
            	    // InternalEsm.g:2662:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:2668:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalEsm.g:2669:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalEsm.g:2669:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalEsm.g:2670:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_47);
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

            	    // InternalEsm.g:2689:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalEsm.g:2690:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalEsm.g:2690:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalEsm.g:2691:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalEsm.g:2713:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalEsm.g:2713:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalEsm.g:2714:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalEsm.g:2720:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2726:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalEsm.g:2727:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalEsm.g:2727:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalEsm.g:2728:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2736:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    int LA52_2 = input.LA(2);

                    if ( (synpred6_InternalEsm()) ) {
                        alt52=1;
                    }


                    }
                    break;
                case 97:
                    {
                    int LA52_3 = input.LA(2);

                    if ( (synpred6_InternalEsm()) ) {
                        alt52=1;
                    }


                    }
                    break;
                case 98:
                    {
                    int LA52_4 = input.LA(2);

                    if ( (synpred6_InternalEsm()) ) {
                        alt52=1;
                    }


                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // InternalEsm.g:2737:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalEsm.g:2737:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalEsm.g:2738:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalEsm.g:2748:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalEsm.g:2749:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalEsm.g:2749:6: ()
            	    // InternalEsm.g:2750:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:2756:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalEsm.g:2757:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalEsm.g:2757:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalEsm.g:2758:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_47);
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

            	    // InternalEsm.g:2777:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalEsm.g:2778:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalEsm.g:2778:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalEsm.g:2779:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
    // $ANTLR end "ruleDmxEqualityExpression"


    // $ANTLR start "entryRuleDmxRelationalExpression"
    // InternalEsm.g:2801:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalEsm.g:2801:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalEsm.g:2802:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalEsm.g:2808:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2814:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalEsm.g:2815:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalEsm.g:2815:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalEsm.g:2816:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2824:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop53:
            do {
                int alt53=3;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalEsm.g:2825:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalEsm.g:2825:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalEsm.g:2826:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalEsm.g:2826:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalEsm.g:2827:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalEsm.g:2833:6: ( () ruleDmxOpInstanceOf )
            	    // InternalEsm.g:2834:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalEsm.g:2834:7: ()
            	    // InternalEsm.g:2835:8: 
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

            	    // InternalEsm.g:2850:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalEsm.g:2851:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalEsm.g:2851:6: (otherlv_3= RULE_ID )
            	    // InternalEsm.g:2852:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEsm.g:2865:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalEsm.g:2865:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalEsm.g:2866:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalEsm.g:2866:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalEsm.g:2867:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalEsm.g:2877:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalEsm.g:2878:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalEsm.g:2878:7: ()
            	    // InternalEsm.g:2879:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEsm.g:2885:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalEsm.g:2886:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalEsm.g:2886:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalEsm.g:2887:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_47);
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

            	    // InternalEsm.g:2906:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalEsm.g:2907:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalEsm.g:2907:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalEsm.g:2908:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_56);
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalEsm.g:2931:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalEsm.g:2931:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalEsm.g:2932:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalEsm.g:2938:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:2944:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalEsm.g:2945:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalEsm.g:2945:2: (kw= 'ISA' | kw= 'isa' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            else if ( (LA54_0==52) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalEsm.g:2946:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:2952:3: kw= 'isa'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:2961:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalEsm.g:2961:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalEsm.g:2962:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalEsm.g:2968:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2974:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalEsm.g:2975:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalEsm.g:2975:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalEsm.g:2976:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2984:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case 105:
                    {
                    int LA55_2 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA55_3 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA55_4 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA55_5 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA55_6 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // InternalEsm.g:2985:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalEsm.g:2985:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalEsm.g:2986:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalEsm.g:2996:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalEsm.g:2997:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalEsm.g:2997:6: ()
            	    // InternalEsm.g:2998:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:3004:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalEsm.g:3005:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalEsm.g:3005:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalEsm.g:3006:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_47);
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

            	    // InternalEsm.g:3025:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalEsm.g:3026:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalEsm.g:3026:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalEsm.g:3027:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalEsm.g:3049:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalEsm.g:3049:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalEsm.g:3050:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalEsm.g:3056:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3062:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalEsm.g:3063:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalEsm.g:3063:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalEsm.g:3064:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:3072:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==71) ) {
                    int LA56_2 = input.LA(2);

                    if ( (synpred10_InternalEsm()) ) {
                        alt56=1;
                    }


                }
                else if ( (LA56_0==72) ) {
                    int LA56_3 = input.LA(2);

                    if ( (synpred10_InternalEsm()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // InternalEsm.g:3073:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalEsm.g:3073:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalEsm.g:3074:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalEsm.g:3084:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalEsm.g:3085:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalEsm.g:3085:6: ()
            	    // InternalEsm.g:3086:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:3092:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalEsm.g:3093:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalEsm.g:3093:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalEsm.g:3094:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_47);
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

            	    // InternalEsm.g:3113:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalEsm.g:3114:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalEsm.g:3114:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalEsm.g:3115:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalEsm.g:3137:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalEsm.g:3137:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalEsm.g:3138:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalEsm.g:3144:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3150:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalEsm.g:3151:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalEsm.g:3151:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalEsm.g:3152:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:3160:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    int LA57_2 = input.LA(2);

                    if ( (synpred11_InternalEsm()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA57_3 = input.LA(2);

                    if ( (synpred11_InternalEsm()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 109:
                    {
                    int LA57_4 = input.LA(2);

                    if ( (synpred11_InternalEsm()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 110:
                    {
                    int LA57_5 = input.LA(2);

                    if ( (synpred11_InternalEsm()) ) {
                        alt57=1;
                    }


                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // InternalEsm.g:3161:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalEsm.g:3161:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalEsm.g:3162:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalEsm.g:3172:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalEsm.g:3173:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalEsm.g:3173:6: ()
            	    // InternalEsm.g:3174:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:3180:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalEsm.g:3181:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalEsm.g:3181:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalEsm.g:3182:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_47);
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

            	    // InternalEsm.g:3201:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalEsm.g:3202:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalEsm.g:3202:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalEsm.g:3203:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
    // $ANTLR end "ruleDmxMultiplicativeExpression"


    // $ANTLR start "entryRuleDmxUnaryOperation"
    // InternalEsm.g:3225:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalEsm.g:3225:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalEsm.g:3226:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalEsm.g:3232:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalEsm.g:3238:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalEsm.g:3239:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalEsm.g:3239:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=71 && LA58_0<=72)||(LA58_0>=111 && LA58_0<=113)) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ID||(LA58_0>=RULE_NATURAL && LA58_0<=RULE_STRING)||LA58_0==41||(LA58_0>=54 && LA58_0<=55)||LA58_0==58||(LA58_0>=63 && LA58_0<=68)) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalEsm.g:3240:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalEsm.g:3240:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalEsm.g:3241:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalEsm.g:3241:4: ()
                    // InternalEsm.g:3242:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEsm.g:3248:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalEsm.g:3249:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalEsm.g:3249:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalEsm.g:3250:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
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

                    // InternalEsm.g:3267:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalEsm.g:3268:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalEsm.g:3268:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalEsm.g:3269:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalEsm.g:3288:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalEsm.g:3300:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalEsm.g:3300:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalEsm.g:3301:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalEsm.g:3307:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3313:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalEsm.g:3314:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalEsm.g:3314:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalEsm.g:3315:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:3323:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==53) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred12_InternalEsm()) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==33) ) {
                int LA59_2 = input.LA(2);

                if ( (synpred12_InternalEsm()) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // InternalEsm.g:3324:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalEsm.g:3324:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalEsm.g:3325:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalEsm.g:3331:5: ( () ruleDmxOpCast )
                    // InternalEsm.g:3332:6: () ruleDmxOpCast
                    {
                    // InternalEsm.g:3332:6: ()
                    // InternalEsm.g:3333:7: 
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

                    // InternalEsm.g:3348:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEsm.g:3349:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEsm.g:3349:5: (otherlv_3= RULE_ID )
                    // InternalEsm.g:3350:6: otherlv_3= RULE_ID
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
    // InternalEsm.g:3366:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalEsm.g:3366:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalEsm.g:3367:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalEsm.g:3373:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:3379:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalEsm.g:3380:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalEsm.g:3380:2: (kw= 'AS' | kw= 'as' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==53) ) {
                alt60=1;
            }
            else if ( (LA60_0==33) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalEsm.g:3381:3: kw= 'AS'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:3387:3: kw= 'as'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDmxLiteralExpression"
    // InternalEsm.g:3396:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalEsm.g:3396:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalEsm.g:3397:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalEsm.g:3403:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalEsm.g:3409:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalEsm.g:3410:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalEsm.g:3410:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt61=7;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalEsm.g:3411:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalEsm.g:3420:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalEsm.g:3429:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalEsm.g:3438:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalEsm.g:3447:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalEsm.g:3456:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalEsm.g:3465:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalEsm.g:3477:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalEsm.g:3477:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalEsm.g:3478:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalEsm.g:3484:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalEsm.g:3490:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalEsm.g:3491:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalEsm.g:3491:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalEsm.g:3492:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_50);
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


    // $ANTLR start "entryRuleDmxLiteralListExpression"
    // InternalEsm.g:3512:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalEsm.g:3512:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalEsm.g:3513:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalEsm.g:3519:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3525:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalEsm.g:3526:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalEsm.g:3526:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalEsm.g:3527:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalEsm.g:3527:3: ()
            // InternalEsm.g:3528:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalEsm.g:3538:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_NATURAL && LA63_0<=RULE_STRING)||(LA63_0>=54 && LA63_0<=55)||(LA63_0>=63 && LA63_0<=68)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalEsm.g:3539:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalEsm.g:3539:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalEsm.g:3540:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalEsm.g:3540:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalEsm.g:3541:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
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

                    // InternalEsm.g:3558:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==37) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalEsm.g:3559:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_63); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEsm.g:3563:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalEsm.g:3564:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalEsm.g:3564:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalEsm.g:3565:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_62);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3592:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalEsm.g:3592:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalEsm.g:3593:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalEsm.g:3599:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3605:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalEsm.g:3606:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalEsm.g:3606:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalEsm.g:3607:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalEsm.g:3607:3: ()
            // InternalEsm.g:3608:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:3614:3: ( (otherlv_1= RULE_ID ) )
            // InternalEsm.g:3615:4: (otherlv_1= RULE_ID )
            {
            // InternalEsm.g:3615:4: (otherlv_1= RULE_ID )
            // InternalEsm.g:3616:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalEsm.g:3631:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalEsm.g:3632:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalEsm.g:3632:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalEsm.g:3633:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_50);
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
    // InternalEsm.g:3658:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalEsm.g:3658:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalEsm.g:3659:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalEsm.g:3665:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3671:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalEsm.g:3672:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalEsm.g:3672:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalEsm.g:3673:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalEsm.g:3673:3: ()
            // InternalEsm.g:3674:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:3680:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_RICH_TEXT_START)||(LA65_0>=RULE_NATURAL && LA65_0<=RULE_STRING)||LA65_0==41||(LA65_0>=54 && LA65_0<=55)||LA65_0==58||(LA65_0>=63 && LA65_0<=68)||(LA65_0>=71 && LA65_0<=72)||(LA65_0>=111 && LA65_0<=113)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalEsm.g:3681:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalEsm.g:3681:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalEsm.g:3682:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalEsm.g:3682:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalEsm.g:3683:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
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
                      							"com.mimacom.ddd.dm.esm.Esm.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEsm.g:3700:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==37) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalEsm.g:3701:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalEsm.g:3705:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalEsm.g:3706:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalEsm.g:3706:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalEsm.g:3707:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_51);
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
                    	      								"com.mimacom.ddd.dm.esm.Esm.DExpression");
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalEsm.g:3730:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalEsm.g:3730:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalEsm.g:3731:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalEsm.g:3737:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalEsm.g:3743:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalEsm.g:3744:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalEsm.g:3744:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalEsm.g:3745:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
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
    // InternalEsm.g:3764:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalEsm.g:3764:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalEsm.g:3765:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalEsm.g:3771:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalEsm.g:3777:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalEsm.g:3778:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalEsm.g:3778:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalEsm.g:3779:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
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
    // InternalEsm.g:3799:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3805:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalEsm.g:3806:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalEsm.g:3806:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalEsm.g:3807:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalEsm.g:3807:3: ( (otherlv_0= RULE_ID ) )
            // InternalEsm.g:3808:4: (otherlv_0= RULE_ID )
            {
            // InternalEsm.g:3808:4: (otherlv_0= RULE_ID )
            // InternalEsm.g:3809:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxComplexObjectRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxComplexObjectAccess().getTypeDComplexTypeCrossReference_0_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getDomFieldListStartSymbolParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_65);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:3827:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalEsm.g:3828:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalEsm.g:3828:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalEsm.g:3829:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_65);
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
            	    break loop66;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3854:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalEsm.g:3854:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalEsm.g:3855:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalEsm.g:3861:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3867:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalEsm.g:3868:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalEsm.g:3868:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalEsm.g:3869:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalEsm.g:3869:3: ( (otherlv_0= RULE_ID ) )
            // InternalEsm.g:3870:4: (otherlv_0= RULE_ID )
            {
            // InternalEsm.g:3870:4: (otherlv_0= RULE_ID )
            // InternalEsm.g:3871:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalEsm.g:3886:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalEsm.g:3887:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalEsm.g:3887:4: (lv_value_2_0= ruleDExpression )
            // InternalEsm.g:3888:5: lv_value_2_0= ruleDExpression
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
              						"com.mimacom.ddd.dm.esm.Esm.DExpression");
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


    // $ANTLR start "entryRuleDmxContextReference"
    // InternalEsm.g:3909:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalEsm.g:3909:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalEsm.g:3910:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalEsm.g:3916:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalEsm.g:3922:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalEsm.g:3923:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalEsm.g:3923:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalEsm.g:3924:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalEsm.g:3924:3: ()
            // InternalEsm.g:3925:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:3931:3: ( (otherlv_1= RULE_ID ) )
            // InternalEsm.g:3932:4: (otherlv_1= RULE_ID )
            {
            // InternalEsm.g:3932:4: (otherlv_1= RULE_ID )
            // InternalEsm.g:3933:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalEsm.g:3944:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==49) ) {
                alt67=1;
            }
            else if ( (LA67_0==48) ) {
                int LA67_2 = input.LA(2);

                if ( (LA67_2==57) ) {
                    alt67=2;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalEsm.g:3945:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalEsm.g:3945:4: ( (lv_before_2_0= '@before' ) )
                    // InternalEsm.g:3946:5: (lv_before_2_0= '@before' )
                    {
                    // InternalEsm.g:3946:5: (lv_before_2_0= '@before' )
                    // InternalEsm.g:3947:6: lv_before_2_0= '@before'
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
                    // InternalEsm.g:3960:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalEsm.g:3960:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalEsm.g:3961:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalEsm.g:3965:5: ( (lv_all_4_0= 'all' ) )
                    // InternalEsm.g:3966:6: (lv_all_4_0= 'all' )
                    {
                    // InternalEsm.g:3966:6: (lv_all_4_0= 'all' )
                    // InternalEsm.g:3967:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3985:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalEsm.g:3985:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalEsm.g:3986:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalEsm.g:3992:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalEsm.g:3998:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalEsm.g:3999:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalEsm.g:3999:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalEsm.g:4000:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalEsm.g:4000:3: ()
            // InternalEsm.g:4001:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalEsm.g:4011:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalEsm.g:4012:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalEsm.g:4012:4: (lv_if_2_0= ruleDExpression )
            // InternalEsm.g:4013:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_69);
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
              						"com.mimacom.ddd.dm.esm.Esm.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalEsm.g:4034:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalEsm.g:4035:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalEsm.g:4035:4: (lv_then_4_0= ruleDExpression )
            // InternalEsm.g:4036:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_70);
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
              						"com.mimacom.ddd.dm.esm.Esm.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEsm.g:4053:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==60) && (synpred13_InternalEsm())) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalEsm.g:4054:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalEsm.g:4054:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalEsm.g:4055:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalEsm.g:4061:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalEsm.g:4062:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalEsm.g:4062:5: (lv_else_6_0= ruleDExpression )
                    // InternalEsm.g:4063:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_71);
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
                      							"com.mimacom.ddd.dm.esm.Esm.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4089:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalEsm.g:4089:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalEsm.g:4090:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalEsm.g:4096:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalEsm.g:4102:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalEsm.g:4103:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalEsm.g:4103:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==47||LA69_0==71||LA69_0==114) ) {
                alt69=1;
            }
            else if ( (LA69_0==41) ) {
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
                    // InternalEsm.g:4104:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalEsm.g:4104:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalEsm.g:4105:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalEsm.g:4105:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalEsm.g:4106:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalEsm.g:4124:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalEsm.g:4124:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalEsm.g:4125:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalEsm.g:4129:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalEsm.g:4130:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalEsm.g:4130:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalEsm.g:4131:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_73); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,62,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalEsm.g:4151:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalEsm.g:4152:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalEsm.g:4152:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalEsm.g:4153:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
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
    // InternalEsm.g:4179:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalEsm.g:4179:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalEsm.g:4180:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalEsm.g:4186:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:4192:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalEsm.g:4193:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalEsm.g:4193:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_NATURAL) ) {
                alt70=1;
            }
            else if ( (LA70_0==47) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalEsm.g:4194:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalEsm.g:4202:3: kw= '*'
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
    // InternalEsm.g:4211:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalEsm.g:4211:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalEsm.g:4212:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalEsm.g:4218:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEsm.g:4224:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalEsm.g:4225:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalEsm.g:4225:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalEsm.g:4226:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalEsm.g:4226:3: ()
            // InternalEsm.g:4227:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4233:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt71=1;
                }
                break;
            case 64:
                {
                alt71=2;
                }
                break;
            case 65:
                {
                alt71=3;
                }
                break;
            case 66:
                {
                alt71=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalEsm.g:4234:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalEsm.g:4234:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalEsm.g:4235:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalEsm.g:4235:5: (lv_value_1_0= 'TRUE' )
                    // InternalEsm.g:4236:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
                    // InternalEsm.g:4249:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalEsm.g:4249:4: ( (lv_value_2_0= 'true' ) )
                    // InternalEsm.g:4250:5: (lv_value_2_0= 'true' )
                    {
                    // InternalEsm.g:4250:5: (lv_value_2_0= 'true' )
                    // InternalEsm.g:4251:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
                    // InternalEsm.g:4264:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalEsm.g:4269:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4278:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalEsm.g:4278:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalEsm.g:4279:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalEsm.g:4285:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalEsm.g:4291:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalEsm.g:4292:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalEsm.g:4292:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalEsm.g:4293:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalEsm.g:4293:3: ()
            // InternalEsm.g:4294:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4300:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalEsm.g:4301:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalEsm.g:4301:4: (lv_value_1_0= RULE_NATURAL )
            // InternalEsm.g:4302:5: lv_value_1_0= RULE_NATURAL
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
    // InternalEsm.g:4322:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalEsm.g:4322:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalEsm.g:4323:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalEsm.g:4329:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:4335:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalEsm.g:4336:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalEsm.g:4336:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalEsm.g:4337:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalEsm.g:4337:3: ()
            // InternalEsm.g:4338:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4344:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalEsm.g:4345:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalEsm.g:4345:4: (lv_value_1_0= ruleDECIMAL )
            // InternalEsm.g:4346:5: lv_value_1_0= ruleDECIMAL
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
    // InternalEsm.g:4367:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalEsm.g:4367:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalEsm.g:4368:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalEsm.g:4374:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalEsm.g:4380:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEsm.g:4381:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEsm.g:4381:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEsm.g:4382:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalEsm.g:4382:3: ()
            // InternalEsm.g:4383:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4389:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEsm.g:4390:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEsm.g:4390:4: (lv_value_1_0= RULE_STRING )
            // InternalEsm.g:4391:5: lv_value_1_0= RULE_STRING
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
    // InternalEsm.g:4411:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalEsm.g:4411:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalEsm.g:4412:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalEsm.g:4418:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEsm.g:4424:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalEsm.g:4425:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalEsm.g:4425:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalEsm.g:4426:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalEsm.g:4426:3: ()
            // InternalEsm.g:4427:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4433:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==67) ) {
                alt72=1;
            }
            else if ( (LA72_0==68) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalEsm.g:4434:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:4439:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4448:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalEsm.g:4448:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalEsm.g:4449:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalEsm.g:4455:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalEsm.g:4461:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalEsm.g:4462:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalEsm.g:4462:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalEsm.g:4463:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,48,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalEsm.g:4482:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=69 && LA75_0<=70)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalEsm.g:4483:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalEsm.g:4483:4: (kw= 'E' | kw= 'e' )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==69) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==70) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalEsm.g:4484:5: kw= 'E'
                            {
                            kw=(Token)match(input,69,FOLLOW_77); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalEsm.g:4490:5: kw= 'e'
                            {
                            kw=(Token)match(input,70,FOLLOW_77); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEsm.g:4496:4: (kw= '+' | kw= '-' )?
                    int alt74=3;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==71) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==72) ) {
                        alt74=2;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalEsm.g:4497:5: kw= '+'
                            {
                            kw=(Token)match(input,71,FOLLOW_72); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalEsm.g:4503:5: kw= '-'
                            {
                            kw=(Token)match(input,72,FOLLOW_72); if (state.failed) return current;
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
    // InternalEsm.g:4521:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalEsm.g:4521:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalEsm.g:4522:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
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
    // InternalEsm.g:4528:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:4534:2: (kw= '{' )
            // InternalEsm.g:4535:2: kw= '{'
            {
            kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4543:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalEsm.g:4543:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalEsm.g:4544:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalEsm.g:4550:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:4556:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalEsm.g:4557:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalEsm.g:4557:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalEsm.g:4558:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_78);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:4568:3: (kw= '.*' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==73) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalEsm.g:4569:4: kw= '.*'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4579:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalEsm.g:4579:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalEsm.g:4580:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalEsm.g:4586:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEsm.g:4592:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEsm.g:4593:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEsm.g:4593:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEsm.g:4594:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalEsm.g:4601:3: (kw= '.' this_ID_2= RULE_ID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==48) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalEsm.g:4602:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleDQualifiedName"


    // $ANTLR start "ruleEsmStateKind"
    // InternalEsm.g:4619:1: ruleEsmStateKind returns [Enumerator current=null] : ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) ) ;
    public final Enumerator ruleEsmStateKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEsm.g:4625:2: ( ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) ) )
            // InternalEsm.g:4626:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) )
            {
            // InternalEsm.g:4626:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==74) ) {
                alt78=1;
            }
            else if ( (LA78_0==75) ) {
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
                    // InternalEsm.g:4627:3: (enumLiteral_0= 'initial' )
                    {
                    // InternalEsm.g:4627:3: (enumLiteral_0= 'initial' )
                    // InternalEsm.g:4628:4: enumLiteral_0= 'initial'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmStateKindAccess().getINITIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEsmStateKindAccess().getINITIALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4635:3: (enumLiteral_1= 'final' )
                    {
                    // InternalEsm.g:4635:3: (enumLiteral_1= 'final' )
                    // InternalEsm.g:4636:4: enumLiteral_1= 'final'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmStateKindAccess().getFINALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEsmStateKindAccess().getFINALEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleEsmStateKind"


    // $ANTLR start "ruleEsmLayoutDirection"
    // InternalEsm.g:4646:1: ruleEsmLayoutDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'down' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'up' ) | (enumLiteral_3= 'right' ) ) ;
    public final Enumerator ruleEsmLayoutDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEsm.g:4652:2: ( ( (enumLiteral_0= 'down' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'up' ) | (enumLiteral_3= 'right' ) ) )
            // InternalEsm.g:4653:2: ( (enumLiteral_0= 'down' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'up' ) | (enumLiteral_3= 'right' ) )
            {
            // InternalEsm.g:4653:2: ( (enumLiteral_0= 'down' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'up' ) | (enumLiteral_3= 'right' ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt79=1;
                }
                break;
            case 77:
                {
                alt79=2;
                }
                break;
            case 78:
                {
                alt79=3;
                }
                break;
            case 79:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalEsm.g:4654:3: (enumLiteral_0= 'down' )
                    {
                    // InternalEsm.g:4654:3: (enumLiteral_0= 'down' )
                    // InternalEsm.g:4655:4: enumLiteral_0= 'down'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmLayoutDirectionAccess().getDOWNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEsmLayoutDirectionAccess().getDOWNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4662:3: (enumLiteral_1= 'left' )
                    {
                    // InternalEsm.g:4662:3: (enumLiteral_1= 'left' )
                    // InternalEsm.g:4663:4: enumLiteral_1= 'left'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmLayoutDirectionAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEsmLayoutDirectionAccess().getLEFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4670:3: (enumLiteral_2= 'up' )
                    {
                    // InternalEsm.g:4670:3: (enumLiteral_2= 'up' )
                    // InternalEsm.g:4671:4: enumLiteral_2= 'up'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmLayoutDirectionAccess().getUPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEsmLayoutDirectionAccess().getUPEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4678:3: (enumLiteral_3= 'right' )
                    {
                    // InternalEsm.g:4678:3: (enumLiteral_3= 'right' )
                    // InternalEsm.g:4679:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmLayoutDirectionAccess().getRIGHTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getEsmLayoutDirectionAccess().getRIGHTEnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleEsmLayoutDirection"


    // $ANTLR start "ruleDmxBaseType"
    // InternalEsm.g:4689:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalEsm.g:4695:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalEsm.g:4696:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalEsm.g:4696:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt80=11;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt80=1;
                }
                break;
            case 81:
                {
                alt80=2;
                }
                break;
            case 82:
                {
                alt80=3;
                }
                break;
            case 83:
                {
                alt80=4;
                }
                break;
            case 84:
                {
                alt80=5;
                }
                break;
            case 85:
                {
                alt80=6;
                }
                break;
            case 86:
                {
                alt80=7;
                }
                break;
            case 87:
                {
                alt80=8;
                }
                break;
            case 88:
                {
                alt80=9;
                }
                break;
            case 89:
                {
                alt80=10;
                }
                break;
            case 90:
                {
                alt80=11;
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
                    // InternalEsm.g:4697:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalEsm.g:4697:3: (enumLiteral_0= 'VOID' )
                    // InternalEsm.g:4698:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4705:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalEsm.g:4705:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalEsm.g:4706:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4713:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalEsm.g:4713:3: (enumLiteral_2= 'NUMBER' )
                    // InternalEsm.g:4714:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4721:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalEsm.g:4721:3: (enumLiteral_3= 'TEXT' )
                    // InternalEsm.g:4722:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsm.g:4729:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalEsm.g:4729:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalEsm.g:4730:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEsm.g:4737:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalEsm.g:4737:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalEsm.g:4738:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEsm.g:4745:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalEsm.g:4745:3: (enumLiteral_6= 'STATE' )
                    // InternalEsm.g:4746:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEsm.g:4753:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalEsm.g:4753:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalEsm.g:4754:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEsm.g:4761:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalEsm.g:4761:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalEsm.g:4762:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEsm.g:4769:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalEsm.g:4769:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalEsm.g:4770:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEsm.g:4777:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalEsm.g:4777:3: (enumLiteral_10= 'SERVICE' )
                    // InternalEsm.g:4778:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4788:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEsm.g:4794:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalEsm.g:4795:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalEsm.g:4795:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt81=1;
                }
                break;
            case 92:
                {
                alt81=2;
                }
                break;
            case 93:
                {
                alt81=3;
                }
                break;
            case 94:
                {
                alt81=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalEsm.g:4796:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalEsm.g:4796:3: (enumLiteral_0= 'OR' )
                    // InternalEsm.g:4797:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4804:3: (enumLiteral_1= 'or' )
                    {
                    // InternalEsm.g:4804:3: (enumLiteral_1= 'or' )
                    // InternalEsm.g:4805:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4812:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalEsm.g:4812:3: (enumLiteral_2= 'XOR' )
                    // InternalEsm.g:4813:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4820:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalEsm.g:4820:3: (enumLiteral_3= 'xor' )
                    // InternalEsm.g:4821:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4831:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEsm.g:4837:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalEsm.g:4838:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalEsm.g:4838:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==95) ) {
                alt82=1;
            }
            else if ( (LA82_0==96) ) {
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
                    // InternalEsm.g:4839:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalEsm.g:4839:3: (enumLiteral_0= 'AND' )
                    // InternalEsm.g:4840:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4847:3: (enumLiteral_1= 'and' )
                    {
                    // InternalEsm.g:4847:3: (enumLiteral_1= 'and' )
                    // InternalEsm.g:4848:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4858:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEsm.g:4864:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalEsm.g:4865:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalEsm.g:4865:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt83=1;
                }
                break;
            case 97:
                {
                alt83=2;
                }
                break;
            case 98:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalEsm.g:4866:3: (enumLiteral_0= '=' )
                    {
                    // InternalEsm.g:4866:3: (enumLiteral_0= '=' )
                    // InternalEsm.g:4867:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4874:3: (enumLiteral_1= '!=' )
                    {
                    // InternalEsm.g:4874:3: (enumLiteral_1= '!=' )
                    // InternalEsm.g:4875:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4882:3: (enumLiteral_2= '<>' )
                    {
                    // InternalEsm.g:4882:3: (enumLiteral_2= '<>' )
                    // InternalEsm.g:4883:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4893:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalEsm.g:4899:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalEsm.g:4900:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalEsm.g:4900:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt84=6;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt84=1;
                }
                break;
            case 100:
                {
                alt84=2;
                }
                break;
            case 101:
                {
                alt84=3;
                }
                break;
            case 102:
                {
                alt84=4;
                }
                break;
            case 103:
                {
                alt84=5;
                }
                break;
            case 104:
                {
                alt84=6;
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
                    // InternalEsm.g:4901:3: (enumLiteral_0= '<' )
                    {
                    // InternalEsm.g:4901:3: (enumLiteral_0= '<' )
                    // InternalEsm.g:4902:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4909:3: (enumLiteral_1= '<=' )
                    {
                    // InternalEsm.g:4909:3: (enumLiteral_1= '<=' )
                    // InternalEsm.g:4910:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4917:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalEsm.g:4917:3: (enumLiteral_2= '\\u2264' )
                    // InternalEsm.g:4918:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4925:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEsm.g:4925:3: (enumLiteral_3= '>=' )
                    // InternalEsm.g:4926:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsm.g:4933:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalEsm.g:4933:3: (enumLiteral_4= '\\u2265' )
                    // InternalEsm.g:4934:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEsm.g:4941:3: (enumLiteral_5= '>' )
                    {
                    // InternalEsm.g:4941:3: (enumLiteral_5= '>' )
                    // InternalEsm.g:4942:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4952:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEsm.g:4958:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalEsm.g:4959:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalEsm.g:4959:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt85=5;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt85=1;
                }
                break;
            case 40:
                {
                alt85=2;
                }
                break;
            case 62:
                {
                alt85=3;
                }
                break;
            case 106:
                {
                alt85=4;
                }
                break;
            case 107:
                {
                alt85=5;
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
                    // InternalEsm.g:4960:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalEsm.g:4960:3: (enumLiteral_0= 'IN' )
                    // InternalEsm.g:4961:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4968:3: (enumLiteral_1= 'in' )
                    {
                    // InternalEsm.g:4968:3: (enumLiteral_1= 'in' )
                    // InternalEsm.g:4969:4: enumLiteral_1= 'in'
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
                    // InternalEsm.g:4976:3: (enumLiteral_2= '..' )
                    {
                    // InternalEsm.g:4976:3: (enumLiteral_2= '..' )
                    // InternalEsm.g:4977:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4984:3: (enumLiteral_3= '->' )
                    {
                    // InternalEsm.g:4984:3: (enumLiteral_3= '->' )
                    // InternalEsm.g:4985:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsm.g:4992:3: (enumLiteral_4= '=>' )
                    {
                    // InternalEsm.g:4992:3: (enumLiteral_4= '=>' )
                    // InternalEsm.g:4993:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:5003:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEsm.g:5009:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalEsm.g:5010:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalEsm.g:5010:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==71) ) {
                alt86=1;
            }
            else if ( (LA86_0==72) ) {
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
                    // InternalEsm.g:5011:3: (enumLiteral_0= '+' )
                    {
                    // InternalEsm.g:5011:3: (enumLiteral_0= '+' )
                    // InternalEsm.g:5012:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:5019:3: (enumLiteral_1= '-' )
                    {
                    // InternalEsm.g:5019:3: (enumLiteral_1= '-' )
                    // InternalEsm.g:5020:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:5030:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEsm.g:5036:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalEsm.g:5037:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalEsm.g:5037:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt87=1;
                }
                break;
            case 108:
                {
                alt87=2;
                }
                break;
            case 109:
                {
                alt87=3;
                }
                break;
            case 110:
                {
                alt87=4;
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
                    // InternalEsm.g:5038:3: (enumLiteral_0= '*' )
                    {
                    // InternalEsm.g:5038:3: (enumLiteral_0= '*' )
                    // InternalEsm.g:5039:4: enumLiteral_0= '*'
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
                    // InternalEsm.g:5046:3: (enumLiteral_1= '/' )
                    {
                    // InternalEsm.g:5046:3: (enumLiteral_1= '/' )
                    // InternalEsm.g:5047:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:5054:3: (enumLiteral_2= '**' )
                    {
                    // InternalEsm.g:5054:3: (enumLiteral_2= '**' )
                    // InternalEsm.g:5055:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:5062:3: (enumLiteral_3= '%' )
                    {
                    // InternalEsm.g:5062:3: (enumLiteral_3= '%' )
                    // InternalEsm.g:5063:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:5073:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEsm.g:5079:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalEsm.g:5080:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalEsm.g:5080:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt88=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt88=1;
                }
                break;
            case 72:
                {
                alt88=2;
                }
                break;
            case 111:
                {
                alt88=3;
                }
                break;
            case 112:
                {
                alt88=4;
                }
                break;
            case 113:
                {
                alt88=5;
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
                    // InternalEsm.g:5081:3: (enumLiteral_0= '+' )
                    {
                    // InternalEsm.g:5081:3: (enumLiteral_0= '+' )
                    // InternalEsm.g:5082:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:5089:3: (enumLiteral_1= '-' )
                    {
                    // InternalEsm.g:5089:3: (enumLiteral_1= '-' )
                    // InternalEsm.g:5090:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:5097:3: (enumLiteral_2= '!' )
                    {
                    // InternalEsm.g:5097:3: (enumLiteral_2= '!' )
                    // InternalEsm.g:5098:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:5105:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalEsm.g:5105:3: (enumLiteral_3= 'NOT' )
                    // InternalEsm.g:5106:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsm.g:5113:3: (enumLiteral_4= 'not' )
                    {
                    // InternalEsm.g:5113:3: (enumLiteral_4= 'not' )
                    // InternalEsm.g:5114:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:5124:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEsm.g:5130:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalEsm.g:5131:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalEsm.g:5131:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt89=1;
                }
                break;
            case 71:
                {
                alt89=2;
                }
                break;
            case 47:
                {
                alt89=3;
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
                    // InternalEsm.g:5132:3: (enumLiteral_0= '?' )
                    {
                    // InternalEsm.g:5132:3: (enumLiteral_0= '?' )
                    // InternalEsm.g:5133:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:5140:3: (enumLiteral_1= '+' )
                    {
                    // InternalEsm.g:5140:3: (enumLiteral_1= '+' )
                    // InternalEsm.g:5141:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:5148:3: (enumLiteral_2= '*' )
                    {
                    // InternalEsm.g:5148:3: (enumLiteral_2= '*' )
                    // InternalEsm.g:5149:4: enumLiteral_2= '*'
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

    // $ANTLR start synpred1_InternalEsm
    public final void synpred1_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2161:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalEsm.g:2161:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalEsm.g:2161:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalEsm.g:2162:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalEsm.g:2162:7: ()
        // InternalEsm.g:2163:7: 
        {
        }

        match(input,48,FOLLOW_4); if (state.failed) return ;
        // InternalEsm.g:2165:7: ( ( RULE_ID ) )
        // InternalEsm.g:2166:8: ( RULE_ID )
        {
        // InternalEsm.g:2166:8: ( RULE_ID )
        // InternalEsm.g:2167:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_46); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleDmxOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEsm

    // $ANTLR start synpred2_InternalEsm
    public final void synpred2_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2230:6: ( ( () '.' ) )
        // InternalEsm.g:2230:7: ( () '.' )
        {
        // InternalEsm.g:2230:7: ( () '.' )
        // InternalEsm.g:2231:7: () '.'
        {
        // InternalEsm.g:2231:7: ()
        // InternalEsm.g:2232:7: 
        {
        }

        match(input,48,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEsm

    // $ANTLR start synpred3_InternalEsm
    public final void synpred3_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2266:8: ( ( '(' ) )
        // InternalEsm.g:2266:9: ( '(' )
        {
        // InternalEsm.g:2266:9: ( '(' )
        // InternalEsm.g:2267:9: '('
        {
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalEsm

    // $ANTLR start synpred4_InternalEsm
    public final void synpred4_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2562:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalEsm.g:2562:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalEsm.g:2562:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalEsm.g:2563:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalEsm.g:2563:6: ()
        // InternalEsm.g:2564:6: 
        {
        }

        // InternalEsm.g:2565:6: ( ( ruleDmxOpOr ) )
        // InternalEsm.g:2566:7: ( ruleDmxOpOr )
        {
        // InternalEsm.g:2566:7: ( ruleDmxOpOr )
        // InternalEsm.g:2567:8: ruleDmxOpOr
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
    // $ANTLR end synpred4_InternalEsm

    // $ANTLR start synpred5_InternalEsm
    public final void synpred5_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2650:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalEsm.g:2650:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalEsm.g:2650:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalEsm.g:2651:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalEsm.g:2651:6: ()
        // InternalEsm.g:2652:6: 
        {
        }

        // InternalEsm.g:2653:6: ( ( ruleDmxOpAnd ) )
        // InternalEsm.g:2654:7: ( ruleDmxOpAnd )
        {
        // InternalEsm.g:2654:7: ( ruleDmxOpAnd )
        // InternalEsm.g:2655:8: ruleDmxOpAnd
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
    // $ANTLR end synpred5_InternalEsm

    // $ANTLR start synpred6_InternalEsm
    public final void synpred6_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2738:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalEsm.g:2738:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalEsm.g:2738:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalEsm.g:2739:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalEsm.g:2739:6: ()
        // InternalEsm.g:2740:6: 
        {
        }

        // InternalEsm.g:2741:6: ( ( ruleDmxOpEquality ) )
        // InternalEsm.g:2742:7: ( ruleDmxOpEquality )
        {
        // InternalEsm.g:2742:7: ( ruleDmxOpEquality )
        // InternalEsm.g:2743:8: ruleDmxOpEquality
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
    // $ANTLR end synpred6_InternalEsm

    // $ANTLR start synpred7_InternalEsm
    public final void synpred7_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2827:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalEsm.g:2827:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalEsm.g:2827:7: ( () ruleDmxOpInstanceOf )
        // InternalEsm.g:2828:7: () ruleDmxOpInstanceOf
        {
        // InternalEsm.g:2828:7: ()
        // InternalEsm.g:2829:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalEsm

    // $ANTLR start synpred8_InternalEsm
    public final void synpred8_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2867:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalEsm.g:2867:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalEsm.g:2867:7: ( () ( ( ruleOpCompare ) ) )
        // InternalEsm.g:2868:7: () ( ( ruleOpCompare ) )
        {
        // InternalEsm.g:2868:7: ()
        // InternalEsm.g:2869:7: 
        {
        }

        // InternalEsm.g:2870:7: ( ( ruleOpCompare ) )
        // InternalEsm.g:2871:8: ( ruleOpCompare )
        {
        // InternalEsm.g:2871:8: ( ruleOpCompare )
        // InternalEsm.g:2872:9: ruleOpCompare
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
    // $ANTLR end synpred8_InternalEsm

    // $ANTLR start synpred9_InternalEsm
    public final void synpred9_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2986:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalEsm.g:2986:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalEsm.g:2986:6: ( () ( ( ruleOpOther ) ) )
        // InternalEsm.g:2987:6: () ( ( ruleOpOther ) )
        {
        // InternalEsm.g:2987:6: ()
        // InternalEsm.g:2988:6: 
        {
        }

        // InternalEsm.g:2989:6: ( ( ruleOpOther ) )
        // InternalEsm.g:2990:7: ( ruleOpOther )
        {
        // InternalEsm.g:2990:7: ( ruleOpOther )
        // InternalEsm.g:2991:8: ruleOpOther
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
    // $ANTLR end synpred9_InternalEsm

    // $ANTLR start synpred10_InternalEsm
    public final void synpred10_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:3074:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalEsm.g:3074:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalEsm.g:3074:6: ( () ( ( ruleOpAdd ) ) )
        // InternalEsm.g:3075:6: () ( ( ruleOpAdd ) )
        {
        // InternalEsm.g:3075:6: ()
        // InternalEsm.g:3076:6: 
        {
        }

        // InternalEsm.g:3077:6: ( ( ruleOpAdd ) )
        // InternalEsm.g:3078:7: ( ruleOpAdd )
        {
        // InternalEsm.g:3078:7: ( ruleOpAdd )
        // InternalEsm.g:3079:8: ruleOpAdd
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
    // $ANTLR end synpred10_InternalEsm

    // $ANTLR start synpred11_InternalEsm
    public final void synpred11_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:3162:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalEsm.g:3162:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalEsm.g:3162:6: ( () ( ( ruleOpMulti ) ) )
        // InternalEsm.g:3163:6: () ( ( ruleOpMulti ) )
        {
        // InternalEsm.g:3163:6: ()
        // InternalEsm.g:3164:6: 
        {
        }

        // InternalEsm.g:3165:6: ( ( ruleOpMulti ) )
        // InternalEsm.g:3166:7: ( ruleOpMulti )
        {
        // InternalEsm.g:3166:7: ( ruleOpMulti )
        // InternalEsm.g:3167:8: ruleOpMulti
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
    // $ANTLR end synpred11_InternalEsm

    // $ANTLR start synpred12_InternalEsm
    public final void synpred12_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:3325:5: ( ( () ruleDmxOpCast ) )
        // InternalEsm.g:3325:6: ( () ruleDmxOpCast )
        {
        // InternalEsm.g:3325:6: ( () ruleDmxOpCast )
        // InternalEsm.g:3326:6: () ruleDmxOpCast
        {
        // InternalEsm.g:3326:6: ()
        // InternalEsm.g:3327:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalEsm

    // $ANTLR start synpred13_InternalEsm
    public final void synpred13_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:4055:5: ( 'else' )
        // InternalEsm.g:4055:6: 'else'
        {
        match(input,60,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalEsm

    // Delegated rules

    public final boolean synpred3_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEsm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEsm_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA53 dfa53 = new DFA53(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\156\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\0\1\1\1\3\1\5\1\7\1\2\1\4\1\6\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\2\1\12\uffff\1\1\4\uffff\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\1\1\2\uffff\1\1\2\uffff\4\1\10\uffff\2\1\1\uffff\2\1\17\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2824:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEsm()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEsm()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_4 = input.LA(1);

                         
                        int index53_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_6 = input.LA(1);

                         
                        int index53_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\3\uffff\1\7\6\uffff";
    static final String dfa_10s = "\1\11\2\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String dfa_11s = "\1\104\2\uffff\1\156\4\uffff\1\11\1\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\3\1\uffff\1\4";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\2\53\uffff\1\5\1\6\7\uffff\4\1\2\4",
            "",
            "",
            "\1\7\2\uffff\2\7\12\uffff\1\7\2\uffff\1\7\1\uffff\2\7\1\uffff\2\7\1\uffff\1\7\2\uffff\1\7\3\uffff\1\7\2\uffff\1\7\1\uffff\1\7\4\uffff\1\7\1\10\2\uffff\3\7\2\uffff\1\7\2\uffff\4\7\10\uffff\2\7\1\uffff\2\7\17\uffff\24\7",
            "",
            "",
            "",
            "",
            "\1\7\4\uffff\1\11",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3410:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C0060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001A880000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000005A880000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x84C0020000000670L,0x000380000000019FL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000828000000002L,0x0004000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x80C0000000400600L,0x000000000000001FL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FF0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000010L,0x0000000007FF0000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x84C0020000000610L,0x000380000000019FL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0003020000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x84C0060000000610L,0x000380000000019FL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000078000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0018000000000002L,0x000001F800000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000010000000002L,0x00000E0000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000800000000002L,0x0000700000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0020000200000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x80C0000001000600L,0x000000000000001FL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x80C0000000000600L,0x000000000000001FL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x84C0060000000670L,0x000380000000019FL});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000800000000200L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000180L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});

}