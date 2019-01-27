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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'import'", "'spoof'", "'morph'", "'name'", "'='", "'type'", "'aggregate'", "'{'", "'}'", "'constraint'", "':'", "'deduced'", "'primitive'", "'redefines'", "'realizes'", "'enumeration'", "','", "'abstract'", "'root'", "'detail'", "'extends'", "'derived'", "'composite'", "'key'", "'('", "')'", "'returns'", "'.*'", "'.'", "'..'", "'*'", "'reference'", "'inverse'"
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
    public static final int T__44=44;
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
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=23 && LA2_0<=24)||LA2_0==27||(LA2_0>=29 && LA2_0<=31)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==18) ) {
                    alt2=2;
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


    // $ANTLR start "entryRuleSDeductionRule"
    // InternalSms.g:209:1: entryRuleSDeductionRule returns [EObject current=null] : iv_ruleSDeductionRule= ruleSDeductionRule EOF ;
    public final EObject entryRuleSDeductionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDeductionRule = null;


        try {
            // InternalSms.g:209:55: (iv_ruleSDeductionRule= ruleSDeductionRule EOF )
            // InternalSms.g:210:2: iv_ruleSDeductionRule= ruleSDeductionRule EOF
            {
             newCompositeNode(grammarAccess.getSDeductionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDeductionRule=ruleSDeductionRule();

            state._fsp--;

             current =iv_ruleSDeductionRule; 
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
    // $ANTLR end "entryRuleSDeductionRule"


    // $ANTLR start "ruleSDeductionRule"
    // InternalSms.g:216:1: ruleSDeductionRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) ( (lv_transform_1_0= ruleSTransform ) ) ) ;
    public final EObject ruleSDeductionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_transform_1_0 = null;



        	enterRule();

        try {
            // InternalSms.g:222:2: ( ( ( ( ruleSQualifiedName ) ) ( (lv_transform_1_0= ruleSTransform ) ) ) )
            // InternalSms.g:223:2: ( ( ( ruleSQualifiedName ) ) ( (lv_transform_1_0= ruleSTransform ) ) )
            {
            // InternalSms.g:223:2: ( ( ( ruleSQualifiedName ) ) ( (lv_transform_1_0= ruleSTransform ) ) )
            // InternalSms.g:224:3: ( ( ruleSQualifiedName ) ) ( (lv_transform_1_0= ruleSTransform ) )
            {
            // InternalSms.g:224:3: ( ( ruleSQualifiedName ) )
            // InternalSms.g:225:4: ( ruleSQualifiedName )
            {
            // InternalSms.g:225:4: ( ruleSQualifiedName )
            // InternalSms.g:226:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSDeductionRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSDeductionRuleAccess().getSourceDNamedElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_6);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSms.g:240:3: ( (lv_transform_1_0= ruleSTransform ) )
            // InternalSms.g:241:4: (lv_transform_1_0= ruleSTransform )
            {
            // InternalSms.g:241:4: (lv_transform_1_0= ruleSTransform )
            // InternalSms.g:242:5: lv_transform_1_0= ruleSTransform
            {

            					newCompositeNode(grammarAccess.getSDeductionRuleAccess().getTransformSTransformParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_transform_1_0=ruleSTransform();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSDeductionRuleRule());
            					}
            					set(
            						current,
            						"transform",
            						lv_transform_1_0,
            						"com.mimacom.ddd.sm.sms.Sms.STransform");
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
    // $ANTLR end "ruleSDeductionRule"


    // $ANTLR start "entryRuleSMemberDeductionRule"
    // InternalSms.g:263:1: entryRuleSMemberDeductionRule returns [EObject current=null] : iv_ruleSMemberDeductionRule= ruleSMemberDeductionRule EOF ;
    public final EObject entryRuleSMemberDeductionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMemberDeductionRule = null;


        try {
            // InternalSms.g:263:61: (iv_ruleSMemberDeductionRule= ruleSMemberDeductionRule EOF )
            // InternalSms.g:264:2: iv_ruleSMemberDeductionRule= ruleSMemberDeductionRule EOF
            {
             newCompositeNode(grammarAccess.getSMemberDeductionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMemberDeductionRule=ruleSMemberDeductionRule();

            state._fsp--;

             current =iv_ruleSMemberDeductionRule; 
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
    // $ANTLR end "entryRuleSMemberDeductionRule"


    // $ANTLR start "ruleSMemberDeductionRule"
    // InternalSms.g:270:1: ruleSMemberDeductionRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_transform_1_0= ruleSTransform ) ) ) ;
    public final EObject ruleSMemberDeductionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_transform_1_0 = null;



        	enterRule();

        try {
            // InternalSms.g:276:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_transform_1_0= ruleSTransform ) ) ) )
            // InternalSms.g:277:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_transform_1_0= ruleSTransform ) ) )
            {
            // InternalSms.g:277:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_transform_1_0= ruleSTransform ) ) )
            // InternalSms.g:278:3: ( (otherlv_0= RULE_ID ) ) ( (lv_transform_1_0= ruleSTransform ) )
            {
            // InternalSms.g:278:3: ( (otherlv_0= RULE_ID ) )
            // InternalSms.g:279:4: (otherlv_0= RULE_ID )
            {
            // InternalSms.g:279:4: (otherlv_0= RULE_ID )
            // InternalSms.g:280:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMemberDeductionRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getSMemberDeductionRuleAccess().getSourceDNamedElementCrossReference_0_0());
            				

            }


            }

            // InternalSms.g:291:3: ( (lv_transform_1_0= ruleSTransform ) )
            // InternalSms.g:292:4: (lv_transform_1_0= ruleSTransform )
            {
            // InternalSms.g:292:4: (lv_transform_1_0= ruleSTransform )
            // InternalSms.g:293:5: lv_transform_1_0= ruleSTransform
            {

            					newCompositeNode(grammarAccess.getSMemberDeductionRuleAccess().getTransformSTransformParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_transform_1_0=ruleSTransform();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSMemberDeductionRuleRule());
            					}
            					set(
            						current,
            						"transform",
            						lv_transform_1_0,
            						"com.mimacom.ddd.sm.sms.Sms.STransform");
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
    // $ANTLR end "ruleSMemberDeductionRule"


    // $ANTLR start "entryRuleSTransform"
    // InternalSms.g:314:1: entryRuleSTransform returns [EObject current=null] : iv_ruleSTransform= ruleSTransform EOF ;
    public final EObject entryRuleSTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTransform = null;


        try {
            // InternalSms.g:314:51: (iv_ruleSTransform= ruleSTransform EOF )
            // InternalSms.g:315:2: iv_ruleSTransform= ruleSTransform EOF
            {
             newCompositeNode(grammarAccess.getSTransformRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTransform=ruleSTransform();

            state._fsp--;

             current =iv_ruleSTransform; 
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
    // $ANTLR end "entryRuleSTransform"


    // $ANTLR start "ruleSTransform"
    // InternalSms.g:321:1: ruleSTransform returns [EObject current=null] : (this_SSpoofTransform_0= ruleSSpoofTransform | this_SMorphTransform_1= ruleSMorphTransform ) ;
    public final EObject ruleSTransform() throws RecognitionException {
        EObject current = null;

        EObject this_SSpoofTransform_0 = null;

        EObject this_SMorphTransform_1 = null;



        	enterRule();

        try {
            // InternalSms.g:327:2: ( (this_SSpoofTransform_0= ruleSSpoofTransform | this_SMorphTransform_1= ruleSMorphTransform ) )
            // InternalSms.g:328:2: (this_SSpoofTransform_0= ruleSSpoofTransform | this_SMorphTransform_1= ruleSMorphTransform )
            {
            // InternalSms.g:328:2: (this_SSpoofTransform_0= ruleSSpoofTransform | this_SMorphTransform_1= ruleSMorphTransform )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSms.g:329:3: this_SSpoofTransform_0= ruleSSpoofTransform
                    {

                    			newCompositeNode(grammarAccess.getSTransformAccess().getSSpoofTransformParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SSpoofTransform_0=ruleSSpoofTransform();

                    state._fsp--;


                    			current = this_SSpoofTransform_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSms.g:338:3: this_SMorphTransform_1= ruleSMorphTransform
                    {

                    			newCompositeNode(grammarAccess.getSTransformAccess().getSMorphTransformParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SMorphTransform_1=ruleSMorphTransform();

                    state._fsp--;


                    			current = this_SMorphTransform_1;
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
    // $ANTLR end "ruleSTransform"


    // $ANTLR start "entryRuleSSpoofTransform"
    // InternalSms.g:350:1: entryRuleSSpoofTransform returns [EObject current=null] : iv_ruleSSpoofTransform= ruleSSpoofTransform EOF ;
    public final EObject entryRuleSSpoofTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSSpoofTransform = null;


        try {
            // InternalSms.g:350:56: (iv_ruleSSpoofTransform= ruleSSpoofTransform EOF )
            // InternalSms.g:351:2: iv_ruleSSpoofTransform= ruleSSpoofTransform EOF
            {
             newCompositeNode(grammarAccess.getSSpoofTransformRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSSpoofTransform=ruleSSpoofTransform();

            state._fsp--;

             current =iv_ruleSSpoofTransform; 
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
    // $ANTLR end "entryRuleSSpoofTransform"


    // $ANTLR start "ruleSSpoofTransform"
    // InternalSms.g:357:1: ruleSSpoofTransform returns [EObject current=null] : ( () otherlv_1= 'spoof' ) ;
    public final EObject ruleSSpoofTransform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSms.g:363:2: ( ( () otherlv_1= 'spoof' ) )
            // InternalSms.g:364:2: ( () otherlv_1= 'spoof' )
            {
            // InternalSms.g:364:2: ( () otherlv_1= 'spoof' )
            // InternalSms.g:365:3: () otherlv_1= 'spoof'
            {
            // InternalSms.g:365:3: ()
            // InternalSms.g:366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSSpoofTransformAccess().getSSpoofTransformAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSSpoofTransformAccess().getSpoofKeyword_1());
            		

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
    // $ANTLR end "ruleSSpoofTransform"


    // $ANTLR start "entryRuleSMorphTransform"
    // InternalSms.g:380:1: entryRuleSMorphTransform returns [EObject current=null] : iv_ruleSMorphTransform= ruleSMorphTransform EOF ;
    public final EObject entryRuleSMorphTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphTransform = null;


        try {
            // InternalSms.g:380:56: (iv_ruleSMorphTransform= ruleSMorphTransform EOF )
            // InternalSms.g:381:2: iv_ruleSMorphTransform= ruleSMorphTransform EOF
            {
             newCompositeNode(grammarAccess.getSMorphTransformRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMorphTransform=ruleSMorphTransform();

            state._fsp--;

             current =iv_ruleSMorphTransform; 
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
    // $ANTLR end "entryRuleSMorphTransform"


    // $ANTLR start "ruleSMorphTransform"
    // InternalSms.g:387:1: ruleSMorphTransform returns [EObject current=null] : ( () otherlv_1= 'morph' (otherlv_2= 'name' otherlv_3= '=' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'type' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ( (lv_remultiplyTo_8_0= ruleSMultiplicity ) )? )? ) ;
    public final EObject ruleSMorphTransform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_renameTo_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_remultiplyTo_8_0 = null;



        	enterRule();

        try {
            // InternalSms.g:393:2: ( ( () otherlv_1= 'morph' (otherlv_2= 'name' otherlv_3= '=' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'type' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ( (lv_remultiplyTo_8_0= ruleSMultiplicity ) )? )? ) )
            // InternalSms.g:394:2: ( () otherlv_1= 'morph' (otherlv_2= 'name' otherlv_3= '=' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'type' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ( (lv_remultiplyTo_8_0= ruleSMultiplicity ) )? )? )
            {
            // InternalSms.g:394:2: ( () otherlv_1= 'morph' (otherlv_2= 'name' otherlv_3= '=' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'type' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ( (lv_remultiplyTo_8_0= ruleSMultiplicity ) )? )? )
            // InternalSms.g:395:3: () otherlv_1= 'morph' (otherlv_2= 'name' otherlv_3= '=' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'type' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ( (lv_remultiplyTo_8_0= ruleSMultiplicity ) )? )?
            {
            // InternalSms.g:395:3: ()
            // InternalSms.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSMorphTransformAccess().getSMorphTransformAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSMorphTransformAccess().getMorphKeyword_1());
            		
            // InternalSms.g:406:3: (otherlv_2= 'name' otherlv_3= '=' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSms.g:407:4: otherlv_2= 'name' otherlv_3= '=' ( (lv_renameTo_4_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getSMorphTransformAccess().getNameKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSMorphTransformAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalSms.g:415:4: ( (lv_renameTo_4_0= RULE_ID ) )
                    // InternalSms.g:416:5: (lv_renameTo_4_0= RULE_ID )
                    {
                    // InternalSms.g:416:5: (lv_renameTo_4_0= RULE_ID )
                    // InternalSms.g:417:6: lv_renameTo_4_0= RULE_ID
                    {
                    lv_renameTo_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_renameTo_4_0, grammarAccess.getSMorphTransformAccess().getRenameToIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphTransformRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSms.g:434:3: (otherlv_5= 'type' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ( (lv_remultiplyTo_8_0= ruleSMultiplicity ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSms.g:435:4: otherlv_5= 'type' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ( (lv_remultiplyTo_8_0= ruleSMultiplicity ) )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSMorphTransformAccess().getTypeKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSMorphTransformAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalSms.g:443:4: ( (otherlv_7= RULE_ID ) )
                    // InternalSms.g:444:5: (otherlv_7= RULE_ID )
                    {
                    // InternalSms.g:444:5: (otherlv_7= RULE_ID )
                    // InternalSms.g:445:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphTransformRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_7, grammarAccess.getSMorphTransformAccess().getRetypeToSTypeCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalSms.g:456:4: ( (lv_remultiplyTo_8_0= ruleSMultiplicity ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==36) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSms.g:457:5: (lv_remultiplyTo_8_0= ruleSMultiplicity )
                            {
                            // InternalSms.g:457:5: (lv_remultiplyTo_8_0= ruleSMultiplicity )
                            // InternalSms.g:458:6: lv_remultiplyTo_8_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSMorphTransformAccess().getRemultiplyToSMultiplicityParserRuleCall_3_3_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_remultiplyTo_8_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSMorphTransformRule());
                            						}
                            						set(
                            							current,
                            							"remultiplyTo",
                            							lv_remultiplyTo_8_0,
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
    // $ANTLR end "ruleSMorphTransform"


    // $ANTLR start "entryRuleSAggregate"
    // InternalSms.g:480:1: entryRuleSAggregate returns [EObject current=null] : iv_ruleSAggregate= ruleSAggregate EOF ;
    public final EObject entryRuleSAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAggregate = null;


        try {
            // InternalSms.g:480:51: (iv_ruleSAggregate= ruleSAggregate EOF )
            // InternalSms.g:481:2: iv_ruleSAggregate= ruleSAggregate EOF
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
    // InternalSms.g:487:1: ruleSAggregate returns [EObject current=null] : ( () otherlv_1= 'aggregate' otherlv_2= '{' ( (lv_types_3_0= ruleSType ) )* otherlv_4= '}' ) ;
    public final EObject ruleSAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalSms.g:493:2: ( ( () otherlv_1= 'aggregate' otherlv_2= '{' ( (lv_types_3_0= ruleSType ) )* otherlv_4= '}' ) )
            // InternalSms.g:494:2: ( () otherlv_1= 'aggregate' otherlv_2= '{' ( (lv_types_3_0= ruleSType ) )* otherlv_4= '}' )
            {
            // InternalSms.g:494:2: ( () otherlv_1= 'aggregate' otherlv_2= '{' ( (lv_types_3_0= ruleSType ) )* otherlv_4= '}' )
            // InternalSms.g:495:3: () otherlv_1= 'aggregate' otherlv_2= '{' ( (lv_types_3_0= ruleSType ) )* otherlv_4= '}'
            {
            // InternalSms.g:495:3: ()
            // InternalSms.g:496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSAggregateAccess().getSAggregateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSAggregateAccess().getAggregateKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSms.g:510:3: ( (lv_types_3_0= ruleSType ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=23 && LA7_0<=24)||LA7_0==27||(LA7_0>=29 && LA7_0<=31)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSms.g:511:4: (lv_types_3_0= ruleSType )
            	    {
            	    // InternalSms.g:511:4: (lv_types_3_0= ruleSType )
            	    // InternalSms.g:512:5: lv_types_3_0= ruleSType
            	    {

            	    					newCompositeNode(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_types_3_0=ruleSType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSAggregateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_3_0,
            	    						"com.mimacom.ddd.sm.sms.Sms.SType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalSms.g:537:1: entryRuleSType returns [EObject current=null] : iv_ruleSType= ruleSType EOF ;
    public final EObject entryRuleSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSType = null;


        try {
            // InternalSms.g:537:46: (iv_ruleSType= ruleSType EOF )
            // InternalSms.g:538:2: iv_ruleSType= ruleSType EOF
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
    // InternalSms.g:544:1: ruleSType returns [EObject current=null] : (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SRootType_2= ruleSRootType | this_SDetailType_3= ruleSDetailType ) ;
    public final EObject ruleSType() throws RecognitionException {
        EObject current = null;

        EObject this_SPrimitive_0 = null;

        EObject this_SEnumeration_1 = null;

        EObject this_SRootType_2 = null;

        EObject this_SDetailType_3 = null;



        	enterRule();

        try {
            // InternalSms.g:550:2: ( (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SRootType_2= ruleSRootType | this_SDetailType_3= ruleSDetailType ) )
            // InternalSms.g:551:2: (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SRootType_2= ruleSRootType | this_SDetailType_3= ruleSDetailType )
            {
            // InternalSms.g:551:2: (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SRootType_2= ruleSRootType | this_SDetailType_3= ruleSDetailType )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA8_7 = input.LA(3);

                    if ( (LA8_7==31) ) {
                        alt8=4;
                    }
                    else if ( (LA8_7==30) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    alt8=4;
                    }
                    break;
                case 30:
                    {
                    alt8=3;
                    }
                    break;
                case 24:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                int LA8_4 = input.LA(2);

                if ( (LA8_4==31) ) {
                    alt8=4;
                }
                else if ( (LA8_4==30) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSms.g:552:3: this_SPrimitive_0= ruleSPrimitive
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
                    // InternalSms.g:561:3: this_SEnumeration_1= ruleSEnumeration
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SEnumeration_1=ruleSEnumeration();

                    state._fsp--;


                    			current = this_SEnumeration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSms.g:570:3: this_SRootType_2= ruleSRootType
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSRootTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SRootType_2=ruleSRootType();

                    state._fsp--;


                    			current = this_SRootType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSms.g:579:3: this_SDetailType_3= ruleSDetailType
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSDetailTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SDetailType_3=ruleSDetailType();

                    state._fsp--;


                    			current = this_SDetailType_3;
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
    // InternalSms.g:591:1: entryRuleSConstraint returns [EObject current=null] : iv_ruleSConstraint= ruleSConstraint EOF ;
    public final EObject entryRuleSConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSConstraint = null;


        try {
            // InternalSms.g:591:52: (iv_ruleSConstraint= ruleSConstraint EOF )
            // InternalSms.g:592:2: iv_ruleSConstraint= ruleSConstraint EOF
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
    // InternalSms.g:598:1: ruleSConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) ;
    public final EObject ruleSConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalSms.g:604:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) )
            // InternalSms.g:605:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            {
            // InternalSms.g:605:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            // InternalSms.g:606:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSConstraintAccess().getConstraintKeyword_0());
            		
            // InternalSms.g:610:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSms.g:611:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSms.g:611:4: (lv_name_1_0= RULE_ID )
            // InternalSms.g:612:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSConstraintAccess().getColonKeyword_2());
            		
            // InternalSms.g:632:3: ( (lv_condition_3_0= ruleSExpression ) )
            // InternalSms.g:633:4: (lv_condition_3_0= ruleSExpression )
            {
            // InternalSms.g:633:4: (lv_condition_3_0= ruleSExpression )
            // InternalSms.g:634:5: lv_condition_3_0= ruleSExpression
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
    // InternalSms.g:655:1: entryRuleSPrimitive returns [EObject current=null] : iv_ruleSPrimitive= ruleSPrimitive EOF ;
    public final EObject entryRuleSPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitive = null;


        try {
            // InternalSms.g:655:51: (iv_ruleSPrimitive= ruleSPrimitive EOF )
            // InternalSms.g:656:2: iv_ruleSPrimitive= ruleSPrimitive EOF
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
    // InternalSms.g:662:1: ruleSPrimitive returns [EObject current=null] : ( (otherlv_0= 'deduced' otherlv_1= 'primitive' ( (lv_deductionRule_2_0= ruleSDeductionRule ) ) ) | (otherlv_3= 'primitive' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) ) ) ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' ) ) ;
    public final EObject ruleSPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_constraints_11_0 = null;



        	enterRule();

        try {
            // InternalSms.g:668:2: ( ( (otherlv_0= 'deduced' otherlv_1= 'primitive' ( (lv_deductionRule_2_0= ruleSDeductionRule ) ) ) | (otherlv_3= 'primitive' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) ) ) ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' ) ) )
            // InternalSms.g:669:2: ( (otherlv_0= 'deduced' otherlv_1= 'primitive' ( (lv_deductionRule_2_0= ruleSDeductionRule ) ) ) | (otherlv_3= 'primitive' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) ) ) ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' ) )
            {
            // InternalSms.g:669:2: ( (otherlv_0= 'deduced' otherlv_1= 'primitive' ( (lv_deductionRule_2_0= ruleSDeductionRule ) ) ) | (otherlv_3= 'primitive' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) ) ) ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSms.g:670:3: (otherlv_0= 'deduced' otherlv_1= 'primitive' ( (lv_deductionRule_2_0= ruleSDeductionRule ) ) )
                    {
                    // InternalSms.g:670:3: (otherlv_0= 'deduced' otherlv_1= 'primitive' ( (lv_deductionRule_2_0= ruleSDeductionRule ) ) )
                    // InternalSms.g:671:4: otherlv_0= 'deduced' otherlv_1= 'primitive' ( (lv_deductionRule_2_0= ruleSDeductionRule ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getSPrimitiveAccess().getDeducedKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_1());
                    			
                    // InternalSms.g:679:4: ( (lv_deductionRule_2_0= ruleSDeductionRule ) )
                    // InternalSms.g:680:5: (lv_deductionRule_2_0= ruleSDeductionRule )
                    {
                    // InternalSms.g:680:5: (lv_deductionRule_2_0= ruleSDeductionRule )
                    // InternalSms.g:681:6: lv_deductionRule_2_0= ruleSDeductionRule
                    {

                    						newCompositeNode(grammarAccess.getSPrimitiveAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_2_0=ruleSDeductionRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSPrimitiveRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_2_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SDeductionRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:700:3: (otherlv_3= 'primitive' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) ) ) ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' )
                    {
                    // InternalSms.g:700:3: (otherlv_3= 'primitive' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) ) ) ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' )
                    // InternalSms.g:701:4: otherlv_3= 'primitive' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) ) ) ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_1_0());
                    			
                    // InternalSms.g:705:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalSms.g:706:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalSms.g:706:5: (lv_name_4_0= RULE_ID )
                    // InternalSms.g:707:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSPrimitiveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalSms.g:727:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) ) )
                    // InternalSms.g:728:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) )
                    {
                    // InternalSms.g:728:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* ) )
                    // InternalSms.g:729:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3());
                    					
                    // InternalSms.g:732:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )* )
                    // InternalSms.g:733:7: ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )*
                    {
                    // InternalSms.g:733:7: ( ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( LA9_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0) ) {
                            alt9=1;
                        }
                        else if ( LA9_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSms.g:734:5: ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalSms.g:734:5: ({...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) ) )
                    	    // InternalSms.g:735:6: {...}? => ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSPrimitive", "getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0)");
                    	    }
                    	    // InternalSms.g:735:110: ( ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) ) )
                    	    // InternalSms.g:736:7: ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0);
                    	    						
                    	    // InternalSms.g:739:10: ({...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) ) )
                    	    // InternalSms.g:739:11: {...}? => (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSPrimitive", "true");
                    	    }
                    	    // InternalSms.g:739:20: (otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) ) )
                    	    // InternalSms.g:739:21: otherlv_7= 'redefines' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_1_3_0_0());
                    	    									
                    	    // InternalSms.g:743:10: ( (otherlv_8= RULE_ID ) )
                    	    // InternalSms.g:744:11: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalSms.g:744:11: (otherlv_8= RULE_ID )
                    	    // InternalSms.g:745:12: otherlv_8= RULE_ID
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getSPrimitiveRule());
                    	    												}
                    	    											
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    												newLeafNode(otherlv_8, grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_1_3_0_1_0());
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSms.g:762:5: ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) )
                    	    {
                    	    // InternalSms.g:762:5: ({...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) ) )
                    	    // InternalSms.g:763:6: {...}? => ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSPrimitive", "getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1)");
                    	    }
                    	    // InternalSms.g:763:110: ( ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) ) )
                    	    // InternalSms.g:764:7: ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1);
                    	    						
                    	    // InternalSms.g:767:10: ({...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) ) )
                    	    // InternalSms.g:767:11: {...}? => (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSPrimitive", "true");
                    	    }
                    	    // InternalSms.g:767:20: (otherlv_9= 'realizes' ( ( ruleSQualifiedName ) ) )
                    	    // InternalSms.g:767:21: otherlv_9= 'realizes' ( ( ruleSQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,26,FOLLOW_3); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getSPrimitiveAccess().getRealizesKeyword_1_3_1_0());
                    	    									
                    	    // InternalSms.g:771:10: ( ( ruleSQualifiedName ) )
                    	    // InternalSms.g:772:11: ( ruleSQualifiedName )
                    	    {
                    	    // InternalSms.g:772:11: ( ruleSQualifiedName )
                    	    // InternalSms.g:773:12: ruleSQualifiedName
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getSPrimitiveRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveCrossReference_1_3_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_16);
                    	    ruleSQualifiedName();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3());
                    					

                    }

                    // InternalSms.g:800:4: ( (lv_constraints_11_0= ruleSConstraint ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSms.g:801:5: (lv_constraints_11_0= ruleSConstraint )
                    	    {
                    	    // InternalSms.g:801:5: (lv_constraints_11_0= ruleSConstraint )
                    	    // InternalSms.g:802:6: lv_constraints_11_0= ruleSConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_1_4_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_constraints_11_0=ruleSConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSPrimitiveRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraints",
                    	    							lv_constraints_11_0,
                    	    							"com.mimacom.ddd.sm.sms.Sms.SConstraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_1_5());
                    			

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
    // $ANTLR end "ruleSPrimitive"


    // $ANTLR start "entryRuleSEnumeration"
    // InternalSms.g:828:1: entryRuleSEnumeration returns [EObject current=null] : iv_ruleSEnumeration= ruleSEnumeration EOF ;
    public final EObject entryRuleSEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumeration = null;


        try {
            // InternalSms.g:828:53: (iv_ruleSEnumeration= ruleSEnumeration EOF )
            // InternalSms.g:829:2: iv_ruleSEnumeration= ruleSEnumeration EOF
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
    // InternalSms.g:835:1: ruleSEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleSLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) ) )* )? ( (lv_constraints_6_0= ruleSConstraint ) )* otherlv_7= '}' ) ;
    public final EObject ruleSEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalSms.g:841:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleSLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) ) )* )? ( (lv_constraints_6_0= ruleSConstraint ) )* otherlv_7= '}' ) )
            // InternalSms.g:842:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleSLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) ) )* )? ( (lv_constraints_6_0= ruleSConstraint ) )* otherlv_7= '}' )
            {
            // InternalSms.g:842:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleSLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) ) )* )? ( (lv_constraints_6_0= ruleSConstraint ) )* otherlv_7= '}' )
            // InternalSms.g:843:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleSLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) ) )* )? ( (lv_constraints_6_0= ruleSConstraint ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalSms.g:847:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSms.g:848:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSms.g:848:4: (lv_name_1_0= RULE_ID )
            // InternalSms.g:849:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSms.g:869:3: ( ( (lv_literals_3_0= ruleSLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSms.g:870:4: ( (lv_literals_3_0= ruleSLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) ) )*
                    {
                    // InternalSms.g:870:4: ( (lv_literals_3_0= ruleSLiteral ) )
                    // InternalSms.g:871:5: (lv_literals_3_0= ruleSLiteral )
                    {
                    // InternalSms.g:871:5: (lv_literals_3_0= ruleSLiteral )
                    // InternalSms.g:872:6: lv_literals_3_0= ruleSLiteral
                    {

                    						newCompositeNode(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_literals_3_0=ruleSLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    						}
                    						add(
                    							current,
                    							"literals",
                    							lv_literals_3_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSms.g:889:4: (otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==28) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSms.g:890:5: otherlv_4= ',' ( (lv_literals_5_0= ruleSLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSEnumerationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSms.g:894:5: ( (lv_literals_5_0= ruleSLiteral ) )
                    	    // InternalSms.g:895:6: (lv_literals_5_0= ruleSLiteral )
                    	    {
                    	    // InternalSms.g:895:6: (lv_literals_5_0= ruleSLiteral )
                    	    // InternalSms.g:896:7: lv_literals_5_0= ruleSLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_literals_5_0=ruleSLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_5_0,
                    	    								"com.mimacom.ddd.sm.sms.Sms.SLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSms.g:915:3: ( (lv_constraints_6_0= ruleSConstraint ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSms.g:916:4: (lv_constraints_6_0= ruleSConstraint )
            	    {
            	    // InternalSms.g:916:4: (lv_constraints_6_0= ruleSConstraint )
            	    // InternalSms.g:917:5: lv_constraints_6_0= ruleSConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getSEnumerationAccess().getConstraintsSConstraintParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_constraints_6_0=ruleSConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSEnumerationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_6_0,
            	    						"com.mimacom.ddd.sm.sms.Sms.SConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSms.g:942:1: entryRuleSLiteral returns [EObject current=null] : iv_ruleSLiteral= ruleSLiteral EOF ;
    public final EObject entryRuleSLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSLiteral = null;


        try {
            // InternalSms.g:942:49: (iv_ruleSLiteral= ruleSLiteral EOF )
            // InternalSms.g:943:2: iv_ruleSLiteral= ruleSLiteral EOF
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
    // InternalSms.g:949:1: ruleSLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSms.g:955:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSms.g:956:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSms.g:956:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSms.g:957:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSms.g:957:3: (lv_name_0_0= RULE_ID )
            // InternalSms.g:958:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSLiteralAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleSLiteral"


    // $ANTLR start "entryRuleSRootType"
    // InternalSms.g:977:1: entryRuleSRootType returns [EObject current=null] : iv_ruleSRootType= ruleSRootType EOF ;
    public final EObject entryRuleSRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSRootType = null;


        try {
            // InternalSms.g:977:50: (iv_ruleSRootType= ruleSRootType EOF )
            // InternalSms.g:978:2: iv_ruleSRootType= ruleSRootType EOF
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
    // InternalSms.g:984:1: ruleSRootType returns [EObject current=null] : ( ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current] ) ;
    public final EObject ruleSRootType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_deductionRule_3_0 = null;

        EObject this_SComplexType_7 = null;



        	enterRule();

        try {
            // InternalSms.g:990:2: ( ( ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current] ) )
            // InternalSms.g:991:2: ( ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current] )
            {
            // InternalSms.g:991:2: ( ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current] )
            // InternalSms.g:992:3: ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current]
            {
            // InternalSms.g:992:3: ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSms.g:993:4: (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) )
                    {
                    // InternalSms.g:993:4: (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) )
                    // InternalSms.g:994:5: otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'root' ( (lv_deductionRule_3_0= ruleSDeductionRule ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_20); 

                    					newLeafNode(otherlv_0, grammarAccess.getSRootTypeAccess().getDeducedKeyword_0_0_0());
                    				
                    // InternalSms.g:998:5: ( (lv_abstract_1_0= 'abstract' ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==29) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSms.g:999:6: (lv_abstract_1_0= 'abstract' )
                            {
                            // InternalSms.g:999:6: (lv_abstract_1_0= 'abstract' )
                            // InternalSms.g:1000:7: lv_abstract_1_0= 'abstract'
                            {
                            lv_abstract_1_0=(Token)match(input,29,FOLLOW_21); 

                            							newLeafNode(lv_abstract_1_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_2());
                    				
                    // InternalSms.g:1016:5: ( (lv_deductionRule_3_0= ruleSDeductionRule ) )
                    // InternalSms.g:1017:6: (lv_deductionRule_3_0= ruleSDeductionRule )
                    {
                    // InternalSms.g:1017:6: (lv_deductionRule_3_0= ruleSDeductionRule )
                    // InternalSms.g:1018:7: lv_deductionRule_3_0= ruleSDeductionRule
                    {

                    							newCompositeNode(grammarAccess.getSRootTypeAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_deductionRule_3_0=ruleSDeductionRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSRootTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SDeductionRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1037:4: ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) ) )
                    {
                    // InternalSms.g:1037:4: ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) ) )
                    // InternalSms.g:1038:5: ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'root' ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalSms.g:1038:5: ( (lv_abstract_4_0= 'abstract' ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==29) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSms.g:1039:6: (lv_abstract_4_0= 'abstract' )
                            {
                            // InternalSms.g:1039:6: (lv_abstract_4_0= 'abstract' )
                            // InternalSms.g:1040:7: lv_abstract_4_0= 'abstract'
                            {
                            lv_abstract_4_0=(Token)match(input,29,FOLLOW_21); 

                            							newLeafNode(lv_abstract_4_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_1());
                    				
                    // InternalSms.g:1056:5: ( (lv_name_6_0= RULE_ID ) )
                    // InternalSms.g:1057:6: (lv_name_6_0= RULE_ID )
                    {
                    // InternalSms.g:1057:6: (lv_name_6_0= RULE_ID )
                    // InternalSms.g:1058:7: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(lv_name_6_0, grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSRootTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_6_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSRootTypeRule());
            			}
            			newCompositeNode(grammarAccess.getSRootTypeAccess().getSComplexTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_SComplexType_7=ruleSComplexType(current);

            state._fsp--;


            			current = this_SComplexType_7;
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
    // InternalSms.g:1091:1: entryRuleSDetailType returns [EObject current=null] : iv_ruleSDetailType= ruleSDetailType EOF ;
    public final EObject entryRuleSDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDetailType = null;


        try {
            // InternalSms.g:1091:52: (iv_ruleSDetailType= ruleSDetailType EOF )
            // InternalSms.g:1092:2: iv_ruleSDetailType= ruleSDetailType EOF
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
    // InternalSms.g:1098:1: ruleSDetailType returns [EObject current=null] : ( ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current] ) ;
    public final EObject ruleSDetailType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_deductionRule_3_0 = null;

        EObject this_SComplexType_7 = null;



        	enterRule();

        try {
            // InternalSms.g:1104:2: ( ( ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current] ) )
            // InternalSms.g:1105:2: ( ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current] )
            {
            // InternalSms.g:1105:2: ( ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current] )
            // InternalSms.g:1106:3: ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) ) ) ) this_SComplexType_7= ruleSComplexType[$current]
            {
            // InternalSms.g:1106:3: ( (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) ) | ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==29||LA20_0==31) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSms.g:1107:4: (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) )
                    {
                    // InternalSms.g:1107:4: (otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) ) )
                    // InternalSms.g:1108:5: otherlv_0= 'deduced' ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSDeductionRule ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(otherlv_0, grammarAccess.getSDetailTypeAccess().getDeducedKeyword_0_0_0());
                    				
                    // InternalSms.g:1112:5: ( (lv_abstract_1_0= 'abstract' ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSms.g:1113:6: (lv_abstract_1_0= 'abstract' )
                            {
                            // InternalSms.g:1113:6: (lv_abstract_1_0= 'abstract' )
                            // InternalSms.g:1114:7: lv_abstract_1_0= 'abstract'
                            {
                            lv_abstract_1_0=(Token)match(input,29,FOLLOW_24); 

                            							newLeafNode(lv_abstract_1_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_2());
                    				
                    // InternalSms.g:1130:5: ( (lv_deductionRule_3_0= ruleSDeductionRule ) )
                    // InternalSms.g:1131:6: (lv_deductionRule_3_0= ruleSDeductionRule )
                    {
                    // InternalSms.g:1131:6: (lv_deductionRule_3_0= ruleSDeductionRule )
                    // InternalSms.g:1132:7: lv_deductionRule_3_0= ruleSDeductionRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_deductionRule_3_0=ruleSDeductionRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SDeductionRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1151:4: ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) ) )
                    {
                    // InternalSms.g:1151:4: ( ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) ) )
                    // InternalSms.g:1152:5: ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'detail' ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalSms.g:1152:5: ( (lv_abstract_4_0= 'abstract' ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSms.g:1153:6: (lv_abstract_4_0= 'abstract' )
                            {
                            // InternalSms.g:1153:6: (lv_abstract_4_0= 'abstract' )
                            // InternalSms.g:1154:7: lv_abstract_4_0= 'abstract'
                            {
                            lv_abstract_4_0=(Token)match(input,29,FOLLOW_24); 

                            							newLeafNode(lv_abstract_4_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_1());
                    				
                    // InternalSms.g:1170:5: ( (lv_name_6_0= RULE_ID ) )
                    // InternalSms.g:1171:6: (lv_name_6_0= RULE_ID )
                    {
                    // InternalSms.g:1171:6: (lv_name_6_0= RULE_ID )
                    // InternalSms.g:1172:7: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(lv_name_6_0, grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSDetailTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_6_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSDetailTypeRule());
            			}
            			newCompositeNode(grammarAccess.getSDetailTypeAccess().getSComplexTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_SComplexType_7=ruleSComplexType(current);

            state._fsp--;


            			current = this_SComplexType_7;
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


    // $ANTLR start "ruleSComplexType"
    // InternalSms.g:1206:1: ruleSComplexType[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? otherlv_2= '{' ( ( (lv_features_3_0= ruleSFeature ) ) | ( (lv_constraints_4_0= ruleSConstraint ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleSComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_features_3_0 = null;

        EObject lv_constraints_4_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1212:2: ( ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? otherlv_2= '{' ( ( (lv_features_3_0= ruleSFeature ) ) | ( (lv_constraints_4_0= ruleSConstraint ) ) )* otherlv_5= '}' ) )
            // InternalSms.g:1213:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? otherlv_2= '{' ( ( (lv_features_3_0= ruleSFeature ) ) | ( (lv_constraints_4_0= ruleSConstraint ) ) )* otherlv_5= '}' )
            {
            // InternalSms.g:1213:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? otherlv_2= '{' ( ( (lv_features_3_0= ruleSFeature ) ) | ( (lv_constraints_4_0= ruleSConstraint ) ) )* otherlv_5= '}' )
            // InternalSms.g:1214:3: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? otherlv_2= '{' ( ( (lv_features_3_0= ruleSFeature ) ) | ( (lv_constraints_4_0= ruleSConstraint ) ) )* otherlv_5= '}'
            {
            // InternalSms.g:1214:3: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSms.g:1215:4: otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getSComplexTypeAccess().getExtendsKeyword_0_0());
                    			
                    // InternalSms.g:1219:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSms.g:1220:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSms.g:1220:5: (otherlv_1= RULE_ID )
                    // InternalSms.g:1221:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSComplexTypeRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_1, grammarAccess.getSComplexTypeAccess().getSuperTypeSComplexTypeCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getSComplexTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSms.g:1237:3: ( ( (lv_features_3_0= ruleSFeature ) ) | ( (lv_constraints_4_0= ruleSConstraint ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==23||LA22_0==31||(LA22_0>=33 && LA22_0<=34)||(LA22_0>=43 && LA22_0<=44)) ) {
                    alt22=1;
                }
                else if ( (LA22_0==21) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSms.g:1238:4: ( (lv_features_3_0= ruleSFeature ) )
            	    {
            	    // InternalSms.g:1238:4: ( (lv_features_3_0= ruleSFeature ) )
            	    // InternalSms.g:1239:5: (lv_features_3_0= ruleSFeature )
            	    {
            	    // InternalSms.g:1239:5: (lv_features_3_0= ruleSFeature )
            	    // InternalSms.g:1240:6: lv_features_3_0= ruleSFeature
            	    {

            	    						newCompositeNode(grammarAccess.getSComplexTypeAccess().getFeaturesSFeatureParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_features_3_0=ruleSFeature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSComplexTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"features",
            	    							lv_features_3_0,
            	    							"com.mimacom.ddd.sm.sms.Sms.SFeature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSms.g:1258:4: ( (lv_constraints_4_0= ruleSConstraint ) )
            	    {
            	    // InternalSms.g:1258:4: ( (lv_constraints_4_0= ruleSConstraint ) )
            	    // InternalSms.g:1259:5: (lv_constraints_4_0= ruleSConstraint )
            	    {
            	    // InternalSms.g:1259:5: (lv_constraints_4_0= ruleSConstraint )
            	    // InternalSms.g:1260:6: lv_constraints_4_0= ruleSConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getSComplexTypeAccess().getConstraintsSConstraintParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_constraints_4_0=ruleSConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSComplexTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_4_0,
            	    							"com.mimacom.ddd.sm.sms.Sms.SConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSComplexTypeAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSComplexType"


    // $ANTLR start "entryRuleSFeature"
    // InternalSms.g:1286:1: entryRuleSFeature returns [EObject current=null] : iv_ruleSFeature= ruleSFeature EOF ;
    public final EObject entryRuleSFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFeature = null;


        try {
            // InternalSms.g:1286:49: (iv_ruleSFeature= ruleSFeature EOF )
            // InternalSms.g:1287:2: iv_ruleSFeature= ruleSFeature EOF
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
    // InternalSms.g:1293:1: ruleSFeature returns [EObject current=null] : (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) ;
    public final EObject ruleSFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SAssociation_0 = null;

        EObject this_SAttribute_1 = null;

        EObject this_SQuery_2 = null;



        	enterRule();

        try {
            // InternalSms.g:1299:2: ( (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) )
            // InternalSms.g:1300:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            {
            // InternalSms.g:1300:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
            case 43:
            case 44:
                {
                alt23=1;
                }
                break;
            case 23:
            case 31:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==36) ) {
                    alt23=3;
                }
                else if ( (LA23_3==22) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSms.g:1301:3: this_SAssociation_0= ruleSAssociation
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
                    // InternalSms.g:1310:3: this_SAttribute_1= ruleSAttribute
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
                    // InternalSms.g:1319:3: this_SQuery_2= ruleSQuery
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
    // InternalSms.g:1331:1: entryRuleSAssociation returns [EObject current=null] : iv_ruleSAssociation= ruleSAssociation EOF ;
    public final EObject entryRuleSAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAssociation = null;


        try {
            // InternalSms.g:1331:53: (iv_ruleSAssociation= ruleSAssociation EOF )
            // InternalSms.g:1332:2: iv_ruleSAssociation= ruleSAssociation EOF
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
    // InternalSms.g:1338:1: ruleSAssociation returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleSAssociationKind ) ) | ( ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ) ;
    public final EObject ruleSAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        EObject lv_multiplicity_7_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1344:2: ( ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleSAssociationKind ) ) | ( ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ) )
            // InternalSms.g:1345:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleSAssociationKind ) ) | ( ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? )
            {
            // InternalSms.g:1345:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleSAssociationKind ) ) | ( ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? )
            // InternalSms.g:1346:3: ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleSAssociationKind ) ) | ( ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )?
            {
            // InternalSms.g:1346:3: ( (lv_derived_0_0= 'derived' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSms.g:1347:4: (lv_derived_0_0= 'derived' )
                    {
                    // InternalSms.g:1347:4: (lv_derived_0_0= 'derived' )
                    // InternalSms.g:1348:5: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,33,FOLLOW_26); 

                    					newLeafNode(lv_derived_0_0, grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSAssociationRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalSms.g:1360:3: ( ( (lv_kind_1_0= ruleSAssociationKind ) ) | ( ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34||LA25_0==43) ) {
                alt25=1;
            }
            else if ( (LA25_0==44) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSms.g:1361:4: ( (lv_kind_1_0= ruleSAssociationKind ) )
                    {
                    // InternalSms.g:1361:4: ( (lv_kind_1_0= ruleSAssociationKind ) )
                    // InternalSms.g:1362:5: (lv_kind_1_0= ruleSAssociationKind )
                    {
                    // InternalSms.g:1362:5: (lv_kind_1_0= ruleSAssociationKind )
                    // InternalSms.g:1363:6: lv_kind_1_0= ruleSAssociationKind
                    {

                    						newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_kind_1_0=ruleSAssociationKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_1_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SAssociationKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1381:4: ( ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite' )
                    {
                    // InternalSms.g:1381:4: ( ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite' )
                    // InternalSms.g:1382:5: ( (lv_kind_2_0= ruleSAssociationKindInverse ) ) otherlv_3= 'composite'
                    {
                    // InternalSms.g:1382:5: ( (lv_kind_2_0= ruleSAssociationKindInverse ) )
                    // InternalSms.g:1383:6: (lv_kind_2_0= ruleSAssociationKindInverse )
                    {
                    // InternalSms.g:1383:6: (lv_kind_2_0= ruleSAssociationKindInverse )
                    // InternalSms.g:1384:7: lv_kind_2_0= ruleSAssociationKindInverse
                    {

                    							newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_kind_2_0=ruleSAssociationKindInverse();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    							}
                    							set(
                    								current,
                    								"kind",
                    								lv_kind_2_0,
                    								"com.mimacom.ddd.sm.sms.Sms.SAssociationKindInverse");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getSAssociationAccess().getCompositeKeyword_1_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalSms.g:1407:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSms.g:1408:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSms.g:1408:4: (lv_name_4_0= RULE_ID )
            // InternalSms.g:1409:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_4_0, grammarAccess.getSAssociationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSAssociationAccess().getColonKeyword_3());
            		
            // InternalSms.g:1429:3: ( (otherlv_6= RULE_ID ) )
            // InternalSms.g:1430:4: (otherlv_6= RULE_ID )
            {
            // InternalSms.g:1430:4: (otherlv_6= RULE_ID )
            // InternalSms.g:1431:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSAssociationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_6, grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_4_0());
            				

            }


            }

            // InternalSms.g:1442:3: ( (lv_multiplicity_7_0= ruleSMultiplicity ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSms.g:1443:4: (lv_multiplicity_7_0= ruleSMultiplicity )
                    {
                    // InternalSms.g:1443:4: (lv_multiplicity_7_0= ruleSMultiplicity )
                    // InternalSms.g:1444:5: lv_multiplicity_7_0= ruleSMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getSAssociationAccess().getMultiplicitySMultiplicityParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_7_0=ruleSMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_7_0,
                    						"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSAssociation"


    // $ANTLR start "entryRuleSAttribute"
    // InternalSms.g:1465:1: entryRuleSAttribute returns [EObject current=null] : iv_ruleSAttribute= ruleSAttribute EOF ;
    public final EObject entryRuleSAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttribute = null;


        try {
            // InternalSms.g:1465:51: (iv_ruleSAttribute= ruleSAttribute EOF )
            // InternalSms.g:1466:2: iv_ruleSAttribute= ruleSAttribute EOF
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
    // InternalSms.g:1472:1: ruleSAttribute returns [EObject current=null] : ( (otherlv_0= 'deduced' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSMemberDeductionRule ) ) ) | ( ( (lv_detail_3_0= 'detail' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ) ) ;
    public final EObject ruleSAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_detail_1_0=null;
        Token lv_detail_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_key_8_0=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_multiplicity_7_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1478:2: ( ( (otherlv_0= 'deduced' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSMemberDeductionRule ) ) ) | ( ( (lv_detail_3_0= 'detail' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ) ) )
            // InternalSms.g:1479:2: ( (otherlv_0= 'deduced' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSMemberDeductionRule ) ) ) | ( ( (lv_detail_3_0= 'detail' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ) )
            {
            // InternalSms.g:1479:2: ( (otherlv_0= 'deduced' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSMemberDeductionRule ) ) ) | ( ( (lv_detail_3_0= 'detail' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID||LA31_0==31) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSms.g:1480:3: (otherlv_0= 'deduced' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSMemberDeductionRule ) ) )
                    {
                    // InternalSms.g:1480:3: (otherlv_0= 'deduced' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSMemberDeductionRule ) ) )
                    // InternalSms.g:1481:4: otherlv_0= 'deduced' ( (lv_detail_1_0= 'detail' ) )? ( (lv_deductionRule_2_0= ruleSMemberDeductionRule ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_28); 

                    				newLeafNode(otherlv_0, grammarAccess.getSAttributeAccess().getDeducedKeyword_0_0());
                    			
                    // InternalSms.g:1485:4: ( (lv_detail_1_0= 'detail' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==31) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSms.g:1486:5: (lv_detail_1_0= 'detail' )
                            {
                            // InternalSms.g:1486:5: (lv_detail_1_0= 'detail' )
                            // InternalSms.g:1487:6: lv_detail_1_0= 'detail'
                            {
                            lv_detail_1_0=(Token)match(input,31,FOLLOW_28); 

                            						newLeafNode(lv_detail_1_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "detail", true, "detail");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:1499:4: ( (lv_deductionRule_2_0= ruleSMemberDeductionRule ) )
                    // InternalSms.g:1500:5: (lv_deductionRule_2_0= ruleSMemberDeductionRule )
                    {
                    // InternalSms.g:1500:5: (lv_deductionRule_2_0= ruleSMemberDeductionRule )
                    // InternalSms.g:1501:6: lv_deductionRule_2_0= ruleSMemberDeductionRule
                    {

                    						newCompositeNode(grammarAccess.getSAttributeAccess().getDeductionRuleSMemberDeductionRuleParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_2_0=ruleSMemberDeductionRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_2_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SMemberDeductionRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1520:3: ( ( (lv_detail_3_0= 'detail' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? )
                    {
                    // InternalSms.g:1520:3: ( ( (lv_detail_3_0= 'detail' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? )
                    // InternalSms.g:1521:4: ( (lv_detail_3_0= 'detail' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleSMultiplicity ) )? ( (lv_key_8_0= 'key' ) )?
                    {
                    // InternalSms.g:1521:4: ( (lv_detail_3_0= 'detail' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==31) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSms.g:1522:5: (lv_detail_3_0= 'detail' )
                            {
                            // InternalSms.g:1522:5: (lv_detail_3_0= 'detail' )
                            // InternalSms.g:1523:6: lv_detail_3_0= 'detail'
                            {
                            lv_detail_3_0=(Token)match(input,31,FOLLOW_3); 

                            						newLeafNode(lv_detail_3_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "detail", true, "detail");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:1535:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalSms.g:1536:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalSms.g:1536:5: (lv_name_4_0= RULE_ID )
                    // InternalSms.g:1537:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getSAttributeAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSAttributeAccess().getColonKeyword_1_2());
                    			
                    // InternalSms.g:1557:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSms.g:1558:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSms.g:1558:5: (otherlv_6= RULE_ID )
                    // InternalSms.g:1559:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAttributeRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_6, grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_1_3_0());
                    					

                    }


                    }

                    // InternalSms.g:1570:4: ( (lv_multiplicity_7_0= ruleSMultiplicity ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==36) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalSms.g:1571:5: (lv_multiplicity_7_0= ruleSMultiplicity )
                            {
                            // InternalSms.g:1571:5: (lv_multiplicity_7_0= ruleSMultiplicity )
                            // InternalSms.g:1572:6: lv_multiplicity_7_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_1_4_0());
                            					
                            pushFollow(FOLLOW_30);
                            lv_multiplicity_7_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_7_0,
                            							"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSms.g:1589:4: ( (lv_key_8_0= 'key' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==35) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSms.g:1590:5: (lv_key_8_0= 'key' )
                            {
                            // InternalSms.g:1590:5: (lv_key_8_0= 'key' )
                            // InternalSms.g:1591:6: lv_key_8_0= 'key'
                            {
                            lv_key_8_0=(Token)match(input,35,FOLLOW_2); 

                            						newLeafNode(lv_key_8_0, grammarAccess.getSAttributeAccess().getKeyKeyKeyword_1_5_0());
                            					

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
    // InternalSms.g:1608:1: entryRuleSQuery returns [EObject current=null] : iv_ruleSQuery= ruleSQuery EOF ;
    public final EObject entryRuleSQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQuery = null;


        try {
            // InternalSms.g:1608:47: (iv_ruleSQuery= ruleSQuery EOF )
            // InternalSms.g:1609:2: iv_ruleSQuery= ruleSQuery EOF
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
    // InternalSms.g:1615:1: ruleSQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleSQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleSMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleSExpression ) ) )? ) ;
    public final EObject ruleSQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_multiplicity_8_0 = null;

        EObject lv_returns_10_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1621:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleSQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleSMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleSExpression ) ) )? ) )
            // InternalSms.g:1622:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleSQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleSMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleSExpression ) ) )? )
            {
            // InternalSms.g:1622:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleSQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleSMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleSExpression ) ) )? )
            // InternalSms.g:1623:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleSQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleSMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleSExpression ) ) )?
            {
            // InternalSms.g:1623:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSms.g:1624:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSms.g:1624:4: (lv_name_0_0= RULE_ID )
            // InternalSms.g:1625:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSQueryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSms.g:1645:3: ( ( (lv_parameters_2_0= ruleSQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSms.g:1646:4: ( (lv_parameters_2_0= ruleSQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) ) )*
                    {
                    // InternalSms.g:1646:4: ( (lv_parameters_2_0= ruleSQueryParameter ) )
                    // InternalSms.g:1647:5: (lv_parameters_2_0= ruleSQueryParameter )
                    {
                    // InternalSms.g:1647:5: (lv_parameters_2_0= ruleSQueryParameter )
                    // InternalSms.g:1648:6: lv_parameters_2_0= ruleSQueryParameter
                    {

                    						newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_parameters_2_0=ruleSQueryParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SQueryParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSms.g:1665:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==28) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSms.g:1666:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleSQueryParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSQueryAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSms.g:1670:5: ( (lv_parameters_4_0= ruleSQueryParameter ) )
                    	    // InternalSms.g:1671:6: (lv_parameters_4_0= ruleSQueryParameter )
                    	    {
                    	    // InternalSms.g:1671:6: (lv_parameters_4_0= ruleSQueryParameter )
                    	    // InternalSms.g:1672:7: lv_parameters_4_0= ruleSQueryParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_parameters_4_0=ruleSQueryParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSQueryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"com.mimacom.ddd.sm.sms.Sms.SQueryParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getSQueryAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getSQueryAccess().getColonKeyword_4());
            		
            // InternalSms.g:1699:3: ( (otherlv_7= RULE_ID ) )
            // InternalSms.g:1700:4: (otherlv_7= RULE_ID )
            {
            // InternalSms.g:1700:4: (otherlv_7= RULE_ID )
            // InternalSms.g:1701:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSQueryRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_7, grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_5_0());
            				

            }


            }

            // InternalSms.g:1712:3: ( (lv_multiplicity_8_0= ruleSMultiplicity ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSms.g:1713:4: (lv_multiplicity_8_0= ruleSMultiplicity )
                    {
                    // InternalSms.g:1713:4: (lv_multiplicity_8_0= ruleSMultiplicity )
                    // InternalSms.g:1714:5: lv_multiplicity_8_0= ruleSMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_35);
                    lv_multiplicity_8_0=ruleSMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSQueryRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_8_0,
                    						"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSms.g:1731:3: (otherlv_9= 'returns' ( (lv_returns_10_0= ruleSExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSms.g:1732:4: otherlv_9= 'returns' ( (lv_returns_10_0= ruleSExpression ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getSQueryAccess().getReturnsKeyword_7_0());
                    			
                    // InternalSms.g:1736:4: ( (lv_returns_10_0= ruleSExpression ) )
                    // InternalSms.g:1737:5: (lv_returns_10_0= ruleSExpression )
                    {
                    // InternalSms.g:1737:5: (lv_returns_10_0= ruleSExpression )
                    // InternalSms.g:1738:6: lv_returns_10_0= ruleSExpression
                    {

                    						newCompositeNode(grammarAccess.getSQueryAccess().getReturnsSExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_returns_10_0=ruleSExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryRule());
                    						}
                    						set(
                    							current,
                    							"returns",
                    							lv_returns_10_0,
                    							"com.mimacom.ddd.sm.sms.Sms.SExpression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleSQuery"


    // $ANTLR start "entryRuleSQueryParameter"
    // InternalSms.g:1760:1: entryRuleSQueryParameter returns [EObject current=null] : iv_ruleSQueryParameter= ruleSQueryParameter EOF ;
    public final EObject entryRuleSQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryParameter = null;


        try {
            // InternalSms.g:1760:56: (iv_ruleSQueryParameter= ruleSQueryParameter EOF )
            // InternalSms.g:1761:2: iv_ruleSQueryParameter= ruleSQueryParameter EOF
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
    // InternalSms.g:1767:1: ruleSQueryParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleSMultiplicity ) )? ) ;
    public final EObject ruleSQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1773:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleSMultiplicity ) )? ) )
            // InternalSms.g:1774:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleSMultiplicity ) )? )
            {
            // InternalSms.g:1774:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleSMultiplicity ) )? )
            // InternalSms.g:1775:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleSMultiplicity ) )?
            {
            // InternalSms.g:1775:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSms.g:1776:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSms.g:1776:4: (lv_name_0_0= RULE_ID )
            // InternalSms.g:1777:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSQueryParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSQueryParameterAccess().getColonKeyword_1());
            		
            // InternalSms.g:1797:3: ( (otherlv_2= RULE_ID ) )
            // InternalSms.g:1798:4: (otherlv_2= RULE_ID )
            {
            // InternalSms.g:1798:4: (otherlv_2= RULE_ID )
            // InternalSms.g:1799:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSQueryParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_2_0());
            				

            }


            }

            // InternalSms.g:1810:3: ( (lv_multiplicity_3_0= ruleSMultiplicity ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSms.g:1811:4: (lv_multiplicity_3_0= ruleSMultiplicity )
                    {
                    // InternalSms.g:1811:4: (lv_multiplicity_3_0= ruleSMultiplicity )
                    // InternalSms.g:1812:5: lv_multiplicity_3_0= ruleSMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_3_0=ruleSMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_3_0,
                    						"com.mimacom.ddd.sm.sms.Sms.SMultiplicity");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSQueryParameter"


    // $ANTLR start "entryRuleSExpression"
    // InternalSms.g:1833:1: entryRuleSExpression returns [EObject current=null] : iv_ruleSExpression= ruleSExpression EOF ;
    public final EObject entryRuleSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSExpression = null;


        try {
            // InternalSms.g:1833:52: (iv_ruleSExpression= ruleSExpression EOF )
            // InternalSms.g:1834:2: iv_ruleSExpression= ruleSExpression EOF
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
    // InternalSms.g:1840:1: ruleSExpression returns [EObject current=null] : ( (lv_expr_0_0= RULE_STRING ) ) ;
    public final EObject ruleSExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_0=null;


        	enterRule();

        try {
            // InternalSms.g:1846:2: ( ( (lv_expr_0_0= RULE_STRING ) ) )
            // InternalSms.g:1847:2: ( (lv_expr_0_0= RULE_STRING ) )
            {
            // InternalSms.g:1847:2: ( (lv_expr_0_0= RULE_STRING ) )
            // InternalSms.g:1848:3: (lv_expr_0_0= RULE_STRING )
            {
            // InternalSms.g:1848:3: (lv_expr_0_0= RULE_STRING )
            // InternalSms.g:1849:4: lv_expr_0_0= RULE_STRING
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
    // InternalSms.g:1868:1: entryRuleSQualifiedNameWithWildcard returns [String current=null] : iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF ;
    public final String entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedNameWithWildcard = null;


        try {
            // InternalSms.g:1868:66: (iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF )
            // InternalSms.g:1869:2: iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF
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
    // InternalSms.g:1875:1: ruleSQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1881:2: ( (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) )
            // InternalSms.g:1882:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            {
            // InternalSms.g:1882:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            // InternalSms.g:1883:3: this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_SQualifiedName_0=ruleSQualifiedName();

            state._fsp--;


            			current.merge(this_SQualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSms.g:1893:3: (kw= '.*' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSms.g:1894:4: kw= '.*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalSms.g:1904:1: entryRuleSQualifiedName returns [String current=null] : iv_ruleSQualifiedName= ruleSQualifiedName EOF ;
    public final String entryRuleSQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedName = null;


        try {
            // InternalSms.g:1904:54: (iv_ruleSQualifiedName= ruleSQualifiedName EOF )
            // InternalSms.g:1905:2: iv_ruleSQualifiedName= ruleSQualifiedName EOF
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
    // InternalSms.g:1911:1: ruleSQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSms.g:1917:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSms.g:1918:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSms.g:1918:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSms.g:1919:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSms.g:1926:3: (kw= '.' this_ID_2= RULE_ID )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==40) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSms.g:1927:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalSms.g:1944:1: entryRuleSMultiplicity returns [EObject current=null] : iv_ruleSMultiplicity= ruleSMultiplicity EOF ;
    public final EObject entryRuleSMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMultiplicity = null;


        try {
            // InternalSms.g:1944:54: (iv_ruleSMultiplicity= ruleSMultiplicity EOF )
            // InternalSms.g:1945:2: iv_ruleSMultiplicity= ruleSMultiplicity EOF
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
    // InternalSms.g:1951:1: ruleSMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalSms.g:1957:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalSms.g:1958:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalSms.g:1958:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalSms.g:1959:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSms.g:1963:3: ( (lv_minOccurs_1_0= RULE_INT ) )
            // InternalSms.g:1964:4: (lv_minOccurs_1_0= RULE_INT )
            {
            // InternalSms.g:1964:4: (lv_minOccurs_1_0= RULE_INT )
            // InternalSms.g:1965:5: lv_minOccurs_1_0= RULE_INT
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_INT,FOLLOW_39); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSms.g:1985:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalSms.g:1986:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalSms.g:1986:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalSms.g:1987:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
            {

            					newCompositeNode(grammarAccess.getSMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

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
    // InternalSms.g:2012:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalSms.g:2012:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalSms.g:2013:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalSms.g:2019:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSms.g:2025:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSms.g:2026:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSms.g:2026:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            else if ( (LA39_0==42) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSms.g:2027:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSms.g:2035:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalSms.g:2044:1: ruleSAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleSAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSms.g:2050:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalSms.g:2051:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalSms.g:2051:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            else if ( (LA40_0==34) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSms.g:2052:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalSms.g:2052:3: (enumLiteral_0= 'reference' )
                    // InternalSms.g:2053:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:2060:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalSms.g:2060:3: (enumLiteral_1= 'composite' )
                    // InternalSms.g:2061:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSms.g:2071:1: ruleSAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleSAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSms.g:2077:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalSms.g:2078:2: (enumLiteral_0= 'inverse' )
            {
            // InternalSms.g:2078:2: (enumLiteral_0= 'inverse' )
            // InternalSms.g:2079:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000E9841002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000E9840002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000E9900000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010300000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000180680B00010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000180600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000000L});

}
