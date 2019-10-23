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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'alias'", "'state'", "'model'", "'for'", "'{'", "'direction'", "'}'", "'derived'", "'when'", "'composite'", "'concurrent'", "'substate'", "'transition'", "'from'", "'to'", "'as'", "'import'", "'test'", "'context'", "','", "':'", "'in'", "'('", "')'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "':='", "'|'", "'ISA'", "'isa'", "'AS'", "'NEW'", "'new'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'initial'", "'final'", "'down'", "'left'", "'up'", "'right'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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

            if ( ((LA3_0>=RULE_PLAIN_TEXT_ONLY && LA3_0<=RULE_PLAIN_TEXT_START)) ) {
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

            if ( ((LA4_0>=RULE_PLAIN_TEXT_ONLY && LA4_0<=RULE_PLAIN_TEXT_START)) ) {
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

                if ( (LA6_0==19||LA6_0==25||(LA6_0>=27 && LA6_0<=28)||(LA6_0>=73 && LA6_0<=74)) ) {
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

            if ( (LA8_0==RULE_ID||(LA8_0>=RULE_NATURAL && LA8_0<=RULE_STRING)||LA8_0==40||LA8_0==57||(LA8_0>=62 && LA8_0<=67)||(LA8_0>=70 && LA8_0<=71)||(LA8_0>=111 && LA8_0<=113)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_PLAIN_TEXT_ONLY && LA8_0<=RULE_PLAIN_TEXT_START)) ) {
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
            case 73:
            case 74:
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

            if ( ((LA11_0>=73 && LA11_0<=74)) ) {
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

            if ( ((LA12_0>=RULE_PLAIN_TEXT_ONLY && LA12_0<=RULE_PLAIN_TEXT_START)) ) {
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

            if ( ((LA13_0>=73 && LA13_0<=74)) ) {
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

            if ( ((LA15_0>=RULE_PLAIN_TEXT_ONLY && LA15_0<=RULE_PLAIN_TEXT_START)) ) {
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

            if ( ((LA16_0>=73 && LA16_0<=74)) ) {
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

            if ( ((LA18_0>=RULE_PLAIN_TEXT_ONLY && LA18_0<=RULE_PLAIN_TEXT_START)) ) {
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

                if ( (LA20_0==19||LA20_0==25||(LA20_0>=27 && LA20_0<=28)||(LA20_0>=73 && LA20_0<=74)) ) {
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

            if ( ((LA22_0>=73 && LA22_0<=74)) ) {
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

            if ( ((LA24_0>=RULE_PLAIN_TEXT_ONLY && LA24_0<=RULE_PLAIN_TEXT_START)) ) {
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

                if ( (LA26_0==19||LA26_0==25||(LA26_0>=27 && LA26_0<=28)||(LA26_0>=73 && LA26_0<=74)) ) {
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

            if ( ((LA28_0>=75 && LA28_0<=78)) ) {
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
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt30=1;
                }
                break;
            case 40:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==EOF||(LA30_3>=RULE_PLAIN_TEXT_MIDDLE && LA30_3<=RULE_PLAIN_TEXT_END)||LA30_3==19||(LA30_3>=24 && LA30_3<=25)||(LA30_3>=27 && LA30_3<=28)||LA30_3==30||LA30_3==33||LA30_3==37||LA30_3==39||LA30_3==41||(LA30_3>=46 && LA30_3<=48)||(LA30_3>=51 && LA30_3<=53)||(LA30_3>=58 && LA30_3<=61)||(LA30_3>=70 && LA30_3<=71)||(LA30_3>=73 && LA30_3<=74)||(LA30_3>=90 && LA30_3<=110)) ) {
                    alt30=4;
                }
                else if ( (LA30_3==40) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case 57:
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
    // InternalEsm.g:1297:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleDmxTestContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:1303:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ) )
            // InternalEsm.g:1304:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? )
            {
            // InternalEsm.g:1304:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? )
            // InternalEsm.g:1305:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
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

            if ( (LA33_0==40||LA33_0==46||LA33_0==70||LA33_0==114) ) {
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
    // InternalEsm.g:1363:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalEsm.g:1363:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalEsm.g:1364:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalEsm.g:1370:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalEsm.g:1376:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalEsm.g:1377:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalEsm.g:1377:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalEsm.g:1378:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalEsm.g:1378:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsm.g:1379:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEsm.g:1379:4: (lv_name_0_0= RULE_ID )
            // InternalEsm.g:1380:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalEsm.g:1404:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalEsm.g:1405:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalEsm.g:1405:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalEsm.g:1406:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            // InternalEsm.g:1423:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==37) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEsm.g:1424:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,37,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalEsm.g:1428:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalEsm.g:1429:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalEsm.g:1429:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalEsm.g:1430:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_6=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:1456:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalEsm.g:1456:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalEsm.g:1457:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalEsm.g:1463:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:1469:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalEsm.g:1470:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalEsm.g:1470:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalEsm.g:1471:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalEsm.g:1475:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsm.g:1476:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsm.g:1476:4: (lv_name_1_0= RULE_ID )
            // InternalEsm.g:1477:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,43,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalEsm.g:1497:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalEsm.g:1498:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalEsm.g:1498:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalEsm.g:1499:5: lv_baseType_3_0= ruleDmxBaseType
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

            // InternalEsm.g:1516:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_PLAIN_TEXT_ONLY && LA35_0<=RULE_PLAIN_TEXT_START)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEsm.g:1517:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalEsm.g:1517:4: (lv_description_4_0= ruleDRichText )
                    // InternalEsm.g:1518:5: lv_description_4_0= ruleDRichText
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
    // InternalEsm.g:1539:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalEsm.g:1539:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalEsm.g:1540:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalEsm.g:1546:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalEsm.g:1552:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalEsm.g:1553:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalEsm.g:1553:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalEsm.g:1554:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalEsm.g:1558:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEsm.g:1559:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEsm.g:1559:4: (lv_name_1_0= RULE_ID )
            // InternalEsm.g:1560:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,40,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalEsm.g:1580:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEsm.g:1581:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalEsm.g:1581:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalEsm.g:1582:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalEsm.g:1582:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalEsm.g:1583:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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

                    // InternalEsm.g:1600:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==37) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalEsm.g:1601:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalEsm.g:1605:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalEsm.g:1606:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalEsm.g:1606:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalEsm.g:1607:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,41,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,38,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalEsm.g:1634:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalEsm.g:1635:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalEsm.g:1635:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalEsm.g:1636:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            // InternalEsm.g:1653:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEsm.g:1654:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalEsm.g:1658:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalEsm.g:1659:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalEsm.g:1659:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalEsm.g:1660:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalEsm.g:1682:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalEsm.g:1682:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalEsm.g:1683:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalEsm.g:1689:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:1695:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalEsm.g:1696:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalEsm.g:1696:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalEsm.g:1697:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalEsm.g:1697:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=79 && LA39_0<=89)) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalEsm.g:1698:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalEsm.g:1698:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalEsm.g:1699:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalEsm.g:1699:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalEsm.g:1700:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
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
                    // InternalEsm.g:1718:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEsm.g:1718:4: ( (otherlv_1= RULE_ID ) )
                    // InternalEsm.g:1719:5: (otherlv_1= RULE_ID )
                    {
                    // InternalEsm.g:1719:5: (otherlv_1= RULE_ID )
                    // InternalEsm.g:1720:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEsm.g:1732:3: ( (lv_collection_2_0= '*' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEsm.g:1733:4: (lv_collection_2_0= '*' )
                    {
                    // InternalEsm.g:1733:4: (lv_collection_2_0= '*' )
                    // InternalEsm.g:1734:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:1750:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalEsm.g:1750:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalEsm.g:1751:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalEsm.g:1757:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:1763:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalEsm.g:1764:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalEsm.g:1764:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalEsm.g:1765:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalEsm.g:1765:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsm.g:1766:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEsm.g:1766:4: (lv_name_0_0= RULE_ID )
            // InternalEsm.g:1767:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,38,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalEsm.g:1787:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalEsm.g:1788:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalEsm.g:1788:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalEsm.g:1789:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalEsm.g:1810:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalEsm.g:1810:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalEsm.g:1811:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalEsm.g:1817:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalEsm.g:1823:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalEsm.g:1824:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalEsm.g:1824:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_PLAIN_TEXT_START) ) {
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
                    // InternalEsm.g:1825:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalEsm.g:1825:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalEsm.g:1826:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalEsm.g:1826:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalEsm.g:1827:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalEsm.g:1845:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalEsm.g:1845:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalEsm.g:1846:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalEsm.g:1846:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalEsm.g:1847:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalEsm.g:1847:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalEsm.g:1848:6: lv_segments_1_0= ruleDmxTextStart
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

                    // InternalEsm.g:1865:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalEsm.g:1866:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalEsm.g:1866:5: (lv_segments_2_0= ruleDExpression )
                    // InternalEsm.g:1867:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
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

                    // InternalEsm.g:1884:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalEsm.g:1885:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalEsm.g:1885:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalEsm.g:1886:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalEsm.g:1886:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalEsm.g:1887:7: lv_segments_3_0= ruleDmxTextMiddle
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

                    	    // InternalEsm.g:1904:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalEsm.g:1905:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalEsm.g:1905:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalEsm.g:1906:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_42);
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
                    	    break loop41;
                        }
                    } while (true);

                    // InternalEsm.g:1924:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalEsm.g:1925:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalEsm.g:1925:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalEsm.g:1926:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalEsm.g:1948:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalEsm.g:1948:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalEsm.g:1949:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalEsm.g:1955:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:1961:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalEsm.g:1962:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalEsm.g:1962:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalEsm.g:1963:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalEsm.g:1963:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalEsm.g:1964:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalEsm.g:1983:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalEsm.g:1983:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalEsm.g:1984:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalEsm.g:1990:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:1996:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalEsm.g:1997:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalEsm.g:1997:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalEsm.g:1998:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalEsm.g:1998:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalEsm.g:1999:4: lv_value_0_0= RULE_PLAIN_TEXT_START
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
    // InternalEsm.g:2018:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalEsm.g:2018:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalEsm.g:2019:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalEsm.g:2025:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:2031:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalEsm.g:2032:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalEsm.g:2032:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalEsm.g:2033:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalEsm.g:2033:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalEsm.g:2034:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
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
    // InternalEsm.g:2053:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalEsm.g:2053:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalEsm.g:2054:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalEsm.g:2060:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:2066:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalEsm.g:2067:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalEsm.g:2067:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalEsm.g:2068:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalEsm.g:2068:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalEsm.g:2069:4: lv_value_0_0= RULE_PLAIN_TEXT_END
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
    // InternalEsm.g:2088:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalEsm.g:2088:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalEsm.g:2089:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalEsm.g:2095:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalEsm.g:2101:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalEsm.g:2102:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalEsm.g:2102:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalEsm.g:2103:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2111:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==47) ) {
                    int LA44_2 = input.LA(2);

                    if ( (synpred1_InternalEsm()) ) {
                        alt44=1;
                    }
                    else if ( (synpred2_InternalEsm()) ) {
                        alt44=2;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalEsm.g:2112:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalEsm.g:2112:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalEsm.g:2113:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalEsm.g:2113:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalEsm.g:2114:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalEsm.g:2126:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalEsm.g:2127:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalEsm.g:2127:7: ()
            	    // InternalEsm.g:2128:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalEsm.g:2138:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalEsm.g:2139:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalEsm.g:2139:8: (otherlv_3= RULE_ID )
            	    // InternalEsm.g:2140:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_45);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalEsm.g:2160:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalEsm.g:2161:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalEsm.g:2161:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalEsm.g:2162:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_43);
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
            	    // InternalEsm.g:2181:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalEsm.g:2181:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalEsm.g:2182:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalEsm.g:2182:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalEsm.g:2183:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalEsm.g:2189:6: ( () otherlv_7= '.' )
            	    // InternalEsm.g:2190:7: () otherlv_7= '.'
            	    {
            	    // InternalEsm.g:2190:7: ()
            	    // InternalEsm.g:2191:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalEsm.g:2203:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalEsm.g:2204:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalEsm.g:2204:6: (otherlv_8= RULE_ID )
            	    // InternalEsm.g:2205:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalEsm.g:2216:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt43=3;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==40) && (synpred3_InternalEsm())) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==48) ) {
            	        alt43=2;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalEsm.g:2217:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalEsm.g:2217:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalEsm.g:2218:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalEsm.g:2218:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalEsm.g:2219:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalEsm.g:2223:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalEsm.g:2224:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,40,FOLLOW_47); if (state.failed) return current;
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

            	            // InternalEsm.g:2236:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalEsm.g:2237:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalEsm.g:2237:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalEsm.g:2238:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_48);
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

            	            otherlv_11=(Token)match(input,41,FOLLOW_43); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalEsm.g:2261:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalEsm.g:2261:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalEsm.g:2262:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalEsm.g:2262:7: (lv_before_12_0= '@before' )
            	            // InternalEsm.g:2263:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,48,FOLLOW_43); if (state.failed) return current;
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
            	    break loop44;
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
    // InternalEsm.g:2282:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalEsm.g:2282:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalEsm.g:2283:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalEsm.g:2289:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2295:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalEsm.g:2296:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalEsm.g:2296:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalEsm.g:2297:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalEsm.g:2297:3: ()
            // InternalEsm.g:2298:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:2304:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||(LA46_0>=RULE_NATURAL && LA46_0<=RULE_STRING)||LA46_0==40||LA46_0==57||(LA46_0>=62 && LA46_0<=67)||(LA46_0>=70 && LA46_0<=71)||(LA46_0>=111 && LA46_0<=113)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEsm.g:2305:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalEsm.g:2305:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalEsm.g:2306:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalEsm.g:2306:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalEsm.g:2307:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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

                    // InternalEsm.g:2324:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==37) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalEsm.g:2325:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalEsm.g:2329:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalEsm.g:2330:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalEsm.g:2330:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalEsm.g:2331:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_49);
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
                    	    break loop45;
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
    // InternalEsm.g:2354:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalEsm.g:2354:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalEsm.g:2355:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalEsm.g:2361:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:2367:2: (kw= ':=' )
            // InternalEsm.g:2368:2: kw= ':='
            {
            kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:2376:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalEsm.g:2376:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalEsm.g:2377:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalEsm.g:2383:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalEsm.g:2389:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalEsm.g:2390:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalEsm.g:2390:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==EOF||LA47_1==33||LA47_1==37||(LA47_1>=39 && LA47_1<=41)||(LA47_1>=46 && LA47_1<=48)||(LA47_1>=51 && LA47_1<=53)||LA47_1==61||(LA47_1>=70 && LA47_1<=71)||(LA47_1>=90 && LA47_1<=110)) ) {
                    alt47=2;
                }
                else if ( (LA47_1==50) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA47_0>=RULE_NATURAL && LA47_0<=RULE_STRING)||LA47_0==40||LA47_0==57||(LA47_0>=62 && LA47_0<=67)||(LA47_0>=70 && LA47_0<=71)||(LA47_0>=111 && LA47_0<=113)) ) {
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
                    // InternalEsm.g:2391:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalEsm.g:2391:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalEsm.g:2392:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalEsm.g:2392:4: ()
                    // InternalEsm.g:2393:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEsm.g:2399:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalEsm.g:2400:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalEsm.g:2400:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalEsm.g:2401:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
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

                    otherlv_2=(Token)match(input,50,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalEsm.g:2422:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalEsm.g:2423:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalEsm.g:2423:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalEsm.g:2424:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalEsm.g:2443:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalEsm.g:2455:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalEsm.g:2455:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalEsm.g:2456:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalEsm.g:2462:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEsm.g:2468:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEsm.g:2469:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEsm.g:2469:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsm.g:2470:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEsm.g:2470:3: (lv_name_0_0= RULE_ID )
            // InternalEsm.g:2471:4: lv_name_0_0= RULE_ID
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
    // InternalEsm.g:2490:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalEsm.g:2490:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalEsm.g:2491:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalEsm.g:2497:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2503:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalEsm.g:2504:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalEsm.g:2504:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalEsm.g:2505:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2513:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case 90:
                    {
                    int LA48_2 = input.LA(2);

                    if ( (synpred4_InternalEsm()) ) {
                        alt48=1;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA48_3 = input.LA(2);

                    if ( (synpred4_InternalEsm()) ) {
                        alt48=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA48_4 = input.LA(2);

                    if ( (synpred4_InternalEsm()) ) {
                        alt48=1;
                    }


                    }
                    break;
                case 93:
                    {
                    int LA48_5 = input.LA(2);

                    if ( (synpred4_InternalEsm()) ) {
                        alt48=1;
                    }


                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // InternalEsm.g:2514:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalEsm.g:2514:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalEsm.g:2515:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalEsm.g:2525:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalEsm.g:2526:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalEsm.g:2526:6: ()
            	    // InternalEsm.g:2527:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:2533:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalEsm.g:2534:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalEsm.g:2534:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalEsm.g:2535:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
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

            	    // InternalEsm.g:2554:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalEsm.g:2555:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalEsm.g:2555:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalEsm.g:2556:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
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
            	    break loop48;
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
    // InternalEsm.g:2578:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalEsm.g:2578:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalEsm.g:2579:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalEsm.g:2585:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2591:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalEsm.g:2592:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalEsm.g:2592:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalEsm.g:2593:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2601:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==94) ) {
                    int LA49_2 = input.LA(2);

                    if ( (synpred5_InternalEsm()) ) {
                        alt49=1;
                    }


                }
                else if ( (LA49_0==95) ) {
                    int LA49_3 = input.LA(2);

                    if ( (synpred5_InternalEsm()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalEsm.g:2602:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalEsm.g:2602:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalEsm.g:2603:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalEsm.g:2613:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalEsm.g:2614:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalEsm.g:2614:6: ()
            	    // InternalEsm.g:2615:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:2621:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalEsm.g:2622:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalEsm.g:2622:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalEsm.g:2623:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
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

            	    // InternalEsm.g:2642:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalEsm.g:2643:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalEsm.g:2643:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalEsm.g:2644:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalEsm.g:2666:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalEsm.g:2666:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalEsm.g:2667:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalEsm.g:2673:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2679:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalEsm.g:2680:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalEsm.g:2680:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalEsm.g:2681:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2689:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case 96:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (synpred6_InternalEsm()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 97:
                    {
                    int LA50_3 = input.LA(2);

                    if ( (synpred6_InternalEsm()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 98:
                    {
                    int LA50_4 = input.LA(2);

                    if ( (synpred6_InternalEsm()) ) {
                        alt50=1;
                    }


                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // InternalEsm.g:2690:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalEsm.g:2690:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalEsm.g:2691:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalEsm.g:2701:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalEsm.g:2702:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalEsm.g:2702:6: ()
            	    // InternalEsm.g:2703:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:2709:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalEsm.g:2710:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalEsm.g:2710:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalEsm.g:2711:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
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

            	    // InternalEsm.g:2730:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalEsm.g:2731:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalEsm.g:2731:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalEsm.g:2732:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
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
    // $ANTLR end "ruleDmxEqualityExpression"


    // $ANTLR start "entryRuleDmxRelationalExpression"
    // InternalEsm.g:2754:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalEsm.g:2754:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalEsm.g:2755:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalEsm.g:2761:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2767:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalEsm.g:2768:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalEsm.g:2768:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalEsm.g:2769:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2777:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop51:
            do {
                int alt51=3;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // InternalEsm.g:2778:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalEsm.g:2778:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalEsm.g:2779:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalEsm.g:2779:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalEsm.g:2780:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalEsm.g:2786:6: ( () ruleDmxOpInstanceOf )
            	    // InternalEsm.g:2787:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalEsm.g:2787:7: ()
            	    // InternalEsm.g:2788:8: 
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

            	    // InternalEsm.g:2803:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalEsm.g:2804:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalEsm.g:2804:6: (otherlv_3= RULE_ID )
            	    // InternalEsm.g:2805:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEsm.g:2818:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalEsm.g:2818:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalEsm.g:2819:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalEsm.g:2819:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalEsm.g:2820:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalEsm.g:2830:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalEsm.g:2831:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalEsm.g:2831:7: ()
            	    // InternalEsm.g:2832:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEsm.g:2838:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalEsm.g:2839:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalEsm.g:2839:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalEsm.g:2840:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_45);
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

            	    // InternalEsm.g:2859:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalEsm.g:2860:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalEsm.g:2860:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalEsm.g:2861:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalEsm.g:2884:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalEsm.g:2884:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalEsm.g:2885:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalEsm.g:2891:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:2897:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalEsm.g:2898:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalEsm.g:2898:2: (kw= 'ISA' | kw= 'isa' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==51) ) {
                alt52=1;
            }
            else if ( (LA52_0==52) ) {
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
                    // InternalEsm.g:2899:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:2905:3: kw= 'isa'
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
    // InternalEsm.g:2914:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalEsm.g:2914:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalEsm.g:2915:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalEsm.g:2921:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:2927:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalEsm.g:2928:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalEsm.g:2928:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalEsm.g:2929:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:2937:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case 105:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA53_3 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA53_4 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA53_5 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA53_6 = input.LA(2);

                    if ( (synpred9_InternalEsm()) ) {
                        alt53=1;
                    }


                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // InternalEsm.g:2938:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalEsm.g:2938:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalEsm.g:2939:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalEsm.g:2949:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalEsm.g:2950:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalEsm.g:2950:6: ()
            	    // InternalEsm.g:2951:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:2957:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalEsm.g:2958:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalEsm.g:2958:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalEsm.g:2959:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
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

            	    // InternalEsm.g:2978:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalEsm.g:2979:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalEsm.g:2979:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalEsm.g:2980:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalEsm.g:3002:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalEsm.g:3002:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalEsm.g:3003:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalEsm.g:3009:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3015:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalEsm.g:3016:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalEsm.g:3016:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalEsm.g:3017:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:3025:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==70) ) {
                    int LA54_2 = input.LA(2);

                    if ( (synpred10_InternalEsm()) ) {
                        alt54=1;
                    }


                }
                else if ( (LA54_0==71) ) {
                    int LA54_3 = input.LA(2);

                    if ( (synpred10_InternalEsm()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalEsm.g:3026:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalEsm.g:3026:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalEsm.g:3027:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalEsm.g:3037:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalEsm.g:3038:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalEsm.g:3038:6: ()
            	    // InternalEsm.g:3039:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:3045:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalEsm.g:3046:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalEsm.g:3046:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalEsm.g:3047:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
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

            	    // InternalEsm.g:3066:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalEsm.g:3067:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalEsm.g:3067:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalEsm.g:3068:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalEsm.g:3090:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalEsm.g:3090:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalEsm.g:3091:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalEsm.g:3097:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3103:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalEsm.g:3104:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalEsm.g:3104:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalEsm.g:3105:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:3113:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA55_2 = input.LA(2);

                    if ( (synpred11_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA55_3 = input.LA(2);

                    if ( (synpred11_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 109:
                    {
                    int LA55_4 = input.LA(2);

                    if ( (synpred11_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 110:
                    {
                    int LA55_5 = input.LA(2);

                    if ( (synpred11_InternalEsm()) ) {
                        alt55=1;
                    }


                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // InternalEsm.g:3114:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalEsm.g:3114:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalEsm.g:3115:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalEsm.g:3125:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalEsm.g:3126:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalEsm.g:3126:6: ()
            	    // InternalEsm.g:3127:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEsm.g:3133:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalEsm.g:3134:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalEsm.g:3134:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalEsm.g:3135:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
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

            	    // InternalEsm.g:3154:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalEsm.g:3155:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalEsm.g:3155:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalEsm.g:3156:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
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
    // $ANTLR end "ruleDmxMultiplicativeExpression"


    // $ANTLR start "entryRuleDmxUnaryOperation"
    // InternalEsm.g:3178:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalEsm.g:3178:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalEsm.g:3179:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalEsm.g:3185:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalEsm.g:3191:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalEsm.g:3192:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalEsm.g:3192:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=70 && LA56_0<=71)||(LA56_0>=111 && LA56_0<=113)) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID||(LA56_0>=RULE_NATURAL && LA56_0<=RULE_STRING)||LA56_0==40||LA56_0==57||(LA56_0>=62 && LA56_0<=67)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalEsm.g:3193:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalEsm.g:3193:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalEsm.g:3194:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalEsm.g:3194:4: ()
                    // InternalEsm.g:3195:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEsm.g:3201:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalEsm.g:3202:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalEsm.g:3202:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalEsm.g:3203:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalEsm.g:3220:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalEsm.g:3221:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalEsm.g:3221:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalEsm.g:3222:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalEsm.g:3241:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalEsm.g:3253:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalEsm.g:3253:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalEsm.g:3254:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalEsm.g:3260:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3266:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalEsm.g:3267:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalEsm.g:3267:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalEsm.g:3268:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:3276:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred12_InternalEsm()) ) {
                    alt57=1;
                }
            }
            else if ( (LA57_0==33) ) {
                int LA57_2 = input.LA(2);

                if ( (synpred12_InternalEsm()) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalEsm.g:3277:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalEsm.g:3277:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalEsm.g:3278:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalEsm.g:3284:5: ( () ruleDmxOpCast )
                    // InternalEsm.g:3285:6: () ruleDmxOpCast
                    {
                    // InternalEsm.g:3285:6: ()
                    // InternalEsm.g:3286:7: 
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

                    // InternalEsm.g:3301:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEsm.g:3302:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEsm.g:3302:5: (otherlv_3= RULE_ID )
                    // InternalEsm.g:3303:6: otherlv_3= RULE_ID
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
    // InternalEsm.g:3319:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalEsm.g:3319:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalEsm.g:3320:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalEsm.g:3326:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:3332:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalEsm.g:3333:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalEsm.g:3333:2: (kw= 'AS' | kw= 'as' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==53) ) {
                alt58=1;
            }
            else if ( (LA58_0==33) ) {
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
                    // InternalEsm.g:3334:3: kw= 'AS'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:3340:3: kw= 'as'
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
    // InternalEsm.g:3349:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalEsm.g:3349:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalEsm.g:3350:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalEsm.g:3356:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral ) ;
    public final EObject ruleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxBooleanLiteral_0 = null;

        EObject this_DmxStringLiteral_1 = null;

        EObject this_DmxNaturalLiteral_2 = null;

        EObject this_DmxDecimalLiteral_3 = null;

        EObject this_DmxUndefinedLiteral_4 = null;



        	enterRule();

        try {
            // InternalEsm.g:3362:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral ) )
            // InternalEsm.g:3363:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral )
            {
            // InternalEsm.g:3363:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral )
            int alt59=5;
            switch ( input.LA(1) ) {
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt59=1;
                }
                break;
            case RULE_STRING:
                {
                alt59=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA59_3 = input.LA(2);

                if ( (LA59_3==47) ) {
                    int LA59_5 = input.LA(3);

                    if ( (LA59_5==RULE_ID) ) {
                        alt59=3;
                    }
                    else if ( (LA59_5==RULE_NATURAL) ) {
                        alt59=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA59_3==EOF||(LA59_3>=RULE_PLAIN_TEXT_MIDDLE && LA59_3<=RULE_PLAIN_TEXT_END)||LA59_3==19||(LA59_3>=24 && LA59_3<=25)||(LA59_3>=27 && LA59_3<=28)||LA59_3==30||LA59_3==33||LA59_3==37||LA59_3==39||LA59_3==41||LA59_3==46||(LA59_3>=51 && LA59_3<=53)||(LA59_3>=58 && LA59_3<=61)||(LA59_3>=70 && LA59_3<=71)||(LA59_3>=73 && LA59_3<=74)||(LA59_3>=90 && LA59_3<=110)) ) {
                    alt59=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 3, input);

                    throw nvae;
                }
                }
                break;
            case 66:
            case 67:
                {
                alt59=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalEsm.g:3364:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalEsm.g:3373:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalEsm.g:3382:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalEsm.g:3391:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalEsm.g:3400:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
    // InternalEsm.g:3412:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalEsm.g:3412:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalEsm.g:3413:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalEsm.g:3419:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalEsm.g:3425:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalEsm.g:3426:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalEsm.g:3426:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalEsm.g:3427:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_48);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDmxFunctionCall"
    // InternalEsm.g:3447:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalEsm.g:3447:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalEsm.g:3448:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalEsm.g:3454:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3460:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalEsm.g:3461:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalEsm.g:3461:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalEsm.g:3462:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalEsm.g:3462:3: ()
            // InternalEsm.g:3463:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:3469:3: ( (otherlv_1= RULE_ID ) )
            // InternalEsm.g:3470:4: (otherlv_1= RULE_ID )
            {
            // InternalEsm.g:3470:4: (otherlv_1= RULE_ID )
            // InternalEsm.g:3471:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalEsm.g:3486:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalEsm.g:3487:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalEsm.g:3487:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalEsm.g:3488:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            otherlv_4=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3513:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalEsm.g:3513:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalEsm.g:3514:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalEsm.g:3520:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:3526:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalEsm.g:3527:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalEsm.g:3527:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalEsm.g:3528:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalEsm.g:3528:3: ()
            // InternalEsm.g:3529:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:3535:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_PLAIN_TEXT_START)||(LA61_0>=RULE_NATURAL && LA61_0<=RULE_STRING)||LA61_0==40||LA61_0==57||(LA61_0>=62 && LA61_0<=67)||(LA61_0>=70 && LA61_0<=71)||(LA61_0>=111 && LA61_0<=113)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEsm.g:3536:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalEsm.g:3536:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalEsm.g:3537:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalEsm.g:3537:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalEsm.g:3538:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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

                    // InternalEsm.g:3555:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==37) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalEsm.g:3556:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalEsm.g:3560:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalEsm.g:3561:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalEsm.g:3561:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalEsm.g:3562:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_49);
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
                    	    break loop60;
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


    // $ANTLR start "entryRuleDmxOpConstructor"
    // InternalEsm.g:3585:1: entryRuleDmxOpConstructor returns [String current=null] : iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF ;
    public final String entryRuleDmxOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpConstructor = null;


        try {
            // InternalEsm.g:3585:56: (iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF )
            // InternalEsm.g:3586:2: iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF
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
    // InternalEsm.g:3592:1: ruleDmxOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:3598:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalEsm.g:3599:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalEsm.g:3599:2: (kw= 'NEW' | kw= 'new' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                alt62=1;
            }
            else if ( (LA62_0==55) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalEsm.g:3600:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:3606:3: kw= 'new'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDmxContextReference"
    // InternalEsm.g:3615:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalEsm.g:3615:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalEsm.g:3616:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalEsm.g:3622:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalEsm.g:3628:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalEsm.g:3629:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalEsm.g:3629:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalEsm.g:3630:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalEsm.g:3630:3: ()
            // InternalEsm.g:3631:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:3637:3: ( (otherlv_1= RULE_ID ) )
            // InternalEsm.g:3638:4: (otherlv_1= RULE_ID )
            {
            // InternalEsm.g:3638:4: (otherlv_1= RULE_ID )
            // InternalEsm.g:3639:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalEsm.g:3650:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==48) ) {
                alt63=1;
            }
            else if ( (LA63_0==47) ) {
                int LA63_2 = input.LA(2);

                if ( (LA63_2==56) ) {
                    alt63=2;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalEsm.g:3651:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalEsm.g:3651:4: ( (lv_before_2_0= '@before' ) )
                    // InternalEsm.g:3652:5: (lv_before_2_0= '@before' )
                    {
                    // InternalEsm.g:3652:5: (lv_before_2_0= '@before' )
                    // InternalEsm.g:3653:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
                    // InternalEsm.g:3666:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalEsm.g:3666:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalEsm.g:3667:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalEsm.g:3671:5: ( (lv_all_4_0= 'all' ) )
                    // InternalEsm.g:3672:6: (lv_all_4_0= 'all' )
                    {
                    // InternalEsm.g:3672:6: (lv_all_4_0= 'all' )
                    // InternalEsm.g:3673:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3691:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalEsm.g:3691:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalEsm.g:3692:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalEsm.g:3698:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalEsm.g:3704:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalEsm.g:3705:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalEsm.g:3705:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalEsm.g:3706:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalEsm.g:3706:3: ()
            // InternalEsm.g:3707:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalEsm.g:3717:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalEsm.g:3718:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalEsm.g:3718:4: (lv_if_2_0= ruleDExpression )
            // InternalEsm.g:3719:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_3=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalEsm.g:3740:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalEsm.g:3741:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalEsm.g:3741:4: (lv_then_4_0= ruleDExpression )
            // InternalEsm.g:3742:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            // InternalEsm.g:3759:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==59) && (synpred13_InternalEsm())) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalEsm.g:3760:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalEsm.g:3760:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalEsm.g:3761:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalEsm.g:3767:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalEsm.g:3768:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalEsm.g:3768:5: (lv_else_6_0= ruleDExpression )
                    // InternalEsm.g:3769:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
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

            otherlv_7=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3795:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalEsm.g:3795:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalEsm.g:3796:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalEsm.g:3802:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalEsm.g:3808:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalEsm.g:3809:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalEsm.g:3809:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46||LA65_0==70||LA65_0==114) ) {
                alt65=1;
            }
            else if ( (LA65_0==40) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalEsm.g:3810:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalEsm.g:3810:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalEsm.g:3811:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalEsm.g:3811:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalEsm.g:3812:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalEsm.g:3830:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalEsm.g:3830:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalEsm.g:3831:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalEsm.g:3835:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalEsm.g:3836:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalEsm.g:3836:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalEsm.g:3837:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_66); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,61,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalEsm.g:3857:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalEsm.g:3858:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalEsm.g:3858:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalEsm.g:3859:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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

                    otherlv_5=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3885:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalEsm.g:3885:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalEsm.g:3886:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalEsm.g:3892:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalEsm.g:3898:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalEsm.g:3899:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalEsm.g:3899:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_NATURAL) ) {
                alt66=1;
            }
            else if ( (LA66_0==46) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalEsm.g:3900:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalEsm.g:3908:3: kw= '*'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3917:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalEsm.g:3917:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalEsm.g:3918:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalEsm.g:3924:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEsm.g:3930:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalEsm.g:3931:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalEsm.g:3931:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalEsm.g:3932:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalEsm.g:3932:3: ()
            // InternalEsm.g:3933:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:3939:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt67=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt67=1;
                }
                break;
            case 63:
                {
                alt67=2;
                }
                break;
            case 64:
                {
                alt67=3;
                }
                break;
            case 65:
                {
                alt67=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalEsm.g:3940:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalEsm.g:3940:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalEsm.g:3941:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalEsm.g:3941:5: (lv_value_1_0= 'TRUE' )
                    // InternalEsm.g:3942:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
                    // InternalEsm.g:3955:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalEsm.g:3955:4: ( (lv_value_2_0= 'true' ) )
                    // InternalEsm.g:3956:5: (lv_value_2_0= 'true' )
                    {
                    // InternalEsm.g:3956:5: (lv_value_2_0= 'true' )
                    // InternalEsm.g:3957:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
                    // InternalEsm.g:3970:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalEsm.g:3975:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:3984:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalEsm.g:3984:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalEsm.g:3985:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalEsm.g:3991:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalEsm.g:3997:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalEsm.g:3998:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalEsm.g:3998:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalEsm.g:3999:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalEsm.g:3999:3: ()
            // InternalEsm.g:4000:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4006:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalEsm.g:4007:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalEsm.g:4007:4: (lv_value_1_0= RULE_NATURAL )
            // InternalEsm.g:4008:5: lv_value_1_0= RULE_NATURAL
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
    // InternalEsm.g:4028:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalEsm.g:4028:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalEsm.g:4029:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalEsm.g:4035:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:4041:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalEsm.g:4042:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalEsm.g:4042:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalEsm.g:4043:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalEsm.g:4043:3: ()
            // InternalEsm.g:4044:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4050:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalEsm.g:4051:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalEsm.g:4051:4: (lv_value_1_0= ruleDECIMAL )
            // InternalEsm.g:4052:5: lv_value_1_0= ruleDECIMAL
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
    // InternalEsm.g:4073:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalEsm.g:4073:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalEsm.g:4074:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalEsm.g:4080:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalEsm.g:4086:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEsm.g:4087:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEsm.g:4087:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEsm.g:4088:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalEsm.g:4088:3: ()
            // InternalEsm.g:4089:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4095:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEsm.g:4096:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEsm.g:4096:4: (lv_value_1_0= RULE_STRING )
            // InternalEsm.g:4097:5: lv_value_1_0= RULE_STRING
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
    // InternalEsm.g:4117:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalEsm.g:4117:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalEsm.g:4118:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalEsm.g:4124:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEsm.g:4130:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalEsm.g:4131:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalEsm.g:4131:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalEsm.g:4132:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalEsm.g:4132:3: ()
            // InternalEsm.g:4133:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEsm.g:4139:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==66) ) {
                alt68=1;
            }
            else if ( (LA68_0==67) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalEsm.g:4140:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEsm.g:4145:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4154:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalEsm.g:4154:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalEsm.g:4155:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalEsm.g:4161:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalEsm.g:4167:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalEsm.g:4168:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalEsm.g:4168:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalEsm.g:4169:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,47,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalEsm.g:4188:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=68 && LA71_0<=69)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalEsm.g:4189:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalEsm.g:4189:4: (kw= 'E' | kw= 'e' )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==68) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==69) ) {
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
                            // InternalEsm.g:4190:5: kw= 'E'
                            {
                            kw=(Token)match(input,68,FOLLOW_70); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalEsm.g:4196:5: kw= 'e'
                            {
                            kw=(Token)match(input,69,FOLLOW_70); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEsm.g:4202:4: (kw= '+' | kw= '-' )?
                    int alt70=3;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==70) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==71) ) {
                        alt70=2;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalEsm.g:4203:5: kw= '+'
                            {
                            kw=(Token)match(input,70,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalEsm.g:4209:5: kw= '-'
                            {
                            kw=(Token)match(input,71,FOLLOW_65); if (state.failed) return current;
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
    // InternalEsm.g:4227:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalEsm.g:4227:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalEsm.g:4228:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalEsm.g:4234:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalEsm.g:4240:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalEsm.g:4241:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalEsm.g:4241:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalEsm.g:4242:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_71);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEsm.g:4252:3: (kw= '.*' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==72) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalEsm.g:4253:4: kw= '.*'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4263:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalEsm.g:4263:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalEsm.g:4264:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalEsm.g:4270:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEsm.g:4276:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEsm.g:4277:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEsm.g:4277:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEsm.g:4278:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalEsm.g:4285:3: (kw= '.' this_ID_2= RULE_ID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==47) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalEsm.g:4286:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // InternalEsm.g:4303:1: ruleEsmStateKind returns [Enumerator current=null] : ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) ) ;
    public final Enumerator ruleEsmStateKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEsm.g:4309:2: ( ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) ) )
            // InternalEsm.g:4310:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) )
            {
            // InternalEsm.g:4310:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==73) ) {
                alt74=1;
            }
            else if ( (LA74_0==74) ) {
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
                    // InternalEsm.g:4311:3: (enumLiteral_0= 'initial' )
                    {
                    // InternalEsm.g:4311:3: (enumLiteral_0= 'initial' )
                    // InternalEsm.g:4312:4: enumLiteral_0= 'initial'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmStateKindAccess().getINITIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEsmStateKindAccess().getINITIALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4319:3: (enumLiteral_1= 'final' )
                    {
                    // InternalEsm.g:4319:3: (enumLiteral_1= 'final' )
                    // InternalEsm.g:4320:4: enumLiteral_1= 'final'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4330:1: ruleEsmLayoutDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'down' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'up' ) | (enumLiteral_3= 'right' ) ) ;
    public final Enumerator ruleEsmLayoutDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEsm.g:4336:2: ( ( (enumLiteral_0= 'down' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'up' ) | (enumLiteral_3= 'right' ) ) )
            // InternalEsm.g:4337:2: ( (enumLiteral_0= 'down' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'up' ) | (enumLiteral_3= 'right' ) )
            {
            // InternalEsm.g:4337:2: ( (enumLiteral_0= 'down' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'up' ) | (enumLiteral_3= 'right' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt75=1;
                }
                break;
            case 76:
                {
                alt75=2;
                }
                break;
            case 77:
                {
                alt75=3;
                }
                break;
            case 78:
                {
                alt75=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalEsm.g:4338:3: (enumLiteral_0= 'down' )
                    {
                    // InternalEsm.g:4338:3: (enumLiteral_0= 'down' )
                    // InternalEsm.g:4339:4: enumLiteral_0= 'down'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmLayoutDirectionAccess().getDOWNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEsmLayoutDirectionAccess().getDOWNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4346:3: (enumLiteral_1= 'left' )
                    {
                    // InternalEsm.g:4346:3: (enumLiteral_1= 'left' )
                    // InternalEsm.g:4347:4: enumLiteral_1= 'left'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmLayoutDirectionAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEsmLayoutDirectionAccess().getLEFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4354:3: (enumLiteral_2= 'up' )
                    {
                    // InternalEsm.g:4354:3: (enumLiteral_2= 'up' )
                    // InternalEsm.g:4355:4: enumLiteral_2= 'up'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEsmLayoutDirectionAccess().getUPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEsmLayoutDirectionAccess().getUPEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4362:3: (enumLiteral_3= 'right' )
                    {
                    // InternalEsm.g:4362:3: (enumLiteral_3= 'right' )
                    // InternalEsm.g:4363:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4373:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalEsm.g:4379:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalEsm.g:4380:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalEsm.g:4380:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt76=11;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt76=1;
                }
                break;
            case 80:
                {
                alt76=2;
                }
                break;
            case 81:
                {
                alt76=3;
                }
                break;
            case 82:
                {
                alt76=4;
                }
                break;
            case 83:
                {
                alt76=5;
                }
                break;
            case 84:
                {
                alt76=6;
                }
                break;
            case 85:
                {
                alt76=7;
                }
                break;
            case 86:
                {
                alt76=8;
                }
                break;
            case 87:
                {
                alt76=9;
                }
                break;
            case 88:
                {
                alt76=10;
                }
                break;
            case 89:
                {
                alt76=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalEsm.g:4381:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalEsm.g:4381:3: (enumLiteral_0= 'VOID' )
                    // InternalEsm.g:4382:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4389:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalEsm.g:4389:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalEsm.g:4390:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4397:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalEsm.g:4397:3: (enumLiteral_2= 'NUMBER' )
                    // InternalEsm.g:4398:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4405:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalEsm.g:4405:3: (enumLiteral_3= 'TEXT' )
                    // InternalEsm.g:4406:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEsm.g:4413:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalEsm.g:4413:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalEsm.g:4414:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEsm.g:4421:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalEsm.g:4421:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalEsm.g:4422:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEsm.g:4429:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalEsm.g:4429:3: (enumLiteral_6= 'STATE' )
                    // InternalEsm.g:4430:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEsm.g:4437:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalEsm.g:4437:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalEsm.g:4438:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEsm.g:4445:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalEsm.g:4445:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalEsm.g:4446:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEsm.g:4453:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalEsm.g:4453:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalEsm.g:4454:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEsm.g:4461:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalEsm.g:4461:3: (enumLiteral_10= 'SERVICE' )
                    // InternalEsm.g:4462:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4472:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEsm.g:4478:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalEsm.g:4479:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalEsm.g:4479:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt77=1;
                }
                break;
            case 91:
                {
                alt77=2;
                }
                break;
            case 92:
                {
                alt77=3;
                }
                break;
            case 93:
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
                    // InternalEsm.g:4480:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalEsm.g:4480:3: (enumLiteral_0= 'OR' )
                    // InternalEsm.g:4481:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4488:3: (enumLiteral_1= 'or' )
                    {
                    // InternalEsm.g:4488:3: (enumLiteral_1= 'or' )
                    // InternalEsm.g:4489:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4496:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalEsm.g:4496:3: (enumLiteral_2= 'XOR' )
                    // InternalEsm.g:4497:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4504:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalEsm.g:4504:3: (enumLiteral_3= 'xor' )
                    // InternalEsm.g:4505:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4515:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEsm.g:4521:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalEsm.g:4522:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalEsm.g:4522:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==94) ) {
                alt78=1;
            }
            else if ( (LA78_0==95) ) {
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
                    // InternalEsm.g:4523:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalEsm.g:4523:3: (enumLiteral_0= 'AND' )
                    // InternalEsm.g:4524:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4531:3: (enumLiteral_1= 'and' )
                    {
                    // InternalEsm.g:4531:3: (enumLiteral_1= 'and' )
                    // InternalEsm.g:4532:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4542:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEsm.g:4548:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalEsm.g:4549:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalEsm.g:4549:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt79=1;
                }
                break;
            case 97:
                {
                alt79=2;
                }
                break;
            case 98:
                {
                alt79=3;
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
                    // InternalEsm.g:4550:3: (enumLiteral_0= '=' )
                    {
                    // InternalEsm.g:4550:3: (enumLiteral_0= '=' )
                    // InternalEsm.g:4551:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4558:3: (enumLiteral_1= '!=' )
                    {
                    // InternalEsm.g:4558:3: (enumLiteral_1= '!=' )
                    // InternalEsm.g:4559:4: enumLiteral_1= '!='
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
                    // InternalEsm.g:4566:3: (enumLiteral_2= '<>' )
                    {
                    // InternalEsm.g:4566:3: (enumLiteral_2= '<>' )
                    // InternalEsm.g:4567:4: enumLiteral_2= '<>'
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
    // InternalEsm.g:4577:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalEsm.g:4583:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalEsm.g:4584:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalEsm.g:4584:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt80=6;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt80=1;
                }
                break;
            case 100:
                {
                alt80=2;
                }
                break;
            case 101:
                {
                alt80=3;
                }
                break;
            case 102:
                {
                alt80=4;
                }
                break;
            case 103:
                {
                alt80=5;
                }
                break;
            case 104:
                {
                alt80=6;
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
                    // InternalEsm.g:4585:3: (enumLiteral_0= '<' )
                    {
                    // InternalEsm.g:4585:3: (enumLiteral_0= '<' )
                    // InternalEsm.g:4586:4: enumLiteral_0= '<'
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
                    // InternalEsm.g:4593:3: (enumLiteral_1= '<=' )
                    {
                    // InternalEsm.g:4593:3: (enumLiteral_1= '<=' )
                    // InternalEsm.g:4594:4: enumLiteral_1= '<='
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
                    // InternalEsm.g:4601:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalEsm.g:4601:3: (enumLiteral_2= '\\u2264' )
                    // InternalEsm.g:4602:4: enumLiteral_2= '\\u2264'
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
                    // InternalEsm.g:4609:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEsm.g:4609:3: (enumLiteral_3= '>=' )
                    // InternalEsm.g:4610:4: enumLiteral_3= '>='
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
                    // InternalEsm.g:4617:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalEsm.g:4617:3: (enumLiteral_4= '\\u2265' )
                    // InternalEsm.g:4618:4: enumLiteral_4= '\\u2265'
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
                    // InternalEsm.g:4625:3: (enumLiteral_5= '>' )
                    {
                    // InternalEsm.g:4625:3: (enumLiteral_5= '>' )
                    // InternalEsm.g:4626:4: enumLiteral_5= '>'
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
    // InternalEsm.g:4636:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEsm.g:4642:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalEsm.g:4643:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalEsm.g:4643:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt81=5;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt81=1;
                }
                break;
            case 39:
                {
                alt81=2;
                }
                break;
            case 61:
                {
                alt81=3;
                }
                break;
            case 106:
                {
                alt81=4;
                }
                break;
            case 107:
                {
                alt81=5;
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
                    // InternalEsm.g:4644:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalEsm.g:4644:3: (enumLiteral_0= 'IN' )
                    // InternalEsm.g:4645:4: enumLiteral_0= 'IN'
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
                    // InternalEsm.g:4652:3: (enumLiteral_1= 'in' )
                    {
                    // InternalEsm.g:4652:3: (enumLiteral_1= 'in' )
                    // InternalEsm.g:4653:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4660:3: (enumLiteral_2= '..' )
                    {
                    // InternalEsm.g:4660:3: (enumLiteral_2= '..' )
                    // InternalEsm.g:4661:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEsm.g:4668:3: (enumLiteral_3= '->' )
                    {
                    // InternalEsm.g:4668:3: (enumLiteral_3= '->' )
                    // InternalEsm.g:4669:4: enumLiteral_3= '->'
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
                    // InternalEsm.g:4676:3: (enumLiteral_4= '=>' )
                    {
                    // InternalEsm.g:4676:3: (enumLiteral_4= '=>' )
                    // InternalEsm.g:4677:4: enumLiteral_4= '=>'
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
    // InternalEsm.g:4687:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEsm.g:4693:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalEsm.g:4694:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalEsm.g:4694:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==70) ) {
                alt82=1;
            }
            else if ( (LA82_0==71) ) {
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
                    // InternalEsm.g:4695:3: (enumLiteral_0= '+' )
                    {
                    // InternalEsm.g:4695:3: (enumLiteral_0= '+' )
                    // InternalEsm.g:4696:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4703:3: (enumLiteral_1= '-' )
                    {
                    // InternalEsm.g:4703:3: (enumLiteral_1= '-' )
                    // InternalEsm.g:4704:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalEsm.g:4714:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEsm.g:4720:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalEsm.g:4721:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalEsm.g:4721:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt83=1;
                }
                break;
            case 108:
                {
                alt83=2;
                }
                break;
            case 109:
                {
                alt83=3;
                }
                break;
            case 110:
                {
                alt83=4;
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
                    // InternalEsm.g:4722:3: (enumLiteral_0= '*' )
                    {
                    // InternalEsm.g:4722:3: (enumLiteral_0= '*' )
                    // InternalEsm.g:4723:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4730:3: (enumLiteral_1= '/' )
                    {
                    // InternalEsm.g:4730:3: (enumLiteral_1= '/' )
                    // InternalEsm.g:4731:4: enumLiteral_1= '/'
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
                    // InternalEsm.g:4738:3: (enumLiteral_2= '**' )
                    {
                    // InternalEsm.g:4738:3: (enumLiteral_2= '**' )
                    // InternalEsm.g:4739:4: enumLiteral_2= '**'
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
                    // InternalEsm.g:4746:3: (enumLiteral_3= '%' )
                    {
                    // InternalEsm.g:4746:3: (enumLiteral_3= '%' )
                    // InternalEsm.g:4747:4: enumLiteral_3= '%'
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
    // InternalEsm.g:4757:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEsm.g:4763:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalEsm.g:4764:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalEsm.g:4764:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt84=1;
                }
                break;
            case 71:
                {
                alt84=2;
                }
                break;
            case 111:
                {
                alt84=3;
                }
                break;
            case 112:
                {
                alt84=4;
                }
                break;
            case 113:
                {
                alt84=5;
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
                    // InternalEsm.g:4765:3: (enumLiteral_0= '+' )
                    {
                    // InternalEsm.g:4765:3: (enumLiteral_0= '+' )
                    // InternalEsm.g:4766:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEsm.g:4773:3: (enumLiteral_1= '-' )
                    {
                    // InternalEsm.g:4773:3: (enumLiteral_1= '-' )
                    // InternalEsm.g:4774:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4781:3: (enumLiteral_2= '!' )
                    {
                    // InternalEsm.g:4781:3: (enumLiteral_2= '!' )
                    // InternalEsm.g:4782:4: enumLiteral_2= '!'
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
                    // InternalEsm.g:4789:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalEsm.g:4789:3: (enumLiteral_3= 'NOT' )
                    // InternalEsm.g:4790:4: enumLiteral_3= 'NOT'
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
                    // InternalEsm.g:4797:3: (enumLiteral_4= 'not' )
                    {
                    // InternalEsm.g:4797:3: (enumLiteral_4= 'not' )
                    // InternalEsm.g:4798:4: enumLiteral_4= 'not'
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
    // InternalEsm.g:4808:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEsm.g:4814:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalEsm.g:4815:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalEsm.g:4815:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt85=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt85=1;
                }
                break;
            case 70:
                {
                alt85=2;
                }
                break;
            case 46:
                {
                alt85=3;
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
                    // InternalEsm.g:4816:3: (enumLiteral_0= '?' )
                    {
                    // InternalEsm.g:4816:3: (enumLiteral_0= '?' )
                    // InternalEsm.g:4817:4: enumLiteral_0= '?'
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
                    // InternalEsm.g:4824:3: (enumLiteral_1= '+' )
                    {
                    // InternalEsm.g:4824:3: (enumLiteral_1= '+' )
                    // InternalEsm.g:4825:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEsm.g:4832:3: (enumLiteral_2= '*' )
                    {
                    // InternalEsm.g:4832:3: (enumLiteral_2= '*' )
                    // InternalEsm.g:4833:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
        // InternalEsm.g:2114:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalEsm.g:2114:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalEsm.g:2114:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalEsm.g:2115:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalEsm.g:2115:7: ()
        // InternalEsm.g:2116:7: 
        {
        }

        match(input,47,FOLLOW_4); if (state.failed) return ;
        // InternalEsm.g:2118:7: ( ( RULE_ID ) )
        // InternalEsm.g:2119:8: ( RULE_ID )
        {
        // InternalEsm.g:2119:8: ( RULE_ID )
        // InternalEsm.g:2120:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_44); if (state.failed) return ;

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
        // InternalEsm.g:2183:6: ( ( () '.' ) )
        // InternalEsm.g:2183:7: ( () '.' )
        {
        // InternalEsm.g:2183:7: ( () '.' )
        // InternalEsm.g:2184:7: () '.'
        {
        // InternalEsm.g:2184:7: ()
        // InternalEsm.g:2185:7: 
        {
        }

        match(input,47,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEsm

    // $ANTLR start synpred3_InternalEsm
    public final void synpred3_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2219:8: ( ( '(' ) )
        // InternalEsm.g:2219:9: ( '(' )
        {
        // InternalEsm.g:2219:9: ( '(' )
        // InternalEsm.g:2220:9: '('
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalEsm

    // $ANTLR start synpred4_InternalEsm
    public final void synpred4_InternalEsm_fragment() throws RecognitionException {   
        // InternalEsm.g:2515:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalEsm.g:2515:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalEsm.g:2515:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalEsm.g:2516:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalEsm.g:2516:6: ()
        // InternalEsm.g:2517:6: 
        {
        }

        // InternalEsm.g:2518:6: ( ( ruleDmxOpOr ) )
        // InternalEsm.g:2519:7: ( ruleDmxOpOr )
        {
        // InternalEsm.g:2519:7: ( ruleDmxOpOr )
        // InternalEsm.g:2520:8: ruleDmxOpOr
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
        // InternalEsm.g:2603:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalEsm.g:2603:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalEsm.g:2603:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalEsm.g:2604:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalEsm.g:2604:6: ()
        // InternalEsm.g:2605:6: 
        {
        }

        // InternalEsm.g:2606:6: ( ( ruleDmxOpAnd ) )
        // InternalEsm.g:2607:7: ( ruleDmxOpAnd )
        {
        // InternalEsm.g:2607:7: ( ruleDmxOpAnd )
        // InternalEsm.g:2608:8: ruleDmxOpAnd
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
        // InternalEsm.g:2691:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalEsm.g:2691:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalEsm.g:2691:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalEsm.g:2692:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalEsm.g:2692:6: ()
        // InternalEsm.g:2693:6: 
        {
        }

        // InternalEsm.g:2694:6: ( ( ruleDmxOpEquality ) )
        // InternalEsm.g:2695:7: ( ruleDmxOpEquality )
        {
        // InternalEsm.g:2695:7: ( ruleDmxOpEquality )
        // InternalEsm.g:2696:8: ruleDmxOpEquality
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
        // InternalEsm.g:2780:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalEsm.g:2780:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalEsm.g:2780:7: ( () ruleDmxOpInstanceOf )
        // InternalEsm.g:2781:7: () ruleDmxOpInstanceOf
        {
        // InternalEsm.g:2781:7: ()
        // InternalEsm.g:2782:7: 
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
        // InternalEsm.g:2820:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalEsm.g:2820:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalEsm.g:2820:7: ( () ( ( ruleOpCompare ) ) )
        // InternalEsm.g:2821:7: () ( ( ruleOpCompare ) )
        {
        // InternalEsm.g:2821:7: ()
        // InternalEsm.g:2822:7: 
        {
        }

        // InternalEsm.g:2823:7: ( ( ruleOpCompare ) )
        // InternalEsm.g:2824:8: ( ruleOpCompare )
        {
        // InternalEsm.g:2824:8: ( ruleOpCompare )
        // InternalEsm.g:2825:9: ruleOpCompare
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
        // InternalEsm.g:2939:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalEsm.g:2939:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalEsm.g:2939:6: ( () ( ( ruleOpOther ) ) )
        // InternalEsm.g:2940:6: () ( ( ruleOpOther ) )
        {
        // InternalEsm.g:2940:6: ()
        // InternalEsm.g:2941:6: 
        {
        }

        // InternalEsm.g:2942:6: ( ( ruleOpOther ) )
        // InternalEsm.g:2943:7: ( ruleOpOther )
        {
        // InternalEsm.g:2943:7: ( ruleOpOther )
        // InternalEsm.g:2944:8: ruleOpOther
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
        // InternalEsm.g:3027:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalEsm.g:3027:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalEsm.g:3027:6: ( () ( ( ruleOpAdd ) ) )
        // InternalEsm.g:3028:6: () ( ( ruleOpAdd ) )
        {
        // InternalEsm.g:3028:6: ()
        // InternalEsm.g:3029:6: 
        {
        }

        // InternalEsm.g:3030:6: ( ( ruleOpAdd ) )
        // InternalEsm.g:3031:7: ( ruleOpAdd )
        {
        // InternalEsm.g:3031:7: ( ruleOpAdd )
        // InternalEsm.g:3032:8: ruleOpAdd
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
        // InternalEsm.g:3115:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalEsm.g:3115:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalEsm.g:3115:6: ( () ( ( ruleOpMulti ) ) )
        // InternalEsm.g:3116:6: () ( ( ruleOpMulti ) )
        {
        // InternalEsm.g:3116:6: ()
        // InternalEsm.g:3117:6: 
        {
        }

        // InternalEsm.g:3118:6: ( ( ruleOpMulti ) )
        // InternalEsm.g:3119:7: ( ruleOpMulti )
        {
        // InternalEsm.g:3119:7: ( ruleOpMulti )
        // InternalEsm.g:3120:8: ruleOpMulti
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
        // InternalEsm.g:3278:5: ( ( () ruleDmxOpCast ) )
        // InternalEsm.g:3278:6: ( () ruleDmxOpCast )
        {
        // InternalEsm.g:3278:6: ( () ruleDmxOpCast )
        // InternalEsm.g:3279:6: () ruleDmxOpCast
        {
        // InternalEsm.g:3279:6: ()
        // InternalEsm.g:3280:6: 
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
        // InternalEsm.g:3761:5: ( 'else' )
        // InternalEsm.g:3761:6: 'else'
        {
        match(input,59,FOLLOW_2); if (state.failed) return ;

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


    protected DFA51 dfa51 = new DFA51(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\7\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\156\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\1\1\2\1\3\1\5\1\7\1\0\1\4\1\6\2\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\12\uffff\1\1\4\uffff\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\2\1\3\uffff\1\2\1\3\1\1\4\uffff\4\1\10\uffff\2\1\1\uffff\2\1\17\uffff\11\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2777:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_7 = input.LA(1);

                         
                        int index51_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEsm()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalEsm()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_4 = input.LA(1);

                         
                        int index51_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_8 = input.LA(1);

                         
                        int index51_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_5 = input.LA(1);

                         
                        int index51_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_9 = input.LA(1);

                         
                        int index51_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_6 = input.LA(1);

                         
                        int index51_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalEsm()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001A880000L,0x0000000000000600L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000005A880000L,0x0000000000000600L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000600L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xC200010000000670L,0x00038000000000CFL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000410000000002L,0x0004000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FF8000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L,0x0000000003FF8000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xC200010000000610L,0x00038000000000CFL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001810000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xC200030000000610L,0x00038000000000CFL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x000000003C000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000700000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0018000000000002L,0x000001F800000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000008000000002L,0x00000E0000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000400000000002L,0x0000700000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020000200000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xC200030000000670L,0x00038000000000CFL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000400000000200L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000200L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});

}