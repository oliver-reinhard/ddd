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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'information'", "'view'", "'read'", "'only'", "'{'", "'}'", "'as'", "'to'", "'grab'", "'aggregate'", "'primitive'", "'ditch'", "'add'", "'enumeration'", "','", "'root'", "'entity'", "'motph'", "'detail'", "'reference'", "'composite'", "'morph'", "'attribute'", "'query'", "'component'", "'constraint'", "'alias'", "':'", "'redefines'", "'abstract'", "'main'", "'states'", "'events'", "'extends'", "'derived'", "'contains'", "'key'", "'('", "')'", "'returns'", "'import'", "'test'", "'context'", "':='", "'in'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'autonomous'", "'relationship'", "'references'", "'inverse'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
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
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
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

                if ( (LA1_0==58) ) {
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
    // InternalDiv.g:152:1: ruleDomainInformationView returns [EObject current=null] : (otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnlyView_3_0= 'read' ) ) otherlv_4= 'only' ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDivType ) ) | ( (lv_aggregates_8_0= ruleDivAggregate ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDomainInformationView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_readOnlyView_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_description_5_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_aggregates_8_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:158:2: ( (otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnlyView_3_0= 'read' ) ) otherlv_4= 'only' ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDivType ) ) | ( (lv_aggregates_8_0= ruleDivAggregate ) ) )* otherlv_9= '}' ) )
            // InternalDiv.g:159:2: (otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnlyView_3_0= 'read' ) ) otherlv_4= 'only' ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDivType ) ) | ( (lv_aggregates_8_0= ruleDivAggregate ) ) )* otherlv_9= '}' )
            {
            // InternalDiv.g:159:2: (otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnlyView_3_0= 'read' ) ) otherlv_4= 'only' ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDivType ) ) | ( (lv_aggregates_8_0= ruleDivAggregate ) ) )* otherlv_9= '}' )
            // InternalDiv.g:160:3: otherlv_0= 'information' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnlyView_3_0= 'read' ) ) otherlv_4= 'only' ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_types_7_0= ruleDivType ) ) | ( (lv_aggregates_8_0= ruleDivAggregate ) ) )* otherlv_9= '}'
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

            // InternalDiv.g:186:3: ( (lv_readOnlyView_3_0= 'read' ) )
            // InternalDiv.g:187:4: (lv_readOnlyView_3_0= 'read' )
            {
            // InternalDiv.g:187:4: (lv_readOnlyView_3_0= 'read' )
            // InternalDiv.g:188:5: lv_readOnlyView_3_0= 'read'
            {
            lv_readOnlyView_3_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_readOnlyView_3_0, grammarAccess.getDomainInformationViewAccess().getReadOnlyViewReadKeyword_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDomainInformationViewRule());
              					}
              					setWithLastConsumed(current, "readOnlyView", true, "read");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDomainInformationViewAccess().getOnlyKeyword_4());
              		
            }
            // InternalDiv.g:204:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_PLAIN_TEXT_ONLY && LA2_0<=RULE_RICH_TEXT_START)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDiv.g:205:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:205:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:206:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDomainInformationViewAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDomainInformationViewRule());
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

              			newLeafNode(otherlv_6, grammarAccess.getDomainInformationViewAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDiv.g:227:3: ( ( (lv_types_7_0= ruleDivType ) ) | ( (lv_aggregates_8_0= ruleDivAggregate ) ) )*
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==28||LA3_2==31||(LA3_2>=33 && LA3_2<=34)||LA3_2==36) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==27) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 29:
                case 35:
                    {
                    alt3=1;
                    }
                    break;
                case 42:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalDiv.g:228:4: ( (lv_types_7_0= ruleDivType ) )
            	    {
            	    // InternalDiv.g:228:4: ( (lv_types_7_0= ruleDivType ) )
            	    // InternalDiv.g:229:5: (lv_types_7_0= ruleDivType )
            	    {
            	    // InternalDiv.g:229:5: (lv_types_7_0= ruleDivType )
            	    // InternalDiv.g:230:6: lv_types_7_0= ruleDivType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDomainInformationViewAccess().getTypesDivTypeParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_types_7_0=ruleDivType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDomainInformationViewRule());
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


            	    }
            	    break;
            	case 2 :
            	    // InternalDiv.g:248:4: ( (lv_aggregates_8_0= ruleDivAggregate ) )
            	    {
            	    // InternalDiv.g:248:4: ( (lv_aggregates_8_0= ruleDivAggregate ) )
            	    // InternalDiv.g:249:5: (lv_aggregates_8_0= ruleDivAggregate )
            	    {
            	    // InternalDiv.g:249:5: (lv_aggregates_8_0= ruleDivAggregate )
            	    // InternalDiv.g:250:6: lv_aggregates_8_0= ruleDivAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDomainInformationViewAccess().getAggregatesDivAggregateParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_aggregates_8_0=ruleDivAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDomainInformationViewRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_8_0,
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

            otherlv_9=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDomainInformationViewAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalDiv.g:276:1: entryRuleDivGrabAggregateRule returns [EObject current=null] : iv_ruleDivGrabAggregateRule= ruleDivGrabAggregateRule EOF ;
    public final EObject entryRuleDivGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabAggregateRule = null;


        try {
            // InternalDiv.g:276:61: (iv_ruleDivGrabAggregateRule= ruleDivGrabAggregateRule EOF )
            // InternalDiv.g:277:2: iv_ruleDivGrabAggregateRule= ruleDivGrabAggregateRule EOF
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
    // InternalDiv.g:283:1: ruleDivGrabAggregateRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        Token lv_readOnlyView_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_renameTo_4_0=null;


        	enterRule();

        try {
            // InternalDiv.g:289:2: ( ( ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:290:2: ( ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:290:2: ( ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? )
            // InternalDiv.g:291:3: ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:291:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:292:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:292:4: ( ruleDQualifiedName )
            // InternalDiv.g:293:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabAggregateRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivGrabAggregateRuleAccess().getSourceDimAggregateCrossReference_0_0());
              				
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

            // InternalDiv.g:307:3: ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDiv.g:308:4: ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only'
                    {
                    // InternalDiv.g:308:4: ( (lv_readOnlyView_1_0= 'read' ) )
                    // InternalDiv.g:309:5: (lv_readOnlyView_1_0= 'read' )
                    {
                    // InternalDiv.g:309:5: (lv_readOnlyView_1_0= 'read' )
                    // InternalDiv.g:310:6: lv_readOnlyView_1_0= 'read'
                    {
                    lv_readOnlyView_1_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_readOnlyView_1_0, grammarAccess.getDivGrabAggregateRuleAccess().getReadOnlyViewReadKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabAggregateRuleRule());
                      						}
                      						setWithLastConsumed(current, "readOnlyView", true, "read");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDivGrabAggregateRuleAccess().getOnlyKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDiv.g:327:3: (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDiv.g:328:4: otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDivGrabAggregateRuleAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:332:4: ( (lv_renameTo_4_0= RULE_ID ) )
                    // InternalDiv.g:333:5: (lv_renameTo_4_0= RULE_ID )
                    {
                    // InternalDiv.g:333:5: (lv_renameTo_4_0= RULE_ID )
                    // InternalDiv.g:334:6: lv_renameTo_4_0= RULE_ID
                    {
                    lv_renameTo_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_4_0, grammarAccess.getDivGrabAggregateRuleAccess().getRenameToIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabAggregateRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_4_0,
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
    // InternalDiv.g:355:1: entryRuleDivGrabPrimitiveRule returns [EObject current=null] : iv_ruleDivGrabPrimitiveRule= ruleDivGrabPrimitiveRule EOF ;
    public final EObject entryRuleDivGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabPrimitiveRule = null;


        try {
            // InternalDiv.g:355:61: (iv_ruleDivGrabPrimitiveRule= ruleDivGrabPrimitiveRule EOF )
            // InternalDiv.g:356:2: iv_ruleDivGrabPrimitiveRule= ruleDivGrabPrimitiveRule EOF
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
    // InternalDiv.g:362:1: ruleDivGrabPrimitiveRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:368:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:369:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:369:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:370:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:370:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:371:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:371:4: ( ruleDQualifiedName )
            // InternalDiv.g:372:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabPrimitiveRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivGrabPrimitiveRuleAccess().getSourceDimPrimitiveCrossReference_0_0());
              				
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

            // InternalDiv.g:386:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDiv.g:387:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabPrimitiveRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:391:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:392:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:392:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:393:6: lv_renameTo_2_0= RULE_ID
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
    // InternalDiv.g:414:1: entryRuleDivDitchPrimitiveRule returns [EObject current=null] : iv_ruleDivDitchPrimitiveRule= ruleDivDitchPrimitiveRule EOF ;
    public final EObject entryRuleDivDitchPrimitiveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchPrimitiveRule = null;


        try {
            // InternalDiv.g:414:62: (iv_ruleDivDitchPrimitiveRule= ruleDivDitchPrimitiveRule EOF )
            // InternalDiv.g:415:2: iv_ruleDivDitchPrimitiveRule= ruleDivDitchPrimitiveRule EOF
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
    // InternalDiv.g:421:1: ruleDivDitchPrimitiveRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleDivDitchPrimitiveRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDiv.g:427:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalDiv.g:428:2: ( ( ruleDQualifiedName ) )
            {
            // InternalDiv.g:428:2: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:429:3: ( ruleDQualifiedName )
            {
            // InternalDiv.g:429:3: ( ruleDQualifiedName )
            // InternalDiv.g:430:4: ruleDQualifiedName
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
    // InternalDiv.g:447:1: entryRuleDivGrabEnumerationRule returns [EObject current=null] : iv_ruleDivGrabEnumerationRule= ruleDivGrabEnumerationRule EOF ;
    public final EObject entryRuleDivGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabEnumerationRule = null;


        try {
            // InternalDiv.g:447:63: (iv_ruleDivGrabEnumerationRule= ruleDivGrabEnumerationRule EOF )
            // InternalDiv.g:448:2: iv_ruleDivGrabEnumerationRule= ruleDivGrabEnumerationRule EOF
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
    // InternalDiv.g:454:1: ruleDivGrabEnumerationRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:460:2: ( ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:461:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:461:2: ( ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:462:3: ( ( ruleDQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:462:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:463:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:463:4: ( ruleDQualifiedName )
            // InternalDiv.g:464:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabEnumerationRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivGrabEnumerationRuleAccess().getSourceDimEnumerationCrossReference_0_0());
              				
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

            // InternalDiv.g:478:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDiv.g:479:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabEnumerationRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:483:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:484:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:484:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:485:6: lv_renameTo_2_0= RULE_ID
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
    // InternalDiv.g:506:1: entryRuleDivDitchEnumerationRule returns [EObject current=null] : iv_ruleDivDitchEnumerationRule= ruleDivDitchEnumerationRule EOF ;
    public final EObject entryRuleDivDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchEnumerationRule = null;


        try {
            // InternalDiv.g:506:64: (iv_ruleDivDitchEnumerationRule= ruleDivDitchEnumerationRule EOF )
            // InternalDiv.g:507:2: iv_ruleDivDitchEnumerationRule= ruleDivDitchEnumerationRule EOF
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
    // InternalDiv.g:513:1: ruleDivDitchEnumerationRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleDivDitchEnumerationRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDiv.g:519:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalDiv.g:520:2: ( ( ruleDQualifiedName ) )
            {
            // InternalDiv.g:520:2: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:521:3: ( ruleDQualifiedName )
            {
            // InternalDiv.g:521:3: ( ruleDQualifiedName )
            // InternalDiv.g:522:4: ruleDQualifiedName
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
    // InternalDiv.g:539:1: entryRuleDivGrabEnumerationLiteralRule returns [EObject current=null] : iv_ruleDivGrabEnumerationLiteralRule= ruleDivGrabEnumerationLiteralRule EOF ;
    public final EObject entryRuleDivGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabEnumerationLiteralRule = null;


        try {
            // InternalDiv.g:539:70: (iv_ruleDivGrabEnumerationLiteralRule= ruleDivGrabEnumerationLiteralRule EOF )
            // InternalDiv.g:540:2: iv_ruleDivGrabEnumerationLiteralRule= ruleDivGrabEnumerationLiteralRule EOF
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
    // InternalDiv.g:546:1: ruleDivGrabEnumerationLiteralRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalDiv.g:552:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:553:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:553:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalDiv.g:554:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:554:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:555:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:555:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:556:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabEnumerationLiteralRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDivGrabEnumerationLiteralRuleAccess().getSourceDimLiteralCrossReference_0_0());
              				
            }

            }


            }

            // InternalDiv.g:567:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDiv.g:568:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDivGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:572:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalDiv.g:573:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalDiv.g:573:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalDiv.g:574:6: lv_renameTo_2_0= RULE_ID
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
    // InternalDiv.g:595:1: entryRuleDivDitchEnumerationLiteralRule returns [EObject current=null] : iv_ruleDivDitchEnumerationLiteralRule= ruleDivDitchEnumerationLiteralRule EOF ;
    public final EObject entryRuleDivDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchEnumerationLiteralRule = null;


        try {
            // InternalDiv.g:595:71: (iv_ruleDivDitchEnumerationLiteralRule= ruleDivDitchEnumerationLiteralRule EOF )
            // InternalDiv.g:596:2: iv_ruleDivDitchEnumerationLiteralRule= ruleDivDitchEnumerationLiteralRule EOF
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
    // InternalDiv.g:602:1: ruleDivDitchEnumerationLiteralRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDivDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDiv.g:608:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDiv.g:609:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDiv.g:609:2: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:610:3: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:610:3: (otherlv_0= RULE_ID )
            // InternalDiv.g:611:4: otherlv_0= RULE_ID
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
    // InternalDiv.g:625:1: entryRuleDivGrabComplexTypeRule returns [EObject current=null] : iv_ruleDivGrabComplexTypeRule= ruleDivGrabComplexTypeRule EOF ;
    public final EObject entryRuleDivGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabComplexTypeRule = null;


        try {
            // InternalDiv.g:625:63: (iv_ruleDivGrabComplexTypeRule= ruleDivGrabComplexTypeRule EOF )
            // InternalDiv.g:626:2: iv_ruleDivGrabComplexTypeRule= ruleDivGrabComplexTypeRule EOF
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
    // InternalDiv.g:632:1: ruleDivGrabComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token lv_readOnlyView_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_renameTo_4_0=null;


        	enterRule();

        try {
            // InternalDiv.g:638:2: ( ( ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:639:2: ( ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:639:2: ( ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? )
            // InternalDiv.g:640:3: ( ( ruleDQualifiedName ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:640:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:641:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:641:4: ( ruleDQualifiedName )
            // InternalDiv.g:642:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivGrabComplexTypeRuleAccess().getSourceDimComplexTypeCrossReference_0_0());
              				
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

            // InternalDiv.g:656:3: ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDiv.g:657:4: ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only'
                    {
                    // InternalDiv.g:657:4: ( (lv_readOnlyView_1_0= 'read' ) )
                    // InternalDiv.g:658:5: (lv_readOnlyView_1_0= 'read' )
                    {
                    // InternalDiv.g:658:5: (lv_readOnlyView_1_0= 'read' )
                    // InternalDiv.g:659:6: lv_readOnlyView_1_0= 'read'
                    {
                    lv_readOnlyView_1_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_readOnlyView_1_0, grammarAccess.getDivGrabComplexTypeRuleAccess().getReadOnlyViewReadKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabComplexTypeRuleRule());
                      						}
                      						setWithLastConsumed(current, "readOnlyView", true, "read");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDivGrabComplexTypeRuleAccess().getOnlyKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDiv.g:676:3: (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDiv.g:677:4: otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDivGrabComplexTypeRuleAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:681:4: ( (lv_renameTo_4_0= RULE_ID ) )
                    // InternalDiv.g:682:5: (lv_renameTo_4_0= RULE_ID )
                    {
                    // InternalDiv.g:682:5: (lv_renameTo_4_0= RULE_ID )
                    // InternalDiv.g:683:6: lv_renameTo_4_0= RULE_ID
                    {
                    lv_renameTo_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_4_0, grammarAccess.getDivGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabComplexTypeRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_4_0,
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
    // InternalDiv.g:704:1: entryRuleDivDitchComplexTypeRule returns [EObject current=null] : iv_ruleDivDitchComplexTypeRule= ruleDivDitchComplexTypeRule EOF ;
    public final EObject entryRuleDivDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchComplexTypeRule = null;


        try {
            // InternalDiv.g:704:64: (iv_ruleDivDitchComplexTypeRule= ruleDivDitchComplexTypeRule EOF )
            // InternalDiv.g:705:2: iv_ruleDivDitchComplexTypeRule= ruleDivDitchComplexTypeRule EOF
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
    // InternalDiv.g:711:1: ruleDivDitchComplexTypeRule returns [EObject current=null] : ( ( ruleDQualifiedName ) ) ;
    public final EObject ruleDivDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDiv.g:717:2: ( ( ( ruleDQualifiedName ) ) )
            // InternalDiv.g:718:2: ( ( ruleDQualifiedName ) )
            {
            // InternalDiv.g:718:2: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:719:3: ( ruleDQualifiedName )
            {
            // InternalDiv.g:719:3: ( ruleDQualifiedName )
            // InternalDiv.g:720:4: ruleDQualifiedName
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


    // $ANTLR start "entryRuleSimMorphComplexTypeRule"
    // InternalDiv.g:737:1: entryRuleSimMorphComplexTypeRule returns [EObject current=null] : iv_ruleSimMorphComplexTypeRule= ruleSimMorphComplexTypeRule EOF ;
    public final EObject entryRuleSimMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimMorphComplexTypeRule = null;


        try {
            // InternalDiv.g:737:64: (iv_ruleSimMorphComplexTypeRule= ruleSimMorphComplexTypeRule EOF )
            // InternalDiv.g:738:2: iv_ruleSimMorphComplexTypeRule= ruleSimMorphComplexTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimMorphComplexTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimMorphComplexTypeRule=ruleSimMorphComplexTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimMorphComplexTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimMorphComplexTypeRule"


    // $ANTLR start "ruleSimMorphComplexTypeRule"
    // InternalDiv.g:744:1: ruleSimMorphComplexTypeRule returns [EObject current=null] : ( ( ( ruleDQualifiedName ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only' ) ;
    public final EObject ruleSimMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_readOnlyView_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDiv.g:750:2: ( ( ( ( ruleDQualifiedName ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only' ) )
            // InternalDiv.g:751:2: ( ( ( ruleDQualifiedName ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only' )
            {
            // InternalDiv.g:751:2: ( ( ( ruleDQualifiedName ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only' )
            // InternalDiv.g:752:3: ( ( ruleDQualifiedName ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only'
            {
            // InternalDiv.g:752:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:753:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:753:4: ( ruleDQualifiedName )
            // InternalDiv.g:754:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSimMorphComplexTypeRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimMorphComplexTypeRuleAccess().getSourceDimComplexTypeCrossReference_0_0());
              				
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

            otherlv_1=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSimMorphComplexTypeRuleAccess().getToKeyword_1());
              		
            }
            // InternalDiv.g:772:3: ( (lv_readOnlyView_2_0= 'read' ) )
            // InternalDiv.g:773:4: (lv_readOnlyView_2_0= 'read' )
            {
            // InternalDiv.g:773:4: (lv_readOnlyView_2_0= 'read' )
            // InternalDiv.g:774:5: lv_readOnlyView_2_0= 'read'
            {
            lv_readOnlyView_2_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_readOnlyView_2_0, grammarAccess.getSimMorphComplexTypeRuleAccess().getReadOnlyViewReadKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSimMorphComplexTypeRuleRule());
              					}
              					setWithLastConsumed(current, "readOnlyView", true, "read");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSimMorphComplexTypeRuleAccess().getOnlyKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimMorphComplexTypeRule"


    // $ANTLR start "entryRuleDivGrabFeatureRule"
    // InternalDiv.g:794:1: entryRuleDivGrabFeatureRule returns [EObject current=null] : iv_ruleDivGrabFeatureRule= ruleDivGrabFeatureRule EOF ;
    public final EObject entryRuleDivGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivGrabFeatureRule = null;


        try {
            // InternalDiv.g:794:59: (iv_ruleDivGrabFeatureRule= ruleDivGrabFeatureRule EOF )
            // InternalDiv.g:795:2: iv_ruleDivGrabFeatureRule= ruleDivGrabFeatureRule EOF
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
    // InternalDiv.g:801:1: ruleDivGrabFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDivGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_readOnlyView_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_renameTo_4_0=null;


        	enterRule();

        try {
            // InternalDiv.g:807:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? ) )
            // InternalDiv.g:808:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? )
            {
            // InternalDiv.g:808:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? )
            // InternalDiv.g:809:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )? (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            {
            // InternalDiv.g:809:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:810:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:810:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:811:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivGrabFeatureRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDivGrabFeatureRuleAccess().getSourceDimFeatureCrossReference_0_0());
              				
            }

            }


            }

            // InternalDiv.g:822:3: ( ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDiv.g:823:4: ( (lv_readOnlyView_1_0= 'read' ) ) otherlv_2= 'only'
                    {
                    // InternalDiv.g:823:4: ( (lv_readOnlyView_1_0= 'read' ) )
                    // InternalDiv.g:824:5: (lv_readOnlyView_1_0= 'read' )
                    {
                    // InternalDiv.g:824:5: (lv_readOnlyView_1_0= 'read' )
                    // InternalDiv.g:825:6: lv_readOnlyView_1_0= 'read'
                    {
                    lv_readOnlyView_1_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_readOnlyView_1_0, grammarAccess.getDivGrabFeatureRuleAccess().getReadOnlyViewReadKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabFeatureRuleRule());
                      						}
                      						setWithLastConsumed(current, "readOnlyView", true, "read");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDivGrabFeatureRuleAccess().getOnlyKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDiv.g:842:3: (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDiv.g:843:4: otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDivGrabFeatureRuleAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:847:4: ( (lv_renameTo_4_0= RULE_ID ) )
                    // InternalDiv.g:848:5: (lv_renameTo_4_0= RULE_ID )
                    {
                    // InternalDiv.g:848:5: (lv_renameTo_4_0= RULE_ID )
                    // InternalDiv.g:849:6: lv_renameTo_4_0= RULE_ID
                    {
                    lv_renameTo_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_renameTo_4_0, grammarAccess.getDivGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDivGrabFeatureRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"renameTo",
                      							lv_renameTo_4_0,
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
    // InternalDiv.g:870:1: entryRuleDivDitchFeatureRule returns [EObject current=null] : iv_ruleDivDitchFeatureRule= ruleDivDitchFeatureRule EOF ;
    public final EObject entryRuleDivDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDitchFeatureRule = null;


        try {
            // InternalDiv.g:870:60: (iv_ruleDivDitchFeatureRule= ruleDivDitchFeatureRule EOF )
            // InternalDiv.g:871:2: iv_ruleDivDitchFeatureRule= ruleDivDitchFeatureRule EOF
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
    // InternalDiv.g:877:1: ruleDivDitchFeatureRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDivDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDiv.g:883:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDiv.g:884:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDiv.g:884:2: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:885:3: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:885:3: (otherlv_0= RULE_ID )
            // InternalDiv.g:886:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleDivMorphFeatureRule"
    // InternalDiv.g:900:1: entryRuleDivMorphFeatureRule returns [EObject current=null] : iv_ruleDivMorphFeatureRule= ruleDivMorphFeatureRule EOF ;
    public final EObject entryRuleDivMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivMorphFeatureRule = null;


        try {
            // InternalDiv.g:900:60: (iv_ruleDivMorphFeatureRule= ruleDivMorphFeatureRule EOF )
            // InternalDiv.g:901:2: iv_ruleDivMorphFeatureRule= ruleDivMorphFeatureRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivMorphFeatureRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivMorphFeatureRule=ruleDivMorphFeatureRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivMorphFeatureRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivMorphFeatureRule"


    // $ANTLR start "ruleDivMorphFeatureRule"
    // InternalDiv.g:907:1: ruleDivMorphFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only' ) ;
    public final EObject ruleDivMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_readOnlyView_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDiv.g:913:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only' ) )
            // InternalDiv.g:914:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only' )
            {
            // InternalDiv.g:914:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only' )
            // InternalDiv.g:915:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (lv_readOnlyView_2_0= 'read' ) ) otherlv_3= 'only'
            {
            // InternalDiv.g:915:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:916:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:916:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:917:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivMorphFeatureRuleRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDivMorphFeatureRuleAccess().getSourceDimFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDivMorphFeatureRuleAccess().getToKeyword_1());
              		
            }
            // InternalDiv.g:932:3: ( (lv_readOnlyView_2_0= 'read' ) )
            // InternalDiv.g:933:4: (lv_readOnlyView_2_0= 'read' )
            {
            // InternalDiv.g:933:4: (lv_readOnlyView_2_0= 'read' )
            // InternalDiv.g:934:5: lv_readOnlyView_2_0= 'read'
            {
            lv_readOnlyView_2_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_readOnlyView_2_0, grammarAccess.getDivMorphFeatureRuleAccess().getReadOnlyViewReadKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDivMorphFeatureRuleRule());
              					}
              					setWithLastConsumed(current, "readOnlyView", true, "read");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDivMorphFeatureRuleAccess().getOnlyKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivMorphFeatureRule"


    // $ANTLR start "entryRuleDivAggregate"
    // InternalDiv.g:954:1: entryRuleDivAggregate returns [EObject current=null] : iv_ruleDivAggregate= ruleDivAggregate EOF ;
    public final EObject entryRuleDivAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAggregate = null;


        try {
            // InternalDiv.g:954:53: (iv_ruleDivAggregate= ruleDivAggregate EOF )
            // InternalDiv.g:955:2: iv_ruleDivAggregate= ruleDivAggregate EOF
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
    // InternalDiv.g:961:1: ruleDivAggregate returns [EObject current=null] : (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate ) ;
    public final EObject ruleDivAggregate() throws RecognitionException {
        EObject current = null;

        EObject this_DivAggregateTransposition_0 = null;

        EObject this_DimAggregate_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:967:2: ( (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate ) )
            // InternalDiv.g:968:2: (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate )
            {
            // InternalDiv.g:968:2: (this_DivAggregateTransposition_0= ruleDivAggregateTransposition | this_DimAggregate_1= ruleDimAggregate )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==42) ) {
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
                    // InternalDiv.g:969:3: this_DivAggregateTransposition_0= ruleDivAggregateTransposition
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
                    // InternalDiv.g:978:3: this_DimAggregate_1= ruleDimAggregate
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
    // InternalDiv.g:990:1: entryRuleDivAggregateTransposition returns [EObject current=null] : iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF ;
    public final EObject entryRuleDivAggregateTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAggregateTransposition = null;


        try {
            // InternalDiv.g:990:66: (iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF )
            // InternalDiv.g:991:2: iv_ruleDivAggregateTransposition= ruleDivAggregateTransposition EOF
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
    // InternalDiv.g:997:1: ruleDivAggregateTransposition returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? ) ;
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
            // InternalDiv.g:1003:2: ( ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? ) )
            // InternalDiv.g:1004:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? )
            {
            // InternalDiv.g:1004:2: ( () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )? )
            // InternalDiv.g:1005:3: () otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_rule_3_0= ruleDivGrabAggregateRule ) ) ( (lv_description_4_0= ruleDRichText ) )? (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )?
            {
            // InternalDiv.g:1005:3: ()
            // InternalDiv.g:1006:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivAggregateTranspositionAccess().getTAggregateTranspositionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDivAggregateTranspositionAccess().getGrabKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDivAggregateTranspositionAccess().getAggregateKeyword_2());
              		
            }
            // InternalDiv.g:1020:3: ( (lv_rule_3_0= ruleDivGrabAggregateRule ) )
            // InternalDiv.g:1021:4: (lv_rule_3_0= ruleDivGrabAggregateRule )
            {
            // InternalDiv.g:1021:4: (lv_rule_3_0= ruleDivGrabAggregateRule )
            // InternalDiv.g:1022:5: lv_rule_3_0= ruleDivGrabAggregateRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivAggregateTranspositionAccess().getRuleDivGrabAggregateRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalDiv.g:1039:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_PLAIN_TEXT_ONLY && LA14_0<=RULE_RICH_TEXT_START)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDiv.g:1040:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:1040:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:1041:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivAggregateTranspositionAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalDiv.g:1058:3: (otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDiv.g:1059:4: otherlv_5= '{' ( (lv_features_6_0= ruleDivQueryTransposition ) )* ( (lv_types_7_0= ruleDivType ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDivAggregateTranspositionAccess().getLeftCurlyBracketKeyword_5_0());
                      			
                    }
                    // InternalDiv.g:1063:4: ( (lv_features_6_0= ruleDivQueryTransposition ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==26) ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1==41) ) {
                                alt15=1;
                            }


                        }
                        else if ( (LA15_0==29) ) {
                            int LA15_2 = input.LA(2);

                            if ( (LA15_2==41) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDiv.g:1064:5: (lv_features_6_0= ruleDivQueryTransposition )
                    	    {
                    	    // InternalDiv.g:1064:5: (lv_features_6_0= ruleDivQueryTransposition )
                    	    // InternalDiv.g:1065:6: lv_features_6_0= ruleDivQueryTransposition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDivAggregateTranspositionAccess().getFeaturesDivQueryTranspositionParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_17);
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
                    	    break loop15;
                        }
                    } while (true);

                    // InternalDiv.g:1082:4: ( (lv_types_7_0= ruleDivType ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==26||LA16_0==29||LA16_0==35) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalDiv.g:1083:5: (lv_types_7_0= ruleDivType )
                    	    {
                    	    // InternalDiv.g:1083:5: (lv_types_7_0= ruleDivType )
                    	    // InternalDiv.g:1084:6: lv_types_7_0= ruleDivType
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDivAggregateTranspositionAccess().getTypesDivTypeParserRuleCall_5_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_17);
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:1110:1: entryRuleDivType returns [EObject current=null] : iv_ruleDivType= ruleDivType EOF ;
    public final EObject entryRuleDivType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivType = null;


        try {
            // InternalDiv.g:1110:48: (iv_ruleDivType= ruleDivType EOF )
            // InternalDiv.g:1111:2: iv_ruleDivType= ruleDivType EOF
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
    // InternalDiv.g:1117:1: ruleDivType returns [EObject current=null] : (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition ) ;
    public final EObject ruleDivType() throws RecognitionException {
        EObject current = null;

        EObject this_DivPrimitiveTransposition_0 = null;

        EObject this_DivEnumerationTransposition_1 = null;

        EObject this_DivEntityTypeTransposition_2 = null;

        EObject this_DivDetailTypeTransposition_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:1123:2: ( (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition ) )
            // InternalDiv.g:1124:2: (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition )
            {
            // InternalDiv.g:1124:2: (this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition | this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition | this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition | this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt18=4;
                    }
                    break;
                case 28:
                    {
                    alt18=1;
                    }
                    break;
                case 31:
                    {
                    alt18=2;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt18=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt18=4;
                    }
                    break;
                case 28:
                    {
                    alt18=1;
                    }
                    break;
                case 31:
                    {
                    alt18=2;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt18=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDiv.g:1125:3: this_DivPrimitiveTransposition_0= ruleDivPrimitiveTransposition
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
                    // InternalDiv.g:1134:3: this_DivEnumerationTransposition_1= ruleDivEnumerationTransposition
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
                    // InternalDiv.g:1143:3: this_DivEntityTypeTransposition_2= ruleDivEntityTypeTransposition
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
                    // InternalDiv.g:1152:3: this_DivDetailTypeTransposition_3= ruleDivDetailTypeTransposition
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
    // InternalDiv.g:1164:1: entryRuleDivPrimitiveTransposition returns [EObject current=null] : iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF ;
    public final EObject entryRuleDivPrimitiveTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivPrimitiveTransposition = null;


        try {
            // InternalDiv.g:1164:66: (iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF )
            // InternalDiv.g:1165:2: iv_ruleDivPrimitiveTransposition= ruleDivPrimitiveTransposition EOF
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
    // InternalDiv.g:1171:1: ruleDivPrimitiveTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? ) ;
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
            // InternalDiv.g:1177:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? ) )
            // InternalDiv.g:1178:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? )
            {
            // InternalDiv.g:1178:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )? )
            // InternalDiv.g:1179:3: () ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )?
            {
            // InternalDiv.g:1179:3: ()
            // InternalDiv.g:1180:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivPrimitiveTranspositionAccess().getTPrimitiveTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1186:3: ( (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
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
                    // InternalDiv.g:1187:4: (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) )
                    {
                    // InternalDiv.g:1187:4: (otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) ) )
                    // InternalDiv.g:1188:5: otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivPrimitiveTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivPrimitiveTranspositionAccess().getPrimitiveKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1196:5: ( (lv_rule_3_0= ruleDivGrabPrimitiveRule ) )
                    // InternalDiv.g:1197:6: (lv_rule_3_0= ruleDivGrabPrimitiveRule )
                    {
                    // InternalDiv.g:1197:6: (lv_rule_3_0= ruleDivGrabPrimitiveRule )
                    // InternalDiv.g:1198:7: lv_rule_3_0= ruleDivGrabPrimitiveRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivPrimitiveTranspositionAccess().getRuleDivGrabPrimitiveRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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
                    // InternalDiv.g:1217:4: (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) )
                    {
                    // InternalDiv.g:1217:4: (otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) ) )
                    // InternalDiv.g:1218:5: otherlv_4= 'ditch' otherlv_5= 'primitive' ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivPrimitiveTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivPrimitiveTranspositionAccess().getPrimitiveKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1226:5: ( (lv_rule_6_0= ruleDivDitchPrimitiveRule ) )
                    // InternalDiv.g:1227:6: (lv_rule_6_0= ruleDivDitchPrimitiveRule )
                    {
                    // InternalDiv.g:1227:6: (lv_rule_6_0= ruleDivDitchPrimitiveRule )
                    // InternalDiv.g:1228:7: lv_rule_6_0= ruleDivDitchPrimitiveRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivPrimitiveTranspositionAccess().getRuleDivDitchPrimitiveRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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

            // InternalDiv.g:1247:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_PLAIN_TEXT_ONLY && LA20_0<=RULE_RICH_TEXT_START)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDiv.g:1248:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1248:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1249:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivPrimitiveTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalDiv.g:1266:3: (otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDiv.g:1267:4: otherlv_8= '{' (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDivPrimitiveTranspositionAccess().getLeftCurlyBracketKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:1271:4: (otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==30) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalDiv.g:1272:5: otherlv_9= 'add' ( (lv_constraints_10_0= ruleDConstraint ) )
                    	    {
                    	    otherlv_9=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getDivPrimitiveTranspositionAccess().getAddKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:1276:5: ( (lv_constraints_10_0= ruleDConstraint ) )
                    	    // InternalDiv.g:1277:6: (lv_constraints_10_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:1277:6: (lv_constraints_10_0= ruleDConstraint )
                    	    // InternalDiv.g:1278:7: lv_constraints_10_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDivPrimitiveTranspositionAccess().getConstraintsDConstraintParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:1305:1: entryRuleDivEnumerationTransposition returns [EObject current=null] : iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF ;
    public final EObject entryRuleDivEnumerationTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivEnumerationTransposition = null;


        try {
            // InternalDiv.g:1305:68: (iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF )
            // InternalDiv.g:1306:2: iv_ruleDivEnumerationTransposition= ruleDivEnumerationTransposition EOF
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
    // InternalDiv.g:1312:1: ruleDivEnumerationTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? ) ;
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
            // InternalDiv.g:1318:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? ) )
            // InternalDiv.g:1319:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? )
            {
            // InternalDiv.g:1319:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )? )
            // InternalDiv.g:1320:3: () ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )?
            {
            // InternalDiv.g:1320:3: ()
            // InternalDiv.g:1321:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivEnumerationTranspositionAccess().getTEnumerationTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1327:3: ( (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            else if ( (LA23_0==29) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDiv.g:1328:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) )
                    {
                    // InternalDiv.g:1328:4: (otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) ) )
                    // InternalDiv.g:1329:5: otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivEnumerationTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivEnumerationTranspositionAccess().getEnumerationKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1337:5: ( (lv_rule_3_0= ruleDivGrabEnumerationRule ) )
                    // InternalDiv.g:1338:6: (lv_rule_3_0= ruleDivGrabEnumerationRule )
                    {
                    // InternalDiv.g:1338:6: (lv_rule_3_0= ruleDivGrabEnumerationRule )
                    // InternalDiv.g:1339:7: lv_rule_3_0= ruleDivGrabEnumerationRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getRuleDivGrabEnumerationRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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
                    // InternalDiv.g:1358:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) )
                    {
                    // InternalDiv.g:1358:4: (otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) ) )
                    // InternalDiv.g:1359:5: otherlv_4= 'ditch' otherlv_5= 'enumeration' ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivEnumerationTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivEnumerationTranspositionAccess().getEnumerationKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1367:5: ( (lv_rule_6_0= ruleDivDitchEnumerationRule ) )
                    // InternalDiv.g:1368:6: (lv_rule_6_0= ruleDivDitchEnumerationRule )
                    {
                    // InternalDiv.g:1368:6: (lv_rule_6_0= ruleDivDitchEnumerationRule )
                    // InternalDiv.g:1369:7: lv_rule_6_0= ruleDivDitchEnumerationRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getRuleDivDitchEnumerationRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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

            // InternalDiv.g:1388:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_PLAIN_TEXT_ONLY && LA24_0<=RULE_RICH_TEXT_START)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDiv.g:1389:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1389:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1390:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalDiv.g:1407:3: (otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDiv.g:1408:4: otherlv_8= '{' ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )? (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )* otherlv_14= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDivEnumerationTranspositionAccess().getLeftCurlyBracketKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:1412:4: ( ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==26||LA26_0==29) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalDiv.g:1413:5: ( (lv_literals_9_0= ruleDivLiteralTransposition ) ) (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )*
                            {
                            // InternalDiv.g:1413:5: ( (lv_literals_9_0= ruleDivLiteralTransposition ) )
                            // InternalDiv.g:1414:6: (lv_literals_9_0= ruleDivLiteralTransposition )
                            {
                            // InternalDiv.g:1414:6: (lv_literals_9_0= ruleDivLiteralTransposition )
                            // InternalDiv.g:1415:7: lv_literals_9_0= ruleDivLiteralTransposition
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getLiteralsDivLiteralTranspositionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
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

                            // InternalDiv.g:1432:5: (otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==32) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalDiv.g:1433:6: otherlv_10= ',' ( (lv_literals_11_0= ruleDivLiteralTransposition ) )
                            	    {
                            	    otherlv_10=(Token)match(input,32,FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_10, grammarAccess.getDivEnumerationTranspositionAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDiv.g:1437:6: ( (lv_literals_11_0= ruleDivLiteralTransposition ) )
                            	    // InternalDiv.g:1438:7: (lv_literals_11_0= ruleDivLiteralTransposition )
                            	    {
                            	    // InternalDiv.g:1438:7: (lv_literals_11_0= ruleDivLiteralTransposition )
                            	    // InternalDiv.g:1439:8: lv_literals_11_0= ruleDivLiteralTransposition
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getLiteralsDivLiteralTranspositionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_23);
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
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalDiv.g:1458:4: (otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==30) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalDiv.g:1459:5: otherlv_12= 'add' ( (lv_constraints_13_0= ruleDConstraint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getDivEnumerationTranspositionAccess().getAddKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:1463:5: ( (lv_constraints_13_0= ruleDConstraint ) )
                    	    // InternalDiv.g:1464:6: (lv_constraints_13_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:1464:6: (lv_constraints_13_0= ruleDConstraint )
                    	    // InternalDiv.g:1465:7: lv_constraints_13_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDivEnumerationTranspositionAccess().getConstraintsDConstraintParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:1492:1: entryRuleDivLiteralTransposition returns [EObject current=null] : iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF ;
    public final EObject entryRuleDivLiteralTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivLiteralTransposition = null;


        try {
            // InternalDiv.g:1492:64: (iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF )
            // InternalDiv.g:1493:2: iv_ruleDivLiteralTransposition= ruleDivLiteralTransposition EOF
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
    // InternalDiv.g:1499:1: ruleDivLiteralTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivLiteralTransposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rule_2_0 = null;

        EObject lv_rule_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1505:2: ( ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:1506:2: ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:1506:2: ( () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:1507:3: () ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:1507:3: ()
            // InternalDiv.g:1508:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivLiteralTranspositionAccess().getTLiteralTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1514:3: ( (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) ) | (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            else if ( (LA29_0==29) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDiv.g:1515:4: (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalDiv.g:1515:4: (otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) ) )
                    // InternalDiv.g:1516:5: otherlv_1= 'grab' ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivLiteralTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1520:5: ( (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule ) )
                    // InternalDiv.g:1521:6: (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule )
                    {
                    // InternalDiv.g:1521:6: (lv_rule_2_0= ruleDivGrabEnumerationLiteralRule )
                    // InternalDiv.g:1522:7: lv_rule_2_0= ruleDivGrabEnumerationLiteralRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivLiteralTranspositionAccess().getRuleDivGrabEnumerationLiteralRuleParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
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
                    // InternalDiv.g:1541:4: (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalDiv.g:1541:4: (otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) ) )
                    // InternalDiv.g:1542:5: otherlv_3= 'ditch' ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDivLiteralTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1546:5: ( (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule ) )
                    // InternalDiv.g:1547:6: (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule )
                    {
                    // InternalDiv.g:1547:6: (lv_rule_4_0= ruleDivDitchEnumerationLiteralRule )
                    // InternalDiv.g:1548:7: lv_rule_4_0= ruleDivDitchEnumerationLiteralRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivLiteralTranspositionAccess().getRuleDivDitchEnumerationLiteralRuleParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalDiv.g:1567:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_PLAIN_TEXT_ONLY && LA30_0<=RULE_RICH_TEXT_START)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDiv.g:1568:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:1568:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:1569:5: lv_description_5_0= ruleDRichText
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
    // InternalDiv.g:1590:1: entryRuleDivEntityTypeTransposition returns [EObject current=null] : iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF ;
    public final EObject entryRuleDivEntityTypeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivEntityTypeTransposition = null;


        try {
            // InternalDiv.g:1590:67: (iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF )
            // InternalDiv.g:1591:2: iv_ruleDivEntityTypeTransposition= ruleDivEntityTypeTransposition EOF
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
    // InternalDiv.g:1597:1: ruleDivEntityTypeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) | (otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? (this_TComplexTypeFeatures_14= ruleTComplexTypeFeatures[$current] )? ) ;
    public final EObject ruleDivEntityTypeTransposition() throws RecognitionException {
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
        EObject lv_rule_4_0 = null;

        EObject lv_rule_8_0 = null;

        EObject lv_rule_12_0 = null;

        EObject lv_description_13_0 = null;

        EObject this_TComplexTypeFeatures_14 = null;



        	enterRule();

        try {
            // InternalDiv.g:1603:2: ( ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) | (otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? (this_TComplexTypeFeatures_14= ruleTComplexTypeFeatures[$current] )? ) )
            // InternalDiv.g:1604:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) | (otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? (this_TComplexTypeFeatures_14= ruleTComplexTypeFeatures[$current] )? )
            {
            // InternalDiv.g:1604:2: ( () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) | (otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? (this_TComplexTypeFeatures_14= ruleTComplexTypeFeatures[$current] )? )
            // InternalDiv.g:1605:3: () ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) | (otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? (this_TComplexTypeFeatures_14= ruleTComplexTypeFeatures[$current] )?
            {
            // InternalDiv.g:1605:3: ()
            // InternalDiv.g:1606:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivEntityTypeTranspositionAccess().getTEntityTypeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1612:3: ( (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) ) | (otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) ) ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt34=1;
                }
                break;
            case 29:
                {
                alt34=2;
                }
                break;
            case 35:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalDiv.g:1613:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1613:4: (otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) ) )
                    // InternalDiv.g:1614:5: otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivEntityTypeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:1618:5: ( (lv_root_2_0= 'root' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==33) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalDiv.g:1619:6: (lv_root_2_0= 'root' )
                            {
                            // InternalDiv.g:1619:6: (lv_root_2_0= 'root' )
                            // InternalDiv.g:1620:7: lv_root_2_0= 'root'
                            {
                            lv_root_2_0=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDivEntityTypeTranspositionAccess().getEntityKeyword_1_0_2());
                      				
                    }
                    // InternalDiv.g:1636:5: ( (lv_rule_4_0= ruleDivGrabComplexTypeRule ) )
                    // InternalDiv.g:1637:6: (lv_rule_4_0= ruleDivGrabComplexTypeRule )
                    {
                    // InternalDiv.g:1637:6: (lv_rule_4_0= ruleDivGrabComplexTypeRule )
                    // InternalDiv.g:1638:7: lv_rule_4_0= ruleDivGrabComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getRuleDivGrabComplexTypeRuleParserRuleCall_1_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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
                    // InternalDiv.g:1657:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1657:4: (otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) ) )
                    // InternalDiv.g:1658:5: otherlv_5= 'ditch' ( (lv_root_6_0= 'root' ) )? otherlv_7= 'entity' ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivEntityTypeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:1662:5: ( (lv_root_6_0= 'root' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalDiv.g:1663:6: (lv_root_6_0= 'root' )
                            {
                            // InternalDiv.g:1663:6: (lv_root_6_0= 'root' )
                            // InternalDiv.g:1664:7: lv_root_6_0= 'root'
                            {
                            lv_root_6_0=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getDivEntityTypeTranspositionAccess().getEntityKeyword_1_1_2());
                      				
                    }
                    // InternalDiv.g:1680:5: ( (lv_rule_8_0= ruleDivDitchComplexTypeRule ) )
                    // InternalDiv.g:1681:6: (lv_rule_8_0= ruleDivDitchComplexTypeRule )
                    {
                    // InternalDiv.g:1681:6: (lv_rule_8_0= ruleDivDitchComplexTypeRule )
                    // InternalDiv.g:1682:7: lv_rule_8_0= ruleDivDitchComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getRuleDivDitchComplexTypeRuleParserRuleCall_1_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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
                case 3 :
                    // InternalDiv.g:1701:4: (otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1701:4: (otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) ) )
                    // InternalDiv.g:1702:5: otherlv_9= 'motph' ( (lv_root_10_0= 'root' ) )? otherlv_11= 'entity' ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getDivEntityTypeTranspositionAccess().getMotphKeyword_1_2_0());
                      				
                    }
                    // InternalDiv.g:1706:5: ( (lv_root_10_0= 'root' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==33) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalDiv.g:1707:6: (lv_root_10_0= 'root' )
                            {
                            // InternalDiv.g:1707:6: (lv_root_10_0= 'root' )
                            // InternalDiv.g:1708:7: lv_root_10_0= 'root'
                            {
                            lv_root_10_0=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_root_10_0, grammarAccess.getDivEntityTypeTranspositionAccess().getRootRootKeyword_1_2_1_0());
                              						
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

                    otherlv_11=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getDivEntityTypeTranspositionAccess().getEntityKeyword_1_2_2());
                      				
                    }
                    // InternalDiv.g:1724:5: ( (lv_rule_12_0= ruleSimMorphComplexTypeRule ) )
                    // InternalDiv.g:1725:6: (lv_rule_12_0= ruleSimMorphComplexTypeRule )
                    {
                    // InternalDiv.g:1725:6: (lv_rule_12_0= ruleSimMorphComplexTypeRule )
                    // InternalDiv.g:1726:7: lv_rule_12_0= ruleSimMorphComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getRuleSimMorphComplexTypeRuleParserRuleCall_1_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
                    lv_rule_12_0=ruleSimMorphComplexTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivEntityTypeTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_12_0,
                      								"com.mimacom.ddd.dm.div.Div.SimMorphComplexTypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:1745:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_PLAIN_TEXT_ONLY && LA35_0<=RULE_RICH_TEXT_START)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDiv.g:1746:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalDiv.g:1746:4: (lv_description_13_0= ruleDRichText )
                    // InternalDiv.g:1747:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivEntityTypeTranspositionRule());
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

            // InternalDiv.g:1764:3: (this_TComplexTypeFeatures_14= ruleTComplexTypeFeatures[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDiv.g:1765:4: this_TComplexTypeFeatures_14= ruleTComplexTypeFeatures[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDivEntityTypeTranspositionRule());
                      				}
                      				newCompositeNode(grammarAccess.getDivEntityTypeTranspositionAccess().getTComplexTypeFeaturesParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TComplexTypeFeatures_14=ruleTComplexTypeFeatures(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TComplexTypeFeatures_14;
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
    // InternalDiv.g:1781:1: entryRuleDivDetailTypeTransposition returns [EObject current=null] : iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF ;
    public final EObject entryRuleDivDetailTypeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivDetailTypeTransposition = null;


        try {
            // InternalDiv.g:1781:67: (iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF )
            // InternalDiv.g:1782:2: iv_ruleDivDetailTypeTransposition= ruleDivDetailTypeTransposition EOF
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
    // InternalDiv.g:1788:1: ruleDivDetailTypeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? ) ;
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
            // InternalDiv.g:1794:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? ) )
            // InternalDiv.g:1795:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? )
            {
            // InternalDiv.g:1795:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )? )
            // InternalDiv.g:1796:3: () ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )?
            {
            // InternalDiv.g:1796:3: ()
            // InternalDiv.g:1797:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivDetailTypeTranspositionAccess().getTDetailTypeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:1803:3: ( (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            else if ( (LA37_0==29) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDiv.g:1804:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1804:4: (otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) ) )
                    // InternalDiv.g:1805:5: otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivDetailTypeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivDetailTypeTranspositionAccess().getDetailKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:1813:5: ( (lv_rule_3_0= ruleDivGrabComplexTypeRule ) )
                    // InternalDiv.g:1814:6: (lv_rule_3_0= ruleDivGrabComplexTypeRule )
                    {
                    // InternalDiv.g:1814:6: (lv_rule_3_0= ruleDivGrabComplexTypeRule )
                    // InternalDiv.g:1815:7: lv_rule_3_0= ruleDivGrabComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivDetailTypeTranspositionAccess().getRuleDivGrabComplexTypeRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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
                    // InternalDiv.g:1834:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) )
                    {
                    // InternalDiv.g:1834:4: (otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) ) )
                    // InternalDiv.g:1835:5: otherlv_4= 'ditch' otherlv_5= 'detail' ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivDetailTypeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivDetailTypeTranspositionAccess().getDetailKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:1843:5: ( (lv_rule_6_0= ruleDivDitchComplexTypeRule ) )
                    // InternalDiv.g:1844:6: (lv_rule_6_0= ruleDivDitchComplexTypeRule )
                    {
                    // InternalDiv.g:1844:6: (lv_rule_6_0= ruleDivDitchComplexTypeRule )
                    // InternalDiv.g:1845:7: lv_rule_6_0= ruleDivDitchComplexTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivDetailTypeTranspositionAccess().getRuleDivDitchComplexTypeRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
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

            // InternalDiv.g:1864:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_PLAIN_TEXT_ONLY && LA38_0<=RULE_RICH_TEXT_START)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDiv.g:1865:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:1865:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:1866:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivDetailTypeTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalDiv.g:1883:3: (this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDiv.g:1884:4: this_TComplexTypeFeatures_8= ruleTComplexTypeFeatures[$current]
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
    // InternalDiv.g:1901:1: ruleTComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:1907:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' ) )
            // InternalDiv.g:1908:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' )
            {
            // InternalDiv.g:1908:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}' )
            // InternalDiv.g:1909:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalDiv.g:1913:3: ( ( (lv_features_1_0= ruleDivFeature ) ) | (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) ) )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==26||LA40_0==29||LA40_0==39) ) {
                    alt40=1;
                }
                else if ( (LA40_0==30) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDiv.g:1914:4: ( (lv_features_1_0= ruleDivFeature ) )
            	    {
            	    // InternalDiv.g:1914:4: ( (lv_features_1_0= ruleDivFeature ) )
            	    // InternalDiv.g:1915:5: (lv_features_1_0= ruleDivFeature )
            	    {
            	    // InternalDiv.g:1915:5: (lv_features_1_0= ruleDivFeature )
            	    // InternalDiv.g:1916:6: lv_features_1_0= ruleDivFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTComplexTypeFeaturesAccess().getFeaturesDivFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDiv.g:1934:4: (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) )
            	    {
            	    // InternalDiv.g:1934:4: (otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) ) )
            	    // InternalDiv.g:1935:5: otherlv_2= 'add' ( (lv_constraints_3_0= ruleDConstraint ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getTComplexTypeFeaturesAccess().getAddKeyword_1_1_0());
            	      				
            	    }
            	    // InternalDiv.g:1939:5: ( (lv_constraints_3_0= ruleDConstraint ) )
            	    // InternalDiv.g:1940:6: (lv_constraints_3_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:1940:6: (lv_constraints_3_0= ruleDConstraint )
            	    // InternalDiv.g:1941:7: lv_constraints_3_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTComplexTypeFeaturesAccess().getConstraintsDConstraintParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:1968:1: entryRuleDivFeature returns [EObject current=null] : iv_ruleDivFeature= ruleDivFeature EOF ;
    public final EObject entryRuleDivFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivFeature = null;


        try {
            // InternalDiv.g:1968:51: (iv_ruleDivFeature= ruleDivFeature EOF )
            // InternalDiv.g:1969:2: iv_ruleDivFeature= ruleDivFeature EOF
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
    // InternalDiv.g:1975:1: ruleDivFeature returns [EObject current=null] : (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition ) ;
    public final EObject ruleDivFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DivAssociationTransposition_0 = null;

        EObject this_DivAttributeTransposition_1 = null;

        EObject this_DivQueryTransposition_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:1981:2: ( (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition ) )
            // InternalDiv.g:1982:2: (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition )
            {
            // InternalDiv.g:1982:2: (this_DivAssociationTransposition_0= ruleDivAssociationTransposition | this_DivAttributeTransposition_1= ruleDivAttributeTransposition | this_DivQueryTransposition_2= ruleDivQueryTransposition )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                switch ( input.LA(2) ) {
                case 37:
                case 38:
                    {
                    alt41=1;
                    }
                    break;
                case RULE_ID:
                case 36:
                case 40:
                    {
                    alt41=2;
                    }
                    break;
                case 41:
                    {
                    alt41=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt41=3;
                    }
                    break;
                case 37:
                case 38:
                    {
                    alt41=1;
                    }
                    break;
                case RULE_ID:
                case 36:
                case 40:
                    {
                    alt41=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                int LA41_3 = input.LA(2);

                if ( ((LA41_3>=37 && LA41_3<=38)) ) {
                    alt41=1;
                }
                else if ( (LA41_3==RULE_ID||LA41_3==36||LA41_3==40) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalDiv.g:1983:3: this_DivAssociationTransposition_0= ruleDivAssociationTransposition
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
                    // InternalDiv.g:1992:3: this_DivAttributeTransposition_1= ruleDivAttributeTransposition
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
                    // InternalDiv.g:2001:3: this_DivQueryTransposition_2= ruleDivQueryTransposition
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
    // InternalDiv.g:2013:1: entryRuleDivAssociationTransposition returns [EObject current=null] : iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF ;
    public final EObject entryRuleDivAssociationTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAssociationTransposition = null;


        try {
            // InternalDiv.g:2013:68: (iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF )
            // InternalDiv.g:2014:2: iv_ruleDivAssociationTransposition= ruleDivAssociationTransposition EOF
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
    // InternalDiv.g:2020:1: ruleDivAssociationTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivAssociationTransposition() throws RecognitionException {
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
        EObject lv_rule_4_0 = null;

        EObject lv_rule_8_0 = null;

        EObject lv_rule_12_0 = null;

        EObject lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:2026:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2027:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2027:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalDiv.g:2028:3: () ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalDiv.g:2028:3: ()
            // InternalDiv.g:2029:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivAssociationTranspositionAccess().getTAssociationTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2035:3: ( (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt45=1;
                }
                break;
            case 29:
                {
                alt45=2;
                }
                break;
            case 39:
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
                    // InternalDiv.g:2036:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    {
                    // InternalDiv.g:2036:4: (otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:2037:5: otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivAssociationTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:2041:5: (otherlv_2= 'reference' | otherlv_3= 'composite' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==37) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==38) ) {
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
                            // InternalDiv.g:2042:6: otherlv_2= 'reference'
                            {
                            otherlv_2=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getDivAssociationTranspositionAccess().getReferenceKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2047:6: otherlv_3= 'composite'
                            {
                            otherlv_3=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getDivAssociationTranspositionAccess().getCompositeKeyword_1_0_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:2052:5: ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:2053:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:2053:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:2054:7: lv_rule_4_0= ruleDivGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAssociationTranspositionAccess().getRuleDivGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
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
                    // InternalDiv.g:2073:4: (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:2073:4: (otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:2074:5: otherlv_5= 'ditch' (otherlv_6= 'reference' | otherlv_7= 'composite' ) ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivAssociationTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:2078:5: (otherlv_6= 'reference' | otherlv_7= 'composite' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==37) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==38) ) {
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
                            // InternalDiv.g:2079:6: otherlv_6= 'reference'
                            {
                            otherlv_6=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getDivAssociationTranspositionAccess().getReferenceKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2084:6: otherlv_7= 'composite'
                            {
                            otherlv_7=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getDivAssociationTranspositionAccess().getCompositeKeyword_1_1_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:2089:5: ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:2090:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:2090:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:2091:7: lv_rule_8_0= ruleDivDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAssociationTranspositionAccess().getRuleDivDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
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
                case 3 :
                    // InternalDiv.g:2110:4: (otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) )
                    {
                    // InternalDiv.g:2110:4: (otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) )
                    // InternalDiv.g:2111:5: otherlv_9= 'morph' (otherlv_10= 'reference' | otherlv_11= 'composite' ) ( (lv_rule_12_0= ruleDivMorphFeatureRule ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getDivAssociationTranspositionAccess().getMorphKeyword_1_2_0());
                      				
                    }
                    // InternalDiv.g:2115:5: (otherlv_10= 'reference' | otherlv_11= 'composite' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==37) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==38) ) {
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
                            // InternalDiv.g:2116:6: otherlv_10= 'reference'
                            {
                            otherlv_10=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getDivAssociationTranspositionAccess().getReferenceKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2121:6: otherlv_11= 'composite'
                            {
                            otherlv_11=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_11, grammarAccess.getDivAssociationTranspositionAccess().getCompositeKeyword_1_2_1_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:2126:5: ( (lv_rule_12_0= ruleDivMorphFeatureRule ) )
                    // InternalDiv.g:2127:6: (lv_rule_12_0= ruleDivMorphFeatureRule )
                    {
                    // InternalDiv.g:2127:6: (lv_rule_12_0= ruleDivMorphFeatureRule )
                    // InternalDiv.g:2128:7: lv_rule_12_0= ruleDivMorphFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAssociationTranspositionAccess().getRuleDivMorphFeatureRuleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
                    lv_rule_12_0=ruleDivMorphFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivAssociationTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_12_0,
                      								"com.mimacom.ddd.dm.div.Div.DivMorphFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:2147:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_PLAIN_TEXT_ONLY && LA46_0<=RULE_RICH_TEXT_START)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDiv.g:2148:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalDiv.g:2148:4: (lv_description_13_0= ruleDRichText )
                    // InternalDiv.g:2149:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivAssociationTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivAssociationTranspositionRule());
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
    // $ANTLR end "ruleDivAssociationTransposition"


    // $ANTLR start "entryRuleDivAttributeTransposition"
    // InternalDiv.g:2170:1: entryRuleDivAttributeTransposition returns [EObject current=null] : iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF ;
    public final EObject entryRuleDivAttributeTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivAttributeTransposition = null;


        try {
            // InternalDiv.g:2170:66: (iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF )
            // InternalDiv.g:2171:2: iv_ruleDivAttributeTransposition= ruleDivAttributeTransposition EOF
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
    // InternalDiv.g:2177:1: ruleDivAttributeTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) ;
    public final EObject ruleDivAttributeTransposition() throws RecognitionException {
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
        EObject lv_rule_4_0 = null;

        EObject lv_rule_8_0 = null;

        EObject lv_rule_12_0 = null;

        EObject lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:2183:2: ( ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2184:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2184:2: ( () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalDiv.g:2185:3: () ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) ) ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalDiv.g:2185:3: ()
            // InternalDiv.g:2186:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivAttributeTranspositionAccess().getTAttributeTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2192:3: ( (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) ) | (otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt50=1;
                }
                break;
            case 29:
                {
                alt50=2;
                }
                break;
            case 39:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDiv.g:2193:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    {
                    // InternalDiv.g:2193:4: (otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:2194:5: otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivAttributeTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    // InternalDiv.g:2198:5: (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )?
                    int alt47=3;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==40) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==36) ) {
                        alt47=2;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalDiv.g:2199:6: otherlv_2= 'attribute'
                            {
                            otherlv_2=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getDivAttributeTranspositionAccess().getAttributeKeyword_1_0_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2204:6: ( (lv_detail_3_0= 'detail' ) )
                            {
                            // InternalDiv.g:2204:6: ( (lv_detail_3_0= 'detail' ) )
                            // InternalDiv.g:2205:7: (lv_detail_3_0= 'detail' )
                            {
                            // InternalDiv.g:2205:7: (lv_detail_3_0= 'detail' )
                            // InternalDiv.g:2206:8: lv_detail_3_0= 'detail'
                            {
                            lv_detail_3_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
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

                    // InternalDiv.g:2219:5: ( (lv_rule_4_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:2220:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:2220:6: (lv_rule_4_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:2221:7: lv_rule_4_0= ruleDivGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAttributeTranspositionAccess().getRuleDivGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
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
                    // InternalDiv.g:2240:4: (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:2240:4: (otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:2241:5: otherlv_5= 'ditch' (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )? ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivAttributeTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    // InternalDiv.g:2245:5: (otherlv_6= 'attribute' | ( (lv_detail_7_0= 'detail' ) ) )?
                    int alt48=3;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==40) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==36) ) {
                        alt48=2;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalDiv.g:2246:6: otherlv_6= 'attribute'
                            {
                            otherlv_6=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getDivAttributeTranspositionAccess().getAttributeKeyword_1_1_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2251:6: ( (lv_detail_7_0= 'detail' ) )
                            {
                            // InternalDiv.g:2251:6: ( (lv_detail_7_0= 'detail' ) )
                            // InternalDiv.g:2252:7: (lv_detail_7_0= 'detail' )
                            {
                            // InternalDiv.g:2252:7: (lv_detail_7_0= 'detail' )
                            // InternalDiv.g:2253:8: lv_detail_7_0= 'detail'
                            {
                            lv_detail_7_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
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

                    // InternalDiv.g:2266:5: ( (lv_rule_8_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:2267:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:2267:6: (lv_rule_8_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:2268:7: lv_rule_8_0= ruleDivDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAttributeTranspositionAccess().getRuleDivDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
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
                case 3 :
                    // InternalDiv.g:2287:4: (otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) )
                    {
                    // InternalDiv.g:2287:4: (otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) ) )
                    // InternalDiv.g:2288:5: otherlv_9= 'morph' (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )? ( (lv_rule_12_0= ruleDivMorphFeatureRule ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getDivAttributeTranspositionAccess().getMorphKeyword_1_2_0());
                      				
                    }
                    // InternalDiv.g:2292:5: (otherlv_10= 'attribute' | ( (lv_detail_11_0= 'detail' ) ) )?
                    int alt49=3;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==40) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==36) ) {
                        alt49=2;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalDiv.g:2293:6: otherlv_10= 'attribute'
                            {
                            otherlv_10=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getDivAttributeTranspositionAccess().getAttributeKeyword_1_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:2298:6: ( (lv_detail_11_0= 'detail' ) )
                            {
                            // InternalDiv.g:2298:6: ( (lv_detail_11_0= 'detail' ) )
                            // InternalDiv.g:2299:7: (lv_detail_11_0= 'detail' )
                            {
                            // InternalDiv.g:2299:7: (lv_detail_11_0= 'detail' )
                            // InternalDiv.g:2300:8: lv_detail_11_0= 'detail'
                            {
                            lv_detail_11_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_detail_11_0, grammarAccess.getDivAttributeTranspositionAccess().getDetailDetailKeyword_1_2_1_1_0());
                              							
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

                    // InternalDiv.g:2313:5: ( (lv_rule_12_0= ruleDivMorphFeatureRule ) )
                    // InternalDiv.g:2314:6: (lv_rule_12_0= ruleDivMorphFeatureRule )
                    {
                    // InternalDiv.g:2314:6: (lv_rule_12_0= ruleDivMorphFeatureRule )
                    // InternalDiv.g:2315:7: lv_rule_12_0= ruleDivMorphFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivAttributeTranspositionAccess().getRuleDivMorphFeatureRuleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
                    lv_rule_12_0=ruleDivMorphFeatureRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDivAttributeTranspositionRule());
                      							}
                      							set(
                      								current,
                      								"rule",
                      								lv_rule_12_0,
                      								"com.mimacom.ddd.dm.div.Div.DivMorphFeatureRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:2334:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_PLAIN_TEXT_ONLY && LA51_0<=RULE_RICH_TEXT_START)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDiv.g:2335:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalDiv.g:2335:4: (lv_description_13_0= ruleDRichText )
                    // InternalDiv.g:2336:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDivAttributeTranspositionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDivAttributeTranspositionRule());
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
    // $ANTLR end "ruleDivAttributeTransposition"


    // $ANTLR start "entryRuleDivQueryTransposition"
    // InternalDiv.g:2357:1: entryRuleDivQueryTransposition returns [EObject current=null] : iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF ;
    public final EObject entryRuleDivQueryTransposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivQueryTransposition = null;


        try {
            // InternalDiv.g:2357:62: (iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF )
            // InternalDiv.g:2358:2: iv_ruleDivQueryTransposition= ruleDivQueryTransposition EOF
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
    // InternalDiv.g:2364:1: ruleDivQueryTransposition returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:2370:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2371:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2371:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            // InternalDiv.g:2372:3: () ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) ) ( (lv_description_7_0= ruleDRichText ) )?
            {
            // InternalDiv.g:2372:3: ()
            // InternalDiv.g:2373:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDivQueryTranspositionAccess().getTQueryTranspositionAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:2379:3: ( (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) ) | (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            else if ( (LA52_0==29) ) {
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
                    // InternalDiv.g:2380:4: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) )
                    {
                    // InternalDiv.g:2380:4: (otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) ) )
                    // InternalDiv.g:2381:5: otherlv_1= 'grab' otherlv_2= 'query' ( (lv_rule_3_0= ruleDivGrabFeatureRule ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDivQueryTranspositionAccess().getGrabKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDivQueryTranspositionAccess().getQueryKeyword_1_0_1());
                      				
                    }
                    // InternalDiv.g:2389:5: ( (lv_rule_3_0= ruleDivGrabFeatureRule ) )
                    // InternalDiv.g:2390:6: (lv_rule_3_0= ruleDivGrabFeatureRule )
                    {
                    // InternalDiv.g:2390:6: (lv_rule_3_0= ruleDivGrabFeatureRule )
                    // InternalDiv.g:2391:7: lv_rule_3_0= ruleDivGrabFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getRuleDivGrabFeatureRuleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
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
                    // InternalDiv.g:2410:4: (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) )
                    {
                    // InternalDiv.g:2410:4: (otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) ) )
                    // InternalDiv.g:2411:5: otherlv_4= 'ditch' otherlv_5= 'query' ( (lv_rule_6_0= ruleDivDitchFeatureRule ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDivQueryTranspositionAccess().getDitchKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDivQueryTranspositionAccess().getQueryKeyword_1_1_1());
                      				
                    }
                    // InternalDiv.g:2419:5: ( (lv_rule_6_0= ruleDivDitchFeatureRule ) )
                    // InternalDiv.g:2420:6: (lv_rule_6_0= ruleDivDitchFeatureRule )
                    {
                    // InternalDiv.g:2420:6: (lv_rule_6_0= ruleDivDitchFeatureRule )
                    // InternalDiv.g:2421:7: lv_rule_6_0= ruleDivDitchFeatureRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivQueryTranspositionAccess().getRuleDivDitchFeatureRuleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalDiv.g:2440:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_PLAIN_TEXT_ONLY && LA53_0<=RULE_RICH_TEXT_START)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDiv.g:2441:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:2441:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:2442:5: lv_description_7_0= ruleDRichText
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
    // InternalDiv.g:2463:1: entryRuleDimAggregate returns [EObject current=null] : iv_ruleDimAggregate= ruleDimAggregate EOF ;
    public final EObject entryRuleDimAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAggregate = null;


        try {
            // InternalDiv.g:2463:53: (iv_ruleDimAggregate= ruleDimAggregate EOF )
            // InternalDiv.g:2464:2: iv_ruleDimAggregate= ruleDimAggregate EOF
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
    // InternalDiv.g:2470:1: ruleDimAggregate returns [EObject current=null] : ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' ) ;
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
            // InternalDiv.g:2476:2: ( ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' ) )
            // InternalDiv.g:2477:2: ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' )
            {
            // InternalDiv.g:2477:2: ( ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}' )
            // InternalDiv.g:2478:3: ruleDAggregateKeyword () ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )* ( (lv_types_7_0= ruleDimType ) )* otherlv_8= '}'
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
            // InternalDiv.g:2485:3: ()
            // InternalDiv.g:2486:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAggregateAccess().getDimAggregateAction_1(),
              					current);
              			
            }

            }

            // InternalDiv.g:2492:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2493:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2493:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2494:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            // InternalDiv.g:2510:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_PLAIN_TEXT_ONLY && LA54_0<=RULE_RICH_TEXT_START)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDiv.g:2511:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDiv.g:2511:4: (lv_description_3_0= ruleDRichText )
                    // InternalDiv.g:2512:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAggregateAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,22,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimAggregateAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDiv.g:2533:3: (otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==41) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalDiv.g:2534:4: otherlv_5= 'query' ( (lv_features_6_0= ruleDimQuery ) )
            	    {
            	    otherlv_5=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDimAggregateAccess().getQueryKeyword_5_0());
            	      			
            	    }
            	    // InternalDiv.g:2538:4: ( (lv_features_6_0= ruleDimQuery ) )
            	    // InternalDiv.g:2539:5: (lv_features_6_0= ruleDimQuery )
            	    {
            	    // InternalDiv.g:2539:5: (lv_features_6_0= ruleDimQuery )
            	    // InternalDiv.g:2540:6: lv_features_6_0= ruleDimQuery
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimAggregateAccess().getFeaturesDimQueryParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop55;
                }
            } while (true);

            // InternalDiv.g:2558:3: ( (lv_types_7_0= ruleDimType ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==28||LA56_0==31||LA56_0==34||LA56_0==36||(LA56_0>=47 && LA56_0<=48)||(LA56_0>=95 && LA56_0<=96)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalDiv.g:2559:4: (lv_types_7_0= ruleDimType )
            	    {
            	    // InternalDiv.g:2559:4: (lv_types_7_0= ruleDimType )
            	    // InternalDiv.g:2560:5: lv_types_7_0= ruleDimType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimAggregateAccess().getTypesDimTypeParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    break loop56;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:2585:1: entryRuleDAggregateKeyword returns [String current=null] : iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF ;
    public final String entryRuleDAggregateKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDAggregateKeyword = null;


        try {
            // InternalDiv.g:2585:57: (iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF )
            // InternalDiv.g:2586:2: iv_ruleDAggregateKeyword= ruleDAggregateKeyword EOF
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
    // InternalDiv.g:2592:1: ruleDAggregateKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'component' ;
    public final AntlrDatatypeRuleToken ruleDAggregateKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:2598:2: (kw= 'component' )
            // InternalDiv.g:2599:2: kw= 'component'
            {
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:2607:1: entryRuleDimType returns [EObject current=null] : iv_ruleDimType= ruleDimType EOF ;
    public final EObject entryRuleDimType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimType = null;


        try {
            // InternalDiv.g:2607:48: (iv_ruleDimType= ruleDimType EOF )
            // InternalDiv.g:2608:2: iv_ruleDimType= ruleDimType EOF
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
    // InternalDiv.g:2614:1: ruleDimType returns [EObject current=null] : (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType ) ;
    public final EObject ruleDimType() throws RecognitionException {
        EObject current = null;

        EObject this_DimPrimitive_0 = null;

        EObject this_DimEnumeration_1 = null;

        EObject this_DimEntityType_2 = null;

        EObject this_DimDetailType_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:2620:2: ( (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType ) )
            // InternalDiv.g:2621:2: (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType )
            {
            // InternalDiv.g:2621:2: (this_DimPrimitive_0= ruleDimPrimitive | this_DimEnumeration_1= ruleDimEnumeration | this_DimEntityType_2= ruleDimEntityType | this_DimDetailType_3= ruleDimDetailType )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt57=1;
                }
                break;
            case 31:
                {
                alt57=2;
                }
                break;
            case 47:
                {
                int LA57_3 = input.LA(2);

                if ( (LA57_3==36) ) {
                    alt57=4;
                }
                else if ( (LA57_3==34||LA57_3==48||(LA57_3>=95 && LA57_3<=96)) ) {
                    alt57=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
            case 48:
            case 95:
            case 96:
                {
                alt57=3;
                }
                break;
            case 36:
                {
                alt57=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalDiv.g:2622:3: this_DimPrimitive_0= ruleDimPrimitive
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
                    // InternalDiv.g:2631:3: this_DimEnumeration_1= ruleDimEnumeration
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
                    // InternalDiv.g:2640:3: this_DimEntityType_2= ruleDimEntityType
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
                    // InternalDiv.g:2649:3: this_DimDetailType_3= ruleDimDetailType
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
    // InternalDiv.g:2661:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalDiv.g:2661:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalDiv.g:2662:2: iv_ruleDConstraint= ruleDConstraint EOF
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
    // InternalDiv.g:2668:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:2674:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDiv.g:2675:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:2675:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDiv.g:2676:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_predicate_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalDiv.g:2680:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:2681:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:2681:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:2682:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            // InternalDiv.g:2698:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==44) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDiv.g:2699:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:2703:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:2704:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2704:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:2705:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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
            	    break loop58;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalDiv.g:2726:3: ( (lv_predicate_5_0= ruleDExpression ) )
            // InternalDiv.g:2727:4: (lv_predicate_5_0= ruleDExpression )
            {
            // InternalDiv.g:2727:4: (lv_predicate_5_0= ruleDExpression )
            // InternalDiv.g:2728:5: lv_predicate_5_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getPredicateDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalDiv.g:2745:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_PLAIN_TEXT_ONLY && LA59_0<=RULE_RICH_TEXT_START)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDiv.g:2746:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDiv.g:2746:4: (lv_description_6_0= ruleDRichText )
                    // InternalDiv.g:2747:5: lv_description_6_0= ruleDRichText
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
    // InternalDiv.g:2768:1: entryRuleDimPrimitive returns [EObject current=null] : iv_ruleDimPrimitive= ruleDimPrimitive EOF ;
    public final EObject entryRuleDimPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimPrimitive = null;


        try {
            // InternalDiv.g:2768:53: (iv_ruleDimPrimitive= ruleDimPrimitive EOF )
            // InternalDiv.g:2769:2: iv_ruleDimPrimitive= ruleDimPrimitive EOF
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
    // InternalDiv.g:2775:1: ruleDimPrimitive returns [EObject current=null] : ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? ) ;
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
            // InternalDiv.g:2781:2: ( ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? ) )
            // InternalDiv.g:2782:2: ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? )
            {
            // InternalDiv.g:2782:2: ( () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )? )
            // InternalDiv.g:2783:3: () otherlv_1= 'primitive' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= 'redefines' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )?
            {
            // InternalDiv.g:2783:3: ()
            // InternalDiv.g:2784:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimPrimitiveAccess().getDimPrimitiveAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDimPrimitiveAccess().getPrimitiveKeyword_1());
              		
            }
            // InternalDiv.g:2794:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2795:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2795:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2796:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            // InternalDiv.g:2812:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==44) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalDiv.g:2813:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimPrimitiveAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:2817:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:2818:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2818:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:2819:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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
            	    break loop60;
                }
            } while (true);

            otherlv_5=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDimPrimitiveAccess().getRedefinesKeyword_4());
              		
            }
            // InternalDiv.g:2840:3: ( (otherlv_6= RULE_ID ) )
            // InternalDiv.g:2841:4: (otherlv_6= RULE_ID )
            {
            // InternalDiv.g:2841:4: (otherlv_6= RULE_ID )
            // InternalDiv.g:2842:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDimPrimitiveRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getDimPrimitiveAccess().getRedefinesDmxArchetypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalDiv.g:2853:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_PLAIN_TEXT_ONLY && LA61_0<=RULE_RICH_TEXT_START)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalDiv.g:2854:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDiv.g:2854:4: (lv_description_7_0= ruleDRichText )
                    // InternalDiv.g:2855:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimPrimitiveAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalDiv.g:2872:3: (otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==22) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDiv.g:2873:4: otherlv_8= '{' ( (lv_constraints_9_0= ruleDConstraint ) )+ otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDimPrimitiveAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    // InternalDiv.g:2877:4: ( (lv_constraints_9_0= ruleDConstraint ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==43) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalDiv.g:2878:5: (lv_constraints_9_0= ruleDConstraint )
                    	    {
                    	    // InternalDiv.g:2878:5: (lv_constraints_9_0= ruleDConstraint )
                    	    // InternalDiv.g:2879:6: lv_constraints_9_0= ruleDConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDimPrimitiveAccess().getConstraintsDConstraintParserRuleCall_7_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_38);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    otherlv_10=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:2905:1: entryRuleDimEnumeration returns [EObject current=null] : iv_ruleDimEnumeration= ruleDimEnumeration EOF ;
    public final EObject entryRuleDimEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimEnumeration = null;


        try {
            // InternalDiv.g:2905:55: (iv_ruleDimEnumeration= ruleDimEnumeration EOF )
            // InternalDiv.g:2906:2: iv_ruleDimEnumeration= ruleDimEnumeration EOF
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
    // InternalDiv.g:2912:1: ruleDimEnumeration returns [EObject current=null] : ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' ) ;
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
            // InternalDiv.g:2918:2: ( ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' ) )
            // InternalDiv.g:2919:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' )
            {
            // InternalDiv.g:2919:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}' )
            // InternalDiv.g:2920:3: () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )? ( (lv_constraints_10_0= ruleDConstraint ) )* otherlv_11= '}'
            {
            // InternalDiv.g:2920:3: ()
            // InternalDiv.g:2921:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimEnumerationAccess().getDimEnumerationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDimEnumerationAccess().getEnumerationKeyword_1());
              		
            }
            // InternalDiv.g:2931:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:2932:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:2932:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:2933:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
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

            // InternalDiv.g:2949:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==44) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalDiv.g:2950:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimEnumerationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:2954:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:2955:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:2955:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:2956:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
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
            	    break loop64;
                }
            } while (true);

            // InternalDiv.g:2973:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_PLAIN_TEXT_ONLY && LA65_0<=RULE_RICH_TEXT_START)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDiv.g:2974:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:2974:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:2975:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimEnumerationAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
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

            otherlv_6=(Token)match(input,22,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDimEnumerationAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDiv.g:2996:3: ( ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDiv.g:2997:4: ( (lv_literals_7_0= ruleDimLiteral ) ) (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )*
                    {
                    // InternalDiv.g:2997:4: ( (lv_literals_7_0= ruleDimLiteral ) )
                    // InternalDiv.g:2998:5: (lv_literals_7_0= ruleDimLiteral )
                    {
                    // InternalDiv.g:2998:5: (lv_literals_7_0= ruleDimLiteral )
                    // InternalDiv.g:2999:6: lv_literals_7_0= ruleDimLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEnumerationAccess().getLiteralsDimLiteralParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
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

                    // InternalDiv.g:3016:4: (otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==32) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalDiv.g:3017:5: otherlv_8= ',' ( (lv_literals_9_0= ruleDimLiteral ) )
                    	    {
                    	    otherlv_8=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getDimEnumerationAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:3021:5: ( (lv_literals_9_0= ruleDimLiteral ) )
                    	    // InternalDiv.g:3022:6: (lv_literals_9_0= ruleDimLiteral )
                    	    {
                    	    // InternalDiv.g:3022:6: (lv_literals_9_0= ruleDimLiteral )
                    	    // InternalDiv.g:3023:7: lv_literals_9_0= ruleDimLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimEnumerationAccess().getLiteralsDimLiteralParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDiv.g:3042:3: ( (lv_constraints_10_0= ruleDConstraint ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==43) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalDiv.g:3043:4: (lv_constraints_10_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:3043:4: (lv_constraints_10_0= ruleDConstraint )
            	    // InternalDiv.g:3044:5: lv_constraints_10_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDimEnumerationAccess().getConstraintsDConstraintParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop68;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:3069:1: entryRuleDimLiteral returns [EObject current=null] : iv_ruleDimLiteral= ruleDimLiteral EOF ;
    public final EObject entryRuleDimLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimLiteral = null;


        try {
            // InternalDiv.g:3069:51: (iv_ruleDimLiteral= ruleDimLiteral EOF )
            // InternalDiv.g:3070:2: iv_ruleDimLiteral= ruleDimLiteral EOF
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
    // InternalDiv.g:3076:1: ruleDimLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:3082:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3083:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3083:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDiv.g:3084:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3084:3: ()
            // InternalDiv.g:3085:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimLiteralAccess().getDimLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3091:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:3092:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:3092:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:3093:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
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

            // InternalDiv.g:3109:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==44) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalDiv.g:3110:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDimLiteralAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:3114:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:3115:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3115:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:3116:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
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
            	    break loop69;
                }
            } while (true);

            // InternalDiv.g:3133:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_PLAIN_TEXT_ONLY && LA70_0<=RULE_RICH_TEXT_START)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDiv.g:3134:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:3134:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:3135:5: lv_description_4_0= ruleDRichText
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
    // InternalDiv.g:3156:1: entryRuleDimEntityType returns [EObject current=null] : iv_ruleDimEntityType= ruleDimEntityType EOF ;
    public final EObject entryRuleDimEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimEntityType = null;


        try {
            // InternalDiv.g:3156:54: (iv_ruleDimEntityType= ruleDimEntityType EOF )
            // InternalDiv.g:3157:2: iv_ruleDimEntityType= ruleDimEntityType EOF
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
    // InternalDiv.g:3163:1: ruleDimEntityType returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' ) ;
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
            // InternalDiv.g:3169:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' ) )
            // InternalDiv.g:3170:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' )
            {
            // InternalDiv.g:3170:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}' )
            // InternalDiv.g:3171:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_root_2_0= 'main' ) )? (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) ) this_DimComplexType_7= ruleDimComplexType[$current] otherlv_8= '{' (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )? ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )* otherlv_23= '}'
            {
            // InternalDiv.g:3171:3: ()
            // InternalDiv.g:3172:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimEntityTypeAccess().getDimEntityTypeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3178:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==47) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDiv.g:3179:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalDiv.g:3179:4: (lv_abstract_1_0= 'abstract' )
                    // InternalDiv.g:3180:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,47,FOLLOW_43); if (state.failed) return current;
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

            // InternalDiv.g:3192:3: ( (lv_root_2_0= 'main' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==48) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDiv.g:3193:4: (lv_root_2_0= 'main' )
                    {
                    // InternalDiv.g:3193:4: (lv_root_2_0= 'main' )
                    // InternalDiv.g:3194:5: lv_root_2_0= 'main'
                    {
                    lv_root_2_0=(Token)match(input,48,FOLLOW_43); if (state.failed) return current;
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

            // InternalDiv.g:3206:3: (otherlv_3= 'entity' | ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' ) | ( (lv_nature_6_0= ruleDEntityNatureRelationship ) ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt73=1;
                }
                break;
            case 95:
                {
                alt73=2;
                }
                break;
            case 96:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalDiv.g:3207:4: otherlv_3= 'entity'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimEntityTypeAccess().getEntityKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:3212:4: ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' )
                    {
                    // InternalDiv.g:3212:4: ( ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity' )
                    // InternalDiv.g:3213:5: ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) ) otherlv_5= 'entity'
                    {
                    // InternalDiv.g:3213:5: ( (lv_nature_4_0= ruleDEntityNatureAutonomous ) )
                    // InternalDiv.g:3214:6: (lv_nature_4_0= ruleDEntityNatureAutonomous )
                    {
                    // InternalDiv.g:3214:6: (lv_nature_4_0= ruleDEntityNatureAutonomous )
                    // InternalDiv.g:3215:7: lv_nature_4_0= ruleDEntityNatureAutonomous
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

                    otherlv_5=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDimEntityTypeAccess().getEntityKeyword_3_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:3238:4: ( (lv_nature_6_0= ruleDEntityNatureRelationship ) )
                    {
                    // InternalDiv.g:3238:4: ( (lv_nature_6_0= ruleDEntityNatureRelationship ) )
                    // InternalDiv.g:3239:5: (lv_nature_6_0= ruleDEntityNatureRelationship )
                    {
                    // InternalDiv.g:3239:5: (lv_nature_6_0= ruleDEntityNatureRelationship )
                    // InternalDiv.g:3240:6: lv_nature_6_0= ruleDEntityNatureRelationship
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
            pushFollow(FOLLOW_9);
            this_DimComplexType_7=ruleDimComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DimComplexType_7;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,22,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDiv.g:3273:3: (otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )? )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==49) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDiv.g:3274:4: otherlv_9= 'states' otherlv_10= '{' ( (lv_states_11_0= ruleDState ) ) (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )* otherlv_14= '}' (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )?
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDimEntityTypeAccess().getStatesKeyword_6_0());
                      			
                    }
                    otherlv_10=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalDiv.g:3282:4: ( (lv_states_11_0= ruleDState ) )
                    // InternalDiv.g:3283:5: (lv_states_11_0= ruleDState )
                    {
                    // InternalDiv.g:3283:5: (lv_states_11_0= ruleDState )
                    // InternalDiv.g:3284:6: lv_states_11_0= ruleDState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getStatesDStateParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalDiv.g:3301:4: (otherlv_12= ',' ( (lv_states_13_0= ruleDState ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==32) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalDiv.g:3302:5: otherlv_12= ',' ( (lv_states_13_0= ruleDState ) )
                    	    {
                    	    otherlv_12=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getDimEntityTypeAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:3306:5: ( (lv_states_13_0= ruleDState ) )
                    	    // InternalDiv.g:3307:6: (lv_states_13_0= ruleDState )
                    	    {
                    	    // InternalDiv.g:3307:6: (lv_states_13_0= ruleDState )
                    	    // InternalDiv.g:3308:7: lv_states_13_0= ruleDState
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getStatesDStateParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,23,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_6_4());
                      			
                    }
                    // InternalDiv.g:3330:4: (otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==50) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalDiv.g:3331:5: otherlv_15= 'events' otherlv_16= '{' ( (lv_events_17_0= ruleDStateEvent ) ) (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )* otherlv_20= '}'
                            {
                            otherlv_15=(Token)match(input,50,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getDimEntityTypeAccess().getEventsKeyword_6_5_0());
                              				
                            }
                            otherlv_16=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getDimEntityTypeAccess().getLeftCurlyBracketKeyword_6_5_1());
                              				
                            }
                            // InternalDiv.g:3339:5: ( (lv_events_17_0= ruleDStateEvent ) )
                            // InternalDiv.g:3340:6: (lv_events_17_0= ruleDStateEvent )
                            {
                            // InternalDiv.g:3340:6: (lv_events_17_0= ruleDStateEvent )
                            // InternalDiv.g:3341:7: lv_events_17_0= ruleDStateEvent
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDimEntityTypeAccess().getEventsDStateEventParserRuleCall_6_5_2_0());
                              						
                            }
                            pushFollow(FOLLOW_45);
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

                            // InternalDiv.g:3358:5: (otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==32) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // InternalDiv.g:3359:6: otherlv_18= ',' ( (lv_events_19_0= ruleDStateEvent ) )
                            	    {
                            	    otherlv_18=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_18, grammarAccess.getDimEntityTypeAccess().getCommaKeyword_6_5_3_0());
                            	      					
                            	    }
                            	    // InternalDiv.g:3363:6: ( (lv_events_19_0= ruleDStateEvent ) )
                            	    // InternalDiv.g:3364:7: (lv_events_19_0= ruleDStateEvent )
                            	    {
                            	    // InternalDiv.g:3364:7: (lv_events_19_0= ruleDStateEvent )
                            	    // InternalDiv.g:3365:8: lv_events_19_0= ruleDStateEvent
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDimEntityTypeAccess().getEventsDStateEventParserRuleCall_6_5_3_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_45);
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
                            	    break loop75;
                                }
                            } while (true);

                            otherlv_20=(Token)match(input,23,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_20, grammarAccess.getDimEntityTypeAccess().getRightCurlyBracketKeyword_6_5_4());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDiv.g:3389:3: ( ( (lv_features_21_0= ruleDimFeature ) ) | ( (lv_constraints_22_0= ruleDConstraint ) ) )*
            loop78:
            do {
                int alt78=3;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ID||LA78_0==36||LA78_0==52) ) {
                    alt78=1;
                }
                else if ( (LA78_0==43) ) {
                    alt78=2;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalDiv.g:3390:4: ( (lv_features_21_0= ruleDimFeature ) )
            	    {
            	    // InternalDiv.g:3390:4: ( (lv_features_21_0= ruleDimFeature ) )
            	    // InternalDiv.g:3391:5: (lv_features_21_0= ruleDimFeature )
            	    {
            	    // InternalDiv.g:3391:5: (lv_features_21_0= ruleDimFeature )
            	    // InternalDiv.g:3392:6: lv_features_21_0= ruleDimFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getFeaturesDimFeatureParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    // InternalDiv.g:3410:4: ( (lv_constraints_22_0= ruleDConstraint ) )
            	    {
            	    // InternalDiv.g:3410:4: ( (lv_constraints_22_0= ruleDConstraint ) )
            	    // InternalDiv.g:3411:5: (lv_constraints_22_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:3411:5: (lv_constraints_22_0= ruleDConstraint )
            	    // InternalDiv.g:3412:6: lv_constraints_22_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimEntityTypeAccess().getConstraintsDConstraintParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    break loop78;
                }
            } while (true);

            otherlv_23=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:3438:1: entryRuleDState returns [EObject current=null] : iv_ruleDState= ruleDState EOF ;
    public final EObject entryRuleDState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDState = null;


        try {
            // InternalDiv.g:3438:47: (iv_ruleDState= ruleDState EOF )
            // InternalDiv.g:3439:2: iv_ruleDState= ruleDState EOF
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
    // InternalDiv.g:3445:1: ruleDState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:3451:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:3452:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:3452:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3453:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3453:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3454:4: lv_name_0_0= RULE_ID
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
    // InternalDiv.g:3473:1: entryRuleDStateEvent returns [EObject current=null] : iv_ruleDStateEvent= ruleDStateEvent EOF ;
    public final EObject entryRuleDStateEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStateEvent = null;


        try {
            // InternalDiv.g:3473:52: (iv_ruleDStateEvent= ruleDStateEvent EOF )
            // InternalDiv.g:3474:2: iv_ruleDStateEvent= ruleDStateEvent EOF
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
    // InternalDiv.g:3480:1: ruleDStateEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDStateEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:3486:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:3487:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:3487:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3488:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3488:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3489:4: lv_name_0_0= RULE_ID
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
    // InternalDiv.g:3508:1: entryRuleDimDetailType returns [EObject current=null] : iv_ruleDimDetailType= ruleDimDetailType EOF ;
    public final EObject entryRuleDimDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimDetailType = null;


        try {
            // InternalDiv.g:3508:54: (iv_ruleDimDetailType= ruleDimDetailType EOF )
            // InternalDiv.g:3509:2: iv_ruleDimDetailType= ruleDimDetailType EOF
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
    // InternalDiv.g:3515:1: ruleDimDetailType returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) ;
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
            // InternalDiv.g:3521:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) )
            // InternalDiv.g:3522:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            {
            // InternalDiv.g:3522:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            // InternalDiv.g:3523:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' this_DimComplexType_3= ruleDimComplexType[$current] otherlv_4= '{' ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}'
            {
            // InternalDiv.g:3523:3: ()
            // InternalDiv.g:3524:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimDetailTypeAccess().getDimDetailTypeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3530:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==47) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDiv.g:3531:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalDiv.g:3531:4: (lv_abstract_1_0= 'abstract' )
                    // InternalDiv.g:3532:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,47,FOLLOW_28); if (state.failed) return current;
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
            pushFollow(FOLLOW_9);
            this_DimComplexType_3=ruleDimComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DimComplexType_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,22,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimDetailTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDiv.g:3563:3: ( ( (lv_features_5_0= ruleDimFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )*
            loop80:
            do {
                int alt80=3;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_ID||LA80_0==36||LA80_0==52) ) {
                    alt80=1;
                }
                else if ( (LA80_0==43) ) {
                    alt80=2;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalDiv.g:3564:4: ( (lv_features_5_0= ruleDimFeature ) )
            	    {
            	    // InternalDiv.g:3564:4: ( (lv_features_5_0= ruleDimFeature ) )
            	    // InternalDiv.g:3565:5: (lv_features_5_0= ruleDimFeature )
            	    {
            	    // InternalDiv.g:3565:5: (lv_features_5_0= ruleDimFeature )
            	    // InternalDiv.g:3566:6: lv_features_5_0= ruleDimFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimDetailTypeAccess().getFeaturesDimFeatureParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    // InternalDiv.g:3584:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    {
            	    // InternalDiv.g:3584:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    // InternalDiv.g:3585:5: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDiv.g:3585:5: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDiv.g:3586:6: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDimDetailTypeAccess().getConstraintsDConstraintParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    break loop80;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:3613:1: ruleDimComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:3619:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3620:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3620:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:3621:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3621:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:3622:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:3622:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:3623:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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

            // InternalDiv.g:3639:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==44) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalDiv.g:3640:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDimComplexTypeAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDiv.g:3644:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDiv.g:3645:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3645:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDiv.g:3646:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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
            	    break loop81;
                }
            } while (true);

            // InternalDiv.g:3663:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==51) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDiv.g:3664:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDimComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:3668:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDiv.g:3669:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDiv.g:3669:5: (otherlv_4= RULE_ID )
                    // InternalDiv.g:3670:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDimComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDimComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:3682:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_PLAIN_TEXT_ONLY && LA83_0<=RULE_RICH_TEXT_START)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalDiv.g:3683:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:3683:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:3684:5: lv_description_5_0= ruleDRichText
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
    // InternalDiv.g:3705:1: entryRuleDimFeature returns [EObject current=null] : iv_ruleDimFeature= ruleDimFeature EOF ;
    public final EObject entryRuleDimFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimFeature = null;


        try {
            // InternalDiv.g:3705:51: (iv_ruleDimFeature= ruleDimFeature EOF )
            // InternalDiv.g:3706:2: iv_ruleDimFeature= ruleDimFeature EOF
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
    // InternalDiv.g:3712:1: ruleDimFeature returns [EObject current=null] : (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery ) ;
    public final EObject ruleDimFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DimAssociation_0 = null;

        EObject this_DimAttribute_1 = null;

        EObject this_DimQuery_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:3718:2: ( (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery ) )
            // InternalDiv.g:3719:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )
            {
            // InternalDiv.g:3719:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )
            int alt84=3;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // InternalDiv.g:3720:3: this_DimAssociation_0= ruleDimAssociation
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
                    // InternalDiv.g:3729:3: this_DimAttribute_1= ruleDimAttribute
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
                    // InternalDiv.g:3738:3: this_DimQuery_2= ruleDimQuery
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
    // InternalDiv.g:3750:1: entryRuleDimAssociation returns [EObject current=null] : iv_ruleDimAssociation= ruleDimAssociation EOF ;
    public final EObject entryRuleDimAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAssociation = null;


        try {
            // InternalDiv.g:3750:55: (iv_ruleDimAssociation= ruleDimAssociation EOF )
            // InternalDiv.g:3751:2: iv_ruleDimAssociation= ruleDimAssociation EOF
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
    // InternalDiv.g:3757:1: ruleDimAssociation returns [EObject current=null] : ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:3763:2: ( ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3764:2: ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3764:2: ( () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            // InternalDiv.g:3765:3: () ( (lv_derived_1_0= 'derived' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3765:3: ()
            // InternalDiv.g:3766:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAssociationAccess().getDimAssociationAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3772:3: ( (lv_derived_1_0= 'derived' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==52) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalDiv.g:3773:4: (lv_derived_1_0= 'derived' )
                    {
                    // InternalDiv.g:3773:4: (lv_derived_1_0= 'derived' )
                    // InternalDiv.g:3774:5: lv_derived_1_0= 'derived'
                    {
                    lv_derived_1_0=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
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

            // InternalDiv.g:3786:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:3787:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:3787:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:3788:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
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

            // InternalDiv.g:3804:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==44) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalDiv.g:3805:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimAssociationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:3809:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:3810:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3810:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:3811:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
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
            	    break loop86;
                }
            } while (true);

            // InternalDiv.g:3828:3: ( ( (lv_kind_5_0= ruleDAssociationKind ) ) | ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==53||LA87_0==97) ) {
                alt87=1;
            }
            else if ( (LA87_0==98) ) {
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
                    // InternalDiv.g:3829:4: ( (lv_kind_5_0= ruleDAssociationKind ) )
                    {
                    // InternalDiv.g:3829:4: ( (lv_kind_5_0= ruleDAssociationKind ) )
                    // InternalDiv.g:3830:5: (lv_kind_5_0= ruleDAssociationKind )
                    {
                    // InternalDiv.g:3830:5: (lv_kind_5_0= ruleDAssociationKind )
                    // InternalDiv.g:3831:6: lv_kind_5_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimAssociationAccess().getKindDAssociationKindEnumRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
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
                    // InternalDiv.g:3849:4: ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' )
                    {
                    // InternalDiv.g:3849:4: ( ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains' )
                    // InternalDiv.g:3850:5: ( (lv_kind_6_0= ruleDAssociationKindInverse ) ) otherlv_7= 'contains'
                    {
                    // InternalDiv.g:3850:5: ( (lv_kind_6_0= ruleDAssociationKindInverse ) )
                    // InternalDiv.g:3851:6: (lv_kind_6_0= ruleDAssociationKindInverse )
                    {
                    // InternalDiv.g:3851:6: (lv_kind_6_0= ruleDAssociationKindInverse )
                    // InternalDiv.g:3852:7: lv_kind_6_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDimAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_51);
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

                    otherlv_7=(Token)match(input,53,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getDimAssociationAccess().getContainsKeyword_4_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3875:3: ( (otherlv_8= RULE_ID ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==55) ) {
                    int LA88_3 = input.LA(3);

                    if ( (LA88_3==RULE_NATURAL) ) {
                        alt88=1;
                    }
                }
                else if ( (LA88_1==EOF||(LA88_1>=RULE_ID && LA88_1<=RULE_RICH_TEXT_START)||LA88_1==23||LA88_1==36||LA88_1==43||LA88_1==52||LA88_1==67||LA88_1==92||LA88_1==133) ) {
                    alt88=1;
                }
            }
            switch (alt88) {
                case 1 :
                    // InternalDiv.g:3876:4: (otherlv_8= RULE_ID )
                    {
                    // InternalDiv.g:3876:4: (otherlv_8= RULE_ID )
                    // InternalDiv.g:3877:5: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAssociationRule());
                      					}
                      				
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getDimAssociationAccess().getTypeDEntityTypeCrossReference_5_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:3888:3: ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==55||LA89_0==67||LA89_0==92||LA89_0==133) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalDiv.g:3889:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:3889:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    // InternalDiv.g:3890:5: lv_multiplicity_9_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalDiv.g:3907:3: ( (lv_description_10_0= ruleDRichText ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=RULE_PLAIN_TEXT_ONLY && LA90_0<=RULE_RICH_TEXT_START)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalDiv.g:3908:4: (lv_description_10_0= ruleDRichText )
                    {
                    // InternalDiv.g:3908:4: (lv_description_10_0= ruleDRichText )
                    // InternalDiv.g:3909:5: lv_description_10_0= ruleDRichText
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
    // InternalDiv.g:3930:1: entryRuleDimAttribute returns [EObject current=null] : iv_ruleDimAttribute= ruleDimAttribute EOF ;
    public final EObject entryRuleDimAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimAttribute = null;


        try {
            // InternalDiv.g:3930:53: (iv_ruleDimAttribute= ruleDimAttribute EOF )
            // InternalDiv.g:3931:2: iv_ruleDimAttribute= ruleDimAttribute EOF
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
    // InternalDiv.g:3937:1: ruleDimAttribute returns [EObject current=null] : ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:3943:2: ( ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDiv.g:3944:2: ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:3944:2: ( () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDiv.g:3945:3: () ( (lv_detail_1_0= 'detail' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) )? ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDiv.g:3945:3: ()
            // InternalDiv.g:3946:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimAttributeAccess().getDimAttributeAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:3952:3: ( (lv_detail_1_0= 'detail' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==36) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalDiv.g:3953:4: (lv_detail_1_0= 'detail' )
                    {
                    // InternalDiv.g:3953:4: (lv_detail_1_0= 'detail' )
                    // InternalDiv.g:3954:5: lv_detail_1_0= 'detail'
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

            // InternalDiv.g:3966:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDiv.g:3967:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDiv.g:3967:4: (lv_name_2_0= RULE_ID )
            // InternalDiv.g:3968:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            // InternalDiv.g:3984:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==44) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalDiv.g:3985:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDimAttributeAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDiv.g:3989:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDiv.g:3990:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDiv.g:3990:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDiv.g:3991:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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
            	    break loop92;
                }
            } while (true);

            otherlv_5=(Token)match(input,45,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDimAttributeAccess().getColonKeyword_4());
              		
            }
            // InternalDiv.g:4012:3: ( (otherlv_6= RULE_ID ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==EOF||(LA93_1>=RULE_ID && LA93_1<=RULE_RICH_TEXT_START)||LA93_1==23||LA93_1==36||LA93_1==43||LA93_1==52||LA93_1==54||LA93_1==67||LA93_1==92||LA93_1==133) ) {
                    alt93=1;
                }
                else if ( (LA93_1==55) ) {
                    int LA93_4 = input.LA(3);

                    if ( (LA93_4==RULE_NATURAL) ) {
                        alt93=1;
                    }
                }
            }
            switch (alt93) {
                case 1 :
                    // InternalDiv.g:4013:4: (otherlv_6= RULE_ID )
                    {
                    // InternalDiv.g:4013:4: (otherlv_6= RULE_ID )
                    // InternalDiv.g:4014:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimAttributeRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDimAttributeAccess().getTypeDTypeCrossReference_5_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:4025:3: ( (lv_multiplicity_7_0= ruleDMultiplicity ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==55||LA94_0==67||LA94_0==92||LA94_0==133) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalDiv.g:4026:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4026:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    // InternalDiv.g:4027:5: lv_multiplicity_7_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_55);
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

            // InternalDiv.g:4044:3: ( (lv_key_8_0= 'key' ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==54) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalDiv.g:4045:4: (lv_key_8_0= 'key' )
                    {
                    // InternalDiv.g:4045:4: (lv_key_8_0= 'key' )
                    // InternalDiv.g:4046:5: lv_key_8_0= 'key'
                    {
                    lv_key_8_0=(Token)match(input,54,FOLLOW_25); if (state.failed) return current;
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

            // InternalDiv.g:4058:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_PLAIN_TEXT_ONLY && LA96_0<=RULE_RICH_TEXT_START)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalDiv.g:4059:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDiv.g:4059:4: (lv_description_9_0= ruleDRichText )
                    // InternalDiv.g:4060:5: lv_description_9_0= ruleDRichText
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
    // InternalDiv.g:4081:1: entryRuleDimQuery returns [EObject current=null] : iv_ruleDimQuery= ruleDimQuery EOF ;
    public final EObject entryRuleDimQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimQuery = null;


        try {
            // InternalDiv.g:4081:49: (iv_ruleDimQuery= ruleDimQuery EOF )
            // InternalDiv.g:4082:2: iv_ruleDimQuery= ruleDimQuery EOF
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
    // InternalDiv.g:4088:1: ruleDimQuery returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ) ;
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
            // InternalDiv.g:4094:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? ) )
            // InternalDiv.g:4095:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:4095:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )? )
            // InternalDiv.g:4096:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= '(' ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )? ( (lv_multiplicity_11_0= ruleDMultiplicity ) )? (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )? ( (lv_description_14_0= ruleDRichText ) )?
            {
            // InternalDiv.g:4096:3: ()
            // InternalDiv.g:4097:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimQueryAccess().getDimQueryAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:4103:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4104:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4104:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4105:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
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

            // InternalDiv.g:4121:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==44) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalDiv.g:4122:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDimQueryAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDiv.g:4126:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDiv.g:4127:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDiv.g:4127:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDiv.g:4128:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
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
            	    break loop97;
                }
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDimQueryAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalDiv.g:4149:3: ( ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )* )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalDiv.g:4150:4: ( (lv_parameters_5_0= ruleDimQueryParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )*
                    {
                    // InternalDiv.g:4150:4: ( (lv_parameters_5_0= ruleDimQueryParameter ) )
                    // InternalDiv.g:4151:5: (lv_parameters_5_0= ruleDimQueryParameter )
                    {
                    // InternalDiv.g:4151:5: (lv_parameters_5_0= ruleDimQueryParameter )
                    // InternalDiv.g:4152:6: lv_parameters_5_0= ruleDimQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimQueryAccess().getParametersDimQueryParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
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

                    // InternalDiv.g:4169:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==32) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalDiv.g:4170:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleDimQueryParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getDimQueryAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:4174:5: ( (lv_parameters_7_0= ruleDimQueryParameter ) )
                    	    // InternalDiv.g:4175:6: (lv_parameters_7_0= ruleDimQueryParameter )
                    	    {
                    	    // InternalDiv.g:4175:6: (lv_parameters_7_0= ruleDimQueryParameter )
                    	    // InternalDiv.g:4176:7: lv_parameters_7_0= ruleDimQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDimQueryAccess().getParametersDimQueryParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_58);
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
                    	    break loop98;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,56,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDimQueryAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,45,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDimQueryAccess().getColonKeyword_6());
              		
            }
            // InternalDiv.g:4203:3: ( (otherlv_10= RULE_ID ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_ID) ) {
                int LA100_1 = input.LA(2);

                if ( (LA100_1==55) ) {
                    int LA100_3 = input.LA(3);

                    if ( (LA100_3==RULE_NATURAL) ) {
                        alt100=1;
                    }
                }
                else if ( (LA100_1==EOF||(LA100_1>=RULE_ID && LA100_1<=RULE_RICH_TEXT_START)||LA100_1==23||LA100_1==28||LA100_1==31||LA100_1==34||LA100_1==36||LA100_1==41||LA100_1==43||(LA100_1>=47 && LA100_1<=48)||LA100_1==52||LA100_1==57||LA100_1==67||LA100_1==92||(LA100_1>=95 && LA100_1<=96)||LA100_1==133) ) {
                    alt100=1;
                }
            }
            switch (alt100) {
                case 1 :
                    // InternalDiv.g:4204:4: (otherlv_10= RULE_ID )
                    {
                    // InternalDiv.g:4204:4: (otherlv_10= RULE_ID )
                    // InternalDiv.g:4205:5: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimQueryRule());
                      					}
                      				
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getDimQueryAccess().getTypeDTypeCrossReference_7_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:4216:3: ( (lv_multiplicity_11_0= ruleDMultiplicity ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==55||LA101_0==67||LA101_0==92||LA101_0==133) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalDiv.g:4217:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4217:4: (lv_multiplicity_11_0= ruleDMultiplicity )
                    // InternalDiv.g:4218:5: lv_multiplicity_11_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryAccess().getMultiplicityDMultiplicityParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_62);
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

            // InternalDiv.g:4235:3: (otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==57) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDiv.g:4236:4: otherlv_12= 'returns' ( (lv_returns_13_0= ruleDExpression ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDimQueryAccess().getReturnsKeyword_9_0());
                      			
                    }
                    // InternalDiv.g:4240:4: ( (lv_returns_13_0= ruleDExpression ) )
                    // InternalDiv.g:4241:5: (lv_returns_13_0= ruleDExpression )
                    {
                    // InternalDiv.g:4241:5: (lv_returns_13_0= ruleDExpression )
                    // InternalDiv.g:4242:6: lv_returns_13_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDimQueryAccess().getReturnsDExpressionParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalDiv.g:4260:3: ( (lv_description_14_0= ruleDRichText ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=RULE_PLAIN_TEXT_ONLY && LA103_0<=RULE_RICH_TEXT_START)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalDiv.g:4261:4: (lv_description_14_0= ruleDRichText )
                    {
                    // InternalDiv.g:4261:4: (lv_description_14_0= ruleDRichText )
                    // InternalDiv.g:4262:5: lv_description_14_0= ruleDRichText
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
    // InternalDiv.g:4283:1: entryRuleDimQueryParameter returns [EObject current=null] : iv_ruleDimQueryParameter= ruleDimQueryParameter EOF ;
    public final EObject entryRuleDimQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimQueryParameter = null;


        try {
            // InternalDiv.g:4283:58: (iv_ruleDimQueryParameter= ruleDimQueryParameter EOF )
            // InternalDiv.g:4284:2: iv_ruleDimQueryParameter= ruleDimQueryParameter EOF
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
    // InternalDiv.g:4290:1: ruleDimQueryParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDimQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4296:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDiv.g:4297:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:4297:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDiv.g:4298:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )? ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDiv.g:4298:3: ()
            // InternalDiv.g:4299:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDimQueryParameterAccess().getDimQueryParameterAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:4305:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4306:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4306:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4307:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,45,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDimQueryParameterAccess().getColonKeyword_2());
              		
            }
            // InternalDiv.g:4327:3: ( (otherlv_3= RULE_ID ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_ID) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalDiv.g:4328:4: (otherlv_3= RULE_ID )
                    {
                    // InternalDiv.g:4328:4: (otherlv_3= RULE_ID )
                    // InternalDiv.g:4329:5: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDimQueryParameterRule());
                      					}
                      				
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDimQueryParameterAccess().getTypeDTypeCrossReference_3_0());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDiv.g:4340:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==55||LA105_0==67||LA105_0==92||LA105_0==133) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalDiv.g:4341:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4341:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDiv.g:4342:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDimQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalDiv.g:4359:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=RULE_PLAIN_TEXT_ONLY && LA106_0<=RULE_RICH_TEXT_START)) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalDiv.g:4360:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDiv.g:4360:4: (lv_description_5_0= ruleDRichText )
                    // InternalDiv.g:4361:5: lv_description_5_0= ruleDRichText
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
    // InternalDiv.g:4382:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDiv.g:4382:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDiv.g:4383:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDiv.g:4389:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4395:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDiv.g:4396:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDiv.g:4396:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDiv.g:4397:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDiv.g:4401:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDiv.g:4402:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDiv.g:4402:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDiv.g:4403:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalDiv.g:4424:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalDiv.g:4424:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalDiv.g:4425:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalDiv.g:4431:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalDiv.g:4437:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalDiv.g:4438:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalDiv.g:4438:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalDiv.g:4439:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalDiv.g:4443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4444:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4445:5: lv_name_1_0= RULE_ID
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

            // InternalDiv.g:4461:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==60) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalDiv.g:4462:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalDiv.g:4466:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalDiv.g:4467:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalDiv.g:4467:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalDiv.g:4468:6: lv_context_3_0= ruleDmxTestContext
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

                    // InternalDiv.g:4485:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==32) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalDiv.g:4486:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:4490:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalDiv.g:4491:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalDiv.g:4491:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalDiv.g:4492:7: lv_context_5_0= ruleDmxTestContext
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
                    	    break loop107;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDiv.g:4515:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalDiv.g:4516:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalDiv.g:4516:4: (lv_expr_7_0= ruleDExpression )
            // InternalDiv.g:4517:5: lv_expr_7_0= ruleDExpression
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

            otherlv_8=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:4542:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalDiv.g:4542:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalDiv.g:4543:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalDiv.g:4549:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalDiv.g:4555:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalDiv.g:4556:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalDiv.g:4556:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalDiv.g:4557:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalDiv.g:4557:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:4558:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:4558:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:4559:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,45,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalDiv.g:4579:3: ( (otherlv_2= RULE_ID ) )
            // InternalDiv.g:4580:4: (otherlv_2= RULE_ID )
            {
            // InternalDiv.g:4580:4: (otherlv_2= RULE_ID )
            // InternalDiv.g:4581:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDiv.g:4592:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==55||LA109_0==67||LA109_0==92||LA109_0==133) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalDiv.g:4593:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDiv.g:4593:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDiv.g:4594:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_67);
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

            // InternalDiv.g:4611:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==61) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalDiv.g:4612:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalDiv.g:4616:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( ((LA110_0>=RULE_NATURAL && LA110_0<=RULE_STRING)||LA110_0==34||LA110_0==36||(LA110_0>=84 && LA110_0<=89)) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==22) ) {
                        alt110=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalDiv.g:4617:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalDiv.g:4617:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalDiv.g:4618:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalDiv.g:4618:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalDiv.g:4619:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalDiv.g:4637:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalDiv.g:4637:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalDiv.g:4638:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalDiv.g:4638:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalDiv.g:4639:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalDiv.g:4662:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalDiv.g:4662:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalDiv.g:4663:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalDiv.g:4669:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalDiv.g:4675:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalDiv.g:4676:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalDiv.g:4676:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalDiv.g:4677:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalDiv.g:4677:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:4678:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:4678:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:4679:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,62,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,55,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:4703:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalDiv.g:4704:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalDiv.g:4704:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalDiv.g:4705:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_72);
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

            // InternalDiv.g:4722:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt112=0;
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==32) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalDiv.g:4723:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDiv.g:4727:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalDiv.g:4728:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalDiv.g:4728:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalDiv.g:4729:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    if ( cnt112 >= 1 ) break loop112;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
            } while (true);

            otherlv_6=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:4755:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalDiv.g:4755:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalDiv.g:4756:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalDiv.g:4762:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4768:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDiv.g:4769:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDiv.g:4769:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDiv.g:4770:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDiv.g:4774:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4775:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4775:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4776:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,64,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalDiv.g:4796:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalDiv.g:4797:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalDiv.g:4797:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalDiv.g:4798:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalDiv.g:4815:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_PLAIN_TEXT_ONLY && LA113_0<=RULE_RICH_TEXT_START)) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalDiv.g:4816:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDiv.g:4816:4: (lv_description_4_0= ruleDRichText )
                    // InternalDiv.g:4817:5: lv_description_4_0= ruleDRichText
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
    // InternalDiv.g:4838:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalDiv.g:4838:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalDiv.g:4839:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalDiv.g:4845:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalDiv.g:4851:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalDiv.g:4852:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalDiv.g:4852:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalDiv.g:4853:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalDiv.g:4857:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDiv.g:4858:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDiv.g:4858:4: (lv_name_1_0= RULE_ID )
            // InternalDiv.g:4859:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,55,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:4879:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_ID) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalDiv.g:4880:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalDiv.g:4880:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalDiv.g:4881:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalDiv.g:4881:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalDiv.g:4882:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
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

                    // InternalDiv.g:4899:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==32) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalDiv.g:4900:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:4904:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalDiv.g:4905:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalDiv.g:4905:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalDiv.g:4906:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_58);
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
                    	    break loop114;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,56,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,45,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalDiv.g:4933:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDiv.g:4934:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDiv.g:4934:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalDiv.g:4935:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_75);
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

            // InternalDiv.g:4952:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==66) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalDiv.g:4953:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,66,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalDiv.g:4957:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalDiv.g:4958:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalDiv.g:4958:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalDiv.g:4959:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalDiv.g:4981:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalDiv.g:4981:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalDiv.g:4982:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalDiv.g:4988:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:4994:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalDiv.g:4995:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalDiv.g:4995:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalDiv.g:4996:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalDiv.g:4996:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( ((LA117_0>=99 && LA117_0<=109)) ) {
                alt117=1;
            }
            else if ( (LA117_0==RULE_ID) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalDiv.g:4997:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalDiv.g:4997:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalDiv.g:4998:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalDiv.g:4998:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalDiv.g:4999:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_76);
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
                    // InternalDiv.g:5017:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDiv.g:5017:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDiv.g:5018:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDiv.g:5018:5: (otherlv_1= RULE_ID )
                    // InternalDiv.g:5019:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:5031:3: ( (lv_collection_2_0= '*' ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==67) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalDiv.g:5032:4: (lv_collection_2_0= '*' )
                    {
                    // InternalDiv.g:5032:4: (lv_collection_2_0= '*' )
                    // InternalDiv.g:5033:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:5049:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalDiv.g:5049:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalDiv.g:5050:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalDiv.g:5056:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5062:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalDiv.g:5063:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalDiv.g:5063:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalDiv.g:5064:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalDiv.g:5064:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:5065:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:5065:4: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:5066:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,45,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDiv.g:5086:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDiv.g:5087:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDiv.g:5087:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalDiv.g:5088:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalDiv.g:5109:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDiv.g:5109:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDiv.g:5110:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDiv.g:5116:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalDiv.g:5122:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalDiv.g:5123:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalDiv.g:5123:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt119=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==EOF||(LA119_1>=RULE_ID && LA119_1<=RULE_RICH_TEXT_END)||(LA119_1>=23 && LA119_1<=24)||LA119_1==26||(LA119_1>=28 && LA119_1<=32)||LA119_1==34||LA119_1==36||LA119_1==39||LA119_1==41||LA119_1==43||(LA119_1>=47 && LA119_1<=48)||LA119_1==52||(LA119_1>=55 && LA119_1<=56)||LA119_1==62||(LA119_1>=67 && LA119_1<=74)||(LA119_1>=80 && LA119_1<=83)||(LA119_1>=92 && LA119_1<=93)||(LA119_1>=95 && LA119_1<=96)||(LA119_1>=110 && LA119_1<=129)) ) {
                    alt119=2;
                }
                else if ( (LA119_1==61) ) {
                    alt119=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 119, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
            case RULE_STRING:
            case 22:
            case 34:
            case 36:
            case 55:
            case 75:
            case 79:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 92:
            case 93:
            case 130:
            case 131:
            case 132:
                {
                alt119=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_RICH_TEXT_START:
                {
                alt119=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // InternalDiv.g:5124:3: this_DmxAssignment_0= ruleDmxAssignment
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
                    // InternalDiv.g:5133:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
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
                    // InternalDiv.g:5142:3: this_DRichText_2= ruleDRichText
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
    // InternalDiv.g:5154:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDiv.g:5154:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDiv.g:5155:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDiv.g:5161:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalDiv.g:5167:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalDiv.g:5168:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalDiv.g:5168:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt121=1;
            }
            else if ( (LA121_0==RULE_RICH_TEXT_START) ) {
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
                    // InternalDiv.g:5169:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalDiv.g:5169:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalDiv.g:5170:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalDiv.g:5170:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalDiv.g:5171:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalDiv.g:5189:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalDiv.g:5189:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalDiv.g:5190:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalDiv.g:5190:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalDiv.g:5191:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalDiv.g:5191:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalDiv.g:5192:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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

                    // InternalDiv.g:5209:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDiv.g:5210:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDiv.g:5210:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDiv.g:5211:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_77);
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

                    // InternalDiv.g:5228:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalDiv.g:5229:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDiv.g:5229:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalDiv.g:5230:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalDiv.g:5230:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalDiv.g:5231:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
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

                    	    // InternalDiv.g:5248:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDiv.g:5249:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:5249:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDiv.g:5250:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_77);
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
                    	    break loop120;
                        }
                    } while (true);

                    // InternalDiv.g:5268:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalDiv.g:5269:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalDiv.g:5269:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalDiv.g:5270:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalDiv.g:5292:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalDiv.g:5292:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalDiv.g:5293:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalDiv.g:5299:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5305:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDiv.g:5306:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDiv.g:5306:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDiv.g:5307:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDiv.g:5307:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDiv.g:5308:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDiv.g:5327:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalDiv.g:5327:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalDiv.g:5328:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalDiv.g:5334:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5340:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalDiv.g:5341:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalDiv.g:5341:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalDiv.g:5342:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalDiv.g:5342:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalDiv.g:5343:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalDiv.g:5362:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalDiv.g:5362:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalDiv.g:5363:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalDiv.g:5369:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5375:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalDiv.g:5376:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalDiv.g:5376:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalDiv.g:5377:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalDiv.g:5377:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalDiv.g:5378:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalDiv.g:5397:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalDiv.g:5397:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalDiv.g:5398:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalDiv.g:5404:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5410:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalDiv.g:5411:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalDiv.g:5411:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalDiv.g:5412:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalDiv.g:5412:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalDiv.g:5413:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalDiv.g:5432:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalDiv.g:5432:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalDiv.g:5433:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalDiv.g:5439:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDiv.g:5445:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalDiv.g:5446:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalDiv.g:5446:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalDiv.g:5447:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_78);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5455:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop123:
            do {
                int alt123=3;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==68) ) {
                    int LA123_2 = input.LA(2);

                    if ( (synpred1_InternalDiv()) ) {
                        alt123=1;
                    }
                    else if ( (synpred2_InternalDiv()) ) {
                        alt123=2;
                    }


                }


                switch (alt123) {
            	case 1 :
            	    // InternalDiv.g:5456:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalDiv.g:5456:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalDiv.g:5457:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalDiv.g:5457:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalDiv.g:5458:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalDiv.g:5470:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalDiv.g:5471:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalDiv.g:5471:7: ()
            	    // InternalDiv.g:5472:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDiv.g:5482:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDiv.g:5483:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDiv.g:5483:8: (otherlv_3= RULE_ID )
            	    // InternalDiv.g:5484:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_80);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDiv.g:5504:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalDiv.g:5505:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalDiv.g:5505:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalDiv.g:5506:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_78);
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
            	    // InternalDiv.g:5525:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalDiv.g:5525:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalDiv.g:5526:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalDiv.g:5526:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDiv.g:5527:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDiv.g:5533:6: ( () otherlv_7= '.' )
            	    // InternalDiv.g:5534:7: () otherlv_7= '.'
            	    {
            	    // InternalDiv.g:5534:7: ()
            	    // InternalDiv.g:5535:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDiv.g:5547:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDiv.g:5548:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDiv.g:5548:6: (otherlv_8= RULE_ID )
            	    // InternalDiv.g:5549:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_81); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDiv.g:5560:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt122=3;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==55) && (synpred3_InternalDiv())) {
            	        alt122=1;
            	    }
            	    else if ( (LA122_0==69) ) {
            	        alt122=2;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // InternalDiv.g:5561:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalDiv.g:5561:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalDiv.g:5562:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalDiv.g:5562:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDiv.g:5563:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDiv.g:5567:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDiv.g:5568:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,55,FOLLOW_82); if (state.failed) return current;
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

            	            // InternalDiv.g:5580:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalDiv.g:5581:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalDiv.g:5581:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalDiv.g:5582:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_83);
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

            	            otherlv_11=(Token)match(input,56,FOLLOW_78); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDiv.g:5605:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalDiv.g:5605:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalDiv.g:5606:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalDiv.g:5606:7: (lv_before_12_0= '@before' )
            	            // InternalDiv.g:5607:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,69,FOLLOW_78); if (state.failed) return current;
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
    // $ANTLR end "ruleDmxNavigableMemberReference"


    // $ANTLR start "entryRuleDmxCallArguments"
    // InternalDiv.g:5626:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalDiv.g:5626:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalDiv.g:5627:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalDiv.g:5633:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5639:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalDiv.g:5640:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalDiv.g:5640:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalDiv.g:5641:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalDiv.g:5641:3: ()
            // InternalDiv.g:5642:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:5648:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_ID||(LA125_0>=RULE_NATURAL && LA125_0<=RULE_STRING)||LA125_0==22||LA125_0==34||LA125_0==36||LA125_0==55||LA125_0==75||LA125_0==79||(LA125_0>=84 && LA125_0<=89)||(LA125_0>=92 && LA125_0<=93)||(LA125_0>=130 && LA125_0<=132)) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalDiv.g:5649:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalDiv.g:5649:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalDiv.g:5650:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalDiv.g:5650:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalDiv.g:5651:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_84);
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

                    // InternalDiv.g:5668:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==32) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // InternalDiv.g:5669:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,32,FOLLOW_80); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:5673:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalDiv.g:5674:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalDiv.g:5674:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalDiv.g:5675:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_84);
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
                    	    break loop124;
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
    // InternalDiv.g:5698:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalDiv.g:5698:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalDiv.g:5699:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
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
    // InternalDiv.g:5705:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5711:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalDiv.g:5712:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalDiv.g:5712:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalDiv.g:5713:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalDiv.g:5713:3: ()
            // InternalDiv.g:5714:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:5720:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:5721:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:5721:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:5722:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxAssignmentRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxAssignmentAccess().getAssignToMemberDNavigableMemberCrossReference_1_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAssignmentAccess().getDmxOpSingleAssignParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_80);
            ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5740:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalDiv.g:5741:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalDiv.g:5741:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalDiv.g:5742:5: lv_value_3_0= ruleDmxOrExpression
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
    // InternalDiv.g:5763:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalDiv.g:5763:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalDiv.g:5764:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalDiv.g:5770:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:5776:2: (kw= ':=' )
            // InternalDiv.g:5777:2: kw= ':='
            {
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:5785:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalDiv.g:5785:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalDiv.g:5786:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalDiv.g:5792:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDiv.g:5798:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalDiv.g:5799:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalDiv.g:5799:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_ID) ) {
                int LA126_1 = input.LA(2);

                if ( (LA126_1==70) ) {
                    alt126=1;
                }
                else if ( (LA126_1==EOF||(LA126_1>=RULE_ID && LA126_1<=RULE_RICH_TEXT_END)||(LA126_1>=23 && LA126_1<=24)||LA126_1==26||(LA126_1>=28 && LA126_1<=32)||LA126_1==34||LA126_1==36||LA126_1==39||LA126_1==41||LA126_1==43||(LA126_1>=47 && LA126_1<=48)||LA126_1==52||(LA126_1>=55 && LA126_1<=56)||LA126_1==62||(LA126_1>=67 && LA126_1<=69)||(LA126_1>=71 && LA126_1<=74)||(LA126_1>=80 && LA126_1<=83)||(LA126_1>=92 && LA126_1<=93)||(LA126_1>=95 && LA126_1<=96)||(LA126_1>=110 && LA126_1<=129)) ) {
                    alt126=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA126_0>=RULE_NATURAL && LA126_0<=RULE_STRING)||LA126_0==22||LA126_0==34||LA126_0==36||LA126_0==55||LA126_0==75||LA126_0==79||(LA126_0>=84 && LA126_0<=89)||(LA126_0>=92 && LA126_0<=93)||(LA126_0>=130 && LA126_0<=132)) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalDiv.g:5800:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalDiv.g:5800:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalDiv.g:5801:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalDiv.g:5801:4: ()
                    // InternalDiv.g:5802:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDiv.g:5808:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalDiv.g:5809:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalDiv.g:5809:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalDiv.g:5810:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_85);
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

                    otherlv_2=(Token)match(input,70,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalDiv.g:5831:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalDiv.g:5832:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalDiv.g:5832:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalDiv.g:5833:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalDiv.g:5852:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalDiv.g:5864:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalDiv.g:5864:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalDiv.g:5865:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalDiv.g:5871:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDiv.g:5877:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDiv.g:5878:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDiv.g:5878:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDiv.g:5879:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDiv.g:5879:3: (lv_name_0_0= RULE_ID )
            // InternalDiv.g:5880:4: lv_name_0_0= RULE_ID
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
    // InternalDiv.g:5899:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalDiv.g:5899:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalDiv.g:5900:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalDiv.g:5906:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:5912:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalDiv.g:5913:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalDiv.g:5913:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalDiv.g:5914:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_86);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:5922:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop127:
            do {
                int alt127=2;
                switch ( input.LA(1) ) {
                case 110:
                    {
                    int LA127_2 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt127=1;
                    }


                    }
                    break;
                case 111:
                    {
                    int LA127_3 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt127=1;
                    }


                    }
                    break;
                case 112:
                    {
                    int LA127_4 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt127=1;
                    }


                    }
                    break;
                case 113:
                    {
                    int LA127_5 = input.LA(2);

                    if ( (synpred4_InternalDiv()) ) {
                        alt127=1;
                    }


                    }
                    break;

                }

                switch (alt127) {
            	case 1 :
            	    // InternalDiv.g:5923:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalDiv.g:5923:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalDiv.g:5924:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalDiv.g:5934:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalDiv.g:5935:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalDiv.g:5935:6: ()
            	    // InternalDiv.g:5936:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:5942:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalDiv.g:5943:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalDiv.g:5943:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalDiv.g:5944:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_80);
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

            	    // InternalDiv.g:5963:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalDiv.g:5964:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalDiv.g:5964:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalDiv.g:5965:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_86);
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
    // $ANTLR end "ruleDmxOrExpression"


    // $ANTLR start "entryRuleDmxAndExpression"
    // InternalDiv.g:5987:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalDiv.g:5987:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalDiv.g:5988:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalDiv.g:5994:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6000:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalDiv.g:6001:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalDiv.g:6001:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalDiv.g:6002:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_87);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6010:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==114) ) {
                    int LA128_2 = input.LA(2);

                    if ( (synpred5_InternalDiv()) ) {
                        alt128=1;
                    }


                }
                else if ( (LA128_0==115) ) {
                    int LA128_3 = input.LA(2);

                    if ( (synpred5_InternalDiv()) ) {
                        alt128=1;
                    }


                }


                switch (alt128) {
            	case 1 :
            	    // InternalDiv.g:6011:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalDiv.g:6011:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalDiv.g:6012:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalDiv.g:6022:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalDiv.g:6023:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalDiv.g:6023:6: ()
            	    // InternalDiv.g:6024:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6030:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalDiv.g:6031:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalDiv.g:6031:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalDiv.g:6032:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_80);
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

            	    // InternalDiv.g:6051:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalDiv.g:6052:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalDiv.g:6052:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalDiv.g:6053:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_87);
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalDiv.g:6075:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalDiv.g:6075:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalDiv.g:6076:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalDiv.g:6082:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6088:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalDiv.g:6089:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalDiv.g:6089:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalDiv.g:6090:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_88);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6098:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop129:
            do {
                int alt129=2;
                switch ( input.LA(1) ) {
                case 74:
                    {
                    int LA129_2 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt129=1;
                    }


                    }
                    break;
                case 116:
                    {
                    int LA129_3 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt129=1;
                    }


                    }
                    break;
                case 117:
                    {
                    int LA129_4 = input.LA(2);

                    if ( (synpred6_InternalDiv()) ) {
                        alt129=1;
                    }


                    }
                    break;

                }

                switch (alt129) {
            	case 1 :
            	    // InternalDiv.g:6099:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalDiv.g:6099:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalDiv.g:6100:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalDiv.g:6110:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalDiv.g:6111:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalDiv.g:6111:6: ()
            	    // InternalDiv.g:6112:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6118:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalDiv.g:6119:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalDiv.g:6119:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalDiv.g:6120:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_80);
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

            	    // InternalDiv.g:6139:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalDiv.g:6140:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalDiv.g:6140:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalDiv.g:6141:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_88);
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
    // $ANTLR end "ruleDmxEqualityExpression"


    // $ANTLR start "entryRuleDmxRelationalExpression"
    // InternalDiv.g:6163:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalDiv.g:6163:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalDiv.g:6164:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalDiv.g:6170:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6176:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalDiv.g:6177:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalDiv.g:6177:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalDiv.g:6178:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_89);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6186:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop130:
            do {
                int alt130=3;
                alt130 = dfa130.predict(input);
                switch (alt130) {
            	case 1 :
            	    // InternalDiv.g:6187:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDiv.g:6187:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDiv.g:6188:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDiv.g:6188:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalDiv.g:6189:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalDiv.g:6195:6: ( () ruleDmxOpInstanceOf )
            	    // InternalDiv.g:6196:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalDiv.g:6196:7: ()
            	    // InternalDiv.g:6197:8: 
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

            	    // InternalDiv.g:6212:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDiv.g:6213:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDiv.g:6213:6: (otherlv_3= RULE_ID )
            	    // InternalDiv.g:6214:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_89); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDiv.g:6227:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalDiv.g:6227:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalDiv.g:6228:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalDiv.g:6228:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDiv.g:6229:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDiv.g:6239:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDiv.g:6240:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDiv.g:6240:7: ()
            	    // InternalDiv.g:6241:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDiv.g:6247:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDiv.g:6248:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDiv.g:6248:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDiv.g:6249:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_80);
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

            	    // InternalDiv.g:6268:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalDiv.g:6269:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalDiv.g:6269:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalDiv.g:6270:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_89);
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalDiv.g:6293:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalDiv.g:6293:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalDiv.g:6294:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalDiv.g:6300:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:6306:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDiv.g:6307:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDiv.g:6307:2: (kw= 'ISA' | kw= 'isa' )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==71) ) {
                alt131=1;
            }
            else if ( (LA131_0==72) ) {
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
                    // InternalDiv.g:6308:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:6314:3: kw= 'isa'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:6323:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalDiv.g:6323:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalDiv.g:6324:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalDiv.g:6330:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6336:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalDiv.g:6337:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalDiv.g:6337:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalDiv.g:6338:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_90);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6346:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop132:
            do {
                int alt132=2;
                switch ( input.LA(1) ) {
                case 124:
                    {
                    int LA132_2 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt132=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA132_3 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt132=1;
                    }


                    }
                    break;
                case 83:
                    {
                    int LA132_4 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt132=1;
                    }


                    }
                    break;
                case 125:
                    {
                    int LA132_5 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt132=1;
                    }


                    }
                    break;
                case 126:
                    {
                    int LA132_6 = input.LA(2);

                    if ( (synpred9_InternalDiv()) ) {
                        alt132=1;
                    }


                    }
                    break;

                }

                switch (alt132) {
            	case 1 :
            	    // InternalDiv.g:6347:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalDiv.g:6347:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDiv.g:6348:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDiv.g:6358:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDiv.g:6359:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDiv.g:6359:6: ()
            	    // InternalDiv.g:6360:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6366:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDiv.g:6367:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDiv.g:6367:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDiv.g:6368:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_80);
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

            	    // InternalDiv.g:6387:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalDiv.g:6388:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalDiv.g:6388:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalDiv.g:6389:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_90);
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalDiv.g:6411:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalDiv.g:6411:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalDiv.g:6412:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalDiv.g:6418:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6424:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalDiv.g:6425:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalDiv.g:6425:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalDiv.g:6426:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_91);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6434:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==92) ) {
                    int LA133_2 = input.LA(2);

                    if ( (synpred10_InternalDiv()) ) {
                        alt133=1;
                    }


                }
                else if ( (LA133_0==93) ) {
                    int LA133_3 = input.LA(2);

                    if ( (synpred10_InternalDiv()) ) {
                        alt133=1;
                    }


                }


                switch (alt133) {
            	case 1 :
            	    // InternalDiv.g:6435:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalDiv.g:6435:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDiv.g:6436:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDiv.g:6446:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDiv.g:6447:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDiv.g:6447:6: ()
            	    // InternalDiv.g:6448:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6454:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDiv.g:6455:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDiv.g:6455:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDiv.g:6456:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_80);
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

            	    // InternalDiv.g:6475:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalDiv.g:6476:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalDiv.g:6476:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalDiv.g:6477:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_91);
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalDiv.g:6499:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalDiv.g:6499:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalDiv.g:6500:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalDiv.g:6506:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6512:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalDiv.g:6513:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalDiv.g:6513:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalDiv.g:6514:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_92);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6522:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop134:
            do {
                int alt134=2;
                switch ( input.LA(1) ) {
                case 67:
                    {
                    int LA134_2 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt134=1;
                    }


                    }
                    break;
                case 127:
                    {
                    int LA134_3 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt134=1;
                    }


                    }
                    break;
                case 128:
                    {
                    int LA134_4 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt134=1;
                    }


                    }
                    break;
                case 129:
                    {
                    int LA134_5 = input.LA(2);

                    if ( (synpred11_InternalDiv()) ) {
                        alt134=1;
                    }


                    }
                    break;

                }

                switch (alt134) {
            	case 1 :
            	    // InternalDiv.g:6523:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalDiv.g:6523:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDiv.g:6524:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDiv.g:6534:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDiv.g:6535:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDiv.g:6535:6: ()
            	    // InternalDiv.g:6536:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDiv.g:6542:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDiv.g:6543:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDiv.g:6543:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDiv.g:6544:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_80);
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

            	    // InternalDiv.g:6563:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalDiv.g:6564:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalDiv.g:6564:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalDiv.g:6565:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_92);
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
    // $ANTLR end "ruleDmxMultiplicativeExpression"


    // $ANTLR start "entryRuleDmxUnaryOperation"
    // InternalDiv.g:6587:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalDiv.g:6587:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalDiv.g:6588:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalDiv.g:6594:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDiv.g:6600:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalDiv.g:6601:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalDiv.g:6601:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( ((LA135_0>=92 && LA135_0<=93)||(LA135_0>=130 && LA135_0<=132)) ) {
                alt135=1;
            }
            else if ( (LA135_0==RULE_ID||(LA135_0>=RULE_NATURAL && LA135_0<=RULE_STRING)||LA135_0==22||LA135_0==34||LA135_0==36||LA135_0==55||LA135_0==75||LA135_0==79||(LA135_0>=84 && LA135_0<=89)) ) {
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
                    // InternalDiv.g:6602:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalDiv.g:6602:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalDiv.g:6603:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalDiv.g:6603:4: ()
                    // InternalDiv.g:6604:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDiv.g:6610:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDiv.g:6611:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDiv.g:6611:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDiv.g:6612:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_80);
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

                    // InternalDiv.g:6629:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalDiv.g:6630:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalDiv.g:6630:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalDiv.g:6631:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalDiv.g:6650:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalDiv.g:6662:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalDiv.g:6662:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalDiv.g:6663:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalDiv.g:6669:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6675:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDiv.g:6676:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDiv.g:6676:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDiv.g:6677:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_93);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:6685:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==73) ) {
                int LA136_1 = input.LA(2);

                if ( (synpred12_InternalDiv()) ) {
                    alt136=1;
                }
            }
            else if ( (LA136_0==24) ) {
                int LA136_2 = input.LA(2);

                if ( (synpred12_InternalDiv()) ) {
                    alt136=1;
                }
            }
            switch (alt136) {
                case 1 :
                    // InternalDiv.g:6686:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDiv.g:6686:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalDiv.g:6687:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalDiv.g:6693:5: ( () ruleDmxOpCast )
                    // InternalDiv.g:6694:6: () ruleDmxOpCast
                    {
                    // InternalDiv.g:6694:6: ()
                    // InternalDiv.g:6695:7: 
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

                    // InternalDiv.g:6710:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDiv.g:6711:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDiv.g:6711:5: (otherlv_3= RULE_ID )
                    // InternalDiv.g:6712:6: otherlv_3= RULE_ID
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
    // InternalDiv.g:6728:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalDiv.g:6728:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalDiv.g:6729:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalDiv.g:6735:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:6741:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDiv.g:6742:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDiv.g:6742:2: (kw= 'AS' | kw= 'as' )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==73) ) {
                alt137=1;
            }
            else if ( (LA137_0==24) ) {
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
                    // InternalDiv.g:6743:3: kw= 'AS'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:6749:3: kw= 'as'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:6758:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalDiv.g:6758:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalDiv.g:6759:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalDiv.g:6765:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalDiv.g:6771:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalDiv.g:6772:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalDiv.g:6772:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt138=7;
            switch ( input.LA(1) ) {
            case RULE_NATURAL:
            case RULE_STRING:
            case 34:
            case 36:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                {
                alt138=1;
                }
                break;
            case 55:
                {
                alt138=2;
                }
                break;
            case 22:
                {
                alt138=3;
                }
                break;
            case RULE_ID:
                {
                int LA138_4 = input.LA(2);

                if ( (LA138_4==EOF||(LA138_4>=RULE_ID && LA138_4<=RULE_RICH_TEXT_END)||(LA138_4>=23 && LA138_4<=24)||LA138_4==26||(LA138_4>=28 && LA138_4<=32)||LA138_4==34||LA138_4==36||LA138_4==39||LA138_4==41||LA138_4==43||(LA138_4>=47 && LA138_4<=48)||LA138_4==52||LA138_4==56||LA138_4==62||(LA138_4>=67 && LA138_4<=69)||(LA138_4>=71 && LA138_4<=74)||(LA138_4>=80 && LA138_4<=83)||(LA138_4>=92 && LA138_4<=93)||(LA138_4>=95 && LA138_4<=96)||(LA138_4>=110 && LA138_4<=129)) ) {
                    alt138=6;
                }
                else if ( (LA138_4==55) ) {
                    alt138=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 138, 4, input);

                    throw nvae;
                }
                }
                break;
            case 75:
                {
                alt138=5;
                }
                break;
            case 79:
                {
                alt138=7;
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
                    // InternalDiv.g:6773:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalDiv.g:6782:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalDiv.g:6791:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalDiv.g:6800:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalDiv.g:6809:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalDiv.g:6818:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalDiv.g:6827:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalDiv.g:6839:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalDiv.g:6839:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalDiv.g:6840:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalDiv.g:6846:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalDiv.g:6852:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalDiv.g:6853:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalDiv.g:6853:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt139=7;
            alt139 = dfa139.predict(input);
            switch (alt139) {
                case 1 :
                    // InternalDiv.g:6854:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalDiv.g:6863:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalDiv.g:6872:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalDiv.g:6881:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalDiv.g:6890:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalDiv.g:6899:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalDiv.g:6908:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalDiv.g:6920:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalDiv.g:6920:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalDiv.g:6921:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalDiv.g:6927:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:6933:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDiv.g:6934:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDiv.g:6934:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDiv.g:6935:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_83);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:6955:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalDiv.g:6955:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalDiv.g:6956:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalDiv.g:6962:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:6968:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDiv.g:6969:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDiv.g:6969:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalDiv.g:6970:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDiv.g:6970:3: ()
            // InternalDiv.g:6971:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDiv.g:6981:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( ((LA141_0>=RULE_ID && LA141_0<=RULE_RICH_TEXT_START)||(LA141_0>=RULE_NATURAL && LA141_0<=RULE_STRING)||LA141_0==22||LA141_0==34||LA141_0==36||LA141_0==55||LA141_0==75||LA141_0==79||(LA141_0>=84 && LA141_0<=89)||(LA141_0>=92 && LA141_0<=93)||(LA141_0>=130 && LA141_0<=132)) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalDiv.g:6982:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalDiv.g:6982:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDiv.g:6983:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDiv.g:6983:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDiv.g:6984:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalDiv.g:7001:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==32) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // InternalDiv.g:7002:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:7006:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDiv.g:7007:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:7007:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDiv.g:7008:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop140;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7035:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalDiv.g:7035:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalDiv.g:7036:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalDiv.g:7042:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7048:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDiv.g:7049:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDiv.g:7049:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalDiv.g:7050:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDiv.g:7050:3: ()
            // InternalDiv.g:7051:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDiv.g:7061:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( ((LA143_0>=RULE_NATURAL && LA143_0<=RULE_STRING)||LA143_0==34||LA143_0==36||(LA143_0>=84 && LA143_0<=89)) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalDiv.g:7062:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalDiv.g:7062:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalDiv.g:7063:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalDiv.g:7063:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalDiv.g:7064:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalDiv.g:7081:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==32) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // InternalDiv.g:7082:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_96); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:7086:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalDiv.g:7087:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalDiv.g:7087:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalDiv.g:7088:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop142;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7115:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalDiv.g:7115:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalDiv.g:7116:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalDiv.g:7122:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7128:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalDiv.g:7129:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalDiv.g:7129:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalDiv.g:7130:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalDiv.g:7130:3: ()
            // InternalDiv.g:7131:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7137:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:7138:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:7138:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:7139:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDiv.g:7154:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalDiv.g:7155:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalDiv.g:7155:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalDiv.g:7156:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_83);
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

            otherlv_4=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7181:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalDiv.g:7181:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalDiv.g:7182:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalDiv.g:7188:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7194:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalDiv.g:7195:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalDiv.g:7195:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalDiv.g:7196:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalDiv.g:7196:3: ()
            // InternalDiv.g:7197:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7203:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=RULE_ID && LA145_0<=RULE_RICH_TEXT_START)||(LA145_0>=RULE_NATURAL && LA145_0<=RULE_STRING)||LA145_0==22||LA145_0==34||LA145_0==36||LA145_0==55||LA145_0==75||LA145_0==79||(LA145_0>=84 && LA145_0<=89)||(LA145_0>=92 && LA145_0<=93)||(LA145_0>=130 && LA145_0<=132)) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalDiv.g:7204:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalDiv.g:7204:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalDiv.g:7205:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalDiv.g:7205:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalDiv.g:7206:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_84);
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

                    // InternalDiv.g:7223:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==32) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalDiv.g:7224:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDiv.g:7228:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalDiv.g:7229:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalDiv.g:7229:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalDiv.g:7230:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_84);
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
                    	    break loop144;
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
    // InternalDiv.g:7253:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalDiv.g:7253:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalDiv.g:7254:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalDiv.g:7260:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:7266:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDiv.g:7267:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDiv.g:7267:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDiv.g:7268:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
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
    // InternalDiv.g:7287:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalDiv.g:7287:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalDiv.g:7288:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalDiv.g:7294:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDiv.g:7300:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDiv.g:7301:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDiv.g:7301:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDiv.g:7302:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
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
    // InternalDiv.g:7322:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7328:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalDiv.g:7329:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalDiv.g:7329:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalDiv.g:7330:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalDiv.g:7330:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:7331:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:7331:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:7332:5: otherlv_0= RULE_ID
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
            pushFollow(FOLLOW_98);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:7350:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==RULE_ID) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // InternalDiv.g:7351:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalDiv.g:7351:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalDiv.g:7352:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_98);
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
            	    break loop146;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7377:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalDiv.g:7377:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalDiv.g:7378:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalDiv.g:7384:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7390:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalDiv.g:7391:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalDiv.g:7391:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalDiv.g:7392:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalDiv.g:7392:3: ( (otherlv_0= RULE_ID ) )
            // InternalDiv.g:7393:4: (otherlv_0= RULE_ID )
            {
            // InternalDiv.g:7393:4: (otherlv_0= RULE_ID )
            // InternalDiv.g:7394:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,74,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalDiv.g:7409:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalDiv.g:7410:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalDiv.g:7410:4: (lv_value_2_0= ruleDExpression )
            // InternalDiv.g:7411:5: lv_value_2_0= ruleDExpression
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
    // InternalDiv.g:7432:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalDiv.g:7432:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalDiv.g:7433:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalDiv.g:7439:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalDiv.g:7445:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalDiv.g:7446:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalDiv.g:7446:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalDiv.g:7447:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalDiv.g:7447:3: ()
            // InternalDiv.g:7448:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalDiv.g:7458:3: ( ( ruleDQualifiedName ) )
            // InternalDiv.g:7459:4: ( ruleDQualifiedName )
            {
            // InternalDiv.g:7459:4: ( ruleDQualifiedName )
            // InternalDiv.g:7460:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_100);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDiv.g:7474:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==76) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalDiv.g:7475:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalDiv.g:7479:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDiv.g:7480:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDiv.g:7480:5: (otherlv_4= RULE_ID )
                    // InternalDiv.g:7481:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDiv.g:7493:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==70) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalDiv.g:7494:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalDiv.g:7498:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==RULE_ID) ) {
                        alt148=1;
                    }
                    else if ( (LA148_0==67) ) {
                        alt148=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 0, input);

                        throw nvae;
                    }
                    switch (alt148) {
                        case 1 :
                            // InternalDiv.g:7499:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalDiv.g:7499:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalDiv.g:7500:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalDiv.g:7500:6: (lv_displayName_6_0= RULE_ID )
                            // InternalDiv.g:7501:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_103); if (state.failed) return current;
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
                            // InternalDiv.g:7518:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalDiv.g:7518:5: ( (lv_plural_7_0= '*' ) )
                            // InternalDiv.g:7519:6: (lv_plural_7_0= '*' )
                            {
                            // InternalDiv.g:7519:6: (lv_plural_7_0= '*' )
                            // InternalDiv.g:7520:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,67,FOLLOW_103); if (state.failed) return current;
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

            // InternalDiv.g:7534:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalDiv.g:7535:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7545:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalDiv.g:7545:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalDiv.g:7546:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalDiv.g:7552:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7558:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalDiv.g:7559:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalDiv.g:7559:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalDiv.g:7560:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalDiv.g:7560:3: ()
            // InternalDiv.g:7561:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7567:3: ( (otherlv_1= RULE_ID ) )
            // InternalDiv.g:7568:4: (otherlv_1= RULE_ID )
            {
            // InternalDiv.g:7568:4: (otherlv_1= RULE_ID )
            // InternalDiv.g:7569:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDiv.g:7580:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt150=3;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==69) ) {
                alt150=1;
            }
            else if ( (LA150_0==68) ) {
                int LA150_2 = input.LA(2);

                if ( (LA150_2==78) ) {
                    alt150=2;
                }
            }
            switch (alt150) {
                case 1 :
                    // InternalDiv.g:7581:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalDiv.g:7581:4: ( (lv_before_2_0= '@before' ) )
                    // InternalDiv.g:7582:5: (lv_before_2_0= '@before' )
                    {
                    // InternalDiv.g:7582:5: (lv_before_2_0= '@before' )
                    // InternalDiv.g:7583:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDiv.g:7596:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalDiv.g:7596:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalDiv.g:7597:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalDiv.g:7601:5: ( (lv_all_4_0= 'all' ) )
                    // InternalDiv.g:7602:6: (lv_all_4_0= 'all' )
                    {
                    // InternalDiv.g:7602:6: (lv_all_4_0= 'all' )
                    // InternalDiv.g:7603:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7621:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalDiv.g:7621:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalDiv.g:7622:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalDiv.g:7628:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDiv.g:7634:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDiv.g:7635:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDiv.g:7635:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDiv.g:7636:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDiv.g:7636:3: ()
            // InternalDiv.g:7637:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDiv.g:7647:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDiv.g:7648:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDiv.g:7648:4: (lv_if_2_0= ruleDExpression )
            // InternalDiv.g:7649:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_106);
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

            otherlv_3=(Token)match(input,80,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDiv.g:7670:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDiv.g:7671:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDiv.g:7671:4: (lv_then_4_0= ruleDExpression )
            // InternalDiv.g:7672:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_107);
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

            // InternalDiv.g:7689:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==81) && (synpred14_InternalDiv())) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalDiv.g:7690:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDiv.g:7690:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDiv.g:7691:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,81,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDiv.g:7697:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDiv.g:7698:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDiv.g:7698:5: (lv_else_6_0= ruleDExpression )
                    // InternalDiv.g:7699:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_108);
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

            otherlv_7=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7725:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDiv.g:7725:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDiv.g:7726:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDiv.g:7732:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalDiv.g:7738:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalDiv.g:7739:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalDiv.g:7739:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==67||LA152_0==92||LA152_0==133) ) {
                alt152=1;
            }
            else if ( (LA152_0==55) ) {
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
                    // InternalDiv.g:7740:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalDiv.g:7740:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalDiv.g:7741:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalDiv.g:7741:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalDiv.g:7742:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalDiv.g:7760:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalDiv.g:7760:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalDiv.g:7761:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalDiv.g:7765:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalDiv.g:7766:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalDiv.g:7766:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalDiv.g:7767:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_110); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,83,FOLLOW_111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalDiv.g:7787:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalDiv.g:7788:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalDiv.g:7788:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalDiv.g:7789:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_83);
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

                    otherlv_5=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7815:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDiv.g:7815:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDiv.g:7816:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDiv.g:7822:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:7828:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDiv.g:7829:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDiv.g:7829:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==RULE_NATURAL) ) {
                alt153=1;
            }
            else if ( (LA153_0==67) ) {
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
                    // InternalDiv.g:7830:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDiv.g:7838:3: kw= '*'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7847:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalDiv.g:7847:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalDiv.g:7848:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalDiv.g:7854:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDiv.g:7860:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDiv.g:7861:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDiv.g:7861:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDiv.g:7862:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDiv.g:7862:3: ()
            // InternalDiv.g:7863:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7869:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt154=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt154=1;
                }
                break;
            case 85:
                {
                alt154=2;
                }
                break;
            case 86:
                {
                alt154=3;
                }
                break;
            case 87:
                {
                alt154=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // InternalDiv.g:7870:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDiv.g:7870:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDiv.g:7871:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDiv.g:7871:5: (lv_value_1_0= 'TRUE' )
                    // InternalDiv.g:7872:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDiv.g:7885:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDiv.g:7885:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDiv.g:7886:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDiv.g:7886:5: (lv_value_2_0= 'true' )
                    // InternalDiv.g:7887:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDiv.g:7900:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDiv.g:7905:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:7914:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalDiv.g:7914:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalDiv.g:7915:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalDiv.g:7921:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDiv.g:7927:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDiv.g:7928:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDiv.g:7928:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDiv.g:7929:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDiv.g:7929:3: ()
            // InternalDiv.g:7930:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7936:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDiv.g:7937:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDiv.g:7937:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDiv.g:7938:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDiv.g:7958:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalDiv.g:7958:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalDiv.g:7959:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalDiv.g:7965:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:7971:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDiv.g:7972:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDiv.g:7972:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDiv.g:7973:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDiv.g:7973:3: ()
            // InternalDiv.g:7974:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:7980:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDiv.g:7981:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDiv.g:7981:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDiv.g:7982:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDiv.g:8003:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalDiv.g:8003:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalDiv.g:8004:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalDiv.g:8010:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDiv.g:8016:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDiv.g:8017:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDiv.g:8017:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDiv.g:8018:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDiv.g:8018:3: ()
            // InternalDiv.g:8019:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:8025:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDiv.g:8026:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDiv.g:8026:4: (lv_value_1_0= RULE_STRING )
            // InternalDiv.g:8027:5: lv_value_1_0= RULE_STRING
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
    // InternalDiv.g:8047:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalDiv.g:8047:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalDiv.g:8048:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalDiv.g:8054:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8060:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDiv.g:8061:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDiv.g:8061:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDiv.g:8062:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDiv.g:8062:3: ()
            // InternalDiv.g:8063:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDiv.g:8069:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==88) ) {
                alt155=1;
            }
            else if ( (LA155_0==89) ) {
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
                    // InternalDiv.g:8070:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDiv.g:8075:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8084:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDiv.g:8084:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDiv.g:8085:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDiv.g:8091:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDiv.g:8097:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDiv.g:8098:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDiv.g:8098:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDiv.g:8099:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDiv.g:8118:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( ((LA158_0>=90 && LA158_0<=91)) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalDiv.g:8119:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDiv.g:8119:4: (kw= 'E' | kw= 'e' )
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==90) ) {
                        alt156=1;
                    }
                    else if ( (LA156_0==91) ) {
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
                            // InternalDiv.g:8120:5: kw= 'E'
                            {
                            kw=(Token)match(input,90,FOLLOW_114); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:8126:5: kw= 'e'
                            {
                            kw=(Token)match(input,91,FOLLOW_114); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDiv.g:8132:4: (kw= '+' | kw= '-' )?
                    int alt157=3;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==92) ) {
                        alt157=1;
                    }
                    else if ( (LA157_0==93) ) {
                        alt157=2;
                    }
                    switch (alt157) {
                        case 1 :
                            // InternalDiv.g:8133:5: kw= '+'
                            {
                            kw=(Token)match(input,92,FOLLOW_109); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDiv.g:8139:5: kw= '-'
                            {
                            kw=(Token)match(input,93,FOLLOW_109); if (state.failed) return current;
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
    // InternalDiv.g:8157:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalDiv.g:8157:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalDiv.g:8158:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
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
    // InternalDiv.g:8164:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDiv.g:8170:2: (kw= '{' )
            // InternalDiv.g:8171:2: kw= '{'
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
    // InternalDiv.g:8179:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDiv.g:8179:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDiv.g:8180:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDiv.g:8186:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDiv.g:8192:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDiv.g:8193:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDiv.g:8193:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDiv.g:8194:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_115);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDiv.g:8204:3: (kw= '.*' )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==94) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalDiv.g:8205:4: kw= '.*'
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
    // InternalDiv.g:8215:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDiv.g:8215:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDiv.g:8216:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDiv.g:8222:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8228:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDiv.g:8229:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDiv.g:8229:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDiv.g:8230:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDiv.g:8237:3: (kw= '.' this_ID_2= RULE_ID )*
            loop160:
            do {
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( (LA160_0==68) ) {
                    alt160=1;
                }


                switch (alt160) {
            	case 1 :
            	    // InternalDiv.g:8238:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_78); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop160;
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
    // InternalDiv.g:8255:1: ruleDEntityNatureAutonomous returns [Enumerator current=null] : (enumLiteral_0= 'autonomous' ) ;
    public final Enumerator ruleDEntityNatureAutonomous() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:8261:2: ( (enumLiteral_0= 'autonomous' ) )
            // InternalDiv.g:8262:2: (enumLiteral_0= 'autonomous' )
            {
            // InternalDiv.g:8262:2: (enumLiteral_0= 'autonomous' )
            // InternalDiv.g:8263:3: enumLiteral_0= 'autonomous'
            {
            enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8272:1: ruleDEntityNatureRelationship returns [Enumerator current=null] : (enumLiteral_0= 'relationship' ) ;
    public final Enumerator ruleDEntityNatureRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:8278:2: ( (enumLiteral_0= 'relationship' ) )
            // InternalDiv.g:8279:2: (enumLiteral_0= 'relationship' )
            {
            // InternalDiv.g:8279:2: (enumLiteral_0= 'relationship' )
            // InternalDiv.g:8280:3: enumLiteral_0= 'relationship'
            {
            enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8289:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:8295:2: ( ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) ) )
            // InternalDiv.g:8296:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            {
            // InternalDiv.g:8296:2: ( (enumLiteral_0= 'references' ) | (enumLiteral_1= 'contains' ) )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==97) ) {
                alt161=1;
            }
            else if ( (LA161_0==53) ) {
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
                    // InternalDiv.g:8297:3: (enumLiteral_0= 'references' )
                    {
                    // InternalDiv.g:8297:3: (enumLiteral_0= 'references' )
                    // InternalDiv.g:8298:4: enumLiteral_0= 'references'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8305:3: (enumLiteral_1= 'contains' )
                    {
                    // InternalDiv.g:8305:3: (enumLiteral_1= 'contains' )
                    // InternalDiv.g:8306:4: enumLiteral_1= 'contains'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8316:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDiv.g:8322:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDiv.g:8323:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDiv.g:8323:2: (enumLiteral_0= 'inverse' )
            // InternalDiv.g:8324:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8333:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalDiv.g:8339:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalDiv.g:8340:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalDiv.g:8340:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt162=11;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt162=1;
                }
                break;
            case 100:
                {
                alt162=2;
                }
                break;
            case 101:
                {
                alt162=3;
                }
                break;
            case 102:
                {
                alt162=4;
                }
                break;
            case 103:
                {
                alt162=5;
                }
                break;
            case 104:
                {
                alt162=6;
                }
                break;
            case 105:
                {
                alt162=7;
                }
                break;
            case 106:
                {
                alt162=8;
                }
                break;
            case 107:
                {
                alt162=9;
                }
                break;
            case 108:
                {
                alt162=10;
                }
                break;
            case 109:
                {
                alt162=11;
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
                    // InternalDiv.g:8341:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalDiv.g:8341:3: (enumLiteral_0= 'VOID' )
                    // InternalDiv.g:8342:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8349:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDiv.g:8349:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDiv.g:8350:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8357:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalDiv.g:8357:3: (enumLiteral_2= 'NUMBER' )
                    // InternalDiv.g:8358:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8365:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalDiv.g:8365:3: (enumLiteral_3= 'TEXT' )
                    // InternalDiv.g:8366:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDiv.g:8373:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalDiv.g:8373:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalDiv.g:8374:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDiv.g:8381:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalDiv.g:8381:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalDiv.g:8382:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDiv.g:8389:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalDiv.g:8389:3: (enumLiteral_6= 'STATE' )
                    // InternalDiv.g:8390:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDiv.g:8397:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalDiv.g:8397:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalDiv.g:8398:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDiv.g:8405:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalDiv.g:8405:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalDiv.g:8406:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDiv.g:8413:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalDiv.g:8413:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalDiv.g:8414:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDiv.g:8421:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalDiv.g:8421:3: (enumLiteral_10= 'SERVICE' )
                    // InternalDiv.g:8422:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8432:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDiv.g:8438:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDiv.g:8439:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDiv.g:8439:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt163=4;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt163=1;
                }
                break;
            case 111:
                {
                alt163=2;
                }
                break;
            case 112:
                {
                alt163=3;
                }
                break;
            case 113:
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
                    // InternalDiv.g:8440:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDiv.g:8440:3: (enumLiteral_0= 'OR' )
                    // InternalDiv.g:8441:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8448:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDiv.g:8448:3: (enumLiteral_1= 'or' )
                    // InternalDiv.g:8449:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8456:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDiv.g:8456:3: (enumLiteral_2= 'XOR' )
                    // InternalDiv.g:8457:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8464:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDiv.g:8464:3: (enumLiteral_3= 'xor' )
                    // InternalDiv.g:8465:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8475:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:8481:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDiv.g:8482:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDiv.g:8482:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==114) ) {
                alt164=1;
            }
            else if ( (LA164_0==115) ) {
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
                    // InternalDiv.g:8483:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDiv.g:8483:3: (enumLiteral_0= 'AND' )
                    // InternalDiv.g:8484:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8491:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDiv.g:8491:3: (enumLiteral_1= 'and' )
                    // InternalDiv.g:8492:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8502:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8508:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDiv.g:8509:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDiv.g:8509:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt165=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt165=1;
                }
                break;
            case 116:
                {
                alt165=2;
                }
                break;
            case 117:
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
                    // InternalDiv.g:8510:3: (enumLiteral_0= '=' )
                    {
                    // InternalDiv.g:8510:3: (enumLiteral_0= '=' )
                    // InternalDiv.g:8511:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8518:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDiv.g:8518:3: (enumLiteral_1= '!=' )
                    // InternalDiv.g:8519:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8526:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDiv.g:8526:3: (enumLiteral_2= '<>' )
                    // InternalDiv.g:8527:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8537:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDiv.g:8543:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDiv.g:8544:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDiv.g:8544:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt166=6;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt166=1;
                }
                break;
            case 119:
                {
                alt166=2;
                }
                break;
            case 120:
                {
                alt166=3;
                }
                break;
            case 121:
                {
                alt166=4;
                }
                break;
            case 122:
                {
                alt166=5;
                }
                break;
            case 123:
                {
                alt166=6;
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
                    // InternalDiv.g:8545:3: (enumLiteral_0= '<' )
                    {
                    // InternalDiv.g:8545:3: (enumLiteral_0= '<' )
                    // InternalDiv.g:8546:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8553:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDiv.g:8553:3: (enumLiteral_1= '<=' )
                    // InternalDiv.g:8554:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8561:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDiv.g:8561:3: (enumLiteral_2= '\\u2264' )
                    // InternalDiv.g:8562:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8569:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDiv.g:8569:3: (enumLiteral_3= '>=' )
                    // InternalDiv.g:8570:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDiv.g:8577:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDiv.g:8577:3: (enumLiteral_4= '\\u2265' )
                    // InternalDiv.g:8578:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDiv.g:8585:3: (enumLiteral_5= '>' )
                    {
                    // InternalDiv.g:8585:3: (enumLiteral_5= '>' )
                    // InternalDiv.g:8586:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8596:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDiv.g:8602:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalDiv.g:8603:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalDiv.g:8603:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt167=5;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt167=1;
                }
                break;
            case 62:
                {
                alt167=2;
                }
                break;
            case 83:
                {
                alt167=3;
                }
                break;
            case 125:
                {
                alt167=4;
                }
                break;
            case 126:
                {
                alt167=5;
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
                    // InternalDiv.g:8604:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDiv.g:8604:3: (enumLiteral_0= 'IN' )
                    // InternalDiv.g:8605:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8612:3: (enumLiteral_1= 'in' )
                    {
                    // InternalDiv.g:8612:3: (enumLiteral_1= 'in' )
                    // InternalDiv.g:8613:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8620:3: (enumLiteral_2= '..' )
                    {
                    // InternalDiv.g:8620:3: (enumLiteral_2= '..' )
                    // InternalDiv.g:8621:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8628:3: (enumLiteral_3= '->' )
                    {
                    // InternalDiv.g:8628:3: (enumLiteral_3= '->' )
                    // InternalDiv.g:8629:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDiv.g:8636:3: (enumLiteral_4= '=>' )
                    {
                    // InternalDiv.g:8636:3: (enumLiteral_4= '=>' )
                    // InternalDiv.g:8637:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8647:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDiv.g:8653:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDiv.g:8654:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDiv.g:8654:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==92) ) {
                alt168=1;
            }
            else if ( (LA168_0==93) ) {
                alt168=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 168, 0, input);

                throw nvae;
            }
            switch (alt168) {
                case 1 :
                    // InternalDiv.g:8655:3: (enumLiteral_0= '+' )
                    {
                    // InternalDiv.g:8655:3: (enumLiteral_0= '+' )
                    // InternalDiv.g:8656:4: enumLiteral_0= '+'
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
                    // InternalDiv.g:8663:3: (enumLiteral_1= '-' )
                    {
                    // InternalDiv.g:8663:3: (enumLiteral_1= '-' )
                    // InternalDiv.g:8664:4: enumLiteral_1= '-'
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
    // InternalDiv.g:8674:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDiv.g:8680:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDiv.g:8681:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDiv.g:8681:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt169=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt169=1;
                }
                break;
            case 127:
                {
                alt169=2;
                }
                break;
            case 128:
                {
                alt169=3;
                }
                break;
            case 129:
                {
                alt169=4;
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
                    // InternalDiv.g:8682:3: (enumLiteral_0= '*' )
                    {
                    // InternalDiv.g:8682:3: (enumLiteral_0= '*' )
                    // InternalDiv.g:8683:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8690:3: (enumLiteral_1= '/' )
                    {
                    // InternalDiv.g:8690:3: (enumLiteral_1= '/' )
                    // InternalDiv.g:8691:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8698:3: (enumLiteral_2= '**' )
                    {
                    // InternalDiv.g:8698:3: (enumLiteral_2= '**' )
                    // InternalDiv.g:8699:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8706:3: (enumLiteral_3= '%' )
                    {
                    // InternalDiv.g:8706:3: (enumLiteral_3= '%' )
                    // InternalDiv.g:8707:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8717:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDiv.g:8723:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDiv.g:8724:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDiv.g:8724:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt170=5;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt170=1;
                }
                break;
            case 93:
                {
                alt170=2;
                }
                break;
            case 130:
                {
                alt170=3;
                }
                break;
            case 131:
                {
                alt170=4;
                }
                break;
            case 132:
                {
                alt170=5;
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
                    // InternalDiv.g:8725:3: (enumLiteral_0= '+' )
                    {
                    // InternalDiv.g:8725:3: (enumLiteral_0= '+' )
                    // InternalDiv.g:8726:4: enumLiteral_0= '+'
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
                    // InternalDiv.g:8733:3: (enumLiteral_1= '-' )
                    {
                    // InternalDiv.g:8733:3: (enumLiteral_1= '-' )
                    // InternalDiv.g:8734:4: enumLiteral_1= '-'
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
                    // InternalDiv.g:8741:3: (enumLiteral_2= '!' )
                    {
                    // InternalDiv.g:8741:3: (enumLiteral_2= '!' )
                    // InternalDiv.g:8742:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDiv.g:8749:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDiv.g:8749:3: (enumLiteral_3= 'NOT' )
                    // InternalDiv.g:8750:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDiv.g:8757:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDiv.g:8757:3: (enumLiteral_4= 'not' )
                    // InternalDiv.g:8758:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
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
    // InternalDiv.g:8768:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDiv.g:8774:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalDiv.g:8775:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalDiv.g:8775:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt171=3;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt171=1;
                }
                break;
            case 92:
                {
                alt171=2;
                }
                break;
            case 67:
                {
                alt171=3;
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
                    // InternalDiv.g:8776:3: (enumLiteral_0= '?' )
                    {
                    // InternalDiv.g:8776:3: (enumLiteral_0= '?' )
                    // InternalDiv.g:8777:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDiv.g:8784:3: (enumLiteral_1= '+' )
                    {
                    // InternalDiv.g:8784:3: (enumLiteral_1= '+' )
                    // InternalDiv.g:8785:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDiv.g:8792:3: (enumLiteral_2= '*' )
                    {
                    // InternalDiv.g:8792:3: (enumLiteral_2= '*' )
                    // InternalDiv.g:8793:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
        // InternalDiv.g:5458:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalDiv.g:5458:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalDiv.g:5458:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalDiv.g:5459:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalDiv.g:5459:7: ()
        // InternalDiv.g:5460:7: 
        {
        }

        match(input,68,FOLLOW_3); if (state.failed) return ;
        // InternalDiv.g:5462:7: ( ( RULE_ID ) )
        // InternalDiv.g:5463:8: ( RULE_ID )
        {
        // InternalDiv.g:5463:8: ( RULE_ID )
        // InternalDiv.g:5464:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_79); if (state.failed) return ;

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
        // InternalDiv.g:5527:6: ( ( () '.' ) )
        // InternalDiv.g:5527:7: ( () '.' )
        {
        // InternalDiv.g:5527:7: ( () '.' )
        // InternalDiv.g:5528:7: () '.'
        {
        // InternalDiv.g:5528:7: ()
        // InternalDiv.g:5529:7: 
        {
        }

        match(input,68,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDiv

    // $ANTLR start synpred3_InternalDiv
    public final void synpred3_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5563:8: ( ( '(' ) )
        // InternalDiv.g:5563:9: ( '(' )
        {
        // InternalDiv.g:5563:9: ( '(' )
        // InternalDiv.g:5564:9: '('
        {
        match(input,55,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDiv

    // $ANTLR start synpred4_InternalDiv
    public final void synpred4_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:5924:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalDiv.g:5924:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalDiv.g:5924:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalDiv.g:5925:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalDiv.g:5925:6: ()
        // InternalDiv.g:5926:6: 
        {
        }

        // InternalDiv.g:5927:6: ( ( ruleDmxOpOr ) )
        // InternalDiv.g:5928:7: ( ruleDmxOpOr )
        {
        // InternalDiv.g:5928:7: ( ruleDmxOpOr )
        // InternalDiv.g:5929:8: ruleDmxOpOr
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
        // InternalDiv.g:6012:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalDiv.g:6012:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalDiv.g:6012:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalDiv.g:6013:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalDiv.g:6013:6: ()
        // InternalDiv.g:6014:6: 
        {
        }

        // InternalDiv.g:6015:6: ( ( ruleDmxOpAnd ) )
        // InternalDiv.g:6016:7: ( ruleDmxOpAnd )
        {
        // InternalDiv.g:6016:7: ( ruleDmxOpAnd )
        // InternalDiv.g:6017:8: ruleDmxOpAnd
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
        // InternalDiv.g:6100:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalDiv.g:6100:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalDiv.g:6100:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalDiv.g:6101:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalDiv.g:6101:6: ()
        // InternalDiv.g:6102:6: 
        {
        }

        // InternalDiv.g:6103:6: ( ( ruleDmxOpEquality ) )
        // InternalDiv.g:6104:7: ( ruleDmxOpEquality )
        {
        // InternalDiv.g:6104:7: ( ruleDmxOpEquality )
        // InternalDiv.g:6105:8: ruleDmxOpEquality
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
        // InternalDiv.g:6189:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalDiv.g:6189:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalDiv.g:6189:7: ( () ruleDmxOpInstanceOf )
        // InternalDiv.g:6190:7: () ruleDmxOpInstanceOf
        {
        // InternalDiv.g:6190:7: ()
        // InternalDiv.g:6191:7: 
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
        // InternalDiv.g:6229:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDiv.g:6229:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDiv.g:6229:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDiv.g:6230:7: () ( ( ruleOpCompare ) )
        {
        // InternalDiv.g:6230:7: ()
        // InternalDiv.g:6231:7: 
        {
        }

        // InternalDiv.g:6232:7: ( ( ruleOpCompare ) )
        // InternalDiv.g:6233:8: ( ruleOpCompare )
        {
        // InternalDiv.g:6233:8: ( ruleOpCompare )
        // InternalDiv.g:6234:9: ruleOpCompare
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
        // InternalDiv.g:6348:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDiv.g:6348:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDiv.g:6348:6: ( () ( ( ruleOpOther ) ) )
        // InternalDiv.g:6349:6: () ( ( ruleOpOther ) )
        {
        // InternalDiv.g:6349:6: ()
        // InternalDiv.g:6350:6: 
        {
        }

        // InternalDiv.g:6351:6: ( ( ruleOpOther ) )
        // InternalDiv.g:6352:7: ( ruleOpOther )
        {
        // InternalDiv.g:6352:7: ( ruleOpOther )
        // InternalDiv.g:6353:8: ruleOpOther
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
        // InternalDiv.g:6436:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDiv.g:6436:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDiv.g:6436:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDiv.g:6437:6: () ( ( ruleOpAdd ) )
        {
        // InternalDiv.g:6437:6: ()
        // InternalDiv.g:6438:6: 
        {
        }

        // InternalDiv.g:6439:6: ( ( ruleOpAdd ) )
        // InternalDiv.g:6440:7: ( ruleOpAdd )
        {
        // InternalDiv.g:6440:7: ( ruleOpAdd )
        // InternalDiv.g:6441:8: ruleOpAdd
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
        // InternalDiv.g:6524:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDiv.g:6524:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDiv.g:6524:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDiv.g:6525:6: () ( ( ruleOpMulti ) )
        {
        // InternalDiv.g:6525:6: ()
        // InternalDiv.g:6526:6: 
        {
        }

        // InternalDiv.g:6527:6: ( ( ruleOpMulti ) )
        // InternalDiv.g:6528:7: ( ruleOpMulti )
        {
        // InternalDiv.g:6528:7: ( ruleOpMulti )
        // InternalDiv.g:6529:8: ruleOpMulti
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
        // InternalDiv.g:6687:5: ( ( () ruleDmxOpCast ) )
        // InternalDiv.g:6687:6: ( () ruleDmxOpCast )
        {
        // InternalDiv.g:6687:6: ( () ruleDmxOpCast )
        // InternalDiv.g:6688:6: () ruleDmxOpCast
        {
        // InternalDiv.g:6688:6: ()
        // InternalDiv.g:6689:6: 
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
        // InternalDiv.g:7535:4: ( ']' )
        // InternalDiv.g:7535:5: ']'
        {
        match(input,77,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalDiv

    // $ANTLR start synpred14_InternalDiv
    public final void synpred14_InternalDiv_fragment() throws RecognitionException {   
        // InternalDiv.g:7691:5: ( 'else' )
        // InternalDiv.g:7691:6: 'else'
        {
        match(input,81,FOLLOW_2); if (state.failed) return ;

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


    protected DFA84 dfa84 = new DFA84(this);
    protected DFA130 dfa130 = new DFA130(this);
    protected DFA139 dfa139 = new DFA139(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\54\1\uffff\1\4\1\uffff\1\54";
    static final String dfa_3s = "\1\64\1\uffff\1\142\1\uffff\1\4\1\uffff\1\142";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\37\uffff\1\3\17\uffff\1\1",
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

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3719:2: (this_DimAssociation_0= ruleDimAssociation | this_DimAttribute_1= ruleDimAttribute | this_DimQuery_2= ruleDimQuery )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\u0081\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\3\1\4\1\5\1\1\1\0\1\7\1\6\1\2\2\uffff}>";
    static final String[] dfa_13s = {
            "\5\1\16\uffff\2\1\1\uffff\1\1\1\uffff\5\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\2\1\3\uffff\1\1\3\uffff\1\1\5\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\2\1\5\uffff\4\1\10\uffff\2\1\1\uffff\2\1\15\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA130 extends DFA {

        public DFA130(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 130;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 6186:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA130_6 = input.LA(1);

                         
                        int index130_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index130_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA130_5 = input.LA(1);

                         
                        int index130_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index130_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA130_9 = input.LA(1);

                         
                        int index130_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index130_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA130_2 = input.LA(1);

                         
                        int index130_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDiv()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index130_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA130_3 = input.LA(1);

                         
                        int index130_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDiv()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index130_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA130_4 = input.LA(1);

                         
                        int index130_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index130_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA130_8 = input.LA(1);

                         
                        int index130_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index130_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA130_7 = input.LA(1);

                         
                        int index130_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDiv()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index130_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 130, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\3\uffff\1\10\6\uffff";
    static final String dfa_16s = "\1\11\2\uffff\1\4\3\uffff\1\4\2\uffff";
    static final String dfa_17s = "\1\131\2\uffff\1\u0081\3\uffff\1\11\2\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\3\1\4";
    static final String dfa_19s = "\12\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\1\2\27\uffff\1\5\1\uffff\1\6\57\uffff\4\1\2\4",
            "",
            "",
            "\5\10\15\uffff\3\10\1\uffff\1\10\1\uffff\5\10\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\1\uffff\1\10\3\uffff\2\10\3\uffff\1\10\3\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\7\2\uffff\4\10\5\uffff\4\10\10\uffff\2\10\1\uffff\2\10\15\uffff\24\10",
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

    class DFA139 extends DFA {

        public DFA139(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 139;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "6853:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040824800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400062L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000824800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000064800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000140800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008064800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000011000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001821490800000L,0x0000000180000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001801490800000L,0x0000000180000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080001400400670L,0x0000000033F08800L,0x000000000000001CL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000400060L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000800010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080100800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000062L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001800400000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0012081000800010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0014081000800010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010081000800010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008100000000062L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020100000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000072L,0x0000000010000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000062L,0x0000000010000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00C0000000000072L,0x0000000010000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00C0000000000062L,0x0000000010000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000062L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000100000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0280000000000072L,0x0000000010000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0280000000000062L,0x0000000010000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0200000000000062L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1000000000400000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x2080000000000002L,0x0000000010000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000001400400600L,0x0000000003F00000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x00003FF800000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000010L,0x00003FF800000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0080001400400610L,0x0000000033F08800L,0x000000000000001CL});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0180001400400610L,0x0000000033F08800L,0x000000000000001CL});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0003C00000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000400L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0FC0000000000180L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x4000000000000002L,0x7000000000080000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000001000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0080001400C00670L,0x0000000033F08800L,0x000000000000001CL});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000001400800600L,0x0000000003F00000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000001400000600L,0x0000000003F00000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0180001400400670L,0x0000000033F08800L,0x000000000000001CL});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000008L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000200L,0x0000000030000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});

}