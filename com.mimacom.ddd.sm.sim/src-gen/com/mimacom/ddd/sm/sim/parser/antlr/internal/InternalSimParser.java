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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'information'", "'model'", "'generate'", "'as'", "'and'", "'to'", "'extends'", "':'", "'grab'", "'domain'", "'aggregate'", "'{'", "'}'", "'primitive'", "'enumeration'", "'ditch'", "','", "'alias'", "'root'", "'entity'", "'morph'", "'fuse'", "'detail'", "'reference'", "'composite'", "'attribute'", "'query'", "'('", "'*'", "')'", "'returns'", "'import'", "'function'", "'constraint'", "'redefines'", "'archetype'", "'abstract'", "'relationship'", "'derived'", "'key'", "'application'", "'service'", "'raises'", "'precondition'", "'postcondition'", "'exception'", "':='", "'ISA'", "'isa'", "'AS'", "'.'", "'@before'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'if'", "'then'", "'else'", "'end'", "'for'", "'do'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'base'", "'interface'", "'core'", "'nonabstract'", "'nonroot'", "'inverse'", "'synchronous'", "'async'", "'in'", "'out'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'"
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
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
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
    // InternalSim.g:72:1: ruleSInformationModel returns [EObject current=null] : ( ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleDQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_imports_6_0= ruleDImport ) )* ( ( (lv_types_7_0= ruleType ) ) | ( (lv_aggregates_8_0= ruleAggregate ) ) | ( (lv_domainProxies_9_0= ruleDomain ) ) )* ) ;
    public final EObject ruleSInformationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_generate_4_0=null;
        Enumerator lv_kind_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_description_5_0 = null;

        EObject lv_imports_6_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_aggregates_8_0 = null;

        EObject lv_domainProxies_9_0 = null;



        	enterRule();

        try {
            // InternalSim.g:78:2: ( ( ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleDQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_imports_6_0= ruleDImport ) )* ( ( (lv_types_7_0= ruleType ) ) | ( (lv_aggregates_8_0= ruleAggregate ) ) | ( (lv_domainProxies_9_0= ruleDomain ) ) )* ) )
            // InternalSim.g:79:2: ( ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleDQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_imports_6_0= ruleDImport ) )* ( ( (lv_types_7_0= ruleType ) ) | ( (lv_aggregates_8_0= ruleAggregate ) ) | ( (lv_domainProxies_9_0= ruleDomain ) ) )* )
            {
            // InternalSim.g:79:2: ( ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleDQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_imports_6_0= ruleDImport ) )* ( ( (lv_types_7_0= ruleType ) ) | ( (lv_aggregates_8_0= ruleAggregate ) ) | ( (lv_domainProxies_9_0= ruleDomain ) ) )* )
            // InternalSim.g:80:3: ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleDQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_imports_6_0= ruleDImport ) )* ( ( (lv_types_7_0= ruleType ) ) | ( (lv_aggregates_8_0= ruleAggregate ) ) | ( (lv_domainProxies_9_0= ruleDomain ) ) )*
            {
            // InternalSim.g:80:3: ( (lv_kind_0_0= ruleSInformationModelKind ) )
            // InternalSim.g:81:4: (lv_kind_0_0= ruleSInformationModelKind )
            {
            // InternalSim.g:81:4: (lv_kind_0_0= ruleSInformationModelKind )
            // InternalSim.g:82:5: lv_kind_0_0= ruleSInformationModelKind
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSInformationModelAccess().getKindSInformationModelKindEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_kind_0_0=ruleSInformationModelKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
              					}
              					set(
              						current,
              						"kind",
              						lv_kind_0_0,
              						"com.mimacom.ddd.sm.sim.Sim.SInformationModelKind");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSInformationModelAccess().getInformationKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSInformationModelAccess().getModelKeyword_2());
              		
            }
            // InternalSim.g:107:3: ( (lv_name_3_0= ruleDQualifiedName ) )
            // InternalSim.g:108:4: (lv_name_3_0= ruleDQualifiedName )
            {
            // InternalSim.g:108:4: (lv_name_3_0= ruleDQualifiedName )
            // InternalSim.g:109:5: lv_name_3_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSInformationModelAccess().getNameDQualifiedNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DQualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:126:3: ( (lv_generate_4_0= 'generate' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSim.g:127:4: (lv_generate_4_0= 'generate' )
                    {
                    // InternalSim.g:127:4: (lv_generate_4_0= 'generate' )
                    // InternalSim.g:128:5: lv_generate_4_0= 'generate'
                    {
                    lv_generate_4_0=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_generate_4_0, grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0());
                      				
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

            // InternalSim.g:140:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_PLAIN_TEXT_ONLY && LA2_0<=RULE_PLAIN_TEXT_START)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSim.g:141:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalSim.g:141:4: (lv_description_5_0= ruleDRichText )
                    // InternalSim.g:142:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSInformationModelAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
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

            // InternalSim.g:159:3: ( (lv_imports_6_0= ruleDImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==48) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSim.g:160:4: (lv_imports_6_0= ruleDImport )
            	    {
            	    // InternalSim.g:160:4: (lv_imports_6_0= ruleDImport )
            	    // InternalSim.g:161:5: lv_imports_6_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSInformationModelAccess().getImportsDImportParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_imports_6_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_6_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSim.g:178:3: ( ( (lv_types_7_0= ruleType ) ) | ( (lv_aggregates_8_0= ruleAggregate ) ) | ( (lv_domainProxies_9_0= ruleDomain ) ) )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    switch ( input.LA(2) ) {
                    case 26:
                        {
                        alt4=3;
                        }
                        break;
                    case 27:
                        {
                        alt4=2;
                        }
                        break;
                    case 30:
                    case 31:
                    case 35:
                    case 36:
                    case 39:
                        {
                        alt4=1;
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
                case 53:
                    {
                    alt4=1;
                    }
                    break;
                case 27:
                    {
                    alt4=2;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalSim.g:179:4: ( (lv_types_7_0= ruleType ) )
            	    {
            	    // InternalSim.g:179:4: ( (lv_types_7_0= ruleType ) )
            	    // InternalSim.g:180:5: (lv_types_7_0= ruleType )
            	    {
            	    // InternalSim.g:180:5: (lv_types_7_0= ruleType )
            	    // InternalSim.g:181:6: lv_types_7_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSInformationModelAccess().getTypesTypeParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_types_7_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_7_0,
            	      							"com.mimacom.ddd.sm.sim.Sim.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:199:4: ( (lv_aggregates_8_0= ruleAggregate ) )
            	    {
            	    // InternalSim.g:199:4: ( (lv_aggregates_8_0= ruleAggregate ) )
            	    // InternalSim.g:200:5: (lv_aggregates_8_0= ruleAggregate )
            	    {
            	    // InternalSim.g:200:5: (lv_aggregates_8_0= ruleAggregate )
            	    // InternalSim.g:201:6: lv_aggregates_8_0= ruleAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSInformationModelAccess().getAggregatesAggregateParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_aggregates_8_0=ruleAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_8_0,
            	      							"com.mimacom.ddd.sm.sim.Sim.Aggregate");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSim.g:219:4: ( (lv_domainProxies_9_0= ruleDomain ) )
            	    {
            	    // InternalSim.g:219:4: ( (lv_domainProxies_9_0= ruleDomain ) )
            	    // InternalSim.g:220:5: (lv_domainProxies_9_0= ruleDomain )
            	    {
            	    // InternalSim.g:220:5: (lv_domainProxies_9_0= ruleDomain )
            	    // InternalSim.g:221:6: lv_domainProxies_9_0= ruleDomain
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSInformationModelAccess().getDomainProxiesDomainParserRuleCall_7_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_domainProxies_9_0=ruleDomain();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"domainProxies",
            	      							lv_domainProxies_9_0,
            	      							"com.mimacom.ddd.sm.sim.Sim.Domain");
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
    // $ANTLR end "ruleSInformationModel"


    // $ANTLR start "entryRuleSGrabDomainRule"
    // InternalSim.g:243:1: entryRuleSGrabDomainRule returns [EObject current=null] : iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF ;
    public final EObject entryRuleSGrabDomainRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabDomainRule = null;


        try {
            // InternalSim.g:243:56: (iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF )
            // InternalSim.g:244:2: iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF
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
    // InternalSim.g:250:1: ruleSGrabDomainRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleSGrabDomainRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:256:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalSim.g:257:2: ( ( ruleDQualifiedName ) )
            {
            // InternalSim.g:257:2: ( ( ruleDQualifiedName ) )
            // InternalSim.g:258:3: ( ruleDQualifiedName )
            {
            // InternalSim.g:258:3: ( ruleDQualifiedName )
            // InternalSim.g:259:4: ruleDQualifiedName
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
    // InternalSim.g:276:1: entryRuleSGrabAggregateRule returns [EObject current=null] : iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF ;
    public final EObject entryRuleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabAggregateRule = null;


        try {
            // InternalSim.g:276:59: (iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF )
            // InternalSim.g:277:2: iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF
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
    // InternalSim.g:283:1: ruleSGrabAggregateRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:289:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalSim.g:290:2: ( ( ruleDQualifiedName ) )
            {
            // InternalSim.g:290:2: ( ( ruleDQualifiedName ) )
            // InternalSim.g:291:3: ( ruleDQualifiedName )
            {
            // InternalSim.g:291:3: ( ruleDQualifiedName )
            // InternalSim.g:292:4: ruleDQualifiedName
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
    // InternalSim.g:309:1: entryRuleSGrabPrimitiveRule returns [EObject current=null] : iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF ;
    public final EObject entryRuleSGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabPrimitiveRule = null;


        try {
            // InternalSim.g:309:59: (iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF )
            // InternalSim.g:310:2: iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF
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
    // InternalSim.g:316:1: ruleSGrabPrimitiveRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:322:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:323:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:323:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:324:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:324:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:325:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:325:4: ( ruleDQualifiedName )
            // InternalSim.g:326:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabPrimitiveRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:340:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSim.g:341:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabPrimitiveRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:345:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:346:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:346:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:347:6: lv_renameTo_2_0= RULE_ID
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


    // $ANTLR start "entryRuleSGrabEnumerationRule"
    // InternalSim.g:368:1: entryRuleSGrabEnumerationRule returns [EObject current=null] : iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF ;
    public final EObject entryRuleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationRule = null;


        try {
            // InternalSim.g:368:61: (iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF )
            // InternalSim.g:369:2: iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF
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
    // InternalSim.g:375:1: ruleSGrabEnumerationRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:381:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:382:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:382:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:383:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:383:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:384:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:384:4: ( ruleDQualifiedName )
            // InternalSim.g:385:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabEnumerationRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:399:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSim.g:400:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:404:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:405:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:405:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:406:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:427:1: entryRuleSDitchEnumerationRule returns [EObject current=null] : iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF ;
    public final EObject entryRuleSDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationRule = null;


        try {
            // InternalSim.g:427:62: (iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF )
            // InternalSim.g:428:2: iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF
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
    // InternalSim.g:434:1: ruleSDitchEnumerationRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:440:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:441:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:441:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:442:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:442:3: (otherlv_0= RULE_ID )
            // InternalSim.g:443:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSDitchEnumerationRuleRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0());
              			
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
    // InternalSim.g:457:1: entryRuleSGrabEnumerationLiteralRule returns [EObject current=null] : iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF ;
    public final EObject entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationLiteralRule = null;


        try {
            // InternalSim.g:457:68: (iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF )
            // InternalSim.g:458:2: iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF
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
    // InternalSim.g:464:1: ruleSGrabEnumerationLiteralRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:470:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:471:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:471:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:472:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:472:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:473:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:473:4: (otherlv_0= RULE_ID )
            // InternalSim.g:474:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabEnumerationLiteralRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0());
              				
            }

            }


            }

            // InternalSim.g:485:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSim.g:486:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:490:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:491:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:491:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:492:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:513:1: entryRuleSDitchEnumerationLiteralRule returns [EObject current=null] : iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF ;
    public final EObject entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationLiteralRule = null;


        try {
            // InternalSim.g:513:69: (iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF )
            // InternalSim.g:514:2: iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF
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
    // InternalSim.g:520:1: ruleSDitchEnumerationLiteralRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:526:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:527:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:527:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:528:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:528:3: (otherlv_0= RULE_ID )
            // InternalSim.g:529:4: otherlv_0= RULE_ID
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
    // InternalSim.g:543:1: entryRuleSGrabComplexTypeRule returns [EObject current=null] : iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF ;
    public final EObject entryRuleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabComplexTypeRule = null;


        try {
            // InternalSim.g:543:61: (iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF )
            // InternalSim.g:544:2: iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF
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
    // InternalSim.g:550:1: ruleSGrabComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:556:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:557:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:557:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:558:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:558:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:559:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:559:4: ( ruleDQualifiedName )
            // InternalSim.g:560:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:574:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSim.g:575:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:579:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:580:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:580:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:581:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:602:1: entryRuleSDitchComplexTypeRule returns [EObject current=null] : iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF ;
    public final EObject entryRuleSDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchComplexTypeRule = null;


        try {
            // InternalSim.g:602:62: (iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF )
            // InternalSim.g:603:2: iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF
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
    // InternalSim.g:609:1: ruleSDitchComplexTypeRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:615:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:616:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:616:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:617:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:617:3: (otherlv_0= RULE_ID )
            // InternalSim.g:618:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSDitchComplexTypeRuleRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationCrossReference_0());
              			
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
    // InternalSim.g:632:1: entryRuleSMorphComplexTypeRule returns [EObject current=null] : iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF ;
    public final EObject entryRuleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphComplexTypeRule = null;


        try {
            // InternalSim.g:632:62: (iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF )
            // InternalSim.g:633:2: iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF
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
    // InternalSim.g:639:1: ruleSMorphComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] ) ;
    public final EObject ruleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject this_ChangeComplexType_1 = null;



        	enterRule();

        try {
            // InternalSim.g:645:2: ( ( ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] ) )
            // InternalSim.g:646:2: ( ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] )
            {
            // InternalSim.g:646:2: ( ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] )
            // InternalSim.g:647:3: ( ( ruleDQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current]
            {
            // InternalSim.g:647:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:648:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:648:4: ( ruleDQualifiedName )
            // InternalSim.g:649:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
              				
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
    // InternalSim.g:678:1: entryRuleSFuseComplexTypeRule returns [EObject current=null] : iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF ;
    public final EObject entryRuleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFuseComplexTypeRule = null;


        try {
            // InternalSim.g:678:61: (iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF )
            // InternalSim.g:679:2: iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF
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
    // InternalSim.g:685:1: ruleSFuseComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] ) ;
    public final EObject ruleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ChangeComplexType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:691:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] ) )
            // InternalSim.g:692:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] )
            {
            // InternalSim.g:692:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] )
            // InternalSim.g:693:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current]
            {
            // InternalSim.g:693:3: ( ( ruleDQualifiedName ) )
            // InternalSim.g:694:4: ( ruleDQualifiedName )
            {
            // InternalSim.g:694:4: ( ruleDQualifiedName )
            // InternalSim.g:695:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
              				
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

            // InternalSim.g:709:3: (otherlv_1= 'and' ( ( ruleDQualifiedName ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSim.g:710:4: otherlv_1= 'and' ( ( ruleDQualifiedName ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    // InternalSim.g:714:4: ( ( ruleDQualifiedName ) )
            	    // InternalSim.g:715:5: ( ruleDQualifiedName )
            	    {
            	    // InternalSim.g:715:5: ( ruleDQualifiedName )
            	    // InternalSim.g:716:6: ruleDQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeCrossReference_1_1_0());
            	      					
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
    // InternalSim.g:747:1: ruleChangeComplexType[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleChangeComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_renameTo_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_abstract_1_0 = null;

        Enumerator lv_rootEntity_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:753:2: ( (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalSim.g:754:2: (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalSim.g:754:2: (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? )
            // InternalSim.g:755:3: otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChangeComplexTypeAccess().getToKeyword_0());
              		
            }
            // InternalSim.g:759:3: ( (lv_abstract_1_0= ruleSAbstractType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==53||LA10_0==98) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSim.g:760:4: (lv_abstract_1_0= ruleSAbstractType )
                    {
                    // InternalSim.g:760:4: (lv_abstract_1_0= ruleSAbstractType )
                    // InternalSim.g:761:5: lv_abstract_1_0= ruleSAbstractType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChangeComplexTypeAccess().getAbstractSAbstractTypeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
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

            // InternalSim.g:778:3: ( (lv_rootEntity_2_0= ruleSRootEntity ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35||LA11_0==99) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSim.g:779:4: (lv_rootEntity_2_0= ruleSRootEntity )
                    {
                    // InternalSim.g:779:4: (lv_rootEntity_2_0= ruleSRootEntity )
                    // InternalSim.g:780:5: lv_rootEntity_2_0= ruleSRootEntity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChangeComplexTypeAccess().getRootEntitySRootEntityEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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
                    break;

            }

            // InternalSim.g:797:3: ( (lv_renameTo_3_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSim.g:798:4: (lv_renameTo_3_0= RULE_ID )
                    {
                    // InternalSim.g:798:4: (lv_renameTo_3_0= RULE_ID )
                    // InternalSim.g:799:5: lv_renameTo_3_0= RULE_ID
                    {
                    lv_renameTo_3_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_renameTo_3_0, grammarAccess.getChangeComplexTypeAccess().getRenameToIDTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getChangeComplexTypeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"renameTo",
                      						lv_renameTo_3_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:815:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSim.g:816:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getChangeComplexTypeAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalSim.g:820:4: ( (otherlv_5= RULE_ID ) )
                    // InternalSim.g:821:5: (otherlv_5= RULE_ID )
                    {
                    // InternalSim.g:821:5: (otherlv_5= RULE_ID )
                    // InternalSim.g:822:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getChangeComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getChangeComplexTypeAccess().getExtendFromDComplexTypeCrossReference_4_1_0());
                      					
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
    // $ANTLR end "ruleChangeComplexType"


    // $ANTLR start "entryRuleSGrabFeatureRule"
    // InternalSim.g:838:1: entryRuleSGrabFeatureRule returns [EObject current=null] : iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF ;
    public final EObject entryRuleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabFeatureRule = null;


        try {
            // InternalSim.g:838:57: (iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF )
            // InternalSim.g:839:2: iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF
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
    // InternalSim.g:845:1: ruleSGrabFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:851:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:852:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:852:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:853:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:853:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:854:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:854:4: (otherlv_0= RULE_ID )
            // InternalSim.g:855:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
              				
            }

            }


            }

            // InternalSim.g:866:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSim.g:867:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalSim.g:871:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:872:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:872:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:873:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:894:1: entryRuleSMorphFeatureRule returns [EObject current=null] : iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF ;
    public final EObject entryRuleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphFeatureRule = null;


        try {
            // InternalSim.g:894:58: (iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF )
            // InternalSim.g:895:2: iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF
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
    // InternalSim.g:901:1: ruleSMorphFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )? ) ;
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
            // InternalSim.g:907:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )? ) )
            // InternalSim.g:908:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )? )
            {
            // InternalSim.g:908:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )? )
            // InternalSim.g:909:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )?
            {
            // InternalSim.g:909:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:910:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:910:4: (otherlv_0= RULE_ID )
            // InternalSim.g:911:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSMorphFeatureRuleAccess().getToKeyword_1());
              		
            }
            // InternalSim.g:926:3: ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==24) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalSim.g:927:4: ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalSim.g:927:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:928:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:928:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:929:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSim.g:950:3: ( (otherlv_4= RULE_ID ) )
            // InternalSim.g:951:4: (otherlv_4= RULE_ID )
            {
            // InternalSim.g:951:4: (otherlv_4= RULE_ID )
            // InternalSim.g:952:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getSMorphFeatureRuleAccess().getRetypeToDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalSim.g:963:3: ( (lv_remultiplyTo_5_0= ruleDMultiplicity ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_NATURAL) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalSim.g:964:4: (lv_remultiplyTo_5_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:964:4: (lv_remultiplyTo_5_0= ruleDMultiplicity )
                    // InternalSim.g:965:5: lv_remultiplyTo_5_0= ruleDMultiplicity
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
    // InternalSim.g:986:1: entryRuleSDitchFeatureRule returns [EObject current=null] : iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF ;
    public final EObject entryRuleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchFeatureRule = null;


        try {
            // InternalSim.g:986:58: (iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF )
            // InternalSim.g:987:2: iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF
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
    // InternalSim.g:993:1: ruleSDitchFeatureRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:999:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:1000:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:1000:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:1001:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:1001:3: (otherlv_0= RULE_ID )
            // InternalSim.g:1002:4: otherlv_0= RULE_ID
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
    // InternalSim.g:1016:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalSim.g:1016:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalSim.g:1017:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalSim.g:1023:1: ruleDomain returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_deductionRule_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1029:2: ( ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) ) )
            // InternalSim.g:1030:2: ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) )
            {
            // InternalSim.g:1030:2: ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) )
            // InternalSim.g:1031:3: () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) )
            {
            // InternalSim.g:1031:3: ()
            // InternalSim.g:1032:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDomainAccess().getSDomainDeductionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getGrabKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getDomainKeyword_2());
              		
            }
            // InternalSim.g:1046:3: ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) )
            // InternalSim.g:1047:4: (lv_deductionRule_3_0= ruleSGrabDomainRule )
            {
            // InternalSim.g:1047:4: (lv_deductionRule_3_0= ruleSGrabDomainRule )
            // InternalSim.g:1048:5: lv_deductionRule_3_0= ruleSGrabDomainRule
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
    // InternalSim.g:1069:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // InternalSim.g:1069:50: (iv_ruleAggregate= ruleAggregate EOF )
            // InternalSim.g:1070:2: iv_ruleAggregate= ruleAggregate EOF
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
    // InternalSim.g:1076:1: ruleAggregate returns [EObject current=null] : (this_SAggregateDeduction_0= ruleSAggregateDeduction | this_DAggregate_1= ruleDAggregate ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        EObject this_SAggregateDeduction_0 = null;

        EObject this_DAggregate_1 = null;



        	enterRule();

        try {
            // InternalSim.g:1082:2: ( (this_SAggregateDeduction_0= ruleSAggregateDeduction | this_DAggregate_1= ruleDAggregate ) )
            // InternalSim.g:1083:2: (this_SAggregateDeduction_0= ruleSAggregateDeduction | this_DAggregate_1= ruleDAggregate )
            {
            // InternalSim.g:1083:2: (this_SAggregateDeduction_0= ruleSAggregateDeduction | this_DAggregate_1= ruleDAggregate )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
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
                    // InternalSim.g:1084:3: this_SAggregateDeduction_0= ruleSAggregateDeduction
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
                    // InternalSim.g:1093:3: this_DAggregate_1= ruleDAggregate
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
    // InternalSim.g:1105:1: entryRuleSAggregateDeduction returns [EObject current=null] : iv_ruleSAggregateDeduction= ruleSAggregateDeduction EOF ;
    public final EObject entryRuleSAggregateDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAggregateDeduction = null;


        try {
            // InternalSim.g:1105:60: (iv_ruleSAggregateDeduction= ruleSAggregateDeduction EOF )
            // InternalSim.g:1106:2: iv_ruleSAggregateDeduction= ruleSAggregateDeduction EOF
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
    // InternalSim.g:1112:1: ruleSAggregateDeduction returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' ) ;
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
            // InternalSim.g:1118:2: ( ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' ) )
            // InternalSim.g:1119:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' )
            {
            // InternalSim.g:1119:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' )
            // InternalSim.g:1120:3: () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}'
            {
            // InternalSim.g:1120:3: ()
            // InternalSim.g:1121:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSAggregateDeductionAccess().getSAggregateDeductionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSAggregateDeductionAccess().getGrabKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSAggregateDeductionAccess().getAggregateKeyword_2());
              		
            }
            // InternalSim.g:1135:3: ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
            // InternalSim.g:1136:4: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
            {
            // InternalSim.g:1136:4: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
            // InternalSim.g:1137:5: lv_deductionRule_3_0= ruleSGrabAggregateRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSAggregateDeductionAccess().getDeductionRuleSGrabAggregateRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalSim.g:1154:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_PLAIN_TEXT_ONLY && LA18_0<=RULE_PLAIN_TEXT_START)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSim.g:1155:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:1155:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:1156:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSAggregateDeductionAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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

            otherlv_5=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSAggregateDeductionAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalSim.g:1177:3: ( (lv_types_6_0= ruleType ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25||(LA19_0>=30 && LA19_0<=32)||(LA19_0>=35 && LA19_0<=39)||LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSim.g:1178:4: (lv_types_6_0= ruleType )
            	    {
            	    // InternalSim.g:1178:4: (lv_types_6_0= ruleType )
            	    // InternalSim.g:1179:5: lv_types_6_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSAggregateDeductionAccess().getTypesTypeParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop19;
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
    // InternalSim.g:1204:1: entryRuleDAggregate returns [EObject current=null] : iv_ruleDAggregate= ruleDAggregate EOF ;
    public final EObject entryRuleDAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAggregate = null;


        try {
            // InternalSim.g:1204:51: (iv_ruleDAggregate= ruleDAggregate EOF )
            // InternalSim.g:1205:2: iv_ruleDAggregate= ruleDAggregate EOF
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
    // InternalSim.g:1211:1: ruleDAggregate returns [EObject current=null] : ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}' ) ;
    public final EObject ruleDAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_2_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1217:2: ( ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}' ) )
            // InternalSim.g:1218:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}' )
            {
            // InternalSim.g:1218:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}' )
            // InternalSim.g:1219:3: () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleType ) )* otherlv_5= '}'
            {
            // InternalSim.g:1219:3: ()
            // InternalSim.g:1220:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDAggregateAccess().getDAggregateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDAggregateAccess().getAggregateKeyword_1());
              		
            }
            // InternalSim.g:1230:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_PLAIN_TEXT_ONLY && LA20_0<=RULE_PLAIN_TEXT_START)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSim.g:1231:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalSim.g:1231:4: (lv_description_2_0= ruleDRichText )
                    // InternalSim.g:1232:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAggregateAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDAggregateAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSim.g:1253:3: ( (lv_types_4_0= ruleType ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25||(LA21_0>=30 && LA21_0<=32)||(LA21_0>=35 && LA21_0<=39)||LA21_0==53) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSim.g:1254:4: (lv_types_4_0= ruleType )
            	    {
            	    // InternalSim.g:1254:4: (lv_types_4_0= ruleType )
            	    // InternalSim.g:1255:5: lv_types_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDAggregateAccess().getTypesTypeParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop21;
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
    // InternalSim.g:1280:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSim.g:1280:45: (iv_ruleType= ruleType EOF )
            // InternalSim.g:1281:2: iv_ruleType= ruleType EOF
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
    // InternalSim.g:1287:1: ruleType returns [EObject current=null] : (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType ) ;
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
            // InternalSim.g:1293:2: ( (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType ) )
            // InternalSim.g:1294:2: (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType )
            {
            // InternalSim.g:1294:2: (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType )
            int alt22=8;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalSim.g:1295:3: this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction
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
                    // InternalSim.g:1304:3: this_DPrimitive_1= ruleDPrimitive
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
                    // InternalSim.g:1313:3: this_SEnumerationDeduction_2= ruleSEnumerationDeduction
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
                    // InternalSim.g:1322:3: this_DEnumeration_3= ruleDEnumeration
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
                    // InternalSim.g:1331:3: this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction
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
                    // InternalSim.g:1340:3: this_DEntityType_5= ruleDEntityType
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
                    // InternalSim.g:1349:3: this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction
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
                    // InternalSim.g:1358:3: this_DDetailType_7= ruleDDetailType
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
    // InternalSim.g:1370:1: entryRuleSPrimitiveDeduction returns [EObject current=null] : iv_ruleSPrimitiveDeduction= ruleSPrimitiveDeduction EOF ;
    public final EObject entryRuleSPrimitiveDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitiveDeduction = null;


        try {
            // InternalSim.g:1370:60: (iv_ruleSPrimitiveDeduction= ruleSPrimitiveDeduction EOF )
            // InternalSim.g:1371:2: iv_ruleSPrimitiveDeduction= ruleSPrimitiveDeduction EOF
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
    // InternalSim.g:1377:1: ruleSPrimitiveDeduction returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) ;
    public final EObject ruleSPrimitiveDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1383:2: ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) )
            // InternalSim.g:1384:2: ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            {
            // InternalSim.g:1384:2: ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            // InternalSim.g:1385:3: () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}'
            {
            // InternalSim.g:1385:3: ()
            // InternalSim.g:1386:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSPrimitiveDeductionAccess().getSPrimitiveDeductionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSPrimitiveDeductionAccess().getGrabKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSPrimitiveDeductionAccess().getPrimitiveKeyword_2());
              		
            }
            // InternalSim.g:1400:3: ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) )
            // InternalSim.g:1401:4: (lv_deductionRule_3_0= ruleSGrabPrimitiveRule )
            {
            // InternalSim.g:1401:4: (lv_deductionRule_3_0= ruleSGrabPrimitiveRule )
            // InternalSim.g:1402:5: lv_deductionRule_3_0= ruleSGrabPrimitiveRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSPrimitiveDeductionAccess().getDeductionRuleSGrabPrimitiveRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalSim.g:1419:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_PLAIN_TEXT_ONLY && LA23_0<=RULE_PLAIN_TEXT_START)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSim.g:1420:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:1420:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:1421:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSPrimitiveDeductionAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSPrimitiveDeductionRule());
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

            otherlv_5=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSPrimitiveDeductionAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalSim.g:1442:3: ( (lv_constraints_6_0= ruleDConstraint ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==50) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSim.g:1443:4: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:1443:4: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalSim.g:1444:5: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSPrimitiveDeductionAccess().getConstraintsDConstraintParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_constraints_6_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSPrimitiveDeductionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_6_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSPrimitiveDeductionAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSim.g:1469:1: entryRuleSEnumerationDeduction returns [EObject current=null] : iv_ruleSEnumerationDeduction= ruleSEnumerationDeduction EOF ;
    public final EObject entryRuleSEnumerationDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumerationDeduction = null;


        try {
            // InternalSim.g:1469:62: (iv_ruleSEnumerationDeduction= ruleSEnumerationDeduction EOF )
            // InternalSim.g:1470:2: iv_ruleSEnumerationDeduction= ruleSEnumerationDeduction EOF
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
    // InternalSim.g:1476:1: ruleSEnumerationDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}' ) ;
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
            // InternalSim.g:1482:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}' ) )
            // InternalSim.g:1483:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}' )
            {
            // InternalSim.g:1483:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}' )
            // InternalSim.g:1484:3: () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? otherlv_8= '{' ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )? ( (lv_constraints_12_0= ruleDConstraint ) )* otherlv_13= '}'
            {
            // InternalSim.g:1484:3: ()
            // InternalSim.g:1485:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSEnumerationDeductionAccess().getSEnumerationDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:1491:3: ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            else if ( (LA25_0==32) ) {
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
                    // InternalSim.g:1492:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    {
                    // InternalSim.g:1492:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    // InternalSim.g:1493:5: otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSEnumerationDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSEnumerationDeductionAccess().getEnumerationKeyword_1_0_1());
                      				
                    }
                    // InternalSim.g:1501:5: ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    // InternalSim.g:1502:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    {
                    // InternalSim.g:1502:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    // InternalSim.g:1503:7: lv_deductionRule_3_0= ruleSGrabEnumerationRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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
                    // InternalSim.g:1522:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) )
                    {
                    // InternalSim.g:1522:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) ) )
                    // InternalSim.g:1523:5: otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSEnumerationDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSEnumerationDeductionAccess().getEnumerationKeyword_1_1_1());
                      				
                    }
                    // InternalSim.g:1531:5: ( (lv_deductionRule_6_0= ruleSDitchEnumerationRule ) )
                    // InternalSim.g:1532:6: (lv_deductionRule_6_0= ruleSDitchEnumerationRule )
                    {
                    // InternalSim.g:1532:6: (lv_deductionRule_6_0= ruleSDitchEnumerationRule )
                    // InternalSim.g:1533:7: lv_deductionRule_6_0= ruleSDitchEnumerationRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getDeductionRuleSDitchEnumerationRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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

            // InternalSim.g:1552:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_PLAIN_TEXT_ONLY && LA26_0<=RULE_PLAIN_TEXT_START)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSim.g:1553:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalSim.g:1553:4: (lv_description_7_0= ruleDRichText )
                    // InternalSim.g:1554:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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

            otherlv_8=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSEnumerationDeductionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSim.g:1575:3: ( ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==25||LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSim.g:1576:4: ( (lv_literals_9_0= ruleLiteral ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )*
                    {
                    // InternalSim.g:1576:4: ( (lv_literals_9_0= ruleLiteral ) )
                    // InternalSim.g:1577:5: (lv_literals_9_0= ruleLiteral )
                    {
                    // InternalSim.g:1577:5: (lv_literals_9_0= ruleLiteral )
                    // InternalSim.g:1578:6: lv_literals_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getLiteralsLiteralParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
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

                    // InternalSim.g:1595:4: (otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==33) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSim.g:1596:5: otherlv_10= ',' ( (lv_literals_11_0= ruleLiteral ) )
                    	    {
                    	    otherlv_10=(Token)match(input,33,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getSEnumerationDeductionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:1600:5: ( (lv_literals_11_0= ruleLiteral ) )
                    	    // InternalSim.g:1601:6: (lv_literals_11_0= ruleLiteral )
                    	    {
                    	    // InternalSim.g:1601:6: (lv_literals_11_0= ruleLiteral )
                    	    // InternalSim.g:1602:7: lv_literals_11_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getLiteralsLiteralParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSim.g:1621:3: ( (lv_constraints_12_0= ruleDConstraint ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==50) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSim.g:1622:4: (lv_constraints_12_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:1622:4: (lv_constraints_12_0= ruleDConstraint )
            	    // InternalSim.g:1623:5: lv_constraints_12_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSEnumerationDeductionAccess().getConstraintsDConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop29;
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
    // InternalSim.g:1648:1: entryRuleDEnumeration returns [EObject current=null] : iv_ruleDEnumeration= ruleDEnumeration EOF ;
    public final EObject entryRuleDEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumeration = null;


        try {
            // InternalSim.g:1648:53: (iv_ruleDEnumeration= ruleDEnumeration EOF )
            // InternalSim.g:1649:2: iv_ruleDEnumeration= ruleDEnumeration EOF
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
    // InternalSim.g:1655:1: ruleDEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) ;
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
            // InternalSim.g:1661:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) )
            // InternalSim.g:1662:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            {
            // InternalSim.g:1662:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            // InternalSim.g:1663:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerationAccess().getEnumerationKeyword_0());
              		
            }
            // InternalSim.g:1667:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:1668:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:1668:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:1669:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
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

            // InternalSim.g:1685:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSim.g:1686:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDEnumerationAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:1690:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:1691:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:1691:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:1692:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
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
            	    break loop30;
                }
            } while (true);

            // InternalSim.g:1709:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_PLAIN_TEXT_ONLY && LA31_0<=RULE_PLAIN_TEXT_START)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSim.g:1710:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:1710:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:1711:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDEnumerationAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDEnumerationAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSim.g:1732:3: ( ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==25||LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSim.g:1733:4: ( (lv_literals_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )*
                    {
                    // InternalSim.g:1733:4: ( (lv_literals_6_0= ruleLiteral ) )
                    // InternalSim.g:1734:5: (lv_literals_6_0= ruleLiteral )
                    {
                    // InternalSim.g:1734:5: (lv_literals_6_0= ruleLiteral )
                    // InternalSim.g:1735:6: lv_literals_6_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsLiteralParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
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

                    // InternalSim.g:1752:4: (otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==33) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSim.g:1753:5: otherlv_7= ',' ( (lv_literals_8_0= ruleLiteral ) )
                    	    {
                    	    otherlv_7=(Token)match(input,33,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getDEnumerationAccess().getCommaKeyword_5_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:1757:5: ( (lv_literals_8_0= ruleLiteral ) )
                    	    // InternalSim.g:1758:6: (lv_literals_8_0= ruleLiteral )
                    	    {
                    	    // InternalSim.g:1758:6: (lv_literals_8_0= ruleLiteral )
                    	    // InternalSim.g:1759:7: lv_literals_8_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsLiteralParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSim.g:1778:3: ( (lv_constraints_9_0= ruleDConstraint ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==50) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSim.g:1779:4: (lv_constraints_9_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:1779:4: (lv_constraints_9_0= ruleDConstraint )
            	    // InternalSim.g:1780:5: lv_constraints_9_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerationAccess().getConstraintsDConstraintParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop34;
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
    // InternalSim.g:1805:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSim.g:1805:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSim.g:1806:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalSim.g:1812:1: ruleLiteral returns [EObject current=null] : (this_SLiteralDeduction_0= ruleSLiteralDeduction | this_DLiteral_1= ruleDLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SLiteralDeduction_0 = null;

        EObject this_DLiteral_1 = null;



        	enterRule();

        try {
            // InternalSim.g:1818:2: ( (this_SLiteralDeduction_0= ruleSLiteralDeduction | this_DLiteral_1= ruleDLiteral ) )
            // InternalSim.g:1819:2: (this_SLiteralDeduction_0= ruleSLiteralDeduction | this_DLiteral_1= ruleDLiteral )
            {
            // InternalSim.g:1819:2: (this_SLiteralDeduction_0= ruleSLiteralDeduction | this_DLiteral_1= ruleDLiteral )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25||LA35_0==32) ) {
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
                    // InternalSim.g:1820:3: this_SLiteralDeduction_0= ruleSLiteralDeduction
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
                    // InternalSim.g:1829:3: this_DLiteral_1= ruleDLiteral
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
    // InternalSim.g:1841:1: entryRuleSLiteralDeduction returns [EObject current=null] : iv_ruleSLiteralDeduction= ruleSLiteralDeduction EOF ;
    public final EObject entryRuleSLiteralDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSLiteralDeduction = null;


        try {
            // InternalSim.g:1841:58: (iv_ruleSLiteralDeduction= ruleSLiteralDeduction EOF )
            // InternalSim.g:1842:2: iv_ruleSLiteralDeduction= ruleSLiteralDeduction EOF
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
    // InternalSim.g:1848:1: ruleSLiteralDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleSLiteralDeduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1854:2: ( ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalSim.g:1855:2: ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalSim.g:1855:2: ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalSim.g:1856:3: () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalSim.g:1856:3: ()
            // InternalSim.g:1857:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSLiteralDeductionAccess().getSLiteralDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:1863:3: ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            else if ( (LA36_0==32) ) {
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
                    // InternalSim.g:1864:4: (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1864:4: (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    // InternalSim.g:1865:5: otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSLiteralDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:1869:5: ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    // InternalSim.g:1870:6: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    {
                    // InternalSim.g:1870:6: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    // InternalSim.g:1871:7: lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSLiteralDeductionAccess().getDeductionRuleSGrabEnumerationLiteralRuleParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalSim.g:1890:4: (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1890:4: (otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) ) )
                    // InternalSim.g:1891:5: otherlv_3= 'ditch' ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSLiteralDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:1895:5: ( (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule ) )
                    // InternalSim.g:1896:6: (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule )
                    {
                    // InternalSim.g:1896:6: (lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule )
                    // InternalSim.g:1897:7: lv_deductionRule_4_0= ruleSDitchEnumerationLiteralRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSLiteralDeductionAccess().getDeductionRuleSDitchEnumerationLiteralRuleParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalSim.g:1916:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_PLAIN_TEXT_ONLY && LA37_0<=RULE_PLAIN_TEXT_START)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSim.g:1917:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalSim.g:1917:4: (lv_description_5_0= ruleDRichText )
                    // InternalSim.g:1918:5: lv_description_5_0= ruleDRichText
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
    // InternalSim.g:1939:1: entryRuleSEntityTypeDeduction returns [EObject current=null] : iv_ruleSEntityTypeDeduction= ruleSEntityTypeDeduction EOF ;
    public final EObject entryRuleSEntityTypeDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEntityTypeDeduction = null;


        try {
            // InternalSim.g:1939:61: (iv_ruleSEntityTypeDeduction= ruleSEntityTypeDeduction EOF )
            // InternalSim.g:1940:2: iv_ruleSEntityTypeDeduction= ruleSEntityTypeDeduction EOF
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
    // InternalSim.g:1946:1: ruleSEntityTypeDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current] ) ;
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
            // InternalSim.g:1952:2: ( ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:1953:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:1953:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:1954:3: () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_17_0= ruleDRichText ) )? this_SComplexTypeFeatures_18= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:1954:3: ()
            // InternalSim.g:1955:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSEntityTypeDeductionAccess().getSEntityTypeDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:1961:3: ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt42=1;
                }
                break;
            case 32:
                {
                alt42=2;
                }
                break;
            case 37:
                {
                alt42=3;
                }
                break;
            case 38:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalSim.g:1962:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1962:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:1963:5: otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSEntityTypeDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:1967:5: ( (lv_root_2_0= 'root' ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==35) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSim.g:1968:6: (lv_root_2_0= 'root' )
                            {
                            // InternalSim.g:1968:6: (lv_root_2_0= 'root' )
                            // InternalSim.g:1969:7: lv_root_2_0= 'root'
                            {
                            lv_root_2_0=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSEntityTypeDeductionAccess().getEntityKeyword_1_0_2());
                      				
                    }
                    // InternalSim.g:1985:5: ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:1986:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:1986:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:1987:7: lv_deductionRule_4_0= ruleSGrabComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_1_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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
                    // InternalSim.g:2006:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2006:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:2007:5: otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSEntityTypeDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:2011:5: ( (lv_root_6_0= 'root' ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==35) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSim.g:2012:6: (lv_root_6_0= 'root' )
                            {
                            // InternalSim.g:2012:6: (lv_root_6_0= 'root' )
                            // InternalSim.g:2013:7: lv_root_6_0= 'root'
                            {
                            lv_root_6_0=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getSEntityTypeDeductionAccess().getEntityKeyword_1_1_2());
                      				
                    }
                    // InternalSim.g:2029:5: ( (lv_deductionRule_8_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:2030:6: (lv_deductionRule_8_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:2030:6: (lv_deductionRule_8_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:2031:7: lv_deductionRule_8_0= ruleSDitchComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_1_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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
                    // InternalSim.g:2050:4: (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2050:4: (otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:2051:5: otherlv_9= 'morph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getSEntityTypeDeductionAccess().getMorphKeyword_1_2_0());
                      				
                    }
                    // InternalSim.g:2055:5: ( (lv_root_10_0= 'root' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==35) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalSim.g:2056:6: (lv_root_10_0= 'root' )
                            {
                            // InternalSim.g:2056:6: (lv_root_10_0= 'root' )
                            // InternalSim.g:2057:7: lv_root_10_0= 'root'
                            {
                            lv_root_10_0=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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

                    otherlv_11=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getSEntityTypeDeductionAccess().getEntityKeyword_1_2_2());
                      				
                    }
                    // InternalSim.g:2073:5: ( (lv_deductionRule_12_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:2074:6: (lv_deductionRule_12_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:2074:6: (lv_deductionRule_12_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:2075:7: lv_deductionRule_12_0= ruleSMorphComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_1_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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
                    // InternalSim.g:2094:4: (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2094:4: (otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:2095:5: otherlv_13= 'fuse' ( (lv_root_14_0= 'root' ) )? otherlv_15= 'entity' ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) )
                    {
                    otherlv_13=(Token)match(input,38,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getSEntityTypeDeductionAccess().getFuseKeyword_1_3_0());
                      				
                    }
                    // InternalSim.g:2099:5: ( (lv_root_14_0= 'root' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==35) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSim.g:2100:6: (lv_root_14_0= 'root' )
                            {
                            // InternalSim.g:2100:6: (lv_root_14_0= 'root' )
                            // InternalSim.g:2101:7: lv_root_14_0= 'root'
                            {
                            lv_root_14_0=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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

                    otherlv_15=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getSEntityTypeDeductionAccess().getEntityKeyword_1_3_2());
                      				
                    }
                    // InternalSim.g:2117:5: ( (lv_deductionRule_16_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:2118:6: (lv_deductionRule_16_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:2118:6: (lv_deductionRule_16_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:2119:7: lv_deductionRule_16_0= ruleSFuseComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_1_3_3_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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

            // InternalSim.g:2138:3: ( (lv_description_17_0= ruleDRichText ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_PLAIN_TEXT_ONLY && LA43_0<=RULE_PLAIN_TEXT_START)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSim.g:2139:4: (lv_description_17_0= ruleDRichText )
                    {
                    // InternalSim.g:2139:4: (lv_description_17_0= ruleDRichText )
                    // InternalSim.g:2140:5: lv_description_17_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSEntityTypeDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
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
    // InternalSim.g:2172:1: entryRuleSDetailTypeDeduction returns [EObject current=null] : iv_ruleSDetailTypeDeduction= ruleSDetailTypeDeduction EOF ;
    public final EObject entryRuleSDetailTypeDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDetailTypeDeduction = null;


        try {
            // InternalSim.g:2172:61: (iv_ruleSDetailTypeDeduction= ruleSDetailTypeDeduction EOF )
            // InternalSim.g:2173:2: iv_ruleSDetailTypeDeduction= ruleSDetailTypeDeduction EOF
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
    // InternalSim.g:2179:1: ruleSDetailTypeDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current] ) ;
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
            // InternalSim.g:2185:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:2186:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:2186:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:2187:3: () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? this_SComplexTypeFeatures_14= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:2187:3: ()
            // InternalSim.g:2188:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSDetailTypeDeductionAccess().getSDetailTypeDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:2194:3: ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) ) | (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt44=1;
                }
                break;
            case 32:
                {
                alt44=2;
                }
                break;
            case 37:
                {
                alt44=3;
                }
                break;
            case 38:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSim.g:2195:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2195:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:2196:5: otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSDetailTypeDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSDetailTypeDeductionAccess().getDetailKeyword_1_0_1());
                      				
                    }
                    // InternalSim.g:2204:5: ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:2205:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:2205:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:2206:7: lv_deductionRule_3_0= ruleSGrabComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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
                    // InternalSim.g:2225:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2225:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:2226:5: otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSDetailTypeDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSDetailTypeDeductionAccess().getDetailKeyword_1_1_1());
                      				
                    }
                    // InternalSim.g:2234:5: ( (lv_deductionRule_6_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:2235:6: (lv_deductionRule_6_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:2235:6: (lv_deductionRule_6_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:2236:7: lv_deductionRule_6_0= ruleSDitchComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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
                    // InternalSim.g:2255:4: (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2255:4: (otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:2256:5: otherlv_7= 'morph' otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getSDetailTypeDeductionAccess().getMorphKeyword_1_2_0());
                      				
                    }
                    otherlv_8=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getSDetailTypeDeductionAccess().getDetailKeyword_1_2_1());
                      				
                    }
                    // InternalSim.g:2264:5: ( (lv_deductionRule_9_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:2265:6: (lv_deductionRule_9_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:2265:6: (lv_deductionRule_9_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:2266:7: lv_deductionRule_9_0= ruleSMorphComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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
                    // InternalSim.g:2285:4: (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2285:4: (otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:2286:5: otherlv_10= 'fuse' otherlv_11= 'detail' ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) )
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getSDetailTypeDeductionAccess().getFuseKeyword_1_3_0());
                      				
                    }
                    otherlv_11=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getSDetailTypeDeductionAccess().getDetailKeyword_1_3_1());
                      				
                    }
                    // InternalSim.g:2294:5: ( (lv_deductionRule_12_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:2295:6: (lv_deductionRule_12_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:2295:6: (lv_deductionRule_12_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:2296:7: lv_deductionRule_12_0= ruleSFuseComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_1_3_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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

            // InternalSim.g:2315:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_PLAIN_TEXT_ONLY && LA45_0<=RULE_PLAIN_TEXT_START)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSim.g:2316:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalSim.g:2316:4: (lv_description_13_0= ruleDRichText )
                    // InternalSim.g:2317:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSDetailTypeDeductionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
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
    // InternalSim.g:2350:1: ruleSComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2356:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}' ) )
            // InternalSim.g:2357:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}' )
            {
            // InternalSim.g:2357:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}' )
            // InternalSim.g:2358:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalSim.g:2362:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_constraints_2_0= ruleDConstraint ) ) )*
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==25||LA46_0==32||LA46_0==37||(LA46_0>=39 && LA46_0<=41)||LA46_0==55||LA46_0==100) ) {
                    alt46=1;
                }
                else if ( (LA46_0==50) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSim.g:2363:4: ( (lv_features_1_0= ruleFeature ) )
            	    {
            	    // InternalSim.g:2363:4: ( (lv_features_1_0= ruleFeature ) )
            	    // InternalSim.g:2364:5: (lv_features_1_0= ruleFeature )
            	    {
            	    // InternalSim.g:2364:5: (lv_features_1_0= ruleFeature )
            	    // InternalSim.g:2365:6: lv_features_1_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    // InternalSim.g:2383:4: ( (lv_constraints_2_0= ruleDConstraint ) )
            	    {
            	    // InternalSim.g:2383:4: ( (lv_constraints_2_0= ruleDConstraint ) )
            	    // InternalSim.g:2384:5: (lv_constraints_2_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:2384:5: (lv_constraints_2_0= ruleDConstraint )
            	    // InternalSim.g:2385:6: lv_constraints_2_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsDConstraintParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop46;
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


    // $ANTLR start "ruleDComplexType"
    // InternalSim.g:2412:1: ruleDComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' ) ;
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
            // InternalSim.g:2418:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' ) )
            // InternalSim.g:2419:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' )
            {
            // InternalSim.g:2419:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' )
            // InternalSim.g:2420:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}'
            {
            // InternalSim.g:2420:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:2421:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:2421:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:2422:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            // InternalSim.g:2438:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==34) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSim.g:2439:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDComplexTypeAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalSim.g:2443:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalSim.g:2444:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalSim.g:2444:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalSim.g:2445:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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
            	    break loop47;
                }
            } while (true);

            // InternalSim.g:2462:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==23) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSim.g:2463:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalSim.g:2467:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSim.g:2468:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSim.g:2468:5: (otherlv_4= RULE_ID )
                    // InternalSim.g:2469:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:2481:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_PLAIN_TEXT_ONLY && LA49_0<=RULE_PLAIN_TEXT_START)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSim.g:2482:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalSim.g:2482:4: (lv_description_5_0= ruleDRichText )
                    // InternalSim.g:2483:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDComplexTypeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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

            otherlv_6=(Token)match(input,28,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDComplexTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSim.g:2504:3: ( ( (lv_features_7_0= ruleFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )*
            loop50:
            do {
                int alt50=3;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID||LA50_0==25||LA50_0==32||LA50_0==37||(LA50_0>=39 && LA50_0<=41)||LA50_0==55||LA50_0==100) ) {
                    alt50=1;
                }
                else if ( (LA50_0==50) ) {
                    alt50=2;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSim.g:2505:4: ( (lv_features_7_0= ruleFeature ) )
            	    {
            	    // InternalSim.g:2505:4: ( (lv_features_7_0= ruleFeature ) )
            	    // InternalSim.g:2506:5: (lv_features_7_0= ruleFeature )
            	    {
            	    // InternalSim.g:2506:5: (lv_features_7_0= ruleFeature )
            	    // InternalSim.g:2507:6: lv_features_7_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getFeaturesFeatureParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    // InternalSim.g:2525:4: ( (lv_constraints_8_0= ruleDConstraint ) )
            	    {
            	    // InternalSim.g:2525:4: ( (lv_constraints_8_0= ruleDConstraint ) )
            	    // InternalSim.g:2526:5: (lv_constraints_8_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:2526:5: (lv_constraints_8_0= ruleDConstraint )
            	    // InternalSim.g:2527:6: lv_constraints_8_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getConstraintsDConstraintParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop50;
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
    // InternalSim.g:2553:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSim.g:2553:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSim.g:2554:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalSim.g:2560:1: ruleFeature returns [EObject current=null] : (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery ) ;
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
            // InternalSim.g:2566:2: ( (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery ) )
            // InternalSim.g:2567:2: (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery )
            {
            // InternalSim.g:2567:2: (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery )
            int alt51=6;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalSim.g:2568:3: this_SAssociationDeduction_0= ruleSAssociationDeduction
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
                    // InternalSim.g:2577:3: this_DAssociation_1= ruleDAssociation
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
                    // InternalSim.g:2586:3: this_SAttributeDeduction_2= ruleSAttributeDeduction
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
                    // InternalSim.g:2595:3: this_DAttribute_3= ruleDAttribute
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
                    // InternalSim.g:2604:3: this_SQueryDeduction_4= ruleSQueryDeduction
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
                    // InternalSim.g:2613:3: this_DQuery_5= ruleDQuery
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
    // InternalSim.g:2625:1: entryRuleSAssociationDeduction returns [EObject current=null] : iv_ruleSAssociationDeduction= ruleSAssociationDeduction EOF ;
    public final EObject entryRuleSAssociationDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAssociationDeduction = null;


        try {
            // InternalSim.g:2625:62: (iv_ruleSAssociationDeduction= ruleSAssociationDeduction EOF )
            // InternalSim.g:2626:2: iv_ruleSAssociationDeduction= ruleSAssociationDeduction EOF
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
    // InternalSim.g:2632:1: ruleSAssociationDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) ;
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
            // InternalSim.g:2638:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalSim.g:2639:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalSim.g:2639:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalSim.g:2640:3: () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalSim.g:2640:3: ()
            // InternalSim.g:2641:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSAssociationDeductionAccess().getSAssociationDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:2647:3: ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt55=1;
                }
                break;
            case 37:
                {
                alt55=2;
                }
                break;
            case 32:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalSim.g:2648:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2648:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2649:5: otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSAssociationDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:2653:5: (otherlv_2= 'reference' | otherlv_3= 'composite' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==40) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==41) ) {
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
                            // InternalSim.g:2654:6: otherlv_2= 'reference'
                            {
                            otherlv_2=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSAssociationDeductionAccess().getReferenceKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2659:6: otherlv_3= 'composite'
                            {
                            otherlv_3=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getSAssociationDeductionAccess().getCompositeKeyword_1_0_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalSim.g:2664:5: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2665:6: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2665:6: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2666:7: lv_deductionRule_4_0= ruleSGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAssociationDeductionAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalSim.g:2685:4: (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2685:4: (otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2686:5: otherlv_5= 'morph' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSAssociationDeductionAccess().getMorphKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:2690:5: (otherlv_6= 'reference' | otherlv_7= 'composite' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==40) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==41) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalSim.g:2691:6: otherlv_6= 'reference'
                            {
                            otherlv_6=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getSAssociationDeductionAccess().getReferenceKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2696:6: otherlv_7= 'composite'
                            {
                            otherlv_7=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getSAssociationDeductionAccess().getCompositeKeyword_1_1_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalSim.g:2701:5: ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2702:6: (lv_deductionRule_8_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2702:6: (lv_deductionRule_8_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2703:7: lv_deductionRule_8_0= ruleSMorphFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAssociationDeductionAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalSim.g:2722:4: (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2722:4: (otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2723:5: otherlv_9= 'ditch' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getSAssociationDeductionAccess().getDitchKeyword_1_2_0());
                      				
                    }
                    // InternalSim.g:2727:5: (otherlv_10= 'reference' | otherlv_11= 'composite' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==40) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==41) ) {
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
                            // InternalSim.g:2728:6: otherlv_10= 'reference'
                            {
                            otherlv_10=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getSAssociationDeductionAccess().getReferenceKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2733:6: otherlv_11= 'composite'
                            {
                            otherlv_11=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_11, grammarAccess.getSAssociationDeductionAccess().getCompositeKeyword_1_2_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalSim.g:2738:5: ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2739:6: (lv_deductionRule_12_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2739:6: (lv_deductionRule_12_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2740:7: lv_deductionRule_12_0= ruleSDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAssociationDeductionAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalSim.g:2759:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_PLAIN_TEXT_ONLY && LA56_0<=RULE_PLAIN_TEXT_START)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSim.g:2760:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalSim.g:2760:4: (lv_description_13_0= ruleDRichText )
                    // InternalSim.g:2761:5: lv_description_13_0= ruleDRichText
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
    // InternalSim.g:2782:1: entryRuleSAttributeDeduction returns [EObject current=null] : iv_ruleSAttributeDeduction= ruleSAttributeDeduction EOF ;
    public final EObject entryRuleSAttributeDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttributeDeduction = null;


        try {
            // InternalSim.g:2782:60: (iv_ruleSAttributeDeduction= ruleSAttributeDeduction EOF )
            // InternalSim.g:2783:2: iv_ruleSAttributeDeduction= ruleSAttributeDeduction EOF
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
    // InternalSim.g:2789:1: ruleSAttributeDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) ;
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
            // InternalSim.g:2795:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalSim.g:2796:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalSim.g:2796:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalSim.g:2797:3: () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalSim.g:2797:3: ()
            // InternalSim.g:2798:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSAttributeDeductionAccess().getSAttributeDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:2804:3: ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) ) | (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) ) )
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
            case 32:
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
                    // InternalSim.g:2805:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2805:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2806:5: otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSAttributeDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:2810:5: (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )?
                    int alt57=3;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==42) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==39) ) {
                        alt57=2;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalSim.g:2811:6: otherlv_2= 'attribute'
                            {
                            otherlv_2=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSAttributeDeductionAccess().getAttributeKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2816:6: ( (lv_detail_3_0= 'detail' ) )
                            {
                            // InternalSim.g:2816:6: ( (lv_detail_3_0= 'detail' ) )
                            // InternalSim.g:2817:7: (lv_detail_3_0= 'detail' )
                            {
                            // InternalSim.g:2817:7: (lv_detail_3_0= 'detail' )
                            // InternalSim.g:2818:8: lv_detail_3_0= 'detail'
                            {
                            lv_detail_3_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
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

                    // InternalSim.g:2831:5: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2832:6: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2832:6: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2833:7: lv_deductionRule_4_0= ruleSGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAttributeDeductionAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalSim.g:2852:4: (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2852:4: (otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2853:5: otherlv_5= 'morph' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSAttributeDeductionAccess().getMorphKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:2857:5: (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )?
                    int alt58=3;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==42) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==39) ) {
                        alt58=2;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalSim.g:2858:6: otherlv_6= 'attribute'
                            {
                            otherlv_6=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getSAttributeDeductionAccess().getAttributeKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2863:6: ( (lv_detail_7_0= 'detail' ) )
                            {
                            // InternalSim.g:2863:6: ( (lv_detail_7_0= 'detail' ) )
                            // InternalSim.g:2864:7: (lv_detail_7_0= 'detail' )
                            {
                            // InternalSim.g:2864:7: (lv_detail_7_0= 'detail' )
                            // InternalSim.g:2865:8: lv_detail_7_0= 'detail'
                            {
                            lv_detail_7_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
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

                    // InternalSim.g:2878:5: ( (lv_deductionRule_8_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2879:6: (lv_deductionRule_8_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2879:6: (lv_deductionRule_8_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2880:7: lv_deductionRule_8_0= ruleSMorphFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAttributeDeductionAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalSim.g:2899:4: (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2899:4: (otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2900:5: otherlv_9= 'ditch' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getSAttributeDeductionAccess().getDitchKeyword_1_2_0());
                      				
                    }
                    // InternalSim.g:2904:5: (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )?
                    int alt59=3;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==42) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==39) ) {
                        alt59=2;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalSim.g:2905:6: otherlv_10= 'attribute'
                            {
                            otherlv_10=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getSAttributeDeductionAccess().getAttributeKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2910:6: ( (lv_detail_11_0= 'detail' ) )
                            {
                            // InternalSim.g:2910:6: ( (lv_detail_11_0= 'detail' ) )
                            // InternalSim.g:2911:7: (lv_detail_11_0= 'detail' )
                            {
                            // InternalSim.g:2911:7: (lv_detail_11_0= 'detail' )
                            // InternalSim.g:2912:8: lv_detail_11_0= 'detail'
                            {
                            lv_detail_11_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
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

                    // InternalSim.g:2925:5: ( (lv_deductionRule_12_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2926:6: (lv_deductionRule_12_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2926:6: (lv_deductionRule_12_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2927:7: lv_deductionRule_12_0= ruleSDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAttributeDeductionAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalSim.g:2946:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_PLAIN_TEXT_ONLY && LA61_0<=RULE_PLAIN_TEXT_START)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSim.g:2947:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalSim.g:2947:4: (lv_description_13_0= ruleDRichText )
                    // InternalSim.g:2948:5: lv_description_13_0= ruleDRichText
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
    // InternalSim.g:2969:1: entryRuleSQueryDeduction returns [EObject current=null] : iv_ruleSQueryDeduction= ruleSQueryDeduction EOF ;
    public final EObject entryRuleSQueryDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryDeduction = null;


        try {
            // InternalSim.g:2969:56: (iv_ruleSQueryDeduction= ruleSQueryDeduction EOF )
            // InternalSim.g:2970:2: iv_ruleSQueryDeduction= ruleSQueryDeduction EOF
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
    // InternalSim.g:2976:1: ruleSQueryDeduction returns [EObject current=null] : ( () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )? ) ;
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
            // InternalSim.g:2982:2: ( ( () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )? ) )
            // InternalSim.g:2983:2: ( () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )? )
            {
            // InternalSim.g:2983:2: ( () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )? )
            // InternalSim.g:2984:3: () ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_16_0= ruleDRichText ) )?
            {
            // InternalSim.g:2984:3: ()
            // InternalSim.g:2985:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSQueryDeductionAccess().getSQueryDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:2991:3: ( ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' ) | (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==25||LA66_0==37) ) {
                alt66=1;
            }
            else if ( (LA66_0==32) ) {
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
                    // InternalSim.g:2992:4: ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' )
                    {
                    // InternalSim.g:2992:4: ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')' )
                    // InternalSim.g:2993:5: ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) ) otherlv_7= '(' (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? ) otherlv_12= ')'
                    {
                    // InternalSim.g:2993:5: ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) ) )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==25) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==37) ) {
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
                            // InternalSim.g:2994:6: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            {
                            // InternalSim.g:2994:6: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            // InternalSim.g:2995:7: otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            {
                            otherlv_1=(Token)match(input,25,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_1, grammarAccess.getSQueryDeductionAccess().getGrabKeyword_1_0_0_0_0());
                              						
                            }
                            otherlv_2=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getSQueryDeductionAccess().getQueryKeyword_1_0_0_0_1());
                              						
                            }
                            // InternalSim.g:3003:7: ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            // InternalSim.g:3004:8: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            {
                            // InternalSim.g:3004:8: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            // InternalSim.g:3005:9: lv_deductionRule_3_0= ruleSGrabFeatureRule
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSQueryDeductionAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_1_0_0_0_2_0());
                              								
                            }
                            pushFollow(FOLLOW_41);
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
                            // InternalSim.g:3024:6: (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) )
                            {
                            // InternalSim.g:3024:6: (otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) ) )
                            // InternalSim.g:3025:7: otherlv_4= 'morph' otherlv_5= 'query' ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) )
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getSQueryDeductionAccess().getMorphKeyword_1_0_0_1_0());
                              						
                            }
                            otherlv_5=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_5, grammarAccess.getSQueryDeductionAccess().getQueryKeyword_1_0_0_1_1());
                              						
                            }
                            // InternalSim.g:3033:7: ( (lv_deductionRule_6_0= ruleSMorphFeatureRule ) )
                            // InternalSim.g:3034:8: (lv_deductionRule_6_0= ruleSMorphFeatureRule )
                            {
                            // InternalSim.g:3034:8: (lv_deductionRule_6_0= ruleSMorphFeatureRule )
                            // InternalSim.g:3035:9: lv_deductionRule_6_0= ruleSMorphFeatureRule
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getSQueryDeductionAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_0_0_1_2_0());
                              								
                            }
                            pushFollow(FOLLOW_41);
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

                    otherlv_7=(Token)match(input,44,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getSQueryDeductionAccess().getLeftParenthesisKeyword_1_0_1());
                      				
                    }
                    // InternalSim.g:3058:5: (otherlv_8= '*' | ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )? )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==45) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==RULE_ID||LA65_0==25||LA65_0==32||LA65_0==37||LA65_0==46) ) {
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
                            // InternalSim.g:3059:6: otherlv_8= '*'
                            {
                            otherlv_8=(Token)match(input,45,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getSQueryDeductionAccess().getAsteriskKeyword_1_0_2_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:3064:6: ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )?
                            {
                            // InternalSim.g:3064:6: ( ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )* )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==RULE_ID||LA64_0==25||LA64_0==32||LA64_0==37) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // InternalSim.g:3065:7: ( (lv_parameters_9_0= ruleQueryParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )*
                                    {
                                    // InternalSim.g:3065:7: ( (lv_parameters_9_0= ruleQueryParameter ) )
                                    // InternalSim.g:3066:8: (lv_parameters_9_0= ruleQueryParameter )
                                    {
                                    // InternalSim.g:3066:8: (lv_parameters_9_0= ruleQueryParameter )
                                    // InternalSim.g:3067:9: lv_parameters_9_0= ruleQueryParameter
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSQueryDeductionAccess().getParametersQueryParameterParserRuleCall_1_0_2_1_0_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_44);
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

                                    // InternalSim.g:3084:7: (otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) ) )*
                                    loop63:
                                    do {
                                        int alt63=2;
                                        int LA63_0 = input.LA(1);

                                        if ( (LA63_0==33) ) {
                                            alt63=1;
                                        }


                                        switch (alt63) {
                                    	case 1 :
                                    	    // InternalSim.g:3085:8: otherlv_10= ',' ( (lv_parameters_11_0= ruleQueryParameter ) )
                                    	    {
                                    	    otherlv_10=(Token)match(input,33,FOLLOW_45); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      								newLeafNode(otherlv_10, grammarAccess.getSQueryDeductionAccess().getCommaKeyword_1_0_2_1_1_0());
                                    	      							
                                    	    }
                                    	    // InternalSim.g:3089:8: ( (lv_parameters_11_0= ruleQueryParameter ) )
                                    	    // InternalSim.g:3090:9: (lv_parameters_11_0= ruleQueryParameter )
                                    	    {
                                    	    // InternalSim.g:3090:9: (lv_parameters_11_0= ruleQueryParameter )
                                    	    // InternalSim.g:3091:10: lv_parameters_11_0= ruleQueryParameter
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      										newCompositeNode(grammarAccess.getSQueryDeductionAccess().getParametersQueryParameterParserRuleCall_1_0_2_1_1_1_0());
                                    	      									
                                    	    }
                                    	    pushFollow(FOLLOW_44);
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
                                    	    break loop63;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,46,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getSQueryDeductionAccess().getRightParenthesisKeyword_1_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3117:4: (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3117:4: (otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3118:5: otherlv_13= 'ditch' otherlv_14= 'query' ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_13=(Token)match(input,32,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getSQueryDeductionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_14=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_14, grammarAccess.getSQueryDeductionAccess().getQueryKeyword_1_1_1());
                      				
                    }
                    // InternalSim.g:3126:5: ( (lv_deductionRule_15_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3127:6: (lv_deductionRule_15_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3127:6: (lv_deductionRule_15_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3128:7: lv_deductionRule_15_0= ruleSDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSQueryDeductionAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalSim.g:3147:3: ( (lv_description_16_0= ruleDRichText ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_PLAIN_TEXT_ONLY && LA67_0<=RULE_PLAIN_TEXT_START)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSim.g:3148:4: (lv_description_16_0= ruleDRichText )
                    {
                    // InternalSim.g:3148:4: (lv_description_16_0= ruleDRichText )
                    // InternalSim.g:3149:5: lv_description_16_0= ruleDRichText
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
    // InternalSim.g:3170:1: entryRuleDQuery returns [EObject current=null] : iv_ruleDQuery= ruleDQuery EOF ;
    public final EObject entryRuleDQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQuery = null;


        try {
            // InternalSim.g:3170:47: (iv_ruleDQuery= ruleDQuery EOF )
            // InternalSim.g:3171:2: iv_ruleDQuery= ruleDQuery EOF
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
    // InternalSim.g:3177:1: ruleDQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) ;
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
            // InternalSim.g:3183:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalSim.g:3184:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalSim.g:3184:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalSim.g:3185:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalSim.g:3185:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:3186:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:3186:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:3187:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
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

            // InternalSim.g:3203:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==34) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSim.g:3204:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDQueryAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalSim.g:3208:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalSim.g:3209:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalSim.g:3209:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalSim.g:3210:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
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
            	    break loop68;
                }
            } while (true);

            otherlv_3=(Token)match(input,44,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDQueryAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSim.g:3231:3: ( ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID||LA70_0==25||LA70_0==32||LA70_0==37) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSim.g:3232:4: ( (lv_parameters_4_0= ruleQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )*
                    {
                    // InternalSim.g:3232:4: ( (lv_parameters_4_0= ruleQueryParameter ) )
                    // InternalSim.g:3233:5: (lv_parameters_4_0= ruleQueryParameter )
                    {
                    // InternalSim.g:3233:5: (lv_parameters_4_0= ruleQueryParameter )
                    // InternalSim.g:3234:6: lv_parameters_4_0= ruleQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getParametersQueryParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalSim.g:3251:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==33) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalSim.g:3252:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleQueryParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDQueryAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:3256:5: ( (lv_parameters_6_0= ruleQueryParameter ) )
                    	    // InternalSim.g:3257:6: (lv_parameters_6_0= ruleQueryParameter )
                    	    {
                    	    // InternalSim.g:3257:6: (lv_parameters_6_0= ruleQueryParameter )
                    	    // InternalSim.g:3258:7: lv_parameters_6_0= ruleQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDQueryAccess().getParametersQueryParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDQueryAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDQueryAccess().getColonKeyword_5());
              		
            }
            // InternalSim.g:3285:3: ( (otherlv_9= RULE_ID ) )
            // InternalSim.g:3286:4: (otherlv_9= RULE_ID )
            {
            // InternalSim.g:3286:4: (otherlv_9= RULE_ID )
            // InternalSim.g:3287:5: otherlv_9= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryRule());
              					}
              				
            }
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_9, grammarAccess.getDQueryAccess().getTypeDTypeCrossReference_6_0());
              				
            }

            }


            }

            // InternalSim.g:3298:3: ( (lv_multiplicity_10_0= ruleDMultiplicity ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==44) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSim.g:3299:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:3299:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    // InternalSim.g:3300:5: lv_multiplicity_10_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getMultiplicityDMultiplicityParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_49);
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

            // InternalSim.g:3317:3: (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==47) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSim.g:3318:4: otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) )
                    {
                    otherlv_11=(Token)match(input,47,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDQueryAccess().getReturnsKeyword_8_0());
                      			
                    }
                    // InternalSim.g:3322:4: ( (lv_returns_12_0= ruleDExpression ) )
                    // InternalSim.g:3323:5: (lv_returns_12_0= ruleDExpression )
                    {
                    // InternalSim.g:3323:5: (lv_returns_12_0= ruleDExpression )
                    // InternalSim.g:3324:6: lv_returns_12_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getReturnsDExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalSim.g:3342:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_PLAIN_TEXT_ONLY && LA73_0<=RULE_PLAIN_TEXT_START)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSim.g:3343:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalSim.g:3343:4: (lv_description_13_0= ruleDRichText )
                    // InternalSim.g:3344:5: lv_description_13_0= ruleDRichText
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
    // InternalSim.g:3365:1: entryRuleQueryParameter returns [EObject current=null] : iv_ruleQueryParameter= ruleQueryParameter EOF ;
    public final EObject entryRuleQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryParameter = null;


        try {
            // InternalSim.g:3365:55: (iv_ruleQueryParameter= ruleQueryParameter EOF )
            // InternalSim.g:3366:2: iv_ruleQueryParameter= ruleQueryParameter EOF
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
    // InternalSim.g:3372:1: ruleQueryParameter returns [EObject current=null] : (this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction | this_DQueryParameter_1= ruleDQueryParameter ) ;
    public final EObject ruleQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject this_SQueryParameterDeduction_0 = null;

        EObject this_DQueryParameter_1 = null;



        	enterRule();

        try {
            // InternalSim.g:3378:2: ( (this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction | this_DQueryParameter_1= ruleDQueryParameter ) )
            // InternalSim.g:3379:2: (this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction | this_DQueryParameter_1= ruleDQueryParameter )
            {
            // InternalSim.g:3379:2: (this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction | this_DQueryParameter_1= ruleDQueryParameter )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==25||LA74_0==32||LA74_0==37) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
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
                    // InternalSim.g:3380:3: this_SQueryParameterDeduction_0= ruleSQueryParameterDeduction
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
                    // InternalSim.g:3389:3: this_DQueryParameter_1= ruleDQueryParameter
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
    // InternalSim.g:3401:1: entryRuleSQueryParameterDeduction returns [EObject current=null] : iv_ruleSQueryParameterDeduction= ruleSQueryParameterDeduction EOF ;
    public final EObject entryRuleSQueryParameterDeduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryParameterDeduction = null;


        try {
            // InternalSim.g:3401:65: (iv_ruleSQueryParameterDeduction= ruleSQueryParameterDeduction EOF )
            // InternalSim.g:3402:2: iv_ruleSQueryParameterDeduction= ruleSQueryParameterDeduction EOF
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
    // InternalSim.g:3408:1: ruleSQueryParameterDeduction returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? ) ;
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
            // InternalSim.g:3414:2: ( ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? ) )
            // InternalSim.g:3415:2: ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            {
            // InternalSim.g:3415:2: ( () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            // InternalSim.g:3416:3: () ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )?
            {
            // InternalSim.g:3416:3: ()
            // InternalSim.g:3417:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSQueryParameterDeductionAccess().getSQueryParameterDeductionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:3423:3: ( (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) ) | (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt75=1;
                }
                break;
            case 37:
                {
                alt75=2;
                }
                break;
            case 32:
                {
                alt75=3;
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
                    // InternalSim.g:3424:4: (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:3424:4: (otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:3425:5: otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSQueryParameterDeductionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalSim.g:3429:5: ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:3430:6: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:3430:6: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    // InternalSim.g:3431:7: lv_deductionRule_2_0= ruleSGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSQueryParameterDeductionAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalSim.g:3450:4: (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:3450:4: (otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:3451:5: otherlv_3= 'morph' ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSQueryParameterDeductionAccess().getMorphKeyword_1_1_0());
                      				
                    }
                    // InternalSim.g:3455:5: ( (lv_deductionRule_4_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:3456:6: (lv_deductionRule_4_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:3456:6: (lv_deductionRule_4_0= ruleSMorphFeatureRule )
                    // InternalSim.g:3457:7: lv_deductionRule_4_0= ruleSMorphFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSQueryParameterDeductionAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalSim.g:3476:4: (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3476:4: (otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3477:5: otherlv_5= 'ditch' ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSQueryParameterDeductionAccess().getDitchKeyword_1_2_0());
                      				
                    }
                    // InternalSim.g:3481:5: ( (lv_deductionRule_6_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3482:6: (lv_deductionRule_6_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3482:6: (lv_deductionRule_6_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3483:7: lv_deductionRule_6_0= ruleSDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSQueryParameterDeductionAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalSim.g:3502:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_PLAIN_TEXT_ONLY && LA76_0<=RULE_PLAIN_TEXT_START)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalSim.g:3503:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalSim.g:3503:4: (lv_description_7_0= ruleDRichText )
                    // InternalSim.g:3504:5: lv_description_7_0= ruleDRichText
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


    // $ANTLR start "entryRuleDImport"
    // InternalSim.g:3525:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalSim.g:3525:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalSim.g:3526:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalSim.g:3532:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3538:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalSim.g:3539:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalSim.g:3539:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalSim.g:3540:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalSim.g:3544:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalSim.g:3545:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalSim.g:3545:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalSim.g:3546:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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


    // $ANTLR start "entryRuleDFunction"
    // InternalSim.g:3567:1: entryRuleDFunction returns [EObject current=null] : iv_ruleDFunction= ruleDFunction EOF ;
    public final EObject entryRuleDFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunction = null;


        try {
            // InternalSim.g:3567:50: (iv_ruleDFunction= ruleDFunction EOF )
            // InternalSim.g:3568:2: iv_ruleDFunction= ruleDFunction EOF
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
    // InternalSim.g:3574:1: ruleDFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleDFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_multiplicity_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3580:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ) )
            // InternalSim.g:3581:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? )
            {
            // InternalSim.g:3581:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? )
            // InternalSim.g:3582:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalSim.g:3586:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:3587:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:3587:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:3588:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,44,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDFunctionAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDFunctionAccess().getColonKeyword_4());
              		
            }
            // InternalSim.g:3616:3: ( (otherlv_5= RULE_ID ) )
            // InternalSim.g:3617:4: (otherlv_5= RULE_ID )
            {
            // InternalSim.g:3617:4: (otherlv_5= RULE_ID )
            // InternalSim.g:3618:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getDFunctionAccess().getTypeDTypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalSim.g:3629:3: ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==44) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSim.g:3630:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:3630:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    // InternalSim.g:3631:5: lv_multiplicity_6_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDFunctionAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_6_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDFunctionRule());
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleDType"
    // InternalSim.g:3652:1: entryRuleDType returns [EObject current=null] : iv_ruleDType= ruleDType EOF ;
    public final EObject entryRuleDType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDType = null;


        try {
            // InternalSim.g:3652:46: (iv_ruleDType= ruleDType EOF )
            // InternalSim.g:3653:2: iv_ruleDType= ruleDType EOF
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
    // InternalSim.g:3659:1: ruleDType returns [EObject current=null] : (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DEntityType_3= ruleDEntityType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType ) ;
    public final EObject ruleDType() throws RecognitionException {
        EObject current = null;

        EObject this_DPrimitive_0 = null;

        EObject this_DPrimitiveArchetype_1 = null;

        EObject this_DEnumeration_2 = null;

        EObject this_DEntityType_3 = null;

        EObject this_DRelationship_4 = null;

        EObject this_DDetailType_5 = null;



        	enterRule();

        try {
            // InternalSim.g:3665:2: ( (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DEntityType_3= ruleDEntityType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType ) )
            // InternalSim.g:3666:2: (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DEntityType_3= ruleDEntityType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType )
            {
            // InternalSim.g:3666:2: (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DEntityType_3= ruleDEntityType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType )
            int alt78=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt78=1;
                }
                break;
            case 52:
                {
                alt78=2;
                }
                break;
            case 31:
                {
                alt78=3;
                }
                break;
            case 53:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA78_5 = input.LA(3);

                    if ( (LA78_5==36) ) {
                        alt78=4;
                    }
                    else if ( (LA78_5==54) ) {
                        alt78=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                    {
                    alt78=4;
                    }
                    break;
                case 54:
                    {
                    alt78=5;
                    }
                    break;
                case 39:
                    {
                    alt78=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 4, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                int LA78_5 = input.LA(2);

                if ( (LA78_5==36) ) {
                    alt78=4;
                }
                else if ( (LA78_5==54) ) {
                    alt78=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 5, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt78=4;
                }
                break;
            case 54:
                {
                alt78=5;
                }
                break;
            case 39:
                {
                alt78=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalSim.g:3667:3: this_DPrimitive_0= ruleDPrimitive
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
                    // InternalSim.g:3676:3: this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDPrimitiveArchetypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DPrimitiveArchetype_1=ruleDPrimitiveArchetype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DPrimitiveArchetype_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSim.g:3685:3: this_DEnumeration_2= ruleDEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDEnumerationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEnumeration_2=ruleDEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEnumeration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSim.g:3694:3: this_DEntityType_3= ruleDEntityType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDEntityTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEntityType_3=ruleDEntityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEntityType_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSim.g:3703:3: this_DRelationship_4= ruleDRelationship
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDRelationshipParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRelationship_4=ruleDRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRelationship_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSim.g:3712:3: this_DDetailType_5= ruleDDetailType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDDetailTypeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDetailType_5=ruleDDetailType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDetailType_5;
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
    // InternalSim.g:3724:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalSim.g:3724:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalSim.g:3725:2: iv_ruleDConstraint= ruleDConstraint EOF
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
    // InternalSim.g:3731:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) ;
    public final EObject ruleDConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        EObject lv_condition_5_0 = null;

        EObject lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3737:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalSim.g:3738:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalSim.g:3738:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalSim.g:3739:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalSim.g:3743:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:3744:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:3744:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:3745:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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

            // InternalSim.g:3761:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==34) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalSim.g:3762:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:3766:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:3767:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:3767:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:3768:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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
            	    break loop79;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalSim.g:3789:3: ( (lv_condition_5_0= ruleDExpression ) )
            // InternalSim.g:3790:4: (lv_condition_5_0= ruleDExpression )
            {
            // InternalSim.g:3790:4: (lv_condition_5_0= ruleDExpression )
            // InternalSim.g:3791:5: lv_condition_5_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getConditionDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_condition_5_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDConstraintRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_5_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:3808:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_PLAIN_TEXT_ONLY && LA80_0<=RULE_PLAIN_TEXT_START)) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSim.g:3809:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalSim.g:3809:4: (lv_description_6_0= ruleDRichText )
                    // InternalSim.g:3810:5: lv_description_6_0= ruleDRichText
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
    // InternalSim.g:3831:1: entryRuleDPrimitive returns [EObject current=null] : iv_ruleDPrimitive= ruleDPrimitive EOF ;
    public final EObject entryRuleDPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimitive = null;


        try {
            // InternalSim.g:3831:51: (iv_ruleDPrimitive= ruleDPrimitive EOF )
            // InternalSim.g:3832:2: iv_ruleDPrimitive= ruleDPrimitive EOF
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
    // InternalSim.g:3838:1: ruleDPrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}' ) ;
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
            // InternalSim.g:3844:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}' ) )
            // InternalSim.g:3845:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}' )
            {
            // InternalSim.g:3845:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}' )
            // InternalSim.g:3846:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDPrimitiveAccess().getPrimitiveKeyword_0());
              		
            }
            // InternalSim.g:3850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:3851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:3851:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:3852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
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

            // InternalSim.g:3868:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==34) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalSim.g:3869:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDPrimitiveAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:3873:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:3874:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:3874:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:3875:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
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
            	    break loop81;
                }
            } while (true);

            otherlv_4=(Token)match(input,51,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDPrimitiveAccess().getRedefinesKeyword_3());
              		
            }
            // InternalSim.g:3896:3: ( (otherlv_5= RULE_ID ) )
            // InternalSim.g:3897:4: (otherlv_5= RULE_ID )
            {
            // InternalSim.g:3897:4: (otherlv_5= RULE_ID )
            // InternalSim.g:3898:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDPrimitiveRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getDPrimitiveAccess().getRedefinesDPrimitiveCrossReference_4_0());
              				
            }

            }


            }

            // InternalSim.g:3909:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_PLAIN_TEXT_ONLY && LA82_0<=RULE_PLAIN_TEXT_START)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSim.g:3910:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalSim.g:3910:4: (lv_description_6_0= ruleDRichText )
                    // InternalSim.g:3911:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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

            otherlv_7=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDPrimitiveAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalSim.g:3932:3: ( (lv_constraints_8_0= ruleDConstraint ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==50) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalSim.g:3933:4: (lv_constraints_8_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:3933:4: (lv_constraints_8_0= ruleDConstraint )
            	    // InternalSim.g:3934:5: lv_constraints_8_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getConstraintsDConstraintParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop83;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDPrimitiveAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleDPrimitiveArchetype"
    // InternalSim.g:3959:1: entryRuleDPrimitiveArchetype returns [EObject current=null] : iv_ruleDPrimitiveArchetype= ruleDPrimitiveArchetype EOF ;
    public final EObject entryRuleDPrimitiveArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimitiveArchetype = null;


        try {
            // InternalSim.g:3959:60: (iv_ruleDPrimitiveArchetype= ruleDPrimitiveArchetype EOF )
            // InternalSim.g:3960:2: iv_ruleDPrimitiveArchetype= ruleDPrimitiveArchetype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDPrimitiveArchetypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDPrimitiveArchetype=ruleDPrimitiveArchetype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDPrimitiveArchetype; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDPrimitiveArchetype"


    // $ANTLR start "ruleDPrimitiveArchetype"
    // InternalSim.g:3966:1: ruleDPrimitiveArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) ;
    public final EObject ruleDPrimitiveArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_description_4_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3972:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) )
            // InternalSim.g:3973:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            {
            // InternalSim.g:3973:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            // InternalSim.g:3974:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDPrimitiveArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalSim.g:3978:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:3979:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:3979:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:3980:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDPrimitiveArchetypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDPrimitiveArchetypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalSim.g:3996:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==34) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalSim.g:3997:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDPrimitiveArchetypeAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalSim.g:4001:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:4002:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:4002:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:4003:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDPrimitiveArchetypeAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDPrimitiveArchetypeRule());
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
            	    break loop84;
                }
            } while (true);

            // InternalSim.g:4020:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_PLAIN_TEXT_ONLY && LA85_0<=RULE_PLAIN_TEXT_START)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSim.g:4021:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:4021:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:4022:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDPrimitiveArchetypeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDPrimitiveArchetypeRule());
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

            otherlv_5=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDPrimitiveArchetypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSim.g:4043:3: ( (lv_constraints_6_0= ruleDConstraint ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==50) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalSim.g:4044:4: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalSim.g:4044:4: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalSim.g:4045:5: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDPrimitiveArchetypeAccess().getConstraintsDConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_constraints_6_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDPrimitiveArchetypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_6_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDPrimitiveArchetypeAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDPrimitiveArchetype"


    // $ANTLR start "entryRuleDLiteral"
    // InternalSim.g:4070:1: entryRuleDLiteral returns [EObject current=null] : iv_ruleDLiteral= ruleDLiteral EOF ;
    public final EObject entryRuleDLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteral = null;


        try {
            // InternalSim.g:4070:49: (iv_ruleDLiteral= ruleDLiteral EOF )
            // InternalSim.g:4071:2: iv_ruleDLiteral= ruleDLiteral EOF
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
    // InternalSim.g:4077:1: ruleDLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? ) ;
    public final EObject ruleDLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4083:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? ) )
            // InternalSim.g:4084:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? )
            {
            // InternalSim.g:4084:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? )
            // InternalSim.g:4085:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )?
            {
            // InternalSim.g:4085:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:4086:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:4086:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:4087:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
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

            // InternalSim.g:4103:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==34) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalSim.g:4104:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDLiteralAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalSim.g:4108:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalSim.g:4109:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalSim.g:4109:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalSim.g:4110:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
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
            	    break loop87;
                }
            } while (true);

            // InternalSim.g:4127:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=RULE_PLAIN_TEXT_ONLY && LA88_0<=RULE_PLAIN_TEXT_START)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalSim.g:4128:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalSim.g:4128:4: (lv_description_3_0= ruleDRichText )
                    // InternalSim.g:4129:5: lv_description_3_0= ruleDRichText
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


    // $ANTLR start "entryRuleDEntityType"
    // InternalSim.g:4150:1: entryRuleDEntityType returns [EObject current=null] : iv_ruleDEntityType= ruleDEntityType EOF ;
    public final EObject entryRuleDEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEntityType = null;


        try {
            // InternalSim.g:4150:52: (iv_ruleDEntityType= ruleDEntityType EOF )
            // InternalSim.g:4151:2: iv_ruleDEntityType= ruleDEntityType EOF
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
    // InternalSim.g:4157:1: ruleDEntityType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] ) ;
    public final EObject ruleDEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_root_1_0=null;
        Token otherlv_2=null;
        EObject this_DComplexType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:4163:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] ) )
            // InternalSim.g:4164:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] )
            {
            // InternalSim.g:4164:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] )
            // InternalSim.g:4165:3: ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current]
            {
            // InternalSim.g:4165:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==53) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSim.g:4166:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalSim.g:4166:4: (lv_abstract_0_0= 'abstract' )
                    // InternalSim.g:4167:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,53,FOLLOW_33); if (state.failed) return current;
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

            // InternalSim.g:4179:3: ( (lv_root_1_0= 'root' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==35) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSim.g:4180:4: (lv_root_1_0= 'root' )
                    {
                    // InternalSim.g:4180:4: (lv_root_1_0= 'root' )
                    // InternalSim.g:4181:5: lv_root_1_0= 'root'
                    {
                    lv_root_1_0=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDRelationship"
    // InternalSim.g:4212:1: entryRuleDRelationship returns [EObject current=null] : iv_ruleDRelationship= ruleDRelationship EOF ;
    public final EObject entryRuleDRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationship = null;


        try {
            // InternalSim.g:4212:54: (iv_ruleDRelationship= ruleDRelationship EOF )
            // InternalSim.g:4213:2: iv_ruleDRelationship= ruleDRelationship EOF
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
    // InternalSim.g:4219:1: ruleDRelationship returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current] ) ;
    public final EObject ruleDRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_root_1_0=null;
        Token otherlv_2=null;
        EObject this_DComplexType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:4225:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current] ) )
            // InternalSim.g:4226:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current] )
            {
            // InternalSim.g:4226:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current] )
            // InternalSim.g:4227:3: ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current]
            {
            // InternalSim.g:4227:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==53) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalSim.g:4228:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalSim.g:4228:4: (lv_abstract_0_0= 'abstract' )
                    // InternalSim.g:4229:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,53,FOLLOW_54); if (state.failed) return current;
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

            // InternalSim.g:4241:3: ( (lv_root_1_0= 'root' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==35) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSim.g:4242:4: (lv_root_1_0= 'root' )
                    {
                    // InternalSim.g:4242:4: (lv_root_1_0= 'root' )
                    // InternalSim.g:4243:5: lv_root_1_0= 'root'
                    {
                    lv_root_1_0=(Token)match(input,35,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_root_1_0, grammarAccess.getDRelationshipAccess().getRootRootKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDRelationshipRule());
                      					}
                      					setWithLastConsumed(current, "root", true, "root");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,54,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDRelationshipAccess().getRelationshipKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDRelationshipRule());
              			}
              			newCompositeNode(grammarAccess.getDRelationshipAccess().getDComplexTypeParserRuleCall_3());
              		
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
    // $ANTLR end "ruleDRelationship"


    // $ANTLR start "entryRuleDDetailType"
    // InternalSim.g:4274:1: entryRuleDDetailType returns [EObject current=null] : iv_ruleDDetailType= ruleDDetailType EOF ;
    public final EObject entryRuleDDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDetailType = null;


        try {
            // InternalSim.g:4274:52: (iv_ruleDDetailType= ruleDDetailType EOF )
            // InternalSim.g:4275:2: iv_ruleDDetailType= ruleDDetailType EOF
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
    // InternalSim.g:4281:1: ruleDDetailType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDDetailType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalSim.g:4287:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalSim.g:4288:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalSim.g:4288:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalSim.g:4289:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalSim.g:4289:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==53) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSim.g:4290:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalSim.g:4290:4: (lv_abstract_0_0= 'abstract' )
                    // InternalSim.g:4291:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,53,FOLLOW_35); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
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
    // InternalSim.g:4322:1: entryRuleDAssociation returns [EObject current=null] : iv_ruleDAssociation= ruleDAssociation EOF ;
    public final EObject entryRuleDAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssociation = null;


        try {
            // InternalSim.g:4322:53: (iv_ruleDAssociation= ruleDAssociation EOF )
            // InternalSim.g:4323:2: iv_ruleDAssociation= ruleDAssociation EOF
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
    // InternalSim.g:4329:1: ruleDAssociation returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_aliases_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        EObject lv_multiplicity_9_0 = null;

        EObject lv_description_10_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4335:2: ( ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) )
            // InternalSim.g:4336:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            {
            // InternalSim.g:4336:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            // InternalSim.g:4337:3: ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )?
            {
            // InternalSim.g:4337:3: ( (lv_derived_0_0= 'derived' ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==55) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSim.g:4338:4: (lv_derived_0_0= 'derived' )
                    {
                    // InternalSim.g:4338:4: (lv_derived_0_0= 'derived' )
                    // InternalSim.g:4339:5: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,55,FOLLOW_56); if (state.failed) return current;
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

            // InternalSim.g:4351:3: ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=40 && LA95_0<=41)) ) {
                alt95=1;
            }
            else if ( (LA95_0==100) ) {
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
                    // InternalSim.g:4352:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    {
                    // InternalSim.g:4352:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    // InternalSim.g:4353:5: (lv_kind_1_0= ruleDAssociationKind )
                    {
                    // InternalSim.g:4353:5: (lv_kind_1_0= ruleDAssociationKind )
                    // InternalSim.g:4354:6: lv_kind_1_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindEnumRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
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
                      							"com.mimacom.ddd.dm.dim.Dim.DAssociationKind");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:4372:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    {
                    // InternalSim.g:4372:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    // InternalSim.g:4373:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite'
                    {
                    // InternalSim.g:4373:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) )
                    // InternalSim.g:4374:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    {
                    // InternalSim.g:4374:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    // InternalSim.g:4375:7: lv_kind_2_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_57);
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
                      								"com.mimacom.ddd.dm.dim.Dim.DAssociationKindInverse");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDAssociationAccess().getCompositeKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:4398:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSim.g:4399:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSim.g:4399:4: (lv_name_4_0= RULE_ID )
            // InternalSim.g:4400:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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

            // InternalSim.g:4416:3: (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==34) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalSim.g:4417:4: otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDAssociationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalSim.g:4421:4: ( (lv_aliases_6_0= RULE_ID ) )
            	    // InternalSim.g:4422:5: (lv_aliases_6_0= RULE_ID )
            	    {
            	    // InternalSim.g:4422:5: (lv_aliases_6_0= RULE_ID )
            	    // InternalSim.g:4423:6: lv_aliases_6_0= RULE_ID
            	    {
            	    lv_aliases_6_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_6_0, grammarAccess.getDAssociationAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDAssociationRule());
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
            	    break loop96;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDAssociationAccess().getColonKeyword_4());
              		
            }
            // InternalSim.g:4444:3: ( (otherlv_8= RULE_ID ) )
            // InternalSim.g:4445:4: (otherlv_8= RULE_ID )
            {
            // InternalSim.g:4445:4: (otherlv_8= RULE_ID )
            // InternalSim.g:4446:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getDAssociationAccess().getTypeDEntityTypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalSim.g:4457:3: ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==44) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalSim.g:4458:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:4458:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    // InternalSim.g:4459:5: lv_multiplicity_9_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    lv_multiplicity_9_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_9_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:4476:3: ( (lv_description_10_0= ruleDRichText ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=RULE_PLAIN_TEXT_ONLY && LA98_0<=RULE_PLAIN_TEXT_START)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSim.g:4477:4: (lv_description_10_0= ruleDRichText )
                    {
                    // InternalSim.g:4477:4: (lv_description_10_0= ruleDRichText )
                    // InternalSim.g:4478:5: lv_description_10_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getDescriptionDRichTextParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_10_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_10_0,
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
    // InternalSim.g:4499:1: entryRuleDAttribute returns [EObject current=null] : iv_ruleDAttribute= ruleDAttribute EOF ;
    public final EObject entryRuleDAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAttribute = null;


        try {
            // InternalSim.g:4499:51: (iv_ruleDAttribute= ruleDAttribute EOF )
            // InternalSim.g:4500:2: iv_ruleDAttribute= ruleDAttribute EOF
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
    // InternalSim.g:4506:1: ruleDAttribute returns [EObject current=null] : ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) ;
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
            // InternalSim.g:4512:2: ( ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) )
            // InternalSim.g:4513:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            {
            // InternalSim.g:4513:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            // InternalSim.g:4514:3: ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )?
            {
            // InternalSim.g:4514:3: ( (lv_detail_0_0= 'detail' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==39) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalSim.g:4515:4: (lv_detail_0_0= 'detail' )
                    {
                    // InternalSim.g:4515:4: (lv_detail_0_0= 'detail' )
                    // InternalSim.g:4516:5: lv_detail_0_0= 'detail'
                    {
                    lv_detail_0_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
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

            // InternalSim.g:4528:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalSim.g:4529:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            // InternalSim.g:4529:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:4530:5: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:4530:5: (lv_name_1_0= RULE_ID )
            // InternalSim.g:4531:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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

            // InternalSim.g:4547:4: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==34) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalSim.g:4548:5: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getDAttributeAccess().getAliasKeyword_1_1_0());
            	      				
            	    }
            	    // InternalSim.g:4552:5: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalSim.g:4553:6: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalSim.g:4553:6: (lv_aliases_3_0= RULE_ID )
            	    // InternalSim.g:4554:7: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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
            	    break loop100;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDAttributeAccess().getColonKeyword_1_2());
              			
            }
            // InternalSim.g:4575:4: ( (otherlv_5= RULE_ID ) )
            // InternalSim.g:4576:5: (otherlv_5= RULE_ID )
            {
            // InternalSim.g:4576:5: (otherlv_5= RULE_ID )
            // InternalSim.g:4577:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getDAttributeRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getDAttributeAccess().getTypeDTypeCrossReference_1_3_0());
              					
            }

            }


            }


            }

            // InternalSim.g:4589:3: ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==44) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSim.g:4590:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:4590:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    // InternalSim.g:4591:5: lv_multiplicity_6_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_60);
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

            // InternalSim.g:4608:3: ( (lv_key_7_0= 'key' ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==56) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalSim.g:4609:4: (lv_key_7_0= 'key' )
                    {
                    // InternalSim.g:4609:4: (lv_key_7_0= 'key' )
                    // InternalSim.g:4610:5: lv_key_7_0= 'key'
                    {
                    lv_key_7_0=(Token)match(input,56,FOLLOW_32); if (state.failed) return current;
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

            // InternalSim.g:4622:3: ( (lv_description_8_0= ruleDRichText ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=RULE_PLAIN_TEXT_ONLY && LA103_0<=RULE_PLAIN_TEXT_START)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalSim.g:4623:4: (lv_description_8_0= ruleDRichText )
                    {
                    // InternalSim.g:4623:4: (lv_description_8_0= ruleDRichText )
                    // InternalSim.g:4624:5: lv_description_8_0= ruleDRichText
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
    // InternalSim.g:4645:1: entryRuleDQueryParameter returns [EObject current=null] : iv_ruleDQueryParameter= ruleDQueryParameter EOF ;
    public final EObject entryRuleDQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQueryParameter = null;


        try {
            // InternalSim.g:4645:56: (iv_ruleDQueryParameter= ruleDQueryParameter EOF )
            // InternalSim.g:4646:2: iv_ruleDQueryParameter= ruleDQueryParameter EOF
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
    // InternalSim.g:4652:1: ruleDQueryParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4658:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalSim.g:4659:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalSim.g:4659:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalSim.g:4660:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalSim.g:4660:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSim.g:4661:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSim.g:4661:4: (lv_name_0_0= RULE_ID )
            // InternalSim.g:4662:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryParameterAccess().getColonKeyword_1());
              		
            }
            // InternalSim.g:4682:3: ( (otherlv_2= RULE_ID ) )
            // InternalSim.g:4683:4: (otherlv_2= RULE_ID )
            {
            // InternalSim.g:4683:4: (otherlv_2= RULE_ID )
            // InternalSim.g:4684:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryParameterRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDQueryParameterAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalSim.g:4695:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==44) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalSim.g:4696:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:4696:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalSim.g:4697:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalSim.g:4714:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=RULE_PLAIN_TEXT_ONLY && LA105_0<=RULE_PLAIN_TEXT_START)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSim.g:4715:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalSim.g:4715:4: (lv_description_4_0= ruleDRichText )
                    // InternalSim.g:4716:5: lv_description_4_0= ruleDRichText
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


    // $ANTLR start "entryRuleDExistingApplication"
    // InternalSim.g:4737:1: entryRuleDExistingApplication returns [EObject current=null] : iv_ruleDExistingApplication= ruleDExistingApplication EOF ;
    public final EObject entryRuleDExistingApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExistingApplication = null;


        try {
            // InternalSim.g:4737:61: (iv_ruleDExistingApplication= ruleDExistingApplication EOF )
            // InternalSim.g:4738:2: iv_ruleDExistingApplication= ruleDExistingApplication EOF
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
    // InternalSim.g:4744:1: ruleDExistingApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDExistingApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_description_2_0 = null;

        EObject lv_services_4_0 = null;

        EObject lv_exceptions_5_0 = null;

        EObject lv_types_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4750:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' ) )
            // InternalSim.g:4751:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' )
            {
            // InternalSim.g:4751:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' )
            // InternalSim.g:4752:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExistingApplicationAccess().getApplicationKeyword_0());
              		
            }
            // InternalSim.g:4756:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:4757:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:4757:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:4758:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
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

            // InternalSim.g:4774:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=RULE_PLAIN_TEXT_ONLY && LA106_0<=RULE_PLAIN_TEXT_START)) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalSim.g:4775:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalSim.g:4775:4: (lv_description_2_0= ruleDRichText )
                    // InternalSim.g:4776:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDExistingApplicationAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,28,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDExistingApplicationAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSim.g:4797:3: ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )*
            loop107:
            do {
                int alt107=4;
                switch ( input.LA(1) ) {
                case 58:
                case 101:
                case 102:
                    {
                    alt107=1;
                    }
                    break;
                case 62:
                    {
                    alt107=2;
                    }
                    break;
                case 30:
                case 31:
                case 35:
                case 36:
                case 39:
                case 52:
                case 53:
                case 54:
                    {
                    alt107=3;
                    }
                    break;

                }

                switch (alt107) {
            	case 1 :
            	    // InternalSim.g:4798:4: ( (lv_services_4_0= ruleDService ) )
            	    {
            	    // InternalSim.g:4798:4: ( (lv_services_4_0= ruleDService ) )
            	    // InternalSim.g:4799:5: (lv_services_4_0= ruleDService )
            	    {
            	    // InternalSim.g:4799:5: (lv_services_4_0= ruleDService )
            	    // InternalSim.g:4800:6: lv_services_4_0= ruleDService
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getServicesDServiceParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
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
            	      							"com.mimacom.ddd.dm.dim.Dim.DService");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:4818:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    {
            	    // InternalSim.g:4818:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    // InternalSim.g:4819:5: (lv_exceptions_5_0= ruleDException )
            	    {
            	    // InternalSim.g:4819:5: (lv_exceptions_5_0= ruleDException )
            	    // InternalSim.g:4820:6: lv_exceptions_5_0= ruleDException
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getExceptionsDExceptionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
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
            	      							"com.mimacom.ddd.dm.dim.Dim.DException");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSim.g:4838:4: ( (lv_types_6_0= ruleDType ) )
            	    {
            	    // InternalSim.g:4838:4: ( (lv_types_6_0= ruleDType ) )
            	    // InternalSim.g:4839:5: (lv_types_6_0= ruleDType )
            	    {
            	    // InternalSim.g:4839:5: (lv_types_6_0= ruleDType )
            	    // InternalSim.g:4840:6: lv_types_6_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getTypesDTypeParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_types_6_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDExistingApplicationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_6_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDExistingApplicationAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSim.g:4866:1: entryRuleDService returns [EObject current=null] : iv_ruleDService= ruleDService EOF ;
    public final EObject entryRuleDService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDService = null;


        try {
            // InternalSim.g:4866:49: (iv_ruleDService= ruleDService EOF )
            // InternalSim.g:4867:2: iv_ruleDService= ruleDService EOF
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
    // InternalSim.g:4873:1: ruleDService returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' ) ;
    public final EObject ruleDService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_description_12_0 = null;

        EObject lv_precondition_15_0 = null;

        EObject lv_postcondition_17_0 = null;

        EObject lv_types_18_0 = null;



        	enterRule();

        try {
            // InternalSim.g:4879:2: ( ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' ) )
            // InternalSim.g:4880:2: ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' )
            {
            // InternalSim.g:4880:2: ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' )
            // InternalSim.g:4881:3: ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}'
            {
            // InternalSim.g:4881:3: ( (lv_kind_0_0= ruleDServiceKind ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( ((LA108_0>=101 && LA108_0<=102)) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalSim.g:4882:4: (lv_kind_0_0= ruleDServiceKind )
                    {
                    // InternalSim.g:4882:4: (lv_kind_0_0= ruleDServiceKind )
                    // InternalSim.g:4883:5: lv_kind_0_0= ruleDServiceKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceAccess().getKindDServiceKindEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_62);
                    lv_kind_0_0=ruleDServiceKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_0_0,
                      						"com.mimacom.ddd.dm.dim.Dim.DServiceKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,58,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDServiceAccess().getServiceKeyword_1());
              		
            }
            // InternalSim.g:4904:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSim.g:4905:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSim.g:4905:4: (lv_name_2_0= RULE_ID )
            // InternalSim.g:4906:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
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

            // InternalSim.g:4922:3: (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==44) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalSim.g:4923:4: otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDServiceAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalSim.g:4927:4: ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( ((LA110_0>=103 && LA110_0<=104)) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalSim.g:4928:5: ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )*
                            {
                            // InternalSim.g:4928:5: ( (lv_parameters_4_0= ruleDServiceParameter ) )
                            // InternalSim.g:4929:6: (lv_parameters_4_0= ruleDServiceParameter )
                            {
                            // InternalSim.g:4929:6: (lv_parameters_4_0= ruleDServiceParameter )
                            // InternalSim.g:4930:7: lv_parameters_4_0= ruleDServiceParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_44);
                            lv_parameters_4_0=ruleDServiceParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDServiceRule());
                              							}
                              							add(
                              								current,
                              								"parameters",
                              								lv_parameters_4_0,
                              								"com.mimacom.ddd.dm.dim.Dim.DServiceParameter");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalSim.g:4947:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )*
                            loop109:
                            do {
                                int alt109=2;
                                int LA109_0 = input.LA(1);

                                if ( (LA109_0==33) ) {
                                    alt109=1;
                                }


                                switch (alt109) {
                            	case 1 :
                            	    // InternalSim.g:4948:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,33,FOLLOW_65); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDServiceAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalSim.g:4952:6: ( (lv_parameters_6_0= ruleDServiceParameter ) )
                            	    // InternalSim.g:4953:7: (lv_parameters_6_0= ruleDServiceParameter )
                            	    {
                            	    // InternalSim.g:4953:7: (lv_parameters_6_0= ruleDServiceParameter )
                            	    // InternalSim.g:4954:8: lv_parameters_6_0= ruleDServiceParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_44);
                            	    lv_parameters_6_0=ruleDServiceParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDServiceRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"parameters",
                            	      									lv_parameters_6_0,
                            	      									"com.mimacom.ddd.dm.dim.Dim.DServiceParameter");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop109;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,46,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDServiceAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSim.g:4978:3: (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==59) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalSim.g:4979:4: otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDServiceAccess().getRaisesKeyword_4_0());
                      			
                    }
                    // InternalSim.g:4983:4: ( (otherlv_9= RULE_ID ) )
                    // InternalSim.g:4984:5: (otherlv_9= RULE_ID )
                    {
                    // InternalSim.g:4984:5: (otherlv_9= RULE_ID )
                    // InternalSim.g:4985:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDServiceRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalSim.g:4996:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==33) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalSim.g:4997:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,33,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getDServiceAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalSim.g:5001:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalSim.g:5002:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalSim.g:5002:6: (otherlv_11= RULE_ID )
                    	    // InternalSim.g:5003:7: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDServiceRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_11, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_4_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSim.g:5016:3: ( (lv_description_12_0= ruleDRichText ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=RULE_PLAIN_TEXT_ONLY && LA114_0<=RULE_PLAIN_TEXT_START)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalSim.g:5017:4: (lv_description_12_0= ruleDRichText )
                    {
                    // InternalSim.g:5017:4: (lv_description_12_0= ruleDRichText )
                    // InternalSim.g:5018:5: lv_description_12_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_description_12_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_12_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,28,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDServiceAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalSim.g:5039:3: (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==60) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalSim.g:5040:4: otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) )
                    {
                    otherlv_14=(Token)match(input,60,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDServiceAccess().getPreconditionKeyword_7_0());
                      			
                    }
                    // InternalSim.g:5044:4: ( (lv_precondition_15_0= ruleDExpression ) )
                    // InternalSim.g:5045:5: (lv_precondition_15_0= ruleDExpression )
                    {
                    // InternalSim.g:5045:5: (lv_precondition_15_0= ruleDExpression )
                    // InternalSim.g:5046:6: lv_precondition_15_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getPreconditionDExpressionParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_precondition_15_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDServiceRule());
                      						}
                      						set(
                      							current,
                      							"precondition",
                      							lv_precondition_15_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:5064:3: (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==61) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalSim.g:5065:4: otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) )
                    {
                    otherlv_16=(Token)match(input,61,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getDServiceAccess().getPostconditionKeyword_8_0());
                      			
                    }
                    // InternalSim.g:5069:4: ( (lv_postcondition_17_0= ruleDExpression ) )
                    // InternalSim.g:5070:5: (lv_postcondition_17_0= ruleDExpression )
                    {
                    // InternalSim.g:5070:5: (lv_postcondition_17_0= ruleDExpression )
                    // InternalSim.g:5071:6: lv_postcondition_17_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getPostconditionDExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_postcondition_17_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDServiceRule());
                      						}
                      						set(
                      							current,
                      							"postcondition",
                      							lv_postcondition_17_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:5089:3: ( (lv_types_18_0= ruleDType ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( ((LA117_0>=30 && LA117_0<=31)||(LA117_0>=35 && LA117_0<=36)||LA117_0==39||(LA117_0>=52 && LA117_0<=54)) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalSim.g:5090:4: (lv_types_18_0= ruleDType )
            	    {
            	    // InternalSim.g:5090:4: (lv_types_18_0= ruleDType )
            	    // InternalSim.g:5091:5: lv_types_18_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDServiceAccess().getTypesDTypeParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_types_18_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDServiceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_18_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            otherlv_19=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getDServiceAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSim.g:5116:1: entryRuleDServiceParameter returns [EObject current=null] : iv_ruleDServiceParameter= ruleDServiceParameter EOF ;
    public final EObject entryRuleDServiceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDServiceParameter = null;


        try {
            // InternalSim.g:5116:58: (iv_ruleDServiceParameter= ruleDServiceParameter EOF )
            // InternalSim.g:5117:2: iv_ruleDServiceParameter= ruleDServiceParameter EOF
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
    // InternalSim.g:5123:1: ruleDServiceParameter returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
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
            // InternalSim.g:5129:2: ( ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalSim.g:5130:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalSim.g:5130:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalSim.g:5131:3: ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalSim.g:5131:3: ( (lv_direction_0_0= ruleDDirection ) )
            // InternalSim.g:5132:4: (lv_direction_0_0= ruleDDirection )
            {
            // InternalSim.g:5132:4: (lv_direction_0_0= ruleDDirection )
            // InternalSim.g:5133:5: lv_direction_0_0= ruleDDirection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDServiceParameterAccess().getDirectionDDirectionEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
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
              						"com.mimacom.ddd.dm.dim.Dim.DDirection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSim.g:5150:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:5151:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:5151:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:5152:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDServiceParameterAccess().getColonKeyword_2());
              		
            }
            // InternalSim.g:5172:3: ( (otherlv_3= RULE_ID ) )
            // InternalSim.g:5173:4: (otherlv_3= RULE_ID )
            {
            // InternalSim.g:5173:4: (otherlv_3= RULE_ID )
            // InternalSim.g:5174:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceParameterRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDServiceParameterAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalSim.g:5185:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==44) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalSim.g:5186:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalSim.g:5186:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalSim.g:5187:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceParameterAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
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
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSim.g:5204:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( ((LA119_0>=RULE_PLAIN_TEXT_ONLY && LA119_0<=RULE_PLAIN_TEXT_START)) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalSim.g:5205:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalSim.g:5205:4: (lv_description_5_0= ruleDRichText )
                    // InternalSim.g:5206:5: lv_description_5_0= ruleDRichText
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
    // InternalSim.g:5227:1: entryRuleDException returns [EObject current=null] : iv_ruleDException= ruleDException EOF ;
    public final EObject entryRuleDException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDException = null;


        try {
            // InternalSim.g:5227:51: (iv_ruleDException= ruleDException EOF )
            // InternalSim.g:5228:2: iv_ruleDException= ruleDException EOF
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
    // InternalSim.g:5234:1: ruleDException returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) ;
    public final EObject ruleDException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5240:2: ( (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) )
            // InternalSim.g:5241:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            {
            // InternalSim.g:5241:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            // InternalSim.g:5242:3: otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExceptionAccess().getExceptionKeyword_0());
              		
            }
            // InternalSim.g:5246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:5247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:5247:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:5248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            // InternalSim.g:5264:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( ((LA120_0>=RULE_PLAIN_TEXT_ONLY && LA120_0<=RULE_PLAIN_TEXT_START)) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalSim.g:5265:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalSim.g:5265:4: (lv_description_2_0= ruleDRichText )
                    // InternalSim.g:5266:5: lv_description_2_0= ruleDRichText
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


    // $ANTLR start "entryRuleDExpression"
    // InternalSim.g:5287:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalSim.g:5287:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalSim.g:5288:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalSim.g:5294:1: ruleDExpression returns [EObject current=null] : (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAssignment_0 = null;

        EObject this_DRichText_1 = null;



        	enterRule();

        try {
            // InternalSim.g:5300:2: ( (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText ) )
            // InternalSim.g:5301:2: (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText )
            {
            // InternalSim.g:5301:2: (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_ID||(LA121_0>=RULE_NATURAL && LA121_0<=RULE_STRING)||LA121_0==44||(LA121_0>=69 && LA121_0<=77)||LA121_0==81||(LA121_0>=84 && LA121_0<=89)||(LA121_0>=92 && LA121_0<=93)||(LA121_0>=124 && LA121_0<=126)) ) {
                alt121=1;
            }
            else if ( ((LA121_0>=RULE_PLAIN_TEXT_ONLY && LA121_0<=RULE_PLAIN_TEXT_START)) ) {
                alt121=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalSim.g:5302:3: this_DAssignment_0= ruleDAssignment
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
                    // InternalSim.g:5311:3: this_DRichText_1= ruleDRichText
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
    // InternalSim.g:5323:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalSim.g:5323:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalSim.g:5324:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalSim.g:5330:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) ) ;
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
            // InternalSim.g:5336:2: ( ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) ) )
            // InternalSim.g:5337:2: ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) )
            {
            // InternalSim.g:5337:2: ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt123=1;
            }
            else if ( (LA123_0==RULE_PLAIN_TEXT_START) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // InternalSim.g:5338:3: ( (lv_segments_0_0= ruleDTextOnly ) )
                    {
                    // InternalSim.g:5338:3: ( (lv_segments_0_0= ruleDTextOnly ) )
                    // InternalSim.g:5339:4: (lv_segments_0_0= ruleDTextOnly )
                    {
                    // InternalSim.g:5339:4: (lv_segments_0_0= ruleDTextOnly )
                    // InternalSim.g:5340:5: lv_segments_0_0= ruleDTextOnly
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
                    // InternalSim.g:5358:3: ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) )
                    {
                    // InternalSim.g:5358:3: ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) )
                    // InternalSim.g:5359:4: ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) )
                    {
                    // InternalSim.g:5359:4: ( (lv_segments_1_0= ruleDTextStart ) )
                    // InternalSim.g:5360:5: (lv_segments_1_0= ruleDTextStart )
                    {
                    // InternalSim.g:5360:5: (lv_segments_1_0= ruleDTextStart )
                    // InternalSim.g:5361:6: lv_segments_1_0= ruleDTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
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

                    // InternalSim.g:5378:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalSim.g:5379:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalSim.g:5379:5: (lv_segments_2_0= ruleDExpression )
                    // InternalSim.g:5380:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_70);
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

                    // InternalSim.g:5397:4: ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalSim.g:5398:5: ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalSim.g:5398:5: ( (lv_segments_3_0= ruleDTextMiddle ) )
                    	    // InternalSim.g:5399:6: (lv_segments_3_0= ruleDTextMiddle )
                    	    {
                    	    // InternalSim.g:5399:6: (lv_segments_3_0= ruleDTextMiddle )
                    	    // InternalSim.g:5400:7: lv_segments_3_0= ruleDTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_50);
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

                    	    // InternalSim.g:5417:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalSim.g:5418:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalSim.g:5418:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalSim.g:5419:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_70);
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
                    	    break loop122;
                        }
                    } while (true);

                    // InternalSim.g:5437:4: ( (lv_segments_5_0= ruleDTextEnd ) )
                    // InternalSim.g:5438:5: (lv_segments_5_0= ruleDTextEnd )
                    {
                    // InternalSim.g:5438:5: (lv_segments_5_0= ruleDTextEnd )
                    // InternalSim.g:5439:6: lv_segments_5_0= ruleDTextEnd
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
    // InternalSim.g:5461:1: entryRuleDTextOnly returns [EObject current=null] : iv_ruleDTextOnly= ruleDTextOnly EOF ;
    public final EObject entryRuleDTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextOnly = null;


        try {
            // InternalSim.g:5461:50: (iv_ruleDTextOnly= ruleDTextOnly EOF )
            // InternalSim.g:5462:2: iv_ruleDTextOnly= ruleDTextOnly EOF
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
    // InternalSim.g:5468:1: ruleDTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:5474:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalSim.g:5475:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalSim.g:5475:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalSim.g:5476:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalSim.g:5476:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalSim.g:5477:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalSim.g:5496:1: entryRuleDTextStart returns [EObject current=null] : iv_ruleDTextStart= ruleDTextStart EOF ;
    public final EObject entryRuleDTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextStart = null;


        try {
            // InternalSim.g:5496:51: (iv_ruleDTextStart= ruleDTextStart EOF )
            // InternalSim.g:5497:2: iv_ruleDTextStart= ruleDTextStart EOF
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
    // InternalSim.g:5503:1: ruleDTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:5509:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalSim.g:5510:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalSim.g:5510:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalSim.g:5511:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalSim.g:5511:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalSim.g:5512:4: lv_value_0_0= RULE_PLAIN_TEXT_START
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
    // InternalSim.g:5531:1: entryRuleDTextMiddle returns [EObject current=null] : iv_ruleDTextMiddle= ruleDTextMiddle EOF ;
    public final EObject entryRuleDTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextMiddle = null;


        try {
            // InternalSim.g:5531:52: (iv_ruleDTextMiddle= ruleDTextMiddle EOF )
            // InternalSim.g:5532:2: iv_ruleDTextMiddle= ruleDTextMiddle EOF
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
    // InternalSim.g:5538:1: ruleDTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:5544:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalSim.g:5545:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalSim.g:5545:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalSim.g:5546:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalSim.g:5546:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalSim.g:5547:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
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
    // InternalSim.g:5566:1: entryRuleDTextEnd returns [EObject current=null] : iv_ruleDTextEnd= ruleDTextEnd EOF ;
    public final EObject entryRuleDTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextEnd = null;


        try {
            // InternalSim.g:5566:49: (iv_ruleDTextEnd= ruleDTextEnd EOF )
            // InternalSim.g:5567:2: iv_ruleDTextEnd= ruleDTextEnd EOF
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
    // InternalSim.g:5573:1: ruleDTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:5579:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalSim.g:5580:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalSim.g:5580:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalSim.g:5581:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalSim.g:5581:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalSim.g:5582:4: lv_value_0_0= RULE_PLAIN_TEXT_END
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
    // InternalSim.g:5601:1: entryRuleDAssignment returns [EObject current=null] : iv_ruleDAssignment= ruleDAssignment EOF ;
    public final EObject entryRuleDAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssignment = null;


        try {
            // InternalSim.g:5601:52: (iv_ruleDAssignment= ruleDAssignment EOF )
            // InternalSim.g:5602:2: iv_ruleDAssignment= ruleDAssignment EOF
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
    // InternalSim.g:5608:1: ruleDAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) ;
    public final EObject ruleDAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_DOrExpression_4 = null;



        	enterRule();

        try {
            // InternalSim.g:5614:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) )
            // InternalSim.g:5615:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            {
            // InternalSim.g:5615:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_ID) ) {
                int LA124_1 = input.LA(2);

                if ( (LA124_1==EOF||(LA124_1>=RULE_ID && LA124_1<=RULE_PLAIN_TEXT_END)||(LA124_1>=20 && LA124_1<=21)||LA124_1==25||(LA124_1>=29 && LA124_1<=33)||(LA124_1>=35 && LA124_1<=37)||(LA124_1>=39 && LA124_1<=41)||(LA124_1>=44 && LA124_1<=46)||LA124_1==50||(LA124_1>=52 && LA124_1<=55)||LA124_1==61||(LA124_1>=64 && LA124_1<=68)||(LA124_1>=78 && LA124_1<=80)||(LA124_1>=82 && LA124_1<=83)||(LA124_1>=92 && LA124_1<=93)||LA124_1==100||(LA124_1>=105 && LA124_1<=123)) ) {
                    alt124=2;
                }
                else if ( (LA124_1==63) ) {
                    alt124=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA124_0>=RULE_NATURAL && LA124_0<=RULE_STRING)||LA124_0==44||(LA124_0>=69 && LA124_0<=77)||LA124_0==81||(LA124_0>=84 && LA124_0<=89)||(LA124_0>=92 && LA124_0<=93)||(LA124_0>=124 && LA124_0<=126)) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalSim.g:5616:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    {
                    // InternalSim.g:5616:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    // InternalSim.g:5617:4: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) )
                    {
                    // InternalSim.g:5617:4: ()
                    // InternalSim.g:5618:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSim.g:5624:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSim.g:5625:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSim.g:5625:5: (otherlv_1= RULE_ID )
                    // InternalSim.g:5626:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDAssignmentRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_72);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSim.g:5644:4: ( (lv_value_3_0= ruleDAssignment ) )
                    // InternalSim.g:5645:5: (lv_value_3_0= ruleDAssignment )
                    {
                    // InternalSim.g:5645:5: (lv_value_3_0= ruleDAssignment )
                    // InternalSim.g:5646:6: lv_value_3_0= ruleDAssignment
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
                    // InternalSim.g:5665:3: this_DOrExpression_4= ruleDOrExpression
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
    // InternalSim.g:5677:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalSim.g:5677:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalSim.g:5678:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
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
    // InternalSim.g:5684:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:5690:2: (kw= ':=' )
            // InternalSim.g:5691:2: kw= ':='
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
    // InternalSim.g:5699:1: entryRuleDOrExpression returns [EObject current=null] : iv_ruleDOrExpression= ruleDOrExpression EOF ;
    public final EObject entryRuleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOrExpression = null;


        try {
            // InternalSim.g:5699:54: (iv_ruleDOrExpression= ruleDOrExpression EOF )
            // InternalSim.g:5700:2: iv_ruleDOrExpression= ruleDOrExpression EOF
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
    // InternalSim.g:5706:1: ruleDOrExpression returns [EObject current=null] : (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) ;
    public final EObject ruleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5712:2: ( (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) )
            // InternalSim.g:5713:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            {
            // InternalSim.g:5713:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            // InternalSim.g:5714:3: this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_73);
            this_DAndExpression_0=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:5722:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            loop125:
            do {
                int alt125=2;
                switch ( input.LA(1) ) {
                case 105:
                    {
                    int LA125_2 = input.LA(2);

                    if ( (synpred1_InternalSim()) ) {
                        alt125=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA125_3 = input.LA(2);

                    if ( (synpred1_InternalSim()) ) {
                        alt125=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA125_4 = input.LA(2);

                    if ( (synpred1_InternalSim()) ) {
                        alt125=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA125_5 = input.LA(2);

                    if ( (synpred1_InternalSim()) ) {
                        alt125=1;
                    }


                    }
                    break;

                }

                switch (alt125) {
            	case 1 :
            	    // InternalSim.g:5723:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    {
            	    // InternalSim.g:5723:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) )
            	    // InternalSim.g:5724:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    {
            	    // InternalSim.g:5734:5: ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    // InternalSim.g:5735:6: () ( (lv_operator_2_0= ruleOpOr ) )
            	    {
            	    // InternalSim.g:5735:6: ()
            	    // InternalSim.g:5736:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:5742:6: ( (lv_operator_2_0= ruleOpOr ) )
            	    // InternalSim.g:5743:7: (lv_operator_2_0= ruleOpOr )
            	    {
            	    // InternalSim.g:5743:7: (lv_operator_2_0= ruleOpOr )
            	    // InternalSim.g:5744:8: lv_operator_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_72);
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

            	    // InternalSim.g:5763:4: ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    // InternalSim.g:5764:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    {
            	    // InternalSim.g:5764:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    // InternalSim.g:5765:6: lv_rightOperand_3_0= ruleDAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_73);
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
            	    break loop125;
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
    // InternalSim.g:5787:1: entryRuleDAndExpression returns [EObject current=null] : iv_ruleDAndExpression= ruleDAndExpression EOF ;
    public final EObject entryRuleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAndExpression = null;


        try {
            // InternalSim.g:5787:55: (iv_ruleDAndExpression= ruleDAndExpression EOF )
            // InternalSim.g:5788:2: iv_ruleDAndExpression= ruleDAndExpression EOF
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
    // InternalSim.g:5794:1: ruleDAndExpression returns [EObject current=null] : (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) ;
    public final EObject ruleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5800:2: ( (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) )
            // InternalSim.g:5801:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            {
            // InternalSim.g:5801:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            // InternalSim.g:5802:3: this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_74);
            this_DEqualityExpression_0=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:5810:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==109) ) {
                    int LA126_2 = input.LA(2);

                    if ( (synpred2_InternalSim()) ) {
                        alt126=1;
                    }


                }
                else if ( (LA126_0==21) ) {
                    int LA126_3 = input.LA(2);

                    if ( (synpred2_InternalSim()) ) {
                        alt126=1;
                    }


                }


                switch (alt126) {
            	case 1 :
            	    // InternalSim.g:5811:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    {
            	    // InternalSim.g:5811:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) )
            	    // InternalSim.g:5812:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    {
            	    // InternalSim.g:5822:5: ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    // InternalSim.g:5823:6: () ( (lv_operator_2_0= ruleOpAnd ) )
            	    {
            	    // InternalSim.g:5823:6: ()
            	    // InternalSim.g:5824:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:5830:6: ( (lv_operator_2_0= ruleOpAnd ) )
            	    // InternalSim.g:5831:7: (lv_operator_2_0= ruleOpAnd )
            	    {
            	    // InternalSim.g:5831:7: (lv_operator_2_0= ruleOpAnd )
            	    // InternalSim.g:5832:8: lv_operator_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_72);
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

            	    // InternalSim.g:5851:4: ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    // InternalSim.g:5852:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    {
            	    // InternalSim.g:5852:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    // InternalSim.g:5853:6: lv_rightOperand_3_0= ruleDEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_74);
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
            	    break loop126;
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
    // InternalSim.g:5875:1: entryRuleDEqualityExpression returns [EObject current=null] : iv_ruleDEqualityExpression= ruleDEqualityExpression EOF ;
    public final EObject entryRuleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEqualityExpression = null;


        try {
            // InternalSim.g:5875:60: (iv_ruleDEqualityExpression= ruleDEqualityExpression EOF )
            // InternalSim.g:5876:2: iv_ruleDEqualityExpression= ruleDEqualityExpression EOF
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
    // InternalSim.g:5882:1: ruleDEqualityExpression returns [EObject current=null] : (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) ;
    public final EObject ruleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5888:2: ( (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) )
            // InternalSim.g:5889:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            {
            // InternalSim.g:5889:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            // InternalSim.g:5890:3: this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_75);
            this_DRelationalExpression_0=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:5898:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            loop127:
            do {
                int alt127=2;
                switch ( input.LA(1) ) {
                case 110:
                    {
                    int LA127_2 = input.LA(2);

                    if ( (synpred3_InternalSim()) ) {
                        alt127=1;
                    }


                    }
                    break;
                case 111:
                    {
                    int LA127_3 = input.LA(2);

                    if ( (synpred3_InternalSim()) ) {
                        alt127=1;
                    }


                    }
                    break;
                case 112:
                    {
                    int LA127_4 = input.LA(2);

                    if ( (synpred3_InternalSim()) ) {
                        alt127=1;
                    }


                    }
                    break;

                }

                switch (alt127) {
            	case 1 :
            	    // InternalSim.g:5899:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    {
            	    // InternalSim.g:5899:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) )
            	    // InternalSim.g:5900:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    {
            	    // InternalSim.g:5910:5: ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    // InternalSim.g:5911:6: () ( (lv_operator_2_0= ruleOpEquality ) )
            	    {
            	    // InternalSim.g:5911:6: ()
            	    // InternalSim.g:5912:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:5918:6: ( (lv_operator_2_0= ruleOpEquality ) )
            	    // InternalSim.g:5919:7: (lv_operator_2_0= ruleOpEquality )
            	    {
            	    // InternalSim.g:5919:7: (lv_operator_2_0= ruleOpEquality )
            	    // InternalSim.g:5920:8: lv_operator_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_72);
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

            	    // InternalSim.g:5939:4: ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    // InternalSim.g:5940:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    {
            	    // InternalSim.g:5940:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    // InternalSim.g:5941:6: lv_rightOperand_3_0= ruleDRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_75);
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
            	    break loop127;
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
    // InternalSim.g:5963:1: entryRuleDRelationalExpression returns [EObject current=null] : iv_ruleDRelationalExpression= ruleDRelationalExpression EOF ;
    public final EObject entryRuleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationalExpression = null;


        try {
            // InternalSim.g:5963:62: (iv_ruleDRelationalExpression= ruleDRelationalExpression EOF )
            // InternalSim.g:5964:2: iv_ruleDRelationalExpression= ruleDRelationalExpression EOF
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
    // InternalSim.g:5970:1: ruleDRelationalExpression returns [EObject current=null] : (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalSim.g:5976:2: ( (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) )
            // InternalSim.g:5977:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            {
            // InternalSim.g:5977:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            // InternalSim.g:5978:3: this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_76);
            this_DOtherOperatorExpression_0=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:5986:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            loop128:
            do {
                int alt128=3;
                alt128 = dfa128.predict(input);
                switch (alt128) {
            	case 1 :
            	    // InternalSim.g:5987:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalSim.g:5987:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalSim.g:5988:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalSim.g:5988:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) )
            	    // InternalSim.g:5989:6: ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf )
            	    {
            	    // InternalSim.g:5995:6: ( () ruleOpInstanceOf )
            	    // InternalSim.g:5996:7: () ruleOpInstanceOf
            	    {
            	    // InternalSim.g:5996:7: ()
            	    // InternalSim.g:5997:8: 
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
            	    pushFollow(FOLLOW_5);
            	    ruleOpInstanceOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalSim.g:6012:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalSim.g:6013:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalSim.g:6013:6: (otherlv_3= RULE_ID )
            	    // InternalSim.g:6014:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:6027:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    {
            	    // InternalSim.g:6027:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    // InternalSim.g:6028:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    {
            	    // InternalSim.g:6028:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalSim.g:6029:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalSim.g:6039:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalSim.g:6040:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalSim.g:6040:7: ()
            	    // InternalSim.g:6041:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalSim.g:6047:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalSim.g:6048:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalSim.g:6048:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalSim.g:6049:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_72);
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

            	    // InternalSim.g:6068:5: ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    // InternalSim.g:6069:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    {
            	    // InternalSim.g:6069:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    // InternalSim.g:6070:7: lv_rightOperand_6_0= ruleDOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_76);
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
    // $ANTLR end "ruleDRelationalExpression"


    // $ANTLR start "entryRuleOpInstanceOf"
    // InternalSim.g:6093:1: entryRuleOpInstanceOf returns [String current=null] : iv_ruleOpInstanceOf= ruleOpInstanceOf EOF ;
    public final String entryRuleOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpInstanceOf = null;


        try {
            // InternalSim.g:6093:52: (iv_ruleOpInstanceOf= ruleOpInstanceOf EOF )
            // InternalSim.g:6094:2: iv_ruleOpInstanceOf= ruleOpInstanceOf EOF
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
    // InternalSim.g:6100:1: ruleOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:6106:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalSim.g:6107:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalSim.g:6107:2: (kw= 'ISA' | kw= 'isa' )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==64) ) {
                alt129=1;
            }
            else if ( (LA129_0==65) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalSim.g:6108:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:6114:3: kw= 'isa'
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
    // InternalSim.g:6123:1: entryRuleDOtherOperatorExpression returns [EObject current=null] : iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF ;
    public final EObject entryRuleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOtherOperatorExpression = null;


        try {
            // InternalSim.g:6123:65: (iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF )
            // InternalSim.g:6124:2: iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF
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
    // InternalSim.g:6130:1: ruleDOtherOperatorExpression returns [EObject current=null] : (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) ;
    public final EObject ruleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6136:2: ( (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) )
            // InternalSim.g:6137:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            {
            // InternalSim.g:6137:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            // InternalSim.g:6138:3: this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_77);
            this_DAdditiveExpression_0=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6146:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            loop130:
            do {
                int alt130=2;
                switch ( input.LA(1) ) {
                case 83:
                    {
                    int LA130_2 = input.LA(2);

                    if ( (synpred6_InternalSim()) ) {
                        alt130=1;
                    }


                    }
                    break;
                case 119:
                    {
                    int LA130_3 = input.LA(2);

                    if ( (synpred6_InternalSim()) ) {
                        alt130=1;
                    }


                    }
                    break;
                case 120:
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
            	    // InternalSim.g:6147:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    {
            	    // InternalSim.g:6147:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalSim.g:6148:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalSim.g:6158:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalSim.g:6159:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalSim.g:6159:6: ()
            	    // InternalSim.g:6160:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6166:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalSim.g:6167:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalSim.g:6167:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalSim.g:6168:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_72);
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

            	    // InternalSim.g:6187:4: ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    // InternalSim.g:6188:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    {
            	    // InternalSim.g:6188:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    // InternalSim.g:6189:6: lv_rightOperand_3_0= ruleDAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_77);
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
    // $ANTLR end "ruleDOtherOperatorExpression"


    // $ANTLR start "entryRuleDAdditiveExpression"
    // InternalSim.g:6211:1: entryRuleDAdditiveExpression returns [EObject current=null] : iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF ;
    public final EObject entryRuleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAdditiveExpression = null;


        try {
            // InternalSim.g:6211:60: (iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF )
            // InternalSim.g:6212:2: iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF
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
    // InternalSim.g:6218:1: ruleDAdditiveExpression returns [EObject current=null] : (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6224:2: ( (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) )
            // InternalSim.g:6225:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            {
            // InternalSim.g:6225:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            // InternalSim.g:6226:3: this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_78);
            this_DMultiplicativeExpression_0=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6234:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==92) ) {
                    int LA131_2 = input.LA(2);

                    if ( (synpred7_InternalSim()) ) {
                        alt131=1;
                    }


                }
                else if ( (LA131_0==93) ) {
                    int LA131_3 = input.LA(2);

                    if ( (synpred7_InternalSim()) ) {
                        alt131=1;
                    }


                }


                switch (alt131) {
            	case 1 :
            	    // InternalSim.g:6235:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    {
            	    // InternalSim.g:6235:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalSim.g:6236:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalSim.g:6246:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalSim.g:6247:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalSim.g:6247:6: ()
            	    // InternalSim.g:6248:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6254:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalSim.g:6255:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalSim.g:6255:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalSim.g:6256:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_72);
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

            	    // InternalSim.g:6275:4: ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    // InternalSim.g:6276:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    {
            	    // InternalSim.g:6276:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    // InternalSim.g:6277:6: lv_rightOperand_3_0= ruleDMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_78);
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
    // $ANTLR end "ruleDAdditiveExpression"


    // $ANTLR start "entryRuleDMultiplicativeExpression"
    // InternalSim.g:6299:1: entryRuleDMultiplicativeExpression returns [EObject current=null] : iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF ;
    public final EObject entryRuleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicativeExpression = null;


        try {
            // InternalSim.g:6299:66: (iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF )
            // InternalSim.g:6300:2: iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF
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
    // InternalSim.g:6306:1: ruleDMultiplicativeExpression returns [EObject current=null] : (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) ;
    public final EObject ruleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6312:2: ( (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) )
            // InternalSim.g:6313:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            {
            // InternalSim.g:6313:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            // InternalSim.g:6314:3: this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_79);
            this_DUnaryOperation_0=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6322:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            loop132:
            do {
                int alt132=2;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA132_2 = input.LA(2);

                    if ( (synpred8_InternalSim()) ) {
                        alt132=1;
                    }


                    }
                    break;
                case 121:
                    {
                    int LA132_3 = input.LA(2);

                    if ( (synpred8_InternalSim()) ) {
                        alt132=1;
                    }


                    }
                    break;
                case 122:
                    {
                    int LA132_4 = input.LA(2);

                    if ( (synpred8_InternalSim()) ) {
                        alt132=1;
                    }


                    }
                    break;
                case 123:
                    {
                    int LA132_5 = input.LA(2);

                    if ( (synpred8_InternalSim()) ) {
                        alt132=1;
                    }


                    }
                    break;

                }

                switch (alt132) {
            	case 1 :
            	    // InternalSim.g:6323:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    {
            	    // InternalSim.g:6323:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalSim.g:6324:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalSim.g:6334:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalSim.g:6335:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalSim.g:6335:6: ()
            	    // InternalSim.g:6336:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalSim.g:6342:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalSim.g:6343:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalSim.g:6343:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalSim.g:6344:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_72);
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

            	    // InternalSim.g:6363:4: ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    // InternalSim.g:6364:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    {
            	    // InternalSim.g:6364:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    // InternalSim.g:6365:6: lv_rightOperand_3_0= ruleDUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_79);
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
            	    break loop132;
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
    // InternalSim.g:6387:1: entryRuleDUnaryOperation returns [EObject current=null] : iv_ruleDUnaryOperation= ruleDUnaryOperation EOF ;
    public final EObject entryRuleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUnaryOperation = null;


        try {
            // InternalSim.g:6387:56: (iv_ruleDUnaryOperation= ruleDUnaryOperation EOF )
            // InternalSim.g:6388:2: iv_ruleDUnaryOperation= ruleDUnaryOperation EOF
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
    // InternalSim.g:6394:1: ruleDUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) ;
    public final EObject ruleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DCastExpression_3 = null;



        	enterRule();

        try {
            // InternalSim.g:6400:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) )
            // InternalSim.g:6401:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            {
            // InternalSim.g:6401:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=92 && LA133_0<=93)||(LA133_0>=124 && LA133_0<=126)) ) {
                alt133=1;
            }
            else if ( (LA133_0==RULE_ID||(LA133_0>=RULE_NATURAL && LA133_0<=RULE_STRING)||LA133_0==44||(LA133_0>=69 && LA133_0<=77)||LA133_0==81||(LA133_0>=84 && LA133_0<=89)) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // InternalSim.g:6402:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    {
                    // InternalSim.g:6402:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    // InternalSim.g:6403:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    {
                    // InternalSim.g:6403:4: ()
                    // InternalSim.g:6404:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSim.g:6410:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalSim.g:6411:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalSim.g:6411:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalSim.g:6412:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
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

                    // InternalSim.g:6429:4: ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    // InternalSim.g:6430:5: (lv_operand_2_0= ruleDUnaryOperation )
                    {
                    // InternalSim.g:6430:5: (lv_operand_2_0= ruleDUnaryOperation )
                    // InternalSim.g:6431:6: lv_operand_2_0= ruleDUnaryOperation
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
                    // InternalSim.g:6450:3: this_DCastExpression_3= ruleDCastExpression
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
    // InternalSim.g:6462:1: entryRuleDCastExpression returns [EObject current=null] : iv_ruleDCastExpression= ruleDCastExpression EOF ;
    public final EObject entryRuleDCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCastExpression = null;


        try {
            // InternalSim.g:6462:56: (iv_ruleDCastExpression= ruleDCastExpression EOF )
            // InternalSim.g:6463:2: iv_ruleDCastExpression= ruleDCastExpression EOF
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
    // InternalSim.g:6469:1: ruleDCastExpression returns [EObject current=null] : (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DTypedMemberReference_0 = null;



        	enterRule();

        try {
            // InternalSim.g:6475:2: ( (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalSim.g:6476:2: (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalSim.g:6476:2: (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalSim.g:6477:3: this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDCastExpressionAccess().getDTypedMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_80);
            this_DTypedMemberReference_0=ruleDTypedMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DTypedMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6485:3: ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==66) ) {
                int LA134_1 = input.LA(2);

                if ( (synpred9_InternalSim()) ) {
                    alt134=1;
                }
            }
            else if ( (LA134_0==20) ) {
                int LA134_2 = input.LA(2);

                if ( (synpred9_InternalSim()) ) {
                    alt134=1;
                }
            }
            switch (alt134) {
                case 1 :
                    // InternalSim.g:6486:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSim.g:6486:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) )
                    // InternalSim.g:6487:5: ( ( () ruleOpCast ) )=> ( () ruleOpCast )
                    {
                    // InternalSim.g:6493:5: ( () ruleOpCast )
                    // InternalSim.g:6494:6: () ruleOpCast
                    {
                    // InternalSim.g:6494:6: ()
                    // InternalSim.g:6495:7: 
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
                    pushFollow(FOLLOW_5);
                    ruleOpCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSim.g:6510:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSim.g:6511:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSim.g:6511:5: (otherlv_3= RULE_ID )
                    // InternalSim.g:6512:6: otherlv_3= RULE_ID
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
    // InternalSim.g:6528:1: entryRuleOpCast returns [String current=null] : iv_ruleOpCast= ruleOpCast EOF ;
    public final String entryRuleOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCast = null;


        try {
            // InternalSim.g:6528:46: (iv_ruleOpCast= ruleOpCast EOF )
            // InternalSim.g:6529:2: iv_ruleOpCast= ruleOpCast EOF
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
    // InternalSim.g:6535:1: ruleOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:6541:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalSim.g:6542:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalSim.g:6542:2: (kw= 'AS' | kw= 'as' )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==66) ) {
                alt135=1;
            }
            else if ( (LA135_0==20) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // InternalSim.g:6543:3: kw= 'AS'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:6549:3: kw= 'as'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:6558:1: entryRuleDTypedMemberReference returns [EObject current=null] : iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF ;
    public final EObject entryRuleDTypedMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTypedMemberReference = null;


        try {
            // InternalSim.g:6558:62: (iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF )
            // InternalSim.g:6559:2: iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF
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
    // InternalSim.g:6565:1: ruleDTypedMemberReference returns [EObject current=null] : (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) ;
    public final EObject ruleDTypedMemberReference() throws RecognitionException {
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
            // InternalSim.g:6571:2: ( (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) )
            // InternalSim.g:6572:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            {
            // InternalSim.g:6572:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            // InternalSim.g:6573:3: this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_81);
            this_DPrimaryExpression_0=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:6581:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            loop139:
            do {
                int alt139=3;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==67) ) {
                    int LA139_2 = input.LA(2);

                    if ( (synpred10_InternalSim()) ) {
                        alt139=1;
                    }
                    else if ( (synpred11_InternalSim()) ) {
                        alt139=2;
                    }


                }


                switch (alt139) {
            	case 1 :
            	    // InternalSim.g:6582:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    {
            	    // InternalSim.g:6582:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    // InternalSim.g:6583:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) )
            	    {
            	    // InternalSim.g:6583:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // InternalSim.g:6584:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalSim.g:6596:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // InternalSim.g:6597:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // InternalSim.g:6597:7: ()
            	    // InternalSim.g:6598:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,67,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalSim.g:6608:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalSim.g:6609:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalSim.g:6609:8: (otherlv_3= RULE_ID )
            	    // InternalSim.g:6610:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_72);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalSim.g:6630:5: ( (lv_value_5_0= ruleDAssignment ) )
            	    // InternalSim.g:6631:6: (lv_value_5_0= ruleDAssignment )
            	    {
            	    // InternalSim.g:6631:6: (lv_value_5_0= ruleDAssignment )
            	    // InternalSim.g:6632:7: lv_value_5_0= ruleDAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_81);
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
            	    // InternalSim.g:6651:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    {
            	    // InternalSim.g:6651:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    // InternalSim.g:6652:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    {
            	    // InternalSim.g:6652:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalSim.g:6653:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalSim.g:6659:6: ( () otherlv_7= '.' )
            	    // InternalSim.g:6660:7: () otherlv_7= '.'
            	    {
            	    // InternalSim.g:6660:7: ()
            	    // InternalSim.g:6661:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerReferenceAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,67,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalSim.g:6673:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalSim.g:6674:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalSim.g:6674:6: (otherlv_8= RULE_ID )
            	    // InternalSim.g:6675:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_82); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalSim.g:6686:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    int alt138=3;
            	    int LA138_0 = input.LA(1);

            	    if ( (LA138_0==44) && (synpred12_InternalSim())) {
            	        alt138=1;
            	    }
            	    else if ( (LA138_0==68) ) {
            	        alt138=2;
            	    }
            	    switch (alt138) {
            	        case 1 :
            	            // InternalSim.g:6687:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            {
            	            // InternalSim.g:6687:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            // InternalSim.g:6688:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')'
            	            {
            	            // InternalSim.g:6688:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalSim.g:6689:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalSim.g:6693:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalSim.g:6694:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,44,FOLLOW_83); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_explicitOperationCall_9_0, grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	              									}
            	              									setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              								
            	            }

            	            }


            	            }

            	            // InternalSim.g:6706:7: ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )?
            	            int alt137=2;
            	            int LA137_0 = input.LA(1);

            	            if ( ((LA137_0>=RULE_ID && LA137_0<=RULE_PLAIN_TEXT_START)||(LA137_0>=RULE_NATURAL && LA137_0<=RULE_STRING)||LA137_0==44||(LA137_0>=69 && LA137_0<=77)||LA137_0==81||(LA137_0>=84 && LA137_0<=89)||(LA137_0>=92 && LA137_0<=93)||(LA137_0>=124 && LA137_0<=126)) ) {
            	                alt137=1;
            	            }
            	            switch (alt137) {
            	                case 1 :
            	                    // InternalSim.g:6707:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    {
            	                    // InternalSim.g:6707:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) )
            	                    // InternalSim.g:6708:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    {
            	                    // InternalSim.g:6708:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    // InternalSim.g:6709:10: lv_memberCallArguments_10_0= ruleDExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_0_0());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_44);
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

            	                    // InternalSim.g:6726:8: (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    loop136:
            	                    do {
            	                        int alt136=2;
            	                        int LA136_0 = input.LA(1);

            	                        if ( (LA136_0==33) ) {
            	                            alt136=1;
            	                        }


            	                        switch (alt136) {
            	                    	case 1 :
            	                    	    // InternalSim.g:6727:9: otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,33,FOLLOW_50); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newLeafNode(otherlv_11, grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    // InternalSim.g:6731:9: ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    // InternalSim.g:6732:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    {
            	                    	    // InternalSim.g:6732:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    // InternalSim.g:6733:11: lv_memberCallArguments_12_0= ruleDExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_1_1_0());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_44);
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
            	                    	    break loop136;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,46,FOLLOW_81); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_13, grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSim.g:6758:6: ( (lv_before_14_0= '@before' ) )
            	            {
            	            // InternalSim.g:6758:6: ( (lv_before_14_0= '@before' ) )
            	            // InternalSim.g:6759:7: (lv_before_14_0= '@before' )
            	            {
            	            // InternalSim.g:6759:7: (lv_before_14_0= '@before' )
            	            // InternalSim.g:6760:8: lv_before_14_0= '@before'
            	            {
            	            lv_before_14_0=(Token)match(input,68,FOLLOW_81); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_before_14_0, grammarAccess.getDTypedMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
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
            	    break loop139;
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
    // InternalSim.g:6779:1: entryRuleDPrimaryExpression returns [EObject current=null] : iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF ;
    public final EObject entryRuleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimaryExpression = null;


        try {
            // InternalSim.g:6779:59: (iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF )
            // InternalSim.g:6780:2: iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF
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
    // InternalSim.g:6786:1: ruleDPrimaryExpression returns [EObject current=null] : (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) ;
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
            // InternalSim.g:6792:2: ( (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) )
            // InternalSim.g:6793:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            {
            // InternalSim.g:6793:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            int alt140=10;
            alt140 = dfa140.predict(input);
            switch (alt140) {
                case 1 :
                    // InternalSim.g:6794:3: this_DLiteralExpression_0= ruleDLiteralExpression
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
                    // InternalSim.g:6803:3: this_DSelfExpression_1= ruleDSelfExpression
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
                    // InternalSim.g:6812:3: this_DReturnExpression_2= ruleDReturnExpression
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
                    // InternalSim.g:6821:3: this_DRaiseExpression_3= ruleDRaiseExpression
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
                    // InternalSim.g:6830:3: this_DParenthesizedExpression_4= ruleDParenthesizedExpression
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
                    // InternalSim.g:6839:3: this_DFunctionCall_5= ruleDFunctionCall
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
                    // InternalSim.g:6848:3: this_DConstructorCall_6= ruleDConstructorCall
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
                    // InternalSim.g:6857:3: this_DContextReference_7= ruleDContextReference
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
                    // InternalSim.g:6866:3: this_DIfExpression_8= ruleDIfExpression
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
                    // InternalSim.g:6875:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    {
                    // InternalSim.g:6875:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    // InternalSim.g:6876:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression
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
    // InternalSim.g:6901:1: entryRuleDLiteralExpression returns [EObject current=null] : iv_ruleDLiteralExpression= ruleDLiteralExpression EOF ;
    public final EObject entryRuleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteralExpression = null;


        try {
            // InternalSim.g:6901:59: (iv_ruleDLiteralExpression= ruleDLiteralExpression EOF )
            // InternalSim.g:6902:2: iv_ruleDLiteralExpression= ruleDLiteralExpression EOF
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
    // InternalSim.g:6908:1: ruleDLiteralExpression returns [EObject current=null] : (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) ;
    public final EObject ruleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DBooleanLiteral_0 = null;

        EObject this_DStringLiteral_1 = null;

        EObject this_DNaturalLiteral_2 = null;

        EObject this_DDecimalLiteral_3 = null;

        EObject this_DNilLiteral_4 = null;



        	enterRule();

        try {
            // InternalSim.g:6914:2: ( (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) )
            // InternalSim.g:6915:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            {
            // InternalSim.g:6915:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            int alt141=5;
            switch ( input.LA(1) ) {
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt141=1;
                }
                break;
            case RULE_STRING:
                {
                alt141=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA141_3 = input.LA(2);

                if ( (LA141_3==67) ) {
                    int LA141_5 = input.LA(3);

                    if ( (LA141_5==RULE_NATURAL) ) {
                        alt141=4;
                    }
                    else if ( (LA141_5==RULE_ID) ) {
                        alt141=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA141_3==EOF||(LA141_3>=RULE_ID && LA141_3<=RULE_PLAIN_TEXT_END)||(LA141_3>=20 && LA141_3<=21)||LA141_3==25||(LA141_3>=29 && LA141_3<=33)||(LA141_3>=35 && LA141_3<=37)||(LA141_3>=39 && LA141_3<=41)||(LA141_3>=45 && LA141_3<=46)||LA141_3==50||(LA141_3>=52 && LA141_3<=55)||LA141_3==61||(LA141_3>=64 && LA141_3<=66)||(LA141_3>=78 && LA141_3<=80)||(LA141_3>=82 && LA141_3<=83)||(LA141_3>=92 && LA141_3<=93)||LA141_3==100||(LA141_3>=105 && LA141_3<=123)) ) {
                    alt141=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 141, 3, input);

                    throw nvae;
                }
                }
                break;
            case 88:
            case 89:
                {
                alt141=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // InternalSim.g:6916:3: this_DBooleanLiteral_0= ruleDBooleanLiteral
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
                    // InternalSim.g:6925:3: this_DStringLiteral_1= ruleDStringLiteral
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
                    // InternalSim.g:6934:3: this_DNaturalLiteral_2= ruleDNaturalLiteral
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
                    // InternalSim.g:6943:3: this_DDecimalLiteral_3= ruleDDecimalLiteral
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
                    // InternalSim.g:6952:3: this_DNilLiteral_4= ruleDNilLiteral
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
    // InternalSim.g:6964:1: entryRuleDSelfExpression returns [EObject current=null] : iv_ruleDSelfExpression= ruleDSelfExpression EOF ;
    public final EObject entryRuleDSelfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSelfExpression = null;


        try {
            // InternalSim.g:6964:56: (iv_ruleDSelfExpression= ruleDSelfExpression EOF )
            // InternalSim.g:6965:2: iv_ruleDSelfExpression= ruleDSelfExpression EOF
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
    // InternalSim.g:6971:1: ruleDSelfExpression returns [EObject current=null] : ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) ;
    public final EObject ruleDSelfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSim.g:6977:2: ( ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) )
            // InternalSim.g:6978:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            {
            // InternalSim.g:6978:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            // InternalSim.g:6979:3: () (otherlv_1= 'SELF' | otherlv_2= 'self' )
            {
            // InternalSim.g:6979:3: ()
            // InternalSim.g:6980:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:6986:3: (otherlv_1= 'SELF' | otherlv_2= 'self' )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==69) ) {
                alt142=1;
            }
            else if ( (LA142_0==70) ) {
                alt142=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // InternalSim.g:6987:4: otherlv_1= 'SELF'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:6992:4: otherlv_2= 'self'
                    {
                    otherlv_2=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7001:1: entryRuleDReturnExpression returns [EObject current=null] : iv_ruleDReturnExpression= ruleDReturnExpression EOF ;
    public final EObject entryRuleDReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReturnExpression = null;


        try {
            // InternalSim.g:7001:58: (iv_ruleDReturnExpression= ruleDReturnExpression EOF )
            // InternalSim.g:7002:2: iv_ruleDReturnExpression= ruleDReturnExpression EOF
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
    // InternalSim.g:7008:1: ruleDReturnExpression returns [EObject current=null] : ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? ) ;
    public final EObject ruleDReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:7014:2: ( ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? ) )
            // InternalSim.g:7015:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? )
            {
            // InternalSim.g:7015:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? )
            // InternalSim.g:7016:3: () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?
            {
            // InternalSim.g:7016:3: ()
            // InternalSim.g:7017:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7023:3: (otherlv_1= 'RETURN' | otherlv_2= 'return' )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==71) ) {
                alt143=1;
            }
            else if ( (LA143_0==72) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalSim.g:7024:4: otherlv_1= 'RETURN'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:7029:4: otherlv_2= 'return'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSim.g:7034:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?
            int alt144=2;
            alt144 = dfa144.predict(input);
            switch (alt144) {
                case 1 :
                    // InternalSim.g:7035:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression )
                    {
                    // InternalSim.g:7036:4: (lv_expression_3_0= ruleDExpression )
                    // InternalSim.g:7037:5: lv_expression_3_0= ruleDExpression
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
    // InternalSim.g:7058:1: entryRuleDRaiseExpression returns [EObject current=null] : iv_ruleDRaiseExpression= ruleDRaiseExpression EOF ;
    public final EObject entryRuleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRaiseExpression = null;


        try {
            // InternalSim.g:7058:57: (iv_ruleDRaiseExpression= ruleDRaiseExpression EOF )
            // InternalSim.g:7059:2: iv_ruleDRaiseExpression= ruleDRaiseExpression EOF
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
    // InternalSim.g:7065:1: ruleDRaiseExpression returns [EObject current=null] : ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) ;
    public final EObject ruleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:7071:2: ( ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) )
            // InternalSim.g:7072:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            {
            // InternalSim.g:7072:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            // InternalSim.g:7073:3: () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) )
            {
            // InternalSim.g:7073:3: ()
            // InternalSim.g:7074:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7080:3: (otherlv_1= 'RAISE' | otherlv_2= 'raise' )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==73) ) {
                alt145=1;
            }
            else if ( (LA145_0==74) ) {
                alt145=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // InternalSim.g:7081:4: otherlv_1= 'RAISE'
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:7086:4: otherlv_2= 'raise'
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSim.g:7091:3: ( (lv_expression_3_0= ruleDExpression ) )
            // InternalSim.g:7092:4: (lv_expression_3_0= ruleDExpression )
            {
            // InternalSim.g:7092:4: (lv_expression_3_0= ruleDExpression )
            // InternalSim.g:7093:5: lv_expression_3_0= ruleDExpression
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
    // InternalSim.g:7114:1: entryRuleDParenthesizedExpression returns [EObject current=null] : iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF ;
    public final EObject entryRuleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParenthesizedExpression = null;


        try {
            // InternalSim.g:7114:65: (iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF )
            // InternalSim.g:7115:2: iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF
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
    // InternalSim.g:7121:1: ruleDParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalSim.g:7127:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalSim.g:7128:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalSim.g:7128:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalSim.g:7129:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_43);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7149:1: entryRuleDFunctionCall returns [EObject current=null] : iv_ruleDFunctionCall= ruleDFunctionCall EOF ;
    public final EObject entryRuleDFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunctionCall = null;


        try {
            // InternalSim.g:7149:54: (iv_ruleDFunctionCall= ruleDFunctionCall EOF )
            // InternalSim.g:7150:2: iv_ruleDFunctionCall= ruleDFunctionCall EOF
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
    // InternalSim.g:7156:1: ruleDFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalSim.g:7162:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalSim.g:7163:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalSim.g:7163:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            // InternalSim.g:7164:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalSim.g:7164:3: ()
            // InternalSim.g:7165:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7171:3: ( (otherlv_1= RULE_ID ) )
            // InternalSim.g:7172:4: (otherlv_1= RULE_ID )
            {
            // InternalSim.g:7172:4: (otherlv_1= RULE_ID )
            // InternalSim.g:7173:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSim.g:7188:3: ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( ((LA147_0>=RULE_ID && LA147_0<=RULE_PLAIN_TEXT_START)||(LA147_0>=RULE_NATURAL && LA147_0<=RULE_STRING)||LA147_0==44||(LA147_0>=69 && LA147_0<=77)||LA147_0==81||(LA147_0>=84 && LA147_0<=89)||(LA147_0>=92 && LA147_0<=93)||(LA147_0>=124 && LA147_0<=126)) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalSim.g:7189:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    {
                    // InternalSim.g:7189:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) )
                    // InternalSim.g:7190:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    {
                    // InternalSim.g:7190:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    // InternalSim.g:7191:6: lv_functionCallArguments_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalSim.g:7208:4: (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==33) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // InternalSim.g:7209:5: otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_50); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalSim.g:7213:5: ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    // InternalSim.g:7214:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    {
                    	    // InternalSim.g:7214:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    // InternalSim.g:7215:7: lv_functionCallArguments_5_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop146;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7242:1: entryRuleDConstructorCall returns [EObject current=null] : iv_ruleDConstructorCall= ruleDConstructorCall EOF ;
    public final EObject entryRuleDConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstructorCall = null;


        try {
            // InternalSim.g:7242:57: (iv_ruleDConstructorCall= ruleDConstructorCall EOF )
            // InternalSim.g:7243:2: iv_ruleDConstructorCall= ruleDConstructorCall EOF
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
    // InternalSim.g:7249:1: ruleDConstructorCall returns [EObject current=null] : ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) ;
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
            // InternalSim.g:7255:2: ( ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) )
            // InternalSim.g:7256:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalSim.g:7256:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            // InternalSim.g:7257:3: () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            {
            // InternalSim.g:7257:3: ()
            // InternalSim.g:7258:4: 
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
            pushFollow(FOLLOW_5);
            ruleOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:7271:3: ( (otherlv_2= RULE_ID ) )
            // InternalSim.g:7272:4: (otherlv_2= RULE_ID )
            {
            // InternalSim.g:7272:4: (otherlv_2= RULE_ID )
            // InternalSim.g:7273:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConstructorCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalSim.g:7284:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==44) && (synpred15_InternalSim())) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalSim.g:7285:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')'
                    {
                    // InternalSim.g:7285:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalSim.g:7286:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalSim.g:7290:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalSim.g:7291:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,44,FOLLOW_83); if (state.failed) return current;
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

                    // InternalSim.g:7303:4: ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( ((LA149_0>=RULE_ID && LA149_0<=RULE_PLAIN_TEXT_START)||(LA149_0>=RULE_NATURAL && LA149_0<=RULE_STRING)||LA149_0==44||(LA149_0>=69 && LA149_0<=77)||LA149_0==81||(LA149_0>=84 && LA149_0<=89)||(LA149_0>=92 && LA149_0<=93)||(LA149_0>=124 && LA149_0<=126)) ) {
                        alt149=1;
                    }
                    switch (alt149) {
                        case 1 :
                            // InternalSim.g:7304:5: ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            {
                            // InternalSim.g:7304:5: ( (lv_arguments_4_0= ruleDExpression ) )
                            // InternalSim.g:7305:6: (lv_arguments_4_0= ruleDExpression )
                            {
                            // InternalSim.g:7305:6: (lv_arguments_4_0= ruleDExpression )
                            // InternalSim.g:7306:7: lv_arguments_4_0= ruleDExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_44);
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

                            // InternalSim.g:7323:5: (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            loop148:
                            do {
                                int alt148=2;
                                int LA148_0 = input.LA(1);

                                if ( (LA148_0==33) ) {
                                    alt148=1;
                                }


                                switch (alt148) {
                            	case 1 :
                            	    // InternalSim.g:7324:6: otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,33,FOLLOW_50); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalSim.g:7328:6: ( (lv_arguments_6_0= ruleDExpression ) )
                            	    // InternalSim.g:7329:7: (lv_arguments_6_0= ruleDExpression )
                            	    {
                            	    // InternalSim.g:7329:7: (lv_arguments_6_0= ruleDExpression )
                            	    // InternalSim.g:7330:8: lv_arguments_6_0= ruleDExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_44);
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
                            	    break loop148;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7358:1: entryRuleOpConstructor returns [String current=null] : iv_ruleOpConstructor= ruleOpConstructor EOF ;
    public final String entryRuleOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpConstructor = null;


        try {
            // InternalSim.g:7358:53: (iv_ruleOpConstructor= ruleOpConstructor EOF )
            // InternalSim.g:7359:2: iv_ruleOpConstructor= ruleOpConstructor EOF
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
    // InternalSim.g:7365:1: ruleOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:7371:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalSim.g:7372:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalSim.g:7372:2: (kw= 'NEW' | kw= 'new' )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==75) ) {
                alt151=1;
            }
            else if ( (LA151_0==76) ) {
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
                    // InternalSim.g:7373:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:7379:3: kw= 'new'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7388:1: entryRuleDContextReference returns [EObject current=null] : iv_ruleDContextReference= ruleDContextReference EOF ;
    public final EObject entryRuleDContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContextReference = null;


        try {
            // InternalSim.g:7388:58: (iv_ruleDContextReference= ruleDContextReference EOF )
            // InternalSim.g:7389:2: iv_ruleDContextReference= ruleDContextReference EOF
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
    // InternalSim.g:7395:1: ruleDContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) ;
    public final EObject ruleDContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:7401:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) )
            // InternalSim.g:7402:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
            {
            // InternalSim.g:7402:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
            // InternalSim.g:7403:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )?
            {
            // InternalSim.g:7403:3: ()
            // InternalSim.g:7404:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7410:3: ( (otherlv_1= RULE_ID ) )
            // InternalSim.g:7411:4: (otherlv_1= RULE_ID )
            {
            // InternalSim.g:7411:4: (otherlv_1= RULE_ID )
            // InternalSim.g:7412:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalSim.g:7423:3: ( (lv_before_2_0= '@before' ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==68) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalSim.g:7424:4: (lv_before_2_0= '@before' )
                    {
                    // InternalSim.g:7424:4: (lv_before_2_0= '@before' )
                    // InternalSim.g:7425:5: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_before_2_0, grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_2_0());
                      				
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSim.g:7441:1: entryRuleDIfExpression returns [EObject current=null] : iv_ruleDIfExpression= ruleDIfExpression EOF ;
    public final EObject entryRuleDIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIfExpression = null;


        try {
            // InternalSim.g:7441:54: (iv_ruleDIfExpression= ruleDIfExpression EOF )
            // InternalSim.g:7442:2: iv_ruleDIfExpression= ruleDIfExpression EOF
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
    // InternalSim.g:7448:1: ruleDIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalSim.g:7454:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalSim.g:7455:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalSim.g:7455:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalSim.g:7456:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalSim.g:7456:3: ()
            // InternalSim.g:7457:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalSim.g:7467:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalSim.g:7468:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalSim.g:7468:4: (lv_if_2_0= ruleDExpression )
            // InternalSim.g:7469:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_86);
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

            otherlv_3=(Token)match(input,78,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalSim.g:7490:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalSim.g:7491:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalSim.g:7491:4: (lv_then_4_0= ruleDExpression )
            // InternalSim.g:7492:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_87);
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

            // InternalSim.g:7509:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==79) && (synpred16_InternalSim())) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalSim.g:7510:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalSim.g:7510:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalSim.g:7511:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,79,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalSim.g:7517:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalSim.g:7518:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalSim.g:7518:5: (lv_else_6_0= ruleDExpression )
                    // InternalSim.g:7519:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_88);
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

            otherlv_7=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7545:1: entryRuleDForLoopExpression returns [EObject current=null] : iv_ruleDForLoopExpression= ruleDForLoopExpression EOF ;
    public final EObject entryRuleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDForLoopExpression = null;


        try {
            // InternalSim.g:7545:59: (iv_ruleDForLoopExpression= ruleDForLoopExpression EOF )
            // InternalSim.g:7546:2: iv_ruleDForLoopExpression= ruleDForLoopExpression EOF
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
    // InternalSim.g:7552:1: ruleDForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) ;
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
            // InternalSim.g:7558:2: ( ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) )
            // InternalSim.g:7559:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            {
            // InternalSim.g:7559:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            // InternalSim.g:7560:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end'
            {
            // InternalSim.g:7560:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) )
            // InternalSim.g:7561:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            {
            // InternalSim.g:7573:4: ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            // InternalSim.g:7574:5: () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':'
            {
            // InternalSim.g:7574:5: ()
            // InternalSim.g:7575:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            // InternalSim.g:7585:5: ( (lv_declaredParam_2_0= RULE_ID ) )
            // InternalSim.g:7586:6: (lv_declaredParam_2_0= RULE_ID )
            {
            // InternalSim.g:7586:6: (lv_declaredParam_2_0= RULE_ID )
            // InternalSim.g:7587:7: lv_declaredParam_2_0= RULE_ID
            {
            lv_declaredParam_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,24,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3());
              				
            }

            }


            }

            // InternalSim.g:7609:3: ( (lv_forExpression_4_0= ruleDExpression ) )
            // InternalSim.g:7610:4: (lv_forExpression_4_0= ruleDExpression )
            {
            // InternalSim.g:7610:4: (lv_forExpression_4_0= ruleDExpression )
            // InternalSim.g:7611:5: lv_forExpression_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_89);
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

            otherlv_5=(Token)match(input,82,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2());
              		
            }
            // InternalSim.g:7632:3: ( (lv_eachExpression_6_0= ruleDExpression ) )
            // InternalSim.g:7633:4: (lv_eachExpression_6_0= ruleDExpression )
            {
            // InternalSim.g:7633:4: (lv_eachExpression_6_0= ruleDExpression )
            // InternalSim.g:7634:5: lv_eachExpression_6_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_88);
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

            otherlv_7=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDMultiplicity"
    // InternalSim.g:7659:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalSim.g:7659:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalSim.g:7660:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalSim.g:7666:1: ruleDMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleDMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:7672:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalSim.g:7673:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalSim.g:7673:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalSim.g:7674:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalSim.g:7678:3: ( (lv_minOccurs_1_0= RULE_NATURAL ) )
            // InternalSim.g:7679:4: (lv_minOccurs_1_0= RULE_NATURAL )
            {
            // InternalSim.g:7679:4: (lv_minOccurs_1_0= RULE_NATURAL )
            // InternalSim.g:7680:5: lv_minOccurs_1_0= RULE_NATURAL
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_91); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,83,FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalSim.g:7700:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalSim.g:7701:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalSim.g:7701:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalSim.g:7702:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_43);
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

            otherlv_4=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMULTIPLICITY"
    // InternalSim.g:7727:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalSim.g:7727:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalSim.g:7728:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalSim.g:7734:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:7740:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalSim.g:7741:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalSim.g:7741:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==RULE_NATURAL) ) {
                alt154=1;
            }
            else if ( (LA154_0==45) ) {
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
                    // InternalSim.g:7742:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalSim.g:7750:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7759:1: entryRuleDBooleanLiteral returns [EObject current=null] : iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF ;
    public final EObject entryRuleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBooleanLiteral = null;


        try {
            // InternalSim.g:7759:56: (iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF )
            // InternalSim.g:7760:2: iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF
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
    // InternalSim.g:7766:1: ruleDBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSim.g:7772:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalSim.g:7773:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalSim.g:7773:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalSim.g:7774:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalSim.g:7774:3: ()
            // InternalSim.g:7775:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7781:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt155=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt155=1;
                }
                break;
            case 85:
                {
                alt155=2;
                }
                break;
            case 86:
                {
                alt155=3;
                }
                break;
            case 87:
                {
                alt155=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }

            switch (alt155) {
                case 1 :
                    // InternalSim.g:7782:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalSim.g:7782:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalSim.g:7783:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalSim.g:7783:5: (lv_value_1_0= 'TRUE' )
                    // InternalSim.g:7784:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSim.g:7797:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalSim.g:7797:4: ( (lv_value_2_0= 'true' ) )
                    // InternalSim.g:7798:5: (lv_value_2_0= 'true' )
                    {
                    // InternalSim.g:7798:5: (lv_value_2_0= 'true' )
                    // InternalSim.g:7799:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSim.g:7812:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalSim.g:7817:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7826:1: entryRuleDStringLiteral returns [EObject current=null] : iv_ruleDStringLiteral= ruleDStringLiteral EOF ;
    public final EObject entryRuleDStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStringLiteral = null;


        try {
            // InternalSim.g:7826:55: (iv_ruleDStringLiteral= ruleDStringLiteral EOF )
            // InternalSim.g:7827:2: iv_ruleDStringLiteral= ruleDStringLiteral EOF
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
    // InternalSim.g:7833:1: ruleDStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSim.g:7839:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalSim.g:7840:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalSim.g:7840:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalSim.g:7841:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalSim.g:7841:3: ()
            // InternalSim.g:7842:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7848:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSim.g:7849:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalSim.g:7849:4: (lv_value_1_0= RULE_STRING )
            // InternalSim.g:7850:5: lv_value_1_0= RULE_STRING
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
    // InternalSim.g:7870:1: entryRuleDNaturalLiteral returns [EObject current=null] : iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF ;
    public final EObject entryRuleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNaturalLiteral = null;


        try {
            // InternalSim.g:7870:56: (iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF )
            // InternalSim.g:7871:2: iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF
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
    // InternalSim.g:7877:1: ruleDNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSim.g:7883:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalSim.g:7884:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalSim.g:7884:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalSim.g:7885:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalSim.g:7885:3: ()
            // InternalSim.g:7886:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7892:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalSim.g:7893:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalSim.g:7893:4: (lv_value_1_0= RULE_NATURAL )
            // InternalSim.g:7894:5: lv_value_1_0= RULE_NATURAL
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
    // InternalSim.g:7914:1: entryRuleDDecimalLiteral returns [EObject current=null] : iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF ;
    public final EObject entryRuleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDecimalLiteral = null;


        try {
            // InternalSim.g:7914:56: (iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF )
            // InternalSim.g:7915:2: iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF
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
    // InternalSim.g:7921:1: ruleDDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSim.g:7927:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalSim.g:7928:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalSim.g:7928:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalSim.g:7929:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalSim.g:7929:3: ()
            // InternalSim.g:7930:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7936:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalSim.g:7937:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalSim.g:7937:4: (lv_value_1_0= ruleDECIMAL )
            // InternalSim.g:7938:5: lv_value_1_0= ruleDECIMAL
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
    // InternalSim.g:7959:1: entryRuleDNilLiteral returns [EObject current=null] : iv_ruleDNilLiteral= ruleDNilLiteral EOF ;
    public final EObject entryRuleDNilLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNilLiteral = null;


        try {
            // InternalSim.g:7959:52: (iv_ruleDNilLiteral= ruleDNilLiteral EOF )
            // InternalSim.g:7960:2: iv_ruleDNilLiteral= ruleDNilLiteral EOF
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
    // InternalSim.g:7966:1: ruleDNilLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDNilLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSim.g:7972:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalSim.g:7973:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalSim.g:7973:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalSim.g:7974:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalSim.g:7974:3: ()
            // InternalSim.g:7975:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNilLiteralAccess().getDUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalSim.g:7981:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==88) ) {
                alt156=1;
            }
            else if ( (LA156_0==89) ) {
                alt156=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // InternalSim.g:7982:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDNilLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSim.g:7987:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:7996:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalSim.g:7996:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalSim.g:7997:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalSim.g:8003:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalSim.g:8009:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalSim.g:8010:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalSim.g:8010:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalSim.g:8011:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalSim.g:8030:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( ((LA159_0>=90 && LA159_0<=91)) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalSim.g:8031:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalSim.g:8031:4: (kw= 'E' | kw= 'e' )
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==90) ) {
                        alt157=1;
                    }
                    else if ( (LA157_0==91) ) {
                        alt157=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 157, 0, input);

                        throw nvae;
                    }
                    switch (alt157) {
                        case 1 :
                            // InternalSim.g:8032:5: kw= 'E'
                            {
                            kw=(Token)match(input,90,FOLLOW_95); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:8038:5: kw= 'e'
                            {
                            kw=(Token)match(input,91,FOLLOW_95); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSim.g:8044:4: (kw= '+' | kw= '-' )?
                    int alt158=3;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==92) ) {
                        alt158=1;
                    }
                    else if ( (LA158_0==93) ) {
                        alt158=2;
                    }
                    switch (alt158) {
                        case 1 :
                            // InternalSim.g:8045:5: kw= '+'
                            {
                            kw=(Token)match(input,92,FOLLOW_90); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSim.g:8051:5: kw= '-'
                            {
                            kw=(Token)match(input,93,FOLLOW_90); if (state.failed) return current;
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
    // InternalSim.g:8069:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalSim.g:8069:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalSim.g:8070:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalSim.g:8076:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSim.g:8082:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalSim.g:8083:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalSim.g:8083:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalSim.g:8084:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_96);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSim.g:8094:3: (kw= '.*' )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==94) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalSim.g:8095:4: kw= '.*'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8105:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalSim.g:8105:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalSim.g:8106:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalSim.g:8112:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSim.g:8118:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSim.g:8119:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSim.g:8119:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSim.g:8120:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSim.g:8127:3: (kw= '.' this_ID_2= RULE_ID )*
            loop161:
            do {
                int alt161=2;
                int LA161_0 = input.LA(1);

                if ( (LA161_0==67) ) {
                    alt161=1;
                }


                switch (alt161) {
            	case 1 :
            	    // InternalSim.g:8128:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,67,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_81); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop161;
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
    // InternalSim.g:8145:1: ruleSInformationModelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) ) ;
    public final Enumerator ruleSInformationModelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:8151:2: ( ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) ) )
            // InternalSim.g:8152:2: ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) )
            {
            // InternalSim.g:8152:2: ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) )
            int alt162=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt162=1;
                }
                break;
            case 96:
                {
                alt162=2;
                }
                break;
            case 97:
                {
                alt162=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }

            switch (alt162) {
                case 1 :
                    // InternalSim.g:8153:3: (enumLiteral_0= 'base' )
                    {
                    // InternalSim.g:8153:3: (enumLiteral_0= 'base' )
                    // InternalSim.g:8154:4: enumLiteral_0= 'base'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8161:3: (enumLiteral_1= 'interface' )
                    {
                    // InternalSim.g:8161:3: (enumLiteral_1= 'interface' )
                    // InternalSim.g:8162:4: enumLiteral_1= 'interface'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8169:3: (enumLiteral_2= 'core' )
                    {
                    // InternalSim.g:8169:3: (enumLiteral_2= 'core' )
                    // InternalSim.g:8170:4: enumLiteral_2= 'core'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8180:1: ruleSAbstractType returns [Enumerator current=null] : ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) ) ;
    public final Enumerator ruleSAbstractType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8186:2: ( ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) ) )
            // InternalSim.g:8187:2: ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) )
            {
            // InternalSim.g:8187:2: ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==98) ) {
                alt163=1;
            }
            else if ( (LA163_0==53) ) {
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
                    // InternalSim.g:8188:3: (enumLiteral_0= 'nonabstract' )
                    {
                    // InternalSim.g:8188:3: (enumLiteral_0= 'nonabstract' )
                    // InternalSim.g:8189:4: enumLiteral_0= 'nonabstract'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSAbstractTypeAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSAbstractTypeAccess().getFALSEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8196:3: (enumLiteral_1= 'abstract' )
                    {
                    // InternalSim.g:8196:3: (enumLiteral_1= 'abstract' )
                    // InternalSim.g:8197:4: enumLiteral_1= 'abstract'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8207:1: ruleSRootEntity returns [Enumerator current=null] : ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) ) ;
    public final Enumerator ruleSRootEntity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8213:2: ( ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) ) )
            // InternalSim.g:8214:2: ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) )
            {
            // InternalSim.g:8214:2: ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==99) ) {
                alt164=1;
            }
            else if ( (LA164_0==35) ) {
                alt164=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // InternalSim.g:8215:3: (enumLiteral_0= 'nonroot' )
                    {
                    // InternalSim.g:8215:3: (enumLiteral_0= 'nonroot' )
                    // InternalSim.g:8216:4: enumLiteral_0= 'nonroot'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSRootEntityAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSRootEntityAccess().getFALSEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8223:3: (enumLiteral_1= 'root' )
                    {
                    // InternalSim.g:8223:3: (enumLiteral_1= 'root' )
                    // InternalSim.g:8224:4: enumLiteral_1= 'root'
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


    // $ANTLR start "ruleDAssociationKind"
    // InternalSim.g:8234:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8240:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalSim.g:8241:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalSim.g:8241:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==40) ) {
                alt165=1;
            }
            else if ( (LA165_0==41) ) {
                alt165=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }
            switch (alt165) {
                case 1 :
                    // InternalSim.g:8242:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalSim.g:8242:3: (enumLiteral_0= 'reference' )
                    // InternalSim.g:8243:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8250:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalSim.g:8250:3: (enumLiteral_1= 'composite' )
                    // InternalSim.g:8251:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8261:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSim.g:8267:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalSim.g:8268:2: (enumLiteral_0= 'inverse' )
            {
            // InternalSim.g:8268:2: (enumLiteral_0= 'inverse' )
            // InternalSim.g:8269:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8278:1: ruleDServiceKind returns [Enumerator current=null] : ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) ) ;
    public final Enumerator ruleDServiceKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8284:2: ( ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) ) )
            // InternalSim.g:8285:2: ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) )
            {
            // InternalSim.g:8285:2: ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==101) ) {
                alt166=1;
            }
            else if ( (LA166_0==102) ) {
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
                    // InternalSim.g:8286:3: (enumLiteral_0= 'synchronous' )
                    {
                    // InternalSim.g:8286:3: (enumLiteral_0= 'synchronous' )
                    // InternalSim.g:8287:4: enumLiteral_0= 'synchronous'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8294:3: (enumLiteral_1= 'async' )
                    {
                    // InternalSim.g:8294:3: (enumLiteral_1= 'async' )
                    // InternalSim.g:8295:4: enumLiteral_1= 'async'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8305:1: ruleDDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleDDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8311:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalSim.g:8312:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalSim.g:8312:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==103) ) {
                alt167=1;
            }
            else if ( (LA167_0==104) ) {
                alt167=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }
            switch (alt167) {
                case 1 :
                    // InternalSim.g:8313:3: (enumLiteral_0= 'in' )
                    {
                    // InternalSim.g:8313:3: (enumLiteral_0= 'in' )
                    // InternalSim.g:8314:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8321:3: (enumLiteral_1= 'out' )
                    {
                    // InternalSim.g:8321:3: (enumLiteral_1= 'out' )
                    // InternalSim.g:8322:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8332:1: ruleOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSim.g:8338:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalSim.g:8339:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalSim.g:8339:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt168=4;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt168=1;
                }
                break;
            case 106:
                {
                alt168=2;
                }
                break;
            case 107:
                {
                alt168=3;
                }
                break;
            case 108:
                {
                alt168=4;
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
                    // InternalSim.g:8340:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalSim.g:8340:3: (enumLiteral_0= 'OR' )
                    // InternalSim.g:8341:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8348:3: (enumLiteral_1= 'or' )
                    {
                    // InternalSim.g:8348:3: (enumLiteral_1= 'or' )
                    // InternalSim.g:8349:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8356:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalSim.g:8356:3: (enumLiteral_2= 'XOR' )
                    // InternalSim.g:8357:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8364:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalSim.g:8364:3: (enumLiteral_3= 'xor' )
                    // InternalSim.g:8365:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8375:1: ruleOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8381:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalSim.g:8382:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalSim.g:8382:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==109) ) {
                alt169=1;
            }
            else if ( (LA169_0==21) ) {
                alt169=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;
            }
            switch (alt169) {
                case 1 :
                    // InternalSim.g:8383:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalSim.g:8383:3: (enumLiteral_0= 'AND' )
                    // InternalSim.g:8384:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8391:3: (enumLiteral_1= 'and' )
                    {
                    // InternalSim.g:8391:3: (enumLiteral_1= 'and' )
                    // InternalSim.g:8392:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8402:1: ruleOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:8408:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalSim.g:8409:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalSim.g:8409:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt170=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt170=1;
                }
                break;
            case 111:
                {
                alt170=2;
                }
                break;
            case 112:
                {
                alt170=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 170, 0, input);

                throw nvae;
            }

            switch (alt170) {
                case 1 :
                    // InternalSim.g:8410:3: (enumLiteral_0= '=' )
                    {
                    // InternalSim.g:8410:3: (enumLiteral_0= '=' )
                    // InternalSim.g:8411:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8418:3: (enumLiteral_1= '!=' )
                    {
                    // InternalSim.g:8418:3: (enumLiteral_1= '!=' )
                    // InternalSim.g:8419:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8426:3: (enumLiteral_2= '<>' )
                    {
                    // InternalSim.g:8426:3: (enumLiteral_2= '<>' )
                    // InternalSim.g:8427:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8437:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalSim.g:8443:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalSim.g:8444:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalSim.g:8444:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt171=6;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt171=1;
                }
                break;
            case 114:
                {
                alt171=2;
                }
                break;
            case 115:
                {
                alt171=3;
                }
                break;
            case 116:
                {
                alt171=4;
                }
                break;
            case 117:
                {
                alt171=5;
                }
                break;
            case 118:
                {
                alt171=6;
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
                    // InternalSim.g:8445:3: (enumLiteral_0= '<' )
                    {
                    // InternalSim.g:8445:3: (enumLiteral_0= '<' )
                    // InternalSim.g:8446:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8453:3: (enumLiteral_1= '<=' )
                    {
                    // InternalSim.g:8453:3: (enumLiteral_1= '<=' )
                    // InternalSim.g:8454:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8461:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalSim.g:8461:3: (enumLiteral_2= '\\u2264' )
                    // InternalSim.g:8462:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8469:3: (enumLiteral_3= '>=' )
                    {
                    // InternalSim.g:8469:3: (enumLiteral_3= '>=' )
                    // InternalSim.g:8470:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:8477:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalSim.g:8477:3: (enumLiteral_4= '\\u2265' )
                    // InternalSim.g:8478:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSim.g:8485:3: (enumLiteral_5= '>' )
                    {
                    // InternalSim.g:8485:3: (enumLiteral_5= '>' )
                    // InternalSim.g:8486:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8496:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:8502:2: ( ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) )
            // InternalSim.g:8503:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            {
            // InternalSim.g:8503:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            int alt172=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt172=1;
                }
                break;
            case 119:
                {
                alt172=2;
                }
                break;
            case 120:
                {
                alt172=3;
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
                    // InternalSim.g:8504:3: (enumLiteral_0= '..' )
                    {
                    // InternalSim.g:8504:3: (enumLiteral_0= '..' )
                    // InternalSim.g:8505:4: enumLiteral_0= '..'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8512:3: (enumLiteral_1= '->' )
                    {
                    // InternalSim.g:8512:3: (enumLiteral_1= '->' )
                    // InternalSim.g:8513:4: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8520:3: (enumLiteral_2= '=>' )
                    {
                    // InternalSim.g:8520:3: (enumLiteral_2= '=>' )
                    // InternalSim.g:8521:4: enumLiteral_2= '=>'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8531:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:8537:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalSim.g:8538:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalSim.g:8538:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==92) ) {
                alt173=1;
            }
            else if ( (LA173_0==93) ) {
                alt173=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 173, 0, input);

                throw nvae;
            }
            switch (alt173) {
                case 1 :
                    // InternalSim.g:8539:3: (enumLiteral_0= '+' )
                    {
                    // InternalSim.g:8539:3: (enumLiteral_0= '+' )
                    // InternalSim.g:8540:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8547:3: (enumLiteral_1= '-' )
                    {
                    // InternalSim.g:8547:3: (enumLiteral_1= '-' )
                    // InternalSim.g:8548:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8558:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSim.g:8564:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalSim.g:8565:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalSim.g:8565:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt174=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt174=1;
                }
                break;
            case 121:
                {
                alt174=2;
                }
                break;
            case 122:
                {
                alt174=3;
                }
                break;
            case 123:
                {
                alt174=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }

            switch (alt174) {
                case 1 :
                    // InternalSim.g:8566:3: (enumLiteral_0= '*' )
                    {
                    // InternalSim.g:8566:3: (enumLiteral_0= '*' )
                    // InternalSim.g:8567:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8574:3: (enumLiteral_1= '/' )
                    {
                    // InternalSim.g:8574:3: (enumLiteral_1= '/' )
                    // InternalSim.g:8575:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8582:3: (enumLiteral_2= '**' )
                    {
                    // InternalSim.g:8582:3: (enumLiteral_2= '**' )
                    // InternalSim.g:8583:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8590:3: (enumLiteral_3= '%' )
                    {
                    // InternalSim.g:8590:3: (enumLiteral_3= '%' )
                    // InternalSim.g:8591:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
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
    // InternalSim.g:8601:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSim.g:8607:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalSim.g:8608:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalSim.g:8608:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt175=5;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt175=1;
                }
                break;
            case 93:
                {
                alt175=2;
                }
                break;
            case 124:
                {
                alt175=3;
                }
                break;
            case 125:
                {
                alt175=4;
                }
                break;
            case 126:
                {
                alt175=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }

            switch (alt175) {
                case 1 :
                    // InternalSim.g:8609:3: (enumLiteral_0= '+' )
                    {
                    // InternalSim.g:8609:3: (enumLiteral_0= '+' )
                    // InternalSim.g:8610:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:8617:3: (enumLiteral_1= '-' )
                    {
                    // InternalSim.g:8617:3: (enumLiteral_1= '-' )
                    // InternalSim.g:8618:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:8625:3: (enumLiteral_2= '!' )
                    {
                    // InternalSim.g:8625:3: (enumLiteral_2= '!' )
                    // InternalSim.g:8626:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:8633:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalSim.g:8633:3: (enumLiteral_3= 'NOT' )
                    // InternalSim.g:8634:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:8641:3: (enumLiteral_4= 'not' )
                    {
                    // InternalSim.g:8641:3: (enumLiteral_4= 'not' )
                    // InternalSim.g:8642:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSim
    public final void synpred1_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:5724:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalSim.g:5724:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalSim.g:5724:6: ( () ( ( ruleOpOr ) ) )
        // InternalSim.g:5725:6: () ( ( ruleOpOr ) )
        {
        // InternalSim.g:5725:6: ()
        // InternalSim.g:5726:6: 
        {
        }

        // InternalSim.g:5727:6: ( ( ruleOpOr ) )
        // InternalSim.g:5728:7: ( ruleOpOr )
        {
        // InternalSim.g:5728:7: ( ruleOpOr )
        // InternalSim.g:5729:8: ruleOpOr
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
    // $ANTLR end synpred1_InternalSim

    // $ANTLR start synpred2_InternalSim
    public final void synpred2_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:5812:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalSim.g:5812:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalSim.g:5812:6: ( () ( ( ruleOpAnd ) ) )
        // InternalSim.g:5813:6: () ( ( ruleOpAnd ) )
        {
        // InternalSim.g:5813:6: ()
        // InternalSim.g:5814:6: 
        {
        }

        // InternalSim.g:5815:6: ( ( ruleOpAnd ) )
        // InternalSim.g:5816:7: ( ruleOpAnd )
        {
        // InternalSim.g:5816:7: ( ruleOpAnd )
        // InternalSim.g:5817:8: ruleOpAnd
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
    // $ANTLR end synpred2_InternalSim

    // $ANTLR start synpred3_InternalSim
    public final void synpred3_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:5900:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalSim.g:5900:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalSim.g:5900:6: ( () ( ( ruleOpEquality ) ) )
        // InternalSim.g:5901:6: () ( ( ruleOpEquality ) )
        {
        // InternalSim.g:5901:6: ()
        // InternalSim.g:5902:6: 
        {
        }

        // InternalSim.g:5903:6: ( ( ruleOpEquality ) )
        // InternalSim.g:5904:7: ( ruleOpEquality )
        {
        // InternalSim.g:5904:7: ( ruleOpEquality )
        // InternalSim.g:5905:8: ruleOpEquality
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
    // $ANTLR end synpred3_InternalSim

    // $ANTLR start synpred4_InternalSim
    public final void synpred4_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:5989:6: ( ( () ruleOpInstanceOf ) )
        // InternalSim.g:5989:7: ( () ruleOpInstanceOf )
        {
        // InternalSim.g:5989:7: ( () ruleOpInstanceOf )
        // InternalSim.g:5990:7: () ruleOpInstanceOf
        {
        // InternalSim.g:5990:7: ()
        // InternalSim.g:5991:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSim

    // $ANTLR start synpred5_InternalSim
    public final void synpred5_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6029:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalSim.g:6029:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalSim.g:6029:7: ( () ( ( ruleOpCompare ) ) )
        // InternalSim.g:6030:7: () ( ( ruleOpCompare ) )
        {
        // InternalSim.g:6030:7: ()
        // InternalSim.g:6031:7: 
        {
        }

        // InternalSim.g:6032:7: ( ( ruleOpCompare ) )
        // InternalSim.g:6033:8: ( ruleOpCompare )
        {
        // InternalSim.g:6033:8: ( ruleOpCompare )
        // InternalSim.g:6034:9: ruleOpCompare
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
    // $ANTLR end synpred5_InternalSim

    // $ANTLR start synpred6_InternalSim
    public final void synpred6_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6148:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalSim.g:6148:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalSim.g:6148:6: ( () ( ( ruleOpOther ) ) )
        // InternalSim.g:6149:6: () ( ( ruleOpOther ) )
        {
        // InternalSim.g:6149:6: ()
        // InternalSim.g:6150:6: 
        {
        }

        // InternalSim.g:6151:6: ( ( ruleOpOther ) )
        // InternalSim.g:6152:7: ( ruleOpOther )
        {
        // InternalSim.g:6152:7: ( ruleOpOther )
        // InternalSim.g:6153:8: ruleOpOther
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
    // $ANTLR end synpred6_InternalSim

    // $ANTLR start synpred7_InternalSim
    public final void synpred7_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6236:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalSim.g:6236:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalSim.g:6236:6: ( () ( ( ruleOpAdd ) ) )
        // InternalSim.g:6237:6: () ( ( ruleOpAdd ) )
        {
        // InternalSim.g:6237:6: ()
        // InternalSim.g:6238:6: 
        {
        }

        // InternalSim.g:6239:6: ( ( ruleOpAdd ) )
        // InternalSim.g:6240:7: ( ruleOpAdd )
        {
        // InternalSim.g:6240:7: ( ruleOpAdd )
        // InternalSim.g:6241:8: ruleOpAdd
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
    // $ANTLR end synpred7_InternalSim

    // $ANTLR start synpred8_InternalSim
    public final void synpred8_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6324:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalSim.g:6324:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalSim.g:6324:6: ( () ( ( ruleOpMulti ) ) )
        // InternalSim.g:6325:6: () ( ( ruleOpMulti ) )
        {
        // InternalSim.g:6325:6: ()
        // InternalSim.g:6326:6: 
        {
        }

        // InternalSim.g:6327:6: ( ( ruleOpMulti ) )
        // InternalSim.g:6328:7: ( ruleOpMulti )
        {
        // InternalSim.g:6328:7: ( ruleOpMulti )
        // InternalSim.g:6329:8: ruleOpMulti
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
    // $ANTLR end synpred8_InternalSim

    // $ANTLR start synpred9_InternalSim
    public final void synpred9_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6487:5: ( ( () ruleOpCast ) )
        // InternalSim.g:6487:6: ( () ruleOpCast )
        {
        // InternalSim.g:6487:6: ( () ruleOpCast )
        // InternalSim.g:6488:6: () ruleOpCast
        {
        // InternalSim.g:6488:6: ()
        // InternalSim.g:6489:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalSim

    // $ANTLR start synpred10_InternalSim
    public final void synpred10_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6584:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // InternalSim.g:6584:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // InternalSim.g:6584:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // InternalSim.g:6585:7: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // InternalSim.g:6585:7: ()
        // InternalSim.g:6586:7: 
        {
        }

        match(input,67,FOLLOW_5); if (state.failed) return ;
        // InternalSim.g:6588:7: ( ( RULE_ID ) )
        // InternalSim.g:6589:8: ( RULE_ID )
        {
        // InternalSim.g:6589:8: ( RULE_ID )
        // InternalSim.g:6590:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_71); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSim

    // $ANTLR start synpred11_InternalSim
    public final void synpred11_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6653:6: ( ( () '.' ) )
        // InternalSim.g:6653:7: ( () '.' )
        {
        // InternalSim.g:6653:7: ( () '.' )
        // InternalSim.g:6654:7: () '.'
        {
        // InternalSim.g:6654:7: ()
        // InternalSim.g:6655:7: 
        {
        }

        match(input,67,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSim

    // $ANTLR start synpred12_InternalSim
    public final void synpred12_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6689:8: ( ( '(' ) )
        // InternalSim.g:6689:9: ( '(' )
        {
        // InternalSim.g:6689:9: ( '(' )
        // InternalSim.g:6690:9: '('
        {
        match(input,44,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSim

    // $ANTLR start synpred13_InternalSim
    public final void synpred13_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:6876:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )
        // InternalSim.g:6876:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        {
        // InternalSim.g:6876:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        // InternalSim.g:6877:5: () 'for' ( ( RULE_ID ) ) ':'
        {
        // InternalSim.g:6877:5: ()
        // InternalSim.g:6878:5: 
        {
        }

        match(input,81,FOLLOW_5); if (state.failed) return ;
        // InternalSim.g:6880:5: ( ( RULE_ID ) )
        // InternalSim.g:6881:6: ( RULE_ID )
        {
        // InternalSim.g:6881:6: ( RULE_ID )
        // InternalSim.g:6882:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_18); if (state.failed) return ;

        }


        }

        match(input,24,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSim

    // $ANTLR start synpred14_InternalSim
    public final void synpred14_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:7035:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )
        // InternalSim.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_PLAIN_TEXT_START)||(input.LA(1)>=RULE_NATURAL && input.LA(1)<=RULE_STRING)||input.LA(1)==44||(input.LA(1)>=69 && input.LA(1)<=77)||input.LA(1)==81||(input.LA(1)>=84 && input.LA(1)<=89)||(input.LA(1)>=92 && input.LA(1)<=93)||(input.LA(1)>=124 && input.LA(1)<=126) ) {
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
    // $ANTLR end synpred14_InternalSim

    // $ANTLR start synpred15_InternalSim
    public final void synpred15_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:7286:5: ( ( '(' ) )
        // InternalSim.g:7286:6: ( '(' )
        {
        // InternalSim.g:7286:6: ( '(' )
        // InternalSim.g:7287:6: '('
        {
        match(input,44,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSim

    // $ANTLR start synpred16_InternalSim
    public final void synpred16_InternalSim_fragment() throws RecognitionException {   
        // InternalSim.g:7511:5: ( 'else' )
        // InternalSim.g:7511:6: 'else'
        {
        match(input,79,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalSim

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
    public final boolean synpred16_InternalSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSim_fragment(); // can never throw exception
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


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA128 dfa128 = new DFA128(this);
    protected DFA140 dfa140 = new DFA140(this);
    protected DFA144 dfa144 = new DFA144(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\31\1\36\1\uffff\1\37\1\uffff\3\43\6\uffff";
    static final String dfa_3s = "\1\65\1\47\1\uffff\1\47\1\uffff\3\47\6\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\uffff\1\4\3\uffff\1\6\1\10\1\1\1\5\1\7\1\3";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\2\1\4\1\3\2\uffff\2\10\1\5\1\6\1\11\15\uffff\1\7",
            "\1\12\1\15\3\uffff\2\13\2\uffff\1\14",
            "",
            "\1\15\3\uffff\2\13\2\uffff\1\14",
            "",
            "\2\13\2\uffff\1\14",
            "\2\13\2\uffff\1\14",
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

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1294:2: (this_SPrimitiveDeduction_0= ruleSPrimitiveDeduction | this_DPrimitive_1= ruleDPrimitive | this_SEnumerationDeduction_2= ruleSEnumerationDeduction | this_DEnumeration_3= ruleDEnumeration | this_SEntityTypeDeduction_4= ruleSEntityTypeDeduction | this_DEntityType_5= ruleDEntityType | this_SDetailTypeDeduction_6= ruleSDetailTypeDeduction | this_DDetailType_7= ruleDDetailType )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\4\4\2\uffff\1\30\3\uffff\1\4\1\uffff\1\30";
    static final String dfa_9s = "\1\144\3\53\2\uffff\1\54\3\uffff\1\4\1\uffff\1\54";
    static final String dfa_10s = "\4\uffff\1\2\1\4\1\uffff\1\5\1\1\1\3\1\uffff\1\6\1\uffff";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\6\24\uffff\1\1\6\uffff\1\3\4\uffff\1\2\1\uffff\1\5\2\4\15\uffff\1\4\54\uffff\1\4",
            "\1\11\42\uffff\1\11\2\10\1\11\1\7",
            "\1\11\42\uffff\1\11\2\10\1\11\1\7",
            "\1\11\42\uffff\1\11\2\10\1\11\1\7",
            "",
            "",
            "\1\5\11\uffff\1\12\11\uffff\1\13",
            "",
            "",
            "",
            "\1\14",
            "",
            "\1\5\11\uffff\1\12\11\uffff\1\13"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2567:2: (this_SAssociationDeduction_0= ruleSAssociationDeduction | this_DAssociation_1= ruleDAssociation | this_SAttributeDeduction_2= ruleSAttributeDeduction | this_DAttribute_3= ruleDAttribute | this_SQueryDeduction_4= ruleSQueryDeduction | this_DQuery_5= ruleDQuery )";
        }
    }
    static final String dfa_13s = "\14\uffff";
    static final String dfa_14s = "\1\1\13\uffff";
    static final String dfa_15s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_16s = "\1\173\1\uffff\10\0\2\uffff";
    static final String dfa_17s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_18s = "\2\uffff\1\0\1\1\1\2\1\4\1\6\1\7\1\3\1\5\2\uffff}>";
    static final String[] dfa_19s = {
            "\5\1\13\uffff\2\1\3\uffff\1\1\3\uffff\5\1\1\uffff\3\1\1\uffff\3\1\3\uffff\2\1\3\uffff\1\1\1\uffff\4\1\5\uffff\1\1\2\uffff\1\2\1\3\2\1\12\uffff\3\1\1\uffff\2\1\10\uffff\2\1\6\uffff\1\1\4\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\5\1",
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

    class DFA128 extends DFA {

        public DFA128(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 128;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 5986:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA128_2 = input.LA(1);

                         
                        int index128_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index128_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA128_3 = input.LA(1);

                         
                        int index128_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index128_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA128_4 = input.LA(1);

                         
                        int index128_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index128_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA128_8 = input.LA(1);

                         
                        int index128_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index128_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA128_5 = input.LA(1);

                         
                        int index128_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index128_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA128_9 = input.LA(1);

                         
                        int index128_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index128_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA128_6 = input.LA(1);

                         
                        int index128_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index128_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA128_7 = input.LA(1);

                         
                        int index128_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index128_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 128, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\6\uffff\1\12\5\uffff";
    static final String dfa_21s = "\1\4\5\uffff\1\4\5\uffff";
    static final String dfa_22s = "\1\131\5\uffff\1\173\5\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\10\1\6";
    static final String dfa_24s = "\1\0\13\uffff}>";
    static final String[] dfa_25s = {
            "\1\6\4\uffff\2\1\41\uffff\1\5\30\uffff\2\2\2\3\2\4\2\7\1\10\3\uffff\1\11\2\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "\5\12\13\uffff\2\12\3\uffff\1\12\3\uffff\5\12\1\uffff\3\12\1\uffff\3\12\2\uffff\1\13\2\12\3\uffff\1\12\1\uffff\4\12\5\uffff\1\12\2\uffff\5\12\11\uffff\3\12\1\uffff\2\12\10\uffff\2\12\6\uffff\1\12\4\uffff\23\12",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA140 extends DFA {

        public DFA140(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 140;
            this.eot = dfa_13;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "6793:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA140_0 = input.LA(1);

                         
                        int index140_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA140_0>=RULE_NATURAL && LA140_0<=RULE_STRING)||(LA140_0>=84 && LA140_0<=89)) ) {s = 1;}

                        else if ( ((LA140_0>=69 && LA140_0<=70)) ) {s = 2;}

                        else if ( ((LA140_0>=71 && LA140_0<=72)) ) {s = 3;}

                        else if ( ((LA140_0>=73 && LA140_0<=74)) ) {s = 4;}

                        else if ( (LA140_0==44) ) {s = 5;}

                        else if ( (LA140_0==RULE_ID) ) {s = 6;}

                        else if ( ((LA140_0>=75 && LA140_0<=76)) ) {s = 7;}

                        else if ( (LA140_0==77) ) {s = 8;}

                        else if ( (LA140_0==81) && (synpred13_InternalSim())) {s = 9;}

                         
                        input.seek(index140_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 140, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\122\uffff";
    static final String dfa_27s = "\1\34\121\uffff";
    static final String dfa_28s = "\1\4\3\0\26\uffff\2\0\66\uffff";
    static final String dfa_29s = "\1\176\3\0\26\uffff\2\0\66\uffff";
    static final String dfa_30s = "\4\uffff\26\1\2\uffff\1\2\65\uffff";
    static final String dfa_31s = "\1\0\1\1\1\2\1\3\26\uffff\1\4\1\5\66\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\1\32\1\33\2\34\1\14\1\13\11\uffff\2\34\3\uffff\1\34\3\uffff\5\34\1\uffff\3\34\1\uffff\3\34\2\uffff\1\25\2\34\3\uffff\1\34\1\uffff\4\34\5\uffff\1\34\2\uffff\4\34\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\3\34\1\31\2\34\1\7\1\10\1\11\1\12\1\15\1\16\2\uffff\1\2\1\3\6\uffff\1\34\4\uffff\23\34\1\4\1\5\1\6",
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
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA144 extends DFA {

        public DFA144(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 144;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "7034:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA144_0 = input.LA(1);

                         
                        int index144_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA144_0==RULE_ID) ) {s = 1;}

                        else if ( (LA144_0==92) ) {s = 2;}

                        else if ( (LA144_0==93) ) {s = 3;}

                        else if ( (LA144_0==124) && (synpred14_InternalSim())) {s = 4;}

                        else if ( (LA144_0==125) && (synpred14_InternalSim())) {s = 5;}

                        else if ( (LA144_0==126) && (synpred14_InternalSim())) {s = 6;}

                        else if ( (LA144_0==84) && (synpred14_InternalSim())) {s = 7;}

                        else if ( (LA144_0==85) && (synpred14_InternalSim())) {s = 8;}

                        else if ( (LA144_0==86) && (synpred14_InternalSim())) {s = 9;}

                        else if ( (LA144_0==87) && (synpred14_InternalSim())) {s = 10;}

                        else if ( (LA144_0==RULE_STRING) && (synpred14_InternalSim())) {s = 11;}

                        else if ( (LA144_0==RULE_NATURAL) && (synpred14_InternalSim())) {s = 12;}

                        else if ( (LA144_0==88) && (synpred14_InternalSim())) {s = 13;}

                        else if ( (LA144_0==89) && (synpred14_InternalSim())) {s = 14;}

                        else if ( (LA144_0==69) && (synpred14_InternalSim())) {s = 15;}

                        else if ( (LA144_0==70) && (synpred14_InternalSim())) {s = 16;}

                        else if ( (LA144_0==71) && (synpred14_InternalSim())) {s = 17;}

                        else if ( (LA144_0==72) && (synpred14_InternalSim())) {s = 18;}

                        else if ( (LA144_0==73) && (synpred14_InternalSim())) {s = 19;}

                        else if ( (LA144_0==74) && (synpred14_InternalSim())) {s = 20;}

                        else if ( (LA144_0==44) && (synpred14_InternalSim())) {s = 21;}

                        else if ( (LA144_0==75) && (synpred14_InternalSim())) {s = 22;}

                        else if ( (LA144_0==76) && (synpred14_InternalSim())) {s = 23;}

                        else if ( (LA144_0==77) && (synpred14_InternalSim())) {s = 24;}

                        else if ( (LA144_0==81) && (synpred14_InternalSim())) {s = 25;}

                        else if ( (LA144_0==RULE_PLAIN_TEXT_ONLY) ) {s = 26;}

                        else if ( (LA144_0==RULE_PLAIN_TEXT_START) ) {s = 27;}

                        else if ( (LA144_0==EOF||(LA144_0>=RULE_PLAIN_TEXT_MIDDLE && LA144_0<=RULE_PLAIN_TEXT_END)||(LA144_0>=20 && LA144_0<=21)||LA144_0==25||(LA144_0>=29 && LA144_0<=33)||(LA144_0>=35 && LA144_0<=37)||(LA144_0>=39 && LA144_0<=41)||(LA144_0>=45 && LA144_0<=46)||LA144_0==50||(LA144_0>=52 && LA144_0<=55)||LA144_0==61||(LA144_0>=64 && LA144_0<=67)||(LA144_0>=78 && LA144_0<=80)||(LA144_0>=82 && LA144_0<=83)||LA144_0==100||(LA144_0>=105 && LA144_0<=123)) ) {s = 28;}

                         
                        input.seek(index144_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA144_1 = input.LA(1);

                         
                        int index144_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index144_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA144_2 = input.LA(1);

                         
                        int index144_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index144_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA144_3 = input.LA(1);

                         
                        int index144_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index144_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA144_26 = input.LA(1);

                         
                        int index144_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index144_26);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA144_27 = input.LA(1);

                         
                        int index144_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index144_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 144, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x002100F9CA080062L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x002100F9CA000062L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x002100F9CA000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x002000F9CA000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000800800012L,0x0000000C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800800012L,0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000060L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x002000F9E2000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000122000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000220000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000102000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000410000060L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x008403A122000010L,0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000410800060L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000048000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000602102000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400200000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002102000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000402102000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000900000000062L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000062L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000670L,0x7000000033F23FE0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000400000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000400000062L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000800000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080030000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000100000000062L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0100100000000062L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000000062L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x447000F9E2000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800100010000060L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000400000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0800000010000060L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000210000060L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x747000F9E2000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x647000F9E2000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000100000000610L,0x7000000033F23FE0L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x00001E0000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000200002L,0x0000200000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0001C00000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x007E000000000003L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0180000000080000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000200000000002L,0x0E00000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000004L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000500000000670L,0x7000000033F23FE0L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000100000000672L,0x7000000033F23FE0L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000200000000200L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000200L,0x0000000030000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});

}