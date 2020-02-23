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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NATURAL", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'publication'", "'class'", "'nature:'", "'symbol:'", "'htmlPreamble:'", "'latexClass:'", "'latexPreamble:'", "'segments:'", "'divisions:'", "'title:'", "'optional:'", "'true'", "'false'", "'Abstract'", "'{'", "'}'", "'Preface'", "'Epilogue'", "'Body'", "'parts:'", "'appendix:'", "'ChangeHistory'", "'TableOfContents'", "'maxLevel:'", "'Abbreviations'", "'ListOfTables'", "'ListOfFigures'", "'Bibliography'", "'Glossary'", "'Index'", "'numbering:'", "'Part'", "'Appendix'", "'Chapter'", "'Section'", "'Sub'", "'Subsub'", "'import'", "'test'", "'context'", "','", "':'", "':='", "'in'", "'('", "')'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'as'", "'entity'", "'detail'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'FALSE'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'Print'", "'Web'", "'arabic'", "'capitalLetter'", "'smallLetter'", "'capitalRoman'", "'smallRoman'", "'none'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
    };
    public static final int T__50=50;
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

                if ( (LA5_0==30||(LA5_0>=33 && LA5_0<=35)||(LA5_0>=38 && LA5_0<=39)||(LA5_0>=41 && LA5_0<=46)) ) {
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

                if ( ((LA6_0>=48 && LA6_0<=53)) ) {
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
            case 38:
                {
                alt7=5;
                }
                break;
            case 39:
                {
                alt7=6;
                }
                break;
            case 41:
                {
                alt7=7;
                }
                break;
            case 42:
                {
                alt7=8;
                }
                break;
            case 43:
                {
                alt7=9;
                }
                break;
            case 44:
                {
                alt7=10;
                }
                break;
            case 45:
                {
                alt7=11;
                }
                break;
            case 46:
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
    // InternalPubProto.g:719:1: ruleProtoPublicationBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' ) ;
    public final EObject ruleProtoPublicationBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_allowParts_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_allowAppendix_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalPubProto.g:725:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' ) )
            // InternalPubProto.g:726:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' )
            {
            // InternalPubProto.g:726:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' )
            // InternalPubProto.g:727:3: () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}'
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
            otherlv_2=(Token)match(input,31,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoPublicationBodyAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalPubProto.g:742:3: (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPubProto.g:743:4: otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getProtoPublicationBodyAccess().getPartsKeyword_3_0());
                      			
                    }
                    // InternalPubProto.g:747:4: ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==28) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==29) ) {
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
                            // InternalPubProto.g:748:5: ( (lv_allowParts_4_0= 'true' ) )
                            {
                            // InternalPubProto.g:748:5: ( (lv_allowParts_4_0= 'true' ) )
                            // InternalPubProto.g:749:6: (lv_allowParts_4_0= 'true' )
                            {
                            // InternalPubProto.g:749:6: (lv_allowParts_4_0= 'true' )
                            // InternalPubProto.g:750:7: lv_allowParts_4_0= 'true'
                            {
                            lv_allowParts_4_0=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_allowParts_4_0, grammarAccess.getProtoPublicationBodyAccess().getAllowPartsTrueKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getProtoPublicationBodyRule());
                              							}
                              							setWithLastConsumed(current, "allowParts", true, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:763:5: otherlv_5= 'false'
                            {
                            otherlv_5=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_3_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPubProto.g:769:3: (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPubProto.g:770:4: otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getProtoPublicationBodyAccess().getAppendixKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:774:4: ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==28) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==29) ) {
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
                            // InternalPubProto.g:775:5: ( (lv_allowAppendix_7_0= 'true' ) )
                            {
                            // InternalPubProto.g:775:5: ( (lv_allowAppendix_7_0= 'true' ) )
                            // InternalPubProto.g:776:6: (lv_allowAppendix_7_0= 'true' )
                            {
                            // InternalPubProto.g:776:6: (lv_allowAppendix_7_0= 'true' )
                            // InternalPubProto.g:777:7: lv_allowAppendix_7_0= 'true'
                            {
                            lv_allowAppendix_7_0=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_allowAppendix_7_0, grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixTrueKeyword_4_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getProtoPublicationBodyRule());
                              							}
                              							setWithLastConsumed(current, "allowAppendix", true, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:790:5: otherlv_8= 'false'
                            {
                            otherlv_8=(Token)match(input,29,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_4_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getProtoPublicationBodyAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalPubProto.g:804:1: entryRuleProtoChangeHistory returns [EObject current=null] : iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF ;
    public final EObject entryRuleProtoChangeHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoChangeHistory = null;


        try {
            // InternalPubProto.g:804:59: (iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF )
            // InternalPubProto.g:805:2: iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF
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
    // InternalPubProto.g:811:1: ruleProtoChangeHistory returns [EObject current=null] : ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoChangeHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:817:2: ( ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:818:2: ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:818:2: ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:819:3: () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:819:3: ()
            // InternalPubProto.g:820:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoChangeHistoryAccess().getProtoChangeHistoryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_17); if (state.failed) return current;
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
    // InternalPubProto.g:853:1: entryRuleProtoTOC returns [EObject current=null] : iv_ruleProtoTOC= ruleProtoTOC EOF ;
    public final EObject entryRuleProtoTOC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoTOC = null;


        try {
            // InternalPubProto.g:853:49: (iv_ruleProtoTOC= ruleProtoTOC EOF )
            // InternalPubProto.g:854:2: iv_ruleProtoTOC= ruleProtoTOC EOF
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
    // InternalPubProto.g:860:1: ruleProtoTOC returns [EObject current=null] : ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' ) ;
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
            // InternalPubProto.g:866:2: ( ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' ) )
            // InternalPubProto.g:867:2: ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' )
            {
            // InternalPubProto.g:867:2: ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' )
            // InternalPubProto.g:868:3: () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}'
            {
            // InternalPubProto.g:868:3: ()
            // InternalPubProto.g:869:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoTOCAccess().getProtoTOCAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoTOCAccess().getTableOfContentsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoTOCAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoTOCRule());
              			}
              			newCompositeNode(grammarAccess.getProtoTOCAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_23);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:894:3: (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPubProto.g:895:4: otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProtoTOCAccess().getMaxLevelKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:899:4: ( (lv_maxLevel_5_0= RULE_NATURAL ) )
                    // InternalPubProto.g:900:5: (lv_maxLevel_5_0= RULE_NATURAL )
                    {
                    // InternalPubProto.g:900:5: (lv_maxLevel_5_0= RULE_NATURAL )
                    // InternalPubProto.g:901:6: lv_maxLevel_5_0= RULE_NATURAL
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
    // InternalPubProto.g:926:1: entryRuleProtoAbbreviations returns [EObject current=null] : iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF ;
    public final EObject entryRuleProtoAbbreviations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAbbreviations = null;


        try {
            // InternalPubProto.g:926:59: (iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF )
            // InternalPubProto.g:927:2: iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF
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
    // InternalPubProto.g:933:1: ruleProtoAbbreviations returns [EObject current=null] : ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAbbreviations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:939:2: ( ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:940:2: ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:940:2: ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:941:3: () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:941:3: ()
            // InternalPubProto.g:942:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoAbbreviationsAccess().getProtoAbbreviationsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_17); if (state.failed) return current;
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
    // InternalPubProto.g:975:1: entryRuleProtoListOfTables returns [EObject current=null] : iv_ruleProtoListOfTables= ruleProtoListOfTables EOF ;
    public final EObject entryRuleProtoListOfTables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoListOfTables = null;


        try {
            // InternalPubProto.g:975:58: (iv_ruleProtoListOfTables= ruleProtoListOfTables EOF )
            // InternalPubProto.g:976:2: iv_ruleProtoListOfTables= ruleProtoListOfTables EOF
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
    // InternalPubProto.g:982:1: ruleProtoListOfTables returns [EObject current=null] : ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoListOfTables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:988:2: ( ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:989:2: ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:989:2: ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:990:3: () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:990:3: ()
            // InternalPubProto.g:991:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoListOfTablesAccess().getProtoListOfTablesAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_17); if (state.failed) return current;
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
    // InternalPubProto.g:1024:1: entryRuleProtoListOfFigures returns [EObject current=null] : iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF ;
    public final EObject entryRuleProtoListOfFigures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoListOfFigures = null;


        try {
            // InternalPubProto.g:1024:59: (iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF )
            // InternalPubProto.g:1025:2: iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF
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
    // InternalPubProto.g:1031:1: ruleProtoListOfFigures returns [EObject current=null] : ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoListOfFigures() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1037:2: ( ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1038:2: ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1038:2: ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1039:3: () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1039:3: ()
            // InternalPubProto.g:1040:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoListOfFiguresAccess().getProtoListOfFiguresAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_17); if (state.failed) return current;
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
    // InternalPubProto.g:1073:1: entryRuleProtoBibliography returns [EObject current=null] : iv_ruleProtoBibliography= ruleProtoBibliography EOF ;
    public final EObject entryRuleProtoBibliography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoBibliography = null;


        try {
            // InternalPubProto.g:1073:58: (iv_ruleProtoBibliography= ruleProtoBibliography EOF )
            // InternalPubProto.g:1074:2: iv_ruleProtoBibliography= ruleProtoBibliography EOF
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
    // InternalPubProto.g:1080:1: ruleProtoBibliography returns [EObject current=null] : ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoBibliography() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1086:2: ( ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1087:2: ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1087:2: ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1088:3: () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1088:3: ()
            // InternalPubProto.g:1089:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoBibliographyAccess().getProtoBibliographyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_17); if (state.failed) return current;
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
    // InternalPubProto.g:1122:1: entryRuleProtoGlossary returns [EObject current=null] : iv_ruleProtoGlossary= ruleProtoGlossary EOF ;
    public final EObject entryRuleProtoGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoGlossary = null;


        try {
            // InternalPubProto.g:1122:54: (iv_ruleProtoGlossary= ruleProtoGlossary EOF )
            // InternalPubProto.g:1123:2: iv_ruleProtoGlossary= ruleProtoGlossary EOF
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
    // InternalPubProto.g:1129:1: ruleProtoGlossary returns [EObject current=null] : ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1135:2: ( ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1136:2: ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1136:2: ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1137:3: () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1137:3: ()
            // InternalPubProto.g:1138:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoGlossaryAccess().getProtoGlossaryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_17); if (state.failed) return current;
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
    // InternalPubProto.g:1171:1: entryRuleProtoIndex returns [EObject current=null] : iv_ruleProtoIndex= ruleProtoIndex EOF ;
    public final EObject entryRuleProtoIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoIndex = null;


        try {
            // InternalPubProto.g:1171:51: (iv_ruleProtoIndex= ruleProtoIndex EOF )
            // InternalPubProto.g:1172:2: iv_ruleProtoIndex= ruleProtoIndex EOF
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
    // InternalPubProto.g:1178:1: ruleProtoIndex returns [EObject current=null] : ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1184:2: ( ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1185:2: ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1185:2: ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1186:3: () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1186:3: ()
            // InternalPubProto.g:1187:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoIndexAccess().getProtoIndexAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
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
    // InternalPubProto.g:1220:1: entryRuleProtoDivision returns [EObject current=null] : iv_ruleProtoDivision= ruleProtoDivision EOF ;
    public final EObject entryRuleProtoDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoDivision = null;


        try {
            // InternalPubProto.g:1220:54: (iv_ruleProtoDivision= ruleProtoDivision EOF )
            // InternalPubProto.g:1221:2: iv_ruleProtoDivision= ruleProtoDivision EOF
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
    // InternalPubProto.g:1227:1: ruleProtoDivision returns [EObject current=null] : (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection ) ;
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
            // InternalPubProto.g:1233:2: ( (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection ) )
            // InternalPubProto.g:1234:2: (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection )
            {
            // InternalPubProto.g:1234:2: (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt16=1;
                }
                break;
            case 49:
                {
                alt16=2;
                }
                break;
            case 50:
                {
                alt16=3;
                }
                break;
            case 51:
                {
                alt16=4;
                }
                break;
            case 52:
                {
                alt16=5;
                }
                break;
            case 53:
                {
                alt16=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPubProto.g:1235:3: this_ProtoPart_0= ruleProtoPart
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
                    // InternalPubProto.g:1244:3: this_ProtoAppendix_1= ruleProtoAppendix
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
                    // InternalPubProto.g:1253:3: this_ProtoChapter_2= ruleProtoChapter
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
                    // InternalPubProto.g:1262:3: this_ProtoSection_3= ruleProtoSection
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
                    // InternalPubProto.g:1271:3: this_ProtoSubsection_4= ruleProtoSubsection
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
                    // InternalPubProto.g:1280:3: this_ProtoSubsubsection_5= ruleProtoSubsubsection
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
    // InternalPubProto.g:1293:1: ruleProtoDivisionBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )? ;
    public final EObject ruleProtoDivisionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Enumerator lv_numberingStyle_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1299:2: ( (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )? )
            // InternalPubProto.g:1300:2: (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )?
            {
            // InternalPubProto.g:1300:2: (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPubProto.g:1301:3: otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) )
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_0, grammarAccess.getProtoDivisionBodyAccess().getNumberingKeyword_0());
                      		
                    }
                    // InternalPubProto.g:1305:3: ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) )
                    // InternalPubProto.g:1306:4: (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle )
                    {
                    // InternalPubProto.g:1306:4: (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle )
                    // InternalPubProto.g:1307:5: lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle
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
    // InternalPubProto.g:1328:1: entryRuleProtoPart returns [EObject current=null] : iv_ruleProtoPart= ruleProtoPart EOF ;
    public final EObject entryRuleProtoPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPart = null;


        try {
            // InternalPubProto.g:1328:50: (iv_ruleProtoPart= ruleProtoPart EOF )
            // InternalPubProto.g:1329:2: iv_ruleProtoPart= ruleProtoPart EOF
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
    // InternalPubProto.g:1335:1: ruleProtoPart returns [EObject current=null] : ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1341:2: ( ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1342:2: ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1342:2: ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1343:3: () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1343:3: ()
            // InternalPubProto.g:1344:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoPartAccess().getProtoPartAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoPartAccess().getPartKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
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
    // InternalPubProto.g:1377:1: entryRuleProtoAppendix returns [EObject current=null] : iv_ruleProtoAppendix= ruleProtoAppendix EOF ;
    public final EObject entryRuleProtoAppendix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAppendix = null;


        try {
            // InternalPubProto.g:1377:54: (iv_ruleProtoAppendix= ruleProtoAppendix EOF )
            // InternalPubProto.g:1378:2: iv_ruleProtoAppendix= ruleProtoAppendix EOF
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
    // InternalPubProto.g:1384:1: ruleProtoAppendix returns [EObject current=null] : ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAppendix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1390:2: ( ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1391:2: ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1391:2: ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1392:3: () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1392:3: ()
            // InternalPubProto.g:1393:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoAppendixAccess().getProtoAppendixAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoAppendixAccess().getAppendixKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
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
    // InternalPubProto.g:1426:1: entryRuleProtoChapter returns [EObject current=null] : iv_ruleProtoChapter= ruleProtoChapter EOF ;
    public final EObject entryRuleProtoChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoChapter = null;


        try {
            // InternalPubProto.g:1426:53: (iv_ruleProtoChapter= ruleProtoChapter EOF )
            // InternalPubProto.g:1427:2: iv_ruleProtoChapter= ruleProtoChapter EOF
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
    // InternalPubProto.g:1433:1: ruleProtoChapter returns [EObject current=null] : ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1439:2: ( ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1440:2: ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1440:2: ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1441:3: () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1441:3: ()
            // InternalPubProto.g:1442:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoChapterAccess().getProtoChapterAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoChapterAccess().getChapterKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
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
    // InternalPubProto.g:1475:1: entryRuleProtoSection returns [EObject current=null] : iv_ruleProtoSection= ruleProtoSection EOF ;
    public final EObject entryRuleProtoSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSection = null;


        try {
            // InternalPubProto.g:1475:53: (iv_ruleProtoSection= ruleProtoSection EOF )
            // InternalPubProto.g:1476:2: iv_ruleProtoSection= ruleProtoSection EOF
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
    // InternalPubProto.g:1482:1: ruleProtoSection returns [EObject current=null] : ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1488:2: ( ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1489:2: ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1489:2: ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1490:3: () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1490:3: ()
            // InternalPubProto.g:1491:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSectionAccess().getProtoSectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSectionAccess().getSectionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
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
    // InternalPubProto.g:1524:1: entryRuleProtoSubsection returns [EObject current=null] : iv_ruleProtoSubsection= ruleProtoSubsection EOF ;
    public final EObject entryRuleProtoSubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSubsection = null;


        try {
            // InternalPubProto.g:1524:56: (iv_ruleProtoSubsection= ruleProtoSubsection EOF )
            // InternalPubProto.g:1525:2: iv_ruleProtoSubsection= ruleProtoSubsection EOF
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
    // InternalPubProto.g:1531:1: ruleProtoSubsection returns [EObject current=null] : ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1537:2: ( ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1538:2: ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1538:2: ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1539:3: () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1539:3: ()
            // InternalPubProto.g:1540:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSubsectionAccess().getProtoSubsectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSubsectionAccess().getSubKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
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
    // InternalPubProto.g:1573:1: entryRuleProtoSubsubsection returns [EObject current=null] : iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF ;
    public final EObject entryRuleProtoSubsubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSubsubsection = null;


        try {
            // InternalPubProto.g:1573:59: (iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF )
            // InternalPubProto.g:1574:2: iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF
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
    // InternalPubProto.g:1580:1: ruleProtoSubsubsection returns [EObject current=null] : ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSubsubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1586:2: ( ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1587:2: ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1587:2: ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1588:3: () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1588:3: ()
            // InternalPubProto.g:1589:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSubsubsectionAccess().getProtoSubsubsectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSubsubsectionAccess().getSubsubKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDmxModel"
    // InternalPubProto.g:1622:1: entryRuleDmxModel returns [EObject current=null] : iv_ruleDmxModel= ruleDmxModel EOF ;
    public final EObject entryRuleDmxModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxModel = null;


        try {
            // InternalPubProto.g:1622:49: (iv_ruleDmxModel= ruleDmxModel EOF )
            // InternalPubProto.g:1623:2: iv_ruleDmxModel= ruleDmxModel EOF
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
    // InternalPubProto.g:1629:1: ruleDmxModel returns [EObject current=null] : ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* ) ;
    public final EObject ruleDmxModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_1_0 = null;

        EObject lv_filters_2_0 = null;

        EObject lv_tests_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1635:2: ( ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* ) )
            // InternalPubProto.g:1636:2: ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* )
            {
            // InternalPubProto.g:1636:2: ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* )
            // InternalPubProto.g:1637:3: () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )*
            {
            // InternalPubProto.g:1637:3: ()
            // InternalPubProto.g:1638:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxModelAccess().getDmxModelAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:1644:3: ( (lv_types_1_0= ruleDmxArchetype ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==63) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPubProto.g:1645:4: (lv_types_1_0= ruleDmxArchetype )
            	    {
            	    // InternalPubProto.g:1645:4: (lv_types_1_0= ruleDmxArchetype )
            	    // InternalPubProto.g:1646:5: lv_types_1_0= ruleDmxArchetype
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getTypesDmxArchetypeParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop18;
                }
            } while (true);

            // InternalPubProto.g:1663:3: ( (lv_filters_2_0= ruleDmxFilter ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==65) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPubProto.g:1664:4: (lv_filters_2_0= ruleDmxFilter )
            	    {
            	    // InternalPubProto.g:1664:4: (lv_filters_2_0= ruleDmxFilter )
            	    // InternalPubProto.g:1665:5: lv_filters_2_0= ruleDmxFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getFiltersDmxFilterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    break loop19;
                }
            } while (true);

            // InternalPubProto.g:1682:3: ( (lv_tests_3_0= ruleDmxTest ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==55) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPubProto.g:1683:4: (lv_tests_3_0= ruleDmxTest )
            	    {
            	    // InternalPubProto.g:1683:4: (lv_tests_3_0= ruleDmxTest )
            	    // InternalPubProto.g:1684:5: lv_tests_3_0= ruleDmxTest
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getTestsDmxTestParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop20;
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
    // InternalPubProto.g:1705:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalPubProto.g:1705:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalPubProto.g:1706:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalPubProto.g:1712:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1718:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalPubProto.g:1719:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalPubProto.g:1719:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalPubProto.g:1720:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalPubProto.g:1724:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalPubProto.g:1725:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalPubProto.g:1725:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalPubProto.g:1726:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalPubProto.g:1747:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalPubProto.g:1747:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalPubProto.g:1748:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalPubProto.g:1754:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalPubProto.g:1760:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalPubProto.g:1761:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalPubProto.g:1761:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalPubProto.g:1762:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalPubProto.g:1766:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:1767:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:1767:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:1768:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            // InternalPubProto.g:1784:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==56) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPubProto.g:1785:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalPubProto.g:1789:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalPubProto.g:1790:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalPubProto.g:1790:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalPubProto.g:1791:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
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

                    // InternalPubProto.g:1808:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==57) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalPubProto.g:1809:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:1813:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalPubProto.g:1814:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalPubProto.g:1814:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalPubProto.g:1815:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalPubProto.g:1838:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalPubProto.g:1839:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalPubProto.g:1839:4: (lv_expr_7_0= ruleDExpression )
            // InternalPubProto.g:1840:5: lv_expr_7_0= ruleDExpression
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
    // InternalPubProto.g:1865:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalPubProto.g:1865:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalPubProto.g:1866:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalPubProto.g:1872:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalPubProto.g:1878:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalPubProto.g:1879:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalPubProto.g:1879:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalPubProto.g:1880:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalPubProto.g:1880:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:1881:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:1881:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:1882:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,58,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalPubProto.g:1902:3: ( (otherlv_2= RULE_ID ) )
            // InternalPubProto.g:1903:4: (otherlv_2= RULE_ID )
            {
            // InternalPubProto.g:1903:4: (otherlv_2= RULE_ID )
            // InternalPubProto.g:1904:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalPubProto.g:1915:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==61||LA23_0==67||LA23_0==93||LA23_0==138) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPubProto.g:1916:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalPubProto.g:1916:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalPubProto.g:1917:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_34);
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

            // InternalPubProto.g:1934:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPubProto.g:1935:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:1939:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_NATURAL)||(LA24_0>=28 && LA24_0<=29)||(LA24_0>=75 && LA24_0<=76)||(LA24_0>=87 && LA24_0<=90)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==31) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalPubProto.g:1940:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalPubProto.g:1940:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalPubProto.g:1941:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalPubProto.g:1941:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalPubProto.g:1942:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalPubProto.g:1960:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalPubProto.g:1960:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalPubProto.g:1961:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalPubProto.g:1961:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalPubProto.g:1962:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalPubProto.g:1985:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalPubProto.g:1985:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalPubProto.g:1986:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalPubProto.g:1992:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalPubProto.g:1998:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalPubProto.g:1999:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalPubProto.g:1999:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalPubProto.g:2000:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalPubProto.g:2000:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:2001:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:2001:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:2002:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,60,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,61,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:2026:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalPubProto.g:2027:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalPubProto.g:2027:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalPubProto.g:2028:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalPubProto.g:2045:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==57) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPubProto.g:2046:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalPubProto.g:2050:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalPubProto.g:2051:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalPubProto.g:2051:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalPubProto.g:2052:6: lv_members_5_0= ruleDmxBaseType
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
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_6=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:2078:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalPubProto.g:2078:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalPubProto.g:2079:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalPubProto.g:2085:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2091:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalPubProto.g:2092:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalPubProto.g:2092:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalPubProto.g:2093:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalPubProto.g:2097:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:2098:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:2098:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:2099:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,64,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalPubProto.g:2119:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalPubProto.g:2120:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalPubProto.g:2120:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalPubProto.g:2121:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            // InternalPubProto.g:2138:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_PLAIN_TEXT_ONLY && LA27_0<=RULE_RICH_TEXT_START)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPubProto.g:2139:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalPubProto.g:2139:4: (lv_description_4_0= ruleDRichText )
                    // InternalPubProto.g:2140:5: lv_description_4_0= ruleDRichText
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
    // InternalPubProto.g:2161:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalPubProto.g:2161:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalPubProto.g:2162:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalPubProto.g:2168:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalPubProto.g:2174:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalPubProto.g:2175:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalPubProto.g:2175:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalPubProto.g:2176:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalPubProto.g:2180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:2181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:2181:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:2182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,61,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:2202:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPubProto.g:2203:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalPubProto.g:2203:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalPubProto.g:2204:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalPubProto.g:2204:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalPubProto.g:2205:6: lv_parameters_3_0= ruleDmxFilterParameter
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

                    // InternalPubProto.g:2222:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==57) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPubProto.g:2223:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:2227:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalPubProto.g:2228:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalPubProto.g:2228:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalPubProto.g:2229:7: lv_parameters_5_0= ruleDmxFilterParameter
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,62,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,58,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalPubProto.g:2256:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalPubProto.g:2257:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalPubProto.g:2257:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalPubProto.g:2258:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_45);
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

            // InternalPubProto.g:2275:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==66) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPubProto.g:2276:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalPubProto.g:2280:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalPubProto.g:2281:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalPubProto.g:2281:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalPubProto.g:2282:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalPubProto.g:2304:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalPubProto.g:2304:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalPubProto.g:2305:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalPubProto.g:2311:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2317:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalPubProto.g:2318:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalPubProto.g:2318:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalPubProto.g:2319:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalPubProto.g:2319:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=104 && LA31_0<=114)) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
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
                    // InternalPubProto.g:2320:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalPubProto.g:2320:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalPubProto.g:2321:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalPubProto.g:2321:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalPubProto.g:2322:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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
                    // InternalPubProto.g:2340:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalPubProto.g:2340:4: ( (otherlv_1= RULE_ID ) )
                    // InternalPubProto.g:2341:5: (otherlv_1= RULE_ID )
                    {
                    // InternalPubProto.g:2341:5: (otherlv_1= RULE_ID )
                    // InternalPubProto.g:2342:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:2354:3: ( (lv_collection_2_0= '*' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==67) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPubProto.g:2355:4: (lv_collection_2_0= '*' )
                    {
                    // InternalPubProto.g:2355:4: (lv_collection_2_0= '*' )
                    // InternalPubProto.g:2356:5: lv_collection_2_0= '*'
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
    // InternalPubProto.g:2372:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalPubProto.g:2372:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalPubProto.g:2373:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalPubProto.g:2379:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2385:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalPubProto.g:2386:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalPubProto.g:2386:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalPubProto.g:2387:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalPubProto.g:2387:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:2388:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:2388:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:2389:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,58,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalPubProto.g:2409:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalPubProto.g:2410:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalPubProto.g:2410:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalPubProto.g:2411:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalPubProto.g:2432:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalPubProto.g:2432:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalPubProto.g:2433:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalPubProto.g:2439:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalPubProto.g:2445:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalPubProto.g:2446:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalPubProto.g:2446:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_RICH_TEXT_START) ) {
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
                    // InternalPubProto.g:2447:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalPubProto.g:2447:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalPubProto.g:2448:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalPubProto.g:2448:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalPubProto.g:2449:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalPubProto.g:2467:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalPubProto.g:2467:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalPubProto.g:2468:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalPubProto.g:2468:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalPubProto.g:2469:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalPubProto.g:2469:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalPubProto.g:2470:6: lv_segments_1_0= ruleDmxTextStart
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

                    // InternalPubProto.g:2487:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalPubProto.g:2488:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalPubProto.g:2488:5: (lv_segments_2_0= ruleDExpression )
                    // InternalPubProto.g:2489:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
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

                    // InternalPubProto.g:2506:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalPubProto.g:2507:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalPubProto.g:2507:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalPubProto.g:2508:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalPubProto.g:2508:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalPubProto.g:2509:7: lv_segments_3_0= ruleDmxTextMiddle
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

                    	    // InternalPubProto.g:2526:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalPubProto.g:2527:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:2527:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalPubProto.g:2528:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop33;
                        }
                    } while (true);

                    // InternalPubProto.g:2546:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalPubProto.g:2547:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalPubProto.g:2547:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalPubProto.g:2548:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalPubProto.g:2570:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalPubProto.g:2570:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalPubProto.g:2571:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalPubProto.g:2577:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2583:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalPubProto.g:2584:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalPubProto.g:2584:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalPubProto.g:2585:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalPubProto.g:2585:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalPubProto.g:2586:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalPubProto.g:2605:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalPubProto.g:2605:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalPubProto.g:2606:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalPubProto.g:2612:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2618:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalPubProto.g:2619:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalPubProto.g:2619:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalPubProto.g:2620:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalPubProto.g:2620:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalPubProto.g:2621:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalPubProto.g:2640:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalPubProto.g:2640:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalPubProto.g:2641:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalPubProto.g:2647:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2653:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalPubProto.g:2654:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalPubProto.g:2654:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalPubProto.g:2655:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalPubProto.g:2655:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalPubProto.g:2656:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalPubProto.g:2675:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalPubProto.g:2675:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalPubProto.g:2676:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalPubProto.g:2682:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2688:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalPubProto.g:2689:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalPubProto.g:2689:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalPubProto.g:2690:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalPubProto.g:2690:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalPubProto.g:2691:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalPubProto.g:2710:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalPubProto.g:2710:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalPubProto.g:2711:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalPubProto.g:2717:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalPubProto.g:2723:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalPubProto.g:2724:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalPubProto.g:2724:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalPubProto.g:2725:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:2733:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==68) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred1_InternalPubProto()) ) {
                        alt36=1;
                    }
                    else if ( (synpred2_InternalPubProto()) ) {
                        alt36=2;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalPubProto.g:2734:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalPubProto.g:2734:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalPubProto.g:2735:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalPubProto.g:2735:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalPubProto.g:2736:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalPubProto.g:2748:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalPubProto.g:2749:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalPubProto.g:2749:7: ()
            	    // InternalPubProto.g:2750:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalPubProto.g:2760:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalPubProto.g:2761:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPubProto.g:2761:8: (otherlv_3= RULE_ID )
            	    // InternalPubProto.g:2762:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_50);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalPubProto.g:2782:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalPubProto.g:2783:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalPubProto.g:2783:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalPubProto.g:2784:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_48);
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
            	    // InternalPubProto.g:2803:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalPubProto.g:2803:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalPubProto.g:2804:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalPubProto.g:2804:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalPubProto.g:2805:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalPubProto.g:2811:6: ( () otherlv_7= '.' )
            	    // InternalPubProto.g:2812:7: () otherlv_7= '.'
            	    {
            	    // InternalPubProto.g:2812:7: ()
            	    // InternalPubProto.g:2813:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalPubProto.g:2825:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalPubProto.g:2826:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalPubProto.g:2826:6: (otherlv_8= RULE_ID )
            	    // InternalPubProto.g:2827:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalPubProto.g:2838:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt35=3;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==61) && (synpred3_InternalPubProto())) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==69) ) {
            	        alt35=2;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalPubProto.g:2839:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalPubProto.g:2839:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalPubProto.g:2840:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalPubProto.g:2840:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalPubProto.g:2841:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalPubProto.g:2845:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalPubProto.g:2846:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,61,FOLLOW_52); if (state.failed) return current;
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

            	            // InternalPubProto.g:2858:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalPubProto.g:2859:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalPubProto.g:2859:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalPubProto.g:2860:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_53);
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

            	            otherlv_11=(Token)match(input,62,FOLLOW_48); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPubProto.g:2883:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalPubProto.g:2883:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalPubProto.g:2884:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalPubProto.g:2884:7: (lv_before_12_0= '@before' )
            	            // InternalPubProto.g:2885:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,69,FOLLOW_48); if (state.failed) return current;
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
            	    break loop36;
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
    // InternalPubProto.g:2904:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalPubProto.g:2904:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalPubProto.g:2905:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalPubProto.g:2911:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2917:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalPubProto.g:2918:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalPubProto.g:2918:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalPubProto.g:2919:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalPubProto.g:2919:3: ()
            // InternalPubProto.g:2920:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:2926:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_NATURAL)||(LA38_0>=28 && LA38_0<=29)||LA38_0==31||LA38_0==61||(LA38_0>=75 && LA38_0<=76)||LA38_0==78||LA38_0==82||(LA38_0>=87 && LA38_0<=90)||(LA38_0>=93 && LA38_0<=94)||(LA38_0>=135 && LA38_0<=137)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPubProto.g:2927:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalPubProto.g:2927:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalPubProto.g:2928:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalPubProto.g:2928:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalPubProto.g:2929:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
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

                    // InternalPubProto.g:2946:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==57) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalPubProto.g:2947:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,57,FOLLOW_50); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:2951:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalPubProto.g:2952:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalPubProto.g:2952:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalPubProto.g:2953:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_54);
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
                    	    break loop37;
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
    // InternalPubProto.g:2976:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalPubProto.g:2976:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalPubProto.g:2977:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalPubProto.g:2983:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:2989:2: (kw= ':=' )
            // InternalPubProto.g:2990:2: kw= ':='
            {
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:2998:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalPubProto.g:2998:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalPubProto.g:2999:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalPubProto.g:3005:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3011:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalPubProto.g:3012:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalPubProto.g:3012:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==EOF||LA39_1==57||(LA39_1>=60 && LA39_1<=62)||(LA39_1>=67 && LA39_1<=69)||(LA39_1>=71 && LA39_1<=74)||LA39_1==77||LA39_1==86||(LA39_1>=93 && LA39_1<=94)||(LA39_1>=115 && LA39_1<=134)) ) {
                    alt39=2;
                }
                else if ( (LA39_1==70) ) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_NATURAL)||(LA39_0>=28 && LA39_0<=29)||LA39_0==31||LA39_0==61||(LA39_0>=75 && LA39_0<=76)||LA39_0==78||LA39_0==82||(LA39_0>=87 && LA39_0<=90)||(LA39_0>=93 && LA39_0<=94)||(LA39_0>=135 && LA39_0<=137)) ) {
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
                    // InternalPubProto.g:3013:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalPubProto.g:3013:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalPubProto.g:3014:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalPubProto.g:3014:4: ()
                    // InternalPubProto.g:3015:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPubProto.g:3021:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalPubProto.g:3022:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalPubProto.g:3022:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalPubProto.g:3023:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
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

                    otherlv_2=(Token)match(input,70,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalPubProto.g:3044:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalPubProto.g:3045:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalPubProto.g:3045:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalPubProto.g:3046:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalPubProto.g:3065:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalPubProto.g:3077:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalPubProto.g:3077:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalPubProto.g:3078:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalPubProto.g:3084:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:3090:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPubProto.g:3091:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPubProto.g:3091:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:3092:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:3092:3: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:3093:4: lv_name_0_0= RULE_ID
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
    // InternalPubProto.g:3112:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalPubProto.g:3112:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalPubProto.g:3113:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalPubProto.g:3119:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3125:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalPubProto.g:3126:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalPubProto.g:3126:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalPubProto.g:3127:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3135:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                switch ( input.LA(1) ) {
                case 115:
                    {
                    int LA40_2 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt40=1;
                    }


                    }
                    break;
                case 116:
                    {
                    int LA40_3 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt40=1;
                    }


                    }
                    break;
                case 117:
                    {
                    int LA40_4 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt40=1;
                    }


                    }
                    break;
                case 118:
                    {
                    int LA40_5 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt40=1;
                    }


                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // InternalPubProto.g:3136:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalPubProto.g:3136:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalPubProto.g:3137:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalPubProto.g:3147:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalPubProto.g:3148:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalPubProto.g:3148:6: ()
            	    // InternalPubProto.g:3149:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3155:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalPubProto.g:3156:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalPubProto.g:3156:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalPubProto.g:3157:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_50);
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

            	    // InternalPubProto.g:3176:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalPubProto.g:3177:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalPubProto.g:3177:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalPubProto.g:3178:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
    // $ANTLR end "ruleDmxOrExpression"


    // $ANTLR start "entryRuleDmxAndExpression"
    // InternalPubProto.g:3200:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalPubProto.g:3200:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalPubProto.g:3201:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalPubProto.g:3207:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3213:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalPubProto.g:3214:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalPubProto.g:3214:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalPubProto.g:3215:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3223:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==119) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred5_InternalPubProto()) ) {
                        alt41=1;
                    }


                }
                else if ( (LA41_0==120) ) {
                    int LA41_3 = input.LA(2);

                    if ( (synpred5_InternalPubProto()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalPubProto.g:3224:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalPubProto.g:3224:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalPubProto.g:3225:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalPubProto.g:3235:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalPubProto.g:3236:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalPubProto.g:3236:6: ()
            	    // InternalPubProto.g:3237:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3243:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalPubProto.g:3244:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalPubProto.g:3244:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalPubProto.g:3245:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_50);
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

            	    // InternalPubProto.g:3264:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalPubProto.g:3265:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalPubProto.g:3265:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalPubProto.g:3266:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
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
            	    break loop41;
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
    // InternalPubProto.g:3288:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalPubProto.g:3288:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalPubProto.g:3289:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalPubProto.g:3295:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3301:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalPubProto.g:3302:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalPubProto.g:3302:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalPubProto.g:3303:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3311:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case 77:
                    {
                    int LA42_2 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 121:
                    {
                    int LA42_3 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 122:
                    {
                    int LA42_4 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt42=1;
                    }


                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalPubProto.g:3312:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalPubProto.g:3312:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalPubProto.g:3313:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalPubProto.g:3323:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalPubProto.g:3324:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalPubProto.g:3324:6: ()
            	    // InternalPubProto.g:3325:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3331:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalPubProto.g:3332:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalPubProto.g:3332:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalPubProto.g:3333:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_50);
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

            	    // InternalPubProto.g:3352:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalPubProto.g:3353:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalPubProto.g:3353:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalPubProto.g:3354:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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
    // $ANTLR end "ruleDmxEqualityExpression"


    // $ANTLR start "entryRuleDmxRelationalExpression"
    // InternalPubProto.g:3376:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalPubProto.g:3376:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalPubProto.g:3377:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalPubProto.g:3383:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3389:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalPubProto.g:3390:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalPubProto.g:3390:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalPubProto.g:3391:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3399:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop43:
            do {
                int alt43=3;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // InternalPubProto.g:3400:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalPubProto.g:3400:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalPubProto.g:3401:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalPubProto.g:3401:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalPubProto.g:3402:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalPubProto.g:3408:6: ( () ruleDmxOpInstanceOf )
            	    // InternalPubProto.g:3409:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalPubProto.g:3409:7: ()
            	    // InternalPubProto.g:3410:8: 
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

            	    // InternalPubProto.g:3425:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalPubProto.g:3426:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPubProto.g:3426:6: (otherlv_3= RULE_ID )
            	    // InternalPubProto.g:3427:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPubProto.g:3440:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalPubProto.g:3440:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalPubProto.g:3441:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalPubProto.g:3441:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalPubProto.g:3442:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalPubProto.g:3452:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalPubProto.g:3453:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalPubProto.g:3453:7: ()
            	    // InternalPubProto.g:3454:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalPubProto.g:3460:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalPubProto.g:3461:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalPubProto.g:3461:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalPubProto.g:3462:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_50);
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

            	    // InternalPubProto.g:3481:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalPubProto.g:3482:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalPubProto.g:3482:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalPubProto.g:3483:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_59);
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalPubProto.g:3506:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalPubProto.g:3506:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalPubProto.g:3507:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalPubProto.g:3513:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:3519:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalPubProto.g:3520:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalPubProto.g:3520:2: (kw= 'ISA' | kw= 'isa' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==71) ) {
                alt44=1;
            }
            else if ( (LA44_0==72) ) {
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
                    // InternalPubProto.g:3521:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:3527:3: kw= 'isa'
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
    // InternalPubProto.g:3536:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalPubProto.g:3536:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalPubProto.g:3537:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalPubProto.g:3543:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3549:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalPubProto.g:3550:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalPubProto.g:3550:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalPubProto.g:3551:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3559:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                switch ( input.LA(1) ) {
                case 129:
                    {
                    int LA45_2 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA45_3 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 86:
                    {
                    int LA45_4 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 130:
                    {
                    int LA45_5 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 131:
                    {
                    int LA45_6 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // InternalPubProto.g:3560:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalPubProto.g:3560:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalPubProto.g:3561:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalPubProto.g:3571:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalPubProto.g:3572:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalPubProto.g:3572:6: ()
            	    // InternalPubProto.g:3573:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3579:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalPubProto.g:3580:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalPubProto.g:3580:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalPubProto.g:3581:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_50);
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

            	    // InternalPubProto.g:3600:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalPubProto.g:3601:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalPubProto.g:3601:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalPubProto.g:3602:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	    break loop45;
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
    // InternalPubProto.g:3624:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalPubProto.g:3624:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalPubProto.g:3625:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalPubProto.g:3631:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3637:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalPubProto.g:3638:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalPubProto.g:3638:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalPubProto.g:3639:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3647:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==93) ) {
                    int LA46_2 = input.LA(2);

                    if ( (synpred10_InternalPubProto()) ) {
                        alt46=1;
                    }


                }
                else if ( (LA46_0==94) ) {
                    int LA46_3 = input.LA(2);

                    if ( (synpred10_InternalPubProto()) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalPubProto.g:3648:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalPubProto.g:3648:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalPubProto.g:3649:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalPubProto.g:3659:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalPubProto.g:3660:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalPubProto.g:3660:6: ()
            	    // InternalPubProto.g:3661:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3667:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalPubProto.g:3668:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalPubProto.g:3668:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalPubProto.g:3669:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_50);
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

            	    // InternalPubProto.g:3688:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalPubProto.g:3689:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalPubProto.g:3689:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalPubProto.g:3690:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalPubProto.g:3712:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalPubProto.g:3712:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalPubProto.g:3713:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalPubProto.g:3719:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3725:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalPubProto.g:3726:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalPubProto.g:3726:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalPubProto.g:3727:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3735:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case 67:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 132:
                    {
                    int LA47_3 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 133:
                    {
                    int LA47_4 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 134:
                    {
                    int LA47_5 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt47=1;
                    }


                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // InternalPubProto.g:3736:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalPubProto.g:3736:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalPubProto.g:3737:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalPubProto.g:3747:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalPubProto.g:3748:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalPubProto.g:3748:6: ()
            	    // InternalPubProto.g:3749:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3755:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalPubProto.g:3756:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalPubProto.g:3756:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalPubProto.g:3757:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_50);
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

            	    // InternalPubProto.g:3776:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalPubProto.g:3777:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalPubProto.g:3777:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalPubProto.g:3778:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
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
            	    break loop47;
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
    // InternalPubProto.g:3800:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalPubProto.g:3800:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalPubProto.g:3801:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalPubProto.g:3807:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3813:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalPubProto.g:3814:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalPubProto.g:3814:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=93 && LA48_0<=94)||(LA48_0>=135 && LA48_0<=137)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_NATURAL)||(LA48_0>=28 && LA48_0<=29)||LA48_0==31||LA48_0==61||(LA48_0>=75 && LA48_0<=76)||LA48_0==78||LA48_0==82||(LA48_0>=87 && LA48_0<=90)) ) {
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
                    // InternalPubProto.g:3815:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalPubProto.g:3815:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalPubProto.g:3816:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalPubProto.g:3816:4: ()
                    // InternalPubProto.g:3817:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPubProto.g:3823:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalPubProto.g:3824:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalPubProto.g:3824:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalPubProto.g:3825:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
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

                    // InternalPubProto.g:3842:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalPubProto.g:3843:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalPubProto.g:3843:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalPubProto.g:3844:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalPubProto.g:3863:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalPubProto.g:3875:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalPubProto.g:3875:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalPubProto.g:3876:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalPubProto.g:3882:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3888:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalPubProto.g:3889:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalPubProto.g:3889:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalPubProto.g:3890:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3898:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==73) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred12_InternalPubProto()) ) {
                    alt49=1;
                }
            }
            else if ( (LA49_0==74) ) {
                int LA49_2 = input.LA(2);

                if ( (synpred12_InternalPubProto()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalPubProto.g:3899:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalPubProto.g:3899:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalPubProto.g:3900:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalPubProto.g:3906:5: ( () ruleDmxOpCast )
                    // InternalPubProto.g:3907:6: () ruleDmxOpCast
                    {
                    // InternalPubProto.g:3907:6: ()
                    // InternalPubProto.g:3908:7: 
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

                    // InternalPubProto.g:3923:4: ( (otherlv_3= RULE_ID ) )
                    // InternalPubProto.g:3924:5: (otherlv_3= RULE_ID )
                    {
                    // InternalPubProto.g:3924:5: (otherlv_3= RULE_ID )
                    // InternalPubProto.g:3925:6: otherlv_3= RULE_ID
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
    // InternalPubProto.g:3941:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalPubProto.g:3941:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalPubProto.g:3942:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalPubProto.g:3948:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:3954:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalPubProto.g:3955:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalPubProto.g:3955:2: (kw= 'AS' | kw= 'as' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==73) ) {
                alt50=1;
            }
            else if ( (LA50_0==74) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalPubProto.g:3956:3: kw= 'AS'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:3962:3: kw= 'as'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:3971:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalPubProto.g:3971:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalPubProto.g:3972:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalPubProto.g:3978:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalPubProto.g:3984:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalPubProto.g:3985:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalPubProto.g:3985:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt51=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_NATURAL:
            case 28:
            case 29:
            case 75:
            case 76:
            case 87:
            case 88:
            case 89:
            case 90:
                {
                alt51=1;
                }
                break;
            case 61:
                {
                alt51=2;
                }
                break;
            case 31:
                {
                alt51=3;
                }
                break;
            case RULE_ID:
                {
                int LA51_4 = input.LA(2);

                if ( (LA51_4==EOF||LA51_4==57||LA51_4==60||LA51_4==62||(LA51_4>=67 && LA51_4<=69)||(LA51_4>=71 && LA51_4<=74)||LA51_4==77||LA51_4==86||(LA51_4>=93 && LA51_4<=94)||(LA51_4>=115 && LA51_4<=134)) ) {
                    alt51=6;
                }
                else if ( (LA51_4==61) ) {
                    alt51=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 4, input);

                    throw nvae;
                }
                }
                break;
            case 78:
                {
                alt51=5;
                }
                break;
            case 82:
                {
                alt51=7;
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
                    // InternalPubProto.g:3986:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalPubProto.g:3995:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalPubProto.g:4004:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalPubProto.g:4013:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalPubProto.g:4022:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalPubProto.g:4031:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalPubProto.g:4040:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalPubProto.g:4052:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalPubProto.g:4052:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalPubProto.g:4053:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalPubProto.g:4059:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalPubProto.g:4065:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalPubProto.g:4066:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalPubProto.g:4066:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt52=7;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalPubProto.g:4067:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalPubProto.g:4076:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalPubProto.g:4085:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalPubProto.g:4094:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalPubProto.g:4103:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalPubProto.g:4112:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalPubProto.g:4121:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalPubProto.g:4133:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalPubProto.g:4133:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalPubProto.g:4134:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalPubProto.g:4140:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4146:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalPubProto.g:4147:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalPubProto.g:4147:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalPubProto.g:4148:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_53);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4168:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalPubProto.g:4168:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalPubProto.g:4169:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalPubProto.g:4175:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4181:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalPubProto.g:4182:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalPubProto.g:4182:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalPubProto.g:4183:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalPubProto.g:4183:3: ()
            // InternalPubProto.g:4184:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4194:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPubProto.g:4195:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalPubProto.g:4195:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalPubProto.g:4196:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4196:5: (lv_elements_2_0= ruleDExpression )
                    // InternalPubProto.g:4197:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_65);
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

                    // InternalPubProto.g:4214:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==57) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalPubProto.g:4215:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4219:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalPubProto.g:4220:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:4220:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalPubProto.g:4221:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_65);
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
                    	    break loop53;
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
    // InternalPubProto.g:4248:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalPubProto.g:4248:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalPubProto.g:4249:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalPubProto.g:4255:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4261:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalPubProto.g:4262:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalPubProto.g:4262:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalPubProto.g:4263:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalPubProto.g:4263:3: ()
            // InternalPubProto.g:4264:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4274:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_NATURAL)||(LA56_0>=28 && LA56_0<=29)||(LA56_0>=75 && LA56_0<=76)||(LA56_0>=87 && LA56_0<=90)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPubProto.g:4275:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalPubProto.g:4275:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalPubProto.g:4276:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalPubProto.g:4276:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalPubProto.g:4277:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_65);
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

                    // InternalPubProto.g:4294:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==57) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalPubProto.g:4295:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,57,FOLLOW_67); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4299:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalPubProto.g:4300:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalPubProto.g:4300:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalPubProto.g:4301:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_65);
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
                    	    break loop55;
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
    // InternalPubProto.g:4328:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalPubProto.g:4328:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalPubProto.g:4329:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalPubProto.g:4335:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4341:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalPubProto.g:4342:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalPubProto.g:4342:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalPubProto.g:4343:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalPubProto.g:4343:3: ()
            // InternalPubProto.g:4344:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4350:3: ( (otherlv_1= RULE_ID ) )
            // InternalPubProto.g:4351:4: (otherlv_1= RULE_ID )
            {
            // InternalPubProto.g:4351:4: (otherlv_1= RULE_ID )
            // InternalPubProto.g:4352:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:4367:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalPubProto.g:4368:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalPubProto.g:4368:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalPubProto.g:4369:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_53);
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

            otherlv_4=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4394:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalPubProto.g:4394:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalPubProto.g:4395:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalPubProto.g:4401:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4407:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalPubProto.g:4408:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalPubProto.g:4408:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalPubProto.g:4409:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalPubProto.g:4409:3: ()
            // InternalPubProto.g:4410:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4416:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPubProto.g:4417:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalPubProto.g:4417:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalPubProto.g:4418:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4418:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalPubProto.g:4419:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
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

                    // InternalPubProto.g:4436:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==57) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalPubProto.g:4437:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4441:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalPubProto.g:4442:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:4442:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalPubProto.g:4443:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_54);
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
                    	    break loop57;
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
    // InternalPubProto.g:4466:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalPubProto.g:4466:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalPubProto.g:4467:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalPubProto.g:4473:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4479:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalPubProto.g:4480:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalPubProto.g:4480:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalPubProto.g:4481:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,75,FOLLOW_4); if (state.failed) return current;
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
    // InternalPubProto.g:4500:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalPubProto.g:4500:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalPubProto.g:4501:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalPubProto.g:4507:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4513:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalPubProto.g:4514:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalPubProto.g:4514:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalPubProto.g:4515:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,76,FOLLOW_4); if (state.failed) return current;
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
    // InternalPubProto.g:4535:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4541:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalPubProto.g:4542:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalPubProto.g:4542:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalPubProto.g:4543:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalPubProto.g:4543:3: ( (otherlv_0= RULE_ID ) )
            // InternalPubProto.g:4544:4: (otherlv_0= RULE_ID )
            {
            // InternalPubProto.g:4544:4: (otherlv_0= RULE_ID )
            // InternalPubProto.g:4545:5: otherlv_0= RULE_ID
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

              			newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getDomFieldListStartSymbolParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_64);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:4563:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalPubProto.g:4564:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalPubProto.g:4564:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalPubProto.g:4565:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_64);
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
            	    break loop59;
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
    // InternalPubProto.g:4590:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalPubProto.g:4590:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalPubProto.g:4591:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalPubProto.g:4597:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4603:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalPubProto.g:4604:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalPubProto.g:4604:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalPubProto.g:4605:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalPubProto.g:4605:3: ( (otherlv_0= RULE_ID ) )
            // InternalPubProto.g:4606:4: (otherlv_0= RULE_ID )
            {
            // InternalPubProto.g:4606:4: (otherlv_0= RULE_ID )
            // InternalPubProto.g:4607:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPubProto.g:4622:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalPubProto.g:4623:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalPubProto.g:4623:4: (lv_value_2_0= ruleDExpression )
            // InternalPubProto.g:4624:5: lv_value_2_0= ruleDExpression
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
              						"com.mimacom.ddd.pub.proto.PubProto.DExpression");
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
    // InternalPubProto.g:4645:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalPubProto.g:4645:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalPubProto.g:4646:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalPubProto.g:4652:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalPubProto.g:4658:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalPubProto.g:4659:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalPubProto.g:4659:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalPubProto.g:4660:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalPubProto.g:4660:3: ()
            // InternalPubProto.g:4661:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4671:3: ( ( ruleDQualifiedName ) )
            // InternalPubProto.g:4672:4: ( ruleDQualifiedName )
            {
            // InternalPubProto.g:4672:4: ( ruleDQualifiedName )
            // InternalPubProto.g:4673:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_69);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPubProto.g:4687:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==79) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalPubProto.g:4688:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalPubProto.g:4692:4: ( (otherlv_4= RULE_ID ) )
                    // InternalPubProto.g:4693:5: (otherlv_4= RULE_ID )
                    {
                    // InternalPubProto.g:4693:5: (otherlv_4= RULE_ID )
                    // InternalPubProto.g:4694:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:4706:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==70) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPubProto.g:4707:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:4711:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_ID) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==67) ) {
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
                            // InternalPubProto.g:4712:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalPubProto.g:4712:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalPubProto.g:4713:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalPubProto.g:4713:6: (lv_displayName_6_0= RULE_ID )
                            // InternalPubProto.g:4714:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
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
                            // InternalPubProto.g:4731:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalPubProto.g:4731:5: ( (lv_plural_7_0= '*' ) )
                            // InternalPubProto.g:4732:6: (lv_plural_7_0= '*' )
                            {
                            // InternalPubProto.g:4732:6: (lv_plural_7_0= '*' )
                            // InternalPubProto.g:4733:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,67,FOLLOW_72); if (state.failed) return current;
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

            // InternalPubProto.g:4747:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalPubProto.g:4748:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4758:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalPubProto.g:4758:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalPubProto.g:4759:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalPubProto.g:4765:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:4771:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalPubProto.g:4772:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalPubProto.g:4772:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalPubProto.g:4773:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalPubProto.g:4773:3: ()
            // InternalPubProto.g:4774:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4780:3: ( (otherlv_1= RULE_ID ) )
            // InternalPubProto.g:4781:4: (otherlv_1= RULE_ID )
            {
            // InternalPubProto.g:4781:4: (otherlv_1= RULE_ID )
            // InternalPubProto.g:4782:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalPubProto.g:4793:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==69) ) {
                alt63=1;
            }
            else if ( (LA63_0==68) ) {
                int LA63_2 = input.LA(2);

                if ( (LA63_2==81) ) {
                    alt63=2;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalPubProto.g:4794:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalPubProto.g:4794:4: ( (lv_before_2_0= '@before' ) )
                    // InternalPubProto.g:4795:5: (lv_before_2_0= '@before' )
                    {
                    // InternalPubProto.g:4795:5: (lv_before_2_0= '@before' )
                    // InternalPubProto.g:4796:6: lv_before_2_0= '@before'
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
                    // InternalPubProto.g:4809:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalPubProto.g:4809:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalPubProto.g:4810:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalPubProto.g:4814:5: ( (lv_all_4_0= 'all' ) )
                    // InternalPubProto.g:4815:6: (lv_all_4_0= 'all' )
                    {
                    // InternalPubProto.g:4815:6: (lv_all_4_0= 'all' )
                    // InternalPubProto.g:4816:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4834:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalPubProto.g:4834:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalPubProto.g:4835:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalPubProto.g:4841:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalPubProto.g:4847:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalPubProto.g:4848:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalPubProto.g:4848:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalPubProto.g:4849:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalPubProto.g:4849:3: ()
            // InternalPubProto.g:4850:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalPubProto.g:4860:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalPubProto.g:4861:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalPubProto.g:4861:4: (lv_if_2_0= ruleDExpression )
            // InternalPubProto.g:4862:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_75);
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

            otherlv_3=(Token)match(input,83,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalPubProto.g:4883:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalPubProto.g:4884:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalPubProto.g:4884:4: (lv_then_4_0= ruleDExpression )
            // InternalPubProto.g:4885:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_76);
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

            // InternalPubProto.g:4902:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==84) && (synpred14_InternalPubProto())) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalPubProto.g:4903:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalPubProto.g:4903:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalPubProto.g:4904:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,84,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalPubProto.g:4910:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalPubProto.g:4911:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4911:5: (lv_else_6_0= ruleDExpression )
                    // InternalPubProto.g:4912:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_77);
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

            otherlv_7=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4938:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalPubProto.g:4938:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalPubProto.g:4939:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalPubProto.g:4945:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalPubProto.g:4951:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalPubProto.g:4952:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalPubProto.g:4952:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==67||LA65_0==93||LA65_0==138) ) {
                alt65=1;
            }
            else if ( (LA65_0==61) ) {
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
                    // InternalPubProto.g:4953:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalPubProto.g:4953:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalPubProto.g:4954:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalPubProto.g:4954:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalPubProto.g:4955:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalPubProto.g:4973:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalPubProto.g:4973:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalPubProto.g:4974:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalPubProto.g:4978:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalPubProto.g:4979:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalPubProto.g:4979:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalPubProto.g:4980:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_78); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,86,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalPubProto.g:5000:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalPubProto.g:5001:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalPubProto.g:5001:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalPubProto.g:5002:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
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

                    otherlv_5=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5028:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalPubProto.g:5028:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalPubProto.g:5029:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalPubProto.g:5035:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:5041:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalPubProto.g:5042:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalPubProto.g:5042:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_NATURAL) ) {
                alt66=1;
            }
            else if ( (LA66_0==67) ) {
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
                    // InternalPubProto.g:5043:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalPubProto.g:5051:3: kw= '*'
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
    // InternalPubProto.g:5060:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalPubProto.g:5060:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalPubProto.g:5061:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalPubProto.g:5067:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:5073:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalPubProto.g:5074:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalPubProto.g:5074:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalPubProto.g:5075:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalPubProto.g:5075:3: ()
            // InternalPubProto.g:5076:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5082:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt67=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt67=1;
                }
                break;
            case 28:
                {
                alt67=2;
                }
                break;
            case 88:
                {
                alt67=3;
                }
                break;
            case 29:
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
                    // InternalPubProto.g:5083:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalPubProto.g:5083:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalPubProto.g:5084:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalPubProto.g:5084:5: (lv_value_1_0= 'TRUE' )
                    // InternalPubProto.g:5085:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPubProto.g:5098:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalPubProto.g:5098:4: ( (lv_value_2_0= 'true' ) )
                    // InternalPubProto.g:5099:5: (lv_value_2_0= 'true' )
                    {
                    // InternalPubProto.g:5099:5: (lv_value_2_0= 'true' )
                    // InternalPubProto.g:5100:6: lv_value_2_0= 'true'
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
                    // InternalPubProto.g:5113:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5118:4: otherlv_4= 'false'
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
    // InternalPubProto.g:5127:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalPubProto.g:5127:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalPubProto.g:5128:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalPubProto.g:5134:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:5140:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalPubProto.g:5141:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalPubProto.g:5141:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalPubProto.g:5142:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalPubProto.g:5142:3: ()
            // InternalPubProto.g:5143:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5149:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalPubProto.g:5150:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalPubProto.g:5150:4: (lv_value_1_0= RULE_NATURAL )
            // InternalPubProto.g:5151:5: lv_value_1_0= RULE_NATURAL
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
    // InternalPubProto.g:5171:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalPubProto.g:5171:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalPubProto.g:5172:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalPubProto.g:5178:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:5184:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalPubProto.g:5185:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalPubProto.g:5185:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalPubProto.g:5186:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalPubProto.g:5186:3: ()
            // InternalPubProto.g:5187:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5193:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalPubProto.g:5194:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalPubProto.g:5194:4: (lv_value_1_0= ruleDECIMAL )
            // InternalPubProto.g:5195:5: lv_value_1_0= ruleDECIMAL
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
    // InternalPubProto.g:5216:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalPubProto.g:5216:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalPubProto.g:5217:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalPubProto.g:5223:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:5229:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalPubProto.g:5230:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalPubProto.g:5230:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalPubProto.g:5231:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalPubProto.g:5231:3: ()
            // InternalPubProto.g:5232:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5238:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalPubProto.g:5239:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalPubProto.g:5239:4: (lv_value_1_0= RULE_STRING )
            // InternalPubProto.g:5240:5: lv_value_1_0= RULE_STRING
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
    // InternalPubProto.g:5260:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalPubProto.g:5260:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalPubProto.g:5261:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalPubProto.g:5267:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5273:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalPubProto.g:5274:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalPubProto.g:5274:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalPubProto.g:5275:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalPubProto.g:5275:3: ()
            // InternalPubProto.g:5276:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5282:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==89) ) {
                alt68=1;
            }
            else if ( (LA68_0==90) ) {
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
                    // InternalPubProto.g:5283:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5288:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5297:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalPubProto.g:5297:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalPubProto.g:5298:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalPubProto.g:5304:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalPubProto.g:5310:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalPubProto.g:5311:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalPubProto.g:5311:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalPubProto.g:5312:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalPubProto.g:5331:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=91 && LA71_0<=92)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalPubProto.g:5332:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalPubProto.g:5332:4: (kw= 'E' | kw= 'e' )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==91) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==92) ) {
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
                            // InternalPubProto.g:5333:5: kw= 'E'
                            {
                            kw=(Token)match(input,91,FOLLOW_82); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:5339:5: kw= 'e'
                            {
                            kw=(Token)match(input,92,FOLLOW_82); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalPubProto.g:5345:4: (kw= '+' | kw= '-' )?
                    int alt70=3;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==93) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==94) ) {
                        alt70=2;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalPubProto.g:5346:5: kw= '+'
                            {
                            kw=(Token)match(input,93,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:5352:5: kw= '-'
                            {
                            kw=(Token)match(input,94,FOLLOW_24); if (state.failed) return current;
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
    // InternalPubProto.g:5370:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalPubProto.g:5370:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalPubProto.g:5371:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
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
    // InternalPubProto.g:5377:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:5383:2: (kw= '{' )
            // InternalPubProto.g:5384:2: kw= '{'
            {
            kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5392:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalPubProto.g:5392:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalPubProto.g:5393:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalPubProto.g:5399:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:5405:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalPubProto.g:5406:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalPubProto.g:5406:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalPubProto.g:5407:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_83);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:5417:3: (kw= '.*' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==95) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalPubProto.g:5418:4: kw= '.*'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5428:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalPubProto.g:5428:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalPubProto.g:5429:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalPubProto.g:5435:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5441:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalPubProto.g:5442:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalPubProto.g:5442:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalPubProto.g:5443:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalPubProto.g:5450:3: (kw= '.' this_ID_2= RULE_ID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==68) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalPubProto.g:5451:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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


    // $ANTLR start "rulePublicationNature"
    // InternalPubProto.g:5468:1: rulePublicationNature returns [Enumerator current=null] : ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) ) ;
    public final Enumerator rulePublicationNature() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:5474:2: ( ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) ) )
            // InternalPubProto.g:5475:2: ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) )
            {
            // InternalPubProto.g:5475:2: ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==96) ) {
                alt74=1;
            }
            else if ( (LA74_0==97) ) {
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
                    // InternalPubProto.g:5476:3: (enumLiteral_0= 'Print' )
                    {
                    // InternalPubProto.g:5476:3: (enumLiteral_0= 'Print' )
                    // InternalPubProto.g:5477:4: enumLiteral_0= 'Print'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5484:3: (enumLiteral_1= 'Web' )
                    {
                    // InternalPubProto.g:5484:3: (enumLiteral_1= 'Web' )
                    // InternalPubProto.g:5485:4: enumLiteral_1= 'Web'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5495:1: ruleProtoSequenceNumberStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) ) ;
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
            // InternalPubProto.g:5501:2: ( ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) ) )
            // InternalPubProto.g:5502:2: ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) )
            {
            // InternalPubProto.g:5502:2: ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt75=1;
                }
                break;
            case 99:
                {
                alt75=2;
                }
                break;
            case 100:
                {
                alt75=3;
                }
                break;
            case 101:
                {
                alt75=4;
                }
                break;
            case 102:
                {
                alt75=5;
                }
                break;
            case 103:
                {
                alt75=6;
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
                    // InternalPubProto.g:5503:3: (enumLiteral_0= 'arabic' )
                    {
                    // InternalPubProto.g:5503:3: (enumLiteral_0= 'arabic' )
                    // InternalPubProto.g:5504:4: enumLiteral_0= 'arabic'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5511:3: (enumLiteral_1= 'capitalLetter' )
                    {
                    // InternalPubProto.g:5511:3: (enumLiteral_1= 'capitalLetter' )
                    // InternalPubProto.g:5512:4: enumLiteral_1= 'capitalLetter'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5519:3: (enumLiteral_2= 'smallLetter' )
                    {
                    // InternalPubProto.g:5519:3: (enumLiteral_2= 'smallLetter' )
                    // InternalPubProto.g:5520:4: enumLiteral_2= 'smallLetter'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5527:3: (enumLiteral_3= 'capitalRoman' )
                    {
                    // InternalPubProto.g:5527:3: (enumLiteral_3= 'capitalRoman' )
                    // InternalPubProto.g:5528:4: enumLiteral_3= 'capitalRoman'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5535:3: (enumLiteral_4= 'smallRoman' )
                    {
                    // InternalPubProto.g:5535:3: (enumLiteral_4= 'smallRoman' )
                    // InternalPubProto.g:5536:4: enumLiteral_4= 'smallRoman'
                    {
                    enumLiteral_4=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5543:3: (enumLiteral_5= 'none' )
                    {
                    // InternalPubProto.g:5543:3: (enumLiteral_5= 'none' )
                    // InternalPubProto.g:5544:4: enumLiteral_5= 'none'
                    {
                    enumLiteral_5=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleDmxBaseType"
    // InternalPubProto.g:5554:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalPubProto.g:5560:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalPubProto.g:5561:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalPubProto.g:5561:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt76=11;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt76=1;
                }
                break;
            case 105:
                {
                alt76=2;
                }
                break;
            case 106:
                {
                alt76=3;
                }
                break;
            case 107:
                {
                alt76=4;
                }
                break;
            case 108:
                {
                alt76=5;
                }
                break;
            case 109:
                {
                alt76=6;
                }
                break;
            case 110:
                {
                alt76=7;
                }
                break;
            case 111:
                {
                alt76=8;
                }
                break;
            case 112:
                {
                alt76=9;
                }
                break;
            case 113:
                {
                alt76=10;
                }
                break;
            case 114:
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
                    // InternalPubProto.g:5562:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalPubProto.g:5562:3: (enumLiteral_0= 'VOID' )
                    // InternalPubProto.g:5563:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5570:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalPubProto.g:5570:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalPubProto.g:5571:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5578:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalPubProto.g:5578:3: (enumLiteral_2= 'NUMBER' )
                    // InternalPubProto.g:5579:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5586:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalPubProto.g:5586:3: (enumLiteral_3= 'TEXT' )
                    // InternalPubProto.g:5587:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5594:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalPubProto.g:5594:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalPubProto.g:5595:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5602:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalPubProto.g:5602:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalPubProto.g:5603:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPubProto.g:5610:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalPubProto.g:5610:3: (enumLiteral_6= 'STATE' )
                    // InternalPubProto.g:5611:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPubProto.g:5618:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalPubProto.g:5618:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalPubProto.g:5619:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalPubProto.g:5626:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalPubProto.g:5626:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalPubProto.g:5627:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPubProto.g:5634:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalPubProto.g:5634:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalPubProto.g:5635:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalPubProto.g:5642:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalPubProto.g:5642:3: (enumLiteral_10= 'SERVICE' )
                    // InternalPubProto.g:5643:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5653:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPubProto.g:5659:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalPubProto.g:5660:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalPubProto.g:5660:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt77=1;
                }
                break;
            case 116:
                {
                alt77=2;
                }
                break;
            case 117:
                {
                alt77=3;
                }
                break;
            case 118:
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
                    // InternalPubProto.g:5661:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalPubProto.g:5661:3: (enumLiteral_0= 'OR' )
                    // InternalPubProto.g:5662:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5669:3: (enumLiteral_1= 'or' )
                    {
                    // InternalPubProto.g:5669:3: (enumLiteral_1= 'or' )
                    // InternalPubProto.g:5670:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5677:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalPubProto.g:5677:3: (enumLiteral_2= 'XOR' )
                    // InternalPubProto.g:5678:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5685:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalPubProto.g:5685:3: (enumLiteral_3= 'xor' )
                    // InternalPubProto.g:5686:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5696:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:5702:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalPubProto.g:5703:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalPubProto.g:5703:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==119) ) {
                alt78=1;
            }
            else if ( (LA78_0==120) ) {
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
                    // InternalPubProto.g:5704:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalPubProto.g:5704:3: (enumLiteral_0= 'AND' )
                    // InternalPubProto.g:5705:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5712:3: (enumLiteral_1= 'and' )
                    {
                    // InternalPubProto.g:5712:3: (enumLiteral_1= 'and' )
                    // InternalPubProto.g:5713:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5723:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5729:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalPubProto.g:5730:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalPubProto.g:5730:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt79=1;
                }
                break;
            case 121:
                {
                alt79=2;
                }
                break;
            case 122:
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
                    // InternalPubProto.g:5731:3: (enumLiteral_0= '=' )
                    {
                    // InternalPubProto.g:5731:3: (enumLiteral_0= '=' )
                    // InternalPubProto.g:5732:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5739:3: (enumLiteral_1= '!=' )
                    {
                    // InternalPubProto.g:5739:3: (enumLiteral_1= '!=' )
                    // InternalPubProto.g:5740:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5747:3: (enumLiteral_2= '<>' )
                    {
                    // InternalPubProto.g:5747:3: (enumLiteral_2= '<>' )
                    // InternalPubProto.g:5748:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5758:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalPubProto.g:5764:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalPubProto.g:5765:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalPubProto.g:5765:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt80=6;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt80=1;
                }
                break;
            case 124:
                {
                alt80=2;
                }
                break;
            case 125:
                {
                alt80=3;
                }
                break;
            case 126:
                {
                alt80=4;
                }
                break;
            case 127:
                {
                alt80=5;
                }
                break;
            case 128:
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
                    // InternalPubProto.g:5766:3: (enumLiteral_0= '<' )
                    {
                    // InternalPubProto.g:5766:3: (enumLiteral_0= '<' )
                    // InternalPubProto.g:5767:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5774:3: (enumLiteral_1= '<=' )
                    {
                    // InternalPubProto.g:5774:3: (enumLiteral_1= '<=' )
                    // InternalPubProto.g:5775:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5782:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalPubProto.g:5782:3: (enumLiteral_2= '\\u2264' )
                    // InternalPubProto.g:5783:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5790:3: (enumLiteral_3= '>=' )
                    {
                    // InternalPubProto.g:5790:3: (enumLiteral_3= '>=' )
                    // InternalPubProto.g:5791:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5798:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalPubProto.g:5798:3: (enumLiteral_4= '\\u2265' )
                    // InternalPubProto.g:5799:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5806:3: (enumLiteral_5= '>' )
                    {
                    // InternalPubProto.g:5806:3: (enumLiteral_5= '>' )
                    // InternalPubProto.g:5807:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5817:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:5823:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalPubProto.g:5824:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalPubProto.g:5824:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt81=5;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt81=1;
                }
                break;
            case 60:
                {
                alt81=2;
                }
                break;
            case 86:
                {
                alt81=3;
                }
                break;
            case 130:
                {
                alt81=4;
                }
                break;
            case 131:
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
                    // InternalPubProto.g:5825:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalPubProto.g:5825:3: (enumLiteral_0= 'IN' )
                    // InternalPubProto.g:5826:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5833:3: (enumLiteral_1= 'in' )
                    {
                    // InternalPubProto.g:5833:3: (enumLiteral_1= 'in' )
                    // InternalPubProto.g:5834:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5841:3: (enumLiteral_2= '..' )
                    {
                    // InternalPubProto.g:5841:3: (enumLiteral_2= '..' )
                    // InternalPubProto.g:5842:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5849:3: (enumLiteral_3= '->' )
                    {
                    // InternalPubProto.g:5849:3: (enumLiteral_3= '->' )
                    // InternalPubProto.g:5850:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5857:3: (enumLiteral_4= '=>' )
                    {
                    // InternalPubProto.g:5857:3: (enumLiteral_4= '=>' )
                    // InternalPubProto.g:5858:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5868:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:5874:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalPubProto.g:5875:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalPubProto.g:5875:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==93) ) {
                alt82=1;
            }
            else if ( (LA82_0==94) ) {
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
                    // InternalPubProto.g:5876:3: (enumLiteral_0= '+' )
                    {
                    // InternalPubProto.g:5876:3: (enumLiteral_0= '+' )
                    // InternalPubProto.g:5877:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5884:3: (enumLiteral_1= '-' )
                    {
                    // InternalPubProto.g:5884:3: (enumLiteral_1= '-' )
                    // InternalPubProto.g:5885:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5895:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPubProto.g:5901:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalPubProto.g:5902:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalPubProto.g:5902:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt83=1;
                }
                break;
            case 132:
                {
                alt83=2;
                }
                break;
            case 133:
                {
                alt83=3;
                }
                break;
            case 134:
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
                    // InternalPubProto.g:5903:3: (enumLiteral_0= '*' )
                    {
                    // InternalPubProto.g:5903:3: (enumLiteral_0= '*' )
                    // InternalPubProto.g:5904:4: enumLiteral_0= '*'
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
                    // InternalPubProto.g:5911:3: (enumLiteral_1= '/' )
                    {
                    // InternalPubProto.g:5911:3: (enumLiteral_1= '/' )
                    // InternalPubProto.g:5912:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5919:3: (enumLiteral_2= '**' )
                    {
                    // InternalPubProto.g:5919:3: (enumLiteral_2= '**' )
                    // InternalPubProto.g:5920:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5927:3: (enumLiteral_3= '%' )
                    {
                    // InternalPubProto.g:5927:3: (enumLiteral_3= '%' )
                    // InternalPubProto.g:5928:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5938:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:5944:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalPubProto.g:5945:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalPubProto.g:5945:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt84=1;
                }
                break;
            case 94:
                {
                alt84=2;
                }
                break;
            case 135:
                {
                alt84=3;
                }
                break;
            case 136:
                {
                alt84=4;
                }
                break;
            case 137:
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
                    // InternalPubProto.g:5946:3: (enumLiteral_0= '+' )
                    {
                    // InternalPubProto.g:5946:3: (enumLiteral_0= '+' )
                    // InternalPubProto.g:5947:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5954:3: (enumLiteral_1= '-' )
                    {
                    // InternalPubProto.g:5954:3: (enumLiteral_1= '-' )
                    // InternalPubProto.g:5955:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5962:3: (enumLiteral_2= '!' )
                    {
                    // InternalPubProto.g:5962:3: (enumLiteral_2= '!' )
                    // InternalPubProto.g:5963:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5970:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalPubProto.g:5970:3: (enumLiteral_3= 'NOT' )
                    // InternalPubProto.g:5971:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5978:3: (enumLiteral_4= 'not' )
                    {
                    // InternalPubProto.g:5978:3: (enumLiteral_4= 'not' )
                    // InternalPubProto.g:5979:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5989:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5995:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalPubProto.g:5996:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalPubProto.g:5996:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt85=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt85=1;
                }
                break;
            case 93:
                {
                alt85=2;
                }
                break;
            case 67:
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
                    // InternalPubProto.g:5997:3: (enumLiteral_0= '?' )
                    {
                    // InternalPubProto.g:5997:3: (enumLiteral_0= '?' )
                    // InternalPubProto.g:5998:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:6005:3: (enumLiteral_1= '+' )
                    {
                    // InternalPubProto.g:6005:3: (enumLiteral_1= '+' )
                    // InternalPubProto.g:6006:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:6013:3: (enumLiteral_2= '*' )
                    {
                    // InternalPubProto.g:6013:3: (enumLiteral_2= '*' )
                    // InternalPubProto.g:6014:4: enumLiteral_2= '*'
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

    // $ANTLR start synpred1_InternalPubProto
    public final void synpred1_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:2736:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalPubProto.g:2736:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalPubProto.g:2736:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalPubProto.g:2737:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalPubProto.g:2737:7: ()
        // InternalPubProto.g:2738:7: 
        {
        }

        match(input,68,FOLLOW_4); if (state.failed) return ;
        // InternalPubProto.g:2740:7: ( ( RULE_ID ) )
        // InternalPubProto.g:2741:8: ( RULE_ID )
        {
        // InternalPubProto.g:2741:8: ( RULE_ID )
        // InternalPubProto.g:2742:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_49); if (state.failed) return ;

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
        // InternalPubProto.g:2805:6: ( ( () '.' ) )
        // InternalPubProto.g:2805:7: ( () '.' )
        {
        // InternalPubProto.g:2805:7: ( () '.' )
        // InternalPubProto.g:2806:7: () '.'
        {
        // InternalPubProto.g:2806:7: ()
        // InternalPubProto.g:2807:7: 
        {
        }

        match(input,68,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalPubProto

    // $ANTLR start synpred3_InternalPubProto
    public final void synpred3_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:2841:8: ( ( '(' ) )
        // InternalPubProto.g:2841:9: ( '(' )
        {
        // InternalPubProto.g:2841:9: ( '(' )
        // InternalPubProto.g:2842:9: '('
        {
        match(input,61,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalPubProto

    // $ANTLR start synpred4_InternalPubProto
    public final void synpred4_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3137:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalPubProto.g:3137:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalPubProto.g:3137:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalPubProto.g:3138:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalPubProto.g:3138:6: ()
        // InternalPubProto.g:3139:6: 
        {
        }

        // InternalPubProto.g:3140:6: ( ( ruleDmxOpOr ) )
        // InternalPubProto.g:3141:7: ( ruleDmxOpOr )
        {
        // InternalPubProto.g:3141:7: ( ruleDmxOpOr )
        // InternalPubProto.g:3142:8: ruleDmxOpOr
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
        // InternalPubProto.g:3225:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalPubProto.g:3225:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalPubProto.g:3225:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalPubProto.g:3226:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalPubProto.g:3226:6: ()
        // InternalPubProto.g:3227:6: 
        {
        }

        // InternalPubProto.g:3228:6: ( ( ruleDmxOpAnd ) )
        // InternalPubProto.g:3229:7: ( ruleDmxOpAnd )
        {
        // InternalPubProto.g:3229:7: ( ruleDmxOpAnd )
        // InternalPubProto.g:3230:8: ruleDmxOpAnd
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
        // InternalPubProto.g:3313:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalPubProto.g:3313:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalPubProto.g:3313:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalPubProto.g:3314:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalPubProto.g:3314:6: ()
        // InternalPubProto.g:3315:6: 
        {
        }

        // InternalPubProto.g:3316:6: ( ( ruleDmxOpEquality ) )
        // InternalPubProto.g:3317:7: ( ruleDmxOpEquality )
        {
        // InternalPubProto.g:3317:7: ( ruleDmxOpEquality )
        // InternalPubProto.g:3318:8: ruleDmxOpEquality
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
        // InternalPubProto.g:3402:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalPubProto.g:3402:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalPubProto.g:3402:7: ( () ruleDmxOpInstanceOf )
        // InternalPubProto.g:3403:7: () ruleDmxOpInstanceOf
        {
        // InternalPubProto.g:3403:7: ()
        // InternalPubProto.g:3404:7: 
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
        // InternalPubProto.g:3442:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalPubProto.g:3442:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalPubProto.g:3442:7: ( () ( ( ruleOpCompare ) ) )
        // InternalPubProto.g:3443:7: () ( ( ruleOpCompare ) )
        {
        // InternalPubProto.g:3443:7: ()
        // InternalPubProto.g:3444:7: 
        {
        }

        // InternalPubProto.g:3445:7: ( ( ruleOpCompare ) )
        // InternalPubProto.g:3446:8: ( ruleOpCompare )
        {
        // InternalPubProto.g:3446:8: ( ruleOpCompare )
        // InternalPubProto.g:3447:9: ruleOpCompare
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
        // InternalPubProto.g:3561:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalPubProto.g:3561:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalPubProto.g:3561:6: ( () ( ( ruleOpOther ) ) )
        // InternalPubProto.g:3562:6: () ( ( ruleOpOther ) )
        {
        // InternalPubProto.g:3562:6: ()
        // InternalPubProto.g:3563:6: 
        {
        }

        // InternalPubProto.g:3564:6: ( ( ruleOpOther ) )
        // InternalPubProto.g:3565:7: ( ruleOpOther )
        {
        // InternalPubProto.g:3565:7: ( ruleOpOther )
        // InternalPubProto.g:3566:8: ruleOpOther
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
        // InternalPubProto.g:3649:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalPubProto.g:3649:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalPubProto.g:3649:6: ( () ( ( ruleOpAdd ) ) )
        // InternalPubProto.g:3650:6: () ( ( ruleOpAdd ) )
        {
        // InternalPubProto.g:3650:6: ()
        // InternalPubProto.g:3651:6: 
        {
        }

        // InternalPubProto.g:3652:6: ( ( ruleOpAdd ) )
        // InternalPubProto.g:3653:7: ( ruleOpAdd )
        {
        // InternalPubProto.g:3653:7: ( ruleOpAdd )
        // InternalPubProto.g:3654:8: ruleOpAdd
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
        // InternalPubProto.g:3737:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalPubProto.g:3737:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalPubProto.g:3737:6: ( () ( ( ruleOpMulti ) ) )
        // InternalPubProto.g:3738:6: () ( ( ruleOpMulti ) )
        {
        // InternalPubProto.g:3738:6: ()
        // InternalPubProto.g:3739:6: 
        {
        }

        // InternalPubProto.g:3740:6: ( ( ruleOpMulti ) )
        // InternalPubProto.g:3741:7: ( ruleOpMulti )
        {
        // InternalPubProto.g:3741:7: ( ruleOpMulti )
        // InternalPubProto.g:3742:8: ruleOpMulti
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
        // InternalPubProto.g:3900:5: ( ( () ruleDmxOpCast ) )
        // InternalPubProto.g:3900:6: ( () ruleDmxOpCast )
        {
        // InternalPubProto.g:3900:6: ( () ruleDmxOpCast )
        // InternalPubProto.g:3901:6: () ruleDmxOpCast
        {
        // InternalPubProto.g:3901:6: ()
        // InternalPubProto.g:3902:6: 
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
        // InternalPubProto.g:4748:4: ( ']' )
        // InternalPubProto.g:4748:5: ']'
        {
        match(input,80,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalPubProto

    // $ANTLR start synpred14_InternalPubProto
    public final void synpred14_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:4904:5: ( 'else' )
        // InternalPubProto.g:4904:6: 'else'
        {
        match(input,84,FOLLOW_2); if (state.failed) return ;

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


    protected DFA43 dfa43 = new DFA43(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\71\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\u0086\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\0\1\1\1\6\1\4\1\3\1\2\1\7\1\5\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\2\1\2\uffff\1\1\10\uffff\1\1\6\uffff\2\1\24\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3399:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPubProto()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_3 = input.LA(1);

                         
                        int index43_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPubProto()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_7 = input.LA(1);

                         
                        int index43_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_6 = input.LA(1);

                         
                        int index43_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_9 = input.LA(1);

                         
                        int index43_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_4 = input.LA(1);

                         
                        int index43_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_8 = input.LA(1);

                         
                        int index43_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\3\uffff\1\10\6\uffff";
    static final String dfa_10s = "\1\5\2\uffff\1\37\3\uffff\1\4\2\uffff";
    static final String dfa_11s = "\1\132\2\uffff\1\u0086\3\uffff\1\6\2\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\3\1\4";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\25\uffff\2\1\55\uffff\1\5\1\6\12\uffff\2\1\2\4",
            "",
            "",
            "\2\10\30\uffff\1\10\2\uffff\1\10\1\uffff\1\10\4\uffff\1\10\1\7\2\uffff\4\10\2\uffff\1\10\10\uffff\1\10\6\uffff\2\10\24\uffff\24\10",
            "",
            "",
            "",
            "\1\10\1\uffff\1\11",
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

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4066:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00007ECE42000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x003F000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000010C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000001010C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x000000FC00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8080000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2800000000000002L,0x0000000020000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000B0000060L,0x0000000007801800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0007FF0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L,0x0007FF0000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x20000000B0000070L,0x0000000067845800L,0x0000000000000380L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x60000000B0000070L,0x0000000067845800L,0x0000000000000380L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0078000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0600000000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0xF800000000000180L,0x0000000000000001L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000000002L,0x0000000000400000L,0x000000000000000EL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L,0x0000000000000070L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0200000100000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000130000060L,0x0000000007801800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000030000060L,0x0000000007801800L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000040L,0x0000000060000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});

}