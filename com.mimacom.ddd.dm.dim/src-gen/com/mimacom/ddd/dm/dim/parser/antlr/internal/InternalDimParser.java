package com.mimacom.ddd.dm.dim.parser.antlr.internal;

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
import com.mimacom.ddd.dm.dim.services.DimGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDimParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'information'", "'model'", "'alias'", "'{'", "'}'", "'query'", "'component'", "'constraint'", "':'", "'primitive'", "'redefines'", "'enumeration'", "','", "'abstract'", "'main'", "'entity'", "'states'", "'events'", "'detail'", "'extends'", "'derived'", "'contains'", "'key'", "'('", "')'", "'returns'", "'import'", "'test'", "'context'", "':='", "'in'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'as'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'autonomous'", "'relationship'", "'references'", "'inverse'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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


        public InternalDimParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDimParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDimParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDim.g"; }



     	private DimGrammarAccess grammarAccess;

        public InternalDimParser(TokenStream input, DimGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DNamespace";
       	}

       	@Override
       	protected DimGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDNamespace"
    // InternalDim.g:65:1: entryRuleDNamespace returns [EObject current=null] : iv_ruleDNamespace= ruleDNamespace EOF ;
    public final EObject entryRuleDNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNamespace = null;


        try {
            // InternalDim.g:65:51: (iv_ruleDNamespace= ruleDNamespace EOF )
            // InternalDim.g:66:2: iv_ruleDNamespace= ruleDNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNamespace=ruleDNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNamespace; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDNamespace"


    // $ANTLR start "ruleDNamespace"
    // InternalDim.g:72:1: ruleDNamespace returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDInformationModel ) ) ) ;
    public final EObject ruleDNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_model_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:78:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDInformationModel ) ) ) )
            // InternalDim.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDInformationModel ) ) )
            {
            // InternalDim.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDInformationModel ) ) )
            // InternalDim.g:80:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDInformationModel ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDNamespaceAccess().getDomainKeyword_0());
              		
            }
            // InternalDim.g:84:3: ( (lv_name_1_0= ruleDQualifiedName ) )
            // InternalDim.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            {
            // InternalDim.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            // InternalDim.g:86:5: lv_name_1_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNamespaceAccess().getNameDQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDNamespaceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DQualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDim.g:103:3: ( (lv_imports_2_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDim.g:104:4: (lv_imports_2_0= ruleDImport )
            	    {
            	    // InternalDim.g:104:4: (lv_imports_2_0= ruleDImport )
            	    // InternalDim.g:105:5: lv_imports_2_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDNamespaceAccess().getImportsDImportParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDNamespaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_2_0,
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

            // InternalDim.g:122:3: ( (lv_model_3_0= ruleDInformationModel ) )
            // InternalDim.g:123:4: (lv_model_3_0= ruleDInformationModel )
            {
            // InternalDim.g:123:4: (lv_model_3_0= ruleDInformationModel )
            // InternalDim.g:124:5: lv_model_3_0= ruleDInformationModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNamespaceAccess().getModelDInformationModelParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_model_3_0=ruleDInformationModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDNamespaceRule());
              					}
              					set(
              						current,
              						"model",
              						lv_model_3_0,
              						"com.mimacom.ddd.dm.dim.Dim.DInformationModel");
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
    // $ANTLR end "ruleDNamespace"


    // $ANTLR start "entryRuleDInformationModel"
    // InternalDim.g:145:1: entryRuleDInformationModel returns [EObject current=null] : iv_ruleDInformationModel= ruleDInformationModel EOF ;
    public final EObject entryRuleDInformationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDInformationModel = null;


        try {
            // InternalDim.g:145:58: (iv_ruleDInformationModel= ruleDInformationModel EOF )
            // InternalDim.g:146:2: iv_ruleDInformationModel= ruleDInformationModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDInformationModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDInformationModel=ruleDInformationModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDInformationModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDInformationModel"


    // $ANTLR start "ruleDInformationModel"
    // InternalDim.g:152:1: ruleDInformationModel returns [EObject current=null] : (otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDType ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDInformationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_description_5_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_aggregates_8_0 = null;



        	enterRule();

        try {
            // InternalDim.g:158:2: ( (otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDType ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) )* otherlv_9= '}' ) )
            // InternalDim.g:159:2: (otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDType ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) )* otherlv_9= '}' )
            {
            // InternalDim.g:159:2: (otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDType ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) )* otherlv_9= '}' )
            // InternalDim.g:160:3: otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDType ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDInformationModelAccess().getInformationKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDInformationModelAccess().getModelKeyword_1());
              		
            }
            // InternalDim.g:168:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:169:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:169:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:170:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDInformationModelAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDInformationModelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:186:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDim.g:187:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDInformationModelAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDim.g:191:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDim.g:192:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDim.g:192:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDim.g:193:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDInformationModelAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDInformationModelRule());
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

            // InternalDim.g:210:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_PLAIN_TEXT_ONLY && LA3_0<=RULE_RICH_TEXT_START)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDim.g:211:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:211:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:212:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDInformationModelAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDInformationModelRule());
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

            otherlv_6=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDInformationModelAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDim.g:233:3: ( ( (lv_types_7_0= ruleDType ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27||LA4_0==29||(LA4_0>=31 && LA4_0<=33)||LA4_0==36||(LA4_0>=82 && LA4_0<=83)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==24) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDim.g:234:4: ( (lv_types_7_0= ruleDType ) )
            	    {
            	    // InternalDim.g:234:4: ( (lv_types_7_0= ruleDType ) )
            	    // InternalDim.g:235:5: (lv_types_7_0= ruleDType )
            	    {
            	    // InternalDim.g:235:5: (lv_types_7_0= ruleDType )
            	    // InternalDim.g:236:6: lv_types_7_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDInformationModelAccess().getTypesDTypeParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_types_7_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_7_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:254:4: ( (lv_aggregates_8_0= ruleDAggregate ) )
            	    {
            	    // InternalDim.g:254:4: ( (lv_aggregates_8_0= ruleDAggregate ) )
            	    // InternalDim.g:255:5: (lv_aggregates_8_0= ruleDAggregate )
            	    {
            	    // InternalDim.g:255:5: (lv_aggregates_8_0= ruleDAggregate )
            	    // InternalDim.g:256:6: lv_aggregates_8_0= ruleDAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDInformationModelAccess().getAggregatesDAggregateParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_aggregates_8_0=ruleDAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_8_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DAggregate");
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

            otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDInformationModelAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDInformationModel"


    // $ANTLR start "entryRuleDAggregate"
    // InternalDim.g:282:1: entryRuleDAggregate returns [EObject current=null] : iv_ruleDAggregate= ruleDAggregate EOF ;
    public final EObject entryRuleDAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAggregate = null;


        try {
            // InternalDim.g:282:51: (iv_ruleDAggregate= ruleDAggregate EOF )
            // InternalDim.g:283:2: iv_ruleDAggregate= ruleDAggregate EOF
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
    // InternalDim.g:289:1: ruleDAggregate returns [EObject current=null] : ( () ruleDAggregateKeyword ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDQuery ) ) )* ( (lv_types_7_0= ruleDType ) )* otherlv_8= '}' ) ;
    public final EObject ruleDAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_description_3_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_types_7_0 = null;



        	enterRule();

        try {
            // InternalDim.g:295:2: ( ( () ruleDAggregateKeyword ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDQuery ) ) )* ( (lv_types_7_0= ruleDType ) )* otherlv_8= '}' ) )
            // InternalDim.g:296:2: ( () ruleDAggregateKeyword ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDQuery ) ) )* ( (lv_types_7_0= ruleDType ) )* otherlv_8= '}' )
            {
            // InternalDim.g:296:2: ( () ruleDAggregateKeyword ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDQuery ) ) )* ( (lv_types_7_0= ruleDType ) )* otherlv_8= '}' )
            // InternalDim.g:297:3: () ruleDAggregateKeyword ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDQuery ) ) )* ( (lv_types_7_0= ruleDType ) )* otherlv_8= '}'
            {
            // InternalDim.g:297:3: ()
            // InternalDim.g:298:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDAggregateAccess().getDAggregateAction_0(),
              					current);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAggregateAccess().getDAggregateKeywordParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_3);
            ruleDAggregateKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:311:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:312:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:312:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:313:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDAggregateAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAggregateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:329:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_PLAIN_TEXT_ONLY && LA5_0<=RULE_RICH_TEXT_START)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDim.g:330:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDim.g:330:4: (lv_description_3_0= ruleDRichText )
                    // InternalDim.g:331:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAggregateAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAggregateRule());
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

            otherlv_4=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDAggregateAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDim.g:352:3: (otherlv_5= 'query' ( (lv_features_6_0= ruleDQuery ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDim.g:353:4: otherlv_5= 'query' ( (lv_features_6_0= ruleDQuery ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDAggregateAccess().getQueryKeyword_5_0());
            	      			
            	    }
            	    // InternalDim.g:357:4: ( (lv_features_6_0= ruleDQuery ) )
            	    // InternalDim.g:358:5: (lv_features_6_0= ruleDQuery )
            	    {
            	    // InternalDim.g:358:5: (lv_features_6_0= ruleDQuery )
            	    // InternalDim.g:359:6: lv_features_6_0= ruleDQuery
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAggregateAccess().getFeaturesDQueryParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_features_6_0=ruleDQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDAggregateRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_6_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DQuery");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalDim.g:377:3: ( (lv_types_7_0= ruleDType ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27||LA7_0==29||(LA7_0>=31 && LA7_0<=33)||LA7_0==36||(LA7_0>=82 && LA7_0<=83)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDim.g:378:4: (lv_types_7_0= ruleDType )
            	    {
            	    // InternalDim.g:378:4: (lv_types_7_0= ruleDType )
            	    // InternalDim.g:379:5: lv_types_7_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDAggregateAccess().getTypesDTypeParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_types_7_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDAggregateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_7_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDAggregateAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleDAggregateKeyword"
    // InternalDim.g:404:1: entryRuleDAggregateKeyword returns [String current=null] : iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF ;
    public final String entryRuleDAggregateKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAggregateKeyword = null;


        try {
            // InternalDim.g:404:57: (iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF )
            // InternalDim.g:405:2: iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAggregateKeywordRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAggregateKeyword=ruleDAggregateKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAggregateKeyword.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDAggregateKeyword"


    // $ANTLR start "ruleDAggregateKeyword"
    // InternalDim.g:411:1: ruleDAggregateKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'component' ;
    public final AntlrDatatypeRuleToken ruleDAggregateKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:417:2: (kw= 'component' )
            // InternalDim.g:418:2: kw= 'component'
            {
            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDAggregateKeywordAccess().getComponentKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDAggregateKeyword"


    // $ANTLR start "entryRuleDType"
    // InternalDim.g:426:1: entryRuleDType returns [EObject current=null] : iv_ruleDType= ruleDType EOF ;
    public final EObject entryRuleDType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDType = null;


        try {
            // InternalDim.g:426:46: (iv_ruleDType= ruleDType EOF )
            // InternalDim.g:427:2: iv_ruleDType= ruleDType EOF
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
    // InternalDim.g:433:1: ruleDType returns [EObject current=null] : (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DEntityType_2= ruleDEntityType | this_DDetailType_3= ruleDDetailType ) ;
    public final EObject ruleDType() throws RecognitionException {
        EObject current = null;

        EObject this_DPrimitive_0 = null;

        EObject this_DEnumeration_1 = null;

        EObject this_DEntityType_2 = null;

        EObject this_DDetailType_3 = null;



        	enterRule();

        try {
            // InternalDim.g:439:2: ( (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DEntityType_2= ruleDEntityType | this_DDetailType_3= ruleDDetailType ) )
            // InternalDim.g:440:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DEntityType_2= ruleDEntityType | this_DDetailType_3= ruleDDetailType )
            {
            // InternalDim.g:440:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DEntityType_2= ruleDEntityType | this_DDetailType_3= ruleDDetailType )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==36) ) {
                    alt8=4;
                }
                else if ( ((LA8_3>=32 && LA8_3<=33)||(LA8_3>=82 && LA8_3<=83)) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
            case 33:
            case 82:
            case 83:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDim.g:441:3: this_DPrimitive_0= ruleDPrimitive
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
                    // InternalDim.g:450:3: this_DEnumeration_1= ruleDEnumeration
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
                    // InternalDim.g:459:3: this_DEntityType_2= ruleDEntityType
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
                    // InternalDim.g:468:3: this_DDetailType_3= ruleDDetailType
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
    // InternalDim.g:480:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalDim.g:480:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalDim.g:481:2: iv_ruleDConstraint= ruleDConstraint EOF
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
    // InternalDim.g:487:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:493:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDim.g:494:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDim.g:494:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDim.g:495:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalDim.g:499:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:500:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:500:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:501:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            // InternalDim.g:517:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDim.g:518:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:522:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:523:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:523:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:524:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalDim.g:545:3: ( (lv_predicate_5_0= ruleDExpression ) )
            // InternalDim.g:546:4: (lv_predicate_5_0= ruleDExpression )
            {
            // InternalDim.g:546:4: (lv_predicate_5_0= ruleDExpression )
            // InternalDim.g:547:5: lv_predicate_5_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getPredicateDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            // InternalDim.g:564:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_PLAIN_TEXT_ONLY && LA10_0<=RULE_RICH_TEXT_START)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDim.g:565:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDim.g:565:4: (lv_description_6_0= ruleDRichText )
                    // InternalDim.g:566:5: lv_description_6_0= ruleDRichText
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
    // InternalDim.g:587:1: entryRuleDPrimitive returns [EObject current=null] : iv_ruleDPrimitive= ruleDPrimitive EOF ;
    public final EObject entryRuleDPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimitive = null;


        try {
            // InternalDim.g:587:51: (iv_ruleDPrimitive= ruleDPrimitive EOF )
            // InternalDim.g:588:2: iv_ruleDPrimitive= ruleDPrimitive EOF
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
    // InternalDim.g:594:1: ruleDPrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )? ) ;
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
            // InternalDim.g:600:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )? ) )
            // InternalDim.g:601:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )? )
            {
            // InternalDim.g:601:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )? )
            // InternalDim.g:602:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDPrimitiveAccess().getPrimitiveKeyword_0());
              		
            }
            // InternalDim.g:606:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:607:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:607:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:608:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            // InternalDim.g:624:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDim.g:625:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDPrimitiveAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:629:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:630:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:630:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:631:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDPrimitiveAccess().getRedefinesKeyword_3());
              		
            }
            // InternalDim.g:652:3: ( (otherlv_5= RULE_ID ) )
            // InternalDim.g:653:4: (otherlv_5= RULE_ID )
            {
            // InternalDim.g:653:4: (otherlv_5= RULE_ID )
            // InternalDim.g:654:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDPrimitiveRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getDPrimitiveAccess().getRedefinesDmxArchetypeCrossReference_4_0());
              				
            }

            }


            }

            // InternalDim.g:665:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_PLAIN_TEXT_ONLY && LA12_0<=RULE_RICH_TEXT_START)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDim.g:666:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDim.g:666:4: (lv_description_6_0= ruleDRichText )
                    // InternalDim.g:667:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
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

            // InternalDim.g:684:3: (otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDim.g:685:4: otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )+ otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDPrimitiveAccess().getLeftCurlyBracketKeyword_6_0());
                      			
                    }
                    // InternalDim.g:689:4: ( (lv_constraints_8_0= ruleDConstraint ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDim.g:690:5: (lv_constraints_8_0= ruleDConstraint )
                    	    {
                    	    // InternalDim.g:690:5: (lv_constraints_8_0= ruleDConstraint )
                    	    // InternalDim.g:691:6: lv_constraints_8_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDPrimitiveAccess().getConstraintsDConstraintParserRuleCall_6_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDEnumeration"
    // InternalDim.g:717:1: entryRuleDEnumeration returns [EObject current=null] : iv_ruleDEnumeration= ruleDEnumeration EOF ;
    public final EObject entryRuleDEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumeration = null;


        try {
            // InternalDim.g:717:53: (iv_ruleDEnumeration= ruleDEnumeration EOF )
            // InternalDim.g:718:2: iv_ruleDEnumeration= ruleDEnumeration EOF
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
    // InternalDim.g:724:1: ruleDEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) ;
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
            // InternalDim.g:730:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) )
            // InternalDim.g:731:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            {
            // InternalDim.g:731:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            // InternalDim.g:732:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerationAccess().getEnumerationKeyword_0());
              		
            }
            // InternalDim.g:736:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:737:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:737:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:738:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
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

            // InternalDim.g:754:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDim.g:755:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDEnumerationAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:759:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:760:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:760:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:761:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
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
            	    break loop15;
                }
            } while (true);

            // InternalDim.g:778:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_PLAIN_TEXT_ONLY && LA16_0<=RULE_RICH_TEXT_START)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDim.g:779:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:779:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:780:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDEnumerationAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDEnumerationAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDim.g:801:3: ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDim.g:802:4: ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )*
                    {
                    // InternalDim.g:802:4: ( (lv_literals_6_0= ruleDLiteral ) )
                    // InternalDim.g:803:5: (lv_literals_6_0= ruleDLiteral )
                    {
                    // InternalDim.g:803:5: (lv_literals_6_0= ruleDLiteral )
                    // InternalDim.g:804:6: lv_literals_6_0= ruleDLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsDLiteralParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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
                      							"com.mimacom.ddd.dm.dim.Dim.DLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:821:4: (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==30) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDim.g:822:5: otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) )
                    	    {
                    	    otherlv_7=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getDEnumerationAccess().getCommaKeyword_5_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:826:5: ( (lv_literals_8_0= ruleDLiteral ) )
                    	    // InternalDim.g:827:6: (lv_literals_8_0= ruleDLiteral )
                    	    {
                    	    // InternalDim.g:827:6: (lv_literals_8_0= ruleDLiteral )
                    	    // InternalDim.g:828:7: lv_literals_8_0= ruleDLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsDLiteralParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_literals_8_0=ruleDLiteral();

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
                    	      								"com.mimacom.ddd.dm.dim.Dim.DLiteral");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDim.g:847:3: ( (lv_constraints_9_0= ruleDConstraint ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDim.g:848:4: (lv_constraints_9_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:848:4: (lv_constraints_9_0= ruleDConstraint )
            	    // InternalDim.g:849:5: lv_constraints_9_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerationAccess().getConstraintsDConstraintParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    break loop19;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDLiteral"
    // InternalDim.g:874:1: entryRuleDLiteral returns [EObject current=null] : iv_ruleDLiteral= ruleDLiteral EOF ;
    public final EObject entryRuleDLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteral = null;


        try {
            // InternalDim.g:874:49: (iv_ruleDLiteral= ruleDLiteral EOF )
            // InternalDim.g:875:2: iv_ruleDLiteral= ruleDLiteral EOF
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
    // InternalDim.g:881:1: ruleDLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? ) ;
    public final EObject ruleDLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:887:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? ) )
            // InternalDim.g:888:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? )
            {
            // InternalDim.g:888:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? )
            // InternalDim.g:889:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )?
            {
            // InternalDim.g:889:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:890:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:890:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:891:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
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

            // InternalDim.g:907:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDim.g:908:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDLiteralAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDim.g:912:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDim.g:913:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDim.g:913:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDim.g:914:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
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
            	    break loop20;
                }
            } while (true);

            // InternalDim.g:931:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_PLAIN_TEXT_ONLY && LA21_0<=RULE_RICH_TEXT_START)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDim.g:932:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDim.g:932:4: (lv_description_3_0= ruleDRichText )
                    // InternalDim.g:933:5: lv_description_3_0= ruleDRichText
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
    // InternalDim.g:954:1: entryRuleDEntityType returns [EObject current=null] : iv_ruleDEntityType= ruleDEntityType EOF ;
    public final EObject entryRuleDEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEntityType = null;


        try {
            // InternalDim.g:954:52: (iv_ruleDEntityType= ruleDEntityType EOF )
            // InternalDim.g:955:2: iv_ruleDEntityType= ruleDEntityType EOF
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
    // InternalDim.g:961:1: ruleDEntityType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'main' ) )? (otherlv_2= 'entity' | ( ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity' ) | ( (lv_nature_5_0= ruleDEntityNatureRelationship ) ) ) this_DComplexType_6= ruleDComplexType[$current] otherlv_7= '{' (otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleDState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleDState ) ) )* otherlv_13= '}' (otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}' )? )? ( ( (lv_features_20_0= ruleDFeature ) ) | ( (lv_constraints_21_0= ruleDConstraint ) ) )* otherlv_22= '}' ) ;
    public final EObject ruleDEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_root_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Enumerator lv_nature_3_0 = null;

        Enumerator lv_nature_5_0 = null;

        EObject this_DComplexType_6 = null;

        EObject lv_states_10_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_events_16_0 = null;

        EObject lv_events_18_0 = null;

        EObject lv_features_20_0 = null;

        EObject lv_constraints_21_0 = null;



        	enterRule();

        try {
            // InternalDim.g:967:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'main' ) )? (otherlv_2= 'entity' | ( ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity' ) | ( (lv_nature_5_0= ruleDEntityNatureRelationship ) ) ) this_DComplexType_6= ruleDComplexType[$current] otherlv_7= '{' (otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleDState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleDState ) ) )* otherlv_13= '}' (otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}' )? )? ( ( (lv_features_20_0= ruleDFeature ) ) | ( (lv_constraints_21_0= ruleDConstraint ) ) )* otherlv_22= '}' ) )
            // InternalDim.g:968:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'main' ) )? (otherlv_2= 'entity' | ( ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity' ) | ( (lv_nature_5_0= ruleDEntityNatureRelationship ) ) ) this_DComplexType_6= ruleDComplexType[$current] otherlv_7= '{' (otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleDState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleDState ) ) )* otherlv_13= '}' (otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}' )? )? ( ( (lv_features_20_0= ruleDFeature ) ) | ( (lv_constraints_21_0= ruleDConstraint ) ) )* otherlv_22= '}' )
            {
            // InternalDim.g:968:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'main' ) )? (otherlv_2= 'entity' | ( ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity' ) | ( (lv_nature_5_0= ruleDEntityNatureRelationship ) ) ) this_DComplexType_6= ruleDComplexType[$current] otherlv_7= '{' (otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleDState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleDState ) ) )* otherlv_13= '}' (otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}' )? )? ( ( (lv_features_20_0= ruleDFeature ) ) | ( (lv_constraints_21_0= ruleDConstraint ) ) )* otherlv_22= '}' )
            // InternalDim.g:969:3: ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'main' ) )? (otherlv_2= 'entity' | ( ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity' ) | ( (lv_nature_5_0= ruleDEntityNatureRelationship ) ) ) this_DComplexType_6= ruleDComplexType[$current] otherlv_7= '{' (otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleDState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleDState ) ) )* otherlv_13= '}' (otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}' )? )? ( ( (lv_features_20_0= ruleDFeature ) ) | ( (lv_constraints_21_0= ruleDConstraint ) ) )* otherlv_22= '}'
            {
            // InternalDim.g:969:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDim.g:970:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDim.g:970:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDim.g:971:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
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

            // InternalDim.g:983:3: ( (lv_root_1_0= 'main' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDim.g:984:4: (lv_root_1_0= 'main' )
                    {
                    // InternalDim.g:984:4: (lv_root_1_0= 'main' )
                    // InternalDim.g:985:5: lv_root_1_0= 'main'
                    {
                    lv_root_1_0=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_root_1_0, grammarAccess.getDEntityTypeAccess().getRootMainKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDEntityTypeRule());
                      					}
                      					setWithLastConsumed(current, "root", true, "main");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:997:3: (otherlv_2= 'entity' | ( ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity' ) | ( (lv_nature_5_0= ruleDEntityNatureRelationship ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt24=1;
                }
                break;
            case 82:
                {
                alt24=2;
                }
                break;
            case 83:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDim.g:998:4: otherlv_2= 'entity'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDEntityTypeAccess().getEntityKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:1003:4: ( ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity' )
                    {
                    // InternalDim.g:1003:4: ( ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity' )
                    // InternalDim.g:1004:5: ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) ) otherlv_4= 'entity'
                    {
                    // InternalDim.g:1004:5: ( (lv_nature_3_0= ruleDEntityNatureAutonomous ) )
                    // InternalDim.g:1005:6: (lv_nature_3_0= ruleDEntityNatureAutonomous )
                    {
                    // InternalDim.g:1005:6: (lv_nature_3_0= ruleDEntityNatureAutonomous )
                    // InternalDim.g:1006:7: lv_nature_3_0= ruleDEntityNatureAutonomous
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDEntityTypeAccess().getNatureDEntityNatureAutonomousEnumRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_nature_3_0=ruleDEntityNatureAutonomous();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDEntityTypeRule());
                      							}
                      							set(
                      								current,
                      								"nature",
                      								lv_nature_3_0,
                      								"com.mimacom.ddd.dm.dim.Dim.DEntityNatureAutonomous");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDEntityTypeAccess().getEntityKeyword_2_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:1029:4: ( (lv_nature_5_0= ruleDEntityNatureRelationship ) )
                    {
                    // InternalDim.g:1029:4: ( (lv_nature_5_0= ruleDEntityNatureRelationship ) )
                    // InternalDim.g:1030:5: (lv_nature_5_0= ruleDEntityNatureRelationship )
                    {
                    // InternalDim.g:1030:5: (lv_nature_5_0= ruleDEntityNatureRelationship )
                    // InternalDim.g:1031:6: lv_nature_5_0= ruleDEntityNatureRelationship
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEntityTypeAccess().getNatureDEntityNatureRelationshipEnumRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_nature_5_0=ruleDEntityNatureRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDEntityTypeRule());
                      						}
                      						set(
                      							current,
                      							"nature",
                      							lv_nature_5_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DEntityNatureRelationship");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDEntityTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDEntityTypeAccess().getDComplexTypeParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_7);
            this_DComplexType_6=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDEntityTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDim.g:1064:3: (otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleDState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleDState ) ) )* otherlv_13= '}' (otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}' )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDim.g:1065:4: otherlv_8= 'states' otherlv_9= '{' ( (lv_states_10_0= ruleDState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleDState ) ) )* otherlv_13= '}' (otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}' )?
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDEntityTypeAccess().getStatesKeyword_5_0());
                      			
                    }
                    otherlv_9=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDEntityTypeAccess().getLeftCurlyBracketKeyword_5_1());
                      			
                    }
                    // InternalDim.g:1073:4: ( (lv_states_10_0= ruleDState ) )
                    // InternalDim.g:1074:5: (lv_states_10_0= ruleDState )
                    {
                    // InternalDim.g:1074:5: (lv_states_10_0= ruleDState )
                    // InternalDim.g:1075:6: lv_states_10_0= ruleDState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEntityTypeAccess().getStatesDStateParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_states_10_0=ruleDState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDEntityTypeRule());
                      						}
                      						add(
                      							current,
                      							"states",
                      							lv_states_10_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:1092:4: (otherlv_11= ',' ( (lv_states_12_0= ruleDState ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==30) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalDim.g:1093:5: otherlv_11= ',' ( (lv_states_12_0= ruleDState ) )
                    	    {
                    	    otherlv_11=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getDEntityTypeAccess().getCommaKeyword_5_3_0());
                    	      				
                    	    }
                    	    // InternalDim.g:1097:5: ( (lv_states_12_0= ruleDState ) )
                    	    // InternalDim.g:1098:6: (lv_states_12_0= ruleDState )
                    	    {
                    	    // InternalDim.g:1098:6: (lv_states_12_0= ruleDState )
                    	    // InternalDim.g:1099:7: lv_states_12_0= ruleDState
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDEntityTypeAccess().getStatesDStateParserRuleCall_5_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
                    	    lv_states_12_0=ruleDState();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDEntityTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"states",
                    	      								lv_states_12_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DState");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDEntityTypeAccess().getRightCurlyBracketKeyword_5_4());
                      			
                    }
                    // InternalDim.g:1121:4: (otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==35) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalDim.g:1122:5: otherlv_14= 'events' otherlv_15= '{' ( (lv_events_16_0= ruleDStateEvent ) ) (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )* otherlv_19= '}'
                            {
                            otherlv_14=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getDEntityTypeAccess().getEventsKeyword_5_5_0());
                              				
                            }
                            otherlv_15=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getDEntityTypeAccess().getLeftCurlyBracketKeyword_5_5_1());
                              				
                            }
                            // InternalDim.g:1130:5: ( (lv_events_16_0= ruleDStateEvent ) )
                            // InternalDim.g:1131:6: (lv_events_16_0= ruleDStateEvent )
                            {
                            // InternalDim.g:1131:6: (lv_events_16_0= ruleDStateEvent )
                            // InternalDim.g:1132:7: lv_events_16_0= ruleDStateEvent
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDEntityTypeAccess().getEventsDStateEventParserRuleCall_5_5_2_0());
                              						
                            }
                            pushFollow(FOLLOW_26);
                            lv_events_16_0=ruleDStateEvent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDEntityTypeRule());
                              							}
                              							add(
                              								current,
                              								"events",
                              								lv_events_16_0,
                              								"com.mimacom.ddd.dm.dim.Dim.DStateEvent");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalDim.g:1149:5: (otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==30) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalDim.g:1150:6: otherlv_17= ',' ( (lv_events_18_0= ruleDStateEvent ) )
                            	    {
                            	    otherlv_17=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_17, grammarAccess.getDEntityTypeAccess().getCommaKeyword_5_5_3_0());
                            	      					
                            	    }
                            	    // InternalDim.g:1154:6: ( (lv_events_18_0= ruleDStateEvent ) )
                            	    // InternalDim.g:1155:7: (lv_events_18_0= ruleDStateEvent )
                            	    {
                            	    // InternalDim.g:1155:7: (lv_events_18_0= ruleDStateEvent )
                            	    // InternalDim.g:1156:8: lv_events_18_0= ruleDStateEvent
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDEntityTypeAccess().getEventsDStateEventParserRuleCall_5_5_3_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_26);
                            	    lv_events_18_0=ruleDStateEvent();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDEntityTypeRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"events",
                            	      									lv_events_18_0,
                            	      									"com.mimacom.ddd.dm.dim.Dim.DStateEvent");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);

                            otherlv_19=(Token)match(input,22,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_19, grammarAccess.getDEntityTypeAccess().getRightCurlyBracketKeyword_5_5_4());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDim.g:1180:3: ( ( (lv_features_20_0= ruleDFeature ) ) | ( (lv_constraints_21_0= ruleDConstraint ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==36||LA29_0==38) ) {
                    alt29=1;
                }
                else if ( (LA29_0==25) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDim.g:1181:4: ( (lv_features_20_0= ruleDFeature ) )
            	    {
            	    // InternalDim.g:1181:4: ( (lv_features_20_0= ruleDFeature ) )
            	    // InternalDim.g:1182:5: (lv_features_20_0= ruleDFeature )
            	    {
            	    // InternalDim.g:1182:5: (lv_features_20_0= ruleDFeature )
            	    // InternalDim.g:1183:6: lv_features_20_0= ruleDFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEntityTypeAccess().getFeaturesDFeatureParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_features_20_0=ruleDFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDEntityTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_20_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:1201:4: ( (lv_constraints_21_0= ruleDConstraint ) )
            	    {
            	    // InternalDim.g:1201:4: ( (lv_constraints_21_0= ruleDConstraint ) )
            	    // InternalDim.g:1202:5: (lv_constraints_21_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:1202:5: (lv_constraints_21_0= ruleDConstraint )
            	    // InternalDim.g:1203:6: lv_constraints_21_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEntityTypeAccess().getConstraintsDConstraintParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_constraints_21_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDEntityTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_21_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DConstraint");
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

            otherlv_22=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getDEntityTypeAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleDState"
    // InternalDim.g:1229:1: entryRuleDState returns [EObject current=null] : iv_ruleDState= ruleDState EOF ;
    public final EObject entryRuleDState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDState = null;


        try {
            // InternalDim.g:1229:47: (iv_ruleDState= ruleDState EOF )
            // InternalDim.g:1230:2: iv_ruleDState= ruleDState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDState=ruleDState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDState"


    // $ANTLR start "ruleDState"
    // InternalDim.g:1236:1: ruleDState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:1242:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDim.g:1243:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDim.g:1243:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1244:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1244:3: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1245:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getDStateAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDStateRule());
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
    // $ANTLR end "ruleDState"


    // $ANTLR start "entryRuleDStateEvent"
    // InternalDim.g:1264:1: entryRuleDStateEvent returns [EObject current=null] : iv_ruleDStateEvent= ruleDStateEvent EOF ;
    public final EObject entryRuleDStateEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStateEvent = null;


        try {
            // InternalDim.g:1264:52: (iv_ruleDStateEvent= ruleDStateEvent EOF )
            // InternalDim.g:1265:2: iv_ruleDStateEvent= ruleDStateEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDStateEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDStateEvent=ruleDStateEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDStateEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDStateEvent"


    // $ANTLR start "ruleDStateEvent"
    // InternalDim.g:1271:1: ruleDStateEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDStateEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:1277:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDim.g:1278:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDim.g:1278:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1279:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1279:3: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1280:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getDStateEventAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDStateEventRule());
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
    // $ANTLR end "ruleDStateEvent"


    // $ANTLR start "entryRuleDDetailType"
    // InternalDim.g:1299:1: entryRuleDDetailType returns [EObject current=null] : iv_ruleDDetailType= ruleDDetailType EOF ;
    public final EObject entryRuleDDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDetailType = null;


        try {
            // InternalDim.g:1299:52: (iv_ruleDDetailType= ruleDDetailType EOF )
            // InternalDim.g:1300:2: iv_ruleDDetailType= ruleDDetailType EOF
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
    // InternalDim.g:1306:1: ruleDDetailType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] otherlv_3= '{' ( ( (lv_features_4_0= ruleDFeature ) ) | ( (lv_constraints_5_0= ruleDConstraint ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleDDetailType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject this_DComplexType_2 = null;

        EObject lv_features_4_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1312:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] otherlv_3= '{' ( ( (lv_features_4_0= ruleDFeature ) ) | ( (lv_constraints_5_0= ruleDConstraint ) ) )* otherlv_6= '}' ) )
            // InternalDim.g:1313:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] otherlv_3= '{' ( ( (lv_features_4_0= ruleDFeature ) ) | ( (lv_constraints_5_0= ruleDConstraint ) ) )* otherlv_6= '}' )
            {
            // InternalDim.g:1313:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] otherlv_3= '{' ( ( (lv_features_4_0= ruleDFeature ) ) | ( (lv_constraints_5_0= ruleDConstraint ) ) )* otherlv_6= '}' )
            // InternalDim.g:1314:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] otherlv_3= '{' ( ( (lv_features_4_0= ruleDFeature ) ) | ( (lv_constraints_5_0= ruleDConstraint ) ) )* otherlv_6= '}'
            {
            // InternalDim.g:1314:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDim.g:1315:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDim.g:1315:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDim.g:1316:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDDetailTypeAccess().getDetailKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDDetailTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDDetailTypeAccess().getDComplexTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_7);
            this_DComplexType_2=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_2;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_3=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDDetailTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDim.g:1347:3: ( ( (lv_features_4_0= ruleDFeature ) ) | ( (lv_constraints_5_0= ruleDConstraint ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==36||LA31_0==38) ) {
                    alt31=1;
                }
                else if ( (LA31_0==25) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDim.g:1348:4: ( (lv_features_4_0= ruleDFeature ) )
            	    {
            	    // InternalDim.g:1348:4: ( (lv_features_4_0= ruleDFeature ) )
            	    // InternalDim.g:1349:5: (lv_features_4_0= ruleDFeature )
            	    {
            	    // InternalDim.g:1349:5: (lv_features_4_0= ruleDFeature )
            	    // InternalDim.g:1350:6: lv_features_4_0= ruleDFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDetailTypeAccess().getFeaturesDFeatureParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_features_4_0=ruleDFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDetailTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_4_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:1368:4: ( (lv_constraints_5_0= ruleDConstraint ) )
            	    {
            	    // InternalDim.g:1368:4: ( (lv_constraints_5_0= ruleDConstraint ) )
            	    // InternalDim.g:1369:5: (lv_constraints_5_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:1369:5: (lv_constraints_5_0= ruleDConstraint )
            	    // InternalDim.g:1370:6: lv_constraints_5_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDetailTypeAccess().getConstraintsDConstraintParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_constraints_5_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDetailTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_5_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DConstraint");
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

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDDetailTypeAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDim.g:1397:1: ruleDComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1403:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDim.g:1404:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1404:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDim.g:1405:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDim.g:1405:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1406:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1406:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1407:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            // InternalDim.g:1423:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDim.g:1424:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDComplexTypeAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDim.g:1428:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDim.g:1429:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDim.g:1429:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDim.g:1430:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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
            	    break loop32;
                }
            } while (true);

            // InternalDim.g:1447:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDim.g:1448:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalDim.g:1452:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDim.g:1453:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDim.g:1453:5: (otherlv_4= RULE_ID )
                    // InternalDim.g:1454:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:1466:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_PLAIN_TEXT_ONLY && LA34_0<=RULE_RICH_TEXT_START)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDim.g:1467:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:1467:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:1468:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDComplexTypeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDim.g:1489:1: entryRuleDFeature returns [EObject current=null] : iv_ruleDFeature= ruleDFeature EOF ;
    public final EObject entryRuleDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFeature = null;


        try {
            // InternalDim.g:1489:49: (iv_ruleDFeature= ruleDFeature EOF )
            // InternalDim.g:1490:2: iv_ruleDFeature= ruleDFeature EOF
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
    // InternalDim.g:1496:1: ruleDFeature returns [EObject current=null] : (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) ;
    public final EObject ruleDFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DAssociation_0 = null;

        EObject this_DAttribute_1 = null;

        EObject this_DQuery_2 = null;



        	enterRule();

        try {
            // InternalDim.g:1502:2: ( (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) )
            // InternalDim.g:1503:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            {
            // InternalDim.g:1503:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalDim.g:1504:3: this_DAssociation_0= ruleDAssociation
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
                    // InternalDim.g:1513:3: this_DAttribute_1= ruleDAttribute
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
                    // InternalDim.g:1522:3: this_DQuery_2= ruleDQuery
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
    // InternalDim.g:1534:1: entryRuleDAssociation returns [EObject current=null] : iv_ruleDAssociation= ruleDAssociation EOF ;
    public final EObject entryRuleDAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssociation = null;


        try {
            // InternalDim.g:1534:53: (iv_ruleDAssociation= ruleDAssociation EOF )
            // InternalDim.g:1535:2: iv_ruleDAssociation= ruleDAssociation EOF
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
    // InternalDim.g:1541:1: ruleDAssociation returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) )? ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:1547:2: ( ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) )? ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDim.g:1548:2: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) )? ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1548:2: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) )? ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDim.g:1549:3: ( (lv_derived_0_0= 'derived' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) ) ( (otherlv_7= RULE_ID ) )? ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDim.g:1549:3: ( (lv_derived_0_0= 'derived' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDim.g:1550:4: (lv_derived_0_0= 'derived' )
                    {
                    // InternalDim.g:1550:4: (lv_derived_0_0= 'derived' )
                    // InternalDim.g:1551:5: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
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

            // InternalDim.g:1563:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:1564:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:1564:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:1565:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
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

            // InternalDim.g:1581:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==20) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDim.g:1582:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDAssociationAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:1586:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:1587:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:1587:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:1588:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
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
            	    break loop37;
                }
            } while (true);

            // InternalDim.g:1605:3: ( ( (lv_kind_4_0= ruleDAssociationKind ) ) | ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39||LA38_0==84) ) {
                alt38=1;
            }
            else if ( (LA38_0==85) ) {
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
                    // InternalDim.g:1606:4: ( (lv_kind_4_0= ruleDAssociationKind ) )
                    {
                    // InternalDim.g:1606:4: ( (lv_kind_4_0= ruleDAssociationKind ) )
                    // InternalDim.g:1607:5: (lv_kind_4_0= ruleDAssociationKind )
                    {
                    // InternalDim.g:1607:5: (lv_kind_4_0= ruleDAssociationKind )
                    // InternalDim.g:1608:6: lv_kind_4_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindEnumRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalDim.g:1626:4: ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' )
                    {
                    // InternalDim.g:1626:4: ( ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains' )
                    // InternalDim.g:1627:5: ( (lv_kind_5_0= ruleDAssociationKindInverse ) ) otherlv_6= 'contains'
                    {
                    // InternalDim.g:1627:5: ( (lv_kind_5_0= ruleDAssociationKindInverse ) )
                    // InternalDim.g:1628:6: (lv_kind_5_0= ruleDAssociationKindInverse )
                    {
                    // InternalDim.g:1628:6: (lv_kind_5_0= ruleDAssociationKindInverse )
                    // InternalDim.g:1629:7: lv_kind_5_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_33);
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

                    otherlv_6=(Token)match(input,39,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDAssociationAccess().getContainsKeyword_3_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1652:3: ( (otherlv_7= RULE_ID ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==41) ) {
                    int LA39_3 = input.LA(3);

                    if ( (LA39_3==RULE_NATURAL) ) {
                        alt39=1;
                    }
                }
                else if ( (LA39_1==EOF||(LA39_1>=RULE_ID && LA39_1<=RULE_RICH_TEXT_START)||LA39_1==22||LA39_1==25||LA39_1==36||LA39_1==38||LA39_1==53||LA39_1==79||LA39_1==120) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalDim.g:1653:4: (otherlv_7= RULE_ID )
                    {
                    // InternalDim.g:1653:4: (otherlv_7= RULE_ID )
                    // InternalDim.g:1654:5: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDAssociationRule());
                      					}
                      				
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getDAssociationAccess().getTypeDEntityTypeCrossReference_4_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1665:3: ( (lv_multiplicity_8_0= ruleDMultiplicity ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41||LA40_0==53||LA40_0==79||LA40_0==120) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDim.g:1666:4: (lv_multiplicity_8_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1666:4: (lv_multiplicity_8_0= ruleDMultiplicity )
                    // InternalDim.g:1667:5: lv_multiplicity_8_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
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

            // InternalDim.g:1684:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_PLAIN_TEXT_ONLY && LA41_0<=RULE_RICH_TEXT_START)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDim.g:1685:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDim.g:1685:4: (lv_description_9_0= ruleDRichText )
                    // InternalDim.g:1686:5: lv_description_9_0= ruleDRichText
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
    // InternalDim.g:1707:1: entryRuleDAttribute returns [EObject current=null] : iv_ruleDAttribute= ruleDAttribute EOF ;
    public final EObject entryRuleDAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAttribute = null;


        try {
            // InternalDim.g:1707:51: (iv_ruleDAttribute= ruleDAttribute EOF )
            // InternalDim.g:1708:2: iv_ruleDAttribute= ruleDAttribute EOF
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
    // InternalDim.g:1714:1: ruleDAttribute returns [EObject current=null] : ( ( (lv_detail_0_0= 'detail' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )? ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:1720:2: ( ( ( (lv_detail_0_0= 'detail' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )? ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) )
            // InternalDim.g:1721:2: ( ( (lv_detail_0_0= 'detail' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )? ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1721:2: ( ( (lv_detail_0_0= 'detail' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )? ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            // InternalDim.g:1722:3: ( (lv_detail_0_0= 'detail' ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )? ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )?
            {
            // InternalDim.g:1722:3: ( (lv_detail_0_0= 'detail' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDim.g:1723:4: (lv_detail_0_0= 'detail' )
                    {
                    // InternalDim.g:1723:4: (lv_detail_0_0= 'detail' )
                    // InternalDim.g:1724:5: lv_detail_0_0= 'detail'
                    {
                    lv_detail_0_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
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

            // InternalDim.g:1736:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:1737:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:1737:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:1738:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDAttributeAccess().getNameIDTerminalRuleCall_1_0());
              				
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

            // InternalDim.g:1754:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==20) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDim.g:1755:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDAttributeAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:1759:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:1760:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:1760:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:1761:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDAttributeAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
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
            	    break loop43;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDAttributeAccess().getColonKeyword_3());
              		
            }
            // InternalDim.g:1782:3: ( (otherlv_5= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==41) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==RULE_NATURAL) ) {
                        alt44=1;
                    }
                }
                else if ( (LA44_1==EOF||(LA44_1>=RULE_ID && LA44_1<=RULE_RICH_TEXT_START)||LA44_1==22||LA44_1==25||LA44_1==36||LA44_1==38||LA44_1==40||LA44_1==53||LA44_1==79||LA44_1==120) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalDim.g:1783:4: (otherlv_5= RULE_ID )
                    {
                    // InternalDim.g:1783:4: (otherlv_5= RULE_ID )
                    // InternalDim.g:1784:5: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDAttributeRule());
                      					}
                      				
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDAttributeAccess().getTypeDTypeCrossReference_4_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1795:3: ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41||LA45_0==53||LA45_0==79||LA45_0==120) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDim.g:1796:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1796:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    // InternalDim.g:1797:5: lv_multiplicity_6_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_37);
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

            // InternalDim.g:1814:3: ( (lv_key_7_0= 'key' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDim.g:1815:4: (lv_key_7_0= 'key' )
                    {
                    // InternalDim.g:1815:4: (lv_key_7_0= 'key' )
                    // InternalDim.g:1816:5: lv_key_7_0= 'key'
                    {
                    lv_key_7_0=(Token)match(input,40,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_key_7_0, grammarAccess.getDAttributeAccess().getKeyKeyKeyword_6_0());
                      				
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

            // InternalDim.g:1828:3: ( (lv_description_8_0= ruleDRichText ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_PLAIN_TEXT_ONLY && LA47_0<=RULE_RICH_TEXT_START)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDim.g:1829:4: (lv_description_8_0= ruleDRichText )
                    {
                    // InternalDim.g:1829:4: (lv_description_8_0= ruleDRichText )
                    // InternalDim.g:1830:5: lv_description_8_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getDescriptionDRichTextParserRuleCall_7_0());
                      				
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


    // $ANTLR start "entryRuleDQuery"
    // InternalDim.g:1851:1: entryRuleDQuery returns [EObject current=null] : iv_ruleDQuery= ruleDQuery EOF ;
    public final EObject entryRuleDQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQuery = null;


        try {
            // InternalDim.g:1851:47: (iv_ruleDQuery= ruleDQuery EOF )
            // InternalDim.g:1852:2: iv_ruleDQuery= ruleDQuery EOF
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
    // InternalDim.g:1858:1: ruleDQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )? ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:1864:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )? ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalDim.g:1865:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )? ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1865:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )? ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalDim.g:1866:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )? ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalDim.g:1866:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1867:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1867:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1868:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

            // InternalDim.g:1884:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==20) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDim.g:1885:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDQueryAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDim.g:1889:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDim.g:1890:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDim.g:1890:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDim.g:1891:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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
            	    break loop48;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDQueryAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:1912:3: ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDim.g:1913:4: ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )*
                    {
                    // InternalDim.g:1913:4: ( (lv_parameters_4_0= ruleDQueryParameter ) )
                    // InternalDim.g:1914:5: (lv_parameters_4_0= ruleDQueryParameter )
                    {
                    // InternalDim.g:1914:5: (lv_parameters_4_0= ruleDQueryParameter )
                    // InternalDim.g:1915:6: lv_parameters_4_0= ruleDQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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
                      							"com.mimacom.ddd.dm.dim.Dim.DQueryParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:1932:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==30) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalDim.g:1933:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDQueryAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:1937:5: ( (lv_parameters_6_0= ruleDQueryParameter ) )
                    	    // InternalDim.g:1938:6: (lv_parameters_6_0= ruleDQueryParameter )
                    	    {
                    	    // InternalDim.g:1938:6: (lv_parameters_6_0= ruleDQueryParameter )
                    	    // InternalDim.g:1939:7: lv_parameters_6_0= ruleDQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_parameters_6_0=ruleDQueryParameter();

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
                    	      								"com.mimacom.ddd.dm.dim.Dim.DQueryParameter");
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
                    break;

            }

            otherlv_7=(Token)match(input,42,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDQueryAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,26,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDQueryAccess().getColonKeyword_5());
              		
            }
            // InternalDim.g:1966:3: ( (otherlv_9= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==EOF||(LA51_1>=RULE_ID && LA51_1<=RULE_RICH_TEXT_START)||(LA51_1>=22 && LA51_1<=23)||LA51_1==25||LA51_1==27||LA51_1==29||(LA51_1>=31 && LA51_1<=33)||LA51_1==36||LA51_1==38||LA51_1==43||LA51_1==53||LA51_1==79||(LA51_1>=82 && LA51_1<=83)||LA51_1==120) ) {
                    alt51=1;
                }
                else if ( (LA51_1==41) ) {
                    int LA51_4 = input.LA(3);

                    if ( (LA51_4==RULE_NATURAL) ) {
                        alt51=1;
                    }
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalDim.g:1967:4: (otherlv_9= RULE_ID )
                    {
                    // InternalDim.g:1967:4: (otherlv_9= RULE_ID )
                    // InternalDim.g:1968:5: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDQueryRule());
                      					}
                      				
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getDQueryAccess().getTypeDTypeCrossReference_6_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1979:3: ( (lv_multiplicity_10_0= ruleDMultiplicity ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41||LA52_0==53||LA52_0==79||LA52_0==120) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDim.g:1980:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1980:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    // InternalDim.g:1981:5: lv_multiplicity_10_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getMultiplicityDMultiplicityParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
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

            // InternalDim.g:1998:3: (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==43) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDim.g:1999:4: otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) )
                    {
                    otherlv_11=(Token)match(input,43,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDQueryAccess().getReturnsKeyword_8_0());
                      			
                    }
                    // InternalDim.g:2003:4: ( (lv_returns_12_0= ruleDExpression ) )
                    // InternalDim.g:2004:5: (lv_returns_12_0= ruleDExpression )
                    {
                    // InternalDim.g:2004:5: (lv_returns_12_0= ruleDExpression )
                    // InternalDim.g:2005:6: lv_returns_12_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getReturnsDExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

            // InternalDim.g:2023:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_PLAIN_TEXT_ONLY && LA54_0<=RULE_RICH_TEXT_START)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDim.g:2024:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalDim.g:2024:4: (lv_description_13_0= ruleDRichText )
                    // InternalDim.g:2025:5: lv_description_13_0= ruleDRichText
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


    // $ANTLR start "entryRuleDQueryParameter"
    // InternalDim.g:2046:1: entryRuleDQueryParameter returns [EObject current=null] : iv_ruleDQueryParameter= ruleDQueryParameter EOF ;
    public final EObject entryRuleDQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQueryParameter = null;


        try {
            // InternalDim.g:2046:56: (iv_ruleDQueryParameter= ruleDQueryParameter EOF )
            // InternalDim.g:2047:2: iv_ruleDQueryParameter= ruleDQueryParameter EOF
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
    // InternalDim.g:2053:1: ruleDQueryParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )? ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2059:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )? ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDim.g:2060:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )? ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDim.g:2060:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )? ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDim.g:2061:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )? ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalDim.g:2061:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:2062:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:2062:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:2063:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDim.g:2083:3: ( (otherlv_2= RULE_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDim.g:2084:4: (otherlv_2= RULE_ID )
                    {
                    // InternalDim.g:2084:4: (otherlv_2= RULE_ID )
                    // InternalDim.g:2085:5: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDQueryParameterRule());
                      					}
                      				
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDQueryParameterAccess().getTypeDTypeCrossReference_2_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:2096:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==41||LA56_0==53||LA56_0==79||LA56_0==120) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDim.g:2097:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2097:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDim.g:2098:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
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

            // InternalDim.g:2115:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_PLAIN_TEXT_ONLY && LA57_0<=RULE_RICH_TEXT_START)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDim.g:2116:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:2116:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:2117:5: lv_description_4_0= ruleDRichText
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
    // InternalDim.g:2138:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDim.g:2138:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDim.g:2139:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDim.g:2145:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2151:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDim.g:2152:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDim.g:2152:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDim.g:2153:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDim.g:2157:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDim.g:2158:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDim.g:2158:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDim.g:2159:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalDim.g:2180:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalDim.g:2180:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalDim.g:2181:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalDim.g:2187:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalDim.g:2193:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalDim.g:2194:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalDim.g:2194:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalDim.g:2195:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalDim.g:2199:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2200:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2200:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2201:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
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

            // InternalDim.g:2217:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==46) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDim.g:2218:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalDim.g:2222:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalDim.g:2223:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalDim.g:2223:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalDim.g:2224:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

                    // InternalDim.g:2241:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==30) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalDim.g:2242:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDim.g:2246:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalDim.g:2247:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalDim.g:2247:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalDim.g:2248:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
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
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDim.g:2271:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalDim.g:2272:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalDim.g:2272:4: (lv_expr_7_0= ruleDExpression )
            // InternalDim.g:2273:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_47);
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

            otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:2298:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalDim.g:2298:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalDim.g:2299:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalDim.g:2305:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalDim.g:2311:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalDim.g:2312:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalDim.g:2312:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalDim.g:2313:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalDim.g:2313:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:2314:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:2314:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:2315:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalDim.g:2335:3: ( (otherlv_2= RULE_ID ) )
            // InternalDim.g:2336:4: (otherlv_2= RULE_ID )
            {
            // InternalDim.g:2336:4: (otherlv_2= RULE_ID )
            // InternalDim.g:2337:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDim.g:2348:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==41||LA60_0==53||LA60_0==79||LA60_0==120) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDim.g:2349:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2349:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDim.g:2350:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_49);
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

            // InternalDim.g:2367:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==47) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDim.g:2368:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalDim.g:2372:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=RULE_NATURAL && LA61_0<=RULE_STRING)||LA61_0==33||LA61_0==36||(LA61_0>=71 && LA61_0<=76)) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==21) ) {
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
                            // InternalDim.g:2373:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalDim.g:2373:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalDim.g:2374:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalDim.g:2374:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalDim.g:2375:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalDim.g:2393:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalDim.g:2393:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalDim.g:2394:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalDim.g:2394:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalDim.g:2395:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalDim.g:2418:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalDim.g:2418:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalDim.g:2419:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalDim.g:2425:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalDim.g:2431:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalDim.g:2432:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalDim.g:2432:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalDim.g:2433:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalDim.g:2433:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:2434:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:2434:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:2435:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,48,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:2459:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalDim.g:2460:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalDim.g:2460:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalDim.g:2461:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_54);
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

            // InternalDim.g:2478:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==30) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalDim.g:2479:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDim.g:2483:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalDim.g:2484:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalDim.g:2484:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalDim.g:2485:6: lv_members_5_0= ruleDmxBaseType
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
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // InternalDim.g:2511:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalDim.g:2511:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalDim.g:2512:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalDim.g:2518:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2524:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDim.g:2525:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDim.g:2525:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDim.g:2526:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDim.g:2530:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2531:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2531:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2532:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,50,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalDim.g:2552:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalDim.g:2553:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalDim.g:2553:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalDim.g:2554:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            // InternalDim.g:2571:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_PLAIN_TEXT_ONLY && LA64_0<=RULE_RICH_TEXT_START)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDim.g:2572:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:2572:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:2573:5: lv_description_4_0= ruleDRichText
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
    // InternalDim.g:2594:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalDim.g:2594:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalDim.g:2595:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalDim.g:2601:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalDim.g:2607:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalDim.g:2608:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalDim.g:2608:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalDim.g:2609:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalDim.g:2613:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2614:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2614:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2615:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
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
            // InternalDim.g:2635:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDim.g:2636:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalDim.g:2636:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalDim.g:2637:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalDim.g:2637:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalDim.g:2638:6: lv_parameters_3_0= ruleDmxFilterParameter
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

                    // InternalDim.g:2655:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==30) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalDim.g:2656:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:2660:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalDim.g:2661:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalDim.g:2661:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalDim.g:2662:7: lv_parameters_5_0= ruleDmxFilterParameter
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
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,26,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalDim.g:2689:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDim.g:2690:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDim.g:2690:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalDim.g:2691:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_57);
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

            // InternalDim.g:2708:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==52) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDim.g:2709:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalDim.g:2713:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalDim.g:2714:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalDim.g:2714:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalDim.g:2715:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalDim.g:2737:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalDim.g:2737:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalDim.g:2738:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalDim.g:2744:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2750:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalDim.g:2751:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalDim.g:2751:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalDim.g:2752:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalDim.g:2752:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=86 && LA68_0<=96)) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_ID) ) {
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
                    // InternalDim.g:2753:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalDim.g:2753:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalDim.g:2754:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalDim.g:2754:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalDim.g:2755:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
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
                    // InternalDim.g:2773:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDim.g:2773:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDim.g:2774:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDim.g:2774:5: (otherlv_1= RULE_ID )
                    // InternalDim.g:2775:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:2787:3: ( (lv_collection_2_0= '*' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==53) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDim.g:2788:4: (lv_collection_2_0= '*' )
                    {
                    // InternalDim.g:2788:4: (lv_collection_2_0= '*' )
                    // InternalDim.g:2789:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:2805:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalDim.g:2805:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalDim.g:2806:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalDim.g:2812:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2818:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalDim.g:2819:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalDim.g:2819:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalDim.g:2820:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalDim.g:2820:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:2821:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:2821:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:2822:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDim.g:2842:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDim.g:2843:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDim.g:2843:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalDim.g:2844:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalDim.g:2865:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDim.g:2865:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDim.g:2866:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDim.g:2872:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalDim.g:2878:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalDim.g:2879:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalDim.g:2879:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt70=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==EOF||(LA70_1>=RULE_ID && LA70_1<=RULE_RICH_TEXT_END)||(LA70_1>=22 && LA70_1<=23)||LA70_1==25||LA70_1==27||(LA70_1>=29 && LA70_1<=33)||LA70_1==36||LA70_1==38||(LA70_1>=41 && LA70_1<=42)||LA70_1==48||(LA70_1>=53 && LA70_1<=61)||(LA70_1>=67 && LA70_1<=70)||(LA70_1>=79 && LA70_1<=80)||(LA70_1>=82 && LA70_1<=83)||(LA70_1>=97 && LA70_1<=116)) ) {
                    alt70=2;
                }
                else if ( (LA70_1==47) ) {
                    alt70=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
            case RULE_STRING:
            case 21:
            case 33:
            case 36:
            case 41:
            case 62:
            case 66:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 79:
            case 80:
            case 117:
            case 118:
            case 119:
                {
                alt70=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_RICH_TEXT_START:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalDim.g:2880:3: this_DmxAssignment_0= ruleDmxAssignment
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
                    // InternalDim.g:2889:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
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
                    // InternalDim.g:2898:3: this_DRichText_2= ruleDRichText
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
    // InternalDim.g:2910:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDim.g:2910:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDim.g:2911:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDim.g:2917:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalDim.g:2923:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalDim.g:2924:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalDim.g:2924:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_RICH_TEXT_START) ) {
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
                    // InternalDim.g:2925:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalDim.g:2925:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalDim.g:2926:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalDim.g:2926:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalDim.g:2927:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalDim.g:2945:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalDim.g:2945:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalDim.g:2946:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalDim.g:2946:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalDim.g:2947:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalDim.g:2947:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalDim.g:2948:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalDim.g:2965:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDim.g:2966:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDim.g:2966:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDim.g:2967:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_59);
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

                    // InternalDim.g:2984:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalDim.g:2985:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDim.g:2985:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalDim.g:2986:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalDim.g:2986:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalDim.g:2987:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
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

                    	    // InternalDim.g:3004:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDim.g:3005:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:3005:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDim.g:3006:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_59);
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
                    	    break loop71;
                        }
                    } while (true);

                    // InternalDim.g:3024:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalDim.g:3025:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalDim.g:3025:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalDim.g:3026:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalDim.g:3048:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalDim.g:3048:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalDim.g:3049:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalDim.g:3055:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3061:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDim.g:3062:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDim.g:3062:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDim.g:3063:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDim.g:3063:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDim.g:3064:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDim.g:3083:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalDim.g:3083:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalDim.g:3084:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalDim.g:3090:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3096:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalDim.g:3097:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalDim.g:3097:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalDim.g:3098:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalDim.g:3098:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalDim.g:3099:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalDim.g:3118:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalDim.g:3118:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalDim.g:3119:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalDim.g:3125:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3131:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalDim.g:3132:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalDim.g:3132:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalDim.g:3133:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalDim.g:3133:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalDim.g:3134:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalDim.g:3153:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalDim.g:3153:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalDim.g:3154:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalDim.g:3160:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3166:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalDim.g:3167:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalDim.g:3167:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalDim.g:3168:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalDim.g:3168:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalDim.g:3169:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalDim.g:3188:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalDim.g:3188:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalDim.g:3189:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalDim.g:3195:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDim.g:3201:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalDim.g:3202:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalDim.g:3202:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalDim.g:3203:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3211:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==54) ) {
                    int LA74_2 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt74=1;
                    }
                    else if ( (synpred2_InternalDim()) ) {
                        alt74=2;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // InternalDim.g:3212:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalDim.g:3212:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalDim.g:3213:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalDim.g:3213:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalDim.g:3214:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalDim.g:3226:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalDim.g:3227:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalDim.g:3227:7: ()
            	    // InternalDim.g:3228:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDim.g:3238:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDim.g:3239:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDim.g:3239:8: (otherlv_3= RULE_ID )
            	    // InternalDim.g:3240:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_62);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3260:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalDim.g:3261:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalDim.g:3261:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalDim.g:3262:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_60);
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
            	    // InternalDim.g:3281:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalDim.g:3281:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalDim.g:3282:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalDim.g:3282:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDim.g:3283:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDim.g:3289:6: ( () otherlv_7= '.' )
            	    // InternalDim.g:3290:7: () otherlv_7= '.'
            	    {
            	    // InternalDim.g:3290:7: ()
            	    // InternalDim.g:3291:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3303:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDim.g:3304:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDim.g:3304:6: (otherlv_8= RULE_ID )
            	    // InternalDim.g:3305:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3316:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt73=3;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==41) && (synpred3_InternalDim())) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==55) ) {
            	        alt73=2;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalDim.g:3317:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalDim.g:3317:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalDim.g:3318:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalDim.g:3318:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDim.g:3319:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDim.g:3323:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDim.g:3324:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,41,FOLLOW_64); if (state.failed) return current;
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

            	            // InternalDim.g:3336:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalDim.g:3337:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalDim.g:3337:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalDim.g:3338:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_65);
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

            	            otherlv_11=(Token)match(input,42,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDim.g:3361:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalDim.g:3361:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalDim.g:3362:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalDim.g:3362:7: (lv_before_12_0= '@before' )
            	            // InternalDim.g:3363:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,55,FOLLOW_60); if (state.failed) return current;
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
            	    break loop74;
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
    // InternalDim.g:3382:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalDim.g:3382:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalDim.g:3383:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalDim.g:3389:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3395:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalDim.g:3396:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalDim.g:3396:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalDim.g:3397:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalDim.g:3397:3: ()
            // InternalDim.g:3398:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:3404:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID||(LA76_0>=RULE_NATURAL && LA76_0<=RULE_STRING)||LA76_0==21||LA76_0==33||LA76_0==36||LA76_0==41||LA76_0==62||LA76_0==66||(LA76_0>=71 && LA76_0<=76)||(LA76_0>=79 && LA76_0<=80)||(LA76_0>=117 && LA76_0<=119)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDim.g:3405:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalDim.g:3405:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalDim.g:3406:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalDim.g:3406:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalDim.g:3407:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_66);
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

                    // InternalDim.g:3424:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==30) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalDim.g:3425:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,30,FOLLOW_62); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:3429:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalDim.g:3430:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalDim.g:3430:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalDim.g:3431:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_66);
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
                    	    break loop75;
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
    // InternalDim.g:3454:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalDim.g:3454:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalDim.g:3455:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
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
    // InternalDim.g:3461:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3467:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalDim.g:3468:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalDim.g:3468:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalDim.g:3469:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalDim.g:3469:3: ()
            // InternalDim.g:3470:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:3476:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:3477:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:3477:4: (otherlv_1= RULE_ID )
            // InternalDim.g:3478:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxAssignmentRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxAssignmentAccess().getAssignToMemberDNavigableMemberCrossReference_1_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAssignmentAccess().getDmxOpSingleAssignParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_62);
            ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3496:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalDim.g:3497:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalDim.g:3497:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalDim.g:3498:5: lv_value_3_0= ruleDmxOrExpression
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
    // InternalDim.g:3519:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalDim.g:3519:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalDim.g:3520:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalDim.g:3526:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:3532:2: (kw= ':=' )
            // InternalDim.g:3533:2: kw= ':='
            {
            kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:3541:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalDim.g:3541:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalDim.g:3542:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalDim.g:3548:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDim.g:3554:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalDim.g:3555:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalDim.g:3555:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==56) ) {
                    alt77=1;
                }
                else if ( (LA77_1==EOF||(LA77_1>=RULE_ID && LA77_1<=RULE_RICH_TEXT_END)||(LA77_1>=22 && LA77_1<=23)||LA77_1==25||LA77_1==27||(LA77_1>=29 && LA77_1<=33)||LA77_1==36||LA77_1==38||(LA77_1>=41 && LA77_1<=42)||LA77_1==48||(LA77_1>=53 && LA77_1<=55)||(LA77_1>=57 && LA77_1<=61)||(LA77_1>=67 && LA77_1<=70)||(LA77_1>=79 && LA77_1<=80)||(LA77_1>=82 && LA77_1<=83)||(LA77_1>=97 && LA77_1<=116)) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA77_0>=RULE_NATURAL && LA77_0<=RULE_STRING)||LA77_0==21||LA77_0==33||LA77_0==36||LA77_0==41||LA77_0==62||LA77_0==66||(LA77_0>=71 && LA77_0<=76)||(LA77_0>=79 && LA77_0<=80)||(LA77_0>=117 && LA77_0<=119)) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalDim.g:3556:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalDim.g:3556:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalDim.g:3557:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalDim.g:3557:4: ()
                    // InternalDim.g:3558:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDim.g:3564:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalDim.g:3565:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalDim.g:3565:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalDim.g:3566:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_67);
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

                    otherlv_2=(Token)match(input,56,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalDim.g:3587:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalDim.g:3588:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalDim.g:3588:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalDim.g:3589:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalDim.g:3608:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalDim.g:3620:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalDim.g:3620:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalDim.g:3621:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalDim.g:3627:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3633:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDim.g:3634:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDim.g:3634:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:3635:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:3635:3: (lv_name_0_0= RULE_ID )
            // InternalDim.g:3636:4: lv_name_0_0= RULE_ID
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
    // InternalDim.g:3655:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalDim.g:3655:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalDim.g:3656:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalDim.g:3662:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3668:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalDim.g:3669:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalDim.g:3669:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalDim.g:3670:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3678:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop78:
            do {
                int alt78=2;
                switch ( input.LA(1) ) {
                case 97:
                    {
                    int LA78_2 = input.LA(2);

                    if ( (synpred4_InternalDim()) ) {
                        alt78=1;
                    }


                    }
                    break;
                case 98:
                    {
                    int LA78_3 = input.LA(2);

                    if ( (synpred4_InternalDim()) ) {
                        alt78=1;
                    }


                    }
                    break;
                case 99:
                    {
                    int LA78_4 = input.LA(2);

                    if ( (synpred4_InternalDim()) ) {
                        alt78=1;
                    }


                    }
                    break;
                case 100:
                    {
                    int LA78_5 = input.LA(2);

                    if ( (synpred4_InternalDim()) ) {
                        alt78=1;
                    }


                    }
                    break;

                }

                switch (alt78) {
            	case 1 :
            	    // InternalDim.g:3679:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalDim.g:3679:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalDim.g:3680:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalDim.g:3690:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalDim.g:3691:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalDim.g:3691:6: ()
            	    // InternalDim.g:3692:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3698:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalDim.g:3699:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalDim.g:3699:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalDim.g:3700:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_62);
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

            	    // InternalDim.g:3719:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalDim.g:3720:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalDim.g:3720:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalDim.g:3721:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_68);
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
    // $ANTLR end "ruleDmxOrExpression"


    // $ANTLR start "entryRuleDmxAndExpression"
    // InternalDim.g:3743:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalDim.g:3743:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalDim.g:3744:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalDim.g:3750:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3756:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalDim.g:3757:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalDim.g:3757:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalDim.g:3758:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_69);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3766:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==101) ) {
                    int LA79_2 = input.LA(2);

                    if ( (synpred5_InternalDim()) ) {
                        alt79=1;
                    }


                }
                else if ( (LA79_0==102) ) {
                    int LA79_3 = input.LA(2);

                    if ( (synpred5_InternalDim()) ) {
                        alt79=1;
                    }


                }


                switch (alt79) {
            	case 1 :
            	    // InternalDim.g:3767:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalDim.g:3767:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalDim.g:3768:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalDim.g:3778:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalDim.g:3779:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalDim.g:3779:6: ()
            	    // InternalDim.g:3780:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3786:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalDim.g:3787:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalDim.g:3787:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalDim.g:3788:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_62);
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

            	    // InternalDim.g:3807:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalDim.g:3808:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalDim.g:3808:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalDim.g:3809:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_69);
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalDim.g:3831:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalDim.g:3831:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalDim.g:3832:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalDim.g:3838:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3844:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalDim.g:3845:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalDim.g:3845:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalDim.g:3846:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_70);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3854:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop80:
            do {
                int alt80=2;
                switch ( input.LA(1) ) {
                case 61:
                    {
                    int LA80_2 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt80=1;
                    }


                    }
                    break;
                case 103:
                    {
                    int LA80_3 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt80=1;
                    }


                    }
                    break;
                case 104:
                    {
                    int LA80_4 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt80=1;
                    }


                    }
                    break;

                }

                switch (alt80) {
            	case 1 :
            	    // InternalDim.g:3855:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalDim.g:3855:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalDim.g:3856:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalDim.g:3866:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalDim.g:3867:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalDim.g:3867:6: ()
            	    // InternalDim.g:3868:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3874:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalDim.g:3875:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalDim.g:3875:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalDim.g:3876:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_62);
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

            	    // InternalDim.g:3895:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalDim.g:3896:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalDim.g:3896:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalDim.g:3897:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_70);
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
    // $ANTLR end "ruleDmxEqualityExpression"


    // $ANTLR start "entryRuleDmxRelationalExpression"
    // InternalDim.g:3919:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalDim.g:3919:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalDim.g:3920:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalDim.g:3926:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3932:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalDim.g:3933:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalDim.g:3933:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalDim.g:3934:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_71);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3942:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop81:
            do {
                int alt81=3;
                alt81 = dfa81.predict(input);
                switch (alt81) {
            	case 1 :
            	    // InternalDim.g:3943:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDim.g:3943:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDim.g:3944:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDim.g:3944:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalDim.g:3945:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalDim.g:3951:6: ( () ruleDmxOpInstanceOf )
            	    // InternalDim.g:3952:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalDim.g:3952:7: ()
            	    // InternalDim.g:3953:8: 
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
            	    pushFollow(FOLLOW_3);
            	    ruleDmxOpInstanceOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3968:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDim.g:3969:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDim.g:3969:6: (otherlv_3= RULE_ID )
            	    // InternalDim.g:3970:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:3983:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalDim.g:3983:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalDim.g:3984:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalDim.g:3984:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDim.g:3985:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDim.g:3995:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDim.g:3996:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDim.g:3996:7: ()
            	    // InternalDim.g:3997:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDim.g:4003:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDim.g:4004:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDim.g:4004:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDim.g:4005:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_62);
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

            	    // InternalDim.g:4024:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalDim.g:4025:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalDim.g:4025:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalDim.g:4026:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_71);
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
            	    break loop81;
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
    // InternalDim.g:4049:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalDim.g:4049:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalDim.g:4050:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalDim.g:4056:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:4062:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDim.g:4063:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDim.g:4063:2: (kw= 'ISA' | kw= 'isa' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==57) ) {
                alt82=1;
            }
            else if ( (LA82_0==58) ) {
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
                    // InternalDim.g:4064:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4070:3: kw= 'isa'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4079:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalDim.g:4079:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalDim.g:4080:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalDim.g:4086:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4092:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalDim.g:4093:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalDim.g:4093:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalDim.g:4094:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_72);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4102:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop83:
            do {
                int alt83=2;
                switch ( input.LA(1) ) {
                case 111:
                    {
                    int LA83_2 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt83=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA83_3 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt83=1;
                    }


                    }
                    break;
                case 70:
                    {
                    int LA83_4 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt83=1;
                    }


                    }
                    break;
                case 112:
                    {
                    int LA83_5 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt83=1;
                    }


                    }
                    break;
                case 113:
                    {
                    int LA83_6 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt83=1;
                    }


                    }
                    break;

                }

                switch (alt83) {
            	case 1 :
            	    // InternalDim.g:4103:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalDim.g:4103:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDim.g:4104:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDim.g:4114:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDim.g:4115:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDim.g:4115:6: ()
            	    // InternalDim.g:4116:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4122:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDim.g:4123:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDim.g:4123:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDim.g:4124:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_62);
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

            	    // InternalDim.g:4143:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalDim.g:4144:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalDim.g:4144:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalDim.g:4145:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_72);
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalDim.g:4167:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalDim.g:4167:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalDim.g:4168:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalDim.g:4174:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4180:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalDim.g:4181:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalDim.g:4181:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalDim.g:4182:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_73);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4190:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==79) ) {
                    int LA84_2 = input.LA(2);

                    if ( (synpred10_InternalDim()) ) {
                        alt84=1;
                    }


                }
                else if ( (LA84_0==80) ) {
                    int LA84_3 = input.LA(2);

                    if ( (synpred10_InternalDim()) ) {
                        alt84=1;
                    }


                }


                switch (alt84) {
            	case 1 :
            	    // InternalDim.g:4191:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalDim.g:4191:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDim.g:4192:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDim.g:4202:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDim.g:4203:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDim.g:4203:6: ()
            	    // InternalDim.g:4204:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4210:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDim.g:4211:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDim.g:4211:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDim.g:4212:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_62);
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

            	    // InternalDim.g:4231:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalDim.g:4232:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalDim.g:4232:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalDim.g:4233:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_73);
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalDim.g:4255:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalDim.g:4255:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalDim.g:4256:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalDim.g:4262:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4268:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalDim.g:4269:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalDim.g:4269:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalDim.g:4270:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_74);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4278:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop85:
            do {
                int alt85=2;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    int LA85_2 = input.LA(2);

                    if ( (synpred11_InternalDim()) ) {
                        alt85=1;
                    }


                    }
                    break;
                case 114:
                    {
                    int LA85_3 = input.LA(2);

                    if ( (synpred11_InternalDim()) ) {
                        alt85=1;
                    }


                    }
                    break;
                case 115:
                    {
                    int LA85_4 = input.LA(2);

                    if ( (synpred11_InternalDim()) ) {
                        alt85=1;
                    }


                    }
                    break;
                case 116:
                    {
                    int LA85_5 = input.LA(2);

                    if ( (synpred11_InternalDim()) ) {
                        alt85=1;
                    }


                    }
                    break;

                }

                switch (alt85) {
            	case 1 :
            	    // InternalDim.g:4279:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalDim.g:4279:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDim.g:4280:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDim.g:4290:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDim.g:4291:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDim.g:4291:6: ()
            	    // InternalDim.g:4292:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4298:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDim.g:4299:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDim.g:4299:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDim.g:4300:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_62);
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

            	    // InternalDim.g:4319:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalDim.g:4320:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalDim.g:4320:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalDim.g:4321:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_74);
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
            	    break loop85;
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
    // InternalDim.g:4343:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalDim.g:4343:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalDim.g:4344:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalDim.g:4350:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDim.g:4356:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalDim.g:4357:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalDim.g:4357:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=79 && LA86_0<=80)||(LA86_0>=117 && LA86_0<=119)) ) {
                alt86=1;
            }
            else if ( (LA86_0==RULE_ID||(LA86_0>=RULE_NATURAL && LA86_0<=RULE_STRING)||LA86_0==21||LA86_0==33||LA86_0==36||LA86_0==41||LA86_0==62||LA86_0==66||(LA86_0>=71 && LA86_0<=76)) ) {
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
                    // InternalDim.g:4358:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalDim.g:4358:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalDim.g:4359:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalDim.g:4359:4: ()
                    // InternalDim.g:4360:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDim.g:4366:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDim.g:4367:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDim.g:4367:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDim.g:4368:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
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

                    // InternalDim.g:4385:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalDim.g:4386:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalDim.g:4386:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalDim.g:4387:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalDim.g:4406:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalDim.g:4418:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalDim.g:4418:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalDim.g:4419:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalDim.g:4425:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4431:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDim.g:4432:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDim.g:4432:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDim.g:4433:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_75);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4441:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==59) ) {
                int LA87_1 = input.LA(2);

                if ( (synpred12_InternalDim()) ) {
                    alt87=1;
                }
            }
            else if ( (LA87_0==60) ) {
                int LA87_2 = input.LA(2);

                if ( (synpred12_InternalDim()) ) {
                    alt87=1;
                }
            }
            switch (alt87) {
                case 1 :
                    // InternalDim.g:4442:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDim.g:4442:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalDim.g:4443:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalDim.g:4449:5: ( () ruleDmxOpCast )
                    // InternalDim.g:4450:6: () ruleDmxOpCast
                    {
                    // InternalDim.g:4450:6: ()
                    // InternalDim.g:4451:7: 
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
                    pushFollow(FOLLOW_3);
                    ruleDmxOpCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:4466:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDim.g:4467:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDim.g:4467:5: (otherlv_3= RULE_ID )
                    // InternalDim.g:4468:6: otherlv_3= RULE_ID
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
    // InternalDim.g:4484:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalDim.g:4484:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalDim.g:4485:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalDim.g:4491:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:4497:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDim.g:4498:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDim.g:4498:2: (kw= 'AS' | kw= 'as' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==59) ) {
                alt88=1;
            }
            else if ( (LA88_0==60) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalDim.g:4499:3: kw= 'AS'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4505:3: kw= 'as'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4514:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalDim.g:4514:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalDim.g:4515:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalDim.g:4521:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalDim.g:4527:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalDim.g:4528:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalDim.g:4528:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt89=7;
            switch ( input.LA(1) ) {
            case RULE_NATURAL:
            case RULE_STRING:
            case 33:
            case 36:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt89=1;
                }
                break;
            case 41:
                {
                alt89=2;
                }
                break;
            case 21:
                {
                alt89=3;
                }
                break;
            case RULE_ID:
                {
                int LA89_4 = input.LA(2);

                if ( (LA89_4==41) ) {
                    alt89=4;
                }
                else if ( (LA89_4==EOF||(LA89_4>=RULE_ID && LA89_4<=RULE_RICH_TEXT_END)||(LA89_4>=22 && LA89_4<=23)||LA89_4==25||LA89_4==27||(LA89_4>=29 && LA89_4<=33)||LA89_4==36||LA89_4==38||LA89_4==42||LA89_4==48||(LA89_4>=53 && LA89_4<=55)||(LA89_4>=57 && LA89_4<=61)||(LA89_4>=67 && LA89_4<=70)||(LA89_4>=79 && LA89_4<=80)||(LA89_4>=82 && LA89_4<=83)||(LA89_4>=97 && LA89_4<=116)) ) {
                    alt89=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 4, input);

                    throw nvae;
                }
                }
                break;
            case 62:
                {
                alt89=5;
                }
                break;
            case 66:
                {
                alt89=7;
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
                    // InternalDim.g:4529:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalDim.g:4538:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalDim.g:4547:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalDim.g:4556:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalDim.g:4565:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalDim.g:4574:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalDim.g:4583:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalDim.g:4595:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalDim.g:4595:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalDim.g:4596:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalDim.g:4602:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalDim.g:4608:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalDim.g:4609:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalDim.g:4609:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt90=7;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // InternalDim.g:4610:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalDim.g:4619:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalDim.g:4628:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalDim.g:4637:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalDim.g:4646:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalDim.g:4655:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalDim.g:4664:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalDim.g:4676:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalDim.g:4676:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalDim.g:4677:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalDim.g:4683:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDim.g:4689:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDim.g:4690:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDim.g:4690:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDim.g:4691:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_65);
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
    // InternalDim.g:4711:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalDim.g:4711:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalDim.g:4712:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalDim.g:4718:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4724:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDim.g:4725:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDim.g:4725:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalDim.g:4726:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDim.g:4726:3: ()
            // InternalDim.g:4727:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDim.g:4737:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_ID && LA92_0<=RULE_RICH_TEXT_START)||(LA92_0>=RULE_NATURAL && LA92_0<=RULE_STRING)||LA92_0==21||LA92_0==33||LA92_0==36||LA92_0==41||LA92_0==62||LA92_0==66||(LA92_0>=71 && LA92_0<=76)||(LA92_0>=79 && LA92_0<=80)||(LA92_0>=117 && LA92_0<=119)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalDim.g:4738:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalDim.g:4738:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDim.g:4739:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDim.g:4739:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDim.g:4740:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
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

                    // InternalDim.g:4757:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==30) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalDim.g:4758:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:4762:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDim.g:4763:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:4763:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDim.g:4764:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	    break loop91;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4791:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalDim.g:4791:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalDim.g:4792:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalDim.g:4798:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4804:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDim.g:4805:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDim.g:4805:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalDim.g:4806:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDim.g:4806:3: ()
            // InternalDim.g:4807:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDim.g:4817:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_NATURAL && LA94_0<=RULE_STRING)||LA94_0==33||LA94_0==36||(LA94_0>=71 && LA94_0<=76)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalDim.g:4818:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalDim.g:4818:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalDim.g:4819:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalDim.g:4819:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalDim.g:4820:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
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

                    // InternalDim.g:4837:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==30) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalDim.g:4838:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_78); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:4842:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalDim.g:4843:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalDim.g:4843:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalDim.g:4844:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4871:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalDim.g:4871:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalDim.g:4872:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalDim.g:4878:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4884:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalDim.g:4885:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalDim.g:4885:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalDim.g:4886:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalDim.g:4886:3: ()
            // InternalDim.g:4887:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4893:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:4894:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:4894:4: (otherlv_1= RULE_ID )
            // InternalDim.g:4895:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:4910:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalDim.g:4911:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalDim.g:4911:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalDim.g:4912:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_65);
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
    // InternalDim.g:4937:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalDim.g:4937:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalDim.g:4938:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalDim.g:4944:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4950:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalDim.g:4951:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalDim.g:4951:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalDim.g:4952:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalDim.g:4952:3: ()
            // InternalDim.g:4953:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4959:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_ID && LA96_0<=RULE_RICH_TEXT_START)||(LA96_0>=RULE_NATURAL && LA96_0<=RULE_STRING)||LA96_0==21||LA96_0==33||LA96_0==36||LA96_0==41||LA96_0==62||LA96_0==66||(LA96_0>=71 && LA96_0<=76)||(LA96_0>=79 && LA96_0<=80)||(LA96_0>=117 && LA96_0<=119)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalDim.g:4960:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalDim.g:4960:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalDim.g:4961:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalDim.g:4961:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalDim.g:4962:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_66);
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

                    // InternalDim.g:4979:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==30) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalDim.g:4980:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:4984:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalDim.g:4985:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:4985:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalDim.g:4986:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_66);
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
                    	    break loop95;
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
    // InternalDim.g:5009:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalDim.g:5009:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalDim.g:5010:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalDim.g:5016:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDim.g:5022:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDim.g:5023:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDim.g:5023:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDim.g:5024:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
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
    // InternalDim.g:5043:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalDim.g:5043:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalDim.g:5044:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalDim.g:5050:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDim.g:5056:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDim.g:5057:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDim.g:5057:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDim.g:5058:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
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
    // InternalDim.g:5078:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5084:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalDim.g:5085:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalDim.g:5085:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalDim.g:5086:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalDim.g:5086:3: ( (otherlv_0= RULE_ID ) )
            // InternalDim.g:5087:4: (otherlv_0= RULE_ID )
            {
            // InternalDim.g:5087:4: (otherlv_0= RULE_ID )
            // InternalDim.g:5088:5: otherlv_0= RULE_ID
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
            pushFollow(FOLLOW_80);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:5106:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==RULE_ID) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalDim.g:5107:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalDim.g:5107:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalDim.g:5108:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_80);
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
            	    break loop97;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5133:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalDim.g:5133:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalDim.g:5134:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalDim.g:5140:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5146:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalDim.g:5147:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalDim.g:5147:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalDim.g:5148:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalDim.g:5148:3: ( (otherlv_0= RULE_ID ) )
            // InternalDim.g:5149:4: (otherlv_0= RULE_ID )
            {
            // InternalDim.g:5149:4: (otherlv_0= RULE_ID )
            // InternalDim.g:5150:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,61,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalDim.g:5165:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalDim.g:5166:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalDim.g:5166:4: (lv_value_2_0= ruleDExpression )
            // InternalDim.g:5167:5: lv_value_2_0= ruleDExpression
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
    // InternalDim.g:5188:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalDim.g:5188:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalDim.g:5189:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalDim.g:5195:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalDim.g:5201:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalDim.g:5202:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalDim.g:5202:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalDim.g:5203:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalDim.g:5203:3: ()
            // InternalDim.g:5204:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalDim.g:5214:3: ( ( ruleDQualifiedName ) )
            // InternalDim.g:5215:4: ( ruleDQualifiedName )
            {
            // InternalDim.g:5215:4: ( ruleDQualifiedName )
            // InternalDim.g:5216:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_82);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDim.g:5230:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==63) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalDim.g:5231:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalDim.g:5235:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDim.g:5236:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDim.g:5236:5: (otherlv_4= RULE_ID )
                    // InternalDim.g:5237:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:5249:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==56) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalDim.g:5250:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalDim.g:5254:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==RULE_ID) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==53) ) {
                        alt99=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalDim.g:5255:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalDim.g:5255:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalDim.g:5256:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalDim.g:5256:6: (lv_displayName_6_0= RULE_ID )
                            // InternalDim.g:5257:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_85); if (state.failed) return current;
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
                            // InternalDim.g:5274:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalDim.g:5274:5: ( (lv_plural_7_0= '*' ) )
                            // InternalDim.g:5275:6: (lv_plural_7_0= '*' )
                            {
                            // InternalDim.g:5275:6: (lv_plural_7_0= '*' )
                            // InternalDim.g:5276:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,53,FOLLOW_85); if (state.failed) return current;
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

            // InternalDim.g:5290:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalDim.g:5291:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5301:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalDim.g:5301:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalDim.g:5302:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalDim.g:5308:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalDim.g:5314:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalDim.g:5315:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalDim.g:5315:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalDim.g:5316:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalDim.g:5316:3: ()
            // InternalDim.g:5317:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5323:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:5324:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:5324:4: (otherlv_1= RULE_ID )
            // InternalDim.g:5325:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDim.g:5336:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==55) ) {
                alt101=1;
            }
            else if ( (LA101_0==54) ) {
                int LA101_2 = input.LA(2);

                if ( (LA101_2==65) ) {
                    alt101=2;
                }
            }
            switch (alt101) {
                case 1 :
                    // InternalDim.g:5337:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalDim.g:5337:4: ( (lv_before_2_0= '@before' ) )
                    // InternalDim.g:5338:5: (lv_before_2_0= '@before' )
                    {
                    // InternalDim.g:5338:5: (lv_before_2_0= '@before' )
                    // InternalDim.g:5339:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:5352:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalDim.g:5352:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalDim.g:5353:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalDim.g:5357:5: ( (lv_all_4_0= 'all' ) )
                    // InternalDim.g:5358:6: (lv_all_4_0= 'all' )
                    {
                    // InternalDim.g:5358:6: (lv_all_4_0= 'all' )
                    // InternalDim.g:5359:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5377:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalDim.g:5377:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalDim.g:5378:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalDim.g:5384:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDim.g:5390:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDim.g:5391:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDim.g:5391:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDim.g:5392:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDim.g:5392:3: ()
            // InternalDim.g:5393:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDim.g:5403:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDim.g:5404:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDim.g:5404:4: (lv_if_2_0= ruleDExpression )
            // InternalDim.g:5405:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_88);
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

            otherlv_3=(Token)match(input,67,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDim.g:5426:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDim.g:5427:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDim.g:5427:4: (lv_then_4_0= ruleDExpression )
            // InternalDim.g:5428:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_89);
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

            // InternalDim.g:5445:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==68) && (synpred14_InternalDim())) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDim.g:5446:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDim.g:5446:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDim.g:5447:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDim.g:5453:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDim.g:5454:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDim.g:5454:5: (lv_else_6_0= ruleDExpression )
                    // InternalDim.g:5455:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_90);
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

            otherlv_7=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5481:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDim.g:5481:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDim.g:5482:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDim.g:5488:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalDim.g:5494:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalDim.g:5495:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalDim.g:5495:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==53||LA103_0==79||LA103_0==120) ) {
                alt103=1;
            }
            else if ( (LA103_0==41) ) {
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
                    // InternalDim.g:5496:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalDim.g:5496:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalDim.g:5497:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalDim.g:5497:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalDim.g:5498:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalDim.g:5516:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalDim.g:5516:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalDim.g:5517:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_91); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalDim.g:5521:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalDim.g:5522:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalDim.g:5522:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalDim.g:5523:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_92); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,70,FOLLOW_93); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalDim.g:5543:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalDim.g:5544:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalDim.g:5544:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalDim.g:5545:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_65);
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
    // InternalDim.g:5571:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDim.g:5571:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDim.g:5572:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDim.g:5578:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:5584:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDim.g:5585:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDim.g:5585:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_NATURAL) ) {
                alt104=1;
            }
            else if ( (LA104_0==53) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalDim.g:5586:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDim.g:5594:3: kw= '*'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5603:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalDim.g:5603:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalDim.g:5604:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalDim.g:5610:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDim.g:5616:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDim.g:5617:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDim.g:5617:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDim.g:5618:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDim.g:5618:3: ()
            // InternalDim.g:5619:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5625:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt105=1;
                }
                break;
            case 72:
                {
                alt105=2;
                }
                break;
            case 73:
                {
                alt105=3;
                }
                break;
            case 74:
                {
                alt105=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalDim.g:5626:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDim.g:5626:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDim.g:5627:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDim.g:5627:5: (lv_value_1_0= 'TRUE' )
                    // InternalDim.g:5628:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:5641:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDim.g:5641:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDim.g:5642:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDim.g:5642:5: (lv_value_2_0= 'true' )
                    // InternalDim.g:5643:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:5656:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDim.g:5661:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5670:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalDim.g:5670:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalDim.g:5671:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalDim.g:5677:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDim.g:5683:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDim.g:5684:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDim.g:5684:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDim.g:5685:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDim.g:5685:3: ()
            // InternalDim.g:5686:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5692:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDim.g:5693:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDim.g:5693:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDim.g:5694:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDim.g:5714:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalDim.g:5714:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalDim.g:5715:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalDim.g:5721:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5727:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDim.g:5728:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDim.g:5728:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDim.g:5729:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDim.g:5729:3: ()
            // InternalDim.g:5730:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5736:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDim.g:5737:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDim.g:5737:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDim.g:5738:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDim.g:5759:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalDim.g:5759:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalDim.g:5760:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalDim.g:5766:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDim.g:5772:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDim.g:5773:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDim.g:5773:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDim.g:5774:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDim.g:5774:3: ()
            // InternalDim.g:5775:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5781:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDim.g:5782:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDim.g:5782:4: (lv_value_1_0= RULE_STRING )
            // InternalDim.g:5783:5: lv_value_1_0= RULE_STRING
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
    // InternalDim.g:5803:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalDim.g:5803:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalDim.g:5804:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalDim.g:5810:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDim.g:5816:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDim.g:5817:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDim.g:5817:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDim.g:5818:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDim.g:5818:3: ()
            // InternalDim.g:5819:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5825:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==75) ) {
                alt106=1;
            }
            else if ( (LA106_0==76) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalDim.g:5826:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:5831:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5840:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDim.g:5840:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDim.g:5841:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDim.g:5847:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDim.g:5853:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDim.g:5854:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDim.g:5854:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDim.g:5855:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,54,FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDim.g:5874:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=77 && LA109_0<=78)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalDim.g:5875:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDim.g:5875:4: (kw= 'E' | kw= 'e' )
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==77) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==78) ) {
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
                            // InternalDim.g:5876:5: kw= 'E'
                            {
                            kw=(Token)match(input,77,FOLLOW_96); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDim.g:5882:5: kw= 'e'
                            {
                            kw=(Token)match(input,78,FOLLOW_96); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDim.g:5888:4: (kw= '+' | kw= '-' )?
                    int alt108=3;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==79) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==80) ) {
                        alt108=2;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalDim.g:5889:5: kw= '+'
                            {
                            kw=(Token)match(input,79,FOLLOW_91); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDim.g:5895:5: kw= '-'
                            {
                            kw=(Token)match(input,80,FOLLOW_91); if (state.failed) return current;
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
    // InternalDim.g:5913:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalDim.g:5913:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalDim.g:5914:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
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
    // InternalDim.g:5920:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:5926:2: (kw= '{' )
            // InternalDim.g:5927:2: kw= '{'
            {
            kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5935:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDim.g:5935:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDim.g:5936:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDim.g:5942:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5948:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDim.g:5949:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDim.g:5949:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDim.g:5950:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_97);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:5960:3: (kw= '.*' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==81) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalDim.g:5961:4: kw= '.*'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5971:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDim.g:5971:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDim.g:5972:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDim.g:5978:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDim.g:5984:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDim.g:5985:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDim.g:5985:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDim.g:5986:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDim.g:5993:3: (kw= '.' this_ID_2= RULE_ID )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==54) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalDim.g:5994:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop111;
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


    // $ANTLR start "ruleDEntityNatureAutonomous"
    // InternalDim.g:6011:1: ruleDEntityNatureAutonomous returns [Enumerator current=null] : (enumLiteral_0= 'autonomous' ) ;
    public final Enumerator ruleDEntityNatureAutonomous() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDim.g:6017:2: ( (enumLiteral_0= 'autonomous' ) )
            // InternalDim.g:6018:2: (enumLiteral_0= 'autonomous' )
            {
            // InternalDim.g:6018:2: (enumLiteral_0= 'autonomous' )
            // InternalDim.g:6019:3: enumLiteral_0= 'autonomous'
            {
            enumLiteral_0=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getDEntityNatureAutonomousAccess().getAUTONOMOUS_ENTITYEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getDEntityNatureAutonomousAccess().getAUTONOMOUS_ENTITYEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDEntityNatureAutonomous"


    // $ANTLR start "ruleDEntityNatureRelationship"
    // InternalDim.g:6028:1: ruleDEntityNatureRelationship returns [Enumerator current=null] : (enumLiteral_0= 'relationship' ) ;
    public final Enumerator ruleDEntityNatureRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDim.g:6034:2: ( (enumLiteral_0= 'relationship' ) )
            // InternalDim.g:6035:2: (enumLiteral_0= 'relationship' )
            {
            // InternalDim.g:6035:2: (enumLiteral_0= 'relationship' )
            // InternalDim.g:6036:3: enumLiteral_0= 'relationship'
            {
            enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getDEntityNatureRelationshipAccess().getRELATIONSHIPEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getDEntityNatureRelationshipAccess().getRELATIONSHIPEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDEntityNatureRelationship"


    // $ANTLR start "ruleDAssociationKind"
    // InternalDim.g:6045:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:6051:2: ( ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) )
            // InternalDim.g:6052:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            {
            // InternalDim.g:6052:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==84) ) {
                alt112=1;
            }
            else if ( (LA112_0==39) ) {
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
                    // InternalDim.g:6053:3: (enumLiteral_0= 'references' )
                    {
                    // InternalDim.g:6053:3: (enumLiteral_0= 'references' )
                    // InternalDim.g:6054:4: enumLiteral_0= 'references'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6061:3: (enumLiteral_1= 'contains' )
                    {
                    // InternalDim.g:6061:3: (enumLiteral_1= 'contains' )
                    // InternalDim.g:6062:4: enumLiteral_1= 'contains'
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
    // InternalDim.g:6072:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDim.g:6078:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDim.g:6079:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDim.g:6079:2: (enumLiteral_0= 'inverse' )
            // InternalDim.g:6080:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6089:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalDim.g:6095:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalDim.g:6096:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalDim.g:6096:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt113=11;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt113=1;
                }
                break;
            case 87:
                {
                alt113=2;
                }
                break;
            case 88:
                {
                alt113=3;
                }
                break;
            case 89:
                {
                alt113=4;
                }
                break;
            case 90:
                {
                alt113=5;
                }
                break;
            case 91:
                {
                alt113=6;
                }
                break;
            case 92:
                {
                alt113=7;
                }
                break;
            case 93:
                {
                alt113=8;
                }
                break;
            case 94:
                {
                alt113=9;
                }
                break;
            case 95:
                {
                alt113=10;
                }
                break;
            case 96:
                {
                alt113=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalDim.g:6097:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalDim.g:6097:3: (enumLiteral_0= 'VOID' )
                    // InternalDim.g:6098:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6105:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDim.g:6105:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDim.g:6106:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6113:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalDim.g:6113:3: (enumLiteral_2= 'NUMBER' )
                    // InternalDim.g:6114:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6121:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalDim.g:6121:3: (enumLiteral_3= 'TEXT' )
                    // InternalDim.g:6122:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:6129:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalDim.g:6129:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalDim.g:6130:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDim.g:6137:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalDim.g:6137:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalDim.g:6138:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDim.g:6145:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalDim.g:6145:3: (enumLiteral_6= 'STATE' )
                    // InternalDim.g:6146:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDim.g:6153:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalDim.g:6153:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalDim.g:6154:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDim.g:6161:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalDim.g:6161:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalDim.g:6162:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDim.g:6169:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalDim.g:6169:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalDim.g:6170:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDim.g:6177:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalDim.g:6177:3: (enumLiteral_10= 'SERVICE' )
                    // InternalDim.g:6178:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6188:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDim.g:6194:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDim.g:6195:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDim.g:6195:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt114=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt114=1;
                }
                break;
            case 98:
                {
                alt114=2;
                }
                break;
            case 99:
                {
                alt114=3;
                }
                break;
            case 100:
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
                    // InternalDim.g:6196:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDim.g:6196:3: (enumLiteral_0= 'OR' )
                    // InternalDim.g:6197:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6204:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDim.g:6204:3: (enumLiteral_1= 'or' )
                    // InternalDim.g:6205:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6212:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDim.g:6212:3: (enumLiteral_2= 'XOR' )
                    // InternalDim.g:6213:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6220:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDim.g:6220:3: (enumLiteral_3= 'xor' )
                    // InternalDim.g:6221:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6231:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:6237:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDim.g:6238:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDim.g:6238:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==101) ) {
                alt115=1;
            }
            else if ( (LA115_0==102) ) {
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
                    // InternalDim.g:6239:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDim.g:6239:3: (enumLiteral_0= 'AND' )
                    // InternalDim.g:6240:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6247:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDim.g:6247:3: (enumLiteral_1= 'and' )
                    // InternalDim.g:6248:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6258:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDim.g:6264:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDim.g:6265:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDim.g:6265:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt116=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt116=1;
                }
                break;
            case 103:
                {
                alt116=2;
                }
                break;
            case 104:
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
                    // InternalDim.g:6266:3: (enumLiteral_0= '=' )
                    {
                    // InternalDim.g:6266:3: (enumLiteral_0= '=' )
                    // InternalDim.g:6267:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6274:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDim.g:6274:3: (enumLiteral_1= '!=' )
                    // InternalDim.g:6275:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6282:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDim.g:6282:3: (enumLiteral_2= '<>' )
                    // InternalDim.g:6283:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6293:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDim.g:6299:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDim.g:6300:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDim.g:6300:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt117=6;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt117=1;
                }
                break;
            case 106:
                {
                alt117=2;
                }
                break;
            case 107:
                {
                alt117=3;
                }
                break;
            case 108:
                {
                alt117=4;
                }
                break;
            case 109:
                {
                alt117=5;
                }
                break;
            case 110:
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
                    // InternalDim.g:6301:3: (enumLiteral_0= '<' )
                    {
                    // InternalDim.g:6301:3: (enumLiteral_0= '<' )
                    // InternalDim.g:6302:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6309:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDim.g:6309:3: (enumLiteral_1= '<=' )
                    // InternalDim.g:6310:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6317:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDim.g:6317:3: (enumLiteral_2= '\\u2264' )
                    // InternalDim.g:6318:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6325:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDim.g:6325:3: (enumLiteral_3= '>=' )
                    // InternalDim.g:6326:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:6333:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDim.g:6333:3: (enumLiteral_4= '\\u2265' )
                    // InternalDim.g:6334:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDim.g:6341:3: (enumLiteral_5= '>' )
                    {
                    // InternalDim.g:6341:3: (enumLiteral_5= '>' )
                    // InternalDim.g:6342:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6352:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDim.g:6358:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalDim.g:6359:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalDim.g:6359:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt118=5;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt118=1;
                }
                break;
            case 48:
                {
                alt118=2;
                }
                break;
            case 70:
                {
                alt118=3;
                }
                break;
            case 112:
                {
                alt118=4;
                }
                break;
            case 113:
                {
                alt118=5;
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
                    // InternalDim.g:6360:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDim.g:6360:3: (enumLiteral_0= 'IN' )
                    // InternalDim.g:6361:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6368:3: (enumLiteral_1= 'in' )
                    {
                    // InternalDim.g:6368:3: (enumLiteral_1= 'in' )
                    // InternalDim.g:6369:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6376:3: (enumLiteral_2= '..' )
                    {
                    // InternalDim.g:6376:3: (enumLiteral_2= '..' )
                    // InternalDim.g:6377:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6384:3: (enumLiteral_3= '->' )
                    {
                    // InternalDim.g:6384:3: (enumLiteral_3= '->' )
                    // InternalDim.g:6385:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:6392:3: (enumLiteral_4= '=>' )
                    {
                    // InternalDim.g:6392:3: (enumLiteral_4= '=>' )
                    // InternalDim.g:6393:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6403:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:6409:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDim.g:6410:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDim.g:6410:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==79) ) {
                alt119=1;
            }
            else if ( (LA119_0==80) ) {
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
                    // InternalDim.g:6411:3: (enumLiteral_0= '+' )
                    {
                    // InternalDim.g:6411:3: (enumLiteral_0= '+' )
                    // InternalDim.g:6412:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6419:3: (enumLiteral_1= '-' )
                    {
                    // InternalDim.g:6419:3: (enumLiteral_1= '-' )
                    // InternalDim.g:6420:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6430:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDim.g:6436:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDim.g:6437:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDim.g:6437:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt120=1;
                }
                break;
            case 114:
                {
                alt120=2;
                }
                break;
            case 115:
                {
                alt120=3;
                }
                break;
            case 116:
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
                    // InternalDim.g:6438:3: (enumLiteral_0= '*' )
                    {
                    // InternalDim.g:6438:3: (enumLiteral_0= '*' )
                    // InternalDim.g:6439:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6446:3: (enumLiteral_1= '/' )
                    {
                    // InternalDim.g:6446:3: (enumLiteral_1= '/' )
                    // InternalDim.g:6447:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6454:3: (enumLiteral_2= '**' )
                    {
                    // InternalDim.g:6454:3: (enumLiteral_2= '**' )
                    // InternalDim.g:6455:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6462:3: (enumLiteral_3= '%' )
                    {
                    // InternalDim.g:6462:3: (enumLiteral_3= '%' )
                    // InternalDim.g:6463:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6473:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDim.g:6479:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDim.g:6480:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDim.g:6480:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt121=5;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt121=1;
                }
                break;
            case 80:
                {
                alt121=2;
                }
                break;
            case 117:
                {
                alt121=3;
                }
                break;
            case 118:
                {
                alt121=4;
                }
                break;
            case 119:
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
                    // InternalDim.g:6481:3: (enumLiteral_0= '+' )
                    {
                    // InternalDim.g:6481:3: (enumLiteral_0= '+' )
                    // InternalDim.g:6482:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6489:3: (enumLiteral_1= '-' )
                    {
                    // InternalDim.g:6489:3: (enumLiteral_1= '-' )
                    // InternalDim.g:6490:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6497:3: (enumLiteral_2= '!' )
                    {
                    // InternalDim.g:6497:3: (enumLiteral_2= '!' )
                    // InternalDim.g:6498:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6505:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDim.g:6505:3: (enumLiteral_3= 'NOT' )
                    // InternalDim.g:6506:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:6513:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDim.g:6513:3: (enumLiteral_4= 'not' )
                    // InternalDim.g:6514:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6524:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDim.g:6530:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalDim.g:6531:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalDim.g:6531:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt122=3;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt122=1;
                }
                break;
            case 79:
                {
                alt122=2;
                }
                break;
            case 53:
                {
                alt122=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // InternalDim.g:6532:3: (enumLiteral_0= '?' )
                    {
                    // InternalDim.g:6532:3: (enumLiteral_0= '?' )
                    // InternalDim.g:6533:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6540:3: (enumLiteral_1= '+' )
                    {
                    // InternalDim.g:6540:3: (enumLiteral_1= '+' )
                    // InternalDim.g:6541:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6548:3: (enumLiteral_2= '*' )
                    {
                    // InternalDim.g:6548:3: (enumLiteral_2= '*' )
                    // InternalDim.g:6549:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalDim
    public final void synpred1_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3214:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalDim.g:3214:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalDim.g:3214:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalDim.g:3215:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalDim.g:3215:7: ()
        // InternalDim.g:3216:7: 
        {
        }

        match(input,54,FOLLOW_3); if (state.failed) return ;
        // InternalDim.g:3218:7: ( ( RULE_ID ) )
        // InternalDim.g:3219:8: ( RULE_ID )
        {
        // InternalDim.g:3219:8: ( RULE_ID )
        // InternalDim.g:3220:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_61); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleDmxOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalDim

    // $ANTLR start synpred2_InternalDim
    public final void synpred2_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3283:6: ( ( () '.' ) )
        // InternalDim.g:3283:7: ( () '.' )
        {
        // InternalDim.g:3283:7: ( () '.' )
        // InternalDim.g:3284:7: () '.'
        {
        // InternalDim.g:3284:7: ()
        // InternalDim.g:3285:7: 
        {
        }

        match(input,54,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDim

    // $ANTLR start synpred3_InternalDim
    public final void synpred3_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3319:8: ( ( '(' ) )
        // InternalDim.g:3319:9: ( '(' )
        {
        // InternalDim.g:3319:9: ( '(' )
        // InternalDim.g:3320:9: '('
        {
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDim

    // $ANTLR start synpred4_InternalDim
    public final void synpred4_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3680:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalDim.g:3680:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalDim.g:3680:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalDim.g:3681:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalDim.g:3681:6: ()
        // InternalDim.g:3682:6: 
        {
        }

        // InternalDim.g:3683:6: ( ( ruleDmxOpOr ) )
        // InternalDim.g:3684:7: ( ruleDmxOpOr )
        {
        // InternalDim.g:3684:7: ( ruleDmxOpOr )
        // InternalDim.g:3685:8: ruleDmxOpOr
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
    // $ANTLR end synpred4_InternalDim

    // $ANTLR start synpred5_InternalDim
    public final void synpred5_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3768:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalDim.g:3768:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalDim.g:3768:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalDim.g:3769:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalDim.g:3769:6: ()
        // InternalDim.g:3770:6: 
        {
        }

        // InternalDim.g:3771:6: ( ( ruleDmxOpAnd ) )
        // InternalDim.g:3772:7: ( ruleDmxOpAnd )
        {
        // InternalDim.g:3772:7: ( ruleDmxOpAnd )
        // InternalDim.g:3773:8: ruleDmxOpAnd
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
    // $ANTLR end synpred5_InternalDim

    // $ANTLR start synpred6_InternalDim
    public final void synpred6_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3856:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalDim.g:3856:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalDim.g:3856:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalDim.g:3857:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalDim.g:3857:6: ()
        // InternalDim.g:3858:6: 
        {
        }

        // InternalDim.g:3859:6: ( ( ruleDmxOpEquality ) )
        // InternalDim.g:3860:7: ( ruleDmxOpEquality )
        {
        // InternalDim.g:3860:7: ( ruleDmxOpEquality )
        // InternalDim.g:3861:8: ruleDmxOpEquality
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
    // $ANTLR end synpred6_InternalDim

    // $ANTLR start synpred7_InternalDim
    public final void synpred7_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3945:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalDim.g:3945:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalDim.g:3945:7: ( () ruleDmxOpInstanceOf )
        // InternalDim.g:3946:7: () ruleDmxOpInstanceOf
        {
        // InternalDim.g:3946:7: ()
        // InternalDim.g:3947:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalDim

    // $ANTLR start synpred8_InternalDim
    public final void synpred8_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3985:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDim.g:3985:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDim.g:3985:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDim.g:3986:7: () ( ( ruleOpCompare ) )
        {
        // InternalDim.g:3986:7: ()
        // InternalDim.g:3987:7: 
        {
        }

        // InternalDim.g:3988:7: ( ( ruleOpCompare ) )
        // InternalDim.g:3989:8: ( ruleOpCompare )
        {
        // InternalDim.g:3989:8: ( ruleOpCompare )
        // InternalDim.g:3990:9: ruleOpCompare
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
    // $ANTLR end synpred8_InternalDim

    // $ANTLR start synpred9_InternalDim
    public final void synpred9_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4104:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDim.g:4104:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDim.g:4104:6: ( () ( ( ruleOpOther ) ) )
        // InternalDim.g:4105:6: () ( ( ruleOpOther ) )
        {
        // InternalDim.g:4105:6: ()
        // InternalDim.g:4106:6: 
        {
        }

        // InternalDim.g:4107:6: ( ( ruleOpOther ) )
        // InternalDim.g:4108:7: ( ruleOpOther )
        {
        // InternalDim.g:4108:7: ( ruleOpOther )
        // InternalDim.g:4109:8: ruleOpOther
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
    // $ANTLR end synpred9_InternalDim

    // $ANTLR start synpred10_InternalDim
    public final void synpred10_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4192:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDim.g:4192:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDim.g:4192:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDim.g:4193:6: () ( ( ruleOpAdd ) )
        {
        // InternalDim.g:4193:6: ()
        // InternalDim.g:4194:6: 
        {
        }

        // InternalDim.g:4195:6: ( ( ruleOpAdd ) )
        // InternalDim.g:4196:7: ( ruleOpAdd )
        {
        // InternalDim.g:4196:7: ( ruleOpAdd )
        // InternalDim.g:4197:8: ruleOpAdd
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
    // $ANTLR end synpred10_InternalDim

    // $ANTLR start synpred11_InternalDim
    public final void synpred11_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4280:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDim.g:4280:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDim.g:4280:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDim.g:4281:6: () ( ( ruleOpMulti ) )
        {
        // InternalDim.g:4281:6: ()
        // InternalDim.g:4282:6: 
        {
        }

        // InternalDim.g:4283:6: ( ( ruleOpMulti ) )
        // InternalDim.g:4284:7: ( ruleOpMulti )
        {
        // InternalDim.g:4284:7: ( ruleOpMulti )
        // InternalDim.g:4285:8: ruleOpMulti
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
    // $ANTLR end synpred11_InternalDim

    // $ANTLR start synpred12_InternalDim
    public final void synpred12_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4443:5: ( ( () ruleDmxOpCast ) )
        // InternalDim.g:4443:6: ( () ruleDmxOpCast )
        {
        // InternalDim.g:4443:6: ( () ruleDmxOpCast )
        // InternalDim.g:4444:6: () ruleDmxOpCast
        {
        // InternalDim.g:4444:6: ()
        // InternalDim.g:4445:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDim

    // $ANTLR start synpred13_InternalDim
    public final void synpred13_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:5291:4: ( ']' )
        // InternalDim.g:5291:5: ']'
        {
        match(input,64,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalDim

    // $ANTLR start synpred14_InternalDim
    public final void synpred14_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:5447:5: ( 'else' )
        // InternalDim.g:5447:6: 'else'
        {
        match(input,68,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalDim

    // Delegated rules

    public final boolean synpred7_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA35 dfa35 = new DFA35(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\24\1\uffff\1\4\1\uffff\1\24";
    static final String dfa_3s = "\1\46\1\uffff\1\125\1\uffff\1\4\1\uffff\1\125";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\37\uffff\1\3\1\uffff\1\1",
            "",
            "\1\4\5\uffff\1\3\14\uffff\1\1\1\uffff\1\5\52\uffff\2\1",
            "",
            "\1\6",
            "",
            "\1\4\5\uffff\1\3\14\uffff\1\1\1\uffff\1\5\52\uffff\2\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1503:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\164\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\4\1\5\1\2\1\0\1\7\1\6\1\3\1\1\2\uffff}>";
    static final String[] dfa_13s = {
            "\5\1\15\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\5\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\1\5\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\3\1\5\uffff\4\1\10\uffff\2\1\1\uffff\2\1\15\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 3942:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_3 = input.LA(1);

                         
                        int index81_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\3\uffff\1\7\6\uffff";
    static final String dfa_16s = "\1\11\2\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String dfa_17s = "\1\114\2\uffff\1\164\4\uffff\1\11\1\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\3\1\uffff\1\4";
    static final String dfa_19s = "\12\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\1\2\26\uffff\1\5\2\uffff\1\6\42\uffff\4\1\2\4",
            "",
            "",
            "\5\7\14\uffff\3\7\1\uffff\1\7\1\uffff\1\7\1\uffff\5\7\2\uffff\1\7\1\uffff\1\7\3\uffff\1\7\5\uffff\1\7\4\uffff\1\7\1\10\2\uffff\5\7\5\uffff\4\7\10\uffff\2\7\1\uffff\2\7\15\uffff\24\7",
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

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "4609:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000300060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000013A9400000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000013A8C00000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000013A8400000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x4000021200200670L,0x00E0000000019F84L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200062L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002400010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000042400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100062L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000380000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000005402400010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000005802400010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000005002400010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000100062L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000100000L,0x0000000000300000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020020000000072L,0x0100000000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020020000000062L,0x0100000000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020030000000072L,0x0100000000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020030000000062L,0x0100000000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000062L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00200A0000000072L,0x0100000000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00200A0000000062L,0x0100000000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000062L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020820000000002L,0x0100000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000001200200600L,0x0000000000001F80L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x00000001FFC00000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000010L,0x00000001FFC00000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000021200200610L,0x00E0000000019F84L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00C0020000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x4000061200200610L,0x00E0000000019F84L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000001E00000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0600000000000002L,0x00007E0000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0001000000000002L,0x0003800000000040L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0020000000000002L,0x001C000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x4000021200600670L,0x00E0000000019F84L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000001200400600L,0x0000000000001F80L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000001200000600L,0x0000000000001F80L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x4000061200200670L,0x00E0000000019F84L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x8100000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0020000000000200L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000200L,0x0000000000018000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});

}