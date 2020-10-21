package com.mimacom.ddd.dm.div.parser.antlr.internal;

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
import com.mimacom.ddd.dm.div.services.DivGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDivParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'information'", "'view'", "'{'", "'}'", "'as'", "'grab'", "'aggregate'", "'primitive'", "'ditch'", "'add'", "'enumeration'", "','", "'root'", "'entity'", "'detail'", "'reference'", "'composite'", "'attribute'", "'query'", "'('", "'*'", "')'", "'component'", "'constraint'", "'alias'", "':'", "'redefines'", "'abstract'", "'main'", "'states'", "'events'", "'extends'", "'derived'", "'contains'", "'key'", "'returns'", "'import'", "'test'", "'context'", "':='", "'in'", "'archetype'", "'is'", "'filter'", "'with'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'autonomous'", "'relationship'", "'references'", "'inverse'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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


        public InternalDivParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDivParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDivParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDiv.g"; }



     	private DivGrammarAccess grammarAccess;

        public InternalDivParser(TokenStream input, DivGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DNamespace";
       	}

       	@Override
       	protected DivGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDNamespace"
    // InternalDiv.g:65:1: entryRuleDNamespace returns [EObject current=null] : iv_ruleDNamespace= ruleDNamespace EOF ;
    public final EObject entryRuleDNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNamespace = null;


        try {
            // InternalDiv.g:65:51: (iv_ruleDNamespace= ruleDNamespace EOF )
            // InternalDiv.g:66:2: iv_ruleDNamespace= ruleDNamespace EOF
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
    // InternalDiv.g:72:1: ruleDNamespace returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationView ) ) ) ;
    public final EObject ruleDNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_model_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:78:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationView ) ) ) )
            // InternalDiv.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationView ) ) )
            {
            // InternalDiv.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationView ) ) )
            // InternalDiv.g:80:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_model_3_0= ruleDomainInformationView ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDNamespaceAccess().getDomainKeyword_0());
              		
            }
            // InternalDiv.g:84:3: ( (lv_name_1_0= ruleDQualifiedName ) )
            // InternalDiv.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            {
            // InternalDiv.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            // InternalDiv.g:86:5: lv_name_1_0= ruleDQualifiedName
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

            // InternalDiv.g:103:3: ( (lv_imports_2_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==54) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDiv.g:104:4: (lv_imports_2_0= ruleDImport )
            	    {
            	    // InternalDiv.g:104:4: (lv_imports_2_0= ruleDImport )
            	    // InternalDiv.g:105:5: lv_imports_2_0= ruleDImport
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

            // InternalDiv.g:122:3: ( (lv_model_3_0= ruleDomainInformationView ) )
            // InternalDiv.g:123:4: (lv_model_3_0= ruleDomainInformationView )
            {
            // InternalDiv.g:123:4: (lv_model_3_0= ruleDomainInformationView )
            // InternalDiv.g:124:5: lv_model_3_0= ruleDomainInformationView
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNamespaceAccess().getModelDomainInformationViewParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_model_3_0=ruleDomainInformationView();

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
              						"com.mimacom.ddd.dm.div.Div.DomainInformationView");
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


    // $ANTLR start "entryRuleDomainInformationView"
    // InternalDiv.g:145:1: entryRuleDomainInformationView returns [EObject current=null] : iv_ruleDomainInformationView= ruleDomainInformationView EOF ;
    public final EObject entryRuleDomainInformationView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainInformationView = null;


        try {
            // InternalDiv.g:145:62: (iv_ruleDomainInformationView= ruleDomainInformationView EOF )
            // InternalDiv.g:146:2: iv_ruleDomainInformationView= ruleDomainInformationView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainInformationViewRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainInformationView=ruleDomainInformationView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainInformationView; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainInformationView"


    // $ANTLR start "ruleDomainInformationView"
    // InternalDiv.g:152:1: ruleDomainInformationView returns [EObject current=null] : (otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_types_5_0= ruleDivType ) ) | ( (lv_aggregates_6_0= ruleDivAggregate ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDomainInformationView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_description_3_0 = null;

        EObject lv_types_5_0 = null;

        EObject lv_aggregates_6_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:158:2: ( (otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_types_5_0= ruleDivType ) ) | ( (lv_aggregates_6_0= ruleDivAggregate ) ) )* otherlv_7= '}' ) )
            // InternalDiv.g:159:2: (otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_types_5_0= ruleDivType ) ) | ( (lv_aggregates_6_0= ruleDivAggregate ) ) )* otherlv_7= '}' )
            {
            // InternalDiv.g:159:2: (otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_types_5_0= ruleDivType ) ) | ( (lv_aggregates_6_0= ruleDivAggregate ) ) )* otherlv_7= '}' )
            // InternalDiv.g:160:3: otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_types_5_0= ruleDivType ) ) | ( (lv_aggregates_6_0= ruleDivAggregate ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDomainInformationViewAccess().getInformationKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDomainInformationViewAccess().getViewKeyword_1());
              		
            }
            // InternalDiv.g:168:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:169:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:169:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:170:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDomainInformationViewAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDomainInformationViewRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDiv.g:186:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_PLAIN_TEXT_ONLY && LA2_0<=RULE_RICH_TEXT_START)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDiv.g:187:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDiv.g:187:4: (lv_description_3_0= ruleDRichText )
                    // InternalDiv.g:188:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDomainInformationViewAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDomainInformationViewRule());
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

            otherlv_4=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDomainInformationViewAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDiv.g:209:3: ( ( (lv_types_5_0= ruleDivType ) ) | ( (lv_aggregates_6_0= ruleDivAggregate ) ) )*
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==25||LA3_2==28||(LA3_2>=30 && LA3_2<=32)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==24) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 26:
                    {
                    alt3=1;
                    }
                    break;
                case 40:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalDiv.g:210:4: ( (lv_types_5_0= ruleDivType ) )
            	    {
            	    // InternalDiv.g:210:4: ( (lv_types_5_0= ruleDivType ) )
            	    // InternalDiv.g:211:5: (lv_types_5_0= ruleDivType )
            	    {
            	    // InternalDiv.g:211:5: (lv_types_5_0= ruleDivType )
            	    // InternalDiv.g:212:6: lv_types_5_0= ruleDivType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDomainInformationViewAccess().getTypesDivTypeParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_types_5_0=ruleDivType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDomainInformationViewRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_5_0,
            	      							"com.mimacom.ddd.dm.div.Div.DivType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDiv.g:230:4: ( (lv_aggregates_6_0= ruleDivAggregate ) )
            	    {
            	    // InternalDiv.g:230:4: ( (lv_aggregates_6_0= ruleDivAggregate ) )
            	    // InternalDiv.g:231:5: (lv_aggregates_6_0= ruleDivAggregate )
            	    {
            	    // InternalDiv.g:231:5: (lv_aggregates_6_0= ruleDivAggregate )
            	    // InternalDiv.g:232:6: lv_aggregates_6_0= ruleDivAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDomainInformationViewAccess().getAggregatesDivAggregateParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_aggregates_6_0=ruleDivAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDomainInformationViewRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_6_0,
            	      							"com.mimacom.ddd.dm.div.Div.DivAggregate");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDomainInformationViewAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainInformationView"


    // $ANTLR start "entryRuleDivGrabAggregateRule"
    // InternalDiv.g:258:1: entryRuleDivGrabAggregateRule returns [EObject current=null] : iv_ruleDivGrabAggregateRule= ruleDivGrabAggregateRule EOF ;
    public final EObject entryRuleDivGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabAggregateRule = null;


        try {
            // InternalDiv.g:258:61: (iv_ruleDivGrabAggregateRule= ruleDivGrabAggregateRule EOF )
            // InternalDiv.g:259:2: iv_ruleDivGrabAggregateRule= ruleDivGrabAggregateRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivGrabAggregateRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivGrabAggregateRule=ruleDivGrabAggregateRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivGrabAggregateRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivGrabAggregateRule"


    // $ANTLR start "ruleDivGrabAggregateRule"
    // InternalDiv.g:265:1: ruleDivGrabAggregateRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:271:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:272:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:272:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:273:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:273:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:274:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:274:4: ( ruleDQualifiedName )
            // InternalDiv.g:275:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabAggregateRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivGrabAggregateRuleAccess().getSourceDimAggregateCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDiv.g:289:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDiv.g:290:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabAggregateRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:294:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:295:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:295:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:296:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getDivGrabAggregateRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabAggregateRuleRule());
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
    // $ANTLR end "ruleDivGrabAggregateRule"


    // $ANTLR start "entryRuleDivGrabPrimitiveRule"
    // InternalDiv.g:317:1: entryRuleDivGrabPrimitiveRule returns [EObject current=null] : iv_ruleDivGrabPrimitiveRule= ruleDivGrabPrimitiveRule EOF ;
    public final EObject entryRuleDivGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabPrimitiveRule = null;


        try {
            // InternalDiv.g:317:61: (iv_ruleDivGrabPrimitiveRule= ruleDivGrabPrimitiveRule EOF )
            // InternalDiv.g:318:2: iv_ruleDivGrabPrimitiveRule= ruleDivGrabPrimitiveRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivGrabPrimitiveRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivGrabPrimitiveRule=ruleDivGrabPrimitiveRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivGrabPrimitiveRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivGrabPrimitiveRule"


    // $ANTLR start "ruleDivGrabPrimitiveRule"
    // InternalDiv.g:324:1: ruleDivGrabPrimitiveRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:330:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:331:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:331:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:332:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:332:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:333:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:333:4: ( ruleDQualifiedName )
            // InternalDiv.g:334:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabPrimitiveRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivGrabPrimitiveRuleAccess().getSourceDimPrimitiveCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDiv.g:348:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDiv.g:349:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabPrimitiveRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:353:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:354:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:354:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:355:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getDivGrabPrimitiveRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabPrimitiveRuleRule());
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
    // $ANTLR end "ruleDivGrabPrimitiveRule"


    // $ANTLR start "entryRuleDivDitchPrimitiveRule"
    // InternalDiv.g:376:1: entryRuleDivDitchPrimitiveRule returns [EObject current=null] : iv_ruleDivDitchPrimitiveRule= ruleDivDitchPrimitiveRule EOF ;
    public final EObject entryRuleDivDitchPrimitiveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchPrimitiveRule = null;


        try {
            // InternalDiv.g:376:62: (iv_ruleDivDitchPrimitiveRule= ruleDivDitchPrimitiveRule EOF )
            // InternalDiv.g:377:2: iv_ruleDivDitchPrimitiveRule= ruleDivDitchPrimitiveRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivDitchPrimitiveRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivDitchPrimitiveRule=ruleDivDitchPrimitiveRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivDitchPrimitiveRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivDitchPrimitiveRule"


    // $ANTLR start "ruleDivDitchPrimitiveRule"
    // InternalDiv.g:383:1: ruleDivDitchPrimitiveRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleDivDitchPrimitiveRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDiv.g:389:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalDiv.g:390:2: ( ( ruleDQualifiedName ) )
            {
            // InternalDiv.g:390:2: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:391:3: ( ruleDQualifiedName )
            {
            // InternalDiv.g:391:3: ( ruleDQualifiedName )
            // InternalDiv.g:392:4: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDivDitchPrimitiveRuleRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDivDitchPrimitiveRuleAccess().getSourceDimPrimitiveCrossReference_0());
              			
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
    // $ANTLR end "ruleDivDitchPrimitiveRule"


    // $ANTLR start "entryRuleDivGrabEnumerationRule"
    // InternalDiv.g:409:1: entryRuleDivGrabEnumerationRule returns [EObject current=null] : iv_ruleDivGrabEnumerationRule= ruleDivGrabEnumerationRule EOF ;
    public final EObject entryRuleDivGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabEnumerationRule = null;


        try {
            // InternalDiv.g:409:63: (iv_ruleDivGrabEnumerationRule= ruleDivGrabEnumerationRule EOF )
            // InternalDiv.g:410:2: iv_ruleDivGrabEnumerationRule= ruleDivGrabEnumerationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivGrabEnumerationRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivGrabEnumerationRule=ruleDivGrabEnumerationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivGrabEnumerationRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivGrabEnumerationRule"


    // $ANTLR start "ruleDivGrabEnumerationRule"
    // InternalDiv.g:416:1: ruleDivGrabEnumerationRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:422:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:423:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:423:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:424:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:424:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:425:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:425:4: ( ruleDQualifiedName )
            // InternalDiv.g:426:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabEnumerationRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivGrabEnumerationRuleAccess().getSourceDimEnumerationCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDiv.g:440:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDiv.g:441:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabEnumerationRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:445:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:446:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:446:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:447:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getDivGrabEnumerationRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabEnumerationRuleRule());
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
    // $ANTLR end "ruleDivGrabEnumerationRule"


    // $ANTLR start "entryRuleDivDitchEnumerationRule"
    // InternalDiv.g:468:1: entryRuleDivDitchEnumerationRule returns [EObject current=null] : iv_ruleDivDitchEnumerationRule= ruleDivDitchEnumerationRule EOF ;
    public final EObject entryRuleDivDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchEnumerationRule = null;


        try {
            // InternalDiv.g:468:64: (iv_ruleDivDitchEnumerationRule= ruleDivDitchEnumerationRule EOF )
            // InternalDiv.g:469:2: iv_ruleDivDitchEnumerationRule= ruleDivDitchEnumerationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivDitchEnumerationRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivDitchEnumerationRule=ruleDivDitchEnumerationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivDitchEnumerationRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivDitchEnumerationRule"


    // $ANTLR start "ruleDivDitchEnumerationRule"
    // InternalDiv.g:475:1: ruleDivDitchEnumerationRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleDivDitchEnumerationRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDiv.g:481:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalDiv.g:482:2: ( ( ruleDQualifiedName ) )
            {
            // InternalDiv.g:482:2: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:483:3: ( ruleDQualifiedName )
            {
            // InternalDiv.g:483:3: ( ruleDQualifiedName )
            // InternalDiv.g:484:4: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDivDitchEnumerationRuleRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDivDitchEnumerationRuleAccess().getSourceDimEnumerationCrossReference_0());
              			
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
    // $ANTLR end "ruleDivDitchEnumerationRule"


    // $ANTLR start "entryRuleDivGrabEnumerationLiteralRule"
    // InternalDiv.g:501:1: entryRuleDivGrabEnumerationLiteralRule returns [EObject current=null] : iv_ruleDivGrabEnumerationLiteralRule= ruleDivGrabEnumerationLiteralRule EOF ;
    public final EObject entryRuleDivGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabEnumerationLiteralRule = null;


        try {
            // InternalDiv.g:501:70: (iv_ruleDivGrabEnumerationLiteralRule= ruleDivGrabEnumerationLiteralRule EOF )
            // InternalDiv.g:502:2: iv_ruleDivGrabEnumerationLiteralRule= ruleDivGrabEnumerationLiteralRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivGrabEnumerationLiteralRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivGrabEnumerationLiteralRule=ruleDivGrabEnumerationLiteralRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivGrabEnumerationLiteralRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivGrabEnumerationLiteralRule"


    // $ANTLR start "ruleDivGrabEnumerationLiteralRule"
    // InternalDiv.g:508:1: ruleDivGrabEnumerationLiteralRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:514:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:515:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:515:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:516:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:516:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:517:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:517:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:518:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabEnumerationLiteralRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDivGrabEnumerationLiteralRuleAccess().getSourceDimLiteralCrossReference_0_0());
              				
            }

            }


            }

            // InternalDiv.g:529:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDiv.g:530:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:534:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:535:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:535:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:536:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getDivGrabEnumerationLiteralRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabEnumerationLiteralRuleRule());
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
    // $ANTLR end "ruleDivGrabEnumerationLiteralRule"


    // $ANTLR start "entryRuleDivDitchEnumerationLiteralRule"
    // InternalDiv.g:557:1: entryRuleDivDitchEnumerationLiteralRule returns [EObject current=null] : iv_ruleDivDitchEnumerationLiteralRule= ruleDivDitchEnumerationLiteralRule EOF ;
    public final EObject entryRuleDivDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchEnumerationLiteralRule = null;


        try {
            // InternalDiv.g:557:71: (iv_ruleDivDitchEnumerationLiteralRule= ruleDivDitchEnumerationLiteralRule EOF )
            // InternalDiv.g:558:2: iv_ruleDivDitchEnumerationLiteralRule= ruleDivDitchEnumerationLiteralRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivDitchEnumerationLiteralRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivDitchEnumerationLiteralRule=ruleDivDitchEnumerationLiteralRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivDitchEnumerationLiteralRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivDitchEnumerationLiteralRule"


    // $ANTLR start "ruleDivDitchEnumerationLiteralRule"
    // InternalDiv.g:564:1: ruleDivDitchEnumerationLiteralRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDivDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDiv.g:570:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDiv.g:571:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDiv.g:571:2: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:572:3: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:572:3: (otherlv_0= RULE_ID )
            // InternalDiv.g:573:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDivDitchEnumerationLiteralRuleRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getDivDitchEnumerationLiteralRuleAccess().getSourceDimLiteralCrossReference_0());
              			
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
    // $ANTLR end "ruleDivDitchEnumerationLiteralRule"


    // $ANTLR start "entryRuleDivGrabComplexTypeRule"
    // InternalDiv.g:587:1: entryRuleDivGrabComplexTypeRule returns [EObject current=null] : iv_ruleDivGrabComplexTypeRule= ruleDivGrabComplexTypeRule EOF ;
    public final EObject entryRuleDivGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabComplexTypeRule = null;


        try {
            // InternalDiv.g:587:63: (iv_ruleDivGrabComplexTypeRule= ruleDivGrabComplexTypeRule EOF )
            // InternalDiv.g:588:2: iv_ruleDivGrabComplexTypeRule= ruleDivGrabComplexTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivGrabComplexTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivGrabComplexTypeRule=ruleDivGrabComplexTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivGrabComplexTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivGrabComplexTypeRule"


    // $ANTLR start "ruleDivGrabComplexTypeRule"
    // InternalDiv.g:594:1: ruleDivGrabComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:600:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:601:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:601:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:602:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:602:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:603:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:603:4: ( ruleDQualifiedName )
            // InternalDiv.g:604:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivGrabComplexTypeRuleAccess().getSourceDimComplexTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDiv.g:618:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDiv.g:619:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabComplexTypeRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:623:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:624:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:624:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:625:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getDivGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabComplexTypeRuleRule());
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
    // $ANTLR end "ruleDivGrabComplexTypeRule"


    // $ANTLR start "entryRuleDivDitchComplexTypeRule"
    // InternalDiv.g:646:1: entryRuleDivDitchComplexTypeRule returns [EObject current=null] : iv_ruleDivDitchComplexTypeRule= ruleDivDitchComplexTypeRule EOF ;
    public final EObject entryRuleDivDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchComplexTypeRule = null;


        try {
            // InternalDiv.g:646:64: (iv_ruleDivDitchComplexTypeRule= ruleDivDitchComplexTypeRule EOF )
            // InternalDiv.g:647:2: iv_ruleDivDitchComplexTypeRule= ruleDivDitchComplexTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivDitchComplexTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivDitchComplexTypeRule=ruleDivDitchComplexTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivDitchComplexTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivDitchComplexTypeRule"


    // $ANTLR start "ruleDivDitchComplexTypeRule"
    // InternalDiv.g:653:1: ruleDivDitchComplexTypeRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleDivDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDiv.g:659:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalDiv.g:660:2: ( ( ruleDQualifiedName ) )
            {
            // InternalDiv.g:660:2: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:661:3: ( ruleDQualifiedName )
            {
            // InternalDiv.g:661:3: ( ruleDQualifiedName )
            // InternalDiv.g:662:4: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDivDitchComplexTypeRuleRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDivDitchComplexTypeRuleAccess().getSourceDimComplexTypeCrossReference_0());
              			
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
    // $ANTLR end "ruleDivDitchComplexTypeRule"


    // $ANTLR start "entryRuleDivGrabFeatureRule"
    // InternalDiv.g:679:1: entryRuleDivGrabFeatureRule returns [EObject current=null] : iv_ruleDivGrabFeatureRule= ruleDivGrabFeatureRule EOF ;
    public final EObject entryRuleDivGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabFeatureRule = null;


        try {
            // InternalDiv.g:679:59: (iv_ruleDivGrabFeatureRule= ruleDivGrabFeatureRule EOF )
            // InternalDiv.g:680:2: iv_ruleDivGrabFeatureRule= ruleDivGrabFeatureRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivGrabFeatureRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivGrabFeatureRule=ruleDivGrabFeatureRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivGrabFeatureRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivGrabFeatureRule"


    // $ANTLR start "ruleDivGrabFeatureRule"
    // InternalDiv.g:686:1: ruleDivGrabFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:692:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:693:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:693:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:694:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:694:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:695:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:695:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:696:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabFeatureRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDivGrabFeatureRuleAccess().getSourceDimFeatureCrossReference_0_0());
              				
            }

            }


            }

            // InternalDiv.g:707:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDiv.g:708:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabFeatureRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:712:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:713:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:713:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:714:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getDivGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabFeatureRuleRule());
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
    // $ANTLR end "ruleDivGrabFeatureRule"


    // $ANTLR start "entryRuleDivDitchFeatureRule"
    // InternalDiv.g:735:1: entryRuleDivDitchFeatureRule returns [EObject current=null] : iv_ruleDivDitchFeatureRule= ruleDivDitchFeatureRule EOF ;
    public final EObject entryRuleDivDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchFeatureRule = null;


        try {
            // InternalDiv.g:735:60: (iv_ruleDivDitchFeatureRule= ruleDivDitchFeatureRule EOF )
            // InternalDiv.g:736:2: iv_ruleDivDitchFeatureRule= ruleDivDitchFeatureRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivDitchFeatureRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivDitchFeatureRule=ruleDivDitchFeatureRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivDitchFeatureRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivDitchFeatureRule"


    // $ANTLR start "ruleDivDitchFeatureRule"
    // InternalDiv.g:742:1: ruleDivDitchFeatureRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDivDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDiv.g:748:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDiv.g:749:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDiv.g:749:2: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:750:3: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:750:3: (otherlv_0= RULE_ID )
            // InternalDiv.g:751:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDivDitchFeatureRuleRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getDivDitchFeatureRuleAccess().getSourceDimFeatureCrossReference_0());
              			
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
    // $ANTLR end "ruleDivDitchFeatureRule"


    // $ANTLR start "entryRuleDivGrabQueryParameterRule"
    // InternalDiv.g:765:1: entryRuleDivGrabQueryParameterRule returns [EObject current=null] : iv_ruleDivGrabQueryParameterRule= ruleDivGrabQueryParameterRule EOF ;
    public final EObject entryRuleDivGrabQueryParameterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabQueryParameterRule = null;


        try {
            // InternalDiv.g:765:66: (iv_ruleDivGrabQueryParameterRule= ruleDivGrabQueryParameterRule EOF )
            // InternalDiv.g:766:2: iv_ruleDivGrabQueryParameterRule= ruleDivGrabQueryParameterRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivGrabQueryParameterRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivGrabQueryParameterRule=ruleDivGrabQueryParameterRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivGrabQueryParameterRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivGrabQueryParameterRule"


    // $ANTLR start "ruleDivGrabQueryParameterRule"
    // InternalDiv.g:772:1: ruleDivGrabQueryParameterRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabQueryParameterRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:778:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:779:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:779:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:780:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:780:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:781:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:781:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:782:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabQueryParameterRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDivGrabQueryParameterRuleAccess().getSourceDimQueryParameterCrossReference_0_0());
              				
            }

            }


            }

            // InternalDiv.g:793:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDiv.g:794:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabQueryParameterRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:798:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:799:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:799:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:800:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_2_0, grammarAccess.getDivGrabQueryParameterRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabQueryParameterRuleRule());
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
    // $ANTLR end "ruleDivGrabQueryParameterRule"


    // $ANTLR start "entryRuleDivDitchQueryParameterRule"
    // InternalDiv.g:821:1: entryRuleDivDitchQueryParameterRule returns [EObject current=null] : iv_ruleDivDitchQueryParameterRule= ruleDivDitchQueryParameterRule EOF ;
    public final EObject entryRuleDivDitchQueryParameterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchQueryParameterRule = null;


        try {
            // InternalDiv.g:821:67: (iv_ruleDivDitchQueryParameterRule= ruleDivDitchQueryParameterRule EOF )
            // InternalDiv.g:822:2: iv_ruleDivDitchQueryParameterRule= ruleDivDitchQueryParameterRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivDitchQueryParameterRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivDitchQueryParameterRule=ruleDivDitchQueryParameterRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivDitchQueryParameterRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivDitchQueryParameterRule"


    // $ANTLR start "ruleDivDitchQueryParameterRule"
    // InternalDiv.g:828:1: ruleDivDitchQueryParameterRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDivDitchQueryParameterRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDiv.g:834:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDiv.g:835:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDiv.g:835:2: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:836:3: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:836:3: (otherlv_0= RULE_ID )
            // InternalDiv.g:837:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDivDitchQueryParameterRuleRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getDivDitchQueryParameterRuleAccess().getSourceDimQueryParameterCrossReference_0());
              			
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
    // $ANTLR end "ruleDivDitchQueryParameterRule"


    // $ANTLR start "entryRuleDivAggregate"
    // InternalDiv.g:851:1: entryRuleDivAggregate returns [EObject current=null] : iv_ruleDivAggregate= ruleDivAggregate EOF ;
    public final EObject entryRuleDivAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAggregate = null;


        try {
            // InternalDiv.g:851:53: (iv_ruleDivAggregate= ruleDivAggregate EOF )
            // InternalDiv.g:852:2: iv_ruleDivAggregate= ruleDivAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivAggregateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivAggregate=ruleDivAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivAggregate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivAggregate"


    // $ANTLR start "ruleDivAggregate"
    // InternalDiv.g:858:1: ruleDivAggregate returns [EObject current=null] : (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate ) ;
    public final EObject ruleDivAggregate() throws RecognitionException {
        EObject current = null;

        EObject this_DivAggregateTransposition_0 = null;

        EObject this_DimAggregate_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:864:2: ( (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate ) )
            // InternalDiv.g:865:2: (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate )
            {
            // InternalDiv.g:865:2: (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==40) ) {
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
                    // InternalDiv.g:866:3: this_DivAggregateTransposition_0= ruleDivAggregateTransposition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivAggregateAccess().getDivAggregateTranspositionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DivAggregateTransposition_0=ruleDivAggregateTransposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DivAggregateTransposition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:875:3: this_DimAggregate_1= ruleDimAggregate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivAggregateAccess().getDimAggregateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DimAggregate_1=ruleDimAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DimAggregate_1;
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
    // $ANTLR end "ruleDivAggregate"


    // $ANTLR start "entryRuleDivAggregateTransposition"
    // InternalDiv.g:887:1: entryRuleDivAggregateTransposition returns [EObject current=null] : iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF ;
    public final EObject entryRuleDivAggregateTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAggregateTransposition = null;


        try {
            // InternalDiv.g:887:66: (iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF )
            // InternalDiv.g:888:2: iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivAggregateTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivAggregateTransposition=ruleDivAggregateTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivAggregateTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivAggregateTransposition"


    // $ANTLR start "ruleDivAggregateTransposition"
    // InternalDiv.g:894:1: ruleDivAggregateTransposition returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleDivAggregateTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_rule_3_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_types_7_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:900:2: ( ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? ) )
            // InternalDiv.g:901:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? )
            {
            // InternalDiv.g:901:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? )
            // InternalDiv.g:902:3: () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )?
            {
            // InternalDiv.g:902:3: ()
            // InternalDiv.g:903:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivAggregateTranspositionAccess().getTAggregateTranspositionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDivAggregateTranspositionAccess().getGrabKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDivAggregateTranspositionAccess().getAggregateKeyword_2());
              		
            }
            // InternalDiv.g:917:3: ( (lv_rule_3_0= ruleDivGrabAggregateRule ) )
            // InternalDiv.g:918:4: (lv_rule_3_0= ruleDivGrabAggregateRule )
            {
            // InternalDiv.g:918:4: (lv_rule_3_0= ruleDivGrabAggregateRule )
            // InternalDiv.g:919:5: lv_rule_3_0= ruleDivGrabAggregateRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivAggregateTranspositionAccess().getRuleDivGrabAggregateRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_rule_3_0=ruleDivGrabAggregateRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDivAggregateTranspositionRule());
              					}
              					set(
              						current,
              						"rule",
              						lv_rule_3_0,
              						"com.mimacom.ddd.dm.div.Div.DivGrabAggregateRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDiv.g:936:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_PLAIN_TEXT_ONLY && LA12_0<=RULE_RICH_TEXT_START)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDiv.g:937:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:937:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:938:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivAggregateTranspositionAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivAggregateTranspositionRule());
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

            // InternalDiv.g:955:3: (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDiv.g:956:4: otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDivAggregateTranspositionAccess().getLeftCurlyBracketKeyword_5_0());
                      			
                    }
                    // InternalDiv.g:960:4: ( (lv_features_6_0= ruleDivQueryTransposition ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1==36) ) {
                                alt13=1;
                            }


                        }
                        else if ( (LA13_0==26) ) {
                            int LA13_2 = input.LA(2);

                            if ( (LA13_2==36) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDiv.g:961:5: (lv_features_6_0= ruleDivQueryTransposition )
                    	    {
                    	    // InternalDiv.g:961:5: (lv_features_6_0= ruleDivQueryTransposition )
                    	    // InternalDiv.g:962:6: lv_features_6_0= ruleDivQueryTransposition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDivAggregateTranspositionAccess().getFeaturesDivQueryTranspositionParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_features_6_0=ruleDivQueryTransposition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDivAggregateTranspositionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"features",
                    	      							lv_features_6_0,
                    	      							"com.mimacom.ddd.dm.div.Div.DivQueryTransposition");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalDiv.g:979:4: ( (lv_types_7_0= ruleDivType ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==23||LA14_0==26) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDiv.g:980:5: (lv_types_7_0= ruleDivType )
                    	    {
                    	    // InternalDiv.g:980:5: (lv_types_7_0= ruleDivType )
                    	    // InternalDiv.g:981:6: lv_types_7_0= ruleDivType
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDivAggregateTranspositionAccess().getTypesDivTypeParserRuleCall_5_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_types_7_0=ruleDivType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDivAggregateTranspositionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"types",
                    	      							lv_types_7_0,
                    	      							"com.mimacom.ddd.dm.div.Div.DivType");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDivAggregateTranspositionAccess().getRightCurlyBracketKeyword_5_3());
                      			
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
    // $ANTLR end "ruleDivAggregateTransposition"


    // $ANTLR start "entryRuleDivType"
    // InternalDiv.g:1007:1: entryRuleDivType returns [EObject current=null] : iv_ruleDivType= ruleDivType EOF ;
    public final EObject entryRuleDivType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivType = null;


        try {
            // InternalDiv.g:1007:48: (iv_ruleDivType= ruleDivType EOF )
            // InternalDiv.g:1008:2: iv_ruleDivType= ruleDivType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivType=ruleDivType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivType"


    // $ANTLR start "ruleDivType"
    // InternalDiv.g:1014:1: ruleDivType returns [EObject current=null] : (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition ) ;
    public final EObject ruleDivType() throws RecognitionException {
        EObject current = null;

        EObject this_DivPrimitiveTransposition_0 = null;

        EObject this_DivEnumerationTransposition_1 = null;

        EObject this_DivEntityTypeTransposition_2 = null;

        EObject this_DivDetailTypeTransposition_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:1020:2: ( (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition ) )
            // InternalDiv.g:1021:2: (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition )
            {
            // InternalDiv.g:1021:2: (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt16=2;
                    }
                    break;
                case 30:
                case 31:
                    {
                    alt16=3;
                    }
                    break;
                case 25:
                    {
                    alt16=1;
                    }
                    break;
                case 32:
                    {
                    alt16=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA16_0==26) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt16=1;
                    }
                    break;
                case 32:
                    {
                    alt16=4;
                    }
                    break;
                case 28:
                    {
                    alt16=2;
                    }
                    break;
                case 30:
                case 31:
                    {
                    alt16=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDiv.g:1022:3: this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivTypeAccess().getDivPrimitiveTranspositionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DivPrimitiveTransposition_0=ruleDivPrimitiveTransposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DivPrimitiveTransposition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:1031:3: this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivTypeAccess().getDivEnumerationTranspositionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DivEnumerationTransposition_1=ruleDivEnumerationTransposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DivEnumerationTransposition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDiv.g:1040:3: this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivTypeAccess().getDivEntityTypeTranspositionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DivEntityTypeTransposition_2=ruleDivEntityTypeTransposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DivEntityTypeTransposition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDiv.g:1049:3: this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivTypeAccess().getDivDetailTypeTranspositionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DivDetailTypeTransposition_3=ruleDivDetailTypeTransposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DivDetailTypeTransposition_3;
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
    // $ANTLR end "ruleDivType"


    // $ANTLR start "entryRuleDivPrimitiveTransposition"
    // InternalDiv.g:1061:1: entryRuleDivPrimitiveTransposition returns [EObject current=null] : iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF ;
    public final EObject entryRuleDivPrimitiveTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivPrimitiveTransposition = null;


        try {
            // InternalDiv.g:1061:66: (iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF )
            // InternalDiv.g:1062:2: iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivPrimitiveTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivPrimitiveTransposition=ruleDivPrimitiveTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivPrimitiveTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivPrimitiveTransposition"


    // $ANTLR start "ruleDivPrimitiveTransposition"
    // InternalDiv.g:1068:1: ruleDivPrimitiveTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleDivPrimitiveTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_rule_3_0 = null;

        EObject lv_rule_6_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_constraints_10_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1074:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? ) )
            // InternalDiv.g:1075:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? )
            {
            // InternalDiv.g:1075:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? )
            // InternalDiv.g:1076:3: () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )?
            {
            // InternalDiv.g:1076:3: ()
            // InternalDiv.g:1077:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivPrimitiveTranspositionAccess().getTPrimitiveTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1083:3: ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==26) ) {
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
                    // InternalDiv.g:1084:4: (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) )
                    {
                    // InternalDiv.g:1084:4: (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) )
                    // InternalDiv.g:1085:5: otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivPrimitiveTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivPrimitiveTranspositionAccess().getPrimitiveKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1093:5: ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) )
                    // InternalDiv.g:1094:6: (lv_rule_3_0= ruleDivGrabPrimitiveRule )
                    {
                    // InternalDiv.g:1094:6: (lv_rule_3_0= ruleDivGrabPrimitiveRule )
                    // InternalDiv.g:1095:7: lv_rule_3_0= ruleDivGrabPrimitiveRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivPrimitiveTranspositionAccess().getRuleDivGrabPrimitiveRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_rule_3_0=ruleDivGrabPrimitiveRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivPrimitiveTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_3_0,
                      								"com.mimacom.ddd.dm.div.Div.DivGrabPrimitiveRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:1114:4: (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) )
                    {
                    // InternalDiv.g:1114:4: (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) )
                    // InternalDiv.g:1115:5: otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivPrimitiveTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivPrimitiveTranspositionAccess().getPrimitiveKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1123:5: ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) )
                    // InternalDiv.g:1124:6: (lv_rule_6_0= ruleDivDitchPrimitiveRule )
                    {
                    // InternalDiv.g:1124:6: (lv_rule_6_0= ruleDivDitchPrimitiveRule )
                    // InternalDiv.g:1125:7: lv_rule_6_0= ruleDivDitchPrimitiveRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivPrimitiveTranspositionAccess().getRuleDivDitchPrimitiveRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_rule_6_0=ruleDivDitchPrimitiveRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivPrimitiveTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_6_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchPrimitiveRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:1144:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_PLAIN_TEXT_ONLY && LA18_0<=RULE_RICH_TEXT_START)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDiv.g:1145:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1145:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1146:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivPrimitiveTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivPrimitiveTranspositionRule());
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

            // InternalDiv.g:1163:3: (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDiv.g:1164:4: otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDivPrimitiveTranspositionAccess().getLeftCurlyBracketKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:1168:4: (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==27) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDiv.g:1169:5: otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getDivPrimitiveTranspositionAccess().getAddKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:1173:5: ( (lv_constraints_10_0= ruleDConstraint ) )
                    	    // InternalDiv.g:1174:6: (lv_constraints_10_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:1174:6: (lv_constraints_10_0= ruleDConstraint )
                    	    // InternalDiv.g:1175:7: lv_constraints_10_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDivPrimitiveTranspositionAccess().getConstraintsDConstraintParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_constraints_10_0=ruleDConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDivPrimitiveTranspositionRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDivPrimitiveTranspositionAccess().getRightCurlyBracketKeyword_3_2());
                      			
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
    // $ANTLR end "ruleDivPrimitiveTransposition"


    // $ANTLR start "entryRuleDivEnumerationTransposition"
    // InternalDiv.g:1202:1: entryRuleDivEnumerationTransposition returns [EObject current=null] : iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF ;
    public final EObject entryRuleDivEnumerationTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivEnumerationTransposition = null;


        try {
            // InternalDiv.g:1202:68: (iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF )
            // InternalDiv.g:1203:2: iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivEnumerationTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivEnumerationTransposition=ruleDivEnumerationTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivEnumerationTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivEnumerationTransposition"


    // $ANTLR start "ruleDivEnumerationTransposition"
    // InternalDiv.g:1209:1: ruleDivEnumerationTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleDivEnumerationTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_rule_3_0 = null;

        EObject lv_rule_6_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_literals_9_0 = null;

        EObject lv_literals_11_0 = null;

        EObject lv_constraints_13_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1215:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? ) )
            // InternalDiv.g:1216:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? )
            {
            // InternalDiv.g:1216:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? )
            // InternalDiv.g:1217:3: () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )?
            {
            // InternalDiv.g:1217:3: ()
            // InternalDiv.g:1218:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivEnumerationTranspositionAccess().getTEnumerationTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1224:3: ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDiv.g:1225:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) )
                    {
                    // InternalDiv.g:1225:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) )
                    // InternalDiv.g:1226:5: otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivEnumerationTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivEnumerationTranspositionAccess().getEnumerationKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1234:5: ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) )
                    // InternalDiv.g:1235:6: (lv_rule_3_0= ruleDivGrabEnumerationRule )
                    {
                    // InternalDiv.g:1235:6: (lv_rule_3_0= ruleDivGrabEnumerationRule )
                    // InternalDiv.g:1236:7: lv_rule_3_0= ruleDivGrabEnumerationRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getRuleDivGrabEnumerationRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_rule_3_0=ruleDivGrabEnumerationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivEnumerationTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_3_0,
                      								"com.mimacom.ddd.dm.div.Div.DivGrabEnumerationRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:1255:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) )
                    {
                    // InternalDiv.g:1255:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) )
                    // InternalDiv.g:1256:5: otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivEnumerationTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivEnumerationTranspositionAccess().getEnumerationKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1264:5: ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) )
                    // InternalDiv.g:1265:6: (lv_rule_6_0= ruleDivDitchEnumerationRule )
                    {
                    // InternalDiv.g:1265:6: (lv_rule_6_0= ruleDivDitchEnumerationRule )
                    // InternalDiv.g:1266:7: lv_rule_6_0= ruleDivDitchEnumerationRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getRuleDivDitchEnumerationRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_rule_6_0=ruleDivDitchEnumerationRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivEnumerationTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_6_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchEnumerationRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:1285:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_PLAIN_TEXT_ONLY && LA22_0<=RULE_RICH_TEXT_START)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDiv.g:1286:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1286:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1287:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivEnumerationTranspositionRule());
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

            // InternalDiv.g:1304:3: (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDiv.g:1305:4: otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDivEnumerationTranspositionAccess().getLeftCurlyBracketKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:1309:4: ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==23||LA24_0==26) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalDiv.g:1310:5: ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )*
                            {
                            // InternalDiv.g:1310:5: ( (lv_literals_9_0= ruleDivLiteralTransposition ) )
                            // InternalDiv.g:1311:6: (lv_literals_9_0= ruleDivLiteralTransposition )
                            {
                            // InternalDiv.g:1311:6: (lv_literals_9_0= ruleDivLiteralTransposition )
                            // InternalDiv.g:1312:7: lv_literals_9_0= ruleDivLiteralTransposition
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getLiteralsDivLiteralTranspositionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_19);
                            lv_literals_9_0=ruleDivLiteralTransposition();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDivEnumerationTranspositionRule());
                              							}
                              							add(
                              								current,
                              								"literals",
                              								lv_literals_9_0,
                              								"com.mimacom.ddd.dm.div.Div.DivLiteralTransposition");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalDiv.g:1329:5: (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==29) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalDiv.g:1330:6: otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) )
                            	    {
                            	    otherlv_10=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_10, grammarAccess.getDivEnumerationTranspositionAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDiv.g:1334:6: ( (lv_literals_11_0= ruleDivLiteralTransposition ) )
                            	    // InternalDiv.g:1335:7: (lv_literals_11_0= ruleDivLiteralTransposition )
                            	    {
                            	    // InternalDiv.g:1335:7: (lv_literals_11_0= ruleDivLiteralTransposition )
                            	    // InternalDiv.g:1336:8: lv_literals_11_0= ruleDivLiteralTransposition
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getLiteralsDivLiteralTranspositionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_19);
                            	    lv_literals_11_0=ruleDivLiteralTransposition();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDivEnumerationTranspositionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"literals",
                            	      									lv_literals_11_0,
                            	      									"com.mimacom.ddd.dm.div.Div.DivLiteralTransposition");
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

                    // InternalDiv.g:1355:4: (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==27) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalDiv.g:1356:5: otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getDivEnumerationTranspositionAccess().getAddKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:1360:5: ( (lv_constraints_13_0= ruleDConstraint ) )
                    	    // InternalDiv.g:1361:6: (lv_constraints_13_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:1361:6: (lv_constraints_13_0= ruleDConstraint )
                    	    // InternalDiv.g:1362:7: lv_constraints_13_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getConstraintsDConstraintParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_constraints_13_0=ruleDConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDivEnumerationTranspositionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_13_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DConstraint");
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

                    otherlv_14=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDivEnumerationTranspositionAccess().getRightCurlyBracketKeyword_3_3());
                      			
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
    // $ANTLR end "ruleDivEnumerationTransposition"


    // $ANTLR start "entryRuleDivLiteralTransposition"
    // InternalDiv.g:1389:1: entryRuleDivLiteralTransposition returns [EObject current=null] : iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF ;
    public final EObject entryRuleDivLiteralTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivLiteralTransposition = null;


        try {
            // InternalDiv.g:1389:64: (iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF )
            // InternalDiv.g:1390:2: iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivLiteralTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivLiteralTransposition=ruleDivLiteralTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivLiteralTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivLiteralTransposition"


    // $ANTLR start "ruleDivLiteralTransposition"
    // InternalDiv.g:1396:1: ruleDivLiteralTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivLiteralTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;

        EObject lv_rule_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1402:2: ( ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:1403:2: ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:1403:2: ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:1404:3: () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:1404:3: ()
            // InternalDiv.g:1405:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivLiteralTranspositionAccess().getTLiteralTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1411:3: ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            else if ( (LA27_0==26) ) {
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
                    // InternalDiv.g:1412:4: (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalDiv.g:1412:4: (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) )
                    // InternalDiv.g:1413:5: otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivLiteralTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1417:5: ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) )
                    // InternalDiv.g:1418:6: (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule )
                    {
                    // InternalDiv.g:1418:6: (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule )
                    // InternalDiv.g:1419:7: lv_rule_2_0= ruleDivGrabEnumerationLiteralRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivLiteralTranspositionAccess().getRuleDivGrabEnumerationLiteralRuleParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_2_0=ruleDivGrabEnumerationLiteralRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivLiteralTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_2_0,
                      								"com.mimacom.ddd.dm.div.Div.DivGrabEnumerationLiteralRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:1438:4: (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalDiv.g:1438:4: (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) )
                    // InternalDiv.g:1439:5: otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDivLiteralTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1443:5: ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) )
                    // InternalDiv.g:1444:6: (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule )
                    {
                    // InternalDiv.g:1444:6: (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule )
                    // InternalDiv.g:1445:7: lv_rule_4_0= ruleDivDitchEnumerationLiteralRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivLiteralTranspositionAccess().getRuleDivDitchEnumerationLiteralRuleParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_4_0=ruleDivDitchEnumerationLiteralRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivLiteralTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_4_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchEnumerationLiteralRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:1464:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_PLAIN_TEXT_ONLY && LA28_0<=RULE_RICH_TEXT_START)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDiv.g:1465:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:1465:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:1466:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivLiteralTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivLiteralTranspositionRule());
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
    // $ANTLR end "ruleDivLiteralTransposition"


    // $ANTLR start "entryRuleDivEntityTypeTransposition"
    // InternalDiv.g:1487:1: entryRuleDivEntityTypeTransposition returns [EObject current=null] : iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF ;
    public final EObject entryRuleDivEntityTypeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivEntityTypeTransposition = null;


        try {
            // InternalDiv.g:1487:67: (iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF )
            // InternalDiv.g:1488:2: iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivEntityTypeTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivEntityTypeTransposition=ruleDivEntityTypeTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivEntityTypeTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivEntityTypeTransposition"


    // $ANTLR start "ruleDivEntityTypeTransposition"
    // InternalDiv.g:1494:1: ruleDivEntityTypeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )? ) ;
    public final EObject ruleDivEntityTypeTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_root_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_root_6_0=null;
        Token otherlv_7=null;
        EObject lv_rule_4_0 = null;

        EObject lv_rule_8_0 = null;

        EObject lv_description_9_0 = null;

        EObject this_TComplexTypeFeatures_10 = null;



        	enterRule();

        try {
            // InternalDiv.g:1500:2: ( ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )? ) )
            // InternalDiv.g:1501:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )? )
            {
            // InternalDiv.g:1501:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )? )
            // InternalDiv.g:1502:3: () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )?
            {
            // InternalDiv.g:1502:3: ()
            // InternalDiv.g:1503:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivEntityTypeTranspositionAccess().getTEntityTypeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1509:3: ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            else if ( (LA31_0==26) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalDiv.g:1510:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1510:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) )
                    // InternalDiv.g:1511:5: otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivEntityTypeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1515:5: ( (lv_root_2_0= 'root' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==30) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalDiv.g:1516:6: (lv_root_2_0= 'root' )
                            {
                            // InternalDiv.g:1516:6: (lv_root_2_0= 'root' )
                            // InternalDiv.g:1517:7: lv_root_2_0= 'root'
                            {
                            lv_root_2_0=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_root_2_0, grammarAccess.getDivEntityTypeTranspositionAccess().getRootRootKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDivEntityTypeTranspositionRule());
                              							}
                              							setWithLastConsumed(current, "root", true, "root");
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDivEntityTypeTranspositionAccess().getEntityKeyword_1_0_2());
                      				
                    }
                    // InternalDiv.g:1533:5: ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) )
                    // InternalDiv.g:1534:6: (lv_rule_4_0= ruleDivGrabComplexTypeRule )
                    {
                    // InternalDiv.g:1534:6: (lv_rule_4_0= ruleDivGrabComplexTypeRule )
                    // InternalDiv.g:1535:7: lv_rule_4_0= ruleDivGrabComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getRuleDivGrabComplexTypeRuleParserRuleCall_1_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_rule_4_0=ruleDivGrabComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivEntityTypeTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_4_0,
                      								"com.mimacom.ddd.dm.div.Div.DivGrabComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:1554:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1554:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) )
                    // InternalDiv.g:1555:5: otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivEntityTypeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1559:5: ( (lv_root_6_0= 'root' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==30) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalDiv.g:1560:6: (lv_root_6_0= 'root' )
                            {
                            // InternalDiv.g:1560:6: (lv_root_6_0= 'root' )
                            // InternalDiv.g:1561:7: lv_root_6_0= 'root'
                            {
                            lv_root_6_0=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_root_6_0, grammarAccess.getDivEntityTypeTranspositionAccess().getRootRootKeyword_1_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDivEntityTypeTranspositionRule());
                              							}
                              							setWithLastConsumed(current, "root", true, "root");
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getDivEntityTypeTranspositionAccess().getEntityKeyword_1_1_2());
                      				
                    }
                    // InternalDiv.g:1577:5: ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) )
                    // InternalDiv.g:1578:6: (lv_rule_8_0= ruleDivDitchComplexTypeRule )
                    {
                    // InternalDiv.g:1578:6: (lv_rule_8_0= ruleDivDitchComplexTypeRule )
                    // InternalDiv.g:1579:7: lv_rule_8_0= ruleDivDitchComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getRuleDivDitchComplexTypeRuleParserRuleCall_1_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_rule_8_0=ruleDivDitchComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivEntityTypeTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_8_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:1598:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_PLAIN_TEXT_ONLY && LA32_0<=RULE_RICH_TEXT_START)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDiv.g:1599:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:1599:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:1600:5: lv_description_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivEntityTypeTranspositionRule());
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

            // InternalDiv.g:1617:3: (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDiv.g:1618:4: this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDivEntityTypeTranspositionRule());
                      				}
                      				newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getTComplexTypeFeaturesParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TComplexTypeFeatures_10=ruleTComplexTypeFeatures(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TComplexTypeFeatures_10;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleDivEntityTypeTransposition"


    // $ANTLR start "entryRuleDivDetailTypeTransposition"
    // InternalDiv.g:1634:1: entryRuleDivDetailTypeTransposition returns [EObject current=null] : iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF ;
    public final EObject entryRuleDivDetailTypeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDetailTypeTransposition = null;


        try {
            // InternalDiv.g:1634:67: (iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF )
            // InternalDiv.g:1635:2: iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivDetailTypeTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivDetailTypeTransposition=ruleDivDetailTypeTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivDetailTypeTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivDetailTypeTransposition"


    // $ANTLR start "ruleDivDetailTypeTransposition"
    // InternalDiv.g:1641:1: ruleDivDetailTypeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? ) ;
    public final EObject ruleDivDetailTypeTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_rule_3_0 = null;

        EObject lv_rule_6_0 = null;

        EObject lv_description_7_0 = null;

        EObject this_TComplexTypeFeatures_8 = null;



        	enterRule();

        try {
            // InternalDiv.g:1647:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? ) )
            // InternalDiv.g:1648:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? )
            {
            // InternalDiv.g:1648:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? )
            // InternalDiv.g:1649:3: () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )?
            {
            // InternalDiv.g:1649:3: ()
            // InternalDiv.g:1650:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivDetailTypeTranspositionAccess().getTDetailTypeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1656:3: ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            else if ( (LA34_0==26) ) {
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
                    // InternalDiv.g:1657:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1657:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) )
                    // InternalDiv.g:1658:5: otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivDetailTypeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivDetailTypeTranspositionAccess().getDetailKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1666:5: ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) )
                    // InternalDiv.g:1667:6: (lv_rule_3_0= ruleDivGrabComplexTypeRule )
                    {
                    // InternalDiv.g:1667:6: (lv_rule_3_0= ruleDivGrabComplexTypeRule )
                    // InternalDiv.g:1668:7: lv_rule_3_0= ruleDivGrabComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivDetailTypeTranspositionAccess().getRuleDivGrabComplexTypeRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_rule_3_0=ruleDivGrabComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivDetailTypeTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_3_0,
                      								"com.mimacom.ddd.dm.div.Div.DivGrabComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:1687:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1687:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) )
                    // InternalDiv.g:1688:5: otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivDetailTypeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivDetailTypeTranspositionAccess().getDetailKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1696:5: ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) )
                    // InternalDiv.g:1697:6: (lv_rule_6_0= ruleDivDitchComplexTypeRule )
                    {
                    // InternalDiv.g:1697:6: (lv_rule_6_0= ruleDivDitchComplexTypeRule )
                    // InternalDiv.g:1698:7: lv_rule_6_0= ruleDivDitchComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivDetailTypeTranspositionAccess().getRuleDivDitchComplexTypeRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
                    lv_rule_6_0=ruleDivDitchComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivDetailTypeTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_6_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:1717:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_PLAIN_TEXT_ONLY && LA35_0<=RULE_RICH_TEXT_START)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDiv.g:1718:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1718:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1719:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivDetailTypeTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivDetailTypeTranspositionRule());
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

            // InternalDiv.g:1736:3: (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDiv.g:1737:4: this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDivDetailTypeTranspositionRule());
                      				}
                      				newCompositeNode(grammarAccess.getDivDetailTypeTranspositionAccess().getTComplexTypeFeaturesParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TComplexTypeFeatures_8=ruleTComplexTypeFeatures(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TComplexTypeFeatures_8;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleDivDetailTypeTransposition"


    // $ANTLR start "ruleTComplexTypeFeatures"
    // InternalDiv.g:1754:1: ruleTComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1760:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' ) )
            // InternalDiv.g:1761:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' )
            {
            // InternalDiv.g:1761:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' )
            // InternalDiv.g:1762:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalDiv.g:1766:3: ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==23||LA37_0==26) ) {
                    alt37=1;
                }
                else if ( (LA37_0==27) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDiv.g:1767:4: ( (lv_features_1_0= ruleDivFeature ) )
            	    {
            	    // InternalDiv.g:1767:4: ( (lv_features_1_0= ruleDivFeature ) )
            	    // InternalDiv.g:1768:5: (lv_features_1_0= ruleDivFeature )
            	    {
            	    // InternalDiv.g:1768:5: (lv_features_1_0= ruleDivFeature )
            	    // InternalDiv.g:1769:6: lv_features_1_0= ruleDivFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTComplexTypeFeaturesAccess().getFeaturesDivFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_features_1_0=ruleDivFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTComplexTypeFeaturesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_1_0,
            	      							"com.mimacom.ddd.dm.div.Div.DivFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDiv.g:1787:4: (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) )
            	    {
            	    // InternalDiv.g:1787:4: (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) )
            	    // InternalDiv.g:1788:5: otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getTComplexTypeFeaturesAccess().getAddKeyword_1_1_0());
            	      				
            	    }
            	    // InternalDiv.g:1792:5: ( (lv_constraints_3_0= ruleDConstraint ) )
            	    // InternalDiv.g:1793:6: (lv_constraints_3_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:1793:6: (lv_constraints_3_0= ruleDConstraint )
            	    // InternalDiv.g:1794:7: lv_constraints_3_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTComplexTypeFeaturesAccess().getConstraintsDConstraintParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_constraints_3_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getTComplexTypeFeaturesRule());
            	      							}
            	      							add(
            	      								current,
            	      								"constraints",
            	      								lv_constraints_3_0,
            	      								"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTComplexTypeFeatures"


    // $ANTLR start "entryRuleDivFeature"
    // InternalDiv.g:1821:1: entryRuleDivFeature returns [EObject current=null] : iv_ruleDivFeature= ruleDivFeature EOF ;
    public final EObject entryRuleDivFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivFeature = null;


        try {
            // InternalDiv.g:1821:51: (iv_ruleDivFeature= ruleDivFeature EOF )
            // InternalDiv.g:1822:2: iv_ruleDivFeature= ruleDivFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivFeature=ruleDivFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivFeature"


    // $ANTLR start "ruleDivFeature"
    // InternalDiv.g:1828:1: ruleDivFeature returns [EObject current=null] : (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition ) ;
    public final EObject ruleDivFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DivAssociationTransposition_0 = null;

        EObject this_DivAttributeTransposition_1 = null;

        EObject this_DivQueryTransposition_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:1834:2: ( (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition ) )
            // InternalDiv.g:1835:2: (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition )
            {
            // InternalDiv.g:1835:2: (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                switch ( input.LA(2) ) {
                case 33:
                case 34:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_ID:
                case 32:
                case 35:
                    {
                    alt38=2;
                    }
                    break;
                case 36:
                    {
                    alt38=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA38_0==26) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt38=3;
                    }
                    break;
                case RULE_ID:
                case 32:
                case 35:
                    {
                    alt38=2;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt38=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalDiv.g:1836:3: this_DivAssociationTransposition_0= ruleDivAssociationTransposition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivFeatureAccess().getDivAssociationTranspositionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DivAssociationTransposition_0=ruleDivAssociationTransposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DivAssociationTransposition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:1845:3: this_DivAttributeTransposition_1= ruleDivAttributeTransposition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivFeatureAccess().getDivAttributeTranspositionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DivAttributeTransposition_1=ruleDivAttributeTransposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DivAttributeTransposition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDiv.g:1854:3: this_DivQueryTransposition_2= ruleDivQueryTransposition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDivFeatureAccess().getDivQueryTranspositionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DivQueryTransposition_2=ruleDivQueryTransposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DivQueryTransposition_2;
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
    // $ANTLR end "ruleDivFeature"


    // $ANTLR start "entryRuleDivAssociationTransposition"
    // InternalDiv.g:1866:1: entryRuleDivAssociationTransposition returns [EObject current=null] : iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF ;
    public final EObject entryRuleDivAssociationTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAssociationTransposition = null;


        try {
            // InternalDiv.g:1866:68: (iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF )
            // InternalDiv.g:1867:2: iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivAssociationTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivAssociationTransposition=ruleDivAssociationTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivAssociationTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivAssociationTransposition"


    // $ANTLR start "ruleDivAssociationTransposition"
    // InternalDiv.g:1873:1: ruleDivAssociationTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivAssociationTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_rule_4_0 = null;

        EObject lv_rule_8_0 = null;

        EObject lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1879:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDiv.g:1880:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:1880:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDiv.g:1881:3: () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDiv.g:1881:3: ()
            // InternalDiv.g:1882:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivAssociationTranspositionAccess().getTAssociationTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1888:3: ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            else if ( (LA41_0==26) ) {
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
                    // InternalDiv.g:1889:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    {
                    // InternalDiv.g:1889:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:1890:5: otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivAssociationTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1894:5: (otherlv_2= 'reference' | otherlv_3= 'composite' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==33) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==34) ) {
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
                            // InternalDiv.g:1895:6: otherlv_2= 'reference'
                            {
                            otherlv_2=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getDivAssociationTranspositionAccess().getReferenceKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:1900:6: otherlv_3= 'composite'
                            {
                            otherlv_3=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getDivAssociationTranspositionAccess().getCompositeKeyword_1_0_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:1905:5: ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:1906:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:1906:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:1907:7: lv_rule_4_0= ruleDivGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAssociationTranspositionAccess().getRuleDivGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_4_0=ruleDivGrabFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivAssociationTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_4_0,
                      								"com.mimacom.ddd.dm.div.Div.DivGrabFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:1926:4: (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:1926:4: (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:1927:5: otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivAssociationTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1931:5: (otherlv_6= 'reference' | otherlv_7= 'composite' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==33) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==34) ) {
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
                            // InternalDiv.g:1932:6: otherlv_6= 'reference'
                            {
                            otherlv_6=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getDivAssociationTranspositionAccess().getReferenceKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:1937:6: otherlv_7= 'composite'
                            {
                            otherlv_7=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getDivAssociationTranspositionAccess().getCompositeKeyword_1_1_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:1942:5: ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:1943:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:1943:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:1944:7: lv_rule_8_0= ruleDivDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAssociationTranspositionAccess().getRuleDivDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_8_0=ruleDivDitchFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivAssociationTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_8_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:1963:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_PLAIN_TEXT_ONLY && LA42_0<=RULE_RICH_TEXT_START)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDiv.g:1964:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:1964:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:1965:5: lv_description_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivAssociationTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivAssociationTranspositionRule());
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
    // $ANTLR end "ruleDivAssociationTransposition"


    // $ANTLR start "entryRuleDivAttributeTransposition"
    // InternalDiv.g:1986:1: entryRuleDivAttributeTransposition returns [EObject current=null] : iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF ;
    public final EObject entryRuleDivAttributeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAttributeTransposition = null;


        try {
            // InternalDiv.g:1986:66: (iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF )
            // InternalDiv.g:1987:2: iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivAttributeTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivAttributeTransposition=ruleDivAttributeTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivAttributeTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivAttributeTransposition"


    // $ANTLR start "ruleDivAttributeTransposition"
    // InternalDiv.g:1993:1: ruleDivAttributeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivAttributeTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_detail_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_detail_7_0=null;
        EObject lv_rule_4_0 = null;

        EObject lv_rule_8_0 = null;

        EObject lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1999:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2000:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2000:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDiv.g:2001:3: () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDiv.g:2001:3: ()
            // InternalDiv.g:2002:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivAttributeTranspositionAccess().getTAttributeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2008:3: ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            else if ( (LA45_0==26) ) {
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
                    // InternalDiv.g:2009:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    {
                    // InternalDiv.g:2009:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:2010:5: otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivAttributeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:2014:5: (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )?
                    int alt43=3;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==35) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==32) ) {
                        alt43=2;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalDiv.g:2015:6: otherlv_2= 'attribute'
                            {
                            otherlv_2=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getDivAttributeTranspositionAccess().getAttributeKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2020:6: ( (lv_detail_3_0= 'detail' ) )
                            {
                            // InternalDiv.g:2020:6: ( (lv_detail_3_0= 'detail' ) )
                            // InternalDiv.g:2021:7: (lv_detail_3_0= 'detail' )
                            {
                            // InternalDiv.g:2021:7: (lv_detail_3_0= 'detail' )
                            // InternalDiv.g:2022:8: lv_detail_3_0= 'detail'
                            {
                            lv_detail_3_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_detail_3_0, grammarAccess.getDivAttributeTranspositionAccess().getDetailDetailKeyword_1_0_1_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getDivAttributeTranspositionRule());
                              								}
                              								setWithLastConsumed(current, "detail", true, "detail");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalDiv.g:2035:5: ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:2036:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:2036:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:2037:7: lv_rule_4_0= ruleDivGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAttributeTranspositionAccess().getRuleDivGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_4_0=ruleDivGrabFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivAttributeTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_4_0,
                      								"com.mimacom.ddd.dm.div.Div.DivGrabFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:2056:4: (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:2056:4: (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:2057:5: otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivAttributeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:2061:5: (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )?
                    int alt44=3;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==35) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==32) ) {
                        alt44=2;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalDiv.g:2062:6: otherlv_6= 'attribute'
                            {
                            otherlv_6=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getDivAttributeTranspositionAccess().getAttributeKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2067:6: ( (lv_detail_7_0= 'detail' ) )
                            {
                            // InternalDiv.g:2067:6: ( (lv_detail_7_0= 'detail' ) )
                            // InternalDiv.g:2068:7: (lv_detail_7_0= 'detail' )
                            {
                            // InternalDiv.g:2068:7: (lv_detail_7_0= 'detail' )
                            // InternalDiv.g:2069:8: lv_detail_7_0= 'detail'
                            {
                            lv_detail_7_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_detail_7_0, grammarAccess.getDivAttributeTranspositionAccess().getDetailDetailKeyword_1_1_1_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getDivAttributeTranspositionRule());
                              								}
                              								setWithLastConsumed(current, "detail", true, "detail");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalDiv.g:2082:5: ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:2083:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:2083:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:2084:7: lv_rule_8_0= ruleDivDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAttributeTranspositionAccess().getRuleDivDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_8_0=ruleDivDitchFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivAttributeTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_8_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:2103:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_PLAIN_TEXT_ONLY && LA46_0<=RULE_RICH_TEXT_START)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDiv.g:2104:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:2104:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:2105:5: lv_description_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivAttributeTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivAttributeTranspositionRule());
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
    // $ANTLR end "ruleDivAttributeTransposition"


    // $ANTLR start "entryRuleDivQueryTransposition"
    // InternalDiv.g:2126:1: entryRuleDivQueryTransposition returns [EObject current=null] : iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF ;
    public final EObject entryRuleDivQueryTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivQueryTransposition = null;


        try {
            // InternalDiv.g:2126:62: (iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF )
            // InternalDiv.g:2127:2: iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivQueryTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivQueryTransposition=ruleDivQueryTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivQueryTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivQueryTransposition"


    // $ANTLR start "ruleDivQueryTransposition"
    // InternalDiv.g:2133:1: ruleDivQueryTransposition returns [EObject current=null] : ( () ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')' ) | (otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivQueryTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_rule_3_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_rule_12_0 = null;

        EObject lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:2139:2: ( ( () ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')' ) | (otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2140:2: ( () ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')' ) | (otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2140:2: ( () ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')' ) | (otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalDiv.g:2141:3: () ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')' ) | (otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalDiv.g:2141:3: ()
            // InternalDiv.g:2142:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivQueryTranspositionAccess().getTQueryTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2148:3: ( ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')' ) | (otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23) ) {
                alt49=1;
            }
            else if ( (LA49_0==26) ) {
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
                    // InternalDiv.g:2149:4: ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')' )
                    {
                    // InternalDiv.g:2149:4: ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')' )
                    // InternalDiv.g:2150:5: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) otherlv_4= '(' (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) ) otherlv_9= ')'
                    {
                    // InternalDiv.g:2150:5: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:2151:6: otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDivQueryTranspositionAccess().getGrabKeyword_1_0_0_0());
                      					
                    }
                    otherlv_2=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getDivQueryTranspositionAccess().getQueryKeyword_1_0_0_1());
                      					
                    }
                    // InternalDiv.g:2159:6: ( (lv_rule_3_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:2160:7: (lv_rule_3_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:2160:7: (lv_rule_3_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:2161:8: lv_rule_3_0= ruleDivGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getRuleDivGrabFeatureRuleParserRuleCall_1_0_0_2_0());
                      							
                    }
                    pushFollow(FOLLOW_28);
                    lv_rule_3_0=ruleDivGrabFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getDivQueryTranspositionRule());
                      								}
                      								set(
                      									current,
                      									"rule",
                      									lv_rule_3_0,
                      									"com.mimacom.ddd.dm.div.Div.DivGrabFeatureRule");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivQueryTranspositionAccess().getLeftParenthesisKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:2183:5: (otherlv_5= '*' | ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==38) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==23||LA48_0==26) ) {
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
                            // InternalDiv.g:2184:6: otherlv_5= '*'
                            {
                            otherlv_5=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getDivQueryTranspositionAccess().getAsteriskKeyword_1_0_2_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2189:6: ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* )
                            {
                            // InternalDiv.g:2189:6: ( ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )* )
                            // InternalDiv.g:2190:7: ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )*
                            {
                            // InternalDiv.g:2190:7: ( (lv_parameters_6_0= ruleDivQueryParameterTransposition ) )
                            // InternalDiv.g:2191:8: (lv_parameters_6_0= ruleDivQueryParameterTransposition )
                            {
                            // InternalDiv.g:2191:8: (lv_parameters_6_0= ruleDivQueryParameterTransposition )
                            // InternalDiv.g:2192:9: lv_parameters_6_0= ruleDivQueryParameterTransposition
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getParametersDivQueryParameterTranspositionParserRuleCall_1_0_2_1_0_0());
                              								
                            }
                            pushFollow(FOLLOW_31);
                            lv_parameters_6_0=ruleDivQueryParameterTransposition();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getDivQueryTranspositionRule());
                              									}
                              									add(
                              										current,
                              										"parameters",
                              										lv_parameters_6_0,
                              										"com.mimacom.ddd.dm.div.Div.DivQueryParameterTransposition");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalDiv.g:2209:7: (otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==29) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // InternalDiv.g:2210:8: otherlv_7= ',' ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) )
                            	    {
                            	    otherlv_7=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								newLeafNode(otherlv_7, grammarAccess.getDivQueryTranspositionAccess().getCommaKeyword_1_0_2_1_1_0());
                            	      							
                            	    }
                            	    // InternalDiv.g:2214:8: ( (lv_parameters_8_0= ruleDivQueryParameterTransposition ) )
                            	    // InternalDiv.g:2215:9: (lv_parameters_8_0= ruleDivQueryParameterTransposition )
                            	    {
                            	    // InternalDiv.g:2215:9: (lv_parameters_8_0= ruleDivQueryParameterTransposition )
                            	    // InternalDiv.g:2216:10: lv_parameters_8_0= ruleDivQueryParameterTransposition
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      										newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getParametersDivQueryParameterTranspositionParserRuleCall_1_0_2_1_1_1_0());
                            	      									
                            	    }
                            	    pushFollow(FOLLOW_31);
                            	    lv_parameters_8_0=ruleDivQueryParameterTransposition();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      										if (current==null) {
                            	      											current = createModelElementForParent(grammarAccess.getDivQueryTranspositionRule());
                            	      										}
                            	      										add(
                            	      											current,
                            	      											"parameters",
                            	      											lv_parameters_8_0,
                            	      											"com.mimacom.ddd.dm.div.Div.DivQueryParameterTransposition");
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


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,39,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getDivQueryTranspositionAccess().getRightParenthesisKeyword_1_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:2242:4: (otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:2242:4: (otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:2243:5: otherlv_10= 'ditch' otherlv_11= 'query' ( (lv_rule_12_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getDivQueryTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_11=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getDivQueryTranspositionAccess().getQueryKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:2251:5: ( (lv_rule_12_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:2252:6: (lv_rule_12_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:2252:6: (lv_rule_12_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:2253:7: lv_rule_12_0= ruleDivDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getRuleDivDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_12_0=ruleDivDitchFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivQueryTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_12_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:2272:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_PLAIN_TEXT_ONLY && LA50_0<=RULE_RICH_TEXT_START)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDiv.g:2273:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalDiv.g:2273:4: (lv_description_13_0= ruleDRichText )
                    // InternalDiv.g:2274:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivQueryTranspositionRule());
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
    // $ANTLR end "ruleDivQueryTransposition"


    // $ANTLR start "entryRuleDivQueryParameterTransposition"
    // InternalDiv.g:2295:1: entryRuleDivQueryParameterTransposition returns [EObject current=null] : iv_ruleDivQueryParameterTransposition= ruleDivQueryParameterTransposition EOF ;
    public final EObject entryRuleDivQueryParameterTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivQueryParameterTransposition = null;


        try {
            // InternalDiv.g:2295:71: (iv_ruleDivQueryParameterTransposition= ruleDivQueryParameterTransposition EOF )
            // InternalDiv.g:2296:2: iv_ruleDivQueryParameterTransposition= ruleDivQueryParameterTransposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivQueryParameterTranspositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivQueryParameterTransposition=ruleDivQueryParameterTransposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivQueryParameterTransposition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivQueryParameterTransposition"


    // $ANTLR start "ruleDivQueryParameterTransposition"
    // InternalDiv.g:2302:1: ruleDivQueryParameterTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivQueryParameterTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;

        EObject lv_rule_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:2308:2: ( ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2309:2: ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2309:2: ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:2310:3: () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:2310:3: ()
            // InternalDiv.g:2311:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivQueryParameterTranspositionAccess().getTQueryParameterTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2317:3: ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==23) ) {
                alt51=1;
            }
            else if ( (LA51_0==26) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalDiv.g:2318:4: (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) ) )
                    {
                    // InternalDiv.g:2318:4: (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) ) )
                    // InternalDiv.g:2319:5: otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivQueryParameterTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:2323:5: ( (lv_rule_2_0= ruleDivGrabQueryParameterRule ) )
                    // InternalDiv.g:2324:6: (lv_rule_2_0= ruleDivGrabQueryParameterRule )
                    {
                    // InternalDiv.g:2324:6: (lv_rule_2_0= ruleDivGrabQueryParameterRule )
                    // InternalDiv.g:2325:7: lv_rule_2_0= ruleDivGrabQueryParameterRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivQueryParameterTranspositionAccess().getRuleDivGrabQueryParameterRuleParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_2_0=ruleDivGrabQueryParameterRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivQueryParameterTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_2_0,
                      								"com.mimacom.ddd.dm.div.Div.DivGrabQueryParameterRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:2344:4: (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) ) )
                    {
                    // InternalDiv.g:2344:4: (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) ) )
                    // InternalDiv.g:2345:5: otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDivQueryParameterTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:2349:5: ( (lv_rule_4_0= ruleDivDitchQueryParameterRule ) )
                    // InternalDiv.g:2350:6: (lv_rule_4_0= ruleDivDitchQueryParameterRule )
                    {
                    // InternalDiv.g:2350:6: (lv_rule_4_0= ruleDivDitchQueryParameterRule )
                    // InternalDiv.g:2351:7: lv_rule_4_0= ruleDivDitchQueryParameterRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivQueryParameterTranspositionAccess().getRuleDivDitchQueryParameterRuleParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_4_0=ruleDivDitchQueryParameterRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivQueryParameterTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_4_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchQueryParameterRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:2370:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_PLAIN_TEXT_ONLY && LA52_0<=RULE_RICH_TEXT_START)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDiv.g:2371:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:2371:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:2372:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivQueryParameterTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivQueryParameterTranspositionRule());
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
    // $ANTLR end "ruleDivQueryParameterTransposition"


    // $ANTLR start "entryRuleDimAggregate"
    // InternalDiv.g:2393:1: entryRuleDimAggregate returns [EObject current=null] : iv_ruleDimAggregate= ruleDimAggregate EOF ;
    public final EObject entryRuleDimAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAggregate = null;


        try {
            // InternalDiv.g:2393:53: (iv_ruleDimAggregate= ruleDimAggregate EOF )
            // InternalDiv.g:2394:2: iv_ruleDimAggregate= ruleDimAggregate EOF
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
    // InternalDiv.g:2400:1: ruleDimAggregate returns [EObject current=null] : ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' ) ;
    public final EObject ruleDimAggregate() throws RecognitionException {
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
            // InternalDiv.g:2406:2: ( ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' ) )
            // InternalDiv.g:2407:2: ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' )
            {
            // InternalDiv.g:2407:2: ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' )
            // InternalDiv.g:2408:3: ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}'
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
            // InternalDiv.g:2415:3: ()
            // InternalDiv.g:2416:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAggregateAccess().getDimAggregateAction_1(),
              					current);
              			
            }

            }

            // InternalDiv.g:2422:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2423:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2423:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2424:5: lv_name_2_0= RULE_ID
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

            // InternalDiv.g:2440:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_PLAIN_TEXT_ONLY && LA53_0<=RULE_RICH_TEXT_START)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDiv.g:2441:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDiv.g:2441:4: (lv_description_3_0= ruleDRichText )
                    // InternalDiv.g:2442:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAggregateAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDimAggregateRule());
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

            otherlv_4=(Token)match(input,20,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimAggregateAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDiv.g:2463:3: (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==36) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalDiv.g:2464:4: otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDimAggregateAccess().getQueryKeyword_5_0());
            	      			
            	    }
            	    // InternalDiv.g:2468:4: ( (lv_features_6_0= ruleDimQuery ) )
            	    // InternalDiv.g:2469:5: (lv_features_6_0= ruleDimQuery )
            	    {
            	    // InternalDiv.g:2469:5: (lv_features_6_0= ruleDimQuery )
            	    // InternalDiv.g:2470:6: lv_features_6_0= ruleDimQuery
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimAggregateAccess().getFeaturesDimQueryParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_features_6_0=ruleDimQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDimAggregateRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_6_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DimQuery");
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

            // InternalDiv.g:2488:3: ( (lv_types_7_0= ruleDimType ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==25||LA55_0==28||(LA55_0>=31 && LA55_0<=32)||(LA55_0>=45 && LA55_0<=46)||(LA55_0>=90 && LA55_0<=91)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalDiv.g:2489:4: (lv_types_7_0= ruleDimType )
            	    {
            	    // InternalDiv.g:2489:4: (lv_types_7_0= ruleDimType )
            	    // InternalDiv.g:2490:5: lv_types_7_0= ruleDimType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimAggregateAccess().getTypesDimTypeParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_types_7_0=ruleDimType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimAggregateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_7_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DimType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimAggregateAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDiv.g:2515:1: entryRuleDAggregateKeyword returns [String current=null] : iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF ;
    public final String entryRuleDAggregateKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAggregateKeyword = null;


        try {
            // InternalDiv.g:2515:57: (iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF )
            // InternalDiv.g:2516:2: iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF
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
    // InternalDiv.g:2522:1: ruleDAggregateKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'component' ;
    public final AntlrDatatypeRuleToken ruleDAggregateKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:2528:2: (kw= 'component' )
            // InternalDiv.g:2529:2: kw= 'component'
            {
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:2537:1: entryRuleDimType returns [EObject current=null] : iv_ruleDimType= ruleDimType EOF ;
    public final EObject entryRuleDimType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimType = null;


        try {
            // InternalDiv.g:2537:48: (iv_ruleDimType= ruleDimType EOF )
            // InternalDiv.g:2538:2: iv_ruleDimType= ruleDimType EOF
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
    // InternalDiv.g:2544:1: ruleDimType returns [EObject current=null] : (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType ) ;
    public final EObject ruleDimType() throws RecognitionException {
        EObject current = null;

        EObject this_DimPrimitive_0 = null;

        EObject this_DimEnumeration_1 = null;

        EObject this_DimEntityType_2 = null;

        EObject this_DimDetailType_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:2550:2: ( (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType ) )
            // InternalDiv.g:2551:2: (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType )
            {
            // InternalDiv.g:2551:2: (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt56=1;
                }
                break;
            case 28:
                {
                alt56=2;
                }
                break;
            case 45:
                {
                int LA56_3 = input.LA(2);

                if ( (LA56_3==31||LA56_3==46||(LA56_3>=90 && LA56_3<=91)) ) {
                    alt56=3;
                }
                else if ( (LA56_3==32) ) {
                    alt56=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 46:
            case 90:
            case 91:
                {
                alt56=3;
                }
                break;
            case 32:
                {
                alt56=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalDiv.g:2552:3: this_DimPrimitive_0= ruleDimPrimitive
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
                    // InternalDiv.g:2561:3: this_DimEnumeration_1= ruleDimEnumeration
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
                    // InternalDiv.g:2570:3: this_DimEntityType_2= ruleDimEntityType
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
                    // InternalDiv.g:2579:3: this_DimDetailType_3= ruleDimDetailType
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
    // InternalDiv.g:2591:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalDiv.g:2591:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalDiv.g:2592:2: iv_ruleDConstraint= ruleDConstraint EOF
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
    // InternalDiv.g:2598:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:2604:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2605:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2605:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDiv.g:2606:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalDiv.g:2610:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:2611:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:2611:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:2612:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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

            // InternalDiv.g:2628:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==42) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalDiv.g:2629:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:2633:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:2634:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2634:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:2635:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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
            	    break loop57;
                }
            } while (true);

            otherlv_4=(Token)match(input,43,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalDiv.g:2656:3: ( (lv_predicate_5_0= ruleDExpression ) )
            // InternalDiv.g:2657:4: (lv_predicate_5_0= ruleDExpression )
            {
            // InternalDiv.g:2657:4: (lv_predicate_5_0= ruleDExpression )
            // InternalDiv.g:2658:5: lv_predicate_5_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getPredicateDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            // InternalDiv.g:2675:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_PLAIN_TEXT_ONLY && LA58_0<=RULE_RICH_TEXT_START)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDiv.g:2676:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDiv.g:2676:4: (lv_description_6_0= ruleDRichText )
                    // InternalDiv.g:2677:5: lv_description_6_0= ruleDRichText
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


    // $ANTLR start "entryRuleDimPrimitive"
    // InternalDiv.g:2698:1: entryRuleDimPrimitive returns [EObject current=null] : iv_ruleDimPrimitive= ruleDimPrimitive EOF ;
    public final EObject entryRuleDimPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimPrimitive = null;


        try {
            // InternalDiv.g:2698:53: (iv_ruleDimPrimitive= ruleDimPrimitive EOF )
            // InternalDiv.g:2699:2: iv_ruleDimPrimitive= ruleDimPrimitive EOF
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
    // InternalDiv.g:2705:1: ruleDimPrimitive returns [EObject current=null] : ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? ) ;
    public final EObject ruleDimPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_description_7_0 = null;

        EObject lv_constraints_9_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:2711:2: ( ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? ) )
            // InternalDiv.g:2712:2: ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? )
            {
            // InternalDiv.g:2712:2: ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? )
            // InternalDiv.g:2713:3: () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )?
            {
            // InternalDiv.g:2713:3: ()
            // InternalDiv.g:2714:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimPrimitiveAccess().getDimPrimitiveAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDimPrimitiveAccess().getPrimitiveKeyword_1());
              		
            }
            // InternalDiv.g:2724:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2725:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2725:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2726:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
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

            // InternalDiv.g:2742:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==42) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalDiv.g:2743:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimPrimitiveAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:2747:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:2748:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2748:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:2749:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDimPrimitiveAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDimPrimitiveRule());
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
            	    break loop59;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDimPrimitiveAccess().getRedefinesKeyword_4());
              		
            }
            // InternalDiv.g:2770:3: ( (otherlv_6= RULE_ID ) )
            // InternalDiv.g:2771:4: (otherlv_6= RULE_ID )
            {
            // InternalDiv.g:2771:4: (otherlv_6= RULE_ID )
            // InternalDiv.g:2772:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimPrimitiveRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getDimPrimitiveAccess().getRedefinesDmxArchetypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalDiv.g:2783:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_PLAIN_TEXT_ONLY && LA60_0<=RULE_RICH_TEXT_START)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDiv.g:2784:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:2784:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:2785:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimPrimitiveAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
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

            // InternalDiv.g:2802:3: (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==20) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDiv.g:2803:4: otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDimPrimitiveAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    // InternalDiv.g:2807:4: ( (lv_constraints_9_0= ruleDConstraint ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==41) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalDiv.g:2808:5: (lv_constraints_9_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:2808:5: (lv_constraints_9_0= ruleDConstraint )
                    	    // InternalDiv.g:2809:6: lv_constraints_9_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDimPrimitiveAccess().getConstraintsDConstraintParserRuleCall_7_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_constraints_9_0=ruleDConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDimPrimitiveRule());
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
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getDimPrimitiveAccess().getRightCurlyBracketKeyword_7_2());
                      			
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
    // InternalDiv.g:2835:1: entryRuleDimEnumeration returns [EObject current=null] : iv_ruleDimEnumeration= ruleDimEnumeration EOF ;
    public final EObject entryRuleDimEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimEnumeration = null;


        try {
            // InternalDiv.g:2835:55: (iv_ruleDimEnumeration= ruleDimEnumeration EOF )
            // InternalDiv.g:2836:2: iv_ruleDimEnumeration= ruleDimEnumeration EOF
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
    // InternalDiv.g:2842:1: ruleDimEnumeration returns [EObject current=null] : ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' ) ;
    public final EObject ruleDimEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_description_5_0 = null;

        EObject lv_literals_7_0 = null;

        EObject lv_literals_9_0 = null;

        EObject lv_constraints_10_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:2848:2: ( ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' ) )
            // InternalDiv.g:2849:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' )
            {
            // InternalDiv.g:2849:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' )
            // InternalDiv.g:2850:3: () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}'
            {
            // InternalDiv.g:2850:3: ()
            // InternalDiv.g:2851:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimEnumerationAccess().getDimEnumerationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDimEnumerationAccess().getEnumerationKeyword_1());
              		
            }
            // InternalDiv.g:2861:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2862:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2862:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2863:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

            // InternalDiv.g:2879:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==42) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalDiv.g:2880:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimEnumerationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:2884:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:2885:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2885:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:2886:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDimEnumerationAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDimEnumerationRule());
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
            	    break loop63;
                }
            } while (true);

            // InternalDiv.g:2903:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_PLAIN_TEXT_ONLY && LA64_0<=RULE_RICH_TEXT_START)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDiv.g:2904:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:2904:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:2905:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimEnumerationAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,20,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDimEnumerationAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDiv.g:2926:3: ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDiv.g:2927:4: ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )*
                    {
                    // InternalDiv.g:2927:4: ( (lv_literals_7_0= ruleDimLiteral ) )
                    // InternalDiv.g:2928:5: (lv_literals_7_0= ruleDimLiteral )
                    {
                    // InternalDiv.g:2928:5: (lv_literals_7_0= ruleDimLiteral )
                    // InternalDiv.g:2929:6: lv_literals_7_0= ruleDimLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEnumerationAccess().getLiteralsDimLiteralParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_literals_7_0=ruleDimLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDimEnumerationRule());
                      						}
                      						add(
                      							current,
                      							"literals",
                      							lv_literals_7_0,
                      							"com.mimacom.ddd.dm.dim.Dim.DimLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDiv.g:2946:4: (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==29) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalDiv.g:2947:5: otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) )
                    	    {
                    	    otherlv_8=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getDimEnumerationAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:2951:5: ( (lv_literals_9_0= ruleDimLiteral ) )
                    	    // InternalDiv.g:2952:6: (lv_literals_9_0= ruleDimLiteral )
                    	    {
                    	    // InternalDiv.g:2952:6: (lv_literals_9_0= ruleDimLiteral )
                    	    // InternalDiv.g:2953:7: lv_literals_9_0= ruleDimLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimEnumerationAccess().getLiteralsDimLiteralParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_literals_9_0=ruleDimLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDimEnumerationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literals",
                    	      								lv_literals_9_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DimLiteral");
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

            // InternalDiv.g:2972:3: ( (lv_constraints_10_0= ruleDConstraint ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==41) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalDiv.g:2973:4: (lv_constraints_10_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:2973:4: (lv_constraints_10_0= ruleDConstraint )
            	    // InternalDiv.g:2974:5: lv_constraints_10_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimEnumerationAccess().getConstraintsDConstraintParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_constraints_10_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDimEnumerationRule());
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
            	    break loop67;
                }
            } while (true);

            otherlv_11=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDimEnumerationAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDiv.g:2999:1: entryRuleDimLiteral returns [EObject current=null] : iv_ruleDimLiteral= ruleDimLiteral EOF ;
    public final EObject entryRuleDimLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimLiteral = null;


        try {
            // InternalDiv.g:2999:51: (iv_ruleDimLiteral= ruleDimLiteral EOF )
            // InternalDiv.g:3000:2: iv_ruleDimLiteral= ruleDimLiteral EOF
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
    // InternalDiv.g:3006:1: ruleDimLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:3012:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3013:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3013:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDiv.g:3014:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3014:3: ()
            // InternalDiv.g:3015:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimLiteralAccess().getDimLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3021:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:3022:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:3022:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:3023:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
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

            // InternalDiv.g:3039:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==42) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalDiv.g:3040:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDimLiteralAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:3044:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:3045:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3045:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:3046:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDimLiteralAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDimLiteralRule());
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
            	    break loop68;
                }
            } while (true);

            // InternalDiv.g:3063:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_PLAIN_TEXT_ONLY && LA69_0<=RULE_RICH_TEXT_START)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDiv.g:3064:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:3064:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:3065:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimLiteralAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDiv.g:3086:1: entryRuleDimEntityType returns [EObject current=null] : iv_ruleDimEntityType= ruleDimEntityType EOF ;
    public final EObject entryRuleDimEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimEntityType = null;


        try {
            // InternalDiv.g:3086:54: (iv_ruleDimEntityType= ruleDimEntityType EOF )
            // InternalDiv.g:3087:2: iv_ruleDimEntityType= ruleDimEntityType EOF
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
    // InternalDiv.g:3093:1: ruleDimEntityType returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' ) ;
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
            // InternalDiv.g:3099:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' ) )
            // InternalDiv.g:3100:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' )
            {
            // InternalDiv.g:3100:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' )
            // InternalDiv.g:3101:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}'
            {
            // InternalDiv.g:3101:3: ()
            // InternalDiv.g:3102:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimEntityTypeAccess().getDimEntityTypeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3108:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==45) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDiv.g:3109:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalDiv.g:3109:4: (lv_abstract_1_0= 'abstract' )
                    // InternalDiv.g:3110:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,45,FOLLOW_42); if (state.failed) return current;
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

            // InternalDiv.g:3122:3: ( (lv_root_2_0= 'main' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==46) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDiv.g:3123:4: (lv_root_2_0= 'main' )
                    {
                    // InternalDiv.g:3123:4: (lv_root_2_0= 'main' )
                    // InternalDiv.g:3124:5: lv_root_2_0= 'main'
                    {
                    lv_root_2_0=(Token)match(input,46,FOLLOW_42); if (state.failed) return current;
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

            // InternalDiv.g:3136:3: (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt72=1;
                }
                break;
            case 90:
                {
                alt72=2;
                }
                break;
            case 91:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalDiv.g:3137:4: otherlv_3= 'entity'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimEntityTypeAccess().getEntityKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:3142:4: ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' )
                    {
                    // InternalDiv.g:3142:4: ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' )
                    // InternalDiv.g:3143:5: ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity'
                    {
                    // InternalDiv.g:3143:5: ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) )
                    // InternalDiv.g:3144:6: (lv_nature_4_0= ruleDEntityNatureAutonomous )
                    {
                    // InternalDiv.g:3144:6: (lv_nature_4_0= ruleDEntityNatureAutonomous )
                    // InternalDiv.g:3145:7: lv_nature_4_0= ruleDEntityNatureAutonomous
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getNatureDEntityNatureAutonomousEnumRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
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

                    otherlv_5=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDimEntityTypeAccess().getEntityKeyword_3_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:3168:4: ( (lv_nature_6_0= ruleDEntityNatureRelationship ) )
                    {
                    // InternalDiv.g:3168:4: ( (lv_nature_6_0= ruleDEntityNatureRelationship ) )
                    // InternalDiv.g:3169:5: (lv_nature_6_0= ruleDEntityNatureRelationship )
                    {
                    // InternalDiv.g:3169:5: (lv_nature_6_0= ruleDEntityNatureRelationship )
                    // InternalDiv.g:3170:6: lv_nature_6_0= ruleDEntityNatureRelationship
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
            pushFollow(FOLLOW_7);
            this_DimComplexType_7=ruleDimComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DimComplexType_7;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,20,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDiv.g:3203:3: (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==47) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDiv.g:3204:4: otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )?
                    {
                    otherlv_9=(Token)match(input,47,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDimEntityTypeAccess().getStatesKeyword_6_0());
                      			
                    }
                    otherlv_10=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalDiv.g:3212:4: ( (lv_states_11_0= ruleDState ) )
                    // InternalDiv.g:3213:5: (lv_states_11_0= ruleDState )
                    {
                    // InternalDiv.g:3213:5: (lv_states_11_0= ruleDState )
                    // InternalDiv.g:3214:6: lv_states_11_0= ruleDState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getStatesDStateParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalDiv.g:3231:4: (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==29) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalDiv.g:3232:5: otherlv_12= ',' ( (lv_states_13_0= ruleDState ) )
                    	    {
                    	    otherlv_12=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getDimEntityTypeAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:3236:5: ( (lv_states_13_0= ruleDState ) )
                    	    // InternalDiv.g:3237:6: (lv_states_13_0= ruleDState )
                    	    {
                    	    // InternalDiv.g:3237:6: (lv_states_13_0= ruleDState )
                    	    // InternalDiv.g:3238:7: lv_states_13_0= ruleDState
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getStatesDStateParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_6_4());
                      			
                    }
                    // InternalDiv.g:3260:4: (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==48) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalDiv.g:3261:5: otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}'
                            {
                            otherlv_15=(Token)match(input,48,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getDimEntityTypeAccess().getEventsKeyword_6_5_0());
                              				
                            }
                            otherlv_16=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_6_5_1());
                              				
                            }
                            // InternalDiv.g:3269:5: ( (lv_events_17_0= ruleDStateEvent ) )
                            // InternalDiv.g:3270:6: (lv_events_17_0= ruleDStateEvent )
                            {
                            // InternalDiv.g:3270:6: (lv_events_17_0= ruleDStateEvent )
                            // InternalDiv.g:3271:7: lv_events_17_0= ruleDStateEvent
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getEventsDStateEventParserRuleCall_6_5_2_0());
                              						
                            }
                            pushFollow(FOLLOW_44);
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

                            // InternalDiv.g:3288:5: (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==29) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // InternalDiv.g:3289:6: otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) )
                            	    {
                            	    otherlv_18=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_18, grammarAccess.getDimEntityTypeAccess().getCommaKeyword_6_5_3_0());
                            	      					
                            	    }
                            	    // InternalDiv.g:3293:6: ( (lv_events_19_0= ruleDStateEvent ) )
                            	    // InternalDiv.g:3294:7: (lv_events_19_0= ruleDStateEvent )
                            	    {
                            	    // InternalDiv.g:3294:7: (lv_events_19_0= ruleDStateEvent )
                            	    // InternalDiv.g:3295:8: lv_events_19_0= ruleDStateEvent
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDimEntityTypeAccess().getEventsDStateEventParserRuleCall_6_5_3_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_44);
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
                            	    break loop74;
                                }
                            } while (true);

                            otherlv_20=(Token)match(input,21,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_20, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_6_5_4());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDiv.g:3319:3: ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )*
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_ID||LA77_0==32||LA77_0==50) ) {
                    alt77=1;
                }
                else if ( (LA77_0==41) ) {
                    alt77=2;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalDiv.g:3320:4: ( (lv_features_21_0= ruleDimFeature ) )
            	    {
            	    // InternalDiv.g:3320:4: ( (lv_features_21_0= ruleDimFeature ) )
            	    // InternalDiv.g:3321:5: (lv_features_21_0= ruleDimFeature )
            	    {
            	    // InternalDiv.g:3321:5: (lv_features_21_0= ruleDimFeature )
            	    // InternalDiv.g:3322:6: lv_features_21_0= ruleDimFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getFeaturesDimFeatureParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    // InternalDiv.g:3340:4: ( (lv_constraints_22_0= ruleDConstraint ) )
            	    {
            	    // InternalDiv.g:3340:4: ( (lv_constraints_22_0= ruleDConstraint ) )
            	    // InternalDiv.g:3341:5: (lv_constraints_22_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:3341:5: (lv_constraints_22_0= ruleDConstraint )
            	    // InternalDiv.g:3342:6: lv_constraints_22_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getConstraintsDConstraintParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    break loop77;
                }
            } while (true);

            otherlv_23=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:3368:1: entryRuleDState returns [EObject current=null] : iv_ruleDState= ruleDState EOF ;
    public final EObject entryRuleDState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDState = null;


        try {
            // InternalDiv.g:3368:47: (iv_ruleDState= ruleDState EOF )
            // InternalDiv.g:3369:2: iv_ruleDState= ruleDState EOF
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
    // InternalDiv.g:3375:1: ruleDState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:3381:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:3382:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:3382:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3383:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3383:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3384:4: lv_name_0_0= RULE_ID
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
    // InternalDiv.g:3403:1: entryRuleDStateEvent returns [EObject current=null] : iv_ruleDStateEvent= ruleDStateEvent EOF ;
    public final EObject entryRuleDStateEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStateEvent = null;


        try {
            // InternalDiv.g:3403:52: (iv_ruleDStateEvent= ruleDStateEvent EOF )
            // InternalDiv.g:3404:2: iv_ruleDStateEvent= ruleDStateEvent EOF
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
    // InternalDiv.g:3410:1: ruleDStateEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDStateEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:3416:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:3417:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:3417:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3418:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3418:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3419:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleDimDetailType"
    // InternalDiv.g:3438:1: entryRuleDimDetailType returns [EObject current=null] : iv_ruleDimDetailType= ruleDimDetailType EOF ;
    public final EObject entryRuleDimDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimDetailType = null;


        try {
            // InternalDiv.g:3438:54: (iv_ruleDimDetailType= ruleDimDetailType EOF )
            // InternalDiv.g:3439:2: iv_ruleDimDetailType= ruleDimDetailType EOF
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
    // InternalDiv.g:3445:1: ruleDimDetailType returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) ;
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
            // InternalDiv.g:3451:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) )
            // InternalDiv.g:3452:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            {
            // InternalDiv.g:3452:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            // InternalDiv.g:3453:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}'
            {
            // InternalDiv.g:3453:3: ()
            // InternalDiv.g:3454:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimDetailTypeAccess().getDimDetailTypeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3460:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==45) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalDiv.g:3461:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalDiv.g:3461:4: (lv_abstract_1_0= 'abstract' )
                    // InternalDiv.g:3462:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,45,FOLLOW_24); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDimDetailTypeAccess().getDetailKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDimDetailTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDimDetailTypeAccess().getDimComplexTypeParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_7);
            this_DimComplexType_3=ruleDimComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DimComplexType_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimDetailTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDiv.g:3493:3: ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )*
            loop79:
            do {
                int alt79=3;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_ID||LA79_0==32||LA79_0==50) ) {
                    alt79=1;
                }
                else if ( (LA79_0==41) ) {
                    alt79=2;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalDiv.g:3494:4: ( (lv_features_5_0= ruleDimFeature ) )
            	    {
            	    // InternalDiv.g:3494:4: ( (lv_features_5_0= ruleDimFeature ) )
            	    // InternalDiv.g:3495:5: (lv_features_5_0= ruleDimFeature )
            	    {
            	    // InternalDiv.g:3495:5: (lv_features_5_0= ruleDimFeature )
            	    // InternalDiv.g:3496:6: lv_features_5_0= ruleDimFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimDetailTypeAccess().getFeaturesDimFeatureParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    // InternalDiv.g:3514:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    {
            	    // InternalDiv.g:3514:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    // InternalDiv.g:3515:5: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:3515:5: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDiv.g:3516:6: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimDetailTypeAccess().getConstraintsDConstraintParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    break loop79;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:3543:1: ruleDimComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:3549:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3550:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3550:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:3551:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3551:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3552:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3552:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3553:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
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

            // InternalDiv.g:3569:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==42) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalDiv.g:3570:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDimComplexTypeAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDiv.g:3574:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDiv.g:3575:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3575:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDiv.g:3576:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDimComplexTypeAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDimComplexTypeRule());
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
            	    break loop80;
                }
            } while (true);

            // InternalDiv.g:3593:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==49) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalDiv.g:3594:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:3598:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDiv.g:3599:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDiv.g:3599:5: (otherlv_4= RULE_ID )
                    // InternalDiv.g:3600:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDimComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:3612:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_PLAIN_TEXT_ONLY && LA82_0<=RULE_RICH_TEXT_START)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDiv.g:3613:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:3613:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:3614:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimComplexTypeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDiv.g:3635:1: entryRuleDimFeature returns [EObject current=null] : iv_ruleDimFeature= ruleDimFeature EOF ;
    public final EObject entryRuleDimFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimFeature = null;


        try {
            // InternalDiv.g:3635:51: (iv_ruleDimFeature= ruleDimFeature EOF )
            // InternalDiv.g:3636:2: iv_ruleDimFeature= ruleDimFeature EOF
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
    // InternalDiv.g:3642:1: ruleDimFeature returns [EObject current=null] : (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery ) ;
    public final EObject ruleDimFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DimAssociation_0 = null;

        EObject this_DimAttribute_1 = null;

        EObject this_DimQuery_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:3648:2: ( (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery ) )
            // InternalDiv.g:3649:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )
            {
            // InternalDiv.g:3649:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )
            int alt83=3;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalDiv.g:3650:3: this_DimAssociation_0= ruleDimAssociation
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
                    // InternalDiv.g:3659:3: this_DimAttribute_1= ruleDimAttribute
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
                    // InternalDiv.g:3668:3: this_DimQuery_2= ruleDimQuery
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
    // InternalDiv.g:3680:1: entryRuleDimAssociation returns [EObject current=null] : iv_ruleDimAssociation= ruleDimAssociation EOF ;
    public final EObject entryRuleDimAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAssociation = null;


        try {
            // InternalDiv.g:3680:55: (iv_ruleDimAssociation= ruleDimAssociation EOF )
            // InternalDiv.g:3681:2: iv_ruleDimAssociation= ruleDimAssociation EOF
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
    // InternalDiv.g:3687:1: ruleDimAssociation returns [EObject current=null] : ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_derived_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_kind_5_0 = null;

        Enumerator lv_kind_6_0 = null;

        EObject lv_multiplicity_9_0 = null;

        EObject lv_description_10_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:3693:2: ( ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3694:2: ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3694:2: ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            // InternalDiv.g:3695:3: () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3695:3: ()
            // InternalDiv.g:3696:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAssociationAccess().getDimAssociationAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3702:3: ( (lv_derived_1_0= 'derived' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==50) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDiv.g:3703:4: (lv_derived_1_0= 'derived' )
                    {
                    // InternalDiv.g:3703:4: (lv_derived_1_0= 'derived' )
                    // InternalDiv.g:3704:5: lv_derived_1_0= 'derived'
                    {
                    lv_derived_1_0=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
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

            // InternalDiv.g:3716:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:3717:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:3717:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:3718:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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

            // InternalDiv.g:3734:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==42) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalDiv.g:3735:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimAssociationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:3739:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:3740:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3740:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:3741:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDimAssociationAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDimAssociationRule());
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
            	    break loop85;
                }
            } while (true);

            // InternalDiv.g:3758:3: ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==51||LA86_0==92) ) {
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
                    // InternalDiv.g:3759:4: ( (lv_kind_5_0= ruleDAssociationKind ) )
                    {
                    // InternalDiv.g:3759:4: ( (lv_kind_5_0= ruleDAssociationKind ) )
                    // InternalDiv.g:3760:5: (lv_kind_5_0= ruleDAssociationKind )
                    {
                    // InternalDiv.g:3760:5: (lv_kind_5_0= ruleDAssociationKind )
                    // InternalDiv.g:3761:6: lv_kind_5_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimAssociationAccess().getKindDAssociationKindEnumRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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
                    // InternalDiv.g:3779:4: ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' )
                    {
                    // InternalDiv.g:3779:4: ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' )
                    // InternalDiv.g:3780:5: ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains'
                    {
                    // InternalDiv.g:3780:5: ( (lv_kind_6_0= ruleDAssociationKindInverse ) )
                    // InternalDiv.g:3781:6: (lv_kind_6_0= ruleDAssociationKindInverse )
                    {
                    // InternalDiv.g:3781:6: (lv_kind_6_0= ruleDAssociationKindInverse )
                    // InternalDiv.g:3782:7: lv_kind_6_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDimAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
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

                    otherlv_7=(Token)match(input,51,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getDimAssociationAccess().getContainsKeyword_4_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3805:3: ( (otherlv_8= RULE_ID ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==EOF||(LA87_1>=RULE_ID && LA87_1<=RULE_RICH_TEXT_START)||LA87_1==21||LA87_1==32||LA87_1==38||LA87_1==41||LA87_1==50||LA87_1==87||LA87_1==128) ) {
                    alt87=1;
                }
                else if ( (LA87_1==37) ) {
                    int LA87_4 = input.LA(3);

                    if ( (LA87_4==RULE_NATURAL) ) {
                        alt87=1;
                    }
                }
            }
            switch (alt87) {
                case 1 :
                    // InternalDiv.g:3806:4: (otherlv_8= RULE_ID )
                    {
                    // InternalDiv.g:3806:4: (otherlv_8= RULE_ID )
                    // InternalDiv.g:3807:5: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAssociationRule());
                      					}
                      				
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getDimAssociationAccess().getTypeDEntityTypeCrossReference_5_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3818:3: ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=37 && LA88_0<=38)||LA88_0==87||LA88_0==128) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalDiv.g:3819:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:3819:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    // InternalDiv.g:3820:5: lv_multiplicity_9_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
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

            // InternalDiv.g:3837:3: ( (lv_description_10_0= ruleDRichText ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=RULE_PLAIN_TEXT_ONLY && LA89_0<=RULE_RICH_TEXT_START)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalDiv.g:3838:4: (lv_description_10_0= ruleDRichText )
                    {
                    // InternalDiv.g:3838:4: (lv_description_10_0= ruleDRichText )
                    // InternalDiv.g:3839:5: lv_description_10_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAssociationAccess().getDescriptionDRichTextParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDiv.g:3860:1: entryRuleDimAttribute returns [EObject current=null] : iv_ruleDimAttribute= ruleDimAttribute EOF ;
    public final EObject entryRuleDimAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAttribute = null;


        try {
            // InternalDiv.g:3860:53: (iv_ruleDimAttribute= ruleDimAttribute EOF )
            // InternalDiv.g:3861:2: iv_ruleDimAttribute= ruleDimAttribute EOF
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
    // InternalDiv.g:3867:1: ruleDimAttribute returns [EObject current=null] : ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_detail_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_key_8_0=null;
        EObject lv_multiplicity_7_0 = null;

        EObject lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:3873:2: ( ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3874:2: ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3874:2: ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDiv.g:3875:3: () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3875:3: ()
            // InternalDiv.g:3876:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAttributeAccess().getDimAttributeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3882:3: ( (lv_detail_1_0= 'detail' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==32) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalDiv.g:3883:4: (lv_detail_1_0= 'detail' )
                    {
                    // InternalDiv.g:3883:4: (lv_detail_1_0= 'detail' )
                    // InternalDiv.g:3884:5: lv_detail_1_0= 'detail'
                    {
                    lv_detail_1_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
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

            // InternalDiv.g:3896:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:3897:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:3897:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:3898:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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

            // InternalDiv.g:3914:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==42) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalDiv.g:3915:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimAttributeAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:3919:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:3920:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3920:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:3921:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDimAttributeAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDimAttributeRule());
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
            	    break loop91;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDimAttributeAccess().getColonKeyword_4());
              		
            }
            // InternalDiv.g:3942:3: ( (otherlv_6= RULE_ID ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==37) ) {
                    int LA92_3 = input.LA(3);

                    if ( (LA92_3==RULE_NATURAL) ) {
                        alt92=1;
                    }
                }
                else if ( (LA92_1==EOF||(LA92_1>=RULE_ID && LA92_1<=RULE_RICH_TEXT_START)||LA92_1==21||LA92_1==32||LA92_1==38||LA92_1==41||LA92_1==50||LA92_1==52||LA92_1==87||LA92_1==128) ) {
                    alt92=1;
                }
            }
            switch (alt92) {
                case 1 :
                    // InternalDiv.g:3943:4: (otherlv_6= RULE_ID )
                    {
                    // InternalDiv.g:3943:4: (otherlv_6= RULE_ID )
                    // InternalDiv.g:3944:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAttributeRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDimAttributeAccess().getTypeDTypeCrossReference_5_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3955:3: ( (lv_multiplicity_7_0= ruleDMultiplicity ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=37 && LA93_0<=38)||LA93_0==87||LA93_0==128) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalDiv.g:3956:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:3956:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    // InternalDiv.g:3957:5: lv_multiplicity_7_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_54);
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

            // InternalDiv.g:3974:3: ( (lv_key_8_0= 'key' ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==52) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalDiv.g:3975:4: (lv_key_8_0= 'key' )
                    {
                    // InternalDiv.g:3975:4: (lv_key_8_0= 'key' )
                    // InternalDiv.g:3976:5: lv_key_8_0= 'key'
                    {
                    lv_key_8_0=(Token)match(input,52,FOLLOW_21); if (state.failed) return current;
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

            // InternalDiv.g:3988:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=RULE_PLAIN_TEXT_ONLY && LA95_0<=RULE_RICH_TEXT_START)) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalDiv.g:3989:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:3989:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:3990:5: lv_description_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAttributeAccess().getDescriptionDRichTextParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDiv.g:4011:1: entryRuleDimQuery returns [EObject current=null] : iv_ruleDimQuery= ruleDimQuery EOF ;
    public final EObject entryRuleDimQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimQuery = null;


        try {
            // InternalDiv.g:4011:49: (iv_ruleDimQuery= ruleDimQuery EOF )
            // InternalDiv.g:4012:2: iv_ruleDimQuery= ruleDimQuery EOF
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
    // InternalDiv.g:4018:1: ruleDimQuery returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimQuery() throws RecognitionException {
        EObject current = null;

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
            // InternalDiv.g:4024:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ) )
            // InternalDiv.g:4025:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:4025:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? )
            // InternalDiv.g:4026:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )?
            {
            // InternalDiv.g:4026:3: ()
            // InternalDiv.g:4027:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimQueryAccess().getDimQueryAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:4033:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4034:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4034:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4035:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
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

            // InternalDiv.g:4051:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==42) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalDiv.g:4052:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDimQueryAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:4056:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:4057:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:4057:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:4058:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDimQueryAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDimQueryRule());
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
            	    break loop96;
                }
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimQueryAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalDiv.g:4079:3: ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalDiv.g:4080:4: ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )*
                    {
                    // InternalDiv.g:4080:4: ( (lv_parameters_5_0= ruleDimQueryParameter ) )
                    // InternalDiv.g:4081:5: (lv_parameters_5_0= ruleDimQueryParameter )
                    {
                    // InternalDiv.g:4081:5: (lv_parameters_5_0= ruleDimQueryParameter )
                    // InternalDiv.g:4082:6: lv_parameters_5_0= ruleDimQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimQueryAccess().getParametersDimQueryParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
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

                    // InternalDiv.g:4099:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==29) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalDiv.g:4100:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getDimQueryAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:4104:5: ( (lv_parameters_7_0= ruleDimQueryParameter ) )
                    	    // InternalDiv.g:4105:6: (lv_parameters_7_0= ruleDimQueryParameter )
                    	    {
                    	    // InternalDiv.g:4105:6: (lv_parameters_7_0= ruleDimQueryParameter )
                    	    // InternalDiv.g:4106:7: lv_parameters_7_0= ruleDimQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimQueryAccess().getParametersDimQueryParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,39,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimQueryAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,43,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDimQueryAccess().getColonKeyword_6());
              		
            }
            // InternalDiv.g:4133:3: ( (otherlv_10= RULE_ID ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==37) ) {
                    int LA99_3 = input.LA(3);

                    if ( (LA99_3==RULE_NATURAL) ) {
                        alt99=1;
                    }
                }
                else if ( (LA99_1==EOF||(LA99_1>=RULE_ID && LA99_1<=RULE_RICH_TEXT_START)||LA99_1==21||LA99_1==25||LA99_1==28||(LA99_1>=31 && LA99_1<=32)||LA99_1==36||LA99_1==38||LA99_1==41||(LA99_1>=45 && LA99_1<=46)||LA99_1==50||LA99_1==53||LA99_1==87||(LA99_1>=90 && LA99_1<=91)||LA99_1==128) ) {
                    alt99=1;
                }
            }
            switch (alt99) {
                case 1 :
                    // InternalDiv.g:4134:4: (otherlv_10= RULE_ID )
                    {
                    // InternalDiv.g:4134:4: (otherlv_10= RULE_ID )
                    // InternalDiv.g:4135:5: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimQueryRule());
                      					}
                      				
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getDimQueryAccess().getTypeDTypeCrossReference_7_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:4146:3: ( (lv_multiplicity_11_0= ruleDMultiplicity ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=37 && LA100_0<=38)||LA100_0==87||LA100_0==128) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalDiv.g:4147:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4147:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    // InternalDiv.g:4148:5: lv_multiplicity_11_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryAccess().getMultiplicityDMultiplicityParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_60);
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

            // InternalDiv.g:4165:3: (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==53) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalDiv.g:4166:4: otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) )
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDimQueryAccess().getReturnsKeyword_9_0());
                      			
                    }
                    // InternalDiv.g:4170:4: ( (lv_returns_13_0= ruleDExpression ) )
                    // InternalDiv.g:4171:5: (lv_returns_13_0= ruleDExpression )
                    {
                    // InternalDiv.g:4171:5: (lv_returns_13_0= ruleDExpression )
                    // InternalDiv.g:4172:6: lv_returns_13_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimQueryAccess().getReturnsDExpressionParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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

            // InternalDiv.g:4190:3: ( (lv_description_14_0= ruleDRichText ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=RULE_PLAIN_TEXT_ONLY && LA102_0<=RULE_RICH_TEXT_START)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDiv.g:4191:4: (lv_description_14_0= ruleDRichText )
                    {
                    // InternalDiv.g:4191:4: (lv_description_14_0= ruleDRichText )
                    // InternalDiv.g:4192:5: lv_description_14_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryAccess().getDescriptionDRichTextParserRuleCall_10_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDiv.g:4213:1: entryRuleDimQueryParameter returns [EObject current=null] : iv_ruleDimQueryParameter= ruleDimQueryParameter EOF ;
    public final EObject entryRuleDimQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimQueryParameter = null;


        try {
            // InternalDiv.g:4213:58: (iv_ruleDimQueryParameter= ruleDimQueryParameter EOF )
            // InternalDiv.g:4214:2: iv_ruleDimQueryParameter= ruleDimQueryParameter EOF
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
    // InternalDiv.g:4220:1: ruleDimQueryParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4226:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:4227:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:4227:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:4228:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:4228:3: ()
            // InternalDiv.g:4229:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimQueryParameterAccess().getDimQueryParameterAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:4235:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4236:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4236:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4237:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,43,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDimQueryParameterAccess().getColonKeyword_2());
              		
            }
            // InternalDiv.g:4257:3: ( (otherlv_3= RULE_ID ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_ID) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalDiv.g:4258:4: (otherlv_3= RULE_ID )
                    {
                    // InternalDiv.g:4258:4: (otherlv_3= RULE_ID )
                    // InternalDiv.g:4259:5: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimQueryParameterRule());
                      					}
                      				
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDimQueryParameterAccess().getTypeDTypeCrossReference_3_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:4270:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=37 && LA104_0<=38)||LA104_0==87||LA104_0==128) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalDiv.g:4271:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4271:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDiv.g:4272:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
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

            // InternalDiv.g:4289:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=RULE_PLAIN_TEXT_ONLY && LA105_0<=RULE_RICH_TEXT_START)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalDiv.g:4290:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:4290:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:4291:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryParameterAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleDImport"
    // InternalDiv.g:4312:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDiv.g:4312:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDiv.g:4313:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDiv.g:4319:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4325:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDiv.g:4326:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDiv.g:4326:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDiv.g:4327:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDiv.g:4331:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDiv.g:4332:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDiv.g:4332:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDiv.g:4333:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalDiv.g:4354:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalDiv.g:4354:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalDiv.g:4355:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalDiv.g:4361:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalDiv.g:4367:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalDiv.g:4368:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalDiv.g:4368:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalDiv.g:4369:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalDiv.g:4373:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4374:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4374:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4375:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
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

            // InternalDiv.g:4391:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==56) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalDiv.g:4392:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:4396:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalDiv.g:4397:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalDiv.g:4397:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalDiv.g:4398:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
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

                    // InternalDiv.g:4415:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==29) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalDiv.g:4416:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:4420:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalDiv.g:4421:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalDiv.g:4421:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalDiv.g:4422:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_62);
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
                    	    break loop106;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDiv.g:4445:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalDiv.g:4446:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalDiv.g:4446:4: (lv_expr_7_0= ruleDExpression )
            // InternalDiv.g:4447:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:4472:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalDiv.g:4472:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalDiv.g:4473:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalDiv.g:4479:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalDiv.g:4485:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalDiv.g:4486:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalDiv.g:4486:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalDiv.g:4487:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalDiv.g:4487:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:4488:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:4488:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:4489:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalDiv.g:4509:3: ( (otherlv_2= RULE_ID ) )
            // InternalDiv.g:4510:4: (otherlv_2= RULE_ID )
            {
            // InternalDiv.g:4510:4: (otherlv_2= RULE_ID )
            // InternalDiv.g:4511:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDiv.g:4522:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( ((LA108_0>=37 && LA108_0<=38)||LA108_0==87||LA108_0==128) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalDiv.g:4523:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4523:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDiv.g:4524:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_65);
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

            // InternalDiv.g:4541:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==57) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalDiv.g:4542:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalDiv.g:4546:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( ((LA109_0>=RULE_NATURAL && LA109_0<=RULE_STRING)||(LA109_0>=31 && LA109_0<=32)||(LA109_0>=79 && LA109_0<=84)) ) {
                        alt109=1;
                    }
                    else if ( (LA109_0==20) ) {
                        alt109=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 109, 0, input);

                        throw nvae;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalDiv.g:4547:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalDiv.g:4547:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalDiv.g:4548:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalDiv.g:4548:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalDiv.g:4549:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalDiv.g:4567:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalDiv.g:4567:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalDiv.g:4568:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalDiv.g:4568:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalDiv.g:4569:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalDiv.g:4592:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalDiv.g:4592:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalDiv.g:4593:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalDiv.g:4599:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalDiv.g:4605:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalDiv.g:4606:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalDiv.g:4606:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalDiv.g:4607:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalDiv.g:4607:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:4608:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:4608:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:4609:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,58,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:4633:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalDiv.g:4634:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalDiv.g:4634:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalDiv.g:4635:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_69);
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

            // InternalDiv.g:4652:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt111=0;
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==29) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalDiv.g:4653:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDiv.g:4657:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalDiv.g:4658:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalDiv.g:4658:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalDiv.g:4659:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    if ( cnt111 >= 1 ) break loop111;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(111, input);
                        throw eee;
                }
                cnt111++;
            } while (true);

            otherlv_6=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:4685:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalDiv.g:4685:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalDiv.g:4686:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalDiv.g:4692:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4698:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDiv.g:4699:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:4699:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDiv.g:4700:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDiv.g:4704:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4705:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4705:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4706:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,60,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalDiv.g:4726:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalDiv.g:4727:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalDiv.g:4727:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalDiv.g:4728:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            // InternalDiv.g:4745:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=RULE_PLAIN_TEXT_ONLY && LA112_0<=RULE_RICH_TEXT_START)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalDiv.g:4746:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:4746:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:4747:5: lv_description_4_0= ruleDRichText
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
    // InternalDiv.g:4768:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalDiv.g:4768:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalDiv.g:4769:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalDiv.g:4775:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalDiv.g:4781:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalDiv.g:4782:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalDiv.g:4782:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalDiv.g:4783:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalDiv.g:4787:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4788:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4788:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4789:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,37,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:4809:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_ID) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalDiv.g:4810:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalDiv.g:4810:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalDiv.g:4811:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalDiv.g:4811:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalDiv.g:4812:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
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

                    // InternalDiv.g:4829:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==29) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalDiv.g:4830:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:4834:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalDiv.g:4835:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalDiv.g:4835:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalDiv.g:4836:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,43,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalDiv.g:4863:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDiv.g:4864:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDiv.g:4864:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalDiv.g:4865:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
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

            // InternalDiv.g:4882:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==62) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalDiv.g:4883:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalDiv.g:4887:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalDiv.g:4888:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalDiv.g:4888:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalDiv.g:4889:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalDiv.g:4911:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalDiv.g:4911:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalDiv.g:4912:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalDiv.g:4918:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4924:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalDiv.g:4925:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalDiv.g:4925:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalDiv.g:4926:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalDiv.g:4926:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( ((LA116_0>=94 && LA116_0<=104)) ) {
                alt116=1;
            }
            else if ( (LA116_0==RULE_ID) ) {
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
                    // InternalDiv.g:4927:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalDiv.g:4927:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalDiv.g:4928:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalDiv.g:4928:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalDiv.g:4929:6: lv_single_0_0= ruleDmxBaseType
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
                    // InternalDiv.g:4947:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDiv.g:4947:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDiv.g:4948:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDiv.g:4948:5: (otherlv_1= RULE_ID )
                    // InternalDiv.g:4949:6: otherlv_1= RULE_ID
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

            // InternalDiv.g:4961:3: ( (lv_collection_2_0= '*' ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==38) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalDiv.g:4962:4: (lv_collection_2_0= '*' )
                    {
                    // InternalDiv.g:4962:4: (lv_collection_2_0= '*' )
                    // InternalDiv.g:4963:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:4979:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalDiv.g:4979:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalDiv.g:4980:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalDiv.g:4986:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4992:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalDiv.g:4993:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalDiv.g:4993:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalDiv.g:4994:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalDiv.g:4994:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:4995:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:4995:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:4996:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,43,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDiv.g:5016:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDiv.g:5017:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDiv.g:5017:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalDiv.g:5018:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalDiv.g:5039:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDiv.g:5039:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDiv.g:5040:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDiv.g:5046:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:5052:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalDiv.g:5053:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalDiv.g:5053:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt118=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==EOF||(LA118_1>=RULE_ID && LA118_1<=RULE_RICH_TEXT_END)||(LA118_1>=21 && LA118_1<=23)||(LA118_1>=25 && LA118_1<=29)||(LA118_1>=31 && LA118_1<=32)||(LA118_1>=36 && LA118_1<=39)||LA118_1==41||(LA118_1>=45 && LA118_1<=46)||LA118_1==50||LA118_1==58||(LA118_1>=63 && LA118_1<=69)||(LA118_1>=75 && LA118_1<=78)||(LA118_1>=87 && LA118_1<=88)||(LA118_1>=90 && LA118_1<=91)||(LA118_1>=105 && LA118_1<=124)) ) {
                    alt118=2;
                }
                else if ( (LA118_1==57) ) {
                    alt118=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 118, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
            case RULE_STRING:
            case 20:
            case 31:
            case 32:
            case 37:
            case 70:
            case 74:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 87:
            case 88:
            case 125:
            case 126:
            case 127:
                {
                alt118=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_RICH_TEXT_START:
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
                    // InternalDiv.g:5054:3: this_DmxAssignment_0= ruleDmxAssignment
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
                    // InternalDiv.g:5063:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
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
                    // InternalDiv.g:5072:3: this_DRichText_2= ruleDRichText
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
    // InternalDiv.g:5084:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDiv.g:5084:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDiv.g:5085:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDiv.g:5091:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalDiv.g:5097:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalDiv.g:5098:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalDiv.g:5098:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt120=1;
            }
            else if ( (LA120_0==RULE_RICH_TEXT_START) ) {
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
                    // InternalDiv.g:5099:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalDiv.g:5099:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalDiv.g:5100:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalDiv.g:5100:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalDiv.g:5101:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalDiv.g:5119:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalDiv.g:5119:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalDiv.g:5120:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalDiv.g:5120:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalDiv.g:5121:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalDiv.g:5121:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalDiv.g:5122:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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

                    // InternalDiv.g:5139:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDiv.g:5140:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDiv.g:5140:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDiv.g:5141:6: lv_segments_2_0= ruleDExpression
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

                    // InternalDiv.g:5158:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalDiv.g:5159:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDiv.g:5159:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalDiv.g:5160:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalDiv.g:5160:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalDiv.g:5161:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
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

                    	    // InternalDiv.g:5178:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDiv.g:5179:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:5179:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDiv.g:5180:7: lv_segments_4_0= ruleDExpression
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
                    	    break loop119;
                        }
                    } while (true);

                    // InternalDiv.g:5198:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalDiv.g:5199:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalDiv.g:5199:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalDiv.g:5200:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalDiv.g:5222:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalDiv.g:5222:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalDiv.g:5223:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalDiv.g:5229:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5235:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDiv.g:5236:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDiv.g:5236:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDiv.g:5237:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDiv.g:5237:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDiv.g:5238:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDiv.g:5257:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalDiv.g:5257:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalDiv.g:5258:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalDiv.g:5264:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5270:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalDiv.g:5271:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalDiv.g:5271:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalDiv.g:5272:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalDiv.g:5272:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalDiv.g:5273:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalDiv.g:5292:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalDiv.g:5292:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalDiv.g:5293:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalDiv.g:5299:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5305:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalDiv.g:5306:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalDiv.g:5306:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalDiv.g:5307:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalDiv.g:5307:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalDiv.g:5308:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalDiv.g:5327:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalDiv.g:5327:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalDiv.g:5328:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalDiv.g:5334:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5340:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalDiv.g:5341:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalDiv.g:5341:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalDiv.g:5342:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalDiv.g:5342:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalDiv.g:5343:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalDiv.g:5362:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalDiv.g:5362:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalDiv.g:5363:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalDiv.g:5369:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDiv.g:5375:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalDiv.g:5376:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalDiv.g:5376:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalDiv.g:5377:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
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
            // InternalDiv.g:5385:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop122:
            do {
                int alt122=3;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==63) ) {
                    int LA122_2 = input.LA(2);

                    if ( (synpred1_InternalDiv()) ) {
                        alt122=1;
                    }
                    else if ( (synpred2_InternalDiv()) ) {
                        alt122=2;
                    }


                }


                switch (alt122) {
            	case 1 :
            	    // InternalDiv.g:5386:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalDiv.g:5386:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalDiv.g:5387:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalDiv.g:5387:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalDiv.g:5388:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalDiv.g:5400:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalDiv.g:5401:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalDiv.g:5401:7: ()
            	    // InternalDiv.g:5402:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDiv.g:5412:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDiv.g:5413:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDiv.g:5413:8: (otherlv_3= RULE_ID )
            	    // InternalDiv.g:5414:9: otherlv_3= RULE_ID
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

            	    // InternalDiv.g:5434:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalDiv.g:5435:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalDiv.g:5435:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalDiv.g:5436:7: lv_value_5_0= ruleDmxOrExpression
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
            	    // InternalDiv.g:5455:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalDiv.g:5455:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalDiv.g:5456:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalDiv.g:5456:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDiv.g:5457:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDiv.g:5463:6: ( () otherlv_7= '.' )
            	    // InternalDiv.g:5464:7: () otherlv_7= '.'
            	    {
            	    // InternalDiv.g:5464:7: ()
            	    // InternalDiv.g:5465:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDiv.g:5477:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDiv.g:5478:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDiv.g:5478:6: (otherlv_8= RULE_ID )
            	    // InternalDiv.g:5479:7: otherlv_8= RULE_ID
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

            	    // InternalDiv.g:5490:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt121=3;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==37) && (synpred3_InternalDiv())) {
            	        alt121=1;
            	    }
            	    else if ( (LA121_0==64) ) {
            	        alt121=2;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // InternalDiv.g:5491:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalDiv.g:5491:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalDiv.g:5492:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalDiv.g:5492:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDiv.g:5493:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDiv.g:5497:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDiv.g:5498:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,37,FOLLOW_79); if (state.failed) return current;
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

            	            // InternalDiv.g:5510:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalDiv.g:5511:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalDiv.g:5511:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalDiv.g:5512:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_30);
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

            	            otherlv_11=(Token)match(input,39,FOLLOW_75); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDiv.g:5535:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalDiv.g:5535:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalDiv.g:5536:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalDiv.g:5536:7: (lv_before_12_0= '@before' )
            	            // InternalDiv.g:5537:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,64,FOLLOW_75); if (state.failed) return current;
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
            	    break loop122;
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
    // InternalDiv.g:5556:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalDiv.g:5556:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalDiv.g:5557:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalDiv.g:5563:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5569:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalDiv.g:5570:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalDiv.g:5570:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalDiv.g:5571:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalDiv.g:5571:3: ()
            // InternalDiv.g:5572:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:5578:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_ID||(LA124_0>=RULE_NATURAL && LA124_0<=RULE_STRING)||LA124_0==20||(LA124_0>=31 && LA124_0<=32)||LA124_0==37||LA124_0==70||LA124_0==74||(LA124_0>=79 && LA124_0<=84)||(LA124_0>=87 && LA124_0<=88)||(LA124_0>=125 && LA124_0<=127)) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalDiv.g:5579:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalDiv.g:5579:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalDiv.g:5580:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalDiv.g:5580:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalDiv.g:5581:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
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

                    // InternalDiv.g:5598:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==29) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalDiv.g:5599:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,29,FOLLOW_77); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:5603:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalDiv.g:5604:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalDiv.g:5604:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalDiv.g:5605:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
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
                    	    break loop123;
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
    // InternalDiv.g:5628:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalDiv.g:5628:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalDiv.g:5629:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
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
    // InternalDiv.g:5635:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5641:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalDiv.g:5642:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalDiv.g:5642:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalDiv.g:5643:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalDiv.g:5643:3: ()
            // InternalDiv.g:5644:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:5650:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:5651:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:5651:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:5652:5: otherlv_1= RULE_ID
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
            // InternalDiv.g:5670:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalDiv.g:5671:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalDiv.g:5671:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalDiv.g:5672:5: lv_value_3_0= ruleDmxOrExpression
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
    // InternalDiv.g:5693:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalDiv.g:5693:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalDiv.g:5694:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalDiv.g:5700:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:5706:2: (kw= ':=' )
            // InternalDiv.g:5707:2: kw= ':='
            {
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:5715:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalDiv.g:5715:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalDiv.g:5716:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalDiv.g:5722:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDiv.g:5728:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalDiv.g:5729:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalDiv.g:5729:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_ID) ) {
                int LA125_1 = input.LA(2);

                if ( (LA125_1==EOF||(LA125_1>=RULE_ID && LA125_1<=RULE_RICH_TEXT_END)||(LA125_1>=21 && LA125_1<=23)||(LA125_1>=25 && LA125_1<=29)||(LA125_1>=31 && LA125_1<=32)||(LA125_1>=36 && LA125_1<=39)||LA125_1==41||(LA125_1>=45 && LA125_1<=46)||LA125_1==50||LA125_1==58||(LA125_1>=63 && LA125_1<=64)||(LA125_1>=66 && LA125_1<=69)||(LA125_1>=75 && LA125_1<=78)||(LA125_1>=87 && LA125_1<=88)||(LA125_1>=90 && LA125_1<=91)||(LA125_1>=105 && LA125_1<=124)) ) {
                    alt125=2;
                }
                else if ( (LA125_1==65) ) {
                    alt125=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA125_0>=RULE_NATURAL && LA125_0<=RULE_STRING)||LA125_0==20||(LA125_0>=31 && LA125_0<=32)||LA125_0==37||LA125_0==70||LA125_0==74||(LA125_0>=79 && LA125_0<=84)||(LA125_0>=87 && LA125_0<=88)||(LA125_0>=125 && LA125_0<=127)) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // InternalDiv.g:5730:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalDiv.g:5730:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalDiv.g:5731:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalDiv.g:5731:4: ()
                    // InternalDiv.g:5732:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDiv.g:5738:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalDiv.g:5739:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalDiv.g:5739:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalDiv.g:5740:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
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
                    // InternalDiv.g:5761:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalDiv.g:5762:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalDiv.g:5762:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalDiv.g:5763:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalDiv.g:5782:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalDiv.g:5794:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalDiv.g:5794:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalDiv.g:5795:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalDiv.g:5801:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5807:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:5808:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:5808:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:5809:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:5809:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:5810:4: lv_name_0_0= RULE_ID
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
    // InternalDiv.g:5829:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalDiv.g:5829:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalDiv.g:5830:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalDiv.g:5836:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5842:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalDiv.g:5843:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalDiv.g:5843:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalDiv.g:5844:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
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
            // InternalDiv.g:5852:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop126:
            do {
                int alt126=2;
                switch ( input.LA(1) ) {
                case 105:
                    {
                    int LA126_2 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA126_3 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA126_4 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA126_5 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;

                }

                switch (alt126) {
            	case 1 :
            	    // InternalDiv.g:5853:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalDiv.g:5853:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalDiv.g:5854:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalDiv.g:5864:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalDiv.g:5865:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalDiv.g:5865:6: ()
            	    // InternalDiv.g:5866:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:5872:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalDiv.g:5873:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalDiv.g:5873:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalDiv.g:5874:8: lv_operator_2_0= ruleDmxOpOr
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

            	    // InternalDiv.g:5893:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalDiv.g:5894:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalDiv.g:5894:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalDiv.g:5895:6: lv_rightOperand_3_0= ruleDmxAndExpression
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
    // $ANTLR end "ruleDmxOrExpression"


    // $ANTLR start "entryRuleDmxAndExpression"
    // InternalDiv.g:5917:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalDiv.g:5917:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalDiv.g:5918:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalDiv.g:5924:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5930:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalDiv.g:5931:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalDiv.g:5931:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalDiv.g:5932:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
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
            // InternalDiv.g:5940:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==109) ) {
                    int LA127_2 = input.LA(2);

                    if ( (synpred5_InternalDiv()) ) {
                        alt127=1;
                    }


                }
                else if ( (LA127_0==110) ) {
                    int LA127_3 = input.LA(2);

                    if ( (synpred5_InternalDiv()) ) {
                        alt127=1;
                    }


                }


                switch (alt127) {
            	case 1 :
            	    // InternalDiv.g:5941:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalDiv.g:5941:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalDiv.g:5942:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalDiv.g:5952:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalDiv.g:5953:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalDiv.g:5953:6: ()
            	    // InternalDiv.g:5954:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:5960:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalDiv.g:5961:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalDiv.g:5961:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalDiv.g:5962:8: lv_operator_2_0= ruleDmxOpAnd
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

            	    // InternalDiv.g:5981:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalDiv.g:5982:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalDiv.g:5982:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalDiv.g:5983:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalDiv.g:6005:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalDiv.g:6005:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalDiv.g:6006:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalDiv.g:6012:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6018:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalDiv.g:6019:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalDiv.g:6019:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalDiv.g:6020:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
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
            // InternalDiv.g:6028:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop128:
            do {
                int alt128=2;
                switch ( input.LA(1) ) {
                case 69:
                    {
                    int LA128_2 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt128=1;
                    }


                    }
                    break;
                case 111:
                    {
                    int LA128_3 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt128=1;
                    }


                    }
                    break;
                case 112:
                    {
                    int LA128_4 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt128=1;
                    }


                    }
                    break;

                }

                switch (alt128) {
            	case 1 :
            	    // InternalDiv.g:6029:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalDiv.g:6029:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalDiv.g:6030:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalDiv.g:6040:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalDiv.g:6041:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalDiv.g:6041:6: ()
            	    // InternalDiv.g:6042:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6048:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalDiv.g:6049:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalDiv.g:6049:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalDiv.g:6050:8: lv_operator_2_0= ruleDmxOpEquality
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

            	    // InternalDiv.g:6069:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalDiv.g:6070:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalDiv.g:6070:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalDiv.g:6071:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
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
    // $ANTLR end "ruleDmxEqualityExpression"


    // $ANTLR start "entryRuleDmxRelationalExpression"
    // InternalDiv.g:6093:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalDiv.g:6093:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalDiv.g:6094:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalDiv.g:6100:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6106:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalDiv.g:6107:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalDiv.g:6107:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalDiv.g:6108:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
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
            // InternalDiv.g:6116:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop129:
            do {
                int alt129=3;
                alt129 = dfa129.predict(input);
                switch (alt129) {
            	case 1 :
            	    // InternalDiv.g:6117:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDiv.g:6117:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDiv.g:6118:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDiv.g:6118:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalDiv.g:6119:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalDiv.g:6125:6: ( () ruleDmxOpInstanceOf )
            	    // InternalDiv.g:6126:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalDiv.g:6126:7: ()
            	    // InternalDiv.g:6127:8: 
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

            	    // InternalDiv.g:6142:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDiv.g:6143:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDiv.g:6143:6: (otherlv_3= RULE_ID )
            	    // InternalDiv.g:6144:7: otherlv_3= RULE_ID
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
            	    // InternalDiv.g:6157:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalDiv.g:6157:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalDiv.g:6158:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalDiv.g:6158:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDiv.g:6159:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDiv.g:6169:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDiv.g:6170:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDiv.g:6170:7: ()
            	    // InternalDiv.g:6171:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDiv.g:6177:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDiv.g:6178:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDiv.g:6178:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDiv.g:6179:9: lv_operator_5_0= ruleOpCompare
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

            	    // InternalDiv.g:6198:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalDiv.g:6199:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalDiv.g:6199:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalDiv.g:6200:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalDiv.g:6223:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalDiv.g:6223:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalDiv.g:6224:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalDiv.g:6230:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:6236:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDiv.g:6237:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDiv.g:6237:2: (kw= 'ISA' | kw= 'isa' )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==66) ) {
                alt130=1;
            }
            else if ( (LA130_0==67) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // InternalDiv.g:6238:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:6244:3: kw= 'isa'
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
    // InternalDiv.g:6253:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalDiv.g:6253:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalDiv.g:6254:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalDiv.g:6260:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6266:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalDiv.g:6267:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalDiv.g:6267:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalDiv.g:6268:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
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
            // InternalDiv.g:6276:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop131:
            do {
                int alt131=2;
                switch ( input.LA(1) ) {
                case 119:
                    {
                    int LA131_2 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt131=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA131_3 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt131=1;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA131_4 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt131=1;
                    }


                    }
                    break;
                case 120:
                    {
                    int LA131_5 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt131=1;
                    }


                    }
                    break;
                case 121:
                    {
                    int LA131_6 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt131=1;
                    }


                    }
                    break;

                }

                switch (alt131) {
            	case 1 :
            	    // InternalDiv.g:6277:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalDiv.g:6277:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDiv.g:6278:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDiv.g:6288:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDiv.g:6289:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDiv.g:6289:6: ()
            	    // InternalDiv.g:6290:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6296:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDiv.g:6297:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDiv.g:6297:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDiv.g:6298:8: lv_operator_2_0= ruleOpOther
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

            	    // InternalDiv.g:6317:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalDiv.g:6318:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalDiv.g:6318:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalDiv.g:6319:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalDiv.g:6341:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalDiv.g:6341:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalDiv.g:6342:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalDiv.g:6348:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6354:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalDiv.g:6355:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalDiv.g:6355:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalDiv.g:6356:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
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
            // InternalDiv.g:6364:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==87) ) {
                    int LA132_2 = input.LA(2);

                    if ( (synpred10_InternalDiv()) ) {
                        alt132=1;
                    }


                }
                else if ( (LA132_0==88) ) {
                    int LA132_3 = input.LA(2);

                    if ( (synpred10_InternalDiv()) ) {
                        alt132=1;
                    }


                }


                switch (alt132) {
            	case 1 :
            	    // InternalDiv.g:6365:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalDiv.g:6365:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDiv.g:6366:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDiv.g:6376:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDiv.g:6377:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDiv.g:6377:6: ()
            	    // InternalDiv.g:6378:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6384:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDiv.g:6385:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDiv.g:6385:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDiv.g:6386:8: lv_operator_2_0= ruleOpAdd
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

            	    // InternalDiv.g:6405:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalDiv.g:6406:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalDiv.g:6406:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalDiv.g:6407:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalDiv.g:6429:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalDiv.g:6429:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalDiv.g:6430:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalDiv.g:6436:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6442:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalDiv.g:6443:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalDiv.g:6443:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalDiv.g:6444:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
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
            // InternalDiv.g:6452:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop133:
            do {
                int alt133=2;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA133_2 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt133=1;
                    }


                    }
                    break;
                case 122:
                    {
                    int LA133_3 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt133=1;
                    }


                    }
                    break;
                case 123:
                    {
                    int LA133_4 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt133=1;
                    }


                    }
                    break;
                case 124:
                    {
                    int LA133_5 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt133=1;
                    }


                    }
                    break;

                }

                switch (alt133) {
            	case 1 :
            	    // InternalDiv.g:6453:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalDiv.g:6453:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDiv.g:6454:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDiv.g:6464:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDiv.g:6465:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDiv.g:6465:6: ()
            	    // InternalDiv.g:6466:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6472:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDiv.g:6473:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDiv.g:6473:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDiv.g:6474:8: lv_operator_2_0= ruleOpMulti
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

            	    // InternalDiv.g:6493:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalDiv.g:6494:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalDiv.g:6494:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalDiv.g:6495:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
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
    // $ANTLR end "ruleDmxMultiplicativeExpression"


    // $ANTLR start "entryRuleDmxUnaryOperation"
    // InternalDiv.g:6517:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalDiv.g:6517:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalDiv.g:6518:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalDiv.g:6524:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:6530:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalDiv.g:6531:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalDiv.g:6531:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=87 && LA134_0<=88)||(LA134_0>=125 && LA134_0<=127)) ) {
                alt134=1;
            }
            else if ( (LA134_0==RULE_ID||(LA134_0>=RULE_NATURAL && LA134_0<=RULE_STRING)||LA134_0==20||(LA134_0>=31 && LA134_0<=32)||LA134_0==37||LA134_0==70||LA134_0==74||(LA134_0>=79 && LA134_0<=84)) ) {
                alt134=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // InternalDiv.g:6532:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalDiv.g:6532:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalDiv.g:6533:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalDiv.g:6533:4: ()
                    // InternalDiv.g:6534:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDiv.g:6540:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDiv.g:6541:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDiv.g:6541:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDiv.g:6542:6: lv_operator_1_0= ruleOpUnary
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

                    // InternalDiv.g:6559:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalDiv.g:6560:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalDiv.g:6560:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalDiv.g:6561:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalDiv.g:6580:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalDiv.g:6592:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalDiv.g:6592:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalDiv.g:6593:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalDiv.g:6599:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6605:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDiv.g:6606:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDiv.g:6606:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDiv.g:6607:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
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
            // InternalDiv.g:6615:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==68) ) {
                int LA135_1 = input.LA(2);

                if ( (synpred12_InternalDiv()) ) {
                    alt135=1;
                }
            }
            else if ( (LA135_0==22) ) {
                int LA135_2 = input.LA(2);

                if ( (synpred12_InternalDiv()) ) {
                    alt135=1;
                }
            }
            switch (alt135) {
                case 1 :
                    // InternalDiv.g:6616:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDiv.g:6616:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalDiv.g:6617:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalDiv.g:6623:5: ( () ruleDmxOpCast )
                    // InternalDiv.g:6624:6: () ruleDmxOpCast
                    {
                    // InternalDiv.g:6624:6: ()
                    // InternalDiv.g:6625:7: 
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

                    // InternalDiv.g:6640:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDiv.g:6641:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDiv.g:6641:5: (otherlv_3= RULE_ID )
                    // InternalDiv.g:6642:6: otherlv_3= RULE_ID
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
    // InternalDiv.g:6658:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalDiv.g:6658:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalDiv.g:6659:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalDiv.g:6665:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:6671:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDiv.g:6672:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDiv.g:6672:2: (kw= 'AS' | kw= 'as' )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==68) ) {
                alt136=1;
            }
            else if ( (LA136_0==22) ) {
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
                    // InternalDiv.g:6673:3: kw= 'AS'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:6679:3: kw= 'as'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:6688:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalDiv.g:6688:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalDiv.g:6689:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalDiv.g:6695:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalDiv.g:6701:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalDiv.g:6702:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalDiv.g:6702:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt137=7;
            switch ( input.LA(1) ) {
            case RULE_NATURAL:
            case RULE_STRING:
            case 31:
            case 32:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
                {
                alt137=1;
                }
                break;
            case 37:
                {
                alt137=2;
                }
                break;
            case 20:
                {
                alt137=3;
                }
                break;
            case RULE_ID:
                {
                int LA137_4 = input.LA(2);

                if ( (LA137_4==EOF||(LA137_4>=RULE_ID && LA137_4<=RULE_RICH_TEXT_END)||(LA137_4>=21 && LA137_4<=23)||(LA137_4>=25 && LA137_4<=29)||(LA137_4>=31 && LA137_4<=32)||LA137_4==36||(LA137_4>=38 && LA137_4<=39)||LA137_4==41||(LA137_4>=45 && LA137_4<=46)||LA137_4==50||LA137_4==58||(LA137_4>=63 && LA137_4<=64)||(LA137_4>=66 && LA137_4<=69)||(LA137_4>=75 && LA137_4<=78)||(LA137_4>=87 && LA137_4<=88)||(LA137_4>=90 && LA137_4<=91)||(LA137_4>=105 && LA137_4<=124)) ) {
                    alt137=6;
                }
                else if ( (LA137_4==37) ) {
                    alt137=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 4, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                alt137=5;
                }
                break;
            case 74:
                {
                alt137=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // InternalDiv.g:6703:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalDiv.g:6712:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalDiv.g:6721:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalDiv.g:6730:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalDiv.g:6739:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalDiv.g:6748:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalDiv.g:6757:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalDiv.g:6769:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalDiv.g:6769:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalDiv.g:6770:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalDiv.g:6776:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalDiv.g:6782:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalDiv.g:6783:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalDiv.g:6783:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt138=7;
            alt138 = dfa138.predict(input);
            switch (alt138) {
                case 1 :
                    // InternalDiv.g:6784:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalDiv.g:6793:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalDiv.g:6802:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalDiv.g:6811:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalDiv.g:6820:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalDiv.g:6829:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalDiv.g:6838:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalDiv.g:6850:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalDiv.g:6850:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalDiv.g:6851:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalDiv.g:6857:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:6863:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDiv.g:6864:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDiv.g:6864:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDiv.g:6865:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_30);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:6885:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalDiv.g:6885:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalDiv.g:6886:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalDiv.g:6892:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6898:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDiv.g:6899:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDiv.g:6899:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalDiv.g:6900:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDiv.g:6900:3: ()
            // InternalDiv.g:6901:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDiv.g:6911:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( ((LA140_0>=RULE_ID && LA140_0<=RULE_RICH_TEXT_START)||(LA140_0>=RULE_NATURAL && LA140_0<=RULE_STRING)||LA140_0==20||(LA140_0>=31 && LA140_0<=32)||LA140_0==37||LA140_0==70||LA140_0==74||(LA140_0>=79 && LA140_0<=84)||(LA140_0>=87 && LA140_0<=88)||(LA140_0>=125 && LA140_0<=127)) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalDiv.g:6912:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalDiv.g:6912:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDiv.g:6913:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDiv.g:6913:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDiv.g:6914:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalDiv.g:6931:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==29) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalDiv.g:6932:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:6936:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDiv.g:6937:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:6937:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDiv.g:6938:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop139;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:6965:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalDiv.g:6965:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalDiv.g:6966:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalDiv.g:6972:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6978:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDiv.g:6979:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDiv.g:6979:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalDiv.g:6980:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDiv.g:6980:3: ()
            // InternalDiv.g:6981:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDiv.g:6991:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( ((LA142_0>=RULE_NATURAL && LA142_0<=RULE_STRING)||(LA142_0>=31 && LA142_0<=32)||(LA142_0>=79 && LA142_0<=84)) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalDiv.g:6992:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalDiv.g:6992:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalDiv.g:6993:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalDiv.g:6993:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalDiv.g:6994:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalDiv.g:7011:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==29) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalDiv.g:7012:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_92); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:7016:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalDiv.g:7017:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalDiv.g:7017:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalDiv.g:7018:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop141;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7045:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalDiv.g:7045:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalDiv.g:7046:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalDiv.g:7052:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7058:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalDiv.g:7059:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalDiv.g:7059:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalDiv.g:7060:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalDiv.g:7060:3: ()
            // InternalDiv.g:7061:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7067:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:7068:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:7068:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:7069:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:7084:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalDiv.g:7085:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalDiv.g:7085:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalDiv.g:7086:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7111:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalDiv.g:7111:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalDiv.g:7112:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalDiv.g:7118:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7124:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalDiv.g:7125:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalDiv.g:7125:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalDiv.g:7126:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalDiv.g:7126:3: ()
            // InternalDiv.g:7127:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7133:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( ((LA144_0>=RULE_ID && LA144_0<=RULE_RICH_TEXT_START)||(LA144_0>=RULE_NATURAL && LA144_0<=RULE_STRING)||LA144_0==20||(LA144_0>=31 && LA144_0<=32)||LA144_0==37||LA144_0==70||LA144_0==74||(LA144_0>=79 && LA144_0<=84)||(LA144_0>=87 && LA144_0<=88)||(LA144_0>=125 && LA144_0<=127)) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalDiv.g:7134:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalDiv.g:7134:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalDiv.g:7135:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalDiv.g:7135:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalDiv.g:7136:6: lv_arguments_1_0= ruleDExpression
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

                    // InternalDiv.g:7153:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==29) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // InternalDiv.g:7154:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,29,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:7158:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalDiv.g:7159:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:7159:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalDiv.g:7160:7: lv_arguments_3_0= ruleDExpression
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
                    	    break loop143;
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
    // InternalDiv.g:7183:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalDiv.g:7183:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalDiv.g:7184:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalDiv.g:7190:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:7196:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDiv.g:7197:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDiv.g:7197:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDiv.g:7198:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
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
    // InternalDiv.g:7217:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalDiv.g:7217:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalDiv.g:7218:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalDiv.g:7224:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:7230:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDiv.g:7231:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDiv.g:7231:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDiv.g:7232:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
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
    // InternalDiv.g:7252:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7258:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalDiv.g:7259:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalDiv.g:7259:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalDiv.g:7260:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalDiv.g:7260:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:7261:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:7261:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:7262:5: otherlv_0= RULE_ID
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
            pushFollow(FOLLOW_94);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:7280:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==RULE_ID) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // InternalDiv.g:7281:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalDiv.g:7281:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalDiv.g:7282:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_94);
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
            	    break loop145;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7307:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalDiv.g:7307:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalDiv.g:7308:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalDiv.g:7314:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7320:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalDiv.g:7321:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalDiv.g:7321:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalDiv.g:7322:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalDiv.g:7322:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:7323:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:7323:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:7324:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalDiv.g:7339:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalDiv.g:7340:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalDiv.g:7340:4: (lv_value_2_0= ruleDExpression )
            // InternalDiv.g:7341:5: lv_value_2_0= ruleDExpression
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
    // InternalDiv.g:7362:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalDiv.g:7362:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalDiv.g:7363:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalDiv.g:7369:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalDiv.g:7375:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalDiv.g:7376:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalDiv.g:7376:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalDiv.g:7377:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalDiv.g:7377:3: ()
            // InternalDiv.g:7378:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalDiv.g:7388:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:7389:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:7389:4: ( ruleDQualifiedName )
            // InternalDiv.g:7390:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_96);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDiv.g:7404:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==71) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalDiv.g:7405:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:7409:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDiv.g:7410:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDiv.g:7410:5: (otherlv_4= RULE_ID )
                    // InternalDiv.g:7411:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_97); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:7423:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==65) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalDiv.g:7424:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_98); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalDiv.g:7428:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==RULE_ID) ) {
                        alt147=1;
                    }
                    else if ( (LA147_0==38) ) {
                        alt147=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 147, 0, input);

                        throw nvae;
                    }
                    switch (alt147) {
                        case 1 :
                            // InternalDiv.g:7429:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalDiv.g:7429:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalDiv.g:7430:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalDiv.g:7430:6: (lv_displayName_6_0= RULE_ID )
                            // InternalDiv.g:7431:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_99); if (state.failed) return current;
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
                            // InternalDiv.g:7448:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalDiv.g:7448:5: ( (lv_plural_7_0= '*' ) )
                            // InternalDiv.g:7449:6: (lv_plural_7_0= '*' )
                            {
                            // InternalDiv.g:7449:6: (lv_plural_7_0= '*' )
                            // InternalDiv.g:7450:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,38,FOLLOW_99); if (state.failed) return current;
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

            // InternalDiv.g:7464:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalDiv.g:7465:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7475:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalDiv.g:7475:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalDiv.g:7476:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalDiv.g:7482:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7488:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalDiv.g:7489:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalDiv.g:7489:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalDiv.g:7490:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalDiv.g:7490:3: ()
            // InternalDiv.g:7491:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7497:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:7498:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:7498:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:7499:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDiv.g:7510:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt149=3;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==64) ) {
                alt149=1;
            }
            else if ( (LA149_0==63) ) {
                int LA149_2 = input.LA(2);

                if ( (LA149_2==73) ) {
                    alt149=2;
                }
            }
            switch (alt149) {
                case 1 :
                    // InternalDiv.g:7511:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalDiv.g:7511:4: ( (lv_before_2_0= '@before' ) )
                    // InternalDiv.g:7512:5: (lv_before_2_0= '@before' )
                    {
                    // InternalDiv.g:7512:5: (lv_before_2_0= '@before' )
                    // InternalDiv.g:7513:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDiv.g:7526:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalDiv.g:7526:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalDiv.g:7527:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalDiv.g:7531:5: ( (lv_all_4_0= 'all' ) )
                    // InternalDiv.g:7532:6: (lv_all_4_0= 'all' )
                    {
                    // InternalDiv.g:7532:6: (lv_all_4_0= 'all' )
                    // InternalDiv.g:7533:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7551:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalDiv.g:7551:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalDiv.g:7552:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalDiv.g:7558:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDiv.g:7564:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDiv.g:7565:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDiv.g:7565:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDiv.g:7566:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDiv.g:7566:3: ()
            // InternalDiv.g:7567:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDiv.g:7577:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDiv.g:7578:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDiv.g:7578:4: (lv_if_2_0= ruleDExpression )
            // InternalDiv.g:7579:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_102);
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

            otherlv_3=(Token)match(input,75,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDiv.g:7600:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDiv.g:7601:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDiv.g:7601:4: (lv_then_4_0= ruleDExpression )
            // InternalDiv.g:7602:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_103);
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

            // InternalDiv.g:7619:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==76) && (synpred14_InternalDiv())) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalDiv.g:7620:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDiv.g:7620:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDiv.g:7621:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,76,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDiv.g:7627:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDiv.g:7628:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDiv.g:7628:5: (lv_else_6_0= ruleDExpression )
                    // InternalDiv.g:7629:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_104);
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

            otherlv_7=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7655:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDiv.g:7655:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDiv.g:7656:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDiv.g:7662:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalDiv.g:7668:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalDiv.g:7669:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalDiv.g:7669:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==38||LA151_0==87||LA151_0==128) ) {
                alt151=1;
            }
            else if ( (LA151_0==37) ) {
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
                    // InternalDiv.g:7670:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalDiv.g:7670:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalDiv.g:7671:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalDiv.g:7671:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalDiv.g:7672:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalDiv.g:7690:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalDiv.g:7690:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalDiv.g:7691:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:7695:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalDiv.g:7696:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalDiv.g:7696:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalDiv.g:7697:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_106); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,78,FOLLOW_107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalDiv.g:7717:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalDiv.g:7718:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalDiv.g:7718:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalDiv.g:7719:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

                    otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7745:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDiv.g:7745:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDiv.g:7746:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDiv.g:7752:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:7758:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDiv.g:7759:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDiv.g:7759:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==RULE_NATURAL) ) {
                alt152=1;
            }
            else if ( (LA152_0==38) ) {
                alt152=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // InternalDiv.g:7760:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDiv.g:7768:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7777:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalDiv.g:7777:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalDiv.g:7778:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalDiv.g:7784:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDiv.g:7790:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDiv.g:7791:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDiv.g:7791:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDiv.g:7792:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDiv.g:7792:3: ()
            // InternalDiv.g:7793:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7799:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt153=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt153=1;
                }
                break;
            case 80:
                {
                alt153=2;
                }
                break;
            case 81:
                {
                alt153=3;
                }
                break;
            case 82:
                {
                alt153=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // InternalDiv.g:7800:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDiv.g:7800:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDiv.g:7801:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDiv.g:7801:5: (lv_value_1_0= 'TRUE' )
                    // InternalDiv.g:7802:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDiv.g:7815:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDiv.g:7815:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDiv.g:7816:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDiv.g:7816:5: (lv_value_2_0= 'true' )
                    // InternalDiv.g:7817:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDiv.g:7830:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDiv.g:7835:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7844:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalDiv.g:7844:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalDiv.g:7845:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalDiv.g:7851:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7857:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDiv.g:7858:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDiv.g:7858:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDiv.g:7859:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDiv.g:7859:3: ()
            // InternalDiv.g:7860:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7866:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDiv.g:7867:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDiv.g:7867:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDiv.g:7868:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDiv.g:7888:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalDiv.g:7888:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalDiv.g:7889:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalDiv.g:7895:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7901:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDiv.g:7902:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDiv.g:7902:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDiv.g:7903:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDiv.g:7903:3: ()
            // InternalDiv.g:7904:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7910:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDiv.g:7911:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDiv.g:7911:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDiv.g:7912:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDiv.g:7933:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalDiv.g:7933:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalDiv.g:7934:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalDiv.g:7940:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7946:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDiv.g:7947:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDiv.g:7947:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDiv.g:7948:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDiv.g:7948:3: ()
            // InternalDiv.g:7949:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7955:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDiv.g:7956:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDiv.g:7956:4: (lv_value_1_0= RULE_STRING )
            // InternalDiv.g:7957:5: lv_value_1_0= RULE_STRING
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
    // InternalDiv.g:7977:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalDiv.g:7977:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalDiv.g:7978:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalDiv.g:7984:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDiv.g:7990:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDiv.g:7991:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDiv.g:7991:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDiv.g:7992:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDiv.g:7992:3: ()
            // InternalDiv.g:7993:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7999:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==83) ) {
                alt154=1;
            }
            else if ( (LA154_0==84) ) {
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
                    // InternalDiv.g:8000:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:8005:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8014:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDiv.g:8014:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDiv.g:8015:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDiv.g:8021:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDiv.g:8027:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDiv.g:8028:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDiv.g:8028:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDiv.g:8029:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDiv.g:8048:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( ((LA157_0>=85 && LA157_0<=86)) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalDiv.g:8049:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDiv.g:8049:4: (kw= 'E' | kw= 'e' )
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==85) ) {
                        alt155=1;
                    }
                    else if ( (LA155_0==86) ) {
                        alt155=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 155, 0, input);

                        throw nvae;
                    }
                    switch (alt155) {
                        case 1 :
                            // InternalDiv.g:8050:5: kw= 'E'
                            {
                            kw=(Token)match(input,85,FOLLOW_110); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:8056:5: kw= 'e'
                            {
                            kw=(Token)match(input,86,FOLLOW_110); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:8062:4: (kw= '+' | kw= '-' )?
                    int alt156=3;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==87) ) {
                        alt156=1;
                    }
                    else if ( (LA156_0==88) ) {
                        alt156=2;
                    }
                    switch (alt156) {
                        case 1 :
                            // InternalDiv.g:8063:5: kw= '+'
                            {
                            kw=(Token)match(input,87,FOLLOW_105); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:8069:5: kw= '-'
                            {
                            kw=(Token)match(input,88,FOLLOW_105); if (state.failed) return current;
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
    // InternalDiv.g:8087:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalDiv.g:8087:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalDiv.g:8088:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
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
    // InternalDiv.g:8094:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:8100:2: (kw= '{' )
            // InternalDiv.g:8101:2: kw= '{'
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
    // InternalDiv.g:8109:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDiv.g:8109:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDiv.g:8110:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDiv.g:8116:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:8122:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDiv.g:8123:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDiv.g:8123:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDiv.g:8124:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_111);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:8134:3: (kw= '.*' )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==89) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalDiv.g:8135:4: kw= '.*'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8145:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDiv.g:8145:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDiv.g:8146:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDiv.g:8152:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8158:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDiv.g:8159:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDiv.g:8159:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDiv.g:8160:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDiv.g:8167:3: (kw= '.' this_ID_2= RULE_ID )*
            loop159:
            do {
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==63) ) {
                    alt159=1;
                }


                switch (alt159) {
            	case 1 :
            	    // InternalDiv.g:8168:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
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
            	    break loop159;
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
    // InternalDiv.g:8185:1: ruleDEntityNatureAutonomous returns [Enumerator current=null] : (enumLiteral_0= 'autonomous' ) ;
    public final Enumerator ruleDEntityNatureAutonomous() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:8191:2: ( (enumLiteral_0= 'autonomous' ) )
            // InternalDiv.g:8192:2: (enumLiteral_0= 'autonomous' )
            {
            // InternalDiv.g:8192:2: (enumLiteral_0= 'autonomous' )
            // InternalDiv.g:8193:3: enumLiteral_0= 'autonomous'
            {
            enumLiteral_0=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8202:1: ruleDEntityNatureRelationship returns [Enumerator current=null] : (enumLiteral_0= 'relationship' ) ;
    public final Enumerator ruleDEntityNatureRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:8208:2: ( (enumLiteral_0= 'relationship' ) )
            // InternalDiv.g:8209:2: (enumLiteral_0= 'relationship' )
            {
            // InternalDiv.g:8209:2: (enumLiteral_0= 'relationship' )
            // InternalDiv.g:8210:3: enumLiteral_0= 'relationship'
            {
            enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8219:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:8225:2: ( ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) )
            // InternalDiv.g:8226:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            {
            // InternalDiv.g:8226:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==92) ) {
                alt160=1;
            }
            else if ( (LA160_0==51) ) {
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
                    // InternalDiv.g:8227:3: (enumLiteral_0= 'references' )
                    {
                    // InternalDiv.g:8227:3: (enumLiteral_0= 'references' )
                    // InternalDiv.g:8228:4: enumLiteral_0= 'references'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8235:3: (enumLiteral_1= 'contains' )
                    {
                    // InternalDiv.g:8235:3: (enumLiteral_1= 'contains' )
                    // InternalDiv.g:8236:4: enumLiteral_1= 'contains'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8246:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:8252:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDiv.g:8253:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDiv.g:8253:2: (enumLiteral_0= 'inverse' )
            // InternalDiv.g:8254:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8263:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalDiv.g:8269:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalDiv.g:8270:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalDiv.g:8270:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt161=11;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt161=1;
                }
                break;
            case 95:
                {
                alt161=2;
                }
                break;
            case 96:
                {
                alt161=3;
                }
                break;
            case 97:
                {
                alt161=4;
                }
                break;
            case 98:
                {
                alt161=5;
                }
                break;
            case 99:
                {
                alt161=6;
                }
                break;
            case 100:
                {
                alt161=7;
                }
                break;
            case 101:
                {
                alt161=8;
                }
                break;
            case 102:
                {
                alt161=9;
                }
                break;
            case 103:
                {
                alt161=10;
                }
                break;
            case 104:
                {
                alt161=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }

            switch (alt161) {
                case 1 :
                    // InternalDiv.g:8271:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalDiv.g:8271:3: (enumLiteral_0= 'VOID' )
                    // InternalDiv.g:8272:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8279:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDiv.g:8279:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDiv.g:8280:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8287:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalDiv.g:8287:3: (enumLiteral_2= 'NUMBER' )
                    // InternalDiv.g:8288:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8295:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalDiv.g:8295:3: (enumLiteral_3= 'TEXT' )
                    // InternalDiv.g:8296:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDiv.g:8303:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalDiv.g:8303:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalDiv.g:8304:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDiv.g:8311:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalDiv.g:8311:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalDiv.g:8312:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDiv.g:8319:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalDiv.g:8319:3: (enumLiteral_6= 'STATE' )
                    // InternalDiv.g:8320:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDiv.g:8327:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalDiv.g:8327:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalDiv.g:8328:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDiv.g:8335:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalDiv.g:8335:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalDiv.g:8336:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDiv.g:8343:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalDiv.g:8343:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalDiv.g:8344:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDiv.g:8351:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalDiv.g:8351:3: (enumLiteral_10= 'SERVICE' )
                    // InternalDiv.g:8352:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8362:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDiv.g:8368:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDiv.g:8369:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDiv.g:8369:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt162=4;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt162=1;
                }
                break;
            case 106:
                {
                alt162=2;
                }
                break;
            case 107:
                {
                alt162=3;
                }
                break;
            case 108:
                {
                alt162=4;
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
                    // InternalDiv.g:8370:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDiv.g:8370:3: (enumLiteral_0= 'OR' )
                    // InternalDiv.g:8371:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8378:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDiv.g:8378:3: (enumLiteral_1= 'or' )
                    // InternalDiv.g:8379:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8386:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDiv.g:8386:3: (enumLiteral_2= 'XOR' )
                    // InternalDiv.g:8387:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8394:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDiv.g:8394:3: (enumLiteral_3= 'xor' )
                    // InternalDiv.g:8395:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8405:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:8411:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDiv.g:8412:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDiv.g:8412:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==109) ) {
                alt163=1;
            }
            else if ( (LA163_0==110) ) {
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
                    // InternalDiv.g:8413:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDiv.g:8413:3: (enumLiteral_0= 'AND' )
                    // InternalDiv.g:8414:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8421:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDiv.g:8421:3: (enumLiteral_1= 'and' )
                    // InternalDiv.g:8422:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8432:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8438:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDiv.g:8439:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDiv.g:8439:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt164=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt164=1;
                }
                break;
            case 111:
                {
                alt164=2;
                }
                break;
            case 112:
                {
                alt164=3;
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
                    // InternalDiv.g:8440:3: (enumLiteral_0= '=' )
                    {
                    // InternalDiv.g:8440:3: (enumLiteral_0= '=' )
                    // InternalDiv.g:8441:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8448:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDiv.g:8448:3: (enumLiteral_1= '!=' )
                    // InternalDiv.g:8449:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8456:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDiv.g:8456:3: (enumLiteral_2= '<>' )
                    // InternalDiv.g:8457:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8467:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDiv.g:8473:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDiv.g:8474:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDiv.g:8474:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt165=6;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt165=1;
                }
                break;
            case 114:
                {
                alt165=2;
                }
                break;
            case 115:
                {
                alt165=3;
                }
                break;
            case 116:
                {
                alt165=4;
                }
                break;
            case 117:
                {
                alt165=5;
                }
                break;
            case 118:
                {
                alt165=6;
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
                    // InternalDiv.g:8475:3: (enumLiteral_0= '<' )
                    {
                    // InternalDiv.g:8475:3: (enumLiteral_0= '<' )
                    // InternalDiv.g:8476:4: enumLiteral_0= '<'
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
                    // InternalDiv.g:8483:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDiv.g:8483:3: (enumLiteral_1= '<=' )
                    // InternalDiv.g:8484:4: enumLiteral_1= '<='
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
                    // InternalDiv.g:8491:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDiv.g:8491:3: (enumLiteral_2= '\\u2264' )
                    // InternalDiv.g:8492:4: enumLiteral_2= '\\u2264'
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
                    // InternalDiv.g:8499:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDiv.g:8499:3: (enumLiteral_3= '>=' )
                    // InternalDiv.g:8500:4: enumLiteral_3= '>='
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
                    // InternalDiv.g:8507:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDiv.g:8507:3: (enumLiteral_4= '\\u2265' )
                    // InternalDiv.g:8508:4: enumLiteral_4= '\\u2265'
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
                    // InternalDiv.g:8515:3: (enumLiteral_5= '>' )
                    {
                    // InternalDiv.g:8515:3: (enumLiteral_5= '>' )
                    // InternalDiv.g:8516:4: enumLiteral_5= '>'
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
    // InternalDiv.g:8526:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDiv.g:8532:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalDiv.g:8533:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalDiv.g:8533:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt166=5;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt166=1;
                }
                break;
            case 58:
                {
                alt166=2;
                }
                break;
            case 78:
                {
                alt166=3;
                }
                break;
            case 120:
                {
                alt166=4;
                }
                break;
            case 121:
                {
                alt166=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // InternalDiv.g:8534:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDiv.g:8534:3: (enumLiteral_0= 'IN' )
                    // InternalDiv.g:8535:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8542:3: (enumLiteral_1= 'in' )
                    {
                    // InternalDiv.g:8542:3: (enumLiteral_1= 'in' )
                    // InternalDiv.g:8543:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8550:3: (enumLiteral_2= '..' )
                    {
                    // InternalDiv.g:8550:3: (enumLiteral_2= '..' )
                    // InternalDiv.g:8551:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8558:3: (enumLiteral_3= '->' )
                    {
                    // InternalDiv.g:8558:3: (enumLiteral_3= '->' )
                    // InternalDiv.g:8559:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDiv.g:8566:3: (enumLiteral_4= '=>' )
                    {
                    // InternalDiv.g:8566:3: (enumLiteral_4= '=>' )
                    // InternalDiv.g:8567:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8577:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:8583:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDiv.g:8584:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDiv.g:8584:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==87) ) {
                alt167=1;
            }
            else if ( (LA167_0==88) ) {
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
                    // InternalDiv.g:8585:3: (enumLiteral_0= '+' )
                    {
                    // InternalDiv.g:8585:3: (enumLiteral_0= '+' )
                    // InternalDiv.g:8586:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8593:3: (enumLiteral_1= '-' )
                    {
                    // InternalDiv.g:8593:3: (enumLiteral_1= '-' )
                    // InternalDiv.g:8594:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8604:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDiv.g:8610:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDiv.g:8611:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDiv.g:8611:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt168=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt168=1;
                }
                break;
            case 122:
                {
                alt168=2;
                }
                break;
            case 123:
                {
                alt168=3;
                }
                break;
            case 124:
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
                    // InternalDiv.g:8612:3: (enumLiteral_0= '*' )
                    {
                    // InternalDiv.g:8612:3: (enumLiteral_0= '*' )
                    // InternalDiv.g:8613:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8620:3: (enumLiteral_1= '/' )
                    {
                    // InternalDiv.g:8620:3: (enumLiteral_1= '/' )
                    // InternalDiv.g:8621:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8628:3: (enumLiteral_2= '**' )
                    {
                    // InternalDiv.g:8628:3: (enumLiteral_2= '**' )
                    // InternalDiv.g:8629:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8636:3: (enumLiteral_3= '%' )
                    {
                    // InternalDiv.g:8636:3: (enumLiteral_3= '%' )
                    // InternalDiv.g:8637:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8647:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDiv.g:8653:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDiv.g:8654:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDiv.g:8654:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt169=5;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt169=1;
                }
                break;
            case 88:
                {
                alt169=2;
                }
                break;
            case 125:
                {
                alt169=3;
                }
                break;
            case 126:
                {
                alt169=4;
                }
                break;
            case 127:
                {
                alt169=5;
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
                    // InternalDiv.g:8655:3: (enumLiteral_0= '+' )
                    {
                    // InternalDiv.g:8655:3: (enumLiteral_0= '+' )
                    // InternalDiv.g:8656:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8663:3: (enumLiteral_1= '-' )
                    {
                    // InternalDiv.g:8663:3: (enumLiteral_1= '-' )
                    // InternalDiv.g:8664:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8671:3: (enumLiteral_2= '!' )
                    {
                    // InternalDiv.g:8671:3: (enumLiteral_2= '!' )
                    // InternalDiv.g:8672:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8679:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDiv.g:8679:3: (enumLiteral_3= 'NOT' )
                    // InternalDiv.g:8680:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDiv.g:8687:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDiv.g:8687:3: (enumLiteral_4= 'not' )
                    // InternalDiv.g:8688:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8698:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8704:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalDiv.g:8705:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalDiv.g:8705:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt170=3;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt170=1;
                }
                break;
            case 87:
                {
                alt170=2;
                }
                break;
            case 38:
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
                    // InternalDiv.g:8706:3: (enumLiteral_0= '?' )
                    {
                    // InternalDiv.g:8706:3: (enumLiteral_0= '?' )
                    // InternalDiv.g:8707:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8714:3: (enumLiteral_1= '+' )
                    {
                    // InternalDiv.g:8714:3: (enumLiteral_1= '+' )
                    // InternalDiv.g:8715:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8722:3: (enumLiteral_2= '*' )
                    {
                    // InternalDiv.g:8722:3: (enumLiteral_2= '*' )
                    // InternalDiv.g:8723:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalDiv
    public final void synpred1_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5388:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalDiv.g:5388:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalDiv.g:5388:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalDiv.g:5389:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalDiv.g:5389:7: ()
        // InternalDiv.g:5390:7: 
        {
        }

        match(input,63,FOLLOW_3); if (state.failed) return ;
        // InternalDiv.g:5392:7: ( ( RULE_ID ) )
        // InternalDiv.g:5393:8: ( RULE_ID )
        {
        // InternalDiv.g:5393:8: ( RULE_ID )
        // InternalDiv.g:5394:9: RULE_ID
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
    // $ANTLR end synpred1_InternalDiv

    // $ANTLR start synpred2_InternalDiv
    public final void synpred2_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5457:6: ( ( () '.' ) )
        // InternalDiv.g:5457:7: ( () '.' )
        {
        // InternalDiv.g:5457:7: ( () '.' )
        // InternalDiv.g:5458:7: () '.'
        {
        // InternalDiv.g:5458:7: ()
        // InternalDiv.g:5459:7: 
        {
        }

        match(input,63,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDiv

    // $ANTLR start synpred3_InternalDiv
    public final void synpred3_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5493:8: ( ( '(' ) )
        // InternalDiv.g:5493:9: ( '(' )
        {
        // InternalDiv.g:5493:9: ( '(' )
        // InternalDiv.g:5494:9: '('
        {
        match(input,37,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDiv

    // $ANTLR start synpred4_InternalDiv
    public final void synpred4_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5854:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalDiv.g:5854:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalDiv.g:5854:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalDiv.g:5855:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalDiv.g:5855:6: ()
        // InternalDiv.g:5856:6: 
        {
        }

        // InternalDiv.g:5857:6: ( ( ruleDmxOpOr ) )
        // InternalDiv.g:5858:7: ( ruleDmxOpOr )
        {
        // InternalDiv.g:5858:7: ( ruleDmxOpOr )
        // InternalDiv.g:5859:8: ruleDmxOpOr
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
    // $ANTLR end synpred4_InternalDiv

    // $ANTLR start synpred5_InternalDiv
    public final void synpred5_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5942:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalDiv.g:5942:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalDiv.g:5942:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalDiv.g:5943:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalDiv.g:5943:6: ()
        // InternalDiv.g:5944:6: 
        {
        }

        // InternalDiv.g:5945:6: ( ( ruleDmxOpAnd ) )
        // InternalDiv.g:5946:7: ( ruleDmxOpAnd )
        {
        // InternalDiv.g:5946:7: ( ruleDmxOpAnd )
        // InternalDiv.g:5947:8: ruleDmxOpAnd
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
    // $ANTLR end synpred5_InternalDiv

    // $ANTLR start synpred6_InternalDiv
    public final void synpred6_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:6030:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalDiv.g:6030:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalDiv.g:6030:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalDiv.g:6031:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalDiv.g:6031:6: ()
        // InternalDiv.g:6032:6: 
        {
        }

        // InternalDiv.g:6033:6: ( ( ruleDmxOpEquality ) )
        // InternalDiv.g:6034:7: ( ruleDmxOpEquality )
        {
        // InternalDiv.g:6034:7: ( ruleDmxOpEquality )
        // InternalDiv.g:6035:8: ruleDmxOpEquality
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
    // $ANTLR end synpred6_InternalDiv

    // $ANTLR start synpred7_InternalDiv
    public final void synpred7_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:6119:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalDiv.g:6119:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalDiv.g:6119:7: ( () ruleDmxOpInstanceOf )
        // InternalDiv.g:6120:7: () ruleDmxOpInstanceOf
        {
        // InternalDiv.g:6120:7: ()
        // InternalDiv.g:6121:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalDiv

    // $ANTLR start synpred8_InternalDiv
    public final void synpred8_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:6159:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDiv.g:6159:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDiv.g:6159:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDiv.g:6160:7: () ( ( ruleOpCompare ) )
        {
        // InternalDiv.g:6160:7: ()
        // InternalDiv.g:6161:7: 
        {
        }

        // InternalDiv.g:6162:7: ( ( ruleOpCompare ) )
        // InternalDiv.g:6163:8: ( ruleOpCompare )
        {
        // InternalDiv.g:6163:8: ( ruleOpCompare )
        // InternalDiv.g:6164:9: ruleOpCompare
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
    // $ANTLR end synpred8_InternalDiv

    // $ANTLR start synpred9_InternalDiv
    public final void synpred9_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:6278:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDiv.g:6278:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDiv.g:6278:6: ( () ( ( ruleOpOther ) ) )
        // InternalDiv.g:6279:6: () ( ( ruleOpOther ) )
        {
        // InternalDiv.g:6279:6: ()
        // InternalDiv.g:6280:6: 
        {
        }

        // InternalDiv.g:6281:6: ( ( ruleOpOther ) )
        // InternalDiv.g:6282:7: ( ruleOpOther )
        {
        // InternalDiv.g:6282:7: ( ruleOpOther )
        // InternalDiv.g:6283:8: ruleOpOther
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
    // $ANTLR end synpred9_InternalDiv

    // $ANTLR start synpred10_InternalDiv
    public final void synpred10_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:6366:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDiv.g:6366:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDiv.g:6366:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDiv.g:6367:6: () ( ( ruleOpAdd ) )
        {
        // InternalDiv.g:6367:6: ()
        // InternalDiv.g:6368:6: 
        {
        }

        // InternalDiv.g:6369:6: ( ( ruleOpAdd ) )
        // InternalDiv.g:6370:7: ( ruleOpAdd )
        {
        // InternalDiv.g:6370:7: ( ruleOpAdd )
        // InternalDiv.g:6371:8: ruleOpAdd
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
    // $ANTLR end synpred10_InternalDiv

    // $ANTLR start synpred11_InternalDiv
    public final void synpred11_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:6454:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDiv.g:6454:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDiv.g:6454:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDiv.g:6455:6: () ( ( ruleOpMulti ) )
        {
        // InternalDiv.g:6455:6: ()
        // InternalDiv.g:6456:6: 
        {
        }

        // InternalDiv.g:6457:6: ( ( ruleOpMulti ) )
        // InternalDiv.g:6458:7: ( ruleOpMulti )
        {
        // InternalDiv.g:6458:7: ( ruleOpMulti )
        // InternalDiv.g:6459:8: ruleOpMulti
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
    // $ANTLR end synpred11_InternalDiv

    // $ANTLR start synpred12_InternalDiv
    public final void synpred12_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:6617:5: ( ( () ruleDmxOpCast ) )
        // InternalDiv.g:6617:6: ( () ruleDmxOpCast )
        {
        // InternalDiv.g:6617:6: ( () ruleDmxOpCast )
        // InternalDiv.g:6618:6: () ruleDmxOpCast
        {
        // InternalDiv.g:6618:6: ()
        // InternalDiv.g:6619:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDiv

    // $ANTLR start synpred13_InternalDiv
    public final void synpred13_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:7465:4: ( ']' )
        // InternalDiv.g:7465:5: ']'
        {
        match(input,72,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalDiv

    // $ANTLR start synpred14_InternalDiv
    public final void synpred14_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:7621:5: ( 'else' )
        // InternalDiv.g:7621:6: 'else'
        {
        match(input,76,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalDiv

    // Delegated rules

    public final boolean synpred12_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDiv() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDiv_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA83 dfa83 = new DFA83(this);
    protected DFA129 dfa129 = new DFA129(this);
    protected DFA138 dfa138 = new DFA138(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\45\1\uffff\1\4\1\uffff\1\45";
    static final String dfa_3s = "\1\62\1\uffff\1\135\1\uffff\1\4\1\uffff\1\135";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\33\uffff\1\3\21\uffff\1\1",
            "",
            "\1\5\4\uffff\1\4\1\3\7\uffff\1\1\50\uffff\2\1",
            "",
            "\1\6",
            "",
            "\1\5\4\uffff\1\4\1\3\7\uffff\1\1\50\uffff\2\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3649:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\174\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\2\1\3\1\0\1\6\1\5\1\4\1\1\1\7\2\uffff}>";
    static final String[] dfa_13s = {
            "\5\1\14\uffff\3\1\1\uffff\5\1\1\uffff\2\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\3\uffff\2\1\3\uffff\1\1\7\uffff\1\1\4\uffff\1\1\2\uffff\1\2\1\3\2\1\5\uffff\4\1\10\uffff\2\1\1\uffff\2\1\15\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 6116:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA129_4 = input.LA(1);

                         
                        int index129_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index129_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA129_8 = input.LA(1);

                         
                        int index129_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index129_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA129_2 = input.LA(1);

                         
                        int index129_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDiv()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index129_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA129_3 = input.LA(1);

                         
                        int index129_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDiv()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index129_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA129_7 = input.LA(1);

                         
                        int index129_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index129_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA129_6 = input.LA(1);

                         
                        int index129_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index129_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA129_5 = input.LA(1);

                         
                        int index129_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index129_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA129_9 = input.LA(1);

                         
                        int index129_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index129_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 129, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\3\uffff\1\7\6\uffff";
    static final String dfa_16s = "\1\11\2\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String dfa_17s = "\1\124\2\uffff\1\174\4\uffff\1\11\1\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\3\1\uffff\1\4";
    static final String dfa_19s = "\12\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\1\2\24\uffff\1\5\1\6\56\uffff\4\1\2\4",
            "",
            "",
            "\5\7\13\uffff\4\7\1\uffff\5\7\1\uffff\2\7\3\uffff\1\7\1\uffff\2\7\1\uffff\1\7\3\uffff\2\7\3\uffff\1\7\7\uffff\1\7\4\uffff\1\10\2\uffff\4\7\5\uffff\4\7\10\uffff\2\7\1\uffff\2\7\15\uffff\24\7",
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

    class DFA138 extends DFA {

        public DFA138(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 138;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "6783:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010004A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100062L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000CA00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000028200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000900000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004004800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000601192200000L,0x000000000C000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000600192200000L,0x000000000C000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002180100670L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000100060L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000200010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020020200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000062L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600080000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004820100200010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0005020100200010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004020100200010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002040000000062L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008040000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000006000000072L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000006000000062L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010006000000072L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010006000000062L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000062L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020006000000072L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0020006000000062L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0020000000000062L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000000100000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0200006000000002L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000180100600L,0x00000000001F8000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x000001FFC0000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000010L,0x000001FFC0000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000002180100610L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x8000002000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x000000A180100610L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x00001E0000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000020L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x007E00000000000CL});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0400000000000002L,0x0380000000004000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000004000000002L,0x1C00000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000400002L,0x0000000000000010L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000002180300670L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000180200600L,0x00000000001F8000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000180000600L,0x00000000001F8000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x000000A180100670L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000182L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000004000000200L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000200L,0x0000000001800000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});

}