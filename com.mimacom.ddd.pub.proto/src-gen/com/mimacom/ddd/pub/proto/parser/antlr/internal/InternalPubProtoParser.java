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

@SuppressWarnings("all")
public class InternalPubProtoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'publication'", "'class'", "'title:'", "'nature:'", "'symbol:'", "'segments:'", "'divisions:'", "'optional:'", "'true'", "'false'", "'Abstract'", "'{'", "'}'", "'Preface'", "'Epilogue'", "'Body'", "'parts:'", "'appendix:'", "'ChangeHistory'", "'TableOfContents'", "'maxLevel:'", "'Abbreviations'", "'ListOfTables'", "'ListOfFigures'", "'Bibliography'", "'Glossary'", "'Index'", "'numbering:'", "'Part'", "'Appendix'", "'Chapter'", "'Section'", "'Sub'", "'Subsub'", "'Print'", "'Web'", "'arabic'", "'capitalLetter'", "'smallLetter'", "'capitalRoman'", "'smallRoman'", "'none'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
             newCompositeNode(grammarAccess.getPublicationClassRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublicationClass=rulePublicationClass();

            state._fsp--;

             current =iv_rulePublicationClass; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:72:1: rulePublicationClass returns [EObject current=null] : ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'title:' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'nature:' ( (lv_nature_7_0= rulePublicationNature ) ) (otherlv_8= 'symbol:' ( (lv_symbols_9_0= RULE_ID ) ) )* otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )* ) ;
    public final EObject rulePublicationClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_symbols_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_nature_7_0 = null;

        EObject lv_segments_11_0 = null;

        EObject lv_divisions_13_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:78:2: ( ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'title:' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'nature:' ( (lv_nature_7_0= rulePublicationNature ) ) (otherlv_8= 'symbol:' ( (lv_symbols_9_0= RULE_ID ) ) )* otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )* ) )
            // InternalPubProto.g:79:2: ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'title:' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'nature:' ( (lv_nature_7_0= rulePublicationNature ) ) (otherlv_8= 'symbol:' ( (lv_symbols_9_0= RULE_ID ) ) )* otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )* )
            {
            // InternalPubProto.g:79:2: ( () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'title:' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'nature:' ( (lv_nature_7_0= rulePublicationNature ) ) (otherlv_8= 'symbol:' ( (lv_symbols_9_0= RULE_ID ) ) )* otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )* )
            // InternalPubProto.g:80:3: () otherlv_1= 'publication' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'title:' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'nature:' ( (lv_nature_7_0= rulePublicationNature ) ) (otherlv_8= 'symbol:' ( (lv_symbols_9_0= RULE_ID ) ) )* otherlv_10= 'segments:' ( (lv_segments_11_0= ruleProtoDocumentSegment ) )* otherlv_12= 'divisions:' ( (lv_divisions_13_0= ruleProtoDivision ) )*
            {
            // InternalPubProto.g:80:3: ()
            // InternalPubProto.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublicationClassAccess().getPublicationClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPublicationClassAccess().getPublicationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPublicationClassAccess().getClassKeyword_2());
            		
            // InternalPubProto.g:95:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalPubProto.g:96:4: (lv_name_3_0= RULE_ID )
            {
            // InternalPubProto.g:96:4: (lv_name_3_0= RULE_ID )
            // InternalPubProto.g:97:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPublicationClassAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublicationClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPubProto.g:113:3: (otherlv_4= 'title:' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPubProto.g:114:4: otherlv_4= 'title:' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getPublicationClassAccess().getTitleKeyword_4_0());
                    			
                    // InternalPubProto.g:118:4: ( (lv_title_5_0= RULE_STRING ) )
                    // InternalPubProto.g:119:5: (lv_title_5_0= RULE_STRING )
                    {
                    // InternalPubProto.g:119:5: (lv_title_5_0= RULE_STRING )
                    // InternalPubProto.g:120:6: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_title_5_0, grammarAccess.getPublicationClassAccess().getTitleSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublicationClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPublicationClassAccess().getNatureKeyword_5());
            		
            // InternalPubProto.g:141:3: ( (lv_nature_7_0= rulePublicationNature ) )
            // InternalPubProto.g:142:4: (lv_nature_7_0= rulePublicationNature )
            {
            // InternalPubProto.g:142:4: (lv_nature_7_0= rulePublicationNature )
            // InternalPubProto.g:143:5: lv_nature_7_0= rulePublicationNature
            {

            					newCompositeNode(grammarAccess.getPublicationClassAccess().getNaturePublicationNatureEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_nature_7_0=rulePublicationNature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublicationClassRule());
            					}
            					set(
            						current,
            						"nature",
            						lv_nature_7_0,
            						"com.mimacom.ddd.pub.proto.PubProto.PublicationNature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPubProto.g:160:3: (otherlv_8= 'symbol:' ( (lv_symbols_9_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPubProto.g:161:4: otherlv_8= 'symbol:' ( (lv_symbols_9_0= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPublicationClassAccess().getSymbolKeyword_7_0());
            	    			
            	    // InternalPubProto.g:165:4: ( (lv_symbols_9_0= RULE_ID ) )
            	    // InternalPubProto.g:166:5: (lv_symbols_9_0= RULE_ID )
            	    {
            	    // InternalPubProto.g:166:5: (lv_symbols_9_0= RULE_ID )
            	    // InternalPubProto.g:167:6: lv_symbols_9_0= RULE_ID
            	    {
            	    lv_symbols_9_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(lv_symbols_9_0, grammarAccess.getPublicationClassAccess().getSymbolsIDTerminalRuleCall_7_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPublicationClassRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"symbols",
            	    							lv_symbols_9_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getPublicationClassAccess().getSegmentsKeyword_8());
            		
            // InternalPubProto.g:188:3: ( (lv_segments_11_0= ruleProtoDocumentSegment ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21||(LA3_0>=24 && LA3_0<=26)||(LA3_0>=29 && LA3_0<=30)||(LA3_0>=32 && LA3_0<=37)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPubProto.g:189:4: (lv_segments_11_0= ruleProtoDocumentSegment )
            	    {
            	    // InternalPubProto.g:189:4: (lv_segments_11_0= ruleProtoDocumentSegment )
            	    // InternalPubProto.g:190:5: lv_segments_11_0= ruleProtoDocumentSegment
            	    {

            	    					newCompositeNode(grammarAccess.getPublicationClassAccess().getSegmentsProtoDocumentSegmentParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_segments_11_0=ruleProtoDocumentSegment();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getPublicationClassAccess().getDivisionsKeyword_10());
            		
            // InternalPubProto.g:211:3: ( (lv_divisions_13_0= ruleProtoDivision ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=39 && LA4_0<=44)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPubProto.g:212:4: (lv_divisions_13_0= ruleProtoDivision )
            	    {
            	    // InternalPubProto.g:212:4: (lv_divisions_13_0= ruleProtoDivision )
            	    // InternalPubProto.g:213:5: lv_divisions_13_0= ruleProtoDivision
            	    {

            	    					newCompositeNode(grammarAccess.getPublicationClassAccess().getDivisionsProtoDivisionParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_divisions_13_0=ruleProtoDivision();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleProtoDocumentSegment"
    // InternalPubProto.g:234:1: entryRuleProtoDocumentSegment returns [EObject current=null] : iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF ;
    public final EObject entryRuleProtoDocumentSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoDocumentSegment = null;


        try {
            // InternalPubProto.g:234:61: (iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF )
            // InternalPubProto.g:235:2: iv_ruleProtoDocumentSegment= ruleProtoDocumentSegment EOF
            {
             newCompositeNode(grammarAccess.getProtoDocumentSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoDocumentSegment=ruleProtoDocumentSegment();

            state._fsp--;

             current =iv_ruleProtoDocumentSegment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:241:1: ruleProtoDocumentSegment returns [EObject current=null] : (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex ) ;
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
            // InternalPubProto.g:247:2: ( (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex ) )
            // InternalPubProto.g:248:2: (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex )
            {
            // InternalPubProto.g:248:2: (this_ProtoAbstract_0= ruleProtoAbstract | this_ProtoPreface_1= ruleProtoPreface | this_ProtoPublicationBody_2= ruleProtoPublicationBody | this_ProtoEpilogue_3= ruleProtoEpilogue | this_ProtoChangeHistory_4= ruleProtoChangeHistory | this_ProtoTOC_5= ruleProtoTOC | this_ProtoAbbreviations_6= ruleProtoAbbreviations | this_ProtoListOfTables_7= ruleProtoListOfTables | this_ProtoListOfFigures_8= ruleProtoListOfFigures | this_ProtoBibliography_9= ruleProtoBibliography | this_ProtoGlossary_10= ruleProtoGlossary | this_ProtoIndex_11= ruleProtoIndex )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            case 33:
                {
                alt5=8;
                }
                break;
            case 34:
                {
                alt5=9;
                }
                break;
            case 35:
                {
                alt5=10;
                }
                break;
            case 36:
                {
                alt5=11;
                }
                break;
            case 37:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPubProto.g:249:3: this_ProtoAbstract_0= ruleProtoAbstract
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoAbstractParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoAbstract_0=ruleProtoAbstract();

                    state._fsp--;


                    			current = this_ProtoAbstract_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:258:3: this_ProtoPreface_1= ruleProtoPreface
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoPrefaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoPreface_1=ruleProtoPreface();

                    state._fsp--;


                    			current = this_ProtoPreface_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPubProto.g:267:3: this_ProtoPublicationBody_2= ruleProtoPublicationBody
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoPublicationBodyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoPublicationBody_2=ruleProtoPublicationBody();

                    state._fsp--;


                    			current = this_ProtoPublicationBody_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPubProto.g:276:3: this_ProtoEpilogue_3= ruleProtoEpilogue
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoEpilogueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoEpilogue_3=ruleProtoEpilogue();

                    state._fsp--;


                    			current = this_ProtoEpilogue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPubProto.g:285:3: this_ProtoChangeHistory_4= ruleProtoChangeHistory
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoChangeHistoryParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoChangeHistory_4=ruleProtoChangeHistory();

                    state._fsp--;


                    			current = this_ProtoChangeHistory_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPubProto.g:294:3: this_ProtoTOC_5= ruleProtoTOC
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoTOCParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoTOC_5=ruleProtoTOC();

                    state._fsp--;


                    			current = this_ProtoTOC_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPubProto.g:303:3: this_ProtoAbbreviations_6= ruleProtoAbbreviations
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoAbbreviationsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoAbbreviations_6=ruleProtoAbbreviations();

                    state._fsp--;


                    			current = this_ProtoAbbreviations_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPubProto.g:312:3: this_ProtoListOfTables_7= ruleProtoListOfTables
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoListOfTablesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoListOfTables_7=ruleProtoListOfTables();

                    state._fsp--;


                    			current = this_ProtoListOfTables_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPubProto.g:321:3: this_ProtoListOfFigures_8= ruleProtoListOfFigures
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoListOfFiguresParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoListOfFigures_8=ruleProtoListOfFigures();

                    state._fsp--;


                    			current = this_ProtoListOfFigures_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalPubProto.g:330:3: this_ProtoBibliography_9= ruleProtoBibliography
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoBibliographyParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoBibliography_9=ruleProtoBibliography();

                    state._fsp--;


                    			current = this_ProtoBibliography_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalPubProto.g:339:3: this_ProtoGlossary_10= ruleProtoGlossary
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoGlossaryParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoGlossary_10=ruleProtoGlossary();

                    state._fsp--;


                    			current = this_ProtoGlossary_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalPubProto.g:348:3: this_ProtoIndex_11= ruleProtoIndex
                    {

                    			newCompositeNode(grammarAccess.getProtoDocumentSegmentAccess().getProtoIndexParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoIndex_11=ruleProtoIndex();

                    state._fsp--;


                    			current = this_ProtoIndex_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:361:1: ruleSegmentBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? ) ;
    public final EObject ruleSegmentBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token lv_optional_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPubProto.g:367:2: ( ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? ) )
            // InternalPubProto.g:368:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? )
            {
            // InternalPubProto.g:368:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )? )
            // InternalPubProto.g:369:3: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )? (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )?
            {
            // InternalPubProto.g:369:3: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPubProto.g:370:4: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getSegmentBodyAccess().getTitleKeyword_0_0());
                    			
                    // InternalPubProto.g:374:4: ( (lv_title_1_0= RULE_STRING ) )
                    // InternalPubProto.g:375:5: (lv_title_1_0= RULE_STRING )
                    {
                    // InternalPubProto.g:375:5: (lv_title_1_0= RULE_STRING )
                    // InternalPubProto.g:376:6: lv_title_1_0= RULE_STRING
                    {
                    lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_title_1_0, grammarAccess.getSegmentBodyAccess().getTitleSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSegmentBodyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPubProto.g:393:3: (otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPubProto.g:394:4: otherlv_2= 'optional:' ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getSegmentBodyAccess().getOptionalKeyword_1_0());
                    			
                    // InternalPubProto.g:398:4: ( ( (lv_optional_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==20) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPubProto.g:399:5: ( (lv_optional_3_0= 'true' ) )
                            {
                            // InternalPubProto.g:399:5: ( (lv_optional_3_0= 'true' ) )
                            // InternalPubProto.g:400:6: (lv_optional_3_0= 'true' )
                            {
                            // InternalPubProto.g:400:6: (lv_optional_3_0= 'true' )
                            // InternalPubProto.g:401:7: lv_optional_3_0= 'true'
                            {
                            lv_optional_3_0=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(lv_optional_3_0, grammarAccess.getSegmentBodyAccess().getOptionalTrueKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSegmentBodyRule());
                            							}
                            							setWithLastConsumed(current, "optional", true, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:414:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getSegmentBodyAccess().getFalseKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalPubProto.g:424:1: entryRuleProtoAbstract returns [EObject current=null] : iv_ruleProtoAbstract= ruleProtoAbstract EOF ;
    public final EObject entryRuleProtoAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAbstract = null;


        try {
            // InternalPubProto.g:424:54: (iv_ruleProtoAbstract= ruleProtoAbstract EOF )
            // InternalPubProto.g:425:2: iv_ruleProtoAbstract= ruleProtoAbstract EOF
            {
             newCompositeNode(grammarAccess.getProtoAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoAbstract=ruleProtoAbstract();

            state._fsp--;

             current =iv_ruleProtoAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:431:1: ruleProtoAbstract returns [EObject current=null] : ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:437:2: ( ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:438:2: ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:438:2: ( () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:439:3: () otherlv_1= 'Abstract' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:439:3: ()
            // InternalPubProto.g:440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoAbstractAccess().getProtoAbstractAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoAbstractAccess().getAbstractKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoAbstractAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoAbstractRule());
            			}
            			newCompositeNode(grammarAccess.getProtoAbstractAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoAbstractAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:473:1: entryRuleProtoPreface returns [EObject current=null] : iv_ruleProtoPreface= ruleProtoPreface EOF ;
    public final EObject entryRuleProtoPreface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPreface = null;


        try {
            // InternalPubProto.g:473:53: (iv_ruleProtoPreface= ruleProtoPreface EOF )
            // InternalPubProto.g:474:2: iv_ruleProtoPreface= ruleProtoPreface EOF
            {
             newCompositeNode(grammarAccess.getProtoPrefaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoPreface=ruleProtoPreface();

            state._fsp--;

             current =iv_ruleProtoPreface; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:480:1: ruleProtoPreface returns [EObject current=null] : ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoPreface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:486:2: ( ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:487:2: ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:487:2: ( () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:488:3: () otherlv_1= 'Preface' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:488:3: ()
            // InternalPubProto.g:489:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoPrefaceAccess().getProtoPrefaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoPrefaceAccess().getPrefaceKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoPrefaceAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoPrefaceRule());
            			}
            			newCompositeNode(grammarAccess.getProtoPrefaceAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoPrefaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:522:1: entryRuleProtoEpilogue returns [EObject current=null] : iv_ruleProtoEpilogue= ruleProtoEpilogue EOF ;
    public final EObject entryRuleProtoEpilogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoEpilogue = null;


        try {
            // InternalPubProto.g:522:54: (iv_ruleProtoEpilogue= ruleProtoEpilogue EOF )
            // InternalPubProto.g:523:2: iv_ruleProtoEpilogue= ruleProtoEpilogue EOF
            {
             newCompositeNode(grammarAccess.getProtoEpilogueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoEpilogue=ruleProtoEpilogue();

            state._fsp--;

             current =iv_ruleProtoEpilogue; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:529:1: ruleProtoEpilogue returns [EObject current=null] : ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoEpilogue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:535:2: ( ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:536:2: ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:536:2: ( () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:537:3: () otherlv_1= 'Epilogue' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:537:3: ()
            // InternalPubProto.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoEpilogueAccess().getProtoEpilogueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoEpilogueAccess().getEpilogueKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoEpilogueAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoEpilogueRule());
            			}
            			newCompositeNode(grammarAccess.getProtoEpilogueAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoEpilogueAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:571:1: entryRuleProtoPublicationBody returns [EObject current=null] : iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF ;
    public final EObject entryRuleProtoPublicationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPublicationBody = null;


        try {
            // InternalPubProto.g:571:61: (iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF )
            // InternalPubProto.g:572:2: iv_ruleProtoPublicationBody= ruleProtoPublicationBody EOF
            {
             newCompositeNode(grammarAccess.getProtoPublicationBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoPublicationBody=ruleProtoPublicationBody();

            state._fsp--;

             current =iv_ruleProtoPublicationBody; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:578:1: ruleProtoPublicationBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' ) ;
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
            // InternalPubProto.g:584:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' ) )
            // InternalPubProto.g:585:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' )
            {
            // InternalPubProto.g:585:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}' )
            // InternalPubProto.g:586:3: () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )? (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )? otherlv_9= '}'
            {
            // InternalPubProto.g:586:3: ()
            // InternalPubProto.g:587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoPublicationBodyAccess().getProtoPublicationBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoPublicationBodyAccess().getBodyKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoPublicationBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPubProto.g:601:3: (otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPubProto.g:602:4: otherlv_3= 'parts:' ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getProtoPublicationBodyAccess().getPartsKeyword_3_0());
                    			
                    // InternalPubProto.g:606:4: ( ( (lv_allowParts_4_0= 'true' ) ) | otherlv_5= 'false' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==19) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==20) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPubProto.g:607:5: ( (lv_allowParts_4_0= 'true' ) )
                            {
                            // InternalPubProto.g:607:5: ( (lv_allowParts_4_0= 'true' ) )
                            // InternalPubProto.g:608:6: (lv_allowParts_4_0= 'true' )
                            {
                            // InternalPubProto.g:608:6: (lv_allowParts_4_0= 'true' )
                            // InternalPubProto.g:609:7: lv_allowParts_4_0= 'true'
                            {
                            lv_allowParts_4_0=(Token)match(input,19,FOLLOW_18); 

                            							newLeafNode(lv_allowParts_4_0, grammarAccess.getProtoPublicationBodyAccess().getAllowPartsTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getProtoPublicationBodyRule());
                            							}
                            							setWithLastConsumed(current, "allowParts", true, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:622:5: otherlv_5= 'false'
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_18); 

                            					newLeafNode(otherlv_5, grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_3_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPubProto.g:628:3: (otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPubProto.g:629:4: otherlv_6= 'appendix:' ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getProtoPublicationBodyAccess().getAppendixKeyword_4_0());
                    			
                    // InternalPubProto.g:633:4: ( ( (lv_allowAppendix_7_0= 'true' ) ) | otherlv_8= 'false' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==19) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==20) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPubProto.g:634:5: ( (lv_allowAppendix_7_0= 'true' ) )
                            {
                            // InternalPubProto.g:634:5: ( (lv_allowAppendix_7_0= 'true' ) )
                            // InternalPubProto.g:635:6: (lv_allowAppendix_7_0= 'true' )
                            {
                            // InternalPubProto.g:635:6: (lv_allowAppendix_7_0= 'true' )
                            // InternalPubProto.g:636:7: lv_allowAppendix_7_0= 'true'
                            {
                            lv_allowAppendix_7_0=(Token)match(input,19,FOLLOW_16); 

                            							newLeafNode(lv_allowAppendix_7_0, grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixTrueKeyword_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getProtoPublicationBodyRule());
                            							}
                            							setWithLastConsumed(current, "allowAppendix", true, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPubProto.g:649:5: otherlv_8= 'false'
                            {
                            otherlv_8=(Token)match(input,20,FOLLOW_16); 

                            					newLeafNode(otherlv_8, grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_4_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProtoPublicationBodyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:663:1: entryRuleProtoChangeHistory returns [EObject current=null] : iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF ;
    public final EObject entryRuleProtoChangeHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoChangeHistory = null;


        try {
            // InternalPubProto.g:663:59: (iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF )
            // InternalPubProto.g:664:2: iv_ruleProtoChangeHistory= ruleProtoChangeHistory EOF
            {
             newCompositeNode(grammarAccess.getProtoChangeHistoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoChangeHistory=ruleProtoChangeHistory();

            state._fsp--;

             current =iv_ruleProtoChangeHistory; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:670:1: ruleProtoChangeHistory returns [EObject current=null] : ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoChangeHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:676:2: ( ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:677:2: ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:677:2: ( () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:678:3: () otherlv_1= 'ChangeHistory' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:678:3: ()
            // InternalPubProto.g:679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoChangeHistoryAccess().getProtoChangeHistoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoChangeHistoryAccess().getChangeHistoryKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoChangeHistoryAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoChangeHistoryRule());
            			}
            			newCompositeNode(grammarAccess.getProtoChangeHistoryAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoChangeHistoryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:712:1: entryRuleProtoTOC returns [EObject current=null] : iv_ruleProtoTOC= ruleProtoTOC EOF ;
    public final EObject entryRuleProtoTOC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoTOC = null;


        try {
            // InternalPubProto.g:712:49: (iv_ruleProtoTOC= ruleProtoTOC EOF )
            // InternalPubProto.g:713:2: iv_ruleProtoTOC= ruleProtoTOC EOF
            {
             newCompositeNode(grammarAccess.getProtoTOCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoTOC=ruleProtoTOC();

            state._fsp--;

             current =iv_ruleProtoTOC; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:719:1: ruleProtoTOC returns [EObject current=null] : ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_INT ) ) )? otherlv_6= '}' ) ;
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
            // InternalPubProto.g:725:2: ( ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_INT ) ) )? otherlv_6= '}' ) )
            // InternalPubProto.g:726:2: ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            {
            // InternalPubProto.g:726:2: ( () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            // InternalPubProto.g:727:3: () otherlv_1= 'TableOfContents' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_INT ) ) )? otherlv_6= '}'
            {
            // InternalPubProto.g:727:3: ()
            // InternalPubProto.g:728:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoTOCAccess().getProtoTOCAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoTOCAccess().getTableOfContentsKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoTOCAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoTOCRule());
            			}
            			newCompositeNode(grammarAccess.getProtoTOCAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_20);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalPubProto.g:753:3: (otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPubProto.g:754:4: otherlv_4= 'maxLevel:' ( (lv_maxLevel_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getProtoTOCAccess().getMaxLevelKeyword_4_0());
                    			
                    // InternalPubProto.g:758:4: ( (lv_maxLevel_5_0= RULE_INT ) )
                    // InternalPubProto.g:759:5: (lv_maxLevel_5_0= RULE_INT )
                    {
                    // InternalPubProto.g:759:5: (lv_maxLevel_5_0= RULE_INT )
                    // InternalPubProto.g:760:6: lv_maxLevel_5_0= RULE_INT
                    {
                    lv_maxLevel_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    						newLeafNode(lv_maxLevel_5_0, grammarAccess.getProtoTOCAccess().getMaxLevelINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProtoTOCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxLevel",
                    							lv_maxLevel_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProtoTOCAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:785:1: entryRuleProtoAbbreviations returns [EObject current=null] : iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF ;
    public final EObject entryRuleProtoAbbreviations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAbbreviations = null;


        try {
            // InternalPubProto.g:785:59: (iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF )
            // InternalPubProto.g:786:2: iv_ruleProtoAbbreviations= ruleProtoAbbreviations EOF
            {
             newCompositeNode(grammarAccess.getProtoAbbreviationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoAbbreviations=ruleProtoAbbreviations();

            state._fsp--;

             current =iv_ruleProtoAbbreviations; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:792:1: ruleProtoAbbreviations returns [EObject current=null] : ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAbbreviations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:798:2: ( ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:799:2: ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:799:2: ( () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:800:3: () otherlv_1= 'Abbreviations' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:800:3: ()
            // InternalPubProto.g:801:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoAbbreviationsAccess().getProtoAbbreviationsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoAbbreviationsAccess().getAbbreviationsKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoAbbreviationsAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoAbbreviationsRule());
            			}
            			newCompositeNode(grammarAccess.getProtoAbbreviationsAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoAbbreviationsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:834:1: entryRuleProtoListOfTables returns [EObject current=null] : iv_ruleProtoListOfTables= ruleProtoListOfTables EOF ;
    public final EObject entryRuleProtoListOfTables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoListOfTables = null;


        try {
            // InternalPubProto.g:834:58: (iv_ruleProtoListOfTables= ruleProtoListOfTables EOF )
            // InternalPubProto.g:835:2: iv_ruleProtoListOfTables= ruleProtoListOfTables EOF
            {
             newCompositeNode(grammarAccess.getProtoListOfTablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoListOfTables=ruleProtoListOfTables();

            state._fsp--;

             current =iv_ruleProtoListOfTables; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:841:1: ruleProtoListOfTables returns [EObject current=null] : ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoListOfTables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:847:2: ( ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:848:2: ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:848:2: ( () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:849:3: () otherlv_1= 'ListOfTables' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:849:3: ()
            // InternalPubProto.g:850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoListOfTablesAccess().getProtoListOfTablesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoListOfTablesAccess().getListOfTablesKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoListOfTablesAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoListOfTablesRule());
            			}
            			newCompositeNode(grammarAccess.getProtoListOfTablesAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoListOfTablesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:883:1: entryRuleProtoListOfFigures returns [EObject current=null] : iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF ;
    public final EObject entryRuleProtoListOfFigures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoListOfFigures = null;


        try {
            // InternalPubProto.g:883:59: (iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF )
            // InternalPubProto.g:884:2: iv_ruleProtoListOfFigures= ruleProtoListOfFigures EOF
            {
             newCompositeNode(grammarAccess.getProtoListOfFiguresRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoListOfFigures=ruleProtoListOfFigures();

            state._fsp--;

             current =iv_ruleProtoListOfFigures; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:890:1: ruleProtoListOfFigures returns [EObject current=null] : ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoListOfFigures() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:896:2: ( ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:897:2: ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:897:2: ( () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:898:3: () otherlv_1= 'ListOfFigures' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:898:3: ()
            // InternalPubProto.g:899:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoListOfFiguresAccess().getProtoListOfFiguresAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoListOfFiguresAccess().getListOfFiguresKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoListOfFiguresAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoListOfFiguresRule());
            			}
            			newCompositeNode(grammarAccess.getProtoListOfFiguresAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoListOfFiguresAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:932:1: entryRuleProtoBibliography returns [EObject current=null] : iv_ruleProtoBibliography= ruleProtoBibliography EOF ;
    public final EObject entryRuleProtoBibliography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoBibliography = null;


        try {
            // InternalPubProto.g:932:58: (iv_ruleProtoBibliography= ruleProtoBibliography EOF )
            // InternalPubProto.g:933:2: iv_ruleProtoBibliography= ruleProtoBibliography EOF
            {
             newCompositeNode(grammarAccess.getProtoBibliographyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoBibliography=ruleProtoBibliography();

            state._fsp--;

             current =iv_ruleProtoBibliography; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:939:1: ruleProtoBibliography returns [EObject current=null] : ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoBibliography() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:945:2: ( ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:946:2: ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:946:2: ( () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:947:3: () otherlv_1= 'Bibliography' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:947:3: ()
            // InternalPubProto.g:948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoBibliographyAccess().getProtoBibliographyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoBibliographyAccess().getBibliographyKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoBibliographyAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoBibliographyRule());
            			}
            			newCompositeNode(grammarAccess.getProtoBibliographyAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoBibliographyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:981:1: entryRuleProtoGlossary returns [EObject current=null] : iv_ruleProtoGlossary= ruleProtoGlossary EOF ;
    public final EObject entryRuleProtoGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoGlossary = null;


        try {
            // InternalPubProto.g:981:54: (iv_ruleProtoGlossary= ruleProtoGlossary EOF )
            // InternalPubProto.g:982:2: iv_ruleProtoGlossary= ruleProtoGlossary EOF
            {
             newCompositeNode(grammarAccess.getProtoGlossaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoGlossary=ruleProtoGlossary();

            state._fsp--;

             current =iv_ruleProtoGlossary; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:988:1: ruleProtoGlossary returns [EObject current=null] : ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:994:2: ( ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:995:2: ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:995:2: ( () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:996:3: () otherlv_1= 'Glossary' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:996:3: ()
            // InternalPubProto.g:997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoGlossaryAccess().getProtoGlossaryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoGlossaryAccess().getGlossaryKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoGlossaryAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoGlossaryRule());
            			}
            			newCompositeNode(grammarAccess.getProtoGlossaryAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoGlossaryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1030:1: entryRuleProtoIndex returns [EObject current=null] : iv_ruleProtoIndex= ruleProtoIndex EOF ;
    public final EObject entryRuleProtoIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoIndex = null;


        try {
            // InternalPubProto.g:1030:51: (iv_ruleProtoIndex= ruleProtoIndex EOF )
            // InternalPubProto.g:1031:2: iv_ruleProtoIndex= ruleProtoIndex EOF
            {
             newCompositeNode(grammarAccess.getProtoIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoIndex=ruleProtoIndex();

            state._fsp--;

             current =iv_ruleProtoIndex; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:1037:1: ruleProtoIndex returns [EObject current=null] : ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SegmentBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1043:2: ( ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1044:2: ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1044:2: ( () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1045:3: () otherlv_1= 'Index' otherlv_2= '{' this_SegmentBody_3= ruleSegmentBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1045:3: ()
            // InternalPubProto.g:1046:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoIndexAccess().getProtoIndexAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoIndexAccess().getIndexKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoIndexAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoIndexRule());
            			}
            			newCompositeNode(grammarAccess.getProtoIndexAccess().getSegmentBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SegmentBody_3=ruleSegmentBody(current);

            state._fsp--;


            			current = this_SegmentBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoIndexAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1079:1: entryRuleProtoDivision returns [EObject current=null] : iv_ruleProtoDivision= ruleProtoDivision EOF ;
    public final EObject entryRuleProtoDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoDivision = null;


        try {
            // InternalPubProto.g:1079:54: (iv_ruleProtoDivision= ruleProtoDivision EOF )
            // InternalPubProto.g:1080:2: iv_ruleProtoDivision= ruleProtoDivision EOF
            {
             newCompositeNode(grammarAccess.getProtoDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoDivision=ruleProtoDivision();

            state._fsp--;

             current =iv_ruleProtoDivision; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:1086:1: ruleProtoDivision returns [EObject current=null] : (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection ) ;
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
            // InternalPubProto.g:1092:2: ( (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection ) )
            // InternalPubProto.g:1093:2: (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection )
            {
            // InternalPubProto.g:1093:2: (this_ProtoPart_0= ruleProtoPart | this_ProtoAppendix_1= ruleProtoAppendix | this_ProtoChapter_2= ruleProtoChapter | this_ProtoSection_3= ruleProtoSection | this_ProtoSubsection_4= ruleProtoSubsection | this_ProtoSubsubsection_5= ruleProtoSubsubsection )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            case 42:
                {
                alt14=4;
                }
                break;
            case 43:
                {
                alt14=5;
                }
                break;
            case 44:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPubProto.g:1094:3: this_ProtoPart_0= ruleProtoPart
                    {

                    			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoPartParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoPart_0=ruleProtoPart();

                    state._fsp--;


                    			current = this_ProtoPart_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPubProto.g:1103:3: this_ProtoAppendix_1= ruleProtoAppendix
                    {

                    			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoAppendixParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoAppendix_1=ruleProtoAppendix();

                    state._fsp--;


                    			current = this_ProtoAppendix_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPubProto.g:1112:3: this_ProtoChapter_2= ruleProtoChapter
                    {

                    			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoChapterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoChapter_2=ruleProtoChapter();

                    state._fsp--;


                    			current = this_ProtoChapter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPubProto.g:1121:3: this_ProtoSection_3= ruleProtoSection
                    {

                    			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoSectionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoSection_3=ruleProtoSection();

                    state._fsp--;


                    			current = this_ProtoSection_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPubProto.g:1130:3: this_ProtoSubsection_4= ruleProtoSubsection
                    {

                    			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoSubsectionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoSubsection_4=ruleProtoSubsection();

                    state._fsp--;


                    			current = this_ProtoSubsection_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPubProto.g:1139:3: this_ProtoSubsubsection_5= ruleProtoSubsubsection
                    {

                    			newCompositeNode(grammarAccess.getProtoDivisionAccess().getProtoSubsubsectionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtoSubsubsection_5=ruleProtoSubsubsection();

                    state._fsp--;


                    			current = this_ProtoSubsubsection_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1152:1: ruleProtoDivisionBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )? ;
    public final EObject ruleProtoDivisionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Enumerator lv_numberingStyle_1_0 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1158:2: ( (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )? )
            // InternalPubProto.g:1159:2: (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )?
            {
            // InternalPubProto.g:1159:2: (otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPubProto.g:1160:3: otherlv_0= 'numbering:' ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) )
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_22); 

                    			newLeafNode(otherlv_0, grammarAccess.getProtoDivisionBodyAccess().getNumberingKeyword_0());
                    		
                    // InternalPubProto.g:1164:3: ( (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle ) )
                    // InternalPubProto.g:1165:4: (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle )
                    {
                    // InternalPubProto.g:1165:4: (lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle )
                    // InternalPubProto.g:1166:5: lv_numberingStyle_1_0= ruleProtoSequenceNumberStyle
                    {

                    					newCompositeNode(grammarAccess.getProtoDivisionBodyAccess().getNumberingStyleProtoSequenceNumberStyleEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_numberingStyle_1_0=ruleProtoSequenceNumberStyle();

                    state._fsp--;


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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1187:1: entryRuleProtoPart returns [EObject current=null] : iv_ruleProtoPart= ruleProtoPart EOF ;
    public final EObject entryRuleProtoPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoPart = null;


        try {
            // InternalPubProto.g:1187:50: (iv_ruleProtoPart= ruleProtoPart EOF )
            // InternalPubProto.g:1188:2: iv_ruleProtoPart= ruleProtoPart EOF
            {
             newCompositeNode(grammarAccess.getProtoPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoPart=ruleProtoPart();

            state._fsp--;

             current =iv_ruleProtoPart; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:1194:1: ruleProtoPart returns [EObject current=null] : ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1200:2: ( ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1201:2: ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1201:2: ( () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1202:3: () otherlv_1= 'Part' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1202:3: ()
            // InternalPubProto.g:1203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoPartAccess().getProtoPartAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoPartAccess().getPartKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoPartAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoPartRule());
            			}
            			newCompositeNode(grammarAccess.getProtoPartAccess().getProtoDivisionBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;


            			current = this_ProtoDivisionBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoPartAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1236:1: entryRuleProtoAppendix returns [EObject current=null] : iv_ruleProtoAppendix= ruleProtoAppendix EOF ;
    public final EObject entryRuleProtoAppendix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoAppendix = null;


        try {
            // InternalPubProto.g:1236:54: (iv_ruleProtoAppendix= ruleProtoAppendix EOF )
            // InternalPubProto.g:1237:2: iv_ruleProtoAppendix= ruleProtoAppendix EOF
            {
             newCompositeNode(grammarAccess.getProtoAppendixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoAppendix=ruleProtoAppendix();

            state._fsp--;

             current =iv_ruleProtoAppendix; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:1243:1: ruleProtoAppendix returns [EObject current=null] : ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoAppendix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1249:2: ( ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1250:2: ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1250:2: ( () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1251:3: () otherlv_1= 'Appendix' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1251:3: ()
            // InternalPubProto.g:1252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoAppendixAccess().getProtoAppendixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoAppendixAccess().getAppendixKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoAppendixAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoAppendixRule());
            			}
            			newCompositeNode(grammarAccess.getProtoAppendixAccess().getProtoDivisionBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;


            			current = this_ProtoDivisionBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoAppendixAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1285:1: entryRuleProtoChapter returns [EObject current=null] : iv_ruleProtoChapter= ruleProtoChapter EOF ;
    public final EObject entryRuleProtoChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoChapter = null;


        try {
            // InternalPubProto.g:1285:53: (iv_ruleProtoChapter= ruleProtoChapter EOF )
            // InternalPubProto.g:1286:2: iv_ruleProtoChapter= ruleProtoChapter EOF
            {
             newCompositeNode(grammarAccess.getProtoChapterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoChapter=ruleProtoChapter();

            state._fsp--;

             current =iv_ruleProtoChapter; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:1292:1: ruleProtoChapter returns [EObject current=null] : ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1298:2: ( ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1299:2: ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1299:2: ( () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1300:3: () otherlv_1= 'Chapter' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1300:3: ()
            // InternalPubProto.g:1301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoChapterAccess().getProtoChapterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoChapterAccess().getChapterKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoChapterAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoChapterRule());
            			}
            			newCompositeNode(grammarAccess.getProtoChapterAccess().getProtoDivisionBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;


            			current = this_ProtoDivisionBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoChapterAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1334:1: entryRuleProtoSection returns [EObject current=null] : iv_ruleProtoSection= ruleProtoSection EOF ;
    public final EObject entryRuleProtoSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSection = null;


        try {
            // InternalPubProto.g:1334:53: (iv_ruleProtoSection= ruleProtoSection EOF )
            // InternalPubProto.g:1335:2: iv_ruleProtoSection= ruleProtoSection EOF
            {
             newCompositeNode(grammarAccess.getProtoSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoSection=ruleProtoSection();

            state._fsp--;

             current =iv_ruleProtoSection; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:1341:1: ruleProtoSection returns [EObject current=null] : ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1347:2: ( ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1348:2: ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1348:2: ( () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1349:3: () otherlv_1= 'Section' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1349:3: ()
            // InternalPubProto.g:1350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoSectionAccess().getProtoSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoSectionAccess().getSectionKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoSectionAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoSectionRule());
            			}
            			newCompositeNode(grammarAccess.getProtoSectionAccess().getProtoDivisionBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;


            			current = this_ProtoDivisionBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoSectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1383:1: entryRuleProtoSubsection returns [EObject current=null] : iv_ruleProtoSubsection= ruleProtoSubsection EOF ;
    public final EObject entryRuleProtoSubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSubsection = null;


        try {
            // InternalPubProto.g:1383:56: (iv_ruleProtoSubsection= ruleProtoSubsection EOF )
            // InternalPubProto.g:1384:2: iv_ruleProtoSubsection= ruleProtoSubsection EOF
            {
             newCompositeNode(grammarAccess.getProtoSubsectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoSubsection=ruleProtoSubsection();

            state._fsp--;

             current =iv_ruleProtoSubsection; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:1390:1: ruleProtoSubsection returns [EObject current=null] : ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1396:2: ( ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1397:2: ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1397:2: ( () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1398:3: () otherlv_1= 'Sub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1398:3: ()
            // InternalPubProto.g:1399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoSubsectionAccess().getProtoSubsectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoSubsectionAccess().getSubKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoSubsectionAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoSubsectionRule());
            			}
            			newCompositeNode(grammarAccess.getProtoSubsectionAccess().getProtoDivisionBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;


            			current = this_ProtoDivisionBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoSubsectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1432:1: entryRuleProtoSubsubsection returns [EObject current=null] : iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF ;
    public final EObject entryRuleProtoSubsubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtoSubsubsection = null;


        try {
            // InternalPubProto.g:1432:59: (iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF )
            // InternalPubProto.g:1433:2: iv_ruleProtoSubsubsection= ruleProtoSubsubsection EOF
            {
             newCompositeNode(grammarAccess.getProtoSubsubsectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtoSubsubsection=ruleProtoSubsubsection();

            state._fsp--;

             current =iv_ruleProtoSubsubsection; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalPubProto.g:1439:1: ruleProtoSubsubsection returns [EObject current=null] : ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) ;
    public final EObject ruleProtoSubsubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ProtoDivisionBody_3 = null;



        	enterRule();

        try {
            // InternalPubProto.g:1445:2: ( ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' ) )
            // InternalPubProto.g:1446:2: ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            {
            // InternalPubProto.g:1446:2: ( () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}' )
            // InternalPubProto.g:1447:3: () otherlv_1= 'Subsub' otherlv_2= '{' this_ProtoDivisionBody_3= ruleProtoDivisionBody[$current] otherlv_4= '}'
            {
            // InternalPubProto.g:1447:3: ()
            // InternalPubProto.g:1448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtoSubsubsectionAccess().getProtoSubsubsectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProtoSubsubsectionAccess().getSubsubKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getProtoSubsubsectionAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getProtoSubsubsectionRule());
            			}
            			newCompositeNode(grammarAccess.getProtoSubsubsectionAccess().getProtoDivisionBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_ProtoDivisionBody_3=ruleProtoDivisionBody(current);

            state._fsp--;


            			current = this_ProtoDivisionBody_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtoSubsubsectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "rulePublicationNature"
    // InternalPubProto.g:1481:1: rulePublicationNature returns [Enumerator current=null] : ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) ) ;
    public final Enumerator rulePublicationNature() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPubProto.g:1487:2: ( ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) ) )
            // InternalPubProto.g:1488:2: ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) )
            {
            // InternalPubProto.g:1488:2: ( (enumLiteral_0= 'Print' ) | (enumLiteral_1= 'Web' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            else if ( (LA16_0==46) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPubProto.g:1489:3: (enumLiteral_0= 'Print' )
                    {
                    // InternalPubProto.g:1489:3: (enumLiteral_0= 'Print' )
                    // InternalPubProto.g:1490:4: enumLiteral_0= 'Print'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:1497:3: (enumLiteral_1= 'Web' )
                    {
                    // InternalPubProto.g:1497:3: (enumLiteral_1= 'Web' )
                    // InternalPubProto.g:1498:4: enumLiteral_1= 'Web'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPublicationNatureAccess().getWebEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPublicationNatureAccess().getWebEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalPubProto.g:1508:1: ruleProtoSequenceNumberStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) ) ;
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
            // InternalPubProto.g:1514:2: ( ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) ) )
            // InternalPubProto.g:1515:2: ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) )
            {
            // InternalPubProto.g:1515:2: ( (enumLiteral_0= 'arabic' ) | (enumLiteral_1= 'capitalLetter' ) | (enumLiteral_2= 'smallLetter' ) | (enumLiteral_3= 'capitalRoman' ) | (enumLiteral_4= 'smallRoman' ) | (enumLiteral_5= 'none' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt17=1;
                }
                break;
            case 48:
                {
                alt17=2;
                }
                break;
            case 49:
                {
                alt17=3;
                }
                break;
            case 50:
                {
                alt17=4;
                }
                break;
            case 51:
                {
                alt17=5;
                }
                break;
            case 52:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPubProto.g:1516:3: (enumLiteral_0= 'arabic' )
                    {
                    // InternalPubProto.g:1516:3: (enumLiteral_0= 'arabic' )
                    // InternalPubProto.g:1517:4: enumLiteral_0= 'arabic'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:1524:3: (enumLiteral_1= 'capitalLetter' )
                    {
                    // InternalPubProto.g:1524:3: (enumLiteral_1= 'capitalLetter' )
                    // InternalPubProto.g:1525:4: enumLiteral_1= 'capitalLetter'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:1532:3: (enumLiteral_2= 'smallLetter' )
                    {
                    // InternalPubProto.g:1532:3: (enumLiteral_2= 'smallLetter' )
                    // InternalPubProto.g:1533:4: enumLiteral_2= 'smallLetter'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:1540:3: (enumLiteral_3= 'capitalRoman' )
                    {
                    // InternalPubProto.g:1540:3: (enumLiteral_3= 'capitalRoman' )
                    // InternalPubProto.g:1541:4: enumLiteral_3= 'capitalRoman'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:1548:3: (enumLiteral_4= 'smallRoman' )
                    {
                    // InternalPubProto.g:1548:3: (enumLiteral_4= 'smallRoman' )
                    // InternalPubProto.g:1549:4: enumLiteral_4= 'smallRoman'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:1556:3: (enumLiteral_5= 'none' )
                    {
                    // InternalPubProto.g:1556:3: (enumLiteral_5= 'none' )
                    // InternalPubProto.g:1557:4: enumLiteral_5= 'none'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getProtoSequenceNumberStyleAccess().getNoneEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getProtoSequenceNumberStyleAccess().getNoneEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003F67220000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00001F8000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000842000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080842000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000800000L});

}