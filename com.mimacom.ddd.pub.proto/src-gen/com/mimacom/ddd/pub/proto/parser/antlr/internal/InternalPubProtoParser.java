package com.mimacom.ddd.pub.proto.parser.antlr.internal;

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
import com.mimacom.ddd.pub.proto.services.PubProtoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPubProtoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NATURAL", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'publication'", "'class'", "'nature:'", "'symbol:'", "'htmlPreamble:'", "'latexClass:'", "'latexPreamble:'", "'segments:'", "'divisions:'", "'title:'", "'optional:'", "'true'", "'false'", "'Abstract'", "'{'", "'}'", "'Preface'", "'Epilogue'", "'Body'", "'ChangeHistory'", "'TableOfContents'", "'maxLevel:'", "'Abbreviations'", "'ListOfTables'", "'ListOfFigures'", "'Bibliography'", "'Glossary'", "'Index'", "'numbering:'", "'Part'", "'Appendix'", "'Chapter'", "'Section'", "'Sub'", "'Subsub'", "'NOTE'", "'import'", "'test'", "'context'", "','", "':'", "':='", "'in'", "'('", "')'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'as'", "'entity'", "'detail'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'FALSE'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'Print'", "'Web'", "'arabic'", "'capitalLetter'", "'smallLetter'", "'capitalRoman'", "'smallRoman'", "'none'", "'white'", "'red'", "'orange'", "'yellow'", "'green'", "'blue'", "'pink'", "'grey'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int RULE_PLAIN_TEXT_ONLY=7;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_RICH_TEXT_START=8;
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
    public static final int RULE_NATURAL=6;
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
    public static final int RULE_STRING=5;
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
    public static final int RULE_RICH_TEXT_END=10;
    public static final int RULE_RICH_TEXT_MIDDLE=9;
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


        public InternalPubProtoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPubProtoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPubProtoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPubProto.g"; }



     	private PubProtoGrammarAccess grammarAccess;

        public InternalPubProtoParser(TokenStream input, PubProtoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PublicationClass";
       	}

       	@Override
       	protected PubProtoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePublicationClass"
    // InternalPubProto.g:65:1: entryRulePublicationClass returns [EObject current=null] : iv_rulePublicationClass= rulePublicationClass EOF ;
    public final EObject entryRulePublicationClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicationClass = null;


        try {
            // InternalPubProto.g:65:57: (iv_rulePublicationClass= rulePublicationClass EOF )
            // InternalPubProto.g:66:2: iv_rulePublicationClass= rulePublicationClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPublicationClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePublicationClass=rulePublicationClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePublicationClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublicationClass"


    // $ANTLR start "rulePublicationClass"
    // InternalPubProto.g:72:1: rulePublicationClass returns [EObject current=null] : ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'htmlPreamble:' ( (lv_htmlPreamble_9_0= ruleDRichText ) ) )? (otherlv_10= 'latexClass:' ( (lv_laTeXClass_11_0= RULE_ID ) ) )? (otherlv_12= 'latexPreamble:' ( (lv_laTeXPreamble_13_0= ruleDRichText ) ) )? otherlv_14= 'segments:' ( (lv_segments_15_0= ruleProtoDocumentSegment ) )* otherlv_16= 'divisions:' ( (lv_divisions_17_0= ruleProtoDivision ) )* ) ;
    public final EObject rulePublicationClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_laTeXClass_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Enumerator lv_nature_5_0 = null;

        EObject lv_symbols_7_0 = null;

        EObject lv_htmlPreamble_9_0 = null;

        EObject lv_laTeXPreamble_13_0 = null;

        EObject lv_segments_15_0 = null;

        EObject lv_divisions_17_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:78:2: ( ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'htmlPreamble:' ( (lv_htmlPreamble_9_0= ruleDRichText ) ) )? (otherlv_10= 'latexClass:' ( (lv_laTeXClass_11_0= RULE_ID ) ) )? (otherlv_12= 'latexPreamble:' ( (lv_laTeXPreamble_13_0= ruleDRichText ) ) )? otherlv_14= 'segments:' ( (lv_segments_15_0= ruleProtoDocumentSegment ) )* otherlv_16= 'divisions:' ( (lv_divisions_17_0= ruleProtoDivision ) )* ) )
            // InternalPubProto.g:79:2: ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'htmlPreamble:' ( (lv_htmlPreamble_9_0= ruleDRichText ) ) )? (otherlv_10= 'latexClass:' ( (lv_laTeXClass_11_0= RULE_ID ) ) )? (otherlv_12= 'latexPreamble:' ( (lv_laTeXPreamble_13_0= ruleDRichText ) ) )? otherlv_14= 'segments:' ( (lv_segments_15_0= ruleProtoDocumentSegment ) )* otherlv_16= 'divisions:' ( (lv_divisions_17_0= ruleProtoDivision ) )* )
            {
            // InternalPubProto.g:79:2: ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'htmlPreamble:' ( (lv_htmlPreamble_9_0= ruleDRichText ) ) )? (otherlv_10= 'latexClass:' ( (lv_laTeXClass_11_0= RULE_ID ) ) )? (otherlv_12= 'latexPreamble:' ( (lv_laTeXPreamble_13_0= ruleDRichText ) ) )? otherlv_14= 'segments:' ( (lv_segments_15_0= ruleProtoDocumentSegment ) )* otherlv_16= 'divisions:' ( (lv_divisions_17_0= ruleProtoDivision ) )* )
            // InternalPubProto.g:80:3: () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'htmlPreamble:' ( (lv_htmlPreamble_9_0= ruleDRichText ) ) )? (otherlv_10= 'latexClass:' ( (lv_laTeXClass_11_0= RULE_ID ) ) )? (otherlv_12= 'latexPreamble:' ( (lv_laTeXPreamble_13_0= ruleDRichText ) ) )? otherlv_14= 'segments:' ( (lv_segments_15_0= ruleProtoDocumentSegment ) )* otherlv_16= 'divisions:' ( (lv_divisions_17_0= ruleProtoDivision ) )*
            {
            // InternalPubProto.g:80:3: ()
            // InternalPubProto.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPublicationClassAccess().getPublicationClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPublicationClassAccess().getPublicationKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPublicationClassAccess().getClassKeyword_2());
              		
            }
            // InternalPubProto.g:95:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalPubProto.g:96:4: (lv_name_3_0= RULE_ID )
            {
            // InternalPubProto.g:96:4: (lv_name_3_0= RULE_ID )
            // InternalPubProto.g:97:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getPublicationClassAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPublicationClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPublicationClassAccess().getNatureKeyword_4());
              		
            }
            // InternalPubProto.g:117:3: ( (lv_nature_5_0= rulePublicationNature ) )
            // InternalPubProto.g:118:4: (lv_nature_5_0= rulePublicationNature )
            {
            // InternalPubProto.g:118:4: (lv_nature_5_0= rulePublicationNature )
            // InternalPubProto.g:119:5: lv_nature_5_0= rulePublicationNature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPublicationClassAccess().getNaturePublicationNatureEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_nature_5_0=rulePublicationNature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPublicationClassRule());
              					}
              					set(
              						current,
              						"nature",
              						lv_nature_5_0,
              						"com.mimacom.ddd.pub.proto.PubProto.PublicationNature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPubProto.g:136:3: (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPubProto.g:137:4: otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getPublicationClassAccess().getSymbolKeyword_6_0());
            	      			
            	    }
            	    // InternalPubProto.g:141:4: ( (lv_symbols_7_0= ruleProtoSymbol ) )
            	    // InternalPubProto.g:142:5: (lv_symbols_7_0= ruleProtoSymbol )
            	    {
            	    // InternalPubProto.g:142:5: (lv_symbols_7_0= ruleProtoSymbol )
            	    // InternalPubProto.g:143:6: lv_symbols_7_0= ruleProtoSymbol
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPublicationClassAccess().getSymbolsProtoSymbolParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_symbols_7_0=ruleProtoSymbol();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPublicationClassRule());
            	      						}
            	      						add(
            	      							current,
            	      							"symbols",
            	      							lv_symbols_7_0,
            	      							"com.mimacom.ddd.pub.proto.PubProto.ProtoSymbol");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPubProto.g:161:3: (otherlv_8= 'htmlPreamble:' ( (lv_htmlPreamble_9_0= ruleDRichText ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPubProto.g:162:4: otherlv_8= 'htmlPreamble:' ( (lv_htmlPreamble_9_0= ruleDRichText ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPublicationClassAccess().getHtmlPreambleKeyword_7_0());
                      			
                    }
                    // InternalPubProto.g:166:4: ( (lv_htmlPreamble_9_0= ruleDRichText ) )
                    // InternalPubProto.g:167:5: (lv_htmlPreamble_9_0= ruleDRichText )
                    {
                    // InternalPubProto.g:167:5: (lv_htmlPreamble_9_0= ruleDRichText )
                    // InternalPubProto.g:168:6: lv_htmlPreamble_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPublicationClassAccess().getHtmlPreambleDRichTextParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_htmlPreamble_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPublicationClassRule());
                      						}
                      						set(
                      							current,
                      							"htmlPreamble",
                      							lv_htmlPreamble_9_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:186:3: (otherlv_10= 'latexClass:' ( (lv_laTeXClass_11_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPubProto.g:187:4: otherlv_10= 'latexClass:' ( (lv_laTeXClass_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPublicationClassAccess().getLatexClassKeyword_8_0());
                      			
                    }
                    // InternalPubProto.g:191:4: ( (lv_laTeXClass_11_0= RULE_ID ) )
                    // InternalPubProto.g:192:5: (lv_laTeXClass_11_0= RULE_ID )
                    {
                    // InternalPubProto.g:192:5: (lv_laTeXClass_11_0= RULE_ID )
                    // InternalPubProto.g:193:6: lv_laTeXClass_11_0= RULE_ID
                    {
                    lv_laTeXClass_11_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_laTeXClass_11_0, grammarAccess.getPublicationClassAccess().getLaTeXClassIDTerminalRuleCall_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPublicationClassRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"laTeXClass",
                      							lv_laTeXClass_11_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:210:3: (otherlv_12= 'latexPreamble:' ( (lv_laTeXPreamble_13_0= ruleDRichText ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPubProto.g:211:4: otherlv_12= 'latexPreamble:' ( (lv_laTeXPreamble_13_0= ruleDRichText ) )
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getPublicationClassAccess().getLatexPreambleKeyword_9_0());
                      			
                    }
                    // InternalPubProto.g:215:4: ( (lv_laTeXPreamble_13_0= ruleDRichText ) )
                    // InternalPubProto.g:216:5: (lv_laTeXPreamble_13_0= ruleDRichText )
                    {
                    // InternalPubProto.g:216:5: (lv_laTeXPreamble_13_0= ruleDRichText )
                    // InternalPubProto.g:217:6: lv_laTeXPreamble_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPublicationClassAccess().getLaTeXPreambleDRichTextParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_laTeXPreamble_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPublicationClassRule());
                      						}
                      						set(
                      							current,
                      							"laTeXPreamble",
                      							lv_laTeXPreamble_13_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,24,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getPublicationClassAccess().getSegmentsKeyword_10());
              		
            }
            // InternalPubProto.g:239:3: ( (lv_segments_15_0= ruleProtoDocumentSegment ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30||(LA5_0>=33 && LA5_0<=37)||(LA5_0>=39 && LA5_0<=44)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPubProto.g:240:4: (lv_segments_15_0= ruleProtoDocumentSegment )
            	    {
            	    // InternalPubProto.g:240:4: (lv_segments_15_0= ruleProtoDocumentSegment )
            	    // InternalPubProto.g:241:5: lv_segments_15_0= ruleProtoDocumentSegment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPublicationClassAccess().getSegmentsProtoDocumentSegmentParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_segments_15_0=ruleProtoDocumentSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPublicationClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"segments",
            	      						lv_segments_15_0,
            	      						"com.mimacom.ddd.pub.proto.PubProto.ProtoDocumentSegment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_16=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getPublicationClassAccess().getDivisionsKeyword_12());
              		
            }
            // InternalPubProto.g:262:3: ( (lv_divisions_17_0= ruleProtoDivision ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=46 && LA6_0<=51)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPubProto.g:263:4: (lv_divisions_17_0= ruleProtoDivision )
            	    {
            	    // InternalPubProto.g:263:4: (lv_divisions_17_0= ruleProtoDivision )
            	    // InternalPubProto.g:264:5: lv_divisions_17_0= ruleProtoDivision
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPublicationClassAccess().getDivisionsProtoDivisionParserRuleCall_13_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_divisions_17_0=ruleProtoDivision();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPublicationClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"divisions",
            	      						lv_divisions_17_0,
            	      						"com.mimacom.ddd.pub.proto.PubProto.ProtoDivision");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "rulePublicationClass"


    // $ANTLR start "entryRuleProtoSymbol"
    // InternalPubProto.g:285:1: entryRuleProtoSymbol returns [EObject current=null] : iv_ruleProtoSymbol= ruleProtoSymbol EOF ;
    public final EObject entryRuleProtoSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSymbol = null;


        try {
            // InternalPubProto.g:285:52: (iv_ruleProtoSymbol= ruleProtoSymbol EOF )
            // InternalPubProto.g:286:2: iv_ruleProtoSymbol= ruleProtoSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoSymbol=ruleProtoSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoSymbol; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoSymbol"


    // $ANTLR start "ruleProtoSymbol"
    // InternalPubProto.g:292:1: ruleProtoSymbol returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProtoSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:298:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPubProto.g:299:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPubProto.g:299:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:300:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:300:3: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:301:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getProtoSymbolAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProtoSymbolRule());
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
    // $ANTLR end "ruleProtoSymbol"


    // $ANTLR start "entryRuleDExpression"
    // InternalPubProto.g:320:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalPubProto.g:320:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalPubProto.g:321:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalPubProto.g:327:1: ruleDExpression returns [EObject current=null] : this_ProtoSymbolReference_0= ruleProtoSymbolReference ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ProtoSymbolReference_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:333:2: (this_ProtoSymbolReference_0= ruleProtoSymbolReference )
            // InternalPubProto.g:334:2: this_ProtoSymbolReference_0= ruleProtoSymbolReference
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getDExpressionAccess().getProtoSymbolReferenceParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ProtoSymbolReference_0=ruleProtoSymbolReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ProtoSymbolReference_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleProtoSymbolReference"
    // InternalPubProto.g:345:1: entryRuleProtoSymbolReference returns [EObject current=null] : iv_ruleProtoSymbolReference= ruleProtoSymbolReference EOF ;
    public final EObject entryRuleProtoSymbolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSymbolReference = null;


        try {
            // InternalPubProto.g:345:61: (iv_ruleProtoSymbolReference= ruleProtoSymbolReference EOF )
            // InternalPubProto.g:346:2: iv_ruleProtoSymbolReference= ruleProtoSymbolReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoSymbolReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoSymbolReference=ruleProtoSymbolReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoSymbolReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoSymbolReference"


    // $ANTLR start "ruleProtoSymbolReference"
    // InternalPubProto.g:352:1: ruleProtoSymbolReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleProtoSymbolReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:358:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPubProto.g:359:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPubProto.g:359:2: ( (otherlv_0= RULE_ID ) )
            // InternalPubProto.g:360:3: (otherlv_0= RULE_ID )
            {
            // InternalPubProto.g:360:3: (otherlv_0= RULE_ID )
            // InternalPubProto.g:361:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProtoSymbolReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getProtoSymbolReferenceAccess().getTargetProtoSymbolCrossReference_0());
              			
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
    // $ANTLR end "ruleProtoSymbolReference"


    // $ANTLR start "entryRuleProtoDocumentSegment"
    // InternalPubProto.g:375:1: entryRuleProtoDocumentSegment returns [EObject current=null] : iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF ;
    public final EObject entryRuleProtoDocumentSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoDocumentSegment = null;


        try {
            // InternalPubProto.g:375:61: (iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF )
            // InternalPubProto.g:376:2: iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoDocumentSegmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoDocumentSegment=ruleProtoDocumentSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoDocumentSegment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoDocumentSegment"


    // $ANTLR start "ruleProtoDocumentSegment"
    // InternalPubProto.g:382:1: ruleProtoDocumentSegment returns [EObject current=null] : (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex ) ;
    public final EObject ruleProtoDocumentSegment() throws RecognitionException {
        EObject current = null;

        EObject this_ProtoAbstract_0 = null;

        EObject this_ProtoPreface_1 = null;

        EObject this_ProtoPublicationBody_2 = null;

        EObject this_ProtoEpilogue_3 = null;

        EObject this_ProtoChangeHistory_4 = null;

        EObject this_ProtoTOC_5 = null;

        EObject this_ProtoAbbreviations_6 = null;

        EObject this_ProtoListOfTables_7 = null;

        EObject this_ProtoListOfFigures_8 = null;

        EObject this_ProtoBibliography_9 = null;

        EObject this_ProtoGlossary_10 = null;

        EObject this_ProtoIndex_11 = null;



        	enterRule();

        try {
            // InternalPubProto.g:388:2: ( (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex ) )
            // InternalPubProto.g:389:2: (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex )
            {
            // InternalPubProto.g:389:2: (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 36:
                {
                alt7=5;
                }
                break;
            case 37:
                {
                alt7=6;
                }
                break;
            case 39:
                {
                alt7=7;
                }
                break;
            case 40:
                {
                alt7=8;
                }
                break;
            case 41:
                {
                alt7=9;
                }
                break;
            case 42:
                {
                alt7=10;
                }
                break;
            case 43:
                {
                alt7=11;
                }
                break;
            case 44:
                {
                alt7=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPubProto.g:390:3: this_ProtoAbstract_0= ruleProtoAbstract
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoAbstractParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoAbstract_0=ruleProtoAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoAbstract_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:399:3: this_ProtoPreface_1= ruleProtoPreface
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoPrefaceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoPreface_1=ruleProtoPreface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoPreface_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPubProto.g:408:3: this_ProtoPublicationBody_2= ruleProtoPublicationBody
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoPublicationBodyParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoPublicationBody_2=ruleProtoPublicationBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoPublicationBody_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPubProto.g:417:3: this_ProtoEpilogue_3= ruleProtoEpilogue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoEpilogueParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoEpilogue_3=ruleProtoEpilogue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoEpilogue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPubProto.g:426:3: this_ProtoChangeHistory_4= ruleProtoChangeHistory
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoChangeHistoryParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoChangeHistory_4=ruleProtoChangeHistory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoChangeHistory_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPubProto.g:435:3: this_ProtoTOC_5= ruleProtoTOC
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoTOCParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoTOC_5=ruleProtoTOC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoTOC_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalPubProto.g:444:3: this_ProtoAbbreviations_6= ruleProtoAbbreviations
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoAbbreviationsParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoAbbreviations_6=ruleProtoAbbreviations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoAbbreviations_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalPubProto.g:453:3: this_ProtoListOfTables_7= ruleProtoListOfTables
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoListOfTablesParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoListOfTables_7=ruleProtoListOfTables();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoListOfTables_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalPubProto.g:462:3: this_ProtoListOfFigures_8= ruleProtoListOfFigures
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoListOfFiguresParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoListOfFigures_8=ruleProtoListOfFigures();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoListOfFigures_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalPubProto.g:471:3: this_ProtoBibliography_9= ruleProtoBibliography
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoBibliographyParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoBibliography_9=ruleProtoBibliography();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoBibliography_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalPubProto.g:480:3: this_ProtoGlossary_10= ruleProtoGlossary
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoGlossaryParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoGlossary_10=ruleProtoGlossary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoGlossary_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalPubProto.g:489:3: this_ProtoIndex_11= ruleProtoIndex
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoIndexParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoIndex_11=ruleProtoIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoIndex_11;
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
    // $ANTLR end "ruleProtoDocumentSegment"


    // $ANTLR start "ruleSegmentBody"
    // InternalPubProto.g:502:1: ruleSegmentBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? ) ;
    public final EObject ruleSegmentBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token lv_optional_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:508:2: ( ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? ) )
            // InternalPubProto.g:509:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? )
            {
            // InternalPubProto.g:509:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? )
            // InternalPubProto.g:510:3: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )?
            {
            // InternalPubProto.g:510:3: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPubProto.g:511:4: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSegmentBodyAccess().getTitleKeyword_0_0());
                      			
                    }
                    // InternalPubProto.g:515:4: ( (lv_title_1_0= RULE_STRING ) )
                    // InternalPubProto.g:516:5: (lv_title_1_0= RULE_STRING )
                    {
                    // InternalPubProto.g:516:5: (lv_title_1_0= RULE_STRING )
                    // InternalPubProto.g:517:6: lv_title_1_0= RULE_STRING
                    {
                    lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_title_1_0, grammarAccess.getSegmentBodyAccess().getTitleSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSegmentBodyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"title",
                      							lv_title_1_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:534:3: (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPubProto.g:535:4: otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSegmentBodyAccess().getOptionalKeyword_1_0());
                      			
                    }
                    // InternalPubProto.g:539:4: ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==28) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==29) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPubProto.g:540:5: ( (lv_optional_3_0= 'true' ) )
                            {
                            // InternalPubProto.g:540:5: ( (lv_optional_3_0= 'true' ) )
                            // InternalPubProto.g:541:6: (lv_optional_3_0= 'true' )
                            {
                            // InternalPubProto.g:541:6: (lv_optional_3_0= 'true' )
                            // InternalPubProto.g:542:7: lv_optional_3_0= 'true'
                            {
                            lv_optional_3_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_optional_3_0, grammarAccess.getSegmentBodyAccess().getOptionalTrueKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSegmentBodyRule());
                              							}
                              							setWithLastConsumed(current, "optional", true, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:555:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSegmentBodyAccess().getFalseKeyword_1_1_1());
                              				
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
    // $ANTLR end "ruleSegmentBody"


    // $ANTLR start "entryRuleProtoAbstract"
    // InternalPubProto.g:565:1: entryRuleProtoAbstract returns [EObject current=null] : iv_ruleProtoAbstract= ruleProtoAbstract EOF ;
    public final EObject entryRuleProtoAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAbstract = null;


        try {
            // InternalPubProto.g:565:54: (iv_ruleProtoAbstract= ruleProtoAbstract EOF )
            // InternalPubProto.g:566:2: iv_ruleProtoAbstract= ruleProtoAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoAbstract=ruleProtoAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoAbstract"


    // $ANTLR start "ruleProtoAbstract"
    // InternalPubProto.g:572:1: ruleProtoAbstract returns [EObject current=null] : ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:578:2: ( ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:579:2: ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:579:2: ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:580:3: () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:580:3: ()
            // InternalPubProto.g:581:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoAbstractAccess().getProtoAbstractAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoAbstractAccess().getAbstractKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoAbstractAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoAbstractRule());
              			}
              			newCompositeNode(grammarAccess.getProtoAbstractAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoAbstractAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoAbstract"


    // $ANTLR start "entryRuleProtoPreface"
    // InternalPubProto.g:614:1: entryRuleProtoPreface returns [EObject current=null] : iv_ruleProtoPreface= ruleProtoPreface EOF ;
    public final EObject entryRuleProtoPreface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPreface = null;


        try {
            // InternalPubProto.g:614:53: (iv_ruleProtoPreface= ruleProtoPreface EOF )
            // InternalPubProto.g:615:2: iv_ruleProtoPreface= ruleProtoPreface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoPrefaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoPreface=ruleProtoPreface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoPreface; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoPreface"


    // $ANTLR start "ruleProtoPreface"
    // InternalPubProto.g:621:1: ruleProtoPreface returns [EObject current=null] : ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoPreface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:627:2: ( ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:628:2: ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:628:2: ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:629:3: () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:629:3: ()
            // InternalPubProto.g:630:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoPrefaceAccess().getProtoPrefaceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoPrefaceAccess().getPrefaceKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoPrefaceAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoPrefaceRule());
              			}
              			newCompositeNode(grammarAccess.getProtoPrefaceAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoPrefaceAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoPreface"


    // $ANTLR start "entryRuleProtoEpilogue"
    // InternalPubProto.g:663:1: entryRuleProtoEpilogue returns [EObject current=null] : iv_ruleProtoEpilogue= ruleProtoEpilogue EOF ;
    public final EObject entryRuleProtoEpilogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoEpilogue = null;


        try {
            // InternalPubProto.g:663:54: (iv_ruleProtoEpilogue= ruleProtoEpilogue EOF )
            // InternalPubProto.g:664:2: iv_ruleProtoEpilogue= ruleProtoEpilogue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoEpilogueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoEpilogue=ruleProtoEpilogue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoEpilogue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoEpilogue"


    // $ANTLR start "ruleProtoEpilogue"
    // InternalPubProto.g:670:1: ruleProtoEpilogue returns [EObject current=null] : ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoEpilogue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:676:2: ( ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:677:2: ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:677:2: ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:678:3: () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:678:3: ()
            // InternalPubProto.g:679:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoEpilogueAccess().getProtoEpilogueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoEpilogueAccess().getEpilogueKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoEpilogueAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoEpilogueRule());
              			}
              			newCompositeNode(grammarAccess.getProtoEpilogueAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoEpilogueAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoEpilogue"


    // $ANTLR start "entryRuleProtoPublicationBody"
    // InternalPubProto.g:712:1: entryRuleProtoPublicationBody returns [EObject current=null] : iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF ;
    public final EObject entryRuleProtoPublicationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPublicationBody = null;


        try {
            // InternalPubProto.g:712:61: (iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF )
            // InternalPubProto.g:713:2: iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoPublicationBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoPublicationBody=ruleProtoPublicationBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoPublicationBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoPublicationBody"


    // $ANTLR start "ruleProtoPublicationBody"
    // InternalPubProto.g:719:1: ruleProtoPublicationBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleProtoPublicationBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPubProto.g:725:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' otherlv_3= '}' ) )
            // InternalPubProto.g:726:2: ( () otherlv_1= 'Body' otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalPubProto.g:726:2: ( () otherlv_1= 'Body' otherlv_2= '{' otherlv_3= '}' )
            // InternalPubProto.g:727:3: () otherlv_1= 'Body' otherlv_2= '{' otherlv_3= '}'
            {
            // InternalPubProto.g:727:3: ()
            // InternalPubProto.g:728:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoPublicationBodyAccess().getProtoPublicationBodyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoPublicationBodyAccess().getBodyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoPublicationBodyAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProtoPublicationBodyAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoPublicationBody"


    // $ANTLR start "entryRuleProtoChangeHistory"
    // InternalPubProto.g:750:1: entryRuleProtoChangeHistory returns [EObject current=null] : iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF ;
    public final EObject entryRuleProtoChangeHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoChangeHistory = null;


        try {
            // InternalPubProto.g:750:59: (iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF )
            // InternalPubProto.g:751:2: iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoChangeHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoChangeHistory=ruleProtoChangeHistory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoChangeHistory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoChangeHistory"


    // $ANTLR start "ruleProtoChangeHistory"
    // InternalPubProto.g:757:1: ruleProtoChangeHistory returns [EObject current=null] : ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoChangeHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:763:2: ( ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:764:2: ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:764:2: ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:765:3: () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:765:3: ()
            // InternalPubProto.g:766:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoChangeHistoryAccess().getProtoChangeHistoryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoChangeHistoryAccess().getChangeHistoryKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoChangeHistoryAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoChangeHistoryRule());
              			}
              			newCompositeNode(grammarAccess.getProtoChangeHistoryAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoChangeHistoryAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoChangeHistory"


    // $ANTLR start "entryRuleProtoTOC"
    // InternalPubProto.g:799:1: entryRuleProtoTOC returns [EObject current=null] : iv_ruleProtoTOC= ruleProtoTOC EOF ;
    public final EObject entryRuleProtoTOC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoTOC = null;


        try {
            // InternalPubProto.g:799:49: (iv_ruleProtoTOC= ruleProtoTOC EOF )
            // InternalPubProto.g:800:2: iv_ruleProtoTOC= ruleProtoTOC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoTOCRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoTOC=ruleProtoTOC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoTOC; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoTOC"


    // $ANTLR start "ruleProtoTOC"
    // InternalPubProto.g:806:1: ruleProtoTOC returns [EObject current=null] : ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleProtoTOC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_maxLevel_5_0=null;
        Token otherlv_6=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:812:2: ( ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' ) )
            // InternalPubProto.g:813:2: ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' )
            {
            // InternalPubProto.g:813:2: ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' )
            // InternalPubProto.g:814:3: () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}'
            {
            // InternalPubProto.g:814:3: ()
            // InternalPubProto.g:815:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoTOCAccess().getProtoTOCAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoTOCAccess().getTableOfContentsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoTOCAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoTOCRule());
              			}
              			newCompositeNode(grammarAccess.getProtoTOCAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_21);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:840:3: (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPubProto.g:841:4: otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProtoTOCAccess().getMaxLevelKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:845:4: ( (lv_maxLevel_5_0= RULE_NATURAL ) )
                    // InternalPubProto.g:846:5: (lv_maxLevel_5_0= RULE_NATURAL )
                    {
                    // InternalPubProto.g:846:5: (lv_maxLevel_5_0= RULE_NATURAL )
                    // InternalPubProto.g:847:6: lv_maxLevel_5_0= RULE_NATURAL
                    {
                    lv_maxLevel_5_0=(Token)match(input,RULE_NATURAL,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_maxLevel_5_0, grammarAccess.getProtoTOCAccess().getMaxLevelNATURALTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProtoTOCRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"maxLevel",
                      							lv_maxLevel_5_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.NATURAL");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getProtoTOCAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoTOC"


    // $ANTLR start "entryRuleProtoAbbreviations"
    // InternalPubProto.g:872:1: entryRuleProtoAbbreviations returns [EObject current=null] : iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF ;
    public final EObject entryRuleProtoAbbreviations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAbbreviations = null;


        try {
            // InternalPubProto.g:872:59: (iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF )
            // InternalPubProto.g:873:2: iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoAbbreviationsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoAbbreviations=ruleProtoAbbreviations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoAbbreviations; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoAbbreviations"


    // $ANTLR start "ruleProtoAbbreviations"
    // InternalPubProto.g:879:1: ruleProtoAbbreviations returns [EObject current=null] : ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAbbreviations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:885:2: ( ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:886:2: ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:886:2: ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:887:3: () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:887:3: ()
            // InternalPubProto.g:888:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoAbbreviationsAccess().getProtoAbbreviationsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoAbbreviationsAccess().getAbbreviationsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoAbbreviationsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoAbbreviationsRule());
              			}
              			newCompositeNode(grammarAccess.getProtoAbbreviationsAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoAbbreviationsAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoAbbreviations"


    // $ANTLR start "entryRuleProtoListOfTables"
    // InternalPubProto.g:921:1: entryRuleProtoListOfTables returns [EObject current=null] : iv_ruleProtoListOfTables= ruleProtoListOfTables EOF ;
    public final EObject entryRuleProtoListOfTables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoListOfTables = null;


        try {
            // InternalPubProto.g:921:58: (iv_ruleProtoListOfTables= ruleProtoListOfTables EOF )
            // InternalPubProto.g:922:2: iv_ruleProtoListOfTables= ruleProtoListOfTables EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoListOfTablesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoListOfTables=ruleProtoListOfTables();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoListOfTables; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoListOfTables"


    // $ANTLR start "ruleProtoListOfTables"
    // InternalPubProto.g:928:1: ruleProtoListOfTables returns [EObject current=null] : ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoListOfTables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:934:2: ( ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:935:2: ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:935:2: ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:936:3: () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:936:3: ()
            // InternalPubProto.g:937:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoListOfTablesAccess().getProtoListOfTablesAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoListOfTablesAccess().getListOfTablesKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoListOfTablesAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoListOfTablesRule());
              			}
              			newCompositeNode(grammarAccess.getProtoListOfTablesAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoListOfTablesAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoListOfTables"


    // $ANTLR start "entryRuleProtoListOfFigures"
    // InternalPubProto.g:970:1: entryRuleProtoListOfFigures returns [EObject current=null] : iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF ;
    public final EObject entryRuleProtoListOfFigures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoListOfFigures = null;


        try {
            // InternalPubProto.g:970:59: (iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF )
            // InternalPubProto.g:971:2: iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoListOfFiguresRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoListOfFigures=ruleProtoListOfFigures();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoListOfFigures; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoListOfFigures"


    // $ANTLR start "ruleProtoListOfFigures"
    // InternalPubProto.g:977:1: ruleProtoListOfFigures returns [EObject current=null] : ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoListOfFigures() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:983:2: ( ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:984:2: ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:984:2: ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:985:3: () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:985:3: ()
            // InternalPubProto.g:986:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoListOfFiguresAccess().getProtoListOfFiguresAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoListOfFiguresAccess().getListOfFiguresKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoListOfFiguresAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoListOfFiguresRule());
              			}
              			newCompositeNode(grammarAccess.getProtoListOfFiguresAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoListOfFiguresAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoListOfFigures"


    // $ANTLR start "entryRuleProtoBibliography"
    // InternalPubProto.g:1019:1: entryRuleProtoBibliography returns [EObject current=null] : iv_ruleProtoBibliography= ruleProtoBibliography EOF ;
    public final EObject entryRuleProtoBibliography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoBibliography = null;


        try {
            // InternalPubProto.g:1019:58: (iv_ruleProtoBibliography= ruleProtoBibliography EOF )
            // InternalPubProto.g:1020:2: iv_ruleProtoBibliography= ruleProtoBibliography EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoBibliographyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoBibliography=ruleProtoBibliography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoBibliography; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoBibliography"


    // $ANTLR start "ruleProtoBibliography"
    // InternalPubProto.g:1026:1: ruleProtoBibliography returns [EObject current=null] : ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoBibliography() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1032:2: ( ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1033:2: ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1033:2: ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1034:3: () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1034:3: ()
            // InternalPubProto.g:1035:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoBibliographyAccess().getProtoBibliographyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoBibliographyAccess().getBibliographyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoBibliographyAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoBibliographyRule());
              			}
              			newCompositeNode(grammarAccess.getProtoBibliographyAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoBibliographyAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoBibliography"


    // $ANTLR start "entryRuleProtoGlossary"
    // InternalPubProto.g:1068:1: entryRuleProtoGlossary returns [EObject current=null] : iv_ruleProtoGlossary= ruleProtoGlossary EOF ;
    public final EObject entryRuleProtoGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoGlossary = null;


        try {
            // InternalPubProto.g:1068:54: (iv_ruleProtoGlossary= ruleProtoGlossary EOF )
            // InternalPubProto.g:1069:2: iv_ruleProtoGlossary= ruleProtoGlossary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoGlossaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoGlossary=ruleProtoGlossary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoGlossary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoGlossary"


    // $ANTLR start "ruleProtoGlossary"
    // InternalPubProto.g:1075:1: ruleProtoGlossary returns [EObject current=null] : ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1081:2: ( ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1082:2: ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1082:2: ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1083:3: () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1083:3: ()
            // InternalPubProto.g:1084:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoGlossaryAccess().getProtoGlossaryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoGlossaryAccess().getGlossaryKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoGlossaryAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoGlossaryRule());
              			}
              			newCompositeNode(grammarAccess.getProtoGlossaryAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoGlossaryAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoGlossary"


    // $ANTLR start "entryRuleProtoIndex"
    // InternalPubProto.g:1117:1: entryRuleProtoIndex returns [EObject current=null] : iv_ruleProtoIndex= ruleProtoIndex EOF ;
    public final EObject entryRuleProtoIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoIndex = null;


        try {
            // InternalPubProto.g:1117:51: (iv_ruleProtoIndex= ruleProtoIndex EOF )
            // InternalPubProto.g:1118:2: iv_ruleProtoIndex= ruleProtoIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoIndex=ruleProtoIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoIndex; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoIndex"


    // $ANTLR start "ruleProtoIndex"
    // InternalPubProto.g:1124:1: ruleProtoIndex returns [EObject current=null] : ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1130:2: ( ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1131:2: ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1131:2: ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1132:3: () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1132:3: ()
            // InternalPubProto.g:1133:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoIndexAccess().getProtoIndexAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoIndexAccess().getIndexKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoIndexAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoIndexRule());
              			}
              			newCompositeNode(grammarAccess.getProtoIndexAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoIndexAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoIndex"


    // $ANTLR start "entryRuleProtoDivision"
    // InternalPubProto.g:1166:1: entryRuleProtoDivision returns [EObject current=null] : iv_ruleProtoDivision= ruleProtoDivision EOF ;
    public final EObject entryRuleProtoDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoDivision = null;


        try {
            // InternalPubProto.g:1166:54: (iv_ruleProtoDivision= ruleProtoDivision EOF )
            // InternalPubProto.g:1167:2: iv_ruleProtoDivision= ruleProtoDivision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoDivisionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoDivision=ruleProtoDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoDivision; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoDivision"


    // $ANTLR start "ruleProtoDivision"
    // InternalPubProto.g:1173:1: ruleProtoDivision returns [EObject current=null] : (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection ) ;
    public final EObject ruleProtoDivision() throws RecognitionException {
        EObject current = null;

        EObject this_ProtoPart_0 = null;

        EObject this_ProtoAppendix_1 = null;

        EObject this_ProtoChapter_2 = null;

        EObject this_ProtoSection_3 = null;

        EObject this_ProtoSubsection_4 = null;

        EObject this_ProtoSubsubsection_5 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1179:2: ( (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection ) )
            // InternalPubProto.g:1180:2: (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection )
            {
            // InternalPubProto.g:1180:2: (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt12=1;
                }
                break;
            case 47:
                {
                alt12=2;
                }
                break;
            case 48:
                {
                alt12=3;
                }
                break;
            case 49:
                {
                alt12=4;
                }
                break;
            case 50:
                {
                alt12=5;
                }
                break;
            case 51:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPubProto.g:1181:3: this_ProtoPart_0= ruleProtoPart
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoPartParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoPart_0=ruleProtoPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoPart_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:1190:3: this_ProtoAppendix_1= ruleProtoAppendix
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoAppendixParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoAppendix_1=ruleProtoAppendix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoAppendix_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPubProto.g:1199:3: this_ProtoChapter_2= ruleProtoChapter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoChapterParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoChapter_2=ruleProtoChapter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoChapter_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPubProto.g:1208:3: this_ProtoSection_3= ruleProtoSection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoSectionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoSection_3=ruleProtoSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoSection_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPubProto.g:1217:3: this_ProtoSubsection_4= ruleProtoSubsection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoSubsectionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoSubsection_4=ruleProtoSubsection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoSubsection_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPubProto.g:1226:3: this_ProtoSubsubsection_5= ruleProtoSubsubsection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoSubsubsectionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProtoSubsubsection_5=ruleProtoSubsubsection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProtoSubsubsection_5;
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
    // $ANTLR end "ruleProtoDivision"


    // $ANTLR start "ruleProtoDivisionBody"
    // InternalPubProto.g:1239:1: ruleProtoDivisionBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )? ;
    public final EObject ruleProtoDivisionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Enumerator lv_numberingStyle_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1245:2: ( (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )? )
            // InternalPubProto.g:1246:2: (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )?
            {
            // InternalPubProto.g:1246:2: (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPubProto.g:1247:3: otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_0, grammarAccess.getProtoDivisionBodyAccess().getNumberingKeyword_0());
                      		
                    }
                    // InternalPubProto.g:1251:3: ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) )
                    // InternalPubProto.g:1252:4: (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle )
                    {
                    // InternalPubProto.g:1252:4: (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle )
                    // InternalPubProto.g:1253:5: lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProtoDivisionBodyAccess().getNumberingStyleProtoSequenceNumberStyleEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_numberingStyle_1_0=ruleProtoSequenceNumberStyle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProtoDivisionBodyRule());
                      					}
                      					set(
                      						current,
                      						"numberingStyle",
                      						lv_numberingStyle_1_0,
                      						"com.mimacom.ddd.pub.proto.PubProto.ProtoSequenceNumberStyle");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleProtoDivisionBody"


    // $ANTLR start "entryRuleProtoPart"
    // InternalPubProto.g:1274:1: entryRuleProtoPart returns [EObject current=null] : iv_ruleProtoPart= ruleProtoPart EOF ;
    public final EObject entryRuleProtoPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPart = null;


        try {
            // InternalPubProto.g:1274:50: (iv_ruleProtoPart= ruleProtoPart EOF )
            // InternalPubProto.g:1275:2: iv_ruleProtoPart= ruleProtoPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoPart=ruleProtoPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoPart"


    // $ANTLR start "ruleProtoPart"
    // InternalPubProto.g:1281:1: ruleProtoPart returns [EObject current=null] : ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1287:2: ( ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1288:2: ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1288:2: ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1289:3: () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1289:3: ()
            // InternalPubProto.g:1290:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoPartAccess().getProtoPartAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoPartAccess().getPartKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoPartAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoPartRule());
              			}
              			newCompositeNode(grammarAccess.getProtoPartAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoPartAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoPart"


    // $ANTLR start "entryRuleProtoAppendix"
    // InternalPubProto.g:1323:1: entryRuleProtoAppendix returns [EObject current=null] : iv_ruleProtoAppendix= ruleProtoAppendix EOF ;
    public final EObject entryRuleProtoAppendix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAppendix = null;


        try {
            // InternalPubProto.g:1323:54: (iv_ruleProtoAppendix= ruleProtoAppendix EOF )
            // InternalPubProto.g:1324:2: iv_ruleProtoAppendix= ruleProtoAppendix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoAppendixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoAppendix=ruleProtoAppendix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoAppendix; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoAppendix"


    // $ANTLR start "ruleProtoAppendix"
    // InternalPubProto.g:1330:1: ruleProtoAppendix returns [EObject current=null] : ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAppendix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1336:2: ( ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1337:2: ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1337:2: ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1338:3: () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1338:3: ()
            // InternalPubProto.g:1339:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoAppendixAccess().getProtoAppendixAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoAppendixAccess().getAppendixKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoAppendixAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoAppendixRule());
              			}
              			newCompositeNode(grammarAccess.getProtoAppendixAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoAppendixAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoAppendix"


    // $ANTLR start "entryRuleProtoChapter"
    // InternalPubProto.g:1372:1: entryRuleProtoChapter returns [EObject current=null] : iv_ruleProtoChapter= ruleProtoChapter EOF ;
    public final EObject entryRuleProtoChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoChapter = null;


        try {
            // InternalPubProto.g:1372:53: (iv_ruleProtoChapter= ruleProtoChapter EOF )
            // InternalPubProto.g:1373:2: iv_ruleProtoChapter= ruleProtoChapter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoChapterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoChapter=ruleProtoChapter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoChapter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoChapter"


    // $ANTLR start "ruleProtoChapter"
    // InternalPubProto.g:1379:1: ruleProtoChapter returns [EObject current=null] : ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1385:2: ( ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1386:2: ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1386:2: ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1387:3: () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1387:3: ()
            // InternalPubProto.g:1388:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoChapterAccess().getProtoChapterAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoChapterAccess().getChapterKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoChapterAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoChapterRule());
              			}
              			newCompositeNode(grammarAccess.getProtoChapterAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoChapterAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoChapter"


    // $ANTLR start "entryRuleProtoSection"
    // InternalPubProto.g:1421:1: entryRuleProtoSection returns [EObject current=null] : iv_ruleProtoSection= ruleProtoSection EOF ;
    public final EObject entryRuleProtoSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSection = null;


        try {
            // InternalPubProto.g:1421:53: (iv_ruleProtoSection= ruleProtoSection EOF )
            // InternalPubProto.g:1422:2: iv_ruleProtoSection= ruleProtoSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoSectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoSection=ruleProtoSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoSection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoSection"


    // $ANTLR start "ruleProtoSection"
    // InternalPubProto.g:1428:1: ruleProtoSection returns [EObject current=null] : ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1434:2: ( ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1435:2: ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1435:2: ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1436:3: () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1436:3: ()
            // InternalPubProto.g:1437:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSectionAccess().getProtoSectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSectionAccess().getSectionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoSectionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoSectionRule());
              			}
              			newCompositeNode(grammarAccess.getProtoSectionAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoSectionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoSection"


    // $ANTLR start "entryRuleProtoSubsection"
    // InternalPubProto.g:1470:1: entryRuleProtoSubsection returns [EObject current=null] : iv_ruleProtoSubsection= ruleProtoSubsection EOF ;
    public final EObject entryRuleProtoSubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSubsection = null;


        try {
            // InternalPubProto.g:1470:56: (iv_ruleProtoSubsection= ruleProtoSubsection EOF )
            // InternalPubProto.g:1471:2: iv_ruleProtoSubsection= ruleProtoSubsection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoSubsectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoSubsection=ruleProtoSubsection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoSubsection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoSubsection"


    // $ANTLR start "ruleProtoSubsection"
    // InternalPubProto.g:1477:1: ruleProtoSubsection returns [EObject current=null] : ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1483:2: ( ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1484:2: ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1484:2: ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1485:3: () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1485:3: ()
            // InternalPubProto.g:1486:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSubsectionAccess().getProtoSubsectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSubsectionAccess().getSubKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoSubsectionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoSubsectionRule());
              			}
              			newCompositeNode(grammarAccess.getProtoSubsectionAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoSubsectionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoSubsection"


    // $ANTLR start "entryRuleProtoSubsubsection"
    // InternalPubProto.g:1519:1: entryRuleProtoSubsubsection returns [EObject current=null] : iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF ;
    public final EObject entryRuleProtoSubsubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSubsubsection = null;


        try {
            // InternalPubProto.g:1519:59: (iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF )
            // InternalPubProto.g:1520:2: iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProtoSubsubsectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProtoSubsubsection=ruleProtoSubsubsection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProtoSubsubsection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtoSubsubsection"


    // $ANTLR start "ruleProtoSubsubsection"
    // InternalPubProto.g:1526:1: ruleProtoSubsubsection returns [EObject current=null] : ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSubsubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1532:2: ( ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1533:2: ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1533:2: ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1534:3: () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1534:3: ()
            // InternalPubProto.g:1535:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSubsubsectionAccess().getProtoSubsubsectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSubsubsectionAccess().getSubsubKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoSubsubsectionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoSubsubsectionRule());
              			}
              			newCompositeNode(grammarAccess.getProtoSubsubsectionAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_19);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProtoSubsubsectionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtoSubsubsection"


    // $ANTLR start "entryRuleDNote"
    // InternalPubProto.g:1568:1: entryRuleDNote returns [EObject current=null] : iv_ruleDNote= ruleDNote EOF ;
    public final EObject entryRuleDNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNote = null;


        try {
            // InternalPubProto.g:1568:46: (iv_ruleDNote= ruleDNote EOF )
            // InternalPubProto.g:1569:2: iv_ruleDNote= ruleDNote EOF
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
    // InternalPubProto.g:1575:1: ruleDNote returns [EObject current=null] : (otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}' ) ;
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
            // InternalPubProto.g:1581:2: ( (otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}' ) )
            // InternalPubProto.g:1582:2: (otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}' )
            {
            // InternalPubProto.g:1582:2: (otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}' )
            // InternalPubProto.g:1583:3: otherlv_0= 'NOTE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= ruleDRichText ) ) ( (lv_color_4_0= ruleDNoteColor ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDNoteAccess().getNOTEKeyword_0());
              		
            }
            // InternalPubProto.g:1587:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:1588:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:1588:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:1589:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDNoteAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalPubProto.g:1609:3: ( (lv_text_3_0= ruleDRichText ) )
            // InternalPubProto.g:1610:4: (lv_text_3_0= ruleDRichText )
            {
            // InternalPubProto.g:1610:4: (lv_text_3_0= ruleDRichText )
            // InternalPubProto.g:1611:5: lv_text_3_0= ruleDRichText
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNoteAccess().getTextDRichTextParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalPubProto.g:1628:3: ( (lv_color_4_0= ruleDNoteColor ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=103 && LA14_0<=110)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPubProto.g:1629:4: (lv_color_4_0= ruleDNoteColor )
                    {
                    // InternalPubProto.g:1629:4: (lv_color_4_0= ruleDNoteColor )
                    // InternalPubProto.g:1630:5: lv_color_4_0= ruleDNoteColor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDNoteAccess().getColorDNoteColorEnumRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
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

            otherlv_5=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDmxModel"
    // InternalPubProto.g:1655:1: entryRuleDmxModel returns [EObject current=null] : iv_ruleDmxModel= ruleDmxModel EOF ;
    public final EObject entryRuleDmxModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxModel = null;


        try {
            // InternalPubProto.g:1655:49: (iv_ruleDmxModel= ruleDmxModel EOF )
            // InternalPubProto.g:1656:2: iv_ruleDmxModel= ruleDmxModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxModel=ruleDmxModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDmxModel"


    // $ANTLR start "ruleDmxModel"
    // InternalPubProto.g:1662:1: ruleDmxModel returns [EObject current=null] : ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* ) ;
    public final EObject ruleDmxModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_1_0 = null;

        EObject lv_filters_2_0 = null;

        EObject lv_tests_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1668:2: ( ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* ) )
            // InternalPubProto.g:1669:2: ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* )
            {
            // InternalPubProto.g:1669:2: ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* )
            // InternalPubProto.g:1670:3: () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )*
            {
            // InternalPubProto.g:1670:3: ()
            // InternalPubProto.g:1671:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxModelAccess().getDmxModelAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:1677:3: ( (lv_types_1_0= ruleDmxArchetype ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==62) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPubProto.g:1678:4: (lv_types_1_0= ruleDmxArchetype )
            	    {
            	    // InternalPubProto.g:1678:4: (lv_types_1_0= ruleDmxArchetype )
            	    // InternalPubProto.g:1679:5: lv_types_1_0= ruleDmxArchetype
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getTypesDmxArchetypeParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_types_1_0=ruleDmxArchetype();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_1_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DmxArchetype");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalPubProto.g:1696:3: ( (lv_filters_2_0= ruleDmxFilter ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==64) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPubProto.g:1697:4: (lv_filters_2_0= ruleDmxFilter )
            	    {
            	    // InternalPubProto.g:1697:4: (lv_filters_2_0= ruleDmxFilter )
            	    // InternalPubProto.g:1698:5: lv_filters_2_0= ruleDmxFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getFiltersDmxFilterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_filters_2_0=ruleDmxFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"filters",
            	      						lv_filters_2_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DmxFilter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalPubProto.g:1715:3: ( (lv_tests_3_0= ruleDmxTest ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==54) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPubProto.g:1716:4: (lv_tests_3_0= ruleDmxTest )
            	    {
            	    // InternalPubProto.g:1716:4: (lv_tests_3_0= ruleDmxTest )
            	    // InternalPubProto.g:1717:5: lv_tests_3_0= ruleDmxTest
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getTestsDmxTestParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_tests_3_0=ruleDmxTest();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tests",
            	      						lv_tests_3_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DmxTest");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleDmxModel"


    // $ANTLR start "entryRuleDImport"
    // InternalPubProto.g:1738:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalPubProto.g:1738:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalPubProto.g:1739:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalPubProto.g:1745:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1751:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalPubProto.g:1752:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalPubProto.g:1752:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalPubProto.g:1753:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalPubProto.g:1757:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalPubProto.g:1758:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalPubProto.g:1758:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalPubProto.g:1759:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalPubProto.g:1780:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalPubProto.g:1780:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalPubProto.g:1781:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalPubProto.g:1787:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalPubProto.g:1793:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalPubProto.g:1794:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalPubProto.g:1794:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalPubProto.g:1795:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalPubProto.g:1799:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:1800:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:1800:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:1801:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
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

            // InternalPubProto.g:1817:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==55) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPubProto.g:1818:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalPubProto.g:1822:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalPubProto.g:1823:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalPubProto.g:1823:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalPubProto.g:1824:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

                    // InternalPubProto.g:1841:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==56) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalPubProto.g:1842:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:1846:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalPubProto.g:1847:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalPubProto.g:1847:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalPubProto.g:1848:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalPubProto.g:1871:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalPubProto.g:1872:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalPubProto.g:1872:4: (lv_expr_7_0= ruleDExpression )
            // InternalPubProto.g:1873:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_19);
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
              						"com.mimacom.ddd.pub.proto.PubProto.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1898:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalPubProto.g:1898:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalPubProto.g:1899:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalPubProto.g:1905:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalPubProto.g:1911:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalPubProto.g:1912:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalPubProto.g:1912:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalPubProto.g:1913:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalPubProto.g:1913:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:1914:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:1914:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:1915:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalPubProto.g:1935:3: ( (otherlv_2= RULE_ID ) )
            // InternalPubProto.g:1936:4: (otherlv_2= RULE_ID )
            {
            // InternalPubProto.g:1936:4: (otherlv_2= RULE_ID )
            // InternalPubProto.g:1937:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalPubProto.g:1948:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60||LA20_0==66||LA20_0==92||LA20_0==145) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPubProto.g:1949:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalPubProto.g:1949:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalPubProto.g:1950:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_33);
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

            // InternalPubProto.g:1967:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPubProto.g:1968:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:1972:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_NATURAL)||(LA21_0>=28 && LA21_0<=29)||(LA21_0>=74 && LA21_0<=75)||(LA21_0>=86 && LA21_0<=89)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==31) ) {
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
                            // InternalPubProto.g:1973:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalPubProto.g:1973:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalPubProto.g:1974:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalPubProto.g:1974:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalPubProto.g:1975:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalPubProto.g:1993:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalPubProto.g:1993:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalPubProto.g:1994:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalPubProto.g:1994:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalPubProto.g:1995:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalPubProto.g:2018:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalPubProto.g:2018:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalPubProto.g:2019:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalPubProto.g:2025:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalPubProto.g:2031:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalPubProto.g:2032:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalPubProto.g:2032:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalPubProto.g:2033:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalPubProto.g:2033:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:2034:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:2034:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:2035:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,59,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,60,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:2059:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalPubProto.g:2060:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalPubProto.g:2060:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalPubProto.g:2061:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            // InternalPubProto.g:2078:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==56) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPubProto.g:2079:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,56,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalPubProto.g:2083:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalPubProto.g:2084:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalPubProto.g:2084:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalPubProto.g:2085:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_6=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:2111:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalPubProto.g:2111:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalPubProto.g:2112:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalPubProto.g:2118:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2124:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalPubProto.g:2125:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalPubProto.g:2125:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalPubProto.g:2126:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalPubProto.g:2130:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:2131:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:2131:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:2132:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,63,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalPubProto.g:2152:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalPubProto.g:2153:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalPubProto.g:2153:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalPubProto.g:2154:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_41);
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

            // InternalPubProto.g:2171:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_PLAIN_TEXT_ONLY && LA24_0<=RULE_RICH_TEXT_START)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPubProto.g:2172:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalPubProto.g:2172:4: (lv_description_4_0= ruleDRichText )
                    // InternalPubProto.g:2173:5: lv_description_4_0= ruleDRichText
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
    // InternalPubProto.g:2194:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalPubProto.g:2194:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalPubProto.g:2195:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalPubProto.g:2201:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalPubProto.g:2207:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalPubProto.g:2208:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalPubProto.g:2208:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalPubProto.g:2209:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalPubProto.g:2213:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:2214:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:2214:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:2215:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,60,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:2235:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPubProto.g:2236:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalPubProto.g:2236:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalPubProto.g:2237:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalPubProto.g:2237:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalPubProto.g:2238:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
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

                    // InternalPubProto.g:2255:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==56) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalPubProto.g:2256:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:2260:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalPubProto.g:2261:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalPubProto.g:2261:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalPubProto.g:2262:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,61,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,57,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalPubProto.g:2289:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalPubProto.g:2290:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalPubProto.g:2290:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalPubProto.g:2291:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
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

            // InternalPubProto.g:2308:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==65) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPubProto.g:2309:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,65,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalPubProto.g:2313:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalPubProto.g:2314:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalPubProto.g:2314:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalPubProto.g:2315:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalPubProto.g:2337:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalPubProto.g:2337:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalPubProto.g:2338:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalPubProto.g:2344:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2350:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalPubProto.g:2351:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalPubProto.g:2351:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalPubProto.g:2352:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalPubProto.g:2352:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=111 && LA28_0<=121)) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
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
                    // InternalPubProto.g:2353:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalPubProto.g:2353:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalPubProto.g:2354:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalPubProto.g:2354:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalPubProto.g:2355:6: lv_single_0_0= ruleDmxBaseType
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
                    // InternalPubProto.g:2373:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalPubProto.g:2373:4: ( (otherlv_1= RULE_ID ) )
                    // InternalPubProto.g:2374:5: (otherlv_1= RULE_ID )
                    {
                    // InternalPubProto.g:2374:5: (otherlv_1= RULE_ID )
                    // InternalPubProto.g:2375:6: otherlv_1= RULE_ID
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

            // InternalPubProto.g:2387:3: ( (lv_collection_2_0= '*' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==66) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPubProto.g:2388:4: (lv_collection_2_0= '*' )
                    {
                    // InternalPubProto.g:2388:4: (lv_collection_2_0= '*' )
                    // InternalPubProto.g:2389:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:2405:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalPubProto.g:2405:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalPubProto.g:2406:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalPubProto.g:2412:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2418:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalPubProto.g:2419:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalPubProto.g:2419:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalPubProto.g:2420:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalPubProto.g:2420:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:2421:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:2421:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:2422:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,57,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalPubProto.g:2442:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalPubProto.g:2443:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalPubProto.g:2443:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalPubProto.g:2444:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalPubProto.g:2465:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalPubProto.g:2465:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalPubProto.g:2466:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalPubProto.g:2472:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalPubProto.g:2478:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalPubProto.g:2479:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalPubProto.g:2479:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_RICH_TEXT_START) ) {
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
                    // InternalPubProto.g:2480:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalPubProto.g:2480:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalPubProto.g:2481:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalPubProto.g:2481:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalPubProto.g:2482:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalPubProto.g:2500:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalPubProto.g:2500:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalPubProto.g:2501:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalPubProto.g:2501:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalPubProto.g:2502:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalPubProto.g:2502:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalPubProto.g:2503:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
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

                    // InternalPubProto.g:2520:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalPubProto.g:2521:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalPubProto.g:2521:5: (lv_segments_2_0= ruleDExpression )
                    // InternalPubProto.g:2522:6: lv_segments_2_0= ruleDExpression
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
                      							"com.mimacom.ddd.pub.proto.PubProto.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPubProto.g:2539:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalPubProto.g:2540:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalPubProto.g:2540:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalPubProto.g:2541:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalPubProto.g:2541:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalPubProto.g:2542:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
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

                    	    // InternalPubProto.g:2559:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalPubProto.g:2560:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:2560:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalPubProto.g:2561:7: lv_segments_4_0= ruleDExpression
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
                    	      								"com.mimacom.ddd.pub.proto.PubProto.DExpression");
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

                    // InternalPubProto.g:2579:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalPubProto.g:2580:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalPubProto.g:2580:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalPubProto.g:2581:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalPubProto.g:2603:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalPubProto.g:2603:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalPubProto.g:2604:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalPubProto.g:2610:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2616:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalPubProto.g:2617:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalPubProto.g:2617:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalPubProto.g:2618:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalPubProto.g:2618:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalPubProto.g:2619:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalPubProto.g:2638:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalPubProto.g:2638:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalPubProto.g:2639:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalPubProto.g:2645:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2651:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalPubProto.g:2652:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalPubProto.g:2652:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalPubProto.g:2653:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalPubProto.g:2653:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalPubProto.g:2654:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalPubProto.g:2673:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalPubProto.g:2673:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalPubProto.g:2674:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalPubProto.g:2680:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2686:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalPubProto.g:2687:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalPubProto.g:2687:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalPubProto.g:2688:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalPubProto.g:2688:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalPubProto.g:2689:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalPubProto.g:2708:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalPubProto.g:2708:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalPubProto.g:2709:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalPubProto.g:2715:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2721:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalPubProto.g:2722:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalPubProto.g:2722:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalPubProto.g:2723:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalPubProto.g:2723:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalPubProto.g:2724:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalPubProto.g:2743:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalPubProto.g:2743:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalPubProto.g:2744:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalPubProto.g:2750:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalPubProto.g:2756:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalPubProto.g:2757:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalPubProto.g:2757:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalPubProto.g:2758:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
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
            // InternalPubProto.g:2766:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==67) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred1_InternalPubProto()) ) {
                        alt33=1;
                    }
                    else if ( (synpred2_InternalPubProto()) ) {
                        alt33=2;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalPubProto.g:2767:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalPubProto.g:2767:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalPubProto.g:2768:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalPubProto.g:2768:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalPubProto.g:2769:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalPubProto.g:2781:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalPubProto.g:2782:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalPubProto.g:2782:7: ()
            	    // InternalPubProto.g:2783:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,67,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalPubProto.g:2793:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalPubProto.g:2794:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPubProto.g:2794:8: (otherlv_3= RULE_ID )
            	    // InternalPubProto.g:2795:9: otherlv_3= RULE_ID
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

            	    // InternalPubProto.g:2815:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalPubProto.g:2816:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalPubProto.g:2816:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalPubProto.g:2817:7: lv_value_5_0= ruleDmxOrExpression
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
            	    // InternalPubProto.g:2836:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalPubProto.g:2836:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalPubProto.g:2837:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalPubProto.g:2837:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalPubProto.g:2838:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalPubProto.g:2844:6: ( () otherlv_7= '.' )
            	    // InternalPubProto.g:2845:7: () otherlv_7= '.'
            	    {
            	    // InternalPubProto.g:2845:7: ()
            	    // InternalPubProto.g:2846:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,67,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalPubProto.g:2858:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalPubProto.g:2859:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalPubProto.g:2859:6: (otherlv_8= RULE_ID )
            	    // InternalPubProto.g:2860:7: otherlv_8= RULE_ID
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

            	    // InternalPubProto.g:2871:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt32=3;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==60) && (synpred3_InternalPubProto())) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==68) ) {
            	        alt32=2;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalPubProto.g:2872:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalPubProto.g:2872:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalPubProto.g:2873:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalPubProto.g:2873:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalPubProto.g:2874:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalPubProto.g:2878:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalPubProto.g:2879:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,60,FOLLOW_51); if (state.failed) return current;
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

            	            // InternalPubProto.g:2891:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalPubProto.g:2892:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalPubProto.g:2892:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalPubProto.g:2893:9: lv_callArguments_10_0= ruleDmxCallArguments
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

            	            otherlv_11=(Token)match(input,61,FOLLOW_47); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPubProto.g:2916:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalPubProto.g:2916:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalPubProto.g:2917:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalPubProto.g:2917:7: (lv_before_12_0= '@before' )
            	            // InternalPubProto.g:2918:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,68,FOLLOW_47); if (state.failed) return current;
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
            	    break loop33;
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
    // InternalPubProto.g:2937:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalPubProto.g:2937:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalPubProto.g:2938:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalPubProto.g:2944:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2950:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalPubProto.g:2951:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalPubProto.g:2951:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalPubProto.g:2952:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalPubProto.g:2952:3: ()
            // InternalPubProto.g:2953:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:2959:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_NATURAL)||(LA35_0>=28 && LA35_0<=29)||LA35_0==31||LA35_0==60||(LA35_0>=74 && LA35_0<=75)||LA35_0==77||LA35_0==81||(LA35_0>=86 && LA35_0<=89)||(LA35_0>=92 && LA35_0<=93)||(LA35_0>=142 && LA35_0<=144)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPubProto.g:2960:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalPubProto.g:2960:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalPubProto.g:2961:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalPubProto.g:2961:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalPubProto.g:2962:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
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

                    // InternalPubProto.g:2979:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==56) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalPubProto.g:2980:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,56,FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:2984:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalPubProto.g:2985:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalPubProto.g:2985:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalPubProto.g:2986:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
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
                    	    break loop34;
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
    // InternalPubProto.g:3009:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalPubProto.g:3009:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalPubProto.g:3010:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalPubProto.g:3016:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:3022:2: (kw= ':=' )
            // InternalPubProto.g:3023:2: kw= ':='
            {
            kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:3031:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalPubProto.g:3031:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalPubProto.g:3032:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalPubProto.g:3038:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3044:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalPubProto.g:3045:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalPubProto.g:3045:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==69) ) {
                    alt36=1;
                }
                else if ( (LA36_1==EOF||LA36_1==56||(LA36_1>=59 && LA36_1<=61)||(LA36_1>=66 && LA36_1<=68)||(LA36_1>=70 && LA36_1<=73)||LA36_1==76||LA36_1==85||(LA36_1>=92 && LA36_1<=93)||(LA36_1>=122 && LA36_1<=141)) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_NATURAL)||(LA36_0>=28 && LA36_0<=29)||LA36_0==31||LA36_0==60||(LA36_0>=74 && LA36_0<=75)||LA36_0==77||LA36_0==81||(LA36_0>=86 && LA36_0<=89)||(LA36_0>=92 && LA36_0<=93)||(LA36_0>=142 && LA36_0<=144)) ) {
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
                    // InternalPubProto.g:3046:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalPubProto.g:3046:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalPubProto.g:3047:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalPubProto.g:3047:4: ()
                    // InternalPubProto.g:3048:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPubProto.g:3054:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalPubProto.g:3055:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalPubProto.g:3055:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalPubProto.g:3056:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
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

                    otherlv_2=(Token)match(input,69,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalPubProto.g:3077:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalPubProto.g:3078:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalPubProto.g:3078:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalPubProto.g:3079:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalPubProto.g:3098:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalPubProto.g:3110:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalPubProto.g:3110:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalPubProto.g:3111:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalPubProto.g:3117:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:3123:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPubProto.g:3124:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPubProto.g:3124:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:3125:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:3125:3: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:3126:4: lv_name_0_0= RULE_ID
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
    // InternalPubProto.g:3145:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalPubProto.g:3145:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalPubProto.g:3146:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalPubProto.g:3152:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3158:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalPubProto.g:3159:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalPubProto.g:3159:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalPubProto.g:3160:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
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
            // InternalPubProto.g:3168:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case 122:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 123:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 124:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 125:
                    {
                    int LA37_5 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt37=1;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // InternalPubProto.g:3169:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalPubProto.g:3169:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalPubProto.g:3170:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalPubProto.g:3180:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalPubProto.g:3181:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalPubProto.g:3181:6: ()
            	    // InternalPubProto.g:3182:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3188:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalPubProto.g:3189:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalPubProto.g:3189:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalPubProto.g:3190:8: lv_operator_2_0= ruleDmxOpOr
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

            	    // InternalPubProto.g:3209:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalPubProto.g:3210:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalPubProto.g:3210:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalPubProto.g:3211:6: lv_rightOperand_3_0= ruleDmxAndExpression
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
            	    break loop37;
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
    // InternalPubProto.g:3233:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalPubProto.g:3233:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalPubProto.g:3234:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalPubProto.g:3240:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3246:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalPubProto.g:3247:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalPubProto.g:3247:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalPubProto.g:3248:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
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
            // InternalPubProto.g:3256:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==126) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred5_InternalPubProto()) ) {
                        alt38=1;
                    }


                }
                else if ( (LA38_0==127) ) {
                    int LA38_3 = input.LA(2);

                    if ( (synpred5_InternalPubProto()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalPubProto.g:3257:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalPubProto.g:3257:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalPubProto.g:3258:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalPubProto.g:3268:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalPubProto.g:3269:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalPubProto.g:3269:6: ()
            	    // InternalPubProto.g:3270:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3276:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalPubProto.g:3277:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalPubProto.g:3277:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalPubProto.g:3278:8: lv_operator_2_0= ruleDmxOpAnd
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

            	    // InternalPubProto.g:3297:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalPubProto.g:3298:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalPubProto.g:3298:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalPubProto.g:3299:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
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
            	    break loop38;
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
    // InternalPubProto.g:3321:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalPubProto.g:3321:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalPubProto.g:3322:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalPubProto.g:3328:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3334:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalPubProto.g:3335:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalPubProto.g:3335:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalPubProto.g:3336:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
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
            // InternalPubProto.g:3344:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case 76:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 128:
                    {
                    int LA39_3 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 129:
                    {
                    int LA39_4 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt39=1;
                    }


                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // InternalPubProto.g:3345:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalPubProto.g:3345:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalPubProto.g:3346:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalPubProto.g:3356:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalPubProto.g:3357:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalPubProto.g:3357:6: ()
            	    // InternalPubProto.g:3358:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3364:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalPubProto.g:3365:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalPubProto.g:3365:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalPubProto.g:3366:8: lv_operator_2_0= ruleDmxOpEquality
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

            	    // InternalPubProto.g:3385:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalPubProto.g:3386:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalPubProto.g:3386:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalPubProto.g:3387:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
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
            	    break loop39;
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
    // InternalPubProto.g:3409:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalPubProto.g:3409:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalPubProto.g:3410:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalPubProto.g:3416:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3422:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalPubProto.g:3423:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalPubProto.g:3423:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalPubProto.g:3424:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
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
            // InternalPubProto.g:3432:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop40:
            do {
                int alt40=3;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // InternalPubProto.g:3433:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalPubProto.g:3433:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalPubProto.g:3434:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalPubProto.g:3434:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalPubProto.g:3435:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalPubProto.g:3441:6: ( () ruleDmxOpInstanceOf )
            	    // InternalPubProto.g:3442:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalPubProto.g:3442:7: ()
            	    // InternalPubProto.g:3443:8: 
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

            	    // InternalPubProto.g:3458:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalPubProto.g:3459:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPubProto.g:3459:6: (otherlv_3= RULE_ID )
            	    // InternalPubProto.g:3460:7: otherlv_3= RULE_ID
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
            	    // InternalPubProto.g:3473:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalPubProto.g:3473:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalPubProto.g:3474:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalPubProto.g:3474:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalPubProto.g:3475:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalPubProto.g:3485:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalPubProto.g:3486:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalPubProto.g:3486:7: ()
            	    // InternalPubProto.g:3487:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalPubProto.g:3493:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalPubProto.g:3494:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalPubProto.g:3494:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalPubProto.g:3495:9: lv_operator_5_0= ruleOpCompare
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

            	    // InternalPubProto.g:3514:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalPubProto.g:3515:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalPubProto.g:3515:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalPubProto.g:3516:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
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
            	    break loop40;
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
    // InternalPubProto.g:3539:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalPubProto.g:3539:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalPubProto.g:3540:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalPubProto.g:3546:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:3552:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalPubProto.g:3553:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalPubProto.g:3553:2: (kw= 'ISA' | kw= 'isa' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==70) ) {
                alt41=1;
            }
            else if ( (LA41_0==71) ) {
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
                    // InternalPubProto.g:3554:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:3560:3: kw= 'isa'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:3569:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalPubProto.g:3569:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalPubProto.g:3570:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalPubProto.g:3576:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3582:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalPubProto.g:3583:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalPubProto.g:3583:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalPubProto.g:3584:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
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
            // InternalPubProto.g:3592:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case 136:
                    {
                    int LA42_2 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA42_3 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 85:
                    {
                    int LA42_4 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 137:
                    {
                    int LA42_5 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 138:
                    {
                    int LA42_6 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt42=1;
                    }


                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalPubProto.g:3593:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalPubProto.g:3593:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalPubProto.g:3594:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalPubProto.g:3604:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalPubProto.g:3605:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalPubProto.g:3605:6: ()
            	    // InternalPubProto.g:3606:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3612:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalPubProto.g:3613:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalPubProto.g:3613:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalPubProto.g:3614:8: lv_operator_2_0= ruleOpOther
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

            	    // InternalPubProto.g:3633:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalPubProto.g:3634:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalPubProto.g:3634:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalPubProto.g:3635:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
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
            	    break loop42;
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
    // InternalPubProto.g:3657:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalPubProto.g:3657:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalPubProto.g:3658:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalPubProto.g:3664:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3670:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalPubProto.g:3671:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalPubProto.g:3671:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalPubProto.g:3672:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
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
            // InternalPubProto.g:3680:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==92) ) {
                    int LA43_2 = input.LA(2);

                    if ( (synpred10_InternalPubProto()) ) {
                        alt43=1;
                    }


                }
                else if ( (LA43_0==93) ) {
                    int LA43_3 = input.LA(2);

                    if ( (synpred10_InternalPubProto()) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // InternalPubProto.g:3681:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalPubProto.g:3681:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalPubProto.g:3682:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalPubProto.g:3692:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalPubProto.g:3693:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalPubProto.g:3693:6: ()
            	    // InternalPubProto.g:3694:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3700:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalPubProto.g:3701:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalPubProto.g:3701:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalPubProto.g:3702:8: lv_operator_2_0= ruleOpAdd
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

            	    // InternalPubProto.g:3721:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalPubProto.g:3722:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalPubProto.g:3722:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalPubProto.g:3723:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
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
            	    break loop43;
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
    // InternalPubProto.g:3745:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalPubProto.g:3745:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalPubProto.g:3746:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalPubProto.g:3752:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3758:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalPubProto.g:3759:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalPubProto.g:3759:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalPubProto.g:3760:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
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
            // InternalPubProto.g:3768:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case 66:
                    {
                    int LA44_2 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 139:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 140:
                    {
                    int LA44_4 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 141:
                    {
                    int LA44_5 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt44=1;
                    }


                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // InternalPubProto.g:3769:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalPubProto.g:3769:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalPubProto.g:3770:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalPubProto.g:3780:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalPubProto.g:3781:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalPubProto.g:3781:6: ()
            	    // InternalPubProto.g:3782:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3788:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalPubProto.g:3789:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalPubProto.g:3789:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalPubProto.g:3790:8: lv_operator_2_0= ruleOpMulti
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

            	    // InternalPubProto.g:3809:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalPubProto.g:3810:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalPubProto.g:3810:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalPubProto.g:3811:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
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
    // $ANTLR end "ruleDmxMultiplicativeExpression"


    // $ANTLR start "entryRuleDmxUnaryOperation"
    // InternalPubProto.g:3833:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalPubProto.g:3833:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalPubProto.g:3834:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalPubProto.g:3840:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3846:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalPubProto.g:3847:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalPubProto.g:3847:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=92 && LA45_0<=93)||(LA45_0>=142 && LA45_0<=144)) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_NATURAL)||(LA45_0>=28 && LA45_0<=29)||LA45_0==31||LA45_0==60||(LA45_0>=74 && LA45_0<=75)||LA45_0==77||LA45_0==81||(LA45_0>=86 && LA45_0<=89)) ) {
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
                    // InternalPubProto.g:3848:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalPubProto.g:3848:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalPubProto.g:3849:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalPubProto.g:3849:4: ()
                    // InternalPubProto.g:3850:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPubProto.g:3856:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalPubProto.g:3857:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalPubProto.g:3857:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalPubProto.g:3858:6: lv_operator_1_0= ruleOpUnary
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

                    // InternalPubProto.g:3875:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalPubProto.g:3876:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalPubProto.g:3876:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalPubProto.g:3877:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalPubProto.g:3896:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalPubProto.g:3908:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalPubProto.g:3908:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalPubProto.g:3909:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalPubProto.g:3915:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3921:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalPubProto.g:3922:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalPubProto.g:3922:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalPubProto.g:3923:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
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
            // InternalPubProto.g:3931:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==72) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred12_InternalPubProto()) ) {
                    alt46=1;
                }
            }
            else if ( (LA46_0==73) ) {
                int LA46_2 = input.LA(2);

                if ( (synpred12_InternalPubProto()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalPubProto.g:3932:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalPubProto.g:3932:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalPubProto.g:3933:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalPubProto.g:3939:5: ( () ruleDmxOpCast )
                    // InternalPubProto.g:3940:6: () ruleDmxOpCast
                    {
                    // InternalPubProto.g:3940:6: ()
                    // InternalPubProto.g:3941:7: 
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

                    // InternalPubProto.g:3956:4: ( (otherlv_3= RULE_ID ) )
                    // InternalPubProto.g:3957:5: (otherlv_3= RULE_ID )
                    {
                    // InternalPubProto.g:3957:5: (otherlv_3= RULE_ID )
                    // InternalPubProto.g:3958:6: otherlv_3= RULE_ID
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
    // InternalPubProto.g:3974:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalPubProto.g:3974:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalPubProto.g:3975:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalPubProto.g:3981:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:3987:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalPubProto.g:3988:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalPubProto.g:3988:2: (kw= 'AS' | kw= 'as' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            else if ( (LA47_0==73) ) {
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
                    // InternalPubProto.g:3989:3: kw= 'AS'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:3995:3: kw= 'as'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4004:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalPubProto.g:4004:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalPubProto.g:4005:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalPubProto.g:4011:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalPubProto.g:4017:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalPubProto.g:4018:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalPubProto.g:4018:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt48=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_NATURAL:
            case 28:
            case 29:
            case 74:
            case 75:
            case 86:
            case 87:
            case 88:
            case 89:
                {
                alt48=1;
                }
                break;
            case 60:
                {
                alt48=2;
                }
                break;
            case 31:
                {
                alt48=3;
                }
                break;
            case RULE_ID:
                {
                int LA48_4 = input.LA(2);

                if ( (LA48_4==60) ) {
                    alt48=4;
                }
                else if ( (LA48_4==EOF||LA48_4==56||LA48_4==59||LA48_4==61||(LA48_4>=66 && LA48_4<=68)||(LA48_4>=70 && LA48_4<=73)||LA48_4==76||LA48_4==85||(LA48_4>=92 && LA48_4<=93)||(LA48_4>=122 && LA48_4<=141)) ) {
                    alt48=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 4, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                alt48=5;
                }
                break;
            case 81:
                {
                alt48=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalPubProto.g:4019:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalPubProto.g:4028:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalPubProto.g:4037:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalPubProto.g:4046:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalPubProto.g:4055:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalPubProto.g:4064:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalPubProto.g:4073:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalPubProto.g:4085:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalPubProto.g:4085:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalPubProto.g:4086:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalPubProto.g:4092:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalPubProto.g:4098:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalPubProto.g:4099:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalPubProto.g:4099:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt49=7;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalPubProto.g:4100:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalPubProto.g:4109:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalPubProto.g:4118:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalPubProto.g:4127:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalPubProto.g:4136:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalPubProto.g:4145:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalPubProto.g:4154:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalPubProto.g:4166:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalPubProto.g:4166:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalPubProto.g:4167:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalPubProto.g:4173:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4179:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalPubProto.g:4180:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalPubProto.g:4180:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalPubProto.g:4181:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); if (state.failed) return current;
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
            otherlv_2=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4201:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalPubProto.g:4201:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalPubProto.g:4202:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalPubProto.g:4208:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4214:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalPubProto.g:4215:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalPubProto.g:4215:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalPubProto.g:4216:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalPubProto.g:4216:3: ()
            // InternalPubProto.g:4217:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4227:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPubProto.g:4228:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalPubProto.g:4228:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalPubProto.g:4229:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4229:5: (lv_elements_2_0= ruleDExpression )
                    // InternalPubProto.g:4230:6: lv_elements_2_0= ruleDExpression
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
                      							"com.mimacom.ddd.pub.proto.PubProto.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPubProto.g:4247:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==56) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalPubProto.g:4248:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4252:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalPubProto.g:4253:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:4253:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalPubProto.g:4254:7: lv_elements_4_0= ruleDExpression
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
                    	      								"com.mimacom.ddd.pub.proto.PubProto.DExpression");
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

            otherlv_5=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4281:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalPubProto.g:4281:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalPubProto.g:4282:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalPubProto.g:4288:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4294:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalPubProto.g:4295:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalPubProto.g:4295:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalPubProto.g:4296:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalPubProto.g:4296:3: ()
            // InternalPubProto.g:4297:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4307:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_NATURAL)||(LA53_0>=28 && LA53_0<=29)||(LA53_0>=74 && LA53_0<=75)||(LA53_0>=86 && LA53_0<=89)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPubProto.g:4308:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalPubProto.g:4308:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalPubProto.g:4309:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalPubProto.g:4309:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalPubProto.g:4310:6: lv_elements_2_0= ruleDmxLiteralExpression
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

                    // InternalPubProto.g:4327:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==56) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalPubProto.g:4328:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,56,FOLLOW_66); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4332:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalPubProto.g:4333:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalPubProto.g:4333:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalPubProto.g:4334:7: lv_elements_4_0= ruleDmxLiteralExpression
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4361:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalPubProto.g:4361:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalPubProto.g:4362:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalPubProto.g:4368:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4374:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalPubProto.g:4375:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalPubProto.g:4375:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalPubProto.g:4376:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalPubProto.g:4376:3: ()
            // InternalPubProto.g:4377:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4383:3: ( (otherlv_1= RULE_ID ) )
            // InternalPubProto.g:4384:4: (otherlv_1= RULE_ID )
            {
            // InternalPubProto.g:4384:4: (otherlv_1= RULE_ID )
            // InternalPubProto.g:4385:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:4400:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalPubProto.g:4401:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalPubProto.g:4401:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalPubProto.g:4402:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
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

            otherlv_4=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4427:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalPubProto.g:4427:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalPubProto.g:4428:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalPubProto.g:4434:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4440:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalPubProto.g:4441:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalPubProto.g:4441:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalPubProto.g:4442:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalPubProto.g:4442:3: ()
            // InternalPubProto.g:4443:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4449:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPubProto.g:4450:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalPubProto.g:4450:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalPubProto.g:4451:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4451:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalPubProto.g:4452:6: lv_arguments_1_0= ruleDExpression
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
                      							"com.mimacom.ddd.pub.proto.PubProto.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPubProto.g:4469:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==56) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalPubProto.g:4470:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4474:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalPubProto.g:4475:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:4475:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalPubProto.g:4476:7: lv_arguments_3_0= ruleDExpression
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
                    	      								"com.mimacom.ddd.pub.proto.PubProto.DExpression");
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
    // InternalPubProto.g:4499:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalPubProto.g:4499:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalPubProto.g:4500:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalPubProto.g:4506:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4512:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalPubProto.g:4513:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalPubProto.g:4513:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalPubProto.g:4514:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,74,FOLLOW_4); if (state.failed) return current;
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
    // InternalPubProto.g:4533:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalPubProto.g:4533:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalPubProto.g:4534:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalPubProto.g:4540:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4546:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalPubProto.g:4547:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalPubProto.g:4547:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalPubProto.g:4548:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,75,FOLLOW_4); if (state.failed) return current;
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
    // InternalPubProto.g:4568:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4574:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalPubProto.g:4575:2: ( ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalPubProto.g:4575:2: ( ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalPubProto.g:4576:3: ( (otherlv_0= RULE_ID ) ) ruleDmxFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalPubProto.g:4576:3: ( (otherlv_0= RULE_ID ) )
            // InternalPubProto.g:4577:4: (otherlv_0= RULE_ID )
            {
            // InternalPubProto.g:4577:4: (otherlv_0= RULE_ID )
            // InternalPubProto.g:4578:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxComplexObjectRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxComplexObjectAccess().getTypeDComplexTypeCrossReference_0_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getDmxFieldListStartSymbolParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_63);
            ruleDmxFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:4596:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalPubProto.g:4597:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalPubProto.g:4597:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalPubProto.g:4598:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    break loop56;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4623:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalPubProto.g:4623:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalPubProto.g:4624:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalPubProto.g:4630:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )* ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_notes_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4636:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )* ) )
            // InternalPubProto.g:4637:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )* )
            {
            // InternalPubProto.g:4637:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )* )
            // InternalPubProto.g:4638:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ( (lv_description_3_0= ruleDRichText ) )? ( (lv_notes_4_0= ruleDNote ) )*
            {
            // InternalPubProto.g:4638:3: ( (otherlv_0= RULE_ID ) )
            // InternalPubProto.g:4639:4: (otherlv_0= RULE_ID )
            {
            // InternalPubProto.g:4639:4: (otherlv_0= RULE_ID )
            // InternalPubProto.g:4640:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,76,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPubProto.g:4655:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalPubProto.g:4656:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalPubProto.g:4656:4: (lv_value_2_0= ruleDExpression )
            // InternalPubProto.g:4657:5: lv_value_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFieldAccess().getValueDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_68);
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
              						"com.mimacom.ddd.pub.proto.PubProto.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPubProto.g:4674:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_PLAIN_TEXT_ONLY && LA57_0<=RULE_RICH_TEXT_START)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPubProto.g:4675:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalPubProto.g:4675:4: (lv_description_3_0= ruleDRichText )
                    // InternalPubProto.g:4676:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxFieldAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_69);
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

            // InternalPubProto.g:4693:3: ( (lv_notes_4_0= ruleDNote ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==52) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalPubProto.g:4694:4: (lv_notes_4_0= ruleDNote )
            	    {
            	    // InternalPubProto.g:4694:4: (lv_notes_4_0= ruleDNote )
            	    // InternalPubProto.g:4695:5: lv_notes_4_0= ruleDNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxFieldAccess().getNotesDNoteParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_69);
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
    // $ANTLR end "ruleDmxField"


    // $ANTLR start "entryRuleDmxStaticReference"
    // InternalPubProto.g:4716:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalPubProto.g:4716:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalPubProto.g:4717:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalPubProto.g:4723:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalPubProto.g:4729:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalPubProto.g:4730:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalPubProto.g:4730:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalPubProto.g:4731:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalPubProto.g:4731:3: ()
            // InternalPubProto.g:4732:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4742:3: ( ( ruleDQualifiedName ) )
            // InternalPubProto.g:4743:4: ( ruleDQualifiedName )
            {
            // InternalPubProto.g:4743:4: ( ruleDQualifiedName )
            // InternalPubProto.g:4744:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_70);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPubProto.g:4758:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==78) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPubProto.g:4759:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalPubProto.g:4763:4: ( (otherlv_4= RULE_ID ) )
                    // InternalPubProto.g:4764:5: (otherlv_4= RULE_ID )
                    {
                    // InternalPubProto.g:4764:5: (otherlv_4= RULE_ID )
                    // InternalPubProto.g:4765:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:4777:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==69) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalPubProto.g:4778:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:4782:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_ID) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==66) ) {
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
                            // InternalPubProto.g:4783:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalPubProto.g:4783:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalPubProto.g:4784:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalPubProto.g:4784:6: (lv_displayName_6_0= RULE_ID )
                            // InternalPubProto.g:4785:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
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
                            // InternalPubProto.g:4802:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalPubProto.g:4802:5: ( (lv_plural_7_0= '*' ) )
                            // InternalPubProto.g:4803:6: (lv_plural_7_0= '*' )
                            {
                            // InternalPubProto.g:4803:6: (lv_plural_7_0= '*' )
                            // InternalPubProto.g:4804:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,66,FOLLOW_73); if (state.failed) return current;
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

            // InternalPubProto.g:4818:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalPubProto.g:4819:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4829:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalPubProto.g:4829:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalPubProto.g:4830:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalPubProto.g:4836:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:4842:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalPubProto.g:4843:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalPubProto.g:4843:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalPubProto.g:4844:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalPubProto.g:4844:3: ()
            // InternalPubProto.g:4845:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4851:3: ( (otherlv_1= RULE_ID ) )
            // InternalPubProto.g:4852:4: (otherlv_1= RULE_ID )
            {
            // InternalPubProto.g:4852:4: (otherlv_1= RULE_ID )
            // InternalPubProto.g:4853:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalPubProto.g:4864:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==68) ) {
                alt62=1;
            }
            else if ( (LA62_0==67) ) {
                int LA62_2 = input.LA(2);

                if ( (LA62_2==80) ) {
                    alt62=2;
                }
            }
            switch (alt62) {
                case 1 :
                    // InternalPubProto.g:4865:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalPubProto.g:4865:4: ( (lv_before_2_0= '@before' ) )
                    // InternalPubProto.g:4866:5: (lv_before_2_0= '@before' )
                    {
                    // InternalPubProto.g:4866:5: (lv_before_2_0= '@before' )
                    // InternalPubProto.g:4867:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPubProto.g:4880:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalPubProto.g:4880:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalPubProto.g:4881:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalPubProto.g:4885:5: ( (lv_all_4_0= 'all' ) )
                    // InternalPubProto.g:4886:6: (lv_all_4_0= 'all' )
                    {
                    // InternalPubProto.g:4886:6: (lv_all_4_0= 'all' )
                    // InternalPubProto.g:4887:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4905:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalPubProto.g:4905:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalPubProto.g:4906:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalPubProto.g:4912:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalPubProto.g:4918:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalPubProto.g:4919:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalPubProto.g:4919:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalPubProto.g:4920:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalPubProto.g:4920:3: ()
            // InternalPubProto.g:4921:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalPubProto.g:4931:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalPubProto.g:4932:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalPubProto.g:4932:4: (lv_if_2_0= ruleDExpression )
            // InternalPubProto.g:4933:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_76);
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
              						"com.mimacom.ddd.pub.proto.PubProto.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,82,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalPubProto.g:4954:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalPubProto.g:4955:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalPubProto.g:4955:4: (lv_then_4_0= ruleDExpression )
            // InternalPubProto.g:4956:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_77);
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
              						"com.mimacom.ddd.pub.proto.PubProto.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPubProto.g:4973:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==83) && (synpred14_InternalPubProto())) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalPubProto.g:4974:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalPubProto.g:4974:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalPubProto.g:4975:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,83,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalPubProto.g:4981:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalPubProto.g:4982:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4982:5: (lv_else_6_0= ruleDExpression )
                    // InternalPubProto.g:4983:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_78);
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
                      							"com.mimacom.ddd.pub.proto.PubProto.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5009:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalPubProto.g:5009:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalPubProto.g:5010:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalPubProto.g:5016:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalPubProto.g:5022:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalPubProto.g:5023:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalPubProto.g:5023:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==66||LA64_0==92||LA64_0==145) ) {
                alt64=1;
            }
            else if ( (LA64_0==60) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalPubProto.g:5024:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalPubProto.g:5024:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalPubProto.g:5025:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalPubProto.g:5025:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalPubProto.g:5026:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalPubProto.g:5044:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalPubProto.g:5044:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalPubProto.g:5045:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalPubProto.g:5049:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalPubProto.g:5050:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalPubProto.g:5050:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalPubProto.g:5051:6: lv_minOccurs_2_0= RULE_NATURAL
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

                    otherlv_3=(Token)match(input,85,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalPubProto.g:5071:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalPubProto.g:5072:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalPubProto.g:5072:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalPubProto.g:5073:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
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

                    otherlv_5=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5099:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalPubProto.g:5099:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalPubProto.g:5100:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalPubProto.g:5106:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:5112:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalPubProto.g:5113:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalPubProto.g:5113:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_NATURAL) ) {
                alt65=1;
            }
            else if ( (LA65_0==66) ) {
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
                    // InternalPubProto.g:5114:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalPubProto.g:5122:3: kw= '*'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5131:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalPubProto.g:5131:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalPubProto.g:5132:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalPubProto.g:5138:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:5144:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalPubProto.g:5145:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalPubProto.g:5145:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalPubProto.g:5146:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalPubProto.g:5146:3: ()
            // InternalPubProto.g:5147:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5153:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt66=1;
                }
                break;
            case 28:
                {
                alt66=2;
                }
                break;
            case 87:
                {
                alt66=3;
                }
                break;
            case 29:
                {
                alt66=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalPubProto.g:5154:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalPubProto.g:5154:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalPubProto.g:5155:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalPubProto.g:5155:5: (lv_value_1_0= 'TRUE' )
                    // InternalPubProto.g:5156:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPubProto.g:5169:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalPubProto.g:5169:4: ( (lv_value_2_0= 'true' ) )
                    // InternalPubProto.g:5170:5: (lv_value_2_0= 'true' )
                    {
                    // InternalPubProto.g:5170:5: (lv_value_2_0= 'true' )
                    // InternalPubProto.g:5171:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPubProto.g:5184:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5189:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5198:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalPubProto.g:5198:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalPubProto.g:5199:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalPubProto.g:5205:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:5211:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalPubProto.g:5212:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalPubProto.g:5212:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalPubProto.g:5213:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalPubProto.g:5213:3: ()
            // InternalPubProto.g:5214:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5220:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalPubProto.g:5221:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalPubProto.g:5221:4: (lv_value_1_0= RULE_NATURAL )
            // InternalPubProto.g:5222:5: lv_value_1_0= RULE_NATURAL
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
    // InternalPubProto.g:5242:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalPubProto.g:5242:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalPubProto.g:5243:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalPubProto.g:5249:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:5255:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalPubProto.g:5256:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalPubProto.g:5256:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalPubProto.g:5257:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalPubProto.g:5257:3: ()
            // InternalPubProto.g:5258:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5264:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalPubProto.g:5265:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalPubProto.g:5265:4: (lv_value_1_0= ruleDECIMAL )
            // InternalPubProto.g:5266:5: lv_value_1_0= ruleDECIMAL
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
    // InternalPubProto.g:5287:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalPubProto.g:5287:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalPubProto.g:5288:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalPubProto.g:5294:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:5300:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalPubProto.g:5301:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalPubProto.g:5301:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalPubProto.g:5302:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalPubProto.g:5302:3: ()
            // InternalPubProto.g:5303:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5309:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalPubProto.g:5310:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalPubProto.g:5310:4: (lv_value_1_0= RULE_STRING )
            // InternalPubProto.g:5311:5: lv_value_1_0= RULE_STRING
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
    // InternalPubProto.g:5331:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalPubProto.g:5331:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalPubProto.g:5332:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalPubProto.g:5338:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5344:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalPubProto.g:5345:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalPubProto.g:5345:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalPubProto.g:5346:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalPubProto.g:5346:3: ()
            // InternalPubProto.g:5347:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5353:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==88) ) {
                alt67=1;
            }
            else if ( (LA67_0==89) ) {
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
                    // InternalPubProto.g:5354:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5359:4: otherlv_2= 'undefined'
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
    // InternalPubProto.g:5368:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalPubProto.g:5368:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalPubProto.g:5369:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalPubProto.g:5375:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalPubProto.g:5381:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalPubProto.g:5382:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalPubProto.g:5382:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalPubProto.g:5383:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_22); if (state.failed) return current;
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
            // InternalPubProto.g:5402:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=90 && LA70_0<=91)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalPubProto.g:5403:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalPubProto.g:5403:4: (kw= 'E' | kw= 'e' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==90) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==91) ) {
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
                            // InternalPubProto.g:5404:5: kw= 'E'
                            {
                            kw=(Token)match(input,90,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:5410:5: kw= 'e'
                            {
                            kw=(Token)match(input,91,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalPubProto.g:5416:4: (kw= '+' | kw= '-' )?
                    int alt69=3;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==92) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==93) ) {
                        alt69=2;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalPubProto.g:5417:5: kw= '+'
                            {
                            kw=(Token)match(input,92,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:5423:5: kw= '-'
                            {
                            kw=(Token)match(input,93,FOLLOW_22); if (state.failed) return current;
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
    // InternalPubProto.g:5441:1: entryRuleDmxFieldListStartSymbol returns [String current=null] : iv_ruleDmxFieldListStartSymbol= ruleDmxFieldListStartSymbol EOF ;
    public final String entryRuleDmxFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxFieldListStartSymbol = null;


        try {
            // InternalPubProto.g:5441:63: (iv_ruleDmxFieldListStartSymbol= ruleDmxFieldListStartSymbol EOF )
            // InternalPubProto.g:5442:2: iv_ruleDmxFieldListStartSymbol= ruleDmxFieldListStartSymbol EOF
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
    // InternalPubProto.g:5448:1: ruleDmxFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDmxFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:5454:2: (kw= '{' )
            // InternalPubProto.g:5455:2: kw= '{'
            {
            kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5463:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalPubProto.g:5463:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalPubProto.g:5464:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalPubProto.g:5470:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:5476:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalPubProto.g:5477:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalPubProto.g:5477:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalPubProto.g:5478:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
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
            // InternalPubProto.g:5488:3: (kw= '.*' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==94) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalPubProto.g:5489:4: kw= '.*'
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
    // InternalPubProto.g:5499:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalPubProto.g:5499:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalPubProto.g:5500:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalPubProto.g:5506:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5512:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalPubProto.g:5513:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalPubProto.g:5513:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalPubProto.g:5514:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalPubProto.g:5521:3: (kw= '.' this_ID_2= RULE_ID )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==67) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalPubProto.g:5522:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,67,FOLLOW_4); if (state.failed) return current;
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
            	    break loop72;
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


    // $ANTLR start "rulePublicationNature"
    // InternalPubProto.g:5539:1: rulePublicationNature returns [Enumerator current=null] : ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) ) ;
    public final Enumerator rulePublicationNature() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:5545:2: ( ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) ) )
            // InternalPubProto.g:5546:2: ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) )
            {
            // InternalPubProto.g:5546:2: ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==95) ) {
                alt73=1;
            }
            else if ( (LA73_0==96) ) {
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
                    // InternalPubProto.g:5547:3: (enumLiteral_0= 'Print' )
                    {
                    // InternalPubProto.g:5547:3: (enumLiteral_0= 'Print' )
                    // InternalPubProto.g:5548:4: enumLiteral_0= 'Print'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5555:3: (enumLiteral_1= 'Web' )
                    {
                    // InternalPubProto.g:5555:3: (enumLiteral_1= 'Web' )
                    // InternalPubProto.g:5556:4: enumLiteral_1= 'Web'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPublicationNatureAccess().getWebEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPublicationNatureAccess().getWebEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "rulePublicationNature"


    // $ANTLR start "ruleProtoSequenceNumberStyle"
    // InternalPubProto.g:5566:1: ruleProtoSequenceNumberStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) ) ;
    public final Enumerator ruleProtoSequenceNumberStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalPubProto.g:5572:2: ( ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) ) )
            // InternalPubProto.g:5573:2: ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) )
            {
            // InternalPubProto.g:5573:2: ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) )
            int alt74=6;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt74=1;
                }
                break;
            case 98:
                {
                alt74=2;
                }
                break;
            case 99:
                {
                alt74=3;
                }
                break;
            case 100:
                {
                alt74=4;
                }
                break;
            case 101:
                {
                alt74=5;
                }
                break;
            case 102:
                {
                alt74=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalPubProto.g:5574:3: (enumLiteral_0= 'arabic' )
                    {
                    // InternalPubProto.g:5574:3: (enumLiteral_0= 'arabic' )
                    // InternalPubProto.g:5575:4: enumLiteral_0= 'arabic'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5582:3: (enumLiteral_1= 'capitalLetter' )
                    {
                    // InternalPubProto.g:5582:3: (enumLiteral_1= 'capitalLetter' )
                    // InternalPubProto.g:5583:4: enumLiteral_1= 'capitalLetter'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5590:3: (enumLiteral_2= 'smallLetter' )
                    {
                    // InternalPubProto.g:5590:3: (enumLiteral_2= 'smallLetter' )
                    // InternalPubProto.g:5591:4: enumLiteral_2= 'smallLetter'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5598:3: (enumLiteral_3= 'capitalRoman' )
                    {
                    // InternalPubProto.g:5598:3: (enumLiteral_3= 'capitalRoman' )
                    // InternalPubProto.g:5599:4: enumLiteral_3= 'capitalRoman'
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5606:3: (enumLiteral_4= 'smallRoman' )
                    {
                    // InternalPubProto.g:5606:3: (enumLiteral_4= 'smallRoman' )
                    // InternalPubProto.g:5607:4: enumLiteral_4= 'smallRoman'
                    {
                    enumLiteral_4=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5614:3: (enumLiteral_5= 'none' )
                    {
                    // InternalPubProto.g:5614:3: (enumLiteral_5= 'none' )
                    // InternalPubProto.g:5615:4: enumLiteral_5= 'none'
                    {
                    enumLiteral_5=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getNoneEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getProtoSequenceNumberStyleAccess().getNoneEnumLiteralDeclaration_5());
                      			
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
    // $ANTLR end "ruleProtoSequenceNumberStyle"


    // $ANTLR start "ruleDNoteColor"
    // InternalPubProto.g:5625:1: ruleDNoteColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'yellow' ) | (enumLiteral_4= 'green' ) | (enumLiteral_5= 'blue' ) | (enumLiteral_6= 'pink' ) | (enumLiteral_7= 'grey' ) ) ;
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
            // InternalPubProto.g:5631:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'yellow' ) | (enumLiteral_4= 'green' ) | (enumLiteral_5= 'blue' ) | (enumLiteral_6= 'pink' ) | (enumLiteral_7= 'grey' ) ) )
            // InternalPubProto.g:5632:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'yellow' ) | (enumLiteral_4= 'green' ) | (enumLiteral_5= 'blue' ) | (enumLiteral_6= 'pink' ) | (enumLiteral_7= 'grey' ) )
            {
            // InternalPubProto.g:5632:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'yellow' ) | (enumLiteral_4= 'green' ) | (enumLiteral_5= 'blue' ) | (enumLiteral_6= 'pink' ) | (enumLiteral_7= 'grey' ) )
            int alt75=8;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt75=1;
                }
                break;
            case 104:
                {
                alt75=2;
                }
                break;
            case 105:
                {
                alt75=3;
                }
                break;
            case 106:
                {
                alt75=4;
                }
                break;
            case 107:
                {
                alt75=5;
                }
                break;
            case 108:
                {
                alt75=6;
                }
                break;
            case 109:
                {
                alt75=7;
                }
                break;
            case 110:
                {
                alt75=8;
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
                    // InternalPubProto.g:5633:3: (enumLiteral_0= 'white' )
                    {
                    // InternalPubProto.g:5633:3: (enumLiteral_0= 'white' )
                    // InternalPubProto.g:5634:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDNoteColorAccess().getWHITEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5641:3: (enumLiteral_1= 'red' )
                    {
                    // InternalPubProto.g:5641:3: (enumLiteral_1= 'red' )
                    // InternalPubProto.g:5642:4: enumLiteral_1= 'red'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDNoteColorAccess().getREDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5649:3: (enumLiteral_2= 'orange' )
                    {
                    // InternalPubProto.g:5649:3: (enumLiteral_2= 'orange' )
                    // InternalPubProto.g:5650:4: enumLiteral_2= 'orange'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getORANGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDNoteColorAccess().getORANGEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5657:3: (enumLiteral_3= 'yellow' )
                    {
                    // InternalPubProto.g:5657:3: (enumLiteral_3= 'yellow' )
                    // InternalPubProto.g:5658:4: enumLiteral_3= 'yellow'
                    {
                    enumLiteral_3=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getYELLOWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDNoteColorAccess().getYELLOWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5665:3: (enumLiteral_4= 'green' )
                    {
                    // InternalPubProto.g:5665:3: (enumLiteral_4= 'green' )
                    // InternalPubProto.g:5666:4: enumLiteral_4= 'green'
                    {
                    enumLiteral_4=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getGREENEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDNoteColorAccess().getGREENEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5673:3: (enumLiteral_5= 'blue' )
                    {
                    // InternalPubProto.g:5673:3: (enumLiteral_5= 'blue' )
                    // InternalPubProto.g:5674:4: enumLiteral_5= 'blue'
                    {
                    enumLiteral_5=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getBLUEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDNoteColorAccess().getBLUEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPubProto.g:5681:3: (enumLiteral_6= 'pink' )
                    {
                    // InternalPubProto.g:5681:3: (enumLiteral_6= 'pink' )
                    // InternalPubProto.g:5682:4: enumLiteral_6= 'pink'
                    {
                    enumLiteral_6=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDNoteColorAccess().getPINKEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDNoteColorAccess().getPINKEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPubProto.g:5689:3: (enumLiteral_7= 'grey' )
                    {
                    // InternalPubProto.g:5689:3: (enumLiteral_7= 'grey' )
                    // InternalPubProto.g:5690:4: enumLiteral_7= 'grey'
                    {
                    enumLiteral_7=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5700:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalPubProto.g:5706:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalPubProto.g:5707:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalPubProto.g:5707:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt76=11;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt76=1;
                }
                break;
            case 112:
                {
                alt76=2;
                }
                break;
            case 113:
                {
                alt76=3;
                }
                break;
            case 114:
                {
                alt76=4;
                }
                break;
            case 115:
                {
                alt76=5;
                }
                break;
            case 116:
                {
                alt76=6;
                }
                break;
            case 117:
                {
                alt76=7;
                }
                break;
            case 118:
                {
                alt76=8;
                }
                break;
            case 119:
                {
                alt76=9;
                }
                break;
            case 120:
                {
                alt76=10;
                }
                break;
            case 121:
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
                    // InternalPubProto.g:5708:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalPubProto.g:5708:3: (enumLiteral_0= 'VOID' )
                    // InternalPubProto.g:5709:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5716:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalPubProto.g:5716:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalPubProto.g:5717:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5724:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalPubProto.g:5724:3: (enumLiteral_2= 'NUMBER' )
                    // InternalPubProto.g:5725:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5732:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalPubProto.g:5732:3: (enumLiteral_3= 'TEXT' )
                    // InternalPubProto.g:5733:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5740:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalPubProto.g:5740:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalPubProto.g:5741:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5748:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalPubProto.g:5748:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalPubProto.g:5749:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPubProto.g:5756:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalPubProto.g:5756:3: (enumLiteral_6= 'STATE' )
                    // InternalPubProto.g:5757:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPubProto.g:5764:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalPubProto.g:5764:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalPubProto.g:5765:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalPubProto.g:5772:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalPubProto.g:5772:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalPubProto.g:5773:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPubProto.g:5780:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalPubProto.g:5780:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalPubProto.g:5781:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalPubProto.g:5788:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalPubProto.g:5788:3: (enumLiteral_10= 'SERVICE' )
                    // InternalPubProto.g:5789:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5799:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPubProto.g:5805:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalPubProto.g:5806:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalPubProto.g:5806:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt77=1;
                }
                break;
            case 123:
                {
                alt77=2;
                }
                break;
            case 124:
                {
                alt77=3;
                }
                break;
            case 125:
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
                    // InternalPubProto.g:5807:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalPubProto.g:5807:3: (enumLiteral_0= 'OR' )
                    // InternalPubProto.g:5808:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5815:3: (enumLiteral_1= 'or' )
                    {
                    // InternalPubProto.g:5815:3: (enumLiteral_1= 'or' )
                    // InternalPubProto.g:5816:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5823:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalPubProto.g:5823:3: (enumLiteral_2= 'XOR' )
                    // InternalPubProto.g:5824:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5831:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalPubProto.g:5831:3: (enumLiteral_3= 'xor' )
                    // InternalPubProto.g:5832:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5842:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:5848:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalPubProto.g:5849:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalPubProto.g:5849:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==126) ) {
                alt78=1;
            }
            else if ( (LA78_0==127) ) {
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
                    // InternalPubProto.g:5850:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalPubProto.g:5850:3: (enumLiteral_0= 'AND' )
                    // InternalPubProto.g:5851:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5858:3: (enumLiteral_1= 'and' )
                    {
                    // InternalPubProto.g:5858:3: (enumLiteral_1= 'and' )
                    // InternalPubProto.g:5859:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5869:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5875:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalPubProto.g:5876:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalPubProto.g:5876:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt79=1;
                }
                break;
            case 128:
                {
                alt79=2;
                }
                break;
            case 129:
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
                    // InternalPubProto.g:5877:3: (enumLiteral_0= '=' )
                    {
                    // InternalPubProto.g:5877:3: (enumLiteral_0= '=' )
                    // InternalPubProto.g:5878:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5885:3: (enumLiteral_1= '!=' )
                    {
                    // InternalPubProto.g:5885:3: (enumLiteral_1= '!=' )
                    // InternalPubProto.g:5886:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5893:3: (enumLiteral_2= '<>' )
                    {
                    // InternalPubProto.g:5893:3: (enumLiteral_2= '<>' )
                    // InternalPubProto.g:5894:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5904:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalPubProto.g:5910:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalPubProto.g:5911:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalPubProto.g:5911:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt80=6;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt80=1;
                }
                break;
            case 131:
                {
                alt80=2;
                }
                break;
            case 132:
                {
                alt80=3;
                }
                break;
            case 133:
                {
                alt80=4;
                }
                break;
            case 134:
                {
                alt80=5;
                }
                break;
            case 135:
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
                    // InternalPubProto.g:5912:3: (enumLiteral_0= '<' )
                    {
                    // InternalPubProto.g:5912:3: (enumLiteral_0= '<' )
                    // InternalPubProto.g:5913:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5920:3: (enumLiteral_1= '<=' )
                    {
                    // InternalPubProto.g:5920:3: (enumLiteral_1= '<=' )
                    // InternalPubProto.g:5921:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5928:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalPubProto.g:5928:3: (enumLiteral_2= '\\u2264' )
                    // InternalPubProto.g:5929:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5936:3: (enumLiteral_3= '>=' )
                    {
                    // InternalPubProto.g:5936:3: (enumLiteral_3= '>=' )
                    // InternalPubProto.g:5937:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5944:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalPubProto.g:5944:3: (enumLiteral_4= '\\u2265' )
                    // InternalPubProto.g:5945:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5952:3: (enumLiteral_5= '>' )
                    {
                    // InternalPubProto.g:5952:3: (enumLiteral_5= '>' )
                    // InternalPubProto.g:5953:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5963:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:5969:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalPubProto.g:5970:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalPubProto.g:5970:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt81=5;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt81=1;
                }
                break;
            case 59:
                {
                alt81=2;
                }
                break;
            case 85:
                {
                alt81=3;
                }
                break;
            case 137:
                {
                alt81=4;
                }
                break;
            case 138:
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
                    // InternalPubProto.g:5971:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalPubProto.g:5971:3: (enumLiteral_0= 'IN' )
                    // InternalPubProto.g:5972:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5979:3: (enumLiteral_1= 'in' )
                    {
                    // InternalPubProto.g:5979:3: (enumLiteral_1= 'in' )
                    // InternalPubProto.g:5980:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5987:3: (enumLiteral_2= '..' )
                    {
                    // InternalPubProto.g:5987:3: (enumLiteral_2= '..' )
                    // InternalPubProto.g:5988:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5995:3: (enumLiteral_3= '->' )
                    {
                    // InternalPubProto.g:5995:3: (enumLiteral_3= '->' )
                    // InternalPubProto.g:5996:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:6003:3: (enumLiteral_4= '=>' )
                    {
                    // InternalPubProto.g:6003:3: (enumLiteral_4= '=>' )
                    // InternalPubProto.g:6004:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:6014:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:6020:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalPubProto.g:6021:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalPubProto.g:6021:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==92) ) {
                alt82=1;
            }
            else if ( (LA82_0==93) ) {
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
                    // InternalPubProto.g:6022:3: (enumLiteral_0= '+' )
                    {
                    // InternalPubProto.g:6022:3: (enumLiteral_0= '+' )
                    // InternalPubProto.g:6023:4: enumLiteral_0= '+'
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
                    // InternalPubProto.g:6030:3: (enumLiteral_1= '-' )
                    {
                    // InternalPubProto.g:6030:3: (enumLiteral_1= '-' )
                    // InternalPubProto.g:6031:4: enumLiteral_1= '-'
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
    // InternalPubProto.g:6041:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPubProto.g:6047:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalPubProto.g:6048:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalPubProto.g:6048:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt83=1;
                }
                break;
            case 139:
                {
                alt83=2;
                }
                break;
            case 140:
                {
                alt83=3;
                }
                break;
            case 141:
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
                    // InternalPubProto.g:6049:3: (enumLiteral_0= '*' )
                    {
                    // InternalPubProto.g:6049:3: (enumLiteral_0= '*' )
                    // InternalPubProto.g:6050:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:6057:3: (enumLiteral_1= '/' )
                    {
                    // InternalPubProto.g:6057:3: (enumLiteral_1= '/' )
                    // InternalPubProto.g:6058:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:6065:3: (enumLiteral_2= '**' )
                    {
                    // InternalPubProto.g:6065:3: (enumLiteral_2= '**' )
                    // InternalPubProto.g:6066:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:6073:3: (enumLiteral_3= '%' )
                    {
                    // InternalPubProto.g:6073:3: (enumLiteral_3= '%' )
                    // InternalPubProto.g:6074:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:6084:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:6090:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalPubProto.g:6091:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalPubProto.g:6091:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt84=1;
                }
                break;
            case 93:
                {
                alt84=2;
                }
                break;
            case 142:
                {
                alt84=3;
                }
                break;
            case 143:
                {
                alt84=4;
                }
                break;
            case 144:
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
                    // InternalPubProto.g:6092:3: (enumLiteral_0= '+' )
                    {
                    // InternalPubProto.g:6092:3: (enumLiteral_0= '+' )
                    // InternalPubProto.g:6093:4: enumLiteral_0= '+'
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
                    // InternalPubProto.g:6100:3: (enumLiteral_1= '-' )
                    {
                    // InternalPubProto.g:6100:3: (enumLiteral_1= '-' )
                    // InternalPubProto.g:6101:4: enumLiteral_1= '-'
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
                    // InternalPubProto.g:6108:3: (enumLiteral_2= '!' )
                    {
                    // InternalPubProto.g:6108:3: (enumLiteral_2= '!' )
                    // InternalPubProto.g:6109:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:6116:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalPubProto.g:6116:3: (enumLiteral_3= 'NOT' )
                    // InternalPubProto.g:6117:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:6124:3: (enumLiteral_4= 'not' )
                    {
                    // InternalPubProto.g:6124:3: (enumLiteral_4= 'not' )
                    // InternalPubProto.g:6125:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:6135:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:6141:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalPubProto.g:6142:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalPubProto.g:6142:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt85=3;
            switch ( input.LA(1) ) {
            case 145:
                {
                alt85=1;
                }
                break;
            case 92:
                {
                alt85=2;
                }
                break;
            case 66:
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
                    // InternalPubProto.g:6143:3: (enumLiteral_0= '?' )
                    {
                    // InternalPubProto.g:6143:3: (enumLiteral_0= '?' )
                    // InternalPubProto.g:6144:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:6151:3: (enumLiteral_1= '+' )
                    {
                    // InternalPubProto.g:6151:3: (enumLiteral_1= '+' )
                    // InternalPubProto.g:6152:4: enumLiteral_1= '+'
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
                    // InternalPubProto.g:6159:3: (enumLiteral_2= '*' )
                    {
                    // InternalPubProto.g:6159:3: (enumLiteral_2= '*' )
                    // InternalPubProto.g:6160:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalPubProto
    public final void synpred1_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:2769:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalPubProto.g:2769:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalPubProto.g:2769:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalPubProto.g:2770:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalPubProto.g:2770:7: ()
        // InternalPubProto.g:2771:7: 
        {
        }

        match(input,67,FOLLOW_4); if (state.failed) return ;
        // InternalPubProto.g:2773:7: ( ( RULE_ID ) )
        // InternalPubProto.g:2774:8: ( RULE_ID )
        {
        // InternalPubProto.g:2774:8: ( RULE_ID )
        // InternalPubProto.g:2775:9: RULE_ID
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
    // $ANTLR end synpred1_InternalPubProto

    // $ANTLR start synpred2_InternalPubProto
    public final void synpred2_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:2838:6: ( ( () '.' ) )
        // InternalPubProto.g:2838:7: ( () '.' )
        {
        // InternalPubProto.g:2838:7: ( () '.' )
        // InternalPubProto.g:2839:7: () '.'
        {
        // InternalPubProto.g:2839:7: ()
        // InternalPubProto.g:2840:7: 
        {
        }

        match(input,67,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalPubProto

    // $ANTLR start synpred3_InternalPubProto
    public final void synpred3_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:2874:8: ( ( '(' ) )
        // InternalPubProto.g:2874:9: ( '(' )
        {
        // InternalPubProto.g:2874:9: ( '(' )
        // InternalPubProto.g:2875:9: '('
        {
        match(input,60,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalPubProto

    // $ANTLR start synpred4_InternalPubProto
    public final void synpred4_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3170:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalPubProto.g:3170:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalPubProto.g:3170:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalPubProto.g:3171:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalPubProto.g:3171:6: ()
        // InternalPubProto.g:3172:6: 
        {
        }

        // InternalPubProto.g:3173:6: ( ( ruleDmxOpOr ) )
        // InternalPubProto.g:3174:7: ( ruleDmxOpOr )
        {
        // InternalPubProto.g:3174:7: ( ruleDmxOpOr )
        // InternalPubProto.g:3175:8: ruleDmxOpOr
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
    // $ANTLR end synpred4_InternalPubProto

    // $ANTLR start synpred5_InternalPubProto
    public final void synpred5_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3258:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalPubProto.g:3258:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalPubProto.g:3258:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalPubProto.g:3259:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalPubProto.g:3259:6: ()
        // InternalPubProto.g:3260:6: 
        {
        }

        // InternalPubProto.g:3261:6: ( ( ruleDmxOpAnd ) )
        // InternalPubProto.g:3262:7: ( ruleDmxOpAnd )
        {
        // InternalPubProto.g:3262:7: ( ruleDmxOpAnd )
        // InternalPubProto.g:3263:8: ruleDmxOpAnd
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
    // $ANTLR end synpred5_InternalPubProto

    // $ANTLR start synpred6_InternalPubProto
    public final void synpred6_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3346:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalPubProto.g:3346:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalPubProto.g:3346:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalPubProto.g:3347:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalPubProto.g:3347:6: ()
        // InternalPubProto.g:3348:6: 
        {
        }

        // InternalPubProto.g:3349:6: ( ( ruleDmxOpEquality ) )
        // InternalPubProto.g:3350:7: ( ruleDmxOpEquality )
        {
        // InternalPubProto.g:3350:7: ( ruleDmxOpEquality )
        // InternalPubProto.g:3351:8: ruleDmxOpEquality
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
    // $ANTLR end synpred6_InternalPubProto

    // $ANTLR start synpred7_InternalPubProto
    public final void synpred7_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3435:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalPubProto.g:3435:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalPubProto.g:3435:7: ( () ruleDmxOpInstanceOf )
        // InternalPubProto.g:3436:7: () ruleDmxOpInstanceOf
        {
        // InternalPubProto.g:3436:7: ()
        // InternalPubProto.g:3437:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalPubProto

    // $ANTLR start synpred8_InternalPubProto
    public final void synpred8_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3475:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalPubProto.g:3475:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalPubProto.g:3475:7: ( () ( ( ruleOpCompare ) ) )
        // InternalPubProto.g:3476:7: () ( ( ruleOpCompare ) )
        {
        // InternalPubProto.g:3476:7: ()
        // InternalPubProto.g:3477:7: 
        {
        }

        // InternalPubProto.g:3478:7: ( ( ruleOpCompare ) )
        // InternalPubProto.g:3479:8: ( ruleOpCompare )
        {
        // InternalPubProto.g:3479:8: ( ruleOpCompare )
        // InternalPubProto.g:3480:9: ruleOpCompare
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
    // $ANTLR end synpred8_InternalPubProto

    // $ANTLR start synpred9_InternalPubProto
    public final void synpred9_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3594:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalPubProto.g:3594:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalPubProto.g:3594:6: ( () ( ( ruleOpOther ) ) )
        // InternalPubProto.g:3595:6: () ( ( ruleOpOther ) )
        {
        // InternalPubProto.g:3595:6: ()
        // InternalPubProto.g:3596:6: 
        {
        }

        // InternalPubProto.g:3597:6: ( ( ruleOpOther ) )
        // InternalPubProto.g:3598:7: ( ruleOpOther )
        {
        // InternalPubProto.g:3598:7: ( ruleOpOther )
        // InternalPubProto.g:3599:8: ruleOpOther
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
    // $ANTLR end synpred9_InternalPubProto

    // $ANTLR start synpred10_InternalPubProto
    public final void synpred10_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3682:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalPubProto.g:3682:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalPubProto.g:3682:6: ( () ( ( ruleOpAdd ) ) )
        // InternalPubProto.g:3683:6: () ( ( ruleOpAdd ) )
        {
        // InternalPubProto.g:3683:6: ()
        // InternalPubProto.g:3684:6: 
        {
        }

        // InternalPubProto.g:3685:6: ( ( ruleOpAdd ) )
        // InternalPubProto.g:3686:7: ( ruleOpAdd )
        {
        // InternalPubProto.g:3686:7: ( ruleOpAdd )
        // InternalPubProto.g:3687:8: ruleOpAdd
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
    // $ANTLR end synpred10_InternalPubProto

    // $ANTLR start synpred11_InternalPubProto
    public final void synpred11_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3770:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalPubProto.g:3770:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalPubProto.g:3770:6: ( () ( ( ruleOpMulti ) ) )
        // InternalPubProto.g:3771:6: () ( ( ruleOpMulti ) )
        {
        // InternalPubProto.g:3771:6: ()
        // InternalPubProto.g:3772:6: 
        {
        }

        // InternalPubProto.g:3773:6: ( ( ruleOpMulti ) )
        // InternalPubProto.g:3774:7: ( ruleOpMulti )
        {
        // InternalPubProto.g:3774:7: ( ruleOpMulti )
        // InternalPubProto.g:3775:8: ruleOpMulti
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
    // $ANTLR end synpred11_InternalPubProto

    // $ANTLR start synpred12_InternalPubProto
    public final void synpred12_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3933:5: ( ( () ruleDmxOpCast ) )
        // InternalPubProto.g:3933:6: ( () ruleDmxOpCast )
        {
        // InternalPubProto.g:3933:6: ( () ruleDmxOpCast )
        // InternalPubProto.g:3934:6: () ruleDmxOpCast
        {
        // InternalPubProto.g:3934:6: ()
        // InternalPubProto.g:3935:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalPubProto

    // $ANTLR start synpred13_InternalPubProto
    public final void synpred13_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:4819:4: ( ']' )
        // InternalPubProto.g:4819:5: ']'
        {
        match(input,79,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalPubProto

    // $ANTLR start synpred14_InternalPubProto
    public final void synpred14_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:4975:5: ( 'else' )
        // InternalPubProto.g:4975:6: 'else'
        {
        match(input,83,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalPubProto

    // Delegated rules

    public final boolean synpred7_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalPubProto() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalPubProto_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA40 dfa40 = new DFA40(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\70\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\u008d\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\3\1\4\1\0\1\6\1\5\1\2\1\1\1\7\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\2\1\2\uffff\1\1\10\uffff\1\1\6\uffff\2\1\34\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3432:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_4 = input.LA(1);

                         
                        int index40_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_8 = input.LA(1);

                         
                        int index40_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_7 = input.LA(1);

                         
                        int index40_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPubProto()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_3 = input.LA(1);

                         
                        int index40_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPubProto()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_6 = input.LA(1);

                         
                        int index40_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA40_5 = input.LA(1);

                         
                        int index40_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA40_9 = input.LA(1);

                         
                        int index40_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\3\uffff\1\7\6\uffff";
    static final String dfa_10s = "\1\5\2\uffff\1\37\4\uffff\1\4\1\uffff";
    static final String dfa_11s = "\1\131\2\uffff\1\u008d\4\uffff\1\6\1\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\3\1\uffff\1\4";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\25\uffff\2\1\54\uffff\1\5\1\6\12\uffff\2\1\2\4",
            "",
            "",
            "\2\7\27\uffff\1\7\2\uffff\1\7\1\uffff\1\7\4\uffff\1\7\1\10\2\uffff\4\7\2\uffff\1\7\10\uffff\1\7\6\uffff\2\7\34\uffff\24\7",
            "",
            "",
            "",
            "",
            "\1\7\1\uffff\1\11",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4099:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00001FBE42000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000FC00000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000010C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000410C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000007E00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L,0x00007F8000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x4040000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1400000000000002L,0x0000000010000004L,0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000B0000060L,0x0000000003C00C00L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x03FF800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000010L,0x03FF800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x10000000B0000070L,0x0000000033C22C00L,0x000000000001C000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x30000000B0000070L,0x0000000033C22C00L,0x000000000001C000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x3C00000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000000000003L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L,0x00000000000000FCL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000002L,0x0000000000200000L,0x0000000000000700L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L,0x0000000000003800L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0100000100000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000130000060L,0x0000000003C00C00L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000030000060L,0x0000000003C00C00L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0010000000000182L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C020L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008020L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000040L,0x0000000030000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});

}