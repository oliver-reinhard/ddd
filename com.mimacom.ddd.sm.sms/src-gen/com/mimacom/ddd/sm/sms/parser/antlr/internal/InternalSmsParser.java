package com.mimacom.ddd.sm.sms.parser.antlr.internal;

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
import com.mimacom.ddd.sm.sms.services.SmsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'import'", "'name'", "'='", "'extends'", "'and'", "'type'", "'grab'", "'aggregate'", "'{'", "'}'", "'constraint'", "':'", "'primitive'", "'redefines'", "'realizes'", "'realises'", "'archetype'", "'enumeration'", "','", "'ditch'", "'abstract'", "'root'", "'morph'", "'fuse'", "'detail'", "'reference'", "'composite'", "'derived'", "'key'", "'query'", "'('", "'*'", "')'", "'returns'", "'.*'", "'.'", "'..'", "'inverse'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalSmsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSms.g"; }



     	private SmsGrammarAccess grammarAccess;

        public InternalSmsParser(TokenStream input, SmsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SDomain";
       	}

       	@Override
       	protected SmsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSDomain"
    // InternalSms.g:65:1: entryRuleSDomain returns [EObject current=null] : iv_ruleSDomain= ruleSDomain EOF ;
    public final EObject entryRuleSDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDomain = null;


        try {
            // InternalSms.g:65:48: (iv_ruleSDomain= ruleSDomain EOF )
            // InternalSms.g:66:2: iv_ruleSDomain= ruleSDomain EOF
            {
             newCompositeNode(grammarAccess.getSDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDomain=ruleSDomain();

            state._fsp--;

             current =iv_ruleSDomain; 
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
    // $ANTLR end "entryRuleSDomain"


    // $ANTLR start "ruleSDomain"
    // InternalSms.g:72:1: ruleSDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )* ) ;
    public final EObject ruleSDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_aggregates_4_0 = null;



        	enterRule();

        try {
            // InternalSms.g:78:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )* ) )
            // InternalSms.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )* )
            {
            // InternalSms.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )* )
            // InternalSms.g:80:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSDomainAccess().getDomainKeyword_0());
            		
            // InternalSms.g:84:3: ( (lv_name_1_0= ruleSQualifiedName ) )
            // InternalSms.g:85:4: (lv_name_1_0= ruleSQualifiedName )
            {
            // InternalSms.g:85:4: (lv_name_1_0= ruleSQualifiedName )
            // InternalSms.g:86:5: lv_name_1_0= ruleSQualifiedName
            {

            					newCompositeNode(grammarAccess.getSDomainAccess().getNameSQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleSQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSDomainRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.mimacom.ddd.sm.sms.Sms.SQualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSms.g:103:3: ( (lv_imports_2_0= ruleSImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSms.g:104:4: (lv_imports_2_0= ruleSImport )
            	    {
            	    // InternalSms.g:104:4: (lv_imports_2_0= ruleSImport )
            	    // InternalSms.g:105:5: lv_imports_2_0= ruleSImport
            	    {

            	    					newCompositeNode(grammarAccess.getSDomainAccess().getImportsSImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleSImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"com.mimacom.ddd.sm.sms.Sms.SImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSms.g:122:3: ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )*
            loop2:
            do {
                int alt2=3;
                switch ( input.LA(1) ) {
                case 24:
                case 28:
                case 29:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    {
                    alt2=1;
                    }
                    break;
                case 18:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==29||(LA2_3>=32 && LA2_3<=33)||LA2_3==36) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==19) ) {
                        alt2=2;
                    }


                    }
                    break;
                case 19:
                    {
                    alt2=2;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalSms.g:123:4: ( (lv_types_3_0= ruleSType ) )
            	    {
            	    // InternalSms.g:123:4: ( (lv_types_3_0= ruleSType ) )
            	    // InternalSms.g:124:5: (lv_types_3_0= ruleSType )
            	    {
            	    // InternalSms.g:124:5: (lv_types_3_0= ruleSType )
            	    // InternalSms.g:125:6: lv_types_3_0= ruleSType
            	    {

            	    						newCompositeNode(grammarAccess.getSDomainAccess().getTypesSTypeParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleSType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSDomainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"com.mimacom.ddd.sm.sms.Sms.SType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSms.g:143:4: ( (lv_aggregates_4_0= ruleSAggregate ) )
            	    {
            	    // InternalSms.g:143:4: ( (lv_aggregates_4_0= ruleSAggregate ) )
            	    // InternalSms.g:144:5: (lv_aggregates_4_0= ruleSAggregate )
            	    {
            	    // InternalSms.g:144:5: (lv_aggregates_4_0= ruleSAggregate )
            	    // InternalSms.g:145:6: lv_aggregates_4_0= ruleSAggregate
            	    {

            	    						newCompositeNode(grammarAccess.getSDomainAccess().getAggregatesSAggregateParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_aggregates_4_0=ruleSAggregate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSDomainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aggregates",
            	    							lv_aggregates_4_0,
            	    							"com.mimacom.ddd.sm.sms.Sms.SAggregate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSDomain"


    // $ANTLR start "entryRuleSImport"
    // InternalSms.g:167:1: entryRuleSImport returns [EObject current=null] : iv_ruleSImport= ruleSImport EOF ;
    public final EObject entryRuleSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSImport = null;


        try {
            // InternalSms.g:167:48: (iv_ruleSImport= ruleSImport EOF )
            // InternalSms.g:168:2: iv_ruleSImport= ruleSImport EOF
            {
             newCompositeNode(grammarAccess.getSImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSImport=ruleSImport();

            state._fsp--;

             current =iv_ruleSImport; 
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
    // $ANTLR end "entryRuleSImport"


    // $ANTLR start "ruleSImport"
    // InternalSms.g:174:1: ruleSImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalSms.g:180:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) ) )
            // InternalSms.g:181:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) )
            {
            // InternalSms.g:181:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) )
            // InternalSms.g:182:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSImportAccess().getImportKeyword_0());
            		
            // InternalSms.g:186:3: ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) )
            // InternalSms.g:187:4: (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard )
            {
            // InternalSms.g:187:4: (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard )
            // InternalSms.g:188:5: lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getSImportAccess().getImportedNamespaceSQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleSQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"com.mimacom.ddd.sm.sms.Sms.SQualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleSImport"


    // $ANTLR start "entryRuleSGrabAggregateRule"
    // InternalSms.g:209:1: entryRuleSGrabAggregateRule returns [EObject current=null] : iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF ;
    public final EObject entryRuleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabAggregateRule = null;


        try {
            // InternalSms.g:209:59: (iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF )
            // InternalSms.g:210:2: iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF
            {
             newCompositeNode(grammarAccess.getSGrabAggregateRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSGrabAggregateRule=ruleSGrabAggregateRule();

            state._fsp--;

             current =iv_ruleSGrabAggregateRule; 
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
    // $ANTLR end "entryRuleSGrabAggregateRule"


    // $ANTLR start "ruleSGrabAggregateRule"
    // InternalSms.g:216:1: ruleSGrabAggregateRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSms.g:222:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSms.g:223:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSms.g:223:2: ( (otherlv_0= RULE_ID ) )
            // InternalSms.g:224:3: (otherlv_0= RULE_ID )
            {
            // InternalSms.g:224:3: (otherlv_0= RULE_ID )
            // InternalSms.g:225:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSGrabAggregateRuleRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0());
            			

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
    // $ANTLR end "ruleSGrabAggregateRule"


    // $ANTLR start "entryRuleSGrabEnumerationRule"
    // InternalSms.g:239:1: entryRuleSGrabEnumerationRule returns [EObject current=null] : iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF ;
    public final EObject entryRuleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationRule = null;


        try {
            // InternalSms.g:239:61: (iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF )
            // InternalSms.g:240:2: iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF
            {
             newCompositeNode(grammarAccess.getSGrabEnumerationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSGrabEnumerationRule=ruleSGrabEnumerationRule();

            state._fsp--;

             current =iv_ruleSGrabEnumerationRule; 
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
    // $ANTLR end "entryRuleSGrabEnumerationRule"


    // $ANTLR start "ruleSGrabEnumerationRule"
    // InternalSms.g:246:1: ruleSGrabEnumerationRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_renameTo_3_0=null;


        	enterRule();

        try {
            // InternalSms.g:252:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? ) )
            // InternalSms.g:253:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? )
            {
            // InternalSms.g:253:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? )
            // InternalSms.g:254:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            {
            // InternalSms.g:254:3: ( ( ruleSQualifiedName ) )
            // InternalSms.g:255:4: ( ruleSQualifiedName )
            {
            // InternalSms.g:255:4: ( ruleSQualifiedName )
            // InternalSms.g:256:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabEnumerationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0());
            				
            pushFollow(FOLLOW_6);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSms.g:270:3: (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSms.g:271:4: otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationRuleAccess().getNameKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSGrabEnumerationRuleAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalSms.g:279:4: ( (lv_renameTo_3_0= RULE_ID ) )
                    // InternalSms.g:280:5: (lv_renameTo_3_0= RULE_ID )
                    {
                    // InternalSms.g:280:5: (lv_renameTo_3_0= RULE_ID )
                    // InternalSms.g:281:6: lv_renameTo_3_0= RULE_ID
                    {
                    lv_renameTo_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_3_0, grammarAccess.getSGrabEnumerationRuleAccess().getRenameToIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabEnumerationRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleSGrabEnumerationRule"


    // $ANTLR start "entryRuleSGrabEnumerationLiteralRule"
    // InternalSms.g:302:1: entryRuleSGrabEnumerationLiteralRule returns [EObject current=null] : iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF ;
    public final EObject entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationLiteralRule = null;


        try {
            // InternalSms.g:302:68: (iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF )
            // InternalSms.g:303:2: iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF
            {
             newCompositeNode(grammarAccess.getSGrabEnumerationLiteralRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSGrabEnumerationLiteralRule=ruleSGrabEnumerationLiteralRule();

            state._fsp--;

             current =iv_ruleSGrabEnumerationLiteralRule; 
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
    // $ANTLR end "entryRuleSGrabEnumerationLiteralRule"


    // $ANTLR start "ruleSGrabEnumerationLiteralRule"
    // InternalSms.g:309:1: ruleSGrabEnumerationLiteralRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_renameTo_3_0=null;


        	enterRule();

        try {
            // InternalSms.g:315:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? ) )
            // InternalSms.g:316:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? )
            {
            // InternalSms.g:316:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? )
            // InternalSms.g:317:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            {
            // InternalSms.g:317:3: ( (otherlv_0= RULE_ID ) )
            // InternalSms.g:318:4: (otherlv_0= RULE_ID )
            {
            // InternalSms.g:318:4: (otherlv_0= RULE_ID )
            // InternalSms.g:319:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabEnumerationLiteralRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0());
            				

            }


            }

            // InternalSms.g:330:3: (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSms.g:331:4: otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getNameKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalSms.g:339:4: ( (lv_renameTo_3_0= RULE_ID ) )
                    // InternalSms.g:340:5: (lv_renameTo_3_0= RULE_ID )
                    {
                    // InternalSms.g:340:5: (lv_renameTo_3_0= RULE_ID )
                    // InternalSms.g:341:6: lv_renameTo_3_0= RULE_ID
                    {
                    lv_renameTo_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_3_0, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabEnumerationLiteralRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleSGrabEnumerationLiteralRule"


    // $ANTLR start "entryRuleSDitchEnumerationLiteralRule"
    // InternalSms.g:362:1: entryRuleSDitchEnumerationLiteralRule returns [EObject current=null] : iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF ;
    public final EObject entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationLiteralRule = null;


        try {
            // InternalSms.g:362:69: (iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF )
            // InternalSms.g:363:2: iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF
            {
             newCompositeNode(grammarAccess.getSDitchEnumerationLiteralRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDitchEnumerationLiteralRule=ruleSDitchEnumerationLiteralRule();

            state._fsp--;

             current =iv_ruleSDitchEnumerationLiteralRule; 
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
    // $ANTLR end "entryRuleSDitchEnumerationLiteralRule"


    // $ANTLR start "ruleSDitchEnumerationLiteralRule"
    // InternalSms.g:369:1: ruleSDitchEnumerationLiteralRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSms.g:375:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSms.g:376:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSms.g:376:2: ( (otherlv_0= RULE_ID ) )
            // InternalSms.g:377:3: (otherlv_0= RULE_ID )
            {
            // InternalSms.g:377:3: (otherlv_0= RULE_ID )
            // InternalSms.g:378:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSDitchEnumerationLiteralRuleRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0());
            			

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
    // $ANTLR end "ruleSDitchEnumerationLiteralRule"


    // $ANTLR start "entryRuleSGrabComplexTypeRule"
    // InternalSms.g:392:1: entryRuleSGrabComplexTypeRule returns [EObject current=null] : iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF ;
    public final EObject entryRuleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabComplexTypeRule = null;


        try {
            // InternalSms.g:392:61: (iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF )
            // InternalSms.g:393:2: iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF
            {
             newCompositeNode(grammarAccess.getSGrabComplexTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSGrabComplexTypeRule=ruleSGrabComplexTypeRule();

            state._fsp--;

             current =iv_ruleSGrabComplexTypeRule; 
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
    // $ANTLR end "entryRuleSGrabComplexTypeRule"


    // $ANTLR start "ruleSGrabComplexTypeRule"
    // InternalSms.g:399:1: ruleSGrabComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_renameTo_3_0=null;


        	enterRule();

        try {
            // InternalSms.g:405:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? ) )
            // InternalSms.g:406:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? )
            {
            // InternalSms.g:406:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? )
            // InternalSms.g:407:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            {
            // InternalSms.g:407:3: ( ( ruleSQualifiedName ) )
            // InternalSms.g:408:4: ( ruleSQualifiedName )
            {
            // InternalSms.g:408:4: ( ruleSQualifiedName )
            // InternalSms.g:409:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_6);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSms.g:423:3: (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSms.g:424:4: otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabComplexTypeRuleAccess().getNameKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSGrabComplexTypeRuleAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalSms.g:432:4: ( (lv_renameTo_3_0= RULE_ID ) )
                    // InternalSms.g:433:5: (lv_renameTo_3_0= RULE_ID )
                    {
                    // InternalSms.g:433:5: (lv_renameTo_3_0= RULE_ID )
                    // InternalSms.g:434:6: lv_renameTo_3_0= RULE_ID
                    {
                    lv_renameTo_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_3_0, grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabComplexTypeRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleSGrabComplexTypeRule"


    // $ANTLR start "entryRuleSMorphComplexTypeRule"
    // InternalSms.g:455:1: entryRuleSMorphComplexTypeRule returns [EObject current=null] : iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF ;
    public final EObject entryRuleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphComplexTypeRule = null;


        try {
            // InternalSms.g:455:62: (iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF )
            // InternalSms.g:456:2: iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF
            {
             newCompositeNode(grammarAccess.getSMorphComplexTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMorphComplexTypeRule=ruleSMorphComplexTypeRule();

            state._fsp--;

             current =iv_ruleSMorphComplexTypeRule; 
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
    // $ANTLR end "entryRuleSMorphComplexTypeRule"


    // $ANTLR start "ruleSMorphComplexTypeRule"
    // InternalSms.g:462:1: ruleSMorphComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'extends' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? ) ;
    public final EObject ruleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_renameTo_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSms.g:468:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'extends' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalSms.g:469:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'extends' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalSms.g:469:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'extends' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalSms.g:470:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'extends' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )?
            {
            // InternalSms.g:470:3: ( ( ruleSQualifiedName ) )
            // InternalSms.g:471:4: ( ruleSQualifiedName )
            {
            // InternalSms.g:471:4: ( ruleSQualifiedName )
            // InternalSms.g:472:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_8);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSms.g:486:3: (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSms.g:487:4: otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSMorphComplexTypeRuleAccess().getNameKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalSms.g:495:4: ( (lv_renameTo_3_0= RULE_ID ) )
                    // InternalSms.g:496:5: (lv_renameTo_3_0= RULE_ID )
                    {
                    // InternalSms.g:496:5: (lv_renameTo_3_0= RULE_ID )
                    // InternalSms.g:497:6: lv_renameTo_3_0= RULE_ID
                    {
                    lv_renameTo_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_renameTo_3_0, grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSms.g:514:3: (otherlv_4= 'extends' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSms.g:515:4: otherlv_4= 'extends' otherlv_5= '=' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getSMorphComplexTypeRuleAccess().getExtendsKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalSms.g:523:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSms.g:524:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSms.g:524:5: (otherlv_6= RULE_ID )
                    // InternalSms.g:525:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeCrossReference_2_2_0());
                    					

                    }


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
    // $ANTLR end "ruleSMorphComplexTypeRule"


    // $ANTLR start "entryRuleSFuseComplexTypeRule"
    // InternalSms.g:541:1: entryRuleSFuseComplexTypeRule returns [EObject current=null] : iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF ;
    public final EObject entryRuleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFuseComplexTypeRule = null;


        try {
            // InternalSms.g:541:61: (iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF )
            // InternalSms.g:542:2: iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF
            {
             newCompositeNode(grammarAccess.getSFuseComplexTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSFuseComplexTypeRule=ruleSFuseComplexTypeRule();

            state._fsp--;

             current =iv_ruleSFuseComplexTypeRule; 
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
    // $ANTLR end "entryRuleSFuseComplexTypeRule"


    // $ANTLR start "ruleSFuseComplexTypeRule"
    // InternalSms.g:548:1: ruleSFuseComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'name' otherlv_4= '=' ( (lv_renameTo_5_0= RULE_ID ) ) )? (otherlv_6= 'extends' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) )? ) ;
    public final EObject ruleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_renameTo_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSms.g:554:2: ( ( ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'name' otherlv_4= '=' ( (lv_renameTo_5_0= RULE_ID ) ) )? (otherlv_6= 'extends' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) )? ) )
            // InternalSms.g:555:2: ( ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'name' otherlv_4= '=' ( (lv_renameTo_5_0= RULE_ID ) ) )? (otherlv_6= 'extends' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // InternalSms.g:555:2: ( ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'name' otherlv_4= '=' ( (lv_renameTo_5_0= RULE_ID ) ) )? (otherlv_6= 'extends' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) )? )
            // InternalSms.g:556:3: ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'name' otherlv_4= '=' ( (lv_renameTo_5_0= RULE_ID ) ) )? (otherlv_6= 'extends' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) )?
            {
            // InternalSms.g:556:3: ( ( ruleSQualifiedName ) )
            // InternalSms.g:557:4: ( ruleSQualifiedName )
            {
            // InternalSms.g:557:4: ( ruleSQualifiedName )
            // InternalSms.g:558:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_10);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1());
            		
            // InternalSms.g:576:3: ( ( ruleSQualifiedName ) )
            // InternalSms.g:577:4: ( ruleSQualifiedName )
            {
            // InternalSms.g:577:4: ( ruleSQualifiedName )
            // InternalSms.g:578:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_8);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSms.g:592:3: (otherlv_3= 'name' otherlv_4= '=' ( (lv_renameTo_5_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSms.g:593:4: otherlv_3= 'name' otherlv_4= '=' ( (lv_renameTo_5_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getSFuseComplexTypeRuleAccess().getNameKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSFuseComplexTypeRuleAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalSms.g:601:4: ( (lv_renameTo_5_0= RULE_ID ) )
                    // InternalSms.g:602:5: (lv_renameTo_5_0= RULE_ID )
                    {
                    // InternalSms.g:602:5: (lv_renameTo_5_0= RULE_ID )
                    // InternalSms.g:603:6: lv_renameTo_5_0= RULE_ID
                    {
                    lv_renameTo_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_renameTo_5_0, grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSms.g:620:3: (otherlv_6= 'extends' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSms.g:621:4: otherlv_6= 'extends' otherlv_7= '=' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSFuseComplexTypeRuleAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalSms.g:629:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSms.g:630:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSms.g:630:5: (otherlv_8= RULE_ID )
                    // InternalSms.g:631:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_4_2_0());
                    					

                    }


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
    // $ANTLR end "ruleSFuseComplexTypeRule"


    // $ANTLR start "entryRuleSGrabFeatureRule"
    // InternalSms.g:647:1: entryRuleSGrabFeatureRule returns [EObject current=null] : iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF ;
    public final EObject entryRuleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabFeatureRule = null;


        try {
            // InternalSms.g:647:57: (iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF )
            // InternalSms.g:648:2: iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF
            {
             newCompositeNode(grammarAccess.getSGrabFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSGrabFeatureRule=ruleSGrabFeatureRule();

            state._fsp--;

             current =iv_ruleSGrabFeatureRule; 
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
    // $ANTLR end "entryRuleSGrabFeatureRule"


    // $ANTLR start "ruleSGrabFeatureRule"
    // InternalSms.g:654:1: ruleSGrabFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_renameTo_3_0=null;


        	enterRule();

        try {
            // InternalSms.g:660:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? ) )
            // InternalSms.g:661:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? )
            {
            // InternalSms.g:661:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? )
            // InternalSms.g:662:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            {
            // InternalSms.g:662:3: ( (otherlv_0= RULE_ID ) )
            // InternalSms.g:663:4: (otherlv_0= RULE_ID )
            {
            // InternalSms.g:663:4: (otherlv_0= RULE_ID )
            // InternalSms.g:664:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
            				

            }


            }

            // InternalSms.g:675:3: (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSms.g:676:4: otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabFeatureRuleAccess().getNameKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSGrabFeatureRuleAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalSms.g:684:4: ( (lv_renameTo_3_0= RULE_ID ) )
                    // InternalSms.g:685:5: (lv_renameTo_3_0= RULE_ID )
                    {
                    // InternalSms.g:685:5: (lv_renameTo_3_0= RULE_ID )
                    // InternalSms.g:686:6: lv_renameTo_3_0= RULE_ID
                    {
                    lv_renameTo_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_3_0, grammarAccess.getSGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleSGrabFeatureRule"


    // $ANTLR start "entryRuleSMorphFeatureRule"
    // InternalSms.g:707:1: entryRuleSMorphFeatureRule returns [EObject current=null] : iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF ;
    public final EObject entryRuleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphFeatureRule = null;


        try {
            // InternalSms.g:707:58: (iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF )
            // InternalSms.g:708:2: iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF
            {
             newCompositeNode(grammarAccess.getSMorphFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMorphFeatureRule=ruleSMorphFeatureRule();

            state._fsp--;

             current =iv_ruleSMorphFeatureRule; 
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
    // $ANTLR end "entryRuleSMorphFeatureRule"


    // $ANTLR start "ruleSMorphFeatureRule"
    // InternalSms.g:714:1: ruleSMorphFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'type' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) ( (lv_remultiplyTo_7_0= ruleSMultiplicity ) )? )? ) ;
    public final EObject ruleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_renameTo_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_remultiplyTo_7_0 = null;



        	enterRule();

        try {
            // InternalSms.g:720:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'type' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) ( (lv_remultiplyTo_7_0= ruleSMultiplicity ) )? )? ) )
            // InternalSms.g:721:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'type' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) ( (lv_remultiplyTo_7_0= ruleSMultiplicity ) )? )? )
            {
            // InternalSms.g:721:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'type' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) ( (lv_remultiplyTo_7_0= ruleSMultiplicity ) )? )? )
            // InternalSms.g:722:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )? (otherlv_4= 'type' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) ( (lv_remultiplyTo_7_0= ruleSMultiplicity ) )? )?
            {
            // InternalSms.g:722:3: ( (otherlv_0= RULE_ID ) )
            // InternalSms.g:723:4: (otherlv_0= RULE_ID )
            {
            // InternalSms.g:723:4: (otherlv_0= RULE_ID )
            // InternalSms.g:724:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
            				

            }


            }

            // InternalSms.g:735:3: (otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSms.g:736:4: otherlv_1= 'name' otherlv_2= '=' ( (lv_renameTo_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSMorphFeatureRuleAccess().getNameKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSMorphFeatureRuleAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalSms.g:744:4: ( (lv_renameTo_3_0= RULE_ID ) )
                    // InternalSms.g:745:5: (lv_renameTo_3_0= RULE_ID )
                    {
                    // InternalSms.g:745:5: (lv_renameTo_3_0= RULE_ID )
                    // InternalSms.g:746:6: lv_renameTo_3_0= RULE_ID
                    {
                    lv_renameTo_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_renameTo_3_0, grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSms.g:763:3: (otherlv_4= 'type' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) ( (lv_remultiplyTo_7_0= ruleSMultiplicity ) )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSms.g:764:4: otherlv_4= 'type' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) ( (lv_remultiplyTo_7_0= ruleSMultiplicity ) )?
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getSMorphFeatureRuleAccess().getTypeKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSMorphFeatureRuleAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalSms.g:772:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSms.g:773:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSms.g:773:5: (otherlv_6= RULE_ID )
                    // InternalSms.g:774:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_2_0());
                    					

                    }


                    }

                    // InternalSms.g:785:4: ( (lv_remultiplyTo_7_0= ruleSMultiplicity ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==42) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==RULE_INT) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSms.g:786:5: (lv_remultiplyTo_7_0= ruleSMultiplicity )
                            {
                            // InternalSms.g:786:5: (lv_remultiplyTo_7_0= ruleSMultiplicity )
                            // InternalSms.g:787:6: lv_remultiplyTo_7_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_remultiplyTo_7_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSMorphFeatureRuleRule());
                            						}
                            						set(
                            							current,
                            							"remultiplyTo",
                            							lv_remultiplyTo_7_0,
                            							"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


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
    // $ANTLR end "ruleSMorphFeatureRule"


    // $ANTLR start "entryRuleSDitchFeatureRule"
    // InternalSms.g:809:1: entryRuleSDitchFeatureRule returns [EObject current=null] : iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF ;
    public final EObject entryRuleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchFeatureRule = null;


        try {
            // InternalSms.g:809:58: (iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF )
            // InternalSms.g:810:2: iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF
            {
             newCompositeNode(grammarAccess.getSDitchFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDitchFeatureRule=ruleSDitchFeatureRule();

            state._fsp--;

             current =iv_ruleSDitchFeatureRule; 
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
    // $ANTLR end "entryRuleSDitchFeatureRule"


    // $ANTLR start "ruleSDitchFeatureRule"
    // InternalSms.g:816:1: ruleSDitchFeatureRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSms.g:822:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSms.g:823:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSms.g:823:2: ( (otherlv_0= RULE_ID ) )
            // InternalSms.g:824:3: (otherlv_0= RULE_ID )
            {
            // InternalSms.g:824:3: (otherlv_0= RULE_ID )
            // InternalSms.g:825:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSDitchFeatureRuleRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0());
            			

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
    // $ANTLR end "ruleSDitchFeatureRule"


    // $ANTLR start "entryRuleSAggregate"
    // InternalSms.g:839:1: entryRuleSAggregate returns [EObject current=null] : iv_ruleSAggregate= ruleSAggregate EOF ;
    public final EObject entryRuleSAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAggregate = null;


        try {
            // InternalSms.g:839:51: (iv_ruleSAggregate= ruleSAggregate EOF )
            // InternalSms.g:840:2: iv_ruleSAggregate= ruleSAggregate EOF
            {
             newCompositeNode(grammarAccess.getSAggregateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSAggregate=ruleSAggregate();

            state._fsp--;

             current =iv_ruleSAggregate; 
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
    // $ANTLR end "entryRuleSAggregate"


    // $ANTLR start "ruleSAggregate"
    // InternalSms.g:846:1: ruleSAggregate returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | (otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleSAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_types_6_0 = null;



        	enterRule();

        try {
            // InternalSms.g:852:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | (otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) ) ) )
            // InternalSms.g:853:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | (otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) ) )
            {
            // InternalSms.g:853:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | (otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) ) )
            // InternalSms.g:854:3: () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | (otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) )
            {
            // InternalSms.g:854:3: ()
            // InternalSms.g:855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSAggregateAccess().getSAggregateAction_0(),
            					current);
            			

            }

            // InternalSms.g:861:3: ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | (otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==19) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSms.g:862:4: (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) )
                    {
                    // InternalSms.g:862:4: (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) )
                    // InternalSms.g:863:5: otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(otherlv_1, grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSAggregateAccess().getAggregateKeyword_1_0_1());
                    				
                    // InternalSms.g:871:5: ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
                    // InternalSms.g:872:6: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
                    {
                    // InternalSms.g:872:6: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
                    // InternalSms.g:873:7: lv_deductionRule_3_0= ruleSGrabAggregateRule
                    {

                    							newCompositeNode(grammarAccess.getSAggregateAccess().getDeductionRuleSGrabAggregateRuleParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_3_0=ruleSGrabAggregateRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSAggregateRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SGrabAggregateRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:892:4: (otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' )
                    {
                    // InternalSms.g:892:4: (otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' )
                    // InternalSms.g:893:5: otherlv_4= 'aggregate' otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getSAggregateAccess().getAggregateKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,20,FOLLOW_16); 

                    					newLeafNode(otherlv_5, grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_1_1_1());
                    				
                    // InternalSms.g:901:5: ( (lv_types_6_0= ruleSType ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18||LA14_0==24||(LA14_0>=28 && LA14_0<=29)||(LA14_0>=32 && LA14_0<=36)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSms.g:902:6: (lv_types_6_0= ruleSType )
                    	    {
                    	    // InternalSms.g:902:6: (lv_types_6_0= ruleSType )
                    	    // InternalSms.g:903:7: lv_types_6_0= ruleSType
                    	    {

                    	    							newCompositeNode(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_types_6_0=ruleSType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSAggregateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_6_0,
                    	    								"com.mimacom.ddd.sm.sms.Sms.SType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_1_1_3());
                    				

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
    // $ANTLR end "ruleSAggregate"


    // $ANTLR start "entryRuleSType"
    // InternalSms.g:930:1: entryRuleSType returns [EObject current=null] : iv_ruleSType= ruleSType EOF ;
    public final EObject entryRuleSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSType = null;


        try {
            // InternalSms.g:930:46: (iv_ruleSType= ruleSType EOF )
            // InternalSms.g:931:2: iv_ruleSType= ruleSType EOF
            {
             newCompositeNode(grammarAccess.getSTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSType=ruleSType();

            state._fsp--;

             current =iv_ruleSType; 
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
    // $ANTLR end "entryRuleSType"


    // $ANTLR start "ruleSType"
    // InternalSms.g:937:1: ruleSType returns [EObject current=null] : (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType ) ;
    public final EObject ruleSType() throws RecognitionException {
        EObject current = null;

        EObject this_SPrimitive_0 = null;

        EObject this_SPrimitiveArchetype_1 = null;

        EObject this_SEnumeration_2 = null;

        EObject this_SRootType_3 = null;

        EObject this_SDetailType_4 = null;



        	enterRule();

        try {
            // InternalSms.g:943:2: ( (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType ) )
            // InternalSms.g:944:2: (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType )
            {
            // InternalSms.g:944:2: (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalSms.g:945:3: this_SPrimitive_0= ruleSPrimitive
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSPrimitiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SPrimitive_0=ruleSPrimitive();

                    state._fsp--;


                    			current = this_SPrimitive_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSms.g:954:3: this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSPrimitiveArchetypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SPrimitiveArchetype_1=ruleSPrimitiveArchetype();

                    state._fsp--;


                    			current = this_SPrimitiveArchetype_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSms.g:963:3: this_SEnumeration_2= ruleSEnumeration
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSEnumerationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SEnumeration_2=ruleSEnumeration();

                    state._fsp--;


                    			current = this_SEnumeration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSms.g:972:3: this_SRootType_3= ruleSRootType
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSRootTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SRootType_3=ruleSRootType();

                    state._fsp--;


                    			current = this_SRootType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSms.g:981:3: this_SDetailType_4= ruleSDetailType
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSDetailTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SDetailType_4=ruleSDetailType();

                    state._fsp--;


                    			current = this_SDetailType_4;
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
    // $ANTLR end "ruleSType"


    // $ANTLR start "entryRuleSConstraint"
    // InternalSms.g:993:1: entryRuleSConstraint returns [EObject current=null] : iv_ruleSConstraint= ruleSConstraint EOF ;
    public final EObject entryRuleSConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSConstraint = null;


        try {
            // InternalSms.g:993:52: (iv_ruleSConstraint= ruleSConstraint EOF )
            // InternalSms.g:994:2: iv_ruleSConstraint= ruleSConstraint EOF
            {
             newCompositeNode(grammarAccess.getSConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSConstraint=ruleSConstraint();

            state._fsp--;

             current =iv_ruleSConstraint; 
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
    // $ANTLR end "entryRuleSConstraint"


    // $ANTLR start "ruleSConstraint"
    // InternalSms.g:1000:1: ruleSConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) ;
    public final EObject ruleSConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1006:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) )
            // InternalSms.g:1007:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            {
            // InternalSms.g:1007:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            // InternalSms.g:1008:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSConstraintAccess().getConstraintKeyword_0());
            		
            // InternalSms.g:1012:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSms.g:1013:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSms.g:1013:4: (lv_name_1_0= RULE_ID )
            // InternalSms.g:1014:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSConstraintAccess().getColonKeyword_2());
            		
            // InternalSms.g:1034:3: ( (lv_condition_3_0= ruleSExpression ) )
            // InternalSms.g:1035:4: (lv_condition_3_0= ruleSExpression )
            {
            // InternalSms.g:1035:4: (lv_condition_3_0= ruleSExpression )
            // InternalSms.g:1036:5: lv_condition_3_0= ruleSExpression
            {

            					newCompositeNode(grammarAccess.getSConstraintAccess().getConditionSExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_3_0=ruleSExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSConstraintRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"com.mimacom.ddd.sm.sms.Sms.SExpression");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleSConstraint"


    // $ANTLR start "entryRuleSPrimitive"
    // InternalSms.g:1057:1: entryRuleSPrimitive returns [EObject current=null] : iv_ruleSPrimitive= ruleSPrimitive EOF ;
    public final EObject entryRuleSPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitive = null;


        try {
            // InternalSms.g:1057:51: (iv_ruleSPrimitive= ruleSPrimitive EOF )
            // InternalSms.g:1058:2: iv_ruleSPrimitive= ruleSPrimitive EOF
            {
             newCompositeNode(grammarAccess.getSPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPrimitive=ruleSPrimitive();

            state._fsp--;

             current =iv_ruleSPrimitive; 
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
    // $ANTLR end "entryRuleSPrimitive"


    // $ANTLR start "ruleSPrimitive"
    // InternalSms.g:1064:1: ruleSPrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}' ) ;
    public final EObject ruleSPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1070:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}' ) )
            // InternalSms.g:1071:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}' )
            {
            // InternalSms.g:1071:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}' )
            // InternalSms.g:1072:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0());
            		
            // InternalSms.g:1076:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSms.g:1077:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSms.g:1077:4: (lv_name_1_0= RULE_ID )
            // InternalSms.g:1078:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPrimitiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSms.g:1094:3: ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=26 && LA18_0<=27)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSms.g:1095:4: (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalSms.g:1095:4: (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) )
                    // InternalSms.g:1096:5: otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_2_0_0());
                    				
                    // InternalSms.g:1100:5: ( (otherlv_3= RULE_ID ) )
                    // InternalSms.g:1101:6: (otherlv_3= RULE_ID )
                    {
                    // InternalSms.g:1101:6: (otherlv_3= RULE_ID )
                    // InternalSms.g:1102:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSPrimitiveRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(otherlv_3, grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_2_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1115:4: ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) )
                    {
                    // InternalSms.g:1115:4: ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) )
                    // InternalSms.g:1116:5: (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) )
                    {
                    // InternalSms.g:1116:5: (otherlv_4= 'realizes' | otherlv_5= 'realises' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==26) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==27) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSms.g:1117:6: otherlv_4= 'realizes'
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_3); 

                            						newLeafNode(otherlv_4, grammarAccess.getSPrimitiveAccess().getRealizesKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalSms.g:1122:6: otherlv_5= 'realises'
                            {
                            otherlv_5=(Token)match(input,27,FOLLOW_3); 

                            						newLeafNode(otherlv_5, grammarAccess.getSPrimitiveAccess().getRealisesKeyword_2_1_0_1());
                            					

                            }
                            break;

                    }

                    // InternalSms.g:1127:5: ( ( ruleSQualifiedName ) )
                    // InternalSms.g:1128:6: ( ruleSQualifiedName )
                    {
                    // InternalSms.g:1128:6: ( ruleSQualifiedName )
                    // InternalSms.g:1129:7: ruleSQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSPrimitiveRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveCrossReference_2_1_1_0());
                    						
                    pushFollow(FOLLOW_15);
                    ruleSQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSms.g:1149:3: ( (lv_constraints_8_0= ruleSConstraint ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSms.g:1150:4: (lv_constraints_8_0= ruleSConstraint )
            	    {
            	    // InternalSms.g:1150:4: (lv_constraints_8_0= ruleSConstraint )
            	    // InternalSms.g:1151:5: lv_constraints_8_0= ruleSConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_constraints_8_0=ruleSConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSPrimitiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_8_0,
            	    						"com.mimacom.ddd.sm.sms.Sms.SConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSPrimitive"


    // $ANTLR start "entryRuleSPrimitiveArchetype"
    // InternalSms.g:1176:1: entryRuleSPrimitiveArchetype returns [EObject current=null] : iv_ruleSPrimitiveArchetype= ruleSPrimitiveArchetype EOF ;
    public final EObject entryRuleSPrimitiveArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitiveArchetype = null;


        try {
            // InternalSms.g:1176:60: (iv_ruleSPrimitiveArchetype= ruleSPrimitiveArchetype EOF )
            // InternalSms.g:1177:2: iv_ruleSPrimitiveArchetype= ruleSPrimitiveArchetype EOF
            {
             newCompositeNode(grammarAccess.getSPrimitiveArchetypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPrimitiveArchetype=ruleSPrimitiveArchetype();

            state._fsp--;

             current =iv_ruleSPrimitiveArchetype; 
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
    // $ANTLR end "entryRuleSPrimitiveArchetype"


    // $ANTLR start "ruleSPrimitiveArchetype"
    // InternalSms.g:1183:1: ruleSPrimitiveArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}' ) ;
    public final EObject ruleSPrimitiveArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1189:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}' ) )
            // InternalSms.g:1190:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}' )
            {
            // InternalSms.g:1190:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}' )
            // InternalSms.g:1191:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSPrimitiveArchetypeAccess().getArchetypeKeyword_0());
            		
            // InternalSms.g:1195:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSms.g:1196:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSms.g:1196:4: (lv_name_1_0= RULE_ID )
            // InternalSms.g:1197:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSPrimitiveArchetypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPrimitiveArchetypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSPrimitiveArchetypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSms.g:1217:3: ( (lv_constraints_3_0= ruleSConstraint ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSms.g:1218:4: (lv_constraints_3_0= ruleSConstraint )
            	    {
            	    // InternalSms.g:1218:4: (lv_constraints_3_0= ruleSConstraint )
            	    // InternalSms.g:1219:5: lv_constraints_3_0= ruleSConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getSPrimitiveArchetypeAccess().getConstraintsSConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_constraints_3_0=ruleSConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSPrimitiveArchetypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_3_0,
            	    						"com.mimacom.ddd.sm.sms.Sms.SConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSPrimitiveArchetypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSPrimitiveArchetype"


    // $ANTLR start "entryRuleSEnumeration"
    // InternalSms.g:1244:1: entryRuleSEnumeration returns [EObject current=null] : iv_ruleSEnumeration= ruleSEnumeration EOF ;
    public final EObject entryRuleSEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumeration = null;


        try {
            // InternalSms.g:1244:53: (iv_ruleSEnumeration= ruleSEnumeration EOF )
            // InternalSms.g:1245:2: iv_ruleSEnumeration= ruleSEnumeration EOF
            {
             newCompositeNode(grammarAccess.getSEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSEnumeration=ruleSEnumeration();

            state._fsp--;

             current =iv_ruleSEnumeration; 
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
    // $ANTLR end "entryRuleSEnumeration"


    // $ANTLR start "ruleSEnumeration"
    // InternalSms.g:1251:1: ruleSEnumeration returns [EObject current=null] : ( ( (otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) ) ) ) otherlv_5= '{' ( ( (lv_literals_6_0= ruleSLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) ) )* )? ( (lv_constraints_9_0= ruleSConstraint ) )* otherlv_10= '}' ) ;
    public final EObject ruleSEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_literals_6_0 = null;

        EObject lv_literals_8_0 = null;

        EObject lv_constraints_9_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1257:2: ( ( ( (otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) ) ) ) otherlv_5= '{' ( ( (lv_literals_6_0= ruleSLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) ) )* )? ( (lv_constraints_9_0= ruleSConstraint ) )* otherlv_10= '}' ) )
            // InternalSms.g:1258:2: ( ( (otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) ) ) ) otherlv_5= '{' ( ( (lv_literals_6_0= ruleSLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) ) )* )? ( (lv_constraints_9_0= ruleSConstraint ) )* otherlv_10= '}' )
            {
            // InternalSms.g:1258:2: ( ( (otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) ) ) ) otherlv_5= '{' ( ( (lv_literals_6_0= ruleSLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) ) )* )? ( (lv_constraints_9_0= ruleSConstraint ) )* otherlv_10= '}' )
            // InternalSms.g:1259:3: ( (otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) ) ) ) otherlv_5= '{' ( ( (lv_literals_6_0= ruleSLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) ) )* )? ( (lv_constraints_9_0= ruleSConstraint ) )* otherlv_10= '}'
            {
            // InternalSms.g:1259:3: ( (otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) ) ) | (otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSms.g:1260:4: (otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) ) )
                    {
                    // InternalSms.g:1260:4: (otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) ) )
                    // InternalSms.g:1261:5: otherlv_0= 'grab' otherlv_1= 'enumeration' ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_21); 

                    					newLeafNode(otherlv_0, grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,29,FOLLOW_3); 

                    					newLeafNode(otherlv_1, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_1());
                    				
                    // InternalSms.g:1269:5: ( (lv_deductionRule_2_0= ruleSGrabEnumerationRule ) )
                    // InternalSms.g:1270:6: (lv_deductionRule_2_0= ruleSGrabEnumerationRule )
                    {
                    // InternalSms.g:1270:6: (lv_deductionRule_2_0= ruleSGrabEnumerationRule )
                    // InternalSms.g:1271:7: lv_deductionRule_2_0= ruleSGrabEnumerationRule
                    {

                    							newCompositeNode(grammarAccess.getSEnumerationAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_0_0_2_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_2_0=ruleSGrabEnumerationRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_2_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SGrabEnumerationRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1290:4: (otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // InternalSms.g:1290:4: (otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) ) )
                    // InternalSms.g:1291:5: otherlv_3= 'enumeration' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_0());
                    				
                    // InternalSms.g:1295:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalSms.g:1296:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalSms.g:1296:6: (lv_name_4_0= RULE_ID )
                    // InternalSms.g:1297:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_0_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSEnumerationRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSms.g:1319:3: ( ( (lv_literals_6_0= ruleSLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==18||LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSms.g:1320:4: ( (lv_literals_6_0= ruleSLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) ) )*
                    {
                    // InternalSms.g:1320:4: ( (lv_literals_6_0= ruleSLiteral ) )
                    // InternalSms.g:1321:5: (lv_literals_6_0= ruleSLiteral )
                    {
                    // InternalSms.g:1321:5: (lv_literals_6_0= ruleSLiteral )
                    // InternalSms.g:1322:6: lv_literals_6_0= ruleSLiteral
                    {

                    						newCompositeNode(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_literals_6_0=ruleSLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    						}
                    						add(
                    							current,
                    							"literals",
                    							lv_literals_6_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSms.g:1339:4: (otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==30) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSms.g:1340:5: otherlv_7= ',' ( (lv_literals_8_0= ruleSLiteral ) )
                    	    {
                    	    otherlv_7=(Token)match(input,30,FOLLOW_24); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSms.g:1344:5: ( (lv_literals_8_0= ruleSLiteral ) )
                    	    // InternalSms.g:1345:6: (lv_literals_8_0= ruleSLiteral )
                    	    {
                    	    // InternalSms.g:1345:6: (lv_literals_8_0= ruleSLiteral )
                    	    // InternalSms.g:1346:7: lv_literals_8_0= ruleSLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_literals_8_0=ruleSLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_8_0,
                    	    								"com.mimacom.ddd.sm.sms.Sms.SLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalSms.g:1365:3: ( (lv_constraints_9_0= ruleSConstraint ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSms.g:1366:4: (lv_constraints_9_0= ruleSConstraint )
            	    {
            	    // InternalSms.g:1366:4: (lv_constraints_9_0= ruleSConstraint )
            	    // InternalSms.g:1367:5: lv_constraints_9_0= ruleSConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getSEnumerationAccess().getConstraintsSConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_constraints_9_0=ruleSConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSEnumerationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_9_0,
            	    						"com.mimacom.ddd.sm.sms.Sms.SConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSEnumeration"


    // $ANTLR start "entryRuleSLiteral"
    // InternalSms.g:1392:1: entryRuleSLiteral returns [EObject current=null] : iv_ruleSLiteral= ruleSLiteral EOF ;
    public final EObject entryRuleSLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSLiteral = null;


        try {
            // InternalSms.g:1392:49: (iv_ruleSLiteral= ruleSLiteral EOF )
            // InternalSms.g:1393:2: iv_ruleSLiteral= ruleSLiteral EOF
            {
             newCompositeNode(grammarAccess.getSLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSLiteral=ruleSLiteral();

            state._fsp--;

             current =iv_ruleSLiteral; 
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
    // $ANTLR end "entryRuleSLiteral"


    // $ANTLR start "ruleSLiteral"
    // InternalSms.g:1399:1: ruleSLiteral returns [EObject current=null] : ( (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_2= 'ditch' ( (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleSLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        EObject lv_deductionRule_1_0 = null;

        EObject lv_deductionRule_3_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1405:2: ( ( (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_2= 'ditch' ( (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalSms.g:1406:2: ( (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_2= 'ditch' ( (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalSms.g:1406:2: ( (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule ) ) ) | (otherlv_2= 'ditch' ( (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_4_0= RULE_ID ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=2;
                }
                break;
            case RULE_ID:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSms.g:1407:3: (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalSms.g:1407:3: (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule ) ) )
                    // InternalSms.g:1408:4: otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getSLiteralAccess().getGrabKeyword_0_0());
                    			
                    // InternalSms.g:1412:4: ( (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule ) )
                    // InternalSms.g:1413:5: (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule )
                    {
                    // InternalSms.g:1413:5: (lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule )
                    // InternalSms.g:1414:6: lv_deductionRule_1_0= ruleSGrabEnumerationLiteralRule
                    {

                    						newCompositeNode(grammarAccess.getSLiteralAccess().getDeductionRuleSGrabEnumerationLiteralRuleParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_1_0=ruleSGrabEnumerationLiteralRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSLiteralRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_1_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SGrabEnumerationLiteralRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1433:3: (otherlv_2= 'ditch' ( (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalSms.g:1433:3: (otherlv_2= 'ditch' ( (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule ) ) )
                    // InternalSms.g:1434:4: otherlv_2= 'ditch' ( (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSLiteralAccess().getDitchKeyword_1_0());
                    			
                    // InternalSms.g:1438:4: ( (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule ) )
                    // InternalSms.g:1439:5: (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule )
                    {
                    // InternalSms.g:1439:5: (lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule )
                    // InternalSms.g:1440:6: lv_deductionRule_3_0= ruleSDitchEnumerationLiteralRule
                    {

                    						newCompositeNode(grammarAccess.getSLiteralAccess().getDeductionRuleSDitchEnumerationLiteralRuleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_3_0=ruleSDitchEnumerationLiteralRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSLiteralRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_3_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SDitchEnumerationLiteralRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSms.g:1459:3: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // InternalSms.g:1459:3: ( (lv_name_4_0= RULE_ID ) )
                    // InternalSms.g:1460:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalSms.g:1460:4: (lv_name_4_0= RULE_ID )
                    // InternalSms.g:1461:5: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_4_0, grammarAccess.getSLiteralAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_4_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleSLiteral"


    // $ANTLR start "entryRuleSRootType"
    // InternalSms.g:1481:1: entryRuleSRootType returns [EObject current=null] : iv_ruleSRootType= ruleSRootType EOF ;
    public final EObject entryRuleSRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSRootType = null;


        try {
            // InternalSms.g:1481:50: (iv_ruleSRootType= ruleSRootType EOF )
            // InternalSms.g:1482:2: iv_ruleSRootType= ruleSRootType EOF
            {
             newCompositeNode(grammarAccess.getSRootTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSRootType=ruleSRootType();

            state._fsp--;

             current =iv_ruleSRootType; 
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
    // $ANTLR end "entryRuleSRootType"


    // $ANTLR start "ruleSRootType"
    // InternalSms.g:1488:1: ruleSRootType returns [EObject current=null] : ( ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSRootType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_abstract_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_abstract_9_0=null;
        Token otherlv_10=null;
        Token lv_abstract_12_0=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_7_0 = null;

        EObject lv_deductionRule_11_0 = null;

        EObject this_SComplexTypeExtends_15 = null;

        EObject this_SComplexTypeFeatures_16 = null;



        	enterRule();

        try {
            // InternalSms.g:1494:2: ( ( ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current] ) )
            // InternalSms.g:1495:2: ( ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSms.g:1495:2: ( ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current] )
            // InternalSms.g:1496:3: ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current]
            {
            // InternalSms.g:1496:3: ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt30=1;
                }
                break;
            case 34:
                {
                alt30=2;
                }
                break;
            case 35:
                {
                alt30=3;
                }
                break;
            case 32:
            case 33:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSms.g:1497:4: (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSms.g:1497:4: (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSms.g:1498:5: otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_25); 

                    					newLeafNode(otherlv_0, grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_0());
                    				
                    // InternalSms.g:1502:5: ( (lv_abstract_1_0= 'abstract' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSms.g:1503:6: (lv_abstract_1_0= 'abstract' )
                            {
                            // InternalSms.g:1503:6: (lv_abstract_1_0= 'abstract' )
                            // InternalSms.g:1504:7: lv_abstract_1_0= 'abstract'
                            {
                            lv_abstract_1_0=(Token)match(input,32,FOLLOW_26); 

                            							newLeafNode(lv_abstract_1_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,33,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_2());
                    				
                    // InternalSms.g:1520:5: ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    // InternalSms.g:1521:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSms.g:1521:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    // InternalSms.g:1522:7: lv_deductionRule_3_0= ruleSGrabComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSRootTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_3_0=ruleSGrabComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSRootTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SGrabComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1541:4: (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSms.g:1541:4: (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSms.g:1542:5: otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'root' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_25); 

                    					newLeafNode(otherlv_4, grammarAccess.getSRootTypeAccess().getMorphKeyword_0_1_0());
                    				
                    // InternalSms.g:1546:5: ( (lv_abstract_5_0= 'abstract' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSms.g:1547:6: (lv_abstract_5_0= 'abstract' )
                            {
                            // InternalSms.g:1547:6: (lv_abstract_5_0= 'abstract' )
                            // InternalSms.g:1548:7: lv_abstract_5_0= 'abstract'
                            {
                            lv_abstract_5_0=(Token)match(input,32,FOLLOW_26); 

                            							newLeafNode(lv_abstract_5_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_2());
                    				
                    // InternalSms.g:1564:5: ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) )
                    // InternalSms.g:1565:6: (lv_deductionRule_7_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSms.g:1565:6: (lv_deductionRule_7_0= ruleSMorphComplexTypeRule )
                    // InternalSms.g:1566:7: lv_deductionRule_7_0= ruleSMorphComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSRootTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_7_0=ruleSMorphComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSRootTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_7_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SMorphComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSms.g:1585:4: (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSms.g:1585:4: (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSms.g:1586:5: otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'root' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_25); 

                    					newLeafNode(otherlv_8, grammarAccess.getSRootTypeAccess().getFuseKeyword_0_2_0());
                    				
                    // InternalSms.g:1590:5: ( (lv_abstract_9_0= 'abstract' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==32) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSms.g:1591:6: (lv_abstract_9_0= 'abstract' )
                            {
                            // InternalSms.g:1591:6: (lv_abstract_9_0= 'abstract' )
                            // InternalSms.g:1592:7: lv_abstract_9_0= 'abstract'
                            {
                            lv_abstract_9_0=(Token)match(input,32,FOLLOW_26); 

                            							newLeafNode(lv_abstract_9_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_3); 

                    					newLeafNode(otherlv_10, grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_2());
                    				
                    // InternalSms.g:1608:5: ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) )
                    // InternalSms.g:1609:6: (lv_deductionRule_11_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSms.g:1609:6: (lv_deductionRule_11_0= ruleSFuseComplexTypeRule )
                    // InternalSms.g:1610:7: lv_deductionRule_11_0= ruleSFuseComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSRootTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_2_3_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_11_0=ruleSFuseComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSRootTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_11_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SFuseComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSms.g:1629:4: ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] )
                    {
                    // InternalSms.g:1629:4: ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] )
                    // InternalSms.g:1630:5: ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current]
                    {
                    // InternalSms.g:1630:5: ( (lv_abstract_12_0= 'abstract' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==32) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalSms.g:1631:6: (lv_abstract_12_0= 'abstract' )
                            {
                            // InternalSms.g:1631:6: (lv_abstract_12_0= 'abstract' )
                            // InternalSms.g:1632:7: lv_abstract_12_0= 'abstract'
                            {
                            lv_abstract_12_0=(Token)match(input,32,FOLLOW_26); 

                            							newLeafNode(lv_abstract_12_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_3); 

                    					newLeafNode(otherlv_13, grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_1());
                    				
                    // InternalSms.g:1648:5: ( (lv_name_14_0= RULE_ID ) )
                    // InternalSms.g:1649:6: (lv_name_14_0= RULE_ID )
                    {
                    // InternalSms.g:1649:6: (lv_name_14_0= RULE_ID )
                    // InternalSms.g:1650:7: lv_name_14_0= RULE_ID
                    {
                    lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    							newLeafNode(lv_name_14_0, grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_3_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSRootTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_14_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSRootTypeRule());
                    					}
                    					newCompositeNode(grammarAccess.getSRootTypeAccess().getSComplexTypeExtendsParserRuleCall_0_3_3());
                    				
                    pushFollow(FOLLOW_15);
                    this_SComplexTypeExtends_15=ruleSComplexTypeExtends(current);

                    state._fsp--;


                    					current = this_SComplexTypeExtends_15;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSRootTypeRule());
            			}
            			newCompositeNode(grammarAccess.getSRootTypeAccess().getSComplexTypeFeaturesParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_SComplexTypeFeatures_16=ruleSComplexTypeFeatures(current);

            state._fsp--;


            			current = this_SComplexTypeFeatures_16;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleSRootType"


    // $ANTLR start "entryRuleSDetailType"
    // InternalSms.g:1694:1: entryRuleSDetailType returns [EObject current=null] : iv_ruleSDetailType= ruleSDetailType EOF ;
    public final EObject entryRuleSDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDetailType = null;


        try {
            // InternalSms.g:1694:52: (iv_ruleSDetailType= ruleSDetailType EOF )
            // InternalSms.g:1695:2: iv_ruleSDetailType= ruleSDetailType EOF
            {
             newCompositeNode(grammarAccess.getSDetailTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDetailType=ruleSDetailType();

            state._fsp--;

             current =iv_ruleSDetailType; 
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
    // $ANTLR end "entryRuleSDetailType"


    // $ANTLR start "ruleSDetailType"
    // InternalSms.g:1701:1: ruleSDetailType returns [EObject current=null] : ( ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSDetailType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_abstract_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_abstract_9_0=null;
        Token otherlv_10=null;
        Token lv_abstract_12_0=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_7_0 = null;

        EObject lv_deductionRule_11_0 = null;

        EObject this_SComplexTypeExtends_15 = null;

        EObject this_SComplexTypeFeatures_16 = null;



        	enterRule();

        try {
            // InternalSms.g:1707:2: ( ( ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current] ) )
            // InternalSms.g:1708:2: ( ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSms.g:1708:2: ( ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current] )
            // InternalSms.g:1709:3: ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_16= ruleSComplexTypeFeatures[$current]
            {
            // InternalSms.g:1709:3: ( (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) ) | (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt35=1;
                }
                break;
            case 34:
                {
                alt35=2;
                }
                break;
            case 35:
                {
                alt35=3;
                }
                break;
            case 32:
            case 36:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSms.g:1710:4: (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSms.g:1710:4: (otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSms.g:1711:5: otherlv_0= 'grab' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_28); 

                    					newLeafNode(otherlv_0, grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_0());
                    				
                    // InternalSms.g:1715:5: ( (lv_abstract_1_0= 'abstract' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==32) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSms.g:1716:6: (lv_abstract_1_0= 'abstract' )
                            {
                            // InternalSms.g:1716:6: (lv_abstract_1_0= 'abstract' )
                            // InternalSms.g:1717:7: lv_abstract_1_0= 'abstract'
                            {
                            lv_abstract_1_0=(Token)match(input,32,FOLLOW_29); 

                            							newLeafNode(lv_abstract_1_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_2());
                    				
                    // InternalSms.g:1733:5: ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    // InternalSms.g:1734:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSms.g:1734:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    // InternalSms.g:1735:7: lv_deductionRule_3_0= ruleSGrabComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_3_0=ruleSGrabComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SGrabComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1754:4: (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSms.g:1754:4: (otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSms.g:1755:5: otherlv_4= 'morph' ( (lv_abstract_5_0= 'abstract' ) )? otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_28); 

                    					newLeafNode(otherlv_4, grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_1_0());
                    				
                    // InternalSms.g:1759:5: ( (lv_abstract_5_0= 'abstract' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==32) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalSms.g:1760:6: (lv_abstract_5_0= 'abstract' )
                            {
                            // InternalSms.g:1760:6: (lv_abstract_5_0= 'abstract' )
                            // InternalSms.g:1761:7: lv_abstract_5_0= 'abstract'
                            {
                            lv_abstract_5_0=(Token)match(input,32,FOLLOW_29); 

                            							newLeafNode(lv_abstract_5_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_2());
                    				
                    // InternalSms.g:1777:5: ( (lv_deductionRule_7_0= ruleSMorphComplexTypeRule ) )
                    // InternalSms.g:1778:6: (lv_deductionRule_7_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSms.g:1778:6: (lv_deductionRule_7_0= ruleSMorphComplexTypeRule )
                    // InternalSms.g:1779:7: lv_deductionRule_7_0= ruleSMorphComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_7_0=ruleSMorphComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_7_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SMorphComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSms.g:1798:4: (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSms.g:1798:4: (otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSms.g:1799:5: otherlv_8= 'fuse' ( (lv_abstract_9_0= 'abstract' ) )? otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_28); 

                    					newLeafNode(otherlv_8, grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_2_0());
                    				
                    // InternalSms.g:1803:5: ( (lv_abstract_9_0= 'abstract' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==32) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSms.g:1804:6: (lv_abstract_9_0= 'abstract' )
                            {
                            // InternalSms.g:1804:6: (lv_abstract_9_0= 'abstract' )
                            // InternalSms.g:1805:7: lv_abstract_9_0= 'abstract'
                            {
                            lv_abstract_9_0=(Token)match(input,32,FOLLOW_29); 

                            							newLeafNode(lv_abstract_9_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_3); 

                    					newLeafNode(otherlv_10, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_2());
                    				
                    // InternalSms.g:1821:5: ( (lv_deductionRule_11_0= ruleSFuseComplexTypeRule ) )
                    // InternalSms.g:1822:6: (lv_deductionRule_11_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSms.g:1822:6: (lv_deductionRule_11_0= ruleSFuseComplexTypeRule )
                    // InternalSms.g:1823:7: lv_deductionRule_11_0= ruleSFuseComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_2_3_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_11_0=ruleSFuseComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_11_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SFuseComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSms.g:1842:4: ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] )
                    {
                    // InternalSms.g:1842:4: ( ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current] )
                    // InternalSms.g:1843:5: ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_name_14_0= RULE_ID ) ) this_SComplexTypeExtends_15= ruleSComplexTypeExtends[$current]
                    {
                    // InternalSms.g:1843:5: ( (lv_abstract_12_0= 'abstract' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==32) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalSms.g:1844:6: (lv_abstract_12_0= 'abstract' )
                            {
                            // InternalSms.g:1844:6: (lv_abstract_12_0= 'abstract' )
                            // InternalSms.g:1845:7: lv_abstract_12_0= 'abstract'
                            {
                            lv_abstract_12_0=(Token)match(input,32,FOLLOW_29); 

                            							newLeafNode(lv_abstract_12_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,36,FOLLOW_3); 

                    					newLeafNode(otherlv_13, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_1());
                    				
                    // InternalSms.g:1861:5: ( (lv_name_14_0= RULE_ID ) )
                    // InternalSms.g:1862:6: (lv_name_14_0= RULE_ID )
                    {
                    // InternalSms.g:1862:6: (lv_name_14_0= RULE_ID )
                    // InternalSms.g:1863:7: lv_name_14_0= RULE_ID
                    {
                    lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    							newLeafNode(lv_name_14_0, grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_3_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSDetailTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_14_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSDetailTypeRule());
                    					}
                    					newCompositeNode(grammarAccess.getSDetailTypeAccess().getSComplexTypeExtendsParserRuleCall_0_3_3());
                    				
                    pushFollow(FOLLOW_15);
                    this_SComplexTypeExtends_15=ruleSComplexTypeExtends(current);

                    state._fsp--;


                    					current = this_SComplexTypeExtends_15;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSDetailTypeRule());
            			}
            			newCompositeNode(grammarAccess.getSDetailTypeAccess().getSComplexTypeFeaturesParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_SComplexTypeFeatures_16=ruleSComplexTypeFeatures(current);

            state._fsp--;


            			current = this_SComplexTypeFeatures_16;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleSDetailType"


    // $ANTLR start "ruleSComplexTypeExtends"
    // InternalSms.g:1908:1: ruleSComplexTypeExtends[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? ;
    public final EObject ruleSComplexTypeExtends(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSms.g:1914:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? )
            // InternalSms.g:1915:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            {
            // InternalSms.g:1915:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==15) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSms.g:1916:3: otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_3); 

                    			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0());
                    		
                    // InternalSms.g:1920:3: ( (otherlv_1= RULE_ID ) )
                    // InternalSms.g:1921:4: (otherlv_1= RULE_ID )
                    {
                    // InternalSms.g:1921:4: (otherlv_1= RULE_ID )
                    // InternalSms.g:1922:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSComplexTypeExtendsRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeCrossReference_1_0());
                    				

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
    // $ANTLR end "ruleSComplexTypeExtends"


    // $ANTLR start "ruleSComplexTypeFeatures"
    // InternalSms.g:1938:1: ruleSComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1944:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' ) )
            // InternalSms.g:1945:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' )
            {
            // InternalSms.g:1945:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' )
            // InternalSms.g:1946:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSms.g:1950:3: ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==18||LA37_0==31||LA37_0==34||(LA37_0>=36 && LA37_0<=39)||LA37_0==49) ) {
                    alt37=1;
                }
                else if ( (LA37_0==22) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSms.g:1951:4: ( (lv_features_1_0= ruleSFeature ) )
            	    {
            	    // InternalSms.g:1951:4: ( (lv_features_1_0= ruleSFeature ) )
            	    // InternalSms.g:1952:5: (lv_features_1_0= ruleSFeature )
            	    {
            	    // InternalSms.g:1952:5: (lv_features_1_0= ruleSFeature )
            	    // InternalSms.g:1953:6: lv_features_1_0= ruleSFeature
            	    {

            	    						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesSFeatureParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_features_1_0=ruleSFeature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSComplexTypeFeaturesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"features",
            	    							lv_features_1_0,
            	    							"com.mimacom.ddd.sm.sms.Sms.SFeature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSms.g:1971:4: ( (lv_constraints_2_0= ruleSConstraint ) )
            	    {
            	    // InternalSms.g:1971:4: ( (lv_constraints_2_0= ruleSConstraint ) )
            	    // InternalSms.g:1972:5: (lv_constraints_2_0= ruleSConstraint )
            	    {
            	    // InternalSms.g:1972:5: (lv_constraints_2_0= ruleSConstraint )
            	    // InternalSms.g:1973:6: lv_constraints_2_0= ruleSConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsSConstraintParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_constraints_2_0=ruleSConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSComplexTypeFeaturesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_2_0,
            	    							"com.mimacom.ddd.sm.sms.Sms.SConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleSComplexTypeFeatures"


    // $ANTLR start "entryRuleSFeature"
    // InternalSms.g:1999:1: entryRuleSFeature returns [EObject current=null] : iv_ruleSFeature= ruleSFeature EOF ;
    public final EObject entryRuleSFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFeature = null;


        try {
            // InternalSms.g:1999:49: (iv_ruleSFeature= ruleSFeature EOF )
            // InternalSms.g:2000:2: iv_ruleSFeature= ruleSFeature EOF
            {
             newCompositeNode(grammarAccess.getSFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSFeature=ruleSFeature();

            state._fsp--;

             current =iv_ruleSFeature; 
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
    // $ANTLR end "entryRuleSFeature"


    // $ANTLR start "ruleSFeature"
    // InternalSms.g:2006:1: ruleSFeature returns [EObject current=null] : (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) ;
    public final EObject ruleSFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SAssociation_0 = null;

        EObject this_SAttribute_1 = null;

        EObject this_SQuery_2 = null;



        	enterRule();

        try {
            // InternalSms.g:2012:2: ( (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) )
            // InternalSms.g:2013:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            {
            // InternalSms.g:2013:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                switch ( input.LA(2) ) {
                case 37:
                case 38:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_ID:
                case 36:
                    {
                    alt38=2;
                    }
                    break;
                case 41:
                    {
                    alt38=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case 37:
                case 38:
                    {
                    alt38=1;
                    }
                    break;
                case 41:
                    {
                    alt38=3;
                    }
                    break;
                case RULE_ID:
                case 36:
                    {
                    alt38=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }

                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case 37:
                case 38:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_ID:
                case 36:
                    {
                    alt38=2;
                    }
                    break;
                case 41:
                    {
                    alt38=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 3, input);

                    throw nvae;
                }

                }
                break;
            case 37:
            case 38:
            case 39:
            case 49:
                {
                alt38=1;
                }
                break;
            case 36:
                {
                alt38=2;
                }
                break;
            case RULE_ID:
                {
                int LA38_6 = input.LA(2);

                if ( (LA38_6==23) ) {
                    alt38=2;
                }
                else if ( (LA38_6==42) ) {
                    alt38=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalSms.g:2014:3: this_SAssociation_0= ruleSAssociation
                    {

                    			newCompositeNode(grammarAccess.getSFeatureAccess().getSAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SAssociation_0=ruleSAssociation();

                    state._fsp--;


                    			current = this_SAssociation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSms.g:2023:3: this_SAttribute_1= ruleSAttribute
                    {

                    			newCompositeNode(grammarAccess.getSFeatureAccess().getSAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SAttribute_1=ruleSAttribute();

                    state._fsp--;


                    			current = this_SAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSms.g:2032:3: this_SQuery_2= ruleSQuery
                    {

                    			newCompositeNode(grammarAccess.getSFeatureAccess().getSQueryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SQuery_2=ruleSQuery();

                    state._fsp--;


                    			current = this_SQuery_2;
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
    // $ANTLR end "ruleSFeature"


    // $ANTLR start "entryRuleSAssociation"
    // InternalSms.g:2044:1: entryRuleSAssociation returns [EObject current=null] : iv_ruleSAssociation= ruleSAssociation EOF ;
    public final EObject entryRuleSAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAssociation = null;


        try {
            // InternalSms.g:2044:53: (iv_ruleSAssociation= ruleSAssociation EOF )
            // InternalSms.g:2045:2: iv_ruleSAssociation= ruleSAssociation EOF
            {
             newCompositeNode(grammarAccess.getSAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSAssociation=ruleSAssociation();

            state._fsp--;

             current =iv_ruleSAssociation; 
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
    // $ANTLR end "entryRuleSAssociation"


    // $ANTLR start "ruleSAssociation"
    // InternalSms.g:2051:1: ruleSAssociation returns [EObject current=null] : ( (otherlv_0= 'grab' (otherlv_1= 'reference' | otherlv_2= 'composite' ) ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' (otherlv_5= 'reference' | otherlv_6= 'composite' ) ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) | (otherlv_8= 'ditch' (otherlv_9= 'reference' | otherlv_10= 'composite' ) ( (lv_deductionRule_11_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_12_0= 'derived' ) )? ( ( (lv_kind_13_0= ruleSAssociationKind ) ) | ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' ) ) ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ) ) ;
    public final EObject ruleSAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_derived_12_0=null;
        Token otherlv_15=null;
        Token lv_name_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_7_0 = null;

        EObject lv_deductionRule_11_0 = null;

        Enumerator lv_kind_13_0 = null;

        Enumerator lv_kind_14_0 = null;

        EObject lv_multiplicity_19_0 = null;



        	enterRule();

        try {
            // InternalSms.g:2057:2: ( ( (otherlv_0= 'grab' (otherlv_1= 'reference' | otherlv_2= 'composite' ) ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' (otherlv_5= 'reference' | otherlv_6= 'composite' ) ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) | (otherlv_8= 'ditch' (otherlv_9= 'reference' | otherlv_10= 'composite' ) ( (lv_deductionRule_11_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_12_0= 'derived' ) )? ( ( (lv_kind_13_0= ruleSAssociationKind ) ) | ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' ) ) ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ) ) )
            // InternalSms.g:2058:2: ( (otherlv_0= 'grab' (otherlv_1= 'reference' | otherlv_2= 'composite' ) ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' (otherlv_5= 'reference' | otherlv_6= 'composite' ) ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) | (otherlv_8= 'ditch' (otherlv_9= 'reference' | otherlv_10= 'composite' ) ( (lv_deductionRule_11_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_12_0= 'derived' ) )? ( ( (lv_kind_13_0= ruleSAssociationKind ) ) | ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' ) ) ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ) )
            {
            // InternalSms.g:2058:2: ( (otherlv_0= 'grab' (otherlv_1= 'reference' | otherlv_2= 'composite' ) ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | (otherlv_4= 'morph' (otherlv_5= 'reference' | otherlv_6= 'composite' ) ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) | (otherlv_8= 'ditch' (otherlv_9= 'reference' | otherlv_10= 'composite' ) ( (lv_deductionRule_11_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_12_0= 'derived' ) )? ( ( (lv_kind_13_0= ruleSAssociationKind ) ) | ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' ) ) ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt45=1;
                }
                break;
            case 34:
                {
                alt45=2;
                }
                break;
            case 31:
                {
                alt45=3;
                }
                break;
            case 37:
            case 38:
            case 39:
            case 49:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalSms.g:2059:3: (otherlv_0= 'grab' (otherlv_1= 'reference' | otherlv_2= 'composite' ) ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSms.g:2059:3: (otherlv_0= 'grab' (otherlv_1= 'reference' | otherlv_2= 'composite' ) ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                    // InternalSms.g:2060:4: otherlv_0= 'grab' (otherlv_1= 'reference' | otherlv_2= 'composite' ) ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_0, grammarAccess.getSAssociationAccess().getGrabKeyword_0_0());
                    			
                    // InternalSms.g:2064:4: (otherlv_1= 'reference' | otherlv_2= 'composite' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==37) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==38) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSms.g:2065:5: otherlv_1= 'reference'
                            {
                            otherlv_1=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getSAssociationAccess().getReferenceKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSms.g:2070:5: otherlv_2= 'composite'
                            {
                            otherlv_2=(Token)match(input,38,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getSAssociationAccess().getCompositeKeyword_0_1_1());
                            				

                            }
                            break;

                    }

                    // InternalSms.g:2075:4: ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                    // InternalSms.g:2076:5: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                    {
                    // InternalSms.g:2076:5: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                    // InternalSms.g:2077:6: lv_deductionRule_3_0= ruleSGrabFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAssociationAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_3_0=ruleSGrabFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_3_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SGrabFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:2096:3: (otherlv_4= 'morph' (otherlv_5= 'reference' | otherlv_6= 'composite' ) ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSms.g:2096:3: (otherlv_4= 'morph' (otherlv_5= 'reference' | otherlv_6= 'composite' ) ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) )
                    // InternalSms.g:2097:4: otherlv_4= 'morph' (otherlv_5= 'reference' | otherlv_6= 'composite' ) ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getSAssociationAccess().getMorphKeyword_1_0());
                    			
                    // InternalSms.g:2101:4: (otherlv_5= 'reference' | otherlv_6= 'composite' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==37) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==38) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalSms.g:2102:5: otherlv_5= 'reference'
                            {
                            otherlv_5=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_5, grammarAccess.getSAssociationAccess().getReferenceKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSms.g:2107:5: otherlv_6= 'composite'
                            {
                            otherlv_6=(Token)match(input,38,FOLLOW_3); 

                            					newLeafNode(otherlv_6, grammarAccess.getSAssociationAccess().getCompositeKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalSms.g:2112:4: ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) )
                    // InternalSms.g:2113:5: (lv_deductionRule_7_0= ruleSMorphFeatureRule )
                    {
                    // InternalSms.g:2113:5: (lv_deductionRule_7_0= ruleSMorphFeatureRule )
                    // InternalSms.g:2114:6: lv_deductionRule_7_0= ruleSMorphFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAssociationAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_7_0=ruleSMorphFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_7_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SMorphFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSms.g:2133:3: (otherlv_8= 'ditch' (otherlv_9= 'reference' | otherlv_10= 'composite' ) ( (lv_deductionRule_11_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSms.g:2133:3: (otherlv_8= 'ditch' (otherlv_9= 'reference' | otherlv_10= 'composite' ) ( (lv_deductionRule_11_0= ruleSDitchFeatureRule ) ) )
                    // InternalSms.g:2134:4: otherlv_8= 'ditch' (otherlv_9= 'reference' | otherlv_10= 'composite' ) ( (lv_deductionRule_11_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getSAssociationAccess().getDitchKeyword_2_0());
                    			
                    // InternalSms.g:2138:4: (otherlv_9= 'reference' | otherlv_10= 'composite' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==37) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==38) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSms.g:2139:5: otherlv_9= 'reference'
                            {
                            otherlv_9=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getSAssociationAccess().getReferenceKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSms.g:2144:5: otherlv_10= 'composite'
                            {
                            otherlv_10=(Token)match(input,38,FOLLOW_3); 

                            					newLeafNode(otherlv_10, grammarAccess.getSAssociationAccess().getCompositeKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalSms.g:2149:4: ( (lv_deductionRule_11_0= ruleSDitchFeatureRule ) )
                    // InternalSms.g:2150:5: (lv_deductionRule_11_0= ruleSDitchFeatureRule )
                    {
                    // InternalSms.g:2150:5: (lv_deductionRule_11_0= ruleSDitchFeatureRule )
                    // InternalSms.g:2151:6: lv_deductionRule_11_0= ruleSDitchFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAssociationAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_11_0=ruleSDitchFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_11_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SDitchFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSms.g:2170:3: ( ( (lv_derived_12_0= 'derived' ) )? ( ( (lv_kind_13_0= ruleSAssociationKind ) ) | ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' ) ) ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? )
                    {
                    // InternalSms.g:2170:3: ( ( (lv_derived_12_0= 'derived' ) )? ( ( (lv_kind_13_0= ruleSAssociationKind ) ) | ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' ) ) ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? )
                    // InternalSms.g:2171:4: ( (lv_derived_12_0= 'derived' ) )? ( ( (lv_kind_13_0= ruleSAssociationKind ) ) | ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' ) ) ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )?
                    {
                    // InternalSms.g:2171:4: ( (lv_derived_12_0= 'derived' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==39) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSms.g:2172:5: (lv_derived_12_0= 'derived' )
                            {
                            // InternalSms.g:2172:5: (lv_derived_12_0= 'derived' )
                            // InternalSms.g:2173:6: lv_derived_12_0= 'derived'
                            {
                            lv_derived_12_0=(Token)match(input,39,FOLLOW_32); 

                            						newLeafNode(lv_derived_12_0, grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAssociationRule());
                            						}
                            						setWithLastConsumed(current, "derived", true, "derived");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:2185:4: ( ( (lv_kind_13_0= ruleSAssociationKind ) ) | ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=37 && LA43_0<=38)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==49) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalSms.g:2186:5: ( (lv_kind_13_0= ruleSAssociationKind ) )
                            {
                            // InternalSms.g:2186:5: ( (lv_kind_13_0= ruleSAssociationKind ) )
                            // InternalSms.g:2187:6: (lv_kind_13_0= ruleSAssociationKind )
                            {
                            // InternalSms.g:2187:6: (lv_kind_13_0= ruleSAssociationKind )
                            // InternalSms.g:2188:7: lv_kind_13_0= ruleSAssociationKind
                            {

                            							newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindEnumRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_3);
                            lv_kind_13_0=ruleSAssociationKind();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSAssociationRule());
                            							}
                            							set(
                            								current,
                            								"kind",
                            								lv_kind_13_0,
                            								"com.mimacom.ddd.sm.sms.Sms.SAssociationKind");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSms.g:2206:5: ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' )
                            {
                            // InternalSms.g:2206:5: ( ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite' )
                            // InternalSms.g:2207:6: ( (lv_kind_14_0= ruleSAssociationKindInverse ) ) otherlv_15= 'composite'
                            {
                            // InternalSms.g:2207:6: ( (lv_kind_14_0= ruleSAssociationKindInverse ) )
                            // InternalSms.g:2208:7: (lv_kind_14_0= ruleSAssociationKindInverse )
                            {
                            // InternalSms.g:2208:7: (lv_kind_14_0= ruleSAssociationKindInverse )
                            // InternalSms.g:2209:8: lv_kind_14_0= ruleSAssociationKindInverse
                            {

                            								newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_3_1_1_0_0());
                            							
                            pushFollow(FOLLOW_33);
                            lv_kind_14_0=ruleSAssociationKindInverse();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getSAssociationRule());
                            								}
                            								set(
                            									current,
                            									"kind",
                            									lv_kind_14_0,
                            									"com.mimacom.ddd.sm.sms.Sms.SAssociationKindInverse");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_15=(Token)match(input,38,FOLLOW_3); 

                            						newLeafNode(otherlv_15, grammarAccess.getSAssociationAccess().getCompositeKeyword_3_1_1_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:2232:4: ( (lv_name_16_0= RULE_ID ) )
                    // InternalSms.g:2233:5: (lv_name_16_0= RULE_ID )
                    {
                    // InternalSms.g:2233:5: (lv_name_16_0= RULE_ID )
                    // InternalSms.g:2234:6: lv_name_16_0= RULE_ID
                    {
                    lv_name_16_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_16_0, grammarAccess.getSAssociationAccess().getNameIDTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAssociationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_16_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSAssociationAccess().getColonKeyword_3_3());
                    			
                    // InternalSms.g:2254:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSms.g:2255:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSms.g:2255:5: (otherlv_18= RULE_ID )
                    // InternalSms.g:2256:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAssociationRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_18, grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_3_4_0());
                    					

                    }


                    }

                    // InternalSms.g:2267:4: ( (lv_multiplicity_19_0= ruleSMultiplicity ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==42) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSms.g:2268:5: (lv_multiplicity_19_0= ruleSMultiplicity )
                            {
                            // InternalSms.g:2268:5: (lv_multiplicity_19_0= ruleSMultiplicity )
                            // InternalSms.g:2269:6: lv_multiplicity_19_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSAssociationAccess().getMultiplicitySMultiplicityParserRuleCall_3_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_multiplicity_19_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_19_0,
                            							"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleSAssociation"


    // $ANTLR start "entryRuleSAttribute"
    // InternalSms.g:2291:1: entryRuleSAttribute returns [EObject current=null] : iv_ruleSAttribute= ruleSAttribute EOF ;
    public final EObject entryRuleSAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttribute = null;


        try {
            // InternalSms.g:2291:51: (iv_ruleSAttribute= ruleSAttribute EOF )
            // InternalSms.g:2292:2: iv_ruleSAttribute= ruleSAttribute EOF
            {
             newCompositeNode(grammarAccess.getSAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSAttribute=ruleSAttribute();

            state._fsp--;

             current =iv_ruleSAttribute; 
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
    // $ANTLR end "entryRuleSAttribute"


    // $ANTLR start "ruleSAttribute"
    // InternalSms.g:2298:1: ruleSAttribute returns [EObject current=null] : ( (otherlv_0= 'grab' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_detail_4_0= 'detail' ) )? ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | (otherlv_6= 'ditch' ( (lv_detail_7_0= 'detail' ) )? ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_9_0= 'detail' ) )? ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ( (lv_multiplicity_13_0= ruleSMultiplicity ) )? ( (lv_key_14_0= 'key' ) )? ) ) ;
    public final EObject ruleSAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_detail_1_0=null;
        Token otherlv_3=null;
        Token lv_detail_4_0=null;
        Token otherlv_6=null;
        Token lv_detail_7_0=null;
        Token lv_detail_9_0=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_key_14_0=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_5_0 = null;

        EObject lv_deductionRule_8_0 = null;

        EObject lv_multiplicity_13_0 = null;



        	enterRule();

        try {
            // InternalSms.g:2304:2: ( ( (otherlv_0= 'grab' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_detail_4_0= 'detail' ) )? ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | (otherlv_6= 'ditch' ( (lv_detail_7_0= 'detail' ) )? ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_9_0= 'detail' ) )? ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ( (lv_multiplicity_13_0= ruleSMultiplicity ) )? ( (lv_key_14_0= 'key' ) )? ) ) )
            // InternalSms.g:2305:2: ( (otherlv_0= 'grab' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_detail_4_0= 'detail' ) )? ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | (otherlv_6= 'ditch' ( (lv_detail_7_0= 'detail' ) )? ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_9_0= 'detail' ) )? ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ( (lv_multiplicity_13_0= ruleSMultiplicity ) )? ( (lv_key_14_0= 'key' ) )? ) )
            {
            // InternalSms.g:2305:2: ( (otherlv_0= 'grab' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' ( (lv_detail_4_0= 'detail' ) )? ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | (otherlv_6= 'ditch' ( (lv_detail_7_0= 'detail' ) )? ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_9_0= 'detail' ) )? ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ( (lv_multiplicity_13_0= ruleSMultiplicity ) )? ( (lv_key_14_0= 'key' ) )? ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt52=1;
                }
                break;
            case 34:
                {
                alt52=2;
                }
                break;
            case 31:
                {
                alt52=3;
                }
                break;
            case RULE_ID:
            case 36:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalSms.g:2306:3: (otherlv_0= 'grab' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSms.g:2306:3: (otherlv_0= 'grab' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    // InternalSms.g:2307:4: otherlv_0= 'grab' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_0, grammarAccess.getSAttributeAccess().getGrabKeyword_0_0());
                    			
                    // InternalSms.g:2311:4: ( (lv_detail_1_0= 'detail' ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==36) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalSms.g:2312:5: (lv_detail_1_0= 'detail' )
                            {
                            // InternalSms.g:2312:5: (lv_detail_1_0= 'detail' )
                            // InternalSms.g:2313:6: lv_detail_1_0= 'detail'
                            {
                            lv_detail_1_0=(Token)match(input,36,FOLLOW_3); 

                            						newLeafNode(lv_detail_1_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "detail", true, "detail");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:2325:4: ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    // InternalSms.g:2326:5: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    {
                    // InternalSms.g:2326:5: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    // InternalSms.g:2327:6: lv_deductionRule_2_0= ruleSGrabFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAttributeAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_2_0=ruleSGrabFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_2_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SGrabFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:2346:3: (otherlv_3= 'morph' ( (lv_detail_4_0= 'detail' ) )? ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSms.g:2346:3: (otherlv_3= 'morph' ( (lv_detail_4_0= 'detail' ) )? ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                    // InternalSms.g:2347:4: otherlv_3= 'morph' ( (lv_detail_4_0= 'detail' ) )? ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getSAttributeAccess().getMorphKeyword_1_0());
                    			
                    // InternalSms.g:2351:4: ( (lv_detail_4_0= 'detail' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==36) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalSms.g:2352:5: (lv_detail_4_0= 'detail' )
                            {
                            // InternalSms.g:2352:5: (lv_detail_4_0= 'detail' )
                            // InternalSms.g:2353:6: lv_detail_4_0= 'detail'
                            {
                            lv_detail_4_0=(Token)match(input,36,FOLLOW_3); 

                            						newLeafNode(lv_detail_4_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "detail", true, "detail");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:2365:4: ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                    // InternalSms.g:2366:5: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                    {
                    // InternalSms.g:2366:5: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                    // InternalSms.g:2367:6: lv_deductionRule_5_0= ruleSMorphFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAttributeAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_5_0=ruleSMorphFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_5_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SMorphFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSms.g:2386:3: (otherlv_6= 'ditch' ( (lv_detail_7_0= 'detail' ) )? ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSms.g:2386:3: (otherlv_6= 'ditch' ( (lv_detail_7_0= 'detail' ) )? ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) )
                    // InternalSms.g:2387:4: otherlv_6= 'ditch' ( (lv_detail_7_0= 'detail' ) )? ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getSAttributeAccess().getDitchKeyword_2_0());
                    			
                    // InternalSms.g:2391:4: ( (lv_detail_7_0= 'detail' ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==36) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalSms.g:2392:5: (lv_detail_7_0= 'detail' )
                            {
                            // InternalSms.g:2392:5: (lv_detail_7_0= 'detail' )
                            // InternalSms.g:2393:6: lv_detail_7_0= 'detail'
                            {
                            lv_detail_7_0=(Token)match(input,36,FOLLOW_3); 

                            						newLeafNode(lv_detail_7_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "detail", true, "detail");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:2405:4: ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) )
                    // InternalSms.g:2406:5: (lv_deductionRule_8_0= ruleSDitchFeatureRule )
                    {
                    // InternalSms.g:2406:5: (lv_deductionRule_8_0= ruleSDitchFeatureRule )
                    // InternalSms.g:2407:6: lv_deductionRule_8_0= ruleSDitchFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAttributeAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_8_0=ruleSDitchFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_8_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SDitchFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSms.g:2426:3: ( ( (lv_detail_9_0= 'detail' ) )? ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ( (lv_multiplicity_13_0= ruleSMultiplicity ) )? ( (lv_key_14_0= 'key' ) )? )
                    {
                    // InternalSms.g:2426:3: ( ( (lv_detail_9_0= 'detail' ) )? ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ( (lv_multiplicity_13_0= ruleSMultiplicity ) )? ( (lv_key_14_0= 'key' ) )? )
                    // InternalSms.g:2427:4: ( (lv_detail_9_0= 'detail' ) )? ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ( (lv_multiplicity_13_0= ruleSMultiplicity ) )? ( (lv_key_14_0= 'key' ) )?
                    {
                    // InternalSms.g:2427:4: ( (lv_detail_9_0= 'detail' ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==36) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalSms.g:2428:5: (lv_detail_9_0= 'detail' )
                            {
                            // InternalSms.g:2428:5: (lv_detail_9_0= 'detail' )
                            // InternalSms.g:2429:6: lv_detail_9_0= 'detail'
                            {
                            lv_detail_9_0=(Token)match(input,36,FOLLOW_3); 

                            						newLeafNode(lv_detail_9_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "detail", true, "detail");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:2441:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalSms.g:2442:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalSms.g:2442:5: (lv_name_10_0= RULE_ID )
                    // InternalSms.g:2443:6: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_10_0, grammarAccess.getSAttributeAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getSAttributeAccess().getColonKeyword_3_2());
                    			
                    // InternalSms.g:2463:4: ( (otherlv_12= RULE_ID ) )
                    // InternalSms.g:2464:5: (otherlv_12= RULE_ID )
                    {
                    // InternalSms.g:2464:5: (otherlv_12= RULE_ID )
                    // InternalSms.g:2465:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAttributeRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_12, grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0());
                    					

                    }


                    }

                    // InternalSms.g:2476:4: ( (lv_multiplicity_13_0= ruleSMultiplicity ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==42) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalSms.g:2477:5: (lv_multiplicity_13_0= ruleSMultiplicity )
                            {
                            // InternalSms.g:2477:5: (lv_multiplicity_13_0= ruleSMultiplicity )
                            // InternalSms.g:2478:6: lv_multiplicity_13_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_3_4_0());
                            					
                            pushFollow(FOLLOW_36);
                            lv_multiplicity_13_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_13_0,
                            							"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:2495:4: ( (lv_key_14_0= 'key' ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==40) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalSms.g:2496:5: (lv_key_14_0= 'key' )
                            {
                            // InternalSms.g:2496:5: (lv_key_14_0= 'key' )
                            // InternalSms.g:2497:6: lv_key_14_0= 'key'
                            {
                            lv_key_14_0=(Token)match(input,40,FOLLOW_2); 

                            						newLeafNode(lv_key_14_0, grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "key", true, "key");
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleSAttribute"


    // $ANTLR start "entryRuleSQuery"
    // InternalSms.g:2514:1: entryRuleSQuery returns [EObject current=null] : iv_ruleSQuery= ruleSQuery EOF ;
    public final EObject entryRuleSQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQuery = null;


        try {
            // InternalSms.g:2514:47: (iv_ruleSQuery= ruleSQuery EOF )
            // InternalSms.g:2515:2: iv_ruleSQuery= ruleSQuery EOF
            {
             newCompositeNode(grammarAccess.getSQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSQuery=ruleSQuery();

            state._fsp--;

             current =iv_ruleSQuery; 
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
    // $ANTLR end "entryRuleSQuery"


    // $ANTLR start "ruleSQuery"
    // InternalSms.g:2521:1: ruleSQuery returns [EObject current=null] : ( ( ( (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) ) otherlv_6= '(' (otherlv_7= '*' | ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )? ) otherlv_11= ')' ) | (otherlv_12= 'ditch' otherlv_13= 'query' ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) otherlv_16= '(' ( ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )* )? otherlv_20= ')' otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) ( (lv_multiplicity_23_0= ruleSMultiplicity ) )? (otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) ) )? ) ) ;
    public final EObject ruleSQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_5_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_deductionRule_14_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_multiplicity_23_0 = null;

        EObject lv_returns_25_0 = null;



        	enterRule();

        try {
            // InternalSms.g:2527:2: ( ( ( ( (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) ) otherlv_6= '(' (otherlv_7= '*' | ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )? ) otherlv_11= ')' ) | (otherlv_12= 'ditch' otherlv_13= 'query' ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) otherlv_16= '(' ( ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )* )? otherlv_20= ')' otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) ( (lv_multiplicity_23_0= ruleSMultiplicity ) )? (otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) ) )? ) ) )
            // InternalSms.g:2528:2: ( ( ( (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) ) otherlv_6= '(' (otherlv_7= '*' | ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )? ) otherlv_11= ')' ) | (otherlv_12= 'ditch' otherlv_13= 'query' ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) otherlv_16= '(' ( ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )* )? otherlv_20= ')' otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) ( (lv_multiplicity_23_0= ruleSMultiplicity ) )? (otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) ) )? ) )
            {
            // InternalSms.g:2528:2: ( ( ( (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) ) otherlv_6= '(' (otherlv_7= '*' | ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )? ) otherlv_11= ')' ) | (otherlv_12= 'ditch' otherlv_13= 'query' ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) otherlv_16= '(' ( ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )* )? otherlv_20= ')' otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) ( (lv_multiplicity_23_0= ruleSMultiplicity ) )? (otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) ) )? ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 18:
            case 34:
                {
                alt61=1;
                }
                break;
            case 31:
                {
                alt61=2;
                }
                break;
            case RULE_ID:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalSms.g:2529:3: ( ( (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) ) otherlv_6= '(' (otherlv_7= '*' | ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )? ) otherlv_11= ')' )
                    {
                    // InternalSms.g:2529:3: ( ( (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) ) otherlv_6= '(' (otherlv_7= '*' | ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )? ) otherlv_11= ')' )
                    // InternalSms.g:2530:4: ( (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) ) otherlv_6= '(' (otherlv_7= '*' | ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )? ) otherlv_11= ')'
                    {
                    // InternalSms.g:2530:4: ( (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==18) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==34) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalSms.g:2531:5: (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                            {
                            // InternalSms.g:2531:5: (otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                            // InternalSms.g:2532:6: otherlv_0= 'grab' otherlv_1= 'query' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                            {
                            otherlv_0=(Token)match(input,18,FOLLOW_37); 

                            						newLeafNode(otherlv_0, grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_0());
                            					
                            otherlv_1=(Token)match(input,41,FOLLOW_3); 

                            						newLeafNode(otherlv_1, grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_1());
                            					
                            // InternalSms.g:2540:6: ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                            // InternalSms.g:2541:7: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                            {
                            // InternalSms.g:2541:7: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                            // InternalSms.g:2542:8: lv_deductionRule_2_0= ruleSGrabFeatureRule
                            {

                            								newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_0_0_2_0());
                            							
                            pushFollow(FOLLOW_38);
                            lv_deductionRule_2_0=ruleSGrabFeatureRule();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getSQueryRule());
                            								}
                            								set(
                            									current,
                            									"deductionRule",
                            									lv_deductionRule_2_0,
                            									"com.mimacom.ddd.sm.sms.Sms.SGrabFeatureRule");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSms.g:2561:5: (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                            {
                            // InternalSms.g:2561:5: (otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                            // InternalSms.g:2562:6: otherlv_3= 'morph' otherlv_4= 'query' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                            {
                            otherlv_3=(Token)match(input,34,FOLLOW_37); 

                            						newLeafNode(otherlv_3, grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_0());
                            					
                            otherlv_4=(Token)match(input,41,FOLLOW_3); 

                            						newLeafNode(otherlv_4, grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_1());
                            					
                            // InternalSms.g:2570:6: ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                            // InternalSms.g:2571:7: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                            {
                            // InternalSms.g:2571:7: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                            // InternalSms.g:2572:8: lv_deductionRule_5_0= ruleSMorphFeatureRule
                            {

                            								newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_0_0_1_2_0());
                            							
                            pushFollow(FOLLOW_38);
                            lv_deductionRule_5_0=ruleSMorphFeatureRule();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getSQueryRule());
                            								}
                            								set(
                            									current,
                            									"deductionRule",
                            									lv_deductionRule_5_0,
                            									"com.mimacom.ddd.sm.sms.Sms.SMorphFeatureRule");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSms.g:2595:4: (otherlv_7= '*' | ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )? )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==43) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==18||LA56_0==31||LA56_0==34||LA56_0==44) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalSms.g:2596:5: otherlv_7= '*'
                            {
                            otherlv_7=(Token)match(input,43,FOLLOW_40); 

                            					newLeafNode(otherlv_7, grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSms.g:2601:5: ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )?
                            {
                            // InternalSms.g:2601:5: ( ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )* )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==18||LA55_0==31||LA55_0==34) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // InternalSms.g:2602:6: ( (lv_parameters_8_0= ruleSQueryParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )*
                                    {
                                    // InternalSms.g:2602:6: ( (lv_parameters_8_0= ruleSQueryParameter ) )
                                    // InternalSms.g:2603:7: (lv_parameters_8_0= ruleSQueryParameter )
                                    {
                                    // InternalSms.g:2603:7: (lv_parameters_8_0= ruleSQueryParameter )
                                    // InternalSms.g:2604:8: lv_parameters_8_0= ruleSQueryParameter
                                    {

                                    								newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_0_0());
                                    							
                                    pushFollow(FOLLOW_41);
                                    lv_parameters_8_0=ruleSQueryParameter();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getSQueryRule());
                                    								}
                                    								add(
                                    									current,
                                    									"parameters",
                                    									lv_parameters_8_0,
                                    									"com.mimacom.ddd.sm.sms.Sms.SQueryParameter");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalSms.g:2621:6: (otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) ) )*
                                    loop54:
                                    do {
                                        int alt54=2;
                                        int LA54_0 = input.LA(1);

                                        if ( (LA54_0==30) ) {
                                            alt54=1;
                                        }


                                        switch (alt54) {
                                    	case 1 :
                                    	    // InternalSms.g:2622:7: otherlv_9= ',' ( (lv_parameters_10_0= ruleSQueryParameter ) )
                                    	    {
                                    	    otherlv_9=(Token)match(input,30,FOLLOW_42); 

                                    	    							newLeafNode(otherlv_9, grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0());
                                    	    						
                                    	    // InternalSms.g:2626:7: ( (lv_parameters_10_0= ruleSQueryParameter ) )
                                    	    // InternalSms.g:2627:8: (lv_parameters_10_0= ruleSQueryParameter )
                                    	    {
                                    	    // InternalSms.g:2627:8: (lv_parameters_10_0= ruleSQueryParameter )
                                    	    // InternalSms.g:2628:9: lv_parameters_10_0= ruleSQueryParameter
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_1_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_41);
                                    	    lv_parameters_10_0=ruleSQueryParameter();

                                    	    state._fsp--;


                                    	    									if (current==null) {
                                    	    										current = createModelElementForParent(grammarAccess.getSQueryRule());
                                    	    									}
                                    	    									add(
                                    	    										current,
                                    	    										"parameters",
                                    	    										lv_parameters_10_0,
                                    	    										"com.mimacom.ddd.sm.sms.Sms.SQueryParameter");
                                    	    									afterParserOrEnumRuleCall();
                                    	    								

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
                            break;

                    }

                    otherlv_11=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:2654:3: (otherlv_12= 'ditch' otherlv_13= 'query' ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSms.g:2654:3: (otherlv_12= 'ditch' otherlv_13= 'query' ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    // InternalSms.g:2655:4: otherlv_12= 'ditch' otherlv_13= 'query' ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_12, grammarAccess.getSQueryAccess().getDitchKeyword_1_0());
                    			
                    otherlv_13=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getSQueryAccess().getQueryKeyword_1_1());
                    			
                    // InternalSms.g:2663:4: ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    // InternalSms.g:2664:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    {
                    // InternalSms.g:2664:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    // InternalSms.g:2665:6: lv_deductionRule_14_0= ruleSDitchFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_14_0=ruleSDitchFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_14_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SDitchFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSms.g:2684:3: ( ( (lv_name_15_0= RULE_ID ) ) otherlv_16= '(' ( ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )* )? otherlv_20= ')' otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) ( (lv_multiplicity_23_0= ruleSMultiplicity ) )? (otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) ) )? )
                    {
                    // InternalSms.g:2684:3: ( ( (lv_name_15_0= RULE_ID ) ) otherlv_16= '(' ( ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )* )? otherlv_20= ')' otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) ( (lv_multiplicity_23_0= ruleSMultiplicity ) )? (otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) ) )? )
                    // InternalSms.g:2685:4: ( (lv_name_15_0= RULE_ID ) ) otherlv_16= '(' ( ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )* )? otherlv_20= ')' otherlv_21= ':' ( (otherlv_22= RULE_ID ) ) ( (lv_multiplicity_23_0= ruleSMultiplicity ) )? (otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) ) )?
                    {
                    // InternalSms.g:2685:4: ( (lv_name_15_0= RULE_ID ) )
                    // InternalSms.g:2686:5: (lv_name_15_0= RULE_ID )
                    {
                    // InternalSms.g:2686:5: (lv_name_15_0= RULE_ID )
                    // InternalSms.g:2687:6: lv_name_15_0= RULE_ID
                    {
                    lv_name_15_0=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(lv_name_15_0, grammarAccess.getSQueryAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_15_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,42,FOLLOW_43); 

                    				newLeafNode(otherlv_16, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSms.g:2707:4: ( ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )* )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==18||LA58_0==31||LA58_0==34) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalSms.g:2708:5: ( (lv_parameters_17_0= ruleSQueryParameter ) ) (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )*
                            {
                            // InternalSms.g:2708:5: ( (lv_parameters_17_0= ruleSQueryParameter ) )
                            // InternalSms.g:2709:6: (lv_parameters_17_0= ruleSQueryParameter )
                            {
                            // InternalSms.g:2709:6: (lv_parameters_17_0= ruleSQueryParameter )
                            // InternalSms.g:2710:7: lv_parameters_17_0= ruleSQueryParameter
                            {

                            							newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_0_0());
                            						
                            pushFollow(FOLLOW_41);
                            lv_parameters_17_0=ruleSQueryParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSQueryRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_17_0,
                            								"com.mimacom.ddd.sm.sms.Sms.SQueryParameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalSms.g:2727:5: (otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==30) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // InternalSms.g:2728:6: otherlv_18= ',' ( (lv_parameters_19_0= ruleSQueryParameter ) )
                            	    {
                            	    otherlv_18=(Token)match(input,30,FOLLOW_42); 

                            	    						newLeafNode(otherlv_18, grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalSms.g:2732:6: ( (lv_parameters_19_0= ruleSQueryParameter ) )
                            	    // InternalSms.g:2733:7: (lv_parameters_19_0= ruleSQueryParameter )
                            	    {
                            	    // InternalSms.g:2733:7: (lv_parameters_19_0= ruleSQueryParameter )
                            	    // InternalSms.g:2734:8: lv_parameters_19_0= ruleSQueryParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_41);
                            	    lv_parameters_19_0=ruleSQueryParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSQueryRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_19_0,
                            	    									"com.mimacom.ddd.sm.sms.Sms.SQueryParameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

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

                    otherlv_20=(Token)match(input,44,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3());
                    			
                    otherlv_21=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getSQueryAccess().getColonKeyword_2_4());
                    			
                    // InternalSms.g:2761:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSms.g:2762:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSms.g:2762:5: (otherlv_22= RULE_ID )
                    // InternalSms.g:2763:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_44); 

                    						newLeafNode(otherlv_22, grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0());
                    					

                    }


                    }

                    // InternalSms.g:2774:4: ( (lv_multiplicity_23_0= ruleSMultiplicity ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==42) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalSms.g:2775:5: (lv_multiplicity_23_0= ruleSMultiplicity )
                            {
                            // InternalSms.g:2775:5: (lv_multiplicity_23_0= ruleSMultiplicity )
                            // InternalSms.g:2776:6: lv_multiplicity_23_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_2_6_0());
                            					
                            pushFollow(FOLLOW_45);
                            lv_multiplicity_23_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSQueryRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_23_0,
                            							"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:2793:4: (otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==45) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalSms.g:2794:5: otherlv_24= 'returns' ( (lv_returns_25_0= ruleSExpression ) )
                            {
                            otherlv_24=(Token)match(input,45,FOLLOW_18); 

                            					newLeafNode(otherlv_24, grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0());
                            				
                            // InternalSms.g:2798:5: ( (lv_returns_25_0= ruleSExpression ) )
                            // InternalSms.g:2799:6: (lv_returns_25_0= ruleSExpression )
                            {
                            // InternalSms.g:2799:6: (lv_returns_25_0= ruleSExpression )
                            // InternalSms.g:2800:7: lv_returns_25_0= ruleSExpression
                            {

                            							newCompositeNode(grammarAccess.getSQueryAccess().getReturnsSExpressionParserRuleCall_2_7_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_returns_25_0=ruleSExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSQueryRule());
                            							}
                            							set(
                            								current,
                            								"returns",
                            								lv_returns_25_0,
                            								"com.mimacom.ddd.sm.sms.Sms.SExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleSQuery"


    // $ANTLR start "entryRuleSQueryParameter"
    // InternalSms.g:2823:1: entryRuleSQueryParameter returns [EObject current=null] : iv_ruleSQueryParameter= ruleSQueryParameter EOF ;
    public final EObject entryRuleSQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryParameter = null;


        try {
            // InternalSms.g:2823:56: (iv_ruleSQueryParameter= ruleSQueryParameter EOF )
            // InternalSms.g:2824:2: iv_ruleSQueryParameter= ruleSQueryParameter EOF
            {
             newCompositeNode(grammarAccess.getSQueryParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSQueryParameter=ruleSQueryParameter();

            state._fsp--;

             current =iv_ruleSQueryParameter; 
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
    // $ANTLR end "entryRuleSQueryParameter"


    // $ANTLR start "ruleSQueryParameter"
    // InternalSms.g:2830:1: ruleSQueryParameter returns [EObject current=null] : ( (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabFeatureRule ) ) ) | (otherlv_2= 'morph' ( (lv_deductionRule_3_0= ruleSMorphFeatureRule ) ) ) | (otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchFeatureRule ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleSMultiplicity ) )? ) ) ;
    public final EObject ruleSQueryParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_deductionRule_1_0 = null;

        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_5_0 = null;

        EObject lv_multiplicity_9_0 = null;



        	enterRule();

        try {
            // InternalSms.g:2836:2: ( ( (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabFeatureRule ) ) ) | (otherlv_2= 'morph' ( (lv_deductionRule_3_0= ruleSMorphFeatureRule ) ) ) | (otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchFeatureRule ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleSMultiplicity ) )? ) ) )
            // InternalSms.g:2837:2: ( (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabFeatureRule ) ) ) | (otherlv_2= 'morph' ( (lv_deductionRule_3_0= ruleSMorphFeatureRule ) ) ) | (otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchFeatureRule ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleSMultiplicity ) )? ) )
            {
            // InternalSms.g:2837:2: ( (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabFeatureRule ) ) ) | (otherlv_2= 'morph' ( (lv_deductionRule_3_0= ruleSMorphFeatureRule ) ) ) | (otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchFeatureRule ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleSMultiplicity ) )? ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt63=1;
                }
                break;
            case 34:
                {
                alt63=2;
                }
                break;
            case 31:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalSms.g:2838:3: (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSms.g:2838:3: (otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabFeatureRule ) ) )
                    // InternalSms.g:2839:4: otherlv_0= 'grab' ( (lv_deductionRule_1_0= ruleSGrabFeatureRule ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_0());
                    			
                    // InternalSms.g:2843:4: ( (lv_deductionRule_1_0= ruleSGrabFeatureRule ) )
                    // InternalSms.g:2844:5: (lv_deductionRule_1_0= ruleSGrabFeatureRule )
                    {
                    // InternalSms.g:2844:5: (lv_deductionRule_1_0= ruleSGrabFeatureRule )
                    // InternalSms.g:2845:6: lv_deductionRule_1_0= ruleSGrabFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSQueryParameterAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_1_0=ruleSGrabFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_1_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SGrabFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:2864:3: (otherlv_2= 'morph' ( (lv_deductionRule_3_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSms.g:2864:3: (otherlv_2= 'morph' ( (lv_deductionRule_3_0= ruleSMorphFeatureRule ) ) )
                    // InternalSms.g:2865:4: otherlv_2= 'morph' ( (lv_deductionRule_3_0= ruleSMorphFeatureRule ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_0());
                    			
                    // InternalSms.g:2869:4: ( (lv_deductionRule_3_0= ruleSMorphFeatureRule ) )
                    // InternalSms.g:2870:5: (lv_deductionRule_3_0= ruleSMorphFeatureRule )
                    {
                    // InternalSms.g:2870:5: (lv_deductionRule_3_0= ruleSMorphFeatureRule )
                    // InternalSms.g:2871:6: lv_deductionRule_3_0= ruleSMorphFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSQueryParameterAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_3_0=ruleSMorphFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_3_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SMorphFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSms.g:2890:3: (otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchFeatureRule ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleSMultiplicity ) )? )
                    {
                    // InternalSms.g:2890:3: (otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchFeatureRule ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleSMultiplicity ) )? )
                    // InternalSms.g:2891:4: otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchFeatureRule ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleSMultiplicity ) )?
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_0());
                    			
                    // InternalSms.g:2895:4: ( (lv_deductionRule_5_0= ruleSDitchFeatureRule ) )
                    // InternalSms.g:2896:5: (lv_deductionRule_5_0= ruleSDitchFeatureRule )
                    {
                    // InternalSms.g:2896:5: (lv_deductionRule_5_0= ruleSDitchFeatureRule )
                    // InternalSms.g:2897:6: lv_deductionRule_5_0= ruleSDitchFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSQueryParameterAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_deductionRule_5_0=ruleSDitchFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_5_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SDitchFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSms.g:2914:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalSms.g:2915:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalSms.g:2915:5: (lv_name_6_0= RULE_ID )
                    // InternalSms.g:2916:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSQueryParameterAccess().getColonKeyword_2_3());
                    			
                    // InternalSms.g:2936:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSms.g:2937:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSms.g:2937:5: (otherlv_8= RULE_ID )
                    // InternalSms.g:2938:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryParameterRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_8, grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_2_4_0());
                    					

                    }


                    }

                    // InternalSms.g:2949:4: ( (lv_multiplicity_9_0= ruleSMultiplicity ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==42) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalSms.g:2950:5: (lv_multiplicity_9_0= ruleSMultiplicity )
                            {
                            // InternalSms.g:2950:5: (lv_multiplicity_9_0= ruleSMultiplicity )
                            // InternalSms.g:2951:6: lv_multiplicity_9_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_2_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_multiplicity_9_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_9_0,
                            							"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleSQueryParameter"


    // $ANTLR start "entryRuleSExpression"
    // InternalSms.g:2973:1: entryRuleSExpression returns [EObject current=null] : iv_ruleSExpression= ruleSExpression EOF ;
    public final EObject entryRuleSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSExpression = null;


        try {
            // InternalSms.g:2973:52: (iv_ruleSExpression= ruleSExpression EOF )
            // InternalSms.g:2974:2: iv_ruleSExpression= ruleSExpression EOF
            {
             newCompositeNode(grammarAccess.getSExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSExpression=ruleSExpression();

            state._fsp--;

             current =iv_ruleSExpression; 
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
    // $ANTLR end "entryRuleSExpression"


    // $ANTLR start "ruleSExpression"
    // InternalSms.g:2980:1: ruleSExpression returns [EObject current=null] : ( (lv_expr_0_0= RULE_STRING ) ) ;
    public final EObject ruleSExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_0=null;


        	enterRule();

        try {
            // InternalSms.g:2986:2: ( ( (lv_expr_0_0= RULE_STRING ) ) )
            // InternalSms.g:2987:2: ( (lv_expr_0_0= RULE_STRING ) )
            {
            // InternalSms.g:2987:2: ( (lv_expr_0_0= RULE_STRING ) )
            // InternalSms.g:2988:3: (lv_expr_0_0= RULE_STRING )
            {
            // InternalSms.g:2988:3: (lv_expr_0_0= RULE_STRING )
            // InternalSms.g:2989:4: lv_expr_0_0= RULE_STRING
            {
            lv_expr_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_expr_0_0, grammarAccess.getSExpressionAccess().getExprSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"expr",
            					lv_expr_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleSExpression"


    // $ANTLR start "entryRuleSQualifiedNameWithWildcard"
    // InternalSms.g:3008:1: entryRuleSQualifiedNameWithWildcard returns [String current=null] : iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF ;
    public final String entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedNameWithWildcard = null;


        try {
            // InternalSms.g:3008:66: (iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF )
            // InternalSms.g:3009:2: iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getSQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSQualifiedNameWithWildcard=ruleSQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleSQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleSQualifiedNameWithWildcard"


    // $ANTLR start "ruleSQualifiedNameWithWildcard"
    // InternalSms.g:3015:1: ruleSQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSms.g:3021:2: ( (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) )
            // InternalSms.g:3022:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            {
            // InternalSms.g:3022:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            // InternalSms.g:3023:3: this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_SQualifiedName_0=ruleSQualifiedName();

            state._fsp--;


            			current.merge(this_SQualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSms.g:3033:3: (kw= '.*' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==46) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSms.g:3034:4: kw= '.*'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleSQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleSQualifiedName"
    // InternalSms.g:3044:1: entryRuleSQualifiedName returns [String current=null] : iv_ruleSQualifiedName= ruleSQualifiedName EOF ;
    public final String entryRuleSQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedName = null;


        try {
            // InternalSms.g:3044:54: (iv_ruleSQualifiedName= ruleSQualifiedName EOF )
            // InternalSms.g:3045:2: iv_ruleSQualifiedName= ruleSQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getSQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSQualifiedName=ruleSQualifiedName();

            state._fsp--;

             current =iv_ruleSQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleSQualifiedName"


    // $ANTLR start "ruleSQualifiedName"
    // InternalSms.g:3051:1: ruleSQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSms.g:3057:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSms.g:3058:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSms.g:3058:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSms.g:3059:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSms.g:3066:3: (kw= '.' this_ID_2= RULE_ID )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==47) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSms.g:3067:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop65;
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
    // $ANTLR end "ruleSQualifiedName"


    // $ANTLR start "entryRuleSMultiplicity"
    // InternalSms.g:3084:1: entryRuleSMultiplicity returns [EObject current=null] : iv_ruleSMultiplicity= ruleSMultiplicity EOF ;
    public final EObject entryRuleSMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMultiplicity = null;


        try {
            // InternalSms.g:3084:54: (iv_ruleSMultiplicity= ruleSMultiplicity EOF )
            // InternalSms.g:3085:2: iv_ruleSMultiplicity= ruleSMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getSMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMultiplicity=ruleSMultiplicity();

            state._fsp--;

             current =iv_ruleSMultiplicity; 
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
    // $ANTLR end "entryRuleSMultiplicity"


    // $ANTLR start "ruleSMultiplicity"
    // InternalSms.g:3091:1: ruleSMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalSms.g:3097:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalSms.g:3098:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalSms.g:3098:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalSms.g:3099:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSms.g:3103:3: ( (lv_minOccurs_1_0= RULE_INT ) )
            // InternalSms.g:3104:4: (lv_minOccurs_1_0= RULE_INT )
            {
            // InternalSms.g:3104:4: (lv_minOccurs_1_0= RULE_INT )
            // InternalSms.g:3105:5: lv_minOccurs_1_0= RULE_INT
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            					newLeafNode(lv_minOccurs_1_0, grammarAccess.getSMultiplicityAccess().getMinOccursINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMultiplicityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minOccurs",
            						lv_minOccurs_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSms.g:3125:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalSms.g:3126:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalSms.g:3126:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalSms.g:3127:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
            {

            					newCompositeNode(grammarAccess.getSMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_maxOccurs_3_0=ruleMULTIPLICITY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSMultiplicityRule());
            					}
            					set(
            						current,
            						"maxOccurs",
            						lv_maxOccurs_3_0,
            						"com.mimacom.ddd.sm.sms.Sms.MULTIPLICITY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSMultiplicityAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleSMultiplicity"


    // $ANTLR start "entryRuleMULTIPLICITY"
    // InternalSms.g:3152:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalSms.g:3152:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalSms.g:3153:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
            {
             newCompositeNode(grammarAccess.getMULTIPLICITYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMULTIPLICITY=ruleMULTIPLICITY();

            state._fsp--;

             current =iv_ruleMULTIPLICITY.getText(); 
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
    // $ANTLR end "entryRuleMULTIPLICITY"


    // $ANTLR start "ruleMULTIPLICITY"
    // InternalSms.g:3159:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSms.g:3165:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSms.g:3166:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSms.g:3166:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT) ) {
                alt66=1;
            }
            else if ( (LA66_0==43) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalSms.g:3167:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSms.g:3175:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleMULTIPLICITY"


    // $ANTLR start "ruleSAssociationKind"
    // InternalSms.g:3184:1: ruleSAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleSAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSms.g:3190:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalSms.g:3191:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalSms.g:3191:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==37) ) {
                alt67=1;
            }
            else if ( (LA67_0==38) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalSms.g:3192:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalSms.g:3192:3: (enumLiteral_0= 'reference' )
                    // InternalSms.g:3193:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:3200:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalSms.g:3200:3: (enumLiteral_1= 'composite' )
                    // InternalSms.g:3201:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSAssociationKind"


    // $ANTLR start "ruleSAssociationKindInverse"
    // InternalSms.g:3211:1: ruleSAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleSAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSms.g:3217:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalSms.g:3218:2: (enumLiteral_0= 'inverse' )
            {
            // InternalSms.g:3218:2: (enumLiteral_0= 'inverse' )
            // InternalSms.g:3219:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

            			current = grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleSAssociationKindInverse"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\22\2\uffff\1\35\1\uffff\2\40\1\41\2\uffff\3\41";
    static final String dfa_3s = "\1\44\2\uffff\1\44\1\uffff\3\44\2\uffff\3\44";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\3\3\uffff\1\4\1\5\3\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\5\uffff\1\1\3\uffff\1\2\1\4\2\uffff\1\7\1\10\1\5\1\6\1\11",
            "",
            "",
            "\1\4\2\uffff\1\12\1\10\2\uffff\1\11",
            "",
            "\1\13\1\10\2\uffff\1\11",
            "\1\14\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "",
            "",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "944:2: (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001F310C1002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001F310C0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001F31240000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080640010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040600000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080040010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000200F480640010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000200E480040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000180480040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000480040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100480040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000240000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080000000040L});

}