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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'information'", "'view'", "'{'", "'}'", "'as'", "'grab'", "'aggregate'", "'primitive'", "'ditch'", "'add'", "'enumeration'", "','", "'root'", "'entity'", "'detail'", "'reference'", "'composite'", "'attribute'", "'query'", "'component'", "'constraint'", "'alias'", "':'", "'redefines'", "'abstract'", "'main'", "'states'", "'events'", "'extends'", "'derived'", "'contains'", "'key'", "'('", "')'", "'returns'", "'import'", "'test'", "'context'", "':='", "'in'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'autonomous'", "'relationship'", "'references'", "'inverse'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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

                if ( (LA1_0==53) ) {
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
                case 37:
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


    // $ANTLR start "entryRuleDivAggregate"
    // InternalDiv.g:765:1: entryRuleDivAggregate returns [EObject current=null] : iv_ruleDivAggregate= ruleDivAggregate EOF ;
    public final EObject entryRuleDivAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAggregate = null;


        try {
            // InternalDiv.g:765:53: (iv_ruleDivAggregate= ruleDivAggregate EOF )
            // InternalDiv.g:766:2: iv_ruleDivAggregate= ruleDivAggregate EOF
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
    // InternalDiv.g:772:1: ruleDivAggregate returns [EObject current=null] : (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate ) ;
    public final EObject ruleDivAggregate() throws RecognitionException {
        EObject current = null;

        EObject this_DivAggregateTransposition_0 = null;

        EObject this_DimAggregate_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:778:2: ( (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate ) )
            // InternalDiv.g:779:2: (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate )
            {
            // InternalDiv.g:779:2: (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDiv.g:780:3: this_DivAggregateTransposition_0= ruleDivAggregateTransposition
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
                    // InternalDiv.g:789:3: this_DimAggregate_1= ruleDimAggregate
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
    // InternalDiv.g:801:1: entryRuleDivAggregateTransposition returns [EObject current=null] : iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF ;
    public final EObject entryRuleDivAggregateTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAggregateTransposition = null;


        try {
            // InternalDiv.g:801:66: (iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF )
            // InternalDiv.g:802:2: iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF
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
    // InternalDiv.g:808:1: ruleDivAggregateTransposition returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? ) ;
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
            // InternalDiv.g:814:2: ( ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? ) )
            // InternalDiv.g:815:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? )
            {
            // InternalDiv.g:815:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? )
            // InternalDiv.g:816:3: () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )?
            {
            // InternalDiv.g:816:3: ()
            // InternalDiv.g:817:4: 
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
            // InternalDiv.g:831:3: ( (lv_rule_3_0= ruleDivGrabAggregateRule ) )
            // InternalDiv.g:832:4: (lv_rule_3_0= ruleDivGrabAggregateRule )
            {
            // InternalDiv.g:832:4: (lv_rule_3_0= ruleDivGrabAggregateRule )
            // InternalDiv.g:833:5: lv_rule_3_0= ruleDivGrabAggregateRule
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

            // InternalDiv.g:850:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_PLAIN_TEXT_ONLY && LA11_0<=RULE_RICH_TEXT_START)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDiv.g:851:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:851:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:852:5: lv_description_4_0= ruleDRichText
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

            // InternalDiv.g:869:3: (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDiv.g:870:4: otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDivAggregateTranspositionAccess().getLeftCurlyBracketKeyword_5_0());
                      			
                    }
                    // InternalDiv.g:874:4: ( (lv_features_6_0= ruleDivQueryTransposition ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==23) ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==36) ) {
                                alt12=1;
                            }


                        }
                        else if ( (LA12_0==26) ) {
                            int LA12_2 = input.LA(2);

                            if ( (LA12_2==36) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDiv.g:875:5: (lv_features_6_0= ruleDivQueryTransposition )
                    	    {
                    	    // InternalDiv.g:875:5: (lv_features_6_0= ruleDivQueryTransposition )
                    	    // InternalDiv.g:876:6: lv_features_6_0= ruleDivQueryTransposition
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
                    	    break loop12;
                        }
                    } while (true);

                    // InternalDiv.g:893:4: ( (lv_types_7_0= ruleDivType ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23||LA13_0==26) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDiv.g:894:5: (lv_types_7_0= ruleDivType )
                    	    {
                    	    // InternalDiv.g:894:5: (lv_types_7_0= ruleDivType )
                    	    // InternalDiv.g:895:6: lv_types_7_0= ruleDivType
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
                    	    break loop13;
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
    // InternalDiv.g:921:1: entryRuleDivType returns [EObject current=null] : iv_ruleDivType= ruleDivType EOF ;
    public final EObject entryRuleDivType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivType = null;


        try {
            // InternalDiv.g:921:48: (iv_ruleDivType= ruleDivType EOF )
            // InternalDiv.g:922:2: iv_ruleDivType= ruleDivType EOF
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
    // InternalDiv.g:928:1: ruleDivType returns [EObject current=null] : (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition ) ;
    public final EObject ruleDivType() throws RecognitionException {
        EObject current = null;

        EObject this_DivPrimitiveTransposition_0 = null;

        EObject this_DivEnumerationTransposition_1 = null;

        EObject this_DivEntityTypeTransposition_2 = null;

        EObject this_DivDetailTypeTransposition_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:934:2: ( (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition ) )
            // InternalDiv.g:935:2: (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition )
            {
            // InternalDiv.g:935:2: (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt15=2;
                    }
                    break;
                case 30:
                case 31:
                    {
                    alt15=3;
                    }
                    break;
                case 25:
                    {
                    alt15=1;
                    }
                    break;
                case 32:
                    {
                    alt15=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA15_0==26) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt15=1;
                    }
                    break;
                case 32:
                    {
                    alt15=4;
                    }
                    break;
                case 28:
                    {
                    alt15=2;
                    }
                    break;
                case 30:
                case 31:
                    {
                    alt15=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDiv.g:936:3: this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition
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
                    // InternalDiv.g:945:3: this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition
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
                    // InternalDiv.g:954:3: this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition
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
                    // InternalDiv.g:963:3: this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition
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
    // InternalDiv.g:975:1: entryRuleDivPrimitiveTransposition returns [EObject current=null] : iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF ;
    public final EObject entryRuleDivPrimitiveTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivPrimitiveTransposition = null;


        try {
            // InternalDiv.g:975:66: (iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF )
            // InternalDiv.g:976:2: iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF
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
    // InternalDiv.g:982:1: ruleDivPrimitiveTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? ) ;
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
            // InternalDiv.g:988:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? ) )
            // InternalDiv.g:989:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? )
            {
            // InternalDiv.g:989:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? )
            // InternalDiv.g:990:3: () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )?
            {
            // InternalDiv.g:990:3: ()
            // InternalDiv.g:991:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivPrimitiveTranspositionAccess().getTPrimitiveTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:997:3: ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDiv.g:998:4: (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) )
                    {
                    // InternalDiv.g:998:4: (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) )
                    // InternalDiv.g:999:5: otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivPrimitiveTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivPrimitiveTranspositionAccess().getPrimitiveKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1007:5: ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) )
                    // InternalDiv.g:1008:6: (lv_rule_3_0= ruleDivGrabPrimitiveRule )
                    {
                    // InternalDiv.g:1008:6: (lv_rule_3_0= ruleDivGrabPrimitiveRule )
                    // InternalDiv.g:1009:7: lv_rule_3_0= ruleDivGrabPrimitiveRule
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
                    // InternalDiv.g:1028:4: (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) )
                    {
                    // InternalDiv.g:1028:4: (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) )
                    // InternalDiv.g:1029:5: otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivPrimitiveTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivPrimitiveTranspositionAccess().getPrimitiveKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1037:5: ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) )
                    // InternalDiv.g:1038:6: (lv_rule_6_0= ruleDivDitchPrimitiveRule )
                    {
                    // InternalDiv.g:1038:6: (lv_rule_6_0= ruleDivDitchPrimitiveRule )
                    // InternalDiv.g:1039:7: lv_rule_6_0= ruleDivDitchPrimitiveRule
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

            // InternalDiv.g:1058:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_PLAIN_TEXT_ONLY && LA17_0<=RULE_RICH_TEXT_START)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDiv.g:1059:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1059:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1060:5: lv_description_7_0= ruleDRichText
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

            // InternalDiv.g:1077:3: (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDiv.g:1078:4: otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDivPrimitiveTranspositionAccess().getLeftCurlyBracketKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:1082:4: (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==27) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDiv.g:1083:5: otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getDivPrimitiveTranspositionAccess().getAddKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:1087:5: ( (lv_constraints_10_0= ruleDConstraint ) )
                    	    // InternalDiv.g:1088:6: (lv_constraints_10_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:1088:6: (lv_constraints_10_0= ruleDConstraint )
                    	    // InternalDiv.g:1089:7: lv_constraints_10_0= ruleDConstraint
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
                    	    break loop18;
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
    // InternalDiv.g:1116:1: entryRuleDivEnumerationTransposition returns [EObject current=null] : iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF ;
    public final EObject entryRuleDivEnumerationTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivEnumerationTransposition = null;


        try {
            // InternalDiv.g:1116:68: (iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF )
            // InternalDiv.g:1117:2: iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF
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
    // InternalDiv.g:1123:1: ruleDivEnumerationTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? ) ;
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
            // InternalDiv.g:1129:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? ) )
            // InternalDiv.g:1130:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? )
            {
            // InternalDiv.g:1130:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? )
            // InternalDiv.g:1131:3: () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )?
            {
            // InternalDiv.g:1131:3: ()
            // InternalDiv.g:1132:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivEnumerationTranspositionAccess().getTEnumerationTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1138:3: ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==26) ) {
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
                    // InternalDiv.g:1139:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) )
                    {
                    // InternalDiv.g:1139:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) )
                    // InternalDiv.g:1140:5: otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivEnumerationTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivEnumerationTranspositionAccess().getEnumerationKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1148:5: ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) )
                    // InternalDiv.g:1149:6: (lv_rule_3_0= ruleDivGrabEnumerationRule )
                    {
                    // InternalDiv.g:1149:6: (lv_rule_3_0= ruleDivGrabEnumerationRule )
                    // InternalDiv.g:1150:7: lv_rule_3_0= ruleDivGrabEnumerationRule
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
                    // InternalDiv.g:1169:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) )
                    {
                    // InternalDiv.g:1169:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) )
                    // InternalDiv.g:1170:5: otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivEnumerationTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivEnumerationTranspositionAccess().getEnumerationKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1178:5: ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) )
                    // InternalDiv.g:1179:6: (lv_rule_6_0= ruleDivDitchEnumerationRule )
                    {
                    // InternalDiv.g:1179:6: (lv_rule_6_0= ruleDivDitchEnumerationRule )
                    // InternalDiv.g:1180:7: lv_rule_6_0= ruleDivDitchEnumerationRule
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

            // InternalDiv.g:1199:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_PLAIN_TEXT_ONLY && LA21_0<=RULE_RICH_TEXT_START)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDiv.g:1200:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1200:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1201:5: lv_description_7_0= ruleDRichText
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

            // InternalDiv.g:1218:3: (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDiv.g:1219:4: otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDivEnumerationTranspositionAccess().getLeftCurlyBracketKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:1223:4: ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==23||LA23_0==26) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalDiv.g:1224:5: ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )*
                            {
                            // InternalDiv.g:1224:5: ( (lv_literals_9_0= ruleDivLiteralTransposition ) )
                            // InternalDiv.g:1225:6: (lv_literals_9_0= ruleDivLiteralTransposition )
                            {
                            // InternalDiv.g:1225:6: (lv_literals_9_0= ruleDivLiteralTransposition )
                            // InternalDiv.g:1226:7: lv_literals_9_0= ruleDivLiteralTransposition
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

                            // InternalDiv.g:1243:5: (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==29) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalDiv.g:1244:6: otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) )
                            	    {
                            	    otherlv_10=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_10, grammarAccess.getDivEnumerationTranspositionAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDiv.g:1248:6: ( (lv_literals_11_0= ruleDivLiteralTransposition ) )
                            	    // InternalDiv.g:1249:7: (lv_literals_11_0= ruleDivLiteralTransposition )
                            	    {
                            	    // InternalDiv.g:1249:7: (lv_literals_11_0= ruleDivLiteralTransposition )
                            	    // InternalDiv.g:1250:8: lv_literals_11_0= ruleDivLiteralTransposition
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
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalDiv.g:1269:4: (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==27) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDiv.g:1270:5: otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getDivEnumerationTranspositionAccess().getAddKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:1274:5: ( (lv_constraints_13_0= ruleDConstraint ) )
                    	    // InternalDiv.g:1275:6: (lv_constraints_13_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:1275:6: (lv_constraints_13_0= ruleDConstraint )
                    	    // InternalDiv.g:1276:7: lv_constraints_13_0= ruleDConstraint
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
                    	    break loop24;
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
    // InternalDiv.g:1303:1: entryRuleDivLiteralTransposition returns [EObject current=null] : iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF ;
    public final EObject entryRuleDivLiteralTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivLiteralTransposition = null;


        try {
            // InternalDiv.g:1303:64: (iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF )
            // InternalDiv.g:1304:2: iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF
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
    // InternalDiv.g:1310:1: ruleDivLiteralTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivLiteralTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;

        EObject lv_rule_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1316:2: ( ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:1317:2: ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:1317:2: ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:1318:3: () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:1318:3: ()
            // InternalDiv.g:1319:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivLiteralTranspositionAccess().getTLiteralTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1325:3: ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            else if ( (LA26_0==26) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDiv.g:1326:4: (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalDiv.g:1326:4: (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) )
                    // InternalDiv.g:1327:5: otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivLiteralTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1331:5: ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) )
                    // InternalDiv.g:1332:6: (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule )
                    {
                    // InternalDiv.g:1332:6: (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule )
                    // InternalDiv.g:1333:7: lv_rule_2_0= ruleDivGrabEnumerationLiteralRule
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
                    // InternalDiv.g:1352:4: (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalDiv.g:1352:4: (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) )
                    // InternalDiv.g:1353:5: otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDivLiteralTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1357:5: ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) )
                    // InternalDiv.g:1358:6: (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule )
                    {
                    // InternalDiv.g:1358:6: (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule )
                    // InternalDiv.g:1359:7: lv_rule_4_0= ruleDivDitchEnumerationLiteralRule
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

            // InternalDiv.g:1378:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_PLAIN_TEXT_ONLY && LA27_0<=RULE_RICH_TEXT_START)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDiv.g:1379:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:1379:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:1380:5: lv_description_5_0= ruleDRichText
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
    // InternalDiv.g:1401:1: entryRuleDivEntityTypeTransposition returns [EObject current=null] : iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF ;
    public final EObject entryRuleDivEntityTypeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivEntityTypeTransposition = null;


        try {
            // InternalDiv.g:1401:67: (iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF )
            // InternalDiv.g:1402:2: iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF
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
    // InternalDiv.g:1408:1: ruleDivEntityTypeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )? ) ;
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
            // InternalDiv.g:1414:2: ( ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )? ) )
            // InternalDiv.g:1415:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )? )
            {
            // InternalDiv.g:1415:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )? )
            // InternalDiv.g:1416:3: () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )?
            {
            // InternalDiv.g:1416:3: ()
            // InternalDiv.g:1417:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivEntityTypeTranspositionAccess().getTEntityTypeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1423:3: ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            else if ( (LA30_0==26) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDiv.g:1424:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1424:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) )
                    // InternalDiv.g:1425:5: otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivEntityTypeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1429:5: ( (lv_root_2_0= 'root' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==30) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalDiv.g:1430:6: (lv_root_2_0= 'root' )
                            {
                            // InternalDiv.g:1430:6: (lv_root_2_0= 'root' )
                            // InternalDiv.g:1431:7: lv_root_2_0= 'root'
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
                    // InternalDiv.g:1447:5: ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) )
                    // InternalDiv.g:1448:6: (lv_rule_4_0= ruleDivGrabComplexTypeRule )
                    {
                    // InternalDiv.g:1448:6: (lv_rule_4_0= ruleDivGrabComplexTypeRule )
                    // InternalDiv.g:1449:7: lv_rule_4_0= ruleDivGrabComplexTypeRule
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
                    // InternalDiv.g:1468:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1468:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) )
                    // InternalDiv.g:1469:5: otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivEntityTypeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1473:5: ( (lv_root_6_0= 'root' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==30) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalDiv.g:1474:6: (lv_root_6_0= 'root' )
                            {
                            // InternalDiv.g:1474:6: (lv_root_6_0= 'root' )
                            // InternalDiv.g:1475:7: lv_root_6_0= 'root'
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
                    // InternalDiv.g:1491:5: ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) )
                    // InternalDiv.g:1492:6: (lv_rule_8_0= ruleDivDitchComplexTypeRule )
                    {
                    // InternalDiv.g:1492:6: (lv_rule_8_0= ruleDivDitchComplexTypeRule )
                    // InternalDiv.g:1493:7: lv_rule_8_0= ruleDivDitchComplexTypeRule
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

            // InternalDiv.g:1512:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_PLAIN_TEXT_ONLY && LA31_0<=RULE_RICH_TEXT_START)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDiv.g:1513:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:1513:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:1514:5: lv_description_9_0= ruleDRichText
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

            // InternalDiv.g:1531:3: (this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDiv.g:1532:4: this_TComplexTypeFeatures_10= ruleTComplexTypeFeatures[$current]
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
    // InternalDiv.g:1548:1: entryRuleDivDetailTypeTransposition returns [EObject current=null] : iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF ;
    public final EObject entryRuleDivDetailTypeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDetailTypeTransposition = null;


        try {
            // InternalDiv.g:1548:67: (iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF )
            // InternalDiv.g:1549:2: iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF
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
    // InternalDiv.g:1555:1: ruleDivDetailTypeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? ) ;
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
            // InternalDiv.g:1561:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? ) )
            // InternalDiv.g:1562:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? )
            {
            // InternalDiv.g:1562:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? )
            // InternalDiv.g:1563:3: () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )?
            {
            // InternalDiv.g:1563:3: ()
            // InternalDiv.g:1564:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivDetailTypeTranspositionAccess().getTDetailTypeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1570:3: ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            else if ( (LA33_0==26) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDiv.g:1571:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1571:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) )
                    // InternalDiv.g:1572:5: otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivDetailTypeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivDetailTypeTranspositionAccess().getDetailKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1580:5: ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) )
                    // InternalDiv.g:1581:6: (lv_rule_3_0= ruleDivGrabComplexTypeRule )
                    {
                    // InternalDiv.g:1581:6: (lv_rule_3_0= ruleDivGrabComplexTypeRule )
                    // InternalDiv.g:1582:7: lv_rule_3_0= ruleDivGrabComplexTypeRule
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
                    // InternalDiv.g:1601:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1601:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) )
                    // InternalDiv.g:1602:5: otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivDetailTypeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivDetailTypeTranspositionAccess().getDetailKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1610:5: ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) )
                    // InternalDiv.g:1611:6: (lv_rule_6_0= ruleDivDitchComplexTypeRule )
                    {
                    // InternalDiv.g:1611:6: (lv_rule_6_0= ruleDivDitchComplexTypeRule )
                    // InternalDiv.g:1612:7: lv_rule_6_0= ruleDivDitchComplexTypeRule
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

            // InternalDiv.g:1631:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_PLAIN_TEXT_ONLY && LA34_0<=RULE_RICH_TEXT_START)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDiv.g:1632:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1632:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1633:5: lv_description_7_0= ruleDRichText
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

            // InternalDiv.g:1650:3: (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDiv.g:1651:4: this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current]
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
    // InternalDiv.g:1668:1: ruleTComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1674:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' ) )
            // InternalDiv.g:1675:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' )
            {
            // InternalDiv.g:1675:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' )
            // InternalDiv.g:1676:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalDiv.g:1680:3: ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==23||LA36_0==26) ) {
                    alt36=1;
                }
                else if ( (LA36_0==27) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDiv.g:1681:4: ( (lv_features_1_0= ruleDivFeature ) )
            	    {
            	    // InternalDiv.g:1681:4: ( (lv_features_1_0= ruleDivFeature ) )
            	    // InternalDiv.g:1682:5: (lv_features_1_0= ruleDivFeature )
            	    {
            	    // InternalDiv.g:1682:5: (lv_features_1_0= ruleDivFeature )
            	    // InternalDiv.g:1683:6: lv_features_1_0= ruleDivFeature
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
            	    // InternalDiv.g:1701:4: (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) )
            	    {
            	    // InternalDiv.g:1701:4: (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) )
            	    // InternalDiv.g:1702:5: otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getTComplexTypeFeaturesAccess().getAddKeyword_1_1_0());
            	      				
            	    }
            	    // InternalDiv.g:1706:5: ( (lv_constraints_3_0= ruleDConstraint ) )
            	    // InternalDiv.g:1707:6: (lv_constraints_3_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:1707:6: (lv_constraints_3_0= ruleDConstraint )
            	    // InternalDiv.g:1708:7: lv_constraints_3_0= ruleDConstraint
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
            	    break loop36;
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
    // InternalDiv.g:1735:1: entryRuleDivFeature returns [EObject current=null] : iv_ruleDivFeature= ruleDivFeature EOF ;
    public final EObject entryRuleDivFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivFeature = null;


        try {
            // InternalDiv.g:1735:51: (iv_ruleDivFeature= ruleDivFeature EOF )
            // InternalDiv.g:1736:2: iv_ruleDivFeature= ruleDivFeature EOF
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
    // InternalDiv.g:1742:1: ruleDivFeature returns [EObject current=null] : (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition ) ;
    public final EObject ruleDivFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DivAssociationTransposition_0 = null;

        EObject this_DivAttributeTransposition_1 = null;

        EObject this_DivQueryTransposition_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:1748:2: ( (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition ) )
            // InternalDiv.g:1749:2: (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition )
            {
            // InternalDiv.g:1749:2: (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                switch ( input.LA(2) ) {
                case 33:
                case 34:
                    {
                    alt37=1;
                    }
                    break;
                case RULE_ID:
                case 32:
                case 35:
                    {
                    alt37=2;
                    }
                    break;
                case 36:
                    {
                    alt37=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA37_0==26) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 32:
                case 35:
                    {
                    alt37=2;
                    }
                    break;
                case 36:
                    {
                    alt37=3;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt37=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDiv.g:1750:3: this_DivAssociationTransposition_0= ruleDivAssociationTransposition
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
                    // InternalDiv.g:1759:3: this_DivAttributeTransposition_1= ruleDivAttributeTransposition
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
                    // InternalDiv.g:1768:3: this_DivQueryTransposition_2= ruleDivQueryTransposition
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
    // InternalDiv.g:1780:1: entryRuleDivAssociationTransposition returns [EObject current=null] : iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF ;
    public final EObject entryRuleDivAssociationTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAssociationTransposition = null;


        try {
            // InternalDiv.g:1780:68: (iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF )
            // InternalDiv.g:1781:2: iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF
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
    // InternalDiv.g:1787:1: ruleDivAssociationTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:1793:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDiv.g:1794:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:1794:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDiv.g:1795:3: () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDiv.g:1795:3: ()
            // InternalDiv.g:1796:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivAssociationTranspositionAccess().getTAssociationTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1802:3: ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            else if ( (LA40_0==26) ) {
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
                    // InternalDiv.g:1803:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    {
                    // InternalDiv.g:1803:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:1804:5: otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivAssociationTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1808:5: (otherlv_2= 'reference' | otherlv_3= 'composite' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==33) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==34) ) {
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
                            // InternalDiv.g:1809:6: otherlv_2= 'reference'
                            {
                            otherlv_2=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getDivAssociationTranspositionAccess().getReferenceKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:1814:6: otherlv_3= 'composite'
                            {
                            otherlv_3=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getDivAssociationTranspositionAccess().getCompositeKeyword_1_0_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:1819:5: ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:1820:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:1820:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:1821:7: lv_rule_4_0= ruleDivGrabFeatureRule
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
                    // InternalDiv.g:1840:4: (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:1840:4: (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:1841:5: otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivAssociationTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1845:5: (otherlv_6= 'reference' | otherlv_7= 'composite' )
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
                            // InternalDiv.g:1846:6: otherlv_6= 'reference'
                            {
                            otherlv_6=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getDivAssociationTranspositionAccess().getReferenceKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:1851:6: otherlv_7= 'composite'
                            {
                            otherlv_7=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getDivAssociationTranspositionAccess().getCompositeKeyword_1_1_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:1856:5: ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:1857:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:1857:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:1858:7: lv_rule_8_0= ruleDivDitchFeatureRule
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

            // InternalDiv.g:1877:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_PLAIN_TEXT_ONLY && LA41_0<=RULE_RICH_TEXT_START)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDiv.g:1878:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:1878:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:1879:5: lv_description_9_0= ruleDRichText
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
    // InternalDiv.g:1900:1: entryRuleDivAttributeTransposition returns [EObject current=null] : iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF ;
    public final EObject entryRuleDivAttributeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAttributeTransposition = null;


        try {
            // InternalDiv.g:1900:66: (iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF )
            // InternalDiv.g:1901:2: iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF
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
    // InternalDiv.g:1907:1: ruleDivAttributeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:1913:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDiv.g:1914:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:1914:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDiv.g:1915:3: () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDiv.g:1915:3: ()
            // InternalDiv.g:1916:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivAttributeTranspositionAccess().getTAttributeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1922:3: ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            else if ( (LA44_0==26) ) {
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
                    // InternalDiv.g:1923:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    {
                    // InternalDiv.g:1923:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:1924:5: otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivAttributeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1928:5: (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )?
                    int alt42=3;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==35) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==32) ) {
                        alt42=2;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalDiv.g:1929:6: otherlv_2= 'attribute'
                            {
                            otherlv_2=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getDivAttributeTranspositionAccess().getAttributeKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:1934:6: ( (lv_detail_3_0= 'detail' ) )
                            {
                            // InternalDiv.g:1934:6: ( (lv_detail_3_0= 'detail' ) )
                            // InternalDiv.g:1935:7: (lv_detail_3_0= 'detail' )
                            {
                            // InternalDiv.g:1935:7: (lv_detail_3_0= 'detail' )
                            // InternalDiv.g:1936:8: lv_detail_3_0= 'detail'
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

                    // InternalDiv.g:1949:5: ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:1950:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:1950:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:1951:7: lv_rule_4_0= ruleDivGrabFeatureRule
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
                    // InternalDiv.g:1970:4: (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:1970:4: (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:1971:5: otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivAttributeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1975:5: (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )?
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
                            // InternalDiv.g:1976:6: otherlv_6= 'attribute'
                            {
                            otherlv_6=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getDivAttributeTranspositionAccess().getAttributeKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:1981:6: ( (lv_detail_7_0= 'detail' ) )
                            {
                            // InternalDiv.g:1981:6: ( (lv_detail_7_0= 'detail' ) )
                            // InternalDiv.g:1982:7: (lv_detail_7_0= 'detail' )
                            {
                            // InternalDiv.g:1982:7: (lv_detail_7_0= 'detail' )
                            // InternalDiv.g:1983:8: lv_detail_7_0= 'detail'
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

                    // InternalDiv.g:1996:5: ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:1997:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:1997:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:1998:7: lv_rule_8_0= ruleDivDitchFeatureRule
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

            // InternalDiv.g:2017:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_PLAIN_TEXT_ONLY && LA45_0<=RULE_RICH_TEXT_START)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDiv.g:2018:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:2018:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:2019:5: lv_description_9_0= ruleDRichText
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
    // InternalDiv.g:2040:1: entryRuleDivQueryTransposition returns [EObject current=null] : iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF ;
    public final EObject entryRuleDivQueryTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivQueryTransposition = null;


        try {
            // InternalDiv.g:2040:62: (iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF )
            // InternalDiv.g:2041:2: iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF
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
    // InternalDiv.g:2047:1: ruleDivQueryTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivQueryTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_rule_3_0 = null;

        EObject lv_rule_6_0 = null;

        EObject lv_description_7_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:2053:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2054:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2054:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            // InternalDiv.g:2055:3: () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )?
            {
            // InternalDiv.g:2055:3: ()
            // InternalDiv.g:2056:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivQueryTranspositionAccess().getTQueryTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2062:3: ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }
            else if ( (LA46_0==26) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDiv.g:2063:4: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) )
                    {
                    // InternalDiv.g:2063:4: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:2064:5: otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivQueryTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivQueryTranspositionAccess().getQueryKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:2072:5: ( (lv_rule_3_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:2073:6: (lv_rule_3_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:2073:6: (lv_rule_3_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:2074:7: lv_rule_3_0= ruleDivGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getRuleDivGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
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


                    }
                    break;
                case 2 :
                    // InternalDiv.g:2093:4: (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:2093:4: (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:2094:5: otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivQueryTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivQueryTranspositionAccess().getQueryKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:2102:5: ( (lv_rule_6_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:2103:6: (lv_rule_6_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:2103:6: (lv_rule_6_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:2104:7: lv_rule_6_0= ruleDivDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getRuleDivDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_rule_6_0=ruleDivDitchFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivQueryTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_6_0,
                      								"com.mimacom.ddd.dm.div.Div.DivDitchFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:2123:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_PLAIN_TEXT_ONLY && LA47_0<=RULE_RICH_TEXT_START)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDiv.g:2124:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:2124:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:2125:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivQueryTranspositionRule());
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
    // $ANTLR end "ruleDivQueryTransposition"


    // $ANTLR start "entryRuleDimAggregate"
    // InternalDiv.g:2146:1: entryRuleDimAggregate returns [EObject current=null] : iv_ruleDimAggregate= ruleDimAggregate EOF ;
    public final EObject entryRuleDimAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAggregate = null;


        try {
            // InternalDiv.g:2146:53: (iv_ruleDimAggregate= ruleDimAggregate EOF )
            // InternalDiv.g:2147:2: iv_ruleDimAggregate= ruleDimAggregate EOF
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
    // InternalDiv.g:2153:1: ruleDimAggregate returns [EObject current=null] : ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' ) ;
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
            // InternalDiv.g:2159:2: ( ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' ) )
            // InternalDiv.g:2160:2: ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' )
            {
            // InternalDiv.g:2160:2: ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' )
            // InternalDiv.g:2161:3: ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}'
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
            // InternalDiv.g:2168:3: ()
            // InternalDiv.g:2169:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAggregateAccess().getDimAggregateAction_1(),
              					current);
              			
            }

            }

            // InternalDiv.g:2175:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2176:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2176:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2177:5: lv_name_2_0= RULE_ID
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

            // InternalDiv.g:2193:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_PLAIN_TEXT_ONLY && LA48_0<=RULE_RICH_TEXT_START)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDiv.g:2194:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDiv.g:2194:4: (lv_description_3_0= ruleDRichText )
                    // InternalDiv.g:2195:5: lv_description_3_0= ruleDRichText
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

            otherlv_4=(Token)match(input,20,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimAggregateAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDiv.g:2216:3: (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==36) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDiv.g:2217:4: otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDimAggregateAccess().getQueryKeyword_5_0());
            	      			
            	    }
            	    // InternalDiv.g:2221:4: ( (lv_features_6_0= ruleDimQuery ) )
            	    // InternalDiv.g:2222:5: (lv_features_6_0= ruleDimQuery )
            	    {
            	    // InternalDiv.g:2222:5: (lv_features_6_0= ruleDimQuery )
            	    // InternalDiv.g:2223:6: lv_features_6_0= ruleDimQuery
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimAggregateAccess().getFeaturesDimQueryParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    break loop49;
                }
            } while (true);

            // InternalDiv.g:2241:3: ( (lv_types_7_0= ruleDimType ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==25||LA50_0==28||(LA50_0>=31 && LA50_0<=32)||(LA50_0>=42 && LA50_0<=43)||(LA50_0>=90 && LA50_0<=91)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDiv.g:2242:4: (lv_types_7_0= ruleDimType )
            	    {
            	    // InternalDiv.g:2242:4: (lv_types_7_0= ruleDimType )
            	    // InternalDiv.g:2243:5: lv_types_7_0= ruleDimType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimAggregateAccess().getTypesDimTypeParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop50;
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
    // InternalDiv.g:2268:1: entryRuleDAggregateKeyword returns [String current=null] : iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF ;
    public final String entryRuleDAggregateKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAggregateKeyword = null;


        try {
            // InternalDiv.g:2268:57: (iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF )
            // InternalDiv.g:2269:2: iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF
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
    // InternalDiv.g:2275:1: ruleDAggregateKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'component' ;
    public final AntlrDatatypeRuleToken ruleDAggregateKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:2281:2: (kw= 'component' )
            // InternalDiv.g:2282:2: kw= 'component'
            {
            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:2290:1: entryRuleDimType returns [EObject current=null] : iv_ruleDimType= ruleDimType EOF ;
    public final EObject entryRuleDimType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimType = null;


        try {
            // InternalDiv.g:2290:48: (iv_ruleDimType= ruleDimType EOF )
            // InternalDiv.g:2291:2: iv_ruleDimType= ruleDimType EOF
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
    // InternalDiv.g:2297:1: ruleDimType returns [EObject current=null] : (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType ) ;
    public final EObject ruleDimType() throws RecognitionException {
        EObject current = null;

        EObject this_DimPrimitive_0 = null;

        EObject this_DimEnumeration_1 = null;

        EObject this_DimEntityType_2 = null;

        EObject this_DimDetailType_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:2303:2: ( (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType ) )
            // InternalDiv.g:2304:2: (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType )
            {
            // InternalDiv.g:2304:2: (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt51=1;
                }
                break;
            case 28:
                {
                alt51=2;
                }
                break;
            case 42:
                {
                int LA51_3 = input.LA(2);

                if ( (LA51_3==32) ) {
                    alt51=4;
                }
                else if ( (LA51_3==31||LA51_3==43||(LA51_3>=90 && LA51_3<=91)) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 43:
            case 90:
            case 91:
                {
                alt51=3;
                }
                break;
            case 32:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalDiv.g:2305:3: this_DimPrimitive_0= ruleDimPrimitive
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
                    // InternalDiv.g:2314:3: this_DimEnumeration_1= ruleDimEnumeration
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
                    // InternalDiv.g:2323:3: this_DimEntityType_2= ruleDimEntityType
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
                    // InternalDiv.g:2332:3: this_DimDetailType_3= ruleDimDetailType
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
    // InternalDiv.g:2344:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalDiv.g:2344:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalDiv.g:2345:2: iv_ruleDConstraint= ruleDConstraint EOF
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
    // InternalDiv.g:2351:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:2357:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2358:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2358:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDiv.g:2359:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalDiv.g:2363:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:2364:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:2364:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:2365:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            // InternalDiv.g:2381:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==39) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDiv.g:2382:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:2386:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:2387:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2387:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:2388:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalDiv.g:2409:3: ( (lv_predicate_5_0= ruleDExpression ) )
            // InternalDiv.g:2410:4: (lv_predicate_5_0= ruleDExpression )
            {
            // InternalDiv.g:2410:4: (lv_predicate_5_0= ruleDExpression )
            // InternalDiv.g:2411:5: lv_predicate_5_0= ruleDExpression
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

            // InternalDiv.g:2428:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_PLAIN_TEXT_ONLY && LA53_0<=RULE_RICH_TEXT_START)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDiv.g:2429:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDiv.g:2429:4: (lv_description_6_0= ruleDRichText )
                    // InternalDiv.g:2430:5: lv_description_6_0= ruleDRichText
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
    // InternalDiv.g:2451:1: entryRuleDimPrimitive returns [EObject current=null] : iv_ruleDimPrimitive= ruleDimPrimitive EOF ;
    public final EObject entryRuleDimPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimPrimitive = null;


        try {
            // InternalDiv.g:2451:53: (iv_ruleDimPrimitive= ruleDimPrimitive EOF )
            // InternalDiv.g:2452:2: iv_ruleDimPrimitive= ruleDimPrimitive EOF
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
    // InternalDiv.g:2458:1: ruleDimPrimitive returns [EObject current=null] : ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? ) ;
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
            // InternalDiv.g:2464:2: ( ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? ) )
            // InternalDiv.g:2465:2: ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? )
            {
            // InternalDiv.g:2465:2: ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? )
            // InternalDiv.g:2466:3: () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )?
            {
            // InternalDiv.g:2466:3: ()
            // InternalDiv.g:2467:4: 
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
            // InternalDiv.g:2477:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2478:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2478:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2479:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            // InternalDiv.g:2495:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==39) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalDiv.g:2496:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimPrimitiveAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:2500:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:2501:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2501:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:2502:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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
            	    break loop54;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDimPrimitiveAccess().getRedefinesKeyword_4());
              		
            }
            // InternalDiv.g:2523:3: ( (otherlv_6= RULE_ID ) )
            // InternalDiv.g:2524:4: (otherlv_6= RULE_ID )
            {
            // InternalDiv.g:2524:4: (otherlv_6= RULE_ID )
            // InternalDiv.g:2525:5: otherlv_6= RULE_ID
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

            // InternalDiv.g:2536:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_PLAIN_TEXT_ONLY && LA55_0<=RULE_RICH_TEXT_START)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDiv.g:2537:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:2537:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:2538:5: lv_description_7_0= ruleDRichText
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

            // InternalDiv.g:2555:3: (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==20) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDiv.g:2556:4: otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDimPrimitiveAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    // InternalDiv.g:2560:4: ( (lv_constraints_9_0= ruleDConstraint ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==38) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalDiv.g:2561:5: (lv_constraints_9_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:2561:5: (lv_constraints_9_0= ruleDConstraint )
                    	    // InternalDiv.g:2562:6: lv_constraints_9_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDimPrimitiveAccess().getConstraintsDConstraintParserRuleCall_7_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_33);
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
                    	    if ( cnt56 >= 1 ) break loop56;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
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
    // InternalDiv.g:2588:1: entryRuleDimEnumeration returns [EObject current=null] : iv_ruleDimEnumeration= ruleDimEnumeration EOF ;
    public final EObject entryRuleDimEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimEnumeration = null;


        try {
            // InternalDiv.g:2588:55: (iv_ruleDimEnumeration= ruleDimEnumeration EOF )
            // InternalDiv.g:2589:2: iv_ruleDimEnumeration= ruleDimEnumeration EOF
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
    // InternalDiv.g:2595:1: ruleDimEnumeration returns [EObject current=null] : ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' ) ;
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
            // InternalDiv.g:2601:2: ( ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' ) )
            // InternalDiv.g:2602:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' )
            {
            // InternalDiv.g:2602:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' )
            // InternalDiv.g:2603:3: () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}'
            {
            // InternalDiv.g:2603:3: ()
            // InternalDiv.g:2604:4: 
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
            // InternalDiv.g:2614:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2615:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2615:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2616:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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

            // InternalDiv.g:2632:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==39) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDiv.g:2633:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimEnumerationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:2637:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:2638:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2638:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:2639:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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
            	    break loop58;
                }
            } while (true);

            // InternalDiv.g:2656:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_PLAIN_TEXT_ONLY && LA59_0<=RULE_RICH_TEXT_START)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDiv.g:2657:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:2657:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:2658:5: lv_description_5_0= ruleDRichText
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

            otherlv_6=(Token)match(input,20,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDimEnumerationAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDiv.g:2679:3: ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalDiv.g:2680:4: ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )*
                    {
                    // InternalDiv.g:2680:4: ( (lv_literals_7_0= ruleDimLiteral ) )
                    // InternalDiv.g:2681:5: (lv_literals_7_0= ruleDimLiteral )
                    {
                    // InternalDiv.g:2681:5: (lv_literals_7_0= ruleDimLiteral )
                    // InternalDiv.g:2682:6: lv_literals_7_0= ruleDimLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEnumerationAccess().getLiteralsDimLiteralParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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

                    // InternalDiv.g:2699:4: (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==29) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalDiv.g:2700:5: otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) )
                    	    {
                    	    otherlv_8=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getDimEnumerationAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:2704:5: ( (lv_literals_9_0= ruleDimLiteral ) )
                    	    // InternalDiv.g:2705:6: (lv_literals_9_0= ruleDimLiteral )
                    	    {
                    	    // InternalDiv.g:2705:6: (lv_literals_9_0= ruleDimLiteral )
                    	    // InternalDiv.g:2706:7: lv_literals_9_0= ruleDimLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimEnumerationAccess().getLiteralsDimLiteralParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
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
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDiv.g:2725:3: ( (lv_constraints_10_0= ruleDConstraint ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==38) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalDiv.g:2726:4: (lv_constraints_10_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:2726:4: (lv_constraints_10_0= ruleDConstraint )
            	    // InternalDiv.g:2727:5: lv_constraints_10_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimEnumerationAccess().getConstraintsDConstraintParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop62;
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
    // InternalDiv.g:2752:1: entryRuleDimLiteral returns [EObject current=null] : iv_ruleDimLiteral= ruleDimLiteral EOF ;
    public final EObject entryRuleDimLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimLiteral = null;


        try {
            // InternalDiv.g:2752:51: (iv_ruleDimLiteral= ruleDimLiteral EOF )
            // InternalDiv.g:2753:2: iv_ruleDimLiteral= ruleDimLiteral EOF
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
    // InternalDiv.g:2759:1: ruleDimLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:2765:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2766:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2766:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDiv.g:2767:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalDiv.g:2767:3: ()
            // InternalDiv.g:2768:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimLiteralAccess().getDimLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2774:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:2775:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:2775:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:2776:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            // InternalDiv.g:2792:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==39) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalDiv.g:2793:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDimLiteralAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:2797:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:2798:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2798:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:2799:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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
            	    break loop63;
                }
            } while (true);

            // InternalDiv.g:2816:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_PLAIN_TEXT_ONLY && LA64_0<=RULE_RICH_TEXT_START)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDiv.g:2817:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:2817:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:2818:5: lv_description_4_0= ruleDRichText
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
    // InternalDiv.g:2839:1: entryRuleDimEntityType returns [EObject current=null] : iv_ruleDimEntityType= ruleDimEntityType EOF ;
    public final EObject entryRuleDimEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimEntityType = null;


        try {
            // InternalDiv.g:2839:54: (iv_ruleDimEntityType= ruleDimEntityType EOF )
            // InternalDiv.g:2840:2: iv_ruleDimEntityType= ruleDimEntityType EOF
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
    // InternalDiv.g:2846:1: ruleDimEntityType returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' ) ;
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
            // InternalDiv.g:2852:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' ) )
            // InternalDiv.g:2853:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' )
            {
            // InternalDiv.g:2853:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' )
            // InternalDiv.g:2854:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}'
            {
            // InternalDiv.g:2854:3: ()
            // InternalDiv.g:2855:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimEntityTypeAccess().getDimEntityTypeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2861:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==42) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDiv.g:2862:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalDiv.g:2862:4: (lv_abstract_1_0= 'abstract' )
                    // InternalDiv.g:2863:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,42,FOLLOW_38); if (state.failed) return current;
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

            // InternalDiv.g:2875:3: ( (lv_root_2_0= 'main' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==43) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDiv.g:2876:4: (lv_root_2_0= 'main' )
                    {
                    // InternalDiv.g:2876:4: (lv_root_2_0= 'main' )
                    // InternalDiv.g:2877:5: lv_root_2_0= 'main'
                    {
                    lv_root_2_0=(Token)match(input,43,FOLLOW_38); if (state.failed) return current;
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

            // InternalDiv.g:2889:3: (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt67=1;
                }
                break;
            case 90:
                {
                alt67=2;
                }
                break;
            case 91:
                {
                alt67=3;
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
                    // InternalDiv.g:2890:4: otherlv_3= 'entity'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimEntityTypeAccess().getEntityKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:2895:4: ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' )
                    {
                    // InternalDiv.g:2895:4: ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' )
                    // InternalDiv.g:2896:5: ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity'
                    {
                    // InternalDiv.g:2896:5: ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) )
                    // InternalDiv.g:2897:6: (lv_nature_4_0= ruleDEntityNatureAutonomous )
                    {
                    // InternalDiv.g:2897:6: (lv_nature_4_0= ruleDEntityNatureAutonomous )
                    // InternalDiv.g:2898:7: lv_nature_4_0= ruleDEntityNatureAutonomous
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
                    // InternalDiv.g:2921:4: ( (lv_nature_6_0= ruleDEntityNatureRelationship ) )
                    {
                    // InternalDiv.g:2921:4: ( (lv_nature_6_0= ruleDEntityNatureRelationship ) )
                    // InternalDiv.g:2922:5: (lv_nature_6_0= ruleDEntityNatureRelationship )
                    {
                    // InternalDiv.g:2922:5: (lv_nature_6_0= ruleDEntityNatureRelationship )
                    // InternalDiv.g:2923:6: lv_nature_6_0= ruleDEntityNatureRelationship
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
            otherlv_8=(Token)match(input,20,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDiv.g:2956:3: (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==44) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDiv.g:2957:4: otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )?
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDimEntityTypeAccess().getStatesKeyword_6_0());
                      			
                    }
                    otherlv_10=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalDiv.g:2965:4: ( (lv_states_11_0= ruleDState ) )
                    // InternalDiv.g:2966:5: (lv_states_11_0= ruleDState )
                    {
                    // InternalDiv.g:2966:5: (lv_states_11_0= ruleDState )
                    // InternalDiv.g:2967:6: lv_states_11_0= ruleDState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getStatesDStateParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalDiv.g:2984:4: (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==29) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalDiv.g:2985:5: otherlv_12= ',' ( (lv_states_13_0= ruleDState ) )
                    	    {
                    	    otherlv_12=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getDimEntityTypeAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:2989:5: ( (lv_states_13_0= ruleDState ) )
                    	    // InternalDiv.g:2990:6: (lv_states_13_0= ruleDState )
                    	    {
                    	    // InternalDiv.g:2990:6: (lv_states_13_0= ruleDState )
                    	    // InternalDiv.g:2991:7: lv_states_13_0= ruleDState
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getStatesDStateParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_6_4());
                      			
                    }
                    // InternalDiv.g:3013:4: (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==45) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalDiv.g:3014:5: otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}'
                            {
                            otherlv_15=(Token)match(input,45,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getDimEntityTypeAccess().getEventsKeyword_6_5_0());
                              				
                            }
                            otherlv_16=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_6_5_1());
                              				
                            }
                            // InternalDiv.g:3022:5: ( (lv_events_17_0= ruleDStateEvent ) )
                            // InternalDiv.g:3023:6: (lv_events_17_0= ruleDStateEvent )
                            {
                            // InternalDiv.g:3023:6: (lv_events_17_0= ruleDStateEvent )
                            // InternalDiv.g:3024:7: lv_events_17_0= ruleDStateEvent
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getEventsDStateEventParserRuleCall_6_5_2_0());
                              						
                            }
                            pushFollow(FOLLOW_40);
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

                            // InternalDiv.g:3041:5: (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==29) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // InternalDiv.g:3042:6: otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) )
                            	    {
                            	    otherlv_18=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_18, grammarAccess.getDimEntityTypeAccess().getCommaKeyword_6_5_3_0());
                            	      					
                            	    }
                            	    // InternalDiv.g:3046:6: ( (lv_events_19_0= ruleDStateEvent ) )
                            	    // InternalDiv.g:3047:7: (lv_events_19_0= ruleDStateEvent )
                            	    {
                            	    // InternalDiv.g:3047:7: (lv_events_19_0= ruleDStateEvent )
                            	    // InternalDiv.g:3048:8: lv_events_19_0= ruleDStateEvent
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDimEntityTypeAccess().getEventsDStateEventParserRuleCall_6_5_3_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_40);
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
                            	    break loop69;
                                }
                            } while (true);

                            otherlv_20=(Token)match(input,21,FOLLOW_42); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_20, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_6_5_4());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDiv.g:3072:3: ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )*
            loop72:
            do {
                int alt72=3;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_ID||LA72_0==32||LA72_0==47) ) {
                    alt72=1;
                }
                else if ( (LA72_0==38) ) {
                    alt72=2;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalDiv.g:3073:4: ( (lv_features_21_0= ruleDimFeature ) )
            	    {
            	    // InternalDiv.g:3073:4: ( (lv_features_21_0= ruleDimFeature ) )
            	    // InternalDiv.g:3074:5: (lv_features_21_0= ruleDimFeature )
            	    {
            	    // InternalDiv.g:3074:5: (lv_features_21_0= ruleDimFeature )
            	    // InternalDiv.g:3075:6: lv_features_21_0= ruleDimFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getFeaturesDimFeatureParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    // InternalDiv.g:3093:4: ( (lv_constraints_22_0= ruleDConstraint ) )
            	    {
            	    // InternalDiv.g:3093:4: ( (lv_constraints_22_0= ruleDConstraint ) )
            	    // InternalDiv.g:3094:5: (lv_constraints_22_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:3094:5: (lv_constraints_22_0= ruleDConstraint )
            	    // InternalDiv.g:3095:6: lv_constraints_22_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getConstraintsDConstraintParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    break loop72;
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
    // InternalDiv.g:3121:1: entryRuleDState returns [EObject current=null] : iv_ruleDState= ruleDState EOF ;
    public final EObject entryRuleDState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDState = null;


        try {
            // InternalDiv.g:3121:47: (iv_ruleDState= ruleDState EOF )
            // InternalDiv.g:3122:2: iv_ruleDState= ruleDState EOF
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
    // InternalDiv.g:3128:1: ruleDState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:3134:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:3135:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:3135:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3136:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3136:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3137:4: lv_name_0_0= RULE_ID
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
    // InternalDiv.g:3156:1: entryRuleDStateEvent returns [EObject current=null] : iv_ruleDStateEvent= ruleDStateEvent EOF ;
    public final EObject entryRuleDStateEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStateEvent = null;


        try {
            // InternalDiv.g:3156:52: (iv_ruleDStateEvent= ruleDStateEvent EOF )
            // InternalDiv.g:3157:2: iv_ruleDStateEvent= ruleDStateEvent EOF
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
    // InternalDiv.g:3163:1: ruleDStateEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDStateEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:3169:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:3170:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:3170:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3171:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3171:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3172:4: lv_name_0_0= RULE_ID
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
    // InternalDiv.g:3191:1: entryRuleDimDetailType returns [EObject current=null] : iv_ruleDimDetailType= ruleDimDetailType EOF ;
    public final EObject entryRuleDimDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimDetailType = null;


        try {
            // InternalDiv.g:3191:54: (iv_ruleDimDetailType= ruleDimDetailType EOF )
            // InternalDiv.g:3192:2: iv_ruleDimDetailType= ruleDimDetailType EOF
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
    // InternalDiv.g:3198:1: ruleDimDetailType returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) ;
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
            // InternalDiv.g:3204:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) )
            // InternalDiv.g:3205:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            {
            // InternalDiv.g:3205:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            // InternalDiv.g:3206:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}'
            {
            // InternalDiv.g:3206:3: ()
            // InternalDiv.g:3207:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimDetailTypeAccess().getDimDetailTypeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3213:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==42) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalDiv.g:3214:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalDiv.g:3214:4: (lv_abstract_1_0= 'abstract' )
                    // InternalDiv.g:3215:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,42,FOLLOW_24); if (state.failed) return current;
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
            otherlv_4=(Token)match(input,20,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimDetailTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDiv.g:3246:3: ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_ID||LA74_0==32||LA74_0==47) ) {
                    alt74=1;
                }
                else if ( (LA74_0==38) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalDiv.g:3247:4: ( (lv_features_5_0= ruleDimFeature ) )
            	    {
            	    // InternalDiv.g:3247:4: ( (lv_features_5_0= ruleDimFeature ) )
            	    // InternalDiv.g:3248:5: (lv_features_5_0= ruleDimFeature )
            	    {
            	    // InternalDiv.g:3248:5: (lv_features_5_0= ruleDimFeature )
            	    // InternalDiv.g:3249:6: lv_features_5_0= ruleDimFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimDetailTypeAccess().getFeaturesDimFeatureParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    // InternalDiv.g:3267:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    {
            	    // InternalDiv.g:3267:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    // InternalDiv.g:3268:5: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:3268:5: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDiv.g:3269:6: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimDetailTypeAccess().getConstraintsDConstraintParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    break loop74;
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
    // InternalDiv.g:3296:1: ruleDimComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:3302:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3303:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3303:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:3304:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3304:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3305:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3305:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3306:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
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

            // InternalDiv.g:3322:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==39) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalDiv.g:3323:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDimComplexTypeAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDiv.g:3327:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDiv.g:3328:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3328:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDiv.g:3329:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
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
            	    break loop75;
                }
            } while (true);

            // InternalDiv.g:3346:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==46) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDiv.g:3347:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:3351:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDiv.g:3352:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDiv.g:3352:5: (otherlv_4= RULE_ID )
                    // InternalDiv.g:3353:6: otherlv_4= RULE_ID
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

            // InternalDiv.g:3365:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_PLAIN_TEXT_ONLY && LA77_0<=RULE_RICH_TEXT_START)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDiv.g:3366:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:3366:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:3367:5: lv_description_5_0= ruleDRichText
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
    // InternalDiv.g:3388:1: entryRuleDimFeature returns [EObject current=null] : iv_ruleDimFeature= ruleDimFeature EOF ;
    public final EObject entryRuleDimFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimFeature = null;


        try {
            // InternalDiv.g:3388:51: (iv_ruleDimFeature= ruleDimFeature EOF )
            // InternalDiv.g:3389:2: iv_ruleDimFeature= ruleDimFeature EOF
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
    // InternalDiv.g:3395:1: ruleDimFeature returns [EObject current=null] : (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery ) ;
    public final EObject ruleDimFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DimAssociation_0 = null;

        EObject this_DimAttribute_1 = null;

        EObject this_DimQuery_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:3401:2: ( (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery ) )
            // InternalDiv.g:3402:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )
            {
            // InternalDiv.g:3402:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalDiv.g:3403:3: this_DimAssociation_0= ruleDimAssociation
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
                    // InternalDiv.g:3412:3: this_DimAttribute_1= ruleDimAttribute
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
                    // InternalDiv.g:3421:3: this_DimQuery_2= ruleDimQuery
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
    // InternalDiv.g:3433:1: entryRuleDimAssociation returns [EObject current=null] : iv_ruleDimAssociation= ruleDimAssociation EOF ;
    public final EObject entryRuleDimAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAssociation = null;


        try {
            // InternalDiv.g:3433:55: (iv_ruleDimAssociation= ruleDimAssociation EOF )
            // InternalDiv.g:3434:2: iv_ruleDimAssociation= ruleDimAssociation EOF
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
    // InternalDiv.g:3440:1: ruleDimAssociation returns [EObject current=null] : ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:3446:2: ( ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3447:2: ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3447:2: ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            // InternalDiv.g:3448:3: () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3448:3: ()
            // InternalDiv.g:3449:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAssociationAccess().getDimAssociationAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3455:3: ( (lv_derived_1_0= 'derived' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==47) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDiv.g:3456:4: (lv_derived_1_0= 'derived' )
                    {
                    // InternalDiv.g:3456:4: (lv_derived_1_0= 'derived' )
                    // InternalDiv.g:3457:5: lv_derived_1_0= 'derived'
                    {
                    lv_derived_1_0=(Token)match(input,47,FOLLOW_3); if (state.failed) return current;
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

            // InternalDiv.g:3469:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:3470:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:3470:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:3471:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
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

            // InternalDiv.g:3487:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==39) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalDiv.g:3488:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimAssociationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:3492:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:3493:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3493:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:3494:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
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
            	    break loop80;
                }
            } while (true);

            // InternalDiv.g:3511:3: ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==48||LA81_0==92) ) {
                alt81=1;
            }
            else if ( (LA81_0==93) ) {
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
                    // InternalDiv.g:3512:4: ( (lv_kind_5_0= ruleDAssociationKind ) )
                    {
                    // InternalDiv.g:3512:4: ( (lv_kind_5_0= ruleDAssociationKind ) )
                    // InternalDiv.g:3513:5: (lv_kind_5_0= ruleDAssociationKind )
                    {
                    // InternalDiv.g:3513:5: (lv_kind_5_0= ruleDAssociationKind )
                    // InternalDiv.g:3514:6: lv_kind_5_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimAssociationAccess().getKindDAssociationKindEnumRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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
                    // InternalDiv.g:3532:4: ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' )
                    {
                    // InternalDiv.g:3532:4: ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' )
                    // InternalDiv.g:3533:5: ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains'
                    {
                    // InternalDiv.g:3533:5: ( (lv_kind_6_0= ruleDAssociationKindInverse ) )
                    // InternalDiv.g:3534:6: (lv_kind_6_0= ruleDAssociationKindInverse )
                    {
                    // InternalDiv.g:3534:6: (lv_kind_6_0= ruleDAssociationKindInverse )
                    // InternalDiv.g:3535:7: lv_kind_6_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDimAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_46);
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

                    otherlv_7=(Token)match(input,48,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getDimAssociationAccess().getContainsKeyword_4_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3558:3: ( (otherlv_8= RULE_ID ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==50) ) {
                    int LA82_3 = input.LA(3);

                    if ( (LA82_3==RULE_NATURAL) ) {
                        alt82=1;
                    }
                }
                else if ( (LA82_1==EOF||(LA82_1>=RULE_ID && LA82_1<=RULE_RICH_TEXT_START)||LA82_1==21||LA82_1==32||LA82_1==38||LA82_1==47||LA82_1==62||LA82_1==87||LA82_1==128) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // InternalDiv.g:3559:4: (otherlv_8= RULE_ID )
                    {
                    // InternalDiv.g:3559:4: (otherlv_8= RULE_ID )
                    // InternalDiv.g:3560:5: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAssociationRule());
                      					}
                      				
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getDimAssociationAccess().getTypeDEntityTypeCrossReference_5_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3571:3: ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==50||LA83_0==62||LA83_0==87||LA83_0==128) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalDiv.g:3572:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:3572:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    // InternalDiv.g:3573:5: lv_multiplicity_9_0= ruleDMultiplicity
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

            // InternalDiv.g:3590:3: ( (lv_description_10_0= ruleDRichText ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=RULE_PLAIN_TEXT_ONLY && LA84_0<=RULE_RICH_TEXT_START)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDiv.g:3591:4: (lv_description_10_0= ruleDRichText )
                    {
                    // InternalDiv.g:3591:4: (lv_description_10_0= ruleDRichText )
                    // InternalDiv.g:3592:5: lv_description_10_0= ruleDRichText
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
    // InternalDiv.g:3613:1: entryRuleDimAttribute returns [EObject current=null] : iv_ruleDimAttribute= ruleDimAttribute EOF ;
    public final EObject entryRuleDimAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAttribute = null;


        try {
            // InternalDiv.g:3613:53: (iv_ruleDimAttribute= ruleDimAttribute EOF )
            // InternalDiv.g:3614:2: iv_ruleDimAttribute= ruleDimAttribute EOF
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
    // InternalDiv.g:3620:1: ruleDimAttribute returns [EObject current=null] : ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:3626:2: ( ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3627:2: ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3627:2: ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDiv.g:3628:3: () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3628:3: ()
            // InternalDiv.g:3629:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAttributeAccess().getDimAttributeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3635:3: ( (lv_detail_1_0= 'detail' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==32) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalDiv.g:3636:4: (lv_detail_1_0= 'detail' )
                    {
                    // InternalDiv.g:3636:4: (lv_detail_1_0= 'detail' )
                    // InternalDiv.g:3637:5: lv_detail_1_0= 'detail'
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

            // InternalDiv.g:3649:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:3650:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:3650:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:3651:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            // InternalDiv.g:3667:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==39) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalDiv.g:3668:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimAttributeAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:3672:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:3673:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3673:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:3674:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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
            	    break loop86;
                }
            } while (true);

            otherlv_5=(Token)match(input,40,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDimAttributeAccess().getColonKeyword_4());
              		
            }
            // InternalDiv.g:3695:3: ( (otherlv_6= RULE_ID ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==EOF||(LA87_1>=RULE_ID && LA87_1<=RULE_RICH_TEXT_START)||LA87_1==21||LA87_1==32||LA87_1==38||LA87_1==47||LA87_1==49||LA87_1==62||LA87_1==87||LA87_1==128) ) {
                    alt87=1;
                }
                else if ( (LA87_1==50) ) {
                    int LA87_4 = input.LA(3);

                    if ( (LA87_4==RULE_NATURAL) ) {
                        alt87=1;
                    }
                }
            }
            switch (alt87) {
                case 1 :
                    // InternalDiv.g:3696:4: (otherlv_6= RULE_ID )
                    {
                    // InternalDiv.g:3696:4: (otherlv_6= RULE_ID )
                    // InternalDiv.g:3697:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAttributeRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDimAttributeAccess().getTypeDTypeCrossReference_5_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3708:3: ( (lv_multiplicity_7_0= ruleDMultiplicity ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==50||LA88_0==62||LA88_0==87||LA88_0==128) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalDiv.g:3709:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:3709:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    // InternalDiv.g:3710:5: lv_multiplicity_7_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_50);
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

            // InternalDiv.g:3727:3: ( (lv_key_8_0= 'key' ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==49) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalDiv.g:3728:4: (lv_key_8_0= 'key' )
                    {
                    // InternalDiv.g:3728:4: (lv_key_8_0= 'key' )
                    // InternalDiv.g:3729:5: lv_key_8_0= 'key'
                    {
                    lv_key_8_0=(Token)match(input,49,FOLLOW_21); if (state.failed) return current;
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

            // InternalDiv.g:3741:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=RULE_PLAIN_TEXT_ONLY && LA90_0<=RULE_RICH_TEXT_START)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalDiv.g:3742:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:3742:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:3743:5: lv_description_9_0= ruleDRichText
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
    // InternalDiv.g:3764:1: entryRuleDimQuery returns [EObject current=null] : iv_ruleDimQuery= ruleDimQuery EOF ;
    public final EObject entryRuleDimQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimQuery = null;


        try {
            // InternalDiv.g:3764:49: (iv_ruleDimQuery= ruleDimQuery EOF )
            // InternalDiv.g:3765:2: iv_ruleDimQuery= ruleDimQuery EOF
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
    // InternalDiv.g:3771:1: ruleDimQuery returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:3777:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3778:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3778:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? )
            // InternalDiv.g:3779:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3779:3: ()
            // InternalDiv.g:3780:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimQueryAccess().getDimQueryAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3786:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:3787:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:3787:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:3788:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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

            // InternalDiv.g:3804:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==39) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalDiv.g:3805:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDimQueryAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:3809:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:3810:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3810:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:3811:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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
            	    break loop91;
                }
            } while (true);

            otherlv_4=(Token)match(input,50,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimQueryAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalDiv.g:3832:3: ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalDiv.g:3833:4: ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )*
                    {
                    // InternalDiv.g:3833:4: ( (lv_parameters_5_0= ruleDimQueryParameter ) )
                    // InternalDiv.g:3834:5: (lv_parameters_5_0= ruleDimQueryParameter )
                    {
                    // InternalDiv.g:3834:5: (lv_parameters_5_0= ruleDimQueryParameter )
                    // InternalDiv.g:3835:6: lv_parameters_5_0= ruleDimQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimQueryAccess().getParametersDimQueryParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
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

                    // InternalDiv.g:3852:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==29) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalDiv.g:3853:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getDimQueryAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:3857:5: ( (lv_parameters_7_0= ruleDimQueryParameter ) )
                    	    // InternalDiv.g:3858:6: (lv_parameters_7_0= ruleDimQueryParameter )
                    	    {
                    	    // InternalDiv.g:3858:6: (lv_parameters_7_0= ruleDimQueryParameter )
                    	    // InternalDiv.g:3859:7: lv_parameters_7_0= ruleDimQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimQueryAccess().getParametersDimQueryParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_53);
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
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,51,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimQueryAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,40,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDimQueryAccess().getColonKeyword_6());
              		
            }
            // InternalDiv.g:3886:3: ( (otherlv_10= RULE_ID ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                int LA94_1 = input.LA(2);

                if ( (LA94_1==50) ) {
                    int LA94_3 = input.LA(3);

                    if ( (LA94_3==RULE_NATURAL) ) {
                        alt94=1;
                    }
                }
                else if ( (LA94_1==EOF||(LA94_1>=RULE_ID && LA94_1<=RULE_RICH_TEXT_START)||LA94_1==21||LA94_1==25||LA94_1==28||(LA94_1>=31 && LA94_1<=32)||LA94_1==36||LA94_1==38||(LA94_1>=42 && LA94_1<=43)||LA94_1==47||LA94_1==52||LA94_1==62||LA94_1==87||(LA94_1>=90 && LA94_1<=91)||LA94_1==128) ) {
                    alt94=1;
                }
            }
            switch (alt94) {
                case 1 :
                    // InternalDiv.g:3887:4: (otherlv_10= RULE_ID )
                    {
                    // InternalDiv.g:3887:4: (otherlv_10= RULE_ID )
                    // InternalDiv.g:3888:5: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimQueryRule());
                      					}
                      				
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getDimQueryAccess().getTypeDTypeCrossReference_7_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3899:3: ( (lv_multiplicity_11_0= ruleDMultiplicity ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==50||LA95_0==62||LA95_0==87||LA95_0==128) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalDiv.g:3900:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:3900:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    // InternalDiv.g:3901:5: lv_multiplicity_11_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryAccess().getMultiplicityDMultiplicityParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_57);
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

            // InternalDiv.g:3918:3: (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==52) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalDiv.g:3919:4: otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) )
                    {
                    otherlv_12=(Token)match(input,52,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDimQueryAccess().getReturnsKeyword_9_0());
                      			
                    }
                    // InternalDiv.g:3923:4: ( (lv_returns_13_0= ruleDExpression ) )
                    // InternalDiv.g:3924:5: (lv_returns_13_0= ruleDExpression )
                    {
                    // InternalDiv.g:3924:5: (lv_returns_13_0= ruleDExpression )
                    // InternalDiv.g:3925:6: lv_returns_13_0= ruleDExpression
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

            // InternalDiv.g:3943:3: ( (lv_description_14_0= ruleDRichText ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=RULE_PLAIN_TEXT_ONLY && LA97_0<=RULE_RICH_TEXT_START)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalDiv.g:3944:4: (lv_description_14_0= ruleDRichText )
                    {
                    // InternalDiv.g:3944:4: (lv_description_14_0= ruleDRichText )
                    // InternalDiv.g:3945:5: lv_description_14_0= ruleDRichText
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
    // InternalDiv.g:3966:1: entryRuleDimQueryParameter returns [EObject current=null] : iv_ruleDimQueryParameter= ruleDimQueryParameter EOF ;
    public final EObject entryRuleDimQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimQueryParameter = null;


        try {
            // InternalDiv.g:3966:58: (iv_ruleDimQueryParameter= ruleDimQueryParameter EOF )
            // InternalDiv.g:3967:2: iv_ruleDimQueryParameter= ruleDimQueryParameter EOF
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
    // InternalDiv.g:3973:1: ruleDimQueryParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:3979:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3980:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3980:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:3981:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3981:3: ()
            // InternalDiv.g:3982:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimQueryParameterAccess().getDimQueryParameterAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3988:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:3989:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:3989:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:3990:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,40,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDimQueryParameterAccess().getColonKeyword_2());
              		
            }
            // InternalDiv.g:4010:3: ( (otherlv_3= RULE_ID ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalDiv.g:4011:4: (otherlv_3= RULE_ID )
                    {
                    // InternalDiv.g:4011:4: (otherlv_3= RULE_ID )
                    // InternalDiv.g:4012:5: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimQueryParameterRule());
                      					}
                      				
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDimQueryParameterAccess().getTypeDTypeCrossReference_3_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:4023:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==50||LA99_0==62||LA99_0==87||LA99_0==128) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalDiv.g:4024:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4024:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDiv.g:4025:5: lv_multiplicity_4_0= ruleDMultiplicity
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

            // InternalDiv.g:4042:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=RULE_PLAIN_TEXT_ONLY && LA100_0<=RULE_RICH_TEXT_START)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalDiv.g:4043:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:4043:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:4044:5: lv_description_5_0= ruleDRichText
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
    // InternalDiv.g:4065:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDiv.g:4065:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDiv.g:4066:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDiv.g:4072:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4078:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDiv.g:4079:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDiv.g:4079:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDiv.g:4080:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDiv.g:4084:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDiv.g:4085:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDiv.g:4085:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDiv.g:4086:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalDiv.g:4107:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalDiv.g:4107:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalDiv.g:4108:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalDiv.g:4114:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalDiv.g:4120:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalDiv.g:4121:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalDiv.g:4121:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalDiv.g:4122:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalDiv.g:4126:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4127:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4127:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4128:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
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

            // InternalDiv.g:4144:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==55) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDiv.g:4145:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:4149:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalDiv.g:4150:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalDiv.g:4150:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalDiv.g:4151:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_59);
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

                    // InternalDiv.g:4168:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==29) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalDiv.g:4169:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:4173:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalDiv.g:4174:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalDiv.g:4174:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalDiv.g:4175:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_59);
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
                    	    break loop101;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDiv.g:4198:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalDiv.g:4199:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalDiv.g:4199:4: (lv_expr_7_0= ruleDExpression )
            // InternalDiv.g:4200:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_60);
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
    // InternalDiv.g:4225:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalDiv.g:4225:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalDiv.g:4226:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalDiv.g:4232:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalDiv.g:4238:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalDiv.g:4239:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalDiv.g:4239:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalDiv.g:4240:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalDiv.g:4240:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:4241:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:4241:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:4242:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalDiv.g:4262:3: ( (otherlv_2= RULE_ID ) )
            // InternalDiv.g:4263:4: (otherlv_2= RULE_ID )
            {
            // InternalDiv.g:4263:4: (otherlv_2= RULE_ID )
            // InternalDiv.g:4264:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDiv.g:4275:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==50||LA103_0==62||LA103_0==87||LA103_0==128) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalDiv.g:4276:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4276:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDiv.g:4277:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_62);
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

            // InternalDiv.g:4294:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==56) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalDiv.g:4295:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalDiv.g:4299:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( ((LA104_0>=RULE_NATURAL && LA104_0<=RULE_STRING)||(LA104_0>=31 && LA104_0<=32)||(LA104_0>=79 && LA104_0<=84)) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==20) ) {
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
                            // InternalDiv.g:4300:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalDiv.g:4300:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalDiv.g:4301:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalDiv.g:4301:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalDiv.g:4302:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalDiv.g:4320:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalDiv.g:4320:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalDiv.g:4321:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalDiv.g:4321:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalDiv.g:4322:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalDiv.g:4345:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalDiv.g:4345:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalDiv.g:4346:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalDiv.g:4352:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalDiv.g:4358:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalDiv.g:4359:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalDiv.g:4359:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalDiv.g:4360:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalDiv.g:4360:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:4361:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:4361:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:4362:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_64); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,57,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,50,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:4386:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalDiv.g:4387:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalDiv.g:4387:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalDiv.g:4388:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_67);
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

            // InternalDiv.g:4405:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt106=0;
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==29) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalDiv.g:4406:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDiv.g:4410:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalDiv.g:4411:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalDiv.g:4411:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalDiv.g:4412:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
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
            	    if ( cnt106 >= 1 ) break loop106;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(106, input);
                        throw eee;
                }
                cnt106++;
            } while (true);

            otherlv_6=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:4438:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalDiv.g:4438:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalDiv.g:4439:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalDiv.g:4445:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4451:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDiv.g:4452:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:4452:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDiv.g:4453:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDiv.g:4457:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4458:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4458:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4459:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,59,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalDiv.g:4479:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalDiv.g:4480:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalDiv.g:4480:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalDiv.g:4481:5: lv_baseType_3_0= ruleDmxBaseType
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

            // InternalDiv.g:4498:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( ((LA107_0>=RULE_PLAIN_TEXT_ONLY && LA107_0<=RULE_RICH_TEXT_START)) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalDiv.g:4499:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:4499:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:4500:5: lv_description_4_0= ruleDRichText
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
    // InternalDiv.g:4521:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalDiv.g:4521:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalDiv.g:4522:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalDiv.g:4528:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalDiv.g:4534:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalDiv.g:4535:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalDiv.g:4535:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalDiv.g:4536:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalDiv.g:4540:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4541:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4541:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4542:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,50,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:4562:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_ID) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalDiv.g:4563:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalDiv.g:4563:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalDiv.g:4564:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalDiv.g:4564:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalDiv.g:4565:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
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

                    // InternalDiv.g:4582:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==29) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalDiv.g:4583:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:4587:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalDiv.g:4588:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalDiv.g:4588:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalDiv.g:4589:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_53);
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
                    	    break loop108;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,51,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,40,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalDiv.g:4616:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDiv.g:4617:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDiv.g:4617:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalDiv.g:4618:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_70);
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

            // InternalDiv.g:4635:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==61) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalDiv.g:4636:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,61,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalDiv.g:4640:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalDiv.g:4641:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalDiv.g:4641:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalDiv.g:4642:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalDiv.g:4664:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalDiv.g:4664:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalDiv.g:4665:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalDiv.g:4671:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4677:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalDiv.g:4678:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalDiv.g:4678:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalDiv.g:4679:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalDiv.g:4679:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=94 && LA111_0<=104)) ) {
                alt111=1;
            }
            else if ( (LA111_0==RULE_ID) ) {
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
                    // InternalDiv.g:4680:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalDiv.g:4680:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalDiv.g:4681:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalDiv.g:4681:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalDiv.g:4682:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_71);
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
                    // InternalDiv.g:4700:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDiv.g:4700:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDiv.g:4701:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDiv.g:4701:5: (otherlv_1= RULE_ID )
                    // InternalDiv.g:4702:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:4714:3: ( (lv_collection_2_0= '*' ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==62) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalDiv.g:4715:4: (lv_collection_2_0= '*' )
                    {
                    // InternalDiv.g:4715:4: (lv_collection_2_0= '*' )
                    // InternalDiv.g:4716:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:4732:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalDiv.g:4732:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalDiv.g:4733:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalDiv.g:4739:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4745:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalDiv.g:4746:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalDiv.g:4746:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalDiv.g:4747:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalDiv.g:4747:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:4748:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:4748:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:4749:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,40,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDiv.g:4769:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDiv.g:4770:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDiv.g:4770:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalDiv.g:4771:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalDiv.g:4792:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDiv.g:4792:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDiv.g:4793:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDiv.g:4799:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:4805:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalDiv.g:4806:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalDiv.g:4806:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt113=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==EOF||(LA113_1>=RULE_ID && LA113_1<=RULE_RICH_TEXT_END)||(LA113_1>=21 && LA113_1<=23)||(LA113_1>=25 && LA113_1<=29)||(LA113_1>=31 && LA113_1<=32)||LA113_1==36||LA113_1==38||(LA113_1>=42 && LA113_1<=43)||LA113_1==47||(LA113_1>=50 && LA113_1<=51)||LA113_1==57||(LA113_1>=62 && LA113_1<=69)||(LA113_1>=75 && LA113_1<=78)||(LA113_1>=87 && LA113_1<=88)||(LA113_1>=90 && LA113_1<=91)||(LA113_1>=105 && LA113_1<=124)) ) {
                    alt113=2;
                }
                else if ( (LA113_1==56) ) {
                    alt113=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
            case RULE_STRING:
            case 20:
            case 31:
            case 32:
            case 50:
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
                alt113=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_RICH_TEXT_START:
                {
                alt113=3;
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
                    // InternalDiv.g:4807:3: this_DmxAssignment_0= ruleDmxAssignment
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
                    // InternalDiv.g:4816:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
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
                    // InternalDiv.g:4825:3: this_DRichText_2= ruleDRichText
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
    // InternalDiv.g:4837:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDiv.g:4837:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDiv.g:4838:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDiv.g:4844:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalDiv.g:4850:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalDiv.g:4851:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalDiv.g:4851:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt115=1;
            }
            else if ( (LA115_0==RULE_RICH_TEXT_START) ) {
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
                    // InternalDiv.g:4852:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalDiv.g:4852:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalDiv.g:4853:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalDiv.g:4853:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalDiv.g:4854:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalDiv.g:4872:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalDiv.g:4872:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalDiv.g:4873:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalDiv.g:4873:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalDiv.g:4874:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalDiv.g:4874:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalDiv.g:4875:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
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

                    // InternalDiv.g:4892:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDiv.g:4893:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDiv.g:4893:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDiv.g:4894:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
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

                    // InternalDiv.g:4911:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalDiv.g:4912:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDiv.g:4912:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalDiv.g:4913:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalDiv.g:4913:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalDiv.g:4914:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
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

                    	    // InternalDiv.g:4931:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDiv.g:4932:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:4932:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDiv.g:4933:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_72);
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
                    	    break loop114;
                        }
                    } while (true);

                    // InternalDiv.g:4951:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalDiv.g:4952:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalDiv.g:4952:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalDiv.g:4953:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalDiv.g:4975:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalDiv.g:4975:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalDiv.g:4976:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalDiv.g:4982:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:4988:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDiv.g:4989:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDiv.g:4989:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDiv.g:4990:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDiv.g:4990:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDiv.g:4991:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDiv.g:5010:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalDiv.g:5010:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalDiv.g:5011:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalDiv.g:5017:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5023:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalDiv.g:5024:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalDiv.g:5024:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalDiv.g:5025:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalDiv.g:5025:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalDiv.g:5026:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalDiv.g:5045:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalDiv.g:5045:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalDiv.g:5046:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalDiv.g:5052:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5058:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalDiv.g:5059:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalDiv.g:5059:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalDiv.g:5060:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalDiv.g:5060:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalDiv.g:5061:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalDiv.g:5080:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalDiv.g:5080:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalDiv.g:5081:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalDiv.g:5087:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5093:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalDiv.g:5094:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalDiv.g:5094:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalDiv.g:5095:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalDiv.g:5095:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalDiv.g:5096:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalDiv.g:5115:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalDiv.g:5115:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalDiv.g:5116:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalDiv.g:5122:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDiv.g:5128:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalDiv.g:5129:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalDiv.g:5129:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalDiv.g:5130:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_73);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5138:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop117:
            do {
                int alt117=3;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==63) ) {
                    int LA117_2 = input.LA(2);

                    if ( (synpred1_InternalDiv()) ) {
                        alt117=1;
                    }
                    else if ( (synpred2_InternalDiv()) ) {
                        alt117=2;
                    }


                }


                switch (alt117) {
            	case 1 :
            	    // InternalDiv.g:5139:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalDiv.g:5139:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalDiv.g:5140:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalDiv.g:5140:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalDiv.g:5141:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalDiv.g:5153:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalDiv.g:5154:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalDiv.g:5154:7: ()
            	    // InternalDiv.g:5155:8: 
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
            	    // InternalDiv.g:5165:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDiv.g:5166:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDiv.g:5166:8: (otherlv_3= RULE_ID )
            	    // InternalDiv.g:5167:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_74); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_75);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDiv.g:5187:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalDiv.g:5188:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalDiv.g:5188:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalDiv.g:5189:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_73);
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
            	    // InternalDiv.g:5208:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalDiv.g:5208:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalDiv.g:5209:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalDiv.g:5209:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDiv.g:5210:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDiv.g:5216:6: ( () otherlv_7= '.' )
            	    // InternalDiv.g:5217:7: () otherlv_7= '.'
            	    {
            	    // InternalDiv.g:5217:7: ()
            	    // InternalDiv.g:5218:8: 
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

            	    // InternalDiv.g:5230:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDiv.g:5231:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDiv.g:5231:6: (otherlv_8= RULE_ID )
            	    // InternalDiv.g:5232:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDiv.g:5243:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt116=3;
            	    int LA116_0 = input.LA(1);

            	    if ( (LA116_0==50) && (synpred3_InternalDiv())) {
            	        alt116=1;
            	    }
            	    else if ( (LA116_0==64) ) {
            	        alt116=2;
            	    }
            	    switch (alt116) {
            	        case 1 :
            	            // InternalDiv.g:5244:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalDiv.g:5244:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalDiv.g:5245:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalDiv.g:5245:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDiv.g:5246:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDiv.g:5250:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDiv.g:5251:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,50,FOLLOW_77); if (state.failed) return current;
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

            	            // InternalDiv.g:5263:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalDiv.g:5264:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalDiv.g:5264:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalDiv.g:5265:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_78);
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

            	            otherlv_11=(Token)match(input,51,FOLLOW_73); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDiv.g:5288:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalDiv.g:5288:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalDiv.g:5289:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalDiv.g:5289:7: (lv_before_12_0= '@before' )
            	            // InternalDiv.g:5290:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,64,FOLLOW_73); if (state.failed) return current;
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
            	    break loop117;
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
    // InternalDiv.g:5309:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalDiv.g:5309:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalDiv.g:5310:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalDiv.g:5316:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5322:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalDiv.g:5323:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalDiv.g:5323:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalDiv.g:5324:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalDiv.g:5324:3: ()
            // InternalDiv.g:5325:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:5331:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==RULE_ID||(LA119_0>=RULE_NATURAL && LA119_0<=RULE_STRING)||LA119_0==20||(LA119_0>=31 && LA119_0<=32)||LA119_0==50||LA119_0==70||LA119_0==74||(LA119_0>=79 && LA119_0<=84)||(LA119_0>=87 && LA119_0<=88)||(LA119_0>=125 && LA119_0<=127)) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalDiv.g:5332:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalDiv.g:5332:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalDiv.g:5333:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalDiv.g:5333:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalDiv.g:5334:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_79);
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

                    // InternalDiv.g:5351:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==29) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalDiv.g:5352:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,29,FOLLOW_75); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:5356:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalDiv.g:5357:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalDiv.g:5357:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalDiv.g:5358:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_79);
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
                    	    break loop118;
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
    // InternalDiv.g:5381:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalDiv.g:5381:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalDiv.g:5382:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
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
    // InternalDiv.g:5388:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5394:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalDiv.g:5395:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalDiv.g:5395:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalDiv.g:5396:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalDiv.g:5396:3: ()
            // InternalDiv.g:5397:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:5403:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:5404:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:5404:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:5405:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxAssignmentRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxAssignmentAccess().getAssignToMemberDNavigableMemberCrossReference_1_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAssignmentAccess().getDmxOpSingleAssignParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_75);
            ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5423:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalDiv.g:5424:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalDiv.g:5424:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalDiv.g:5425:5: lv_value_3_0= ruleDmxOrExpression
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
    // InternalDiv.g:5446:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalDiv.g:5446:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalDiv.g:5447:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalDiv.g:5453:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:5459:2: (kw= ':=' )
            // InternalDiv.g:5460:2: kw= ':='
            {
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:5468:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalDiv.g:5468:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalDiv.g:5469:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalDiv.g:5475:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDiv.g:5481:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalDiv.g:5482:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalDiv.g:5482:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_ID) ) {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==65) ) {
                    alt120=1;
                }
                else if ( (LA120_1==EOF||(LA120_1>=RULE_ID && LA120_1<=RULE_RICH_TEXT_END)||(LA120_1>=21 && LA120_1<=23)||(LA120_1>=25 && LA120_1<=29)||(LA120_1>=31 && LA120_1<=32)||LA120_1==36||LA120_1==38||(LA120_1>=42 && LA120_1<=43)||LA120_1==47||(LA120_1>=50 && LA120_1<=51)||LA120_1==57||(LA120_1>=62 && LA120_1<=64)||(LA120_1>=66 && LA120_1<=69)||(LA120_1>=75 && LA120_1<=78)||(LA120_1>=87 && LA120_1<=88)||(LA120_1>=90 && LA120_1<=91)||(LA120_1>=105 && LA120_1<=124)) ) {
                    alt120=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA120_0>=RULE_NATURAL && LA120_0<=RULE_STRING)||LA120_0==20||(LA120_0>=31 && LA120_0<=32)||LA120_0==50||LA120_0==70||LA120_0==74||(LA120_0>=79 && LA120_0<=84)||(LA120_0>=87 && LA120_0<=88)||(LA120_0>=125 && LA120_0<=127)) ) {
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
                    // InternalDiv.g:5483:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalDiv.g:5483:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalDiv.g:5484:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalDiv.g:5484:4: ()
                    // InternalDiv.g:5485:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDiv.g:5491:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalDiv.g:5492:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalDiv.g:5492:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalDiv.g:5493:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_80);
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

                    otherlv_2=(Token)match(input,65,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalDiv.g:5514:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalDiv.g:5515:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalDiv.g:5515:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalDiv.g:5516:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalDiv.g:5535:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalDiv.g:5547:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalDiv.g:5547:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalDiv.g:5548:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalDiv.g:5554:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5560:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:5561:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:5561:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:5562:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:5562:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:5563:4: lv_name_0_0= RULE_ID
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
    // InternalDiv.g:5582:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalDiv.g:5582:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalDiv.g:5583:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalDiv.g:5589:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5595:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalDiv.g:5596:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalDiv.g:5596:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalDiv.g:5597:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_81);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5605:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop121:
            do {
                int alt121=2;
                switch ( input.LA(1) ) {
                case 105:
                    {
                    int LA121_2 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt121=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA121_3 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt121=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA121_4 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt121=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA121_5 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt121=1;
                    }


                    }
                    break;

                }

                switch (alt121) {
            	case 1 :
            	    // InternalDiv.g:5606:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalDiv.g:5606:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalDiv.g:5607:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalDiv.g:5617:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalDiv.g:5618:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalDiv.g:5618:6: ()
            	    // InternalDiv.g:5619:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:5625:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalDiv.g:5626:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalDiv.g:5626:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalDiv.g:5627:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_75);
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

            	    // InternalDiv.g:5646:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalDiv.g:5647:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalDiv.g:5647:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalDiv.g:5648:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_81);
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
            	    break loop121;
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
    // InternalDiv.g:5670:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalDiv.g:5670:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalDiv.g:5671:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalDiv.g:5677:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5683:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalDiv.g:5684:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalDiv.g:5684:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalDiv.g:5685:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_82);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5693:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==109) ) {
                    int LA122_2 = input.LA(2);

                    if ( (synpred5_InternalDiv()) ) {
                        alt122=1;
                    }


                }
                else if ( (LA122_0==110) ) {
                    int LA122_3 = input.LA(2);

                    if ( (synpred5_InternalDiv()) ) {
                        alt122=1;
                    }


                }


                switch (alt122) {
            	case 1 :
            	    // InternalDiv.g:5694:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalDiv.g:5694:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalDiv.g:5695:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalDiv.g:5705:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalDiv.g:5706:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalDiv.g:5706:6: ()
            	    // InternalDiv.g:5707:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:5713:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalDiv.g:5714:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalDiv.g:5714:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalDiv.g:5715:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_75);
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

            	    // InternalDiv.g:5734:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalDiv.g:5735:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalDiv.g:5735:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalDiv.g:5736:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_82);
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalDiv.g:5758:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalDiv.g:5758:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalDiv.g:5759:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalDiv.g:5765:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5771:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalDiv.g:5772:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalDiv.g:5772:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalDiv.g:5773:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_83);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5781:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop123:
            do {
                int alt123=2;
                switch ( input.LA(1) ) {
                case 69:
                    {
                    int LA123_2 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt123=1;
                    }


                    }
                    break;
                case 111:
                    {
                    int LA123_3 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt123=1;
                    }


                    }
                    break;
                case 112:
                    {
                    int LA123_4 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt123=1;
                    }


                    }
                    break;

                }

                switch (alt123) {
            	case 1 :
            	    // InternalDiv.g:5782:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalDiv.g:5782:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalDiv.g:5783:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalDiv.g:5793:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalDiv.g:5794:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalDiv.g:5794:6: ()
            	    // InternalDiv.g:5795:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:5801:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalDiv.g:5802:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalDiv.g:5802:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalDiv.g:5803:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_75);
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

            	    // InternalDiv.g:5822:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalDiv.g:5823:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalDiv.g:5823:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalDiv.g:5824:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_83);
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
            	    break loop123;
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
    // InternalDiv.g:5846:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalDiv.g:5846:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalDiv.g:5847:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalDiv.g:5853:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5859:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalDiv.g:5860:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalDiv.g:5860:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalDiv.g:5861:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_84);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5869:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop124:
            do {
                int alt124=3;
                alt124 = dfa124.predict(input);
                switch (alt124) {
            	case 1 :
            	    // InternalDiv.g:5870:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDiv.g:5870:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDiv.g:5871:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDiv.g:5871:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalDiv.g:5872:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalDiv.g:5878:6: ( () ruleDmxOpInstanceOf )
            	    // InternalDiv.g:5879:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalDiv.g:5879:7: ()
            	    // InternalDiv.g:5880:8: 
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

            	    // InternalDiv.g:5895:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDiv.g:5896:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDiv.g:5896:6: (otherlv_3= RULE_ID )
            	    // InternalDiv.g:5897:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_84); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDiv.g:5910:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalDiv.g:5910:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalDiv.g:5911:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalDiv.g:5911:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDiv.g:5912:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDiv.g:5922:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDiv.g:5923:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDiv.g:5923:7: ()
            	    // InternalDiv.g:5924:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDiv.g:5930:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDiv.g:5931:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDiv.g:5931:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDiv.g:5932:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_75);
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

            	    // InternalDiv.g:5951:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalDiv.g:5952:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalDiv.g:5952:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalDiv.g:5953:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_84);
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalDiv.g:5976:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalDiv.g:5976:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalDiv.g:5977:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalDiv.g:5983:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:5989:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDiv.g:5990:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDiv.g:5990:2: (kw= 'ISA' | kw= 'isa' )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==66) ) {
                alt125=1;
            }
            else if ( (LA125_0==67) ) {
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
                    // InternalDiv.g:5991:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:5997:3: kw= 'isa'
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
    // InternalDiv.g:6006:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalDiv.g:6006:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalDiv.g:6007:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalDiv.g:6013:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6019:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalDiv.g:6020:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalDiv.g:6020:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalDiv.g:6021:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_85);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6029:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop126:
            do {
                int alt126=2;
                switch ( input.LA(1) ) {
                case 119:
                    {
                    int LA126_2 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA126_3 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA126_4 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;
                case 120:
                    {
                    int LA126_5 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;
                case 121:
                    {
                    int LA126_6 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt126=1;
                    }


                    }
                    break;

                }

                switch (alt126) {
            	case 1 :
            	    // InternalDiv.g:6030:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalDiv.g:6030:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDiv.g:6031:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDiv.g:6041:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDiv.g:6042:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDiv.g:6042:6: ()
            	    // InternalDiv.g:6043:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6049:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDiv.g:6050:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDiv.g:6050:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDiv.g:6051:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_75);
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

            	    // InternalDiv.g:6070:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalDiv.g:6071:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalDiv.g:6071:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalDiv.g:6072:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_85);
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalDiv.g:6094:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalDiv.g:6094:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalDiv.g:6095:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalDiv.g:6101:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6107:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalDiv.g:6108:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalDiv.g:6108:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalDiv.g:6109:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_86);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6117:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==87) ) {
                    int LA127_2 = input.LA(2);

                    if ( (synpred10_InternalDiv()) ) {
                        alt127=1;
                    }


                }
                else if ( (LA127_0==88) ) {
                    int LA127_3 = input.LA(2);

                    if ( (synpred10_InternalDiv()) ) {
                        alt127=1;
                    }


                }


                switch (alt127) {
            	case 1 :
            	    // InternalDiv.g:6118:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalDiv.g:6118:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDiv.g:6119:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDiv.g:6129:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDiv.g:6130:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDiv.g:6130:6: ()
            	    // InternalDiv.g:6131:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6137:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDiv.g:6138:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDiv.g:6138:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDiv.g:6139:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_75);
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

            	    // InternalDiv.g:6158:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalDiv.g:6159:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalDiv.g:6159:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalDiv.g:6160:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_86);
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalDiv.g:6182:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalDiv.g:6182:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalDiv.g:6183:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalDiv.g:6189:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6195:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalDiv.g:6196:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalDiv.g:6196:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalDiv.g:6197:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_87);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6205:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop128:
            do {
                int alt128=2;
                switch ( input.LA(1) ) {
                case 62:
                    {
                    int LA128_2 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt128=1;
                    }


                    }
                    break;
                case 122:
                    {
                    int LA128_3 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt128=1;
                    }


                    }
                    break;
                case 123:
                    {
                    int LA128_4 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt128=1;
                    }


                    }
                    break;
                case 124:
                    {
                    int LA128_5 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt128=1;
                    }


                    }
                    break;

                }

                switch (alt128) {
            	case 1 :
            	    // InternalDiv.g:6206:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalDiv.g:6206:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDiv.g:6207:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDiv.g:6217:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDiv.g:6218:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDiv.g:6218:6: ()
            	    // InternalDiv.g:6219:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6225:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDiv.g:6226:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDiv.g:6226:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDiv.g:6227:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_75);
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

            	    // InternalDiv.g:6246:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalDiv.g:6247:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalDiv.g:6247:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalDiv.g:6248:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_87);
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
    // $ANTLR end "ruleDmxMultiplicativeExpression"


    // $ANTLR start "entryRuleDmxUnaryOperation"
    // InternalDiv.g:6270:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalDiv.g:6270:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalDiv.g:6271:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalDiv.g:6277:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:6283:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalDiv.g:6284:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalDiv.g:6284:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=87 && LA129_0<=88)||(LA129_0>=125 && LA129_0<=127)) ) {
                alt129=1;
            }
            else if ( (LA129_0==RULE_ID||(LA129_0>=RULE_NATURAL && LA129_0<=RULE_STRING)||LA129_0==20||(LA129_0>=31 && LA129_0<=32)||LA129_0==50||LA129_0==70||LA129_0==74||(LA129_0>=79 && LA129_0<=84)) ) {
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
                    // InternalDiv.g:6285:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalDiv.g:6285:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalDiv.g:6286:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalDiv.g:6286:4: ()
                    // InternalDiv.g:6287:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDiv.g:6293:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDiv.g:6294:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDiv.g:6294:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDiv.g:6295:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_75);
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

                    // InternalDiv.g:6312:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalDiv.g:6313:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalDiv.g:6313:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalDiv.g:6314:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalDiv.g:6333:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalDiv.g:6345:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalDiv.g:6345:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalDiv.g:6346:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalDiv.g:6352:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6358:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDiv.g:6359:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDiv.g:6359:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDiv.g:6360:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_88);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6368:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==68) ) {
                int LA130_1 = input.LA(2);

                if ( (synpred12_InternalDiv()) ) {
                    alt130=1;
                }
            }
            else if ( (LA130_0==22) ) {
                int LA130_2 = input.LA(2);

                if ( (synpred12_InternalDiv()) ) {
                    alt130=1;
                }
            }
            switch (alt130) {
                case 1 :
                    // InternalDiv.g:6369:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDiv.g:6369:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalDiv.g:6370:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalDiv.g:6376:5: ( () ruleDmxOpCast )
                    // InternalDiv.g:6377:6: () ruleDmxOpCast
                    {
                    // InternalDiv.g:6377:6: ()
                    // InternalDiv.g:6378:7: 
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

                    // InternalDiv.g:6393:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDiv.g:6394:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDiv.g:6394:5: (otherlv_3= RULE_ID )
                    // InternalDiv.g:6395:6: otherlv_3= RULE_ID
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
    // InternalDiv.g:6411:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalDiv.g:6411:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalDiv.g:6412:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalDiv.g:6418:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:6424:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDiv.g:6425:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDiv.g:6425:2: (kw= 'AS' | kw= 'as' )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==68) ) {
                alt131=1;
            }
            else if ( (LA131_0==22) ) {
                alt131=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // InternalDiv.g:6426:3: kw= 'AS'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:6432:3: kw= 'as'
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
    // InternalDiv.g:6441:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalDiv.g:6441:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalDiv.g:6442:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalDiv.g:6448:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalDiv.g:6454:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalDiv.g:6455:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalDiv.g:6455:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt132=7;
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
                alt132=1;
                }
                break;
            case 50:
                {
                alt132=2;
                }
                break;
            case 20:
                {
                alt132=3;
                }
                break;
            case RULE_ID:
                {
                int LA132_4 = input.LA(2);

                if ( (LA132_4==EOF||(LA132_4>=RULE_ID && LA132_4<=RULE_RICH_TEXT_END)||(LA132_4>=21 && LA132_4<=23)||(LA132_4>=25 && LA132_4<=29)||(LA132_4>=31 && LA132_4<=32)||LA132_4==36||LA132_4==38||(LA132_4>=42 && LA132_4<=43)||LA132_4==47||LA132_4==51||LA132_4==57||(LA132_4>=62 && LA132_4<=64)||(LA132_4>=66 && LA132_4<=69)||(LA132_4>=75 && LA132_4<=78)||(LA132_4>=87 && LA132_4<=88)||(LA132_4>=90 && LA132_4<=91)||(LA132_4>=105 && LA132_4<=124)) ) {
                    alt132=6;
                }
                else if ( (LA132_4==50) ) {
                    alt132=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 4, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                alt132=5;
                }
                break;
            case 74:
                {
                alt132=7;
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
                    // InternalDiv.g:6456:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalDiv.g:6465:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalDiv.g:6474:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalDiv.g:6483:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalDiv.g:6492:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalDiv.g:6501:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalDiv.g:6510:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalDiv.g:6522:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalDiv.g:6522:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalDiv.g:6523:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalDiv.g:6529:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalDiv.g:6535:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalDiv.g:6536:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalDiv.g:6536:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt133=7;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // InternalDiv.g:6537:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalDiv.g:6546:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalDiv.g:6555:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalDiv.g:6564:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalDiv.g:6573:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalDiv.g:6582:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalDiv.g:6591:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalDiv.g:6603:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalDiv.g:6603:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalDiv.g:6604:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalDiv.g:6610:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:6616:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDiv.g:6617:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDiv.g:6617:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDiv.g:6618:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_78);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:6638:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalDiv.g:6638:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalDiv.g:6639:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalDiv.g:6645:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6651:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDiv.g:6652:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDiv.g:6652:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalDiv.g:6653:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDiv.g:6653:3: ()
            // InternalDiv.g:6654:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDiv.g:6664:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( ((LA135_0>=RULE_ID && LA135_0<=RULE_RICH_TEXT_START)||(LA135_0>=RULE_NATURAL && LA135_0<=RULE_STRING)||LA135_0==20||(LA135_0>=31 && LA135_0<=32)||LA135_0==50||LA135_0==70||LA135_0==74||(LA135_0>=79 && LA135_0<=84)||(LA135_0>=87 && LA135_0<=88)||(LA135_0>=125 && LA135_0<=127)) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalDiv.g:6665:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalDiv.g:6665:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDiv.g:6666:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDiv.g:6666:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDiv.g:6667:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalDiv.g:6684:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==29) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalDiv.g:6685:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:6689:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDiv.g:6690:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:6690:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDiv.g:6691:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop134;
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
    // InternalDiv.g:6718:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalDiv.g:6718:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalDiv.g:6719:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalDiv.g:6725:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6731:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDiv.g:6732:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDiv.g:6732:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalDiv.g:6733:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDiv.g:6733:3: ()
            // InternalDiv.g:6734:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDiv.g:6744:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=RULE_NATURAL && LA137_0<=RULE_STRING)||(LA137_0>=31 && LA137_0<=32)||(LA137_0>=79 && LA137_0<=84)) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalDiv.g:6745:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalDiv.g:6745:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalDiv.g:6746:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalDiv.g:6746:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalDiv.g:6747:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalDiv.g:6764:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==29) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // InternalDiv.g:6765:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_91); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:6769:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalDiv.g:6770:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalDiv.g:6770:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalDiv.g:6771:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop136;
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
    // InternalDiv.g:6798:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalDiv.g:6798:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalDiv.g:6799:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalDiv.g:6805:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6811:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalDiv.g:6812:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalDiv.g:6812:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalDiv.g:6813:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalDiv.g:6813:3: ()
            // InternalDiv.g:6814:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:6820:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:6821:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:6821:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:6822:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:6837:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalDiv.g:6838:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalDiv.g:6838:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalDiv.g:6839:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_78);
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

            otherlv_4=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:6864:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalDiv.g:6864:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalDiv.g:6865:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalDiv.g:6871:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6877:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalDiv.g:6878:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalDiv.g:6878:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalDiv.g:6879:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalDiv.g:6879:3: ()
            // InternalDiv.g:6880:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:6886:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( ((LA139_0>=RULE_ID && LA139_0<=RULE_RICH_TEXT_START)||(LA139_0>=RULE_NATURAL && LA139_0<=RULE_STRING)||LA139_0==20||(LA139_0>=31 && LA139_0<=32)||LA139_0==50||LA139_0==70||LA139_0==74||(LA139_0>=79 && LA139_0<=84)||(LA139_0>=87 && LA139_0<=88)||(LA139_0>=125 && LA139_0<=127)) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalDiv.g:6887:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalDiv.g:6887:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalDiv.g:6888:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalDiv.g:6888:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalDiv.g:6889:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_79);
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

                    // InternalDiv.g:6906:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==29) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // InternalDiv.g:6907:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,29,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:6911:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalDiv.g:6912:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:6912:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalDiv.g:6913:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_79);
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
                    	    break loop138;
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
    // InternalDiv.g:6936:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalDiv.g:6936:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalDiv.g:6937:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalDiv.g:6943:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:6949:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDiv.g:6950:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDiv.g:6950:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDiv.g:6951:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
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
    // InternalDiv.g:6970:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalDiv.g:6970:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalDiv.g:6971:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalDiv.g:6977:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:6983:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDiv.g:6984:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDiv.g:6984:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDiv.g:6985:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
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
    // InternalDiv.g:7005:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7011:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalDiv.g:7012:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalDiv.g:7012:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalDiv.g:7013:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalDiv.g:7013:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:7014:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:7014:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:7015:5: otherlv_0= RULE_ID
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
            pushFollow(FOLLOW_93);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:7033:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==RULE_ID) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // InternalDiv.g:7034:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalDiv.g:7034:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalDiv.g:7035:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_93);
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
            	    break loop140;
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
    // InternalDiv.g:7060:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalDiv.g:7060:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalDiv.g:7061:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalDiv.g:7067:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7073:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalDiv.g:7074:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalDiv.g:7074:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalDiv.g:7075:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalDiv.g:7075:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:7076:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:7076:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:7077:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalDiv.g:7092:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalDiv.g:7093:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalDiv.g:7093:4: (lv_value_2_0= ruleDExpression )
            // InternalDiv.g:7094:5: lv_value_2_0= ruleDExpression
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
    // InternalDiv.g:7115:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalDiv.g:7115:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalDiv.g:7116:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalDiv.g:7122:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalDiv.g:7128:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalDiv.g:7129:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalDiv.g:7129:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalDiv.g:7130:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalDiv.g:7130:3: ()
            // InternalDiv.g:7131:4: 
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
            // InternalDiv.g:7141:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:7142:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:7142:4: ( ruleDQualifiedName )
            // InternalDiv.g:7143:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_95);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDiv.g:7157:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==71) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalDiv.g:7158:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:7162:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDiv.g:7163:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDiv.g:7163:5: (otherlv_4= RULE_ID )
                    // InternalDiv.g:7164:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_96); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:7176:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==65) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalDiv.g:7177:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_97); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalDiv.g:7181:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==RULE_ID) ) {
                        alt142=1;
                    }
                    else if ( (LA142_0==62) ) {
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
                            // InternalDiv.g:7182:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalDiv.g:7182:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalDiv.g:7183:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalDiv.g:7183:6: (lv_displayName_6_0= RULE_ID )
                            // InternalDiv.g:7184:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_98); if (state.failed) return current;
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
                            // InternalDiv.g:7201:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalDiv.g:7201:5: ( (lv_plural_7_0= '*' ) )
                            // InternalDiv.g:7202:6: (lv_plural_7_0= '*' )
                            {
                            // InternalDiv.g:7202:6: (lv_plural_7_0= '*' )
                            // InternalDiv.g:7203:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,62,FOLLOW_98); if (state.failed) return current;
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

            // InternalDiv.g:7217:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalDiv.g:7218:4: ( ']' )=>otherlv_8= ']'
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
    // InternalDiv.g:7228:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalDiv.g:7228:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalDiv.g:7229:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalDiv.g:7235:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7241:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalDiv.g:7242:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalDiv.g:7242:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalDiv.g:7243:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalDiv.g:7243:3: ()
            // InternalDiv.g:7244:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7250:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:7251:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:7251:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:7252:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDiv.g:7263:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt144=3;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==64) ) {
                alt144=1;
            }
            else if ( (LA144_0==63) ) {
                int LA144_2 = input.LA(2);

                if ( (LA144_2==73) ) {
                    alt144=2;
                }
            }
            switch (alt144) {
                case 1 :
                    // InternalDiv.g:7264:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalDiv.g:7264:4: ( (lv_before_2_0= '@before' ) )
                    // InternalDiv.g:7265:5: (lv_before_2_0= '@before' )
                    {
                    // InternalDiv.g:7265:5: (lv_before_2_0= '@before' )
                    // InternalDiv.g:7266:6: lv_before_2_0= '@before'
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
                    // InternalDiv.g:7279:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalDiv.g:7279:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalDiv.g:7280:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalDiv.g:7284:5: ( (lv_all_4_0= 'all' ) )
                    // InternalDiv.g:7285:6: (lv_all_4_0= 'all' )
                    {
                    // InternalDiv.g:7285:6: (lv_all_4_0= 'all' )
                    // InternalDiv.g:7286:7: lv_all_4_0= 'all'
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
    // InternalDiv.g:7304:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalDiv.g:7304:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalDiv.g:7305:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalDiv.g:7311:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDiv.g:7317:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDiv.g:7318:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDiv.g:7318:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDiv.g:7319:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDiv.g:7319:3: ()
            // InternalDiv.g:7320:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDiv.g:7330:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDiv.g:7331:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDiv.g:7331:4: (lv_if_2_0= ruleDExpression )
            // InternalDiv.g:7332:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_101);
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

            otherlv_3=(Token)match(input,75,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDiv.g:7353:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDiv.g:7354:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDiv.g:7354:4: (lv_then_4_0= ruleDExpression )
            // InternalDiv.g:7355:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_102);
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

            // InternalDiv.g:7372:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==76) && (synpred14_InternalDiv())) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalDiv.g:7373:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDiv.g:7373:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDiv.g:7374:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,76,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDiv.g:7380:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDiv.g:7381:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDiv.g:7381:5: (lv_else_6_0= ruleDExpression )
                    // InternalDiv.g:7382:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_103);
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
    // InternalDiv.g:7408:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDiv.g:7408:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDiv.g:7409:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDiv.g:7415:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalDiv.g:7421:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalDiv.g:7422:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalDiv.g:7422:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==62||LA146_0==87||LA146_0==128) ) {
                alt146=1;
            }
            else if ( (LA146_0==50) ) {
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
                    // InternalDiv.g:7423:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalDiv.g:7423:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalDiv.g:7424:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalDiv.g:7424:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalDiv.g:7425:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalDiv.g:7443:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalDiv.g:7443:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalDiv.g:7444:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:7448:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalDiv.g:7449:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalDiv.g:7449:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalDiv.g:7450:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_105); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,78,FOLLOW_106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalDiv.g:7470:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalDiv.g:7471:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalDiv.g:7471:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalDiv.g:7472:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_78);
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

                    otherlv_5=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7498:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDiv.g:7498:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDiv.g:7499:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDiv.g:7505:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:7511:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDiv.g:7512:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDiv.g:7512:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==RULE_NATURAL) ) {
                alt147=1;
            }
            else if ( (LA147_0==62) ) {
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
                    // InternalDiv.g:7513:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDiv.g:7521:3: kw= '*'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7530:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalDiv.g:7530:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalDiv.g:7531:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalDiv.g:7537:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDiv.g:7543:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDiv.g:7544:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDiv.g:7544:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDiv.g:7545:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDiv.g:7545:3: ()
            // InternalDiv.g:7546:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7552:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt148=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt148=1;
                }
                break;
            case 80:
                {
                alt148=2;
                }
                break;
            case 81:
                {
                alt148=3;
                }
                break;
            case 82:
                {
                alt148=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }

            switch (alt148) {
                case 1 :
                    // InternalDiv.g:7553:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDiv.g:7553:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDiv.g:7554:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDiv.g:7554:5: (lv_value_1_0= 'TRUE' )
                    // InternalDiv.g:7555:6: lv_value_1_0= 'TRUE'
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
                    // InternalDiv.g:7568:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDiv.g:7568:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDiv.g:7569:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDiv.g:7569:5: (lv_value_2_0= 'true' )
                    // InternalDiv.g:7570:6: lv_value_2_0= 'true'
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
                    // InternalDiv.g:7583:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDiv.g:7588:4: otherlv_4= 'false'
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
    // InternalDiv.g:7597:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalDiv.g:7597:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalDiv.g:7598:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalDiv.g:7604:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7610:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDiv.g:7611:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDiv.g:7611:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDiv.g:7612:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDiv.g:7612:3: ()
            // InternalDiv.g:7613:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7619:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDiv.g:7620:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDiv.g:7620:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDiv.g:7621:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDiv.g:7641:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalDiv.g:7641:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalDiv.g:7642:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalDiv.g:7648:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7654:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDiv.g:7655:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDiv.g:7655:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDiv.g:7656:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDiv.g:7656:3: ()
            // InternalDiv.g:7657:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7663:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDiv.g:7664:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDiv.g:7664:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDiv.g:7665:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDiv.g:7686:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalDiv.g:7686:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalDiv.g:7687:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalDiv.g:7693:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7699:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDiv.g:7700:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDiv.g:7700:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDiv.g:7701:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDiv.g:7701:3: ()
            // InternalDiv.g:7702:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7708:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDiv.g:7709:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDiv.g:7709:4: (lv_value_1_0= RULE_STRING )
            // InternalDiv.g:7710:5: lv_value_1_0= RULE_STRING
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
    // InternalDiv.g:7730:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalDiv.g:7730:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalDiv.g:7731:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalDiv.g:7737:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDiv.g:7743:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDiv.g:7744:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDiv.g:7744:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDiv.g:7745:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDiv.g:7745:3: ()
            // InternalDiv.g:7746:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7752:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==83) ) {
                alt149=1;
            }
            else if ( (LA149_0==84) ) {
                alt149=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // InternalDiv.g:7753:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:7758:4: otherlv_2= 'undefined'
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
    // InternalDiv.g:7767:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDiv.g:7767:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDiv.g:7768:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDiv.g:7774:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDiv.g:7780:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDiv.g:7781:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDiv.g:7781:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDiv.g:7782:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDiv.g:7801:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=85 && LA152_0<=86)) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalDiv.g:7802:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDiv.g:7802:4: (kw= 'E' | kw= 'e' )
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==85) ) {
                        alt150=1;
                    }
                    else if ( (LA150_0==86) ) {
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
                            // InternalDiv.g:7803:5: kw= 'E'
                            {
                            kw=(Token)match(input,85,FOLLOW_109); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:7809:5: kw= 'e'
                            {
                            kw=(Token)match(input,86,FOLLOW_109); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:7815:4: (kw= '+' | kw= '-' )?
                    int alt151=3;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==87) ) {
                        alt151=1;
                    }
                    else if ( (LA151_0==88) ) {
                        alt151=2;
                    }
                    switch (alt151) {
                        case 1 :
                            // InternalDiv.g:7816:5: kw= '+'
                            {
                            kw=(Token)match(input,87,FOLLOW_104); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:7822:5: kw= '-'
                            {
                            kw=(Token)match(input,88,FOLLOW_104); if (state.failed) return current;
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
    // InternalDiv.g:7840:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalDiv.g:7840:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalDiv.g:7841:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
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
    // InternalDiv.g:7847:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:7853:2: (kw= '{' )
            // InternalDiv.g:7854:2: kw= '{'
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
    // InternalDiv.g:7862:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDiv.g:7862:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDiv.g:7863:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDiv.g:7869:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7875:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDiv.g:7876:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDiv.g:7876:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDiv.g:7877:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_110);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:7887:3: (kw= '.*' )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==89) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalDiv.g:7888:4: kw= '.*'
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
    // InternalDiv.g:7898:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDiv.g:7898:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDiv.g:7899:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDiv.g:7905:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDiv.g:7911:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDiv.g:7912:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDiv.g:7912:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDiv.g:7913:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDiv.g:7920:3: (kw= '.' this_ID_2= RULE_ID )*
            loop154:
            do {
                int alt154=2;
                int LA154_0 = input.LA(1);

                if ( (LA154_0==63) ) {
                    alt154=1;
                }


                switch (alt154) {
            	case 1 :
            	    // InternalDiv.g:7921:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop154;
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
    // InternalDiv.g:7938:1: ruleDEntityNatureAutonomous returns [Enumerator current=null] : (enumLiteral_0= 'autonomous' ) ;
    public final Enumerator ruleDEntityNatureAutonomous() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7944:2: ( (enumLiteral_0= 'autonomous' ) )
            // InternalDiv.g:7945:2: (enumLiteral_0= 'autonomous' )
            {
            // InternalDiv.g:7945:2: (enumLiteral_0= 'autonomous' )
            // InternalDiv.g:7946:3: enumLiteral_0= 'autonomous'
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
    // InternalDiv.g:7955:1: ruleDEntityNatureRelationship returns [Enumerator current=null] : (enumLiteral_0= 'relationship' ) ;
    public final Enumerator ruleDEntityNatureRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7961:2: ( (enumLiteral_0= 'relationship' ) )
            // InternalDiv.g:7962:2: (enumLiteral_0= 'relationship' )
            {
            // InternalDiv.g:7962:2: (enumLiteral_0= 'relationship' )
            // InternalDiv.g:7963:3: enumLiteral_0= 'relationship'
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
    // InternalDiv.g:7972:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:7978:2: ( ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) )
            // InternalDiv.g:7979:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            {
            // InternalDiv.g:7979:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==92) ) {
                alt155=1;
            }
            else if ( (LA155_0==48) ) {
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
                    // InternalDiv.g:7980:3: (enumLiteral_0= 'references' )
                    {
                    // InternalDiv.g:7980:3: (enumLiteral_0= 'references' )
                    // InternalDiv.g:7981:4: enumLiteral_0= 'references'
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
                    // InternalDiv.g:7988:3: (enumLiteral_1= 'contains' )
                    {
                    // InternalDiv.g:7988:3: (enumLiteral_1= 'contains' )
                    // InternalDiv.g:7989:4: enumLiteral_1= 'contains'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7999:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:8005:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDiv.g:8006:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDiv.g:8006:2: (enumLiteral_0= 'inverse' )
            // InternalDiv.g:8007:3: enumLiteral_0= 'inverse'
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
    // InternalDiv.g:8016:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalDiv.g:8022:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalDiv.g:8023:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalDiv.g:8023:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt156=11;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt156=1;
                }
                break;
            case 95:
                {
                alt156=2;
                }
                break;
            case 96:
                {
                alt156=3;
                }
                break;
            case 97:
                {
                alt156=4;
                }
                break;
            case 98:
                {
                alt156=5;
                }
                break;
            case 99:
                {
                alt156=6;
                }
                break;
            case 100:
                {
                alt156=7;
                }
                break;
            case 101:
                {
                alt156=8;
                }
                break;
            case 102:
                {
                alt156=9;
                }
                break;
            case 103:
                {
                alt156=10;
                }
                break;
            case 104:
                {
                alt156=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalDiv.g:8024:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalDiv.g:8024:3: (enumLiteral_0= 'VOID' )
                    // InternalDiv.g:8025:4: enumLiteral_0= 'VOID'
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
                    // InternalDiv.g:8032:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDiv.g:8032:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDiv.g:8033:4: enumLiteral_1= 'BOOLEAN'
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
                    // InternalDiv.g:8040:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalDiv.g:8040:3: (enumLiteral_2= 'NUMBER' )
                    // InternalDiv.g:8041:4: enumLiteral_2= 'NUMBER'
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
                    // InternalDiv.g:8048:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalDiv.g:8048:3: (enumLiteral_3= 'TEXT' )
                    // InternalDiv.g:8049:4: enumLiteral_3= 'TEXT'
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
                    // InternalDiv.g:8056:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalDiv.g:8056:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalDiv.g:8057:4: enumLiteral_4= 'IDENTIFIER'
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
                    // InternalDiv.g:8064:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalDiv.g:8064:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalDiv.g:8065:4: enumLiteral_5= 'TIMEPOINT'
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
                    // InternalDiv.g:8072:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalDiv.g:8072:3: (enumLiteral_6= 'STATE' )
                    // InternalDiv.g:8073:4: enumLiteral_6= 'STATE'
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
                    // InternalDiv.g:8080:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalDiv.g:8080:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalDiv.g:8081:4: enumLiteral_7= 'STATE_EVENT'
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
                    // InternalDiv.g:8088:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalDiv.g:8088:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalDiv.g:8089:4: enumLiteral_8= 'COMPLEX'
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
                    // InternalDiv.g:8096:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalDiv.g:8096:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalDiv.g:8097:4: enumLiteral_9= 'NOTIFICATION'
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
                    // InternalDiv.g:8104:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalDiv.g:8104:3: (enumLiteral_10= 'SERVICE' )
                    // InternalDiv.g:8105:4: enumLiteral_10= 'SERVICE'
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
    // InternalDiv.g:8115:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDiv.g:8121:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDiv.g:8122:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDiv.g:8122:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt157=4;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt157=1;
                }
                break;
            case 106:
                {
                alt157=2;
                }
                break;
            case 107:
                {
                alt157=3;
                }
                break;
            case 108:
                {
                alt157=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }

            switch (alt157) {
                case 1 :
                    // InternalDiv.g:8123:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDiv.g:8123:3: (enumLiteral_0= 'OR' )
                    // InternalDiv.g:8124:4: enumLiteral_0= 'OR'
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
                    // InternalDiv.g:8131:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDiv.g:8131:3: (enumLiteral_1= 'or' )
                    // InternalDiv.g:8132:4: enumLiteral_1= 'or'
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
                    // InternalDiv.g:8139:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDiv.g:8139:3: (enumLiteral_2= 'XOR' )
                    // InternalDiv.g:8140:4: enumLiteral_2= 'XOR'
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
                    // InternalDiv.g:8147:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDiv.g:8147:3: (enumLiteral_3= 'xor' )
                    // InternalDiv.g:8148:4: enumLiteral_3= 'xor'
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
    // InternalDiv.g:8158:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:8164:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDiv.g:8165:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDiv.g:8165:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==109) ) {
                alt158=1;
            }
            else if ( (LA158_0==110) ) {
                alt158=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }
            switch (alt158) {
                case 1 :
                    // InternalDiv.g:8166:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDiv.g:8166:3: (enumLiteral_0= 'AND' )
                    // InternalDiv.g:8167:4: enumLiteral_0= 'AND'
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
                    // InternalDiv.g:8174:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDiv.g:8174:3: (enumLiteral_1= 'and' )
                    // InternalDiv.g:8175:4: enumLiteral_1= 'and'
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
    // InternalDiv.g:8185:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8191:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDiv.g:8192:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDiv.g:8192:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt159=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt159=1;
                }
                break;
            case 111:
                {
                alt159=2;
                }
                break;
            case 112:
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
                    // InternalDiv.g:8193:3: (enumLiteral_0= '=' )
                    {
                    // InternalDiv.g:8193:3: (enumLiteral_0= '=' )
                    // InternalDiv.g:8194:4: enumLiteral_0= '='
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
                    // InternalDiv.g:8201:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDiv.g:8201:3: (enumLiteral_1= '!=' )
                    // InternalDiv.g:8202:4: enumLiteral_1= '!='
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
                    // InternalDiv.g:8209:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDiv.g:8209:3: (enumLiteral_2= '<>' )
                    // InternalDiv.g:8210:4: enumLiteral_2= '<>'
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
    // InternalDiv.g:8220:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDiv.g:8226:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDiv.g:8227:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDiv.g:8227:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt160=6;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt160=1;
                }
                break;
            case 114:
                {
                alt160=2;
                }
                break;
            case 115:
                {
                alt160=3;
                }
                break;
            case 116:
                {
                alt160=4;
                }
                break;
            case 117:
                {
                alt160=5;
                }
                break;
            case 118:
                {
                alt160=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }

            switch (alt160) {
                case 1 :
                    // InternalDiv.g:8228:3: (enumLiteral_0= '<' )
                    {
                    // InternalDiv.g:8228:3: (enumLiteral_0= '<' )
                    // InternalDiv.g:8229:4: enumLiteral_0= '<'
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
                    // InternalDiv.g:8236:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDiv.g:8236:3: (enumLiteral_1= '<=' )
                    // InternalDiv.g:8237:4: enumLiteral_1= '<='
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
                    // InternalDiv.g:8244:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDiv.g:8244:3: (enumLiteral_2= '\\u2264' )
                    // InternalDiv.g:8245:4: enumLiteral_2= '\\u2264'
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
                    // InternalDiv.g:8252:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDiv.g:8252:3: (enumLiteral_3= '>=' )
                    // InternalDiv.g:8253:4: enumLiteral_3= '>='
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
                    // InternalDiv.g:8260:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDiv.g:8260:3: (enumLiteral_4= '\\u2265' )
                    // InternalDiv.g:8261:4: enumLiteral_4= '\\u2265'
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
                    // InternalDiv.g:8268:3: (enumLiteral_5= '>' )
                    {
                    // InternalDiv.g:8268:3: (enumLiteral_5= '>' )
                    // InternalDiv.g:8269:4: enumLiteral_5= '>'
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
    // InternalDiv.g:8279:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDiv.g:8285:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalDiv.g:8286:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalDiv.g:8286:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt161=5;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt161=1;
                }
                break;
            case 57:
                {
                alt161=2;
                }
                break;
            case 78:
                {
                alt161=3;
                }
                break;
            case 120:
                {
                alt161=4;
                }
                break;
            case 121:
                {
                alt161=5;
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
                    // InternalDiv.g:8287:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDiv.g:8287:3: (enumLiteral_0= 'IN' )
                    // InternalDiv.g:8288:4: enumLiteral_0= 'IN'
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
                    // InternalDiv.g:8295:3: (enumLiteral_1= 'in' )
                    {
                    // InternalDiv.g:8295:3: (enumLiteral_1= 'in' )
                    // InternalDiv.g:8296:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8303:3: (enumLiteral_2= '..' )
                    {
                    // InternalDiv.g:8303:3: (enumLiteral_2= '..' )
                    // InternalDiv.g:8304:4: enumLiteral_2= '..'
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
                    // InternalDiv.g:8311:3: (enumLiteral_3= '->' )
                    {
                    // InternalDiv.g:8311:3: (enumLiteral_3= '->' )
                    // InternalDiv.g:8312:4: enumLiteral_3= '->'
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
                    // InternalDiv.g:8319:3: (enumLiteral_4= '=>' )
                    {
                    // InternalDiv.g:8319:3: (enumLiteral_4= '=>' )
                    // InternalDiv.g:8320:4: enumLiteral_4= '=>'
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
    // InternalDiv.g:8330:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:8336:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDiv.g:8337:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDiv.g:8337:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==87) ) {
                alt162=1;
            }
            else if ( (LA162_0==88) ) {
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
                    // InternalDiv.g:8338:3: (enumLiteral_0= '+' )
                    {
                    // InternalDiv.g:8338:3: (enumLiteral_0= '+' )
                    // InternalDiv.g:8339:4: enumLiteral_0= '+'
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
                    // InternalDiv.g:8346:3: (enumLiteral_1= '-' )
                    {
                    // InternalDiv.g:8346:3: (enumLiteral_1= '-' )
                    // InternalDiv.g:8347:4: enumLiteral_1= '-'
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
    // InternalDiv.g:8357:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDiv.g:8363:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDiv.g:8364:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDiv.g:8364:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt163=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt163=1;
                }
                break;
            case 122:
                {
                alt163=2;
                }
                break;
            case 123:
                {
                alt163=3;
                }
                break;
            case 124:
                {
                alt163=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }

            switch (alt163) {
                case 1 :
                    // InternalDiv.g:8365:3: (enumLiteral_0= '*' )
                    {
                    // InternalDiv.g:8365:3: (enumLiteral_0= '*' )
                    // InternalDiv.g:8366:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8373:3: (enumLiteral_1= '/' )
                    {
                    // InternalDiv.g:8373:3: (enumLiteral_1= '/' )
                    // InternalDiv.g:8374:4: enumLiteral_1= '/'
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
                    // InternalDiv.g:8381:3: (enumLiteral_2= '**' )
                    {
                    // InternalDiv.g:8381:3: (enumLiteral_2= '**' )
                    // InternalDiv.g:8382:4: enumLiteral_2= '**'
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
                    // InternalDiv.g:8389:3: (enumLiteral_3= '%' )
                    {
                    // InternalDiv.g:8389:3: (enumLiteral_3= '%' )
                    // InternalDiv.g:8390:4: enumLiteral_3= '%'
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
    // InternalDiv.g:8400:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDiv.g:8406:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDiv.g:8407:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDiv.g:8407:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt164=5;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt164=1;
                }
                break;
            case 88:
                {
                alt164=2;
                }
                break;
            case 125:
                {
                alt164=3;
                }
                break;
            case 126:
                {
                alt164=4;
                }
                break;
            case 127:
                {
                alt164=5;
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
                    // InternalDiv.g:8408:3: (enumLiteral_0= '+' )
                    {
                    // InternalDiv.g:8408:3: (enumLiteral_0= '+' )
                    // InternalDiv.g:8409:4: enumLiteral_0= '+'
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
                    // InternalDiv.g:8416:3: (enumLiteral_1= '-' )
                    {
                    // InternalDiv.g:8416:3: (enumLiteral_1= '-' )
                    // InternalDiv.g:8417:4: enumLiteral_1= '-'
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
                    // InternalDiv.g:8424:3: (enumLiteral_2= '!' )
                    {
                    // InternalDiv.g:8424:3: (enumLiteral_2= '!' )
                    // InternalDiv.g:8425:4: enumLiteral_2= '!'
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
                    // InternalDiv.g:8432:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDiv.g:8432:3: (enumLiteral_3= 'NOT' )
                    // InternalDiv.g:8433:4: enumLiteral_3= 'NOT'
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
                    // InternalDiv.g:8440:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDiv.g:8440:3: (enumLiteral_4= 'not' )
                    // InternalDiv.g:8441:4: enumLiteral_4= 'not'
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
    // InternalDiv.g:8451:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8457:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalDiv.g:8458:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalDiv.g:8458:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt165=3;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt165=1;
                }
                break;
            case 87:
                {
                alt165=2;
                }
                break;
            case 62:
                {
                alt165=3;
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
                    // InternalDiv.g:8459:3: (enumLiteral_0= '?' )
                    {
                    // InternalDiv.g:8459:3: (enumLiteral_0= '?' )
                    // InternalDiv.g:8460:4: enumLiteral_0= '?'
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
                    // InternalDiv.g:8467:3: (enumLiteral_1= '+' )
                    {
                    // InternalDiv.g:8467:3: (enumLiteral_1= '+' )
                    // InternalDiv.g:8468:4: enumLiteral_1= '+'
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
                    // InternalDiv.g:8475:3: (enumLiteral_2= '*' )
                    {
                    // InternalDiv.g:8475:3: (enumLiteral_2= '*' )
                    // InternalDiv.g:8476:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
        // InternalDiv.g:5141:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalDiv.g:5141:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalDiv.g:5141:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalDiv.g:5142:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalDiv.g:5142:7: ()
        // InternalDiv.g:5143:7: 
        {
        }

        match(input,63,FOLLOW_3); if (state.failed) return ;
        // InternalDiv.g:5145:7: ( ( RULE_ID ) )
        // InternalDiv.g:5146:8: ( RULE_ID )
        {
        // InternalDiv.g:5146:8: ( RULE_ID )
        // InternalDiv.g:5147:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_74); if (state.failed) return ;

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
        // InternalDiv.g:5210:6: ( ( () '.' ) )
        // InternalDiv.g:5210:7: ( () '.' )
        {
        // InternalDiv.g:5210:7: ( () '.' )
        // InternalDiv.g:5211:7: () '.'
        {
        // InternalDiv.g:5211:7: ()
        // InternalDiv.g:5212:7: 
        {
        }

        match(input,63,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDiv

    // $ANTLR start synpred3_InternalDiv
    public final void synpred3_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5246:8: ( ( '(' ) )
        // InternalDiv.g:5246:9: ( '(' )
        {
        // InternalDiv.g:5246:9: ( '(' )
        // InternalDiv.g:5247:9: '('
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDiv

    // $ANTLR start synpred4_InternalDiv
    public final void synpred4_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5607:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalDiv.g:5607:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalDiv.g:5607:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalDiv.g:5608:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalDiv.g:5608:6: ()
        // InternalDiv.g:5609:6: 
        {
        }

        // InternalDiv.g:5610:6: ( ( ruleDmxOpOr ) )
        // InternalDiv.g:5611:7: ( ruleDmxOpOr )
        {
        // InternalDiv.g:5611:7: ( ruleDmxOpOr )
        // InternalDiv.g:5612:8: ruleDmxOpOr
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
        // InternalDiv.g:5695:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalDiv.g:5695:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalDiv.g:5695:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalDiv.g:5696:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalDiv.g:5696:6: ()
        // InternalDiv.g:5697:6: 
        {
        }

        // InternalDiv.g:5698:6: ( ( ruleDmxOpAnd ) )
        // InternalDiv.g:5699:7: ( ruleDmxOpAnd )
        {
        // InternalDiv.g:5699:7: ( ruleDmxOpAnd )
        // InternalDiv.g:5700:8: ruleDmxOpAnd
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
        // InternalDiv.g:5783:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalDiv.g:5783:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalDiv.g:5783:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalDiv.g:5784:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalDiv.g:5784:6: ()
        // InternalDiv.g:5785:6: 
        {
        }

        // InternalDiv.g:5786:6: ( ( ruleDmxOpEquality ) )
        // InternalDiv.g:5787:7: ( ruleDmxOpEquality )
        {
        // InternalDiv.g:5787:7: ( ruleDmxOpEquality )
        // InternalDiv.g:5788:8: ruleDmxOpEquality
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
        // InternalDiv.g:5872:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalDiv.g:5872:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalDiv.g:5872:7: ( () ruleDmxOpInstanceOf )
        // InternalDiv.g:5873:7: () ruleDmxOpInstanceOf
        {
        // InternalDiv.g:5873:7: ()
        // InternalDiv.g:5874:7: 
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
        // InternalDiv.g:5912:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDiv.g:5912:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDiv.g:5912:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDiv.g:5913:7: () ( ( ruleOpCompare ) )
        {
        // InternalDiv.g:5913:7: ()
        // InternalDiv.g:5914:7: 
        {
        }

        // InternalDiv.g:5915:7: ( ( ruleOpCompare ) )
        // InternalDiv.g:5916:8: ( ruleOpCompare )
        {
        // InternalDiv.g:5916:8: ( ruleOpCompare )
        // InternalDiv.g:5917:9: ruleOpCompare
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
        // InternalDiv.g:6031:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDiv.g:6031:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDiv.g:6031:6: ( () ( ( ruleOpOther ) ) )
        // InternalDiv.g:6032:6: () ( ( ruleOpOther ) )
        {
        // InternalDiv.g:6032:6: ()
        // InternalDiv.g:6033:6: 
        {
        }

        // InternalDiv.g:6034:6: ( ( ruleOpOther ) )
        // InternalDiv.g:6035:7: ( ruleOpOther )
        {
        // InternalDiv.g:6035:7: ( ruleOpOther )
        // InternalDiv.g:6036:8: ruleOpOther
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
        // InternalDiv.g:6119:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDiv.g:6119:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDiv.g:6119:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDiv.g:6120:6: () ( ( ruleOpAdd ) )
        {
        // InternalDiv.g:6120:6: ()
        // InternalDiv.g:6121:6: 
        {
        }

        // InternalDiv.g:6122:6: ( ( ruleOpAdd ) )
        // InternalDiv.g:6123:7: ( ruleOpAdd )
        {
        // InternalDiv.g:6123:7: ( ruleOpAdd )
        // InternalDiv.g:6124:8: ruleOpAdd
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
        // InternalDiv.g:6207:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDiv.g:6207:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDiv.g:6207:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDiv.g:6208:6: () ( ( ruleOpMulti ) )
        {
        // InternalDiv.g:6208:6: ()
        // InternalDiv.g:6209:6: 
        {
        }

        // InternalDiv.g:6210:6: ( ( ruleOpMulti ) )
        // InternalDiv.g:6211:7: ( ruleOpMulti )
        {
        // InternalDiv.g:6211:7: ( ruleOpMulti )
        // InternalDiv.g:6212:8: ruleOpMulti
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
        // InternalDiv.g:6370:5: ( ( () ruleDmxOpCast ) )
        // InternalDiv.g:6370:6: ( () ruleDmxOpCast )
        {
        // InternalDiv.g:6370:6: ( () ruleDmxOpCast )
        // InternalDiv.g:6371:6: () ruleDmxOpCast
        {
        // InternalDiv.g:6371:6: ()
        // InternalDiv.g:6372:6: 
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
        // InternalDiv.g:7218:4: ( ']' )
        // InternalDiv.g:7218:5: ']'
        {
        match(input,72,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalDiv

    // $ANTLR start synpred14_InternalDiv
    public final void synpred14_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:7374:5: ( 'else' )
        // InternalDiv.g:7374:6: 'else'
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


    protected DFA78 dfa78 = new DFA78(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA133 dfa133 = new DFA133(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\47\1\uffff\1\4\1\uffff\1\47";
    static final String dfa_3s = "\1\57\1\uffff\1\135\1\uffff\1\4\1\uffff\1\135";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\33\uffff\1\3\16\uffff\1\1",
            "",
            "\1\4\1\3\7\uffff\1\1\1\uffff\1\5\51\uffff\2\1",
            "",
            "\1\6",
            "",
            "\1\4\1\3\7\uffff\1\1\1\uffff\1\5\51\uffff\2\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3402:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\174\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\3\1\4\1\6\1\0\1\2\1\5\1\7\1\1\2\uffff}>";
    static final String[] dfa_13s = {
            "\5\1\14\uffff\3\1\1\uffff\5\1\1\uffff\2\1\3\uffff\1\1\1\uffff\1\1\3\uffff\2\1\3\uffff\1\1\3\uffff\1\1\5\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\2\1\5\uffff\4\1\10\uffff\2\1\1\uffff\2\1\15\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 5869:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA124_5 = input.LA(1);

                         
                        int index124_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA124_9 = input.LA(1);

                         
                        int index124_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA124_6 = input.LA(1);

                         
                        int index124_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA124_2 = input.LA(1);

                         
                        int index124_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDiv()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA124_3 = input.LA(1);

                         
                        int index124_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDiv()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA124_7 = input.LA(1);

                         
                        int index124_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA124_4 = input.LA(1);

                         
                        int index124_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA124_8 = input.LA(1);

                         
                        int index124_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 124, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\3\uffff\1\10\6\uffff";
    static final String dfa_16s = "\1\11\2\uffff\1\4\3\uffff\1\4\2\uffff";
    static final String dfa_17s = "\1\124\2\uffff\1\174\3\uffff\1\11\2\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\3\1\4";
    static final String dfa_19s = "\12\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\1\2\24\uffff\1\5\1\6\56\uffff\4\1\2\4",
            "",
            "",
            "\5\10\13\uffff\4\10\1\uffff\5\10\1\uffff\2\10\3\uffff\1\10\1\uffff\1\10\3\uffff\2\10\3\uffff\1\10\3\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\7\2\uffff\4\10\5\uffff\4\10\10\uffff\2\10\1\uffff\2\10\15\uffff\24\10",
            "",
            "",
            "",
            "\1\10\4\uffff\1\11",
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

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "6536:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002004A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100062L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
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
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C1192200000L,0x000000000C000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000C0192200000L,0x000000000C000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000180100670L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000100060L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000200010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004020200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000062L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0080000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000904100200010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000A04100200010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000804100200010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000408000000062L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001008000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4004000000000072L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4004000000000062L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4006000000000072L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4006000000000062L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000062L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004008000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4014000000000072L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4014000000000062L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000000000062L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4104000000000002L,0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000180100600L,0x00000000001F8000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x000001FFC0000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000010L,0x000001FFC0000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0004000180100610L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x8004000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x000C000180100610L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x00001E0000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000020L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x007E00000000000CL});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0200000000000002L,0x0380000000004000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x4000000000000002L,0x1C00000000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000400002L,0x0000000000000010L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0004000180300670L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000180200600L,0x00000000001F8000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000180000600L,0x00000000001F8000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x000C000180100670L,0xE0000000019F8440L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000182L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x4000000000000200L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000200L,0x0000000001800000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});

}