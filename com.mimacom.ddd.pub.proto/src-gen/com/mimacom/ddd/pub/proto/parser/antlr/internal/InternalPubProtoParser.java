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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NATURAL", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'publication'", "'class'", "'nature:'", "'symbol:'", "'preamble:'", "'segments:'", "'divisions:'", "'title:'", "'optional:'", "'true'", "'false'", "'Abstract'", "'{'", "'}'", "'Preface'", "'Epilogue'", "'Body'", "'parts:'", "'appendix:'", "'ChangeHistory'", "'TableOfContents'", "'maxLevel:'", "'Abbreviations'", "'ListOfTables'", "'ListOfFigures'", "'Bibliography'", "'Glossary'", "'Index'", "'numbering:'", "'Part'", "'Appendix'", "'Chapter'", "'Section'", "'Sub'", "'Subsub'", "'import'", "'test'", "'context'", "','", "':'", "':='", "'in'", "'('", "')'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'as'", "'entity'", "'detail'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'FALSE'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'Print'", "'Web'", "'arabic'", "'capitalLetter'", "'smallLetter'", "'capitalRoman'", "'smallRoman'", "'none'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
    };
    public static final int T__50=50;
    public static final int RULE_PLAIN_TEXT_ONLY=7;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__54=54;
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
    // InternalPubProto.g:72:1: rulePublicationClass returns [EObject current=null] : ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'preamble:' ( (lv_preamble_9_0= ruleDRichText ) ) )? otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )* ) ;
    public final EObject rulePublicationClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_nature_5_0 = null;

        EObject lv_symbols_7_0 = null;

        EObject lv_preamble_9_0 = null;

        EObject lv_segments_11_0 = null;

        EObject lv_divisions_13_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:78:2: ( ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'preamble:' ( (lv_preamble_9_0= ruleDRichText ) ) )? otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )* ) )
            // InternalPubProto.g:79:2: ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'preamble:' ( (lv_preamble_9_0= ruleDRichText ) ) )? otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )* )
            {
            // InternalPubProto.g:79:2: ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'preamble:' ( (lv_preamble_9_0= ruleDRichText ) ) )? otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )* )
            // InternalPubProto.g:80:3: () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'nature:' ( (lv_nature_5_0= rulePublicationNature ) ) (otherlv_6= 'symbol:' ( (lv_symbols_7_0= ruleProtoSymbol ) ) )* (otherlv_8= 'preamble:' ( (lv_preamble_9_0= ruleDRichText ) ) )? otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )*
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

            // InternalPubProto.g:161:3: (otherlv_8= 'preamble:' ( (lv_preamble_9_0= ruleDRichText ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPubProto.g:162:4: otherlv_8= 'preamble:' ( (lv_preamble_9_0= ruleDRichText ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPublicationClassAccess().getPreambleKeyword_7_0());
                      			
                    }
                    // InternalPubProto.g:166:4: ( (lv_preamble_9_0= ruleDRichText ) )
                    // InternalPubProto.g:167:5: (lv_preamble_9_0= ruleDRichText )
                    {
                    // InternalPubProto.g:167:5: (lv_preamble_9_0= ruleDRichText )
                    // InternalPubProto.g:168:6: lv_preamble_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPublicationClassAccess().getPreambleDRichTextParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_preamble_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPublicationClassRule());
                      						}
                      						set(
                      							current,
                      							"preamble",
                      							lv_preamble_9_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getPublicationClassAccess().getSegmentsKeyword_8());
              		
            }
            // InternalPubProto.g:190:3: ( (lv_segments_11_0= ruleProtoDocumentSegment ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28||(LA3_0>=31 && LA3_0<=33)||(LA3_0>=36 && LA3_0<=37)||(LA3_0>=39 && LA3_0<=44)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPubProto.g:191:4: (lv_segments_11_0= ruleProtoDocumentSegment )
            	    {
            	    // InternalPubProto.g:191:4: (lv_segments_11_0= ruleProtoDocumentSegment )
            	    // InternalPubProto.g:192:5: lv_segments_11_0= ruleProtoDocumentSegment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPublicationClassAccess().getSegmentsProtoDocumentSegmentParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_segments_11_0=ruleProtoDocumentSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPublicationClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"segments",
            	      						lv_segments_11_0,
            	      						"com.mimacom.ddd.pub.proto.PubProto.ProtoDocumentSegment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getPublicationClassAccess().getDivisionsKeyword_10());
              		
            }
            // InternalPubProto.g:213:3: ( (lv_divisions_13_0= ruleProtoDivision ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=46 && LA4_0<=51)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPubProto.g:214:4: (lv_divisions_13_0= ruleProtoDivision )
            	    {
            	    // InternalPubProto.g:214:4: (lv_divisions_13_0= ruleProtoDivision )
            	    // InternalPubProto.g:215:5: lv_divisions_13_0= ruleProtoDivision
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPublicationClassAccess().getDivisionsProtoDivisionParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_divisions_13_0=ruleProtoDivision();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPublicationClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"divisions",
            	      						lv_divisions_13_0,
            	      						"com.mimacom.ddd.pub.proto.PubProto.ProtoDivision");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "rulePublicationClass"


    // $ANTLR start "entryRuleProtoSymbol"
    // InternalPubProto.g:236:1: entryRuleProtoSymbol returns [EObject current=null] : iv_ruleProtoSymbol= ruleProtoSymbol EOF ;
    public final EObject entryRuleProtoSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSymbol = null;


        try {
            // InternalPubProto.g:236:52: (iv_ruleProtoSymbol= ruleProtoSymbol EOF )
            // InternalPubProto.g:237:2: iv_ruleProtoSymbol= ruleProtoSymbol EOF
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
    // InternalPubProto.g:243:1: ruleProtoSymbol returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProtoSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:249:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPubProto.g:250:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPubProto.g:250:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:251:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:251:3: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:252:4: lv_name_0_0= RULE_ID
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
    // InternalPubProto.g:271:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalPubProto.g:271:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalPubProto.g:272:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalPubProto.g:278:1: ruleDExpression returns [EObject current=null] : this_ProtoSymbolReference_0= ruleProtoSymbolReference ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ProtoSymbolReference_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:284:2: (this_ProtoSymbolReference_0= ruleProtoSymbolReference )
            // InternalPubProto.g:285:2: this_ProtoSymbolReference_0= ruleProtoSymbolReference
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
    // InternalPubProto.g:296:1: entryRuleProtoSymbolReference returns [EObject current=null] : iv_ruleProtoSymbolReference= ruleProtoSymbolReference EOF ;
    public final EObject entryRuleProtoSymbolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSymbolReference = null;


        try {
            // InternalPubProto.g:296:61: (iv_ruleProtoSymbolReference= ruleProtoSymbolReference EOF )
            // InternalPubProto.g:297:2: iv_ruleProtoSymbolReference= ruleProtoSymbolReference EOF
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
    // InternalPubProto.g:303:1: ruleProtoSymbolReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleProtoSymbolReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:309:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPubProto.g:310:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPubProto.g:310:2: ( (otherlv_0= RULE_ID ) )
            // InternalPubProto.g:311:3: (otherlv_0= RULE_ID )
            {
            // InternalPubProto.g:311:3: (otherlv_0= RULE_ID )
            // InternalPubProto.g:312:4: otherlv_0= RULE_ID
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
    // InternalPubProto.g:326:1: entryRuleProtoDocumentSegment returns [EObject current=null] : iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF ;
    public final EObject entryRuleProtoDocumentSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoDocumentSegment = null;


        try {
            // InternalPubProto.g:326:61: (iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF )
            // InternalPubProto.g:327:2: iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF
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
    // InternalPubProto.g:333:1: ruleProtoDocumentSegment returns [EObject current=null] : (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex ) ;
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
            // InternalPubProto.g:339:2: ( (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex ) )
            // InternalPubProto.g:340:2: (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex )
            {
            // InternalPubProto.g:340:2: (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 36:
                {
                alt5=5;
                }
                break;
            case 37:
                {
                alt5=6;
                }
                break;
            case 39:
                {
                alt5=7;
                }
                break;
            case 40:
                {
                alt5=8;
                }
                break;
            case 41:
                {
                alt5=9;
                }
                break;
            case 42:
                {
                alt5=10;
                }
                break;
            case 43:
                {
                alt5=11;
                }
                break;
            case 44:
                {
                alt5=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPubProto.g:341:3: this_ProtoAbstract_0= ruleProtoAbstract
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
                    // InternalPubProto.g:350:3: this_ProtoPreface_1= ruleProtoPreface
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
                    // InternalPubProto.g:359:3: this_ProtoPublicationBody_2= ruleProtoPublicationBody
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
                    // InternalPubProto.g:368:3: this_ProtoEpilogue_3= ruleProtoEpilogue
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
                    // InternalPubProto.g:377:3: this_ProtoChangeHistory_4= ruleProtoChangeHistory
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
                    // InternalPubProto.g:386:3: this_ProtoTOC_5= ruleProtoTOC
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
                    // InternalPubProto.g:395:3: this_ProtoAbbreviations_6= ruleProtoAbbreviations
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
                    // InternalPubProto.g:404:3: this_ProtoListOfTables_7= ruleProtoListOfTables
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
                    // InternalPubProto.g:413:3: this_ProtoListOfFigures_8= ruleProtoListOfFigures
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
                    // InternalPubProto.g:422:3: this_ProtoBibliography_9= ruleProtoBibliography
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
                    // InternalPubProto.g:431:3: this_ProtoGlossary_10= ruleProtoGlossary
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
                    // InternalPubProto.g:440:3: this_ProtoIndex_11= ruleProtoIndex
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
    // InternalPubProto.g:453:1: ruleSegmentBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? ) ;
    public final EObject ruleSegmentBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token lv_optional_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:459:2: ( ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? ) )
            // InternalPubProto.g:460:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? )
            {
            // InternalPubProto.g:460:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? )
            // InternalPubProto.g:461:3: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )?
            {
            // InternalPubProto.g:461:3: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPubProto.g:462:4: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSegmentBodyAccess().getTitleKeyword_0_0());
                      			
                    }
                    // InternalPubProto.g:466:4: ( (lv_title_1_0= RULE_STRING ) )
                    // InternalPubProto.g:467:5: (lv_title_1_0= RULE_STRING )
                    {
                    // InternalPubProto.g:467:5: (lv_title_1_0= RULE_STRING )
                    // InternalPubProto.g:468:6: lv_title_1_0= RULE_STRING
                    {
                    lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); if (state.failed) return current;
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

            // InternalPubProto.g:485:3: (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPubProto.g:486:4: otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSegmentBodyAccess().getOptionalKeyword_1_0());
                      			
                    }
                    // InternalPubProto.g:490:4: ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==26) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==27) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPubProto.g:491:5: ( (lv_optional_3_0= 'true' ) )
                            {
                            // InternalPubProto.g:491:5: ( (lv_optional_3_0= 'true' ) )
                            // InternalPubProto.g:492:6: (lv_optional_3_0= 'true' )
                            {
                            // InternalPubProto.g:492:6: (lv_optional_3_0= 'true' )
                            // InternalPubProto.g:493:7: lv_optional_3_0= 'true'
                            {
                            lv_optional_3_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
                            // InternalPubProto.g:506:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:516:1: entryRuleProtoAbstract returns [EObject current=null] : iv_ruleProtoAbstract= ruleProtoAbstract EOF ;
    public final EObject entryRuleProtoAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAbstract = null;


        try {
            // InternalPubProto.g:516:54: (iv_ruleProtoAbstract= ruleProtoAbstract EOF )
            // InternalPubProto.g:517:2: iv_ruleProtoAbstract= ruleProtoAbstract EOF
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
    // InternalPubProto.g:523:1: ruleProtoAbstract returns [EObject current=null] : ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:529:2: ( ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:530:2: ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:530:2: ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:531:3: () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:531:3: ()
            // InternalPubProto.g:532:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoAbstractAccess().getProtoAbstractAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoAbstractAccess().getAbstractKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoAbstractAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoAbstractRule());
              			}
              			newCompositeNode(grammarAccess.getProtoAbstractAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:565:1: entryRuleProtoPreface returns [EObject current=null] : iv_ruleProtoPreface= ruleProtoPreface EOF ;
    public final EObject entryRuleProtoPreface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPreface = null;


        try {
            // InternalPubProto.g:565:53: (iv_ruleProtoPreface= ruleProtoPreface EOF )
            // InternalPubProto.g:566:2: iv_ruleProtoPreface= ruleProtoPreface EOF
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
    // InternalPubProto.g:572:1: ruleProtoPreface returns [EObject current=null] : ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoPreface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:578:2: ( ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:579:2: ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:579:2: ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:580:3: () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:580:3: ()
            // InternalPubProto.g:581:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoPrefaceAccess().getProtoPrefaceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoPrefaceAccess().getPrefaceKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoPrefaceAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoPrefaceRule());
              			}
              			newCompositeNode(grammarAccess.getProtoPrefaceAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:614:1: entryRuleProtoEpilogue returns [EObject current=null] : iv_ruleProtoEpilogue= ruleProtoEpilogue EOF ;
    public final EObject entryRuleProtoEpilogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoEpilogue = null;


        try {
            // InternalPubProto.g:614:54: (iv_ruleProtoEpilogue= ruleProtoEpilogue EOF )
            // InternalPubProto.g:615:2: iv_ruleProtoEpilogue= ruleProtoEpilogue EOF
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
    // InternalPubProto.g:621:1: ruleProtoEpilogue returns [EObject current=null] : ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoEpilogue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:627:2: ( ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:628:2: ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:628:2: ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:629:3: () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:629:3: ()
            // InternalPubProto.g:630:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoEpilogueAccess().getProtoEpilogueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoEpilogueAccess().getEpilogueKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoEpilogueAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoEpilogueRule());
              			}
              			newCompositeNode(grammarAccess.getProtoEpilogueAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:663:1: entryRuleProtoPublicationBody returns [EObject current=null] : iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF ;
    public final EObject entryRuleProtoPublicationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPublicationBody = null;


        try {
            // InternalPubProto.g:663:61: (iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF )
            // InternalPubProto.g:664:2: iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF
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
    // InternalPubProto.g:670:1: ruleProtoPublicationBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' ) ;
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
            // InternalPubProto.g:676:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' ) )
            // InternalPubProto.g:677:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' )
            {
            // InternalPubProto.g:677:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' )
            // InternalPubProto.g:678:3: () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}'
            {
            // InternalPubProto.g:678:3: ()
            // InternalPubProto.g:679:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoPublicationBodyAccess().getProtoPublicationBodyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoPublicationBodyAccess().getBodyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoPublicationBodyAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalPubProto.g:693:3: (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPubProto.g:694:4: otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getProtoPublicationBodyAccess().getPartsKeyword_3_0());
                      			
                    }
                    // InternalPubProto.g:698:4: ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==26) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==27) ) {
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
                            // InternalPubProto.g:699:5: ( (lv_allowParts_4_0= 'true' ) )
                            {
                            // InternalPubProto.g:699:5: ( (lv_allowParts_4_0= 'true' ) )
                            // InternalPubProto.g:700:6: (lv_allowParts_4_0= 'true' )
                            {
                            // InternalPubProto.g:700:6: (lv_allowParts_4_0= 'true' )
                            // InternalPubProto.g:701:7: lv_allowParts_4_0= 'true'
                            {
                            lv_allowParts_4_0=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
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
                            // InternalPubProto.g:714:5: otherlv_5= 'false'
                            {
                            otherlv_5=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_3_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPubProto.g:720:3: (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPubProto.g:721:4: otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getProtoPublicationBodyAccess().getAppendixKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:725:4: ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==26) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==27) ) {
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
                            // InternalPubProto.g:726:5: ( (lv_allowAppendix_7_0= 'true' ) )
                            {
                            // InternalPubProto.g:726:5: ( (lv_allowAppendix_7_0= 'true' ) )
                            // InternalPubProto.g:727:6: (lv_allowAppendix_7_0= 'true' )
                            {
                            // InternalPubProto.g:727:6: (lv_allowAppendix_7_0= 'true' )
                            // InternalPubProto.g:728:7: lv_allowAppendix_7_0= 'true'
                            {
                            lv_allowAppendix_7_0=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
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
                            // InternalPubProto.g:741:5: otherlv_8= 'false'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_4_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:755:1: entryRuleProtoChangeHistory returns [EObject current=null] : iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF ;
    public final EObject entryRuleProtoChangeHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoChangeHistory = null;


        try {
            // InternalPubProto.g:755:59: (iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF )
            // InternalPubProto.g:756:2: iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF
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
    // InternalPubProto.g:762:1: ruleProtoChangeHistory returns [EObject current=null] : ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoChangeHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:768:2: ( ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:769:2: ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:769:2: ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:770:3: () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:770:3: ()
            // InternalPubProto.g:771:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoChangeHistoryAccess().getProtoChangeHistoryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoChangeHistoryAccess().getChangeHistoryKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoChangeHistoryAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoChangeHistoryRule());
              			}
              			newCompositeNode(grammarAccess.getProtoChangeHistoryAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:804:1: entryRuleProtoTOC returns [EObject current=null] : iv_ruleProtoTOC= ruleProtoTOC EOF ;
    public final EObject entryRuleProtoTOC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoTOC = null;


        try {
            // InternalPubProto.g:804:49: (iv_ruleProtoTOC= ruleProtoTOC EOF )
            // InternalPubProto.g:805:2: iv_ruleProtoTOC= ruleProtoTOC EOF
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
    // InternalPubProto.g:811:1: ruleProtoTOC returns [EObject current=null] : ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' ) ;
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
            // InternalPubProto.g:817:2: ( ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' ) )
            // InternalPubProto.g:818:2: ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' )
            {
            // InternalPubProto.g:818:2: ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}' )
            // InternalPubProto.g:819:3: () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )? otherlv_6= '}'
            {
            // InternalPubProto.g:819:3: ()
            // InternalPubProto.g:820:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoTOCAccess().getProtoTOCAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoTOCAccess().getTableOfContentsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
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
            // InternalPubProto.g:845:3: (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPubProto.g:846:4: otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_NATURAL ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProtoTOCAccess().getMaxLevelKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:850:4: ( (lv_maxLevel_5_0= RULE_NATURAL ) )
                    // InternalPubProto.g:851:5: (lv_maxLevel_5_0= RULE_NATURAL )
                    {
                    // InternalPubProto.g:851:5: (lv_maxLevel_5_0= RULE_NATURAL )
                    // InternalPubProto.g:852:6: lv_maxLevel_5_0= RULE_NATURAL
                    {
                    lv_maxLevel_5_0=(Token)match(input,RULE_NATURAL,FOLLOW_17); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:877:1: entryRuleProtoAbbreviations returns [EObject current=null] : iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF ;
    public final EObject entryRuleProtoAbbreviations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAbbreviations = null;


        try {
            // InternalPubProto.g:877:59: (iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF )
            // InternalPubProto.g:878:2: iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF
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
    // InternalPubProto.g:884:1: ruleProtoAbbreviations returns [EObject current=null] : ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAbbreviations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:890:2: ( ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:891:2: ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:891:2: ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:892:3: () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:892:3: ()
            // InternalPubProto.g:893:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoAbbreviationsAccess().getProtoAbbreviationsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoAbbreviationsAccess().getAbbreviationsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoAbbreviationsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoAbbreviationsRule());
              			}
              			newCompositeNode(grammarAccess.getProtoAbbreviationsAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:926:1: entryRuleProtoListOfTables returns [EObject current=null] : iv_ruleProtoListOfTables= ruleProtoListOfTables EOF ;
    public final EObject entryRuleProtoListOfTables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoListOfTables = null;


        try {
            // InternalPubProto.g:926:58: (iv_ruleProtoListOfTables= ruleProtoListOfTables EOF )
            // InternalPubProto.g:927:2: iv_ruleProtoListOfTables= ruleProtoListOfTables EOF
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
    // InternalPubProto.g:933:1: ruleProtoListOfTables returns [EObject current=null] : ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoListOfTables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:939:2: ( ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:940:2: ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:940:2: ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:941:3: () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:941:3: ()
            // InternalPubProto.g:942:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoListOfTablesAccess().getProtoListOfTablesAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoListOfTablesAccess().getListOfTablesKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoListOfTablesAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoListOfTablesRule());
              			}
              			newCompositeNode(grammarAccess.getProtoListOfTablesAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:975:1: entryRuleProtoListOfFigures returns [EObject current=null] : iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF ;
    public final EObject entryRuleProtoListOfFigures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoListOfFigures = null;


        try {
            // InternalPubProto.g:975:59: (iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF )
            // InternalPubProto.g:976:2: iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF
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
    // InternalPubProto.g:982:1: ruleProtoListOfFigures returns [EObject current=null] : ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoListOfFigures() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:988:2: ( ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:989:2: ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:989:2: ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:990:3: () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:990:3: ()
            // InternalPubProto.g:991:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoListOfFiguresAccess().getProtoListOfFiguresAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoListOfFiguresAccess().getListOfFiguresKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoListOfFiguresAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoListOfFiguresRule());
              			}
              			newCompositeNode(grammarAccess.getProtoListOfFiguresAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1024:1: entryRuleProtoBibliography returns [EObject current=null] : iv_ruleProtoBibliography= ruleProtoBibliography EOF ;
    public final EObject entryRuleProtoBibliography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoBibliography = null;


        try {
            // InternalPubProto.g:1024:58: (iv_ruleProtoBibliography= ruleProtoBibliography EOF )
            // InternalPubProto.g:1025:2: iv_ruleProtoBibliography= ruleProtoBibliography EOF
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
    // InternalPubProto.g:1031:1: ruleProtoBibliography returns [EObject current=null] : ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoBibliography() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1037:2: ( ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1038:2: ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1038:2: ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1039:3: () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1039:3: ()
            // InternalPubProto.g:1040:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoBibliographyAccess().getProtoBibliographyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoBibliographyAccess().getBibliographyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoBibliographyAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoBibliographyRule());
              			}
              			newCompositeNode(grammarAccess.getProtoBibliographyAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1073:1: entryRuleProtoGlossary returns [EObject current=null] : iv_ruleProtoGlossary= ruleProtoGlossary EOF ;
    public final EObject entryRuleProtoGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoGlossary = null;


        try {
            // InternalPubProto.g:1073:54: (iv_ruleProtoGlossary= ruleProtoGlossary EOF )
            // InternalPubProto.g:1074:2: iv_ruleProtoGlossary= ruleProtoGlossary EOF
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
    // InternalPubProto.g:1080:1: ruleProtoGlossary returns [EObject current=null] : ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1086:2: ( ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1087:2: ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1087:2: ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1088:3: () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1088:3: ()
            // InternalPubProto.g:1089:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoGlossaryAccess().getProtoGlossaryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoGlossaryAccess().getGlossaryKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoGlossaryAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoGlossaryRule());
              			}
              			newCompositeNode(grammarAccess.getProtoGlossaryAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1122:1: entryRuleProtoIndex returns [EObject current=null] : iv_ruleProtoIndex= ruleProtoIndex EOF ;
    public final EObject entryRuleProtoIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoIndex = null;


        try {
            // InternalPubProto.g:1122:51: (iv_ruleProtoIndex= ruleProtoIndex EOF )
            // InternalPubProto.g:1123:2: iv_ruleProtoIndex= ruleProtoIndex EOF
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
    // InternalPubProto.g:1129:1: ruleProtoIndex returns [EObject current=null] : ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1135:2: ( ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1136:2: ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1136:2: ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1137:3: () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1137:3: ()
            // InternalPubProto.g:1138:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoIndexAccess().getProtoIndexAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoIndexAccess().getIndexKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoIndexAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoIndexRule());
              			}
              			newCompositeNode(grammarAccess.getProtoIndexAccess().getSegmentBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SegmentBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1171:1: entryRuleProtoDivision returns [EObject current=null] : iv_ruleProtoDivision= ruleProtoDivision EOF ;
    public final EObject entryRuleProtoDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoDivision = null;


        try {
            // InternalPubProto.g:1171:54: (iv_ruleProtoDivision= ruleProtoDivision EOF )
            // InternalPubProto.g:1172:2: iv_ruleProtoDivision= ruleProtoDivision EOF
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
    // InternalPubProto.g:1178:1: ruleProtoDivision returns [EObject current=null] : (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection ) ;
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
            // InternalPubProto.g:1184:2: ( (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection ) )
            // InternalPubProto.g:1185:2: (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection )
            {
            // InternalPubProto.g:1185:2: (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt14=1;
                }
                break;
            case 47:
                {
                alt14=2;
                }
                break;
            case 48:
                {
                alt14=3;
                }
                break;
            case 49:
                {
                alt14=4;
                }
                break;
            case 50:
                {
                alt14=5;
                }
                break;
            case 51:
                {
                alt14=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPubProto.g:1186:3: this_ProtoPart_0= ruleProtoPart
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
                    // InternalPubProto.g:1195:3: this_ProtoAppendix_1= ruleProtoAppendix
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
                    // InternalPubProto.g:1204:3: this_ProtoChapter_2= ruleProtoChapter
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
                    // InternalPubProto.g:1213:3: this_ProtoSection_3= ruleProtoSection
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
                    // InternalPubProto.g:1222:3: this_ProtoSubsection_4= ruleProtoSubsection
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
                    // InternalPubProto.g:1231:3: this_ProtoSubsubsection_5= ruleProtoSubsubsection
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
    // InternalPubProto.g:1244:1: ruleProtoDivisionBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )? ;
    public final EObject ruleProtoDivisionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Enumerator lv_numberingStyle_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1250:2: ( (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )? )
            // InternalPubProto.g:1251:2: (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )?
            {
            // InternalPubProto.g:1251:2: (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPubProto.g:1252:3: otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_0, grammarAccess.getProtoDivisionBodyAccess().getNumberingKeyword_0());
                      		
                    }
                    // InternalPubProto.g:1256:3: ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) )
                    // InternalPubProto.g:1257:4: (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle )
                    {
                    // InternalPubProto.g:1257:4: (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle )
                    // InternalPubProto.g:1258:5: lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle
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
    // InternalPubProto.g:1279:1: entryRuleProtoPart returns [EObject current=null] : iv_ruleProtoPart= ruleProtoPart EOF ;
    public final EObject entryRuleProtoPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPart = null;


        try {
            // InternalPubProto.g:1279:50: (iv_ruleProtoPart= ruleProtoPart EOF )
            // InternalPubProto.g:1280:2: iv_ruleProtoPart= ruleProtoPart EOF
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
    // InternalPubProto.g:1286:1: ruleProtoPart returns [EObject current=null] : ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1292:2: ( ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1293:2: ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1293:2: ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1294:3: () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1294:3: ()
            // InternalPubProto.g:1295:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoPartAccess().getProtoPartAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoPartAccess().getPartKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoPartAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoPartRule());
              			}
              			newCompositeNode(grammarAccess.getProtoPartAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1328:1: entryRuleProtoAppendix returns [EObject current=null] : iv_ruleProtoAppendix= ruleProtoAppendix EOF ;
    public final EObject entryRuleProtoAppendix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAppendix = null;


        try {
            // InternalPubProto.g:1328:54: (iv_ruleProtoAppendix= ruleProtoAppendix EOF )
            // InternalPubProto.g:1329:2: iv_ruleProtoAppendix= ruleProtoAppendix EOF
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
    // InternalPubProto.g:1335:1: ruleProtoAppendix returns [EObject current=null] : ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAppendix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1341:2: ( ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1342:2: ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1342:2: ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1343:3: () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1343:3: ()
            // InternalPubProto.g:1344:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoAppendixAccess().getProtoAppendixAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoAppendixAccess().getAppendixKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoAppendixAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoAppendixRule());
              			}
              			newCompositeNode(grammarAccess.getProtoAppendixAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1377:1: entryRuleProtoChapter returns [EObject current=null] : iv_ruleProtoChapter= ruleProtoChapter EOF ;
    public final EObject entryRuleProtoChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoChapter = null;


        try {
            // InternalPubProto.g:1377:53: (iv_ruleProtoChapter= ruleProtoChapter EOF )
            // InternalPubProto.g:1378:2: iv_ruleProtoChapter= ruleProtoChapter EOF
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
    // InternalPubProto.g:1384:1: ruleProtoChapter returns [EObject current=null] : ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1390:2: ( ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1391:2: ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1391:2: ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1392:3: () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1392:3: ()
            // InternalPubProto.g:1393:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoChapterAccess().getProtoChapterAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoChapterAccess().getChapterKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoChapterAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoChapterRule());
              			}
              			newCompositeNode(grammarAccess.getProtoChapterAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1426:1: entryRuleProtoSection returns [EObject current=null] : iv_ruleProtoSection= ruleProtoSection EOF ;
    public final EObject entryRuleProtoSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSection = null;


        try {
            // InternalPubProto.g:1426:53: (iv_ruleProtoSection= ruleProtoSection EOF )
            // InternalPubProto.g:1427:2: iv_ruleProtoSection= ruleProtoSection EOF
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
    // InternalPubProto.g:1433:1: ruleProtoSection returns [EObject current=null] : ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1439:2: ( ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1440:2: ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1440:2: ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1441:3: () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1441:3: ()
            // InternalPubProto.g:1442:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSectionAccess().getProtoSectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSectionAccess().getSectionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoSectionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoSectionRule());
              			}
              			newCompositeNode(grammarAccess.getProtoSectionAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1475:1: entryRuleProtoSubsection returns [EObject current=null] : iv_ruleProtoSubsection= ruleProtoSubsection EOF ;
    public final EObject entryRuleProtoSubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSubsection = null;


        try {
            // InternalPubProto.g:1475:56: (iv_ruleProtoSubsection= ruleProtoSubsection EOF )
            // InternalPubProto.g:1476:2: iv_ruleProtoSubsection= ruleProtoSubsection EOF
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
    // InternalPubProto.g:1482:1: ruleProtoSubsection returns [EObject current=null] : ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1488:2: ( ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1489:2: ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1489:2: ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1490:3: () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1490:3: ()
            // InternalPubProto.g:1491:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSubsectionAccess().getProtoSubsectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSubsectionAccess().getSubKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoSubsectionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoSubsectionRule());
              			}
              			newCompositeNode(grammarAccess.getProtoSubsectionAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1524:1: entryRuleProtoSubsubsection returns [EObject current=null] : iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF ;
    public final EObject entryRuleProtoSubsubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSubsubsection = null;


        try {
            // InternalPubProto.g:1524:59: (iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF )
            // InternalPubProto.g:1525:2: iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF
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
    // InternalPubProto.g:1531:1: ruleProtoSubsubsection returns [EObject current=null] : ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSubsubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1537:2: ( ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1538:2: ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1538:2: ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1539:3: () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1539:3: ()
            // InternalPubProto.g:1540:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProtoSubsubsectionAccess().getProtoSubsubsectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProtoSubsubsectionAccess().getSubsubKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProtoSubsubsectionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getProtoSubsubsectionRule());
              			}
              			newCompositeNode(grammarAccess.getProtoSubsubsectionAccess().getProtoDivisionBodyParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_17);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProtoDivisionBody_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1573:1: entryRuleDmxModel returns [EObject current=null] : iv_ruleDmxModel= ruleDmxModel EOF ;
    public final EObject entryRuleDmxModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxModel = null;


        try {
            // InternalPubProto.g:1573:49: (iv_ruleDmxModel= ruleDmxModel EOF )
            // InternalPubProto.g:1574:2: iv_ruleDmxModel= ruleDmxModel EOF
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
    // InternalPubProto.g:1580:1: ruleDmxModel returns [EObject current=null] : ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* ) ;
    public final EObject ruleDmxModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_1_0 = null;

        EObject lv_filters_2_0 = null;

        EObject lv_tests_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1586:2: ( ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* ) )
            // InternalPubProto.g:1587:2: ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* )
            {
            // InternalPubProto.g:1587:2: ( () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )* )
            // InternalPubProto.g:1588:3: () ( (lv_types_1_0= ruleDmxArchetype ) )* ( (lv_filters_2_0= ruleDmxFilter ) )* ( (lv_tests_3_0= ruleDmxTest ) )*
            {
            // InternalPubProto.g:1588:3: ()
            // InternalPubProto.g:1589:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxModelAccess().getDmxModelAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:1595:3: ( (lv_types_1_0= ruleDmxArchetype ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==61) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPubProto.g:1596:4: (lv_types_1_0= ruleDmxArchetype )
            	    {
            	    // InternalPubProto.g:1596:4: (lv_types_1_0= ruleDmxArchetype )
            	    // InternalPubProto.g:1597:5: lv_types_1_0= ruleDmxArchetype
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getTypesDmxArchetypeParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop16;
                }
            } while (true);

            // InternalPubProto.g:1614:3: ( (lv_filters_2_0= ruleDmxFilter ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==63) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPubProto.g:1615:4: (lv_filters_2_0= ruleDmxFilter )
            	    {
            	    // InternalPubProto.g:1615:4: (lv_filters_2_0= ruleDmxFilter )
            	    // InternalPubProto.g:1616:5: lv_filters_2_0= ruleDmxFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getFiltersDmxFilterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop17;
                }
            } while (true);

            // InternalPubProto.g:1633:3: ( (lv_tests_3_0= ruleDmxTest ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPubProto.g:1634:4: (lv_tests_3_0= ruleDmxTest )
            	    {
            	    // InternalPubProto.g:1634:4: (lv_tests_3_0= ruleDmxTest )
            	    // InternalPubProto.g:1635:5: lv_tests_3_0= ruleDmxTest
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxModelAccess().getTestsDmxTestParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop18;
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
    // InternalPubProto.g:1656:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalPubProto.g:1656:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalPubProto.g:1657:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalPubProto.g:1663:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1669:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalPubProto.g:1670:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalPubProto.g:1670:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalPubProto.g:1671:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalPubProto.g:1675:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalPubProto.g:1676:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalPubProto.g:1676:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalPubProto.g:1677:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalPubProto.g:1698:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalPubProto.g:1698:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalPubProto.g:1699:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalPubProto.g:1705:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalPubProto.g:1711:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalPubProto.g:1712:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalPubProto.g:1712:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalPubProto.g:1713:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalPubProto.g:1717:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:1718:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:1718:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:1719:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            // InternalPubProto.g:1735:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPubProto.g:1736:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalPubProto.g:1740:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalPubProto.g:1741:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalPubProto.g:1741:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalPubProto.g:1742:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
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

                    // InternalPubProto.g:1759:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==55) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalPubProto.g:1760:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:1764:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalPubProto.g:1765:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalPubProto.g:1765:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalPubProto.g:1766:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalPubProto.g:1789:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalPubProto.g:1790:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalPubProto.g:1790:4: (lv_expr_7_0= ruleDExpression )
            // InternalPubProto.g:1791:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_8=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:1816:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalPubProto.g:1816:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalPubProto.g:1817:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalPubProto.g:1823:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalPubProto.g:1829:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalPubProto.g:1830:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalPubProto.g:1830:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalPubProto.g:1831:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalPubProto.g:1831:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:1832:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:1832:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:1833:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalPubProto.g:1853:3: ( (otherlv_2= RULE_ID ) )
            // InternalPubProto.g:1854:4: (otherlv_2= RULE_ID )
            {
            // InternalPubProto.g:1854:4: (otherlv_2= RULE_ID )
            // InternalPubProto.g:1855:5: otherlv_2= RULE_ID
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

            // InternalPubProto.g:1866:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==59||LA21_0==65||LA21_0==91||LA21_0==136) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPubProto.g:1867:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalPubProto.g:1867:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalPubProto.g:1868:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalPubProto.g:1885:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPubProto.g:1886:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:1890:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_NATURAL)||(LA22_0>=26 && LA22_0<=27)||(LA22_0>=73 && LA22_0<=74)||(LA22_0>=85 && LA22_0<=88)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==29) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalPubProto.g:1891:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalPubProto.g:1891:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalPubProto.g:1892:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalPubProto.g:1892:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalPubProto.g:1893:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalPubProto.g:1911:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalPubProto.g:1911:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalPubProto.g:1912:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalPubProto.g:1912:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalPubProto.g:1913:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalPubProto.g:1936:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalPubProto.g:1936:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalPubProto.g:1937:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalPubProto.g:1943:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalPubProto.g:1949:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalPubProto.g:1950:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalPubProto.g:1950:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalPubProto.g:1951:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalPubProto.g:1951:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:1952:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:1952:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:1953:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,58,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,59,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:1977:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalPubProto.g:1978:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalPubProto.g:1978:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalPubProto.g:1979:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            // InternalPubProto.g:1996:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==55) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPubProto.g:1997:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,55,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalPubProto.g:2001:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalPubProto.g:2002:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalPubProto.g:2002:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalPubProto.g:2003:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_6=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:2029:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalPubProto.g:2029:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalPubProto.g:2030:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalPubProto.g:2036:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2042:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalPubProto.g:2043:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalPubProto.g:2043:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalPubProto.g:2044:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalPubProto.g:2048:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:2049:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:2049:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:2050:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,62,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalPubProto.g:2070:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalPubProto.g:2071:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalPubProto.g:2071:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalPubProto.g:2072:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            // InternalPubProto.g:2089:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_PLAIN_TEXT_ONLY && LA25_0<=RULE_RICH_TEXT_START)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPubProto.g:2090:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalPubProto.g:2090:4: (lv_description_4_0= ruleDRichText )
                    // InternalPubProto.g:2091:5: lv_description_4_0= ruleDRichText
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
    // InternalPubProto.g:2112:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalPubProto.g:2112:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalPubProto.g:2113:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalPubProto.g:2119:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalPubProto.g:2125:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalPubProto.g:2126:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalPubProto.g:2126:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalPubProto.g:2127:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalPubProto.g:2131:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPubProto.g:2132:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPubProto.g:2132:4: (lv_name_1_0= RULE_ID )
            // InternalPubProto.g:2133:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,59,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:2153:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPubProto.g:2154:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalPubProto.g:2154:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalPubProto.g:2155:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalPubProto.g:2155:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalPubProto.g:2156:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalPubProto.g:2173:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==55) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalPubProto.g:2174:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:2178:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalPubProto.g:2179:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalPubProto.g:2179:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalPubProto.g:2180:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,60,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,56,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalPubProto.g:2207:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalPubProto.g:2208:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalPubProto.g:2208:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalPubProto.g:2209:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_43);
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

            // InternalPubProto.g:2226:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==64) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPubProto.g:2227:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,64,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalPubProto.g:2231:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalPubProto.g:2232:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalPubProto.g:2232:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalPubProto.g:2233:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalPubProto.g:2255:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalPubProto.g:2255:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalPubProto.g:2256:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalPubProto.g:2262:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2268:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalPubProto.g:2269:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalPubProto.g:2269:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalPubProto.g:2270:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalPubProto.g:2270:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=102 && LA29_0<=112)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
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
                    // InternalPubProto.g:2271:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalPubProto.g:2271:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalPubProto.g:2272:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalPubProto.g:2272:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalPubProto.g:2273:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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
                    // InternalPubProto.g:2291:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalPubProto.g:2291:4: ( (otherlv_1= RULE_ID ) )
                    // InternalPubProto.g:2292:5: (otherlv_1= RULE_ID )
                    {
                    // InternalPubProto.g:2292:5: (otherlv_1= RULE_ID )
                    // InternalPubProto.g:2293:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:2305:3: ( (lv_collection_2_0= '*' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==65) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPubProto.g:2306:4: (lv_collection_2_0= '*' )
                    {
                    // InternalPubProto.g:2306:4: (lv_collection_2_0= '*' )
                    // InternalPubProto.g:2307:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:2323:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalPubProto.g:2323:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalPubProto.g:2324:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalPubProto.g:2330:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2336:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalPubProto.g:2337:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalPubProto.g:2337:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalPubProto.g:2338:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalPubProto.g:2338:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:2339:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:2339:4: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:2340:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,56,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalPubProto.g:2360:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalPubProto.g:2361:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalPubProto.g:2361:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalPubProto.g:2362:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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
    // InternalPubProto.g:2383:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalPubProto.g:2383:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalPubProto.g:2384:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalPubProto.g:2390:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalPubProto.g:2396:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalPubProto.g:2397:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalPubProto.g:2397:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_RICH_TEXT_START) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalPubProto.g:2398:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalPubProto.g:2398:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalPubProto.g:2399:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalPubProto.g:2399:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalPubProto.g:2400:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalPubProto.g:2418:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalPubProto.g:2418:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalPubProto.g:2419:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalPubProto.g:2419:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalPubProto.g:2420:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalPubProto.g:2420:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalPubProto.g:2421:6: lv_segments_1_0= ruleDmxTextStart
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

                    // InternalPubProto.g:2438:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalPubProto.g:2439:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalPubProto.g:2439:5: (lv_segments_2_0= ruleDExpression )
                    // InternalPubProto.g:2440:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalPubProto.g:2457:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalPubProto.g:2458:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalPubProto.g:2458:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalPubProto.g:2459:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalPubProto.g:2459:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalPubProto.g:2460:7: lv_segments_3_0= ruleDmxTextMiddle
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

                    	    // InternalPubProto.g:2477:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalPubProto.g:2478:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:2478:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalPubProto.g:2479:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop31;
                        }
                    } while (true);

                    // InternalPubProto.g:2497:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalPubProto.g:2498:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalPubProto.g:2498:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalPubProto.g:2499:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalPubProto.g:2521:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalPubProto.g:2521:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalPubProto.g:2522:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalPubProto.g:2528:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2534:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalPubProto.g:2535:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalPubProto.g:2535:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalPubProto.g:2536:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalPubProto.g:2536:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalPubProto.g:2537:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalPubProto.g:2556:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalPubProto.g:2556:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalPubProto.g:2557:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalPubProto.g:2563:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2569:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalPubProto.g:2570:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalPubProto.g:2570:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalPubProto.g:2571:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalPubProto.g:2571:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalPubProto.g:2572:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalPubProto.g:2591:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalPubProto.g:2591:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalPubProto.g:2592:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalPubProto.g:2598:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2604:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalPubProto.g:2605:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalPubProto.g:2605:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalPubProto.g:2606:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalPubProto.g:2606:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalPubProto.g:2607:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalPubProto.g:2626:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalPubProto.g:2626:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalPubProto.g:2627:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalPubProto.g:2633:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:2639:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalPubProto.g:2640:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalPubProto.g:2640:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalPubProto.g:2641:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalPubProto.g:2641:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalPubProto.g:2642:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalPubProto.g:2661:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalPubProto.g:2661:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalPubProto.g:2662:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalPubProto.g:2668:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalPubProto.g:2674:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalPubProto.g:2675:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalPubProto.g:2675:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalPubProto.g:2676:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:2684:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==66) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred1_InternalPubProto()) ) {
                        alt34=1;
                    }
                    else if ( (synpred2_InternalPubProto()) ) {
                        alt34=2;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalPubProto.g:2685:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalPubProto.g:2685:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalPubProto.g:2686:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalPubProto.g:2686:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalPubProto.g:2687:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalPubProto.g:2699:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalPubProto.g:2700:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalPubProto.g:2700:7: ()
            	    // InternalPubProto.g:2701:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalPubProto.g:2711:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalPubProto.g:2712:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPubProto.g:2712:8: (otherlv_3= RULE_ID )
            	    // InternalPubProto.g:2713:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_48);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalPubProto.g:2733:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalPubProto.g:2734:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalPubProto.g:2734:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalPubProto.g:2735:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    // InternalPubProto.g:2754:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalPubProto.g:2754:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalPubProto.g:2755:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalPubProto.g:2755:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalPubProto.g:2756:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalPubProto.g:2762:6: ( () otherlv_7= '.' )
            	    // InternalPubProto.g:2763:7: () otherlv_7= '.'
            	    {
            	    // InternalPubProto.g:2763:7: ()
            	    // InternalPubProto.g:2764:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalPubProto.g:2776:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalPubProto.g:2777:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalPubProto.g:2777:6: (otherlv_8= RULE_ID )
            	    // InternalPubProto.g:2778:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalPubProto.g:2789:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt33=3;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==59) && (synpred3_InternalPubProto())) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==67) ) {
            	        alt33=2;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalPubProto.g:2790:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalPubProto.g:2790:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalPubProto.g:2791:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalPubProto.g:2791:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalPubProto.g:2792:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalPubProto.g:2796:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalPubProto.g:2797:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,59,FOLLOW_50); if (state.failed) return current;
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

            	            // InternalPubProto.g:2809:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalPubProto.g:2810:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalPubProto.g:2810:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalPubProto.g:2811:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_51);
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

            	            otherlv_11=(Token)match(input,60,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPubProto.g:2834:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalPubProto.g:2834:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalPubProto.g:2835:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalPubProto.g:2835:7: (lv_before_12_0= '@before' )
            	            // InternalPubProto.g:2836:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,67,FOLLOW_46); if (state.failed) return current;
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
            	    break loop34;
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
    // InternalPubProto.g:2855:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalPubProto.g:2855:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalPubProto.g:2856:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalPubProto.g:2862:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2868:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalPubProto.g:2869:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalPubProto.g:2869:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalPubProto.g:2870:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalPubProto.g:2870:3: ()
            // InternalPubProto.g:2871:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:2877:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_NATURAL)||(LA36_0>=26 && LA36_0<=27)||LA36_0==29||LA36_0==59||(LA36_0>=73 && LA36_0<=74)||LA36_0==76||LA36_0==80||(LA36_0>=85 && LA36_0<=88)||(LA36_0>=91 && LA36_0<=92)||(LA36_0>=133 && LA36_0<=135)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPubProto.g:2878:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalPubProto.g:2878:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalPubProto.g:2879:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalPubProto.g:2879:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalPubProto.g:2880:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
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

                    // InternalPubProto.g:2897:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==55) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalPubProto.g:2898:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,55,FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:2902:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalPubProto.g:2903:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalPubProto.g:2903:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalPubProto.g:2904:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_52);
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
                    	    break loop35;
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
    // InternalPubProto.g:2927:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalPubProto.g:2927:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalPubProto.g:2928:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalPubProto.g:2934:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:2940:2: (kw= ':=' )
            // InternalPubProto.g:2941:2: kw= ':='
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
    // InternalPubProto.g:2949:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalPubProto.g:2949:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalPubProto.g:2950:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalPubProto.g:2956:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalPubProto.g:2962:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalPubProto.g:2963:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalPubProto.g:2963:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==EOF||LA37_1==55||(LA37_1>=58 && LA37_1<=60)||(LA37_1>=65 && LA37_1<=67)||(LA37_1>=69 && LA37_1<=72)||LA37_1==75||LA37_1==84||(LA37_1>=91 && LA37_1<=92)||(LA37_1>=113 && LA37_1<=132)) ) {
                    alt37=2;
                }
                else if ( (LA37_1==68) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_NATURAL)||(LA37_0>=26 && LA37_0<=27)||LA37_0==29||LA37_0==59||(LA37_0>=73 && LA37_0<=74)||LA37_0==76||LA37_0==80||(LA37_0>=85 && LA37_0<=88)||(LA37_0>=91 && LA37_0<=92)||(LA37_0>=133 && LA37_0<=135)) ) {
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
                    // InternalPubProto.g:2964:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalPubProto.g:2964:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalPubProto.g:2965:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalPubProto.g:2965:4: ()
                    // InternalPubProto.g:2966:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPubProto.g:2972:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalPubProto.g:2973:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalPubProto.g:2973:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalPubProto.g:2974:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
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

                    otherlv_2=(Token)match(input,68,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalPubProto.g:2995:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalPubProto.g:2996:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalPubProto.g:2996:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalPubProto.g:2997:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalPubProto.g:3016:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalPubProto.g:3028:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalPubProto.g:3028:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalPubProto.g:3029:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalPubProto.g:3035:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:3041:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPubProto.g:3042:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPubProto.g:3042:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPubProto.g:3043:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPubProto.g:3043:3: (lv_name_0_0= RULE_ID )
            // InternalPubProto.g:3044:4: lv_name_0_0= RULE_ID
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
    // InternalPubProto.g:3063:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalPubProto.g:3063:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalPubProto.g:3064:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalPubProto.g:3070:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3076:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalPubProto.g:3077:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalPubProto.g:3077:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalPubProto.g:3078:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3086:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case 113:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 114:
                    {
                    int LA38_3 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 115:
                    {
                    int LA38_4 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 116:
                    {
                    int LA38_5 = input.LA(2);

                    if ( (synpred4_InternalPubProto()) ) {
                        alt38=1;
                    }


                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // InternalPubProto.g:3087:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalPubProto.g:3087:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalPubProto.g:3088:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalPubProto.g:3098:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalPubProto.g:3099:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalPubProto.g:3099:6: ()
            	    // InternalPubProto.g:3100:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3106:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalPubProto.g:3107:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalPubProto.g:3107:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalPubProto.g:3108:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    // InternalPubProto.g:3127:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalPubProto.g:3128:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalPubProto.g:3128:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalPubProto.g:3129:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleDmxOrExpression"


    // $ANTLR start "entryRuleDmxAndExpression"
    // InternalPubProto.g:3151:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalPubProto.g:3151:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalPubProto.g:3152:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalPubProto.g:3158:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3164:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalPubProto.g:3165:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalPubProto.g:3165:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalPubProto.g:3166:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3174:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==117) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred5_InternalPubProto()) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==118) ) {
                    int LA39_3 = input.LA(2);

                    if ( (synpred5_InternalPubProto()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalPubProto.g:3175:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalPubProto.g:3175:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalPubProto.g:3176:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalPubProto.g:3186:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalPubProto.g:3187:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalPubProto.g:3187:6: ()
            	    // InternalPubProto.g:3188:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3194:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalPubProto.g:3195:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalPubProto.g:3195:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalPubProto.g:3196:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    // InternalPubProto.g:3215:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalPubProto.g:3216:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalPubProto.g:3216:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalPubProto.g:3217:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalPubProto.g:3239:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalPubProto.g:3239:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalPubProto.g:3240:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalPubProto.g:3246:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3252:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalPubProto.g:3253:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalPubProto.g:3253:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalPubProto.g:3254:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3262:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                switch ( input.LA(1) ) {
                case 75:
                    {
                    int LA40_2 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt40=1;
                    }


                    }
                    break;
                case 119:
                    {
                    int LA40_3 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt40=1;
                    }


                    }
                    break;
                case 120:
                    {
                    int LA40_4 = input.LA(2);

                    if ( (synpred6_InternalPubProto()) ) {
                        alt40=1;
                    }


                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // InternalPubProto.g:3263:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalPubProto.g:3263:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalPubProto.g:3264:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalPubProto.g:3274:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalPubProto.g:3275:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalPubProto.g:3275:6: ()
            	    // InternalPubProto.g:3276:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3282:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalPubProto.g:3283:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalPubProto.g:3283:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalPubProto.g:3284:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    // InternalPubProto.g:3303:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalPubProto.g:3304:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalPubProto.g:3304:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalPubProto.g:3305:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
    // $ANTLR end "ruleDmxEqualityExpression"


    // $ANTLR start "entryRuleDmxRelationalExpression"
    // InternalPubProto.g:3327:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalPubProto.g:3327:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalPubProto.g:3328:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalPubProto.g:3334:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3340:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalPubProto.g:3341:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalPubProto.g:3341:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalPubProto.g:3342:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3350:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop41:
            do {
                int alt41=3;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // InternalPubProto.g:3351:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalPubProto.g:3351:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalPubProto.g:3352:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalPubProto.g:3352:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalPubProto.g:3353:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalPubProto.g:3359:6: ( () ruleDmxOpInstanceOf )
            	    // InternalPubProto.g:3360:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalPubProto.g:3360:7: ()
            	    // InternalPubProto.g:3361:8: 
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

            	    // InternalPubProto.g:3376:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalPubProto.g:3377:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPubProto.g:3377:6: (otherlv_3= RULE_ID )
            	    // InternalPubProto.g:3378:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPubProto.g:3391:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalPubProto.g:3391:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalPubProto.g:3392:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalPubProto.g:3392:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalPubProto.g:3393:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalPubProto.g:3403:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalPubProto.g:3404:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalPubProto.g:3404:7: ()
            	    // InternalPubProto.g:3405:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalPubProto.g:3411:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalPubProto.g:3412:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalPubProto.g:3412:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalPubProto.g:3413:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    // InternalPubProto.g:3432:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalPubProto.g:3433:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalPubProto.g:3433:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalPubProto.g:3434:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_57);
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalPubProto.g:3457:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalPubProto.g:3457:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalPubProto.g:3458:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalPubProto.g:3464:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:3470:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalPubProto.g:3471:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalPubProto.g:3471:2: (kw= 'ISA' | kw= 'isa' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==69) ) {
                alt42=1;
            }
            else if ( (LA42_0==70) ) {
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
                    // InternalPubProto.g:3472:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:3478:3: kw= 'isa'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:3487:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalPubProto.g:3487:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalPubProto.g:3488:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalPubProto.g:3494:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3500:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalPubProto.g:3501:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalPubProto.g:3501:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalPubProto.g:3502:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3510:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                switch ( input.LA(1) ) {
                case 127:
                    {
                    int LA43_2 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt43=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA43_3 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt43=1;
                    }


                    }
                    break;
                case 84:
                    {
                    int LA43_4 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt43=1;
                    }


                    }
                    break;
                case 128:
                    {
                    int LA43_5 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt43=1;
                    }


                    }
                    break;
                case 129:
                    {
                    int LA43_6 = input.LA(2);

                    if ( (synpred9_InternalPubProto()) ) {
                        alt43=1;
                    }


                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // InternalPubProto.g:3511:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalPubProto.g:3511:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalPubProto.g:3512:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalPubProto.g:3522:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalPubProto.g:3523:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalPubProto.g:3523:6: ()
            	    // InternalPubProto.g:3524:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3530:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalPubProto.g:3531:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalPubProto.g:3531:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalPubProto.g:3532:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    // InternalPubProto.g:3551:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalPubProto.g:3552:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalPubProto.g:3552:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalPubProto.g:3553:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalPubProto.g:3575:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalPubProto.g:3575:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalPubProto.g:3576:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalPubProto.g:3582:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3588:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalPubProto.g:3589:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalPubProto.g:3589:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalPubProto.g:3590:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3598:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==91) ) {
                    int LA44_2 = input.LA(2);

                    if ( (synpred10_InternalPubProto()) ) {
                        alt44=1;
                    }


                }
                else if ( (LA44_0==92) ) {
                    int LA44_3 = input.LA(2);

                    if ( (synpred10_InternalPubProto()) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalPubProto.g:3599:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalPubProto.g:3599:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalPubProto.g:3600:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalPubProto.g:3610:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalPubProto.g:3611:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalPubProto.g:3611:6: ()
            	    // InternalPubProto.g:3612:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3618:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalPubProto.g:3619:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalPubProto.g:3619:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalPubProto.g:3620:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    // InternalPubProto.g:3639:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalPubProto.g:3640:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalPubProto.g:3640:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalPubProto.g:3641:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalPubProto.g:3663:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalPubProto.g:3663:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalPubProto.g:3664:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalPubProto.g:3670:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3676:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalPubProto.g:3677:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalPubProto.g:3677:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalPubProto.g:3678:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3686:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop45:
            do {
                int alt45=2;
                switch ( input.LA(1) ) {
                case 65:
                    {
                    int LA45_2 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 130:
                    {
                    int LA45_3 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 131:
                    {
                    int LA45_4 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 132:
                    {
                    int LA45_5 = input.LA(2);

                    if ( (synpred11_InternalPubProto()) ) {
                        alt45=1;
                    }


                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // InternalPubProto.g:3687:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalPubProto.g:3687:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalPubProto.g:3688:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalPubProto.g:3698:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalPubProto.g:3699:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalPubProto.g:3699:6: ()
            	    // InternalPubProto.g:3700:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPubProto.g:3706:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalPubProto.g:3707:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalPubProto.g:3707:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalPubProto.g:3708:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    // InternalPubProto.g:3727:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalPubProto.g:3728:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalPubProto.g:3728:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalPubProto.g:3729:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
    // $ANTLR end "ruleDmxMultiplicativeExpression"


    // $ANTLR start "entryRuleDmxUnaryOperation"
    // InternalPubProto.g:3751:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalPubProto.g:3751:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalPubProto.g:3752:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalPubProto.g:3758:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3764:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalPubProto.g:3765:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalPubProto.g:3765:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=91 && LA46_0<=92)||(LA46_0>=133 && LA46_0<=135)) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_NATURAL)||(LA46_0>=26 && LA46_0<=27)||LA46_0==29||LA46_0==59||(LA46_0>=73 && LA46_0<=74)||LA46_0==76||LA46_0==80||(LA46_0>=85 && LA46_0<=88)) ) {
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
                    // InternalPubProto.g:3766:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalPubProto.g:3766:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalPubProto.g:3767:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalPubProto.g:3767:4: ()
                    // InternalPubProto.g:3768:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPubProto.g:3774:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalPubProto.g:3775:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalPubProto.g:3775:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalPubProto.g:3776:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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

                    // InternalPubProto.g:3793:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalPubProto.g:3794:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalPubProto.g:3794:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalPubProto.g:3795:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalPubProto.g:3814:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalPubProto.g:3826:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalPubProto.g:3826:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalPubProto.g:3827:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalPubProto.g:3833:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:3839:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalPubProto.g:3840:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalPubProto.g:3840:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalPubProto.g:3841:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:3849:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==71) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred12_InternalPubProto()) ) {
                    alt47=1;
                }
            }
            else if ( (LA47_0==72) ) {
                int LA47_2 = input.LA(2);

                if ( (synpred12_InternalPubProto()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalPubProto.g:3850:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalPubProto.g:3850:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalPubProto.g:3851:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalPubProto.g:3857:5: ( () ruleDmxOpCast )
                    // InternalPubProto.g:3858:6: () ruleDmxOpCast
                    {
                    // InternalPubProto.g:3858:6: ()
                    // InternalPubProto.g:3859:7: 
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

                    // InternalPubProto.g:3874:4: ( (otherlv_3= RULE_ID ) )
                    // InternalPubProto.g:3875:5: (otherlv_3= RULE_ID )
                    {
                    // InternalPubProto.g:3875:5: (otherlv_3= RULE_ID )
                    // InternalPubProto.g:3876:6: otherlv_3= RULE_ID
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
    // InternalPubProto.g:3892:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalPubProto.g:3892:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalPubProto.g:3893:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalPubProto.g:3899:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:3905:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalPubProto.g:3906:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalPubProto.g:3906:2: (kw= 'AS' | kw= 'as' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==71) ) {
                alt48=1;
            }
            else if ( (LA48_0==72) ) {
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
                    // InternalPubProto.g:3907:3: kw= 'AS'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:3913:3: kw= 'as'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:3922:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalPubProto.g:3922:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalPubProto.g:3923:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalPubProto.g:3929:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalPubProto.g:3935:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalPubProto.g:3936:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalPubProto.g:3936:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt49=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_NATURAL:
            case 26:
            case 27:
            case 73:
            case 74:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt49=1;
                }
                break;
            case 59:
                {
                alt49=2;
                }
                break;
            case 29:
                {
                alt49=3;
                }
                break;
            case RULE_ID:
                {
                int LA49_4 = input.LA(2);

                if ( (LA49_4==EOF||LA49_4==55||LA49_4==58||LA49_4==60||(LA49_4>=65 && LA49_4<=67)||(LA49_4>=69 && LA49_4<=72)||LA49_4==75||LA49_4==84||(LA49_4>=91 && LA49_4<=92)||(LA49_4>=113 && LA49_4<=132)) ) {
                    alt49=6;
                }
                else if ( (LA49_4==59) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 4, input);

                    throw nvae;
                }
                }
                break;
            case 76:
                {
                alt49=5;
                }
                break;
            case 80:
                {
                alt49=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalPubProto.g:3937:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalPubProto.g:3946:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalPubProto.g:3955:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalPubProto.g:3964:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalPubProto.g:3973:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalPubProto.g:3982:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalPubProto.g:3991:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalPubProto.g:4003:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalPubProto.g:4003:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalPubProto.g:4004:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalPubProto.g:4010:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalPubProto.g:4016:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalPubProto.g:4017:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalPubProto.g:4017:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt50=7;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalPubProto.g:4018:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalPubProto.g:4027:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalPubProto.g:4036:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalPubProto.g:4045:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalPubProto.g:4054:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalPubProto.g:4063:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalPubProto.g:4072:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalPubProto.g:4084:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalPubProto.g:4084:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalPubProto.g:4085:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalPubProto.g:4091:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4097:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalPubProto.g:4098:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalPubProto.g:4098:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalPubProto.g:4099:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_51);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4119:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalPubProto.g:4119:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalPubProto.g:4120:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalPubProto.g:4126:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4132:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalPubProto.g:4133:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalPubProto.g:4133:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalPubProto.g:4134:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalPubProto.g:4134:3: ()
            // InternalPubProto.g:4135:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4145:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPubProto.g:4146:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalPubProto.g:4146:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalPubProto.g:4147:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4147:5: (lv_elements_2_0= ruleDExpression )
                    // InternalPubProto.g:4148:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
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

                    // InternalPubProto.g:4165:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==55) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalPubProto.g:4166:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4170:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalPubProto.g:4171:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:4171:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalPubProto.g:4172:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_63);
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
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4199:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalPubProto.g:4199:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalPubProto.g:4200:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalPubProto.g:4206:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4212:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalPubProto.g:4213:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalPubProto.g:4213:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalPubProto.g:4214:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalPubProto.g:4214:3: ()
            // InternalPubProto.g:4215:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4225:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_NATURAL)||(LA54_0>=26 && LA54_0<=27)||(LA54_0>=73 && LA54_0<=74)||(LA54_0>=85 && LA54_0<=88)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPubProto.g:4226:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalPubProto.g:4226:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalPubProto.g:4227:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalPubProto.g:4227:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalPubProto.g:4228:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
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

                    // InternalPubProto.g:4245:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==55) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalPubProto.g:4246:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,55,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4250:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalPubProto.g:4251:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalPubProto.g:4251:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalPubProto.g:4252:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_63);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4279:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalPubProto.g:4279:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalPubProto.g:4280:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalPubProto.g:4286:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4292:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalPubProto.g:4293:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalPubProto.g:4293:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalPubProto.g:4294:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalPubProto.g:4294:3: ()
            // InternalPubProto.g:4295:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4301:3: ( (otherlv_1= RULE_ID ) )
            // InternalPubProto.g:4302:4: (otherlv_1= RULE_ID )
            {
            // InternalPubProto.g:4302:4: (otherlv_1= RULE_ID )
            // InternalPubProto.g:4303:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPubProto.g:4318:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalPubProto.g:4319:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalPubProto.g:4319:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalPubProto.g:4320:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            otherlv_4=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4345:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalPubProto.g:4345:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalPubProto.g:4346:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalPubProto.g:4352:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4358:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalPubProto.g:4359:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalPubProto.g:4359:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalPubProto.g:4360:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalPubProto.g:4360:3: ()
            // InternalPubProto.g:4361:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4367:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPubProto.g:4368:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalPubProto.g:4368:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalPubProto.g:4369:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4369:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalPubProto.g:4370:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
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

                    // InternalPubProto.g:4387:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==55) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalPubProto.g:4388:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPubProto.g:4392:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalPubProto.g:4393:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalPubProto.g:4393:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalPubProto.g:4394:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_52);
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
                    	    break loop55;
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
    // InternalPubProto.g:4417:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalPubProto.g:4417:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalPubProto.g:4418:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalPubProto.g:4424:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4430:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalPubProto.g:4431:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalPubProto.g:4431:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalPubProto.g:4432:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,73,FOLLOW_4); if (state.failed) return current;
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
    // InternalPubProto.g:4451:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalPubProto.g:4451:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalPubProto.g:4452:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalPubProto.g:4458:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4464:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalPubProto.g:4465:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalPubProto.g:4465:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalPubProto.g:4466:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,74,FOLLOW_4); if (state.failed) return current;
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
    // InternalPubProto.g:4486:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4492:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalPubProto.g:4493:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalPubProto.g:4493:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalPubProto.g:4494:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalPubProto.g:4494:3: ( (otherlv_0= RULE_ID ) )
            // InternalPubProto.g:4495:4: (otherlv_0= RULE_ID )
            {
            // InternalPubProto.g:4495:4: (otherlv_0= RULE_ID )
            // InternalPubProto.g:4496:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxComplexObjectRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxComplexObjectAccess().getTypeDComplexTypeCrossReference_0_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getDomFieldListStartSymbolParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_62);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:4514:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalPubProto.g:4515:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalPubProto.g:4515:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalPubProto.g:4516:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_62);
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
            	    break loop57;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4541:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalPubProto.g:4541:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalPubProto.g:4542:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalPubProto.g:4548:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:4554:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalPubProto.g:4555:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalPubProto.g:4555:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalPubProto.g:4556:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalPubProto.g:4556:3: ( (otherlv_0= RULE_ID ) )
            // InternalPubProto.g:4557:4: (otherlv_0= RULE_ID )
            {
            // InternalPubProto.g:4557:4: (otherlv_0= RULE_ID )
            // InternalPubProto.g:4558:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,75,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPubProto.g:4573:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalPubProto.g:4574:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalPubProto.g:4574:4: (lv_value_2_0= ruleDExpression )
            // InternalPubProto.g:4575:5: lv_value_2_0= ruleDExpression
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
    // InternalPubProto.g:4596:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalPubProto.g:4596:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalPubProto.g:4597:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalPubProto.g:4603:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalPubProto.g:4609:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalPubProto.g:4610:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalPubProto.g:4610:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalPubProto.g:4611:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalPubProto.g:4611:3: ()
            // InternalPubProto.g:4612:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPubProto.g:4622:3: ( ( ruleDQualifiedName ) )
            // InternalPubProto.g:4623:4: ( ruleDQualifiedName )
            {
            // InternalPubProto.g:4623:4: ( ruleDQualifiedName )
            // InternalPubProto.g:4624:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_67);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPubProto.g:4638:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==77) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPubProto.g:4639:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalPubProto.g:4643:4: ( (otherlv_4= RULE_ID ) )
                    // InternalPubProto.g:4644:5: (otherlv_4= RULE_ID )
                    {
                    // InternalPubProto.g:4644:5: (otherlv_4= RULE_ID )
                    // InternalPubProto.g:4645:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:4657:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==68) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalPubProto.g:4658:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalPubProto.g:4662:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_ID) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==65) ) {
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
                            // InternalPubProto.g:4663:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalPubProto.g:4663:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalPubProto.g:4664:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalPubProto.g:4664:6: (lv_displayName_6_0= RULE_ID )
                            // InternalPubProto.g:4665:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
                            // InternalPubProto.g:4682:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalPubProto.g:4682:5: ( (lv_plural_7_0= '*' ) )
                            // InternalPubProto.g:4683:6: (lv_plural_7_0= '*' )
                            {
                            // InternalPubProto.g:4683:6: (lv_plural_7_0= '*' )
                            // InternalPubProto.g:4684:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,65,FOLLOW_70); if (state.failed) return current;
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

            // InternalPubProto.g:4698:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalPubProto.g:4699:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4709:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalPubProto.g:4709:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalPubProto.g:4710:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalPubProto.g:4716:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:4722:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalPubProto.g:4723:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalPubProto.g:4723:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalPubProto.g:4724:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalPubProto.g:4724:3: ()
            // InternalPubProto.g:4725:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:4731:3: ( (otherlv_1= RULE_ID ) )
            // InternalPubProto.g:4732:4: (otherlv_1= RULE_ID )
            {
            // InternalPubProto.g:4732:4: (otherlv_1= RULE_ID )
            // InternalPubProto.g:4733:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalPubProto.g:4744:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==67) ) {
                alt61=1;
            }
            else if ( (LA61_0==66) ) {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==79) ) {
                    alt61=2;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalPubProto.g:4745:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalPubProto.g:4745:4: ( (lv_before_2_0= '@before' ) )
                    // InternalPubProto.g:4746:5: (lv_before_2_0= '@before' )
                    {
                    // InternalPubProto.g:4746:5: (lv_before_2_0= '@before' )
                    // InternalPubProto.g:4747:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPubProto.g:4760:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalPubProto.g:4760:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalPubProto.g:4761:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalPubProto.g:4765:5: ( (lv_all_4_0= 'all' ) )
                    // InternalPubProto.g:4766:6: (lv_all_4_0= 'all' )
                    {
                    // InternalPubProto.g:4766:6: (lv_all_4_0= 'all' )
                    // InternalPubProto.g:4767:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4785:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalPubProto.g:4785:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalPubProto.g:4786:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalPubProto.g:4792:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalPubProto.g:4798:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalPubProto.g:4799:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalPubProto.g:4799:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalPubProto.g:4800:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalPubProto.g:4800:3: ()
            // InternalPubProto.g:4801:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalPubProto.g:4811:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalPubProto.g:4812:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalPubProto.g:4812:4: (lv_if_2_0= ruleDExpression )
            // InternalPubProto.g:4813:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_73);
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

            otherlv_3=(Token)match(input,81,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalPubProto.g:4834:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalPubProto.g:4835:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalPubProto.g:4835:4: (lv_then_4_0= ruleDExpression )
            // InternalPubProto.g:4836:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_74);
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

            // InternalPubProto.g:4853:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==82) && (synpred14_InternalPubProto())) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPubProto.g:4854:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalPubProto.g:4854:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalPubProto.g:4855:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,82,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalPubProto.g:4861:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalPubProto.g:4862:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalPubProto.g:4862:5: (lv_else_6_0= ruleDExpression )
                    // InternalPubProto.g:4863:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_75);
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

            otherlv_7=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4889:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalPubProto.g:4889:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalPubProto.g:4890:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalPubProto.g:4896:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalPubProto.g:4902:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalPubProto.g:4903:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalPubProto.g:4903:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==65||LA63_0==91||LA63_0==136) ) {
                alt63=1;
            }
            else if ( (LA63_0==59) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalPubProto.g:4904:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalPubProto.g:4904:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalPubProto.g:4905:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalPubProto.g:4905:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalPubProto.g:4906:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalPubProto.g:4924:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalPubProto.g:4924:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalPubProto.g:4925:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalPubProto.g:4929:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalPubProto.g:4930:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalPubProto.g:4930:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalPubProto.g:4931:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_76); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,84,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalPubProto.g:4951:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalPubProto.g:4952:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalPubProto.g:4952:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalPubProto.g:4953:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
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

                    otherlv_5=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:4979:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalPubProto.g:4979:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalPubProto.g:4980:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalPubProto.g:4986:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:4992:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalPubProto.g:4993:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalPubProto.g:4993:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_NATURAL) ) {
                alt64=1;
            }
            else if ( (LA64_0==65) ) {
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
                    // InternalPubProto.g:4994:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalPubProto.g:5002:3: kw= '*'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5011:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalPubProto.g:5011:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalPubProto.g:5012:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalPubProto.g:5018:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:5024:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalPubProto.g:5025:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalPubProto.g:5025:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalPubProto.g:5026:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalPubProto.g:5026:3: ()
            // InternalPubProto.g:5027:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5033:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt65=1;
                }
                break;
            case 26:
                {
                alt65=2;
                }
                break;
            case 86:
                {
                alt65=3;
                }
                break;
            case 27:
                {
                alt65=4;
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
                    // InternalPubProto.g:5034:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalPubProto.g:5034:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalPubProto.g:5035:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalPubProto.g:5035:5: (lv_value_1_0= 'TRUE' )
                    // InternalPubProto.g:5036:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPubProto.g:5049:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalPubProto.g:5049:4: ( (lv_value_2_0= 'true' ) )
                    // InternalPubProto.g:5050:5: (lv_value_2_0= 'true' )
                    {
                    // InternalPubProto.g:5050:5: (lv_value_2_0= 'true' )
                    // InternalPubProto.g:5051:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPubProto.g:5064:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5069:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5078:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalPubProto.g:5078:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalPubProto.g:5079:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalPubProto.g:5085:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:5091:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalPubProto.g:5092:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalPubProto.g:5092:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalPubProto.g:5093:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalPubProto.g:5093:3: ()
            // InternalPubProto.g:5094:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5100:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalPubProto.g:5101:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalPubProto.g:5101:4: (lv_value_1_0= RULE_NATURAL )
            // InternalPubProto.g:5102:5: lv_value_1_0= RULE_NATURAL
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
    // InternalPubProto.g:5122:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalPubProto.g:5122:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalPubProto.g:5123:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalPubProto.g:5129:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:5135:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalPubProto.g:5136:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalPubProto.g:5136:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalPubProto.g:5137:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalPubProto.g:5137:3: ()
            // InternalPubProto.g:5138:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5144:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalPubProto.g:5145:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalPubProto.g:5145:4: (lv_value_1_0= ruleDECIMAL )
            // InternalPubProto.g:5146:5: lv_value_1_0= ruleDECIMAL
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
    // InternalPubProto.g:5167:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalPubProto.g:5167:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalPubProto.g:5168:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalPubProto.g:5174:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPubProto.g:5180:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalPubProto.g:5181:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalPubProto.g:5181:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalPubProto.g:5182:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalPubProto.g:5182:3: ()
            // InternalPubProto.g:5183:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5189:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalPubProto.g:5190:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalPubProto.g:5190:4: (lv_value_1_0= RULE_STRING )
            // InternalPubProto.g:5191:5: lv_value_1_0= RULE_STRING
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
    // InternalPubProto.g:5211:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalPubProto.g:5211:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalPubProto.g:5212:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalPubProto.g:5218:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5224:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalPubProto.g:5225:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalPubProto.g:5225:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalPubProto.g:5226:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalPubProto.g:5226:3: ()
            // InternalPubProto.g:5227:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPubProto.g:5233:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==87) ) {
                alt66=1;
            }
            else if ( (LA66_0==88) ) {
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
                    // InternalPubProto.g:5234:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5239:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5248:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalPubProto.g:5248:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalPubProto.g:5249:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalPubProto.g:5255:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalPubProto.g:5261:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalPubProto.g:5262:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalPubProto.g:5262:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalPubProto.g:5263:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalPubProto.g:5282:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=89 && LA69_0<=90)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalPubProto.g:5283:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalPubProto.g:5283:4: (kw= 'E' | kw= 'e' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==89) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==90) ) {
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
                            // InternalPubProto.g:5284:5: kw= 'E'
                            {
                            kw=(Token)match(input,89,FOLLOW_80); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:5290:5: kw= 'e'
                            {
                            kw=(Token)match(input,90,FOLLOW_80); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalPubProto.g:5296:4: (kw= '+' | kw= '-' )?
                    int alt68=3;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==91) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==92) ) {
                        alt68=2;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalPubProto.g:5297:5: kw= '+'
                            {
                            kw=(Token)match(input,91,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:5303:5: kw= '-'
                            {
                            kw=(Token)match(input,92,FOLLOW_22); if (state.failed) return current;
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
    // InternalPubProto.g:5321:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalPubProto.g:5321:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalPubProto.g:5322:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
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
    // InternalPubProto.g:5328:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPubProto.g:5334:2: (kw= '{' )
            // InternalPubProto.g:5335:2: kw= '{'
            {
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5343:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalPubProto.g:5343:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalPubProto.g:5344:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalPubProto.g:5350:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:5356:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalPubProto.g:5357:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalPubProto.g:5357:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalPubProto.g:5358:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_81);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPubProto.g:5368:3: (kw= '.*' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==93) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalPubProto.g:5369:4: kw= '.*'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5379:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalPubProto.g:5379:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalPubProto.g:5380:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalPubProto.g:5386:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5392:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalPubProto.g:5393:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalPubProto.g:5393:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalPubProto.g:5394:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalPubProto.g:5401:3: (kw= '.' this_ID_2= RULE_ID )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==66) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalPubProto.g:5402:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleDQualifiedName"


    // $ANTLR start "rulePublicationNature"
    // InternalPubProto.g:5419:1: rulePublicationNature returns [Enumerator current=null] : ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) ) ;
    public final Enumerator rulePublicationNature() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:5425:2: ( ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) ) )
            // InternalPubProto.g:5426:2: ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) )
            {
            // InternalPubProto.g:5426:2: ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==94) ) {
                alt72=1;
            }
            else if ( (LA72_0==95) ) {
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
                    // InternalPubProto.g:5427:3: (enumLiteral_0= 'Print' )
                    {
                    // InternalPubProto.g:5427:3: (enumLiteral_0= 'Print' )
                    // InternalPubProto.g:5428:4: enumLiteral_0= 'Print'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5435:3: (enumLiteral_1= 'Web' )
                    {
                    // InternalPubProto.g:5435:3: (enumLiteral_1= 'Web' )
                    // InternalPubProto.g:5436:4: enumLiteral_1= 'Web'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5446:1: ruleProtoSequenceNumberStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) ) ;
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
            // InternalPubProto.g:5452:2: ( ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) ) )
            // InternalPubProto.g:5453:2: ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) )
            {
            // InternalPubProto.g:5453:2: ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) )
            int alt73=6;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt73=1;
                }
                break;
            case 97:
                {
                alt73=2;
                }
                break;
            case 98:
                {
                alt73=3;
                }
                break;
            case 99:
                {
                alt73=4;
                }
                break;
            case 100:
                {
                alt73=5;
                }
                break;
            case 101:
                {
                alt73=6;
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
                    // InternalPubProto.g:5454:3: (enumLiteral_0= 'arabic' )
                    {
                    // InternalPubProto.g:5454:3: (enumLiteral_0= 'arabic' )
                    // InternalPubProto.g:5455:4: enumLiteral_0= 'arabic'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5462:3: (enumLiteral_1= 'capitalLetter' )
                    {
                    // InternalPubProto.g:5462:3: (enumLiteral_1= 'capitalLetter' )
                    // InternalPubProto.g:5463:4: enumLiteral_1= 'capitalLetter'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5470:3: (enumLiteral_2= 'smallLetter' )
                    {
                    // InternalPubProto.g:5470:3: (enumLiteral_2= 'smallLetter' )
                    // InternalPubProto.g:5471:4: enumLiteral_2= 'smallLetter'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5478:3: (enumLiteral_3= 'capitalRoman' )
                    {
                    // InternalPubProto.g:5478:3: (enumLiteral_3= 'capitalRoman' )
                    // InternalPubProto.g:5479:4: enumLiteral_3= 'capitalRoman'
                    {
                    enumLiteral_3=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5486:3: (enumLiteral_4= 'smallRoman' )
                    {
                    // InternalPubProto.g:5486:3: (enumLiteral_4= 'smallRoman' )
                    // InternalPubProto.g:5487:4: enumLiteral_4= 'smallRoman'
                    {
                    enumLiteral_4=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5494:3: (enumLiteral_5= 'none' )
                    {
                    // InternalPubProto.g:5494:3: (enumLiteral_5= 'none' )
                    // InternalPubProto.g:5495:4: enumLiteral_5= 'none'
                    {
                    enumLiteral_5=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5505:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalPubProto.g:5511:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalPubProto.g:5512:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalPubProto.g:5512:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt74=11;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt74=1;
                }
                break;
            case 103:
                {
                alt74=2;
                }
                break;
            case 104:
                {
                alt74=3;
                }
                break;
            case 105:
                {
                alt74=4;
                }
                break;
            case 106:
                {
                alt74=5;
                }
                break;
            case 107:
                {
                alt74=6;
                }
                break;
            case 108:
                {
                alt74=7;
                }
                break;
            case 109:
                {
                alt74=8;
                }
                break;
            case 110:
                {
                alt74=9;
                }
                break;
            case 111:
                {
                alt74=10;
                }
                break;
            case 112:
                {
                alt74=11;
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
                    // InternalPubProto.g:5513:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalPubProto.g:5513:3: (enumLiteral_0= 'VOID' )
                    // InternalPubProto.g:5514:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5521:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalPubProto.g:5521:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalPubProto.g:5522:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5529:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalPubProto.g:5529:3: (enumLiteral_2= 'NUMBER' )
                    // InternalPubProto.g:5530:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5537:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalPubProto.g:5537:3: (enumLiteral_3= 'TEXT' )
                    // InternalPubProto.g:5538:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5545:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalPubProto.g:5545:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalPubProto.g:5546:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5553:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalPubProto.g:5553:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalPubProto.g:5554:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPubProto.g:5561:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalPubProto.g:5561:3: (enumLiteral_6= 'STATE' )
                    // InternalPubProto.g:5562:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPubProto.g:5569:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalPubProto.g:5569:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalPubProto.g:5570:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalPubProto.g:5577:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalPubProto.g:5577:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalPubProto.g:5578:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPubProto.g:5585:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalPubProto.g:5585:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalPubProto.g:5586:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalPubProto.g:5593:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalPubProto.g:5593:3: (enumLiteral_10= 'SERVICE' )
                    // InternalPubProto.g:5594:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5604:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPubProto.g:5610:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalPubProto.g:5611:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalPubProto.g:5611:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt75=1;
                }
                break;
            case 114:
                {
                alt75=2;
                }
                break;
            case 115:
                {
                alt75=3;
                }
                break;
            case 116:
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
                    // InternalPubProto.g:5612:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalPubProto.g:5612:3: (enumLiteral_0= 'OR' )
                    // InternalPubProto.g:5613:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5620:3: (enumLiteral_1= 'or' )
                    {
                    // InternalPubProto.g:5620:3: (enumLiteral_1= 'or' )
                    // InternalPubProto.g:5621:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5628:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalPubProto.g:5628:3: (enumLiteral_2= 'XOR' )
                    // InternalPubProto.g:5629:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5636:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalPubProto.g:5636:3: (enumLiteral_3= 'xor' )
                    // InternalPubProto.g:5637:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5647:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:5653:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalPubProto.g:5654:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalPubProto.g:5654:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==117) ) {
                alt76=1;
            }
            else if ( (LA76_0==118) ) {
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
                    // InternalPubProto.g:5655:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalPubProto.g:5655:3: (enumLiteral_0= 'AND' )
                    // InternalPubProto.g:5656:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5663:3: (enumLiteral_1= 'and' )
                    {
                    // InternalPubProto.g:5663:3: (enumLiteral_1= 'and' )
                    // InternalPubProto.g:5664:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5674:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5680:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalPubProto.g:5681:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalPubProto.g:5681:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt77=1;
                }
                break;
            case 119:
                {
                alt77=2;
                }
                break;
            case 120:
                {
                alt77=3;
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
                    // InternalPubProto.g:5682:3: (enumLiteral_0= '=' )
                    {
                    // InternalPubProto.g:5682:3: (enumLiteral_0= '=' )
                    // InternalPubProto.g:5683:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5690:3: (enumLiteral_1= '!=' )
                    {
                    // InternalPubProto.g:5690:3: (enumLiteral_1= '!=' )
                    // InternalPubProto.g:5691:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5698:3: (enumLiteral_2= '<>' )
                    {
                    // InternalPubProto.g:5698:3: (enumLiteral_2= '<>' )
                    // InternalPubProto.g:5699:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5709:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalPubProto.g:5715:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalPubProto.g:5716:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalPubProto.g:5716:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt78=6;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt78=1;
                }
                break;
            case 122:
                {
                alt78=2;
                }
                break;
            case 123:
                {
                alt78=3;
                }
                break;
            case 124:
                {
                alt78=4;
                }
                break;
            case 125:
                {
                alt78=5;
                }
                break;
            case 126:
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
                    // InternalPubProto.g:5717:3: (enumLiteral_0= '<' )
                    {
                    // InternalPubProto.g:5717:3: (enumLiteral_0= '<' )
                    // InternalPubProto.g:5718:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5725:3: (enumLiteral_1= '<=' )
                    {
                    // InternalPubProto.g:5725:3: (enumLiteral_1= '<=' )
                    // InternalPubProto.g:5726:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5733:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalPubProto.g:5733:3: (enumLiteral_2= '\\u2264' )
                    // InternalPubProto.g:5734:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5741:3: (enumLiteral_3= '>=' )
                    {
                    // InternalPubProto.g:5741:3: (enumLiteral_3= '>=' )
                    // InternalPubProto.g:5742:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5749:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalPubProto.g:5749:3: (enumLiteral_4= '\\u2265' )
                    // InternalPubProto.g:5750:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:5757:3: (enumLiteral_5= '>' )
                    {
                    // InternalPubProto.g:5757:3: (enumLiteral_5= '>' )
                    // InternalPubProto.g:5758:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5768:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:5774:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalPubProto.g:5775:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalPubProto.g:5775:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt79=5;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt79=1;
                }
                break;
            case 58:
                {
                alt79=2;
                }
                break;
            case 84:
                {
                alt79=3;
                }
                break;
            case 128:
                {
                alt79=4;
                }
                break;
            case 129:
                {
                alt79=5;
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
                    // InternalPubProto.g:5776:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalPubProto.g:5776:3: (enumLiteral_0= 'IN' )
                    // InternalPubProto.g:5777:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5784:3: (enumLiteral_1= 'in' )
                    {
                    // InternalPubProto.g:5784:3: (enumLiteral_1= 'in' )
                    // InternalPubProto.g:5785:4: enumLiteral_1= 'in'
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
                    // InternalPubProto.g:5792:3: (enumLiteral_2= '..' )
                    {
                    // InternalPubProto.g:5792:3: (enumLiteral_2= '..' )
                    // InternalPubProto.g:5793:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5800:3: (enumLiteral_3= '->' )
                    {
                    // InternalPubProto.g:5800:3: (enumLiteral_3= '->' )
                    // InternalPubProto.g:5801:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5808:3: (enumLiteral_4= '=>' )
                    {
                    // InternalPubProto.g:5808:3: (enumLiteral_4= '=>' )
                    // InternalPubProto.g:5809:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5819:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:5825:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalPubProto.g:5826:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalPubProto.g:5826:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==91) ) {
                alt80=1;
            }
            else if ( (LA80_0==92) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalPubProto.g:5827:3: (enumLiteral_0= '+' )
                    {
                    // InternalPubProto.g:5827:3: (enumLiteral_0= '+' )
                    // InternalPubProto.g:5828:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5835:3: (enumLiteral_1= '-' )
                    {
                    // InternalPubProto.g:5835:3: (enumLiteral_1= '-' )
                    // InternalPubProto.g:5836:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5846:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPubProto.g:5852:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalPubProto.g:5853:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalPubProto.g:5853:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt81=1;
                }
                break;
            case 130:
                {
                alt81=2;
                }
                break;
            case 131:
                {
                alt81=3;
                }
                break;
            case 132:
                {
                alt81=4;
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
                    // InternalPubProto.g:5854:3: (enumLiteral_0= '*' )
                    {
                    // InternalPubProto.g:5854:3: (enumLiteral_0= '*' )
                    // InternalPubProto.g:5855:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5862:3: (enumLiteral_1= '/' )
                    {
                    // InternalPubProto.g:5862:3: (enumLiteral_1= '/' )
                    // InternalPubProto.g:5863:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5870:3: (enumLiteral_2= '**' )
                    {
                    // InternalPubProto.g:5870:3: (enumLiteral_2= '**' )
                    // InternalPubProto.g:5871:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5878:3: (enumLiteral_3= '%' )
                    {
                    // InternalPubProto.g:5878:3: (enumLiteral_3= '%' )
                    // InternalPubProto.g:5879:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5889:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:5895:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalPubProto.g:5896:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalPubProto.g:5896:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt82=5;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt82=1;
                }
                break;
            case 92:
                {
                alt82=2;
                }
                break;
            case 133:
                {
                alt82=3;
                }
                break;
            case 134:
                {
                alt82=4;
                }
                break;
            case 135:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalPubProto.g:5897:3: (enumLiteral_0= '+' )
                    {
                    // InternalPubProto.g:5897:3: (enumLiteral_0= '+' )
                    // InternalPubProto.g:5898:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5905:3: (enumLiteral_1= '-' )
                    {
                    // InternalPubProto.g:5905:3: (enumLiteral_1= '-' )
                    // InternalPubProto.g:5906:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5913:3: (enumLiteral_2= '!' )
                    {
                    // InternalPubProto.g:5913:3: (enumLiteral_2= '!' )
                    // InternalPubProto.g:5914:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:5921:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalPubProto.g:5921:3: (enumLiteral_3= 'NOT' )
                    // InternalPubProto.g:5922:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:5929:3: (enumLiteral_4= 'not' )
                    {
                    // InternalPubProto.g:5929:3: (enumLiteral_4= 'not' )
                    // InternalPubProto.g:5930:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
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
    // InternalPubProto.g:5940:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPubProto.g:5946:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalPubProto.g:5947:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalPubProto.g:5947:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt83=1;
                }
                break;
            case 91:
                {
                alt83=2;
                }
                break;
            case 65:
                {
                alt83=3;
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
                    // InternalPubProto.g:5948:3: (enumLiteral_0= '?' )
                    {
                    // InternalPubProto.g:5948:3: (enumLiteral_0= '?' )
                    // InternalPubProto.g:5949:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:5956:3: (enumLiteral_1= '+' )
                    {
                    // InternalPubProto.g:5956:3: (enumLiteral_1= '+' )
                    // InternalPubProto.g:5957:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:5964:3: (enumLiteral_2= '*' )
                    {
                    // InternalPubProto.g:5964:3: (enumLiteral_2= '*' )
                    // InternalPubProto.g:5965:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
        // InternalPubProto.g:2687:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalPubProto.g:2687:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalPubProto.g:2687:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalPubProto.g:2688:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalPubProto.g:2688:7: ()
        // InternalPubProto.g:2689:7: 
        {
        }

        match(input,66,FOLLOW_4); if (state.failed) return ;
        // InternalPubProto.g:2691:7: ( ( RULE_ID ) )
        // InternalPubProto.g:2692:8: ( RULE_ID )
        {
        // InternalPubProto.g:2692:8: ( RULE_ID )
        // InternalPubProto.g:2693:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_47); if (state.failed) return ;

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
        // InternalPubProto.g:2756:6: ( ( () '.' ) )
        // InternalPubProto.g:2756:7: ( () '.' )
        {
        // InternalPubProto.g:2756:7: ( () '.' )
        // InternalPubProto.g:2757:7: () '.'
        {
        // InternalPubProto.g:2757:7: ()
        // InternalPubProto.g:2758:7: 
        {
        }

        match(input,66,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalPubProto

    // $ANTLR start synpred3_InternalPubProto
    public final void synpred3_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:2792:8: ( ( '(' ) )
        // InternalPubProto.g:2792:9: ( '(' )
        {
        // InternalPubProto.g:2792:9: ( '(' )
        // InternalPubProto.g:2793:9: '('
        {
        match(input,59,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalPubProto

    // $ANTLR start synpred4_InternalPubProto
    public final void synpred4_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:3088:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalPubProto.g:3088:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalPubProto.g:3088:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalPubProto.g:3089:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalPubProto.g:3089:6: ()
        // InternalPubProto.g:3090:6: 
        {
        }

        // InternalPubProto.g:3091:6: ( ( ruleDmxOpOr ) )
        // InternalPubProto.g:3092:7: ( ruleDmxOpOr )
        {
        // InternalPubProto.g:3092:7: ( ruleDmxOpOr )
        // InternalPubProto.g:3093:8: ruleDmxOpOr
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
        // InternalPubProto.g:3176:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalPubProto.g:3176:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalPubProto.g:3176:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalPubProto.g:3177:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalPubProto.g:3177:6: ()
        // InternalPubProto.g:3178:6: 
        {
        }

        // InternalPubProto.g:3179:6: ( ( ruleDmxOpAnd ) )
        // InternalPubProto.g:3180:7: ( ruleDmxOpAnd )
        {
        // InternalPubProto.g:3180:7: ( ruleDmxOpAnd )
        // InternalPubProto.g:3181:8: ruleDmxOpAnd
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
        // InternalPubProto.g:3264:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalPubProto.g:3264:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalPubProto.g:3264:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalPubProto.g:3265:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalPubProto.g:3265:6: ()
        // InternalPubProto.g:3266:6: 
        {
        }

        // InternalPubProto.g:3267:6: ( ( ruleDmxOpEquality ) )
        // InternalPubProto.g:3268:7: ( ruleDmxOpEquality )
        {
        // InternalPubProto.g:3268:7: ( ruleDmxOpEquality )
        // InternalPubProto.g:3269:8: ruleDmxOpEquality
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
        // InternalPubProto.g:3353:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalPubProto.g:3353:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalPubProto.g:3353:7: ( () ruleDmxOpInstanceOf )
        // InternalPubProto.g:3354:7: () ruleDmxOpInstanceOf
        {
        // InternalPubProto.g:3354:7: ()
        // InternalPubProto.g:3355:7: 
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
        // InternalPubProto.g:3393:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalPubProto.g:3393:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalPubProto.g:3393:7: ( () ( ( ruleOpCompare ) ) )
        // InternalPubProto.g:3394:7: () ( ( ruleOpCompare ) )
        {
        // InternalPubProto.g:3394:7: ()
        // InternalPubProto.g:3395:7: 
        {
        }

        // InternalPubProto.g:3396:7: ( ( ruleOpCompare ) )
        // InternalPubProto.g:3397:8: ( ruleOpCompare )
        {
        // InternalPubProto.g:3397:8: ( ruleOpCompare )
        // InternalPubProto.g:3398:9: ruleOpCompare
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
        // InternalPubProto.g:3512:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalPubProto.g:3512:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalPubProto.g:3512:6: ( () ( ( ruleOpOther ) ) )
        // InternalPubProto.g:3513:6: () ( ( ruleOpOther ) )
        {
        // InternalPubProto.g:3513:6: ()
        // InternalPubProto.g:3514:6: 
        {
        }

        // InternalPubProto.g:3515:6: ( ( ruleOpOther ) )
        // InternalPubProto.g:3516:7: ( ruleOpOther )
        {
        // InternalPubProto.g:3516:7: ( ruleOpOther )
        // InternalPubProto.g:3517:8: ruleOpOther
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
        // InternalPubProto.g:3600:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalPubProto.g:3600:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalPubProto.g:3600:6: ( () ( ( ruleOpAdd ) ) )
        // InternalPubProto.g:3601:6: () ( ( ruleOpAdd ) )
        {
        // InternalPubProto.g:3601:6: ()
        // InternalPubProto.g:3602:6: 
        {
        }

        // InternalPubProto.g:3603:6: ( ( ruleOpAdd ) )
        // InternalPubProto.g:3604:7: ( ruleOpAdd )
        {
        // InternalPubProto.g:3604:7: ( ruleOpAdd )
        // InternalPubProto.g:3605:8: ruleOpAdd
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
        // InternalPubProto.g:3688:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalPubProto.g:3688:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalPubProto.g:3688:6: ( () ( ( ruleOpMulti ) ) )
        // InternalPubProto.g:3689:6: () ( ( ruleOpMulti ) )
        {
        // InternalPubProto.g:3689:6: ()
        // InternalPubProto.g:3690:6: 
        {
        }

        // InternalPubProto.g:3691:6: ( ( ruleOpMulti ) )
        // InternalPubProto.g:3692:7: ( ruleOpMulti )
        {
        // InternalPubProto.g:3692:7: ( ruleOpMulti )
        // InternalPubProto.g:3693:8: ruleOpMulti
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
        // InternalPubProto.g:3851:5: ( ( () ruleDmxOpCast ) )
        // InternalPubProto.g:3851:6: ( () ruleDmxOpCast )
        {
        // InternalPubProto.g:3851:6: ( () ruleDmxOpCast )
        // InternalPubProto.g:3852:6: () ruleDmxOpCast
        {
        // InternalPubProto.g:3852:6: ()
        // InternalPubProto.g:3853:6: 
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
        // InternalPubProto.g:4699:4: ( ']' )
        // InternalPubProto.g:4699:5: ']'
        {
        match(input,78,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalPubProto

    // $ANTLR start synpred14_InternalPubProto
    public final void synpred14_InternalPubProto_fragment() throws RecognitionException {   
        // InternalPubProto.g:4855:5: ( 'else' )
        // InternalPubProto.g:4855:6: 'else'
        {
        match(input,82,FOLLOW_2); if (state.failed) return ;

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


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\67\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\u0084\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\4\1\5\1\6\1\2\1\1\1\0\1\7\1\3\2\uffff}>";
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

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3350:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_7 = input.LA(1);

                         
                        int index41_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_9 = input.LA(1);

                         
                        int index41_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPubProto()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPubProto()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA41_4 = input.LA(1);

                         
                        int index41_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA41_8 = input.LA(1);

                         
                        int index41_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPubProto()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\3\uffff\1\7\6\uffff";
    static final String dfa_10s = "\1\5\2\uffff\1\35\4\uffff\1\4\1\uffff";
    static final String dfa_11s = "\1\130\2\uffff\1\u0084\4\uffff\1\6\1\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\3\1\uffff\1\4";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\23\uffff\2\1\55\uffff\1\5\1\6\12\uffff\2\1\2\4",
            "",
            "",
            "\2\7\30\uffff\1\7\2\uffff\1\7\1\uffff\1\7\4\uffff\1\7\1\10\2\uffff\4\7\2\uffff\1\7\10\uffff\1\7\6\uffff\2\7\24\uffff\24\7",
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

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4017:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001FB390800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000FC00000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000043000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004043000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000003F00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xA020000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x8020000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0A00000000000002L,0x0000000008000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000002C000060L,0x0000000001E00600L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0001FFC000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000010L,0x0001FFC000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x080000002C000070L,0x0000000019E11600L,0x00000000000000E0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x180000002C000070L,0x0000000019E11600L,0x00000000000000E0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x001E000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0060000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x7E00000000000060L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000000002L,0x8000000000100000L,0x0000000000000003L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0080000040000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x000000004C000060L,0x0000000001E00600L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x000000000C000060L,0x0000000001E00600L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000040L,0x0000000018000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});

}