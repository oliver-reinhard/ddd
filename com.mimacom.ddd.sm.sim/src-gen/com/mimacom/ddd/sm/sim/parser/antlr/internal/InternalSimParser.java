package com.mimacom.ddd.sm.sim.parser.antlr.internal;

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
import com.mimacom.ddd.sm.sim.services.SimGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'import'", "'as'", "'extends'", "'='", "'and'", "':'", "'grab'", "'aggregate'", "'{'", "'}'", "'constraint'", "'primitive'", "'redefines'", "'realizes'", "'realises'", "'archetype'", "'enumeration'", "'ditch'", "','", "'abstract'", "'root'", "'morph'", "'fuse'", "'detail'", "'reference'", "'composite'", "'derived'", "'attribute'", "'key'", "'query'", "'('", "'*'", "')'", "'returns'", "'.*'", "'.'", "'..'", "'inverse'"
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


        public InternalSimParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSim.g"; }



     	private SimGrammarAccess grammarAccess;

        public InternalSimParser(TokenStream input, SimGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SDomain";
       	}

       	@Override
       	protected SimGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSDomain"
    // InternalSim.g:65:1: entryRuleSDomain returns [EObject current=null] : iv_ruleSDomain= ruleSDomain EOF ;
    public final EObject entryRuleSDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDomain = null;


        try {
            // InternalSim.g:65:48: (iv_ruleSDomain= ruleSDomain EOF )
            // InternalSim.g:66:2: iv_ruleSDomain= ruleSDomain EOF
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
    // InternalSim.g:72:1: ruleSDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )* ) ;
    public final EObject ruleSDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_aggregates_4_0 = null;



        	enterRule();

        try {
            // InternalSim.g:78:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )* ) )
            // InternalSim.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )* )
            {
            // InternalSim.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )* )
            // InternalSim.g:80:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleSQualifiedName ) ) ( (lv_imports_2_0= ruleSImport ) )* ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSDomainAccess().getDomainKeyword_0());
            		
            // InternalSim.g:84:3: ( (lv_name_1_0= ruleSQualifiedName ) )
            // InternalSim.g:85:4: (lv_name_1_0= ruleSQualifiedName )
            {
            // InternalSim.g:85:4: (lv_name_1_0= ruleSQualifiedName )
            // InternalSim.g:86:5: lv_name_1_0= ruleSQualifiedName
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
            						"com.mimacom.ddd.sm.sim.Sim.SQualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:103:3: ( (lv_imports_2_0= ruleSImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSim.g:104:4: (lv_imports_2_0= ruleSImport )
            	    {
            	    // InternalSim.g:104:4: (lv_imports_2_0= ruleSImport )
            	    // InternalSim.g:105:5: lv_imports_2_0= ruleSImport
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
            	    						"com.mimacom.ddd.sm.sim.Sim.SImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSim.g:122:3: ( ( (lv_types_3_0= ruleSType ) ) | ( (lv_aggregates_4_0= ruleSAggregate ) ) )*
            loop2:
            do {
                int alt2=3;
                switch ( input.LA(1) ) {
                case 23:
                case 27:
                case 28:
                case 29:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                    {
                    alt2=1;
                    }
                    break;
                case 18:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==28||(LA2_3>=31 && LA2_3<=32)||LA2_3==35) ) {
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
            	    // InternalSim.g:123:4: ( (lv_types_3_0= ruleSType ) )
            	    {
            	    // InternalSim.g:123:4: ( (lv_types_3_0= ruleSType ) )
            	    // InternalSim.g:124:5: (lv_types_3_0= ruleSType )
            	    {
            	    // InternalSim.g:124:5: (lv_types_3_0= ruleSType )
            	    // InternalSim.g:125:6: lv_types_3_0= ruleSType
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
            	    							"com.mimacom.ddd.sm.sim.Sim.SType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:143:4: ( (lv_aggregates_4_0= ruleSAggregate ) )
            	    {
            	    // InternalSim.g:143:4: ( (lv_aggregates_4_0= ruleSAggregate ) )
            	    // InternalSim.g:144:5: (lv_aggregates_4_0= ruleSAggregate )
            	    {
            	    // InternalSim.g:144:5: (lv_aggregates_4_0= ruleSAggregate )
            	    // InternalSim.g:145:6: lv_aggregates_4_0= ruleSAggregate
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
            	    							"com.mimacom.ddd.sm.sim.Sim.SAggregate");
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
    // InternalSim.g:167:1: entryRuleSImport returns [EObject current=null] : iv_ruleSImport= ruleSImport EOF ;
    public final EObject entryRuleSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSImport = null;


        try {
            // InternalSim.g:167:48: (iv_ruleSImport= ruleSImport EOF )
            // InternalSim.g:168:2: iv_ruleSImport= ruleSImport EOF
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
    // InternalSim.g:174:1: ruleSImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalSim.g:180:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) ) )
            // InternalSim.g:181:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) )
            {
            // InternalSim.g:181:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) )
            // InternalSim.g:182:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSImportAccess().getImportKeyword_0());
            		
            // InternalSim.g:186:3: ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) )
            // InternalSim.g:187:4: (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard )
            {
            // InternalSim.g:187:4: (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard )
            // InternalSim.g:188:5: lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard
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
            						"com.mimacom.ddd.sm.sim.Sim.SQualifiedNameWithWildcard");
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
    // InternalSim.g:209:1: entryRuleSGrabAggregateRule returns [EObject current=null] : iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF ;
    public final EObject entryRuleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabAggregateRule = null;


        try {
            // InternalSim.g:209:59: (iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF )
            // InternalSim.g:210:2: iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF
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
    // InternalSim.g:216:1: ruleSGrabAggregateRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:222:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:223:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:223:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:224:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:224:3: (otherlv_0= RULE_ID )
            // InternalSim.g:225:4: otherlv_0= RULE_ID
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
    // InternalSim.g:239:1: entryRuleSGrabEnumerationRule returns [EObject current=null] : iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF ;
    public final EObject entryRuleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationRule = null;


        try {
            // InternalSim.g:239:61: (iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF )
            // InternalSim.g:240:2: iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF
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
    // InternalSim.g:246:1: ruleSGrabEnumerationRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:252:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:253:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:253:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:254:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:254:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:255:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:255:4: ( ruleSQualifiedName )
            // InternalSim.g:256:5: ruleSQualifiedName
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

            // InternalSim.g:270:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSim.g:271:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:275:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:276:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:276:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:277:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabEnumerationRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabEnumerationRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_2_0,
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


    // $ANTLR start "entryRuleSDitchEnumerationRule"
    // InternalSim.g:298:1: entryRuleSDitchEnumerationRule returns [EObject current=null] : iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF ;
    public final EObject entryRuleSDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationRule = null;


        try {
            // InternalSim.g:298:62: (iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF )
            // InternalSim.g:299:2: iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF
            {
             newCompositeNode(grammarAccess.getSDitchEnumerationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDitchEnumerationRule=ruleSDitchEnumerationRule();

            state._fsp--;

             current =iv_ruleSDitchEnumerationRule; 
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
    // $ANTLR end "entryRuleSDitchEnumerationRule"


    // $ANTLR start "ruleSDitchEnumerationRule"
    // InternalSim.g:305:1: ruleSDitchEnumerationRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:311:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:312:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:312:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:313:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:313:3: (otherlv_0= RULE_ID )
            // InternalSim.g:314:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSDitchEnumerationRuleRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0());
            			

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
    // $ANTLR end "ruleSDitchEnumerationRule"


    // $ANTLR start "entryRuleSGrabEnumerationLiteralRule"
    // InternalSim.g:328:1: entryRuleSGrabEnumerationLiteralRule returns [EObject current=null] : iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF ;
    public final EObject entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationLiteralRule = null;


        try {
            // InternalSim.g:328:68: (iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF )
            // InternalSim.g:329:2: iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF
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
    // InternalSim.g:335:1: ruleSGrabEnumerationLiteralRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:341:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:342:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:342:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:343:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:343:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:344:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:344:4: (otherlv_0= RULE_ID )
            // InternalSim.g:345:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabEnumerationLiteralRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0());
            				

            }


            }

            // InternalSim.g:356:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSim.g:357:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:361:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:362:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:362:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:363:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabEnumerationLiteralRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_2_0,
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
    // InternalSim.g:384:1: entryRuleSDitchEnumerationLiteralRule returns [EObject current=null] : iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF ;
    public final EObject entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationLiteralRule = null;


        try {
            // InternalSim.g:384:69: (iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF )
            // InternalSim.g:385:2: iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF
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
    // InternalSim.g:391:1: ruleSDitchEnumerationLiteralRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:397:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:398:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:398:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:399:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:399:3: (otherlv_0= RULE_ID )
            // InternalSim.g:400:4: otherlv_0= RULE_ID
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
    // InternalSim.g:414:1: entryRuleSGrabComplexTypeRule returns [EObject current=null] : iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF ;
    public final EObject entryRuleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabComplexTypeRule = null;


        try {
            // InternalSim.g:414:61: (iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF )
            // InternalSim.g:415:2: iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF
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
    // InternalSim.g:421:1: ruleSGrabComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:427:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:428:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:428:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:429:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:429:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:430:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:430:4: ( ruleSQualifiedName )
            // InternalSim.g:431:5: ruleSQualifiedName
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

            // InternalSim.g:445:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSim.g:446:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:450:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:451:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:451:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:452:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabComplexTypeRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_2_0,
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


    // $ANTLR start "entryRuleSDitchComplexTypeRule"
    // InternalSim.g:473:1: entryRuleSDitchComplexTypeRule returns [EObject current=null] : iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF ;
    public final EObject entryRuleSDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchComplexTypeRule = null;


        try {
            // InternalSim.g:473:62: (iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF )
            // InternalSim.g:474:2: iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF
            {
             newCompositeNode(grammarAccess.getSDitchComplexTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDitchComplexTypeRule=ruleSDitchComplexTypeRule();

            state._fsp--;

             current =iv_ruleSDitchComplexTypeRule; 
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
    // $ANTLR end "entryRuleSDitchComplexTypeRule"


    // $ANTLR start "ruleSDitchComplexTypeRule"
    // InternalSim.g:480:1: ruleSDitchComplexTypeRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:486:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:487:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:487:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:488:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:488:3: (otherlv_0= RULE_ID )
            // InternalSim.g:489:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSDitchComplexTypeRuleRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationCrossReference_0());
            			

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
    // $ANTLR end "ruleSDitchComplexTypeRule"


    // $ANTLR start "entryRuleSMorphComplexTypeRule"
    // InternalSim.g:503:1: entryRuleSMorphComplexTypeRule returns [EObject current=null] : iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF ;
    public final EObject entryRuleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphComplexTypeRule = null;


        try {
            // InternalSim.g:503:62: (iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF )
            // InternalSim.g:504:2: iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF
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
    // InternalSim.g:510:1: ruleSMorphComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSim.g:516:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalSim.g:517:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalSim.g:517:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? )
            // InternalSim.g:518:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )?
            {
            // InternalSim.g:518:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:519:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:519:4: ( ruleSQualifiedName )
            // InternalSim.g:520:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_7);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:534:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSim.g:535:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSMorphComplexTypeRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:539:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:540:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:540:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:541:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_renameTo_2_0, grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:558:3: (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSim.g:559:4: otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getSMorphComplexTypeRuleAccess().getExtendsKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalSim.g:567:4: ( (otherlv_5= RULE_ID ) )
                    // InternalSim.g:568:5: (otherlv_5= RULE_ID )
                    {
                    // InternalSim.g:568:5: (otherlv_5= RULE_ID )
                    // InternalSim.g:569:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeCrossReference_2_2_0());
                    					

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
    // InternalSim.g:585:1: entryRuleSFuseComplexTypeRule returns [EObject current=null] : iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF ;
    public final EObject entryRuleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFuseComplexTypeRule = null;


        try {
            // InternalSim.g:585:61: (iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF )
            // InternalSim.g:586:2: iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF
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
    // InternalSim.g:592:1: ruleSFuseComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? ) ;
    public final EObject ruleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_renameTo_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSim.g:598:2: ( ( ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalSim.g:599:2: ( ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalSim.g:599:2: ( ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalSim.g:600:3: ( ( ruleSQualifiedName ) ) otherlv_1= 'and' ( ( ruleSQualifiedName ) ) (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            {
            // InternalSim.g:600:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:601:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:601:4: ( ruleSQualifiedName )
            // InternalSim.g:602:5: ruleSQualifiedName
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
            		
            // InternalSim.g:620:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:621:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:621:4: ( ruleSQualifiedName )
            // InternalSim.g:622:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_7);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:636:3: (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSim.g:637:4: otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSFuseComplexTypeRuleAccess().getAsKeyword_3_0());
                    			
                    // InternalSim.g:641:4: ( (lv_renameTo_4_0= RULE_ID ) )
                    // InternalSim.g:642:5: (lv_renameTo_4_0= RULE_ID )
                    {
                    // InternalSim.g:642:5: (lv_renameTo_4_0= RULE_ID )
                    // InternalSim.g:643:6: lv_renameTo_4_0= RULE_ID
                    {
                    lv_renameTo_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_renameTo_4_0, grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
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

            // InternalSim.g:660:3: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSim.g:661:4: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_4_0());
                    			
                    // InternalSim.g:665:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSim.g:666:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSim.g:666:5: (otherlv_6= RULE_ID )
                    // InternalSim.g:667:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_4_1_0());
                    					

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
    // InternalSim.g:683:1: entryRuleSGrabFeatureRule returns [EObject current=null] : iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF ;
    public final EObject entryRuleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabFeatureRule = null;


        try {
            // InternalSim.g:683:57: (iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF )
            // InternalSim.g:684:2: iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF
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
    // InternalSim.g:690:1: ruleSGrabFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:696:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:697:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:697:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:698:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:698:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:699:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:699:4: (otherlv_0= RULE_ID )
            // InternalSim.g:700:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
            				

            }


            }

            // InternalSim.g:711:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSim.g:712:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:716:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:717:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:717:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:718:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_2_0,
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
    // InternalSim.g:739:1: entryRuleSMorphFeatureRule returns [EObject current=null] : iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF ;
    public final EObject entryRuleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphFeatureRule = null;


        try {
            // InternalSim.g:739:58: (iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF )
            // InternalSim.g:740:2: iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF
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
    // InternalSim.g:746:1: ruleSMorphFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )? ) ;
    public final EObject ruleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_remultiplyTo_5_0 = null;



        	enterRule();

        try {
            // InternalSim.g:752:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )? ) )
            // InternalSim.g:753:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )? )
            {
            // InternalSim.g:753:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )? )
            // InternalSim.g:754:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )?
            {
            // InternalSim.g:754:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:755:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:755:4: (otherlv_0= RULE_ID )
            // InternalSim.g:756:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
            				

            }


            }

            // InternalSim.g:767:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSim.g:768:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSMorphFeatureRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:772:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:773:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:773:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:774:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_renameTo_2_0, grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"renameTo",
                    							lv_renameTo_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSim.g:791:3: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSim.g:792:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )?
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_0());
                    			
                    // InternalSim.g:796:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSim.g:797:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSim.g:797:5: (otherlv_4= RULE_ID )
                    // InternalSim.g:798:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_4, grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalSim.g:809:4: ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )?
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
                            // InternalSim.g:810:5: (lv_remultiplyTo_5_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:810:5: (lv_remultiplyTo_5_0= ruleSMultiplicity )
                            // InternalSim.g:811:6: lv_remultiplyTo_5_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_2_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_remultiplyTo_5_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSMorphFeatureRuleRule());
                            						}
                            						set(
                            							current,
                            							"remultiplyTo",
                            							lv_remultiplyTo_5_0,
                            							"com.mimacom.ddd.sm.sim.Sim.SMultiplicity");
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
    // InternalSim.g:833:1: entryRuleSDitchFeatureRule returns [EObject current=null] : iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF ;
    public final EObject entryRuleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchFeatureRule = null;


        try {
            // InternalSim.g:833:58: (iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF )
            // InternalSim.g:834:2: iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF
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
    // InternalSim.g:840:1: ruleSDitchFeatureRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:846:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:847:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:847:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:848:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:848:3: (otherlv_0= RULE_ID )
            // InternalSim.g:849:4: otherlv_0= RULE_ID
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
    // InternalSim.g:863:1: entryRuleSAggregate returns [EObject current=null] : iv_ruleSAggregate= ruleSAggregate EOF ;
    public final EObject entryRuleSAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAggregate = null;


        try {
            // InternalSim.g:863:51: (iv_ruleSAggregate= ruleSAggregate EOF )
            // InternalSim.g:864:2: iv_ruleSAggregate= ruleSAggregate EOF
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
    // InternalSim.g:870:1: ruleSAggregate returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) ;
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
            // InternalSim.g:876:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) )
            // InternalSim.g:877:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' )
            {
            // InternalSim.g:877:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' )
            // InternalSim.g:878:3: () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}'
            {
            // InternalSim.g:878:3: ()
            // InternalSim.g:879:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSAggregateAccess().getSAggregateAction_0(),
            					current);
            			

            }

            // InternalSim.g:885:3: ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            else if ( (LA14_0==19) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSim.g:886:4: (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) )
                    {
                    // InternalSim.g:886:4: (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) )
                    // InternalSim.g:887:5: otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(otherlv_1, grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSAggregateAccess().getAggregateKeyword_1_0_1());
                    				
                    // InternalSim.g:895:5: ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
                    // InternalSim.g:896:6: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
                    {
                    // InternalSim.g:896:6: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
                    // InternalSim.g:897:7: lv_deductionRule_3_0= ruleSGrabAggregateRule
                    {

                    							newCompositeNode(grammarAccess.getSAggregateAccess().getDeductionRuleSGrabAggregateRuleParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_3_0=ruleSGrabAggregateRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSAggregateRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SGrabAggregateRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:916:4: otherlv_4= 'aggregate'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getSAggregateAccess().getAggregateKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSim.g:925:3: ( (lv_types_6_0= ruleSType ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18||LA15_0==23||(LA15_0>=27 && LA15_0<=29)||(LA15_0>=31 && LA15_0<=35)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSim.g:926:4: (lv_types_6_0= ruleSType )
            	    {
            	    // InternalSim.g:926:4: (lv_types_6_0= ruleSType )
            	    // InternalSim.g:927:5: lv_types_6_0= ruleSType
            	    {

            	    					newCompositeNode(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_3_0());
            	    				
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
            	    						"com.mimacom.ddd.sm.sim.Sim.SType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalSim.g:952:1: entryRuleSType returns [EObject current=null] : iv_ruleSType= ruleSType EOF ;
    public final EObject entryRuleSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSType = null;


        try {
            // InternalSim.g:952:46: (iv_ruleSType= ruleSType EOF )
            // InternalSim.g:953:2: iv_ruleSType= ruleSType EOF
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
    // InternalSim.g:959:1: ruleSType returns [EObject current=null] : (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType ) ;
    public final EObject ruleSType() throws RecognitionException {
        EObject current = null;

        EObject this_SPrimitive_0 = null;

        EObject this_SPrimitiveArchetype_1 = null;

        EObject this_SEnumeration_2 = null;

        EObject this_SRootType_3 = null;

        EObject this_SDetailType_4 = null;



        	enterRule();

        try {
            // InternalSim.g:965:2: ( (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType ) )
            // InternalSim.g:966:2: (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType )
            {
            // InternalSim.g:966:2: (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalSim.g:967:3: this_SPrimitive_0= ruleSPrimitive
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
                    // InternalSim.g:976:3: this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype
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
                    // InternalSim.g:985:3: this_SEnumeration_2= ruleSEnumeration
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
                    // InternalSim.g:994:3: this_SRootType_3= ruleSRootType
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
                    // InternalSim.g:1003:3: this_SDetailType_4= ruleSDetailType
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
    // InternalSim.g:1015:1: entryRuleSConstraint returns [EObject current=null] : iv_ruleSConstraint= ruleSConstraint EOF ;
    public final EObject entryRuleSConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSConstraint = null;


        try {
            // InternalSim.g:1015:52: (iv_ruleSConstraint= ruleSConstraint EOF )
            // InternalSim.g:1016:2: iv_ruleSConstraint= ruleSConstraint EOF
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
    // InternalSim.g:1022:1: ruleSConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) ;
    public final EObject ruleSConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1028:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) )
            // InternalSim.g:1029:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            {
            // InternalSim.g:1029:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            // InternalSim.g:1030:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSConstraintAccess().getConstraintKeyword_0());
            		
            // InternalSim.g:1034:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:1035:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:1035:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:1036:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSConstraintAccess().getColonKeyword_2());
            		
            // InternalSim.g:1056:3: ( (lv_condition_3_0= ruleSExpression ) )
            // InternalSim.g:1057:4: (lv_condition_3_0= ruleSExpression )
            {
            // InternalSim.g:1057:4: (lv_condition_3_0= ruleSExpression )
            // InternalSim.g:1058:5: lv_condition_3_0= ruleSExpression
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
            						"com.mimacom.ddd.sm.sim.Sim.SExpression");
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
    // InternalSim.g:1079:1: entryRuleSPrimitive returns [EObject current=null] : iv_ruleSPrimitive= ruleSPrimitive EOF ;
    public final EObject entryRuleSPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitive = null;


        try {
            // InternalSim.g:1079:51: (iv_ruleSPrimitive= ruleSPrimitive EOF )
            // InternalSim.g:1080:2: iv_ruleSPrimitive= ruleSPrimitive EOF
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
    // InternalSim.g:1086:1: ruleSPrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}' ) ;
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
            // InternalSim.g:1092:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}' ) )
            // InternalSim.g:1093:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}' )
            {
            // InternalSim.g:1093:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}' )
            // InternalSim.g:1094:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) ) otherlv_7= '{' ( (lv_constraints_8_0= ruleSConstraint ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0());
            		
            // InternalSim.g:1098:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:1099:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:1099:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:1100:5: lv_name_1_0= RULE_ID
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

            // InternalSim.g:1116:3: ( (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=25 && LA18_0<=26)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSim.g:1117:4: (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalSim.g:1117:4: (otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) ) )
                    // InternalSim.g:1118:5: otherlv_2= 'redefines' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_2_0_0());
                    				
                    // InternalSim.g:1122:5: ( (otherlv_3= RULE_ID ) )
                    // InternalSim.g:1123:6: (otherlv_3= RULE_ID )
                    {
                    // InternalSim.g:1123:6: (otherlv_3= RULE_ID )
                    // InternalSim.g:1124:7: otherlv_3= RULE_ID
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
                    // InternalSim.g:1137:4: ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) )
                    {
                    // InternalSim.g:1137:4: ( (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) ) )
                    // InternalSim.g:1138:5: (otherlv_4= 'realizes' | otherlv_5= 'realises' ) ( ( ruleSQualifiedName ) )
                    {
                    // InternalSim.g:1138:5: (otherlv_4= 'realizes' | otherlv_5= 'realises' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==26) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSim.g:1139:6: otherlv_4= 'realizes'
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_3); 

                            						newLeafNode(otherlv_4, grammarAccess.getSPrimitiveAccess().getRealizesKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalSim.g:1144:6: otherlv_5= 'realises'
                            {
                            otherlv_5=(Token)match(input,26,FOLLOW_3); 

                            						newLeafNode(otherlv_5, grammarAccess.getSPrimitiveAccess().getRealisesKeyword_2_1_0_1());
                            					

                            }
                            break;

                    }

                    // InternalSim.g:1149:5: ( ( ruleSQualifiedName ) )
                    // InternalSim.g:1150:6: ( ruleSQualifiedName )
                    {
                    // InternalSim.g:1150:6: ( ruleSQualifiedName )
                    // InternalSim.g:1151:7: ruleSQualifiedName
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
            		
            // InternalSim.g:1171:3: ( (lv_constraints_8_0= ruleSConstraint ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSim.g:1172:4: (lv_constraints_8_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:1172:4: (lv_constraints_8_0= ruleSConstraint )
            	    // InternalSim.g:1173:5: lv_constraints_8_0= ruleSConstraint
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
            	    						"com.mimacom.ddd.sm.sim.Sim.SConstraint");
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
    // InternalSim.g:1198:1: entryRuleSPrimitiveArchetype returns [EObject current=null] : iv_ruleSPrimitiveArchetype= ruleSPrimitiveArchetype EOF ;
    public final EObject entryRuleSPrimitiveArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitiveArchetype = null;


        try {
            // InternalSim.g:1198:60: (iv_ruleSPrimitiveArchetype= ruleSPrimitiveArchetype EOF )
            // InternalSim.g:1199:2: iv_ruleSPrimitiveArchetype= ruleSPrimitiveArchetype EOF
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
    // InternalSim.g:1205:1: ruleSPrimitiveArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}' ) ;
    public final EObject ruleSPrimitiveArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1211:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}' ) )
            // InternalSim.g:1212:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}' )
            {
            // InternalSim.g:1212:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}' )
            // InternalSim.g:1213:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleSConstraint ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSPrimitiveArchetypeAccess().getArchetypeKeyword_0());
            		
            // InternalSim.g:1217:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:1218:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:1218:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:1219:5: lv_name_1_0= RULE_ID
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
            		
            // InternalSim.g:1239:3: ( (lv_constraints_3_0= ruleSConstraint ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSim.g:1240:4: (lv_constraints_3_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:1240:4: (lv_constraints_3_0= ruleSConstraint )
            	    // InternalSim.g:1241:5: lv_constraints_3_0= ruleSConstraint
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
            	    						"com.mimacom.ddd.sm.sim.Sim.SConstraint");
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
    // InternalSim.g:1266:1: entryRuleSEnumeration returns [EObject current=null] : iv_ruleSEnumeration= ruleSEnumeration EOF ;
    public final EObject entryRuleSEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumeration = null;


        try {
            // InternalSim.g:1266:53: (iv_ruleSEnumeration= ruleSEnumeration EOF )
            // InternalSim.g:1267:2: iv_ruleSEnumeration= ruleSEnumeration EOF
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
    // InternalSim.g:1273:1: ruleSEnumeration returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' ) ;
    public final EObject ruleSEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_7_0 = null;

        EObject lv_literals_11_0 = null;

        EObject lv_literals_13_0 = null;

        EObject lv_constraints_14_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1279:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' ) )
            // InternalSim.g:1280:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' )
            {
            // InternalSim.g:1280:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' )
            // InternalSim.g:1281:3: ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}'
            {
            // InternalSim.g:1281:3: ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt21=1;
                }
                break;
            case 29:
                {
                alt21=2;
                }
                break;
            case 28:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSim.g:1282:4: ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    {
                    // InternalSim.g:1282:4: ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    // InternalSim.g:1283:5: () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    {
                    // InternalSim.g:1283:5: ()
                    // InternalSim.g:1284:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_21); 

                    					newLeafNode(otherlv_1, grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_1());
                    				
                    otherlv_2=(Token)match(input,28,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2());
                    				
                    // InternalSim.g:1298:5: ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    // InternalSim.g:1299:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    {
                    // InternalSim.g:1299:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    // InternalSim.g:1300:7: lv_deductionRule_3_0= ruleSGrabEnumerationRule
                    {

                    							newCompositeNode(grammarAccess.getSEnumerationAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_3_0=ruleSGrabEnumerationRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SGrabEnumerationRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1319:4: ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) )
                    {
                    // InternalSim.g:1319:4: ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) )
                    // InternalSim.g:1320:5: () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) )
                    {
                    // InternalSim.g:1320:5: ()
                    // InternalSim.g:1321:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_21); 

                    					newLeafNode(otherlv_5, grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1());
                    				
                    otherlv_6=(Token)match(input,28,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2());
                    				
                    // InternalSim.g:1335:5: ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) )
                    // InternalSim.g:1336:6: (lv_deductionRule_7_0= ruleSDitchEnumerationRule )
                    {
                    // InternalSim.g:1336:6: (lv_deductionRule_7_0= ruleSDitchEnumerationRule )
                    // InternalSim.g:1337:7: lv_deductionRule_7_0= ruleSDitchEnumerationRule
                    {

                    							newCompositeNode(grammarAccess.getSEnumerationAccess().getDeductionRuleSDitchEnumerationRuleParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_7_0=ruleSDitchEnumerationRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_7_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SDitchEnumerationRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1356:4: (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) )
                    {
                    // InternalSim.g:1356:4: (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) )
                    // InternalSim.g:1357:5: otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_3); 

                    					newLeafNode(otherlv_8, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0());
                    				
                    // InternalSim.g:1361:5: ( (lv_name_9_0= RULE_ID ) )
                    // InternalSim.g:1362:6: (lv_name_9_0= RULE_ID )
                    {
                    // InternalSim.g:1362:6: (lv_name_9_0= RULE_ID )
                    // InternalSim.g:1363:7: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(lv_name_9_0, grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_0_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSEnumerationRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_9_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_10, grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSim.g:1385:3: ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==18||LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSim.g:1386:4: ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )*
                    {
                    // InternalSim.g:1386:4: ( (lv_literals_11_0= ruleSLiteral ) )
                    // InternalSim.g:1387:5: (lv_literals_11_0= ruleSLiteral )
                    {
                    // InternalSim.g:1387:5: (lv_literals_11_0= ruleSLiteral )
                    // InternalSim.g:1388:6: lv_literals_11_0= ruleSLiteral
                    {

                    						newCompositeNode(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_literals_11_0=ruleSLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    						}
                    						add(
                    							current,
                    							"literals",
                    							lv_literals_11_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSim.g:1405:4: (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==30) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSim.g:1406:5: otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) )
                    	    {
                    	    otherlv_12=(Token)match(input,30,FOLLOW_24); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSim.g:1410:5: ( (lv_literals_13_0= ruleSLiteral ) )
                    	    // InternalSim.g:1411:6: (lv_literals_13_0= ruleSLiteral )
                    	    {
                    	    // InternalSim.g:1411:6: (lv_literals_13_0= ruleSLiteral )
                    	    // InternalSim.g:1412:7: lv_literals_13_0= ruleSLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_literals_13_0=ruleSLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSEnumerationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_13_0,
                    	    								"com.mimacom.ddd.sm.sim.Sim.SLiteral");
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

            // InternalSim.g:1431:3: ( (lv_constraints_14_0= ruleSConstraint ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSim.g:1432:4: (lv_constraints_14_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:1432:4: (lv_constraints_14_0= ruleSConstraint )
            	    // InternalSim.g:1433:5: lv_constraints_14_0= ruleSConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getSEnumerationAccess().getConstraintsSConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_constraints_14_0=ruleSConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSEnumerationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_14_0,
            	    						"com.mimacom.ddd.sm.sim.Sim.SConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_15=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalSim.g:1458:1: entryRuleSLiteral returns [EObject current=null] : iv_ruleSLiteral= ruleSLiteral EOF ;
    public final EObject entryRuleSLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSLiteral = null;


        try {
            // InternalSim.g:1458:49: (iv_ruleSLiteral= ruleSLiteral EOF )
            // InternalSim.g:1459:2: iv_ruleSLiteral= ruleSLiteral EOF
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
    // InternalSim.g:1465:1: ruleSLiteral returns [EObject current=null] : ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject ruleSLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_5_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1471:2: ( ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalSim.g:1472:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalSim.g:1472:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt25=1;
                }
                break;
            case 29:
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
                    // InternalSim.g:1473:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1473:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    // InternalSim.g:1474:4: () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    {
                    // InternalSim.g:1474:4: ()
                    // InternalSim.g:1475:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSLiteralAccess().getSLiteralAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSLiteralAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:1485:4: ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    // InternalSim.g:1486:5: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    {
                    // InternalSim.g:1486:5: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    // InternalSim.g:1487:6: lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule
                    {

                    						newCompositeNode(grammarAccess.getSLiteralAccess().getDeductionRuleSGrabEnumerationLiteralRuleParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_2_0=ruleSGrabEnumerationLiteralRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSLiteralRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_2_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SGrabEnumerationLiteralRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1506:3: ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1506:3: ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) )
                    // InternalSim.g:1507:4: () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) )
                    {
                    // InternalSim.g:1507:4: ()
                    // InternalSim.g:1508:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSLiteralAccess().getSLiteralAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSLiteralAccess().getDitchKeyword_1_1());
                    			
                    // InternalSim.g:1518:4: ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) )
                    // InternalSim.g:1519:5: (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule )
                    {
                    // InternalSim.g:1519:5: (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule )
                    // InternalSim.g:1520:6: lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule
                    {

                    						newCompositeNode(grammarAccess.getSLiteralAccess().getDeductionRuleSDitchEnumerationLiteralRuleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_5_0=ruleSDitchEnumerationLiteralRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSLiteralRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_5_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SDitchEnumerationLiteralRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1539:3: ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalSim.g:1539:3: ( (lv_name_6_0= RULE_ID ) )
                    // InternalSim.g:1540:4: (lv_name_6_0= RULE_ID )
                    {
                    // InternalSim.g:1540:4: (lv_name_6_0= RULE_ID )
                    // InternalSim.g:1541:5: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_6_0, grammarAccess.getSLiteralAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_6_0,
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
    // InternalSim.g:1561:1: entryRuleSRootType returns [EObject current=null] : iv_ruleSRootType= ruleSRootType EOF ;
    public final EObject entryRuleSRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSRootType = null;


        try {
            // InternalSim.g:1561:50: (iv_ruleSRootType= ruleSRootType EOF )
            // InternalSim.g:1562:2: iv_ruleSRootType= ruleSRootType EOF
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
    // InternalSim.g:1568:1: ruleSRootType returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSRootType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_abstract_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_abstract_7_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token lv_abstract_12_0=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token lv_abstract_17_0=null;
        Token otherlv_18=null;
        Token lv_abstract_20_0=null;
        Token otherlv_21=null;
        Token lv_name_22_0=null;
        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_9_0 = null;

        EObject lv_deductionRule_14_0 = null;

        EObject lv_deductionRule_19_0 = null;

        EObject this_SComplexTypeExtends_23 = null;

        EObject this_SComplexTypeFeatures_24 = null;



        	enterRule();

        try {
            // InternalSim.g:1574:2: ( ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:1575:2: ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:1575:2: ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:1576:3: ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:1576:3: ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt31=1;
                }
                break;
            case 29:
                {
                alt31=2;
                }
                break;
            case 33:
                {
                alt31=3;
                }
                break;
            case 34:
                {
                alt31=4;
                }
                break;
            case 31:
            case 32:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSim.g:1577:4: ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1577:4: ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:1578:5: () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'root' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    {
                    // InternalSim.g:1578:5: ()
                    // InternalSim.g:1579:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_25); 

                    					newLeafNode(otherlv_1, grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_1());
                    				
                    // InternalSim.g:1589:5: ( (lv_abstract_2_0= 'abstract' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==31) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSim.g:1590:6: (lv_abstract_2_0= 'abstract' )
                            {
                            // InternalSim.g:1590:6: (lv_abstract_2_0= 'abstract' )
                            // InternalSim.g:1591:7: lv_abstract_2_0= 'abstract'
                            {
                            lv_abstract_2_0=(Token)match(input,31,FOLLOW_26); 

                            							newLeafNode(lv_abstract_2_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_3());
                    				
                    // InternalSim.g:1607:5: ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:1608:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:1608:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:1609:7: lv_deductionRule_4_0= ruleSGrabComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSRootTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_4_0=ruleSGrabComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSRootTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_4_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SGrabComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1628:4: ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1628:4: ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:1629:5: () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'root' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) )
                    {
                    // InternalSim.g:1629:5: ()
                    // InternalSim.g:1630:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_25); 

                    					newLeafNode(otherlv_6, grammarAccess.getSRootTypeAccess().getDitchKeyword_0_1_1());
                    				
                    // InternalSim.g:1640:5: ( (lv_abstract_7_0= 'abstract' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==31) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSim.g:1641:6: (lv_abstract_7_0= 'abstract' )
                            {
                            // InternalSim.g:1641:6: (lv_abstract_7_0= 'abstract' )
                            // InternalSim.g:1642:7: lv_abstract_7_0= 'abstract'
                            {
                            lv_abstract_7_0=(Token)match(input,31,FOLLOW_26); 

                            							newLeafNode(lv_abstract_7_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_8, grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_3());
                    				
                    // InternalSim.g:1658:5: ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:1659:6: (lv_deductionRule_9_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:1659:6: (lv_deductionRule_9_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:1660:7: lv_deductionRule_9_0= ruleSDitchComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSRootTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_9_0=ruleSDitchComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSRootTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_9_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SDitchComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1679:4: ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1679:4: ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:1680:5: () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'root' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) )
                    {
                    // InternalSim.g:1680:5: ()
                    // InternalSim.g:1681:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_2_0(),
                    							current);
                    					

                    }

                    otherlv_11=(Token)match(input,33,FOLLOW_25); 

                    					newLeafNode(otherlv_11, grammarAccess.getSRootTypeAccess().getMorphKeyword_0_2_1());
                    				
                    // InternalSim.g:1691:5: ( (lv_abstract_12_0= 'abstract' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==31) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSim.g:1692:6: (lv_abstract_12_0= 'abstract' )
                            {
                            // InternalSim.g:1692:6: (lv_abstract_12_0= 'abstract' )
                            // InternalSim.g:1693:7: lv_abstract_12_0= 'abstract'
                            {
                            lv_abstract_12_0=(Token)match(input,31,FOLLOW_26); 

                            							newLeafNode(lv_abstract_12_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_13, grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_3());
                    				
                    // InternalSim.g:1709:5: ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:1710:6: (lv_deductionRule_14_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:1710:6: (lv_deductionRule_14_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:1711:7: lv_deductionRule_14_0= ruleSMorphComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSRootTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_14_0=ruleSMorphComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSRootTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_14_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SMorphComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1730:4: ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1730:4: ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:1731:5: () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'root' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) )
                    {
                    // InternalSim.g:1731:5: ()
                    // InternalSim.g:1732:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_3_0(),
                    							current);
                    					

                    }

                    otherlv_16=(Token)match(input,34,FOLLOW_25); 

                    					newLeafNode(otherlv_16, grammarAccess.getSRootTypeAccess().getFuseKeyword_0_3_1());
                    				
                    // InternalSim.g:1742:5: ( (lv_abstract_17_0= 'abstract' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==31) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalSim.g:1743:6: (lv_abstract_17_0= 'abstract' )
                            {
                            // InternalSim.g:1743:6: (lv_abstract_17_0= 'abstract' )
                            // InternalSim.g:1744:7: lv_abstract_17_0= 'abstract'
                            {
                            lv_abstract_17_0=(Token)match(input,31,FOLLOW_26); 

                            							newLeafNode(lv_abstract_17_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_18, grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_3());
                    				
                    // InternalSim.g:1760:5: ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:1761:6: (lv_deductionRule_19_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:1761:6: (lv_deductionRule_19_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:1762:7: lv_deductionRule_19_0= ruleSFuseComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSRootTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_19_0=ruleSFuseComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSRootTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_19_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SFuseComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:1781:4: ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] )
                    {
                    // InternalSim.g:1781:4: ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] )
                    // InternalSim.g:1782:5: ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'root' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current]
                    {
                    // InternalSim.g:1782:5: ( (lv_abstract_20_0= 'abstract' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==31) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSim.g:1783:6: (lv_abstract_20_0= 'abstract' )
                            {
                            // InternalSim.g:1783:6: (lv_abstract_20_0= 'abstract' )
                            // InternalSim.g:1784:7: lv_abstract_20_0= 'abstract'
                            {
                            lv_abstract_20_0=(Token)match(input,31,FOLLOW_26); 

                            							newLeafNode(lv_abstract_20_0, grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSRootTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_21, grammarAccess.getSRootTypeAccess().getRootKeyword_0_4_1());
                    				
                    // InternalSim.g:1800:5: ( (lv_name_22_0= RULE_ID ) )
                    // InternalSim.g:1801:6: (lv_name_22_0= RULE_ID )
                    {
                    // InternalSim.g:1801:6: (lv_name_22_0= RULE_ID )
                    // InternalSim.g:1802:7: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    							newLeafNode(lv_name_22_0, grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_4_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSRootTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_22_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSRootTypeRule());
                    					}
                    					newCompositeNode(grammarAccess.getSRootTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_3());
                    				
                    pushFollow(FOLLOW_15);
                    this_SComplexTypeExtends_23=ruleSComplexTypeExtends(current);

                    state._fsp--;


                    					current = this_SComplexTypeExtends_23;
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
            this_SComplexTypeFeatures_24=ruleSComplexTypeFeatures(current);

            state._fsp--;


            			current = this_SComplexTypeFeatures_24;
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
    // InternalSim.g:1846:1: entryRuleSDetailType returns [EObject current=null] : iv_ruleSDetailType= ruleSDetailType EOF ;
    public final EObject entryRuleSDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDetailType = null;


        try {
            // InternalSim.g:1846:52: (iv_ruleSDetailType= ruleSDetailType EOF )
            // InternalSim.g:1847:2: iv_ruleSDetailType= ruleSDetailType EOF
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
    // InternalSim.g:1853:1: ruleSDetailType returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSDetailType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_abstract_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_abstract_7_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token lv_abstract_12_0=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token lv_abstract_17_0=null;
        Token otherlv_18=null;
        Token lv_abstract_20_0=null;
        Token otherlv_21=null;
        Token lv_name_22_0=null;
        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_9_0 = null;

        EObject lv_deductionRule_14_0 = null;

        EObject lv_deductionRule_19_0 = null;

        EObject this_SComplexTypeExtends_23 = null;

        EObject this_SComplexTypeFeatures_24 = null;



        	enterRule();

        try {
            // InternalSim.g:1859:2: ( ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:1860:2: ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:1860:2: ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:1861:3: ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:1861:3: ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt37=1;
                }
                break;
            case 29:
                {
                alt37=2;
                }
                break;
            case 33:
                {
                alt37=3;
                }
                break;
            case 34:
                {
                alt37=4;
                }
                break;
            case 31:
            case 35:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalSim.g:1862:4: ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1862:4: ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:1863:5: () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    {
                    // InternalSim.g:1863:5: ()
                    // InternalSim.g:1864:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_28); 

                    					newLeafNode(otherlv_1, grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_1());
                    				
                    // InternalSim.g:1874:5: ( (lv_abstract_2_0= 'abstract' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==31) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalSim.g:1875:6: (lv_abstract_2_0= 'abstract' )
                            {
                            // InternalSim.g:1875:6: (lv_abstract_2_0= 'abstract' )
                            // InternalSim.g:1876:7: lv_abstract_2_0= 'abstract'
                            {
                            lv_abstract_2_0=(Token)match(input,31,FOLLOW_29); 

                            							newLeafNode(lv_abstract_2_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_3());
                    				
                    // InternalSim.g:1892:5: ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:1893:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:1893:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:1894:7: lv_deductionRule_4_0= ruleSGrabComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_4_0=ruleSGrabComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_4_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SGrabComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1913:4: ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1913:4: ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:1914:5: () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) )
                    {
                    // InternalSim.g:1914:5: ()
                    // InternalSim.g:1915:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_28); 

                    					newLeafNode(otherlv_6, grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1());
                    				
                    // InternalSim.g:1925:5: ( (lv_abstract_7_0= 'abstract' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==31) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSim.g:1926:6: (lv_abstract_7_0= 'abstract' )
                            {
                            // InternalSim.g:1926:6: (lv_abstract_7_0= 'abstract' )
                            // InternalSim.g:1927:7: lv_abstract_7_0= 'abstract'
                            {
                            lv_abstract_7_0=(Token)match(input,31,FOLLOW_29); 

                            							newLeafNode(lv_abstract_7_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,35,FOLLOW_3); 

                    					newLeafNode(otherlv_8, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_3());
                    				
                    // InternalSim.g:1943:5: ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:1944:6: (lv_deductionRule_9_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:1944:6: (lv_deductionRule_9_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:1945:7: lv_deductionRule_9_0= ruleSDitchComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_9_0=ruleSDitchComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_9_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SDitchComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1964:4: ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1964:4: ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:1965:5: () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) )
                    {
                    // InternalSim.g:1965:5: ()
                    // InternalSim.g:1966:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0(),
                    							current);
                    					

                    }

                    otherlv_11=(Token)match(input,33,FOLLOW_28); 

                    					newLeafNode(otherlv_11, grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1());
                    				
                    // InternalSim.g:1976:5: ( (lv_abstract_12_0= 'abstract' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==31) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalSim.g:1977:6: (lv_abstract_12_0= 'abstract' )
                            {
                            // InternalSim.g:1977:6: (lv_abstract_12_0= 'abstract' )
                            // InternalSim.g:1978:7: lv_abstract_12_0= 'abstract'
                            {
                            lv_abstract_12_0=(Token)match(input,31,FOLLOW_29); 

                            							newLeafNode(lv_abstract_12_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,35,FOLLOW_3); 

                    					newLeafNode(otherlv_13, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_3());
                    				
                    // InternalSim.g:1994:5: ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:1995:6: (lv_deductionRule_14_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:1995:6: (lv_deductionRule_14_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:1996:7: lv_deductionRule_14_0= ruleSMorphComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_14_0=ruleSMorphComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_14_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SMorphComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:2015:4: ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2015:4: ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:2016:5: () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) )
                    {
                    // InternalSim.g:2016:5: ()
                    // InternalSim.g:2017:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0(),
                    							current);
                    					

                    }

                    otherlv_16=(Token)match(input,34,FOLLOW_28); 

                    					newLeafNode(otherlv_16, grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1());
                    				
                    // InternalSim.g:2027:5: ( (lv_abstract_17_0= 'abstract' ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==31) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalSim.g:2028:6: (lv_abstract_17_0= 'abstract' )
                            {
                            // InternalSim.g:2028:6: (lv_abstract_17_0= 'abstract' )
                            // InternalSim.g:2029:7: lv_abstract_17_0= 'abstract'
                            {
                            lv_abstract_17_0=(Token)match(input,31,FOLLOW_29); 

                            							newLeafNode(lv_abstract_17_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,35,FOLLOW_3); 

                    					newLeafNode(otherlv_18, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_3());
                    				
                    // InternalSim.g:2045:5: ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:2046:6: (lv_deductionRule_19_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:2046:6: (lv_deductionRule_19_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:2047:7: lv_deductionRule_19_0= ruleSFuseComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_deductionRule_19_0=ruleSFuseComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_19_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SFuseComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:2066:4: ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] )
                    {
                    // InternalSim.g:2066:4: ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] )
                    // InternalSim.g:2067:5: ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current]
                    {
                    // InternalSim.g:2067:5: ( (lv_abstract_20_0= 'abstract' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==31) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalSim.g:2068:6: (lv_abstract_20_0= 'abstract' )
                            {
                            // InternalSim.g:2068:6: (lv_abstract_20_0= 'abstract' )
                            // InternalSim.g:2069:7: lv_abstract_20_0= 'abstract'
                            {
                            lv_abstract_20_0=(Token)match(input,31,FOLLOW_29); 

                            							newLeafNode(lv_abstract_20_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,35,FOLLOW_3); 

                    					newLeafNode(otherlv_21, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1());
                    				
                    // InternalSim.g:2085:5: ( (lv_name_22_0= RULE_ID ) )
                    // InternalSim.g:2086:6: (lv_name_22_0= RULE_ID )
                    {
                    // InternalSim.g:2086:6: (lv_name_22_0= RULE_ID )
                    // InternalSim.g:2087:7: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    							newLeafNode(lv_name_22_0, grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_4_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSDetailTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_22_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSDetailTypeRule());
                    					}
                    					newCompositeNode(grammarAccess.getSDetailTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_3());
                    				
                    pushFollow(FOLLOW_15);
                    this_SComplexTypeExtends_23=ruleSComplexTypeExtends(current);

                    state._fsp--;


                    					current = this_SComplexTypeExtends_23;
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
            this_SComplexTypeFeatures_24=ruleSComplexTypeFeatures(current);

            state._fsp--;


            			current = this_SComplexTypeFeatures_24;
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
    // InternalSim.g:2132:1: ruleSComplexTypeExtends[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? ;
    public final EObject ruleSComplexTypeExtends(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSim.g:2138:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? )
            // InternalSim.g:2139:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            {
            // InternalSim.g:2139:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSim.g:2140:3: otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_3); 

                    			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0());
                    		
                    // InternalSim.g:2144:3: ( (otherlv_1= RULE_ID ) )
                    // InternalSim.g:2145:4: (otherlv_1= RULE_ID )
                    {
                    // InternalSim.g:2145:4: (otherlv_1= RULE_ID )
                    // InternalSim.g:2146:5: otherlv_1= RULE_ID
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
    // InternalSim.g:2162:1: ruleSComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2168:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' ) )
            // InternalSim.g:2169:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' )
            {
            // InternalSim.g:2169:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' )
            // InternalSim.g:2170:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSim.g:2174:3: ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==18||LA39_0==29||LA39_0==33||(LA39_0>=35 && LA39_0<=38)||LA39_0==49) ) {
                    alt39=1;
                }
                else if ( (LA39_0==22) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSim.g:2175:4: ( (lv_features_1_0= ruleSFeature ) )
            	    {
            	    // InternalSim.g:2175:4: ( (lv_features_1_0= ruleSFeature ) )
            	    // InternalSim.g:2176:5: (lv_features_1_0= ruleSFeature )
            	    {
            	    // InternalSim.g:2176:5: (lv_features_1_0= ruleSFeature )
            	    // InternalSim.g:2177:6: lv_features_1_0= ruleSFeature
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
            	    							"com.mimacom.ddd.sm.sim.Sim.SFeature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:2195:4: ( (lv_constraints_2_0= ruleSConstraint ) )
            	    {
            	    // InternalSim.g:2195:4: ( (lv_constraints_2_0= ruleSConstraint ) )
            	    // InternalSim.g:2196:5: (lv_constraints_2_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:2196:5: (lv_constraints_2_0= ruleSConstraint )
            	    // InternalSim.g:2197:6: lv_constraints_2_0= ruleSConstraint
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
            	    							"com.mimacom.ddd.sm.sim.Sim.SConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalSim.g:2223:1: entryRuleSFeature returns [EObject current=null] : iv_ruleSFeature= ruleSFeature EOF ;
    public final EObject entryRuleSFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFeature = null;


        try {
            // InternalSim.g:2223:49: (iv_ruleSFeature= ruleSFeature EOF )
            // InternalSim.g:2224:2: iv_ruleSFeature= ruleSFeature EOF
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
    // InternalSim.g:2230:1: ruleSFeature returns [EObject current=null] : (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) ;
    public final EObject ruleSFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SAssociation_0 = null;

        EObject this_SAttribute_1 = null;

        EObject this_SQuery_2 = null;



        	enterRule();

        try {
            // InternalSim.g:2236:2: ( (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) )
            // InternalSim.g:2237:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            {
            // InternalSim.g:2237:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 35:
                case 39:
                    {
                    alt40=2;
                    }
                    break;
                case 36:
                case 37:
                    {
                    alt40=1;
                    }
                    break;
                case 41:
                    {
                    alt40=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }

                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 35:
                case 39:
                    {
                    alt40=2;
                    }
                    break;
                case 41:
                    {
                    alt40=3;
                    }
                    break;
                case 36:
                case 37:
                    {
                    alt40=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 35:
                case 39:
                    {
                    alt40=2;
                    }
                    break;
                case 41:
                    {
                    alt40=3;
                    }
                    break;
                case 36:
                case 37:
                    {
                    alt40=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }

                }
                break;
            case 36:
            case 37:
            case 38:
            case 49:
                {
                alt40=1;
                }
                break;
            case 35:
                {
                alt40=2;
                }
                break;
            case RULE_ID:
                {
                int LA40_6 = input.LA(2);

                if ( (LA40_6==42) ) {
                    alt40=3;
                }
                else if ( (LA40_6==17) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSim.g:2238:3: this_SAssociation_0= ruleSAssociation
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
                    // InternalSim.g:2247:3: this_SAttribute_1= ruleSAttribute
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
                    // InternalSim.g:2256:3: this_SQuery_2= ruleSQuery
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
    // InternalSim.g:2268:1: entryRuleSAssociation returns [EObject current=null] : iv_ruleSAssociation= ruleSAssociation EOF ;
    public final EObject entryRuleSAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAssociation = null;


        try {
            // InternalSim.g:2268:53: (iv_ruleSAssociation= ruleSAssociation EOF )
            // InternalSim.g:2269:2: iv_ruleSAssociation= ruleSAssociation EOF
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
    // InternalSim.g:2275:1: ruleSAssociation returns [EObject current=null] : ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) ) ;
    public final EObject ruleSAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_derived_15_0=null;
        Token otherlv_18=null;
        Token lv_name_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_9_0 = null;

        EObject lv_deductionRule_14_0 = null;

        Enumerator lv_kind_16_0 = null;

        Enumerator lv_kind_17_0 = null;

        EObject lv_multiplicity_22_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2281:2: ( ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) ) )
            // InternalSim.g:2282:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) )
            {
            // InternalSim.g:2282:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt47=1;
                }
                break;
            case 33:
                {
                alt47=2;
                }
                break;
            case 29:
                {
                alt47=3;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 49:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalSim.g:2283:3: ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2283:3: ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2284:4: () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:2284:4: ()
                    // InternalSim.g:2285:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getSAssociationAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:2295:4: (otherlv_2= 'reference' | otherlv_3= 'composite' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==36) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==37) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSim.g:2296:5: otherlv_2= 'reference'
                            {
                            otherlv_2=(Token)match(input,36,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2301:5: otherlv_3= 'composite'
                            {
                            otherlv_3=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getSAssociationAccess().getCompositeKeyword_0_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2306:4: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2307:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2307:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2308:6: lv_deductionRule_4_0= ruleSGrabFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAssociationAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_4_0=ruleSGrabFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_4_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SGrabFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:2327:3: ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2327:3: ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2328:4: () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:2328:4: ()
                    // InternalSim.g:2329:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getSAssociationAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:2339:4: (otherlv_7= 'reference' | otherlv_8= 'composite' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==36) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==37) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSim.g:2340:5: otherlv_7= 'reference'
                            {
                            otherlv_7=(Token)match(input,36,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2345:5: otherlv_8= 'composite'
                            {
                            otherlv_8=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_8, grammarAccess.getSAssociationAccess().getCompositeKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2350:4: ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2351:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2351:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2352:6: lv_deductionRule_9_0= ruleSMorphFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAssociationAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_9_0=ruleSMorphFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_9_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SMorphFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:2371:3: ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2371:3: ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2372:4: () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:2372:4: ()
                    // InternalSim.g:2373:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_31); 

                    				newLeafNode(otherlv_11, grammarAccess.getSAssociationAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:2383:4: (otherlv_12= 'reference' | otherlv_13= 'composite' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==36) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==37) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalSim.g:2384:5: otherlv_12= 'reference'
                            {
                            otherlv_12=(Token)match(input,36,FOLLOW_3); 

                            					newLeafNode(otherlv_12, grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2389:5: otherlv_13= 'composite'
                            {
                            otherlv_13=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_13, grammarAccess.getSAssociationAccess().getCompositeKeyword_2_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2394:4: ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2395:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2395:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2396:6: lv_deductionRule_14_0= ruleSDitchFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAssociationAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_14_0=ruleSDitchFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_14_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SDitchFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:2415:3: ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? )
                    {
                    // InternalSim.g:2415:3: ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? )
                    // InternalSim.g:2416:4: ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )?
                    {
                    // InternalSim.g:2416:4: ( (lv_derived_15_0= 'derived' ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==38) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSim.g:2417:5: (lv_derived_15_0= 'derived' )
                            {
                            // InternalSim.g:2417:5: (lv_derived_15_0= 'derived' )
                            // InternalSim.g:2418:6: lv_derived_15_0= 'derived'
                            {
                            lv_derived_15_0=(Token)match(input,38,FOLLOW_32); 

                            						newLeafNode(lv_derived_15_0, grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAssociationRule());
                            						}
                            						setWithLastConsumed(current, "derived", true, "derived");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2430:4: ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=36 && LA45_0<=37)) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==49) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalSim.g:2431:5: ( (lv_kind_16_0= ruleSAssociationKind ) )
                            {
                            // InternalSim.g:2431:5: ( (lv_kind_16_0= ruleSAssociationKind ) )
                            // InternalSim.g:2432:6: (lv_kind_16_0= ruleSAssociationKind )
                            {
                            // InternalSim.g:2432:6: (lv_kind_16_0= ruleSAssociationKind )
                            // InternalSim.g:2433:7: lv_kind_16_0= ruleSAssociationKind
                            {

                            							newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindEnumRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_3);
                            lv_kind_16_0=ruleSAssociationKind();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSAssociationRule());
                            							}
                            							set(
                            								current,
                            								"kind",
                            								lv_kind_16_0,
                            								"com.mimacom.ddd.sm.sim.Sim.SAssociationKind");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSim.g:2451:5: ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' )
                            {
                            // InternalSim.g:2451:5: ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' )
                            // InternalSim.g:2452:6: ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite'
                            {
                            // InternalSim.g:2452:6: ( (lv_kind_17_0= ruleSAssociationKindInverse ) )
                            // InternalSim.g:2453:7: (lv_kind_17_0= ruleSAssociationKindInverse )
                            {
                            // InternalSim.g:2453:7: (lv_kind_17_0= ruleSAssociationKindInverse )
                            // InternalSim.g:2454:8: lv_kind_17_0= ruleSAssociationKindInverse
                            {

                            								newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_3_1_1_0_0());
                            							
                            pushFollow(FOLLOW_33);
                            lv_kind_17_0=ruleSAssociationKindInverse();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getSAssociationRule());
                            								}
                            								set(
                            									current,
                            									"kind",
                            									lv_kind_17_0,
                            									"com.mimacom.ddd.sm.sim.Sim.SAssociationKindInverse");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_18=(Token)match(input,37,FOLLOW_3); 

                            						newLeafNode(otherlv_18, grammarAccess.getSAssociationAccess().getCompositeKeyword_3_1_1_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2477:4: ( (lv_name_19_0= RULE_ID ) )
                    // InternalSim.g:2478:5: (lv_name_19_0= RULE_ID )
                    {
                    // InternalSim.g:2478:5: (lv_name_19_0= RULE_ID )
                    // InternalSim.g:2479:6: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_19_0, grammarAccess.getSAssociationAccess().getNameIDTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAssociationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_19_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getSAssociationAccess().getColonKeyword_3_3());
                    			
                    // InternalSim.g:2499:4: ( (otherlv_21= RULE_ID ) )
                    // InternalSim.g:2500:5: (otherlv_21= RULE_ID )
                    {
                    // InternalSim.g:2500:5: (otherlv_21= RULE_ID )
                    // InternalSim.g:2501:6: otherlv_21= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAssociationRule());
                    						}
                    					
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_21, grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_3_4_0());
                    					

                    }


                    }

                    // InternalSim.g:2512:4: ( (lv_multiplicity_22_0= ruleSMultiplicity ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==42) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalSim.g:2513:5: (lv_multiplicity_22_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:2513:5: (lv_multiplicity_22_0= ruleSMultiplicity )
                            // InternalSim.g:2514:6: lv_multiplicity_22_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSAssociationAccess().getMultiplicitySMultiplicityParserRuleCall_3_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_multiplicity_22_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSAssociationRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_22_0,
                            							"com.mimacom.ddd.sm.sim.Sim.SMultiplicity");
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
    // InternalSim.g:2536:1: entryRuleSAttribute returns [EObject current=null] : iv_ruleSAttribute= ruleSAttribute EOF ;
    public final EObject entryRuleSAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttribute = null;


        try {
            // InternalSim.g:2536:51: (iv_ruleSAttribute= ruleSAttribute EOF )
            // InternalSim.g:2537:2: iv_ruleSAttribute= ruleSAttribute EOF
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
    // InternalSim.g:2543:1: ruleSAttribute returns [EObject current=null] : ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) ) ;
    public final EObject ruleSAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_detail_3_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_detail_8_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_detail_13_0=null;
        Token lv_detail_15_0=null;
        Token lv_name_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_key_20_0=null;
        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_9_0 = null;

        EObject lv_deductionRule_14_0 = null;

        EObject lv_multiplicity_19_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2549:2: ( ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) ) )
            // InternalSim.g:2550:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) )
            {
            // InternalSim.g:2550:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt54=1;
                }
                break;
            case 33:
                {
                alt54=2;
                }
                break;
            case 29:
                {
                alt54=3;
                }
                break;
            case RULE_ID:
            case 35:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalSim.g:2551:3: ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2551:3: ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2552:4: () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:2552:4: ()
                    // InternalSim.g:2553:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getSAttributeAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:2563:4: (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )?
                    int alt48=3;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==39) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==35) ) {
                        alt48=2;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalSim.g:2564:5: otherlv_2= 'attribute'
                            {
                            otherlv_2=(Token)match(input,39,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2569:5: ( (lv_detail_3_0= 'detail' ) )
                            {
                            // InternalSim.g:2569:5: ( (lv_detail_3_0= 'detail' ) )
                            // InternalSim.g:2570:6: (lv_detail_3_0= 'detail' )
                            {
                            // InternalSim.g:2570:6: (lv_detail_3_0= 'detail' )
                            // InternalSim.g:2571:7: lv_detail_3_0= 'detail'
                            {
                            lv_detail_3_0=(Token)match(input,35,FOLLOW_3); 

                            							newLeafNode(lv_detail_3_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSAttributeRule());
                            							}
                            							setWithLastConsumed(current, "detail", true, "detail");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSim.g:2584:4: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2585:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2585:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2586:6: lv_deductionRule_4_0= ruleSGrabFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAttributeAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_4_0=ruleSGrabFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_4_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SGrabFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:2605:3: ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2605:3: ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2606:4: () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:2606:4: ()
                    // InternalSim.g:2607:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getSAttributeAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:2617:4: (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )?
                    int alt49=3;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==39) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==35) ) {
                        alt49=2;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalSim.g:2618:5: otherlv_7= 'attribute'
                            {
                            otherlv_7=(Token)match(input,39,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2623:5: ( (lv_detail_8_0= 'detail' ) )
                            {
                            // InternalSim.g:2623:5: ( (lv_detail_8_0= 'detail' ) )
                            // InternalSim.g:2624:6: (lv_detail_8_0= 'detail' )
                            {
                            // InternalSim.g:2624:6: (lv_detail_8_0= 'detail' )
                            // InternalSim.g:2625:7: lv_detail_8_0= 'detail'
                            {
                            lv_detail_8_0=(Token)match(input,35,FOLLOW_3); 

                            							newLeafNode(lv_detail_8_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSAttributeRule());
                            							}
                            							setWithLastConsumed(current, "detail", true, "detail");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSim.g:2638:4: ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2639:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2639:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2640:6: lv_deductionRule_9_0= ruleSMorphFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAttributeAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_9_0=ruleSMorphFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_9_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SMorphFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:2659:3: ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2659:3: ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2660:4: () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:2660:4: ()
                    // InternalSim.g:2661:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getSAttributeAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:2671:4: (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )?
                    int alt50=3;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==39) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==35) ) {
                        alt50=2;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalSim.g:2672:5: otherlv_12= 'attribute'
                            {
                            otherlv_12=(Token)match(input,39,FOLLOW_3); 

                            					newLeafNode(otherlv_12, grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2677:5: ( (lv_detail_13_0= 'detail' ) )
                            {
                            // InternalSim.g:2677:5: ( (lv_detail_13_0= 'detail' ) )
                            // InternalSim.g:2678:6: (lv_detail_13_0= 'detail' )
                            {
                            // InternalSim.g:2678:6: (lv_detail_13_0= 'detail' )
                            // InternalSim.g:2679:7: lv_detail_13_0= 'detail'
                            {
                            lv_detail_13_0=(Token)match(input,35,FOLLOW_3); 

                            							newLeafNode(lv_detail_13_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSAttributeRule());
                            							}
                            							setWithLastConsumed(current, "detail", true, "detail");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSim.g:2692:4: ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2693:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2693:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2694:6: lv_deductionRule_14_0= ruleSDitchFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSAttributeAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_14_0=ruleSDitchFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_14_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SDitchFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:2713:3: ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? )
                    {
                    // InternalSim.g:2713:3: ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? )
                    // InternalSim.g:2714:4: ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )?
                    {
                    // InternalSim.g:2714:4: ( (lv_detail_15_0= 'detail' ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==35) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalSim.g:2715:5: (lv_detail_15_0= 'detail' )
                            {
                            // InternalSim.g:2715:5: (lv_detail_15_0= 'detail' )
                            // InternalSim.g:2716:6: lv_detail_15_0= 'detail'
                            {
                            lv_detail_15_0=(Token)match(input,35,FOLLOW_3); 

                            						newLeafNode(lv_detail_15_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "detail", true, "detail");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2728:4: ( (lv_name_16_0= RULE_ID ) )
                    // InternalSim.g:2729:5: (lv_name_16_0= RULE_ID )
                    {
                    // InternalSim.g:2729:5: (lv_name_16_0= RULE_ID )
                    // InternalSim.g:2730:6: lv_name_16_0= RULE_ID
                    {
                    lv_name_16_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_16_0, grammarAccess.getSAttributeAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_16_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSAttributeAccess().getColonKeyword_3_2());
                    			
                    // InternalSim.g:2750:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSim.g:2751:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSim.g:2751:5: (otherlv_18= RULE_ID )
                    // InternalSim.g:2752:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAttributeRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_18, grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0());
                    					

                    }


                    }

                    // InternalSim.g:2763:4: ( (lv_multiplicity_19_0= ruleSMultiplicity ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==42) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalSim.g:2764:5: (lv_multiplicity_19_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:2764:5: (lv_multiplicity_19_0= ruleSMultiplicity )
                            // InternalSim.g:2765:6: lv_multiplicity_19_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_3_4_0());
                            					
                            pushFollow(FOLLOW_36);
                            lv_multiplicity_19_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSAttributeRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_19_0,
                            							"com.mimacom.ddd.sm.sim.Sim.SMultiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2782:4: ( (lv_key_20_0= 'key' ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==40) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalSim.g:2783:5: (lv_key_20_0= 'key' )
                            {
                            // InternalSim.g:2783:5: (lv_key_20_0= 'key' )
                            // InternalSim.g:2784:6: lv_key_20_0= 'key'
                            {
                            lv_key_20_0=(Token)match(input,40,FOLLOW_2); 

                            						newLeafNode(lv_key_20_0, grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0());
                            					

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
    // InternalSim.g:2801:1: entryRuleSQuery returns [EObject current=null] : iv_ruleSQuery= ruleSQuery EOF ;
    public final EObject entryRuleSQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQuery = null;


        try {
            // InternalSim.g:2801:47: (iv_ruleSQuery= ruleSQuery EOF )
            // InternalSim.g:2802:2: iv_ruleSQuery= ruleSQuery EOF
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
    // InternalSim.g:2808:1: ruleSQuery returns [EObject current=null] : ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) ) ;
    public final EObject ruleSQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_7_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_deductionRule_16_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_multiplicity_25_0 = null;

        EObject lv_returns_27_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2814:2: ( ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) ) )
            // InternalSim.g:2815:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) )
            {
            // InternalSim.g:2815:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 18:
            case 33:
                {
                alt63=1;
                }
                break;
            case 29:
                {
                alt63=2;
                }
                break;
            case RULE_ID:
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
                    // InternalSim.g:2816:3: ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' )
                    {
                    // InternalSim.g:2816:3: ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' )
                    // InternalSim.g:2817:4: ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')'
                    {
                    // InternalSim.g:2817:4: ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==18) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==33) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSim.g:2818:5: ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            {
                            // InternalSim.g:2818:5: ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            // InternalSim.g:2819:6: () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            {
                            // InternalSim.g:2819:6: ()
                            // InternalSim.g:2820:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_1=(Token)match(input,18,FOLLOW_37); 

                            						newLeafNode(otherlv_1, grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_1());
                            					
                            otherlv_2=(Token)match(input,41,FOLLOW_3); 

                            						newLeafNode(otherlv_2, grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2());
                            					
                            // InternalSim.g:2834:6: ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            // InternalSim.g:2835:7: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            {
                            // InternalSim.g:2835:7: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            // InternalSim.g:2836:8: lv_deductionRule_3_0= ruleSGrabFeatureRule
                            {

                            								newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_0_0_3_0());
                            							
                            pushFollow(FOLLOW_38);
                            lv_deductionRule_3_0=ruleSGrabFeatureRule();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getSQueryRule());
                            								}
                            								set(
                            									current,
                            									"deductionRule",
                            									lv_deductionRule_3_0,
                            									"com.mimacom.ddd.sm.sim.Sim.SGrabFeatureRule");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSim.g:2855:5: ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) )
                            {
                            // InternalSim.g:2855:5: ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) )
                            // InternalSim.g:2856:6: () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) )
                            {
                            // InternalSim.g:2856:6: ()
                            // InternalSim.g:2857:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_5=(Token)match(input,33,FOLLOW_37); 

                            						newLeafNode(otherlv_5, grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1());
                            					
                            otherlv_6=(Token)match(input,41,FOLLOW_3); 

                            						newLeafNode(otherlv_6, grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2());
                            					
                            // InternalSim.g:2871:6: ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) )
                            // InternalSim.g:2872:7: (lv_deductionRule_7_0= ruleSMorphFeatureRule )
                            {
                            // InternalSim.g:2872:7: (lv_deductionRule_7_0= ruleSMorphFeatureRule )
                            // InternalSim.g:2873:8: lv_deductionRule_7_0= ruleSMorphFeatureRule
                            {

                            								newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_0_0_1_3_0());
                            							
                            pushFollow(FOLLOW_38);
                            lv_deductionRule_7_0=ruleSMorphFeatureRule();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getSQueryRule());
                            								}
                            								set(
                            									current,
                            									"deductionRule",
                            									lv_deductionRule_7_0,
                            									"com.mimacom.ddd.sm.sim.Sim.SMorphFeatureRule");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSim.g:2896:4: (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==43) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==RULE_ID||LA58_0==18||LA58_0==29||LA58_0==33||LA58_0==44) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalSim.g:2897:5: otherlv_9= '*'
                            {
                            otherlv_9=(Token)match(input,43,FOLLOW_40); 

                            					newLeafNode(otherlv_9, grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2902:5: ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )?
                            {
                            // InternalSim.g:2902:5: ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==RULE_ID||LA57_0==18||LA57_0==29||LA57_0==33) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // InternalSim.g:2903:6: ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )*
                                    {
                                    // InternalSim.g:2903:6: ( (lv_parameters_10_0= ruleSQueryParameter ) )
                                    // InternalSim.g:2904:7: (lv_parameters_10_0= ruleSQueryParameter )
                                    {
                                    // InternalSim.g:2904:7: (lv_parameters_10_0= ruleSQueryParameter )
                                    // InternalSim.g:2905:8: lv_parameters_10_0= ruleSQueryParameter
                                    {

                                    								newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_0_0());
                                    							
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
                                    									"com.mimacom.ddd.sm.sim.Sim.SQueryParameter");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalSim.g:2922:6: (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )*
                                    loop56:
                                    do {
                                        int alt56=2;
                                        int LA56_0 = input.LA(1);

                                        if ( (LA56_0==30) ) {
                                            alt56=1;
                                        }


                                        switch (alt56) {
                                    	case 1 :
                                    	    // InternalSim.g:2923:7: otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) )
                                    	    {
                                    	    otherlv_11=(Token)match(input,30,FOLLOW_42); 

                                    	    							newLeafNode(otherlv_11, grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0());
                                    	    						
                                    	    // InternalSim.g:2927:7: ( (lv_parameters_12_0= ruleSQueryParameter ) )
                                    	    // InternalSim.g:2928:8: (lv_parameters_12_0= ruleSQueryParameter )
                                    	    {
                                    	    // InternalSim.g:2928:8: (lv_parameters_12_0= ruleSQueryParameter )
                                    	    // InternalSim.g:2929:9: lv_parameters_12_0= ruleSQueryParameter
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_1_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_41);
                                    	    lv_parameters_12_0=ruleSQueryParameter();

                                    	    state._fsp--;


                                    	    									if (current==null) {
                                    	    										current = createModelElementForParent(grammarAccess.getSQueryRule());
                                    	    									}
                                    	    									add(
                                    	    										current,
                                    	    										"parameters",
                                    	    										lv_parameters_12_0,
                                    	    										"com.mimacom.ddd.sm.sim.Sim.SQueryParameter");
                                    	    									afterParserOrEnumRuleCall();
                                    	    								

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop56;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:2955:3: (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2955:3: (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2956:4: otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_37); 

                    				newLeafNode(otherlv_14, grammarAccess.getSQueryAccess().getDitchKeyword_1_0());
                    			
                    otherlv_15=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getSQueryAccess().getQueryKeyword_1_1());
                    			
                    // InternalSim.g:2964:4: ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2965:5: (lv_deductionRule_16_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2965:5: (lv_deductionRule_16_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2966:6: lv_deductionRule_16_0= ruleSDitchFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_16_0=ruleSDitchFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_16_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SDitchFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:2985:3: ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? )
                    {
                    // InternalSim.g:2985:3: ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? )
                    // InternalSim.g:2986:4: ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )?
                    {
                    // InternalSim.g:2986:4: ( (lv_name_17_0= RULE_ID ) )
                    // InternalSim.g:2987:5: (lv_name_17_0= RULE_ID )
                    {
                    // InternalSim.g:2987:5: (lv_name_17_0= RULE_ID )
                    // InternalSim.g:2988:6: lv_name_17_0= RULE_ID
                    {
                    lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(lv_name_17_0, grammarAccess.getSQueryAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_17_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,42,FOLLOW_43); 

                    				newLeafNode(otherlv_18, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSim.g:3008:4: ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_ID||LA60_0==18||LA60_0==29||LA60_0==33) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalSim.g:3009:5: ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )*
                            {
                            // InternalSim.g:3009:5: ( (lv_parameters_19_0= ruleSQueryParameter ) )
                            // InternalSim.g:3010:6: (lv_parameters_19_0= ruleSQueryParameter )
                            {
                            // InternalSim.g:3010:6: (lv_parameters_19_0= ruleSQueryParameter )
                            // InternalSim.g:3011:7: lv_parameters_19_0= ruleSQueryParameter
                            {

                            							newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_0_0());
                            						
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
                            								"com.mimacom.ddd.sm.sim.Sim.SQueryParameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalSim.g:3028:5: (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==30) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // InternalSim.g:3029:6: otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) )
                            	    {
                            	    otherlv_20=(Token)match(input,30,FOLLOW_42); 

                            	    						newLeafNode(otherlv_20, grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalSim.g:3033:6: ( (lv_parameters_21_0= ruleSQueryParameter ) )
                            	    // InternalSim.g:3034:7: (lv_parameters_21_0= ruleSQueryParameter )
                            	    {
                            	    // InternalSim.g:3034:7: (lv_parameters_21_0= ruleSQueryParameter )
                            	    // InternalSim.g:3035:8: lv_parameters_21_0= ruleSQueryParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_41);
                            	    lv_parameters_21_0=ruleSQueryParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSQueryRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_21_0,
                            	    									"com.mimacom.ddd.sm.sim.Sim.SQueryParameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop59;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,44,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3());
                    			
                    otherlv_23=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getSQueryAccess().getColonKeyword_2_4());
                    			
                    // InternalSim.g:3062:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSim.g:3063:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSim.g:3063:5: (otherlv_24= RULE_ID )
                    // InternalSim.g:3064:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_44); 

                    						newLeafNode(otherlv_24, grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0());
                    					

                    }


                    }

                    // InternalSim.g:3075:4: ( (lv_multiplicity_25_0= ruleSMultiplicity ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==42) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalSim.g:3076:5: (lv_multiplicity_25_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:3076:5: (lv_multiplicity_25_0= ruleSMultiplicity )
                            // InternalSim.g:3077:6: lv_multiplicity_25_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_2_6_0());
                            					
                            pushFollow(FOLLOW_45);
                            lv_multiplicity_25_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSQueryRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_25_0,
                            							"com.mimacom.ddd.sm.sim.Sim.SMultiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:3094:4: (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==45) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalSim.g:3095:5: otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) )
                            {
                            otherlv_26=(Token)match(input,45,FOLLOW_18); 

                            					newLeafNode(otherlv_26, grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0());
                            				
                            // InternalSim.g:3099:5: ( (lv_returns_27_0= ruleSExpression ) )
                            // InternalSim.g:3100:6: (lv_returns_27_0= ruleSExpression )
                            {
                            // InternalSim.g:3100:6: (lv_returns_27_0= ruleSExpression )
                            // InternalSim.g:3101:7: lv_returns_27_0= ruleSExpression
                            {

                            							newCompositeNode(grammarAccess.getSQueryAccess().getReturnsSExpressionParserRuleCall_2_7_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_returns_27_0=ruleSExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSQueryRule());
                            							}
                            							set(
                            								current,
                            								"returns",
                            								lv_returns_27_0,
                            								"com.mimacom.ddd.sm.sim.Sim.SExpression");
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
    // InternalSim.g:3124:1: entryRuleSQueryParameter returns [EObject current=null] : iv_ruleSQueryParameter= ruleSQueryParameter EOF ;
    public final EObject entryRuleSQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryParameter = null;


        try {
            // InternalSim.g:3124:56: (iv_ruleSQueryParameter= ruleSQueryParameter EOF )
            // InternalSim.g:3125:2: iv_ruleSQueryParameter= ruleSQueryParameter EOF
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
    // InternalSim.g:3131:1: ruleSQueryParameter returns [EObject current=null] : ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) ) ;
    public final EObject ruleSQueryParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_5_0 = null;

        EObject lv_deductionRule_8_0 = null;

        EObject lv_multiplicity_12_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3137:2: ( ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) ) )
            // InternalSim.g:3138:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) )
            {
            // InternalSim.g:3138:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt65=1;
                }
                break;
            case 33:
                {
                alt65=2;
                }
                break;
            case 29:
                {
                alt65=3;
                }
                break;
            case RULE_ID:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalSim.g:3139:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:3139:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:3140:4: () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:3140:4: ()
                    // InternalSim.g:3141:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:3151:4: ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:3152:5: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:3152:5: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    // InternalSim.g:3153:6: lv_deductionRule_2_0= ruleSGrabFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSQueryParameterAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_2_0=ruleSGrabFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_2_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SGrabFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3172:3: ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:3172:3: ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:3173:4: () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:3173:4: ()
                    // InternalSim.g:3174:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:3184:4: ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:3185:5: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:3185:5: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                    // InternalSim.g:3186:6: lv_deductionRule_5_0= ruleSMorphFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSQueryParameterAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_5_0=ruleSMorphFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_5_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SMorphFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:3205:3: ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3205:3: ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3206:4: () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:3206:4: ()
                    // InternalSim.g:3207:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:3217:4: ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3218:5: (lv_deductionRule_8_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3218:5: (lv_deductionRule_8_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3219:6: lv_deductionRule_8_0= ruleSDitchFeatureRule
                    {

                    						newCompositeNode(grammarAccess.getSQueryParameterAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_deductionRule_8_0=ruleSDitchFeatureRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                    						}
                    						set(
                    							current,
                    							"deductionRule",
                    							lv_deductionRule_8_0,
                    							"com.mimacom.ddd.sm.sim.Sim.SDitchFeatureRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:3238:3: ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? )
                    {
                    // InternalSim.g:3238:3: ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? )
                    // InternalSim.g:3239:4: ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )?
                    {
                    // InternalSim.g:3239:4: ( (lv_name_9_0= RULE_ID ) )
                    // InternalSim.g:3240:5: (lv_name_9_0= RULE_ID )
                    {
                    // InternalSim.g:3240:5: (lv_name_9_0= RULE_ID )
                    // InternalSim.g:3241:6: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSQueryParameterAccess().getColonKeyword_3_1());
                    			
                    // InternalSim.g:3261:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSim.g:3262:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSim.g:3262:5: (otherlv_11= RULE_ID )
                    // InternalSim.g:3263:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryParameterRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_11, grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalSim.g:3274:4: ( (lv_multiplicity_12_0= ruleSMultiplicity ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==42) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalSim.g:3275:5: (lv_multiplicity_12_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:3275:5: (lv_multiplicity_12_0= ruleSMultiplicity )
                            // InternalSim.g:3276:6: lv_multiplicity_12_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_3_3_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_multiplicity_12_0=ruleSMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSQueryParameterRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_12_0,
                            							"com.mimacom.ddd.sm.sim.Sim.SMultiplicity");
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
    // InternalSim.g:3298:1: entryRuleSExpression returns [EObject current=null] : iv_ruleSExpression= ruleSExpression EOF ;
    public final EObject entryRuleSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSExpression = null;


        try {
            // InternalSim.g:3298:52: (iv_ruleSExpression= ruleSExpression EOF )
            // InternalSim.g:3299:2: iv_ruleSExpression= ruleSExpression EOF
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
    // InternalSim.g:3305:1: ruleSExpression returns [EObject current=null] : ( (lv_expr_0_0= RULE_STRING ) ) ;
    public final EObject ruleSExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:3311:2: ( ( (lv_expr_0_0= RULE_STRING ) ) )
            // InternalSim.g:3312:2: ( (lv_expr_0_0= RULE_STRING ) )
            {
            // InternalSim.g:3312:2: ( (lv_expr_0_0= RULE_STRING ) )
            // InternalSim.g:3313:3: (lv_expr_0_0= RULE_STRING )
            {
            // InternalSim.g:3313:3: (lv_expr_0_0= RULE_STRING )
            // InternalSim.g:3314:4: lv_expr_0_0= RULE_STRING
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
    // InternalSim.g:3333:1: entryRuleSQualifiedNameWithWildcard returns [String current=null] : iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF ;
    public final String entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedNameWithWildcard = null;


        try {
            // InternalSim.g:3333:66: (iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF )
            // InternalSim.g:3334:2: iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF
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
    // InternalSim.g:3340:1: ruleSQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3346:2: ( (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) )
            // InternalSim.g:3347:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            {
            // InternalSim.g:3347:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            // InternalSim.g:3348:3: this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_SQualifiedName_0=ruleSQualifiedName();

            state._fsp--;


            			current.merge(this_SQualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSim.g:3358:3: (kw= '.*' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==46) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSim.g:3359:4: kw= '.*'
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
    // InternalSim.g:3369:1: entryRuleSQualifiedName returns [String current=null] : iv_ruleSQualifiedName= ruleSQualifiedName EOF ;
    public final String entryRuleSQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedName = null;


        try {
            // InternalSim.g:3369:54: (iv_ruleSQualifiedName= ruleSQualifiedName EOF )
            // InternalSim.g:3370:2: iv_ruleSQualifiedName= ruleSQualifiedName EOF
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
    // InternalSim.g:3376:1: ruleSQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSim.g:3382:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSim.g:3383:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSim.g:3383:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSim.g:3384:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSim.g:3391:3: (kw= '.' this_ID_2= RULE_ID )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==47) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSim.g:3392:4: kw= '.' this_ID_2= RULE_ID
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
            	    break loop67;
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
    // InternalSim.g:3409:1: entryRuleSMultiplicity returns [EObject current=null] : iv_ruleSMultiplicity= ruleSMultiplicity EOF ;
    public final EObject entryRuleSMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMultiplicity = null;


        try {
            // InternalSim.g:3409:54: (iv_ruleSMultiplicity= ruleSMultiplicity EOF )
            // InternalSim.g:3410:2: iv_ruleSMultiplicity= ruleSMultiplicity EOF
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
    // InternalSim.g:3416:1: ruleSMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3422:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalSim.g:3423:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalSim.g:3423:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalSim.g:3424:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSim.g:3428:3: ( (lv_minOccurs_1_0= RULE_INT ) )
            // InternalSim.g:3429:4: (lv_minOccurs_1_0= RULE_INT )
            {
            // InternalSim.g:3429:4: (lv_minOccurs_1_0= RULE_INT )
            // InternalSim.g:3430:5: lv_minOccurs_1_0= RULE_INT
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
            		
            // InternalSim.g:3450:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalSim.g:3451:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalSim.g:3451:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalSim.g:3452:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
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
            						"com.mimacom.ddd.sm.sim.Sim.MULTIPLICITY");
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
    // InternalSim.g:3477:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalSim.g:3477:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalSim.g:3478:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalSim.g:3484:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:3490:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSim.g:3491:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSim.g:3491:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_INT) ) {
                alt68=1;
            }
            else if ( (LA68_0==43) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalSim.g:3492:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSim.g:3500:3: kw= '*'
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
    // InternalSim.g:3509:1: ruleSAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleSAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:3515:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalSim.g:3516:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalSim.g:3516:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==36) ) {
                alt69=1;
            }
            else if ( (LA69_0==37) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalSim.g:3517:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalSim.g:3517:3: (enumLiteral_0= 'reference' )
                    // InternalSim.g:3518:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3525:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalSim.g:3525:3: (enumLiteral_1= 'composite' )
                    // InternalSim.g:3526:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

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
    // InternalSim.g:3536:1: ruleSAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleSAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSim.g:3542:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalSim.g:3543:2: (enumLiteral_0= 'inverse' )
            {
            // InternalSim.g:3543:2: (enumLiteral_0= 'inverse' )
            // InternalSim.g:3544:3: enumLiteral_0= 'inverse'
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
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\22\2\uffff\2\34\1\uffff\2\37\1\40\2\uffff\4\40";
    static final String dfa_3s = "\1\43\2\uffff\2\43\1\uffff\3\43\2\uffff\4\43";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\3\3\uffff\1\4\1\5\4\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\4\uffff\1\1\3\uffff\1\2\1\5\1\4\1\uffff\1\10\1\11\1\6\1\7\1\12",
            "",
            "",
            "\1\5\2\uffff\1\13\1\11\2\uffff\1\12",
            "\1\5\2\uffff\1\14\1\11\2\uffff\1\12",
            "",
            "\1\15\1\11\2\uffff\1\12",
            "\1\16\1\11\2\uffff\1\12",
            "\1\11\2\uffff\1\12",
            "",
            "",
            "\1\11\2\uffff\1\12",
            "\1\11\2\uffff\1\12",
            "\1\11\2\uffff\1\12",
            "\1\11\2\uffff\1\12"
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
            return "966:2: (this_SPrimitive_0= ruleSPrimitive | this_SPrimitiveArchetype_1= ruleSPrimitiveArchetype | this_SEnumeration_2= ruleSEnumeration | this_SRootType_3= ruleSRootType | this_SDetailType_4= ruleSDetailType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FB88C1002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000FB88C0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000FB8A40000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020640010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040600000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020040010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002007A20640010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002007220040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008800000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000180220040010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000220040010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100220040010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000240000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080000000040L});

}