package com.mimacom.ddd.sm.sim.parser.antlr.internal;

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
import com.mimacom.ddd.sm.sim.services.SimGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSimParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'information'", "'model'", "'generate'", "'as'", "'and'", "'to'", "'extends'", "':'", "'grab'", "'domain'", "'aggregate'", "'{'", "'}'", "'primitive'", "'ditch'", "'enumeration'", "','", "'alias'", "'root'", "'entity'", "'morph'", "'fuse'", "'detail'", "'abstract'", "'reference'", "'composite'", "'attribute'", "'query'", "'('", "'*'", "')'", "'returns'", "'constraint'", "'redefines'", "'derived'", "'contains'", "'key'", "'import'", "'test'", "'context'", "'in'", "'archetype'", "'is'", "'filter'", "'with'", "'.'", "'@before'", "':='", "'|'", "'ISA'", "'isa'", "'AS'", "'NEW'", "'new'", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'base'", "'interface'", "'core'", "'nonabstract'", "'nonroot'", "'references'", "'inverse'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=14;
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


        public InternalSimParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSim.g"; }



     	private SimGrammarAccess grammarAccess;

        public InternalSimParser(TokenStream input, SimGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SInformationModel";
       	}

       	@Override
       	protected SimGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSInformationModel"
    // InternalSim.g:65:1: entryRuleSInformationModel returns [EObject current=null] : iv_ruleSInformationModel= ruleSInformationModel EOF ;
    public final EObject entryRuleSInformationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSInformationModel = null;


        try {
            // InternalSim.g:65:58: (iv_ruleSInformationModel= ruleSInformationModel EOF )
            // InternalSim.g:66:2: iv_ruleSInformationModel= ruleSInformationModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSInformationModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSInformationModel=ruleSInformationModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSInformationModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSInformationModel"


    // $ANTLR start "ruleSInformationModel"
    // InternalSim.g:72:1: ruleSInformationModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleDImport ) )* ( (lv_kind_1_0= ruleSInformationModelKind ) ) otherlv_2= 'information' otherlv_3= 'model' ( (lv_name_4_0= ruleDQualifiedName ) ) ( (lv_generate_5_0= 'generate' ) )? ( (lv_description_6_0= ruleDRichText ) )? ( (lv_queries_7_0= ruleSCoreQuery ) )* ( ( (lv_types_8_0= ruleType ) ) | ( (lv_aggregates_9_0= ruleAggregate ) ) | ( (lv_domainProxies_10_0= ruleDomain ) ) )* ) ;
    public final EObject ruleSInformationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_generate_5_0=null;
        EObject lv_imports_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_description_6_0 = null;

        EObject lv_queries_7_0 = null;

        EObject lv_types_8_0 = null;

        EObject lv_aggregates_9_0 = null;

        EObject lv_domainProxies_10_0 = null;



        	enterRule();

        try {
            // InternalSim.g:78:2: ( ( ( (lv_imports_0_0= ruleDImport ) )* ( (lv_kind_1_0= ruleSInformationModelKind ) ) otherlv_2= 'information' otherlv_3= 'model' ( (lv_name_4_0= ruleDQualifiedName ) ) ( (lv_generate_5_0= 'generate' ) )? ( (lv_description_6_0= ruleDRichText ) )? ( (lv_queries_7_0= ruleSCoreQuery ) )* ( ( (lv_types_8_0= ruleType ) ) | ( (lv_aggregates_9_0= ruleAggregate ) ) | ( (lv_domainProxies_10_0= ruleDomain ) ) )* ) )
            // InternalSim.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* ( (lv_kind_1_0= ruleSInformationModelKind ) ) otherlv_2= 'information' otherlv_3= 'model' ( (lv_name_4_0= ruleDQualifiedName ) ) ( (lv_generate_5_0= 'generate' ) )? ( (lv_description_6_0= ruleDRichText ) )? ( (lv_queries_7_0= ruleSCoreQuery ) )* ( ( (lv_types_8_0= ruleType ) ) | ( (lv_aggregates_9_0= ruleAggregate ) ) | ( (lv_domainProxies_10_0= ruleDomain ) ) )* )
            {
            // InternalSim.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* ( (lv_kind_1_0= ruleSInformationModelKind ) ) otherlv_2= 'information' otherlv_3= 'model' ( (lv_name_4_0= ruleDQualifiedName ) ) ( (lv_generate_5_0= 'generate' ) )? ( (lv_description_6_0= ruleDRichText ) )? ( (lv_queries_7_0= ruleSCoreQuery ) )* ( ( (lv_types_8_0= ruleType ) ) | ( (lv_aggregates_9_0= ruleAggregate ) ) | ( (lv_domainProxies_10_0= ruleDomain ) ) )* )
            // InternalSim.g:80:3: ( (lv_imports_0_0= ruleDImport ) )* ( (lv_kind_1_0= ruleSInformationModelKind ) ) otherlv_2= 'information' otherlv_3= 'model' ( (lv_name_4_0= ruleDQualifiedName ) ) ( (lv_generate_5_0= 'generate' ) )? ( (lv_description_6_0= ruleDRichText ) )? ( (lv_queries_7_0= ruleSCoreQuery ) )* ( ( (lv_types_8_0= ruleType ) ) | ( (lv_aggregates_9_0= ruleAggregate ) ) | ( (lv_domainProxies_10_0= ruleDomain ) ) )*
            {
            // InternalSim.g:80:3: ( (lv_imports_0_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==54) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSim.g:81:4: (lv_imports_0_0= ruleDImport )
            	    {
            	    // InternalSim.g:81:4: (lv_imports_0_0= ruleDImport )
            	    // InternalSim.g:82:5: lv_imports_0_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSInformationModelAccess().getImportsDImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
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

            // InternalSim.g:99:3: ( (lv_kind_1_0= ruleSInformationModelKind ) )
            // InternalSim.g:100:4: (lv_kind_1_0= ruleSInformationModelKind )
            {
            // InternalSim.g:100:4: (lv_kind_1_0= ruleSInformationModelKind )
            // InternalSim.g:101:5: lv_kind_1_0= ruleSInformationModelKind
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSInformationModelAccess().getKindSInformationModelKindEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_kind_1_0=ruleSInformationModelKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
              					}
              					set(
              						current,
              						"kind",
              						lv_kind_1_0,
              						"com.mimacom.ddd.sm.sim.Sim.SInformationModelKind");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSInformationModelAccess().getInformationKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSInformationModelAccess().getModelKeyword_3());
              		
            }
            // InternalSim.g:126:3: ( (lv_name_4_0= ruleDQualifiedName ) )
            // InternalSim.g:127:4: (lv_name_4_0= ruleDQualifiedName )
            {
            // InternalSim.g:127:4: (lv_name_4_0= ruleDQualifiedName )
            // InternalSim.g:128:5: lv_name_4_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSInformationModelAccess().getNameDQualifiedNameParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_name_4_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DQualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:145:3: ( (lv_generate_5_0= 'generate' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSim.g:146:4: (lv_generate_5_0= 'generate' )
                    {
                    // InternalSim.g:146:4: (lv_generate_5_0= 'generate' )
                    // InternalSim.g:147:5: lv_generate_5_0= 'generate'
                    {
                    lv_generate_5_0=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_generate_5_0, grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSInformationModelRule());
                      					}
                      					setWithLastConsumed(current, "generate", true, "generate");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:159:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_PLAIN_TEXT_ONLY && LA3_0<=RULE_PLAIN_TEXT_START)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSim.g:160:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalSim.g:160:4: (lv_description_6_0= ruleDRichText )
                    // InternalSim.g:161:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSInformationModelAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
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

            // InternalSim.g:178:3: ( (lv_queries_7_0= ruleSCoreQuery ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSim.g:179:4: (lv_queries_7_0= ruleSCoreQuery )
            	    {
            	    // InternalSim.g:179:4: (lv_queries_7_0= ruleSCoreQuery )
            	    // InternalSim.g:180:5: lv_queries_7_0= ruleSCoreQuery
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSInformationModelAccess().getQueriesSCoreQueryParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_queries_7_0=ruleSCoreQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"queries",
            	      						lv_queries_7_0,
            	      						"com.mimacom.ddd.sm.sim.Sim.SCoreQuery");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSim.g:197:3: ( ( (lv_types_8_0= ruleType ) ) | ( (lv_aggregates_9_0= ruleAggregate ) ) | ( (lv_domainProxies_10_0= ruleDomain ) ) )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    switch ( input.LA(2) ) {
                    case 27:
                        {
                        alt5=2;
                        }
                        break;
                    case 26:
                        {
                        alt5=3;
                        }
                        break;
                    case 30:
                    case 32:
                    case 35:
                    case 36:
                    case 39:
                        {
                        alt5=1;
                        }
                        break;

                    }

                    }
                    break;
                case 30:
                case 31:
                case 32:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                    {
                    alt5=1;
                    }
                    break;
                case 27:
                    {
                    alt5=2;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalSim.g:198:4: ( (lv_types_8_0= ruleType ) )
            	    {
            	    // InternalSim.g:198:4: ( (lv_types_8_0= ruleType ) )
            	    // InternalSim.g:199:5: (lv_types_8_0= ruleType )
            	    {
            	    // InternalSim.g:199:5: (lv_types_8_0= ruleType )
            	    // InternalSim.g:200:6: lv_types_8_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSInformationModelAccess().getTypesTypeParserRuleCall_8_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_types_8_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_8_0,
            	      							"com.mimacom.ddd.sm.sim.Sim.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:218:4: ( (lv_aggregates_9_0= ruleAggregate ) )
            	    {
            	    // InternalSim.g:218:4: ( (lv_aggregates_9_0= ruleAggregate ) )
            	    // InternalSim.g:219:5: (lv_aggregates_9_0= ruleAggregate )
            	    {
            	    // InternalSim.g:219:5: (lv_aggregates_9_0= ruleAggregate )
            	    // InternalSim.g:220:6: lv_aggregates_9_0= ruleAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSInformationModelAccess().getAggregatesAggregateParserRuleCall_8_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_aggregates_9_0=ruleAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_9_0,
            	      							"com.mimacom.ddd.sm.sim.Sim.Aggregate");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSim.g:238:4: ( (lv_domainProxies_10_0= ruleDomain ) )
            	    {
            	    // InternalSim.g:238:4: ( (lv_domainProxies_10_0= ruleDomain ) )
            	    // InternalSim.g:239:5: (lv_domainProxies_10_0= ruleDomain )
            	    {
            	    // InternalSim.g:239:5: (lv_domainProxies_10_0= ruleDomain )
            	    // InternalSim.g:240:6: lv_domainProxies_10_0= ruleDomain
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSInformationModelAccess().getDomainProxiesDomainParserRuleCall_8_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_domainProxies_10_0=ruleDomain();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"domainProxies",
            	      							lv_domainProxies_10_0,
            	      							"com.mimacom.ddd.sm.sim.Sim.Domain");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleSInformationModel"


    // $ANTLR start "entryRuleSGrabDomainRule"
    // InternalSim.g:262:1: entryRuleSGrabDomainRule returns [EObject current=null] : iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF ;
    public final EObject entryRuleSGrabDomainRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabDomainRule = null;


        try {
            // InternalSim.g:262:56: (iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF )
            // InternalSim.g:263:2: iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSGrabDomainRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSGrabDomainRule=ruleSGrabDomainRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSGrabDomainRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSGrabDomainRule"


    // $ANTLR start "ruleSGrabDomainRule"
    // InternalSim.g:269:1: ruleSGrabDomainRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleSGrabDomainRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:275:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalSim.g:276:2: ( ( ruleDQualifiedName ) )
            {
            // InternalSim.g:276:2: ( ( ruleDQualifiedName ) )
            // InternalSim.g:277:3: ( ruleDQualifiedName )
            {
            // InternalSim.g:277:3: ( ruleDQualifiedName )
            // InternalSim.g:278:4: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSGrabDomainRuleRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleSGrabDomainRule"


    // $ANTLR start "entryRuleSGrabAggregateRule"
    // InternalSim.g:295:1: entryRuleSGrabAggregateRule returns [EObject current=null] : iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF ;
    public final EObject entryRuleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabAggregateRule = null;


        try {
            // InternalSim.g:295:59: (iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF )
            // InternalSim.g:296:2: iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSGrabAggregateRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSGrabAggregateRule=ruleSGrabAggregateRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSGrabAggregateRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSGrabAggregateRule"


    // $ANTLR start "ruleSGrabAggregateRule"
    // InternalSim.g:302:1: ruleSGrabAggregateRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:308:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalSim.g:309:2: ( ( ruleDQualifiedName ) )
            {
            // InternalSim.g:309:2: ( ( ruleDQualifiedName ) )
            // InternalSim.g:310:3: ( ruleDQualifiedName )
            {
            // InternalSim.g:310:3: ( ruleDQualifiedName )
            // InternalSim.g:311:4: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSGrabAggregateRuleRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleSGrabAggregateRule"


    // $ANTLR start "entryRuleSGrabPrimitiveRule"
    // InternalSim.g:328:1: entryRuleSGrabPrimitiveRule returns [EObject current=null] : iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF ;
    public final EObject entryRuleSGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabPrimitiveRule = null;


        try {
            // InternalSim.g:328:59: (iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF )
            // InternalSim.g:329:2: iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSGrabPrimitiveRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSGrabPrimitiveRule=ruleSGrabPrimitiveRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSGrabPrimitiveRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSGrabPrimitiveRule"


    // $ANTLR start "ruleSGrabPrimitiveRule"
    // InternalSim.g:335:1: ruleSGrabPrimitiveRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:341:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:342:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:342:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:343:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:343:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:344:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:344:4: ( ruleDQualifiedName )
            // InternalSim.g:345:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabPrimitiveRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:359:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSim.g:360:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabPrimitiveRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:364:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:365:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:365:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:366:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabPrimitiveRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSGrabPrimitiveRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
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
    // $ANTLR end "ruleSGrabPrimitiveRule"


    // $ANTLR start "entryRuleSDitchPrimitiveRule"
    // InternalSim.g:387:1: entryRuleSDitchPrimitiveRule returns [EObject current=null] : iv_ruleSDitchPrimitiveRule= ruleSDitchPrimitiveRule EOF ;
    public final EObject entryRuleSDitchPrimitiveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchPrimitiveRule = null;


        try {
            // InternalSim.g:387:60: (iv_ruleSDitchPrimitiveRule= ruleSDitchPrimitiveRule EOF )
            // InternalSim.g:388:2: iv_ruleSDitchPrimitiveRule= ruleSDitchPrimitiveRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSDitchPrimitiveRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSDitchPrimitiveRule=ruleSDitchPrimitiveRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSDitchPrimitiveRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSDitchPrimitiveRule"


    // $ANTLR start "ruleSDitchPrimitiveRule"
    // InternalSim.g:394:1: ruleSDitchPrimitiveRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleSDitchPrimitiveRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:400:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalSim.g:401:2: ( ( ruleDQualifiedName ) )
            {
            // InternalSim.g:401:2: ( ( ruleDQualifiedName ) )
            // InternalSim.g:402:3: ( ruleDQualifiedName )
            {
            // InternalSim.g:402:3: ( ruleDQualifiedName )
            // InternalSim.g:403:4: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSDitchPrimitiveRuleRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSDitchPrimitiveRuleAccess().getSourceDPrimitiveCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleSDitchPrimitiveRule"


    // $ANTLR start "entryRuleSGrabEnumerationRule"
    // InternalSim.g:420:1: entryRuleSGrabEnumerationRule returns [EObject current=null] : iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF ;
    public final EObject entryRuleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationRule = null;


        try {
            // InternalSim.g:420:61: (iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF )
            // InternalSim.g:421:2: iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSGrabEnumerationRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSGrabEnumerationRule=ruleSGrabEnumerationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSGrabEnumerationRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSGrabEnumerationRule"


    // $ANTLR start "ruleSGrabEnumerationRule"
    // InternalSim.g:427:1: ruleSGrabEnumerationRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:433:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:434:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:434:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:435:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:435:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:436:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:436:4: ( ruleDQualifiedName )
            // InternalSim.g:437:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabEnumerationRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:451:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSim.g:452:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:456:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:457:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:457:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:458:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabEnumerationRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSGrabEnumerationRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
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
    // $ANTLR end "ruleSGrabEnumerationRule"


    // $ANTLR start "entryRuleSDitchEnumerationRule"
    // InternalSim.g:479:1: entryRuleSDitchEnumerationRule returns [EObject current=null] : iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF ;
    public final EObject entryRuleSDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationRule = null;


        try {
            // InternalSim.g:479:62: (iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF )
            // InternalSim.g:480:2: iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSDitchEnumerationRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSDitchEnumerationRule=ruleSDitchEnumerationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSDitchEnumerationRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSDitchEnumerationRule"


    // $ANTLR start "ruleSDitchEnumerationRule"
    // InternalSim.g:486:1: ruleSDitchEnumerationRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleSDitchEnumerationRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:492:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalSim.g:493:2: ( ( ruleDQualifiedName ) )
            {
            // InternalSim.g:493:2: ( ( ruleDQualifiedName ) )
            // InternalSim.g:494:3: ( ruleDQualifiedName )
            {
            // InternalSim.g:494:3: ( ruleDQualifiedName )
            // InternalSim.g:495:4: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSDitchEnumerationRuleRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleSDitchEnumerationRule"


    // $ANTLR start "entryRuleSGrabEnumerationLiteralRule"
    // InternalSim.g:512:1: entryRuleSGrabEnumerationLiteralRule returns [EObject current=null] : iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF ;
    public final EObject entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationLiteralRule = null;


        try {
            // InternalSim.g:512:68: (iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF )
            // InternalSim.g:513:2: iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSGrabEnumerationLiteralRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSGrabEnumerationLiteralRule=ruleSGrabEnumerationLiteralRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSGrabEnumerationLiteralRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSGrabEnumerationLiteralRule"


    // $ANTLR start "ruleSGrabEnumerationLiteralRule"
    // InternalSim.g:519:1: ruleSGrabEnumerationLiteralRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:525:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:526:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:526:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:527:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:527:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:528:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:528:4: (otherlv_0= RULE_ID )
            // InternalSim.g:529:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabEnumerationLiteralRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0());
              				
            }

            }


            }

            // InternalSim.g:540:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSim.g:541:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:545:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:546:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:546:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:547:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSGrabEnumerationLiteralRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
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
    // $ANTLR end "ruleSGrabEnumerationLiteralRule"


    // $ANTLR start "entryRuleSDitchEnumerationLiteralRule"
    // InternalSim.g:568:1: entryRuleSDitchEnumerationLiteralRule returns [EObject current=null] : iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF ;
    public final EObject entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationLiteralRule = null;


        try {
            // InternalSim.g:568:69: (iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF )
            // InternalSim.g:569:2: iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSDitchEnumerationLiteralRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSDitchEnumerationLiteralRule=ruleSDitchEnumerationLiteralRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSDitchEnumerationLiteralRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSDitchEnumerationLiteralRule"


    // $ANTLR start "ruleSDitchEnumerationLiteralRule"
    // InternalSim.g:575:1: ruleSDitchEnumerationLiteralRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:581:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:582:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:582:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:583:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:583:3: (otherlv_0= RULE_ID )
            // InternalSim.g:584:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSDitchEnumerationLiteralRuleRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0());
              			
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
    // $ANTLR end "ruleSDitchEnumerationLiteralRule"


    // $ANTLR start "entryRuleSGrabComplexTypeRule"
    // InternalSim.g:598:1: entryRuleSGrabComplexTypeRule returns [EObject current=null] : iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF ;
    public final EObject entryRuleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabComplexTypeRule = null;


        try {
            // InternalSim.g:598:61: (iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF )
            // InternalSim.g:599:2: iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSGrabComplexTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSGrabComplexTypeRule=ruleSGrabComplexTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSGrabComplexTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSGrabComplexTypeRule"


    // $ANTLR start "ruleSGrabComplexTypeRule"
    // InternalSim.g:605:1: ruleSGrabComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:611:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:612:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:612:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:613:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:613:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:614:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:614:4: ( ruleDQualifiedName )
            // InternalSim.g:615:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:629:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSim.g:630:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:634:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:635:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:635:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:636:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSGrabComplexTypeRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
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
    // $ANTLR end "ruleSGrabComplexTypeRule"


    // $ANTLR start "entryRuleSDitchComplexTypeRule"
    // InternalSim.g:657:1: entryRuleSDitchComplexTypeRule returns [EObject current=null] : iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF ;
    public final EObject entryRuleSDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchComplexTypeRule = null;


        try {
            // InternalSim.g:657:62: (iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF )
            // InternalSim.g:658:2: iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSDitchComplexTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSDitchComplexTypeRule=ruleSDitchComplexTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSDitchComplexTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSDitchComplexTypeRule"


    // $ANTLR start "ruleSDitchComplexTypeRule"
    // InternalSim.g:664:1: ruleSDitchComplexTypeRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleSDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:670:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalSim.g:671:2: ( ( ruleDQualifiedName ) )
            {
            // InternalSim.g:671:2: ( ( ruleDQualifiedName ) )
            // InternalSim.g:672:3: ( ruleDQualifiedName )
            {
            // InternalSim.g:672:3: ( ruleDQualifiedName )
            // InternalSim.g:673:4: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSDitchComplexTypeRuleRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleSDitchComplexTypeRule"


    // $ANTLR start "entryRuleSMorphComplexTypeRule"
    // InternalSim.g:690:1: entryRuleSMorphComplexTypeRule returns [EObject current=null] : iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF ;
    public final EObject entryRuleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphComplexTypeRule = null;


        try {
            // InternalSim.g:690:62: (iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF )
            // InternalSim.g:691:2: iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSMorphComplexTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSMorphComplexTypeRule=ruleSMorphComplexTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSMorphComplexTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSMorphComplexTypeRule"


    // $ANTLR start "ruleSMorphComplexTypeRule"
    // InternalSim.g:697:1: ruleSMorphComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] ) ;
    public final EObject ruleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject this_ChangeComplexType_1 = null;



        	enterRule();

        try {
            // InternalSim.g:703:2: ( ( ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] ) )
            // InternalSim.g:704:2: ( ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] )
            {
            // InternalSim.g:704:2: ( ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] )
            // InternalSim.g:705:3: ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current]
            {
            // InternalSim.g:705:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:706:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:706:4: ( ruleDQualifiedName )
            // InternalSim.g:707:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
              			}
              			newCompositeNode(grammarAccess.getSMorphComplexTypeRuleAccess().getChangeComplexTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_ChangeComplexType_1=ruleChangeComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ChangeComplexType_1;
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
    // $ANTLR end "ruleSMorphComplexTypeRule"


    // $ANTLR start "entryRuleSFuseComplexTypeRule"
    // InternalSim.g:736:1: entryRuleSFuseComplexTypeRule returns [EObject current=null] : iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF ;
    public final EObject entryRuleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFuseComplexTypeRule = null;


        try {
            // InternalSim.g:736:61: (iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF )
            // InternalSim.g:737:2: iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSFuseComplexTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSFuseComplexTypeRule=ruleSFuseComplexTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSFuseComplexTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSFuseComplexTypeRule"


    // $ANTLR start "ruleSFuseComplexTypeRule"
    // InternalSim.g:743:1: ruleSFuseComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] ) ;
    public final EObject ruleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ChangeComplexType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:749:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] ) )
            // InternalSim.g:750:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] )
            {
            // InternalSim.g:750:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] )
            // InternalSim.g:751:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current]
            {
            // InternalSim.g:751:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:752:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:752:4: ( ruleDQualifiedName )
            // InternalSim.g:753:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:767:3: (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSim.g:768:4: otherlv_1= 'and' ( ( ruleDQualifiedName ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    // InternalSim.g:772:4: ( ( ruleDQualifiedName ) )
            	    // InternalSim.g:773:5: ( ruleDQualifiedName )
            	    {
            	    // InternalSim.g:773:5: ( ruleDQualifiedName )
            	    // InternalSim.g:774:6: ruleDQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeCrossReference_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    ruleDQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
              			}
              			newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getChangeComplexTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_ChangeComplexType_3=ruleChangeComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ChangeComplexType_3;
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
    // $ANTLR end "ruleSFuseComplexTypeRule"


    // $ANTLR start "ruleChangeComplexType"
    // InternalSim.g:805:1: ruleChangeComplexType[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( ( (lv_rootEntity_2_0= ruleSRootEntity ) ) | ( (lv_detail_3_0= ruleSDetailType ) ) )? ( (lv_renameTo_4_0= RULE_ID ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? )? ;
    public final EObject ruleChangeComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_renameTo_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_abstract_1_0 = null;

        Enumerator lv_rootEntity_2_0 = null;

        Enumerator lv_detail_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:811:2: ( (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( ( (lv_rootEntity_2_0= ruleSRootEntity ) ) | ( (lv_detail_3_0= ruleSDetailType ) ) )? ( (lv_renameTo_4_0= RULE_ID ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? )? )
            // InternalSim.g:812:2: (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( ( (lv_rootEntity_2_0= ruleSRootEntity ) ) | ( (lv_detail_3_0= ruleSDetailType ) ) )? ( (lv_renameTo_4_0= RULE_ID ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? )?
            {
            // InternalSim.g:812:2: (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( ( (lv_rootEntity_2_0= ruleSRootEntity ) ) | ( (lv_detail_3_0= ruleSDetailType ) ) )? ( (lv_renameTo_4_0= RULE_ID ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSim.g:813:3: otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( ( (lv_rootEntity_2_0= ruleSRootEntity ) ) | ( (lv_detail_3_0= ruleSDetailType ) ) )? ( (lv_renameTo_4_0= RULE_ID ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_0, grammarAccess.getChangeComplexTypeAccess().getToKeyword_0());
                      		
                    }
                    // InternalSim.g:817:3: ( (lv_abstract_1_0= ruleSAbstractType ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==40||LA11_0==94) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSim.g:818:4: (lv_abstract_1_0= ruleSAbstractType )
                            {
                            // InternalSim.g:818:4: (lv_abstract_1_0= ruleSAbstractType )
                            // InternalSim.g:819:5: lv_abstract_1_0= ruleSAbstractType
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getChangeComplexTypeAccess().getAbstractSAbstractTypeEnumRuleCall_1_0());
                              				
                            }
                            pushFollow(FOLLOW_16);
                            lv_abstract_1_0=ruleSAbstractType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElementForParent(grammarAccess.getChangeComplexTypeRule());
                              					}
                              					set(
                              						current,
                              						"abstract",
                              						lv_abstract_1_0,
                              						"com.mimacom.ddd.sm.sim.Sim.SAbstractType");
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }


                            }
                            break;

                    }

                    // InternalSim.g:836:3: ( ( (lv_rootEntity_2_0= ruleSRootEntity ) ) | ( (lv_detail_3_0= ruleSDetailType ) ) )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==35||LA12_0==95) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==36||LA12_0==39) ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSim.g:837:4: ( (lv_rootEntity_2_0= ruleSRootEntity ) )
                            {
                            // InternalSim.g:837:4: ( (lv_rootEntity_2_0= ruleSRootEntity ) )
                            // InternalSim.g:838:5: (lv_rootEntity_2_0= ruleSRootEntity )
                            {
                            // InternalSim.g:838:5: (lv_rootEntity_2_0= ruleSRootEntity )
                            // InternalSim.g:839:6: lv_rootEntity_2_0= ruleSRootEntity
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getChangeComplexTypeAccess().getRootEntitySRootEntityEnumRuleCall_2_0_0());
                              					
                            }
                            pushFollow(FOLLOW_17);
                            lv_rootEntity_2_0=ruleSRootEntity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getChangeComplexTypeRule());
                              						}
                              						set(
                              							current,
                              							"rootEntity",
                              							lv_rootEntity_2_0,
                              							"com.mimacom.ddd.sm.sim.Sim.SRootEntity");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSim.g:857:4: ( (lv_detail_3_0= ruleSDetailType ) )
                            {
                            // InternalSim.g:857:4: ( (lv_detail_3_0= ruleSDetailType ) )
                            // InternalSim.g:858:5: (lv_detail_3_0= ruleSDetailType )
                            {
                            // InternalSim.g:858:5: (lv_detail_3_0= ruleSDetailType )
                            // InternalSim.g:859:6: lv_detail_3_0= ruleSDetailType
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getChangeComplexTypeAccess().getDetailSDetailTypeEnumRuleCall_2_1_0());
                              					
                            }
                            pushFollow(FOLLOW_17);
                            lv_detail_3_0=ruleSDetailType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getChangeComplexTypeRule());
                              						}
                              						set(
                              							current,
                              							"detail",
                              							lv_detail_3_0,
                              							"com.mimacom.ddd.sm.sim.Sim.SDetailType");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSim.g:877:3: ( (lv_renameTo_4_0= RULE_ID ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSim.g:878:4: (lv_renameTo_4_0= RULE_ID )
                            {
                            // InternalSim.g:878:4: (lv_renameTo_4_0= RULE_ID )
                            // InternalSim.g:879:5: lv_renameTo_4_0= RULE_ID
                            {
                            lv_renameTo_4_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(lv_renameTo_4_0, grammarAccess.getChangeComplexTypeAccess().getRenameToIDTerminalRuleCall_3_0());
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getChangeComplexTypeRule());
                              					}
                              					setWithLastConsumed(
                              						current,
                              						"renameTo",
                              						lv_renameTo_4_0,
                              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
                              				
                            }

                            }


                            }
                            break;

                    }

                    // InternalSim.g:895:3: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSim.g:896:4: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				newLeafNode(otherlv_5, grammarAccess.getChangeComplexTypeAccess().getExtendsKeyword_4_0());
                              			
                            }
                            // InternalSim.g:900:4: ( (otherlv_6= RULE_ID ) )
                            // InternalSim.g:901:5: (otherlv_6= RULE_ID )
                            {
                            // InternalSim.g:901:5: (otherlv_6= RULE_ID )
                            // InternalSim.g:902:6: otherlv_6= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getChangeComplexTypeRule());
                              						}
                              					
                            }
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getChangeComplexTypeAccess().getExtendFromDComplexTypeCrossReference_4_1_0());
                              					
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeComplexType"


    // $ANTLR start "entryRuleSGrabFeatureRule"
    // InternalSim.g:918:1: entryRuleSGrabFeatureRule returns [EObject current=null] : iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF ;
    public final EObject entryRuleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabFeatureRule = null;


        try {
            // InternalSim.g:918:57: (iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF )
            // InternalSim.g:919:2: iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSGrabFeatureRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSGrabFeatureRule=ruleSGrabFeatureRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSGrabFeatureRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSGrabFeatureRule"


    // $ANTLR start "ruleSGrabFeatureRule"
    // InternalSim.g:925:1: ruleSGrabFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:931:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:932:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:932:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:933:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:933:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:934:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:934:4: (otherlv_0= RULE_ID )
            // InternalSim.g:935:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
              				
            }

            }


            }

            // InternalSim.g:946:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSim.g:947:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:951:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:952:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:952:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:953:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
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
    // $ANTLR end "ruleSGrabFeatureRule"


    // $ANTLR start "entryRuleSMorphFeatureRule"
    // InternalSim.g:974:1: entryRuleSMorphFeatureRule returns [EObject current=null] : iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF ;
    public final EObject entryRuleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphFeatureRule = null;


        try {
            // InternalSim.g:974:58: (iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF )
            // InternalSim.g:975:2: iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSMorphFeatureRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSMorphFeatureRule=ruleSMorphFeatureRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSMorphFeatureRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSMorphFeatureRule"


    // $ANTLR start "ruleSMorphFeatureRule"
    // InternalSim.g:981:1: ruleSMorphFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_remultiplyTo_5_0 = null;



        	enterRule();

        try {
            // InternalSim.g:987:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )? ) )
            // InternalSim.g:988:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )? )
            {
            // InternalSim.g:988:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )? )
            // InternalSim.g:989:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )?
            {
            // InternalSim.g:989:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:990:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:990:4: (otherlv_0= RULE_ID )
            // InternalSim.g:991:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSMorphFeatureRuleAccess().getToKeyword_1());
              		
            }
            // InternalSim.g:1006:3: ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==24) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalSim.g:1007:4: ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalSim.g:1007:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:1008:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:1008:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:1009:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSim.g:1030:3: ( (otherlv_4= RULE_ID ) )
            // InternalSim.g:1031:4: (otherlv_4= RULE_ID )
            {
            // InternalSim.g:1031:4: (otherlv_4= RULE_ID )
            // InternalSim.g:1032:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getSMorphFeatureRuleAccess().getRetypeToDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalSim.g:1043:3: ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46||LA18_0==88||LA18_0==129) ) {
                alt18=1;
            }
            else if ( (LA18_0==45) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==RULE_NATURAL) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalSim.g:1044:4: (lv_remultiplyTo_5_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:1044:4: (lv_remultiplyTo_5_0= ruleDMultiplicity )
                    // InternalSim.g:1045:5: lv_remultiplyTo_5_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_remultiplyTo_5_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSMorphFeatureRuleRule());
                      					}
                      					set(
                      						current,
                      						"remultiplyTo",
                      						lv_remultiplyTo_5_0,
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
    // $ANTLR end "ruleSMorphFeatureRule"


    // $ANTLR start "entryRuleSDitchFeatureRule"
    // InternalSim.g:1066:1: entryRuleSDitchFeatureRule returns [EObject current=null] : iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF ;
    public final EObject entryRuleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchFeatureRule = null;


        try {
            // InternalSim.g:1066:58: (iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF )
            // InternalSim.g:1067:2: iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSDitchFeatureRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSDitchFeatureRule=ruleSDitchFeatureRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSDitchFeatureRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSDitchFeatureRule"


    // $ANTLR start "ruleSDitchFeatureRule"
    // InternalSim.g:1073:1: ruleSDitchFeatureRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:1079:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:1080:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:1080:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:1081:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:1081:3: (otherlv_0= RULE_ID )
            // InternalSim.g:1082:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSDitchFeatureRuleRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0());
              			
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
    // $ANTLR end "ruleSDitchFeatureRule"


    // $ANTLR start "entryRuleDomain"
    // InternalSim.g:1096:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalSim.g:1096:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalSim.g:1097:2: iv_ruleDomain= ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomain; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalSim.g:1103:1: ruleDomain returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_deductionRule_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1109:2: ( ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) ) )
            // InternalSim.g:1110:2: ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) )
            {
            // InternalSim.g:1110:2: ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) )
            // InternalSim.g:1111:3: () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) )
            {
            // InternalSim.g:1111:3: ()
            // InternalSim.g:1112:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDomainAccess().getSDomainDeductionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getGrabKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getDomainKeyword_2());
              		
            }
            // InternalSim.g:1126:3: ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) )
            // InternalSim.g:1127:4: (lv_deductionRule_3_0= ruleSGrabDomainRule )
            {
            // InternalSim.g:1127:4: (lv_deductionRule_3_0= ruleSGrabDomainRule )
            // InternalSim.g:1128:5: lv_deductionRule_3_0= ruleSGrabDomainRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainAccess().getDeductionRuleSGrabDomainRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_deductionRule_3_0=ruleSGrabDomainRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainRule());
              					}
              					set(
              						current,
              						"deductionRule",
              						lv_deductionRule_3_0,
              						"com.mimacom.ddd.sm.sim.Sim.SGrabDomainRule");
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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleAggregate"
    // InternalSim.g:1149:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // InternalSim.g:1149:50: (iv_ruleAggregate= ruleAggregate EOF )
            // InternalSim.g:1150:2: iv_ruleAggregate= ruleAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // InternalSim.g:1156:1: ruleAggregate returns [EObject current=null] : (this_SAggregateDeduction_0= ruleSAggregateDeduction | this_DAggregate_1= ruleDAggregate ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        EObject this_SAggregateDeduction_0 = null;

        EObject this_DAggregate_1 = null;



        	enterRule();

        try {
            // InternalSim.g:1162:2: ( (this_SAggregateDeduction_0= ruleSAggregateDeduction | this_DAggregate_1= ruleDAggregate ) )
            // InternalSim.g:1163:2: (this_SAggregateDeduction_0= ruleSAggregateDeduction | this_DAggregate_1= ruleDAggregate )
            {
            // InternalSim.g:1163:2: (this_SAggregateDeduction_0= ruleSAggregateDeduction | this_DAggregate_1= ruleDAggregate )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSim.g:1164:3: this_SAggregateDeduction_0= ruleSAggregateDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAggregateAccess().getSAggregateDeductionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAggregateDeduction_0=ruleSAggregateDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAggregateDeduction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:1173:3: this_DAggregate_1= ruleDAggregate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAggregateAccess().getDAggregateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DAggregate_1=ruleDAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DAggregate_1;
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
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleSAggregateDeduction"
    // InternalSim.g:1185:1: entryRuleSAggregateDeduction returns [EObject current=null] : iv_ruleSAggregateDeduction= ruleSAggregateDeduction EOF ;
    public final EObject entryRuleSAggregateDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAggregateDeduction = null;


        try {
            // InternalSim.g:1185:60: (iv_ruleSAggregateDeduction= ruleSAggregateDeduction EOF )
            // InternalSim.g:1186:2: iv_ruleSAggregateDeduction= ruleSAggregateDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAggregateDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAggregateDeduction=ruleSAggregateDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAggregateDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAggregateDeduction"


    // $ANTLR start "ruleSAggregateDeduction"
    // InternalSim.g:1192:1: ruleSAggregateDeduction returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' ) ;
    public final EObject ruleSAggregateDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_types_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1198:2: ( ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' ) )
            // InternalSim.g:1199:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' )
            {
            // InternalSim.g:1199:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' )
            // InternalSim.g:1200:3: () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}'
            {
            // InternalSim.g:1200:3: ()
            // InternalSim.g:1201:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSAggregateDeductionAccess().getSAggregateDeductionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSAggregateDeductionAccess().getGrabKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSAggregateDeductionAccess().getAggregateKeyword_2());
              		
            }
            // InternalSim.g:1215:3: ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
            // InternalSim.g:1216:4: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
            {
            // InternalSim.g:1216:4: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
            // InternalSim.g:1217:5: lv_deductionRule_3_0= ruleSGrabAggregateRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSAggregateDeductionAccess().getDeductionRuleSGrabAggregateRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_deductionRule_3_0=ruleSGrabAggregateRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSAggregateDeductionRule());
              					}
              					set(
              						current,
              						"deductionRule",
              						lv_deductionRule_3_0,
              						"com.mimacom.ddd.sm.sim.Sim.SGrabAggregateRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:1234:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_PLAIN_TEXT_ONLY && LA20_0<=RULE_PLAIN_TEXT_START)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSim.g:1235:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:1235:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:1236:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSAggregateDeductionAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSAggregateDeductionRule());
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

            otherlv_5=(Token)match(input,28,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSAggregateDeductionAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalSim.g:1257:3: ( (lv_types_6_0= ruleType ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25||(LA21_0>=30 && LA21_0<=32)||(LA21_0>=35 && LA21_0<=40)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSim.g:1258:4: (lv_types_6_0= ruleType )
            	    {
            	    // InternalSim.g:1258:4: (lv_types_6_0= ruleType )
            	    // InternalSim.g:1259:5: lv_types_6_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSAggregateDeductionAccess().getTypesTypeParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_types_6_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSAggregateDeductionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_6_0,
            	      						"com.mimacom.ddd.sm.sim.Sim.Type");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSAggregateDeductionAccess().getRightCurlyBracketKeyword_7());
              		
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
    // $ANTLR end "ruleSAggregateDeduction"


    // $ANTLR start "entryRuleDAggregate"
    // InternalSim.g:1284:1: entryRuleDAggregate returns [EObject current=null] : iv_ruleDAggregate= ruleDAggregate EOF ;
    public final EObject entryRuleDAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAggregate = null;


        try {
            // InternalSim.g:1284:51: (iv_ruleDAggregate= ruleDAggregate EOF )
            // InternalSim.g:1285:2: iv_ruleDAggregate= ruleDAggregate EOF
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
    // InternalSim.g:1291:1: ruleDAggregate returns [EObject current=null] : ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}' ) ;
    public final EObject ruleDAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_2_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1297:2: ( ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}' ) )
            // InternalSim.g:1298:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}' )
            {
            // InternalSim.g:1298:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}' )
            // InternalSim.g:1299:3: () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}'
            {
            // InternalSim.g:1299:3: ()
            // InternalSim.g:1300:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDAggregateAccess().getDAggregateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDAggregateAccess().getAggregateKeyword_1());
              		
            }
            // InternalSim.g:1310:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_PLAIN_TEXT_ONLY && LA22_0<=RULE_PLAIN_TEXT_START)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSim.g:1311:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalSim.g:1311:4: (lv_description_2_0= ruleDRichText )
                    // InternalSim.g:1312:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAggregateAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
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

            otherlv_3=(Token)match(input,28,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDAggregateAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSim.g:1333:3: ( (lv_types_4_0= ruleType ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25||(LA23_0>=30 && LA23_0<=32)||(LA23_0>=35 && LA23_0<=40)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSim.g:1334:4: (lv_types_4_0= ruleType )
            	    {
            	    // InternalSim.g:1334:4: (lv_types_4_0= ruleType )
            	    // InternalSim.g:1335:5: lv_types_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDAggregateAccess().getTypesTypeParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_types_4_0=ruleType();

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
            	      						"com.mimacom.ddd.sm.sim.Sim.Type");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleType"
    // InternalSim.g:1360:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSim.g:1360:45: (iv_ruleType= ruleType EOF )
            // InternalSim.g:1361:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSim.g:1367:1: ruleType returns [EObject current=null] : (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SPrimitiveDeduction_0 = null;

        EObject this_DPrimitive_1 = null;

        EObject this_SEnumerationDeduction_2 = null;

        EObject this_DEnumeration_3 = null;

        EObject this_SEntityTypeDeduction_4 = null;

        EObject this_DEntityType_5 = null;

        EObject this_SDetailTypeDeduction_6 = null;

        EObject this_DDetailType_7 = null;



        	enterRule();

        try {
            // InternalSim.g:1373:2: ( (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType ) )
            // InternalSim.g:1374:2: (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType )
            {
            // InternalSim.g:1374:2: (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType )
            int alt24=8;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalSim.g:1375:3: this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getSPrimitiveDeductionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SPrimitiveDeduction_0=ruleSPrimitiveDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SPrimitiveDeduction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:1384:3: this_DPrimitive_1= ruleDPrimitive
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getDPrimitiveParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DPrimitive_1=ruleDPrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DPrimitive_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSim.g:1393:3: this_SEnumerationDeduction_2= ruleSEnumerationDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getSEnumerationDeductionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SEnumerationDeduction_2=ruleSEnumerationDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SEnumerationDeduction_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSim.g:1402:3: this_DEnumeration_3= ruleDEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getDEnumerationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEnumeration_3=ruleDEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEnumeration_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSim.g:1411:3: this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getSEntityTypeDeductionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SEntityTypeDeduction_4=ruleSEntityTypeDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SEntityTypeDeduction_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSim.g:1420:3: this_DEntityType_5= ruleDEntityType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getDEntityTypeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEntityType_5=ruleDEntityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEntityType_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSim.g:1429:3: this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getSDetailTypeDeductionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SDetailTypeDeduction_6=ruleSDetailTypeDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SDetailTypeDeduction_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalSim.g:1438:3: this_DDetailType_7= ruleDDetailType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getDDetailTypeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDetailType_7=ruleDDetailType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDetailType_7;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSPrimitiveDeduction"
    // InternalSim.g:1450:1: entryRuleSPrimitiveDeduction returns [EObject current=null] : iv_ruleSPrimitiveDeduction= ruleSPrimitiveDeduction EOF ;
    public final EObject entryRuleSPrimitiveDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitiveDeduction = null;


        try {
            // InternalSim.g:1450:60: (iv_ruleSPrimitiveDeduction= ruleSPrimitiveDeduction EOF )
            // InternalSim.g:1451:2: iv_ruleSPrimitiveDeduction= ruleSPrimitiveDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSPrimitiveDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSPrimitiveDeduction=ruleSPrimitiveDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSPrimitiveDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPrimitiveDeduction"


    // $ANTLR start "ruleSPrimitiveDeduction"
    // InternalSim.g:1457:1: ruleSPrimitiveDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) ;
    public final EObject ruleSPrimitiveDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_6_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_constraints_9_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1463:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) )
            // InternalSim.g:1464:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            {
            // InternalSim.g:1464:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            // InternalSim.g:1465:3: () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}'
            {
            // InternalSim.g:1465:3: ()
            // InternalSim.g:1466:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSPrimitiveDeductionAccess().getSPrimitiveDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:1472:3: ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            else if ( (LA25_0==31) ) {
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
                    // InternalSim.g:1473:4: (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) )
                    {
                    // InternalSim.g:1473:4: (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) )
                    // InternalSim.g:1474:5: otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSPrimitiveDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSPrimitiveDeductionAccess().getPrimitiveKeyword_1_0_1());
                      				
                    }
                    // InternalSim.g:1482:5: ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) )
                    // InternalSim.g:1483:6: (lv_deductionRule_3_0= ruleSGrabPrimitiveRule )
                    {
                    // InternalSim.g:1483:6: (lv_deductionRule_3_0= ruleSGrabPrimitiveRule )
                    // InternalSim.g:1484:7: lv_deductionRule_3_0= ruleSGrabPrimitiveRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSPrimitiveDeductionAccess().getDeductionRuleSGrabPrimitiveRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_3_0=ruleSGrabPrimitiveRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSPrimitiveDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_3_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SGrabPrimitiveRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1503:4: (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) ) )
                    {
                    // InternalSim.g:1503:4: (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) ) )
                    // InternalSim.g:1504:5: otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSPrimitiveDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSPrimitiveDeductionAccess().getPrimitiveKeyword_1_1_1());
                      				
                    }
                    // InternalSim.g:1512:5: ( (lv_deductionRule_6_0= ruleSDitchPrimitiveRule ) )
                    // InternalSim.g:1513:6: (lv_deductionRule_6_0= ruleSDitchPrimitiveRule )
                    {
                    // InternalSim.g:1513:6: (lv_deductionRule_6_0= ruleSDitchPrimitiveRule )
                    // InternalSim.g:1514:7: lv_deductionRule_6_0= ruleSDitchPrimitiveRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSPrimitiveDeductionAccess().getDeductionRuleSDitchPrimitiveRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_6_0=ruleSDitchPrimitiveRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSPrimitiveDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_6_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchPrimitiveRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:1533:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_PLAIN_TEXT_ONLY && LA26_0<=RULE_PLAIN_TEXT_START)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSim.g:1534:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalSim.g:1534:4: (lv_description_7_0= ruleDRichText )
                    // InternalSim.g:1535:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSPrimitiveDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSPrimitiveDeductionRule());
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

            otherlv_8=(Token)match(input,28,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSPrimitiveDeductionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSim.g:1556:3: ( (lv_constraints_9_0= ruleDConstraint ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSim.g:1557:4: (lv_constraints_9_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:1557:4: (lv_constraints_9_0= ruleDConstraint )
            	    // InternalSim.g:1558:5: lv_constraints_9_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSPrimitiveDeductionAccess().getConstraintsDConstraintParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_constraints_9_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSPrimitiveDeductionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_9_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_10=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getSPrimitiveDeductionAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleSPrimitiveDeduction"


    // $ANTLR start "entryRuleSEnumerationDeduction"
    // InternalSim.g:1583:1: entryRuleSEnumerationDeduction returns [EObject current=null] : iv_ruleSEnumerationDeduction= ruleSEnumerationDeduction EOF ;
    public final EObject entryRuleSEnumerationDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumerationDeduction = null;


        try {
            // InternalSim.g:1583:62: (iv_ruleSEnumerationDeduction= ruleSEnumerationDeduction EOF )
            // InternalSim.g:1584:2: iv_ruleSEnumerationDeduction= ruleSEnumerationDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSEnumerationDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSEnumerationDeduction=ruleSEnumerationDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSEnumerationDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSEnumerationDeduction"


    // $ANTLR start "ruleSEnumerationDeduction"
    // InternalSim.g:1590:1: ruleSEnumerationDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}' ) ;
    public final EObject ruleSEnumerationDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_6_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_literals_9_0 = null;

        EObject lv_literals_11_0 = null;

        EObject lv_constraints_12_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1596:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}' ) )
            // InternalSim.g:1597:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}' )
            {
            // InternalSim.g:1597:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}' )
            // InternalSim.g:1598:3: () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}'
            {
            // InternalSim.g:1598:3: ()
            // InternalSim.g:1599:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSEnumerationDeductionAccess().getSEnumerationDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:1605:3: ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            else if ( (LA28_0==31) ) {
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
                    // InternalSim.g:1606:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    {
                    // InternalSim.g:1606:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    // InternalSim.g:1607:5: otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSEnumerationDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSEnumerationDeductionAccess().getEnumerationKeyword_1_0_1());
                      				
                    }
                    // InternalSim.g:1615:5: ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    // InternalSim.g:1616:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    {
                    // InternalSim.g:1616:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    // InternalSim.g:1617:7: lv_deductionRule_3_0= ruleSGrabEnumerationRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_3_0=ruleSGrabEnumerationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSEnumerationDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_3_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SGrabEnumerationRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1636:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) )
                    {
                    // InternalSim.g:1636:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) )
                    // InternalSim.g:1637:5: otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSEnumerationDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSEnumerationDeductionAccess().getEnumerationKeyword_1_1_1());
                      				
                    }
                    // InternalSim.g:1645:5: ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) )
                    // InternalSim.g:1646:6: (lv_deductionRule_6_0= ruleSDitchEnumerationRule )
                    {
                    // InternalSim.g:1646:6: (lv_deductionRule_6_0= ruleSDitchEnumerationRule )
                    // InternalSim.g:1647:7: lv_deductionRule_6_0= ruleSDitchEnumerationRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getDeductionRuleSDitchEnumerationRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_6_0=ruleSDitchEnumerationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSEnumerationDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_6_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchEnumerationRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:1666:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_PLAIN_TEXT_ONLY && LA29_0<=RULE_PLAIN_TEXT_START)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSim.g:1667:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalSim.g:1667:4: (lv_description_7_0= ruleDRichText )
                    // InternalSim.g:1668:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSEnumerationDeductionRule());
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

            otherlv_8=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSEnumerationDeductionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSim.g:1689:3: ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==25||LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSim.g:1690:4: ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )*
                    {
                    // InternalSim.g:1690:4: ( (lv_literals_9_0= ruleLiteral ) )
                    // InternalSim.g:1691:5: (lv_literals_9_0= ruleLiteral )
                    {
                    // InternalSim.g:1691:5: (lv_literals_9_0= ruleLiteral )
                    // InternalSim.g:1692:6: lv_literals_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getLiteralsLiteralParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_literals_9_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSEnumerationDeductionRule());
                      						}
                      						add(
                      							current,
                      							"literals",
                      							lv_literals_9_0,
                      							"com.mimacom.ddd.sm.sim.Sim.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSim.g:1709:4: (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==33) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSim.g:1710:5: otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) )
                    	    {
                    	    otherlv_10=(Token)match(input,33,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getSEnumerationDeductionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:1714:5: ( (lv_literals_11_0= ruleLiteral ) )
                    	    // InternalSim.g:1715:6: (lv_literals_11_0= ruleLiteral )
                    	    {
                    	    // InternalSim.g:1715:6: (lv_literals_11_0= ruleLiteral )
                    	    // InternalSim.g:1716:7: lv_literals_11_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getLiteralsLiteralParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_literals_11_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSEnumerationDeductionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literals",
                    	      								lv_literals_11_0,
                    	      								"com.mimacom.ddd.sm.sim.Sim.Literal");
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

            // InternalSim.g:1735:3: ( (lv_constraints_12_0= ruleDConstraint ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSim.g:1736:4: (lv_constraints_12_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:1736:4: (lv_constraints_12_0= ruleDConstraint )
            	    // InternalSim.g:1737:5: lv_constraints_12_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getConstraintsDConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_constraints_12_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSEnumerationDeductionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_12_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_13=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getSEnumerationDeductionAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleSEnumerationDeduction"


    // $ANTLR start "entryRuleDEnumeration"
    // InternalSim.g:1762:1: entryRuleDEnumeration returns [EObject current=null] : iv_ruleDEnumeration= ruleDEnumeration EOF ;
    public final EObject entryRuleDEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumeration = null;


        try {
            // InternalSim.g:1762:53: (iv_ruleDEnumeration= ruleDEnumeration EOF )
            // InternalSim.g:1763:2: iv_ruleDEnumeration= ruleDEnumeration EOF
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
    // InternalSim.g:1769:1: ruleDEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) ;
    public final EObject ruleDEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_description_4_0 = null;

        EObject lv_literals_6_0 = null;

        EObject lv_literals_8_0 = null;

        EObject lv_constraints_9_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1775:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) )
            // InternalSim.g:1776:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            {
            // InternalSim.g:1776:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            // InternalSim.g:1777:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerationAccess().getEnumerationKeyword_0());
              		
            }
            // InternalSim.g:1781:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:1782:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:1782:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:1783:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            // InternalSim.g:1799:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==34) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSim.g:1800:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDEnumerationAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:1804:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:1805:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:1805:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:1806:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDEnumerationAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDEnumerationRule());
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
            	    break loop33;
                }
            } while (true);

            // InternalSim.g:1823:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_PLAIN_TEXT_ONLY && LA34_0<=RULE_PLAIN_TEXT_START)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSim.g:1824:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:1824:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:1825:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDEnumerationAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDEnumerationRule());
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

            otherlv_5=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDEnumerationAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSim.g:1846:3: ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==25||LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSim.g:1847:4: ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )*
                    {
                    // InternalSim.g:1847:4: ( (lv_literals_6_0= ruleLiteral ) )
                    // InternalSim.g:1848:5: (lv_literals_6_0= ruleLiteral )
                    {
                    // InternalSim.g:1848:5: (lv_literals_6_0= ruleLiteral )
                    // InternalSim.g:1849:6: lv_literals_6_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsLiteralParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_literals_6_0=ruleLiteral();

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
                      							"com.mimacom.ddd.sm.sim.Sim.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSim.g:1866:4: (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==33) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalSim.g:1867:5: otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) )
                    	    {
                    	    otherlv_7=(Token)match(input,33,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getDEnumerationAccess().getCommaKeyword_5_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:1871:5: ( (lv_literals_8_0= ruleLiteral ) )
                    	    // InternalSim.g:1872:6: (lv_literals_8_0= ruleLiteral )
                    	    {
                    	    // InternalSim.g:1872:6: (lv_literals_8_0= ruleLiteral )
                    	    // InternalSim.g:1873:7: lv_literals_8_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsLiteralParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_literals_8_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDEnumerationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literals",
                    	      								lv_literals_8_0,
                    	      								"com.mimacom.ddd.sm.sim.Sim.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSim.g:1892:3: ( (lv_constraints_9_0= ruleDConstraint ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==49) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSim.g:1893:4: (lv_constraints_9_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:1893:4: (lv_constraints_9_0= ruleDConstraint )
            	    // InternalSim.g:1894:5: lv_constraints_9_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerationAccess().getConstraintsDConstraintParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_constraints_9_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_9_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_10=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDEnumerationAccess().getRightCurlyBracketKeyword_7());
              		
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


    // $ANTLR start "entryRuleLiteral"
    // InternalSim.g:1919:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSim.g:1919:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSim.g:1920:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalSim.g:1926:1: ruleLiteral returns [EObject current=null] : (this_SLiteralDeduction_0= ruleSLiteralDeduction | this_DLiteral_1= ruleDLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SLiteralDeduction_0 = null;

        EObject this_DLiteral_1 = null;



        	enterRule();

        try {
            // InternalSim.g:1932:2: ( (this_SLiteralDeduction_0= ruleSLiteralDeduction | this_DLiteral_1= ruleDLiteral ) )
            // InternalSim.g:1933:2: (this_SLiteralDeduction_0= ruleSLiteralDeduction | this_DLiteral_1= ruleDLiteral )
            {
            // InternalSim.g:1933:2: (this_SLiteralDeduction_0= ruleSLiteralDeduction | this_DLiteral_1= ruleDLiteral )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25||LA38_0==31) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
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
                    // InternalSim.g:1934:3: this_SLiteralDeduction_0= ruleSLiteralDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getSLiteralDeductionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SLiteralDeduction_0=ruleSLiteralDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SLiteralDeduction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:1943:3: this_DLiteral_1= ruleDLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getDLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DLiteral_1=ruleDLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DLiteral_1;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleSLiteralDeduction"
    // InternalSim.g:1955:1: entryRuleSLiteralDeduction returns [EObject current=null] : iv_ruleSLiteralDeduction= ruleSLiteralDeduction EOF ;
    public final EObject entryRuleSLiteralDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSLiteralDeduction = null;


        try {
            // InternalSim.g:1955:58: (iv_ruleSLiteralDeduction= ruleSLiteralDeduction EOF )
            // InternalSim.g:1956:2: iv_ruleSLiteralDeduction= ruleSLiteralDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSLiteralDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSLiteralDeduction=ruleSLiteralDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSLiteralDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSLiteralDeduction"


    // $ANTLR start "ruleSLiteralDeduction"
    // InternalSim.g:1962:1: ruleSLiteralDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleSLiteralDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1968:2: ( ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalSim.g:1969:2: ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalSim.g:1969:2: ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalSim.g:1970:3: () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalSim.g:1970:3: ()
            // InternalSim.g:1971:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSLiteralDeductionAccess().getSLiteralDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:1977:3: ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            else if ( (LA39_0==31) ) {
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
                    // InternalSim.g:1978:4: (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1978:4: (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    // InternalSim.g:1979:5: otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSLiteralDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:1983:5: ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    // InternalSim.g:1984:6: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    {
                    // InternalSim.g:1984:6: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    // InternalSim.g:1985:7: lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSLiteralDeductionAccess().getDeductionRuleSGrabEnumerationLiteralRuleParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_2_0=ruleSGrabEnumerationLiteralRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSLiteralDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_2_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SGrabEnumerationLiteralRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:2004:4: (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:2004:4: (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) )
                    // InternalSim.g:2005:5: otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSLiteralDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:2009:5: ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) )
                    // InternalSim.g:2010:6: (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule )
                    {
                    // InternalSim.g:2010:6: (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule )
                    // InternalSim.g:2011:7: lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSLiteralDeductionAccess().getDeductionRuleSDitchEnumerationLiteralRuleParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_4_0=ruleSDitchEnumerationLiteralRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSLiteralDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_4_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchEnumerationLiteralRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:2030:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_PLAIN_TEXT_ONLY && LA40_0<=RULE_PLAIN_TEXT_START)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSim.g:2031:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalSim.g:2031:4: (lv_description_5_0= ruleDRichText )
                    // InternalSim.g:2032:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSLiteralDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSLiteralDeductionRule());
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
    // $ANTLR end "ruleSLiteralDeduction"


    // $ANTLR start "entryRuleSEntityTypeDeduction"
    // InternalSim.g:2053:1: entryRuleSEntityTypeDeduction returns [EObject current=null] : iv_ruleSEntityTypeDeduction= ruleSEntityTypeDeduction EOF ;
    public final EObject entryRuleSEntityTypeDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEntityTypeDeduction = null;


        try {
            // InternalSim.g:2053:61: (iv_ruleSEntityTypeDeduction= ruleSEntityTypeDeduction EOF )
            // InternalSim.g:2054:2: iv_ruleSEntityTypeDeduction= ruleSEntityTypeDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSEntityTypeDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSEntityTypeDeduction=ruleSEntityTypeDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSEntityTypeDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSEntityTypeDeduction"


    // $ANTLR start "ruleSEntityTypeDeduction"
    // InternalSim.g:2060:1: ruleSEntityTypeDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSEntityTypeDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_root_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_root_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_root_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_root_14_0=null;
        Token otherlv_15=null;
        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_8_0 = null;

        EObject lv_deductionRule_12_0 = null;

        EObject lv_deductionRule_16_0 = null;

        EObject lv_description_17_0 = null;

        EObject this_SComplexTypeFeatures_18 = null;



        	enterRule();

        try {
            // InternalSim.g:2066:2: ( ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:2067:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:2067:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:2068:3: () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:2068:3: ()
            // InternalSim.g:2069:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSEntityTypeDeductionAccess().getSEntityTypeDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:2075:3: ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt45=1;
                }
                break;
            case 31:
                {
                alt45=2;
                }
                break;
            case 37:
                {
                alt45=3;
                }
                break;
            case 38:
                {
                alt45=4;
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
                    // InternalSim.g:2076:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2076:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:2077:5: otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSEntityTypeDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:2081:5: ( (lv_root_2_0= 'root' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==35) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSim.g:2082:6: (lv_root_2_0= 'root' )
                            {
                            // InternalSim.g:2082:6: (lv_root_2_0= 'root' )
                            // InternalSim.g:2083:7: lv_root_2_0= 'root'
                            {
                            lv_root_2_0=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_root_2_0, grammarAccess.getSEntityTypeDeductionAccess().getRootRootKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSEntityTypeDeductionRule());
                              							}
                              							setWithLastConsumed(current, "root", true, "root");
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSEntityTypeDeductionAccess().getEntityKeyword_1_0_2());
                      				
                    }
                    // InternalSim.g:2099:5: ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:2100:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:2100:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:2101:7: lv_deductionRule_4_0= ruleSGrabComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_1_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_4_0=ruleSGrabComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSEntityTypeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_4_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SGrabComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:2120:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2120:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:2121:5: otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSEntityTypeDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:2125:5: ( (lv_root_6_0= 'root' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==35) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSim.g:2126:6: (lv_root_6_0= 'root' )
                            {
                            // InternalSim.g:2126:6: (lv_root_6_0= 'root' )
                            // InternalSim.g:2127:7: lv_root_6_0= 'root'
                            {
                            lv_root_6_0=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_root_6_0, grammarAccess.getSEntityTypeDeductionAccess().getRootRootKeyword_1_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSEntityTypeDeductionRule());
                              							}
                              							setWithLastConsumed(current, "root", true, "root");
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getSEntityTypeDeductionAccess().getEntityKeyword_1_1_2());
                      				
                    }
                    // InternalSim.g:2143:5: ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:2144:6: (lv_deductionRule_8_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:2144:6: (lv_deductionRule_8_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:2145:7: lv_deductionRule_8_0= ruleSDitchComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_1_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_8_0=ruleSDitchComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSEntityTypeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_8_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:2164:4: (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2164:4: (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:2165:5: otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getSEntityTypeDeductionAccess().getMorphKeyword_1_2_0());
                      				
                    }
                    // InternalSim.g:2169:5: ( (lv_root_10_0= 'root' ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==35) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalSim.g:2170:6: (lv_root_10_0= 'root' )
                            {
                            // InternalSim.g:2170:6: (lv_root_10_0= 'root' )
                            // InternalSim.g:2171:7: lv_root_10_0= 'root'
                            {
                            lv_root_10_0=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_root_10_0, grammarAccess.getSEntityTypeDeductionAccess().getRootRootKeyword_1_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSEntityTypeDeductionRule());
                              							}
                              							setWithLastConsumed(current, "root", true, "root");
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getSEntityTypeDeductionAccess().getEntityKeyword_1_2_2());
                      				
                    }
                    // InternalSim.g:2187:5: ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:2188:6: (lv_deductionRule_12_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:2188:6: (lv_deductionRule_12_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:2189:7: lv_deductionRule_12_0= ruleSMorphComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_1_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_12_0=ruleSMorphComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSEntityTypeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_12_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SMorphComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:2208:4: (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2208:4: (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:2209:5: otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) )
                    {
                    otherlv_13=(Token)match(input,38,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getSEntityTypeDeductionAccess().getFuseKeyword_1_3_0());
                      				
                    }
                    // InternalSim.g:2213:5: ( (lv_root_14_0= 'root' ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==35) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSim.g:2214:6: (lv_root_14_0= 'root' )
                            {
                            // InternalSim.g:2214:6: (lv_root_14_0= 'root' )
                            // InternalSim.g:2215:7: lv_root_14_0= 'root'
                            {
                            lv_root_14_0=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_root_14_0, grammarAccess.getSEntityTypeDeductionAccess().getRootRootKeyword_1_3_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSEntityTypeDeductionRule());
                              							}
                              							setWithLastConsumed(current, "root", true, "root");
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getSEntityTypeDeductionAccess().getEntityKeyword_1_3_2());
                      				
                    }
                    // InternalSim.g:2231:5: ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:2232:6: (lv_deductionRule_16_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:2232:6: (lv_deductionRule_16_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:2233:7: lv_deductionRule_16_0= ruleSFuseComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_1_3_3_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_16_0=ruleSFuseComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSEntityTypeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_16_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SFuseComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:2252:3: ( (lv_description_17_0= ruleDRichText ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_PLAIN_TEXT_ONLY && LA46_0<=RULE_PLAIN_TEXT_START)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSim.g:2253:4: (lv_description_17_0= ruleDRichText )
                    {
                    // InternalSim.g:2253:4: (lv_description_17_0= ruleDRichText )
                    // InternalSim.g:2254:5: lv_description_17_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_description_17_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSEntityTypeDeductionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_17_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSEntityTypeDeductionRule());
              			}
              			newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getSComplexTypeFeaturesParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_SComplexTypeFeatures_18=ruleSComplexTypeFeatures(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SComplexTypeFeatures_18;
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
    // $ANTLR end "ruleSEntityTypeDeduction"


    // $ANTLR start "entryRuleSDetailTypeDeduction"
    // InternalSim.g:2286:1: entryRuleSDetailTypeDeduction returns [EObject current=null] : iv_ruleSDetailTypeDeduction= ruleSDetailTypeDeduction EOF ;
    public final EObject entryRuleSDetailTypeDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDetailTypeDeduction = null;


        try {
            // InternalSim.g:2286:61: (iv_ruleSDetailTypeDeduction= ruleSDetailTypeDeduction EOF )
            // InternalSim.g:2287:2: iv_ruleSDetailTypeDeduction= ruleSDetailTypeDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSDetailTypeDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSDetailTypeDeduction=ruleSDetailTypeDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSDetailTypeDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSDetailTypeDeduction"


    // $ANTLR start "ruleSDetailTypeDeduction"
    // InternalSim.g:2293:1: ruleSDetailTypeDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSDetailTypeDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_6_0 = null;

        EObject lv_deductionRule_9_0 = null;

        EObject lv_deductionRule_12_0 = null;

        EObject lv_description_13_0 = null;

        EObject this_SComplexTypeFeatures_14 = null;



        	enterRule();

        try {
            // InternalSim.g:2299:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:2300:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:2300:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:2301:3: () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:2301:3: ()
            // InternalSim.g:2302:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSDetailTypeDeductionAccess().getSDetailTypeDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:2308:3: ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt47=1;
                }
                break;
            case 31:
                {
                alt47=2;
                }
                break;
            case 37:
                {
                alt47=3;
                }
                break;
            case 38:
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
                    // InternalSim.g:2309:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2309:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:2310:5: otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSDetailTypeDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSDetailTypeDeductionAccess().getDetailKeyword_1_0_1());
                      				
                    }
                    // InternalSim.g:2318:5: ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:2319:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:2319:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:2320:7: lv_deductionRule_3_0= ruleSGrabComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_3_0=ruleSGrabComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSDetailTypeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_3_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SGrabComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:2339:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2339:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:2340:5: otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSDetailTypeDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSDetailTypeDeductionAccess().getDetailKeyword_1_1_1());
                      				
                    }
                    // InternalSim.g:2348:5: ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:2349:6: (lv_deductionRule_6_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:2349:6: (lv_deductionRule_6_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:2350:7: lv_deductionRule_6_0= ruleSDitchComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_6_0=ruleSDitchComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSDetailTypeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_6_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:2369:4: (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2369:4: (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:2370:5: otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getSDetailTypeDeductionAccess().getMorphKeyword_1_2_0());
                      				
                    }
                    otherlv_8=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getSDetailTypeDeductionAccess().getDetailKeyword_1_2_1());
                      				
                    }
                    // InternalSim.g:2378:5: ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:2379:6: (lv_deductionRule_9_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:2379:6: (lv_deductionRule_9_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:2380:7: lv_deductionRule_9_0= ruleSMorphComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_9_0=ruleSMorphComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSDetailTypeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_9_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SMorphComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:2399:4: (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2399:4: (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:2400:5: otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) )
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getSDetailTypeDeductionAccess().getFuseKeyword_1_3_0());
                      				
                    }
                    otherlv_11=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getSDetailTypeDeductionAccess().getDetailKeyword_1_3_1());
                      				
                    }
                    // InternalSim.g:2408:5: ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:2409:6: (lv_deductionRule_12_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:2409:6: (lv_deductionRule_12_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:2410:7: lv_deductionRule_12_0= ruleSFuseComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_1_3_2_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_deductionRule_12_0=ruleSFuseComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSDetailTypeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_12_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SFuseComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:2429:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_PLAIN_TEXT_ONLY && LA48_0<=RULE_PLAIN_TEXT_START)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSim.g:2430:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalSim.g:2430:4: (lv_description_13_0= ruleDRichText )
                    // InternalSim.g:2431:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSDetailTypeDeductionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_13_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSDetailTypeDeductionRule());
              			}
              			newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getSComplexTypeFeaturesParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_SComplexTypeFeatures_14=ruleSComplexTypeFeatures(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SComplexTypeFeatures_14;
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
    // $ANTLR end "ruleSDetailTypeDeduction"


    // $ANTLR start "ruleSComplexTypeFeatures"
    // InternalSim.g:2464:1: ruleSComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2470:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}' ) )
            // InternalSim.g:2471:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}' )
            {
            // InternalSim.g:2471:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}' )
            // InternalSim.g:2472:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalSim.g:2476:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )*
            loop49:
            do {
                int alt49=3;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==25||LA49_0==31||LA49_0==37||LA49_0==39||LA49_0==51) ) {
                    alt49=1;
                }
                else if ( (LA49_0==49) ) {
                    alt49=2;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSim.g:2477:4: ( (lv_features_1_0= ruleFeature ) )
            	    {
            	    // InternalSim.g:2477:4: ( (lv_features_1_0= ruleFeature ) )
            	    // InternalSim.g:2478:5: (lv_features_1_0= ruleFeature )
            	    {
            	    // InternalSim.g:2478:5: (lv_features_1_0= ruleFeature )
            	    // InternalSim.g:2479:6: lv_features_1_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_features_1_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSComplexTypeFeaturesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_1_0,
            	      							"com.mimacom.ddd.sm.sim.Sim.Feature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:2497:4: ( (lv_constraints_2_0= ruleDConstraint ) )
            	    {
            	    // InternalSim.g:2497:4: ( (lv_constraints_2_0= ruleDConstraint ) )
            	    // InternalSim.g:2498:5: (lv_constraints_2_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:2498:5: (lv_constraints_2_0= ruleDConstraint )
            	    // InternalSim.g:2499:6: lv_constraints_2_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsDConstraintParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_constraints_2_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSComplexTypeFeaturesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_2_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DConstraint");
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2());
              		
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
    // $ANTLR end "ruleSComplexTypeFeatures"


    // $ANTLR start "entryRuleDEntityType"
    // InternalSim.g:2525:1: entryRuleDEntityType returns [EObject current=null] : iv_ruleDEntityType= ruleDEntityType EOF ;
    public final EObject entryRuleDEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEntityType = null;


        try {
            // InternalSim.g:2525:52: (iv_ruleDEntityType= ruleDEntityType EOF )
            // InternalSim.g:2526:2: iv_ruleDEntityType= ruleDEntityType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEntityTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDEntityType=ruleDEntityType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEntityType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDEntityType"


    // $ANTLR start "ruleDEntityType"
    // InternalSim.g:2532:1: ruleDEntityType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] ) ;
    public final EObject ruleDEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_root_1_0=null;
        Token otherlv_2=null;
        EObject this_DComplexType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:2538:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] ) )
            // InternalSim.g:2539:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] )
            {
            // InternalSim.g:2539:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] )
            // InternalSim.g:2540:3: ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current]
            {
            // InternalSim.g:2540:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSim.g:2541:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalSim.g:2541:4: (lv_abstract_0_0= 'abstract' )
                    // InternalSim.g:2542:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getDEntityTypeAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDEntityTypeRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:2554:3: ( (lv_root_1_0= 'root' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSim.g:2555:4: (lv_root_1_0= 'root' )
                    {
                    // InternalSim.g:2555:4: (lv_root_1_0= 'root' )
                    // InternalSim.g:2556:5: lv_root_1_0= 'root'
                    {
                    lv_root_1_0=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_root_1_0, grammarAccess.getDEntityTypeAccess().getRootRootKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDEntityTypeRule());
                      					}
                      					setWithLastConsumed(current, "root", true, "root");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDEntityTypeAccess().getEntityKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDEntityTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDEntityTypeAccess().getDComplexTypeParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_3=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_3;
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
    // $ANTLR end "ruleDEntityType"


    // $ANTLR start "ruleDComplexType"
    // InternalSim.g:2588:1: ruleDComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_description_5_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2594:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' ) )
            // InternalSim.g:2595:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' )
            {
            // InternalSim.g:2595:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' )
            // InternalSim.g:2596:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}'
            {
            // InternalSim.g:2596:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:2597:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:2597:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:2598:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

            // InternalSim.g:2614:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==34) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSim.g:2615:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDComplexTypeAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalSim.g:2619:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalSim.g:2620:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalSim.g:2620:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalSim.g:2621:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDComplexTypeAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDComplexTypeRule());
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
            	    break loop52;
                }
            } while (true);

            // InternalSim.g:2638:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==23) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSim.g:2639:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalSim.g:2643:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSim.g:2644:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSim.g:2644:5: (otherlv_4= RULE_ID )
                    // InternalSim.g:2645:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:2657:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_PLAIN_TEXT_ONLY && LA54_0<=RULE_PLAIN_TEXT_START)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSim.g:2658:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalSim.g:2658:4: (lv_description_5_0= ruleDRichText )
                    // InternalSim.g:2659:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDComplexTypeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
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

            otherlv_6=(Token)match(input,28,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDComplexTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSim.g:2680:3: ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )*
            loop55:
            do {
                int alt55=3;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID||LA55_0==25||LA55_0==31||LA55_0==37||LA55_0==39||LA55_0==51) ) {
                    alt55=1;
                }
                else if ( (LA55_0==49) ) {
                    alt55=2;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSim.g:2681:4: ( (lv_features_7_0= ruleFeature ) )
            	    {
            	    // InternalSim.g:2681:4: ( (lv_features_7_0= ruleFeature ) )
            	    // InternalSim.g:2682:5: (lv_features_7_0= ruleFeature )
            	    {
            	    // InternalSim.g:2682:5: (lv_features_7_0= ruleFeature )
            	    // InternalSim.g:2683:6: lv_features_7_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getFeaturesFeatureParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_features_7_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_7_0,
            	      							"com.mimacom.ddd.sm.sim.Sim.Feature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:2701:4: ( (lv_constraints_8_0= ruleDConstraint ) )
            	    {
            	    // InternalSim.g:2701:4: ( (lv_constraints_8_0= ruleDConstraint ) )
            	    // InternalSim.g:2702:5: (lv_constraints_8_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:2702:5: (lv_constraints_8_0= ruleDConstraint )
            	    // InternalSim.g:2703:6: lv_constraints_8_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getConstraintsDConstraintParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_constraints_8_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_8_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DConstraint");
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

            otherlv_9=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDComplexTypeAccess().getRightCurlyBracketKeyword_6());
              		
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


    // $ANTLR start "entryRuleFeature"
    // InternalSim.g:2729:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSim.g:2729:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSim.g:2730:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalSim.g:2736:1: ruleFeature returns [EObject current=null] : (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SAssociationDeduction_0 = null;

        EObject this_DAssociation_1 = null;

        EObject this_SAttributeDeduction_2 = null;

        EObject this_DAttribute_3 = null;

        EObject this_SQueryDeduction_4 = null;

        EObject this_DQuery_5 = null;



        	enterRule();

        try {
            // InternalSim.g:2742:2: ( (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery ) )
            // InternalSim.g:2743:2: (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery )
            {
            // InternalSim.g:2743:2: (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery )
            int alt56=6;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalSim.g:2744:3: this_SAssociationDeduction_0= ruleSAssociationDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getSAssociationDeductionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAssociationDeduction_0=ruleSAssociationDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAssociationDeduction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:2753:3: this_DAssociation_1= ruleDAssociation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getDAssociationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DAssociation_1=ruleDAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DAssociation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSim.g:2762:3: this_SAttributeDeduction_2= ruleSAttributeDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getSAttributeDeductionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAttributeDeduction_2=ruleSAttributeDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAttributeDeduction_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSim.g:2771:3: this_DAttribute_3= ruleDAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getDAttributeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DAttribute_3=ruleDAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DAttribute_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSim.g:2780:3: this_SQueryDeduction_4= ruleSQueryDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getSQueryDeductionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SQueryDeduction_4=ruleSQueryDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SQueryDeduction_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSim.g:2789:3: this_DQuery_5= ruleDQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getDQueryParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DQuery_5=ruleDQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DQuery_5;
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleSAssociationDeduction"
    // InternalSim.g:2801:1: entryRuleSAssociationDeduction returns [EObject current=null] : iv_ruleSAssociationDeduction= ruleSAssociationDeduction EOF ;
    public final EObject entryRuleSAssociationDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAssociationDeduction = null;


        try {
            // InternalSim.g:2801:62: (iv_ruleSAssociationDeduction= ruleSAssociationDeduction EOF )
            // InternalSim.g:2802:2: iv_ruleSAssociationDeduction= ruleSAssociationDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAssociationDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAssociationDeduction=ruleSAssociationDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAssociationDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAssociationDeduction"


    // $ANTLR start "ruleSAssociationDeduction"
    // InternalSim.g:2808:1: ruleSAssociationDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) ;
    public final EObject ruleSAssociationDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_8_0 = null;

        EObject lv_deductionRule_12_0 = null;

        EObject lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2814:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalSim.g:2815:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalSim.g:2815:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalSim.g:2816:3: () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalSim.g:2816:3: ()
            // InternalSim.g:2817:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSAssociationDeductionAccess().getSAssociationDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:2823:3: ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt60=1;
                }
                break;
            case 37:
                {
                alt60=2;
                }
                break;
            case 31:
                {
                alt60=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSim.g:2824:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2824:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2825:5: otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSAssociationDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:2829:5: (otherlv_2= 'reference' | otherlv_3= 'composite' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==41) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==42) ) {
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
                            // InternalSim.g:2830:6: otherlv_2= 'reference'
                            {
                            otherlv_2=(Token)match(input,41,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSAssociationDeductionAccess().getReferenceKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2835:6: otherlv_3= 'composite'
                            {
                            otherlv_3=(Token)match(input,42,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getSAssociationDeductionAccess().getCompositeKeyword_1_0_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalSim.g:2840:5: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2841:6: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2841:6: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2842:7: lv_deductionRule_4_0= ruleSGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAssociationDeductionAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_4_0=ruleSGrabFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSAssociationDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_4_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SGrabFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:2861:4: (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2861:4: (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2862:5: otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSAssociationDeductionAccess().getMorphKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:2866:5: (otherlv_6= 'reference' | otherlv_7= 'composite' )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==41) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==42) ) {
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
                            // InternalSim.g:2867:6: otherlv_6= 'reference'
                            {
                            otherlv_6=(Token)match(input,41,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getSAssociationDeductionAccess().getReferenceKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2872:6: otherlv_7= 'composite'
                            {
                            otherlv_7=(Token)match(input,42,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getSAssociationDeductionAccess().getCompositeKeyword_1_1_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalSim.g:2877:5: ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2878:6: (lv_deductionRule_8_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2878:6: (lv_deductionRule_8_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2879:7: lv_deductionRule_8_0= ruleSMorphFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAssociationDeductionAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_8_0=ruleSMorphFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSAssociationDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_8_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SMorphFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:2898:4: (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2898:4: (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2899:5: otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getSAssociationDeductionAccess().getDitchKeyword_1_2_0());
                      				
                    }
                    // InternalSim.g:2903:5: (otherlv_10= 'reference' | otherlv_11= 'composite' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==41) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==42) ) {
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
                            // InternalSim.g:2904:6: otherlv_10= 'reference'
                            {
                            otherlv_10=(Token)match(input,41,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getSAssociationDeductionAccess().getReferenceKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2909:6: otherlv_11= 'composite'
                            {
                            otherlv_11=(Token)match(input,42,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_11, grammarAccess.getSAssociationDeductionAccess().getCompositeKeyword_1_2_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalSim.g:2914:5: ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2915:6: (lv_deductionRule_12_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2915:6: (lv_deductionRule_12_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2916:7: lv_deductionRule_12_0= ruleSDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAssociationDeductionAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_12_0=ruleSDitchFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSAssociationDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_12_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:2935:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_PLAIN_TEXT_ONLY && LA61_0<=RULE_PLAIN_TEXT_START)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSim.g:2936:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalSim.g:2936:4: (lv_description_13_0= ruleDRichText )
                    // InternalSim.g:2937:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSAssociationDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSAssociationDeductionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_13_0,
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
    // $ANTLR end "ruleSAssociationDeduction"


    // $ANTLR start "entryRuleSAttributeDeduction"
    // InternalSim.g:2958:1: entryRuleSAttributeDeduction returns [EObject current=null] : iv_ruleSAttributeDeduction= ruleSAttributeDeduction EOF ;
    public final EObject entryRuleSAttributeDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttributeDeduction = null;


        try {
            // InternalSim.g:2958:60: (iv_ruleSAttributeDeduction= ruleSAttributeDeduction EOF )
            // InternalSim.g:2959:2: iv_ruleSAttributeDeduction= ruleSAttributeDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAttributeDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAttributeDeduction=ruleSAttributeDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAttributeDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAttributeDeduction"


    // $ANTLR start "ruleSAttributeDeduction"
    // InternalSim.g:2965:1: ruleSAttributeDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) ;
    public final EObject ruleSAttributeDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_detail_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_detail_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_detail_11_0=null;
        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_8_0 = null;

        EObject lv_deductionRule_12_0 = null;

        EObject lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2971:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalSim.g:2972:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalSim.g:2972:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalSim.g:2973:3: () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalSim.g:2973:3: ()
            // InternalSim.g:2974:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSAttributeDeductionAccess().getSAttributeDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:2980:3: ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt65=1;
                }
                break;
            case 37:
                {
                alt65=2;
                }
                break;
            case 31:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalSim.g:2981:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2981:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2982:5: otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSAttributeDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:2986:5: (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )?
                    int alt62=3;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==43) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==39) ) {
                        alt62=2;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalSim.g:2987:6: otherlv_2= 'attribute'
                            {
                            otherlv_2=(Token)match(input,43,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSAttributeDeductionAccess().getAttributeKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2992:6: ( (lv_detail_3_0= 'detail' ) )
                            {
                            // InternalSim.g:2992:6: ( (lv_detail_3_0= 'detail' ) )
                            // InternalSim.g:2993:7: (lv_detail_3_0= 'detail' )
                            {
                            // InternalSim.g:2993:7: (lv_detail_3_0= 'detail' )
                            // InternalSim.g:2994:8: lv_detail_3_0= 'detail'
                            {
                            lv_detail_3_0=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_detail_3_0, grammarAccess.getSAttributeDeductionAccess().getDetailDetailKeyword_1_0_1_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getSAttributeDeductionRule());
                              								}
                              								setWithLastConsumed(current, "detail", true, "detail");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSim.g:3007:5: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:3008:6: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:3008:6: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:3009:7: lv_deductionRule_4_0= ruleSGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAttributeDeductionAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_4_0=ruleSGrabFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSAttributeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_4_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SGrabFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3028:4: (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:3028:4: (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:3029:5: otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSAttributeDeductionAccess().getMorphKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:3033:5: (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )?
                    int alt63=3;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==43) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==39) ) {
                        alt63=2;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalSim.g:3034:6: otherlv_6= 'attribute'
                            {
                            otherlv_6=(Token)match(input,43,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getSAttributeDeductionAccess().getAttributeKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:3039:6: ( (lv_detail_7_0= 'detail' ) )
                            {
                            // InternalSim.g:3039:6: ( (lv_detail_7_0= 'detail' ) )
                            // InternalSim.g:3040:7: (lv_detail_7_0= 'detail' )
                            {
                            // InternalSim.g:3040:7: (lv_detail_7_0= 'detail' )
                            // InternalSim.g:3041:8: lv_detail_7_0= 'detail'
                            {
                            lv_detail_7_0=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_detail_7_0, grammarAccess.getSAttributeDeductionAccess().getDetailDetailKeyword_1_1_1_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getSAttributeDeductionRule());
                              								}
                              								setWithLastConsumed(current, "detail", true, "detail");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSim.g:3054:5: ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:3055:6: (lv_deductionRule_8_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:3055:6: (lv_deductionRule_8_0= ruleSMorphFeatureRule )
                    // InternalSim.g:3056:7: lv_deductionRule_8_0= ruleSMorphFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAttributeDeductionAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_8_0=ruleSMorphFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSAttributeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_8_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SMorphFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:3075:4: (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3075:4: (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3076:5: otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getSAttributeDeductionAccess().getDitchKeyword_1_2_0());
                      				
                    }
                    // InternalSim.g:3080:5: (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )?
                    int alt64=3;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==43) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==39) ) {
                        alt64=2;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalSim.g:3081:6: otherlv_10= 'attribute'
                            {
                            otherlv_10=(Token)match(input,43,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getSAttributeDeductionAccess().getAttributeKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:3086:6: ( (lv_detail_11_0= 'detail' ) )
                            {
                            // InternalSim.g:3086:6: ( (lv_detail_11_0= 'detail' ) )
                            // InternalSim.g:3087:7: (lv_detail_11_0= 'detail' )
                            {
                            // InternalSim.g:3087:7: (lv_detail_11_0= 'detail' )
                            // InternalSim.g:3088:8: lv_detail_11_0= 'detail'
                            {
                            lv_detail_11_0=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_detail_11_0, grammarAccess.getSAttributeDeductionAccess().getDetailDetailKeyword_1_2_1_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getSAttributeDeductionRule());
                              								}
                              								setWithLastConsumed(current, "detail", true, "detail");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSim.g:3101:5: ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3102:6: (lv_deductionRule_12_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3102:6: (lv_deductionRule_12_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3103:7: lv_deductionRule_12_0= ruleSDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAttributeDeductionAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_12_0=ruleSDitchFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSAttributeDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_12_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:3122:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_PLAIN_TEXT_ONLY && LA66_0<=RULE_PLAIN_TEXT_START)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSim.g:3123:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalSim.g:3123:4: (lv_description_13_0= ruleDRichText )
                    // InternalSim.g:3124:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSAttributeDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSAttributeDeductionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_13_0,
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
    // $ANTLR end "ruleSAttributeDeduction"


    // $ANTLR start "entryRuleSQueryDeduction"
    // InternalSim.g:3145:1: entryRuleSQueryDeduction returns [EObject current=null] : iv_ruleSQueryDeduction= ruleSQueryDeduction EOF ;
    public final EObject entryRuleSQueryDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryDeduction = null;


        try {
            // InternalSim.g:3145:56: (iv_ruleSQueryDeduction= ruleSQueryDeduction EOF )
            // InternalSim.g:3146:2: iv_ruleSQueryDeduction= ruleSQueryDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSQueryDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSQueryDeduction=ruleSQueryDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSQueryDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSQueryDeduction"


    // $ANTLR start "ruleSQueryDeduction"
    // InternalSim.g:3152:1: ruleSQueryDeduction returns [EObject current=null] : ( () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )? ) ;
    public final EObject ruleSQueryDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_6_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_deductionRule_15_0 = null;

        EObject lv_description_16_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3158:2: ( ( () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )? ) )
            // InternalSim.g:3159:2: ( () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )? )
            {
            // InternalSim.g:3159:2: ( () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )? )
            // InternalSim.g:3160:3: () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )?
            {
            // InternalSim.g:3160:3: ()
            // InternalSim.g:3161:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSQueryDeductionAccess().getSQueryDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:3167:3: ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25||LA71_0==37) ) {
                alt71=1;
            }
            else if ( (LA71_0==31) ) {
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
                    // InternalSim.g:3168:4: ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' )
                    {
                    // InternalSim.g:3168:4: ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' )
                    // InternalSim.g:3169:5: ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')'
                    {
                    // InternalSim.g:3169:5: ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==25) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==37) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalSim.g:3170:6: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            {
                            // InternalSim.g:3170:6: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            // InternalSim.g:3171:7: otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            {
                            otherlv_1=(Token)match(input,25,FOLLOW_41); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_1, grammarAccess.getSQueryDeductionAccess().getGrabKeyword_1_0_0_0_0());
                              						
                            }
                            otherlv_2=(Token)match(input,44,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getSQueryDeductionAccess().getQueryKeyword_1_0_0_0_1());
                              						
                            }
                            // InternalSim.g:3179:7: ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            // InternalSim.g:3180:8: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            {
                            // InternalSim.g:3180:8: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            // InternalSim.g:3181:9: lv_deductionRule_3_0= ruleSGrabFeatureRule
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSQueryDeductionAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_1_0_0_0_2_0());
                              								
                            }
                            pushFollow(FOLLOW_42);
                            lv_deductionRule_3_0=ruleSGrabFeatureRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getSQueryDeductionRule());
                              									}
                              									set(
                              										current,
                              										"deductionRule",
                              										lv_deductionRule_3_0,
                              										"com.mimacom.ddd.sm.sim.Sim.SGrabFeatureRule");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSim.g:3200:6: (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) )
                            {
                            // InternalSim.g:3200:6: (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) )
                            // InternalSim.g:3201:7: otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) )
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_41); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSQueryDeductionAccess().getMorphKeyword_1_0_0_1_0());
                              						
                            }
                            otherlv_5=(Token)match(input,44,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_5, grammarAccess.getSQueryDeductionAccess().getQueryKeyword_1_0_0_1_1());
                              						
                            }
                            // InternalSim.g:3209:7: ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) )
                            // InternalSim.g:3210:8: (lv_deductionRule_6_0= ruleSMorphFeatureRule )
                            {
                            // InternalSim.g:3210:8: (lv_deductionRule_6_0= ruleSMorphFeatureRule )
                            // InternalSim.g:3211:9: lv_deductionRule_6_0= ruleSMorphFeatureRule
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSQueryDeductionAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_0_0_1_2_0());
                              								
                            }
                            pushFollow(FOLLOW_42);
                            lv_deductionRule_6_0=ruleSMorphFeatureRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getSQueryDeductionRule());
                              									}
                              									set(
                              										current,
                              										"deductionRule",
                              										lv_deductionRule_6_0,
                              										"com.mimacom.ddd.sm.sim.Sim.SMorphFeatureRule");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,45,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getSQueryDeductionAccess().getLeftParenthesisKeyword_1_0_1());
                      				
                    }
                    // InternalSim.g:3234:5: (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==46) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==RULE_ID||LA70_0==25||LA70_0==31||LA70_0==37||LA70_0==47) ) {
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
                            // InternalSim.g:3235:6: otherlv_8= '*'
                            {
                            otherlv_8=(Token)match(input,46,FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getSQueryDeductionAccess().getAsteriskKeyword_1_0_2_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:3240:6: ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )?
                            {
                            // InternalSim.g:3240:6: ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )?
                            int alt69=2;
                            int LA69_0 = input.LA(1);

                            if ( (LA69_0==RULE_ID||LA69_0==25||LA69_0==31||LA69_0==37) ) {
                                alt69=1;
                            }
                            switch (alt69) {
                                case 1 :
                                    // InternalSim.g:3241:7: ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )*
                                    {
                                    // InternalSim.g:3241:7: ( (lv_parameters_9_0= ruleQueryParameter ) )
                                    // InternalSim.g:3242:8: (lv_parameters_9_0= ruleQueryParameter )
                                    {
                                    // InternalSim.g:3242:8: (lv_parameters_9_0= ruleQueryParameter )
                                    // InternalSim.g:3243:9: lv_parameters_9_0= ruleQueryParameter
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSQueryDeductionAccess().getParametersQueryParameterParserRuleCall_1_0_2_1_0_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_45);
                                    lv_parameters_9_0=ruleQueryParameter();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSQueryDeductionRule());
                                      									}
                                      									add(
                                      										current,
                                      										"parameters",
                                      										lv_parameters_9_0,
                                      										"com.mimacom.ddd.sm.sim.Sim.QueryParameter");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }

                                    // InternalSim.g:3260:7: (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )*
                                    loop68:
                                    do {
                                        int alt68=2;
                                        int LA68_0 = input.LA(1);

                                        if ( (LA68_0==33) ) {
                                            alt68=1;
                                        }


                                        switch (alt68) {
                                    	case 1 :
                                    	    // InternalSim.g:3261:8: otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) )
                                    	    {
                                    	    otherlv_10=(Token)match(input,33,FOLLOW_46); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      								newLeafNode(otherlv_10, grammarAccess.getSQueryDeductionAccess().getCommaKeyword_1_0_2_1_1_0());
                                    	      							
                                    	    }
                                    	    // InternalSim.g:3265:8: ( (lv_parameters_11_0= ruleQueryParameter ) )
                                    	    // InternalSim.g:3266:9: (lv_parameters_11_0= ruleQueryParameter )
                                    	    {
                                    	    // InternalSim.g:3266:9: (lv_parameters_11_0= ruleQueryParameter )
                                    	    // InternalSim.g:3267:10: lv_parameters_11_0= ruleQueryParameter
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      										newCompositeNode(grammarAccess.getSQueryDeductionAccess().getParametersQueryParameterParserRuleCall_1_0_2_1_1_1_0());
                                    	      									
                                    	    }
                                    	    pushFollow(FOLLOW_45);
                                    	    lv_parameters_11_0=ruleQueryParameter();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      										if (current==null) {
                                    	      											current = createModelElementForParent(grammarAccess.getSQueryDeductionRule());
                                    	      										}
                                    	      										add(
                                    	      											current,
                                    	      											"parameters",
                                    	      											lv_parameters_11_0,
                                    	      											"com.mimacom.ddd.sm.sim.Sim.QueryParameter");
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


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,47,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getSQueryDeductionAccess().getRightParenthesisKeyword_1_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3293:4: (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3293:4: (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3294:5: otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getSQueryDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_14=(Token)match(input,44,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_14, grammarAccess.getSQueryDeductionAccess().getQueryKeyword_1_1_1());
                      				
                    }
                    // InternalSim.g:3302:5: ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3303:6: (lv_deductionRule_15_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3303:6: (lv_deductionRule_15_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3304:7: lv_deductionRule_15_0= ruleSDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSQueryDeductionAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_15_0=ruleSDitchFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSQueryDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_15_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:3323:3: ( (lv_description_16_0= ruleDRichText ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_PLAIN_TEXT_ONLY && LA72_0<=RULE_PLAIN_TEXT_START)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSim.g:3324:4: (lv_description_16_0= ruleDRichText )
                    {
                    // InternalSim.g:3324:4: (lv_description_16_0= ruleDRichText )
                    // InternalSim.g:3325:5: lv_description_16_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSQueryDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_16_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSQueryDeductionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_16_0,
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
    // $ANTLR end "ruleSQueryDeduction"


    // $ANTLR start "entryRuleDQuery"
    // InternalSim.g:3346:1: entryRuleDQuery returns [EObject current=null] : iv_ruleDQuery= ruleDQuery EOF ;
    public final EObject entryRuleDQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQuery = null;


        try {
            // InternalSim.g:3346:47: (iv_ruleDQuery= ruleDQuery EOF )
            // InternalSim.g:3347:2: iv_ruleDQuery= ruleDQuery EOF
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
    // InternalSim.g:3353:1: ruleDQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_multiplicity_10_0 = null;

        EObject lv_returns_12_0 = null;

        EObject lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3359:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalSim.g:3360:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalSim.g:3360:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalSim.g:3361:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalSim.g:3361:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:3362:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:3362:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:3363:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
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

            // InternalSim.g:3379:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==34) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalSim.g:3380:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDQueryAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalSim.g:3384:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalSim.g:3385:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalSim.g:3385:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalSim.g:3386:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDQueryAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDQueryRule());
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
            	    break loop73;
                }
            } while (true);

            otherlv_3=(Token)match(input,45,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDQueryAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSim.g:3407:3: ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID||LA75_0==25||LA75_0==31||LA75_0==37) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalSim.g:3408:4: ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )*
                    {
                    // InternalSim.g:3408:4: ( (lv_parameters_4_0= ruleQueryParameter ) )
                    // InternalSim.g:3409:5: (lv_parameters_4_0= ruleQueryParameter )
                    {
                    // InternalSim.g:3409:5: (lv_parameters_4_0= ruleQueryParameter )
                    // InternalSim.g:3410:6: lv_parameters_4_0= ruleQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getParametersQueryParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_parameters_4_0=ruleQueryParameter();

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
                      							"com.mimacom.ddd.sm.sim.Sim.QueryParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSim.g:3427:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==33) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalSim.g:3428:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDQueryAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:3432:5: ( (lv_parameters_6_0= ruleQueryParameter ) )
                    	    // InternalSim.g:3433:6: (lv_parameters_6_0= ruleQueryParameter )
                    	    {
                    	    // InternalSim.g:3433:6: (lv_parameters_6_0= ruleQueryParameter )
                    	    // InternalSim.g:3434:7: lv_parameters_6_0= ruleQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDQueryAccess().getParametersQueryParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_parameters_6_0=ruleQueryParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDQueryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_6_0,
                    	      								"com.mimacom.ddd.sm.sim.Sim.QueryParameter");
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


                    }
                    break;

            }

            otherlv_7=(Token)match(input,47,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDQueryAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDQueryAccess().getColonKeyword_5());
              		
            }
            // InternalSim.g:3461:3: ( (otherlv_9= RULE_ID ) )
            // InternalSim.g:3462:4: (otherlv_9= RULE_ID )
            {
            // InternalSim.g:3462:4: (otherlv_9= RULE_ID )
            // InternalSim.g:3463:5: otherlv_9= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryRule());
              					}
              				
            }
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_9, grammarAccess.getDQueryAccess().getTypeDTypeCrossReference_6_0());
              				
            }

            }


            }

            // InternalSim.g:3474:3: ( (lv_multiplicity_10_0= ruleDMultiplicity ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=45 && LA76_0<=46)||LA76_0==88||LA76_0==129) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalSim.g:3475:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:3475:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    // InternalSim.g:3476:5: lv_multiplicity_10_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getMultiplicityDMultiplicityParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_50);
                    lv_multiplicity_10_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_10_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:3493:3: (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==48) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSim.g:3494:4: otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) )
                    {
                    otherlv_11=(Token)match(input,48,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDQueryAccess().getReturnsKeyword_8_0());
                      			
                    }
                    // InternalSim.g:3498:4: ( (lv_returns_12_0= ruleDExpression ) )
                    // InternalSim.g:3499:5: (lv_returns_12_0= ruleDExpression )
                    {
                    // InternalSim.g:3499:5: (lv_returns_12_0= ruleDExpression )
                    // InternalSim.g:3500:6: lv_returns_12_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getReturnsDExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_returns_12_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDQueryRule());
                      						}
                      						set(
                      							current,
                      							"returns",
                      							lv_returns_12_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:3518:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_PLAIN_TEXT_ONLY && LA78_0<=RULE_PLAIN_TEXT_START)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSim.g:3519:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalSim.g:3519:4: (lv_description_13_0= ruleDRichText )
                    // InternalSim.g:3520:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getDescriptionDRichTextParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_13_0,
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


    // $ANTLR start "entryRuleQueryParameter"
    // InternalSim.g:3541:1: entryRuleQueryParameter returns [EObject current=null] : iv_ruleQueryParameter= ruleQueryParameter EOF ;
    public final EObject entryRuleQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryParameter = null;


        try {
            // InternalSim.g:3541:55: (iv_ruleQueryParameter= ruleQueryParameter EOF )
            // InternalSim.g:3542:2: iv_ruleQueryParameter= ruleQueryParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQueryParameter=ruleQueryParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryParameter"


    // $ANTLR start "ruleQueryParameter"
    // InternalSim.g:3548:1: ruleQueryParameter returns [EObject current=null] : (this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction | this_DQueryParameter_1= ruleDQueryParameter ) ;
    public final EObject ruleQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject this_SQueryParameterDeduction_0 = null;

        EObject this_DQueryParameter_1 = null;



        	enterRule();

        try {
            // InternalSim.g:3554:2: ( (this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction | this_DQueryParameter_1= ruleDQueryParameter ) )
            // InternalSim.g:3555:2: (this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction | this_DQueryParameter_1= ruleDQueryParameter )
            {
            // InternalSim.g:3555:2: (this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction | this_DQueryParameter_1= ruleDQueryParameter )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==25||LA79_0==31||LA79_0==37) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_ID) ) {
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
                    // InternalSim.g:3556:3: this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQueryParameterAccess().getSQueryParameterDeductionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SQueryParameterDeduction_0=ruleSQueryParameterDeduction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SQueryParameterDeduction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:3565:3: this_DQueryParameter_1= ruleDQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQueryParameterAccess().getDQueryParameterParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DQueryParameter_1=ruleDQueryParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DQueryParameter_1;
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
    // $ANTLR end "ruleQueryParameter"


    // $ANTLR start "entryRuleSQueryParameterDeduction"
    // InternalSim.g:3577:1: entryRuleSQueryParameterDeduction returns [EObject current=null] : iv_ruleSQueryParameterDeduction= ruleSQueryParameterDeduction EOF ;
    public final EObject entryRuleSQueryParameterDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryParameterDeduction = null;


        try {
            // InternalSim.g:3577:65: (iv_ruleSQueryParameterDeduction= ruleSQueryParameterDeduction EOF )
            // InternalSim.g:3578:2: iv_ruleSQueryParameterDeduction= ruleSQueryParameterDeduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSQueryParameterDeductionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSQueryParameterDeduction=ruleSQueryParameterDeduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSQueryParameterDeduction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSQueryParameterDeduction"


    // $ANTLR start "ruleSQueryParameterDeduction"
    // InternalSim.g:3584:1: ruleSQueryParameterDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? ) ;
    public final EObject ruleSQueryParameterDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_6_0 = null;

        EObject lv_description_7_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3590:2: ( ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? ) )
            // InternalSim.g:3591:2: ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            {
            // InternalSim.g:3591:2: ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            // InternalSim.g:3592:3: () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )?
            {
            // InternalSim.g:3592:3: ()
            // InternalSim.g:3593:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSQueryParameterDeductionAccess().getSQueryParameterDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:3599:3: ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt80=1;
                }
                break;
            case 37:
                {
                alt80=2;
                }
                break;
            case 31:
                {
                alt80=3;
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
                    // InternalSim.g:3600:4: (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:3600:4: (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:3601:5: otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSQueryParameterDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:3605:5: ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:3606:6: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:3606:6: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    // InternalSim.g:3607:7: lv_deductionRule_2_0= ruleSGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSQueryParameterDeductionAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_2_0=ruleSGrabFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSQueryParameterDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_2_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SGrabFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3626:4: (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:3626:4: (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:3627:5: otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSQueryParameterDeductionAccess().getMorphKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:3631:5: ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:3632:6: (lv_deductionRule_4_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:3632:6: (lv_deductionRule_4_0= ruleSMorphFeatureRule )
                    // InternalSim.g:3633:7: lv_deductionRule_4_0= ruleSMorphFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSQueryParameterDeductionAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_4_0=ruleSMorphFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSQueryParameterDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_4_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SMorphFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:3652:4: (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3652:4: (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3653:5: otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSQueryParameterDeductionAccess().getDitchKeyword_1_2_0());
                      				
                    }
                    // InternalSim.g:3657:5: ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3658:6: (lv_deductionRule_6_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3658:6: (lv_deductionRule_6_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3659:7: lv_deductionRule_6_0= ruleSDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSQueryParameterDeductionAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
                    lv_deductionRule_6_0=ruleSDitchFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSQueryParameterDeductionRule());
                      							}
                      							set(
                      								current,
                      								"deductionRule",
                      								lv_deductionRule_6_0,
                      								"com.mimacom.ddd.sm.sim.Sim.SDitchFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:3678:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_PLAIN_TEXT_ONLY && LA81_0<=RULE_PLAIN_TEXT_START)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSim.g:3679:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalSim.g:3679:4: (lv_description_7_0= ruleDRichText )
                    // InternalSim.g:3680:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSQueryParameterDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSQueryParameterDeductionRule());
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
    // $ANTLR end "ruleSQueryParameterDeduction"


    // $ANTLR start "entryRuleSCoreQuery"
    // InternalSim.g:3701:1: entryRuleSCoreQuery returns [EObject current=null] : iv_ruleSCoreQuery= ruleSCoreQuery EOF ;
    public final EObject entryRuleSCoreQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCoreQuery = null;


        try {
            // InternalSim.g:3701:51: (iv_ruleSCoreQuery= ruleSCoreQuery EOF )
            // InternalSim.g:3702:2: iv_ruleSCoreQuery= ruleSCoreQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCoreQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSCoreQuery=ruleSCoreQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCoreQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCoreQuery"


    // $ANTLR start "ruleSCoreQuery"
    // InternalSim.g:3708:1: ruleSCoreQuery returns [EObject current=null] : (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ) ;
    public final EObject ruleSCoreQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_multiplicity_11_0 = null;

        EObject lv_returns_13_0 = null;

        EObject lv_description_14_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3714:2: ( (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ) )
            // InternalSim.g:3715:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? )
            {
            // InternalSim.g:3715:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? )
            // InternalSim.g:3716:3: otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSCoreQueryAccess().getQueryKeyword_0());
              		
            }
            // InternalSim.g:3720:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:3721:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:3721:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:3722:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSCoreQueryAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSCoreQueryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalSim.g:3738:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==34) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalSim.g:3739:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSCoreQueryAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:3743:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:3744:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:3744:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:3745:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getSCoreQueryAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSCoreQueryRule());
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
            	    break loop82;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSCoreQueryAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalSim.g:3766:3: ( ( (lv_parameters_5_0= ruleDQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalSim.g:3767:4: ( (lv_parameters_5_0= ruleDQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) ) )*
                    {
                    // InternalSim.g:3767:4: ( (lv_parameters_5_0= ruleDQueryParameter ) )
                    // InternalSim.g:3768:5: (lv_parameters_5_0= ruleDQueryParameter )
                    {
                    // InternalSim.g:3768:5: (lv_parameters_5_0= ruleDQueryParameter )
                    // InternalSim.g:3769:6: lv_parameters_5_0= ruleDQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSCoreQueryAccess().getParametersDQueryParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_parameters_5_0=ruleDQueryParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSCoreQueryRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_5_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DQueryParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSim.g:3786:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==33) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalSim.g:3787:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleDQueryParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,33,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getSCoreQueryAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:3791:5: ( (lv_parameters_7_0= ruleDQueryParameter ) )
                    	    // InternalSim.g:3792:6: (lv_parameters_7_0= ruleDQueryParameter )
                    	    {
                    	    // InternalSim.g:3792:6: (lv_parameters_7_0= ruleDQueryParameter )
                    	    // InternalSim.g:3793:7: lv_parameters_7_0= ruleDQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSCoreQueryAccess().getParametersDQueryParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_parameters_7_0=ruleDQueryParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSCoreQueryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_7_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DQueryParameter");
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
                    break;

            }

            otherlv_8=(Token)match(input,47,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSCoreQueryAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getSCoreQueryAccess().getColonKeyword_6());
              		
            }
            // InternalSim.g:3820:3: ( (otherlv_10= RULE_ID ) )
            // InternalSim.g:3821:4: (otherlv_10= RULE_ID )
            {
            // InternalSim.g:3821:4: (otherlv_10= RULE_ID )
            // InternalSim.g:3822:5: otherlv_10= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSCoreQueryRule());
              					}
              				
            }
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_10, grammarAccess.getSCoreQueryAccess().getTypeDTypeCrossReference_7_0());
              				
            }

            }


            }

            // InternalSim.g:3833:3: ( (lv_multiplicity_11_0= ruleDMultiplicity ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=45 && LA85_0<=46)||LA85_0==88||LA85_0==129) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSim.g:3834:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:3834:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    // InternalSim.g:3835:5: lv_multiplicity_11_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSCoreQueryAccess().getMultiplicityDMultiplicityParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_50);
                    lv_multiplicity_11_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSCoreQueryRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_11_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:3852:3: (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==48) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSim.g:3853:4: otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) )
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getSCoreQueryAccess().getReturnsKeyword_9_0());
                      			
                    }
                    // InternalSim.g:3857:4: ( (lv_returns_13_0= ruleDExpression ) )
                    // InternalSim.g:3858:5: (lv_returns_13_0= ruleDExpression )
                    {
                    // InternalSim.g:3858:5: (lv_returns_13_0= ruleDExpression )
                    // InternalSim.g:3859:6: lv_returns_13_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSCoreQueryAccess().getReturnsDExpressionParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_returns_13_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSCoreQueryRule());
                      						}
                      						set(
                      							current,
                      							"returns",
                      							lv_returns_13_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:3877:3: ( (lv_description_14_0= ruleDRichText ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=RULE_PLAIN_TEXT_ONLY && LA87_0<=RULE_PLAIN_TEXT_START)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSim.g:3878:4: (lv_description_14_0= ruleDRichText )
                    {
                    // InternalSim.g:3878:4: (lv_description_14_0= ruleDRichText )
                    // InternalSim.g:3879:5: lv_description_14_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSCoreQueryAccess().getDescriptionDRichTextParserRuleCall_10_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_14_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSCoreQueryRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_14_0,
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
    // $ANTLR end "ruleSCoreQuery"


    // $ANTLR start "entryRuleDType"
    // InternalSim.g:3900:1: entryRuleDType returns [EObject current=null] : iv_ruleDType= ruleDType EOF ;
    public final EObject entryRuleDType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDType = null;


        try {
            // InternalSim.g:3900:46: (iv_ruleDType= ruleDType EOF )
            // InternalSim.g:3901:2: iv_ruleDType= ruleDType EOF
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
    // InternalSim.g:3907:1: ruleDType returns [EObject current=null] : (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DEntityType_2= ruleDEntityType | this_DDetailType_3= ruleDDetailType ) ;
    public final EObject ruleDType() throws RecognitionException {
        EObject current = null;

        EObject this_DPrimitive_0 = null;

        EObject this_DEnumeration_1 = null;

        EObject this_DEntityType_2 = null;

        EObject this_DDetailType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:3913:2: ( (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DEntityType_2= ruleDEntityType | this_DDetailType_3= ruleDDetailType ) )
            // InternalSim.g:3914:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DEntityType_2= ruleDEntityType | this_DDetailType_3= ruleDDetailType )
            {
            // InternalSim.g:3914:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DEntityType_2= ruleDEntityType | this_DDetailType_3= ruleDDetailType )
            int alt88=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt88=1;
                }
                break;
            case 32:
                {
                alt88=2;
                }
                break;
            case 40:
                {
                int LA88_3 = input.LA(2);

                if ( (LA88_3==39) ) {
                    alt88=4;
                }
                else if ( ((LA88_3>=35 && LA88_3<=36)) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 3, input);

                    throw nvae;
                }
                }
                break;
            case 35:
            case 36:
                {
                alt88=3;
                }
                break;
            case 39:
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
                    // InternalSim.g:3915:3: this_DPrimitive_0= ruleDPrimitive
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
                    // InternalSim.g:3924:3: this_DEnumeration_1= ruleDEnumeration
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
                    // InternalSim.g:3933:3: this_DEntityType_2= ruleDEntityType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDEntityTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEntityType_2=ruleDEntityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEntityType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSim.g:3942:3: this_DDetailType_3= ruleDDetailType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDDetailTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDetailType_3=ruleDDetailType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDetailType_3;
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
    // InternalSim.g:3954:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalSim.g:3954:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalSim.g:3955:2: iv_ruleDConstraint= ruleDConstraint EOF
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
    // InternalSim.g:3961:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) ;
    public final EObject ruleDConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        EObject lv_predicate_5_0 = null;

        EObject lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3967:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalSim.g:3968:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalSim.g:3968:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalSim.g:3969:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalSim.g:3973:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:3974:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:3974:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:3975:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
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

            // InternalSim.g:3991:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==34) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalSim.g:3992:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:3996:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:3997:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:3997:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:3998:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDConstraintAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDConstraintRule());
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
            	    break loop89;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalSim.g:4019:3: ( (lv_predicate_5_0= ruleDExpression ) )
            // InternalSim.g:4020:4: (lv_predicate_5_0= ruleDExpression )
            {
            // InternalSim.g:4020:4: (lv_predicate_5_0= ruleDExpression )
            // InternalSim.g:4021:5: lv_predicate_5_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getPredicateDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_predicate_5_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDConstraintRule());
              					}
              					set(
              						current,
              						"predicate",
              						lv_predicate_5_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:4038:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=RULE_PLAIN_TEXT_ONLY && LA90_0<=RULE_PLAIN_TEXT_START)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSim.g:4039:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalSim.g:4039:4: (lv_description_6_0= ruleDRichText )
                    // InternalSim.g:4040:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDConstraintAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDConstraintRule());
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
    // $ANTLR end "ruleDConstraint"


    // $ANTLR start "entryRuleDPrimitive"
    // InternalSim.g:4061:1: entryRuleDPrimitive returns [EObject current=null] : iv_ruleDPrimitive= ruleDPrimitive EOF ;
    public final EObject entryRuleDPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimitive = null;


        try {
            // InternalSim.g:4061:51: (iv_ruleDPrimitive= ruleDPrimitive EOF )
            // InternalSim.g:4062:2: iv_ruleDPrimitive= ruleDPrimitive EOF
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
    // InternalSim.g:4068:1: ruleDPrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )? ) ;
    public final EObject ruleDPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_description_6_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4074:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )? ) )
            // InternalSim.g:4075:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )? )
            {
            // InternalSim.g:4075:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )? )
            // InternalSim.g:4076:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDPrimitiveAccess().getPrimitiveKeyword_0());
              		
            }
            // InternalSim.g:4080:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:4081:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:4081:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:4082:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
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

            // InternalSim.g:4098:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==34) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalSim.g:4099:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDPrimitiveAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:4103:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:4104:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:4104:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:4105:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDPrimitiveAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDPrimitiveRule());
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
            	    break loop91;
                }
            } while (true);

            otherlv_4=(Token)match(input,50,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDPrimitiveAccess().getRedefinesKeyword_3());
              		
            }
            // InternalSim.g:4126:3: ( (otherlv_5= RULE_ID ) )
            // InternalSim.g:4127:4: (otherlv_5= RULE_ID )
            {
            // InternalSim.g:4127:4: (otherlv_5= RULE_ID )
            // InternalSim.g:4128:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDPrimitiveRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getDPrimitiveAccess().getRedefinesDmxArchetypeCrossReference_4_0());
              				
            }

            }


            }

            // InternalSim.g:4139:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_PLAIN_TEXT_ONLY && LA92_0<=RULE_PLAIN_TEXT_START)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSim.g:4140:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalSim.g:4140:4: (lv_description_6_0= ruleDRichText )
                    // InternalSim.g:4141:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_55);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDPrimitiveRule());
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

            // InternalSim.g:4158:3: (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==28) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSim.g:4159:4: otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDPrimitiveAccess().getLeftCurlyBracketKeyword_6_0());
                      			
                    }
                    // InternalSim.g:4163:4: ( (lv_constraints_8_0= ruleDConstraint ) )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==49) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalSim.g:4164:5: (lv_constraints_8_0= ruleDConstraint )
                    	    {
                    	    // InternalSim.g:4164:5: (lv_constraints_8_0= ruleDConstraint )
                    	    // InternalSim.g:4165:6: lv_constraints_8_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDPrimitiveAccess().getConstraintsDConstraintParserRuleCall_6_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_27);
                    	    lv_constraints_8_0=ruleDConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDPrimitiveRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"constraints",
                    	      							lv_constraints_8_0,
                    	      							"com.mimacom.ddd.dm.dim.Dim.DConstraint");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt93 >= 1 ) break loop93;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDPrimitiveAccess().getRightCurlyBracketKeyword_6_2());
                      			
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
    // $ANTLR end "ruleDPrimitive"


    // $ANTLR start "entryRuleDLiteral"
    // InternalSim.g:4191:1: entryRuleDLiteral returns [EObject current=null] : iv_ruleDLiteral= ruleDLiteral EOF ;
    public final EObject entryRuleDLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteral = null;


        try {
            // InternalSim.g:4191:49: (iv_ruleDLiteral= ruleDLiteral EOF )
            // InternalSim.g:4192:2: iv_ruleDLiteral= ruleDLiteral EOF
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
    // InternalSim.g:4198:1: ruleDLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? ) ;
    public final EObject ruleDLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4204:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? ) )
            // InternalSim.g:4205:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? )
            {
            // InternalSim.g:4205:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? )
            // InternalSim.g:4206:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )?
            {
            // InternalSim.g:4206:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:4207:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:4207:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:4208:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
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

            // InternalSim.g:4224:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==34) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalSim.g:4225:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDLiteralAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalSim.g:4229:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalSim.g:4230:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalSim.g:4230:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalSim.g:4231:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDLiteralAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDLiteralRule());
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
            	    break loop95;
                }
            } while (true);

            // InternalSim.g:4248:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_PLAIN_TEXT_ONLY && LA96_0<=RULE_PLAIN_TEXT_START)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalSim.g:4249:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalSim.g:4249:4: (lv_description_3_0= ruleDRichText )
                    // InternalSim.g:4250:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDLiteralAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDLiteralRule());
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
    // $ANTLR end "ruleDLiteral"


    // $ANTLR start "entryRuleDDetailType"
    // InternalSim.g:4271:1: entryRuleDDetailType returns [EObject current=null] : iv_ruleDDetailType= ruleDDetailType EOF ;
    public final EObject entryRuleDDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDetailType = null;


        try {
            // InternalSim.g:4271:52: (iv_ruleDDetailType= ruleDDetailType EOF )
            // InternalSim.g:4272:2: iv_ruleDDetailType= ruleDDetailType EOF
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
    // InternalSim.g:4278:1: ruleDDetailType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDDetailType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalSim.g:4284:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalSim.g:4285:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalSim.g:4285:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalSim.g:4286:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalSim.g:4286:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==40) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalSim.g:4287:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalSim.g:4287:4: (lv_abstract_0_0= 'abstract' )
                    // InternalSim.g:4288:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,40,FOLLOW_36); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDAssociation"
    // InternalSim.g:4319:1: entryRuleDAssociation returns [EObject current=null] : iv_ruleDAssociation= ruleDAssociation EOF ;
    public final EObject entryRuleDAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssociation = null;


        try {
            // InternalSim.g:4319:53: (iv_ruleDAssociation= ruleDAssociation EOF )
            // InternalSim.g:4320:2: iv_ruleDAssociation= ruleDAssociation EOF
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
    // InternalSim.g:4326:1: ruleDAssociation returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_kind_4_0 = null;

        Enumerator lv_kind_5_0 = null;

        EObject lv_multiplicity_8_0 = null;

        EObject lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4332:2: ( ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalSim.g:4333:2: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalSim.g:4333:2: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalSim.g:4334:3: ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalSim.g:4334:3: ( (lv_derived_0_0= 'derived' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==51) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSim.g:4335:4: (lv_derived_0_0= 'derived' )
                    {
                    // InternalSim.g:4335:4: (lv_derived_0_0= 'derived' )
                    // InternalSim.g:4336:5: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,51,FOLLOW_6); if (state.failed) return current;
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

            // InternalSim.g:4348:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:4349:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:4349:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:4350:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDAssociationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalSim.g:4366:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==34) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalSim.g:4367:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDAssociationAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:4371:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:4372:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:4372:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:4373:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDAssociationAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDAssociationRule());
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
            	    break loop99;
                }
            } while (true);

            // InternalSim.g:4390:3: ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==52||LA100_0==96) ) {
                alt100=1;
            }
            else if ( (LA100_0==97) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalSim.g:4391:4: ( (lv_kind_4_0= ruleDAssociationKind ) )
                    {
                    // InternalSim.g:4391:4: ( (lv_kind_4_0= ruleDAssociationKind ) )
                    // InternalSim.g:4392:5: (lv_kind_4_0= ruleDAssociationKind )
                    {
                    // InternalSim.g:4392:5: (lv_kind_4_0= ruleDAssociationKind )
                    // InternalSim.g:4393:6: lv_kind_4_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindEnumRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_kind_4_0=ruleDAssociationKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      						}
                      						set(
                      							current,
                      							"kind",
                      							lv_kind_4_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DAssociationKind");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:4411:4: ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' )
                    {
                    // InternalSim.g:4411:4: ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' )
                    // InternalSim.g:4412:5: ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains'
                    {
                    // InternalSim.g:4412:5: ( (lv_kind_5_0= ruleDAssociationKindInverse ) )
                    // InternalSim.g:4413:6: (lv_kind_5_0= ruleDAssociationKindInverse )
                    {
                    // InternalSim.g:4413:6: (lv_kind_5_0= ruleDAssociationKindInverse )
                    // InternalSim.g:4414:7: lv_kind_5_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_59);
                    lv_kind_5_0=ruleDAssociationKindInverse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      							}
                      							set(
                      								current,
                      								"kind",
                      								lv_kind_5_0,
                      								"com.mimacom.ddd.dm.dim.Dim.DAssociationKindInverse");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,52,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDAssociationAccess().getContainsKeyword_3_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:4437:3: ( (otherlv_7= RULE_ID ) )
            // InternalSim.g:4438:4: (otherlv_7= RULE_ID )
            {
            // InternalSim.g:4438:4: (otherlv_7= RULE_ID )
            // InternalSim.g:4439:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getDAssociationAccess().getTypeDEntityTypeCrossReference_4_0());
              				
            }

            }


            }

            // InternalSim.g:4450:3: ( (lv_multiplicity_8_0= ruleDMultiplicity ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=45 && LA101_0<=46)||LA101_0==88||LA101_0==129) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSim.g:4451:4: (lv_multiplicity_8_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:4451:4: (lv_multiplicity_8_0= ruleDMultiplicity )
                    // InternalSim.g:4452:5: lv_multiplicity_8_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    lv_multiplicity_8_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_8_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:4469:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=RULE_PLAIN_TEXT_ONLY && LA102_0<=RULE_PLAIN_TEXT_START)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalSim.g:4470:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalSim.g:4470:4: (lv_description_9_0= ruleDRichText )
                    // InternalSim.g:4471:5: lv_description_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
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
    // $ANTLR end "ruleDAssociation"


    // $ANTLR start "entryRuleDAttribute"
    // InternalSim.g:4492:1: entryRuleDAttribute returns [EObject current=null] : iv_ruleDAttribute= ruleDAttribute EOF ;
    public final EObject entryRuleDAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAttribute = null;


        try {
            // InternalSim.g:4492:51: (iv_ruleDAttribute= ruleDAttribute EOF )
            // InternalSim.g:4493:2: iv_ruleDAttribute= ruleDAttribute EOF
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
    // InternalSim.g:4499:1: ruleDAttribute returns [EObject current=null] : ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_detail_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_key_7_0=null;
        EObject lv_multiplicity_6_0 = null;

        EObject lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4505:2: ( ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) )
            // InternalSim.g:4506:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            {
            // InternalSim.g:4506:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            // InternalSim.g:4507:3: ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )?
            {
            // InternalSim.g:4507:3: ( (lv_detail_0_0= 'detail' ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==39) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalSim.g:4508:4: (lv_detail_0_0= 'detail' )
                    {
                    // InternalSim.g:4508:4: (lv_detail_0_0= 'detail' )
                    // InternalSim.g:4509:5: lv_detail_0_0= 'detail'
                    {
                    lv_detail_0_0=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_detail_0_0, grammarAccess.getDAttributeAccess().getDetailDetailKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDAttributeRule());
                      					}
                      					setWithLastConsumed(current, "detail", true, "detail");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:4521:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalSim.g:4522:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            // InternalSim.g:4522:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:4523:5: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:4523:5: (lv_name_1_0= RULE_ID )
            // InternalSim.g:4524:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(lv_name_1_0, grammarAccess.getDAttributeAccess().getNameIDTerminalRuleCall_1_0_0());
              					
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

            // InternalSim.g:4540:4: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==34) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalSim.g:4541:5: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getDAttributeAccess().getAliasKeyword_1_1_0());
            	      				
            	    }
            	    // InternalSim.g:4545:5: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:4546:6: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:4546:6: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:4547:7: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_aliases_3_0, grammarAccess.getDAttributeAccess().getAliasesIDTerminalRuleCall_1_1_1_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDAttributeRule());
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
            	    break loop104;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDAttributeAccess().getColonKeyword_1_2());
              			
            }
            // InternalSim.g:4568:4: ( (otherlv_5= RULE_ID ) )
            // InternalSim.g:4569:5: (otherlv_5= RULE_ID )
            {
            // InternalSim.g:4569:5: (otherlv_5= RULE_ID )
            // InternalSim.g:4570:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getDAttributeRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getDAttributeAccess().getTypeDTypeCrossReference_1_3_0());
              					
            }

            }


            }


            }

            // InternalSim.g:4582:3: ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=45 && LA105_0<=46)||LA105_0==88||LA105_0==129) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSim.g:4583:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:4583:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    // InternalSim.g:4584:5: lv_multiplicity_6_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_62);
                    lv_multiplicity_6_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAttributeRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_6_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:4601:3: ( (lv_key_7_0= 'key' ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==53) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalSim.g:4602:4: (lv_key_7_0= 'key' )
                    {
                    // InternalSim.g:4602:4: (lv_key_7_0= 'key' )
                    // InternalSim.g:4603:5: lv_key_7_0= 'key'
                    {
                    lv_key_7_0=(Token)match(input,53,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_key_7_0, grammarAccess.getDAttributeAccess().getKeyKeyKeyword_3_0());
                      				
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

            // InternalSim.g:4615:3: ( (lv_description_8_0= ruleDRichText ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( ((LA107_0>=RULE_PLAIN_TEXT_ONLY && LA107_0<=RULE_PLAIN_TEXT_START)) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalSim.g:4616:4: (lv_description_8_0= ruleDRichText )
                    {
                    // InternalSim.g:4616:4: (lv_description_8_0= ruleDRichText )
                    // InternalSim.g:4617:5: lv_description_8_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_8_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAttributeRule());
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
    // $ANTLR end "ruleDAttribute"


    // $ANTLR start "entryRuleDQueryParameter"
    // InternalSim.g:4638:1: entryRuleDQueryParameter returns [EObject current=null] : iv_ruleDQueryParameter= ruleDQueryParameter EOF ;
    public final EObject entryRuleDQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQueryParameter = null;


        try {
            // InternalSim.g:4638:56: (iv_ruleDQueryParameter= ruleDQueryParameter EOF )
            // InternalSim.g:4639:2: iv_ruleDQueryParameter= ruleDQueryParameter EOF
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
    // InternalSim.g:4645:1: ruleDQueryParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4651:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalSim.g:4652:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalSim.g:4652:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalSim.g:4653:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalSim.g:4653:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:4654:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:4654:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:4655:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryParameterAccess().getColonKeyword_1());
              		
            }
            // InternalSim.g:4675:3: ( (otherlv_2= RULE_ID ) )
            // InternalSim.g:4676:4: (otherlv_2= RULE_ID )
            {
            // InternalSim.g:4676:4: (otherlv_2= RULE_ID )
            // InternalSim.g:4677:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryParameterRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDQueryParameterAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalSim.g:4688:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( ((LA108_0>=45 && LA108_0<=46)||LA108_0==88||LA108_0==129) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalSim.g:4689:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:4689:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalSim.g:4690:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_33);
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
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:4707:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=RULE_PLAIN_TEXT_ONLY && LA109_0<=RULE_PLAIN_TEXT_START)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalSim.g:4708:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:4708:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:4709:5: lv_description_4_0= ruleDRichText
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


    // $ANTLR start "entryRuleDImport"
    // InternalSim.g:4730:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalSim.g:4730:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalSim.g:4731:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalSim.g:4737:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4743:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalSim.g:4744:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalSim.g:4744:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalSim.g:4745:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalSim.g:4749:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalSim.g:4750:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalSim.g:4750:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalSim.g:4751:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalSim.g:4772:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalSim.g:4772:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalSim.g:4773:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalSim.g:4779:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalSim.g:4785:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalSim.g:4786:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalSim.g:4786:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalSim.g:4787:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalSim.g:4791:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:4792:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:4792:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:4793:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
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

            // InternalSim.g:4809:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==56) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalSim.g:4810:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalSim.g:4814:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalSim.g:4815:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalSim.g:4815:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalSim.g:4816:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
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

                    // InternalSim.g:4833:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==33) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalSim.g:4834:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalSim.g:4838:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalSim.g:4839:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalSim.g:4839:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalSim.g:4840:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_64);
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
                    	    break loop110;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSim.g:4863:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalSim.g:4864:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalSim.g:4864:4: (lv_expr_7_0= ruleDExpression )
            // InternalSim.g:4865:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_65);
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:4890:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalSim.g:4890:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalSim.g:4891:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalSim.g:4897:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleDmxTestContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4903:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ) )
            // InternalSim.g:4904:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? )
            {
            // InternalSim.g:4904:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? )
            // InternalSim.g:4905:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            {
            // InternalSim.g:4905:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:4906:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:4906:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:4907:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalSim.g:4927:3: ( (otherlv_2= RULE_ID ) )
            // InternalSim.g:4928:4: (otherlv_2= RULE_ID )
            {
            // InternalSim.g:4928:4: (otherlv_2= RULE_ID )
            // InternalSim.g:4929:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalSim.g:4940:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=45 && LA112_0<=46)||LA112_0==88||LA112_0==129) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalSim.g:4941:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:4941:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalSim.g:4942:5: lv_multiplicity_3_0= ruleDMultiplicity
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
    // InternalSim.g:4963:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalSim.g:4963:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalSim.g:4964:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalSim.g:4970:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalSim.g:4976:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalSim.g:4977:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalSim.g:4977:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalSim.g:4978:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalSim.g:4978:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:4979:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:4979:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:4980:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,57,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSim.g:5004:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalSim.g:5005:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalSim.g:5005:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalSim.g:5006:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_68);
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

            // InternalSim.g:5023:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==33) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // InternalSim.g:5024:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalSim.g:5028:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalSim.g:5029:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalSim.g:5029:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalSim.g:5030:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
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
            	    if ( cnt113 >= 1 ) break loop113;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
            } while (true);

            otherlv_6=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:5056:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalSim.g:5056:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalSim.g:5057:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalSim.g:5063:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5069:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalSim.g:5070:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalSim.g:5070:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalSim.g:5071:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalSim.g:5075:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:5076:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:5076:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:5077:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,59,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalSim.g:5097:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalSim.g:5098:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalSim.g:5098:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalSim.g:5099:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            // InternalSim.g:5116:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=RULE_PLAIN_TEXT_ONLY && LA114_0<=RULE_PLAIN_TEXT_START)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalSim.g:5117:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:5117:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:5118:5: lv_description_4_0= ruleDRichText
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
    // InternalSim.g:5139:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalSim.g:5139:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalSim.g:5140:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalSim.g:5146:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalSim.g:5152:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalSim.g:5153:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalSim.g:5153:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalSim.g:5154:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalSim.g:5158:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:5159:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:5159:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:5160:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,45,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSim.g:5180:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_ID) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalSim.g:5181:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalSim.g:5181:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalSim.g:5182:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalSim.g:5182:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalSim.g:5183:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalSim.g:5200:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==33) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalSim.g:5201:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:5205:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalSim.g:5206:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalSim.g:5206:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalSim.g:5207:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop115;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,47,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,24,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalSim.g:5234:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalSim.g:5235:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalSim.g:5235:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalSim.g:5236:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_72);
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

            // InternalSim.g:5253:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==61) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalSim.g:5254:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,61,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalSim.g:5258:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalSim.g:5259:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalSim.g:5259:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalSim.g:5260:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalSim.g:5282:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalSim.g:5282:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalSim.g:5283:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalSim.g:5289:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5295:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalSim.g:5296:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalSim.g:5296:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalSim.g:5297:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalSim.g:5297:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=98 && LA118_0<=106)) ) {
                alt118=1;
            }
            else if ( (LA118_0==RULE_ID) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalSim.g:5298:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalSim.g:5298:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalSim.g:5299:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalSim.g:5299:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalSim.g:5300:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_73);
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
                    // InternalSim.g:5318:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalSim.g:5318:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSim.g:5319:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSim.g:5319:5: (otherlv_1= RULE_ID )
                    // InternalSim.g:5320:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:5332:3: ( (lv_collection_2_0= '*' ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==46) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalSim.g:5333:4: (lv_collection_2_0= '*' )
                    {
                    // InternalSim.g:5333:4: (lv_collection_2_0= '*' )
                    // InternalSim.g:5334:5: lv_collection_2_0= '*'
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
    // InternalSim.g:5350:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalSim.g:5350:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalSim.g:5351:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalSim.g:5357:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5363:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalSim.g:5364:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalSim.g:5364:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalSim.g:5365:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalSim.g:5365:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:5366:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:5366:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:5367:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,24,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalSim.g:5387:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalSim.g:5388:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalSim.g:5388:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalSim.g:5389:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalSim.g:5410:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalSim.g:5410:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalSim.g:5411:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalSim.g:5417:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalSim.g:5423:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalSim.g:5424:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalSim.g:5424:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt120=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==64) ) {
                    alt120=1;
                }
                else if ( (LA120_1==EOF||(LA120_1>=RULE_ID && LA120_1<=RULE_PLAIN_TEXT_END)||(LA120_1>=20 && LA120_1<=21)||LA120_1==25||LA120_1==27||(LA120_1>=29 && LA120_1<=33)||(LA120_1>=35 && LA120_1<=40)||(LA120_1>=44 && LA120_1<=47)||LA120_1==49||LA120_1==51||(LA120_1>=62 && LA120_1<=63)||(LA120_1>=65 && LA120_1<=68)||(LA120_1>=76 && LA120_1<=79)||(LA120_1>=88 && LA120_1<=89)||(LA120_1>=107 && LA120_1<=125)) ) {
                    alt120=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
            case RULE_STRING:
            case 45:
            case 69:
            case 70:
            case 71:
            case 75:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 88:
            case 89:
            case 126:
            case 127:
            case 128:
                {
                alt120=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_PLAIN_TEXT_START:
                {
                alt120=3;
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
                    // InternalSim.g:5425:3: this_DmxAssignment_0= ruleDmxAssignment
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
                    // InternalSim.g:5434:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
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
                    // InternalSim.g:5443:3: this_DRichText_2= ruleDRichText
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
    // InternalSim.g:5455:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalSim.g:5455:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalSim.g:5456:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalSim.g:5462:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalSim.g:5468:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalSim.g:5469:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalSim.g:5469:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt122=1;
            }
            else if ( (LA122_0==RULE_PLAIN_TEXT_START) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // InternalSim.g:5470:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalSim.g:5470:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalSim.g:5471:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalSim.g:5471:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalSim.g:5472:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalSim.g:5490:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalSim.g:5490:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalSim.g:5491:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalSim.g:5491:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalSim.g:5492:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalSim.g:5492:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalSim.g:5493:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
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

                    // InternalSim.g:5510:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalSim.g:5511:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalSim.g:5511:5: (lv_segments_2_0= ruleDExpression )
                    // InternalSim.g:5512:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_74);
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

                    // InternalSim.g:5529:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalSim.g:5530:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalSim.g:5530:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalSim.g:5531:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalSim.g:5531:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalSim.g:5532:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_51);
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

                    	    // InternalSim.g:5549:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalSim.g:5550:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalSim.g:5550:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalSim.g:5551:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_74);
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
                    	    break loop121;
                        }
                    } while (true);

                    // InternalSim.g:5569:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalSim.g:5570:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalSim.g:5570:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalSim.g:5571:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalSim.g:5593:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalSim.g:5593:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalSim.g:5594:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalSim.g:5600:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:5606:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalSim.g:5607:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalSim.g:5607:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalSim.g:5608:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalSim.g:5608:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalSim.g:5609:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalSim.g:5628:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalSim.g:5628:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalSim.g:5629:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalSim.g:5635:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:5641:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalSim.g:5642:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalSim.g:5642:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalSim.g:5643:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalSim.g:5643:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalSim.g:5644:4: lv_value_0_0= RULE_PLAIN_TEXT_START
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
    // InternalSim.g:5663:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalSim.g:5663:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalSim.g:5664:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalSim.g:5670:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:5676:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalSim.g:5677:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalSim.g:5677:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalSim.g:5678:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalSim.g:5678:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalSim.g:5679:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
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
    // InternalSim.g:5698:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalSim.g:5698:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalSim.g:5699:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalSim.g:5705:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:5711:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalSim.g:5712:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalSim.g:5712:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalSim.g:5713:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalSim.g:5713:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalSim.g:5714:4: lv_value_0_0= RULE_PLAIN_TEXT_END
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
    // InternalSim.g:5733:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalSim.g:5733:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalSim.g:5734:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalSim.g:5740:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalSim.g:5746:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalSim.g:5747:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalSim.g:5747:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalSim.g:5748:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_75);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:5756:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop124:
            do {
                int alt124=3;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==62) ) {
                    int LA124_2 = input.LA(2);

                    if ( (synpred1_InternalSim()) ) {
                        alt124=1;
                    }
                    else if ( (synpred2_InternalSim()) ) {
                        alt124=2;
                    }


                }


                switch (alt124) {
            	case 1 :
            	    // InternalSim.g:5757:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalSim.g:5757:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalSim.g:5758:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalSim.g:5758:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalSim.g:5759:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalSim.g:5771:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalSim.g:5772:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalSim.g:5772:7: ()
            	    // InternalSim.g:5773:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalSim.g:5783:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalSim.g:5784:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalSim.g:5784:8: (otherlv_3= RULE_ID )
            	    // InternalSim.g:5785:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_77);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalSim.g:5805:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalSim.g:5806:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalSim.g:5806:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalSim.g:5807:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_75);
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
            	    // InternalSim.g:5826:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalSim.g:5826:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalSim.g:5827:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalSim.g:5827:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalSim.g:5828:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalSim.g:5834:6: ( () otherlv_7= '.' )
            	    // InternalSim.g:5835:7: () otherlv_7= '.'
            	    {
            	    // InternalSim.g:5835:7: ()
            	    // InternalSim.g:5836:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,62,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalSim.g:5848:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalSim.g:5849:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalSim.g:5849:6: (otherlv_8= RULE_ID )
            	    // InternalSim.g:5850:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_78); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalSim.g:5861:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt123=3;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==45) && (synpred3_InternalSim())) {
            	        alt123=1;
            	    }
            	    else if ( (LA123_0==63) ) {
            	        alt123=2;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // InternalSim.g:5862:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalSim.g:5862:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalSim.g:5863:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalSim.g:5863:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalSim.g:5864:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalSim.g:5868:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalSim.g:5869:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,45,FOLLOW_79); if (state.failed) return current;
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

            	            // InternalSim.g:5881:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalSim.g:5882:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalSim.g:5882:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalSim.g:5883:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_44);
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

            	            otherlv_11=(Token)match(input,47,FOLLOW_75); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSim.g:5906:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalSim.g:5906:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalSim.g:5907:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalSim.g:5907:7: (lv_before_12_0= '@before' )
            	            // InternalSim.g:5908:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,63,FOLLOW_75); if (state.failed) return current;
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
            	    break loop124;
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
    // InternalSim.g:5927:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalSim.g:5927:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalSim.g:5928:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalSim.g:5934:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5940:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalSim.g:5941:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalSim.g:5941:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalSim.g:5942:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalSim.g:5942:3: ()
            // InternalSim.g:5943:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:5949:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_ID||(LA126_0>=RULE_NATURAL && LA126_0<=RULE_STRING)||LA126_0==45||(LA126_0>=69 && LA126_0<=71)||LA126_0==75||(LA126_0>=80 && LA126_0<=85)||(LA126_0>=88 && LA126_0<=89)||(LA126_0>=126 && LA126_0<=128)) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalSim.g:5950:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalSim.g:5950:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalSim.g:5951:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalSim.g:5951:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalSim.g:5952:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_80);
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

                    // InternalSim.g:5969:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==33) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalSim.g:5970:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,33,FOLLOW_77); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:5974:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalSim.g:5975:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalSim.g:5975:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalSim.g:5976:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_80);
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
                    	    break loop125;
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
    // InternalSim.g:5999:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalSim.g:5999:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalSim.g:6000:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
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
    // InternalSim.g:6006:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6012:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalSim.g:6013:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalSim.g:6013:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalSim.g:6014:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalSim.g:6014:3: ()
            // InternalSim.g:6015:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:6021:3: ( (otherlv_1= RULE_ID ) )
            // InternalSim.g:6022:4: (otherlv_1= RULE_ID )
            {
            // InternalSim.g:6022:4: (otherlv_1= RULE_ID )
            // InternalSim.g:6023:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxAssignmentRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxAssignmentAccess().getAssignToMemberDNavigableMemberCrossReference_1_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAssignmentAccess().getDmxOpSingleAssignParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_77);
            ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6041:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalSim.g:6042:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalSim.g:6042:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalSim.g:6043:5: lv_value_3_0= ruleDmxOrExpression
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
    // InternalSim.g:6064:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalSim.g:6064:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalSim.g:6065:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalSim.g:6071:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:6077:2: (kw= ':=' )
            // InternalSim.g:6078:2: kw= ':='
            {
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:6086:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalSim.g:6086:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalSim.g:6087:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalSim.g:6093:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalSim.g:6099:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalSim.g:6100:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalSim.g:6100:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==RULE_ID) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==EOF||(LA127_1>=RULE_ID && LA127_1<=RULE_PLAIN_TEXT_END)||(LA127_1>=20 && LA127_1<=21)||LA127_1==25||LA127_1==27||(LA127_1>=29 && LA127_1<=33)||(LA127_1>=35 && LA127_1<=40)||(LA127_1>=44 && LA127_1<=47)||LA127_1==49||LA127_1==51||(LA127_1>=62 && LA127_1<=63)||(LA127_1>=66 && LA127_1<=68)||(LA127_1>=76 && LA127_1<=79)||(LA127_1>=88 && LA127_1<=89)||(LA127_1>=107 && LA127_1<=125)) ) {
                    alt127=2;
                }
                else if ( (LA127_1==65) ) {
                    alt127=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA127_0>=RULE_NATURAL && LA127_0<=RULE_STRING)||LA127_0==45||(LA127_0>=69 && LA127_0<=71)||LA127_0==75||(LA127_0>=80 && LA127_0<=85)||(LA127_0>=88 && LA127_0<=89)||(LA127_0>=126 && LA127_0<=128)) ) {
                alt127=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // InternalSim.g:6101:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalSim.g:6101:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalSim.g:6102:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalSim.g:6102:4: ()
                    // InternalSim.g:6103:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSim.g:6109:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalSim.g:6110:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalSim.g:6110:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalSim.g:6111:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_81);
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

                    otherlv_2=(Token)match(input,65,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalSim.g:6132:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalSim.g:6133:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalSim.g:6133:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalSim.g:6134:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalSim.g:6153:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalSim.g:6165:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalSim.g:6165:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalSim.g:6166:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalSim.g:6172:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:6178:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSim.g:6179:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSim.g:6179:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:6180:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:6180:3: (lv_name_0_0= RULE_ID )
            // InternalSim.g:6181:4: lv_name_0_0= RULE_ID
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
    // InternalSim.g:6200:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalSim.g:6200:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalSim.g:6201:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalSim.g:6207:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6213:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalSim.g:6214:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalSim.g:6214:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalSim.g:6215:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_82);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6223:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop128:
            do {
                int alt128=2;
                switch ( input.LA(1) ) {
                case 107:
                    {
                    int LA128_2 = input.LA(2);

                    if ( (synpred4_InternalSim()) ) {
                        alt128=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA128_3 = input.LA(2);

                    if ( (synpred4_InternalSim()) ) {
                        alt128=1;
                    }


                    }
                    break;
                case 109:
                    {
                    int LA128_4 = input.LA(2);

                    if ( (synpred4_InternalSim()) ) {
                        alt128=1;
                    }


                    }
                    break;
                case 110:
                    {
                    int LA128_5 = input.LA(2);

                    if ( (synpred4_InternalSim()) ) {
                        alt128=1;
                    }


                    }
                    break;

                }

                switch (alt128) {
            	case 1 :
            	    // InternalSim.g:6224:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalSim.g:6224:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalSim.g:6225:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalSim.g:6235:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalSim.g:6236:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalSim.g:6236:6: ()
            	    // InternalSim.g:6237:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6243:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalSim.g:6244:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalSim.g:6244:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalSim.g:6245:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_77);
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

            	    // InternalSim.g:6264:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalSim.g:6265:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalSim.g:6265:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalSim.g:6266:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_82);
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
            	    break loop128;
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
    // InternalSim.g:6288:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalSim.g:6288:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalSim.g:6289:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalSim.g:6295:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6301:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalSim.g:6302:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalSim.g:6302:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalSim.g:6303:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_83);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6311:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==111) ) {
                    int LA129_2 = input.LA(2);

                    if ( (synpred5_InternalSim()) ) {
                        alt129=1;
                    }


                }
                else if ( (LA129_0==21) ) {
                    int LA129_3 = input.LA(2);

                    if ( (synpred5_InternalSim()) ) {
                        alt129=1;
                    }


                }


                switch (alt129) {
            	case 1 :
            	    // InternalSim.g:6312:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalSim.g:6312:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalSim.g:6313:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalSim.g:6323:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalSim.g:6324:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalSim.g:6324:6: ()
            	    // InternalSim.g:6325:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6331:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalSim.g:6332:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalSim.g:6332:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalSim.g:6333:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_77);
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

            	    // InternalSim.g:6352:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalSim.g:6353:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalSim.g:6353:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalSim.g:6354:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_83);
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
            	    break loop129;
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
    // InternalSim.g:6376:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalSim.g:6376:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalSim.g:6377:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalSim.g:6383:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6389:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalSim.g:6390:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalSim.g:6390:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalSim.g:6391:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_84);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6399:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop130:
            do {
                int alt130=2;
                switch ( input.LA(1) ) {
                case 112:
                    {
                    int LA130_2 = input.LA(2);

                    if ( (synpred6_InternalSim()) ) {
                        alt130=1;
                    }


                    }
                    break;
                case 113:
                    {
                    int LA130_3 = input.LA(2);

                    if ( (synpred6_InternalSim()) ) {
                        alt130=1;
                    }


                    }
                    break;
                case 114:
                    {
                    int LA130_4 = input.LA(2);

                    if ( (synpred6_InternalSim()) ) {
                        alt130=1;
                    }


                    }
                    break;

                }

                switch (alt130) {
            	case 1 :
            	    // InternalSim.g:6400:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalSim.g:6400:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalSim.g:6401:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalSim.g:6411:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalSim.g:6412:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalSim.g:6412:6: ()
            	    // InternalSim.g:6413:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6419:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalSim.g:6420:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalSim.g:6420:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalSim.g:6421:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_77);
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

            	    // InternalSim.g:6440:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalSim.g:6441:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalSim.g:6441:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalSim.g:6442:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_84);
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
            	    break loop130;
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
    // InternalSim.g:6464:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalSim.g:6464:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalSim.g:6465:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalSim.g:6471:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6477:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalSim.g:6478:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalSim.g:6478:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalSim.g:6479:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_85);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6487:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop131:
            do {
                int alt131=3;
                alt131 = dfa131.predict(input);
                switch (alt131) {
            	case 1 :
            	    // InternalSim.g:6488:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalSim.g:6488:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalSim.g:6489:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalSim.g:6489:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalSim.g:6490:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalSim.g:6496:6: ( () ruleDmxOpInstanceOf )
            	    // InternalSim.g:6497:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalSim.g:6497:7: ()
            	    // InternalSim.g:6498:8: 
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
            	    pushFollow(FOLLOW_6);
            	    ruleDmxOpInstanceOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalSim.g:6513:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalSim.g:6514:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalSim.g:6514:6: (otherlv_3= RULE_ID )
            	    // InternalSim.g:6515:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_85); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:6528:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalSim.g:6528:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalSim.g:6529:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalSim.g:6529:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalSim.g:6530:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalSim.g:6540:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalSim.g:6541:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalSim.g:6541:7: ()
            	    // InternalSim.g:6542:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalSim.g:6548:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalSim.g:6549:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalSim.g:6549:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalSim.g:6550:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_77);
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

            	    // InternalSim.g:6569:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalSim.g:6570:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalSim.g:6570:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalSim.g:6571:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_85);
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
            	    break loop131;
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
    // InternalSim.g:6594:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalSim.g:6594:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalSim.g:6595:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalSim.g:6601:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:6607:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalSim.g:6608:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalSim.g:6608:2: (kw= 'ISA' | kw= 'isa' )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==66) ) {
                alt132=1;
            }
            else if ( (LA132_0==67) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // InternalSim.g:6609:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:6615:3: kw= 'isa'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:6624:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalSim.g:6624:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalSim.g:6625:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalSim.g:6631:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6637:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalSim.g:6638:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalSim.g:6638:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalSim.g:6639:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_86);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6647:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop133:
            do {
                int alt133=2;
                switch ( input.LA(1) ) {
                case 79:
                    {
                    int LA133_2 = input.LA(2);

                    if ( (synpred9_InternalSim()) ) {
                        alt133=1;
                    }


                    }
                    break;
                case 121:
                    {
                    int LA133_3 = input.LA(2);

                    if ( (synpred9_InternalSim()) ) {
                        alt133=1;
                    }


                    }
                    break;
                case 122:
                    {
                    int LA133_4 = input.LA(2);

                    if ( (synpred9_InternalSim()) ) {
                        alt133=1;
                    }


                    }
                    break;

                }

                switch (alt133) {
            	case 1 :
            	    // InternalSim.g:6648:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalSim.g:6648:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalSim.g:6649:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalSim.g:6659:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalSim.g:6660:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalSim.g:6660:6: ()
            	    // InternalSim.g:6661:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6667:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalSim.g:6668:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalSim.g:6668:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalSim.g:6669:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_77);
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

            	    // InternalSim.g:6688:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalSim.g:6689:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalSim.g:6689:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalSim.g:6690:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_86);
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
            	    break loop133;
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
    // InternalSim.g:6712:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalSim.g:6712:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalSim.g:6713:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalSim.g:6719:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6725:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalSim.g:6726:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalSim.g:6726:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalSim.g:6727:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_87);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6735:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==88) ) {
                    int LA134_2 = input.LA(2);

                    if ( (synpred10_InternalSim()) ) {
                        alt134=1;
                    }


                }
                else if ( (LA134_0==89) ) {
                    int LA134_3 = input.LA(2);

                    if ( (synpred10_InternalSim()) ) {
                        alt134=1;
                    }


                }


                switch (alt134) {
            	case 1 :
            	    // InternalSim.g:6736:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalSim.g:6736:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalSim.g:6737:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalSim.g:6747:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalSim.g:6748:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalSim.g:6748:6: ()
            	    // InternalSim.g:6749:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6755:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalSim.g:6756:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalSim.g:6756:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalSim.g:6757:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_77);
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

            	    // InternalSim.g:6776:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalSim.g:6777:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalSim.g:6777:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalSim.g:6778:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_87);
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
            	    break loop134;
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
    // InternalSim.g:6800:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalSim.g:6800:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalSim.g:6801:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalSim.g:6807:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6813:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalSim.g:6814:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalSim.g:6814:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalSim.g:6815:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_88);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6823:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop135:
            do {
                int alt135=2;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA135_2 = input.LA(2);

                    if ( (synpred11_InternalSim()) ) {
                        alt135=1;
                    }


                    }
                    break;
                case 123:
                    {
                    int LA135_3 = input.LA(2);

                    if ( (synpred11_InternalSim()) ) {
                        alt135=1;
                    }


                    }
                    break;
                case 124:
                    {
                    int LA135_4 = input.LA(2);

                    if ( (synpred11_InternalSim()) ) {
                        alt135=1;
                    }


                    }
                    break;
                case 125:
                    {
                    int LA135_5 = input.LA(2);

                    if ( (synpred11_InternalSim()) ) {
                        alt135=1;
                    }


                    }
                    break;

                }

                switch (alt135) {
            	case 1 :
            	    // InternalSim.g:6824:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalSim.g:6824:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalSim.g:6825:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalSim.g:6835:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalSim.g:6836:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalSim.g:6836:6: ()
            	    // InternalSim.g:6837:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6843:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalSim.g:6844:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalSim.g:6844:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalSim.g:6845:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_77);
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

            	    // InternalSim.g:6864:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalSim.g:6865:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalSim.g:6865:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalSim.g:6866:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_88);
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
            	    break loop135;
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
    // InternalSim.g:6888:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalSim.g:6888:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalSim.g:6889:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalSim.g:6895:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalSim.g:6901:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalSim.g:6902:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalSim.g:6902:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=88 && LA136_0<=89)||(LA136_0>=126 && LA136_0<=128)) ) {
                alt136=1;
            }
            else if ( (LA136_0==RULE_ID||(LA136_0>=RULE_NATURAL && LA136_0<=RULE_STRING)||LA136_0==45||(LA136_0>=69 && LA136_0<=71)||LA136_0==75||(LA136_0>=80 && LA136_0<=85)) ) {
                alt136=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }
            switch (alt136) {
                case 1 :
                    // InternalSim.g:6903:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalSim.g:6903:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalSim.g:6904:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalSim.g:6904:4: ()
                    // InternalSim.g:6905:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSim.g:6911:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalSim.g:6912:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalSim.g:6912:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalSim.g:6913:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_77);
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

                    // InternalSim.g:6930:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalSim.g:6931:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalSim.g:6931:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalSim.g:6932:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalSim.g:6951:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalSim.g:6963:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalSim.g:6963:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalSim.g:6964:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalSim.g:6970:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6976:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalSim.g:6977:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalSim.g:6977:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalSim.g:6978:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_89);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6986:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==68) ) {
                int LA137_1 = input.LA(2);

                if ( (synpred12_InternalSim()) ) {
                    alt137=1;
                }
            }
            else if ( (LA137_0==20) ) {
                int LA137_2 = input.LA(2);

                if ( (synpred12_InternalSim()) ) {
                    alt137=1;
                }
            }
            switch (alt137) {
                case 1 :
                    // InternalSim.g:6987:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSim.g:6987:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalSim.g:6988:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalSim.g:6994:5: ( () ruleDmxOpCast )
                    // InternalSim.g:6995:6: () ruleDmxOpCast
                    {
                    // InternalSim.g:6995:6: ()
                    // InternalSim.g:6996:7: 
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
                    pushFollow(FOLLOW_6);
                    ruleDmxOpCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSim.g:7011:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSim.g:7012:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSim.g:7012:5: (otherlv_3= RULE_ID )
                    // InternalSim.g:7013:6: otherlv_3= RULE_ID
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
    // InternalSim.g:7029:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalSim.g:7029:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalSim.g:7030:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalSim.g:7036:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:7042:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalSim.g:7043:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalSim.g:7043:2: (kw= 'AS' | kw= 'as' )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==68) ) {
                alt138=1;
            }
            else if ( (LA138_0==20) ) {
                alt138=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // InternalSim.g:7044:3: kw= 'AS'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:7050:3: kw= 'as'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7059:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalSim.g:7059:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalSim.g:7060:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalSim.g:7066:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxFunctionCall_2= ruleDmxFunctionCall | this_DmxConstructorCall_3= ruleDmxConstructorCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
    public final EObject ruleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxLiteralExpression_0 = null;

        EObject this_DmxParenthesizedExpression_1 = null;

        EObject this_DmxFunctionCall_2 = null;

        EObject this_DmxConstructorCall_3 = null;

        EObject this_DmxStaticReference_4 = null;

        EObject this_DmxContextReference_5 = null;

        EObject this_DmxIfExpression_6 = null;



        	enterRule();

        try {
            // InternalSim.g:7072:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxFunctionCall_2= ruleDmxFunctionCall | this_DmxConstructorCall_3= ruleDmxConstructorCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalSim.g:7073:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxFunctionCall_2= ruleDmxFunctionCall | this_DmxConstructorCall_3= ruleDmxConstructorCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalSim.g:7073:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxFunctionCall_2= ruleDmxFunctionCall | this_DmxConstructorCall_3= ruleDmxConstructorCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt139=7;
            switch ( input.LA(1) ) {
            case RULE_NATURAL:
            case RULE_STRING:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt139=1;
                }
                break;
            case 45:
                {
                alt139=2;
                }
                break;
            case RULE_ID:
                {
                int LA139_3 = input.LA(2);

                if ( (LA139_3==45) ) {
                    alt139=3;
                }
                else if ( (LA139_3==EOF||(LA139_3>=RULE_ID && LA139_3<=RULE_PLAIN_TEXT_END)||(LA139_3>=20 && LA139_3<=21)||LA139_3==25||LA139_3==27||(LA139_3>=29 && LA139_3<=33)||(LA139_3>=35 && LA139_3<=40)||LA139_3==44||(LA139_3>=46 && LA139_3<=47)||LA139_3==49||LA139_3==51||(LA139_3>=62 && LA139_3<=63)||(LA139_3>=66 && LA139_3<=68)||(LA139_3>=76 && LA139_3<=79)||(LA139_3>=88 && LA139_3<=89)||(LA139_3>=107 && LA139_3<=125)) ) {
                    alt139=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 3, input);

                    throw nvae;
                }
                }
                break;
            case 69:
            case 70:
                {
                alt139=4;
                }
                break;
            case 71:
                {
                alt139=5;
                }
                break;
            case 75:
                {
                alt139=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // InternalSim.g:7074:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalSim.g:7083:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalSim.g:7092:3: this_DmxFunctionCall_2= ruleDmxFunctionCall
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
                    // InternalSim.g:7101:3: this_DmxConstructorCall_3= ruleDmxConstructorCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxConstructorCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxConstructorCall_3=ruleDmxConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxConstructorCall_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSim.g:7110:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalSim.g:7119:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalSim.g:7128:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalSim.g:7140:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalSim.g:7140:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalSim.g:7141:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalSim.g:7147:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral ) ;
    public final EObject ruleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxBooleanLiteral_0 = null;

        EObject this_DmxStringLiteral_1 = null;

        EObject this_DmxNaturalLiteral_2 = null;

        EObject this_DmxDecimalLiteral_3 = null;

        EObject this_DmxUndefinedLiteral_4 = null;



        	enterRule();

        try {
            // InternalSim.g:7153:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral ) )
            // InternalSim.g:7154:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral )
            {
            // InternalSim.g:7154:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral )
            int alt140=5;
            switch ( input.LA(1) ) {
            case 80:
            case 81:
            case 82:
            case 83:
                {
                alt140=1;
                }
                break;
            case RULE_STRING:
                {
                alt140=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA140_3 = input.LA(2);

                if ( (LA140_3==62) ) {
                    int LA140_5 = input.LA(3);

                    if ( (LA140_5==RULE_ID) ) {
                        alt140=3;
                    }
                    else if ( (LA140_5==RULE_NATURAL) ) {
                        alt140=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA140_3==EOF||(LA140_3>=RULE_ID && LA140_3<=RULE_PLAIN_TEXT_END)||(LA140_3>=20 && LA140_3<=21)||LA140_3==25||LA140_3==27||(LA140_3>=29 && LA140_3<=33)||(LA140_3>=35 && LA140_3<=40)||LA140_3==44||(LA140_3>=46 && LA140_3<=47)||LA140_3==49||LA140_3==51||(LA140_3>=66 && LA140_3<=68)||(LA140_3>=76 && LA140_3<=79)||(LA140_3>=88 && LA140_3<=89)||(LA140_3>=107 && LA140_3<=125)) ) {
                    alt140=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 140, 3, input);

                    throw nvae;
                }
                }
                break;
            case 84:
            case 85:
                {
                alt140=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // InternalSim.g:7155:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalSim.g:7164:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalSim.g:7173:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalSim.g:7182:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalSim.g:7191:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
    // InternalSim.g:7203:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalSim.g:7203:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalSim.g:7204:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalSim.g:7210:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalSim.g:7216:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalSim.g:7217:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalSim.g:7217:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalSim.g:7218:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_44);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7238:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalSim.g:7238:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalSim.g:7239:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalSim.g:7245:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:7251:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalSim.g:7252:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalSim.g:7252:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalSim.g:7253:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalSim.g:7253:3: ()
            // InternalSim.g:7254:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7260:3: ( (otherlv_1= RULE_ID ) )
            // InternalSim.g:7261:4: (otherlv_1= RULE_ID )
            {
            // InternalSim.g:7261:4: (otherlv_1= RULE_ID )
            // InternalSim.g:7262:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSim.g:7277:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalSim.g:7278:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalSim.g:7278:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalSim.g:7279:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            otherlv_4=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7304:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalSim.g:7304:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalSim.g:7305:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalSim.g:7311:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:7317:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalSim.g:7318:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalSim.g:7318:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalSim.g:7319:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalSim.g:7319:3: ()
            // InternalSim.g:7320:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7326:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( ((LA142_0>=RULE_ID && LA142_0<=RULE_PLAIN_TEXT_START)||(LA142_0>=RULE_NATURAL && LA142_0<=RULE_STRING)||LA142_0==45||(LA142_0>=69 && LA142_0<=71)||LA142_0==75||(LA142_0>=80 && LA142_0<=85)||(LA142_0>=88 && LA142_0<=89)||(LA142_0>=126 && LA142_0<=128)) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalSim.g:7327:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalSim.g:7327:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalSim.g:7328:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalSim.g:7328:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalSim.g:7329:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_80);
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

                    // InternalSim.g:7346:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==33) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalSim.g:7347:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,33,FOLLOW_51); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:7351:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalSim.g:7352:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalSim.g:7352:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalSim.g:7353:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_80);
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
                    	    break loop141;
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
    // InternalSim.g:7376:1: entryRuleDmxConstructorCall returns [EObject current=null] : iv_ruleDmxConstructorCall= ruleDmxConstructorCall EOF ;
    public final EObject entryRuleDmxConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxConstructorCall = null;


        try {
            // InternalSim.g:7376:59: (iv_ruleDmxConstructorCall= ruleDmxConstructorCall EOF )
            // InternalSim.g:7377:2: iv_ruleDmxConstructorCall= ruleDmxConstructorCall EOF
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
    // InternalSim.g:7383:1: ruleDmxConstructorCall returns [EObject current=null] : ( () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleDmxConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitConstructorCall_3_0=null;
        Token otherlv_5=null;
        EObject lv_callArguments_4_0 = null;



        	enterRule();

        try {
            // InternalSim.g:7389:2: ( ( () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )? ) )
            // InternalSim.g:7390:2: ( () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )? )
            {
            // InternalSim.g:7390:2: ( () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )? )
            // InternalSim.g:7391:3: () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )?
            {
            // InternalSim.g:7391:3: ()
            // InternalSim.g:7392:4: 
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
            pushFollow(FOLLOW_6);
            ruleDmxOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:7405:3: ( (otherlv_2= RULE_ID ) )
            // InternalSim.g:7406:4: (otherlv_2= RULE_ID )
            {
            // InternalSim.g:7406:4: (otherlv_2= RULE_ID )
            // InternalSim.g:7407:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxConstructorCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxConstructorCallAccess().getConstructorDComplexTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalSim.g:7418:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==45) && (synpred13_InternalSim())) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalSim.g:7419:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')'
                    {
                    // InternalSim.g:7419:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalSim.g:7420:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalSim.g:7424:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalSim.g:7425:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,45,FOLLOW_90); if (state.failed) return current;
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

                    // InternalSim.g:7437:4: ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) )
                    // InternalSim.g:7438:5: (lv_callArguments_4_0= ruleDmxFunctionCallArguments )
                    {
                    // InternalSim.g:7438:5: (lv_callArguments_4_0= ruleDmxFunctionCallArguments )
                    // InternalSim.g:7439:6: lv_callArguments_4_0= ruleDmxFunctionCallArguments
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxConstructorCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    otherlv_5=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7465:1: entryRuleDmxOpConstructor returns [String current=null] : iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF ;
    public final String entryRuleDmxOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpConstructor = null;


        try {
            // InternalSim.g:7465:56: (iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF )
            // InternalSim.g:7466:2: iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF
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
    // InternalSim.g:7472:1: ruleDmxOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:7478:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalSim.g:7479:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalSim.g:7479:2: (kw= 'NEW' | kw= 'new' )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==69) ) {
                alt144=1;
            }
            else if ( (LA144_0==70) ) {
                alt144=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // InternalSim.g:7480:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:7486:3: kw= 'new'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7495:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalSim.g:7495:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalSim.g:7496:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalSim.g:7502:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalSim.g:7508:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalSim.g:7509:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalSim.g:7509:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalSim.g:7510:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalSim.g:7510:3: ()
            // InternalSim.g:7511:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalSim.g:7521:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:7522:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:7522:4: ( ruleDQualifiedName )
            // InternalSim.g:7523:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_92);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:7537:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==72) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalSim.g:7538:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalSim.g:7542:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSim.g:7543:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSim.g:7543:5: (otherlv_4= RULE_ID )
                    // InternalSim.g:7544:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_93); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:7556:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==65) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalSim.g:7557:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_94); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalSim.g:7561:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==RULE_ID) ) {
                        alt146=1;
                    }
                    else if ( (LA146_0==46) ) {
                        alt146=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 146, 0, input);

                        throw nvae;
                    }
                    switch (alt146) {
                        case 1 :
                            // InternalSim.g:7562:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalSim.g:7562:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalSim.g:7563:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalSim.g:7563:6: (lv_displayName_6_0= RULE_ID )
                            // InternalSim.g:7564:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_95); if (state.failed) return current;
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
                            // InternalSim.g:7581:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalSim.g:7581:5: ( (lv_plural_7_0= '*' ) )
                            // InternalSim.g:7582:6: (lv_plural_7_0= '*' )
                            {
                            // InternalSim.g:7582:6: (lv_plural_7_0= '*' )
                            // InternalSim.g:7583:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,46,FOLLOW_95); if (state.failed) return current;
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

            // InternalSim.g:7597:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalSim.g:7598:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7608:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalSim.g:7608:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalSim.g:7609:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalSim.g:7615:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalSim.g:7621:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalSim.g:7622:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalSim.g:7622:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalSim.g:7623:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalSim.g:7623:3: ()
            // InternalSim.g:7624:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7630:3: ( (otherlv_1= RULE_ID ) )
            // InternalSim.g:7631:4: (otherlv_1= RULE_ID )
            {
            // InternalSim.g:7631:4: (otherlv_1= RULE_ID )
            // InternalSim.g:7632:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_96); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalSim.g:7643:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt148=3;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==63) ) {
                alt148=1;
            }
            else if ( (LA148_0==62) ) {
                int LA148_2 = input.LA(2);

                if ( (LA148_2==74) ) {
                    alt148=2;
                }
            }
            switch (alt148) {
                case 1 :
                    // InternalSim.g:7644:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalSim.g:7644:4: ( (lv_before_2_0= '@before' ) )
                    // InternalSim.g:7645:5: (lv_before_2_0= '@before' )
                    {
                    // InternalSim.g:7645:5: (lv_before_2_0= '@before' )
                    // InternalSim.g:7646:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSim.g:7659:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalSim.g:7659:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalSim.g:7660:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_97); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalSim.g:7664:5: ( (lv_all_4_0= 'all' ) )
                    // InternalSim.g:7665:6: (lv_all_4_0= 'all' )
                    {
                    // InternalSim.g:7665:6: (lv_all_4_0= 'all' )
                    // InternalSim.g:7666:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7684:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalSim.g:7684:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalSim.g:7685:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalSim.g:7691:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalSim.g:7697:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalSim.g:7698:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalSim.g:7698:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalSim.g:7699:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalSim.g:7699:3: ()
            // InternalSim.g:7700:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalSim.g:7710:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalSim.g:7711:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalSim.g:7711:4: (lv_if_2_0= ruleDExpression )
            // InternalSim.g:7712:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_98);
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

            otherlv_3=(Token)match(input,76,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalSim.g:7733:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalSim.g:7734:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalSim.g:7734:4: (lv_then_4_0= ruleDExpression )
            // InternalSim.g:7735:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_99);
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

            // InternalSim.g:7752:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==77) && (synpred15_InternalSim())) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalSim.g:7753:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalSim.g:7753:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalSim.g:7754:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalSim.g:7760:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalSim.g:7761:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalSim.g:7761:5: (lv_else_6_0= ruleDExpression )
                    // InternalSim.g:7762:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_100);
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

            otherlv_7=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7788:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalSim.g:7788:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalSim.g:7789:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalSim.g:7795:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalSim.g:7801:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalSim.g:7802:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalSim.g:7802:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==46||LA150_0==88||LA150_0==129) ) {
                alt150=1;
            }
            else if ( (LA150_0==45) ) {
                alt150=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // InternalSim.g:7803:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalSim.g:7803:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalSim.g:7804:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalSim.g:7804:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalSim.g:7805:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalSim.g:7823:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalSim.g:7823:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalSim.g:7824:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalSim.g:7828:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalSim.g:7829:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalSim.g:7829:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalSim.g:7830:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_102); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,79,FOLLOW_103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalSim.g:7850:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalSim.g:7851:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalSim.g:7851:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalSim.g:7852:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    otherlv_5=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7878:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalSim.g:7878:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalSim.g:7879:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalSim.g:7885:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:7891:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalSim.g:7892:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalSim.g:7892:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==RULE_NATURAL) ) {
                alt151=1;
            }
            else if ( (LA151_0==46) ) {
                alt151=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // InternalSim.g:7893:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalSim.g:7901:3: kw= '*'
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
    // InternalSim.g:7910:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalSim.g:7910:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalSim.g:7911:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalSim.g:7917:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSim.g:7923:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalSim.g:7924:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalSim.g:7924:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalSim.g:7925:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalSim.g:7925:3: ()
            // InternalSim.g:7926:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7932:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt152=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt152=1;
                }
                break;
            case 81:
                {
                alt152=2;
                }
                break;
            case 82:
                {
                alt152=3;
                }
                break;
            case 83:
                {
                alt152=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // InternalSim.g:7933:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalSim.g:7933:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalSim.g:7934:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalSim.g:7934:5: (lv_value_1_0= 'TRUE' )
                    // InternalSim.g:7935:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSim.g:7948:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalSim.g:7948:4: ( (lv_value_2_0= 'true' ) )
                    // InternalSim.g:7949:5: (lv_value_2_0= 'true' )
                    {
                    // InternalSim.g:7949:5: (lv_value_2_0= 'true' )
                    // InternalSim.g:7950:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSim.g:7963:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalSim.g:7968:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7977:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalSim.g:7977:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalSim.g:7978:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalSim.g:7984:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSim.g:7990:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalSim.g:7991:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalSim.g:7991:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalSim.g:7992:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalSim.g:7992:3: ()
            // InternalSim.g:7993:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7999:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalSim.g:8000:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalSim.g:8000:4: (lv_value_1_0= RULE_NATURAL )
            // InternalSim.g:8001:5: lv_value_1_0= RULE_NATURAL
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
    // InternalSim.g:8021:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalSim.g:8021:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalSim.g:8022:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalSim.g:8028:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSim.g:8034:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalSim.g:8035:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalSim.g:8035:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalSim.g:8036:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalSim.g:8036:3: ()
            // InternalSim.g:8037:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:8043:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalSim.g:8044:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalSim.g:8044:4: (lv_value_1_0= ruleDECIMAL )
            // InternalSim.g:8045:5: lv_value_1_0= ruleDECIMAL
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
    // InternalSim.g:8066:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalSim.g:8066:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalSim.g:8067:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalSim.g:8073:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSim.g:8079:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalSim.g:8080:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalSim.g:8080:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalSim.g:8081:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalSim.g:8081:3: ()
            // InternalSim.g:8082:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:8088:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSim.g:8089:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalSim.g:8089:4: (lv_value_1_0= RULE_STRING )
            // InternalSim.g:8090:5: lv_value_1_0= RULE_STRING
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
    // InternalSim.g:8110:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalSim.g:8110:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalSim.g:8111:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalSim.g:8117:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSim.g:8123:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalSim.g:8124:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalSim.g:8124:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalSim.g:8125:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalSim.g:8125:3: ()
            // InternalSim.g:8126:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:8132:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==84) ) {
                alt153=1;
            }
            else if ( (LA153_0==85) ) {
                alt153=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }
            switch (alt153) {
                case 1 :
                    // InternalSim.g:8133:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:8138:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8147:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalSim.g:8147:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalSim.g:8148:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalSim.g:8154:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalSim.g:8160:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalSim.g:8161:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalSim.g:8161:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalSim.g:8162:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,62,FOLLOW_101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalSim.g:8181:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( ((LA156_0>=86 && LA156_0<=87)) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalSim.g:8182:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalSim.g:8182:4: (kw= 'E' | kw= 'e' )
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==86) ) {
                        alt154=1;
                    }
                    else if ( (LA154_0==87) ) {
                        alt154=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 154, 0, input);

                        throw nvae;
                    }
                    switch (alt154) {
                        case 1 :
                            // InternalSim.g:8183:5: kw= 'E'
                            {
                            kw=(Token)match(input,86,FOLLOW_106); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:8189:5: kw= 'e'
                            {
                            kw=(Token)match(input,87,FOLLOW_106); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSim.g:8195:4: (kw= '+' | kw= '-' )?
                    int alt155=3;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==88) ) {
                        alt155=1;
                    }
                    else if ( (LA155_0==89) ) {
                        alt155=2;
                    }
                    switch (alt155) {
                        case 1 :
                            // InternalSim.g:8196:5: kw= '+'
                            {
                            kw=(Token)match(input,88,FOLLOW_101); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:8202:5: kw= '-'
                            {
                            kw=(Token)match(input,89,FOLLOW_101); if (state.failed) return current;
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
    // InternalSim.g:8220:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalSim.g:8220:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalSim.g:8221:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalSim.g:8227:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSim.g:8233:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalSim.g:8234:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalSim.g:8234:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalSim.g:8235:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_107);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:8245:3: (kw= '.*' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==90) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalSim.g:8246:4: kw= '.*'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8256:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalSim.g:8256:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalSim.g:8257:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalSim.g:8263:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSim.g:8269:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSim.g:8270:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSim.g:8270:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSim.g:8271:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSim.g:8278:3: (kw= '.' this_ID_2= RULE_ID )*
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==62) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // InternalSim.g:8279:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,62,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_75); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop158;
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


    // $ANTLR start "ruleSInformationModelKind"
    // InternalSim.g:8296:1: ruleSInformationModelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) ) ;
    public final Enumerator ruleSInformationModelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:8302:2: ( ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) ) )
            // InternalSim.g:8303:2: ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) )
            {
            // InternalSim.g:8303:2: ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) )
            int alt159=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt159=1;
                }
                break;
            case 92:
                {
                alt159=2;
                }
                break;
            case 93:
                {
                alt159=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // InternalSim.g:8304:3: (enumLiteral_0= 'base' )
                    {
                    // InternalSim.g:8304:3: (enumLiteral_0= 'base' )
                    // InternalSim.g:8305:4: enumLiteral_0= 'base'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8312:3: (enumLiteral_1= 'interface' )
                    {
                    // InternalSim.g:8312:3: (enumLiteral_1= 'interface' )
                    // InternalSim.g:8313:4: enumLiteral_1= 'interface'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8320:3: (enumLiteral_2= 'core' )
                    {
                    // InternalSim.g:8320:3: (enumLiteral_2= 'core' )
                    // InternalSim.g:8321:4: enumLiteral_2= 'core'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleSInformationModelKind"


    // $ANTLR start "ruleSAbstractType"
    // InternalSim.g:8331:1: ruleSAbstractType returns [Enumerator current=null] : ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) ) ;
    public final Enumerator ruleSAbstractType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8337:2: ( ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) ) )
            // InternalSim.g:8338:2: ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) )
            {
            // InternalSim.g:8338:2: ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==94) ) {
                alt160=1;
            }
            else if ( (LA160_0==40) ) {
                alt160=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // InternalSim.g:8339:3: (enumLiteral_0= 'nonabstract' )
                    {
                    // InternalSim.g:8339:3: (enumLiteral_0= 'nonabstract' )
                    // InternalSim.g:8340:4: enumLiteral_0= 'nonabstract'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSAbstractTypeAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSAbstractTypeAccess().getFALSEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8347:3: (enumLiteral_1= 'abstract' )
                    {
                    // InternalSim.g:8347:3: (enumLiteral_1= 'abstract' )
                    // InternalSim.g:8348:4: enumLiteral_1= 'abstract'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSAbstractTypeAccess().getTRUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSAbstractTypeAccess().getTRUEEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleSAbstractType"


    // $ANTLR start "ruleSRootEntity"
    // InternalSim.g:8358:1: ruleSRootEntity returns [Enumerator current=null] : ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) ) ;
    public final Enumerator ruleSRootEntity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8364:2: ( ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) ) )
            // InternalSim.g:8365:2: ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) )
            {
            // InternalSim.g:8365:2: ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==95) ) {
                alt161=1;
            }
            else if ( (LA161_0==35) ) {
                alt161=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // InternalSim.g:8366:3: (enumLiteral_0= 'nonroot' )
                    {
                    // InternalSim.g:8366:3: (enumLiteral_0= 'nonroot' )
                    // InternalSim.g:8367:4: enumLiteral_0= 'nonroot'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSRootEntityAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSRootEntityAccess().getFALSEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8374:3: (enumLiteral_1= 'root' )
                    {
                    // InternalSim.g:8374:3: (enumLiteral_1= 'root' )
                    // InternalSim.g:8375:4: enumLiteral_1= 'root'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSRootEntityAccess().getTRUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSRootEntityAccess().getTRUEEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleSRootEntity"


    // $ANTLR start "ruleSDetailType"
    // InternalSim.g:8385:1: ruleSDetailType returns [Enumerator current=null] : ( (enumLiteral_0= 'entity' ) | (enumLiteral_1= 'detail' ) ) ;
    public final Enumerator ruleSDetailType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8391:2: ( ( (enumLiteral_0= 'entity' ) | (enumLiteral_1= 'detail' ) ) )
            // InternalSim.g:8392:2: ( (enumLiteral_0= 'entity' ) | (enumLiteral_1= 'detail' ) )
            {
            // InternalSim.g:8392:2: ( (enumLiteral_0= 'entity' ) | (enumLiteral_1= 'detail' ) )
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==36) ) {
                alt162=1;
            }
            else if ( (LA162_0==39) ) {
                alt162=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }
            switch (alt162) {
                case 1 :
                    // InternalSim.g:8393:3: (enumLiteral_0= 'entity' )
                    {
                    // InternalSim.g:8393:3: (enumLiteral_0= 'entity' )
                    // InternalSim.g:8394:4: enumLiteral_0= 'entity'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSDetailTypeAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSDetailTypeAccess().getFALSEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8401:3: (enumLiteral_1= 'detail' )
                    {
                    // InternalSim.g:8401:3: (enumLiteral_1= 'detail' )
                    // InternalSim.g:8402:4: enumLiteral_1= 'detail'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSDetailTypeAccess().getTRUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSDetailTypeAccess().getTRUEEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleSDetailType"


    // $ANTLR start "ruleDAssociationKind"
    // InternalSim.g:8412:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8418:2: ( ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) )
            // InternalSim.g:8419:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            {
            // InternalSim.g:8419:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==96) ) {
                alt163=1;
            }
            else if ( (LA163_0==52) ) {
                alt163=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }
            switch (alt163) {
                case 1 :
                    // InternalSim.g:8420:3: (enumLiteral_0= 'references' )
                    {
                    // InternalSim.g:8420:3: (enumLiteral_0= 'references' )
                    // InternalSim.g:8421:4: enumLiteral_0= 'references'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8428:3: (enumLiteral_1= 'contains' )
                    {
                    // InternalSim.g:8428:3: (enumLiteral_1= 'contains' )
                    // InternalSim.g:8429:4: enumLiteral_1= 'contains'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8439:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSim.g:8445:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalSim.g:8446:2: (enumLiteral_0= 'inverse' )
            {
            // InternalSim.g:8446:2: (enumLiteral_0= 'inverse' )
            // InternalSim.g:8447:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleDmxBaseType"
    // InternalSim.g:8456:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'COMPLEX' ) | (enumLiteral_7= 'NOTIFICATION' ) | (enumLiteral_8= 'SERVICE' ) ) ;
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


        	enterRule();

        try {
            // InternalSim.g:8462:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'COMPLEX' ) | (enumLiteral_7= 'NOTIFICATION' ) | (enumLiteral_8= 'SERVICE' ) ) )
            // InternalSim.g:8463:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'COMPLEX' ) | (enumLiteral_7= 'NOTIFICATION' ) | (enumLiteral_8= 'SERVICE' ) )
            {
            // InternalSim.g:8463:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'COMPLEX' ) | (enumLiteral_7= 'NOTIFICATION' ) | (enumLiteral_8= 'SERVICE' ) )
            int alt164=9;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt164=1;
                }
                break;
            case 99:
                {
                alt164=2;
                }
                break;
            case 100:
                {
                alt164=3;
                }
                break;
            case 101:
                {
                alt164=4;
                }
                break;
            case 102:
                {
                alt164=5;
                }
                break;
            case 103:
                {
                alt164=6;
                }
                break;
            case 104:
                {
                alt164=7;
                }
                break;
            case 105:
                {
                alt164=8;
                }
                break;
            case 106:
                {
                alt164=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }

            switch (alt164) {
                case 1 :
                    // InternalSim.g:8464:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalSim.g:8464:3: (enumLiteral_0= 'VOID' )
                    // InternalSim.g:8465:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8472:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalSim.g:8472:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalSim.g:8473:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8480:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalSim.g:8480:3: (enumLiteral_2= 'NUMBER' )
                    // InternalSim.g:8481:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8488:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalSim.g:8488:3: (enumLiteral_3= 'TEXT' )
                    // InternalSim.g:8489:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:8496:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalSim.g:8496:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalSim.g:8497:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSim.g:8504:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalSim.g:8504:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalSim.g:8505:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSim.g:8512:3: (enumLiteral_6= 'COMPLEX' )
                    {
                    // InternalSim.g:8512:3: (enumLiteral_6= 'COMPLEX' )
                    // InternalSim.g:8513:4: enumLiteral_6= 'COMPLEX'
                    {
                    enumLiteral_6=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSim.g:8520:3: (enumLiteral_7= 'NOTIFICATION' )
                    {
                    // InternalSim.g:8520:3: (enumLiteral_7= 'NOTIFICATION' )
                    // InternalSim.g:8521:4: enumLiteral_7= 'NOTIFICATION'
                    {
                    enumLiteral_7=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSim.g:8528:3: (enumLiteral_8= 'SERVICE' )
                    {
                    // InternalSim.g:8528:3: (enumLiteral_8= 'SERVICE' )
                    // InternalSim.g:8529:4: enumLiteral_8= 'SERVICE'
                    {
                    enumLiteral_8=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSERVICEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getSERVICEEnumLiteralDeclaration_8());
                      			
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
    // InternalSim.g:8539:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSim.g:8545:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalSim.g:8546:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalSim.g:8546:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt165=4;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt165=1;
                }
                break;
            case 108:
                {
                alt165=2;
                }
                break;
            case 109:
                {
                alt165=3;
                }
                break;
            case 110:
                {
                alt165=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }

            switch (alt165) {
                case 1 :
                    // InternalSim.g:8547:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalSim.g:8547:3: (enumLiteral_0= 'OR' )
                    // InternalSim.g:8548:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8555:3: (enumLiteral_1= 'or' )
                    {
                    // InternalSim.g:8555:3: (enumLiteral_1= 'or' )
                    // InternalSim.g:8556:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8563:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalSim.g:8563:3: (enumLiteral_2= 'XOR' )
                    // InternalSim.g:8564:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8571:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalSim.g:8571:3: (enumLiteral_3= 'xor' )
                    // InternalSim.g:8572:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8582:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8588:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalSim.g:8589:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalSim.g:8589:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==111) ) {
                alt166=1;
            }
            else if ( (LA166_0==21) ) {
                alt166=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }
            switch (alt166) {
                case 1 :
                    // InternalSim.g:8590:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalSim.g:8590:3: (enumLiteral_0= 'AND' )
                    // InternalSim.g:8591:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8598:3: (enumLiteral_1= 'and' )
                    {
                    // InternalSim.g:8598:3: (enumLiteral_1= 'and' )
                    // InternalSim.g:8599:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8609:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:8615:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalSim.g:8616:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalSim.g:8616:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt167=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt167=1;
                }
                break;
            case 113:
                {
                alt167=2;
                }
                break;
            case 114:
                {
                alt167=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }

            switch (alt167) {
                case 1 :
                    // InternalSim.g:8617:3: (enumLiteral_0= '=' )
                    {
                    // InternalSim.g:8617:3: (enumLiteral_0= '=' )
                    // InternalSim.g:8618:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8625:3: (enumLiteral_1= '!=' )
                    {
                    // InternalSim.g:8625:3: (enumLiteral_1= '!=' )
                    // InternalSim.g:8626:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8633:3: (enumLiteral_2= '<>' )
                    {
                    // InternalSim.g:8633:3: (enumLiteral_2= '<>' )
                    // InternalSim.g:8634:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8644:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalSim.g:8650:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalSim.g:8651:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalSim.g:8651:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt168=6;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt168=1;
                }
                break;
            case 116:
                {
                alt168=2;
                }
                break;
            case 117:
                {
                alt168=3;
                }
                break;
            case 118:
                {
                alt168=4;
                }
                break;
            case 119:
                {
                alt168=5;
                }
                break;
            case 120:
                {
                alt168=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 168, 0, input);

                throw nvae;
            }

            switch (alt168) {
                case 1 :
                    // InternalSim.g:8652:3: (enumLiteral_0= '<' )
                    {
                    // InternalSim.g:8652:3: (enumLiteral_0= '<' )
                    // InternalSim.g:8653:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8660:3: (enumLiteral_1= '<=' )
                    {
                    // InternalSim.g:8660:3: (enumLiteral_1= '<=' )
                    // InternalSim.g:8661:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8668:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalSim.g:8668:3: (enumLiteral_2= '\\u2264' )
                    // InternalSim.g:8669:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8676:3: (enumLiteral_3= '>=' )
                    {
                    // InternalSim.g:8676:3: (enumLiteral_3= '>=' )
                    // InternalSim.g:8677:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:8684:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalSim.g:8684:3: (enumLiteral_4= '\\u2265' )
                    // InternalSim.g:8685:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSim.g:8692:3: (enumLiteral_5= '>' )
                    {
                    // InternalSim.g:8692:3: (enumLiteral_5= '>' )
                    // InternalSim.g:8693:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8703:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:8709:2: ( ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) )
            // InternalSim.g:8710:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            {
            // InternalSim.g:8710:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            int alt169=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt169=1;
                }
                break;
            case 121:
                {
                alt169=2;
                }
                break;
            case 122:
                {
                alt169=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;
            }

            switch (alt169) {
                case 1 :
                    // InternalSim.g:8711:3: (enumLiteral_0= '..' )
                    {
                    // InternalSim.g:8711:3: (enumLiteral_0= '..' )
                    // InternalSim.g:8712:4: enumLiteral_0= '..'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8719:3: (enumLiteral_1= '->' )
                    {
                    // InternalSim.g:8719:3: (enumLiteral_1= '->' )
                    // InternalSim.g:8720:4: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8727:3: (enumLiteral_2= '=>' )
                    {
                    // InternalSim.g:8727:3: (enumLiteral_2= '=>' )
                    // InternalSim.g:8728:4: enumLiteral_2= '=>'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8738:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8744:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalSim.g:8745:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalSim.g:8745:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==88) ) {
                alt170=1;
            }
            else if ( (LA170_0==89) ) {
                alt170=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 170, 0, input);

                throw nvae;
            }
            switch (alt170) {
                case 1 :
                    // InternalSim.g:8746:3: (enumLiteral_0= '+' )
                    {
                    // InternalSim.g:8746:3: (enumLiteral_0= '+' )
                    // InternalSim.g:8747:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8754:3: (enumLiteral_1= '-' )
                    {
                    // InternalSim.g:8754:3: (enumLiteral_1= '-' )
                    // InternalSim.g:8755:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8765:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSim.g:8771:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalSim.g:8772:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalSim.g:8772:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt171=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt171=1;
                }
                break;
            case 123:
                {
                alt171=2;
                }
                break;
            case 124:
                {
                alt171=3;
                }
                break;
            case 125:
                {
                alt171=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 171, 0, input);

                throw nvae;
            }

            switch (alt171) {
                case 1 :
                    // InternalSim.g:8773:3: (enumLiteral_0= '*' )
                    {
                    // InternalSim.g:8773:3: (enumLiteral_0= '*' )
                    // InternalSim.g:8774:4: enumLiteral_0= '*'
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
                    // InternalSim.g:8781:3: (enumLiteral_1= '/' )
                    {
                    // InternalSim.g:8781:3: (enumLiteral_1= '/' )
                    // InternalSim.g:8782:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8789:3: (enumLiteral_2= '**' )
                    {
                    // InternalSim.g:8789:3: (enumLiteral_2= '**' )
                    // InternalSim.g:8790:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8797:3: (enumLiteral_3= '%' )
                    {
                    // InternalSim.g:8797:3: (enumLiteral_3= '%' )
                    // InternalSim.g:8798:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8808:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSim.g:8814:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalSim.g:8815:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalSim.g:8815:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt172=5;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt172=1;
                }
                break;
            case 89:
                {
                alt172=2;
                }
                break;
            case 126:
                {
                alt172=3;
                }
                break;
            case 127:
                {
                alt172=4;
                }
                break;
            case 128:
                {
                alt172=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 172, 0, input);

                throw nvae;
            }

            switch (alt172) {
                case 1 :
                    // InternalSim.g:8816:3: (enumLiteral_0= '+' )
                    {
                    // InternalSim.g:8816:3: (enumLiteral_0= '+' )
                    // InternalSim.g:8817:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8824:3: (enumLiteral_1= '-' )
                    {
                    // InternalSim.g:8824:3: (enumLiteral_1= '-' )
                    // InternalSim.g:8825:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8832:3: (enumLiteral_2= '!' )
                    {
                    // InternalSim.g:8832:3: (enumLiteral_2= '!' )
                    // InternalSim.g:8833:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8840:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalSim.g:8840:3: (enumLiteral_3= 'NOT' )
                    // InternalSim.g:8841:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:8848:3: (enumLiteral_4= 'not' )
                    {
                    // InternalSim.g:8848:3: (enumLiteral_4= 'not' )
                    // InternalSim.g:8849:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8859:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:8865:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalSim.g:8866:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalSim.g:8866:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt173=3;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt173=1;
                }
                break;
            case 88:
                {
                alt173=2;
                }
                break;
            case 46:
                {
                alt173=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 173, 0, input);

                throw nvae;
            }

            switch (alt173) {
                case 1 :
                    // InternalSim.g:8867:3: (enumLiteral_0= '?' )
                    {
                    // InternalSim.g:8867:3: (enumLiteral_0= '?' )
                    // InternalSim.g:8868:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8875:3: (enumLiteral_1= '+' )
                    {
                    // InternalSim.g:8875:3: (enumLiteral_1= '+' )
                    // InternalSim.g:8876:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8883:3: (enumLiteral_2= '*' )
                    {
                    // InternalSim.g:8883:3: (enumLiteral_2= '*' )
                    // InternalSim.g:8884:4: enumLiteral_2= '*'
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

    // $ANTLR start synpred1_InternalSim
    public final void synpred1_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:5759:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalSim.g:5759:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalSim.g:5759:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalSim.g:5760:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalSim.g:5760:7: ()
        // InternalSim.g:5761:7: 
        {
        }

        match(input,62,FOLLOW_6); if (state.failed) return ;
        // InternalSim.g:5763:7: ( ( RULE_ID ) )
        // InternalSim.g:5764:8: ( RULE_ID )
        {
        // InternalSim.g:5764:8: ( RULE_ID )
        // InternalSim.g:5765:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_76); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleDmxOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalSim

    // $ANTLR start synpred2_InternalSim
    public final void synpred2_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:5828:6: ( ( () '.' ) )
        // InternalSim.g:5828:7: ( () '.' )
        {
        // InternalSim.g:5828:7: ( () '.' )
        // InternalSim.g:5829:7: () '.'
        {
        // InternalSim.g:5829:7: ()
        // InternalSim.g:5830:7: 
        {
        }

        match(input,62,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSim

    // $ANTLR start synpred3_InternalSim
    public final void synpred3_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:5864:8: ( ( '(' ) )
        // InternalSim.g:5864:9: ( '(' )
        {
        // InternalSim.g:5864:9: ( '(' )
        // InternalSim.g:5865:9: '('
        {
        match(input,45,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSim

    // $ANTLR start synpred4_InternalSim
    public final void synpred4_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6225:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalSim.g:6225:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalSim.g:6225:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalSim.g:6226:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalSim.g:6226:6: ()
        // InternalSim.g:6227:6: 
        {
        }

        // InternalSim.g:6228:6: ( ( ruleDmxOpOr ) )
        // InternalSim.g:6229:7: ( ruleDmxOpOr )
        {
        // InternalSim.g:6229:7: ( ruleDmxOpOr )
        // InternalSim.g:6230:8: ruleDmxOpOr
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
    // $ANTLR end synpred4_InternalSim

    // $ANTLR start synpred5_InternalSim
    public final void synpred5_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6313:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalSim.g:6313:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalSim.g:6313:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalSim.g:6314:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalSim.g:6314:6: ()
        // InternalSim.g:6315:6: 
        {
        }

        // InternalSim.g:6316:6: ( ( ruleDmxOpAnd ) )
        // InternalSim.g:6317:7: ( ruleDmxOpAnd )
        {
        // InternalSim.g:6317:7: ( ruleDmxOpAnd )
        // InternalSim.g:6318:8: ruleDmxOpAnd
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
    // $ANTLR end synpred5_InternalSim

    // $ANTLR start synpred6_InternalSim
    public final void synpred6_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6401:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalSim.g:6401:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalSim.g:6401:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalSim.g:6402:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalSim.g:6402:6: ()
        // InternalSim.g:6403:6: 
        {
        }

        // InternalSim.g:6404:6: ( ( ruleDmxOpEquality ) )
        // InternalSim.g:6405:7: ( ruleDmxOpEquality )
        {
        // InternalSim.g:6405:7: ( ruleDmxOpEquality )
        // InternalSim.g:6406:8: ruleDmxOpEquality
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
    // $ANTLR end synpred6_InternalSim

    // $ANTLR start synpred7_InternalSim
    public final void synpred7_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6490:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalSim.g:6490:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalSim.g:6490:7: ( () ruleDmxOpInstanceOf )
        // InternalSim.g:6491:7: () ruleDmxOpInstanceOf
        {
        // InternalSim.g:6491:7: ()
        // InternalSim.g:6492:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalSim

    // $ANTLR start synpred8_InternalSim
    public final void synpred8_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6530:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalSim.g:6530:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalSim.g:6530:7: ( () ( ( ruleOpCompare ) ) )
        // InternalSim.g:6531:7: () ( ( ruleOpCompare ) )
        {
        // InternalSim.g:6531:7: ()
        // InternalSim.g:6532:7: 
        {
        }

        // InternalSim.g:6533:7: ( ( ruleOpCompare ) )
        // InternalSim.g:6534:8: ( ruleOpCompare )
        {
        // InternalSim.g:6534:8: ( ruleOpCompare )
        // InternalSim.g:6535:9: ruleOpCompare
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
    // $ANTLR end synpred8_InternalSim

    // $ANTLR start synpred9_InternalSim
    public final void synpred9_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6649:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalSim.g:6649:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalSim.g:6649:6: ( () ( ( ruleOpOther ) ) )
        // InternalSim.g:6650:6: () ( ( ruleOpOther ) )
        {
        // InternalSim.g:6650:6: ()
        // InternalSim.g:6651:6: 
        {
        }

        // InternalSim.g:6652:6: ( ( ruleOpOther ) )
        // InternalSim.g:6653:7: ( ruleOpOther )
        {
        // InternalSim.g:6653:7: ( ruleOpOther )
        // InternalSim.g:6654:8: ruleOpOther
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
    // $ANTLR end synpred9_InternalSim

    // $ANTLR start synpred10_InternalSim
    public final void synpred10_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6737:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalSim.g:6737:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalSim.g:6737:6: ( () ( ( ruleOpAdd ) ) )
        // InternalSim.g:6738:6: () ( ( ruleOpAdd ) )
        {
        // InternalSim.g:6738:6: ()
        // InternalSim.g:6739:6: 
        {
        }

        // InternalSim.g:6740:6: ( ( ruleOpAdd ) )
        // InternalSim.g:6741:7: ( ruleOpAdd )
        {
        // InternalSim.g:6741:7: ( ruleOpAdd )
        // InternalSim.g:6742:8: ruleOpAdd
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
    // $ANTLR end synpred10_InternalSim

    // $ANTLR start synpred11_InternalSim
    public final void synpred11_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6825:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalSim.g:6825:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalSim.g:6825:6: ( () ( ( ruleOpMulti ) ) )
        // InternalSim.g:6826:6: () ( ( ruleOpMulti ) )
        {
        // InternalSim.g:6826:6: ()
        // InternalSim.g:6827:6: 
        {
        }

        // InternalSim.g:6828:6: ( ( ruleOpMulti ) )
        // InternalSim.g:6829:7: ( ruleOpMulti )
        {
        // InternalSim.g:6829:7: ( ruleOpMulti )
        // InternalSim.g:6830:8: ruleOpMulti
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
    // $ANTLR end synpred11_InternalSim

    // $ANTLR start synpred12_InternalSim
    public final void synpred12_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6988:5: ( ( () ruleDmxOpCast ) )
        // InternalSim.g:6988:6: ( () ruleDmxOpCast )
        {
        // InternalSim.g:6988:6: ( () ruleDmxOpCast )
        // InternalSim.g:6989:6: () ruleDmxOpCast
        {
        // InternalSim.g:6989:6: ()
        // InternalSim.g:6990:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSim

    // $ANTLR start synpred13_InternalSim
    public final void synpred13_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:7420:5: ( ( '(' ) )
        // InternalSim.g:7420:6: ( '(' )
        {
        // InternalSim.g:7420:6: ( '(' )
        // InternalSim.g:7421:6: '('
        {
        match(input,45,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSim

    // $ANTLR start synpred14_InternalSim
    public final void synpred14_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:7598:4: ( ']' )
        // InternalSim.g:7598:5: ']'
        {
        match(input,73,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalSim

    // $ANTLR start synpred15_InternalSim
    public final void synpred15_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:7754:5: ( 'else' )
        // InternalSim.g:7754:6: 'else'
        {
        match(input,77,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalSim

    // Delegated rules

    public final boolean synpred15_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA131 dfa131 = new DFA131(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\31\2\36\2\uffff\3\43\6\uffff";
    static final String dfa_3s = "\1\50\2\47\2\uffff\3\47\6\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\3\uffff\1\6\1\10\1\5\1\7\1\1\1\3";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\3\1\2\1\4\2\uffff\2\10\1\5\1\6\1\11\1\7",
            "\1\14\1\uffff\1\15\2\uffff\2\12\2\uffff\1\13",
            "\1\14\1\uffff\1\15\2\uffff\2\12\2\uffff\1\13",
            "",
            "",
            "\2\12\2\uffff\1\13",
            "\2\12\2\uffff\1\13",
            "\2\10\2\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1374:2: (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\4\4\1\uffff\1\30\4\uffff\1\4\1\uffff\1\30";
    static final String dfa_9s = "\1\63\3\54\1\uffff\1\141\4\uffff\1\4\1\uffff\1\141";
    static final String dfa_10s = "\4\uffff\1\2\1\uffff\1\4\1\3\1\5\1\1\1\uffff\1\6\1\uffff";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\5\24\uffff\1\1\5\uffff\1\3\5\uffff\1\2\1\uffff\1\6\13\uffff\1\4",
            "\1\7\42\uffff\1\7\1\uffff\2\11\1\7\1\10",
            "\1\7\42\uffff\1\7\1\uffff\2\11\1\7\1\10",
            "\1\7\42\uffff\1\7\1\uffff\2\11\1\7\1\10",
            "",
            "\1\6\11\uffff\1\12\12\uffff\1\13\6\uffff\1\4\53\uffff\2\4",
            "",
            "",
            "",
            "",
            "\1\14",
            "",
            "\1\6\11\uffff\1\12\12\uffff\1\13\6\uffff\1\4\53\uffff\2\4"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2743:2: (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery )";
        }
    }
    static final String dfa_13s = "\14\uffff";
    static final String dfa_14s = "\1\1\13\uffff";
    static final String dfa_15s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_16s = "\1\175\1\uffff\10\0\2\uffff";
    static final String dfa_17s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_18s = "\2\uffff\1\3\1\4\1\0\1\6\1\5\1\2\1\1\1\7\2\uffff}>";
    static final String[] dfa_19s = {
            "\5\1\13\uffff\2\1\3\uffff\1\1\1\uffff\1\1\1\uffff\5\1\1\uffff\6\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1\12\uffff\1\1\3\uffff\1\2\1\3\1\1\7\uffff\4\1\10\uffff\2\1\21\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\5\1",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA131 extends DFA {

        public DFA131(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 131;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 6487:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA131_4 = input.LA(1);

                         
                        int index131_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index131_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA131_8 = input.LA(1);

                         
                        int index131_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index131_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA131_7 = input.LA(1);

                         
                        int index131_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index131_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA131_2 = input.LA(1);

                         
                        int index131_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index131_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA131_3 = input.LA(1);

                         
                        int index131_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index131_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA131_6 = input.LA(1);

                         
                        int index131_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index131_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA131_5 = input.LA(1);

                         
                        int index131_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index131_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA131_9 = input.LA(1);

                         
                        int index131_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index131_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 131, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0040000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000011F9CA080062L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000011F9CA000062L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000011F9CA000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001F9CA000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000019800800012L,0x00000000C0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000009800800012L,0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000600000000002L,0x0000000001000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000001F9E2000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00020000A2000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000220000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000082000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000410000060L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000A00A0A2000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000410800060L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000088000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000C02082000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000002082000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200400000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000802082000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001600000000062L,0x0000000001000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000062L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000000670L,0xC0000000033F08E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000010000062L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000400000062L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0010000400000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000600000000062L,0x0000000001000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0020600000000062L,0x0000000001000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000000062L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0100000010000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x000007FC00000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000010L,0x000007FC00000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000200000000610L,0xC0000000033F08E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0xC000200000000002L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000A00000000610L,0xC0000000033F08E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000780000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000200002L,0x0000800000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0007000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x01F800000000000CL});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0600000000008000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000400000000002L,0x3800000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000010L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000A00000000670L,0xC0000000033F08E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000302L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000400000000200L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000200L,0x0000000003000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});

}