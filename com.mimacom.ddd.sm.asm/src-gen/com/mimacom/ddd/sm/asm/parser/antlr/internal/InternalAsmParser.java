package com.mimacom.ddd.sm.asm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.mimacom.ddd.sm.asm.services.AsmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAsmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'information'", "'model'", "'service'", "'interface'", "'import'", "'watchdog'", "'human'", "'operation'", "'('", "')'", "'raises'", "'.*'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAsmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAsmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAsmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAsm.g"; }



     	private AsmGrammarAccess grammarAccess;

        public InternalAsmParser(TokenStream input, AsmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AsmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAsm.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAsm.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAsm.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAsm.g:71:1: ruleModel returns [EObject current=null] : (this_SApplication_0= ruleSApplication | this_SServiceInterface_1= ruleSServiceInterface ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_SApplication_0 = null;

        EObject this_SServiceInterface_1 = null;



        	enterRule();

        try {
            // InternalAsm.g:77:2: ( (this_SApplication_0= ruleSApplication | this_SServiceInterface_1= ruleSServiceInterface ) )
            // InternalAsm.g:78:2: (this_SApplication_0= ruleSApplication | this_SServiceInterface_1= ruleSServiceInterface )
            {
            // InternalAsm.g:78:2: (this_SApplication_0= ruleSApplication | this_SServiceInterface_1= ruleSServiceInterface )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAsm.g:79:3: this_SApplication_0= ruleSApplication
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getSApplicationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SApplication_0=ruleSApplication();

                    state._fsp--;


                    			current = this_SApplication_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsm.g:88:3: this_SServiceInterface_1= ruleSServiceInterface
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getSServiceInterfaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SServiceInterface_1=ruleSServiceInterface();

                    state._fsp--;


                    			current = this_SServiceInterface_1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSApplication"
    // InternalAsm.g:100:1: entryRuleSApplication returns [EObject current=null] : iv_ruleSApplication= ruleSApplication EOF ;
    public final EObject entryRuleSApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSApplication = null;


        try {
            // InternalAsm.g:100:53: (iv_ruleSApplication= ruleSApplication EOF )
            // InternalAsm.g:101:2: iv_ruleSApplication= ruleSApplication EOF
            {
             newCompositeNode(grammarAccess.getSApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSApplication=ruleSApplication();

            state._fsp--;

             current =iv_ruleSApplication; 
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
    // $ANTLR end "entryRuleSApplication"


    // $ANTLR start "ruleSApplication"
    // InternalAsm.g:107:1: ruleSApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* otherlv_3= 'information' otherlv_4= 'model' ( (otherlv_5= RULE_ID ) ) ( (lv_actors_6_0= ruleSActor ) )* ) ;
    public final EObject ruleSApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_actors_6_0 = null;



        	enterRule();

        try {
            // InternalAsm.g:113:2: ( (otherlv_0= 'application' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* otherlv_3= 'information' otherlv_4= 'model' ( (otherlv_5= RULE_ID ) ) ( (lv_actors_6_0= ruleSActor ) )* ) )
            // InternalAsm.g:114:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* otherlv_3= 'information' otherlv_4= 'model' ( (otherlv_5= RULE_ID ) ) ( (lv_actors_6_0= ruleSActor ) )* )
            {
            // InternalAsm.g:114:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* otherlv_3= 'information' otherlv_4= 'model' ( (otherlv_5= RULE_ID ) ) ( (lv_actors_6_0= ruleSActor ) )* )
            // InternalAsm.g:115:3: otherlv_0= 'application' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* otherlv_3= 'information' otherlv_4= 'model' ( (otherlv_5= RULE_ID ) ) ( (lv_actors_6_0= ruleSActor ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSApplicationAccess().getApplicationKeyword_0());
            		
            // InternalAsm.g:119:3: ( (lv_name_1_0= ruleSQualifiedName ) )
            // InternalAsm.g:120:4: (lv_name_1_0= ruleSQualifiedName )
            {
            // InternalAsm.g:120:4: (lv_name_1_0= ruleSQualifiedName )
            // InternalAsm.g:121:5: lv_name_1_0= ruleSQualifiedName
            {

            					newCompositeNode(grammarAccess.getSApplicationAccess().getNameSQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleSQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSApplicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.mimacom.ddd.sm.asm.Asm.SQualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsm.g:138:3: ( (lv_imports_2_0= ruleDImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAsm.g:139:4: (lv_imports_2_0= ruleDImport )
            	    {
            	    // InternalAsm.g:139:4: (lv_imports_2_0= ruleDImport )
            	    // InternalAsm.g:140:5: lv_imports_2_0= ruleDImport
            	    {

            	    					newCompositeNode(grammarAccess.getSApplicationAccess().getImportsDImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleDImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"com.mimacom.ddd.sm.asm.Asm.DImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSApplicationAccess().getInformationKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSApplicationAccess().getModelKeyword_4());
            		
            // InternalAsm.g:165:3: ( (otherlv_5= RULE_ID ) )
            // InternalAsm.g:166:4: (otherlv_5= RULE_ID )
            {
            // InternalAsm.g:166:4: (otherlv_5= RULE_ID )
            // InternalAsm.g:167:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSApplicationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_5, grammarAccess.getSApplicationAccess().getModelSInformationModelCrossReference_5_0());
            				

            }


            }

            // InternalAsm.g:178:3: ( (lv_actors_6_0= ruleSActor ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAsm.g:179:4: (lv_actors_6_0= ruleSActor )
            	    {
            	    // InternalAsm.g:179:4: (lv_actors_6_0= ruleSActor )
            	    // InternalAsm.g:180:5: lv_actors_6_0= ruleSActor
            	    {

            	    					newCompositeNode(grammarAccess.getSApplicationAccess().getActorsSActorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_actors_6_0=ruleSActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_6_0,
            	    						"com.mimacom.ddd.sm.asm.Asm.SActor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleSApplication"


    // $ANTLR start "entryRuleSServiceInterface"
    // InternalAsm.g:201:1: entryRuleSServiceInterface returns [EObject current=null] : iv_ruleSServiceInterface= ruleSServiceInterface EOF ;
    public final EObject entryRuleSServiceInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSServiceInterface = null;


        try {
            // InternalAsm.g:201:58: (iv_ruleSServiceInterface= ruleSServiceInterface EOF )
            // InternalAsm.g:202:2: iv_ruleSServiceInterface= ruleSServiceInterface EOF
            {
             newCompositeNode(grammarAccess.getSServiceInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSServiceInterface=ruleSServiceInterface();

            state._fsp--;

             current =iv_ruleSServiceInterface; 
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
    // $ANTLR end "entryRuleSServiceInterface"


    // $ANTLR start "ruleSServiceInterface"
    // InternalAsm.g:208:1: ruleSServiceInterface returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'interface' ( (lv_name_2_0= ruleSQualifiedName ) ) ( (lv_imports_3_0= ruleDImport ) )* otherlv_4= 'information' otherlv_5= 'model' ( (otherlv_6= RULE_ID ) ) ( (lv_operations_7_0= ruleSServiceOperation ) ) ) ;
    public final EObject ruleSServiceInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_operations_7_0 = null;



        	enterRule();

        try {
            // InternalAsm.g:214:2: ( (otherlv_0= 'service' otherlv_1= 'interface' ( (lv_name_2_0= ruleSQualifiedName ) ) ( (lv_imports_3_0= ruleDImport ) )* otherlv_4= 'information' otherlv_5= 'model' ( (otherlv_6= RULE_ID ) ) ( (lv_operations_7_0= ruleSServiceOperation ) ) ) )
            // InternalAsm.g:215:2: (otherlv_0= 'service' otherlv_1= 'interface' ( (lv_name_2_0= ruleSQualifiedName ) ) ( (lv_imports_3_0= ruleDImport ) )* otherlv_4= 'information' otherlv_5= 'model' ( (otherlv_6= RULE_ID ) ) ( (lv_operations_7_0= ruleSServiceOperation ) ) )
            {
            // InternalAsm.g:215:2: (otherlv_0= 'service' otherlv_1= 'interface' ( (lv_name_2_0= ruleSQualifiedName ) ) ( (lv_imports_3_0= ruleDImport ) )* otherlv_4= 'information' otherlv_5= 'model' ( (otherlv_6= RULE_ID ) ) ( (lv_operations_7_0= ruleSServiceOperation ) ) )
            // InternalAsm.g:216:3: otherlv_0= 'service' otherlv_1= 'interface' ( (lv_name_2_0= ruleSQualifiedName ) ) ( (lv_imports_3_0= ruleDImport ) )* otherlv_4= 'information' otherlv_5= 'model' ( (otherlv_6= RULE_ID ) ) ( (lv_operations_7_0= ruleSServiceOperation ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSServiceInterfaceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSServiceInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalAsm.g:224:3: ( (lv_name_2_0= ruleSQualifiedName ) )
            // InternalAsm.g:225:4: (lv_name_2_0= ruleSQualifiedName )
            {
            // InternalAsm.g:225:4: (lv_name_2_0= ruleSQualifiedName )
            // InternalAsm.g:226:5: lv_name_2_0= ruleSQualifiedName
            {

            					newCompositeNode(grammarAccess.getSServiceInterfaceAccess().getNameSQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleSQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSServiceInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.mimacom.ddd.sm.asm.Asm.SQualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsm.g:243:3: ( (lv_imports_3_0= ruleDImport ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAsm.g:244:4: (lv_imports_3_0= ruleDImport )
            	    {
            	    // InternalAsm.g:244:4: (lv_imports_3_0= ruleDImport )
            	    // InternalAsm.g:245:5: lv_imports_3_0= ruleDImport
            	    {

            	    					newCompositeNode(grammarAccess.getSServiceInterfaceAccess().getImportsDImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_3_0=ruleDImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSServiceInterfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"com.mimacom.ddd.sm.asm.Asm.DImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSServiceInterfaceAccess().getInformationKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSServiceInterfaceAccess().getModelKeyword_5());
            		
            // InternalAsm.g:270:3: ( (otherlv_6= RULE_ID ) )
            // InternalAsm.g:271:4: (otherlv_6= RULE_ID )
            {
            // InternalAsm.g:271:4: (otherlv_6= RULE_ID )
            // InternalAsm.g:272:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSServiceInterfaceRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_6, grammarAccess.getSServiceInterfaceAccess().getModelSInformationModelCrossReference_6_0());
            				

            }


            }

            // InternalAsm.g:283:3: ( (lv_operations_7_0= ruleSServiceOperation ) )
            // InternalAsm.g:284:4: (lv_operations_7_0= ruleSServiceOperation )
            {
            // InternalAsm.g:284:4: (lv_operations_7_0= ruleSServiceOperation )
            // InternalAsm.g:285:5: lv_operations_7_0= ruleSServiceOperation
            {

            					newCompositeNode(grammarAccess.getSServiceInterfaceAccess().getOperationsSServiceOperationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_operations_7_0=ruleSServiceOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSServiceInterfaceRule());
            					}
            					add(
            						current,
            						"operations",
            						lv_operations_7_0,
            						"com.mimacom.ddd.sm.asm.Asm.SServiceOperation");
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
    // $ANTLR end "ruleSServiceInterface"


    // $ANTLR start "entryRuleDImport"
    // InternalAsm.g:306:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalAsm.g:306:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalAsm.g:307:2: iv_ruleDImport= ruleDImport EOF
            {
             newCompositeNode(grammarAccess.getDImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDImport=ruleDImport();

            state._fsp--;

             current =iv_ruleDImport; 
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
    // $ANTLR end "entryRuleDImport"


    // $ANTLR start "ruleDImport"
    // InternalAsm.g:313:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAsm.g:319:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) ) )
            // InternalAsm.g:320:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) )
            {
            // InternalAsm.g:320:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) )
            // InternalAsm.g:321:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
            		
            // InternalAsm.g:325:3: ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) )
            // InternalAsm.g:326:4: (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard )
            {
            // InternalAsm.g:326:4: (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard )
            // InternalAsm.g:327:5: lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getDImportAccess().getImportedNamespaceSQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleSQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"com.mimacom.ddd.sm.asm.Asm.SQualifiedNameWithWildcard");
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
    // $ANTLR end "ruleDImport"


    // $ANTLR start "entryRuleSActor"
    // InternalAsm.g:348:1: entryRuleSActor returns [EObject current=null] : iv_ruleSActor= ruleSActor EOF ;
    public final EObject entryRuleSActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSActor = null;


        try {
            // InternalAsm.g:348:47: (iv_ruleSActor= ruleSActor EOF )
            // InternalAsm.g:349:2: iv_ruleSActor= ruleSActor EOF
            {
             newCompositeNode(grammarAccess.getSActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSActor=ruleSActor();

            state._fsp--;

             current =iv_ruleSActor; 
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
    // $ANTLR end "entryRuleSActor"


    // $ANTLR start "ruleSActor"
    // InternalAsm.g:355:1: ruleSActor returns [EObject current=null] : (this_SWatchdog_0= ruleSWatchdog | this_SHuman_1= ruleSHuman ) ;
    public final EObject ruleSActor() throws RecognitionException {
        EObject current = null;

        EObject this_SWatchdog_0 = null;

        EObject this_SHuman_1 = null;



        	enterRule();

        try {
            // InternalAsm.g:361:2: ( (this_SWatchdog_0= ruleSWatchdog | this_SHuman_1= ruleSHuman ) )
            // InternalAsm.g:362:2: (this_SWatchdog_0= ruleSWatchdog | this_SHuman_1= ruleSHuman )
            {
            // InternalAsm.g:362:2: (this_SWatchdog_0= ruleSWatchdog | this_SHuman_1= ruleSHuman )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAsm.g:363:3: this_SWatchdog_0= ruleSWatchdog
                    {

                    			newCompositeNode(grammarAccess.getSActorAccess().getSWatchdogParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SWatchdog_0=ruleSWatchdog();

                    state._fsp--;


                    			current = this_SWatchdog_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsm.g:372:3: this_SHuman_1= ruleSHuman
                    {

                    			newCompositeNode(grammarAccess.getSActorAccess().getSHumanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SHuman_1=ruleSHuman();

                    state._fsp--;


                    			current = this_SHuman_1;
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
    // $ANTLR end "ruleSActor"


    // $ANTLR start "entryRuleSWatchdog"
    // InternalAsm.g:384:1: entryRuleSWatchdog returns [EObject current=null] : iv_ruleSWatchdog= ruleSWatchdog EOF ;
    public final EObject entryRuleSWatchdog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSWatchdog = null;


        try {
            // InternalAsm.g:384:50: (iv_ruleSWatchdog= ruleSWatchdog EOF )
            // InternalAsm.g:385:2: iv_ruleSWatchdog= ruleSWatchdog EOF
            {
             newCompositeNode(grammarAccess.getSWatchdogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSWatchdog=ruleSWatchdog();

            state._fsp--;

             current =iv_ruleSWatchdog; 
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
    // $ANTLR end "entryRuleSWatchdog"


    // $ANTLR start "ruleSWatchdog"
    // InternalAsm.g:391:1: ruleSWatchdog returns [EObject current=null] : (otherlv_0= 'watchdog' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSWatchdog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAsm.g:397:2: ( (otherlv_0= 'watchdog' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAsm.g:398:2: (otherlv_0= 'watchdog' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAsm.g:398:2: (otherlv_0= 'watchdog' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAsm.g:399:3: otherlv_0= 'watchdog' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSWatchdogAccess().getWatchdogKeyword_0());
            		
            // InternalAsm.g:403:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAsm.g:404:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAsm.g:404:4: (lv_name_1_0= RULE_ID )
            // InternalAsm.g:405:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSWatchdogAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSWatchdogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleSWatchdog"


    // $ANTLR start "entryRuleSHuman"
    // InternalAsm.g:425:1: entryRuleSHuman returns [EObject current=null] : iv_ruleSHuman= ruleSHuman EOF ;
    public final EObject entryRuleSHuman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSHuman = null;


        try {
            // InternalAsm.g:425:47: (iv_ruleSHuman= ruleSHuman EOF )
            // InternalAsm.g:426:2: iv_ruleSHuman= ruleSHuman EOF
            {
             newCompositeNode(grammarAccess.getSHumanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSHuman=ruleSHuman();

            state._fsp--;

             current =iv_ruleSHuman; 
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
    // $ANTLR end "entryRuleSHuman"


    // $ANTLR start "ruleSHuman"
    // InternalAsm.g:432:1: ruleSHuman returns [EObject current=null] : (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSHuman() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAsm.g:438:2: ( (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAsm.g:439:2: (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAsm.g:439:2: (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAsm.g:440:3: otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSHumanAccess().getHumanKeyword_0());
            		
            // InternalAsm.g:444:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAsm.g:445:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAsm.g:445:4: (lv_name_1_0= RULE_ID )
            // InternalAsm.g:446:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSHumanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSHumanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleSHuman"


    // $ANTLR start "entryRuleSServiceOperation"
    // InternalAsm.g:466:1: entryRuleSServiceOperation returns [EObject current=null] : iv_ruleSServiceOperation= ruleSServiceOperation EOF ;
    public final EObject entryRuleSServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSServiceOperation = null;


        try {
            // InternalAsm.g:466:58: (iv_ruleSServiceOperation= ruleSServiceOperation EOF )
            // InternalAsm.g:467:2: iv_ruleSServiceOperation= ruleSServiceOperation EOF
            {
             newCompositeNode(grammarAccess.getSServiceOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSServiceOperation=ruleSServiceOperation();

            state._fsp--;

             current =iv_ruleSServiceOperation; 
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
    // $ANTLR end "entryRuleSServiceOperation"


    // $ANTLR start "ruleSServiceOperation"
    // InternalAsm.g:473:1: ruleSServiceOperation returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleSOperationParameter ) )* otherlv_4= ')' (otherlv_5= 'raises' ( (lv_exceptions_6_0= ruleSException ) )+ )? ) ;
    public final EObject ruleSServiceOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_exceptions_6_0 = null;



        	enterRule();

        try {
            // InternalAsm.g:479:2: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleSOperationParameter ) )* otherlv_4= ')' (otherlv_5= 'raises' ( (lv_exceptions_6_0= ruleSException ) )+ )? ) )
            // InternalAsm.g:480:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleSOperationParameter ) )* otherlv_4= ')' (otherlv_5= 'raises' ( (lv_exceptions_6_0= ruleSException ) )+ )? )
            {
            // InternalAsm.g:480:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleSOperationParameter ) )* otherlv_4= ')' (otherlv_5= 'raises' ( (lv_exceptions_6_0= ruleSException ) )+ )? )
            // InternalAsm.g:481:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleSOperationParameter ) )* otherlv_4= ')' (otherlv_5= 'raises' ( (lv_exceptions_6_0= ruleSException ) )+ )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSServiceOperationAccess().getOperationKeyword_0());
            		
            // InternalAsm.g:485:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAsm.g:486:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAsm.g:486:4: (lv_name_1_0= RULE_ID )
            // InternalAsm.g:487:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSServiceOperationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSServiceOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSServiceOperationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAsm.g:507:3: ( (lv_parameters_3_0= ruleSOperationParameter ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAsm.g:508:4: (lv_parameters_3_0= ruleSOperationParameter )
            	    {
            	    // InternalAsm.g:508:4: (lv_parameters_3_0= ruleSOperationParameter )
            	    // InternalAsm.g:509:5: lv_parameters_3_0= ruleSOperationParameter
            	    {

            	    					newCompositeNode(grammarAccess.getSServiceOperationAccess().getParametersSOperationParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_3_0=ruleSOperationParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSServiceOperationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_3_0,
            	    						"com.mimacom.ddd.sm.asm.Asm.SOperationParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getSServiceOperationAccess().getRightParenthesisKeyword_4());
            		
            // InternalAsm.g:530:3: (otherlv_5= 'raises' ( (lv_exceptions_6_0= ruleSException ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAsm.g:531:4: otherlv_5= 'raises' ( (lv_exceptions_6_0= ruleSException ) )+
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSServiceOperationAccess().getRaisesKeyword_5_0());
                    			
                    // InternalAsm.g:535:4: ( (lv_exceptions_6_0= ruleSException ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAsm.g:536:5: (lv_exceptions_6_0= ruleSException )
                    	    {
                    	    // InternalAsm.g:536:5: (lv_exceptions_6_0= ruleSException )
                    	    // InternalAsm.g:537:6: lv_exceptions_6_0= ruleSException
                    	    {

                    	    						newCompositeNode(grammarAccess.getSServiceOperationAccess().getExceptionsSExceptionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_exceptions_6_0=ruleSException();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSServiceOperationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"exceptions",
                    	    							lv_exceptions_6_0,
                    	    							"com.mimacom.ddd.sm.asm.Asm.SException");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


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
    // $ANTLR end "ruleSServiceOperation"


    // $ANTLR start "entryRuleSOperationParameter"
    // InternalAsm.g:559:1: entryRuleSOperationParameter returns [EObject current=null] : iv_ruleSOperationParameter= ruleSOperationParameter EOF ;
    public final EObject entryRuleSOperationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSOperationParameter = null;


        try {
            // InternalAsm.g:559:60: (iv_ruleSOperationParameter= ruleSOperationParameter EOF )
            // InternalAsm.g:560:2: iv_ruleSOperationParameter= ruleSOperationParameter EOF
            {
             newCompositeNode(grammarAccess.getSOperationParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSOperationParameter=ruleSOperationParameter();

            state._fsp--;

             current =iv_ruleSOperationParameter; 
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
    // $ANTLR end "entryRuleSOperationParameter"


    // $ANTLR start "ruleSOperationParameter"
    // InternalAsm.g:566:1: ruleSOperationParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSOperationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAsm.g:572:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAsm.g:573:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAsm.g:573:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAsm.g:574:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAsm.g:574:3: (lv_name_0_0= RULE_ID )
            // InternalAsm.g:575:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSOperationParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSOperationParameterRule());
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
    // $ANTLR end "ruleSOperationParameter"


    // $ANTLR start "entryRuleSException"
    // InternalAsm.g:594:1: entryRuleSException returns [EObject current=null] : iv_ruleSException= ruleSException EOF ;
    public final EObject entryRuleSException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSException = null;


        try {
            // InternalAsm.g:594:51: (iv_ruleSException= ruleSException EOF )
            // InternalAsm.g:595:2: iv_ruleSException= ruleSException EOF
            {
             newCompositeNode(grammarAccess.getSExceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSException=ruleSException();

            state._fsp--;

             current =iv_ruleSException; 
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
    // $ANTLR end "entryRuleSException"


    // $ANTLR start "ruleSException"
    // InternalAsm.g:601:1: ruleSException returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSException() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAsm.g:607:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAsm.g:608:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAsm.g:608:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAsm.g:609:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAsm.g:609:3: (lv_name_0_0= RULE_ID )
            // InternalAsm.g:610:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSExceptionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSExceptionRule());
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
    // $ANTLR end "ruleSException"


    // $ANTLR start "entryRuleSQualifiedNameWithWildcard"
    // InternalAsm.g:629:1: entryRuleSQualifiedNameWithWildcard returns [String current=null] : iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF ;
    public final String entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedNameWithWildcard = null;


        try {
            // InternalAsm.g:629:66: (iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF )
            // InternalAsm.g:630:2: iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF
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
    // InternalAsm.g:636:1: ruleSQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAsm.g:642:2: ( (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) )
            // InternalAsm.g:643:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            {
            // InternalAsm.g:643:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            // InternalAsm.g:644:3: this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_SQualifiedName_0=ruleSQualifiedName();

            state._fsp--;


            			current.merge(this_SQualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAsm.g:654:3: (kw= '.*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAsm.g:655:4: kw= '.*'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAsm.g:665:1: entryRuleSQualifiedName returns [String current=null] : iv_ruleSQualifiedName= ruleSQualifiedName EOF ;
    public final String entryRuleSQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedName = null;


        try {
            // InternalAsm.g:665:54: (iv_ruleSQualifiedName= ruleSQualifiedName EOF )
            // InternalAsm.g:666:2: iv_ruleSQualifiedName= ruleSQualifiedName EOF
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
    // InternalAsm.g:672:1: ruleSQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAsm.g:678:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAsm.g:679:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAsm.g:679:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAsm.g:680:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAsm.g:687:3: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAsm.g:688:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});

}