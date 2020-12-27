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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'information'", "'model'", "'alias'", "'{'", "'}'", "'query'", "'component'", "'constraint'", "':'", "'primitive'", "'redefines'", "'enumeration'", "','", "'abstract'", "'main'", "'entity'", "'states'", "'events'", "'detail'", "'extends'", "'derived'", "'contains'", "'key'", "'('", "')'", "'returns'", "'NOTE'", "'import'", "'test'", "'context'", "':='", "'in'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'as'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'autonomous'", "'relationship'", "'references'", "'inverse'", "'white'", "'red'", "'orange'", "'yellow'", "'green'", "'blue'", "'pink'", "'grey'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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
    // InternalDim.g:72:1: ruleDNamespace returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationModel ) ) ) ;
    public final EObject ruleDNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_model_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:78:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationModel ) ) ) )
            // InternalDim.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationModel ) ) )
            {
            // InternalDim.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationModel ) ) )
            // InternalDim.g:80:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationModel ) )
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

                if ( (LA1_0==45) ) {
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

            // InternalDim.g:122:3: ( (lv_model_3_0= ruleDomainInformationModel ) )
            // InternalDim.g:123:4: (lv_model_3_0= ruleDomainInformationModel )
            {
            // InternalDim.g:123:4: (lv_model_3_0= ruleDomainInformationModel )
            // InternalDim.g:124:5: lv_model_3_0= ruleDomainInformationModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNamespaceAccess().getModelDomainInformationModelParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_model_3_0=ruleDomainInformationModel();

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
              						"com.mimacom.ddd.dm.dim.Dim.DomainInformationModel");
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


    // $ANTLR start "entryRuleDomainInformationModel"
    // InternalDim.g:145:1: entryRuleDomainInformationModel returns [EObject current=null] : iv_ruleDomainInformationModel= ruleDomainInformationModel EOF ;
    public final EObject entryRuleDomainInformationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainInformationModel = null;


        try {
            // InternalDim.g:145:63: (iv_ruleDomainInformationModel= ruleDomainInformationModel EOF )
            // InternalDim.g:146:2: iv_ruleDomainInformationModel= ruleDomainInformationModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainInformationModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainInformationModel=ruleDomainInformationModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainInformationModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainInformationModel"


    // $ANTLR start "ruleDomainInformationModel"
    // InternalDim.g:152:1: ruleDomainInformationModel returns [EObject current=null] : (otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_types_8_0= ruleDimType ) ) | ( (lv_aggregates_9_0= ruleDimAggregate ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleDomainInformationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_description_5_0 = null;

        EObject lv_notes_6_0 = null;

        EObject lv_types_8_0 = null;

        EObject lv_aggregates_9_0 = null;



        	enterRule();

        try {
            // InternalDim.g:158:2: ( (otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_types_8_0= ruleDimType ) ) | ( (lv_aggregates_9_0= ruleDimAggregate ) ) )* otherlv_10= '}' ) )
            // InternalDim.g:159:2: (otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_types_8_0= ruleDimType ) ) | ( (lv_aggregates_9_0= ruleDimAggregate ) ) )* otherlv_10= '}' )
            {
            // InternalDim.g:159:2: (otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_types_8_0= ruleDimType ) ) | ( (lv_aggregates_9_0= ruleDimAggregate ) ) )* otherlv_10= '}' )
            // InternalDim.g:160:3: otherlv_0= 'information' otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_types_8_0= ruleDimType ) ) | ( (lv_aggregates_9_0= ruleDimAggregate ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDomainInformationModelAccess().getInformationKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDomainInformationModelAccess().getModelKeyword_1());
              		
            }
            // InternalDim.g:168:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:169:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:169:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:170:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDomainInformationModelAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDomainInformationModelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:186:3: (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDim.g:187:4: otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDomainInformationModelAccess().getAliasKeyword_3_0());
                      			
                    }
                    // InternalDim.g:191:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalDim.g:192:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalDim.g:192:5: (lv_alias_4_0= RULE_ID )
                    // InternalDim.g:193:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_4_0, grammarAccess.getDomainInformationModelAccess().getAliasIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDomainInformationModelRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_4_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

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

                      					newCompositeNode(grammarAccess.getDomainInformationModelAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDomainInformationModelRule());
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

            // InternalDim.g:229:3: ( (lv_notes_6_0= ruleDNote ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDim.g:230:4: (lv_notes_6_0= ruleDNote )
            	    {
            	    // InternalDim.g:230:4: (lv_notes_6_0= ruleDNote )
            	    // InternalDim.g:231:5: lv_notes_6_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDomainInformationModelAccess().getNotesDNoteParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_notes_6_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDomainInformationModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_6_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDomainInformationModelAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDim.g:252:3: ( ( (lv_types_8_0= ruleDimType ) ) | ( (lv_aggregates_9_0= ruleDimAggregate ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27||LA5_0==29||(LA5_0>=31 && LA5_0<=33)||LA5_0==36||(LA5_0>=83 && LA5_0<=84)) ) {
                    alt5=1;
                }
                else if ( (LA5_0==24) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDim.g:253:4: ( (lv_types_8_0= ruleDimType ) )
            	    {
            	    // InternalDim.g:253:4: ( (lv_types_8_0= ruleDimType ) )
            	    // InternalDim.g:254:5: (lv_types_8_0= ruleDimType )
            	    {
            	    // InternalDim.g:254:5: (lv_types_8_0= ruleDimType )
            	    // InternalDim.g:255:6: lv_types_8_0= ruleDimType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDomainInformationModelAccess().getTypesDimTypeParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_types_8_0=ruleDimType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDomainInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_8_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DimType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:273:4: ( (lv_aggregates_9_0= ruleDimAggregate ) )
            	    {
            	    // InternalDim.g:273:4: ( (lv_aggregates_9_0= ruleDimAggregate ) )
            	    // InternalDim.g:274:5: (lv_aggregates_9_0= ruleDimAggregate )
            	    {
            	    // InternalDim.g:274:5: (lv_aggregates_9_0= ruleDimAggregate )
            	    // InternalDim.g:275:6: lv_aggregates_9_0= ruleDimAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDomainInformationModelAccess().getAggregatesDimAggregateParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_aggregates_9_0=ruleDimAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDomainInformationModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_9_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DimAggregate");
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

            otherlv_10=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDomainInformationModelAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainInformationModel"


    // $ANTLR start "entryRuleDimAggregate"
    // InternalDim.g:301:1: entryRuleDimAggregate returns [EObject current=null] : iv_ruleDimAggregate= ruleDimAggregate EOF ;
    public final EObject entryRuleDimAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAggregate = null;


        try {
            // InternalDim.g:301:53: (iv_ruleDimAggregate= ruleDimAggregate EOF )
            // InternalDim.g:302:2: iv_ruleDimAggregate= ruleDimAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimAggregateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimAggregate=ruleDimAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimAggregate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimAggregate"


    // $ANTLR start "ruleDimAggregate"
    // InternalDim.g:308:1: ruleDimAggregate returns [EObject current=null] : ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' (otherlv_8= 'query' ( (lv_features_9_0= ruleDimQuery ) ) )* ( (lv_types_10_0= ruleDimType ) )* otherlv_11= '}' ) ;
    public final EObject ruleDimAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_description_5_0 = null;

        EObject lv_notes_6_0 = null;

        EObject lv_features_9_0 = null;

        EObject lv_types_10_0 = null;



        	enterRule();

        try {
            // InternalDim.g:314:2: ( ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' (otherlv_8= 'query' ( (lv_features_9_0= ruleDimQuery ) ) )* ( (lv_types_10_0= ruleDimType ) )* otherlv_11= '}' ) )
            // InternalDim.g:315:2: ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' (otherlv_8= 'query' ( (lv_features_9_0= ruleDimQuery ) ) )* ( (lv_types_10_0= ruleDimType ) )* otherlv_11= '}' )
            {
            // InternalDim.g:315:2: ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' (otherlv_8= 'query' ( (lv_features_9_0= ruleDimQuery ) ) )* ( (lv_types_10_0= ruleDimType ) )* otherlv_11= '}' )
            // InternalDim.g:316:3: ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' (otherlv_8= 'query' ( (lv_features_9_0= ruleDimQuery ) ) )* ( (lv_types_10_0= ruleDimType ) )* otherlv_11= '}'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDimAggregateAccess().getDAggregateKeywordParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_3);
            ruleDAggregateKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:323:3: ()
            // InternalDim.g:324:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAggregateAccess().getDimAggregateAction_1(),
              					current);
              			
            }

            }

            // InternalDim.g:330:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:331:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:331:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:332:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDimAggregateAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimAggregateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:348:3: (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDim.g:349:4: otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimAggregateAccess().getAliasKeyword_3_0());
                      			
                    }
                    // InternalDim.g:353:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalDim.g:354:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalDim.g:354:5: (lv_alias_4_0= RULE_ID )
                    // InternalDim.g:355:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_4_0, grammarAccess.getDimAggregateAccess().getAliasIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimAggregateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_4_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:372:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_PLAIN_TEXT_ONLY && LA7_0<=RULE_RICH_TEXT_START)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDim.g:373:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:373:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:374:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAggregateAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimAggregateRule());
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

            // InternalDim.g:391:3: ( (lv_notes_6_0= ruleDNote ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==44) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDim.g:392:4: (lv_notes_6_0= ruleDNote )
            	    {
            	    // InternalDim.g:392:4: (lv_notes_6_0= ruleDNote )
            	    // InternalDim.g:393:5: lv_notes_6_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimAggregateAccess().getNotesDNoteParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_notes_6_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimAggregateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_6_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDimAggregateAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDim.g:414:3: (otherlv_8= 'query' ( (lv_features_9_0= ruleDimQuery ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDim.g:415:4: otherlv_8= 'query' ( (lv_features_9_0= ruleDimQuery ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getDimAggregateAccess().getQueryKeyword_7_0());
            	      			
            	    }
            	    // InternalDim.g:419:4: ( (lv_features_9_0= ruleDimQuery ) )
            	    // InternalDim.g:420:5: (lv_features_9_0= ruleDimQuery )
            	    {
            	    // InternalDim.g:420:5: (lv_features_9_0= ruleDimQuery )
            	    // InternalDim.g:421:6: lv_features_9_0= ruleDimQuery
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimAggregateAccess().getFeaturesDimQueryParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_features_9_0=ruleDimQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDimAggregateRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_9_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DimQuery");
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

            // InternalDim.g:439:3: ( (lv_types_10_0= ruleDimType ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27||LA10_0==29||(LA10_0>=31 && LA10_0<=33)||LA10_0==36||(LA10_0>=83 && LA10_0<=84)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDim.g:440:4: (lv_types_10_0= ruleDimType )
            	    {
            	    // InternalDim.g:440:4: (lv_types_10_0= ruleDimType )
            	    // InternalDim.g:441:5: lv_types_10_0= ruleDimType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimAggregateAccess().getTypesDimTypeParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_types_10_0=ruleDimType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimAggregateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_10_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DimType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDimAggregateAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimAggregate"


    // $ANTLR start "entryRuleDAggregateKeyword"
    // InternalDim.g:466:1: entryRuleDAggregateKeyword returns [String current=null] : iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF ;
    public final String entryRuleDAggregateKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAggregateKeyword = null;


        try {
            // InternalDim.g:466:57: (iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF )
            // InternalDim.g:467:2: iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF
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
    // InternalDim.g:473:1: ruleDAggregateKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'component' ;
    public final AntlrDatatypeRuleToken ruleDAggregateKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:479:2: (kw= 'component' )
            // InternalDim.g:480:2: kw= 'component'
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


    // $ANTLR start "entryRuleDimType"
    // InternalDim.g:488:1: entryRuleDimType returns [EObject current=null] : iv_ruleDimType= ruleDimType EOF ;
    public final EObject entryRuleDimType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimType = null;


        try {
            // InternalDim.g:488:48: (iv_ruleDimType= ruleDimType EOF )
            // InternalDim.g:489:2: iv_ruleDimType= ruleDimType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimType=ruleDimType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimType"


    // $ANTLR start "ruleDimType"
    // InternalDim.g:495:1: ruleDimType returns [EObject current=null] : (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType ) ;
    public final EObject ruleDimType() throws RecognitionException {
        EObject current = null;

        EObject this_DimPrimitive_0 = null;

        EObject this_DimEnumeration_1 = null;

        EObject this_DimEntityType_2 = null;

        EObject this_DimDetailType_3 = null;



        	enterRule();

        try {
            // InternalDim.g:501:2: ( (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType ) )
            // InternalDim.g:502:2: (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType )
            {
            // InternalDim.g:502:2: (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                int LA11_3 = input.LA(2);

                if ( ((LA11_3>=32 && LA11_3<=33)||(LA11_3>=83 && LA11_3<=84)) ) {
                    alt11=3;
                }
                else if ( (LA11_3==36) ) {
                    alt11=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
            case 33:
            case 83:
            case 84:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDim.g:503:3: this_DimPrimitive_0= ruleDimPrimitive
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDimTypeAccess().getDimPrimitiveParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DimPrimitive_0=ruleDimPrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DimPrimitive_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:512:3: this_DimEnumeration_1= ruleDimEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDimTypeAccess().getDimEnumerationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DimEnumeration_1=ruleDimEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DimEnumeration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDim.g:521:3: this_DimEntityType_2= ruleDimEntityType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDimTypeAccess().getDimEntityTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DimEntityType_2=ruleDimEntityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DimEntityType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDim.g:530:3: this_DimDetailType_3= ruleDimDetailType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDimTypeAccess().getDimDetailTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DimDetailType_3=ruleDimDetailType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DimDetailType_3;
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
    // $ANTLR end "ruleDimType"


    // $ANTLR start "entryRuleDConstraint"
    // InternalDim.g:542:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalDim.g:542:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalDim.g:543:2: iv_ruleDConstraint= ruleDConstraint EOF
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
    // InternalDim.g:549:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ( (lv_notes_7_0= ruleDNote ) )* ) ;
    public final EObject ruleDConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;
        EObject lv_predicate_5_0 = null;

        EObject lv_description_6_0 = null;

        EObject lv_notes_7_0 = null;



        	enterRule();

        try {
            // InternalDim.g:555:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ( (lv_notes_7_0= ruleDNote ) )* ) )
            // InternalDim.g:556:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ( (lv_notes_7_0= ruleDNote ) )* )
            {
            // InternalDim.g:556:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ( (lv_notes_7_0= ruleDNote ) )* )
            // InternalDim.g:557:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ( (lv_notes_7_0= ruleDNote ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalDim.g:561:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:562:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:562:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:563:5: lv_name_1_0= RULE_ID
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

            // InternalDim.g:579:3: (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDim.g:580:4: otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getAliasKeyword_2_0());
                      			
                    }
                    // InternalDim.g:584:4: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalDim.g:585:5: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalDim.g:585:5: (lv_alias_3_0= RULE_ID )
                    // InternalDim.g:586:6: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_3_0, grammarAccess.getDConstraintAccess().getAliasIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalDim.g:607:3: ( (lv_predicate_5_0= ruleDExpression ) )
            // InternalDim.g:608:4: (lv_predicate_5_0= ruleDExpression )
            {
            // InternalDim.g:608:4: (lv_predicate_5_0= ruleDExpression )
            // InternalDim.g:609:5: lv_predicate_5_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getPredicateDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalDim.g:626:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_PLAIN_TEXT_ONLY && LA13_0<=RULE_RICH_TEXT_START)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDim.g:627:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDim.g:627:4: (lv_description_6_0= ruleDRichText )
                    // InternalDim.g:628:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDConstraintAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalDim.g:645:3: ( (lv_notes_7_0= ruleDNote ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==44) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDim.g:646:4: (lv_notes_7_0= ruleDNote )
            	    {
            	    // InternalDim.g:646:4: (lv_notes_7_0= ruleDNote )
            	    // InternalDim.g:647:5: lv_notes_7_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDConstraintAccess().getNotesDNoteParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_notes_7_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDConstraintRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_7_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleDConstraint"


    // $ANTLR start "entryRuleDimPrimitive"
    // InternalDim.g:668:1: entryRuleDimPrimitive returns [EObject current=null] : iv_ruleDimPrimitive= ruleDimPrimitive EOF ;
    public final EObject entryRuleDimPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimPrimitive = null;


        try {
            // InternalDim.g:668:53: (iv_ruleDimPrimitive= ruleDimPrimitive EOF )
            // InternalDim.g:669:2: iv_ruleDimPrimitive= ruleDimPrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimPrimitiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimPrimitive=ruleDimPrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimPrimitive; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimPrimitive"


    // $ANTLR start "ruleDimPrimitive"
    // InternalDim.g:675:1: ruleDimPrimitive returns [EObject current=null] : ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ( (lv_notes_8_0= ruleDNote ) )* (otherlv_9= '{' ( (lv_constraints_10_0= ruleDConstraint ) )+ otherlv_11= '}' )? ) ;
    public final EObject ruleDimPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_description_7_0 = null;

        EObject lv_notes_8_0 = null;

        EObject lv_constraints_10_0 = null;



        	enterRule();

        try {
            // InternalDim.g:681:2: ( ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ( (lv_notes_8_0= ruleDNote ) )* (otherlv_9= '{' ( (lv_constraints_10_0= ruleDConstraint ) )+ otherlv_11= '}' )? ) )
            // InternalDim.g:682:2: ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ( (lv_notes_8_0= ruleDNote ) )* (otherlv_9= '{' ( (lv_constraints_10_0= ruleDConstraint ) )+ otherlv_11= '}' )? )
            {
            // InternalDim.g:682:2: ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ( (lv_notes_8_0= ruleDNote ) )* (otherlv_9= '{' ( (lv_constraints_10_0= ruleDConstraint ) )+ otherlv_11= '}' )? )
            // InternalDim.g:683:3: () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ( (lv_notes_8_0= ruleDNote ) )* (otherlv_9= '{' ( (lv_constraints_10_0= ruleDConstraint ) )+ otherlv_11= '}' )?
            {
            // InternalDim.g:683:3: ()
            // InternalDim.g:684:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimPrimitiveAccess().getDimPrimitiveAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDimPrimitiveAccess().getPrimitiveKeyword_1());
              		
            }
            // InternalDim.g:694:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:695:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:695:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:696:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDimPrimitiveAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimPrimitiveRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:712:3: (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDim.g:713:4: otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimPrimitiveAccess().getAliasKeyword_3_0());
                      			
                    }
                    // InternalDim.g:717:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalDim.g:718:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalDim.g:718:5: (lv_alias_4_0= RULE_ID )
                    // InternalDim.g:719:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_4_0, grammarAccess.getDimPrimitiveAccess().getAliasIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimPrimitiveRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_4_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDimPrimitiveAccess().getRedefinesKeyword_4());
              		
            }
            // InternalDim.g:740:3: ( (otherlv_6= RULE_ID ) )
            // InternalDim.g:741:4: (otherlv_6= RULE_ID )
            {
            // InternalDim.g:741:4: (otherlv_6= RULE_ID )
            // InternalDim.g:742:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimPrimitiveRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getDimPrimitiveAccess().getRedefinesDmxArchetypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalDim.g:753:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_PLAIN_TEXT_ONLY && LA16_0<=RULE_RICH_TEXT_START)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDim.g:754:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDim.g:754:4: (lv_description_7_0= ruleDRichText )
                    // InternalDim.g:755:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimPrimitiveAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimPrimitiveRule());
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

            // InternalDim.g:772:3: ( (lv_notes_8_0= ruleDNote ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==44) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDim.g:773:4: (lv_notes_8_0= ruleDNote )
            	    {
            	    // InternalDim.g:773:4: (lv_notes_8_0= ruleDNote )
            	    // InternalDim.g:774:5: lv_notes_8_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimPrimitiveAccess().getNotesDNoteParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_notes_8_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimPrimitiveRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_8_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalDim.g:791:3: (otherlv_9= '{' ( (lv_constraints_10_0= ruleDConstraint ) )+ otherlv_11= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDim.g:792:4: otherlv_9= '{' ( (lv_constraints_10_0= ruleDConstraint ) )+ otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDimPrimitiveAccess().getLeftCurlyBracketKeyword_8_0());
                      			
                    }
                    // InternalDim.g:796:4: ( (lv_constraints_10_0= ruleDConstraint ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==25) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDim.g:797:5: (lv_constraints_10_0= ruleDConstraint )
                    	    {
                    	    // InternalDim.g:797:5: (lv_constraints_10_0= ruleDConstraint )
                    	    // InternalDim.g:798:6: lv_constraints_10_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDimPrimitiveAccess().getConstraintsDConstraintParserRuleCall_8_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    lv_constraints_10_0=ruleDConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDimPrimitiveRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"constraints",
                    	      							lv_constraints_10_0,
                    	      							"com.mimacom.ddd.dm.dim.Dim.DConstraint");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDimPrimitiveAccess().getRightCurlyBracketKeyword_8_2());
                      			
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
    // $ANTLR end "ruleDimPrimitive"


    // $ANTLR start "entryRuleDimEnumeration"
    // InternalDim.g:824:1: entryRuleDimEnumeration returns [EObject current=null] : iv_ruleDimEnumeration= ruleDimEnumeration EOF ;
    public final EObject entryRuleDimEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimEnumeration = null;


        try {
            // InternalDim.g:824:55: (iv_ruleDimEnumeration= ruleDimEnumeration EOF )
            // InternalDim.g:825:2: iv_ruleDimEnumeration= ruleDimEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimEnumeration=ruleDimEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimEnumeration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimEnumeration"


    // $ANTLR start "ruleDimEnumeration"
    // InternalDim.g:831:1: ruleDimEnumeration returns [EObject current=null] : ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_literals_8_0= ruleDimLiteral ) ) (otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_11_0= ruleDConstraint ) )* otherlv_12= '}' ) ;
    public final EObject ruleDimEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_description_5_0 = null;

        EObject lv_notes_6_0 = null;

        EObject lv_literals_8_0 = null;

        EObject lv_literals_10_0 = null;

        EObject lv_constraints_11_0 = null;



        	enterRule();

        try {
            // InternalDim.g:837:2: ( ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_literals_8_0= ruleDimLiteral ) ) (otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_11_0= ruleDConstraint ) )* otherlv_12= '}' ) )
            // InternalDim.g:838:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_literals_8_0= ruleDimLiteral ) ) (otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_11_0= ruleDConstraint ) )* otherlv_12= '}' )
            {
            // InternalDim.g:838:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_literals_8_0= ruleDimLiteral ) ) (otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_11_0= ruleDConstraint ) )* otherlv_12= '}' )
            // InternalDim.g:839:3: () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* otherlv_7= '{' ( ( (lv_literals_8_0= ruleDimLiteral ) ) (otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_11_0= ruleDConstraint ) )* otherlv_12= '}'
            {
            // InternalDim.g:839:3: ()
            // InternalDim.g:840:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimEnumerationAccess().getDimEnumerationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDimEnumerationAccess().getEnumerationKeyword_1());
              		
            }
            // InternalDim.g:850:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:851:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:851:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:852:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDimEnumerationAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimEnumerationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:868:3: (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDim.g:869:4: otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimEnumerationAccess().getAliasKeyword_3_0());
                      			
                    }
                    // InternalDim.g:873:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalDim.g:874:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalDim.g:874:5: (lv_alias_4_0= RULE_ID )
                    // InternalDim.g:875:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_4_0, grammarAccess.getDimEnumerationAccess().getAliasIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimEnumerationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_4_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:892:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_PLAIN_TEXT_ONLY && LA21_0<=RULE_RICH_TEXT_START)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDim.g:893:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:893:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:894:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimEnumerationAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimEnumerationRule());
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

            // InternalDim.g:911:3: ( (lv_notes_6_0= ruleDNote ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDim.g:912:4: (lv_notes_6_0= ruleDNote )
            	    {
            	    // InternalDim.g:912:4: (lv_notes_6_0= ruleDNote )
            	    // InternalDim.g:913:5: lv_notes_6_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimEnumerationAccess().getNotesDNoteParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_notes_6_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_6_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDimEnumerationAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDim.g:934:3: ( ( (lv_literals_8_0= ruleDimLiteral ) ) (otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDim.g:935:4: ( (lv_literals_8_0= ruleDimLiteral ) ) (otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) ) )*
                    {
                    // InternalDim.g:935:4: ( (lv_literals_8_0= ruleDimLiteral ) )
                    // InternalDim.g:936:5: (lv_literals_8_0= ruleDimLiteral )
                    {
                    // InternalDim.g:936:5: (lv_literals_8_0= ruleDimLiteral )
                    // InternalDim.g:937:6: lv_literals_8_0= ruleDimLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEnumerationAccess().getLiteralsDimLiteralParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_literals_8_0=ruleDimLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDimEnumerationRule());
                      						}
                      						add(
                      							current,
                      							"literals",
                      							lv_literals_8_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DimLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:954:4: (otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==30) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalDim.g:955:5: otherlv_9= ',' ( (lv_literals_10_0= ruleDimLiteral ) )
                    	    {
                    	    otherlv_9=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getDimEnumerationAccess().getCommaKeyword_7_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:959:5: ( (lv_literals_10_0= ruleDimLiteral ) )
                    	    // InternalDim.g:960:6: (lv_literals_10_0= ruleDimLiteral )
                    	    {
                    	    // InternalDim.g:960:6: (lv_literals_10_0= ruleDimLiteral )
                    	    // InternalDim.g:961:7: lv_literals_10_0= ruleDimLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimEnumerationAccess().getLiteralsDimLiteralParserRuleCall_7_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_literals_10_0=ruleDimLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDimEnumerationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literals",
                    	      								lv_literals_10_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DimLiteral");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDim.g:980:3: ( (lv_constraints_11_0= ruleDConstraint ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDim.g:981:4: (lv_constraints_11_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:981:4: (lv_constraints_11_0= ruleDConstraint )
            	    // InternalDim.g:982:5: lv_constraints_11_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimEnumerationAccess().getConstraintsDConstraintParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_constraints_11_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_11_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_12=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getDimEnumerationAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimEnumeration"


    // $ANTLR start "entryRuleDimLiteral"
    // InternalDim.g:1007:1: entryRuleDimLiteral returns [EObject current=null] : iv_ruleDimLiteral= ruleDimLiteral EOF ;
    public final EObject entryRuleDimLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimLiteral = null;


        try {
            // InternalDim.g:1007:51: (iv_ruleDimLiteral= ruleDimLiteral EOF )
            // InternalDim.g:1008:2: iv_ruleDimLiteral= ruleDimLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimLiteral=ruleDimLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimLiteral"


    // $ANTLR start "ruleDimLiteral"
    // InternalDim.g:1014:1: ruleDimLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? ( (lv_description_4_0= ruleDRichText ) )? ( (lv_notes_5_0= ruleDNote ) )* ) ;
    public final EObject ruleDimLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        EObject lv_description_4_0 = null;

        EObject lv_notes_5_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1020:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? ( (lv_description_4_0= ruleDRichText ) )? ( (lv_notes_5_0= ruleDNote ) )* ) )
            // InternalDim.g:1021:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? ( (lv_description_4_0= ruleDRichText ) )? ( (lv_notes_5_0= ruleDNote ) )* )
            {
            // InternalDim.g:1021:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? ( (lv_description_4_0= ruleDRichText ) )? ( (lv_notes_5_0= ruleDNote ) )* )
            // InternalDim.g:1022:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? ( (lv_description_4_0= ruleDRichText ) )? ( (lv_notes_5_0= ruleDNote ) )*
            {
            // InternalDim.g:1022:3: ()
            // InternalDim.g:1023:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimLiteralAccess().getDimLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:1029:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:1030:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:1030:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:1031:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDimLiteralAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:1047:3: (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDim.g:1048:4: otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDimLiteralAccess().getAliasKeyword_2_0());
                      			
                    }
                    // InternalDim.g:1052:4: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalDim.g:1053:5: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalDim.g:1053:5: (lv_alias_3_0= RULE_ID )
                    // InternalDim.g:1054:6: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_3_0, grammarAccess.getDimLiteralAccess().getAliasIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:1071:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_PLAIN_TEXT_ONLY && LA27_0<=RULE_RICH_TEXT_START)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDim.g:1072:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:1072:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:1073:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimLiteralAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimLiteralRule());
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

            // InternalDim.g:1090:3: ( (lv_notes_5_0= ruleDNote ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDim.g:1091:4: (lv_notes_5_0= ruleDNote )
            	    {
            	    // InternalDim.g:1091:4: (lv_notes_5_0= ruleDNote )
            	    // InternalDim.g:1092:5: lv_notes_5_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimLiteralAccess().getNotesDNoteParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_notes_5_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimLiteralRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_5_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleDimLiteral"


    // $ANTLR start "entryRuleDimEntityType"
    // InternalDim.g:1113:1: entryRuleDimEntityType returns [EObject current=null] : iv_ruleDimEntityType= ruleDimEntityType EOF ;
    public final EObject entryRuleDimEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimEntityType = null;


        try {
            // InternalDim.g:1113:54: (iv_ruleDimEntityType= ruleDimEntityType EOF )
            // InternalDim.g:1114:2: iv_ruleDimEntityType= ruleDimEntityType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimEntityTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimEntityType=ruleDimEntityType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimEntityType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimEntityType"


    // $ANTLR start "ruleDimEntityType"
    // InternalDim.g:1120:1: ruleDimEntityType returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' ) ;
    public final EObject ruleDimEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_root_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Enumerator lv_nature_4_0 = null;

        Enumerator lv_nature_6_0 = null;

        EObject this_DimComplexType_7 = null;

        EObject lv_states_11_0 = null;

        EObject lv_states_13_0 = null;

        EObject lv_events_17_0 = null;

        EObject lv_events_19_0 = null;

        EObject lv_features_21_0 = null;

        EObject lv_constraints_22_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1126:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' ) )
            // InternalDim.g:1127:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' )
            {
            // InternalDim.g:1127:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' )
            // InternalDim.g:1128:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}'
            {
            // InternalDim.g:1128:3: ()
            // InternalDim.g:1129:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimEntityTypeAccess().getDimEntityTypeAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:1135:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDim.g:1136:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalDim.g:1136:4: (lv_abstract_1_0= 'abstract' )
                    // InternalDim.g:1137:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_1_0, grammarAccess.getDimEntityTypeAccess().getAbstractAbstractKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimEntityTypeRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1149:3: ( (lv_root_2_0= 'main' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDim.g:1150:4: (lv_root_2_0= 'main' )
                    {
                    // InternalDim.g:1150:4: (lv_root_2_0= 'main' )
                    // InternalDim.g:1151:5: lv_root_2_0= 'main'
                    {
                    lv_root_2_0=(Token)match(input,32,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_root_2_0, grammarAccess.getDimEntityTypeAccess().getRootMainKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimEntityTypeRule());
                      					}
                      					setWithLastConsumed(current, "root", true, "main");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1163:3: (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt31=1;
                }
                break;
            case 83:
                {
                alt31=2;
                }
                break;
            case 84:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalDim.g:1164:4: otherlv_3= 'entity'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimEntityTypeAccess().getEntityKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:1169:4: ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' )
                    {
                    // InternalDim.g:1169:4: ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' )
                    // InternalDim.g:1170:5: ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity'
                    {
                    // InternalDim.g:1170:5: ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) )
                    // InternalDim.g:1171:6: (lv_nature_4_0= ruleDEntityNatureAutonomous )
                    {
                    // InternalDim.g:1171:6: (lv_nature_4_0= ruleDEntityNatureAutonomous )
                    // InternalDim.g:1172:7: lv_nature_4_0= ruleDEntityNatureAutonomous
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getNatureDEntityNatureAutonomousEnumRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_27);
                    lv_nature_4_0=ruleDEntityNatureAutonomous();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDimEntityTypeRule());
                      							}
                      							set(
                      								current,
                      								"nature",
                      								lv_nature_4_0,
                      								"com.mimacom.ddd.dm.dim.Dim.DEntityNatureAutonomous");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDimEntityTypeAccess().getEntityKeyword_3_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:1195:4: ( (lv_nature_6_0= ruleDEntityNatureRelationship ) )
                    {
                    // InternalDim.g:1195:4: ( (lv_nature_6_0= ruleDEntityNatureRelationship ) )
                    // InternalDim.g:1196:5: (lv_nature_6_0= ruleDEntityNatureRelationship )
                    {
                    // InternalDim.g:1196:5: (lv_nature_6_0= ruleDEntityNatureRelationship )
                    // InternalDim.g:1197:6: lv_nature_6_0= ruleDEntityNatureRelationship
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getNatureDEntityNatureRelationshipEnumRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_nature_6_0=ruleDEntityNatureRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDimEntityTypeRule());
                      						}
                      						set(
                      							current,
                      							"nature",
                      							lv_nature_6_0,
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
              				current = createModelElement(grammarAccess.getDimEntityTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDimEntityTypeAccess().getDimComplexTypeParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_28);
            this_DimComplexType_7=ruleDimComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DimComplexType_7;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,21,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDim.g:1230:3: (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDim.g:1231:4: otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )?
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDimEntityTypeAccess().getStatesKeyword_6_0());
                      			
                    }
                    otherlv_10=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalDim.g:1239:4: ( (lv_states_11_0= ruleDState ) )
                    // InternalDim.g:1240:5: (lv_states_11_0= ruleDState )
                    {
                    // InternalDim.g:1240:5: (lv_states_11_0= ruleDState )
                    // InternalDim.g:1241:6: lv_states_11_0= ruleDState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getStatesDStateParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_states_11_0=ruleDState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDimEntityTypeRule());
                      						}
                      						add(
                      							current,
                      							"states",
                      							lv_states_11_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:1258:4: (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==30) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDim.g:1259:5: otherlv_12= ',' ( (lv_states_13_0= ruleDState ) )
                    	    {
                    	    otherlv_12=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getDimEntityTypeAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalDim.g:1263:5: ( (lv_states_13_0= ruleDState ) )
                    	    // InternalDim.g:1264:6: (lv_states_13_0= ruleDState )
                    	    {
                    	    // InternalDim.g:1264:6: (lv_states_13_0= ruleDState )
                    	    // InternalDim.g:1265:7: lv_states_13_0= ruleDState
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getStatesDStateParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_states_13_0=ruleDState();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDimEntityTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"states",
                    	      								lv_states_13_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DState");
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

                    otherlv_14=(Token)match(input,22,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_6_4());
                      			
                    }
                    // InternalDim.g:1287:4: (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==35) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalDim.g:1288:5: otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}'
                            {
                            otherlv_15=(Token)match(input,35,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getDimEntityTypeAccess().getEventsKeyword_6_5_0());
                              				
                            }
                            otherlv_16=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_6_5_1());
                              				
                            }
                            // InternalDim.g:1296:5: ( (lv_events_17_0= ruleDStateEvent ) )
                            // InternalDim.g:1297:6: (lv_events_17_0= ruleDStateEvent )
                            {
                            // InternalDim.g:1297:6: (lv_events_17_0= ruleDStateEvent )
                            // InternalDim.g:1298:7: lv_events_17_0= ruleDStateEvent
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getEventsDStateEventParserRuleCall_6_5_2_0());
                              						
                            }
                            pushFollow(FOLLOW_30);
                            lv_events_17_0=ruleDStateEvent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDimEntityTypeRule());
                              							}
                              							add(
                              								current,
                              								"events",
                              								lv_events_17_0,
                              								"com.mimacom.ddd.dm.dim.Dim.DStateEvent");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalDim.g:1315:5: (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==30) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalDim.g:1316:6: otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) )
                            	    {
                            	    otherlv_18=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_18, grammarAccess.getDimEntityTypeAccess().getCommaKeyword_6_5_3_0());
                            	      					
                            	    }
                            	    // InternalDim.g:1320:6: ( (lv_events_19_0= ruleDStateEvent ) )
                            	    // InternalDim.g:1321:7: (lv_events_19_0= ruleDStateEvent )
                            	    {
                            	    // InternalDim.g:1321:7: (lv_events_19_0= ruleDStateEvent )
                            	    // InternalDim.g:1322:8: lv_events_19_0= ruleDStateEvent
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDimEntityTypeAccess().getEventsDStateEventParserRuleCall_6_5_3_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_30);
                            	    lv_events_19_0=ruleDStateEvent();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDimEntityTypeRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"events",
                            	      									lv_events_19_0,
                            	      									"com.mimacom.ddd.dm.dim.Dim.DStateEvent");
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

                            otherlv_20=(Token)match(input,22,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_20, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_6_5_4());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDim.g:1346:3: ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==36||LA36_0==38) ) {
                    alt36=1;
                }
                else if ( (LA36_0==25) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDim.g:1347:4: ( (lv_features_21_0= ruleDimFeature ) )
            	    {
            	    // InternalDim.g:1347:4: ( (lv_features_21_0= ruleDimFeature ) )
            	    // InternalDim.g:1348:5: (lv_features_21_0= ruleDimFeature )
            	    {
            	    // InternalDim.g:1348:5: (lv_features_21_0= ruleDimFeature )
            	    // InternalDim.g:1349:6: lv_features_21_0= ruleDimFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getFeaturesDimFeatureParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_features_21_0=ruleDimFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDimEntityTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_21_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DimFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:1367:4: ( (lv_constraints_22_0= ruleDConstraint ) )
            	    {
            	    // InternalDim.g:1367:4: ( (lv_constraints_22_0= ruleDConstraint ) )
            	    // InternalDim.g:1368:5: (lv_constraints_22_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:1368:5: (lv_constraints_22_0= ruleDConstraint )
            	    // InternalDim.g:1369:6: lv_constraints_22_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getConstraintsDConstraintParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_constraints_22_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDimEntityTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_22_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DConstraint");
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

            otherlv_23=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimEntityType"


    // $ANTLR start "entryRuleDState"
    // InternalDim.g:1395:1: entryRuleDState returns [EObject current=null] : iv_ruleDState= ruleDState EOF ;
    public final EObject entryRuleDState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDState = null;


        try {
            // InternalDim.g:1395:47: (iv_ruleDState= ruleDState EOF )
            // InternalDim.g:1396:2: iv_ruleDState= ruleDState EOF
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
    // InternalDim.g:1402:1: ruleDState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalDim.g:1408:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? ) )
            // InternalDim.g:1409:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? )
            {
            // InternalDim.g:1409:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? )
            // InternalDim.g:1410:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )?
            {
            // InternalDim.g:1410:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1411:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1411:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1412:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDStateAccess().getNameIDTerminalRuleCall_0_0());
              				
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

            // InternalDim.g:1428:3: (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDim.g:1429:4: otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDStateAccess().getAliasKeyword_1_0());
                      			
                    }
                    // InternalDim.g:1433:4: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalDim.g:1434:5: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalDim.g:1434:5: (lv_alias_2_0= RULE_ID )
                    // InternalDim.g:1435:6: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_2_0, grammarAccess.getDStateAccess().getAliasIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDStateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_2_0,
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
    // $ANTLR end "ruleDState"


    // $ANTLR start "entryRuleDStateEvent"
    // InternalDim.g:1456:1: entryRuleDStateEvent returns [EObject current=null] : iv_ruleDStateEvent= ruleDStateEvent EOF ;
    public final EObject entryRuleDStateEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStateEvent = null;


        try {
            // InternalDim.g:1456:52: (iv_ruleDStateEvent= ruleDStateEvent EOF )
            // InternalDim.g:1457:2: iv_ruleDStateEvent= ruleDStateEvent EOF
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
    // InternalDim.g:1463:1: ruleDStateEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDStateEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalDim.g:1469:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? ) )
            // InternalDim.g:1470:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? )
            {
            // InternalDim.g:1470:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? )
            // InternalDim.g:1471:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )?
            {
            // InternalDim.g:1471:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1472:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1472:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1473:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDStateEventAccess().getNameIDTerminalRuleCall_0_0());
              				
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

            // InternalDim.g:1489:3: (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDim.g:1490:4: otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDStateEventAccess().getAliasKeyword_1_0());
                      			
                    }
                    // InternalDim.g:1494:4: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalDim.g:1495:5: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalDim.g:1495:5: (lv_alias_2_0= RULE_ID )
                    // InternalDim.g:1496:6: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_2_0, grammarAccess.getDStateEventAccess().getAliasIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDStateEventRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_2_0,
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
    // $ANTLR end "ruleDStateEvent"


    // $ANTLR start "entryRuleDimDetailType"
    // InternalDim.g:1517:1: entryRuleDimDetailType returns [EObject current=null] : iv_ruleDimDetailType= ruleDimDetailType EOF ;
    public final EObject entryRuleDimDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimDetailType = null;


        try {
            // InternalDim.g:1517:54: (iv_ruleDimDetailType= ruleDimDetailType EOF )
            // InternalDim.g:1518:2: iv_ruleDimDetailType= ruleDimDetailType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimDetailTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimDetailType=ruleDimDetailType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimDetailType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimDetailType"


    // $ANTLR start "ruleDimDetailType"
    // InternalDim.g:1524:1: ruleDimDetailType returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDimDetailType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_DimComplexType_3 = null;

        EObject lv_features_5_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1530:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) )
            // InternalDim.g:1531:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            {
            // InternalDim.g:1531:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            // InternalDim.g:1532:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}'
            {
            // InternalDim.g:1532:3: ()
            // InternalDim.g:1533:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimDetailTypeAccess().getDimDetailTypeAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:1539:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDim.g:1540:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalDim.g:1540:4: (lv_abstract_1_0= 'abstract' )
                    // InternalDim.g:1541:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,31,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_1_0, grammarAccess.getDimDetailTypeAccess().getAbstractAbstractKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimDetailTypeRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDimDetailTypeAccess().getDetailKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDimDetailTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDimDetailTypeAccess().getDimComplexTypeParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_28);
            this_DimComplexType_3=ruleDimComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DimComplexType_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimDetailTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDim.g:1572:3: ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==36||LA40_0==38) ) {
                    alt40=1;
                }
                else if ( (LA40_0==25) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDim.g:1573:4: ( (lv_features_5_0= ruleDimFeature ) )
            	    {
            	    // InternalDim.g:1573:4: ( (lv_features_5_0= ruleDimFeature ) )
            	    // InternalDim.g:1574:5: (lv_features_5_0= ruleDimFeature )
            	    {
            	    // InternalDim.g:1574:5: (lv_features_5_0= ruleDimFeature )
            	    // InternalDim.g:1575:6: lv_features_5_0= ruleDimFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimDetailTypeAccess().getFeaturesDimFeatureParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_features_5_0=ruleDimFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDimDetailTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_5_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DimFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:1593:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    {
            	    // InternalDim.g:1593:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    // InternalDim.g:1594:5: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:1594:5: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDim.g:1595:6: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimDetailTypeAccess().getConstraintsDConstraintParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_constraints_6_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDimDetailTypeRule());
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


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDimDetailTypeAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimDetailType"


    // $ANTLR start "ruleDimComplexType"
    // InternalDim.g:1622:1: ruleDimComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* ) ;
    public final EObject ruleDimComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_description_5_0 = null;

        EObject lv_notes_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1628:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* ) )
            // InternalDim.g:1629:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* )
            {
            // InternalDim.g:1629:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* )
            // InternalDim.g:1630:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )*
            {
            // InternalDim.g:1630:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1631:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1631:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1632:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDimComplexTypeAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimComplexTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:1648:3: (otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDim.g:1649:4: otherlv_1= 'alias' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDimComplexTypeAccess().getAliasKeyword_1_0());
                      			
                    }
                    // InternalDim.g:1653:4: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalDim.g:1654:5: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalDim.g:1654:5: (lv_alias_2_0= RULE_ID )
                    // InternalDim.g:1655:6: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_2_0, grammarAccess.getDimComplexTypeAccess().getAliasIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimComplexTypeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:1672:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDim.g:1673:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalDim.g:1677:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDim.g:1678:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDim.g:1678:5: (otherlv_4= RULE_ID )
                    // InternalDim.g:1679:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDimComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:1691:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_PLAIN_TEXT_ONLY && LA43_0<=RULE_RICH_TEXT_START)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDim.g:1692:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:1692:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:1693:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimComplexTypeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimComplexTypeRule());
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

            // InternalDim.g:1710:3: ( (lv_notes_6_0= ruleDNote ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==44) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDim.g:1711:4: (lv_notes_6_0= ruleDNote )
            	    {
            	    // InternalDim.g:1711:4: (lv_notes_6_0= ruleDNote )
            	    // InternalDim.g:1712:5: lv_notes_6_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimComplexTypeAccess().getNotesDNoteParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_notes_6_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimComplexTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_6_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleDimComplexType"


    // $ANTLR start "entryRuleDimFeature"
    // InternalDim.g:1733:1: entryRuleDimFeature returns [EObject current=null] : iv_ruleDimFeature= ruleDimFeature EOF ;
    public final EObject entryRuleDimFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimFeature = null;


        try {
            // InternalDim.g:1733:51: (iv_ruleDimFeature= ruleDimFeature EOF )
            // InternalDim.g:1734:2: iv_ruleDimFeature= ruleDimFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimFeature=ruleDimFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimFeature"


    // $ANTLR start "ruleDimFeature"
    // InternalDim.g:1740:1: ruleDimFeature returns [EObject current=null] : (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery ) ;
    public final EObject ruleDimFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DimAssociation_0 = null;

        EObject this_DimAttribute_1 = null;

        EObject this_DimQuery_2 = null;



        	enterRule();

        try {
            // InternalDim.g:1746:2: ( (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery ) )
            // InternalDim.g:1747:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )
            {
            // InternalDim.g:1747:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt45=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    int LA45_4 = input.LA(3);

                    if ( (LA45_4==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 26:
                            {
                            alt45=2;
                            }
                            break;
                        case 39:
                        case 85:
                        case 86:
                            {
                            alt45=1;
                            }
                            break;
                        case 41:
                            {
                            alt45=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt45=2;
                    }
                    break;
                case 39:
                case 85:
                case 86:
                    {
                    alt45=1;
                    }
                    break;
                case 41:
                    {
                    alt45=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }

                }
                break;
            case 36:
                {
                alt45=2;
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
                    // InternalDim.g:1748:3: this_DimAssociation_0= ruleDimAssociation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDimFeatureAccess().getDimAssociationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DimAssociation_0=ruleDimAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DimAssociation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:1757:3: this_DimAttribute_1= ruleDimAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDimFeatureAccess().getDimAttributeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DimAttribute_1=ruleDimAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DimAttribute_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDim.g:1766:3: this_DimQuery_2= ruleDimQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDimFeatureAccess().getDimQueryParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DimQuery_2=ruleDimQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DimQuery_2;
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
    // $ANTLR end "ruleDimFeature"


    // $ANTLR start "entryRuleDimAssociation"
    // InternalDim.g:1778:1: entryRuleDimAssociation returns [EObject current=null] : iv_ruleDimAssociation= ruleDimAssociation EOF ;
    public final EObject entryRuleDimAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAssociation = null;


        try {
            // InternalDim.g:1778:55: (iv_ruleDimAssociation= ruleDimAssociation EOF )
            // InternalDim.g:1779:2: iv_ruleDimAssociation= ruleDimAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimAssociation=ruleDimAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimAssociation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimAssociation"


    // $ANTLR start "ruleDimAssociation"
    // InternalDim.g:1785:1: ruleDimAssociation returns [EObject current=null] : ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ( (lv_notes_11_0= ruleDNote ) )* ) ;
    public final EObject ruleDimAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_derived_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_kind_5_0 = null;

        Enumerator lv_kind_6_0 = null;

        EObject lv_multiplicity_9_0 = null;

        EObject lv_description_10_0 = null;

        EObject lv_notes_11_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1791:2: ( ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ( (lv_notes_11_0= ruleDNote ) )* ) )
            // InternalDim.g:1792:2: ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ( (lv_notes_11_0= ruleDNote ) )* )
            {
            // InternalDim.g:1792:2: ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ( (lv_notes_11_0= ruleDNote ) )* )
            // InternalDim.g:1793:3: () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ( (lv_notes_11_0= ruleDNote ) )*
            {
            // InternalDim.g:1793:3: ()
            // InternalDim.g:1794:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAssociationAccess().getDimAssociationAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:1800:3: ( (lv_derived_1_0= 'derived' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDim.g:1801:4: (lv_derived_1_0= 'derived' )
                    {
                    // InternalDim.g:1801:4: (lv_derived_1_0= 'derived' )
                    // InternalDim.g:1802:5: lv_derived_1_0= 'derived'
                    {
                    lv_derived_1_0=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_derived_1_0, grammarAccess.getDimAssociationAccess().getDerivedDerivedKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAssociationRule());
                      					}
                      					setWithLastConsumed(current, "derived", true, "derived");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1814:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:1815:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:1815:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:1816:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDimAssociationAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimAssociationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:1832:3: (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDim.g:1833:4: otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimAssociationAccess().getAliasKeyword_3_0());
                      			
                    }
                    // InternalDim.g:1837:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalDim.g:1838:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalDim.g:1838:5: (lv_alias_4_0= RULE_ID )
                    // InternalDim.g:1839:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_4_0, grammarAccess.getDimAssociationAccess().getAliasIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimAssociationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_4_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:1856:3: ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39||LA48_0==85) ) {
                alt48=1;
            }
            else if ( (LA48_0==86) ) {
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
                    // InternalDim.g:1857:4: ( (lv_kind_5_0= ruleDAssociationKind ) )
                    {
                    // InternalDim.g:1857:4: ( (lv_kind_5_0= ruleDAssociationKind ) )
                    // InternalDim.g:1858:5: (lv_kind_5_0= ruleDAssociationKind )
                    {
                    // InternalDim.g:1858:5: (lv_kind_5_0= ruleDAssociationKind )
                    // InternalDim.g:1859:6: lv_kind_5_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimAssociationAccess().getKindDAssociationKindEnumRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_kind_5_0=ruleDAssociationKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDimAssociationRule());
                      						}
                      						set(
                      							current,
                      							"kind",
                      							lv_kind_5_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DAssociationKind");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:1877:4: ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' )
                    {
                    // InternalDim.g:1877:4: ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' )
                    // InternalDim.g:1878:5: ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains'
                    {
                    // InternalDim.g:1878:5: ( (lv_kind_6_0= ruleDAssociationKindInverse ) )
                    // InternalDim.g:1879:6: (lv_kind_6_0= ruleDAssociationKindInverse )
                    {
                    // InternalDim.g:1879:6: (lv_kind_6_0= ruleDAssociationKindInverse )
                    // InternalDim.g:1880:7: lv_kind_6_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDimAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_39);
                    lv_kind_6_0=ruleDAssociationKindInverse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDimAssociationRule());
                      							}
                      							set(
                      								current,
                      								"kind",
                      								lv_kind_6_0,
                      								"com.mimacom.ddd.dm.dim.Dim.DAssociationKindInverse");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,39,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getDimAssociationAccess().getContainsKeyword_4_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1903:3: ( (otherlv_8= RULE_ID ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==EOF||(LA49_1>=RULE_ID && LA49_1<=RULE_RICH_TEXT_START)||LA49_1==22||LA49_1==25||LA49_1==36||LA49_1==38||LA49_1==44||LA49_1==54||LA49_1==80||LA49_1==129) ) {
                    alt49=1;
                }
                else if ( (LA49_1==41) ) {
                    int LA49_4 = input.LA(3);

                    if ( (LA49_4==RULE_NATURAL) ) {
                        alt49=1;
                    }
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalDim.g:1904:4: (otherlv_8= RULE_ID )
                    {
                    // InternalDim.g:1904:4: (otherlv_8= RULE_ID )
                    // InternalDim.g:1905:5: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAssociationRule());
                      					}
                      				
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getDimAssociationAccess().getTypeDEntityTypeCrossReference_5_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1916:3: ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==41||LA50_0==54||LA50_0==80||LA50_0==129) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDim.g:1917:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1917:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    // InternalDim.g:1918:5: lv_multiplicity_9_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_multiplicity_9_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimAssociationRule());
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

            // InternalDim.g:1935:3: ( (lv_description_10_0= ruleDRichText ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_PLAIN_TEXT_ONLY && LA51_0<=RULE_RICH_TEXT_START)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDim.g:1936:4: (lv_description_10_0= ruleDRichText )
                    {
                    // InternalDim.g:1936:4: (lv_description_10_0= ruleDRichText )
                    // InternalDim.g:1937:5: lv_description_10_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAssociationAccess().getDescriptionDRichTextParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_description_10_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimAssociationRule());
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

            // InternalDim.g:1954:3: ( (lv_notes_11_0= ruleDNote ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==44) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDim.g:1955:4: (lv_notes_11_0= ruleDNote )
            	    {
            	    // InternalDim.g:1955:4: (lv_notes_11_0= ruleDNote )
            	    // InternalDim.g:1956:5: lv_notes_11_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimAssociationAccess().getNotesDNoteParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_notes_11_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimAssociationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_11_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleDimAssociation"


    // $ANTLR start "entryRuleDimAttribute"
    // InternalDim.g:1977:1: entryRuleDimAttribute returns [EObject current=null] : iv_ruleDimAttribute= ruleDimAttribute EOF ;
    public final EObject entryRuleDimAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAttribute = null;


        try {
            // InternalDim.g:1977:53: (iv_ruleDimAttribute= ruleDimAttribute EOF )
            // InternalDim.g:1978:2: iv_ruleDimAttribute= ruleDimAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimAttribute=ruleDimAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimAttribute"


    // $ANTLR start "ruleDimAttribute"
    // InternalDim.g:1984:1: ruleDimAttribute returns [EObject current=null] : ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ( (lv_notes_10_0= ruleDNote ) )* ) ;
    public final EObject ruleDimAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_detail_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_key_8_0=null;
        EObject lv_multiplicity_7_0 = null;

        EObject lv_description_9_0 = null;

        EObject lv_notes_10_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1990:2: ( ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ( (lv_notes_10_0= ruleDNote ) )* ) )
            // InternalDim.g:1991:2: ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ( (lv_notes_10_0= ruleDNote ) )* )
            {
            // InternalDim.g:1991:2: ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ( (lv_notes_10_0= ruleDNote ) )* )
            // InternalDim.g:1992:3: () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ( (lv_notes_10_0= ruleDNote ) )*
            {
            // InternalDim.g:1992:3: ()
            // InternalDim.g:1993:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAttributeAccess().getDimAttributeAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:1999:3: ( (lv_detail_1_0= 'detail' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==36) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDim.g:2000:4: (lv_detail_1_0= 'detail' )
                    {
                    // InternalDim.g:2000:4: (lv_detail_1_0= 'detail' )
                    // InternalDim.g:2001:5: lv_detail_1_0= 'detail'
                    {
                    lv_detail_1_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_detail_1_0, grammarAccess.getDimAttributeAccess().getDetailDetailKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAttributeRule());
                      					}
                      					setWithLastConsumed(current, "detail", true, "detail");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:2013:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:2014:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:2014:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:2015:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDimAttributeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:2031:3: (otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==20) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDim.g:2032:4: otherlv_3= 'alias' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimAttributeAccess().getAliasKeyword_3_0());
                      			
                    }
                    // InternalDim.g:2036:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalDim.g:2037:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalDim.g:2037:5: (lv_alias_4_0= RULE_ID )
                    // InternalDim.g:2038:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_4_0, grammarAccess.getDimAttributeAccess().getAliasIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimAttributeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_4_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDimAttributeAccess().getColonKeyword_4());
              		
            }
            // InternalDim.g:2059:3: ( (otherlv_6= RULE_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==41) ) {
                    int LA55_3 = input.LA(3);

                    if ( (LA55_3==RULE_NATURAL) ) {
                        alt55=1;
                    }
                }
                else if ( (LA55_1==EOF||(LA55_1>=RULE_ID && LA55_1<=RULE_RICH_TEXT_START)||LA55_1==22||LA55_1==25||LA55_1==36||LA55_1==38||LA55_1==40||LA55_1==44||LA55_1==54||LA55_1==80||LA55_1==129) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalDim.g:2060:4: (otherlv_6= RULE_ID )
                    {
                    // InternalDim.g:2060:4: (otherlv_6= RULE_ID )
                    // InternalDim.g:2061:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAttributeRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDimAttributeAccess().getTypeDTypeCrossReference_5_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:2072:3: ( (lv_multiplicity_7_0= ruleDMultiplicity ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==41||LA56_0==54||LA56_0==80||LA56_0==129) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDim.g:2073:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2073:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    // InternalDim.g:2074:5: lv_multiplicity_7_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_43);
                    lv_multiplicity_7_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimAttributeRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_7_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:2091:3: ( (lv_key_8_0= 'key' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==40) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDim.g:2092:4: (lv_key_8_0= 'key' )
                    {
                    // InternalDim.g:2092:4: (lv_key_8_0= 'key' )
                    // InternalDim.g:2093:5: lv_key_8_0= 'key'
                    {
                    lv_key_8_0=(Token)match(input,40,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_key_8_0, grammarAccess.getDimAttributeAccess().getKeyKeyKeyword_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAttributeRule());
                      					}
                      					setWithLastConsumed(current, "key", true, "key");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:2105:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_PLAIN_TEXT_ONLY && LA58_0<=RULE_RICH_TEXT_START)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDim.g:2106:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDim.g:2106:4: (lv_description_9_0= ruleDRichText )
                    // InternalDim.g:2107:5: lv_description_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAttributeAccess().getDescriptionDRichTextParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_description_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimAttributeRule());
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

            // InternalDim.g:2124:3: ( (lv_notes_10_0= ruleDNote ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==44) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalDim.g:2125:4: (lv_notes_10_0= ruleDNote )
            	    {
            	    // InternalDim.g:2125:4: (lv_notes_10_0= ruleDNote )
            	    // InternalDim.g:2126:5: lv_notes_10_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimAttributeAccess().getNotesDNoteParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_notes_10_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimAttributeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_10_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleDimAttribute"


    // $ANTLR start "entryRuleDimQuery"
    // InternalDim.g:2147:1: entryRuleDimQuery returns [EObject current=null] : iv_ruleDimQuery= ruleDimQuery EOF ;
    public final EObject entryRuleDimQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimQuery = null;


        try {
            // InternalDim.g:2147:49: (iv_ruleDimQuery= ruleDimQuery EOF )
            // InternalDim.g:2148:2: iv_ruleDimQuery= ruleDimQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimQuery=ruleDimQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimQuery"


    // $ANTLR start "ruleDimQuery"
    // InternalDim.g:2154:1: ruleDimQuery returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ( (lv_notes_15_0= ruleDNote ) )* ) ;
    public final EObject ruleDimQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
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

        EObject lv_notes_15_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2160:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ( (lv_notes_15_0= ruleDNote ) )* ) )
            // InternalDim.g:2161:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ( (lv_notes_15_0= ruleDNote ) )* )
            {
            // InternalDim.g:2161:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ( (lv_notes_15_0= ruleDNote ) )* )
            // InternalDim.g:2162:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ( (lv_notes_15_0= ruleDNote ) )*
            {
            // InternalDim.g:2162:3: ()
            // InternalDim.g:2163:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimQueryAccess().getDimQueryAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:2169:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2170:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2170:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2171:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDimQueryAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimQueryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:2187:3: (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==20) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDim.g:2188:4: otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDimQueryAccess().getAliasKeyword_2_0());
                      			
                    }
                    // InternalDim.g:2192:4: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalDim.g:2193:5: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalDim.g:2193:5: (lv_alias_3_0= RULE_ID )
                    // InternalDim.g:2194:6: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_3_0, grammarAccess.getDimQueryAccess().getAliasIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimQueryRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimQueryAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalDim.g:2215:3: ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDim.g:2216:4: ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )*
                    {
                    // InternalDim.g:2216:4: ( (lv_parameters_5_0= ruleDimQueryParameter ) )
                    // InternalDim.g:2217:5: (lv_parameters_5_0= ruleDimQueryParameter )
                    {
                    // InternalDim.g:2217:5: (lv_parameters_5_0= ruleDimQueryParameter )
                    // InternalDim.g:2218:6: lv_parameters_5_0= ruleDimQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimQueryAccess().getParametersDimQueryParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
                    lv_parameters_5_0=ruleDimQueryParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDimQueryRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_5_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DimQueryParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:2235:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==30) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalDim.g:2236:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getDimQueryAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:2240:5: ( (lv_parameters_7_0= ruleDimQueryParameter ) )
                    	    // InternalDim.g:2241:6: (lv_parameters_7_0= ruleDimQueryParameter )
                    	    {
                    	    // InternalDim.g:2241:6: (lv_parameters_7_0= ruleDimQueryParameter )
                    	    // InternalDim.g:2242:7: lv_parameters_7_0= ruleDimQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimQueryAccess().getParametersDimQueryParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_47);
                    	    lv_parameters_7_0=ruleDimQueryParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDimQueryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_7_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DimQueryParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimQueryAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,26,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDimQueryAccess().getColonKeyword_6());
              		
            }
            // InternalDim.g:2269:3: ( (otherlv_10= RULE_ID ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==EOF||(LA63_1>=RULE_ID && LA63_1<=RULE_RICH_TEXT_START)||(LA63_1>=22 && LA63_1<=23)||LA63_1==25||LA63_1==27||LA63_1==29||(LA63_1>=31 && LA63_1<=33)||LA63_1==36||LA63_1==38||(LA63_1>=43 && LA63_1<=44)||LA63_1==54||LA63_1==80||(LA63_1>=83 && LA63_1<=84)||LA63_1==129) ) {
                    alt63=1;
                }
                else if ( (LA63_1==41) ) {
                    int LA63_4 = input.LA(3);

                    if ( (LA63_4==RULE_NATURAL) ) {
                        alt63=1;
                    }
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalDim.g:2270:4: (otherlv_10= RULE_ID )
                    {
                    // InternalDim.g:2270:4: (otherlv_10= RULE_ID )
                    // InternalDim.g:2271:5: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimQueryRule());
                      					}
                      				
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getDimQueryAccess().getTypeDTypeCrossReference_7_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:2282:3: ( (lv_multiplicity_11_0= ruleDMultiplicity ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==41||LA64_0==54||LA64_0==80||LA64_0==129) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDim.g:2283:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2283:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    // InternalDim.g:2284:5: lv_multiplicity_11_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryAccess().getMultiplicityDMultiplicityParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_50);
                    lv_multiplicity_11_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimQueryRule());
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

            // InternalDim.g:2301:3: (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDim.g:2302:4: otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) )
                    {
                    otherlv_12=(Token)match(input,43,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDimQueryAccess().getReturnsKeyword_9_0());
                      			
                    }
                    // InternalDim.g:2306:4: ( (lv_returns_13_0= ruleDExpression ) )
                    // InternalDim.g:2307:5: (lv_returns_13_0= ruleDExpression )
                    {
                    // InternalDim.g:2307:5: (lv_returns_13_0= ruleDExpression )
                    // InternalDim.g:2308:6: lv_returns_13_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimQueryAccess().getReturnsDExpressionParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_returns_13_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDimQueryRule());
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

            // InternalDim.g:2326:3: ( (lv_description_14_0= ruleDRichText ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_PLAIN_TEXT_ONLY && LA66_0<=RULE_RICH_TEXT_START)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDim.g:2327:4: (lv_description_14_0= ruleDRichText )
                    {
                    // InternalDim.g:2327:4: (lv_description_14_0= ruleDRichText )
                    // InternalDim.g:2328:5: lv_description_14_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryAccess().getDescriptionDRichTextParserRuleCall_10_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_description_14_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimQueryRule());
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

            // InternalDim.g:2345:3: ( (lv_notes_15_0= ruleDNote ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==44) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalDim.g:2346:4: (lv_notes_15_0= ruleDNote )
            	    {
            	    // InternalDim.g:2346:4: (lv_notes_15_0= ruleDNote )
            	    // InternalDim.g:2347:5: lv_notes_15_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimQueryAccess().getNotesDNoteParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_notes_15_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimQueryRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_15_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // $ANTLR end "ruleDimQuery"


    // $ANTLR start "entryRuleDimQueryParameter"
    // InternalDim.g:2368:1: entryRuleDimQueryParameter returns [EObject current=null] : iv_ruleDimQueryParameter= ruleDimQueryParameter EOF ;
    public final EObject entryRuleDimQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimQueryParameter = null;


        try {
            // InternalDim.g:2368:58: (iv_ruleDimQueryParameter= ruleDimQueryParameter EOF )
            // InternalDim.g:2369:2: iv_ruleDimQueryParameter= ruleDimQueryParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimQueryParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDimQueryParameter=ruleDimQueryParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimQueryParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimQueryParameter"


    // $ANTLR start "ruleDimQueryParameter"
    // InternalDim.g:2375:1: ruleDimQueryParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* ) ;
    public final EObject ruleDimQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_5_0 = null;

        EObject lv_notes_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2381:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* ) )
            // InternalDim.g:2382:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* )
            {
            // InternalDim.g:2382:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )* )
            // InternalDim.g:2383:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ( (lv_notes_6_0= ruleDNote ) )*
            {
            // InternalDim.g:2383:3: ()
            // InternalDim.g:2384:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimQueryParameterAccess().getDimQueryParameterAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:2390:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2391:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2391:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2392:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDimQueryParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimQueryParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDimQueryParameterAccess().getColonKeyword_2());
              		
            }
            // InternalDim.g:2412:3: ( (otherlv_3= RULE_ID ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDim.g:2413:4: (otherlv_3= RULE_ID )
                    {
                    // InternalDim.g:2413:4: (otherlv_3= RULE_ID )
                    // InternalDim.g:2414:5: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimQueryParameterRule());
                      					}
                      				
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDimQueryParameterAccess().getTypeDTypeCrossReference_3_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:2425:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==41||LA69_0==54||LA69_0==80||LA69_0==129) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDim.g:2426:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2426:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDim.g:2427:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_multiplicity_4_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimQueryParameterRule());
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

            // InternalDim.g:2444:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_PLAIN_TEXT_ONLY && LA70_0<=RULE_RICH_TEXT_START)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDim.g:2445:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:2445:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:2446:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryParameterAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimQueryParameterRule());
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

            // InternalDim.g:2463:3: ( (lv_notes_6_0= ruleDNote ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==44) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalDim.g:2464:4: (lv_notes_6_0= ruleDNote )
            	    {
            	    // InternalDim.g:2464:4: (lv_notes_6_0= ruleDNote )
            	    // InternalDim.g:2465:5: lv_notes_6_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimQueryParameterAccess().getNotesDNoteParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_notes_6_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimQueryParameterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_6_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // $ANTLR end "ruleDimQueryParameter"


    // $ANTLR start "entryRuleDNote"
    // InternalDim.g:2486:1: entryRuleDNote returns [EObject current=null] : iv_ruleDNote= ruleDNote EOF ;
    public final EObject entryRuleDNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNote = null;


        try {
            // InternalDim.g:2486:46: (iv_ruleDNote= ruleDNote EOF )
            // InternalDim.g:2487:2: iv_ruleDNote= ruleDNote EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNoteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNote=ruleDNote();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNote; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDNote"


    // $ANTLR start "ruleDNote"
    // InternalDim.g:2493:1: ruleDNote returns [EObject current=null] : (otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}' ) ;
    public final EObject ruleDNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_text_3_0 = null;

        Enumerator lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2499:2: ( (otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}' ) )
            // InternalDim.g:2500:2: (otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}' )
            {
            // InternalDim.g:2500:2: (otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}' )
            // InternalDim.g:2501:3: otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDNoteAccess().getNOTEKeyword_0());
              		
            }
            // InternalDim.g:2505:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2506:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2506:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2507:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDNoteAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNoteRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDNoteAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalDim.g:2527:3: ( (lv_text_3_0= ruleDRichText ) )
            // InternalDim.g:2528:4: (lv_text_3_0= ruleDRichText )
            {
            // InternalDim.g:2528:4: (lv_text_3_0= ruleDRichText )
            // InternalDim.g:2529:5: lv_text_3_0= ruleDRichText
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNoteAccess().getTextDRichTextParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_52);
            lv_text_3_0=ruleDRichText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDNoteRule());
              					}
              					set(
              						current,
              						"text",
              						lv_text_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDim.g:2546:3: ( (lv_color_4_0= ruleDNoteColor ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=87 && LA72_0<=94)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDim.g:2547:4: (lv_color_4_0= ruleDNoteColor )
                    {
                    // InternalDim.g:2547:4: (lv_color_4_0= ruleDNoteColor )
                    // InternalDim.g:2548:5: lv_color_4_0= ruleDNoteColor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDNoteAccess().getColorDNoteColorEnumRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_53);
                    lv_color_4_0=ruleDNoteColor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDNoteRule());
                      					}
                      					set(
                      						current,
                      						"color",
                      						lv_color_4_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DNoteColor");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDNoteAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDNote"


    // $ANTLR start "entryRuleDImport"
    // InternalDim.g:2573:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDim.g:2573:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDim.g:2574:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDim.g:2580:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2586:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDim.g:2587:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDim.g:2587:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDim.g:2588:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDim.g:2592:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDim.g:2593:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDim.g:2593:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDim.g:2594:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalDim.g:2615:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalDim.g:2615:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalDim.g:2616:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalDim.g:2622:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalDim.g:2628:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalDim.g:2629:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalDim.g:2629:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalDim.g:2630:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalDim.g:2634:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2635:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2635:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2636:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
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

            // InternalDim.g:2652:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==47) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDim.g:2653:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalDim.g:2657:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalDim.g:2658:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalDim.g:2658:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalDim.g:2659:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
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

                    // InternalDim.g:2676:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==30) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalDim.g:2677:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDim.g:2681:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalDim.g:2682:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalDim.g:2682:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalDim.g:2683:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_55);
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
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDim.g:2706:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalDim.g:2707:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalDim.g:2707:4: (lv_expr_7_0= ruleDExpression )
            // InternalDim.g:2708:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_53);
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
    // InternalDim.g:2733:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalDim.g:2733:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalDim.g:2734:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalDim.g:2740:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalDim.g:2746:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalDim.g:2747:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalDim.g:2747:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalDim.g:2748:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalDim.g:2748:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:2749:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:2749:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:2750:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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
            // InternalDim.g:2770:3: ( (otherlv_2= RULE_ID ) )
            // InternalDim.g:2771:4: (otherlv_2= RULE_ID )
            {
            // InternalDim.g:2771:4: (otherlv_2= RULE_ID )
            // InternalDim.g:2772:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDim.g:2783:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==41||LA75_0==54||LA75_0==80||LA75_0==129) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalDim.g:2784:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2784:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDim.g:2785:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_57);
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

            // InternalDim.g:2802:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==48) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDim.g:2803:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalDim.g:2807:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( ((LA76_0>=RULE_NATURAL && LA76_0<=RULE_STRING)||LA76_0==33||LA76_0==36||(LA76_0>=72 && LA76_0<=77)) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==21) ) {
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
                            // InternalDim.g:2808:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalDim.g:2808:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalDim.g:2809:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalDim.g:2809:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalDim.g:2810:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalDim.g:2828:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalDim.g:2828:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalDim.g:2829:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalDim.g:2829:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalDim.g:2830:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalDim.g:2853:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalDim.g:2853:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalDim.g:2854:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalDim.g:2860:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalDim.g:2866:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalDim.g:2867:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalDim.g:2867:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalDim.g:2868:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalDim.g:2868:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:2869:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:2869:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:2870:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,49,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:2894:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalDim.g:2895:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalDim.g:2895:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalDim.g:2896:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_61);
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

            // InternalDim.g:2913:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==30) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalDim.g:2914:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDim.g:2918:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalDim.g:2919:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalDim.g:2919:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalDim.g:2920:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    if ( cnt78 >= 1 ) break loop78;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
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
    // InternalDim.g:2946:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalDim.g:2946:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalDim.g:2947:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalDim.g:2953:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2959:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDim.g:2960:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDim.g:2960:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDim.g:2961:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDim.g:2965:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2966:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2966:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2967:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,51,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalDim.g:2987:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalDim.g:2988:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalDim.g:2988:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalDim.g:2989:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            // InternalDim.g:3006:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_PLAIN_TEXT_ONLY && LA79_0<=RULE_RICH_TEXT_START)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDim.g:3007:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:3007:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:3008:5: lv_description_4_0= ruleDRichText
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
    // InternalDim.g:3029:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalDim.g:3029:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalDim.g:3030:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalDim.g:3036:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalDim.g:3042:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalDim.g:3043:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalDim.g:3043:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalDim.g:3044:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalDim.g:3048:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:3049:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:3049:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:3050:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,41,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:3070:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalDim.g:3071:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalDim.g:3071:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalDim.g:3072:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalDim.g:3072:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalDim.g:3073:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
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

                    // InternalDim.g:3090:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==30) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalDim.g:3091:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:3095:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalDim.g:3096:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalDim.g:3096:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalDim.g:3097:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,26,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalDim.g:3124:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDim.g:3125:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDim.g:3125:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalDim.g:3126:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_65);
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

            // InternalDim.g:3143:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==53) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDim.g:3144:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalDim.g:3148:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalDim.g:3149:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalDim.g:3149:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalDim.g:3150:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalDim.g:3172:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalDim.g:3172:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalDim.g:3173:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalDim.g:3179:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3185:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalDim.g:3186:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalDim.g:3186:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalDim.g:3187:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalDim.g:3187:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=95 && LA83_0<=105)) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_ID) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalDim.g:3188:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalDim.g:3188:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalDim.g:3189:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalDim.g:3189:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalDim.g:3190:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_66);
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
                    // InternalDim.g:3208:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDim.g:3208:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDim.g:3209:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDim.g:3209:5: (otherlv_1= RULE_ID )
                    // InternalDim.g:3210:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:3222:3: ( (lv_collection_2_0= '*' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==54) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDim.g:3223:4: (lv_collection_2_0= '*' )
                    {
                    // InternalDim.g:3223:4: (lv_collection_2_0= '*' )
                    // InternalDim.g:3224:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:3240:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalDim.g:3240:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalDim.g:3241:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalDim.g:3247:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3253:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalDim.g:3254:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalDim.g:3254:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalDim.g:3255:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalDim.g:3255:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:3256:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:3256:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:3257:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDim.g:3277:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDim.g:3278:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDim.g:3278:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalDim.g:3279:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalDim.g:3300:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDim.g:3300:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDim.g:3301:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDim.g:3307:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalDim.g:3313:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalDim.g:3314:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalDim.g:3314:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt85=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==EOF||(LA85_1>=RULE_ID && LA85_1<=RULE_RICH_TEXT_END)||(LA85_1>=22 && LA85_1<=23)||LA85_1==25||LA85_1==27||(LA85_1>=29 && LA85_1<=33)||LA85_1==36||LA85_1==38||(LA85_1>=41 && LA85_1<=42)||LA85_1==44||LA85_1==49||(LA85_1>=54 && LA85_1<=62)||(LA85_1>=68 && LA85_1<=71)||(LA85_1>=80 && LA85_1<=81)||(LA85_1>=83 && LA85_1<=84)||(LA85_1>=106 && LA85_1<=125)) ) {
                    alt85=2;
                }
                else if ( (LA85_1==48) ) {
                    alt85=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 1, input);

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
            case 63:
            case 67:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 80:
            case 81:
            case 126:
            case 127:
            case 128:
                {
                alt85=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_RICH_TEXT_START:
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
                    // InternalDim.g:3315:3: this_DmxAssignment_0= ruleDmxAssignment
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
                    // InternalDim.g:3324:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
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
                    // InternalDim.g:3333:3: this_DRichText_2= ruleDRichText
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
    // InternalDim.g:3345:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDim.g:3345:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDim.g:3346:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDim.g:3352:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalDim.g:3358:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalDim.g:3359:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalDim.g:3359:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_RICH_TEXT_START) ) {
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
                    // InternalDim.g:3360:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalDim.g:3360:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalDim.g:3361:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalDim.g:3361:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalDim.g:3362:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalDim.g:3380:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalDim.g:3380:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalDim.g:3381:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalDim.g:3381:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalDim.g:3382:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalDim.g:3382:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalDim.g:3383:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalDim.g:3400:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDim.g:3401:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDim.g:3401:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDim.g:3402:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_67);
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

                    // InternalDim.g:3419:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalDim.g:3420:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDim.g:3420:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalDim.g:3421:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalDim.g:3421:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalDim.g:3422:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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

                    	    // InternalDim.g:3439:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDim.g:3440:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:3440:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDim.g:3441:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_67);
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
                    	    break loop86;
                        }
                    } while (true);

                    // InternalDim.g:3459:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalDim.g:3460:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalDim.g:3460:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalDim.g:3461:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalDim.g:3483:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalDim.g:3483:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalDim.g:3484:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalDim.g:3490:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3496:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDim.g:3497:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDim.g:3497:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDim.g:3498:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDim.g:3498:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDim.g:3499:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDim.g:3518:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalDim.g:3518:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalDim.g:3519:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalDim.g:3525:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3531:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalDim.g:3532:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalDim.g:3532:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalDim.g:3533:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalDim.g:3533:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalDim.g:3534:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalDim.g:3553:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalDim.g:3553:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalDim.g:3554:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalDim.g:3560:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3566:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalDim.g:3567:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalDim.g:3567:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalDim.g:3568:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalDim.g:3568:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalDim.g:3569:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalDim.g:3588:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalDim.g:3588:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalDim.g:3589:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalDim.g:3595:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:3601:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalDim.g:3602:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalDim.g:3602:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalDim.g:3603:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalDim.g:3603:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalDim.g:3604:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalDim.g:3623:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalDim.g:3623:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalDim.g:3624:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalDim.g:3630:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDim.g:3636:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalDim.g:3637:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalDim.g:3637:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalDim.g:3638:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3646:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop89:
            do {
                int alt89=3;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==55) ) {
                    int LA89_2 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt89=1;
                    }
                    else if ( (synpred2_InternalDim()) ) {
                        alt89=2;
                    }


                }


                switch (alt89) {
            	case 1 :
            	    // InternalDim.g:3647:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalDim.g:3647:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalDim.g:3648:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalDim.g:3648:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalDim.g:3649:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalDim.g:3661:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalDim.g:3662:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalDim.g:3662:7: ()
            	    // InternalDim.g:3663:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDim.g:3673:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDim.g:3674:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDim.g:3674:8: (otherlv_3= RULE_ID )
            	    // InternalDim.g:3675:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_70);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3695:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalDim.g:3696:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalDim.g:3696:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalDim.g:3697:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_68);
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
            	    // InternalDim.g:3716:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalDim.g:3716:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalDim.g:3717:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalDim.g:3717:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDim.g:3718:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDim.g:3724:6: ( () otherlv_7= '.' )
            	    // InternalDim.g:3725:7: () otherlv_7= '.'
            	    {
            	    // InternalDim.g:3725:7: ()
            	    // InternalDim.g:3726:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3738:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDim.g:3739:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDim.g:3739:6: (otherlv_8= RULE_ID )
            	    // InternalDim.g:3740:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3751:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt88=3;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==41) && (synpred3_InternalDim())) {
            	        alt88=1;
            	    }
            	    else if ( (LA88_0==56) ) {
            	        alt88=2;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // InternalDim.g:3752:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalDim.g:3752:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalDim.g:3753:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalDim.g:3753:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDim.g:3754:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDim.g:3758:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDim.g:3759:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,41,FOLLOW_72); if (state.failed) return current;
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

            	            // InternalDim.g:3771:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalDim.g:3772:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalDim.g:3772:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalDim.g:3773:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_73);
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

            	            otherlv_11=(Token)match(input,42,FOLLOW_68); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDim.g:3796:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalDim.g:3796:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalDim.g:3797:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalDim.g:3797:7: (lv_before_12_0= '@before' )
            	            // InternalDim.g:3798:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,56,FOLLOW_68); if (state.failed) return current;
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
            	    break loop89;
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
    // InternalDim.g:3817:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalDim.g:3817:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalDim.g:3818:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalDim.g:3824:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3830:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalDim.g:3831:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalDim.g:3831:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalDim.g:3832:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalDim.g:3832:3: ()
            // InternalDim.g:3833:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:3839:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID||(LA91_0>=RULE_NATURAL && LA91_0<=RULE_STRING)||LA91_0==21||LA91_0==33||LA91_0==36||LA91_0==41||LA91_0==63||LA91_0==67||(LA91_0>=72 && LA91_0<=77)||(LA91_0>=80 && LA91_0<=81)||(LA91_0>=126 && LA91_0<=128)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalDim.g:3840:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalDim.g:3840:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalDim.g:3841:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalDim.g:3841:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalDim.g:3842:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_74);
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

                    // InternalDim.g:3859:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==30) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalDim.g:3860:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,30,FOLLOW_70); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:3864:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalDim.g:3865:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalDim.g:3865:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalDim.g:3866:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_74);
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
                    	    break loop90;
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
    // InternalDim.g:3889:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalDim.g:3889:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalDim.g:3890:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
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
    // InternalDim.g:3896:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3902:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalDim.g:3903:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalDim.g:3903:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalDim.g:3904:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalDim.g:3904:3: ()
            // InternalDim.g:3905:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:3911:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:3912:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:3912:4: (otherlv_1= RULE_ID )
            // InternalDim.g:3913:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxAssignmentRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxAssignmentAccess().getAssignToMemberDNavigableMemberCrossReference_1_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAssignmentAccess().getDmxOpSingleAssignParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_70);
            ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3931:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalDim.g:3932:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalDim.g:3932:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalDim.g:3933:5: lv_value_3_0= ruleDmxOrExpression
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
    // InternalDim.g:3954:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalDim.g:3954:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalDim.g:3955:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalDim.g:3961:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:3967:2: (kw= ':=' )
            // InternalDim.g:3968:2: kw= ':='
            {
            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:3976:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalDim.g:3976:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalDim.g:3977:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalDim.g:3983:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDim.g:3989:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalDim.g:3990:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalDim.g:3990:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==EOF||(LA92_1>=RULE_ID && LA92_1<=RULE_RICH_TEXT_END)||(LA92_1>=22 && LA92_1<=23)||LA92_1==25||LA92_1==27||(LA92_1>=29 && LA92_1<=33)||LA92_1==36||LA92_1==38||(LA92_1>=41 && LA92_1<=42)||LA92_1==44||LA92_1==49||(LA92_1>=54 && LA92_1<=56)||(LA92_1>=58 && LA92_1<=62)||(LA92_1>=68 && LA92_1<=71)||(LA92_1>=80 && LA92_1<=81)||(LA92_1>=83 && LA92_1<=84)||(LA92_1>=106 && LA92_1<=125)) ) {
                    alt92=2;
                }
                else if ( (LA92_1==57) ) {
                    alt92=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA92_0>=RULE_NATURAL && LA92_0<=RULE_STRING)||LA92_0==21||LA92_0==33||LA92_0==36||LA92_0==41||LA92_0==63||LA92_0==67||(LA92_0>=72 && LA92_0<=77)||(LA92_0>=80 && LA92_0<=81)||(LA92_0>=126 && LA92_0<=128)) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalDim.g:3991:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalDim.g:3991:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalDim.g:3992:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalDim.g:3992:4: ()
                    // InternalDim.g:3993:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDim.g:3999:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalDim.g:4000:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalDim.g:4000:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalDim.g:4001:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_75);
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

                    otherlv_2=(Token)match(input,57,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalDim.g:4022:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalDim.g:4023:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalDim.g:4023:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalDim.g:4024:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalDim.g:4043:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalDim.g:4055:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalDim.g:4055:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalDim.g:4056:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalDim.g:4062:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:4068:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDim.g:4069:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDim.g:4069:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:4070:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:4070:3: (lv_name_0_0= RULE_ID )
            // InternalDim.g:4071:4: lv_name_0_0= RULE_ID
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
    // InternalDim.g:4090:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalDim.g:4090:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalDim.g:4091:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalDim.g:4097:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4103:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalDim.g:4104:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalDim.g:4104:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalDim.g:4105:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_76);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4113:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop93:
            do {
                int alt93=2;
                switch ( input.LA(1) ) {
                case 106:
                    {
                    int LA93_2 = input.LA(2);

                    if ( (synpred4_InternalDim()) ) {
                        alt93=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA93_3 = input.LA(2);

                    if ( (synpred4_InternalDim()) ) {
                        alt93=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA93_4 = input.LA(2);

                    if ( (synpred4_InternalDim()) ) {
                        alt93=1;
                    }


                    }
                    break;
                case 109:
                    {
                    int LA93_5 = input.LA(2);

                    if ( (synpred4_InternalDim()) ) {
                        alt93=1;
                    }


                    }
                    break;

                }

                switch (alt93) {
            	case 1 :
            	    // InternalDim.g:4114:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalDim.g:4114:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalDim.g:4115:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalDim.g:4125:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalDim.g:4126:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalDim.g:4126:6: ()
            	    // InternalDim.g:4127:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4133:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalDim.g:4134:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalDim.g:4134:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalDim.g:4135:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_70);
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

            	    // InternalDim.g:4154:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalDim.g:4155:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalDim.g:4155:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalDim.g:4156:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_76);
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
            	    break loop93;
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
    // InternalDim.g:4178:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalDim.g:4178:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalDim.g:4179:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalDim.g:4185:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4191:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalDim.g:4192:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalDim.g:4192:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalDim.g:4193:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_77);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4201:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==110) ) {
                    int LA94_2 = input.LA(2);

                    if ( (synpred5_InternalDim()) ) {
                        alt94=1;
                    }


                }
                else if ( (LA94_0==111) ) {
                    int LA94_3 = input.LA(2);

                    if ( (synpred5_InternalDim()) ) {
                        alt94=1;
                    }


                }


                switch (alt94) {
            	case 1 :
            	    // InternalDim.g:4202:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalDim.g:4202:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalDim.g:4203:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalDim.g:4213:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalDim.g:4214:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalDim.g:4214:6: ()
            	    // InternalDim.g:4215:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4221:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalDim.g:4222:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalDim.g:4222:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalDim.g:4223:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_70);
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

            	    // InternalDim.g:4242:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalDim.g:4243:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalDim.g:4243:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalDim.g:4244:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_77);
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
            	    break loop94;
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
    // InternalDim.g:4266:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalDim.g:4266:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalDim.g:4267:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalDim.g:4273:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4279:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalDim.g:4280:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalDim.g:4280:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalDim.g:4281:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_78);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4289:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop95:
            do {
                int alt95=2;
                switch ( input.LA(1) ) {
                case 62:
                    {
                    int LA95_2 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt95=1;
                    }


                    }
                    break;
                case 112:
                    {
                    int LA95_3 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt95=1;
                    }


                    }
                    break;
                case 113:
                    {
                    int LA95_4 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt95=1;
                    }


                    }
                    break;

                }

                switch (alt95) {
            	case 1 :
            	    // InternalDim.g:4290:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalDim.g:4290:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalDim.g:4291:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalDim.g:4301:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalDim.g:4302:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalDim.g:4302:6: ()
            	    // InternalDim.g:4303:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4309:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalDim.g:4310:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalDim.g:4310:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalDim.g:4311:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_70);
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

            	    // InternalDim.g:4330:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalDim.g:4331:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalDim.g:4331:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalDim.g:4332:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_78);
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
            	    break loop95;
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
    // InternalDim.g:4354:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalDim.g:4354:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalDim.g:4355:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalDim.g:4361:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4367:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalDim.g:4368:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalDim.g:4368:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalDim.g:4369:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_79);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4377:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop96:
            do {
                int alt96=3;
                alt96 = dfa96.predict(input);
                switch (alt96) {
            	case 1 :
            	    // InternalDim.g:4378:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDim.g:4378:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDim.g:4379:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDim.g:4379:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalDim.g:4380:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalDim.g:4386:6: ( () ruleDmxOpInstanceOf )
            	    // InternalDim.g:4387:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalDim.g:4387:7: ()
            	    // InternalDim.g:4388:8: 
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

            	    // InternalDim.g:4403:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDim.g:4404:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDim.g:4404:6: (otherlv_3= RULE_ID )
            	    // InternalDim.g:4405:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:4418:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalDim.g:4418:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalDim.g:4419:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalDim.g:4419:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDim.g:4420:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDim.g:4430:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDim.g:4431:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDim.g:4431:7: ()
            	    // InternalDim.g:4432:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDim.g:4438:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDim.g:4439:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDim.g:4439:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDim.g:4440:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_70);
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

            	    // InternalDim.g:4459:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalDim.g:4460:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalDim.g:4460:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalDim.g:4461:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_79);
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
            	    break loop96;
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
    // InternalDim.g:4484:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalDim.g:4484:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalDim.g:4485:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalDim.g:4491:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:4497:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDim.g:4498:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDim.g:4498:2: (kw= 'ISA' | kw= 'isa' )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==58) ) {
                alt97=1;
            }
            else if ( (LA97_0==59) ) {
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
                    // InternalDim.g:4499:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4505:3: kw= 'isa'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4514:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalDim.g:4514:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalDim.g:4515:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalDim.g:4521:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4527:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalDim.g:4528:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalDim.g:4528:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalDim.g:4529:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_80);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4537:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop98:
            do {
                int alt98=2;
                switch ( input.LA(1) ) {
                case 120:
                    {
                    int LA98_2 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt98=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA98_3 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt98=1;
                    }


                    }
                    break;
                case 71:
                    {
                    int LA98_4 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt98=1;
                    }


                    }
                    break;
                case 121:
                    {
                    int LA98_5 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt98=1;
                    }


                    }
                    break;
                case 122:
                    {
                    int LA98_6 = input.LA(2);

                    if ( (synpred9_InternalDim()) ) {
                        alt98=1;
                    }


                    }
                    break;

                }

                switch (alt98) {
            	case 1 :
            	    // InternalDim.g:4538:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalDim.g:4538:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDim.g:4539:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDim.g:4549:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDim.g:4550:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDim.g:4550:6: ()
            	    // InternalDim.g:4551:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4557:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDim.g:4558:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDim.g:4558:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDim.g:4559:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_70);
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

            	    // InternalDim.g:4578:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalDim.g:4579:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalDim.g:4579:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalDim.g:4580:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_80);
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
            	    break loop98;
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
    // InternalDim.g:4602:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalDim.g:4602:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalDim.g:4603:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalDim.g:4609:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4615:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalDim.g:4616:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalDim.g:4616:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalDim.g:4617:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_81);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4625:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==80) ) {
                    int LA99_2 = input.LA(2);

                    if ( (synpred10_InternalDim()) ) {
                        alt99=1;
                    }


                }
                else if ( (LA99_0==81) ) {
                    int LA99_3 = input.LA(2);

                    if ( (synpred10_InternalDim()) ) {
                        alt99=1;
                    }


                }


                switch (alt99) {
            	case 1 :
            	    // InternalDim.g:4626:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalDim.g:4626:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDim.g:4627:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDim.g:4637:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDim.g:4638:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDim.g:4638:6: ()
            	    // InternalDim.g:4639:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4645:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDim.g:4646:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDim.g:4646:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDim.g:4647:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_70);
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

            	    // InternalDim.g:4666:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalDim.g:4667:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalDim.g:4667:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalDim.g:4668:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_81);
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
            	    break loop99;
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
    // InternalDim.g:4690:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalDim.g:4690:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalDim.g:4691:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalDim.g:4697:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4703:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalDim.g:4704:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalDim.g:4704:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalDim.g:4705:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_82);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4713:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop100:
            do {
                int alt100=2;
                switch ( input.LA(1) ) {
                case 54:
                    {
                    int LA100_2 = input.LA(2);

                    if ( (synpred11_InternalDim()) ) {
                        alt100=1;
                    }


                    }
                    break;
                case 123:
                    {
                    int LA100_3 = input.LA(2);

                    if ( (synpred11_InternalDim()) ) {
                        alt100=1;
                    }


                    }
                    break;
                case 124:
                    {
                    int LA100_4 = input.LA(2);

                    if ( (synpred11_InternalDim()) ) {
                        alt100=1;
                    }


                    }
                    break;
                case 125:
                    {
                    int LA100_5 = input.LA(2);

                    if ( (synpred11_InternalDim()) ) {
                        alt100=1;
                    }


                    }
                    break;

                }

                switch (alt100) {
            	case 1 :
            	    // InternalDim.g:4714:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalDim.g:4714:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDim.g:4715:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDim.g:4725:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDim.g:4726:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDim.g:4726:6: ()
            	    // InternalDim.g:4727:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:4733:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDim.g:4734:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDim.g:4734:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDim.g:4735:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_70);
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

            	    // InternalDim.g:4754:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalDim.g:4755:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalDim.g:4755:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalDim.g:4756:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_82);
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
            	    break loop100;
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
    // InternalDim.g:4778:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalDim.g:4778:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalDim.g:4779:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalDim.g:4785:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDim.g:4791:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalDim.g:4792:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalDim.g:4792:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=80 && LA101_0<=81)||(LA101_0>=126 && LA101_0<=128)) ) {
                alt101=1;
            }
            else if ( (LA101_0==RULE_ID||(LA101_0>=RULE_NATURAL && LA101_0<=RULE_STRING)||LA101_0==21||LA101_0==33||LA101_0==36||LA101_0==41||LA101_0==63||LA101_0==67||(LA101_0>=72 && LA101_0<=77)) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalDim.g:4793:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalDim.g:4793:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalDim.g:4794:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalDim.g:4794:4: ()
                    // InternalDim.g:4795:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDim.g:4801:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDim.g:4802:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDim.g:4802:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDim.g:4803:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_70);
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

                    // InternalDim.g:4820:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalDim.g:4821:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalDim.g:4821:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalDim.g:4822:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalDim.g:4841:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalDim.g:4853:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalDim.g:4853:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalDim.g:4854:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalDim.g:4860:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4866:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDim.g:4867:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDim.g:4867:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDim.g:4868:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_83);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4876:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==60) ) {
                int LA102_1 = input.LA(2);

                if ( (synpred12_InternalDim()) ) {
                    alt102=1;
                }
            }
            else if ( (LA102_0==61) ) {
                int LA102_2 = input.LA(2);

                if ( (synpred12_InternalDim()) ) {
                    alt102=1;
                }
            }
            switch (alt102) {
                case 1 :
                    // InternalDim.g:4877:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDim.g:4877:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalDim.g:4878:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalDim.g:4884:5: ( () ruleDmxOpCast )
                    // InternalDim.g:4885:6: () ruleDmxOpCast
                    {
                    // InternalDim.g:4885:6: ()
                    // InternalDim.g:4886:7: 
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

                    // InternalDim.g:4901:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDim.g:4902:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDim.g:4902:5: (otherlv_3= RULE_ID )
                    // InternalDim.g:4903:6: otherlv_3= RULE_ID
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
    // InternalDim.g:4919:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalDim.g:4919:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalDim.g:4920:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalDim.g:4926:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:4932:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDim.g:4933:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDim.g:4933:2: (kw= 'AS' | kw= 'as' )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==60) ) {
                alt103=1;
            }
            else if ( (LA103_0==61) ) {
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
                    // InternalDim.g:4934:3: kw= 'AS'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4940:3: kw= 'as'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4949:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalDim.g:4949:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalDim.g:4950:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalDim.g:4956:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalDim.g:4962:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalDim.g:4963:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalDim.g:4963:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt104=7;
            switch ( input.LA(1) ) {
            case RULE_NATURAL:
            case RULE_STRING:
            case 33:
            case 36:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt104=1;
                }
                break;
            case 41:
                {
                alt104=2;
                }
                break;
            case 21:
                {
                alt104=3;
                }
                break;
            case RULE_ID:
                {
                int LA104_4 = input.LA(2);

                if ( (LA104_4==41) ) {
                    alt104=4;
                }
                else if ( (LA104_4==EOF||(LA104_4>=RULE_ID && LA104_4<=RULE_RICH_TEXT_END)||(LA104_4>=22 && LA104_4<=23)||LA104_4==25||LA104_4==27||(LA104_4>=29 && LA104_4<=33)||LA104_4==36||LA104_4==38||LA104_4==42||LA104_4==44||LA104_4==49||(LA104_4>=54 && LA104_4<=56)||(LA104_4>=58 && LA104_4<=62)||(LA104_4>=68 && LA104_4<=71)||(LA104_4>=80 && LA104_4<=81)||(LA104_4>=83 && LA104_4<=84)||(LA104_4>=106 && LA104_4<=125)) ) {
                    alt104=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 4, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                alt104=5;
                }
                break;
            case 67:
                {
                alt104=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalDim.g:4964:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalDim.g:4973:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalDim.g:4982:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalDim.g:4991:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalDim.g:5000:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalDim.g:5009:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalDim.g:5018:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalDim.g:5030:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalDim.g:5030:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalDim.g:5031:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalDim.g:5037:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalDim.g:5043:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalDim.g:5044:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalDim.g:5044:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt105=7;
            alt105 = dfa105.predict(input);
            switch (alt105) {
                case 1 :
                    // InternalDim.g:5045:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalDim.g:5054:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalDim.g:5063:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalDim.g:5072:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalDim.g:5081:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalDim.g:5090:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalDim.g:5099:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalDim.g:5111:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalDim.g:5111:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalDim.g:5112:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalDim.g:5118:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDim.g:5124:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDim.g:5125:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDim.g:5125:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDim.g:5126:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_73);
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
    // InternalDim.g:5146:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalDim.g:5146:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalDim.g:5147:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalDim.g:5153:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5159:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDim.g:5160:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDim.g:5160:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalDim.g:5161:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDim.g:5161:3: ()
            // InternalDim.g:5162:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDim.g:5172:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( ((LA107_0>=RULE_ID && LA107_0<=RULE_RICH_TEXT_START)||(LA107_0>=RULE_NATURAL && LA107_0<=RULE_STRING)||LA107_0==21||LA107_0==33||LA107_0==36||LA107_0==41||LA107_0==63||LA107_0==67||(LA107_0>=72 && LA107_0<=77)||(LA107_0>=80 && LA107_0<=81)||(LA107_0>=126 && LA107_0<=128)) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalDim.g:5173:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalDim.g:5173:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDim.g:5174:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDim.g:5174:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDim.g:5175:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

                    // InternalDim.g:5192:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==30) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalDim.g:5193:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:5197:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDim.g:5198:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:5198:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDim.g:5199:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop106;
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
    // InternalDim.g:5226:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalDim.g:5226:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalDim.g:5227:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalDim.g:5233:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5239:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDim.g:5240:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDim.g:5240:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalDim.g:5241:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDim.g:5241:3: ()
            // InternalDim.g:5242:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDim.g:5252:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=RULE_NATURAL && LA109_0<=RULE_STRING)||LA109_0==33||LA109_0==36||(LA109_0>=72 && LA109_0<=77)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalDim.g:5253:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalDim.g:5253:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalDim.g:5254:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalDim.g:5254:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalDim.g:5255:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

                    // InternalDim.g:5272:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==30) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalDim.g:5273:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_86); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:5277:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalDim.g:5278:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalDim.g:5278:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalDim.g:5279:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop108;
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
    // InternalDim.g:5306:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalDim.g:5306:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalDim.g:5307:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalDim.g:5313:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5319:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalDim.g:5320:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalDim.g:5320:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalDim.g:5321:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalDim.g:5321:3: ()
            // InternalDim.g:5322:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5328:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:5329:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:5329:4: (otherlv_1= RULE_ID )
            // InternalDim.g:5330:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:5345:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalDim.g:5346:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalDim.g:5346:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalDim.g:5347:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_73);
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
    // InternalDim.g:5372:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalDim.g:5372:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalDim.g:5373:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalDim.g:5379:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5385:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalDim.g:5386:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalDim.g:5386:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalDim.g:5387:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalDim.g:5387:3: ()
            // InternalDim.g:5388:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5394:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=RULE_ID && LA111_0<=RULE_RICH_TEXT_START)||(LA111_0>=RULE_NATURAL && LA111_0<=RULE_STRING)||LA111_0==21||LA111_0==33||LA111_0==36||LA111_0==41||LA111_0==63||LA111_0==67||(LA111_0>=72 && LA111_0<=77)||(LA111_0>=80 && LA111_0<=81)||(LA111_0>=126 && LA111_0<=128)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalDim.g:5395:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalDim.g:5395:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalDim.g:5396:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalDim.g:5396:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalDim.g:5397:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_74);
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

                    // InternalDim.g:5414:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==30) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalDim.g:5415:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:5419:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalDim.g:5420:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:5420:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalDim.g:5421:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_74);
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
                    	    break loop110;
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
    // InternalDim.g:5444:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalDim.g:5444:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalDim.g:5445:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalDim.g:5451:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDim.g:5457:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDim.g:5458:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDim.g:5458:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDim.g:5459:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
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
    // InternalDim.g:5478:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalDim.g:5478:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalDim.g:5479:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalDim.g:5485:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDim.g:5491:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDim.g:5492:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDim.g:5492:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDim.g:5493:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
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
    // InternalDim.g:5513:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5519:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalDim.g:5520:2: ( ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalDim.g:5520:2: ( ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalDim.g:5521:3: ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalDim.g:5521:3: ( (otherlv_0= RULE_ID ) )
            // InternalDim.g:5522:4: (otherlv_0= RULE_ID )
            {
            // InternalDim.g:5522:4: (otherlv_0= RULE_ID )
            // InternalDim.g:5523:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxComplexObjectRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxComplexObjectAccess().getTypeDComplexTypeCrossReference_0_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getDmxFieldListStartSymbolParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_88);
            ruleDmxFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:5541:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==RULE_ID) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalDim.g:5542:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalDim.g:5542:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalDim.g:5543:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_88);
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
            	    break loop112;
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
    // InternalDim.g:5568:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalDim.g:5568:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalDim.g:5569:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalDim.g:5575:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )* ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_notes_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5581:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )* ) )
            // InternalDim.g:5582:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )* )
            {
            // InternalDim.g:5582:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )* )
            // InternalDim.g:5583:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )*
            {
            // InternalDim.g:5583:3: ( (otherlv_0= RULE_ID ) )
            // InternalDim.g:5584:4: (otherlv_0= RULE_ID )
            {
            // InternalDim.g:5584:4: (otherlv_0= RULE_ID )
            // InternalDim.g:5585:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalDim.g:5600:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalDim.g:5601:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalDim.g:5601:4: (lv_value_2_0= ruleDExpression )
            // InternalDim.g:5602:5: lv_value_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFieldAccess().getValueDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalDim.g:5619:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_PLAIN_TEXT_ONLY && LA113_0<=RULE_RICH_TEXT_START)) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalDim.g:5620:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDim.g:5620:4: (lv_description_3_0= ruleDRichText )
                    // InternalDim.g:5621:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxFieldAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDmxFieldRule());
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

            // InternalDim.g:5638:3: ( (lv_notes_4_0= ruleDNote ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==44) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalDim.g:5639:4: (lv_notes_4_0= ruleDNote )
            	    {
            	    // InternalDim.g:5639:4: (lv_notes_4_0= ruleDNote )
            	    // InternalDim.g:5640:5: lv_notes_4_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxFieldAccess().getNotesDNoteParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_notes_4_0=ruleDNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxFieldRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_4_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DNote");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
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
    // $ANTLR end "ruleDmxField"


    // $ANTLR start "entryRuleDmxStaticReference"
    // InternalDim.g:5661:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalDim.g:5661:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalDim.g:5662:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalDim.g:5668:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalDim.g:5674:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalDim.g:5675:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalDim.g:5675:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalDim.g:5676:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalDim.g:5676:3: ()
            // InternalDim.g:5677:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalDim.g:5687:3: ( ( ruleDQualifiedName ) )
            // InternalDim.g:5688:4: ( ruleDQualifiedName )
            {
            // InternalDim.g:5688:4: ( ruleDQualifiedName )
            // InternalDim.g:5689:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_90);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDim.g:5703:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==64) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalDim.g:5704:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalDim.g:5708:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDim.g:5709:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDim.g:5709:5: (otherlv_4= RULE_ID )
                    // InternalDim.g:5710:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_91); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:5722:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==57) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalDim.g:5723:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_92); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalDim.g:5727:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==RULE_ID) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==54) ) {
                        alt116=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // InternalDim.g:5728:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalDim.g:5728:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalDim.g:5729:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalDim.g:5729:6: (lv_displayName_6_0= RULE_ID )
                            // InternalDim.g:5730:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_93); if (state.failed) return current;
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
                            // InternalDim.g:5747:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalDim.g:5747:5: ( (lv_plural_7_0= '*' ) )
                            // InternalDim.g:5748:6: (lv_plural_7_0= '*' )
                            {
                            // InternalDim.g:5748:6: (lv_plural_7_0= '*' )
                            // InternalDim.g:5749:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,54,FOLLOW_93); if (state.failed) return current;
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

            // InternalDim.g:5763:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalDim.g:5764:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5774:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalDim.g:5774:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalDim.g:5775:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalDim.g:5781:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalDim.g:5787:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalDim.g:5788:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalDim.g:5788:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalDim.g:5789:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalDim.g:5789:3: ()
            // InternalDim.g:5790:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5796:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:5797:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:5797:4: (otherlv_1= RULE_ID )
            // InternalDim.g:5798:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDim.g:5809:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt118=3;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==56) ) {
                alt118=1;
            }
            else if ( (LA118_0==55) ) {
                int LA118_2 = input.LA(2);

                if ( (LA118_2==66) ) {
                    alt118=2;
                }
            }
            switch (alt118) {
                case 1 :
                    // InternalDim.g:5810:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalDim.g:5810:4: ( (lv_before_2_0= '@before' ) )
                    // InternalDim.g:5811:5: (lv_before_2_0= '@before' )
                    {
                    // InternalDim.g:5811:5: (lv_before_2_0= '@before' )
                    // InternalDim.g:5812:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:5825:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalDim.g:5825:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalDim.g:5826:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_95); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalDim.g:5830:5: ( (lv_all_4_0= 'all' ) )
                    // InternalDim.g:5831:6: (lv_all_4_0= 'all' )
                    {
                    // InternalDim.g:5831:6: (lv_all_4_0= 'all' )
                    // InternalDim.g:5832:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5850:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalDim.g:5850:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalDim.g:5851:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalDim.g:5857:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDim.g:5863:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDim.g:5864:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDim.g:5864:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDim.g:5865:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDim.g:5865:3: ()
            // InternalDim.g:5866:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDim.g:5876:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDim.g:5877:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDim.g:5877:4: (lv_if_2_0= ruleDExpression )
            // InternalDim.g:5878:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_96);
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

            otherlv_3=(Token)match(input,68,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDim.g:5899:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDim.g:5900:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDim.g:5900:4: (lv_then_4_0= ruleDExpression )
            // InternalDim.g:5901:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_97);
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

            // InternalDim.g:5918:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==69) && (synpred14_InternalDim())) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalDim.g:5919:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDim.g:5919:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDim.g:5920:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDim.g:5926:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDim.g:5927:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDim.g:5927:5: (lv_else_6_0= ruleDExpression )
                    // InternalDim.g:5928:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_98);
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

            otherlv_7=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5954:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDim.g:5954:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDim.g:5955:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDim.g:5961:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalDim.g:5967:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalDim.g:5968:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalDim.g:5968:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==54||LA120_0==80||LA120_0==129) ) {
                alt120=1;
            }
            else if ( (LA120_0==41) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalDim.g:5969:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalDim.g:5969:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalDim.g:5970:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalDim.g:5970:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalDim.g:5971:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalDim.g:5989:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalDim.g:5989:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalDim.g:5990:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_99); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalDim.g:5994:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalDim.g:5995:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalDim.g:5995:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalDim.g:5996:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_100); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,71,FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalDim.g:6016:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalDim.g:6017:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalDim.g:6017:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalDim.g:6018:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_73);
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
    // InternalDim.g:6044:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDim.g:6044:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDim.g:6045:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDim.g:6051:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:6057:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDim.g:6058:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDim.g:6058:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_NATURAL) ) {
                alt121=1;
            }
            else if ( (LA121_0==54) ) {
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
                    // InternalDim.g:6059:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDim.g:6067:3: kw= '*'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6076:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalDim.g:6076:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalDim.g:6077:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalDim.g:6083:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDim.g:6089:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDim.g:6090:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDim.g:6090:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDim.g:6091:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDim.g:6091:3: ()
            // InternalDim.g:6092:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:6098:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt122=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt122=1;
                }
                break;
            case 73:
                {
                alt122=2;
                }
                break;
            case 74:
                {
                alt122=3;
                }
                break;
            case 75:
                {
                alt122=4;
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
                    // InternalDim.g:6099:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDim.g:6099:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDim.g:6100:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDim.g:6100:5: (lv_value_1_0= 'TRUE' )
                    // InternalDim.g:6101:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:6114:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDim.g:6114:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDim.g:6115:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDim.g:6115:5: (lv_value_2_0= 'true' )
                    // InternalDim.g:6116:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:6129:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDim.g:6134:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6143:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalDim.g:6143:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalDim.g:6144:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalDim.g:6150:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDim.g:6156:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDim.g:6157:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDim.g:6157:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDim.g:6158:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDim.g:6158:3: ()
            // InternalDim.g:6159:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:6165:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDim.g:6166:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDim.g:6166:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDim.g:6167:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDim.g:6187:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalDim.g:6187:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalDim.g:6188:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalDim.g:6194:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDim.g:6200:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDim.g:6201:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDim.g:6201:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDim.g:6202:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDim.g:6202:3: ()
            // InternalDim.g:6203:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:6209:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDim.g:6210:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDim.g:6210:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDim.g:6211:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDim.g:6232:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalDim.g:6232:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalDim.g:6233:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalDim.g:6239:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDim.g:6245:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDim.g:6246:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDim.g:6246:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDim.g:6247:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDim.g:6247:3: ()
            // InternalDim.g:6248:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:6254:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDim.g:6255:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDim.g:6255:4: (lv_value_1_0= RULE_STRING )
            // InternalDim.g:6256:5: lv_value_1_0= RULE_STRING
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
    // InternalDim.g:6276:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalDim.g:6276:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalDim.g:6277:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalDim.g:6283:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDim.g:6289:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDim.g:6290:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDim.g:6290:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDim.g:6291:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDim.g:6291:3: ()
            // InternalDim.g:6292:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:6298:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==76) ) {
                alt123=1;
            }
            else if ( (LA123_0==77) ) {
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
                    // InternalDim.g:6299:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:6304:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6313:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDim.g:6313:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDim.g:6314:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDim.g:6320:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDim.g:6326:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDim.g:6327:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDim.g:6327:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDim.g:6328:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,55,FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDim.g:6347:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( ((LA126_0>=78 && LA126_0<=79)) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalDim.g:6348:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDim.g:6348:4: (kw= 'E' | kw= 'e' )
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==78) ) {
                        alt124=1;
                    }
                    else if ( (LA124_0==79) ) {
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
                            // InternalDim.g:6349:5: kw= 'E'
                            {
                            kw=(Token)match(input,78,FOLLOW_104); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDim.g:6355:5: kw= 'e'
                            {
                            kw=(Token)match(input,79,FOLLOW_104); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDim.g:6361:4: (kw= '+' | kw= '-' )?
                    int alt125=3;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==80) ) {
                        alt125=1;
                    }
                    else if ( (LA125_0==81) ) {
                        alt125=2;
                    }
                    switch (alt125) {
                        case 1 :
                            // InternalDim.g:6362:5: kw= '+'
                            {
                            kw=(Token)match(input,80,FOLLOW_99); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDim.g:6368:5: kw= '-'
                            {
                            kw=(Token)match(input,81,FOLLOW_99); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDmxFieldListStartSymbol"
    // InternalDim.g:6386:1: entryRuleDmxFieldListStartSymbol returns [String current=null] : iv_ruleDmxFieldListStartSymbol= ruleDmxFieldListStartSymbol EOF ;
    public final String entryRuleDmxFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxFieldListStartSymbol = null;


        try {
            // InternalDim.g:6386:63: (iv_ruleDmxFieldListStartSymbol= ruleDmxFieldListStartSymbol EOF )
            // InternalDim.g:6387:2: iv_ruleDmxFieldListStartSymbol= ruleDmxFieldListStartSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxFieldListStartSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxFieldListStartSymbol=ruleDmxFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxFieldListStartSymbol.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDmxFieldListStartSymbol"


    // $ANTLR start "ruleDmxFieldListStartSymbol"
    // InternalDim.g:6393:1: ruleDmxFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDmxFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:6399:2: (kw= '{' )
            // InternalDim.g:6400:2: kw= '{'
            {
            kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDmxFieldListStartSymbolAccess().getLeftCurlyBracketKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDmxFieldListStartSymbol"


    // $ANTLR start "entryRuleDQualifiedNameWithWildcard"
    // InternalDim.g:6408:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDim.g:6408:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDim.g:6409:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDim.g:6415:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDim.g:6421:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDim.g:6422:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDim.g:6422:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDim.g:6423:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_105);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:6433:3: (kw= '.*' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==82) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalDim.g:6434:4: kw= '.*'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6444:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDim.g:6444:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDim.g:6445:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDim.g:6451:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDim.g:6457:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDim.g:6458:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDim.g:6458:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDim.g:6459:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDim.g:6466:3: (kw= '.' this_ID_2= RULE_ID )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==55) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // InternalDim.g:6467:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleDQualifiedName"


    // $ANTLR start "ruleDEntityNatureAutonomous"
    // InternalDim.g:6484:1: ruleDEntityNatureAutonomous returns [Enumerator current=null] : (enumLiteral_0= 'autonomous' ) ;
    public final Enumerator ruleDEntityNatureAutonomous() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDim.g:6490:2: ( (enumLiteral_0= 'autonomous' ) )
            // InternalDim.g:6491:2: (enumLiteral_0= 'autonomous' )
            {
            // InternalDim.g:6491:2: (enumLiteral_0= 'autonomous' )
            // InternalDim.g:6492:3: enumLiteral_0= 'autonomous'
            {
            enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6501:1: ruleDEntityNatureRelationship returns [Enumerator current=null] : (enumLiteral_0= 'relationship' ) ;
    public final Enumerator ruleDEntityNatureRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDim.g:6507:2: ( (enumLiteral_0= 'relationship' ) )
            // InternalDim.g:6508:2: (enumLiteral_0= 'relationship' )
            {
            // InternalDim.g:6508:2: (enumLiteral_0= 'relationship' )
            // InternalDim.g:6509:3: enumLiteral_0= 'relationship'
            {
            enumLiteral_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6518:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:6524:2: ( ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) )
            // InternalDim.g:6525:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            {
            // InternalDim.g:6525:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==85) ) {
                alt129=1;
            }
            else if ( (LA129_0==39) ) {
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
                    // InternalDim.g:6526:3: (enumLiteral_0= 'references' )
                    {
                    // InternalDim.g:6526:3: (enumLiteral_0= 'references' )
                    // InternalDim.g:6527:4: enumLiteral_0= 'references'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6534:3: (enumLiteral_1= 'contains' )
                    {
                    // InternalDim.g:6534:3: (enumLiteral_1= 'contains' )
                    // InternalDim.g:6535:4: enumLiteral_1= 'contains'
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
    // InternalDim.g:6545:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDim.g:6551:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDim.g:6552:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDim.g:6552:2: (enumLiteral_0= 'inverse' )
            // InternalDim.g:6553:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleDNoteColor"
    // InternalDim.g:6562:1: ruleDNoteColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'yellow' ) | (enumLiteral_4= 'green' ) | (enumLiteral_5= 'blue' ) | (enumLiteral_6= 'pink' ) | (enumLiteral_7= 'grey' ) ) ;
    public final Enumerator ruleDNoteColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalDim.g:6568:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'yellow' ) | (enumLiteral_4= 'green' ) | (enumLiteral_5= 'blue' ) | (enumLiteral_6= 'pink' ) | (enumLiteral_7= 'grey' ) ) )
            // InternalDim.g:6569:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'yellow' ) | (enumLiteral_4= 'green' ) | (enumLiteral_5= 'blue' ) | (enumLiteral_6= 'pink' ) | (enumLiteral_7= 'grey' ) )
            {
            // InternalDim.g:6569:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'yellow' ) | (enumLiteral_4= 'green' ) | (enumLiteral_5= 'blue' ) | (enumLiteral_6= 'pink' ) | (enumLiteral_7= 'grey' ) )
            int alt130=8;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt130=1;
                }
                break;
            case 88:
                {
                alt130=2;
                }
                break;
            case 89:
                {
                alt130=3;
                }
                break;
            case 90:
                {
                alt130=4;
                }
                break;
            case 91:
                {
                alt130=5;
                }
                break;
            case 92:
                {
                alt130=6;
                }
                break;
            case 93:
                {
                alt130=7;
                }
                break;
            case 94:
                {
                alt130=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // InternalDim.g:6570:3: (enumLiteral_0= 'white' )
                    {
                    // InternalDim.g:6570:3: (enumLiteral_0= 'white' )
                    // InternalDim.g:6571:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDNoteColorAccess().getWHITEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6578:3: (enumLiteral_1= 'red' )
                    {
                    // InternalDim.g:6578:3: (enumLiteral_1= 'red' )
                    // InternalDim.g:6579:4: enumLiteral_1= 'red'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDNoteColorAccess().getREDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6586:3: (enumLiteral_2= 'orange' )
                    {
                    // InternalDim.g:6586:3: (enumLiteral_2= 'orange' )
                    // InternalDim.g:6587:4: enumLiteral_2= 'orange'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getORANGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDNoteColorAccess().getORANGEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6594:3: (enumLiteral_3= 'yellow' )
                    {
                    // InternalDim.g:6594:3: (enumLiteral_3= 'yellow' )
                    // InternalDim.g:6595:4: enumLiteral_3= 'yellow'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getYELLOWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDNoteColorAccess().getYELLOWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:6602:3: (enumLiteral_4= 'green' )
                    {
                    // InternalDim.g:6602:3: (enumLiteral_4= 'green' )
                    // InternalDim.g:6603:4: enumLiteral_4= 'green'
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getGREENEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDNoteColorAccess().getGREENEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDim.g:6610:3: (enumLiteral_5= 'blue' )
                    {
                    // InternalDim.g:6610:3: (enumLiteral_5= 'blue' )
                    // InternalDim.g:6611:4: enumLiteral_5= 'blue'
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getBLUEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDNoteColorAccess().getBLUEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDim.g:6618:3: (enumLiteral_6= 'pink' )
                    {
                    // InternalDim.g:6618:3: (enumLiteral_6= 'pink' )
                    // InternalDim.g:6619:4: enumLiteral_6= 'pink'
                    {
                    enumLiteral_6=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getPINKEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDNoteColorAccess().getPINKEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDim.g:6626:3: (enumLiteral_7= 'grey' )
                    {
                    // InternalDim.g:6626:3: (enumLiteral_7= 'grey' )
                    // InternalDim.g:6627:4: enumLiteral_7= 'grey'
                    {
                    enumLiteral_7=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getGREYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDNoteColorAccess().getGREYEnumLiteralDeclaration_7());
                      			
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
    // $ANTLR end "ruleDNoteColor"


    // $ANTLR start "ruleDmxBaseType"
    // InternalDim.g:6637:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalDim.g:6643:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalDim.g:6644:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalDim.g:6644:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt131=11;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt131=1;
                }
                break;
            case 96:
                {
                alt131=2;
                }
                break;
            case 97:
                {
                alt131=3;
                }
                break;
            case 98:
                {
                alt131=4;
                }
                break;
            case 99:
                {
                alt131=5;
                }
                break;
            case 100:
                {
                alt131=6;
                }
                break;
            case 101:
                {
                alt131=7;
                }
                break;
            case 102:
                {
                alt131=8;
                }
                break;
            case 103:
                {
                alt131=9;
                }
                break;
            case 104:
                {
                alt131=10;
                }
                break;
            case 105:
                {
                alt131=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // InternalDim.g:6645:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalDim.g:6645:3: (enumLiteral_0= 'VOID' )
                    // InternalDim.g:6646:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6653:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDim.g:6653:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDim.g:6654:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6661:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalDim.g:6661:3: (enumLiteral_2= 'NUMBER' )
                    // InternalDim.g:6662:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6669:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalDim.g:6669:3: (enumLiteral_3= 'TEXT' )
                    // InternalDim.g:6670:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:6677:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalDim.g:6677:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalDim.g:6678:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDim.g:6685:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalDim.g:6685:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalDim.g:6686:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDim.g:6693:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalDim.g:6693:3: (enumLiteral_6= 'STATE' )
                    // InternalDim.g:6694:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDim.g:6701:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalDim.g:6701:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalDim.g:6702:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDim.g:6709:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalDim.g:6709:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalDim.g:6710:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDim.g:6717:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalDim.g:6717:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalDim.g:6718:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDim.g:6725:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalDim.g:6725:3: (enumLiteral_10= 'SERVICE' )
                    // InternalDim.g:6726:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6736:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDim.g:6742:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDim.g:6743:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDim.g:6743:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt132=4;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt132=1;
                }
                break;
            case 107:
                {
                alt132=2;
                }
                break;
            case 108:
                {
                alt132=3;
                }
                break;
            case 109:
                {
                alt132=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalDim.g:6744:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDim.g:6744:3: (enumLiteral_0= 'OR' )
                    // InternalDim.g:6745:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6752:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDim.g:6752:3: (enumLiteral_1= 'or' )
                    // InternalDim.g:6753:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6760:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDim.g:6760:3: (enumLiteral_2= 'XOR' )
                    // InternalDim.g:6761:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6768:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDim.g:6768:3: (enumLiteral_3= 'xor' )
                    // InternalDim.g:6769:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6779:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:6785:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDim.g:6786:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDim.g:6786:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==110) ) {
                alt133=1;
            }
            else if ( (LA133_0==111) ) {
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
                    // InternalDim.g:6787:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDim.g:6787:3: (enumLiteral_0= 'AND' )
                    // InternalDim.g:6788:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6795:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDim.g:6795:3: (enumLiteral_1= 'and' )
                    // InternalDim.g:6796:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6806:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDim.g:6812:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDim.g:6813:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDim.g:6813:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt134=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt134=1;
                }
                break;
            case 112:
                {
                alt134=2;
                }
                break;
            case 113:
                {
                alt134=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // InternalDim.g:6814:3: (enumLiteral_0= '=' )
                    {
                    // InternalDim.g:6814:3: (enumLiteral_0= '=' )
                    // InternalDim.g:6815:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6822:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDim.g:6822:3: (enumLiteral_1= '!=' )
                    // InternalDim.g:6823:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6830:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDim.g:6830:3: (enumLiteral_2= '<>' )
                    // InternalDim.g:6831:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6841:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDim.g:6847:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDim.g:6848:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDim.g:6848:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt135=6;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt135=1;
                }
                break;
            case 115:
                {
                alt135=2;
                }
                break;
            case 116:
                {
                alt135=3;
                }
                break;
            case 117:
                {
                alt135=4;
                }
                break;
            case 118:
                {
                alt135=5;
                }
                break;
            case 119:
                {
                alt135=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // InternalDim.g:6849:3: (enumLiteral_0= '<' )
                    {
                    // InternalDim.g:6849:3: (enumLiteral_0= '<' )
                    // InternalDim.g:6850:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6857:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDim.g:6857:3: (enumLiteral_1= '<=' )
                    // InternalDim.g:6858:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6865:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDim.g:6865:3: (enumLiteral_2= '\\u2264' )
                    // InternalDim.g:6866:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6873:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDim.g:6873:3: (enumLiteral_3= '>=' )
                    // InternalDim.g:6874:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:6881:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDim.g:6881:3: (enumLiteral_4= '\\u2265' )
                    // InternalDim.g:6882:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDim.g:6889:3: (enumLiteral_5= '>' )
                    {
                    // InternalDim.g:6889:3: (enumLiteral_5= '>' )
                    // InternalDim.g:6890:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6900:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDim.g:6906:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalDim.g:6907:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalDim.g:6907:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt136=5;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt136=1;
                }
                break;
            case 49:
                {
                alt136=2;
                }
                break;
            case 71:
                {
                alt136=3;
                }
                break;
            case 121:
                {
                alt136=4;
                }
                break;
            case 122:
                {
                alt136=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // InternalDim.g:6908:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDim.g:6908:3: (enumLiteral_0= 'IN' )
                    // InternalDim.g:6909:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6916:3: (enumLiteral_1= 'in' )
                    {
                    // InternalDim.g:6916:3: (enumLiteral_1= 'in' )
                    // InternalDim.g:6917:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:6924:3: (enumLiteral_2= '..' )
                    {
                    // InternalDim.g:6924:3: (enumLiteral_2= '..' )
                    // InternalDim.g:6925:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:6932:3: (enumLiteral_3= '->' )
                    {
                    // InternalDim.g:6932:3: (enumLiteral_3= '->' )
                    // InternalDim.g:6933:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:6940:3: (enumLiteral_4= '=>' )
                    {
                    // InternalDim.g:6940:3: (enumLiteral_4= '=>' )
                    // InternalDim.g:6941:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6951:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:6957:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDim.g:6958:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDim.g:6958:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==80) ) {
                alt137=1;
            }
            else if ( (LA137_0==81) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // InternalDim.g:6959:3: (enumLiteral_0= '+' )
                    {
                    // InternalDim.g:6959:3: (enumLiteral_0= '+' )
                    // InternalDim.g:6960:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6967:3: (enumLiteral_1= '-' )
                    {
                    // InternalDim.g:6967:3: (enumLiteral_1= '-' )
                    // InternalDim.g:6968:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:6978:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDim.g:6984:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDim.g:6985:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDim.g:6985:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt138=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt138=1;
                }
                break;
            case 123:
                {
                alt138=2;
                }
                break;
            case 124:
                {
                alt138=3;
                }
                break;
            case 125:
                {
                alt138=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // InternalDim.g:6986:3: (enumLiteral_0= '*' )
                    {
                    // InternalDim.g:6986:3: (enumLiteral_0= '*' )
                    // InternalDim.g:6987:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:6994:3: (enumLiteral_1= '/' )
                    {
                    // InternalDim.g:6994:3: (enumLiteral_1= '/' )
                    // InternalDim.g:6995:4: enumLiteral_1= '/'
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
                    // InternalDim.g:7002:3: (enumLiteral_2= '**' )
                    {
                    // InternalDim.g:7002:3: (enumLiteral_2= '**' )
                    // InternalDim.g:7003:4: enumLiteral_2= '**'
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
                    // InternalDim.g:7010:3: (enumLiteral_3= '%' )
                    {
                    // InternalDim.g:7010:3: (enumLiteral_3= '%' )
                    // InternalDim.g:7011:4: enumLiteral_3= '%'
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
    // InternalDim.g:7021:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDim.g:7027:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDim.g:7028:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDim.g:7028:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt139=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt139=1;
                }
                break;
            case 81:
                {
                alt139=2;
                }
                break;
            case 126:
                {
                alt139=3;
                }
                break;
            case 127:
                {
                alt139=4;
                }
                break;
            case 128:
                {
                alt139=5;
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
                    // InternalDim.g:7029:3: (enumLiteral_0= '+' )
                    {
                    // InternalDim.g:7029:3: (enumLiteral_0= '+' )
                    // InternalDim.g:7030:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:7037:3: (enumLiteral_1= '-' )
                    {
                    // InternalDim.g:7037:3: (enumLiteral_1= '-' )
                    // InternalDim.g:7038:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:7045:3: (enumLiteral_2= '!' )
                    {
                    // InternalDim.g:7045:3: (enumLiteral_2= '!' )
                    // InternalDim.g:7046:4: enumLiteral_2= '!'
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
                    // InternalDim.g:7053:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDim.g:7053:3: (enumLiteral_3= 'NOT' )
                    // InternalDim.g:7054:4: enumLiteral_3= 'NOT'
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
                    // InternalDim.g:7061:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDim.g:7061:3: (enumLiteral_4= 'not' )
                    // InternalDim.g:7062:4: enumLiteral_4= 'not'
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
    // InternalDim.g:7072:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDim.g:7078:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalDim.g:7079:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalDim.g:7079:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt140=3;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt140=1;
                }
                break;
            case 80:
                {
                alt140=2;
                }
                break;
            case 54:
                {
                alt140=3;
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
                    // InternalDim.g:7080:3: (enumLiteral_0= '?' )
                    {
                    // InternalDim.g:7080:3: (enumLiteral_0= '?' )
                    // InternalDim.g:7081:4: enumLiteral_0= '?'
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
                    // InternalDim.g:7088:3: (enumLiteral_1= '+' )
                    {
                    // InternalDim.g:7088:3: (enumLiteral_1= '+' )
                    // InternalDim.g:7089:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:7096:3: (enumLiteral_2= '*' )
                    {
                    // InternalDim.g:7096:3: (enumLiteral_2= '*' )
                    // InternalDim.g:7097:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
        // InternalDim.g:3649:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalDim.g:3649:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalDim.g:3649:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalDim.g:3650:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalDim.g:3650:7: ()
        // InternalDim.g:3651:7: 
        {
        }

        match(input,55,FOLLOW_3); if (state.failed) return ;
        // InternalDim.g:3653:7: ( ( RULE_ID ) )
        // InternalDim.g:3654:8: ( RULE_ID )
        {
        // InternalDim.g:3654:8: ( RULE_ID )
        // InternalDim.g:3655:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_69); if (state.failed) return ;

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
        // InternalDim.g:3718:6: ( ( () '.' ) )
        // InternalDim.g:3718:7: ( () '.' )
        {
        // InternalDim.g:3718:7: ( () '.' )
        // InternalDim.g:3719:7: () '.'
        {
        // InternalDim.g:3719:7: ()
        // InternalDim.g:3720:7: 
        {
        }

        match(input,55,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDim

    // $ANTLR start synpred3_InternalDim
    public final void synpred3_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3754:8: ( ( '(' ) )
        // InternalDim.g:3754:9: ( '(' )
        {
        // InternalDim.g:3754:9: ( '(' )
        // InternalDim.g:3755:9: '('
        {
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDim

    // $ANTLR start synpred4_InternalDim
    public final void synpred4_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4115:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalDim.g:4115:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalDim.g:4115:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalDim.g:4116:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalDim.g:4116:6: ()
        // InternalDim.g:4117:6: 
        {
        }

        // InternalDim.g:4118:6: ( ( ruleDmxOpOr ) )
        // InternalDim.g:4119:7: ( ruleDmxOpOr )
        {
        // InternalDim.g:4119:7: ( ruleDmxOpOr )
        // InternalDim.g:4120:8: ruleDmxOpOr
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
        // InternalDim.g:4203:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalDim.g:4203:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalDim.g:4203:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalDim.g:4204:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalDim.g:4204:6: ()
        // InternalDim.g:4205:6: 
        {
        }

        // InternalDim.g:4206:6: ( ( ruleDmxOpAnd ) )
        // InternalDim.g:4207:7: ( ruleDmxOpAnd )
        {
        // InternalDim.g:4207:7: ( ruleDmxOpAnd )
        // InternalDim.g:4208:8: ruleDmxOpAnd
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
        // InternalDim.g:4291:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalDim.g:4291:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalDim.g:4291:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalDim.g:4292:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalDim.g:4292:6: ()
        // InternalDim.g:4293:6: 
        {
        }

        // InternalDim.g:4294:6: ( ( ruleDmxOpEquality ) )
        // InternalDim.g:4295:7: ( ruleDmxOpEquality )
        {
        // InternalDim.g:4295:7: ( ruleDmxOpEquality )
        // InternalDim.g:4296:8: ruleDmxOpEquality
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
        // InternalDim.g:4380:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalDim.g:4380:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalDim.g:4380:7: ( () ruleDmxOpInstanceOf )
        // InternalDim.g:4381:7: () ruleDmxOpInstanceOf
        {
        // InternalDim.g:4381:7: ()
        // InternalDim.g:4382:7: 
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
        // InternalDim.g:4420:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDim.g:4420:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDim.g:4420:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDim.g:4421:7: () ( ( ruleOpCompare ) )
        {
        // InternalDim.g:4421:7: ()
        // InternalDim.g:4422:7: 
        {
        }

        // InternalDim.g:4423:7: ( ( ruleOpCompare ) )
        // InternalDim.g:4424:8: ( ruleOpCompare )
        {
        // InternalDim.g:4424:8: ( ruleOpCompare )
        // InternalDim.g:4425:9: ruleOpCompare
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
        // InternalDim.g:4539:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDim.g:4539:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDim.g:4539:6: ( () ( ( ruleOpOther ) ) )
        // InternalDim.g:4540:6: () ( ( ruleOpOther ) )
        {
        // InternalDim.g:4540:6: ()
        // InternalDim.g:4541:6: 
        {
        }

        // InternalDim.g:4542:6: ( ( ruleOpOther ) )
        // InternalDim.g:4543:7: ( ruleOpOther )
        {
        // InternalDim.g:4543:7: ( ruleOpOther )
        // InternalDim.g:4544:8: ruleOpOther
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
        // InternalDim.g:4627:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDim.g:4627:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDim.g:4627:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDim.g:4628:6: () ( ( ruleOpAdd ) )
        {
        // InternalDim.g:4628:6: ()
        // InternalDim.g:4629:6: 
        {
        }

        // InternalDim.g:4630:6: ( ( ruleOpAdd ) )
        // InternalDim.g:4631:7: ( ruleOpAdd )
        {
        // InternalDim.g:4631:7: ( ruleOpAdd )
        // InternalDim.g:4632:8: ruleOpAdd
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
        // InternalDim.g:4715:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDim.g:4715:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDim.g:4715:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDim.g:4716:6: () ( ( ruleOpMulti ) )
        {
        // InternalDim.g:4716:6: ()
        // InternalDim.g:4717:6: 
        {
        }

        // InternalDim.g:4718:6: ( ( ruleOpMulti ) )
        // InternalDim.g:4719:7: ( ruleOpMulti )
        {
        // InternalDim.g:4719:7: ( ruleOpMulti )
        // InternalDim.g:4720:8: ruleOpMulti
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
        // InternalDim.g:4878:5: ( ( () ruleDmxOpCast ) )
        // InternalDim.g:4878:6: ( () ruleDmxOpCast )
        {
        // InternalDim.g:4878:6: ( () ruleDmxOpCast )
        // InternalDim.g:4879:6: () ruleDmxOpCast
        {
        // InternalDim.g:4879:6: ()
        // InternalDim.g:4880:6: 
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
        // InternalDim.g:5764:4: ( ']' )
        // InternalDim.g:5764:5: ']'
        {
        match(input,65,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalDim

    // $ANTLR start synpred14_InternalDim
    public final void synpred14_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:5920:5: ( 'else' )
        // InternalDim.g:5920:6: 'else'
        {
        match(input,69,FOLLOW_2); if (state.failed) return ;

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


    protected DFA96 dfa96 = new DFA96(this);
    protected DFA105 dfa105 = new DFA105(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\175\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\5\1\6\1\3\1\1\1\0\1\7\1\4\1\2\2\uffff}>";
    static final String[] dfa_7s = {
            "\5\1\15\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\5\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\4\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\3\1\5\uffff\4\1\10\uffff\2\1\1\uffff\2\1\25\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 4377:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_6 = input.LA(1);

                         
                        int index96_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index96_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA96_5 = input.LA(1);

                         
                        int index96_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index96_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA96_9 = input.LA(1);

                         
                        int index96_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index96_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA96_4 = input.LA(1);

                         
                        int index96_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index96_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA96_8 = input.LA(1);

                         
                        int index96_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index96_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA96_2 = input.LA(1);

                         
                        int index96_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index96_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA96_3 = input.LA(1);

                         
                        int index96_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index96_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA96_7 = input.LA(1);

                         
                        int index96_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index96_7);
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
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\3\uffff\1\10\6\uffff";
    static final String dfa_10s = "\1\11\2\uffff\1\4\3\uffff\1\4\2\uffff";
    static final String dfa_11s = "\1\115\2\uffff\1\175\3\uffff\1\11\2\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\3\1\4";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\2\26\uffff\1\5\2\uffff\1\6\43\uffff\4\1\2\4",
            "",
            "",
            "\5\10\14\uffff\3\10\1\uffff\1\10\1\uffff\1\10\1\uffff\5\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\1\uffff\1\10\4\uffff\1\10\4\uffff\1\10\1\7\2\uffff\5\10\5\uffff\4\10\10\uffff\2\10\1\uffff\2\10\25\uffff\24\10",
            "",
            "",
            "",
            "\1\10\4\uffff\1\11",
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

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "5044:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000300060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000200060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000013A9400000L,0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000013A8C00000L,0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000013A8400000L,0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x8000021200200670L,0xC000000000033F08L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000062L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000200062L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002400010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000042400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000100062L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000380000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000005402400010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000005802400010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000005002400010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000102000100062L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000102000000062L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000100000L,0x0000000000600000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040120000000072L,0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040120000000062L,0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040130000000072L,0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040130000000062L,0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000110000000062L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00401A0000000072L,0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00401A0000000062L,0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000180000000062L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000400000L,0x000000007F800000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800000200000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0041020000000002L,0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000001200200600L,0x0000000000003F00L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x000003FF80000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000010L,0x000003FF80000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000021200200610L,0xC000000000033F08L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0180020000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x8000061200200610L,0xC000000000033F08L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x00003C0000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000C00000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x4000000000000002L,0x0003000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0C00000000000002L,0x00FC000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0002000000000002L,0x0700000000000080L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0040000000000002L,0x3800000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x8000021200600670L,0xC000000000033F08L,0x0000000000000001L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000001200400600L,0x0000000000003F00L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000001200000600L,0x0000000000003F00L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x8000061200200670L,0xC000000000033F08L,0x0000000000000001L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0040000000000200L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000200L,0x0000000000030000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});

}